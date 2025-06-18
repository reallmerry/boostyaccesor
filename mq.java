import com.github.dima_dencep.mods.epa.mixins.accessors.AnimationBuilderAccessor;
import com.github.dima_dencep.mods.epa.mixins.accessors.KeyframeAnimationAccessor;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.AnimationBuilder;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.KeyFrame;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection.State;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_1306;

public class rEDLanCEmINecRAft {
   private static final String RedLanCeMINeCRaFt = "epa-mergedWith";

   public static KeyframeAnimation RedLanCeMINeCRaFt(AnimationBuilder var0, int var1, KeyframeAnimation var2) {
      int var3 = var2.stopTick - var2.endTick;
      if (!var2.isInfinite && var3 > 0) {
         var2.no mName method<invokedynamic>(var2, var2);
      }

      reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "tickOffset {}, stopTick {}", var1.no mName method<invokedynamic>(var1), var3.no mName method<invokedynamic>(var3));
      reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "beginTick, builder {} overlay {}", var0.beginTick.no mName method<invokedynamic>(var0.beginTick), var2.beginTick.no mName method<invokedynamic>(var2.beginTick));
      reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "stopTick, builder {} overlay {}", var0.stopTick.no mName method<invokedynamic>(var0.stopTick), var2.stopTick.no mName method<invokedynamic>(var2.stopTick));
      reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "endTick, builder {} overlay {}", var0.endTick.no mName method<invokedynamic>(var0.endTick), var2.endTick.no mName method<invokedynamic>(var2.endTick));
      if (var0.beginTick > 0) {
         var1 += var0.beginTick;
      }

      if (!var2.isInfinite && var0.endTick < var2.endTick + var1) {
         if (!var0.isLooped) {
            reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Overlay > Builder");
            return var2;
         }

         var0.no mName method<invokedynamic>(var0, var2.endTick + var1 - var0.endTick, true);
      }

      var0.isLooped = false;
      if (var2.isInfinite) {
         var0.isLooped = var2.isInfinite;
      } else {
         var0.endTick = var2.endTick + var1;
      }

      int var4 = var2.endTick - var2.returnToTick;
      int var5 = var0.endTick - var0.returnTick;
      if (var0.isLooped) {
         reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "loop, builder {} overlay {}", var5.no mName method<invokedynamic>(var5), var4.no mName method<invokedynamic>(var4));
      }

      Iterator var6 = var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)));

      while(true) {
         StateCollection var8;
         StateCollection var9;
         int var11;
         int var12;
         label82:
         do {
            while(var6.no mName method<invokedynamic>(var6)) {
               Entry var7 = (Entry)var6.no mName method<invokedynamic>(var6);
               var8 = var0.no mName method<invokedynamic>(var0, (String)var7.no mName method<invokedynamic>(var7));
               var9 = (StateCollection)var7.no mName method<invokedynamic>(var7);
               String var10000 = (String)var7.no mName method<invokedynamic>(var7);
               if (var10000.no mName method<invokedynamic>(var10000, "Arm")) {
                  var8.no mName method<invokedynamic>(var8);
               }

               if (var0.isLooped) {
                  int var10 = var2.endTick - var4;
                  if (var10 > 0) {
                     if (var0.returnTick < var10) {
                        reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Cant add preloop to loop!");
                        var10 = var0.returnTick;
                     }

                     var8.no mName method<invokedynamic>(var8, var9, var0.returnTick - var10, -1, var10 - var1);
                  }

                  if (var5 < var4) {
                     var11 = var4 - var5;
                     var0.no mName method<invokedynamic>(var0, var11, false);
                     var0.endTick += var11;
                  }

                  var11 = 0;

                  for(var12 = var0.returnTick; var12 < var0.endTick; var12 += var4) {
                     var8.no mName method<invokedynamic>(var8, var9, var12, var2.returnToTick, -1);
                     var11 = var0.endTick - var12;
                  }
                  continue label82;
               }

               var8.no mName method<invokedynamic>(var8, var9, var1, -1, -1);
            }

            KeyframeAnimation var14 = var0.no mName method<invokedynamic>(var0).no mName method<invokedynamic>(var0.no mName method<invokedynamic>(var0));
            var14.no mName method<invokedynamic>(var14, var2);
            var14.no mName method<invokedynamic>(var14, var2);
            class_1306 var15 = var2.no mName method<invokedynamic>(var2);
            if (var15 != null) {
               var14.no mName method<invokedynamic>(var14, var15);
            }

            ((KeyframeAnimationAccessor)var14).no mName method<invokedynamic>((KeyframeAnimationAccessor)var14, var0.endTick + var3);
            return var14;
         } while(var11 <= 0);

         for(var12 = 0; var12 <= var11; ++var12) {
            int var13 = var0.endTick - var12;
            var8.no mName method<invokedynamic>(var8, var9, var13, var2.returnToTick, var2.returnToTick + var13 - var1);
         }
      }
   }

   private static void RedLanCeMINeCRaFt(AnimationBuilder var0, int var1, boolean var2) {
      reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Missing {} ticks!", var1.no mName method<invokedynamic>(var1));
      int var3 = var0.endTick - var0.returnTick - var1;
      if (var2 && var3 > 0) {
         reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Not enough {} ticks!", var3.no mName method<invokedynamic>(var3));
         var1 += var3;
      }

      for(int var4 = 0; var4 < var1; ++var4) {
         int var5 = var0.endTick + var4;
         int var6 = var0.returnTick + var4;
         Iterator var7 = ((AnimationBuilderAccessor)var0).no mName method<invokedynamic>((AnimationBuilderAccessor)var0).no mName method<invokedynamic>(((AnimationBuilderAccessor)var0).no mName method<invokedynamic>((AnimationBuilderAccessor)var0)).no mName method<invokedynamic>(((AnimationBuilderAccessor)var0).no mName method<invokedynamic>((AnimationBuilderAccessor)var0).no mName method<invokedynamic>(((AnimationBuilderAccessor)var0).no mName method<invokedynamic>((AnimationBuilderAccessor)var0)));

         while(var7.no mName method<invokedynamic>(var7)) {
            StateCollection var8 = (StateCollection)var7.no mName method<invokedynamic>(var7);
            var6.no mName method<invokedynamic>(var6, var5, var8.x);
            var6.no mName method<invokedynamic>(var6, var5, var8.y);
            var6.no mName method<invokedynamic>(var6, var5, var8.z);
            var6.no mName method<invokedynamic>(var6, var5, var8.pitch);
            var6.no mName method<invokedynamic>(var6, var5, var8.yaw);
            var6.no mName method<invokedynamic>(var6, var5, var8.roll);
            if (var8.isBendable) {
               var6.no mName method<invokedynamic>(var6, var5, var8.bend);
               var6.no mName method<invokedynamic>(var6, var5, var8.bendDirection);
            }
         }
      }

   }

   private static void RedLanCeMINeCRaFt(StateCollection var0, StateCollection var1, int var2, int var3, int var4) {
      var3.no mName method<invokedynamic>(var3, var4, var2, var0.x, var1.x);
      var3.no mName method<invokedynamic>(var3, var4, var2, var0.y, var1.y);
      var3.no mName method<invokedynamic>(var3, var4, var2, var0.z, var1.z);
      var3.no mName method<invokedynamic>(var3, var4, var2, var0.pitch, var1.pitch);
      var3.no mName method<invokedynamic>(var3, var4, var2, var0.yaw, var1.yaw);
      var3.no mName method<invokedynamic>(var3, var4, var2, var0.roll, var1.roll);
      if (var1.isBendable) {
         var3.no mName method<invokedynamic>(var3, var4, var2, var0.bend, var1.bend);
         var3.no mName method<invokedynamic>(var3, var4, var2, var0.bendDirection, var1.bendDirection);
      }

   }

   private static void RedLanCeMINeCRaFt(int var0, int var1, State var2) {
      KeyFrame var3 = var2.no mName method<invokedynamic>(var2, var0, false);
      if (var3 != null) {
         var2.no mName method<invokedynamic>(var2, var1 + var0, var3.value, var3.ease);
      }
   }

   public static void RedLanCeMINeCRaFt(StateCollection var0) {
      var0.x.no mName method<invokedynamic>(var0.x).no mName method<invokedynamic>(var0.x.no mName method<invokedynamic>(var0.x));
      var0.y.no mName method<invokedynamic>(var0.y).no mName method<invokedynamic>(var0.y.no mName method<invokedynamic>(var0.y));
      var0.z.no mName method<invokedynamic>(var0.z).no mName method<invokedynamic>(var0.z.no mName method<invokedynamic>(var0.z));
      var0.pitch.no mName method<invokedynamic>(var0.pitch).no mName method<invokedynamic>(var0.pitch.no mName method<invokedynamic>(var0.pitch));
      var0.yaw.no mName method<invokedynamic>(var0.yaw).no mName method<invokedynamic>(var0.yaw.no mName method<invokedynamic>(var0.yaw));
      var0.roll.no mName method<invokedynamic>(var0.roll).no mName method<invokedynamic>(var0.roll.no mName method<invokedynamic>(var0.roll));
      if (var0.isBendable) {
         var0.bend.no mName method<invokedynamic>(var0.bend).no mName method<invokedynamic>(var0.bend.no mName method<invokedynamic>(var0.bend));
         var0.bendDirection.no mName method<invokedynamic>(var0.bendDirection).no mName method<invokedynamic>(var0.bendDirection.no mName method<invokedynamic>(var0.bendDirection));
      }

   }

   private static void RedLanCeMINeCRaFt(int var0, int var1, int var2, State var3, State var4) {
      if (!var4.no mName method<invokedynamic>(var4).no mName method<invokedynamic>(var4.no mName method<invokedynamic>(var4))) {
         Iterator var5 = var4.no mName method<invokedynamic>(var4).no mName method<invokedynamic>(var4.no mName method<invokedynamic>(var4));

         while(true) {
            KeyFrame var7;
            int var8;
            while(true) {
               do {
                  KeyFrame var6;
                  do {
                     if (!var5.no mName method<invokedynamic>(var5)) {
                        return;
                     }

                     var6 = (KeyFrame)var5.no mName method<invokedynamic>(var5);
                  } while(var0 != -1 && var6.tick < var0);

                  var7 = new KeyFrame(var2 + var6.tick, var6.value, var6.ease);
               } while(var1 != -1 && var7.tick > var1);

               var8 = var3.no mName method<invokedynamic>(var3, var7.tick) + 1;
               var3.no mName method<invokedynamic>(var3, true);
               List var10000 = var3.no mName method<invokedynamic>(var3);
               if (!var10000.no mName method<invokedynamic>(var10000, var8)) {
                  break;
               }

               var10000 = var3.no mName method<invokedynamic>(var3);
               KeyFrame var9 = (KeyFrame)var10000.no mName method<invokedynamic>(var10000, var8);
               if (var7.value != var9.value) {
                  var3.no mName method<invokedynamic>(var3).no mName method<invokedynamic>(var3.no mName method<invokedynamic>(var3), var8);
                  break;
               }
            }

            var3.no mName method<invokedynamic>(var3).no mName method<invokedynamic>(var3.no mName method<invokedynamic>(var3), var8, var7);
         }
      }
   }

   public static void RedLanCeMINeCRaFt(KeyframeAnimation var0, KeyframeAnimation var1) {
      if (var0 != null) {
         if (var1 == null) {
            var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-mergedWith");
         } else {
            var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-mergedWith", var1.no mName method<invokedynamic>(var1).no mName method<invokedynamic>(var1.no mName method<invokedynamic>(var1)));
         }
      }
   }

   public static RedLancemINECRAFT RedLanCeMINeCRaFt(KeyframeAnimation var0) {
      if (var0 != null && var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-mergedWith")) {
         UUID var1 = ((String)var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-mergedWith")).no mName method<invokedynamic>((String)var0.extraData.no mName method<invokedynamic>(var0.extraData, "epa-mergedWith"));
         return (RedLancemINECRAFT)RedLancemINECRAFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(RedLancemINECRAFT.RedLanCeMINeCRaFt, var1);
      } else {
         return null;
      }
   }

   public static boolean RedLanCeMINeCRaFt(List var0, int var1) {
      return var1 >= 0 && var1 < var0.no mName method<invokedynamic>(var0) && var0.no mName method<invokedynamic>(var0, var1) != null;
   }
}
