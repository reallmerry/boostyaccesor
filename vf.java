import com.github.dima_dencep.mods.epa.mixins.accessors.StateAccessor;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.AnimationBuilder;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection.State;
import dev.kosmx.playerAnim.core.util.Ease;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.IntSupplier;
import net.minecraft.class_1007;
import net.minecraft.class_1306;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_897;
import net.minecraft.class_898;
import org.jetbrains.annotations.Nullable;

public class RedlaNCEmiNECRAft implements redLAncEMInecRAft {
   private static final Map RedLanCeMINeCRaFt = Map.of("rightArm", (var0) -> {
      return var0.field_3401;
   }, "leftArm", (var0) -> {
      return var0.field_27433;
   }, "rightLeg", (var0) -> {
      return var0.field_3392;
   }, "leftLeg", (var0) -> {
      return var0.field_3397;
   });

   public boolean RedLanCeMINeCRaFt(KeyframeAnimation var1, IntSupplier var2, @Nullable class_1306 var3) {
      if (!no mName method<invokedynamic>()) {
         return false;
      } else {
         class_898 var10000 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>());
         class_897 var4 = var10000.no mName method<invokedynamic>(var10000, no mName method<invokedynamic>());
         if (!(var4 instanceof class_1007)) {
            return false;
         } else {
            class_1007 var5 = (class_1007)var4;
            class_591 var6 = (class_591)var5.no mName method<invokedynamic>(var5);
            boolean var7 = false;
            Iterator var8 = RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt).no mName method<invokedynamic>(RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt));

            while(var8.no mName method<invokedynamic>(var8)) {
               Entry var9 = (Entry)var8.no mName method<invokedynamic>(var8);
               Function var13 = (Function)var9.no mName method<invokedynamic>(var9);
               class_630 var10 = (class_630)var13.no mName method<invokedynamic>(var13, var6);
               if (var10.field_37938 != 1.0F || var10.field_37939 != 1.0F || var10.field_37940 != 1.0F) {
                  reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "INVALID SCALE!!! x{} y{} z{}", var10.field_37938.no mName method<invokedynamic>(var10.field_37938), var10.field_37939.no mName method<invokedynamic>(var10.field_37939), var10.field_37940.no mName method<invokedynamic>(var10.field_37940));
               }

               String var11 = (String)var9.no mName method<invokedynamic>(var9);
               StateCollection var12 = var1.no mName method<invokedynamic>(var1, var11);
               if (var12 != null) {
                  var7 |= var12.x.no mName method<invokedynamic>(var12.x, var10.field_3657);
                  var7 |= var12.y.no mName method<invokedynamic>(var12.y, var10.field_3656);
                  var7 |= var12.z.no mName method<invokedynamic>(var12.z, var10.field_3655);
                  if (var10.field_3654 != 0.0F) {
                     var7 |= var12.pitch.no mName method<invokedynamic>(var12.pitch, var10.field_3654);
                  }

                  if (var10.field_3675 != 0.0F) {
                     var7 |= var12.yaw.no mName method<invokedynamic>(var12.yaw, var10.field_3675);
                  }

                  if (var10.field_3674 != 0.0F) {
                     var7 |= var12.roll.no mName method<invokedynamic>(var12.roll, var10.field_3674);
                  }
               } else {
                  var1.no mName method<invokedynamic>(var1).no mName method<invokedynamic>(var1.no mName method<invokedynamic>(var1), var11, this.no mName method<invokedynamic>(this, var10));
                  reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Created statecollection by modelpart in {} ({})!", var11, var1);
                  var7 = true;
               }
            }

            return var7;
         }
      }
   }

   public StateCollection RedLanCeMINeCRaFt(class_630 var1) {
      StateCollection var2 = new StateCollection(var1.field_3657, var1.field_3656, var1.field_3655, var1.field_3654, var1.field_3675, var1.field_3674, AnimationBuilder.staticThreshold, false);
      var2.x.no mName method<invokedynamic>(var2.x, 0, var2.x.defaultValue, Ease.INOUTSINE);
      var2.y.no mName method<invokedynamic>(var2.y, 0, var2.y.defaultValue, Ease.INOUTSINE);
      var2.z.no mName method<invokedynamic>(var2.z, 0, var2.z.defaultValue, Ease.INOUTSINE);
      var2.yaw.no mName method<invokedynamic>(var2.yaw, 0, var2.yaw.defaultValue, Ease.INOUTSINE);
      var2.pitch.no mName method<invokedynamic>(var2.pitch, 0, var2.pitch.defaultValue, Ease.INOUTSINE);
      var2.roll.no mName method<invokedynamic>(var2.roll, 0, var2.roll.defaultValue, Ease.INOUTSINE);
      return var2;
   }

   private static boolean RedLanCeMINeCRaFt(State var0, float var1) {
      if (!var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0))) {
         return false;
      } else if (var0.defaultValue == var1) {
         return false;
      } else {
         var0.no mName method<invokedynamic>(var0, var1);
         if (!var0.no mName method<invokedynamic>(var0)) {
            var0.no mName method<invokedynamic>(var0, true);
         }

         return true;
      }
   }

   private static void RedLanCeMINeCRaFt(State var0, float var1) {
      ((StateAccessor)var0).no mName method<invokedynamic>((StateAccessor)var0, var1);
   }
}
