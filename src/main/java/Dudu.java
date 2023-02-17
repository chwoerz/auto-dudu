import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Dudu {

	static String prefix = "C:\\Users\\Christian\\auto-dudu\\src\\main\\resources\\";
	static String prefixUnholy = "C:\\Users\\Christian\\auto-dudu\\src\\main\\resources\\unholy\\";
	static String prefixBlood = "C:\\Users\\Christian\\auto-dudu\\src\\main\\resources\\blood\\";
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
	static String ironfur = prefix + "ironfur.png";
	static String trash = prefix + "trash.png";
	static String mangle = prefix + "mangle.png";
	static String swipe = prefix + "swipe.png";
	static String maul = prefix + "maul.png";
	static String dotmoonfire = prefix + "dotmoonfire.png";
	static String toothAndClaw = prefix + "tooth_and_claw.png";
	static String galactic = prefix + "galactic.png";

	public static final String unholy_blight = prefixUnholy + "unholy_blight.png";
	public static final String outbreak = prefixUnholy + "outbreak.png";
	public static final String scourge_strike = prefixUnholy + "scourge_strike.png";
	public static final String death_coil = prefixUnholy + "death_coil.png";
	public static final String festering_strike = prefixUnholy + "festering_strike.png";
	public static final String abomination_limb = prefixUnholy + "abomination_limb.png";
	public static final String dark_transformation = prefixUnholy + "dark_transformation.png";
	public static final String apocalypse = prefixUnholy + "apocalypse.png";
	public static final String army_of_the_dead = prefixUnholy + "army_of_the_dead.png";
	public static final String unholy_assault = prefixUnholy + "unholy_assault.png";
	public static final String vile_contagion = prefixUnholy + "vile_contagion.png";

	// Blood
	public static final String empower_rune_weapon = prefixBlood + "empower_rune_weapon.png";
	public static final String raise_dead = prefixBlood + "raise_dead.png";
	public static final String dancing_rune_weapon = prefixBlood + "dancing_rune_weapon.png";
	public static final String blood_boil = prefixBlood + "blood_boil.png";
	public static final String heart_strike = prefixBlood + "heart_strike.png";
	public static final String death_strike = prefixBlood + "death_strike.png";
	public static final String marrowrend = prefixBlood + "marrowrend.png";
	public static final String soul_reaper = prefixBlood + "soul_reaper.png";
	public static final String tombstone = prefixBlood + "tombstone.png";
	public static final String lichborne = prefixBlood + "lichborne.png";
	public static final String icebound_fortitude = prefixBlood + "icebound_fortitude.png";
	public static final String vampiric_blood = prefixBlood + "vampiric_blood.png";
	public static final String anti_magic_shell = prefixBlood + "anti_magic_shell.png";
	public static final String death_and_decay = prefixBlood + "death_and_decay.png";


	public static final int WRATH = KeyEvent.VK_3;
	public static final int MOONFIRE = KeyEvent.VK_1;
	public static final int DOT_MOONFIRE = KeyEvent.VK_6;
	public static final int SUNFIRE = KeyEvent.VK_2;
	public static final int STELLAR_FLARE = KeyEvent.VK_7;
	public static final int STARSURGE = KeyEvent.VK_4;
	public static final int STARFIRE = KeyEvent.VK_5;
	public static final int STARFALL = KeyEvent.VK_6;
	public static final int MOON = KeyEvent.VK_8;
	public static final int CELESTIAL = KeyEvent.VK_9;
	public static final int FUNGAL = KeyEvent.VK_0;
	public static final int IRONFUR = KeyEvent.VK_1;
	public static final int SWIPE = KeyEvent.VK_4;
	public static final int TRASH = KeyEvent.VK_2;
	public static final int MANGLE = KeyEvent.VK_3;
	public static final int MAUL = KeyEvent.VK_5;


	public static final int OUTBREAK = KeyEvent.VK_1;
	public static final int DEATH_COIL = KeyEvent.VK_2;
	public static final int FESTERING_STRIKE = KeyEvent.VK_3;
	public static final int SCOURGE_STRIKE = KeyEvent.VK_4;
	public static final int DARK_TRANSFORMATION = KeyEvent.VK_5;
	public static final int ARMY_OF_THE_DEAD = KeyEvent.VK_6;
	public static final int APOCALYPSE = KeyEvent.VK_7;
	public static final int ABOMINATION_LIMB = KeyEvent.VK_8;
	public static final int UNHOLY_BLIGHT = KeyEvent.VK_9;
	public static final int UNHOLY_ASSAULT = KeyEvent.VK_5;
	public static final int VILE_CONTAGION = KeyEvent.VK_5;

	// BLood

	public static final int DEATH_AND_DECAY = KeyEvent.VK_1;
	public static final int DANCING_RUNE_WEAPON = KeyEvent.VK_4;
	public static final int BLOOD_BOIL = KeyEvent.VK_5;
	public static final int HEART_STRIKE = KeyEvent.VK_6;
	public static final int DEATH_STRIKE = KeyEvent.VK_7;
	public static final int MARROWREND = KeyEvent.VK_8;
	public static final int TOMBSTONE = KeyEvent.VK_0;
	public static final int LICHBORNE = KeyEvent.VK_NUMPAD1;
	public static final int ICEBOUND_FORTITUDE = KeyEvent.VK_NUMPAD2;

	public static final int VAMPIRIC_BLOOD = KeyEvent.VK_NUMPAD3;
	public static final int RAISE_DEAD = KeyEvent.VK_NUMPAD4;
	public static final int ANTI_MAGIC_SHELL = KeyEvent.VK_1;
	public static final int EMPOWER_RUNE_WEAPON = KeyEvent.VK_1;
	public static final int SOUL_REAPER = KeyEvent.VK_1;
	public static final List<Object> prioritySingleUnholy = List.of(
			army_of_the_dead,
			unholy_blight,
			festering_strike,
			abomination_limb,
			unholy_assault,
			dark_transformation,
			apocalypse,
			outbreak,
			scourge_strike,
			death_coil
	);

	public static final List<Object> prioritySingleBlood = List.of(
			//empower_rune_weapon,
			//raise_dead,
			//wdeath_and_decay,
			//anti_magic_shell,
			marrowrend,
			//icebound_fortitude,
			lichborne,
			vampiric_blood,
			soul_reaper,
			dancing_rune_weapon,
			death_strike,
			blood_boil,
			tombstone,
			heart_strike
	);


	public static final List<Object> prioritySingleGuardianDef = List.of(
			dotmoonfire,
			toothAndClaw,
			galactic,
			ironfur,
			mangle,
			trash,
			moonfire,
			maul
	);
	public static final List<Object> priorityMultiGuardianDef = List.of(
			dotmoonfire,
			toothAndClaw,
			galactic,
			ironfur,
			mangle,
			trash,
			swipe
	);

	public static final List<Object> prioritySingleGuardianOff = List.of(
			dotmoonfire,
			toothAndClaw,
			maul,
			mangle,
			trash,
			moonfire
	);
	public static final List<Object> priorityMultiGuardianOff = List.of(
			dotmoonfire,
			toothAndClaw,
			maul,
			mangle,
			trash,
			swipe
	);
	public static final List<Object> prioritySingleMoon = List.of(
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

	public static final List<Object> priorityMultiMoon = List.of(
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


	static Map<String, Integer> runMapUnholy = new HashMap<>() {{
				put(army_of_the_dead, ARMY_OF_THE_DEAD);
				put(unholy_blight, UNHOLY_BLIGHT);
				put(unholy_assault, UNHOLY_ASSAULT);
				put(dark_transformation, DARK_TRANSFORMATION);
				put(apocalypse, APOCALYPSE);
				put(abomination_limb, ABOMINATION_LIMB);
				put(death_coil, DEATH_COIL);
				put(outbreak, OUTBREAK);
				put(scourge_strike, SCOURGE_STRIKE);
				put(festering_strike, FESTERING_STRIKE);
	}};


	static Map<String, Integer> runMapBlood = new HashMap<>() {{
				put(empower_rune_weapon, EMPOWER_RUNE_WEAPON);
				put(raise_dead, RAISE_DEAD);
				put(death_and_decay, DEATH_AND_DECAY);
				put(anti_magic_shell, ANTI_MAGIC_SHELL);
				put(marrowrend, MARROWREND);
				put(icebound_fortitude, ICEBOUND_FORTITUDE);
				put(lichborne, LICHBORNE);
				put(vampiric_blood, VAMPIRIC_BLOOD);
				put(soul_reaper, SOUL_REAPER);
				put(dancing_rune_weapon, DANCING_RUNE_WEAPON);
				put(death_strike, DEATH_STRIKE);
				put(blood_boil, BLOOD_BOIL);
				put(tombstone, TOMBSTONE);
				put(heart_strike, HEART_STRIKE);
	}};

	static Map<String, Integer> runMap = new HashMap<>() {
		{
			put(moonfire, MOONFIRE);
			put(sunfire, SUNFIRE);
			put(stellarFlare, STELLAR_FLARE);
			put(lunarEclipse, WRATH);
			put(fungal, FUNGAL);
			put(lunarEclipse, WRATH);
			put(warp, STARFALL);
			put(weft, STARSURGE);
			put(wrath, WRATH);
			put(starSurge, STARSURGE);
			put(starfall, STARFALL);
			put(starfire, STARFIRE);
			put(moon, MOON);
			put(celestial, CELESTIAL);

		}
	};

	static Map<String, Integer> runMapGuardian = new HashMap<>() {
		{
			put(ironfur, IRONFUR);
			put(trash, TRASH);
			put(mangle, MANGLE);
			put(maul, MAUL);
			put(swipe, SWIPE);
			put(dotmoonfire, DOT_MOONFIRE);
			put(moonfire, DOT_MOONFIRE);
			put(toothAndClaw, MAUL);
			put(galactic, DOT_MOONFIRE);
		}
	};

	private final Map<Spec, SpecRotations> rotationsMap = Map.of(
			Spec.M, new SpecRotations(prioritySingleMoon, priorityMultiMoon, runMap),
			Spec.GD, new SpecRotations(prioritySingleGuardianDef, priorityMultiGuardianDef, runMapGuardian),
			Spec.GO, new SpecRotations(prioritySingleGuardianOff, priorityMultiGuardianOff, runMapGuardian),
			Spec.UDK, new SpecRotations(prioritySingleUnholy, prioritySingleUnholy, runMapUnholy),
			Spec.BDK, new SpecRotations(prioritySingleBlood, prioritySingleBlood, runMapBlood)
	);


	private volatile boolean running = false;
	private Thread taskThread;

	private final Screen screen = new Screen();
	private final Robot robot = new Robot();

	private boolean singleMode = true;
	private Spec spec = Spec.M;


	public Dudu() throws AWTException, NativeHookException {

		ImagePath.add(prefix);

		ImagePath.add(prefixUnholy);
		ImagePath.add(prefixBlood);

		GlobalScreen.registerNativeHook();

		GlobalScreen.addNativeKeyListener(new NativeKeyListener() {
			@Override
			public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
			}

			@Override
			public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
				if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_DELETE && !running) {
					running = true;
					taskThread = new Thread(() -> {
						while (running) {
							scan();
						}
					});
					taskThread.start();
				}
			}

			public void scan() {
				try {
					var curSpec = rotationsMap.get(spec);
					var priority = singleMode ? curSpec.single() : curSpec.multi();
					var matches = screen.findAnyList(priority);
					if (matches.isEmpty()) {
						System.out.println("No found");
						return;
					}
					var single = matches.get(0);

					var runKey = curSpec.runMap().get(single.getImageFilename());
					System.out.println(single.getImageFilename());
					robot.keyPress(runKey);
					Thread.sleep(150);
					robot.keyRelease(runKey);
					Thread.sleep(50);
				} catch (Exception es5) {
					es5.printStackTrace();
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

		screen.setRect(new Region(50, 500, 200, 700));

		var frame = new JFrame("Config");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setLayout(new GridLayout(4, 1));

		var toggleButton = new JButton("single");
		toggleButton.addActionListener(e -> {
			singleMode = !singleMode;
			var mode = singleMode ? "single" : "multi";
			toggleButton.setText(mode);
		});
		frame.add(toggleButton);


		var moonkinSpec = createSpecButton(Spec.M, "Moonkin");
		var guardianDefSpec = createSpecButton(Spec.GD, "DEF");
		var guardianOffSpec = createSpecButton(Spec.GO, "OFF");
		var unholySpec = createSpecButton(Spec.UDK, "Unholy");
		var bloodSpec = createSpecButton(Spec.BDK, "Blood");
		var group = new ButtonGroup();
		addToGroup(group, moonkinSpec, guardianDefSpec, guardianOffSpec, unholySpec, bloodSpec);
		addMultiple(frame, moonkinSpec, guardianDefSpec, guardianOffSpec, unholySpec, bloodSpec);
		frame.setVisible(true);


		frame.setAlwaysOnTop(true);


	}

	public static void main(String[] args) throws AWTException, NativeHookException {
		new Dudu();
	}

	AbstractButton createSpecButton(Spec specSet, String name) {
		var specButton = new JRadioButton(name);
		specButton.addActionListener(e -> spec = specSet);
		return specButton;
	}

	void addToGroup(ButtonGroup group, AbstractButton... buttons) {
		Arrays.stream(buttons).forEach(group::add);
	}

	void addMultiple(JFrame frame, Component... components) {
		Arrays.stream(components).forEach(frame::add);
	}

}

enum Spec {
	GO, GD, M, UDK, BDK
}

record SpecRotations(List<Object> single, List<Object> multi, Map<String, Integer> runMap) {
}
