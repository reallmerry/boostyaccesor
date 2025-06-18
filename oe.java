import com.github.dima_dencep.mods.epa.mixins.accessors.KeyframeAnimationAccessor;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.AnimationBuilder;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.KeyFrame;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection.State;
import io.github.kosmx.emotes.common.network.EmotePacket.Builder;
import io.github.kosmx.emotes.main.emotePlay.EmotePlayer;
import java.util.List;
import java.util.UUID;
import java.util.function.IntSupplier;
import net.minecraft.class_1306;
import net.minecraft.class_746;
import org.jetbrains.annotations.Nullable;

public class REDlancEmiNeCRafT {
   public static final IntSupplier RedLanCeMINeCRaFt = () -> {
      return 0;
   };
   public static boolean RedLanCeMINeCRaFt = true;

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0, IntSupplier var1, boolean var2) {
      if (!no mName method<invokedynamic>() || !no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>()).field_7479) {
         if (var0 != null && !RedLanCeMINeCRaFt) {
            reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Playing: {}, Tick: {}", var0, (var1 != RedLanCeMINeCRaFt).no mName method<invokedynamic>(var1 != RedLanCeMINeCRaFt));
            class_746 var3 = no mName method<invokedynamic>();
            if (var3 != null) {
               Builder var10000 = (new Builder()).no mName method<invokedynamic>(new Builder(), var0, var3.no mName method<invokedynamic>(var3));
               Builder var4 = var10000.no mName method<invokedynamic>(var10000, var1.no mName method<invokedynamic>(var1));
               if (!var2) {
                  if (no mName method<invokedynamic>()) {
                     var4.no mName method<invokedynamic>(var4);
                  }

                  var3.no mName method<invokedynamic>(var3, var0, var1.no mName method<invokedynamic>(var1), false);
               }

               var4.no mName method<invokedynamic>(var4, (UUID)null);
            }
         }
      }
   }

   public static void RedLanCeMINeCRaFt(@Nullable RedLancemINECRAFT var0, class_1306 var1) {
      EmotePlayer var2 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>());
      IntSupplier var3 = RedLanCeMINeCRaFt;
      KeyframeAnimation var4;
      if (var0 == null && var2 != null && !var2.no mName method<invokedynamic>(var2)) {
         var4 = var2.no mName method<invokedynamic>(var2);
         if (var4 != null) {
            reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Try to fix null anims...");
            var0 = var4.no mName method<invokedynamic>(var4);
            var3 = () -> {
               return var4.isInfinite ? var4.returnToTick : var4.endTick / 3;
            };
         }
      }

      if (var0 != null) {
         if (var2.no mName method<invokedynamic>(var2)) {
            var4 = var2.no mName method<invokedynamic>(var2);
            RedLancemINECRAFT var5 = var4.no mName method<invokedynamic>(var4);
            if (var5 == null) {
               return;
            }

            if (!var4.no mName method<invokedynamic>(var4)) {
               if (var5.no mName method<invokedynamic>(var5) || var0.no mName method<invokedynamic>(var0)) {
                  return;
               }

               if (!var5.no mName method<invokedynamic>(var5)) {
                  int var6 = var0.no mName method<invokedynamic>(var0, var5) ? 10 : 6;
                  int var7 = var4.stopTick;
                  if (var2.no mName method<invokedynamic>(var2) < var7 - var7 / var6) {
                     return;
                  }
               }
            } else {
               if (var5.no mName method<invokedynamic>(var5) && var0.no mName method<invokedynamic>(var0)) {
                  return;
               }

               if (var0.no mName method<invokedynamic>(var0, var5)) {
                  return;
               }
            }
         }

         var4 = var0.no mName method<invokedynamic>(var0);
         if (var4 != null) {
            var4.no mName method<invokedynamic>(var4, var3, var1);
            var4.no mName method<invokedynamic>(var4, var3, false);
         }
      }
   }

   public static void reDlancEmINecRAFt(RedLancemINECRAFT var0, class_1306 var1) {
      KeyframeAnimation var2 = null;
      IntSupplier var3 = RedLanCeMINeCRaFt;
      EmotePlayer var4 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>());
      if (var4 != null) {
         KeyframeAnimation var5 = var4.no mName method<invokedynamic>(var4);
         RedLancemINECRAFT var6 = var5.no mName method<invokedynamic>(var5);
         if (var6 == null) {
            return;
         }

         if (var6.no mName method<invokedynamic>(var6)) {
            return;
         }

         RedLancemINECRAFT var7 = var5.no mName method<invokedynamic>(var5);
         if (var7 != null && var7.no mName method<invokedynamic>(var7)) {
            return;
         }

         if (var5.no mName method<invokedynamic>(var5) == null) {
            var2 = var5;
         } else {
            var2 = var6.no mName method<invokedynamic>(var6);
         }

         var4.no mName method<invokedynamic>(var4);
         var3 = var4::getTick;
      }

      var2.no mName method<invokedynamic>(var2, var3, var0, var1);
   }

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0, IntSupplier var1, RedLancemINECRAFT var2, class_1306 var3) {
      if (var2 != null) {
         if (!no mName method<invokedynamic>()) {
            var2.no mName method<invokedynamic>(var2, var3);
         } else {
            EmotePlayer var4 = no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>());
            KeyframeAnimation var5;
            if (var4.no mName method<invokedynamic>(var4)) {
               var5 = var4.no mName method<invokedynamic>(var4);
               RedLancemINECRAFT var6 = var5.no mName method<invokedynamic>(var5);
               if (var6 == null || var6 == var2) {
                  return;
               }
            }

            var5 = var2.no mName method<invokedynamic>(var2);
            if (var5 != null) {
               if (var0 != null) {
                  AnimationBuilder var10000 = var0.no mName method<invokedynamic>(var0);
                  AnimationBuilder var8 = var10000.no mName method<invokedynamic>(var10000, var0.no mName method<invokedynamic>(var0));
                  KeyframeAnimation var7 = var8.no mName method<invokedynamic>(var8, var1.no mName method<invokedynamic>(var1), var5);
                  var7.no mName method<invokedynamic>(var7, var1, var3);
                  var7.no mName method<invokedynamic>(var7, var1, false);
               } else {
                  var5.no mName method<invokedynamic>(var5, RedLanCeMINeCRaFt, var3);
                  var5.no mName method<invokedynamic>(var5, RedLanCeMINeCRaFt, false);
               }
            }
         }
      }
   }

   public static KeyFrame RedLanCeMINeCRaFt(State var0, int var1, boolean var2) {
      List var3 = var0.no mName method<invokedynamic>(var0);
      if (var3.no mName method<invokedynamic>(var3)) {
         return null;
      } else {
         KeyFrame var4;
         try {
            var4 = (KeyFrame)var3.no mName method<invokedynamic>(var3, var0.no mName method<invokedynamic>(var0, var1));
         } catch (Throwable var6) {
            var4 = var2 ? (KeyFrame)var3.no mName method<invokedynamic>(var3, 0) : null;
         }

         return var4;
      }
   }

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0, KeyframeAnimation var1) {
      UUID var2 = var0.no mName method<invokedynamic>(var0);
      UUID var3 = var1.no mName method<invokedynamic>(var1);
      KeyframeAnimationAccessor var4 = (KeyframeAnimationAccessor)var0;
      var4.no mName method<invokedynamic>(var4, var3);
      var4.no mName method<invokedynamic>(var4, false);
      KeyframeAnimationAccessor var5 = (KeyframeAnimationAccessor)var1;
      var5.no mName method<invokedynamic>(var5, var2);
      var5.no mName method<invokedynamic>(var5, false);
   }
}
