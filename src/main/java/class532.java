@deob.ObfuscatedName("il")
public class class532 {
   @deob.ObfuscatedName("il.d")
   private static class737 field4188 = new class737(64);
   @deob.ObfuscatedName("il.b")
   public int field4189 = -1;
   @deob.ObfuscatedName("il.r")
   public int field4190 = 64;
   @deob.ObfuscatedName("il.p")
   public int field4187 = 64;
   @deob.ObfuscatedName("il.o")
   public int field4194 = 2;
   @deob.ObfuscatedName("il.a")
   public int field4191 = 1;
   @deob.ObfuscatedName("il.x")
   public boolean field4186 = false;
   @deob.ObfuscatedName("il.s")
   public boolean field4195 = false;

   private class532() {
   }

   @deob.ObfuscatedName("qc.n(Llc;B)V")
   public static void method11084(class612 arg0) {
      Statics.field4192 = arg0;
   }

   @deob.ObfuscatedName("le.k(II)Lil;")
   public static class532 method8879(int arg0) {
      class532 var1 = (class532)field4188.method10909((long)arg0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Statics.field4192.method8771(0, arg0);
         class532 var3 = new class532();
         if (var2 != null) {
            var3.method7368(new class124(var2), arg0);
         }

         field4188.method10880(var3, (long)arg0);
         return var3;
      }
   }

   @deob.ObfuscatedName("il.d(Laen;IB)V")
   private void method7368(class124 arg0, int arg1) {
      while(true) {
         int var3 = arg0.method1688();
         if (var3 == 0) {
            return;
         }

         this.method7367(arg0, var3, arg1);
      }
   }

   @deob.ObfuscatedName("il.b(Laen;III)V")
   private void method7367(class124 arg0, int arg1, int arg2) {
      if (arg1 == 1) {
         this.field4189 = arg0.method1587();
         if (this.field4189 == 65535) {
            this.field4189 = -1;
         }
      } else if (arg1 == 2) {
         this.field4190 = arg0.method1587() + 1;
         this.field4187 = arg0.method1587() + 1;
      } else if (arg1 == 3) {
         arg0.method1623();
      } else if (arg1 == 4) {
         this.field4194 = arg0.method1688();
      } else if (arg1 == 5) {
         this.field4191 = arg0.method1688();
      } else if (arg1 == 6) {
         this.field4186 = true;
      } else if (arg1 == 7) {
         this.field4195 = true;
      }

   }
}
