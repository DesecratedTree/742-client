import java.io.IOException;

@deob.ObfuscatedName("abm")
public class class42 extends class630 {
   @deob.ObfuscatedName("abm.z")
   private class711 field320;

   @deob.ObfuscatedName("abm.p(I)V")
   public void method668() {
      try {
         this.field320.method1532();
      } catch (Exception var2) {
      }

      this.field320 = null;
      ++this.field5732;
      this.field5724 = -1;
      this.field5730 = (byte)((int)(Math.random() * 255.0D + 1.0D));
   }

   @deob.ObfuscatedName("abm.o(I)Z")
   public boolean method669() {
      if (this.field320 != null) {
         long var1 = class431.method2169();
         int var3 = (int)(var1 - this.field5728);
         this.field5728 = var1;
         if (var3 > 200) {
            var3 = 200;
         }

         this.field5719 += var3;
         if (this.field5719 > 30000) {
            try {
               this.field320.method1532();
            } catch (Exception var29) {
            }

            this.field320 = null;
         }
      }

      if (this.field320 == null) {
         return this.method9116() == 0 && this.method9110() == 0;
      } else {
         try {
            for(class313 var5 = (class313)this.field5723.method14944(); var5 != null; var5 = (class313)this.field5723.method14929()) {
               this.field5729.field935 = 0;
               this.field5729.method1568(1);
               this.field5729.method1574(var5.field808);
               this.field320.method1530(this.field5729.field931, 0, this.field5729.field931.length);
               this.field5721.method14938(var5);
            }

            for(class313 var6 = (class313)this.field5725.method14944(); var6 != null; var6 = (class313)this.field5725.method14929()) {
               this.field5729.field935 = 0;
               this.field5729.method1568(0);
               this.field5729.method1574(var6.field808);
               this.field320.method1530(this.field5729.field931, 0, this.field5729.field931.length);
               this.field5722.method14938(var6);
            }

            for(int var7 = 0; var7 < 100; ++var7) {
               int var8 = this.field320.method1529();
               if (var8 < 0) {
                  throw new IOException();
               }

               if (var8 == 0) {
                  break;
               }

               this.field5719 = 0;
               byte var9 = 0;
               if (this.field5734 == null) {
                  var9 = 10;
               } else if (this.field5734.field1967 == 0) {
                  var9 = 1;
               }

               if (var9 > 0) {
                  int var10 = var9 - this.field5733.field935;
                  if (var10 > var8) {
                     var10 = var8;
                  }

                  this.field320.method1541(this.field5733.field931, this.field5733.field935, var10);
                  if (this.field5730 != 0) {
                     for(int var11 = 0; var11 < var10; ++var11) {
                        this.field5733.field931[this.field5733.field935 + var11] ^= this.field5730;
                     }
                  }

                  this.field5733.field935 += var10;
                  if (this.field5733.field935 >= var9) {
                     if (this.field5734 == null) {
                        this.field5733.field935 = 0;
                        int var12 = this.field5733.method1688();
                        int var13 = this.field5733.method1591();
                        int var14 = this.field5733.method1688();
                        int var15 = this.field5733.method1591();
                        int var16 = var14 & 127;
                        boolean var17 = (var14 & 128) != 0;
                        long var18 = ((long)var12 << 32) + (long)var13;
                        Object var20 = null;
                        class313 var21;
                        if (var17) {
                           for(var21 = (class313)this.field5722.method14944(); var21 != null && var21.field808 != var18; var21 = (class313)this.field5722.method14929()) {
                           }
                        } else {
                           for(var21 = (class313)this.field5721.method14944(); var21 != null && var21.field808 != var18; var21 = (class313)this.field5721.method14929()) {
                           }
                        }

                        if (var21 == null) {
                           throw new IOException();
                        }

                        int var22 = var16 == 0 ? 5 : 9;
                        this.field5734 = var21;
                        this.field5734.field1969 = new class124(var15 + var22 + this.field5734.field1968);
                        this.field5734.field1969.method1568(var16);
                        this.field5734.field1969.method1572(var15);
                        this.field5734.field1967 = 10;
                        this.field5733.field935 = 0;
                     } else {
                        if (this.field5734.field1967 != 0) {
                           throw new IOException();
                        }

                        if (this.field5733.field931[0] == -1) {
                           this.field5734.field1967 = 1;
                           this.field5733.field935 = 0;
                        } else {
                           this.field5734 = null;
                        }
                     }
                  }
               } else {
                  int var23 = this.field5734.field1969.field931.length - this.field5734.field1968;
                  int var24 = 512 - this.field5734.field1967;
                  if (var24 > var23 - this.field5734.field1969.field935) {
                     var24 = var23 - this.field5734.field1969.field935;
                  }

                  if (var24 > var8) {
                     var24 = var8;
                  }

                  this.field320.method1541(this.field5734.field1969.field931, this.field5734.field1969.field935, var24);
                  if (this.field5730 != 0) {
                     for(int var25 = 0; var25 < var24; ++var25) {
                        this.field5734.field1969.field931[this.field5734.field1969.field935 + var25] ^= this.field5730;
                     }
                  }

                  this.field5734.field1969.field935 += var24;
                  this.field5734.field1967 += var24;
                  if (this.field5734.field1969.field935 == var23) {
                     this.field5734.method1393();
                     this.field5734.field1758 = false;
                     this.field5734 = null;
                  } else if (this.field5734.field1967 == 512) {
                     this.field5734.field1967 = 0;
                  }
               }
            }

            return true;
         } catch (IOException var30) {
            try {
               this.field320.method1532();
            } catch (Exception var28) {
            }

            this.field320 = null;
            ++this.field5732;
            this.field5724 = -2;
            return this.method9116() == 0 && this.method9110() == 0;
         }
      }
   }

   @deob.ObfuscatedName("abm.a(Ljava/lang/Object;ZB)V")
   public void method682(Object arg0, boolean arg1) {
      if (this.field320 != null) {
         try {
            this.field320.method1532();
         } catch (Exception var10) {
         }

         this.field320 = null;
      }

      this.field320 = (class711)arg0;
      this.method671();
      this.method670(arg1);
      this.field5733.field935 = 0;
      this.field5734 = null;

      while(true) {
         class313 var4 = (class313)this.field5721.method14923();
         if (var4 == null) {
            while(true) {
               class313 var5 = (class313)this.field5722.method14923();
               if (var5 == null) {
                  if (this.field5730 != 0) {
                     try {
                        this.field5729.field935 = 0;
                        this.field5729.method1568(4);
                        this.field5729.method1568(this.field5730);
                        this.field5729.method1572(0);
                        this.field320.method1530(this.field5729.field931, 0, this.field5729.field931.length);
                     } catch (IOException var9) {
                        try {
                           this.field320.method1532();
                        } catch (Exception var8) {
                        }

                        this.field320 = null;
                        ++this.field5732;
                        this.field5724 = -2;
                     }
                  }

                  this.field5719 = 0;
                  this.field5728 = class431.method2169();
                  return;
               }

               this.field5725.method14938(var5);
            }
         }

         this.field5723.method14938(var4);
      }
   }

   @deob.ObfuscatedName("abm.af(I)V")
   private void method671() {
      if (this.field320 != null) {
         try {
            this.field5729.field935 = 0;
            this.field5729.method1568(6);
            this.field5729.method1571(3);
            this.field5729.method1569(0);
            this.field320.method1530(this.field5729.field931, 0, this.field5729.field931.length);
         } catch (IOException var4) {
            try {
               this.field320.method1532();
            } catch (Exception var3) {
            }

            this.field320 = null;
            ++this.field5732;
            this.field5724 = -2;
         }

      }
   }

   @deob.ObfuscatedName("abm.x(ZI)V")
   public void method670(boolean arg0) {
      if (this.field320 != null) {
         try {
            this.field5729.field935 = 0;
            this.field5729.method1568(arg0 ? 2 : 3);
            this.field5729.method1574(0L);
            this.field320.method1530(this.field5729.field931, 0, this.field5729.field931.length);
         } catch (IOException var5) {
            try {
               this.field320.method1532();
            } catch (Exception var4) {
            }

            this.field320 = null;
            ++this.field5732;
            this.field5724 = -2;
         }

      }
   }

   @deob.ObfuscatedName("abm.s(I)V")
   public void method672() {
      if (this.field320 != null) {
         try {
            this.field5729.field935 = 0;
            this.field5729.method1568(7);
            this.field5729.method1574(0L);
            this.field320.method1530(this.field5729.field931, 0, this.field5729.field931.length);
         } catch (IOException var4) {
            try {
               this.field320.method1532();
            } catch (Exception var3) {
            }

            this.field320 = null;
            ++this.field5732;
            this.field5724 = -2;
         }

      }
   }

   @deob.ObfuscatedName("abm.l(B)V")
   public void method673() {
      if (this.field320 != null) {
         this.field320.method1532();
      }

   }

   @deob.ObfuscatedName("abm.u(I)V")
   public void method674() {
      if (this.field320 != null) {
         this.field320.method1534();
      }

   }
}
