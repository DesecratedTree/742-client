@deob.ObfuscatedName("kp")
public class class598 implements Runnable {
   @deob.ObfuscatedName("kp.d")
   private class592 field5417 = new class591();
   @deob.ObfuscatedName("kp.b")
   private class592 field5418 = null;
   @deob.ObfuscatedName("kp.p")
   private int field5420;
   @deob.ObfuscatedName("kp.x")
   private int field5423;
   @deob.ObfuscatedName("kp.r")
   private long field5415;
   @deob.ObfuscatedName("kp.o")
   private long field5421;
   @deob.ObfuscatedName("kp.s")
   private class588 field5419;
   @deob.ObfuscatedName("kp.a")
   private String field5422;
   @deob.ObfuscatedName("kp.k")
   private boolean field5416;
   @deob.ObfuscatedName("kp.n")
   private volatile boolean field5424;

   @deob.ObfuscatedName("kp.n(B)I")
   public int method8508() {
      return this.field5420;
   }

   @deob.ObfuscatedName("kp.k(I)V")
   public synchronized void method8487() {
      this.field5416 = true;
   }

   @deob.ObfuscatedName("kp.d(I)Z")
   public synchronized boolean method8485() {
      return this.field5417.method8237(this.field5415);
   }

   @deob.ObfuscatedName("kp.b(Lkj;I)V")
   public synchronized void method8497(class592 arg0) {
      this.field5418 = this.field5417;
      this.field5417 = arg0;
      this.field5415 = class431.method2169();
   }

   @deob.ObfuscatedName("kp.r(JLjava/lang/String;ILkf;B)V")
   public synchronized void method8490(long arg0, String arg1, int arg2, class588 arg3) {
      this.field5421 = arg0;
      this.field5422 = arg1;
      this.field5423 = arg2;
      this.field5419 = arg3;
   }

   @deob.ObfuscatedName("kp.p(B)I")
   public int method8491() {
      if (this.field5419 == null) {
         return 0;
      } else {
         int var1 = this.field5419.field5362;
         if (this.field5419.field5357 && this.field5423 < this.field5419.field5368) {
            return this.field5423 + 1;
         } else if (var1 >= 0 && var1 < Statics.field8739.length - 1) {
            return this.field5419.field5365 == this.field5423 ? this.field5419.field5368 : this.field5419.field5365;
         } else {
            return 100;
         }
      }
   }

   @deob.ObfuscatedName("kp.o(I)I")
   public int method8492() {
      return this.field5423;
   }

   @deob.ObfuscatedName("kp.a(B)Ljava/lang/String;")
   public String method8493() {
      return this.field5422;
   }

   @deob.ObfuscatedName("kp.x(B)J")
   public long method8486() {
      return this.field5421;
   }

   @deob.ObfuscatedName("kp.s(B)Lkf;")
   public class588 method8488() {
      return this.field5419;
   }

   @deob.ObfuscatedName("kp.l(B)V")
   public void method8496() {
      this.field5424 = true;
   }

   public void run() {
      while(!this.field5424) {
         long var1 = class431.method2169();
         synchronized(this) {
            try {
               ++this.field5420;
               if (this.field5417 instanceof class591) {
                  this.field5417.method8234(this.field5416);
               } else {
                  long var4 = class431.method2169();
                  if (Statics.field8847 != null && this.field5418 != null && this.field5418.method8259() != 0 && this.field5415 >= var4 - (long)this.field5418.method8259()) {
                     int var6 = (int)((var4 - this.field5415) * 255L / (long)this.field5418.method8259());
                     int var7 = 255 - var6;
                     int var8 = var6 << 24 | 16777215;
                     int var9 = var7 << 24 | 16777215;
                     client.method3954();
                     Statics.field8847.method2522(1, 0);
                     class383 var10 = Statics.field8847.method11511(Statics.field6104, Statics.field6354, true);
                     class973 var11 = Statics.field8847.method2513();
                     var11.method2351(0, var10.method2391());
                     Statics.field8847.method11502(var11);
                     this.field5418.method8234(true);
                     Statics.field8847.method11503(var11);
                     var10.method2388(0, 0, 0, var9, 1);
                     Statics.field8847.method11502(var11);
                     Statics.field8847.method2522(1, 0);
                     this.field5417.method8234(true);
                     Statics.field8847.method11503(var11);
                     var10.method2388(0, 0, 0, var8, 1);
                  } else {
                     if (this.field5418 != null) {
                        this.field5416 = true;
                        this.field5418.method8236();
                        this.field5418 = null;
                     }

                     if (this.field5416) {
                        client.method3954();
                        if (Statics.field8847 != null) {
                           Statics.field8847.method2522(1, 0);
                        }
                     }

                     this.field5417.method8234(this.field5416 || Statics.field8847 != null && Statics.field8847.method7490());
                  }

                  try {
                     if (Statics.field8847 != null && !(this.field5417 instanceof class591)) {
                        Statics.field8847.method11522();
                     }
                  } catch (class165 var18) {
                     class285.method15864(var18.getMessage() + Statics.field561.method4556(), var18);
                     client.method5788(0, true);
                  }
               }

               this.field5416 = false;
               if (Statics.field8847 != null && !(this.field5417 instanceof class591) && this.field5419.field5362 < class588.field5360.field5362) {
                  client.method8285();
               }
            } catch (Exception var19) {
               continue;
            }
         }

         long var15 = class431.method2169();
         int var17 = (int)(20L - (var15 - var1));
         if (var17 > 0) {
            Statics.method14813((long)var17);
         }
      }

   }
}
