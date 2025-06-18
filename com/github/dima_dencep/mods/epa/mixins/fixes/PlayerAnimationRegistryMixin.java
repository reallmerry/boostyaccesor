package com.github.dima_dencep.mods.epa.mixins.fixes;

import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import net.minecraft.class_310;
import net.minecraft.class_3300;
import net.minecraft.class_746;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerAnimationRegistry.class})
public class PlayerAnimationRegistryMixin {
   @Inject(
      method = {"resourceLoaderCallback"},
      at = {@At("TAIL")}
   )
   private static void epa$loadAnims(class_3300 var0, Logger var1, CallbackInfo var2) {
      .RedLancemINECRAFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.RedLancemINECRAFT.RedLanCeMINeCRaFt);
      .RedLancemINECRAFT[] var3 = .RedLancemINECRAFT.RedLanCeMINeCRaFt;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         .RedLancemINECRAFT var6 = var3[var5];
         KeyframeAnimation var7 = var6.RedLanCeMINeCRaFt.no mName method<invokedynamic>(var6.RedLanCeMINeCRaFt);
         if (var7 == null) {
            .reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Falied to get {} animation!", var6);
         } else {
            .reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Linking {} to {} animation...", var7, var6);
            if (var7.no mName method<invokedynamic>(var7) == null && var6.RedLanCeMINeCRaFt != null) {
               .reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Forcing {} to be default arm for {} animation!", var6.RedLanCeMINeCRaFt, var6);
               var7.no mName method<invokedynamic>(var7, var6.RedLanCeMINeCRaFt);
            }

            .RedLancemINECRAFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.RedLancemINECRAFT.RedLanCeMINeCRaFt, var7.no mName method<invokedynamic>(var7), var6);
         }
      }

      try {
         class_310 var9 = no mName method<invokedynamic>();
         (new .rEDlAnceminEcRAFt(var9.no mName method<invokedynamic>(var9).no mName method<invokedynamic>(var9.no mName method<invokedynamic>(var9)))).no mName method<invokedynamic>(new .rEDlAnceminEcRAFt(var9.no mName method<invokedynamic>(var9).no mName method<invokedynamic>(var9.no mName method<invokedynamic>(var9)))).no mName method<invokedynamic>((new .rEDlAnceminEcRAFt(var9.no mName method<invokedynamic>(var9).no mName method<invokedynamic>(var9.no mName method<invokedynamic>(var9)))).no mName method<invokedynamic>(new .rEDlAnceminEcRAFt(var9.no mName method<invokedynamic>(var9).no mName method<invokedynamic>(var9.no mName method<invokedynamic>(var9)))), .redLanceMInEcRafT::RedLanCeMINeCRaFt, var9);
         class_746 var10 = var9.field_1724;
         if (var10 != null && var10.no mName method<invokedynamic>(var10)) {
            var10.no mName method<invokedynamic>(var10).no mName method<invokedynamic>(var10.no mName method<invokedynamic>(var10)).no mName method<invokedynamic>(var10.no mName method<invokedynamic>(var10).no mName method<invokedynamic>(var10.no mName method<invokedynamic>(var10)));
         }
      } catch (Throwable var8) {
      }

   }
}
