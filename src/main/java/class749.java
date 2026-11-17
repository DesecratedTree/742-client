import java.util.Queue;

@deob.ObfuscatedName("qe")
public final class class749 implements class791 {
   @deob.ObfuscatedName("qe.n(ZI)V")
   public void method11089(boolean arg0) {
   }

   @deob.ObfuscatedName("qe.k(IIII)V")
   public void method11091(int arg0, int arg1, int arg2) {
      int var4 = arg0 >> 16;
      int var5 = arg0 & 65535;
      Queue var6 = class762.field7004;
      synchronized(class762.field7004) {
         class762.field7004.add(class254.method15509(var4, var5, arg1, arg2));
      }
   }
}
