import java.util.List;
import java.util.Set;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class ReDlaNCEminECRaFT implements IMixinConfigPlugin {
   private boolean RedLanCeMINeCRaFt = false;

   public void onLoad(String var1) {
      no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>(), "minecraft").no mName method<invokedynamic>(no mName method<invokedynamic>().no mName method<invokedynamic>(no mName method<invokedynamic>(), "minecraft"), (var1x) -> {
         String var10001 = var1x.no mName method<invokedynamic>(var1x).no mName method<invokedynamic>(var1x.no mName method<invokedynamic>(var1x)).no mName method<invokedynamic>(var1x.no mName method<invokedynamic>(var1x).no mName method<invokedynamic>(var1x.no mName method<invokedynamic>(var1x)));
         this.RedLanCeMINeCRaFt = var10001.no mName method<invokedynamic>(var10001, "1.20.1");
      });
   }

   public String getRefMapperConfig() {
      return null;
   }

   public boolean shouldApplyMixin(String var1, String var2) {
      return this.RedLanCeMINeCRaFt;
   }

   public void acceptTargets(Set var1, Set var2) {
   }

   public List getMixins() {
      return null;
   }

   public void preApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   public void postApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }
}
