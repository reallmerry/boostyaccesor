import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import java.io.BufferedWriter;
import java.io.StringReader;
import java.net.URI;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import net.minecraft.class_746;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class reDLancEminEcrAFt {
   public static final String RedLanCeMINeCRaFt = "epa";
   public static final Logger RedLanCeMINeCRaFt = LogManager.getLogger("epa");
   public static final rEDlANceMiNecRaft RedLanCeMINeCRaFt = new rEDlANceMiNecRaft();
   public static final URI RedLanCeMINeCRaFt = URI.create("https://api.redlance.org/websockets/online-emotes/verify-epa");

   public static class_746 RedLanCeMINeCRaFt() {
      return no mName method<invokedynamic>().field_1724;
   }

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0) {
      RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt, "Initial {}", var0.animationFormat);
      String var1 = var0.no mName method<invokedynamic>(var0);
      StringReader var2 = new StringReader(var1);

      try {
         List var10000 = var2.no mName method<invokedynamic>(var2);
         KeyframeAnimation var3 = (KeyframeAnimation)var10000.no mName method<invokedynamic>(var10000, 0);
         RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt, "After de-write {}", var3.animationFormat);

         try {
            Path var12 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>()).no mName method<invokedynamic>(no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>()), "epa-dump").no mName method<invokedynamic>(no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>()).no mName method<invokedynamic>(no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>()), "epa-dump"), ((Class)var0.extraData.no mName method<invokedynamic>(var0.extraData, "name")).no mName method<invokedynamic>(var0.extraData.no mName method<invokedynamic>(var0.extraData, "name")) + ".json");
            BufferedWriter var4 = var12.no mName method<invokedynamic>(var12, new OpenOption[0]);

            try {
               var3.no mName method<invokedynamic>(var3, var4).no mName method<invokedynamic>(var3.no mName method<invokedynamic>(var3, var4));
            } catch (Throwable var9) {
               if (var4 != null) {
                  try {
                     var4.no mName method<invokedynamic>(var4);
                  } catch (Throwable var8) {
                     var9.no mName method<invokedynamic>(var9, var8);
                  }
               }

               throw var9;
            }

            if (var4 != null) {
               var4.no mName method<invokedynamic>(var4);
            }
         } catch (Throwable var10) {
            RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt, "Failed to write dump!", var10);
         }
      } catch (Throwable var11) {
         try {
            var2.no mName method<invokedynamic>(var2);
         } catch (Throwable var7) {
            var11.no mName method<invokedynamic>(var11, var7);
         }

         throw var11;
      }

      var2.no mName method<invokedynamic>(var2);
   }
}
