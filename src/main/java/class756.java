import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@deob.ObfuscatedName("ql")
public class class756 {
   @deob.ObfuscatedName("ql.n")
   public boolean field6971 = false;
   @deob.ObfuscatedName("ql.k")
   private boolean field6958 = false;
   @deob.ObfuscatedName("ql.b")
   public int field6960 = 0;
   @deob.ObfuscatedName("ql.o")
   private List field6963 = new LinkedList();
   @deob.ObfuscatedName("ql.a")
   private int field6964 = 0;
   @deob.ObfuscatedName("ql.x")
   public List field6957 = new LinkedList();
   @deob.ObfuscatedName("ql.s")
   private int field6966 = 0;
   @deob.ObfuscatedName("ql.l")
   private boolean field6967 = false;
   @deob.ObfuscatedName("ql.u")
   public boolean field6972 = false;
   @deob.ObfuscatedName("ql.g")
   public class391 field6970 = new class391();
   @deob.ObfuscatedName("ql.d")
   public class289[] field6959 = new class289[8192];
   @deob.ObfuscatedName("ql.h")
   private static boolean[] field6965 = new boolean[32];
   @deob.ObfuscatedName("ql.e")
   private static boolean[] field6961 = new boolean[8];
   @deob.ObfuscatedName("ql.v")
   public int field6968;
   @deob.ObfuscatedName("ql.p")
   private long field6962;
   @deob.ObfuscatedName("ql.r")
   private long field6969;

   private class756(int arg0, boolean arg1) {
      this.method11210(arg0, arg1);
   }

   @deob.ObfuscatedName("ql.n(IZ)Lql;")
   public static class756 method11243(int arg0, boolean arg1) {
      if (class764.field7022 != class764.field7019) {
         class756 var2 = Statics.field7017[class764.field7022];
         class764.field7022 = class764.field7022 + 1 & class390.field2878[class764.field7024];
         var2.method11210(arg0, arg1);
         return var2;
      } else {
         return new class756(arg0, arg1);
      }
   }

   @deob.ObfuscatedName("ql.k(IZ)V")
   private void method11210(int arg0, boolean arg1) {
      Statics.field7018.add(this);
      this.field6962 = (long)arg0;
      this.field6969 = (long)arg0;
      this.field6967 = true;
      this.field6972 = arg1;
   }

   @deob.ObfuscatedName("ql.d()V")
   public void method11211() {
      this.field6967 = true;
   }

   @deob.ObfuscatedName("ql.b()V")
   public void method11212() {
      this.field6971 = true;
      Iterator var1 = this.field6957.iterator();

      while(var1.hasNext()) {
         class105 var2 = (class105)var1.next();
         if (var2.field799.field4240 == 1) {
            var2.method9864();
         }
      }

      for(int var3 = 0; var3 < this.field6959.length; ++var3) {
         if (this.field6959[var3] != null) {
            this.field6959[var3].method3731();
            this.field6959[var3] = null;
         }
      }

      this.field6960 = 0;
      this.field6963 = new LinkedList();
      this.field6964 = 0;
      this.field6957 = new LinkedList();
      this.field6966 = 0;
   }

   @deob.ObfuscatedName("ql.r()V")
   public void method11213() {
      this.field6958 = true;
   }

   @deob.ObfuscatedName("ql.p()V")
   private void method11214() {
      this.field6958 = false;
   }

   @deob.ObfuscatedName("ql.o(Lra;J)Z")
   public boolean method11215(class772 arg0, long arg1) {
      if (this.field6969 != this.field6962) {
         this.method11213();
      } else {
         this.method11214();
      }

      if (arg1 - this.field6962 > 750L) {
         this.method11212();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field6969);
         if (this.field6967) {
            Iterator var5 = this.field6963.iterator();

            while(var5.hasNext()) {
               class746 var6 = (class746)var5.next();

               for(int var7 = 0; var7 < var6.field6862.field4292; ++var7) {
                  var6.method11044(arg0, arg1, 1, !this.field6958);
               }
            }

            this.field6967 = false;
         }

         Iterator var8 = this.field6963.iterator();

         while(var8.hasNext()) {
            class746 var9 = (class746)var8.next();
            var9.method11044(arg0, arg1, var4, !this.field6958);
         }

         this.field6969 = arg1;
         return true;
      }
   }

   @deob.ObfuscatedName("ql.a(J)V")
   public void method11217(long arg0) {
      this.field6962 = arg0;
   }

   @deob.ObfuscatedName("ql.x(Lra;J[Ldw;[Lcl;Z)V")
   public void method11235(class772 arg0, long arg1, class408[] arg2, class370[] arg3, boolean arg4) {
      if (!this.field6971) {
         this.method11218(arg0, arg2, arg4);
         this.method11219(arg3, arg4);
         this.field6962 = arg1;
      }
   }

   @deob.ObfuscatedName("ql.s(Lra;[Ldw;Z)V")
   private void method11218(class772 arg0, class408[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field6965[var4] = false;
      }

      Iterator var5 = this.field6963.iterator();

      while(true) {
         label62:
         while(var5.hasNext()) {
            class746 var6 = (class746)var5.next();
            if (arg1 != null) {
               for(int var7 = 0; var7 < arg1.length; ++var7) {
                  if (arg1[var7] == var6.field6872 || arg1[var7].field3072 == var6.field6872) {
                     field6965[var7] = true;
                     var6.method11038();
                     var6.field6868 = false;
                     continue label62;
                  }
               }
            }

            if (!arg2) {
               if (var6.field6866 == 0) {
                  var5.remove();
                  --this.field6964;
               } else {
                  var6.field6868 = true;
               }
            }
         }

         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length && var8 != 32 && this.field6964 != 32; ++var8) {
               if (!field6965[var8]) {
                  class746 var9 = new class746(arg0, arg1[var8], this, this.field6962);
                  this.field6963.add(var9);
                  ++this.field6964;
                  field6965[var8] = true;
               }
            }
         }

         return;
      }
   }

   @deob.ObfuscatedName("ql.l([Lcl;Z)V")
   private void method11219(class370[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field6961[var3] = false;
      }

      Iterator var4 = this.field6957.iterator();

      while(true) {
         label71:
         while(var4.hasNext()) {
            class105 var5 = (class105)var4.next();
            if (arg0 != null) {
               for(int var6 = 0; var6 < arg0.length; ++var6) {
                  if (arg0[var6] == var5.field802 || arg0[var6].field2387 == var5.field802) {
                     field6961[var6] = true;
                     var5.method1388();
                     continue label71;
                  }
               }
            }

            if (!arg1) {
               var5.method9864();
               --this.field6966;
               if (var5.method9863()) {
                  var5.method9864();
                  --class764.field7023;
               }
            }
         }

         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length && var7 != 8 && this.field6966 != 8; ++var7) {
               if (!field6961[var7]) {
                  class105 var8 = null;
                  if (arg0[var7].method4541().field4240 == 1 && class764.field7023 < 32) {
                     var8 = new class105(arg0[var7], this);
                     class764.field7020.method15311(var8, (long)arg0[var7].field2382);
                     ++class764.field7023;
                  }

                  if (var8 == null) {
                     var8 = new class105(arg0[var7], this);
                  }

                  this.field6957.add(var8);
                  ++this.field6966;
                  field6961[var7] = true;
               }
            }
         }

         return;
      }
   }

   @deob.ObfuscatedName("ql.u()Ldf;")
   public class391 method11220() {
      this.field6970.field2886.method14822();

      for(int var1 = 0; var1 < this.field6959.length; ++var1) {
         if (this.field6959[var1] != null && this.field6959[var1].field1865 != null) {
            this.field6970.field2886.method14831(this.field6959[var1]);
         }
      }

      return this.field6970;
   }

   @deob.ObfuscatedName("ql.v(IIIII)V")
   public void method11221(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field6968 = arg0;
   }

   @deob.ObfuscatedName("ql.g(Low;Lra;)V")
   public void method11216(class713 arg0, class772 arg1) {
      this.field6970.field2886.method14822();
      Iterator var3 = this.field6963.iterator();

      while(var3.hasNext()) {
         class746 var4 = (class746)var3.next();
         var4.method11040(arg0, arg1, this.field6969);
      }

   }

   @deob.ObfuscatedName("ql.h()Ldf;")
   public class391 method11223() {
      return this.field6970;
   }
}
