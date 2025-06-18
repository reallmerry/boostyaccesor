package com.github.dima_dencep.mods.epa.mixins.workarounds;

import io.github.kosmx.emotes.main.emotePlay.EmotePlayer;
import io.github.kosmx.emotes.main.mixinFunctions.IPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   value = {IPlayerEntity.class},
   remap = false
)
public interface IPlayerEntityMixin {
   @Inject(
      method = {"initEmotePerspective"},
      at = {@At("HEAD")},
      cancellable = true
   )
   default void initEmotePerspective(EmotePlayer var1, CallbackInfo var2) {
      if (no mName method<invokedynamic>() && var1.no mName method<invokedynamic>(var1).no mName method<invokedynamic>(var1.no mName method<invokedynamic>(var1)) != null) {
         var2.no mName method<invokedynamic>(var2);
      }

   }
}
