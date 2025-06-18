package com.github.dima_dencep.mods.epa.fabric.mixins;

import io.github.kosmx.emotes.main.emotePlay.EmotePlayer;
import io.github.kosmx.emotes.main.mixinFunctions.IPlayerEntity;
import java.lang.reflect.Method;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(
   value = {IPlayerEntity.class},
   remap = false
)
public interface IPlayerEntityMixin {
   @Intrinsic
   default EmotePlayer emotecraft$getEmote() {
      try {
         Class var10000 = this.no mName method<invokedynamic>(this);
         Method var1 = var10000.no mName method<invokedynamic>(var10000, "getEmote", new Class[0]);
         var1.no mName method<invokedynamic>(var1, true);
         return (EmotePlayer)var1.no mName method<invokedynamic>(var1, this, new Object[0]);
      } catch (Throwable var2) {
         throw new RuntimeException(var2);
      }
   }
}
