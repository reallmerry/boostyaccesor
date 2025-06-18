package com.github.dima_dencep.mods.epa.mixins.fixes;

import com.github.dima_dencep.mods.epa.mixins.accessors.KeyframeAnimationAccessor;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.AnimationBuilder;
import dev.kosmx.playerAnim.core.data.gson.AnimationJson;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(
   value = {AnimationJson.class},
   remap = false
)
public class AnimationJsonMixin {
   @WrapOperation(
      method = {"deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/util/List;"},
      at = {@At(
   value = "INVOKE",
   target = "Ldev/kosmx/playerAnim/core/data/KeyframeAnimation$AnimationBuilder;build()Ldev/kosmx/playerAnim/core/data/KeyframeAnimation;"
)}
   )
   public KeyframeAnimation epa$stopTick(AnimationBuilder var1, Operation var2) {
      KeyframeAnimation var3 = (KeyframeAnimation)var2.no mName method<invokedynamic>(var2, new Object[]{var1});
      ((KeyframeAnimationAccessor)var3).no mName method<invokedynamic>((KeyframeAnimationAccessor)var3, var1.stopTick);
      return var3;
   }
}
