package com.github.dima_dencep.mods.epa.mixins.accessors;

import io.github.kosmx.emotes.common.network.EmotePacket.Builder;
import io.github.kosmx.emotes.main.network.ClientPacketManager;
import java.util.UUID;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(
   value = {ClientPacketManager.class},
   remap = false
)
public interface ClientPacketManagerAccessor {
   @Invoker
   static void invokeSend(Builder var0, UUID var1) {
      throw new AssertionError();
   }
}
