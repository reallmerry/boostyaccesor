package com.github.dima_dencep.mods.epa.mixins.workarounds.server;

import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.util.Pair;
import io.github.kosmx.emotes.server.network.AbstractServerEmotePlay;
import io.github.kosmx.emotes.server.network.EmotePlayTracker;
import io.github.kosmx.emotes.server.network.IServerNetworkInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   value = {AbstractServerEmotePlay.class},
   remap = false
)
public abstract class AbstractServerEmotePlayMixin {
   @Shadow
   protected abstract IServerNetworkInstance getPlayerNetworkInstance(Object var1);

   @Inject(
      method = {"playerEntersInvalidPose"},
      at = {@At(
   value = "INVOKE",
   target = "Lio/github/kosmx/emotes/server/network/AbstractServerEmotePlay;stopEmote(Ljava/lang/Object;Lio/github/kosmx/emotes/common/network/objects/NetData;)V"
)},
      cancellable = true
   )
   public void playerEntersInvalidPose(Object var1, CallbackInfo var2) {
      IServerNetworkInstance var10000 = this.no mName method<invokedynamic>(this, var1);
      EmotePlayTracker var3 = var10000.no mName method<invokedynamic>(var10000);
      Pair var4 = var3.no mName method<invokedynamic>(var3);
      if (var4 != null) {
         if (((KeyframeAnimation)var4.no mName method<invokedynamic>(var4)).no mName method<invokedynamic>((KeyframeAnimation)var4.no mName method<invokedynamic>(var4)) != null) {
            var2.no mName method<invokedynamic>(var2);
         }

      }
   }
}
