import com.replaymod.recording.ReplayModRecording;
import io.github.kosmx.emotes.common.network.EmotePacket.Builder;
import java.nio.ByteBuffer;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Category;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Excluded;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Tooltip;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2540;
import net.minecraft.class_2960;

@Config(
   name = "epa"
)
public class rEdlanCeMinecraft implements ConfigData {
   public boolean disableInCreativeFly = false;
   public boolean disablePerspective = true;
   @Tooltip
   public boolean oldOffArmDetection = false;
   @Tooltip
   public int timeoutSeconds = 180;
   @Category("fixes")
   @Tooltip
   public boolean fixInvalidPosesOnClient = true;
   @Category("fixes")
   public boolean cloneKeyFrames = true;
   @Category("fixes")
   public boolean forcePlayEmotes = true;
   @Category("compat")
   public boolean replayModCompat = false;
   @Category("exp")
   public boolean mergeEmotes = true;
   @Category("exp")
   public boolean fadeEmotes = false;
   @Category("exp")
   public boolean poseAdapter = false;
   @Excluded
   private static final boolean RedLanCeMINeCRaFt = FabricLoader.getInstance().isModLoaded("replaymod");
   @Excluded
   private static final class_2960 RedLanCeMINeCRaFt = new class_2960("emotecraft", "emote");

   public static boolean RedLanCeMINeCRaFt() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.disableInCreativeFly;
   }

   public static boolean reDlancEmINecRAFt() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.disablePerspective;
   }

   public static boolean reDLancEminEcrAFt() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.oldOffArmDetection;
   }

   public static int RedLanCeMINeCRaFt() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.timeoutSeconds;
   }

   public static boolean rEdlanCeMinecraft() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.fixInvalidPosesOnClient;
   }

   public static boolean ReDlaNCEminECRaFT() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.cloneKeyFrames;
   }

   public static boolean reDlAncEmineCRaFT() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.forcePlayEmotes;
   }

   public static boolean reDlanCEminECRAft() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.replayModCompat && RedLanCeMINeCRaFt;
   }

   public static boolean RedLancemINECRAFT() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.mergeEmotes;
   }

   public static boolean REDlancEmiNeCRafT() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.fadeEmotes;
   }

   public static boolean rEDLanCEmineCraFt() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.poseAdapter;
   }

   public static String RedLanCeMINeCRaFt() {
      return reDlAncEmineCRaFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDlAncEmineCRaFT.RedLanCeMINeCRaFt).no mName method<invokedynamic>(reDlAncEmineCRaFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDlAncEmineCRaFT.RedLanCeMINeCRaFt)).no mName method<invokedynamic>(reDlAncEmineCRaFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDlAncEmineCRaFT.RedLanCeMINeCRaFt).no mName method<invokedynamic>(reDlAncEmineCRaFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDlAncEmineCRaFT.RedLanCeMINeCRaFt)));
   }

   public static void RedLanCeMINeCRaFt(Builder var0) {
      try {
         ByteBuffer var1 = var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0));
         byte[] var2 = var1.no mName method<invokedynamic>(var1);
         class_2540 var3 = new class_2540(var2.length.no mName method<invokedynamic>(var2.length));
         var3.no mName method<invokedynamic>(var3, var2);
         ReplayModRecording.instance.no mName method<invokedynamic>(ReplayModRecording.instance).no mName method<invokedynamic>(ReplayModRecording.instance.no mName method<invokedynamic>(ReplayModRecording.instance)).no mName method<invokedynamic>(ReplayModRecording.instance.no mName method<invokedynamic>(ReplayModRecording.instance).no mName method<invokedynamic>(ReplayModRecording.instance.no mName method<invokedynamic>(ReplayModRecording.instance)), RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLanCeMINeCRaFt, var3));
      } catch (Throwable var4) {
         reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Failed to pass emote to replaymod!", var4);
      }

   }
}
