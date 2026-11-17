@deob.ObfuscatedName("aiq")
public abstract class class235 extends class89 {
   @deob.ObfuscatedName("aiq.t")
   protected int field1581;
   @deob.ObfuscatedName("aiq.s")
   protected int field1582;
   @deob.ObfuscatedName("aiq.h")
   protected int field1583;
   @deob.ObfuscatedName("aiq.l")
   protected int field1584;
   @deob.ObfuscatedName("aiq.u")
   protected int field1585;
   @deob.ObfuscatedName("aiq.a")
   protected int field1586;
   @deob.ObfuscatedName("aiq.g")
   protected int field1587;
   @deob.ObfuscatedName("aiq.v")
   protected int field1588;
   @deob.ObfuscatedName("aiq.e")
   protected int field1589;
   @deob.ObfuscatedName("aiq.z")
   protected int field1590;
   @deob.ObfuscatedName("aiq.m")
   protected int field1591;
   @deob.ObfuscatedName("aiq.i")
   protected int field1592;
   @deob.ObfuscatedName("aiq.x")
   protected int field1594;
   @deob.ObfuscatedName("aiq.w")
   protected int field1595;
   @deob.ObfuscatedName("aiq.c")
   protected boolean field1593;

   protected class235() {
   }

   @deob.ObfuscatedName("wd.ak(IIB)I")
   private static final int method15753(int arg0, int arg1) {
      return arg1 < 0 ? arg0 : (int)((double)arg0 * Math.sqrt((double)(16384 - arg1) * 1.220703125E-4D) + 0.5D);
   }

   @deob.ObfuscatedName("mh.aa(III)I")
   private static final int method9280(int arg0, int arg1) {
      return arg1 < 0 ? -arg0 : (int)((double)arg0 * Math.sqrt((double)arg1 * 1.220703125E-4D) + 0.5D);
   }

   @deob.ObfuscatedName("aiq.ao(I)V")
   protected final void method3245() {
      this.field1585 = this.field1582;
      this.field1588 = method15753(this.field1582, this.field1584);
      this.field1587 = method9280(this.field1582, this.field1584);
   }

   @deob.ObfuscatedName("aiq.n()I")
   public final int method1270() {
      int var1 = this.field1585 * 3 >> 6;
      int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
      if (this.field1591 == 0) {
         var2 -= this.field1586 * var2 / (((class224)this.field675).method3113() << 8);
      } else if (this.field1591 >= 0) {
         var2 -= this.field1592 * var2 / ((class224)this.field675).method3113();
      }

      return var2 > 255 ? 255 : var2;
   }

   @deob.ObfuscatedName("aiq.ab(B)Z")
   public final synchronized boolean method3246() {
      return this.field1595 != 0;
   }

   @deob.ObfuscatedName("aiq.ae(IB)V")
   public final synchronized void method3313(int arg0) {
      this.field1591 = arg0;
   }

   @deob.ObfuscatedName("aiq.az(II)V")
   public final synchronized void method3248(int arg0) {
      this.method3251(arg0 << 6, this.method3253());
   }

   @deob.ObfuscatedName("aiq.aq(II)V")
   private final synchronized void method3271(int arg0) {
      this.method3251(arg0, this.method3253());
   }

   @deob.ObfuscatedName("aiq.ar(IB)V")
   public final synchronized void method3250(int arg0) {
      this.method3251(this.method3252(), arg0);
   }

   @deob.ObfuscatedName("aiq.as(IIB)V")
   private final synchronized void method3251(int arg0, int arg1) {
      this.field1582 = arg0;
      this.field1584 = arg1;
      this.field1595 = 0;
      this.method3245();
   }

   @deob.ObfuscatedName("aiq.au(B)I")
   public final synchronized int method3252() {
      return this.field1582 == Integer.MIN_VALUE ? 0 : this.field1582;
   }

   @deob.ObfuscatedName("aiq.ad(I)I")
   public final synchronized int method3253() {
      return this.field1584 < 0 ? -1 : this.field1584;
   }

   @deob.ObfuscatedName("aiq.am(II)V")
   public final synchronized void method3254(int arg0) {
      int var2 = ((class224)this.field675).method3113() << 8;
      if (arg0 < -1) {
         arg0 = -1;
      }

      if (arg0 > var2) {
         arg0 = var2;
      }

      this.field1586 = arg0;
   }

   @deob.ObfuscatedName("aiq.aj(ZB)V")
   public final synchronized void method3255(boolean arg0) {
      this.field1594 = (this.field1594 >>> 31) + (this.field1594 ^ this.field1594 >> 31);
      if (arg0) {
         this.field1594 = -(this.field1594 * 1151273631) * -274099873;
      }

   }

   @deob.ObfuscatedName("aiq.ac(I)Z")
   public final synchronized boolean method3256() {
      return this.field1586 < 0 || this.field1586 >= ((class224)this.field675).method3113() << 8;
   }

   @deob.ObfuscatedName("aiq.ay(I)V")
   protected final void method3257() {
      if (this.field1595 != 0) {
         if (this.field1582 == Integer.MIN_VALUE) {
            this.field1582 = 0;
         }

         this.field1595 = 0;
         this.method3245();
      }

   }

   @deob.ObfuscatedName("aiq.bf(III)V")
   public final synchronized void method3258(int arg0, int arg1) {
      this.method3259(arg0, arg1, this.method3253());
   }

   @deob.ObfuscatedName("aiq.bp(IIII)V")
   public final synchronized void method3259(int arg0, int arg1, int arg2) {
      if (arg0 == 0) {
         this.method3251(arg1, arg2);
      } else {
         int var4 = method15753(arg1, arg2);
         int var5 = method9280(arg1, arg2);
         if (this.field1588 == var4 && this.field1587 == var5) {
            this.field1595 = 0;
         } else {
            int var6 = arg1 - this.field1585;
            if (this.field1585 - arg1 > var6) {
               var6 = this.field1585 - arg1;
            }

            if (var4 - this.field1588 > var6) {
               var6 = var4 - this.field1588;
            }

            if (this.field1588 - var4 > var6) {
               var6 = this.field1588 - var4;
            }

            if (var5 - this.field1587 > var6) {
               var6 = var5 - this.field1587;
            }

            if (this.field1587 - var5 > var6) {
               var6 = this.field1587 - var5;
            }

            if (arg0 > var6) {
               arg0 = var6;
            }

            this.field1595 = arg0;
            this.field1582 = arg1;
            this.field1584 = arg2;
            this.field1583 = (arg1 - this.field1585) / arg0;
            this.field1589 = (var4 - this.field1588) / arg0;
            this.field1590 = (var5 - this.field1587) / arg0;
         }
      }
   }

   @deob.ObfuscatedName("aiq.bs(II)V")
   public final synchronized void method3260(int arg0) {
      if (arg0 == 0) {
         this.method3271(0);
         this.method9864();
      } else if (this.field1588 == 0 && this.field1587 == 0) {
         this.field1595 = 0;
         this.field1582 = 0;
         this.field1585 = 0;
         this.method9864();
      } else {
         int var2 = -this.field1585;
         if (this.field1585 > var2) {
            var2 = this.field1585;
         }

         if (-this.field1588 > var2) {
            var2 = -this.field1588;
         }

         if (this.field1588 > var2) {
            var2 = this.field1588;
         }

         if (-this.field1587 > var2) {
            var2 = -this.field1587;
         }

         if (this.field1587 > var2) {
            var2 = this.field1587;
         }

         if (arg0 > var2) {
            arg0 = var2;
         }

         this.field1595 = arg0;
         this.field1582 = Integer.MIN_VALUE;
         this.field1583 = -this.field1585 / arg0;
         this.field1589 = -this.field1588 / arg0;
         this.field1590 = -this.field1587 / arg0;
      }
   }

   @deob.ObfuscatedName("aiq.br(II)V")
   public final synchronized void method3261(int arg0) {
      if (this.field1594 < 0) {
         this.field1594 = -arg0;
      } else {
         this.field1594 = arg0;
      }

   }

   @deob.ObfuscatedName("aiq.ba(I)I")
   public final synchronized int method3262() {
      return this.field1594 < 0 ? -this.field1594 : this.field1594;
   }

   @deob.ObfuscatedName("aiq.b()I")
   public final int method1246() {
      return this.field1582 == 0 && this.field1595 == 0 ? 0 : 1;
   }

   @deob.ObfuscatedName("aiq.bg(I)Z")
   protected final boolean method3263() {
      int var1 = this.field1582;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method15753(var1, this.field1584);
         var2 = method9280(var1, this.field1584);
      }

      if (this.field1585 == var1 && this.field1588 == var3 && this.field1587 == var2) {
         if (this.field1582 == Integer.MIN_VALUE) {
            this.field1582 = 0;
            this.field1587 = 0;
            this.field1588 = 0;
            this.field1585 = 0;
            this.method9864();
            return true;
         } else {
            this.method3245();
            return false;
         }
      } else {
         if (this.field1585 < var1) {
            this.field1583 = 1;
            this.field1595 = var1 - this.field1585;
         } else if (this.field1585 > var1) {
            this.field1583 = -1;
            this.field1595 = this.field1585 - var1;
         } else {
            this.field1583 = 0;
         }

         if (this.field1588 < var3) {
            this.field1589 = 1;
            if (this.field1595 == 0 || this.field1595 > var3 - this.field1588) {
               this.field1595 = var3 - this.field1588;
            }
         } else if (this.field1588 > var3) {
            this.field1589 = -1;
            if (this.field1595 == 0 || this.field1595 > this.field1588 - var3) {
               this.field1595 = this.field1588 - var3;
            }
         } else {
            this.field1589 = 0;
         }

         if (this.field1587 < var2) {
            this.field1590 = 1;
            if (this.field1595 == 0 || this.field1595 > var2 - this.field1587) {
               this.field1595 = var2 - this.field1587;
            }
         } else if (this.field1587 > var2) {
            this.field1590 = -1;
            if (this.field1595 == 0 || this.field1595 > this.field1587 - var2) {
               this.field1595 = this.field1587 - var2;
            }
         } else {
            this.field1590 = 0;
         }

         return false;
      }
   }

   @deob.ObfuscatedName("aiq.o(I)V")
   public final synchronized void method1254(int arg0) {
      if (this.field1595 > 0) {
         if (arg0 >= this.field1595) {
            if (this.field1582 == Integer.MIN_VALUE) {
               this.field1582 = 0;
               this.field1587 = 0;
               this.field1588 = 0;
               this.field1585 = 0;
               this.method9864();
               arg0 = this.field1595;
            }

            this.field1595 = 0;
            this.method3245();
         } else {
            this.field1585 += this.field1583 * arg0;
            this.field1588 += this.field1589 * arg0;
            this.field1587 += this.field1590 * arg0;
            this.field1595 -= arg0;
         }
      }

      int var2 = this.field1592 << 8;
      int var3 = this.field1581 << 8;
      int var4 = ((class224)this.field675).method3113() << 8;
      int var5 = var3 - var2;
      if (var5 <= 0) {
         this.field1591 = 0;
      }

      if (this.field1586 < 0) {
         if (this.field1594 <= 0) {
            this.method3257();
            this.method9864();
            return;
         }

         this.field1586 = 0;
      }

      if (this.field1586 >= var4) {
         if (this.field1594 >= 0) {
            this.method3257();
            this.method9864();
            return;
         }

         this.field1586 = var4 - 1;
      }

      this.field1586 += this.field1594 * arg0;
      if (this.field1591 < 0) {
         if (!this.field1593) {
            if (this.field1594 < 0) {
               if (this.field1586 >= var2) {
                  return;
               }

               this.field1586 = var3 - 1 - (var3 - 1 - this.field1586) % var5;
            } else {
               if (this.field1586 < var3) {
                  return;
               }

               this.field1586 = (this.field1586 - var2) % var5 + var2;
            }

         } else {
            if (this.field1594 < 0) {
               if (this.field1586 >= var2) {
                  return;
               }

               this.field1586 = var2 + var2 - 1 - this.field1586;
               this.field1594 = -(this.field1594 * 1151273631) * -274099873;
            }

            while(this.field1586 >= var3) {
               this.field1586 = var3 + var3 - 1 - this.field1586;
               this.field1594 = -(this.field1594 * 1151273631) * -274099873;
               if (this.field1586 >= var2) {
                  return;
               }

               this.field1586 = var2 + var2 - 1 - this.field1586;
               this.field1594 = -(this.field1594 * 1151273631) * -274099873;
            }

         }
      } else {
         if (this.field1591 > 0) {
            if (this.field1593) {
               label121: {
                  if (this.field1594 < 0) {
                     if (this.field1586 >= var2) {
                        return;
                     }

                     this.field1586 = var2 + var2 - 1 - this.field1586;
                     this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                     if (--this.field1591 == 0) {
                        break label121;
                     }
                  }

                  do {
                     if (this.field1586 < var3) {
                        return;
                     }

                     this.field1586 = var3 + var3 - 1 - this.field1586;
                     this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                     if (--this.field1591 == 0) {
                        break;
                     }

                     if (this.field1586 >= var2) {
                        return;
                     }

                     this.field1586 = var2 + var2 - 1 - this.field1586;
                     this.field1594 = -(this.field1594 * 1151273631) * -274099873;
                  } while(--this.field1591 != 0);
               }
            } else {
               label153: {
                  if (this.field1594 < 0) {
                     if (this.field1586 >= var2) {
                        return;
                     }

                     int var6 = (var3 - 1 - this.field1586) / var5;
                     if (var6 >= this.field1591) {
                        this.field1586 += this.field1591 * var5;
                        this.field1591 = 0;
                        break label153;
                     }

                     this.field1586 += var5 * var6;
                     this.field1591 -= var6;
                  } else {
                     if (this.field1586 < var3) {
                        return;
                     }

                     int var7 = (this.field1586 - var2) / var5;
                     if (var7 >= this.field1591) {
                        this.field1586 -= this.field1591 * var5;
                        this.field1591 = 0;
                        break label153;
                     }

                     this.field1586 -= var5 * var7;
                     this.field1591 -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field1594 < 0) {
            if (this.field1586 < 0) {
               this.field1586 = -1;
               this.method3257();
               this.method9864();
            }
         } else if (this.field1586 >= var4) {
            this.field1586 = var4;
            this.method3257();
            this.method9864();
         }

      }
   }

   @deob.ObfuscatedName("aiq.k()Ladf;")
   public final class89 method1257() {
      return null;
   }

   @deob.ObfuscatedName("aiq.d()Ladf;")
   public final class89 method1245() {
      return null;
   }

   @deob.ObfuscatedName("aiq.p([III)V")
   public abstract void method1244(int[] arg0, int arg1, int arg2);
}
