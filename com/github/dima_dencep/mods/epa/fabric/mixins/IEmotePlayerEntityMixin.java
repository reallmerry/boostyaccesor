package com.github.dima_dencep.mods.epa.fabric.mixins;

import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import io.github.kosmx.emotes.executor.emotePlayer.IEmotePlayer;
import io.github.kosmx.emotes.executor.emotePlayer.IEmotePlayerEntity;
import java.lang.reflect.Method;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(
   value = {IEmotePlayerEntity.class},
   remap = false
)
public interface IEmotePlayerEntityMixin {
   @Intrinsic
   default void emotecraft$playEmote(KeyframeAnimation var1, int var2, boolean var3) {
      try {
         Class var10000 = this.no mName method<invokedynamic>(this);
         Method var4 = var10000.no mName method<invokedynamic>(var10000, "playEmote", new Class[]{KeyframeAnimation.class, Integer.TYPE, Boolean.TYPE});
         var4.no mName method<invokedynamic>(var4, true);
         var4.no mName method<invokedynamic>(var4, this, new Object[]{var1, var2.no mName method<invokedynamic>(var2), var3.no mName method<invokedynamic>(var3)});
      } catch (Throwable var5) {
         throw new RuntimeException(var5);
      }
   }

   @Intrinsic
   default IEmotePlayer emotecraft$getEmote() {
      try {
         Class var10000 = this.no mName method<invokedynamic>(this);
         Method var1 = var10000.no mName method<invokedynamic>(var10000, "getEmote", new Class[0]);
         var1.no mName method<invokedynamic>(var1, true);
         return (IEmotePlayer)var1.no mName method<invokedynamic>(var1, this, new Object[0]);
      } catch (Throwable var2) {
         throw new RuntimeException(var2);
      }
   }
}
