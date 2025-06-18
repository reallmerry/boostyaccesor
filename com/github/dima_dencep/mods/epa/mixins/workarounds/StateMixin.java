package com.github.dima_dencep.mods.epa.mixins.workarounds;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.KeyFrame;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation.StateCollection.State;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   value = {State.class},
   remap = false
)
public class StateMixin {
   @Inject(
      method = {"lock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void unlock(CallbackInfo var1) {
      var1.no mName method<invokedynamic>(var1);
   }

   @WrapOperation(
      method = {"<init>(Ldev/kosmx/playerAnim/core/data/KeyframeAnimation$StateCollection$State;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Ljava/util/List;addAll(Ljava/util/Collection;)Z"
)}
   )
   private boolean epa$cloneFrames(List var1, Collection var2, Operation var3) {
      if (!no mName method<invokedynamic>()) {
         Object var10000 = var3.no mName method<invokedynamic>(var3, new Object[]{var1, var2});
         return ((Boolean)var10000).no mName method<invokedynamic>((Boolean)var10000);
      } else {
         boolean var4 = false;

         KeyFrame var6;
         for(Iterator var5 = var2.no mName method<invokedynamic>(var2); var5.no mName method<invokedynamic>(var5); var4 |= var1.no mName method<invokedynamic>(var1, new KeyFrame(var6.tick, var6.value, var6.ease))) {
            var6 = (KeyFrame)var5.no mName method<invokedynamic>(var5);
         }

         return var4;
      }
   }
}
