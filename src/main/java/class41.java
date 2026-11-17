import java.util.zip.CRC32;

@deob.ObfuscatedName("abl")
public class class41 extends class632 {
   @deob.ObfuscatedName("abl.h")
   private int field305 = 0;
   @deob.ObfuscatedName("abl.e")
   private class875 field299 = new class875(16);
   @deob.ObfuscatedName("abl.i")
   private int field309 = 0;
   @deob.ObfuscatedName("abl.c")
   private class849 field311 = new class849();
   @deob.ObfuscatedName("abl.q")
   private long field313 = 0L;
   @deob.ObfuscatedName("abl.n")
   private int field306;
   @deob.ObfuscatedName("abl.b")
   private class704 field291;
   @deob.ObfuscatedName("abl.m")
   private boolean field314;
   @deob.ObfuscatedName("abl.t")
   private class849 field297;
   @deob.ObfuscatedName("abl.r")
   private class704 field295;
   @deob.ObfuscatedName("abl.k")
   private class630 field293;
   @deob.ObfuscatedName("abl.d")
   private class618 field301;
   @deob.ObfuscatedName("abl.o")
   private int field300;
   @deob.ObfuscatedName("abl.a")
   private byte[] field316;
   @deob.ObfuscatedName("abl.x")
   private int field318;
   @deob.ObfuscatedName("abl.w")
   private boolean field312;
   @deob.ObfuscatedName("abl.p")
   private class264 field296;
   @deob.ObfuscatedName("abl.f")
   private static CRC32 field294 = new CRC32();
   @deob.ObfuscatedName("abl.s")
   private class616 field303;
   @deob.ObfuscatedName("abl.z")
   private boolean field307;
   @deob.ObfuscatedName("abl.g")
   private byte[] field304;

   public class41(int arg0, class704 arg1, class704 arg2, class630 arg3, class618 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
      this.field306 = arg0;
      this.field291 = arg1;
      if (this.field291 == null) {
         this.field314 = false;
      } else {
         this.field314 = true;
         this.field297 = new class849();
      }

      this.field295 = arg2;
      this.field293 = arg3;
      this.field301 = arg4;
      this.field300 = arg5;
      this.field316 = arg6;
      this.field318 = arg7;
      this.field312 = arg8;
      if (this.field295 != null) {
         this.field296 = this.field301.method8906(this.field306, this.field295);
      }

   }

   @deob.ObfuscatedName("abl.e(I[BII)V")
   public void method618(int arg0, byte[] arg1, int arg2) {
      if (this.field300 == arg0 && this.field318 == arg2) {
         boolean var4 = true;

         for(int var5 = 0; var5 < this.field316.length; ++var5) {
            if (this.field316[var5] != arg1[var5]) {
               var4 = false;
               break;
            }
         }

         if (var4) {
            return;
         }
      }

      this.field300 = arg0;
      this.field316 = arg1;
      this.field318 = arg2;
      this.field303 = null;
      this.field296 = null;
      if (!this.field293.method9109()) {
         this.field296 = this.field293.method9107(255, this.field306, (byte)0, true);
      }

   }

   @deob.ObfuscatedName("abl.z(I)I")
   public int method619() {
      if (this.method659() == null) {
         return this.field296 == null ? 0 : this.field296.method3515();
      } else {
         return 100;
      }
   }

   @deob.ObfuscatedName("abl.n(S)Llg;")
   public class616 method659() {
      if (this.field303 != null) {
         return this.field303;
      } else {
         if (this.field296 == null) {
            if (this.field293.method9109()) {
               return null;
            }

            this.field296 = this.field293.method9107(255, this.field306, (byte)0, true);
         }

         if (this.field296.field1758) {
            return null;
         } else {
            byte[] var1 = this.field296.method3514();
            if (this.field296 instanceof class310) {
               try {
                  if (var1 == null) {
                     throw new RuntimeException();
                  }

                  this.field303 = new class616(var1, this.field300, this.field316);
                  if (this.field303.field5549 != this.field318) {
                     throw new RuntimeException();
                  }
               } catch (RuntimeException var4) {
                  this.field303 = null;
                  if (this.field293.method9109()) {
                     this.field296 = null;
                  } else {
                     this.field296 = this.field293.method9107(255, this.field306, (byte)0, true);
                  }

                  return null;
               }
            } else {
               try {
                  if (var1 == null) {
                     throw new RuntimeException();
                  }

                  this.field303 = new class616(var1, this.field300, this.field316);
               } catch (RuntimeException var5) {
                  this.field293.method668();
                  this.field303 = null;
                  if (this.field293.method9109()) {
                     this.field296 = null;
                  } else {
                     this.field296 = this.field293.method9107(255, this.field306, (byte)0, true);
                  }

                  return null;
               }

               if (this.field295 != null) {
                  this.field301.method8907(this.field306, var1, this.field295);
               }
            }

            this.field296 = null;
            if (this.field291 != null) {
               this.field304 = new byte[this.field303.field5554];
               this.field305 = 0;
            }

            return this.field303;
         }
      }
   }

   @deob.ObfuscatedName("abl.k(IB)[B")
   public byte[] method621(int arg0) {
      class264 var2 = this.method642(arg0, 0);
      if (var2 == null) {
         return null;
      } else {
         byte[] var3 = var2.method3514();
         var2.method9864();
         return var3;
      }
   }

   @deob.ObfuscatedName("abl.m(III)Lajs;")
   private class264 method642(int arg0, int arg1) {
      class264 var3 = (class264)this.field299.method15322((long)arg0);
      if (var3 != null && arg1 == 0 && !var3.field1756 && var3.field1758) {
         var3.method9864();
         var3 = null;
      }

      if (var3 == null) {
         if (arg1 == 0) {
            if (this.field291 != null && this.field304[arg0] != -1) {
               var3 = this.field301.method8906(arg0, this.field291);
            } else {
               if (this.field293.method9109()) {
                  return null;
               }

               var3 = this.field293.method9107(this.field306, arg0, (byte)2, true);
            }
         } else if (arg1 == 1) {
            if (this.field291 == null) {
               throw new RuntimeException();
            }

            var3 = this.field301.method8905(arg0, this.field291);
         } else {
            if (arg1 != 2) {
               throw new RuntimeException();
            }

            if (this.field291 == null) {
               throw new RuntimeException();
            }

            if (this.field304[arg0] != -1) {
               throw new RuntimeException();
            }

            if (this.field293.method9108()) {
               return null;
            }

            var3 = this.field293.method9107(this.field306, arg0, (byte)2, false);
         }

         this.field299.method15311(var3, (long)arg0);
      }

      if (var3.field1758) {
         return null;
      } else {
         byte[] var4 = var3.method3514();
         if (var3 instanceof class310) {
            try {
               if (var4 != null && var4.length > 2) {
                  field294.reset();
                  field294.update(var4, 0, var4.length - 2);
                  int var5 = (int)field294.getValue();
                  if (this.field303.field5555[arg0] != var5) {
                     throw new RuntimeException();
                  } else {
                     if (this.field303.field5546 != null && this.field303.field5546[arg0] != null) {
                        byte[] var6 = this.field303.field5546[arg0];
                        byte[] var7 = class856.method5512(var4, 0, var4.length - 2);

                        for(int var8 = 0; var8 < 64; ++var8) {
                           if (var6[var8] != var7[var8]) {
                              throw new RuntimeException();
                           }
                        }
                     }

                     int var9 = ((var4[var4.length - 2] & 255) << 8) + (var4[var4.length - 1] & 255);
                     if ((this.field303.field5557[arg0] & 65535) != var9) {
                        throw new RuntimeException();
                     } else {
                        if (this.field304[arg0] != 1) {
                           if (this.field304[arg0] == 0) {
                           }

                           ++this.field305;
                           this.field304[arg0] = 1;
                        }

                        if (!var3.field1756) {
                           var3.method9864();
                        }

                        return var3;
                     }
                  }
               } else {
                  throw new RuntimeException();
               }
            } catch (Exception var18) {
               this.field304[arg0] = -1;
               var3.method9864();
               if (var3.field1756 && !this.field293.method9109()) {
                  class313 var11 = this.field293.method9107(this.field306, arg0, (byte)2, true);
                  this.field299.method15311(var11, (long)arg0);
               }

               return null;
            }
         } else {
            try {
               label161: {
                  if (var4 != null && var4.length > 2) {
                     field294.reset();
                     field294.update(var4, 0, var4.length - 2);
                     int var12 = (int)field294.getValue();
                     if (this.field303.field5555[arg0] != var12) {
                        throw new RuntimeException();
                     }

                     if (this.field303.field5546 == null || this.field303.field5546[arg0] == null) {
                        break label161;
                     }

                     byte[] var13 = this.field303.field5546[arg0];
                     byte[] var14 = class856.method5512(var4, 0, var4.length - 2);
                     int var15 = 0;

                     while(true) {
                        if (var15 >= 64) {
                           break label161;
                        }

                        if (var13[var15] != var14[var15]) {
                           throw new RuntimeException();
                        }

                        ++var15;
                     }
                  }

                  throw new RuntimeException();
               }

               this.field293.field5732 = 0;
               this.field293.field5724 = 0;
            } catch (RuntimeException var19) {
               this.field293.method668();
               var3.method9864();
               if (var3.field1756 && !this.field293.method9109()) {
                  class313 var17 = this.field293.method9107(this.field306, arg0, (byte)2, true);
                  this.field299.method15311(var17, (long)arg0);
               }

               return null;
            }

            var4[var4.length - 2] = (byte)(this.field303.field5557[arg0] >>> 8);
            var4[var4.length - 1] = (byte)this.field303.field5557[arg0];
            if (this.field291 != null) {
               this.field301.method8907(arg0, var4, this.field291);
               if (this.field304[arg0] != 1) {
                  ++this.field305;
                  this.field304[arg0] = 1;
               }
            }

            if (!var3.field1756) {
               var3.method9864();
            }

            return var3;
         }
      }
   }

   @deob.ObfuscatedName("abl.i(S)V")
   public void method623() {
      if (this.field297 != null) {
         if (this.method659() != null) {
            for(class674 var1 = this.field311.method14964(); var1 != null; var1 = this.field311.method15006()) {
               int var2 = (int)var1.field6137;
               if (var2 >= 0 && var2 < this.field303.field5554 && this.field303.field5556[var2] != 0) {
                  if (this.field304[var2] == 0) {
                     this.method642(var2, 1);
                  }

                  if (this.field304[var2] == -1) {
                     this.method642(var2, 2);
                  }

                  if (this.field304[var2] == 1) {
                     var1.method9864();
                  }
               } else {
                  var1.method9864();
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("abl.t(I)V")
   public void method652() {
      if (this.field297 != null) {
         if (this.method659() == null) {
            return;
         }

         if (this.field314) {
            boolean var1 = true;

            for(class674 var2 = this.field297.method14964(); var2 != null; var2 = this.field297.method15006()) {
               int var3 = (int)var2.field6137;
               if (this.field304[var3] == 0) {
                  this.method642(var3, 1);
               }

               if (this.field304[var3] != 0) {
                  var2.method9864();
               } else {
                  var1 = false;
               }
            }

            while(this.field309 < this.field303.field5556.length) {
               if (this.field303.field5556[this.field309] == 0) {
                  ++this.field309;
               } else {
                  if (this.field301.field5568 >= 250) {
                     var1 = false;
                     break;
                  }

                  if (this.field304[this.field309] == 0) {
                     this.method642(this.field309, 1);
                  }

                  if (this.field304[this.field309] == 0) {
                     class674 var4 = new class674();
                     var4.field6137 = (long)(this.field309 * 1169965767) * 200662775L;
                     this.field297.method14959(var4);
                     var1 = false;
                  }

                  ++this.field309;
               }
            }

            if (var1) {
               this.field314 = false;
               this.field309 = 0;
            }
         } else if (this.field307) {
            boolean var5 = true;

            for(class674 var6 = this.field297.method14964(); var6 != null; var6 = this.field297.method15006()) {
               int var7 = (int)var6.field6137;
               if (this.field304[var7] != 1) {
                  this.method642(var7, 2);
               }

               if (this.field304[var7] == 1) {
                  var6.method9864();
               } else {
                  var5 = false;
               }
            }

            while(this.field309 < this.field303.field5556.length) {
               if (this.field303.field5556[this.field309] == 0) {
                  ++this.field309;
               } else {
                  if (this.field293.method9108()) {
                     var5 = false;
                     break;
                  }

                  if (this.field304[this.field309] != 1) {
                     this.method642(this.field309, 2);
                  }

                  if (this.field304[this.field309] != 1) {
                     class674 var8 = new class674();
                     var8.field6137 = (long)(this.field309 * 1169965767) * 200662775L;
                     this.field297.method14959(var8);
                     var5 = false;
                  }

                  ++this.field309;
               }
            }

            if (var5) {
               this.field307 = false;
               this.field309 = 0;
            }
         } else {
            this.field297 = null;
         }
      }

      if (this.field312 && class431.method2169() >= this.field313) {
         for(class264 var9 = (class264)this.field299.method15313(); var9 != null; var9 = (class264)this.field299.method15314()) {
            if (!var9.field1758) {
               if (var9.field1757) {
                  if (!var9.field1756) {
                     throw new RuntimeException();
                  }

                  var9.method9864();
               } else {
                  var9.field1757 = true;
               }
            }
         }

         this.field313 = class431.method2169() + 1000L;
      }

   }

   @deob.ObfuscatedName("abl.c(I)I")
   public int method625() {
      return this.field303 == null ? 0 : this.field303.field5550;
   }

   @deob.ObfuscatedName("abl.w(I)I")
   public int method626() {
      return this.field305;
   }

   @deob.ObfuscatedName("abl.q(I)I")
   public int method627() {
      if (this.field303 == null) {
         return 0;
      } else if (!this.field314) {
         return this.field303.field5550;
      } else {
         class674 var1 = this.field297.method14964();
         return var1 == null ? 0 : (int)var1.field6137;
      }
   }

   @deob.ObfuscatedName("abl.y(I)V")
   public void method628() {
      if (this.field291 != null) {
         this.field307 = true;
         if (this.field297 == null) {
            this.field297 = new class849();
         }

      }
   }

   @deob.ObfuscatedName("abl.d(II)V")
   public void method629(int arg0) {
      if (this.field291 != null) {
         for(class674 var2 = this.field311.method14964(); var2 != null; var2 = this.field311.method15006()) {
            if (var2.field6137 == (long)arg0) {
               return;
            }
         }

         class674 var3 = new class674();
         var3.field6137 = (long)arg0;
         this.field311.method14959(var3);
      }
   }

   @deob.ObfuscatedName("abl.b(II)I")
   public int method630(int arg0) {
      class264 var2 = (class264)this.field299.method15322((long)arg0);
      return var2 != null ? var2.method3515() : 0;
   }
}
