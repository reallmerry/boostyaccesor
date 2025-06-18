package com.github.dima_dencep.mods.epa.mixins.fixes;

import com.github.dima_dencep.mods.epa.mixins.accessors.KeyframeAnimationAccessor;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.AnimationBuilder;
import dev.kosmx.playerAnim.core.data.gson.GeckoLibSerializer;
import java.util.Iterator;
import java.util.Map.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(
   value = {GeckoLibSerializer.class},
   remap = false
)
public class GeckoLibSerializerMixin {
   @WrapOperation(
      method = {"lambda$readAnimations$0"},
      at = {@At(
   value = "INVOKE",
   target = "Ldev/kosmx/playerAnim/core/data/KeyframeAnimation$AnimationBuilder;build()Ldev/kosmx/playerAnim/core/data/KeyframeAnimation;"
)}
   )
   private static KeyframeAnimation epa$parseExtra(AnimationBuilder var0, Operation var1, @Local JsonObject var2) {
      if (var2.no mName method<invokedynamic>(var2, "epa")) {
         JsonObject var3 = var2.no mName method<invokedynamic>(var2, "epa");
         if (var3.no mName method<invokedynamic>(var3, "extra")) {
            var0.no mName method<invokedynamic>(var0, var3.no mName method<invokedynamic>(var3, "extra"));
         }

         KeyframeAnimation var4 = (KeyframeAnimation)var1.no mName method<invokedynamic>(var1, new Object[]{var0});
         if (var3.no mName method<invokedynamic>(var3, "stopTick")) {
            ((KeyframeAnimationAccessor)var4).no mName method<invokedynamic>((KeyframeAnimationAccessor)var4, var4.endTick + var3.no mName method<invokedynamic>(var3, "stopTick").no mName method<invokedynamic>(var3.no mName method<invokedynamic>(var3, "stopTick")));
         }

         .reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Found metadata at {}!", var4);
         return var4;
      } else {
         return (KeyframeAnimation)var1.no mName method<invokedynamic>(var1, new Object[]{var0});
      }
   }

   @Unique
   private static void epa$addExtraData(AnimationBuilder var0, JsonObject var1) {
      Iterator var2 = var1.no mName method<invokedynamic>(var1).no mName method<invokedynamic>(var1.no mName method<invokedynamic>(var1));

      while(var2.no mName method<invokedynamic>(var2)) {
         Entry var3 = (Entry)var2.no mName method<invokedynamic>(var2);
         String var4 = "epa-" + (String)var3.no mName method<invokedynamic>(var3);
         JsonElement var5 = (JsonElement)var3.no mName method<invokedynamic>(var3);
         if (var5.no mName method<invokedynamic>(var5)) {
            JsonPrimitive var6 = var5.no mName method<invokedynamic>(var5);
            if (var6.no mName method<invokedynamic>(var6)) {
               var0.extraData.no mName method<invokedynamic>(var0.extraData, var4, var6.no mName method<invokedynamic>(var6).no mName method<invokedynamic>(var6.no mName method<invokedynamic>(var6)));
            } else if (var6.no mName method<invokedynamic>(var6)) {
               var0.extraData.no mName method<invokedynamic>(var0.extraData, var4, var6.no mName method<invokedynamic>(var6));
            } else if (var6.no mName method<invokedynamic>(var6)) {
               var0.extraData.no mName method<invokedynamic>(var0.extraData, var4, var6.no mName method<invokedynamic>(var6).no mName method<invokedynamic>(var6.no mName method<invokedynamic>(var6)));
            } else {
               var0.extraData.no mName method<invokedynamic>(var0.extraData, var4, var6.no mName method<invokedynamic>(var6));
            }
         }
      }

   }
}
