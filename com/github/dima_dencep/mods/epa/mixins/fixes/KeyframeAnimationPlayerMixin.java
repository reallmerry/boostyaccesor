package com.github.dima_dencep.mods.epa.mixins.fixes;

import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(
   value = {KeyframeAnimationPlayer.class},
   remap = false
)
public abstract class KeyframeAnimationPlayerMixin {
   @Shadow
   private int currentTick;
   @Shadow
   private boolean isRunning;
   @Shadow
   @Final
   private KeyframeAnimation data;
   @Shadow
   private boolean isLoopStarted;

   @Shadow
   public abstract KeyframeAnimation getData();

   @Shadow
   public abstract void stop();

   @Overwrite
   public void tick() {
      if (this.isRunning) {
         ++this.currentTick;
         if (this.data.isInfinite && this.currentTick >= this.data.endTick) {
            this.currentTick = this.data.returnToTick;
            this.isLoopStarted = true;
         }

         if (this.currentTick >= this.data.stopTick) {
            this.no mName method<invokedynamic>(this);
         }
      }

   }
}
