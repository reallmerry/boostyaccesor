import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;

public class rEdlAncemineCRaft extends CipherInputStream {
   public static final Gson RedLanCeMINeCRaFt = new Gson();

   public rEdlAncemineCRaft(InputStream var1) {
      super(var1, RedLanCeMINeCRaFt());
   }

   private static Cipher RedLanCeMINeCRaFt() {
      try {
         Cipher var0 = "AES/ECB/PKCS5Padding".no mName method<invokedynamic>("AES/ECB/PKCS5Padding");
         var0.no mName method<invokedynamic>(var0, 2, new SecretKeySpec(rEDLanCEmineCraFt.rEdlanCeMinecraft.no mName method<invokedynamic>(rEDLanCEmineCraFt.rEdlanCeMinecraft), "AES"));
         return var0;
      } catch (Throwable var1) {
         throw new RuntimeException(var1);
      }
   }

   public static redLanCeMIneCrAft RedLanCeMINeCRaFt(InputStream var0) {
      try {
         InputStreamReader var1 = new InputStreamReader(new rEdlAncemineCRaft(var0), StandardCharsets.UTF_8);

         redLanCeMIneCrAft var2;
         try {
            var2 = (redLanCeMIneCrAft)RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt, var1, redLanCeMIneCrAft.class);
         } catch (Throwable var5) {
            try {
               var1.no mName method<invokedynamic>(var1);
            } catch (Throwable var4) {
               var5.no mName method<invokedynamic>(var5, var4);
            }

            throw var5;
         }

         var1.no mName method<invokedynamic>(var1);
         return var2;
      } catch (Throwable var6) {
         throw new RuntimeException(var6);
      }
   }
}
