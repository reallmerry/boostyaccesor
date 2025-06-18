package com.github.dima_dencep.mods.epa.mixins.workarounds;

import io.github.kosmx.emotes.executor.emotePlayer.IEmotePlayer;
import io.github.kosmx.emotes.executor.emotePlayer.IEmotePlayerEntity;
import io.github.kosmx.emotes.main.EmoteHolder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {EmoteHolder.class},
   remap = false
)
public class EmoteHolderMixin {
   @Inject(
      method = {"canPlayEmote"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void canPlayEmote(IEmotePlayerEntity var0, CallbackInfoReturnable var1) {
      if (no mName method<invokedynamic>()) {
         IEmotePlayer var2 = var0.no mName method<invokedynamic>(var0);
         if (var2.no mName method<invokedynamic>(var2)) {
            if (var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)) != null) {
               var1.no mName method<invokedynamic>(var1, true.no mName method<invokedynamic>(true));
            }

         }
      }
   }

   @Inject(
      method = {"canRunEmote"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void canRunEmote(IEmotePlayerEntity var0, CallbackInfoReturnable var1) {
      if (no mName method<invokedynamic>()) {
         IEmotePlayer var2 = var0.no mName method<invokedynamic>(var0);
         if (var2.no mName method<invokedynamic>(var2)) {
            if (var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)) != null) {
               var1.no mName method<invokedynamic>(var1, true.no mName method<invokedynamic>(true));
            }

         }
      }
   }
}
