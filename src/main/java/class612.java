@deob.ObfuscatedName("lc")
public final class class612 {
   @deob.ObfuscatedName("lc.n")
   private class616 field5533 = null;
   @deob.ObfuscatedName("lc.s")
   private class632 field5530;
   @deob.ObfuscatedName("lc.r")
   private boolean field5525;
   @deob.ObfuscatedName("lc.x")
   private int field5529;
   @deob.ObfuscatedName("lc.b")
   private static class951 field5521 = new class951();
   @deob.ObfuscatedName("lc.l")
   private static boolean field5523 = false;
   @deob.ObfuscatedName("lc.u")
   private static int field5532 = 0;
   @deob.ObfuscatedName("lc.k")
   private Object[] field5522;
   @deob.ObfuscatedName("lc.d")
   private Object[][] field5531;

   public class612(class632 arg0, boolean arg1, int arg2) {
      if (arg2 >= 0 && arg2 <= 2) {
         this.field5530 = arg0;
         this.field5525 = arg1;
         this.field5529 = arg2;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @deob.ObfuscatedName("lc.n(I)Z")
   private synchronized boolean method8765() {
      if (this.field5533 == null) {
         this.field5533 = this.field5530.method659();
         if (this.field5533 == null) {
            return false;
         }

         this.field5522 = new Object[this.field5533.field5554];
         this.field5531 = new Object[this.field5533.field5554][];
      }

      return true;
   }

   @deob.ObfuscatedName("lc.k(B)I")
   public int method8766() {
      if (!this.method8765()) {
         throw new IllegalStateException("");
      } else {
         return this.field5533.field5547;
      }
   }

   @deob.ObfuscatedName("lc.d(IB)Z")
   private synchronized boolean method8767(int arg0) {
      if (!this.method8765()) {
         return false;
      } else if (arg0 >= 0 && arg0 < this.field5533.field5551.length && this.field5533.field5551[arg0] != 0) {
         return true;
      } else if (field5523) {
         throw new IllegalArgumentException(Integer.toString(arg0));
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("lc.b(III)Z")
   private synchronized boolean method8768(int arg0, int arg1) {
      if (!this.method8765()) {
         return false;
      } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field5533.field5551.length && arg1 < this.field5533.field5551[arg0]) {
         return true;
      } else if (field5523) {
         throw new IllegalArgumentException(arg0 + " " + arg1);
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("lc.r(II)V")
   private synchronized void method8769(int arg0) {
      if (this.field5525) {
         this.field5522[arg0] = this.field5530.method621(arg0);
      } else {
         this.field5522[arg0] = class830.method7357(this.field5530.method621(arg0), false);
      }

   }

   @deob.ObfuscatedName("lc.p(IB)V")
   private void method8770(int arg0) {
      this.field5530.method629(arg0);
   }

   @deob.ObfuscatedName("lc.o(III)[B")
   public byte[] method8771(int arg0, int arg1) {
      return this.method8781(arg0, arg1, (int[])null);
   }

   @deob.ObfuscatedName("lc.a(II[II)[B")
   public synchronized byte[] method8781(int arg0, int arg1, int[] arg2) {
      if (!this.method8768(arg0, arg1)) {
         return null;
      } else {
         byte[] var4 = null;
         if (this.field5531[arg0] == null || this.field5531[arg0][arg1] == null) {
            boolean var5 = this.method8785(arg0, arg1, arg2);
            if (!var5) {
               this.method8769(arg0);
               boolean var6 = this.method8785(arg0, arg1, arg2);
               if (!var6) {
                  return null;
               }
            }
         }

         if (this.field5531[arg0] == null) {
            throw new RuntimeException("");
         } else {
            if (this.field5531[arg0][arg1] != null) {
               var4 = class830.method14661(this.field5531[arg0][arg1], false);
               if (var4 == null) {
                  throw new RuntimeException("");
               }
            }

            if (var4 != null) {
               if (this.field5529 == 1) {
                  this.field5531[arg0][arg1] = null;
                  if (this.field5533.field5551[arg0] == 1) {
                     this.field5531[arg0] = null;
                  }
               } else if (this.field5529 == 2) {
                  this.field5531[arg0] = null;
               }
            }

            return var4;
         }
      }
   }

   @deob.ObfuscatedName("lc.x(IIB)Z")
   public synchronized boolean method8773(int arg0, int arg1) {
      if (!this.method8768(arg0, arg1)) {
         return false;
      } else if (this.field5531[arg0] != null && this.field5531[arg0][arg1] != null) {
         return true;
      } else if (this.field5522[arg0] != null) {
         return true;
      } else {
         this.method8769(arg0);
         return this.field5522[arg0] != null;
      }
   }

   @deob.ObfuscatedName("lc.s(II)Z")
   public synchronized boolean method8790(int arg0) {
      if (!this.method8765()) {
         return false;
      } else if (this.field5533.field5551.length == 1) {
         return this.method8773(0, arg0);
      } else if (!this.method8767(arg0)) {
         return false;
      } else if (this.field5533.field5551[arg0] == 1) {
         return this.method8773(arg0, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("lc.l(II)Z")
   public synchronized boolean method8774(int arg0) {
      if (!this.method8767(arg0)) {
         return false;
      } else if (this.field5522[arg0] != null) {
         return true;
      } else {
         this.method8769(arg0);
         return this.field5522[arg0] != null;
      }
   }

   @deob.ObfuscatedName("lc.u(B)Z")
   public synchronized boolean method8776() {
      if (!this.method8765()) {
         return false;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field5533.field5562.length; ++var2) {
            int var3 = this.field5533.field5562[var2];
            if (this.field5522[var3] == null) {
               this.method8769(var3);
               if (this.field5522[var3] == null) {
                  var1 = false;
               }
            }
         }

         return var1;
      }
   }

   @deob.ObfuscatedName("lc.v(IB)I")
   private synchronized int method8815(int arg0) {
      if (!this.method8767(arg0)) {
         return 0;
      } else {
         return this.field5522[arg0] != null ? 100 : this.field5530.method630(arg0);
      }
   }

   @deob.ObfuscatedName("lc.g(B)I")
   public synchronized int method8778() {
      if (!this.method8765()) {
         return 0;
      } else {
         int var1 = 0;
         int var2 = 0;

         for(int var3 = 0; var3 < this.field5522.length; ++var3) {
            if (this.field5533.field5556[var3] > 0) {
               var1 += 100;
               var2 += this.method8815(var3);
            }
         }

         if (var1 == 0) {
            return 100;
         } else {
            return var2 * 100 / var1;
         }
      }
   }

   @deob.ObfuscatedName("lc.h(IB)[B")
   public synchronized byte[] method8809(int arg0) {
      if (!this.method8765()) {
         return null;
      } else if (this.field5533.field5551.length == 1) {
         return this.method8771(0, arg0);
      } else if (!this.method8767(arg0)) {
         return null;
      } else if (this.field5533.field5551[arg0] == 1) {
         return this.method8771(arg0, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("lc.e(IB)[I")
   public synchronized int[] method8780(int arg0) {
      if (!this.method8767(arg0)) {
         return null;
      } else {
         int[] var2 = this.field5533.field5559[arg0];
         if (var2 == null) {
            var2 = new int[this.field5533.field5556[arg0]];
            int var3 = 0;

            while(var3 < var2.length) {
               var2[var3] = var3++;
            }
         }

         return var2;
      }
   }

   @deob.ObfuscatedName("lc.z(II)I")
   public int method8792(int arg0) {
      return !this.method8767(arg0) ? 0 : this.field5533.field5551[arg0];
   }

   @deob.ObfuscatedName("lc.m(I)I")
   public int method8782() {
      return !this.method8765() ? -1 : this.field5533.field5551.length;
   }

   @deob.ObfuscatedName("lc.i(II)V")
   public synchronized void method8783(int arg0) {
      if (this.method8767(arg0)) {
         if (this.field5531 != null) {
            this.field5531[arg0] = null;
         }

      }
   }

   @deob.ObfuscatedName("lc.t(ZZI)V")
   public void method8856(boolean arg0, boolean arg1) {
      if (this.method8765()) {
         if (arg0) {
            this.field5533.field5552 = null;
            this.field5533.field5553 = null;
         }

         if (arg1) {
            this.field5533.field5560 = (int[][])null;
            this.field5533.field5561 = null;
         }

      }
   }

   @deob.ObfuscatedName("lc.c(II[IB)Z")
   private synchronized boolean method8785(int arg0, int arg1, int[] arg2) {
      if (!this.method8767(arg0)) {
         return false;
      } else if (this.field5522[arg0] == null) {
         return false;
      } else {
         int var4 = this.field5533.field5556[arg0];
         int[] var5 = this.field5533.field5559[arg0];
         if (this.field5531[arg0] == null) {
            this.field5531[arg0] = new Object[this.field5533.field5551[arg0]];
         }

         Object[] var6 = this.field5531[arg0];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            int var9;
            if (var5 == null) {
               var9 = var8;
            } else {
               var9 = var5[var8];
            }

            if (var6[var9] == null) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var10;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
               var10 = class830.method14661(this.field5522[arg0], false);
            } else {
               var10 = class830.method14661(this.field5522[arg0], true);
               class124 var11 = new class124(var10);
               var11.method1612(arg2, 5, var11.field931.length);
            }

            byte[] var12;
            try {
               var12 = method8525(var10);
            } catch (RuntimeException var48) {
               throw class285.method15290(var48, (arg2 != null) + " " + arg0 + " " + var10.length + " " + class124.method15424(var10, var10.length) + " " + class124.method15424(var10, var10.length - 2) + " " + this.field5533.field5555[arg0] + " " + this.field5533.field5547);
            }

            if (this.field5525) {
               this.field5522[arg0] = null;
            }

            if (var4 > 1) {
               if (this.field5529 != 2) {
                  int var14 = var12.length;
                  int var49 = var14 - 1;
                  int var15 = var12[var49] & 255;
                  int var16 = var49 - var4 * var15 * 4;
                  class124 var17 = new class124(var12);
                  int[] var18 = new int[var4];
                  var17.field935 = var16;

                  for(int var19 = 0; var19 < var15; ++var19) {
                     int var20 = 0;

                     for(int var21 = 0; var21 < var4; ++var21) {
                        var20 += var17.method1591();
                        var18[var21] += var20;
                     }
                  }

                  byte[][] var22 = new byte[var4][];

                  for(int var23 = 0; var23 < var4; ++var23) {
                     var22[var23] = new byte[var18[var23]];
                     var18[var23] = 0;
                  }

                  var17.field935 = var16;
                  int var24 = 0;

                  for(int var25 = 0; var25 < var15; ++var25) {
                     int var26 = 0;

                     for(int var27 = 0; var27 < var4; ++var27) {
                        var26 += var17.method1591();
                        System.arraycopy(var12, var24, var22[var27], var18[var27], var26);
                        var18[var27] += var26;
                        var24 += var26;
                     }
                  }

                  for(int var28 = 0; var28 < var4; ++var28) {
                     int var29;
                     if (var5 == null) {
                        var29 = var28;
                     } else {
                        var29 = var5[var28];
                     }

                     if (this.field5529 == 0) {
                        var6[var29] = class830.method7357(var22[var28], false);
                     } else {
                        var6[var29] = var22[var28];
                     }
                  }
               } else {
                  int var30 = var12.length;
                  int var50 = var30 - 1;
                  int var31 = var12[var50] & 255;
                  int var32 = var50 - var4 * var31 * 4;
                  class124 var33 = new class124(var12);
                  int var34 = 0;
                  int var35 = 0;
                  var33.field935 = var32;

                  for(int var36 = 0; var36 < var31; ++var36) {
                     int var37 = 0;

                     for(int var38 = 0; var38 < var4; ++var38) {
                        var37 += var33.method1591();
                        int var39;
                        if (var5 == null) {
                           var39 = var38;
                        } else {
                           var39 = var5[var38];
                        }

                        if (arg1 == var39) {
                           var34 += var37;
                           var35 = var39;
                        }
                     }
                  }

                  if (var34 == 0) {
                     return true;
                  }

                  byte[] var40 = new byte[var34];
                  int var41 = 0;
                  var33.field935 = var32;
                  int var42 = 0;

                  for(int var43 = 0; var43 < var31; ++var43) {
                     int var44 = 0;

                     for(int var45 = 0; var45 < var4; ++var45) {
                        var44 += var33.method1591();
                        int var46;
                        if (var5 == null) {
                           var46 = var45;
                        } else {
                           var46 = var5[var45];
                        }

                        if (arg1 == var46) {
                           System.arraycopy(var12, var42, var40, var41, var44);
                           var41 += var44;
                        }

                        var42 += var44;
                     }
                  }

                  var6[var35] = var40;
               }
            } else {
               int var47;
               if (var5 == null) {
                  var47 = 0;
               } else {
                  var47 = var5[0];
               }

               if (this.field5529 == 0) {
                  var6[var47] = class830.method7357(var12, false);
               } else {
                  var6[var47] = var12;
               }
            }

            return true;
         }
      }
   }

   @deob.ObfuscatedName("lc.w(Ljava/lang/String;I)I")
   public int method8786(String arg0) {
      if (!this.method8765()) {
         return -1;
      } else {
         String var2 = arg0.toLowerCase();
         int var3 = this.field5533.field5553.method6548(class816.method15213(var2));
         return !this.method8767(var3) ? -1 : var3;
      }
   }

   @deob.ObfuscatedName("lc.q(IB)I")
   public int method8787(int arg0) {
      if (!this.method8765()) {
         return -1;
      } else {
         int var2 = this.field5533.field5553.method6548(arg0);
         return !this.method8767(var2) ? -1 : var2;
      }
   }

   @deob.ObfuscatedName("lc.y(Ljava/lang/String;B)Z")
   public boolean method8788(String arg0) {
      if (!this.method8765()) {
         return false;
      } else {
         String var2 = arg0.toLowerCase();
         int var3 = this.field5533.field5553.method6548(class816.method15213(var2));
         return var3 >= 0;
      }
   }

   @deob.ObfuscatedName("lc.j(Ljava/lang/String;Ljava/lang/String;I)Z")
   public boolean method8866(String arg0, String arg1) {
      if (!this.method8765()) {
         return false;
      } else {
         String var3 = arg0.toLowerCase();
         String var4 = arg1.toLowerCase();
         int var5 = this.field5533.field5553.method6548(class816.method15213(var3));
         if (var5 < 0) {
            return false;
         } else {
            int var6 = this.field5533.field5561[var5].method6548(class816.method15213(var4));
            return var6 >= 0;
         }
      }
   }

   @deob.ObfuscatedName("lc.f(Ljava/lang/String;Ljava/lang/String;I)[B")
   public synchronized byte[] method8823(String arg0, String arg1) {
      if (!this.method8765()) {
         return null;
      } else {
         String var3 = arg0.toLowerCase();
         String var4 = arg1.toLowerCase();
         int var5 = this.field5533.field5553.method6548(class816.method15213(var3));
         if (!this.method8767(var5)) {
            return null;
         } else {
            int var6 = this.field5533.field5561[var5].method6548(class816.method15213(var4));
            return this.method8771(var5, var6);
         }
      }
   }

   @deob.ObfuscatedName("lc.ai(Ljava/lang/String;Ljava/lang/String;B)Z")
   private boolean method8791(String arg0, String arg1) {
      if (!this.method8765()) {
         return false;
      } else {
         String var3 = arg0.toLowerCase();
         String var4 = arg1.toLowerCase();
         int var5 = this.field5533.field5553.method6548(class816.method15213(var3));
         if (!this.method8767(var5)) {
            return false;
         } else {
            int var6 = this.field5533.field5561[var5].method6548(class816.method15213(var4));
            return this.method8773(var5, var6);
         }
      }
   }

   @deob.ObfuscatedName("lc.ap(Ljava/lang/String;I)Z")
   public boolean method8775(String arg0) {
      int var2 = this.method8786("");
      return var2 != -1 ? this.method8791("", arg0) : this.method8791(arg0, "");
   }

   @deob.ObfuscatedName("lc.av(Ljava/lang/String;B)Z")
   public boolean method8793(String arg0) {
      if (!this.method8765()) {
         return false;
      } else {
         String var2 = arg0.toLowerCase();
         int var3 = this.field5533.field5553.method6548(class816.method15213(var2));
         return this.method8774(var3);
      }
   }

   @deob.ObfuscatedName("lc.ax(Ljava/lang/String;B)V")
   public void method8832(String arg0) {
      if (this.method8765()) {
         String var2 = arg0.toLowerCase();
         int var3 = this.field5533.field5553.method6548(class816.method15213(var2));
         this.method8770(var3);
      }
   }

   @deob.ObfuscatedName("lc.af(Ljava/lang/String;I)I")
   public int method8811(String arg0) {
      if (!this.method8765()) {
         return 0;
      } else {
         String var2 = arg0.toLowerCase();
         int var3 = this.field5533.field5553.method6548(class816.method15213(var2));
         return this.method8815(var3);
      }
   }

   @deob.ObfuscatedName("kp.at([BI)[B")
   public static final byte[] method8525(byte[] arg0) {
      class124 var1 = new class124(arg0);
      int var2 = var1.method1688();
      int var3 = var1.method1591();
      if (var3 >= 0 && (field5532 == 0 || var3 <= field5532)) {
         if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method1602(var4, 0, var3);
            return var4;
         } else {
            int var5 = var1.method1591();
            if (var5 >= 0 && (field5532 == 0 || var5 <= field5532)) {
               byte[] var6 = new byte[var5];
               if (var2 == 1) {
                  class827.method14600(var6, var5, arg0, var3, 9);
               } else {
                  class951 var7 = field5521;
                  synchronized(field5521) {
                     field5521.method16026(var1, var6);
                  }
               }

               return var6;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }
}
