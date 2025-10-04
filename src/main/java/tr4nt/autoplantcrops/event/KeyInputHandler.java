package tr4nt.autoplantcrops.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static boolean isOn = true;

    // Translation key for the control’s label in Controls UI
    public static final String KEY_TOGGLE = "key.autoplantcrops.disablemod";

    public static KeyBinding disableModKey;

    public static void registerKeyInput() {
        ClientTickEvents.END_CLIENT_TICK.register(client ->
                isOn = !disableModKey.isPressed());
    }

    public static void register() {
        // Use the constructor that ends with a Category, not a String
        disableModKey = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        KEY_TOGGLE,           // translation key
                        GLFW.GLFW_KEY_Z,      // default key
                        KeyBinding.Category.MISC // pick a built-in category
                )
        );
        registerKeyInput();
    }
}
