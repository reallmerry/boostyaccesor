package com.github.dima_dencep.mods.epa.mixins.accessors;

import dev.kosmx.playerAnim.core.data.KeyframeAnimation.KeyFrame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   value = {KeyFrame.class},
   remap = false
)
public interface KeyFrameAccessor {
   @Accessor
   @Mutable
   void setValue(float var1);

   @Accessor
   @Mutable
   void setTick(int var1);
}
