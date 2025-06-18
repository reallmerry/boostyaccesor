package com.github.dima_dencep.mods.epa.mixins.accessors;

import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection.State;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   value = {State.class},
   remap = false
)
public interface StateAccessor {
   @Accessor
   @Mutable
   void setDefaultValue(float var1);
}
