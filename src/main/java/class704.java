import java.io.EOFException;
import java.io.IOException;

@deob.ObfuscatedName("on")
public final class class704 {
   @deob.ObfuscatedName("on.n")
   private static byte[] field6491 = new byte[520];
   @deob.ObfuscatedName("on.k")
   private class859 field6492 = null;
   @deob.ObfuscatedName("on.d")
   private class859 field6494 = null;
   @deob.ObfuscatedName("on.r")
   private int field6490 = 65000;
   @deob.ObfuscatedName("on.b")
   private int field6493;

   public class704(int arg0, class859 arg1, class859 arg2, int arg3) {
      this.field6493 = arg0;
      this.field6492 = arg1;
      this.field6494 = arg2;
      this.field6490 = arg3;
   }

   @deob.ObfuscatedName("on.n(II)[B")
   public byte[] method10328(int arg0) {
      class859 var2 = this.field6492;
      synchronized(this.field6492) {
         Object var10000;
         try {
            if (this.field6494.method15139() < (long)(arg0 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.field6494.method15115((long)(arg0 * 6));
            this.field6494.method15118(field6491, 0, 6);
            int var3 = (field6491[2] & 255) + ((field6491[1] & 255) << 8) + ((field6491[0] & 255) << 16);
            int var4 = (field6491[5] & 255) + ((field6491[3] & 255) << 16) + ((field6491[4] & 255) << 8);
            if (var3 < 0 || var3 > this.field6490) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var4 > 0 && (long)var4 <= this.field6492.method15139() / 520L) {
               byte[] var5 = new byte[var3];
               int var6 = 0;
               int var7 = 0;

               while(var6 < var3) {
                  if (var4 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.field6492.method15115((long)(var4 * 520));
                  int var8 = var3 - var6;
                  byte var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  if (arg0 > 65535) {
                     if (var8 > 510) {
                        var8 = 510;
                     }

                     var9 = 10;
                     this.field6492.method15118(field6491, 0, var8 + var9);
                     var10 = (field6491[3] & 255) + ((field6491[2] & 255) << 8) + ((field6491[0] & 255) << 24) + ((field6491[1] & 255) << 16);
                     var11 = ((field6491[4] & 255) << 8) + (field6491[5] & 255);
                     var12 = (field6491[8] & 255) + ((field6491[7] & 255) << 8) + ((field6491[6] & 255) << 16);
                     var13 = field6491[9] & 255;
                  } else {
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     var9 = 8;
                     this.field6492.method15118(field6491, 0, var8 + var9);
                     var10 = ((field6491[0] & 255) << 8) + (field6491[1] & 255);
                     var11 = ((field6491[2] & 255) << 8) + (field6491[3] & 255);
                     var12 = (field6491[6] & 255) + ((field6491[5] & 255) << 8) + ((field6491[4] & 255) << 16);
                     var13 = field6491[7] & 255;
                  }

                  if (arg0 == var10 && var7 == var11 && this.field6493 == var13) {
                     if (var12 >= 0 && (long)var12 <= this.field6492.method15139() / 520L) {
                        int var14 = var8 + var9;

                        for(int var15 = var9; var15 < var14; ++var15) {
                           var5[var6++] = field6491[var15];
                        }

                        var4 = var12;
                        ++var7;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var20 = var5;
               return var20;
            }

            var10000 = null;
         } catch (IOException var18) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   @deob.ObfuscatedName("on.k(I[BIB)Z")
   public boolean method10329(int arg0, byte[] arg1, int arg2) {
      class859 var4 = this.field6492;
      synchronized(this.field6492) {
         if (arg2 >= 0 && arg2 <= this.field6490) {
            boolean var5 = this.method10335(arg0, arg1, arg2, true);
            if (!var5) {
               var5 = this.method10335(arg0, arg1, arg2, false);
            }

            return var5;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @deob.ObfuscatedName("on.d(I[BIZB)Z")
   private boolean method10335(int arg0, byte[] arg1, int arg2, boolean arg3) {
      class859 var5 = this.field6492;
      synchronized(this.field6492) {
         try {
            int var6;
            boolean var10000;
            if (arg3) {
               if (this.field6494.method15139() < (long)(arg0 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field6494.method15115((long)(arg0 * 6));
               this.field6494.method15118(field6491, 0, 6);
               var6 = (field6491[5] & 255) + ((field6491[4] & 255) << 8) + ((field6491[3] & 255) << 16);
               if (var6 <= 0 || (long)var6 > this.field6492.method15139() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.field6492.method15139() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            field6491[0] = (byte)(arg2 >> 16);
            field6491[1] = (byte)(arg2 >> 8);
            field6491[2] = (byte)arg2;
            field6491[3] = (byte)(var6 >> 16);
            field6491[4] = (byte)(var6 >> 8);
            field6491[5] = (byte)var6;
            this.field6494.method15115((long)(arg0 * 6));
            this.field6494.method15122(field6491, 0, 6);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < arg2) {
                  label148: {
                     int var9 = 0;
                     if (arg3) {
                        this.field6492.method15115((long)(var6 * 520));
                        int var11;
                        int var12;
                        int var13;
                        if (arg0 > 65535) {
                           try {
                              this.field6492.method15118(field6491, 0, 10);
                           } catch (EOFException var20) {
                              break label148;
                           }

                           var11 = (field6491[3] & 255) + ((field6491[2] & 255) << 8) + ((field6491[0] & 255) << 24) + ((field6491[1] & 255) << 16);
                           var12 = ((field6491[4] & 255) << 8) + (field6491[5] & 255);
                           var9 = (field6491[8] & 255) + ((field6491[7] & 255) << 8) + ((field6491[6] & 255) << 16);
                           var13 = field6491[9] & 255;
                        } else {
                           try {
                              this.field6492.method15118(field6491, 0, 8);
                           } catch (EOFException var19) {
                              break label148;
                           }

                           var11 = ((field6491[0] & 255) << 8) + (field6491[1] & 255);
                           var12 = ((field6491[2] & 255) << 8) + (field6491[3] & 255);
                           var9 = (field6491[6] & 255) + ((field6491[4] & 255) << 16) + ((field6491[5] & 255) << 8);
                           var13 = field6491[7] & 255;
                        }

                        if (arg0 != var11 || var8 != var12 || this.field6493 != var13) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.field6492.method15139() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var9 == 0) {
                        arg3 = false;
                        var9 = (int)((this.field6492.method15139() + 519L) / 520L);
                        if (var9 == 0) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (arg2 - var7 <= 512) {
                        var9 = 0;
                     }

                     if (arg0 > 65535) {
                        field6491[0] = (byte)(arg0 >> 24);
                        field6491[1] = (byte)(arg0 >> 16);
                        field6491[2] = (byte)(arg0 >> 8);
                        field6491[3] = (byte)arg0;
                        field6491[4] = (byte)(var8 >> 8);
                        field6491[5] = (byte)var8;
                        field6491[6] = (byte)(var9 >> 16);
                        field6491[7] = (byte)(var9 >> 8);
                        field6491[8] = (byte)var9;
                        field6491[9] = (byte)this.field6493;
                        this.field6492.method15115((long)(var6 * 520));
                        this.field6492.method15122(field6491, 0, 10);
                        int var15 = arg2 - var7;
                        if (var15 > 510) {
                           var15 = 510;
                        }

                        this.field6492.method15122(arg1, var7, var15);
                        var7 += var15;
                     } else {
                        field6491[0] = (byte)(arg0 >> 8);
                        field6491[1] = (byte)arg0;
                        field6491[2] = (byte)(var8 >> 8);
                        field6491[3] = (byte)var8;
                        field6491[4] = (byte)(var9 >> 16);
                        field6491[5] = (byte)(var9 >> 8);
                        field6491[6] = (byte)var9;
                        field6491[7] = (byte)this.field6493;
                        this.field6492.method15115((long)(var6 * 520));
                        this.field6492.method15122(field6491, 0, 8);
                        int var16 = arg2 - var7;
                        if (var16 > 512) {
                           var16 = 512;
                        }

                        this.field6492.method15122(arg1, var7, var16);
                        var7 += var16;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var21) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + this.field6493;
   }
}
