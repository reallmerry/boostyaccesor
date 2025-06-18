import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public class reDlAncEmineCRaFT extends reDLancEminEcrAFt implements ClientModInitializer {
   public static final ModContainer RedLanCeMINeCRaFt = (ModContainer)FabricLoader.getInstance().getModContainer("epa").orElseThrow();
   public static final rEdlanCeMinecraft RedLanCeMINeCRaFt = (rEdlanCeMinecraft)AutoConfig.register(rEdlanCeMinecraft.class, Toml4jConfigSerializer::new).get();

   public void onInitializeClient() {
      ClientPlayConnectionEvents.JOIN.no mName method<invokedynamic>(ClientPlayConnectionEvents.JOIN, (var0, var1, var2) -> {
         (new rEDlAnceminEcRAFt(var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)))).no mName method<invokedynamic>(new rEDlAnceminEcRAFt(var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)))).no mName method<invokedynamic>((new rEDlAnceminEcRAFt(var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)))).no mName method<invokedynamic>(new rEDlAnceminEcRAFt(var2.no mName method<invokedynamic>(var2).no mName method<invokedynamic>(var2.no mName method<invokedynamic>(var2)))), redLanceMInEcRafT::RedLanCeMINeCRaFt, var2);
      });
   }
}
