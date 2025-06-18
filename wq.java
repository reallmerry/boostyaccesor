import com.github.dima_dencep.mods.epa.mixins.accessors.KeyFrameAccessor;
import com.github.dima_dencep.mods.epa.mixins.accessors.KeyframeAnimationAccessor;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.KeyFrame;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection.State;
import dev.kosmx.playerAnim.core.util.Ease;
import io.github.kosmx.emotes.main.emotePlay.EmotePlayer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.IntSupplier;
import net.minecraft.class_1306;
import org.jetbrains.annotations.Nullable;

public class REDlANceminEcrAft implements redLAncEMInecRAft {
   private static final String RedLanCeMINeCRaFt = "epa-fade";
   public static final int RedLanCeMINeCRaFt = 3;

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0, KeyframeAnimation var1) {
      KeyframeAnimationAccessor var2 = (KeyframeAnimationAccessor)var0;
      if (var0.stopTick - var0.endTick < 3) {
         reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "The fade time is < {}! Extending...", true.no mName method<invokedynamic>(3));
         var2.no mName method<invokedynamic>(var2, var0.endTick + 3);
      }

      Iterator var3 = var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0)).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0)));

      while(var3.no mName method<invokedynamic>(var3)) {
         Entry var4 = (Entry)var3.no mName method<invokedynamic>(var3);
         StateCollection var5 = var1.no mName method<invokedynamic>(var1, (String)var4.no mName method<invokedynamic>(var4));
         if (var5 != null) {
            StateCollection var6 = (StateCollection)var4.no mName method<invokedynamic>(var4);
            var6.x.no mName method<invokedynamic>(var6.x, var0.stopTick, var5.x, var1.beginTick);
            var6.y.no mName method<invokedynamic>(var6.y, var0.stopTick, var5.y, var1.beginTick);
            var6.z.no mName method<invokedynamic>(var6.z, var0.stopTick, var5.z, var1.beginTick);
            var6.pitch.no mName method<invokedynamic>(var6.pitch, var0.stopTick, var5.pitch, var1.beginTick);
            var6.yaw.no mName method<invokedynamic>(var6.yaw, var0.stopTick, var5.yaw, var1.beginTick);
            var6.roll.no mName method<invokedynamic>(var6.roll, var0.stopTick, var5.roll, var1.beginTick);
            if (var6.isBendable) {
               var6.bend.no mName method<invokedynamic>(var6.bend, var0.stopTick, var5.bend, var1.beginTick);
               var6.bendDirection.no mName method<invokedynamic>(var6.bendDirection, var0.stopTick, var5.bendDirection, var1.beginTick);
            }
         }
      }

      var2.no mName method<invokedynamic>(var2, var0.stopTick);
      if (!var1.no mName method<invokedynamic>(var1, var0)) {
         var1.no mName method<invokedynamic>(var1, var0);
      }

   }

   private static void RedLanCeMINeCRaFt(State var0, int var1, State var2, int var3) {
      KeyFrame var4;
      if (var0 == var2) {
         var4 = var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0)) == 1 ? var0.no mName method<invokedynamic>(var0, var3, false) : null;
      } else {
         var4 = var2.no mName method<invokedynamic>(var2, var3, var1 != 0);
      }

      if (var1 == 0) {
         List var5 = var0.no mName method<invokedynamic>(var0);
         if (var5.no mName method<invokedynamic>(var5)) {
            var5.no mName method<invokedynamic>(var5, new KeyFrame(3, var0.defaultValue));
         } else {
            Iterator var6 = var5.no mName method<invokedynamic>(var5);

            while(var6.no mName method<invokedynamic>(var6)) {
               KeyFrame var7 = (KeyFrame)var6.no mName method<invokedynamic>(var6);
               ((KeyFrameAccessor)var7).no mName method<invokedynamic>((KeyFrameAccessor)var7, var7.tick + 3);
            }
         }
      }

      var0.no mName method<invokedynamic>(var0, var1, var4 == null ? var0.defaultValue : var4.value, var4 == null ? Ease.INOUTSINE : var4.ease);
   }

   public static void reDlancEmINecRAFt(KeyframeAnimation var0, KeyframeAnimation var1) {
      if (var0 != null) {
         if (var1 == null) {
            var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-fade");
         } else {
            var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-fade", var1.no mName method<invokedynamic>(var1).no mName method<invokedynamic>(var1.no mName method<invokedynamic>(var1)));
         }
      }
   }

   public static UUID RedLanCeMINeCRaFt(KeyframeAnimation var0) {
      return var0 != null && var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-fade") ? ((String)var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-fade")).no mName method<invokedynamic>((String)var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-fade")) : null;
   }

   public static RedLancemINECRAFT RedLanCeMINeCRaFt(KeyframeAnimation var0) {
      UUID var1 = var0.no mName method<invokedynamic>(var0);
      if (var1 == null) {
         return null;
      } else {
         Map var10000 = RedLancemINECRAFT.RedLanCeMINeCRaFt;
         return (RedLancemINECRAFT)var10000.no mName method<invokedynamic>(var10000, var0.no mName method<invokedynamic>(var0));
      }
   }

   public boolean RedLanCeMINeCRaFt(KeyframeAnimation var1, IntSupplier var2, @Nullable class_1306 var3) {
      if (!no mName method<invokedynamic>()) {
         return false;
      } else {
         EmotePlayer var4 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>());
         if (var4 == null) {
            return false;
         } else {
            KeyframeAnimation var5 = var4.no mName method<invokedynamic>(var4);
            if (var5.no mName method<invokedynamic>(var5) != null && !var5.no mName method<invokedynamic>(var5, var1)) {
               int var6 = var4.no mName method<invokedynamic>(var4);
               if (!var4.no mName method<invokedynamic>(var4)) {
                  var6 = var5.stopTick;
               }

               if (var5.no mName method<invokedynamic>(var5, var6 + 1)) {
                  ++var6;
               }

               if (var5.isInfinite && var6 > var5.stopTick) {
                  var6 = var5.stopTick;
               }

               var5.no mName method<invokedynamic>(var5, var1, var6);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0, KeyframeAnimation var1, int var2) {
      KeyframeAnimationAccessor var3 = (KeyframeAnimationAccessor)var1;
      var3.no mName method<invokedynamic>(var3, var1.endTick + 3);
      var3.no mName method<invokedynamic>(var3, var1.endTick);
      var3.no mName method<invokedynamic>(var3, 0);
      var3.no mName method<invokedynamic>(var3, var1.returnToTick + 3);
      Iterator var7 = var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0)).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0)));

      while(var7.no mName method<invokedynamic>(var7)) {
         Entry var4 = (Entry)var7.no mName method<invokedynamic>(var7);
         StateCollection var5 = var1.no mName method<invokedynamic>(var1, (String)var4.no mName method<invokedynamic>(var4));
         if (var5 != null) {
            StateCollection var6 = (StateCollection)var4.no mName method<invokedynamic>(var4);
            var5.x.no mName method<invokedynamic>(var5.x, var1.beginTick, var6.x, var2);
            var5.y.no mName method<invokedynamic>(var5.y, var1.beginTick, var6.y, var2);
            var5.z.no mName method<invokedynamic>(var5.z, var1.beginTick, var6.z, var2);
            var5.pitch.no mName method<invokedynamic>(var5.pitch, var1.beginTick, var6.pitch, var2);
            var5.yaw.no mName method<invokedynamic>(var5.yaw, var1.beginTick, var6.yaw, var2);
            var5.roll.no mName method<invokedynamic>(var5.roll, var1.beginTick, var6.roll, var2);
            if (var6.isBendable) {
               var5.bend.no mName method<invokedynamic>(var5.bend, var1.beginTick, var6.bend, var2);
               var5.bendDirection.no mName method<invokedynamic>(var5.bendDirection, var1.beginTick, var6.bendDirection, var2);
            }
         }
      }

      if (!var1.no mName method<invokedynamic>(var1, var0)) {
         var1.no mName method<invokedynamic>(var1, var0);
      }

   }
}
