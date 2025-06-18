import com.github.dima_dencep.mods.epa.mixins.accessors.KeyFrameAccessor;
import com.github.dima_dencep.mods.epa.mixins.accessors.KeyframeAnimationAccessor;
import dev.kosmx.playerAnim.api.layered.modifier.MirrorModifier;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.KeyFrame;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.IntSupplier;
import net.minecraft.class_1306;
import org.jetbrains.annotations.Nullable;

public class rEdLaNcEmINecrAfT implements redLAncEMInecRAft {
   private static final String RedLanCeMINeCRaFt = "epa-arm";

   public boolean RedLanCeMINeCRaFt(KeyframeAnimation var1, IntSupplier var2, @Nullable class_1306 var3) {
      if (var3 == null) {
         return false;
      } else {
         class_1306 var4 = var1.no mName method<invokedynamic>(var1);
         if (var4 != null && var4 != var3) {
            reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Transforming arms ({} to {}) on {}...", var4, var3, var1);
            var1.no mName method<invokedynamic>(var1);
            var1.no mName method<invokedynamic>(var1, var3);
            return true;
         } else {
            return false;
         }
      }
   }

   private static void RedLanCeMINeCRaFt(KeyframeAnimation var0) {
      HashMap var1 = new HashMap();
      Iterator var2 = var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0)).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0)));

      while(var2.no mName method<invokedynamic>(var2)) {
         Entry var3 = (Entry)var2.no mName method<invokedynamic>(var2);
         StateCollection var4 = (StateCollection)var3.no mName method<invokedynamic>(var3);
         Iterator var5 = var4.x.no mName method<invokedynamic>(var4.x).no mName method<invokedynamic>(var4.x.no mName method<invokedynamic>(var4.x));

         KeyFrame var6;
         while(var5.no mName method<invokedynamic>(var5)) {
            var6 = (KeyFrame)var5.no mName method<invokedynamic>(var5);
            ((KeyFrameAccessor)var6).no mName method<invokedynamic>((KeyFrameAccessor)var6, -var6.value);
         }

         var5 = var4.yaw.no mName method<invokedynamic>(var4.yaw).no mName method<invokedynamic>(var4.yaw.no mName method<invokedynamic>(var4.yaw));

         while(var5.no mName method<invokedynamic>(var5)) {
            var6 = (KeyFrame)var5.no mName method<invokedynamic>(var5);
            ((KeyFrameAccessor)var6).no mName method<invokedynamic>((KeyFrameAccessor)var6, -var6.value);
         }

         var5 = var4.roll.no mName method<invokedynamic>(var4.roll).no mName method<invokedynamic>(var4.roll.no mName method<invokedynamic>(var4.roll));

         while(var5.no mName method<invokedynamic>(var5)) {
            var6 = (KeyFrame)var5.no mName method<invokedynamic>(var5);
            ((KeyFrameAccessor)var6).no mName method<invokedynamic>((KeyFrameAccessor)var6, -var6.value);
         }

         if (var4.isBendable) {
            var5 = var4.bendDirection.no mName method<invokedynamic>(var4.bendDirection).no mName method<invokedynamic>(var4.bendDirection.no mName method<invokedynamic>(var4.bendDirection));

            while(var5.no mName method<invokedynamic>(var5)) {
               var6 = (KeyFrame)var5.no mName method<invokedynamic>(var5);
               ((KeyFrameAccessor)var6).no mName method<invokedynamic>((KeyFrameAccessor)var6, -var6.value);
            }
         }

         Map var10001 = MirrorModifier.mirrorMap;
         var1.no mName method<invokedynamic>(var1, (String)var10001.no mName method<invokedynamic>(var10001, var3.no mName method<invokedynamic>(var3), (String)var3.no mName method<invokedynamic>(var3)), var4);
      }

      ((KeyframeAnimationAccessor)var0).no mName method<invokedynamic>((KeyframeAnimationAccessor)var0, var1);
   }

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0, class_1306 var1) {
      if (var0 != null) {
         if (var1 == null) {
            var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-arm");
         } else {
            var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-arm", var1.no mName method<invokedynamic>(var1));
         }
      }
   }

   public static class_1306 RedLanCeMINeCRaFt(KeyframeAnimation var0) {
      return var0 != null && var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-arm") ? ((String)var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-arm")).no mName method<invokedynamic>((String)var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-arm")) : null;
   }
}
