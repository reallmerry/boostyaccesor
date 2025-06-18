package com.github.dima_dencep.mods.epa.mixins.accessors;

import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import java.util.Map;
import java.util.UUID;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   value = {KeyframeAnimation.class},
   remap = false
)
public interface KeyframeAnimationAccessor {
   @Accessor
   @Mutable
   void setBodyParts(Map var1);

   @Accessor
   @Mutable
   void setStopTick(int var1);

   @Accessor
   @Mutable
   void setEndTick(int var1);

   @Accessor
   @Mutable
   void setBeginTick(int var1);

   @Accessor
   @Mutable
   void setReturnToTick(int var1);

   @Accessor
   @Mutable
   void setUuid(UUID var1);

   @Accessor
   @Mutable
   void setIsUUIDGenerated(boolean var1);
}
