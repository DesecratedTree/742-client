@deob.ObfuscatedName("qg")
public class class751 {
   @deob.ObfuscatedName("qg.n")
   public static int field6919 = 16777215;
   @deob.ObfuscatedName("qg.k")
   public static int field6922 = 13156520;
   @deob.ObfuscatedName("qg.v")
   private static int field6915 = 5124;
   @deob.ObfuscatedName("qg.e")
   private int field6927 = 0;
   @deob.ObfuscatedName("qg.z")
   private int field6928 = -1;
   @deob.ObfuscatedName("qg.m")
   private long field6929 = 0L;
   @deob.ObfuscatedName("qg.i")
   private boolean field6930 = false;
   @deob.ObfuscatedName("qg.y")
   private final class584 field6935 = new class584(-50.0F, -60.0F, -50.0F);
   @deob.ObfuscatedName("qg.j")
   private final class737 field6936 = new class737(8);
   @deob.ObfuscatedName("qg.f")
   private final class737 field6937 = new class737(9);
   @deob.ObfuscatedName("qg.g")
   private final class772 field6925;
   @deob.ObfuscatedName("qg.h")
   private final class769[][] field6926;
   @deob.ObfuscatedName("qg.t")
   private final class769 field6931;
   @deob.ObfuscatedName("qg.c")
   private final class769 field6923;
   @deob.ObfuscatedName("qg.w")
   private final class769 field6933;
   @deob.ObfuscatedName("qg.q")
   private final class769 field6934;

   public class751(class772 arg0, int arg1, int arg2) {
      this.field6925 = arg0;
      this.field6926 = new class769[arg1][arg2];
      if (Statics.field1211 != null) {
         Statics.field4166 = this.method11146(Statics.field1211[0], Statics.field1211[1], Statics.field1211[2], Statics.field1211[3], Statics.field1211[4], Statics.field1211[5]);
      }

      Statics.field7146 = null;
      this.field6931 = new class769();
      this.field6923 = new class769();
      this.field6933 = new class769();
      this.field6934 = new class769();
      this.method11128();
   }

   @deob.ObfuscatedName("qg.n(Lmv;I)V")
   public void method11137(class658 arg0) {
      if (!client.method15888(client.field2410) && !client.method7373(client.field2410)) {
         int var2 = -1;
         int var3 = -1;
         if (Statics.field5701 != null) {
            var2 = Statics.field5701.field16[0] >> 3;
            var3 = Statics.field5701.field62[0] >> 3;
         }

         if (var2 >= 0 && var2 < arg0.method9648() >> 3 && var3 >= 0 && var3 < arg0.method9604() >> 3) {
            this.method11126(var2, var3, field6915);
         } else {
            this.method11126(arg0.method9648() >> 4, arg0.method9604() >> 4, 0);
         }
      } else {
         this.method11126(Statics.field337 >> 12, Statics.field3115 >> 12, field6915);
      }

      this.method11127();
      this.method11133();
      this.method11131();
      this.method11122();
   }

   @deob.ObfuscatedName("qg.k(I)Lqy;")
   public class769 method11124() {
      return this.field6923;
   }

   @deob.ObfuscatedName("qg.d(Lqg;B)V")
   public void method11145(class751 arg0) {
      this.field6923.method11432(arg0.field6923);
      this.field6933.method11432(arg0.field6933);
      this.field6934.method11432(arg0.field6934);
      this.field6929 = arg0.field6929;
      this.field6927 = arg0.field6927;
      this.field6928 = arg0.field6928;
   }

   @deob.ObfuscatedName("qg.b(I)V")
   public void method11155() {
      this.field6936.method10883();
      this.field6937.method10883();
   }

   @deob.ObfuscatedName("qg.r(IIIIIII)Ldo;")
   public class400 method11146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      long var7 = (long)arg0 * 67481L ^ (long)arg1 * 97549L ^ (long)arg2 * 475427L ^ (long)arg3 * 986053L ^ (long)arg4 * 32147369L ^ (long)arg5 * 76724863L;
      class400 var9 = (class400)this.field6936.method10909(var7);
      if (var9 != null) {
         return var9;
      } else {
         class400 var10 = this.field6925.method7553(arg0, arg1, arg2, arg3, arg4, arg5);
         this.field6936.method10880(var10, var7);
         return var10;
      }
   }

   @deob.ObfuscatedName("qg.p(IIIIB)Lmt;")
   public class656 method11148(int arg0, int arg1, int arg2, int arg3) {
      long var5 = ((long)arg1 & 65535L) << 48 | ((long)arg2 & 65535L) << 32 | ((long)arg3 & 65535L) << 16 | (long)arg0 & 65535L;
      class656 var7 = (class656)this.field6937.method10909(var5);
      if (var7 == null) {
         var7 = Statics.field7125.method10375(arg0, arg1, arg2, arg3, Statics.field6768);
         this.field6937.method10880(var7, var5);
      }

      return var7;
   }

   @deob.ObfuscatedName("qg.o(IILqy;I)V")
   public void method11121(int arg0, int arg1, class769 arg2) {
      this.field6926[arg0][arg1] = arg2;
   }

   @deob.ObfuscatedName("qg.a(I)V")
   public void method11160() {
      for(int var1 = 0; var1 < this.field6926.length; ++var1) {
         for(int var2 = 0; var2 < this.field6926[var1].length; ++var2) {
            this.field6926[var1][var2] = this.field6931;
         }
      }

   }

   @deob.ObfuscatedName("qg.x(III)V")
   public void method11125(int arg0, int arg1) {
      class769 var3 = this.field6926[arg0][arg1];
      if (var3 != null) {
         this.field6935.method8177(var3.field7057);
      }

      this.method11133();
   }

   @deob.ObfuscatedName("qg.s(IIII)V")
   private void method11126(int arg0, int arg1, int arg2) {
      class769 var4 = this.field6926[arg0][arg1];
      if (var4 == null) {
         var4 = this.field6931;
      }

      if (this.field6930) {
         this.field6930 = false;
         arg2 = 0;
      }

      if (!this.field6934.method11437(var4)) {
         this.field6934.method11432(var4);
         this.field6929 = class431.method2169();
         this.field6927 = this.field6928 = arg2;
         if (this.field6927 != 0) {
            this.field6933.method11432(this.field6923);
            if (this.field6923.field7059 != null) {
               if (this.field6923.field7059.method9467()) {
                  this.field6923.field7059 = this.field6933.field7059 = this.field6923.field7059.method9468();
               }

               if (this.field6923.field7059 != null && this.field6934.field7059 != this.field6923.field7059) {
                  this.field6923.field7059.method9484(this.field6934.field7059);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("qg.l(I)V")
   private void method11127() {
      if (this.field6928 >= 0) {
         long var1 = class431.method2169();
         this.field6928 = (int)((long)(this.field6928 * 896811385) - (var1 - this.field6929) * 896811385L) * 1815042249;
         if (this.field6928 > 0) {
            this.field6923.method11434(this.field6925, this.field6933, this.field6934, (float)(this.field6927 - this.field6928) / (float)this.field6927);
         } else {
            this.field6923.method11432(this.field6934);
            if (this.field6923.field7059 != null) {
               this.field6923.field7059.method9485();
            }

            this.field6928 = -1;
         }

         this.field6929 = var1;
      }

   }

   @deob.ObfuscatedName("qg.u(I)V")
   public void method11128() {
      this.field6930 = true;
   }

   @deob.ObfuscatedName("qg.v(I)V")
   private void method11133() {
      this.field6925.method7547((0.7F + (float)Statics.field9361.field955.method1996() * 0.1F + client.field2468.method9609()) * this.field6923.field7067);
      this.field6925.method7588(this.field6923.field7063, this.field6923.field7058, this.field6923.field7060, (float)((int)this.field6935.field5328 << 2), (float)((int)this.field6935.field5330 << 2), (float)((int)this.field6935.field5331 << 2));
      this.field6925.method7560(this.field6923.field7068);
   }

   @deob.ObfuscatedName("qg.g(S)V")
   public void method11122() {
      byte var1 = 0;
      int var2 = (this.field6923.field7064 + 256 << 2) + var1;
      this.field6925.method7550(this.field6923.field7062, Statics.field9361.field986.method2119() == 1 ? var2 : -1, 0);
   }

   @deob.ObfuscatedName("qg.h(I)V")
   private void method11131() {
      this.field6925.method11516(this.field6923.field7061, this.field6923.field7065, this.field6923.field7066);
   }

   @deob.ObfuscatedName("qg.e(I)V")
   public void method11132() {
      this.field6925.method7547((0.7F + (float)Statics.field9361.field955.method1996() * 0.1F + client.field2468.method9609()) * 1.1523438F);
      this.field6925.method7588(field6919, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
      this.field6925.method7550(field6922, -1, 0);
      this.field6925.method7560(Statics.field4166);
   }
}
