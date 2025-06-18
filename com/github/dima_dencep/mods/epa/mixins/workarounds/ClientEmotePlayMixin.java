package com.github.dima_dencep.mods.epa.mixins.workarounds;

import com.llamalad7.mixinextras.sugar.Local;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import io.github.kosmx.emotes.api.proxy.INetworkInstance;
import io.github.kosmx.emotes.common.network.objects.NetData;
import io.github.kosmx.emotes.executor.emotePlayer.IEmotePlayer;
import io.github.kosmx.emotes.executor.emotePlayer.IEmotePlayerEntity;
import io.github.kosmx.emotes.main.network.ClientEmotePlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {ClientEmotePlay.class},
   remap = false
)
public class ClientEmotePlayMixin {
   @Inject(
      method = {"clientStopLocalEmote(Ldev/kosmx/playerAnim/core/data/KeyframeAnimation;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void clientStopLocalEmote(KeyframeAnimation var0, CallbackInfoReturnable var1) {
      if (var0.no mName method<invokedynamic>(var0) != null) {
         var1.no mName method<invokedynamic>(var1, false.no mName method<invokedynamic>(false));
      }

   }

   @Inject(
      method = {"executeMessage"},
      at = {@At(
   value = "INVOKE",
   target = "Lio/github/kosmx/emotes/api/events/client/ClientEmoteEvents$EmoteStopEvent;onEmoteStop(Ljava/util/UUID;Ljava/util/UUID;)V"
)},
      cancellable = true
   )
   private static void executeMessage(NetData var0, INetworkInstance var1, CallbackInfo var2, @Local IEmotePlayerEntity var3) {
      if (no mName method<invokedynamic>() && var3.no mName method<invokedynamic>(var3)) {
         IEmotePlayer var4 = var3.no mName method<invokedynamic>(var3);
         if (!var4.no mName method<invokedynamic>(var4)) {
            return;
         }

         .reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.reDLancEminEcrAFt.RedLanCeMINeCRaFt, "The emote was stopped by the server!");
         KeyframeAnimation var5 = var4.no mName method<invokedynamic>(var4);
         if (var5.no mName method<invokedynamic>(var5) != null) {
            var4.no mName method<invokedynamic>(var4);
            var5.no mName method<invokedynamic>(var5, var4::getTick, true);
            var2.no mName method<invokedynamic>(var2);
         }
      }

   }
}
