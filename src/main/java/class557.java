import java.util.HashMap;
import java.util.Map;

@deob.ObfuscatedName("jb")
public class class557 {
   @deob.ObfuscatedName("jb.d")
   private final class737 field4777 = new class737(20);
   @deob.ObfuscatedName("jb.r")
   private Map field4778 = null;
   @deob.ObfuscatedName("jb.n")
   private final class612 field4776;
   @deob.ObfuscatedName("jb.k")
   private final class612 field4775;
   @deob.ObfuscatedName("jb.b")
   private final int[] field4774;

   public class557(class612 arg0, class612 arg1, int[] arg2) {
      this.field4776 = arg0;
      this.field4775 = arg1;
      if (arg2 != null) {
         this.field4774 = arg2;
      } else {
         this.field4774 = null;
      }

   }

   @deob.ObfuscatedName("jb.n(Ljy;B)V")
   public void method7865(class580 arg0) {
      this.field4778 = new HashMap(this.field4774.length);

      for(int var2 = 0; var2 < this.field4774.length; ++var2) {
         int var3 = this.field4774[var2];
         class883 var4 = class883.method7898(this.field4775, var3);
         byte[] var5 = this.field4776.method8809(var3);
         Object var6 = arg0.method4103(var5, var4, true);
         this.field4778.put(var2, new class862(var6, var4));
      }

   }

   @deob.ObfuscatedName("jb.k(I)V")
   public void method7866() {
      this.field4778 = null;
   }

   @deob.ObfuscatedName("jb.d(B)I")
   public int method7867() {
      return this.method7884(false);
   }

   @deob.ObfuscatedName("jb.b(ZB)I")
   public int method7884(boolean arg0) {
      if (this.field4774 == null) {
         return 0;
      } else if (!arg0 && this.field4778 != null) {
         return this.field4774.length * 2;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < this.field4774.length; ++var3) {
            int var4 = this.field4774[var3];
            if (this.field4776.method8790(var4)) {
               ++var2;
            }

            if (this.field4775.method8790(var4)) {
               ++var2;
            }
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("jb.r(I)I")
   public int method7869() {
      return this.field4774 == null ? 0 : this.field4774.length * 2;
   }

   @deob.ObfuscatedName("jb.p(Ljy;IZZI)Ljava/lang/Object;")
   public Object method7870(class580 arg0, int arg1, boolean arg2, boolean arg3) {
      class862 var5 = this.method7872(arg0, arg1, arg2, arg3);
      return var5 == null ? null : var5.field8800;
   }

   @deob.ObfuscatedName("jb.o(Ljy;IB)Lvd;")
   public class883 method7871(class580 arg0, int arg1) {
      class862 var3 = this.method7872(arg0, arg1, true, true);
      return var3 == null ? null : (class883)var3.field8801;
   }

   @deob.ObfuscatedName("jb.a(Ljy;IZZI)Luj;")
   private class862 method7872(class580 arg0, int arg1, boolean arg2, boolean arg3) {
      if (arg1 == -1) {
         return null;
      } else {
         if (this.field4774 != null) {
            for(int var5 = 0; var5 < this.field4774.length; ++var5) {
               if (this.field4774[var5] == arg1) {
                  return (class862)this.field4778.get(var5);
               }
            }
         }

         class862 var6 = (class862)this.field4777.method10909((long)(arg1 << 1 | (arg3 ? 1 : 0)));
         if (var6 != null) {
            if (arg2 && var6.field8801 == null) {
               class883 var7 = class883.method7898(this.field4775, arg1);
               if (var7 == null) {
                  return null;
               }

               var6.field8801 = var7;
            }

            return var6;
         } else {
            byte[] var8 = this.field4776.method8809(arg1);
            if (var8 == null) {
               return null;
            } else {
               class883 var9 = class883.method7898(this.field4775, arg1);
               if (var9 == null) {
                  return null;
               } else {
                  class862 var10;
                  if (arg2) {
                     var10 = new class862(arg0.method4103(var8, var9, arg3), var9);
                  } else {
                     var10 = new class862(arg0.method4103(var8, var9, arg3), (Object)null);
                  }

                  this.field4777.method10880(var10, (long)(arg1 << 1 | (arg3 ? 1 : 0)));
                  return var10;
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("jb.x(I)V")
   public void method7892() {
      this.field4777.method10883();
   }

   @deob.ObfuscatedName("jb.s(IB)V")
   public void method7874(int arg0) {
      this.field4777.method10882(arg0);
   }

   @deob.ObfuscatedName("jb.l(I)V")
   public void method7882() {
      this.field4777.method10887();
   }
}
