import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection;
import java.util.function.IntSupplier;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_746;
import net.minecraft.class_572.class_573;
import org.jetbrains.annotations.Nullable;

public class redLaNCEmIneCRAFT implements redLAncEMInecRAft {
   public boolean RedLanCeMINeCRaFt(KeyframeAnimation var1, IntSupplier var2, @Nullable class_1306 var3) {
      class_746 var4 = no mName method<invokedynamic>();
      class_1306 var5 = var4.no mName method<invokedynamic>(var4);
      StateCollection var6 = var1.no mName method<invokedynamic>(var1, var5 == class_1306.field_6183 ? "rightArm" : "leftArm");
      StateCollection var7 = var1.no mName method<invokedynamic>(var1, var5 == class_1306.field_6183 ? "leftArm" : "rightArm");
      class_573 var8 = var4.no mName method<invokedynamic>(var4, var4.no mName method<invokedynamic>(var4));
      return var6.no mName method<invokedynamic>(var6, var8 == class_573.field_3409 || var8 == class_573.field_3410) || var7.no mName method<invokedynamic>(var7, !var8.no mName method<invokedynamic>(var8));
   }

   public static class_1306 RedLanCeMINeCRaFt(class_746 var0) {
      class_1306 var1 = var0.no mName method<invokedynamic>(var0);
      if (var0.no mName method<invokedynamic>(var0) == class_1268.field_5810) {
         var1 = var1.no mName method<invokedynamic>(var1);
      }

      return var1;
   }

   private static boolean RedLanCeMINeCRaFt(StateCollection var0, boolean var1) {
      boolean var2 = false;
      if (var0 != null) {
         var2 = var0.no mName method<invokedynamic>(var0) != var1;
         if (var2) {
            var0.no mName method<invokedynamic>(var0, var1);
         }
      }

      return var2;
   }
}
