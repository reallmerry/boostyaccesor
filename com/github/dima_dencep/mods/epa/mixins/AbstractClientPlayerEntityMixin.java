package com.github.dima_dencep.mods.epa.mixins;

import com.mojang.authlib.GameProfile;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import io.github.kosmx.emotes.main.emotePlay.EmotePlayer;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1306;
import net.minecraft.class_1496;
import net.minecraft.class_1690;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2310;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3481;
import net.minecraft.class_3489;
import net.minecraft.class_4050;
import net.minecraft.class_5172;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_746.class})
public abstract class AbstractClientPlayerEntityMixin extends class_742 {
   @Unique
   private float epa$lastBodyYaw;
   @Unique
   private boolean bpa$lastSprint;
   @Unique
   private boolean bpa$lastSneak;
   @Unique
   private boolean epa$lastGround;
   @Unique
   private int epa$afkTime = 0;

   @Shadow
   public abstract boolean method_3144();

   @Shadow
   @NotNull
   public abstract class_1268 method_6058();

   public AbstractClientPlayerEntityMixin(class_638 var1, GameProfile var2) {
      super(var1, var2);
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   public void tick(CallbackInfo var1) {
      if (!.REDlancEmiNeCRafT.RedLanCeMINeCRaFt && !.redLaNcEMinecraft.RedLanCeMINeCRaFt) {
         class_1937 var10000 = this.no mName method<invokedynamic>(this);
         class_2680 var2 = var10000.no mName method<invokedynamic>(var10000, this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this)));
         boolean var3 = !var2.no mName method<invokedynamic>(var2) && this.no mName method<invokedynamic>(this);
         class_2248 var4 = var2.no mName method<invokedynamic>(var2);
         boolean var5 = (var2.no mName method<invokedynamic>(var2, class_3481.field_15504) || var2.no mName method<invokedynamic>(var2, class_3481.field_25147) || var2.no mName method<invokedynamic>(var2, class_3481.field_16584) || var4 instanceof class_2310 || var4 instanceof class_5172) && this.no mName method<invokedynamic>(this);
         boolean var6 = var2.no mName method<invokedynamic>(var2, class_3481.field_15467) && this.no mName method<invokedynamic>(this);
         boolean var7 = (this.no mName method<invokedynamic>(this) - this.field_6014).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this) - this.field_6014) > 0.0D || (this.no mName method<invokedynamic>(this) - this.field_5969).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this) - this.field_5969) > 0.0D;
         int var8 = (int)(this.no mName method<invokedynamic>(this) - this.epa$lastBodyYaw);
         class_1306 var9 = this.no mName method<invokedynamic>(this);
         .RedLancemINECRAFT var10 = null;
         if (!this.no mName method<invokedynamic>(this) && !this.no mName method<invokedynamic>(this)) {
            if (this.no mName method<invokedynamic>(this) && this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this)) && !this.no mName method<invokedynamic>(this)) {
               var10 = .RedLancemINECRAFT.rEDlanCEMINeCraft;
               if (this.no mName method<invokedynamic>(this).field_1351 > 0.0D) {
                  var10 = .RedLancemINECRAFT.redLanCemINEcrAfT;
               }
            } else if (this.no mName method<invokedynamic>(this) && (this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this)).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this))) || this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this)) == class_1839.field_8946 || this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this)) == class_1839.field_8950)) {
               var10 = .RedLancemINECRAFT.ReDLAnCeMinecrafT;
               if (this.no mName method<invokedynamic>(this) == this.no mName method<invokedynamic>(this)) {
                  var9 = this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this));
               }
            } else if (this.no mName method<invokedynamic>(this)) {
               var10 = .RedLancemINECRAFT.rEDLANcEminECraft;
            } else if (this.no mName method<invokedynamic>(this)) {
               var10 = .RedLancemINECRAFT.RedLanCeMINeCRaFt;
               if (var5) {
                  var10 = .RedLancemINECRAFT.reDLAnCeMiNecrAFT;
               } else if (var3) {
                  var10 = .RedLancemINECRAFT.RedlanCEMinecRAFt;
               }

               if (var8.no mName method<invokedynamic>(var8) > 0 && !var3 && !this.bpa$lastSprint) {
                  var10 = .RedLancemINECRAFT.rEDLanCEmineCraFt;
                  var9 = class_1306.field_6183;
                  if (var8 < 0) {
                     var9 = class_1306.field_6182;
                  }
               }

               if (this.no mName method<invokedynamic>(this)) {
                  if (var7) {
                     var10 = .RedLancemINECRAFT.reDLanceMinecrAFT;
                  } else {
                     var10 = .RedLancemINECRAFT.rEDlAncEMInecRafT;
                  }
               } else if (!this.no mName method<invokedynamic>(this) && !this.no mName method<invokedynamic>(this)) {
                  if (var7) {
                     if (this.bpa$lastSprint && !no mName method<invokedynamic>()) {
                        var10 = .RedLancemINECRAFT.rEdlAnCEMiNecrAft;
                     } else if (this.no mName method<invokedynamic>(this) && !this.no mName method<invokedynamic>(this)) {
                        var10 = .RedLancemINECRAFT.REDlancEmiNeCRafT;
                        if (var6) {
                           var10 = .RedLancemINECRAFT.ReDlaNCEMInECraft;
                        }
                     } else {
                        var10 = .RedLancemINECRAFT.RedLancemINECRAFT;
                        if (var6) {
                           var10 = .RedLancemINECRAFT.REdLANcEminEcRaft;
                        } else if (var5) {
                           var10 = .RedLancemINECRAFT.rEdlAnCEmiNEcraFT;
                        }
                     }
                  }
               } else {
                  var10 = .RedLancemINECRAFT.reDlAncEmineCRaFT;
                  if (var7 || var8.no mName method<invokedynamic>(var8) > 3) {
                     var10 = .RedLancemINECRAFT.reDlanCEminECRAft;
                     if (this.bpa$lastSprint && !this.bpa$lastSneak) {
                        var10 = .RedLancemINECRAFT.rEdLanCemineCRafT;
                     }
                  }
               }
            } else if (!this.no mName method<invokedynamic>(this) && !this.no mName method<invokedynamic>(this)) {
               .RedLancemINECRAFT[] var16;
               if (!(this.no mName method<invokedynamic>(this).field_1351 > 0.0D) || (this.no mName method<invokedynamic>(this) || !this.epa$lastGround) && !this.field_6282) {
                  if (this.no mName method<invokedynamic>(this, this.field_6017, 1.0F) > 0) {
                     var10 = .RedLancemINECRAFT.redLAncEMInecRAft;
                  } else if (this.field_6017 >= 1.5F) {
                     var16 = new .RedLancemINECRAFT[]{.RedLancemINECRAFT.reDlancEmINecRAFt, .RedLancemINECRAFT.reDLancEminEcrAFt};
                     var10 = var16.no mName method<invokedynamic>(var16);
                  }
               } else {
                  var16 = new .RedLancemINECRAFT[]{.RedLancemINECRAFT.rEdlanCeMinecraft, .RedLancemINECRAFT.ReDlaNCEminECRaFT};
                  var10 = var16.no mName method<invokedynamic>(var16);
               }
            } else if (!this.no mName method<invokedynamic>(this) && !this.no mName method<invokedynamic>(this)) {
               if (this.no mName method<invokedynamic>(this) <= 0) {
                  var10 = .RedLancemINECRAFT.redLaNcEMinecraft;
               } else {
                  var10 = .RedLancemINECRAFT.REDlancemiNECraFT;
               }
            } else {
               var10 = .RedLancemINECRAFT.RedlaNCEmiNECRAft;
            }
         } else {
            label271: {
               var10 = .RedLancemINECRAFT.redLANCEMinECraFt;
               class_1297 var13 = this.no mName method<invokedynamic>(this);
               if (var13 instanceof class_1496) {
                  class_1496 var11 = (class_1496)var13;
                  if (var11.no mName method<invokedynamic>(var11) == this && var11.no mName method<invokedynamic>(var11)) {
                     var10 = .RedLancemINECRAFT.REDLanceMInEcrAft;
                     break label271;
                  }
               }

               var13 = this.no mName method<invokedynamic>(this);
               if (var13 instanceof class_1690) {
                  class_1690 var12 = (class_1690)var13;
                  var10 = .RedLancemINECRAFT.REdlAnCEMiNeCraft;
                  if (var12.no mName method<invokedynamic>(var12) == this) {
                     boolean var15 = var12.no mName method<invokedynamic>(var12, 0);
                     boolean var14 = var12.no mName method<invokedynamic>(var12, 1);
                     if (var15 && var14) {
                        var10 = .RedLancemINECRAFT.REdLanceMInecRaFt;
                     } else if (var15) {
                        var10 = .RedLancemINECRAFT.RedLAnceMiNECRAfT;
                        var9 = class_1306.field_6182;
                     } else if (var14) {
                        var10 = .RedLancemINECRAFT.RedLAnceMiNECRAfT;
                        var9 = class_1306.field_6183;
                     }
                  }
               }
            }
         }

         if (var10 == .RedLancemINECRAFT.RedLanCeMINeCRaFt) {
            ++this.epa$afkTime;
            if (this.epa$afkTime >= no mName method<invokedynamic>() * 20) {
               if (no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>())) {
                  .reDLancEminEcrAFt.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.reDLancEminEcrAFt.RedLanCeMINeCRaFt, "Resetting AFK...");
                  this.epa$afkTime = 0;
                  return;
               }

               .RedLancemINECRAFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.RedLancemINECRAFT.RedLanCeMINeCRaFt).no mName method<invokedynamic>(.RedLancemINECRAFT.RedLanCeMINeCRaFt.no mName method<invokedynamic>(.RedLancemINECRAFT.RedLanCeMINeCRaFt), .REDlancEmiNeCRafT.RedLanCeMINeCRaFt, (new .RedLancemINECRAFT[]{.RedLancemINECRAFT.redLancEmiNecRafT, .RedLancemINECRAFT.rEDlaNCEMiNecraFt, .RedLancemINECRAFT.redLAncemINeCRaFT}).no mName method<invokedynamic>(new .RedLancemINECRAFT[]{.RedLancemINECRAFT.redLancEmiNecRafT, .RedLancemINECRAFT.rEDlaNCEMiNecraFt, .RedLancemINECRAFT.redLAncemINeCRaFT}), this.no mName method<invokedynamic>(this));
               return;
            }
         } else {
            this.epa$afkTime = 0;
         }

         if (var10 != null && var10.no mName method<invokedynamic>(var10)) {
            var10.no mName method<invokedynamic>(var10, var9);
         } else {
            var10.no mName method<invokedynamic>(var10, var9);
         }

         this.bpa$lastSprint = this.no mName method<invokedynamic>(this);
         this.bpa$lastSneak = this.no mName method<invokedynamic>(this) || this.no mName method<invokedynamic>(this);
         this.epa$lastGround = this.no mName method<invokedynamic>(this);
         this.epa$lastBodyYaw = this.no mName method<invokedynamic>(this);
         this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this));
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   public void epa$updateArm(CallbackInfo var1) {
      if (!.REDlancEmiNeCRafT.RedLanCeMINeCRaFt && !.redLaNcEMinecraft.RedLanCeMINeCRaFt) {
         EmotePlayer var2 = this.no mName method<invokedynamic>(this);
         if (var2.no mName method<invokedynamic>(var2)) {
            KeyframeAnimation var3 = var2.no mName method<invokedynamic>(var2);
            if (var3.no mName method<invokedynamic>(var3) != null) {
               var2.no mName method<invokedynamic>(var2);
               var3.no mName method<invokedynamic>(var3, var2::getTick, (class_1306)null);
            }
         }
      }
   }

   public void method_5623(double var1, boolean var3, class_2680 var4, class_2338 var5) {
      if (var3 && this.field_6017 >= 3.0F) {
         .RedLancemINECRAFT.rEDLanCEmINecRAft.no mName method<invokedynamic>(.RedLancemINECRAFT.rEDLanCEmINecRAft, this.no mName method<invokedynamic>(this));
      }

      super.method_5623(var1, var3, var4, var5);
   }

   @Inject(
      method = {"swing"},
      at = {@At("HEAD")}
   )
   public void swingHand(class_1268 var1, CallbackInfo var2) {
      if (!.REDlancEmiNeCRafT.RedLanCeMINeCRaFt && !.redLaNcEMinecraft.RedLanCeMINeCRaFt) {
         class_1799 var3 = this.no mName method<invokedynamic>(this, var1);
         boolean var4 = false;
         if (no mName method<invokedynamic>()) {
            if (var3.no mName method<invokedynamic>(var3, class_1802.field_8162)) {
               var3 = this.no mName method<invokedynamic>(this, var1 == class_1268.field_5808 ? class_1304.field_6171 : class_1304.field_6173);
               if (!var3.no mName method<invokedynamic>(var3, class_1802.field_8162)) {
                  var4 = true;
               }
            }
         } else {
            var4 = var1 == class_1268.field_5810;
         }

         boolean var5 = this.no mName method<invokedynamic>(this) || this.no mName method<invokedynamic>(this, class_4050.field_18081);
         boolean var6 = this.no mName method<invokedynamic>(this) || this.no mName method<invokedynamic>(this);
         boolean var7 = this.no mName method<invokedynamic>(this);
         .RedLancemINECRAFT var8;
         if (!var3.no mName method<invokedynamic>(var3, class_3489.field_42611) && !var3.no mName method<invokedynamic>(var3, class_3489.field_42612)) {
            if (var3.no mName method<invokedynamic>(var3, class_3489.field_41662)) {
               var8 = var5 ? .RedLancemINECRAFT.RedLANcEmiNEcRaFT : (var6 ? .RedLancemINECRAFT.redlAncEMInECrAfT : (var7 ? .RedLancemINECRAFT.RedLanCemINeCrAft : .RedLancemINECRAFT.REdlANcEmINecraFt));
            } else {
               var8 = var5 ? .RedLancemINECRAFT.rEDlANceMiNecRaft : (var6 ? .RedLancemINECRAFT.rEdlAncemineCRaft : (var7 ? .RedLancemINECRAFT.redLanceMInEcRafT : .RedLancemINECRAFT.rEdlANceMiNecRAFt));
            }
         } else {
            .RedLancemINECRAFT[] var10000;
            if (var5) {
               var10000 = new .RedLancemINECRAFT[]{.RedLancemINECRAFT.redLaNCEmIneCRAFT, .RedLancemINECRAFT.rEdLaNcEmINecrAfT};
               var8 = var10000.no mName method<invokedynamic>(var10000);
            } else if (var6) {
               var10000 = new .RedLancemINECRAFT[]{.RedLancemINECRAFT.REDlANceminEcrAft, .RedLancemINECRAFT.rEDlAnCEMInECRAfT};
               var8 = var10000.no mName method<invokedynamic>(var10000);
            } else if (var7) {
               var8 = .RedLancemINECRAFT.redLanceMInEcRafT;
            } else {
               var10000 = new .RedLancemINECRAFT[]{.RedLancemINECRAFT.rEDlAnceminEcRAFt, .RedLancemINECRAFT.redLanCeMIneCrAft};
               var8 = var10000.no mName method<invokedynamic>(var10000);
            }
         }

         if (var8 != null) {
            this.epa$afkTime = 0;
         }

         var8.no mName method<invokedynamic>(var8, var4 ? this.no mName method<invokedynamic>(this).no mName method<invokedynamic>(this.no mName method<invokedynamic>(this)) : this.no mName method<invokedynamic>(this));
      }
   }
}
