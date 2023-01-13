import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GlobalKeyPress implements NativeKeyListener {

    public static void main(String[] args) throws NativeHookException {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            Logger.getLogger(GlobalKeyPress.class.getName()).log(Level.SEVERE, null, ex);
        }
        GlobalScreen.addNativeKeyListener(new GlobalKeyPress());
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getModifiers() == NativeKeyEvent.CTRL_L_MASK) {
            System.out.println("Control key is pressed.");
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        if (e.getModifiers() != NativeKeyEvent.CTRL_L_MASK) {
            System.out.println("Control key is released.");
        }
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        // not used in this example
    }
}
