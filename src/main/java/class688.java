import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;

@deob.ObfuscatedName("ny")
public abstract class class688 {
   @deob.ObfuscatedName("ny.d")
   private final byte[] field6227;
   @deob.ObfuscatedName("ny.p")
   private final OggSyncState field6222;
   @deob.ObfuscatedName("ny.b")
   private final OggPage field6220;
   @deob.ObfuscatedName("ny.r")
   private final OggPacket field6221;
   @deob.ObfuscatedName("ny.o")
   private final class875 field6223;
   @deob.ObfuscatedName("ny.u")
   private class259 field6228;
   @deob.ObfuscatedName("ny.l")
   private class265 field6217;
   @deob.ObfuscatedName("ny.v")
   private class266 field6231;
   @deob.ObfuscatedName("ny.g")
   private String field6230;
   @deob.ObfuscatedName("ny.h")
   private boolean field6219;
   @deob.ObfuscatedName("ny.a")
   private boolean field6225;
   @deob.ObfuscatedName("ny.s")
   private boolean field6226;
   @deob.ObfuscatedName("ny.x")
   private boolean field6229;

   protected class688(int arg0) {
      if (!class926.method5940().method9973("jagtheora")) {
         throw new RuntimeException("");
      } else {
         this.field6227 = new byte[arg0];
         this.field6222 = new OggSyncState();
         this.field6220 = new OggPage();
         this.field6221 = new OggPacket();
         this.field6223 = new class875(8);
      }
   }

   @deob.ObfuscatedName("ny.k(I)Ladd;")
   private class87 method10062() throws IOException {
      if (this.field6229) {
         throw new IllegalStateException();
      } else if (this.field6226) {
         return null;
      } else {
         while(this.field6222.pageOut(this.field6220) <= 0) {
            int var1 = this.method1928(this.field6227);
            if (var1 == -1) {
               this.field6226 = true;
               return null;
            }

            if (var1 == 0) {
               return null;
            }

            if (!this.field6222.write(this.field6227, var1)) {
               throw new RuntimeException("");
            }
         }

         int var2 = this.field6220.getSerialNumber();
         if (!this.field6220.isBOS()) {
            class87 var9 = (class87)this.field6223.method15322((long)var2);
            if (!var9.field665.pageIn(this.field6220)) {
               throw new IllegalStateException();
            } else {
               return var9;
            }
         } else {
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field6220)) {
               throw new IllegalStateException();
            } else if (var3.packetPeek(this.field6221) != 1) {
               throw new IllegalStateException();
            } else {
               class87 var4;
               if (this.field6217 == null && this.field6221.isTheora()) {
                  this.field6217 = new class265(var3);
                  var4 = this.field6217;
               } else if (this.field6228 == null && this.field6221.isVorbis()) {
                  this.field6228 = new class259(var3);
                  var4 = this.field6228;
               } else {
                  byte[] var5 = this.field6221.getData();
                  StringBuilder var6 = new StringBuilder();

                  for(int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char)var5[var7]); ++var7) {
                     var6.append((char)var5[var7]);
                  }

                  String var8 = var6.toString();
                  if (var8.equals("kate")) {
                     var4 = new class266(var3);
                  } else {
                     var4 = new class255(var3);
                  }
               }

               this.field6223.method15311(var4, (long)var2);
               return var4;
            }
         }
      }
   }

   @deob.ObfuscatedName("ny.d(I)V")
   public void method10063() throws IOException {
      if (!this.field6219) {
         while(!this.field6229) {
            class87 var1;
            if (!this.field6225) {
               var1 = this.method10062();
               if (var1 == null) {
                  if (this.field6226) {
                     this.method10067();
                  }

                  return;
               }

               if (var1 == null) {
                  throw new IllegalStateException();
               }

               this.field6225 = true;
            } else {
               var1 = (class87)this.field6223.method15322((long)this.field6220.getSerialNumber());
            }

            if (this.field6228 != var1) {
               if (var1 instanceof class266) {
                  this.method10065();
               } else if (this.field6217 != var1) {
                  while(var1.field665.packetOut(this.field6221) == 1) {
                     if (var1.field664 == 1 && var1 instanceof class266) {
                        this.method10079(this.field6230);
                     }

                     var1.method1224(this.field6221);
                  }
               } else if (this.field6228 == null && !this.field6219) {
                  for(int var5 = 0; var5 < 10 && this.method10066(); ++var5) {
                     this.method10064();
                     if (this.field6229) {
                        return;
                     }
                  }

                  return;
               }
            } else {
               if (this.field6228.method3483() >= 50) {
                  return;
               }

               while(this.field6228.field665.packetOut(this.field6221) == 1) {
                  this.field6228.method1224(this.field6221);
                  this.method10065();
                  if (this.field6217 != null) {
                     double var2 = this.field6217.method3525();

                     for(int var4 = 0; var4 < 10 && this.method10066(); ++var4) {
                        this.method10064();
                        if (this.field6229) {
                           return;
                        }
                     }

                     if (var2 < this.field6217.method3525()) {
                        return;
                     }
                  }

                  if (this.field6228.method3483() >= 50) {
                     return;
                  }
               }
            }

            this.field6225 = false;
         }

      }
   }

   @deob.ObfuscatedName("ny.b(I)V")
   private void method10064() throws IOException {
      while(this.field6217.field665.packetOut(this.field6221) != 1) {
         class87 var1 = this.method10062();
         if (var1 == null) {
            if (this.field6226) {
               this.method10067();
            }

            return;
         }

         if (this.field6231 == var1) {
            this.method10065();
         }
      }

      this.field6217.method1224(this.field6221);
   }

   @deob.ObfuscatedName("ny.r(I)V")
   private void method10065() {
      for(class87 var1 = (class87)this.field6223.method15313(); var1 != null; var1 = (class87)this.field6223.method15314()) {
         if (var1 instanceof class266) {
            class266 var2 = (class266)var1;

            while((var2.field664 <= 8 || this.method10070() > (double)var2.method3550()) && var2.field665.packetOut(this.field6221) == 1) {
               var2.method1224(this.field6221);
            }
         }
      }

      this.method10079(this.field6230);
   }

   @deob.ObfuscatedName("ny.p(B)Z")
   private boolean method10066() {
      if (this.field6228 != null) {
         return !this.field6217.method3527() || this.method10070() > this.field6217.method3525();
      } else {
         double var1 = (double)this.field6217.method3523();
         return var1 == 0.0D || (double)class431.method2169() >= (double)this.field6217.method3533() + 1000.0D / var1;
      }
   }

   @deob.ObfuscatedName("ny.o(I)V")
   private void method10067() {
      for(class87 var1 = (class87)this.field6223.method15313(); var1 != null; var1 = (class87)this.field6223.method15314()) {
         if (this.field6217 != var1) {
            while(var1.field665.packetOut() == 1) {
               var1.method1224(this.field6221);
            }
         }
      }

      if (this.field6217 != null) {
         for(int var2 = 0; var2 < 10 && this.method10066(); ++var2) {
            if (this.field6217.field665.packetOut() != 1) {
               this.method10073();
               return;
            }

            this.field6217.method1224(this.field6221);
         }

      }
   }

   @deob.ObfuscatedName("ny.a(I)V")
   public void method10073() {
      if (!this.field6229) {
         for(class87 var1 = (class87)this.field6223.method15313(); var1 != null; var1 = (class87)this.field6223.method15314()) {
            var1.method1220();
            var1.field665.method7856();
         }

         this.field6221.method7856();
         this.field6220.method7856();
         this.field6222.method7856();
         this.field6229 = true;
      }
   }

   @deob.ObfuscatedName("ny.x(I)Lajt;")
   public class265 method10069() {
      return this.field6217;
   }

   @deob.ObfuscatedName("ny.s(I)Lajn;")
   public class259 method10071() {
      return this.field6228;
   }

   @deob.ObfuscatedName("ny.l(S)Laju;")
   public class266 method10075() {
      return this.field6231;
   }

   @deob.ObfuscatedName("ny.u(B)Z")
   public boolean method10072() {
      if (!this.field6229 && !this.field6226) {
         return false;
      } else {
         return this.field6228 == null || this.field6228.method3483() <= 0;
      }
   }

   @deob.ObfuscatedName("ny.v(Ljava/lang/String;I)V")
   public void method10079(String arg0) {
      this.field6230 = arg0;
      if (this.field6230 == null) {
         this.field6231 = null;
      } else {
         if (this.field6231 != null && !this.field6230.equals(this.field6231.method3537())) {
            this.field6231 = null;
         }

         if (this.field6231 == null) {
            for(class87 var2 = (class87)this.field6223.method15313(); var2 != null; var2 = (class87)this.field6223.method15314()) {
               if (var2 instanceof class266) {
                  class266 var3 = (class266)var2;
                  if (this.field6230.equals(var3.method3537())) {
                     this.field6231 = var3;
                     return;
                  }
               }
            }
         }

      }
   }

   @deob.ObfuscatedName("ny.g(I)D")
   public double method10070() {
      if (this.field6228 != null) {
         return this.field6228.method3485();
      } else {
         return this.field6217 != null ? this.field6217.method3525() : 0.0D;
      }
   }

   @deob.ObfuscatedName("ny.h(ZB)V")
   public void method10074(boolean arg0) {
      if (this.field6228 != null) {
         class237 var2 = this.field6228.method3484();
         if (var2 != null) {
            var2.method3323(arg0);
         }
      }

      this.field6219 = !this.field6219;
   }

   @deob.ObfuscatedName("ny.n([BI)I")
   protected abstract int method1928(byte[] arg0) throws IOException;
}
