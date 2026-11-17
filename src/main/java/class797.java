@deob.ObfuscatedName("rz")
public class class797 {
   @deob.ObfuscatedName("rz.k")
   public int field7273 = 4;
   @deob.ObfuscatedName("rz.d")
   public int[] field7277 = null;
   @deob.ObfuscatedName("rz.b")
   public int[] field7275 = null;
   @deob.ObfuscatedName("rz.p")
   public int field7293 = 4;
   @deob.ObfuscatedName("rz.a")
   public int field7272 = 4;
   @deob.ObfuscatedName("rz.s")
   public int field7281 = 7;
   @deob.ObfuscatedName("rz.l")
   public int field7287 = -1;
   @deob.ObfuscatedName("rz.g")
   public boolean field7285 = true;
   @deob.ObfuscatedName("rz.z")
   public boolean field7288 = true;
   @deob.ObfuscatedName("rz.m")
   public int field7289 = 2;
   @deob.ObfuscatedName("rz.i")
   public boolean field7290 = true;
   @deob.ObfuscatedName("rz.t")
   public int field7278 = 3;
   @deob.ObfuscatedName("rz.c")
   public int field7292 = -1;
   @deob.ObfuscatedName("rz.w")
   public int field7291 = -1;
   @deob.ObfuscatedName("rz.u")
   public int field7283;
   @deob.ObfuscatedName("rz.v")
   public int field7284;
   @deob.ObfuscatedName("rz.h")
   public short[][] field7286;
   @deob.ObfuscatedName("rz.e")
   public short[][][] field7274;

   public class797(class612 arg0) {
      byte[] var2 = arg0.method8809(class780.field7152.field7155);
      this.method14221(new class124(var2));
   }

   @deob.ObfuscatedName("rz.n(Laen;I)V")
   private void method14221(class124 arg0) {
      boolean var2 = false;

      while(true) {
         while(true) {
            int var3 = arg0.method1688();
            if (var3 == 0) {
               if (!var2) {
                  if (this.field7277 == null) {
                     this.field7273 = 4;
                     this.field7277 = new int[4];
                     this.field7275 = new int[4];
                  }

                  for(int var4 = 0; var4 < this.field7277.length; ++var4) {
                     this.field7277[var4] = 0;
                     this.field7275[var4] = var4 * 20;
                  }
               }

               return;
            }

            if (var3 == 1) {
               if (this.field7277 == null) {
                  this.field7273 = 4;
                  this.field7277 = new int[4];
                  this.field7275 = new int[4];
               }

               for(int var5 = 0; var5 < this.field7277.length; ++var5) {
                  this.field7277[var5] = arg0.method1723();
                  this.field7275[var5] = arg0.method1723();
               }

               var2 = true;
            } else if (var3 == 2) {
               this.field7287 = arg0.method1608();
            } else if (var3 == 3) {
               this.field7273 = arg0.method1688();
               this.field7277 = new int[this.field7273];
               this.field7275 = new int[this.field7273];
            } else if (var3 == 4) {
               this.field7285 = false;
            } else if (var3 == 5) {
               this.field7283 = arg0.method1589();
            } else if (var3 == 6) {
               this.field7284 = arg0.method1589();
            } else if (var3 != 7) {
               if (var3 == 8) {
                  this.field7288 = false;
               } else if (var3 == 9) {
                  this.field7289 = arg0.method1688();
               } else if (var3 == 10) {
                  this.field7290 = false;
               } else if (var3 == 11) {
                  this.field7278 = arg0.method1688();
               } else if (var3 == 12) {
                  this.field7292 = arg0.method1587();
                  this.field7291 = arg0.method1587();
               } else if (var3 == 13) {
                  this.field7272 = arg0.method1688();
               } else if (var3 == 14) {
                  this.field7293 = arg0.method1688();
               } else if (var3 == 15) {
                  this.field7281 = arg0.method1688();
               }
            } else {
               this.field7286 = new short[10][4];
               this.field7274 = new short[10][4][];

               for(int var6 = 0; var6 < 10; ++var6) {
                  for(int var7 = 0; var7 < 4; ++var7) {
                     int var8 = arg0.method1587();
                     if (var8 == 65535) {
                        var8 = -1;
                     }

                     this.field7286[var6][var7] = (short)var8;
                     int var9 = arg0.method1587();
                     this.field7274[var6][var7] = new short[var9];

                     for(int var10 = 0; var10 < var9; ++var10) {
                        int var11 = arg0.method1587();
                        if (var11 == 65535) {
                           var11 = -1;
                        }

                        this.field7274[var6][var7][var10] = (short)var11;
                     }
                  }
               }
            }
         }
      }
   }
}
