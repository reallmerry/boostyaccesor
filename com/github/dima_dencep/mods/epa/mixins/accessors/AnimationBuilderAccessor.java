package com.github.dima_dencep.mods.epa.mixins.accessors;

import dev.kosmx.playerAnim.core.data.KeyframeAnimation.AnimationBuilder;
import java.util.HashMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   value = {AnimationBuilder.class},
   remap = false
)
public interface AnimationBuilderAccessor {
   @Accessor
   @Mutable
   HashMap getBodyParts();
}
