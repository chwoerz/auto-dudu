import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Dudu extends JFrame {

	static String prefix = "C:\\Users\\Christian\\auto-dudu\\src\\main\\resources\\";
	static String moonfire = prefix + "moonfire.png";
	static String sunfire = prefix + "sunfire.png";
	static String stellarFlare = prefix + "stellarflare.png";
	static String lunarEclipse = prefix + "lunar_eclipse.png";
	static String starSurge = prefix + "starsurge.png";
	static String starfire = prefix + "starfire.png";
	static String starfall = prefix + "starfall.png";
	static String moon = prefix + "moon.png";
	static String convoke = prefix + "convoke.png";
	static String celestial = prefix + "celestial.png";
	static String wrath = prefix + "wrath.png";
	static String warp = prefix + "warp.png";
	static String weft = prefix + "weft.png";
	static String fungal = prefix + "fungal.png";

	public static final int WRATH = KeyEvent.VK_NUMPAD3;
	public static final int MOONFIRE = KeyEvent.VK_NUMPAD1;
	public static final int SUNFIRE = KeyEvent.VK_2;
	public static final int STELLAR_FLARE = KeyEvent.VK_7;
	public static final int STARSURGE = KeyEvent.VK_4;
	public static final int STARFIRE = KeyEvent.VK_5;
	public static final int STARFALL = KeyEvent.VK_6;
	public static final int MOON = KeyEvent.VK_8;
	public static final int CELESTIAL = KeyEvent.VK_9;
	public static final int FUNGAL = KeyEvent.VK_0;
	public static final int CONVOKE = KeyEvent.VK_0;

	public static final List<Object> prioritySingle = List.of(
			starSurge,
			weft,
			warp,
			moonfire,
			sunfire,
			lunarEclipse,
			fungal,
			stellarFlare,
			celestial,
			convoke,
			moon,
			starfire,
			wrath);

	public static final List<Object> priorityMulti = List.of(
			starfall,
			weft,
			warp,
			moonfire,
			sunfire,
			lunarEclipse,
			fungal,
			stellarFlare,
			celestial,
			convoke,
			moon,
			starfire,
			wrath);
	static Map<String, Integer> runMap = new HashMap<>() {
		{
			put(moonfire, MOONFIRE);
			put(sunfire, SUNFIRE);
			put(stellarFlare, STELLAR_FLARE);
			put(lunarEclipse, WRATH);
			put(fungal, FUNGAL);
//			put(lunarEclipse, STARFIRE);
			put(warp, STARFALL);
			put(weft, STARSURGE);
			put(wrath, WRATH);
			put(starSurge, STARSURGE);
			put(starfall, STARFALL);
			put(starfire, WRATH);
			put(moon, MOON);
			put(celestial, CELESTIAL);
			put(convoke, CONVOKE);
		}
	};


	private volatile boolean running = false;
	private Thread taskThread;

	private Screen screen = new Screen();
	private Robot robot = new Robot();

	private boolean singleMode = true;


	public Dudu() throws AWTException, NativeHookException {

		ImagePath.add(prefix);

		GlobalScreen.registerNativeHook();

		GlobalScreen.addNativeKeyListener(new NativeKeyListener() {
			@Override
			public void nativeKeyTyped(NativeKeyEvent nativeEvent) {

			}

			@Override
			public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
				if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_DELETE && !running) {
					System.out.println("running");
					running = true;
					taskThread = new Thread(() -> {
						while (running) {
							try {
								var single = screen.findAnyList(prioritySingle).get(0);

								var runKey = runMap.get(single.getImageFilename());
								System.out.println(single.getImageFilename());
								robot.keyPress(runKey);
								Thread.sleep(200);
								robot.keyRelease(runKey);

							} catch (Exception es5) {

							}

						}
					});
					taskThread.start();
				}
			}

			@Override
			public void nativeKeyReleased(NativeKeyEvent nativeEvent) {
				if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_DELETE && running) {
					running = false;
					taskThread.interrupt();
					taskThread = null;
				}
			}
		});

		screen.setX(50);
		screen.setY(500);
		screen.setW(200);
		screen.setH(700);

		var startStopButtonSingle = new JButton("Start Single");
		startStopButtonSingle.addActionListener(e -> {
			singleMode = !singleMode;
			if (singleMode) {
				startStopButtonSingle.setText("Stop Single");
			} else {
				startStopButtonSingle.setText("Start Single");

			}
		});
		var startStopButtonMulti = new JButton("Start Multi");

		setLayout(new FlowLayout());
		add(startStopButtonSingle);
		add(startStopButtonMulti);

		setSize(300, 200);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) throws AWTException, NativeHookException {
		new Dudu();
	}

}
