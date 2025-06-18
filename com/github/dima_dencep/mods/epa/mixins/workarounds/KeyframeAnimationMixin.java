package com.github.dima_dencep.mods.epa.mixins.workarounds;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import java.util.Map;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(
   value = {KeyframeAnimation.class},
   remap = false
)
public class KeyframeAnimationMixin {
   @Redirect(
      method = {"<init>(IIIZILjava/util/HashMap;ZZLjava/util/UUID;Ldev/kosmx/playerAnim/core/data/AnimationFormat;Ljava/util/HashMap;)V"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/Collections;unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;"
)
   )
   public Map epa$modifiableMap(Map var1) {
      return var1;
   }

   @ModifyReturnValue(
      method = {"equals"},
      at = {@At("RETURN")}
   )
   public boolean epa$animationCompare(boolean var1, @Local(argsOnly = true) Object var2) {
      if (var1) {
         return true;
      } else if (var2 instanceof KeyframeAnimation) {
         KeyframeAnimation var3 = (KeyframeAnimation)var2;
         .RedLancemINECRAFT var4 = ((KeyframeAnimation)this).no mName method<invokedynamic>((KeyframeAnimation)this);
         if (var4 == null) {
            return false;
         } else {
            .RedLancemINECRAFT var5 = var3.no mName method<invokedynamic>(var3);
            return var5 == null ? false : var4.no mName method<invokedynamic>(var4, var5);
         }
      } else {
         return false;
      }
   }
}
