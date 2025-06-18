import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.KeyStore.LoadStoreParameter;
import java.security.cert.CertificateFactory;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import net.minecraft.class_2561;
import net.minecraft.class_2960;

public class rEDlAnceminEcRAFt {
   private static final HttpClient RedLanCeMINeCRaFt = HttpClient.newBuilder().connectTimeout(Duration.ofMinutes(1L)).sslContext(RedLanCeMINeCRaFt()).build();
   public static String RedLanCeMINeCRaFt;
   public final String accessToken;
   public final String fingerprintContent;
   public final String version;
   public final List animations = new ArrayList();

   public rEDlAnceminEcRAFt(String var1) {
      this.fingerprintContent = RedLanCeMINeCRaFt;
      this.accessToken = var1;
      this.version = reDlancEmINecRAFt.RedLanCeMINeCRaFt();
      this.animations.clear();
      Iterator var2 = PlayerAnimationRegistry.getAnimations().entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (((class_2960)var3.getKey()).method_12836().equals("epa")) {
            this.animations.add(((KeyframeAnimation)var3.getValue()).getBodyParts().hashCode());
         }
      }

   }

   public CompletableFuture RedLanCeMINeCRaFt() {
      try {
         rEDlANceMiNecRaft var10000 = reDLancEminEcrAFt.RedLanCeMINeCRaFt;
         class_2561 var10001 = redLanceMInEcRafT.reDLancEminEcrAFt;
         REDlancEmiNeCRafT.RedLanCeMINeCRaFt = true;
         redLaNcEMinecraft.RedLanCeMINeCRaFt = true;
         var10000.no mName method<invokedynamic>(var10000, var10001, true);
      } catch (Throwable var2) {
      }

      Builder var3 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>(), reDLancEminEcrAFt.RedLanCeMINeCRaFt);
      HttpRequest var1 = var3.no mName method<invokedynamic>(var3, rEdlAncemineCRaft.RedLanCeMINeCRaFt.no mName method<invokedynamic>(rEdlAncemineCRaft.RedLanCeMINeCRaFt, this, rEDlAnceminEcRAFt.class).no mName method<invokedynamic>(rEdlAncemineCRaft.RedLanCeMINeCRaFt.no mName method<invokedynamic>(rEdlAncemineCRaft.RedLanCeMINeCRaFt, this, rEDlAnceminEcRAFt.class))).no mName method<invokedynamic>(var3.no mName method<invokedynamic>(var3, rEdlAncemineCRaft.RedLanCeMINeCRaFt.no mName method<invokedynamic>(rEdlAncemineCRaft.RedLanCeMINeCRaFt, this, rEDlAnceminEcRAFt.class).no mName method<invokedynamic>(rEdlAncemineCRaft.RedLanCeMINeCRaFt.no mName method<invokedynamic>(rEdlAncemineCRaft.RedLanCeMINeCRaFt, this, rEDlAnceminEcRAFt.class))));
      CompletableFuture var4 = RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt, var1, no mName method<invokedynamic>());
      return var4.no mName method<invokedynamic>(var4, (var0) -> {
         return ((InputStream)var0.no mName method<invokedynamic>(var0)).no mName method<invokedynamic>((InputStream)var0.no mName method<invokedynamic>(var0));
      });
   }

   private static SSLContext RedLanCeMINeCRaFt() {
      try {
         ByteArrayInputStream var0 = new ByteArrayInputStream(rEDLanCEmineCraFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(rEDLanCEmineCraFt.RedLanCeMINeCRaFt));

         SSLContext var5;
         try {
            CertificateFactory var1 = "X509".no mName method<invokedynamic>("X509");
            KeyStore var2 = "JKS".no mName method<invokedynamic>("JKS");
            var2.no mName method<invokedynamic>(var2, (LoadStoreParameter)null);
            var2.no mName method<invokedynamic>(var2, "epa", var1.no mName method<invokedynamic>(var1, var0));
            TrustManagerFactory var3 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>());
            var3.no mName method<invokedynamic>(var3, var2);
            SSLContext var4 = "TLS".no mName method<invokedynamic>("TLS");
            var4.no mName method<invokedynamic>(var4, (KeyManager[])null, var3.no mName method<invokedynamic>(var3), (SecureRandom)null);
            var5 = var4;
         } catch (Throwable var7) {
            try {
               var0.no mName method<invokedynamic>(var0);
            } catch (Throwable var6) {
               var7.no mName method<invokedynamic>(var7, var6);
            }

            throw var7;
         }

         var0.no mName method<invokedynamic>(var0);
         return var5;
      } catch (Throwable var8) {
         throw new RuntimeException(var8);
      }
   }
}
