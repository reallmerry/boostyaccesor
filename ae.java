import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;

public class rEDLanCE0INecRAft {
   private rEDLanCE0INecRAft() {
   }

   public static CallSite rEDLanCE0INecRAft(Lookup var0, String var1, MethodType var2, int var3, Class var4, Class var5, String var6) throws IllegalAccessException, NoSuchFieldException {
      try {
         MethodHandle var7 = null;
         var7 = rEDLanCE0INecRAft$$1(var0, var3, var4, var5, var6);
         if (!var7.type().equals(var2)) {
            var7 = rEDLanCE0INecRAft$$1(MethodHandles.publicLookup(), var3, var4, var5, var6);
         }

         return new ConstantCallSite(var7);
      } catch (Throwable var8) {
         throw new RuntimeException("callType: " + var3 + ", owner: " + var4 + ", name: " + var6 + ", findType: " + var5, var8);
      }
   }

   public static MethodHandle rEDLanCE0INecRAft$$1(Lookup var0, int var1, Class var2, Class var3, String var4) throws IllegalAccessException, NoSuchFieldException {
      switch(var1) {
      case 0:
         return var0.findStaticGetter(var2, var4, var3);
      case 1:
         return var0.findStaticSetter(var2, var4, var3);
      case 2:
         return var0.findGetter(var2, var4, var3);
      case 3:
         return var0.findSetter(var2, var4, var3);
      default:
         throw new IllegalArgumentException("arg1");
      }
   }

   public static CallSite rEDLanCE0INecRAft(Lookup var0, String var1, MethodType var2, int var3, Class var4, MethodType var5, String var6) throws IllegalAccessException, NoSuchMethodException {
      try {
         MethodHandle var7 = null;
         var7 = rEDLanCE0INecRAft$$1(var0, var3, var4, var5, var6);
         if (!var7.type().equals(var2)) {
            var7 = rEDLanCE0INecRAft$$1(MethodHandles.publicLookup(), var3, var4, var5, var6);
         }

         return new ConstantCallSite(var7);
      } catch (Throwable var8) {
         throw new RuntimeException("callType: " + var3 + ", owner: " + var4 + ", name: " + var6 + ", findType: " + var5, var8);
      }
   }

   public static MethodHandle rEDLanCE0INecRAft$$1(Lookup var0, int var1, Class var2, MethodType var3, String var4) throws IllegalAccessException, NoSuchMethodException {
      switch(var1) {
      case 0:
         return var0.findVirtual(var2, var4, var3);
      case 1:
         return var0.findStatic(var2, var4, var3);
      case 2:
         return var0.findSpecial(var2, var4, var3, var0.lookupClass());
      case 3:
         return var0.findConstructor(var2, var3);
      default:
         throw new IllegalArgumentException("arg1");
      }
   }
}
