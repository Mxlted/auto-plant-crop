package tr4nt.autoplantcrops.mixin;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(HandledScreen.class)
public interface HandledScreenMixin {

    @Accessor("x")
    public int getX();

    @Accessor("y")
    public int getY();


}