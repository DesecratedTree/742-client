@deob.ObfuscatedName("ml")
public class class648 {
   @deob.ObfuscatedName("ml.am")
   private int field5885;
   @deob.ObfuscatedName("ml.aj")
   private int field5898;
   @deob.ObfuscatedName("ml.au")
   public int field5923;
   @deob.ObfuscatedName("ml.ad")
   public int field5924;
   @deob.ObfuscatedName("ml.ac")
   public int[][] field5878;

   @deob.ObfuscatedName("as.n(IIB)Lml;")
   public static class648 method4010(int arg0, int arg1) {
      class648 var2 = new class648();
      var2.field5923 = -1;
      var2.field5924 = -1;
      var2.field5885 = arg0 + 1 + 5;
      var2.field5898 = arg1 + 1 + 5;
      var2.field5878 = new int[var2.field5885][var2.field5898];
      var2.method9345();
      return var2;
   }

   private class648() {
   }

   @deob.ObfuscatedName("ml.k(I)V")
   public void method9345() {
      for(int var1 = 0; var1 < this.field5885; ++var1) {
         for(int var2 = 0; var2 < this.field5898; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.field5885 - 5 && var2 < this.field5898 - 5) {
               this.field5878[var1][var2] = 2097152;
            } else {
               this.field5878[var1][var2] = -1;
            }
         }
      }

   }

   @deob.ObfuscatedName("ml.d(IIIIZZI)V")
   public void method9358(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
      int var7 = arg0 - this.field5923;
      int var8 = arg1 - this.field5924;
      if (arg2 == 0) {
         if (arg3 == 0) {
            this.method9350(var7, var8, 128);
            this.method9350(var7 - 1, var8, 8);
         }

         if (arg3 == 1) {
            this.method9350(var7, var8, 2);
            this.method9350(var7, var8 + 1, 32);
         }

         if (arg3 == 2) {
            this.method9350(var7, var8, 8);
            this.method9350(var7 + 1, var8, 128);
         }

         if (arg3 == 3) {
            this.method9350(var7, var8, 32);
            this.method9350(var7, var8 - 1, 2);
         }
      }

      if (arg2 == 1 || arg2 == 3) {
         if (arg3 == 0) {
            this.method9350(var7, var8, 1);
            this.method9350(var7 - 1, var8 + 1, 16);
         }

         if (arg3 == 1) {
            this.method9350(var7, var8, 4);
            this.method9350(var7 + 1, var8 + 1, 64);
         }

         if (arg3 == 2) {
            this.method9350(var7, var8, 16);
            this.method9350(var7 + 1, var8 - 1, 1);
         }

         if (arg3 == 3) {
            this.method9350(var7, var8, 64);
            this.method9350(var7 - 1, var8 - 1, 4);
         }
      }

      if (arg2 == 2) {
         if (arg3 == 0) {
            this.method9350(var7, var8, 130);
            this.method9350(var7 - 1, var8, 8);
            this.method9350(var7, var8 + 1, 32);
         }

         if (arg3 == 1) {
            this.method9350(var7, var8, 10);
            this.method9350(var7, var8 + 1, 32);
            this.method9350(var7 + 1, var8, 128);
         }

         if (arg3 == 2) {
            this.method9350(var7, var8, 40);
            this.method9350(var7 + 1, var8, 128);
            this.method9350(var7, var8 - 1, 2);
         }

         if (arg3 == 3) {
            this.method9350(var7, var8, 160);
            this.method9350(var7, var8 - 1, 2);
            this.method9350(var7 - 1, var8, 8);
         }
      }

      if (arg4) {
         if (arg2 == 0) {
            if (arg3 == 0) {
               this.method9350(var7, var8, 65536);
               this.method9350(var7 - 1, var8, 4096);
            }

            if (arg3 == 1) {
               this.method9350(var7, var8, 1024);
               this.method9350(var7, var8 + 1, 16384);
            }

            if (arg3 == 2) {
               this.method9350(var7, var8, 4096);
               this.method9350(var7 + 1, var8, 65536);
            }

            if (arg3 == 3) {
               this.method9350(var7, var8, 16384);
               this.method9350(var7, var8 - 1, 1024);
            }
         }

         if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
               this.method9350(var7, var8, 512);
               this.method9350(var7 - 1, var8 + 1, 8192);
            }

            if (arg3 == 1) {
               this.method9350(var7, var8, 2048);
               this.method9350(var7 + 1, var8 + 1, 32768);
            }

            if (arg3 == 2) {
               this.method9350(var7, var8, 8192);
               this.method9350(var7 + 1, var8 - 1, 512);
            }

            if (arg3 == 3) {
               this.method9350(var7, var8, 32768);
               this.method9350(var7 - 1, var8 - 1, 2048);
            }
         }

         if (arg2 == 2) {
            if (arg3 == 0) {
               this.method9350(var7, var8, 66560);
               this.method9350(var7 - 1, var8, 4096);
               this.method9350(var7, var8 + 1, 16384);
            }

            if (arg3 == 1) {
               this.method9350(var7, var8, 5120);
               this.method9350(var7, var8 + 1, 16384);
               this.method9350(var7 + 1, var8, 65536);
            }

            if (arg3 == 2) {
               this.method9350(var7, var8, 20480);
               this.method9350(var7 + 1, var8, 65536);
               this.method9350(var7, var8 - 1, 1024);
            }

            if (arg3 == 3) {
               this.method9350(var7, var8, 81920);
               this.method9350(var7, var8 - 1, 1024);
               this.method9350(var7 - 1, var8, 4096);
            }
         }
      }

      if (arg5) {
         if (arg2 == 0) {
            if (arg3 == 0) {
               this.method9350(var7, var8, 536870912);
               this.method9350(var7 - 1, var8, 33554432);
            }

            if (arg3 == 1) {
               this.method9350(var7, var8, 8388608);
               this.method9350(var7, var8 + 1, 134217728);
            }

            if (arg3 == 2) {
               this.method9350(var7, var8, 33554432);
               this.method9350(var7 + 1, var8, 536870912);
            }

            if (arg3 == 3) {
               this.method9350(var7, var8, 134217728);
               this.method9350(var7, var8 - 1, 8388608);
            }
         }

         if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
               this.method9350(var7, var8, 4194304);
               this.method9350(var7 - 1, var8 + 1, 67108864);
            }

            if (arg3 == 1) {
               this.method9350(var7, var8, 16777216);
               this.method9350(var7 + 1, var8 + 1, 268435456);
            }

            if (arg3 == 2) {
               this.method9350(var7, var8, 67108864);
               this.method9350(var7 + 1, var8 - 1, 4194304);
            }

            if (arg3 == 3) {
               this.method9350(var7, var8, 268435456);
               this.method9350(var7 - 1, var8 - 1, 16777216);
            }
         }

         if (arg2 == 2) {
            if (arg3 == 0) {
               this.method9350(var7, var8, 545259520);
               this.method9350(var7 - 1, var8, 33554432);
               this.method9350(var7, var8 + 1, 134217728);
            }

            if (arg3 == 1) {
               this.method9350(var7, var8, 41943040);
               this.method9350(var7, var8 + 1, 134217728);
               this.method9350(var7 + 1, var8, 536870912);
            }

            if (arg3 == 2) {
               this.method9350(var7, var8, 167772160);
               this.method9350(var7 + 1, var8, 536870912);
               this.method9350(var7, var8 - 1, 8388608);
            }

            if (arg3 == 3) {
               this.method9350(var7, var8, 671088640);
               this.method9350(var7, var8 - 1, 8388608);
               this.method9350(var7 - 1, var8, 33554432);
            }
         }
      }

   }

   @deob.ObfuscatedName("ml.b(IIIIZZI)V")
   public void method9351(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
      int var7 = 256;
      if (arg4) {
         var7 |= 131072;
      }

      if (arg5) {
         var7 |= 1073741824;
      }

      int var8 = arg0 - this.field5923;
      int var9 = arg1 - this.field5924;

      for(int var10 = var8; var10 < arg2 + var8; ++var10) {
         if (var10 >= 0 && var10 < this.field5885) {
            for(int var11 = var9; var11 < arg3 + var9; ++var11) {
               if (var11 >= 0 && var11 < this.field5898) {
                  this.method9350(var10, var11, var7);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ml.r(IIS)V")
   public void method9348(int arg0, int arg1) {
      int var3 = arg0 - this.field5923;
      int var4 = arg1 - this.field5924;
      this.field5878[var3][var4] |= 2097152;
   }

   @deob.ObfuscatedName("ml.p(III)V")
   public void method9349(int arg0, int arg1) {
      int var3 = arg0 - this.field5923;
      int var4 = arg1 - this.field5924;
      this.field5878[var3][var4] |= 262144;
   }

   @deob.ObfuscatedName("ml.o(IIIB)V")
   private void method9350(int arg0, int arg1, int arg2) {
      this.field5878[arg0][arg1] |= arg2;
   }

   @deob.ObfuscatedName("ml.a(IIIIZZI)V")
   public void method9344(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
      int var7 = arg0 - this.field5923;
      int var8 = arg1 - this.field5924;
      if (arg2 == 0) {
         if (arg3 == 0) {
            this.method9379(var7, var8, 128);
            this.method9379(var7 - 1, var8, 8);
         }

         if (arg3 == 1) {
            this.method9379(var7, var8, 2);
            this.method9379(var7, var8 + 1, 32);
         }

         if (arg3 == 2) {
            this.method9379(var7, var8, 8);
            this.method9379(var7 + 1, var8, 128);
         }

         if (arg3 == 3) {
            this.method9379(var7, var8, 32);
            this.method9379(var7, var8 - 1, 2);
         }
      }

      if (arg2 == 1 || arg2 == 3) {
         if (arg3 == 0) {
            this.method9379(var7, var8, 1);
            this.method9379(var7 - 1, var8 + 1, 16);
         }

         if (arg3 == 1) {
            this.method9379(var7, var8, 4);
            this.method9379(var7 + 1, var8 + 1, 64);
         }

         if (arg3 == 2) {
            this.method9379(var7, var8, 16);
            this.method9379(var7 + 1, var8 - 1, 1);
         }

         if (arg3 == 3) {
            this.method9379(var7, var8, 64);
            this.method9379(var7 - 1, var8 - 1, 4);
         }
      }

      if (arg2 == 2) {
         if (arg3 == 0) {
            this.method9379(var7, var8, 130);
            this.method9379(var7 - 1, var8, 8);
            this.method9379(var7, var8 + 1, 32);
         }

         if (arg3 == 1) {
            this.method9379(var7, var8, 10);
            this.method9379(var7, var8 + 1, 32);
            this.method9379(var7 + 1, var8, 128);
         }

         if (arg3 == 2) {
            this.method9379(var7, var8, 40);
            this.method9379(var7 + 1, var8, 128);
            this.method9379(var7, var8 - 1, 2);
         }

         if (arg3 == 3) {
            this.method9379(var7, var8, 160);
            this.method9379(var7, var8 - 1, 2);
            this.method9379(var7 - 1, var8, 8);
         }
      }

      if (arg4) {
         if (arg2 == 0) {
            if (arg3 == 0) {
               this.method9379(var7, var8, 65536);
               this.method9379(var7 - 1, var8, 4096);
            }

            if (arg3 == 1) {
               this.method9379(var7, var8, 1024);
               this.method9379(var7, var8 + 1, 16384);
            }

            if (arg3 == 2) {
               this.method9379(var7, var8, 4096);
               this.method9379(var7 + 1, var8, 65536);
            }

            if (arg3 == 3) {
               this.method9379(var7, var8, 16384);
               this.method9379(var7, var8 - 1, 1024);
            }
         }

         if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
               this.method9379(var7, var8, 512);
               this.method9379(var7 - 1, var8 + 1, 8192);
            }

            if (arg3 == 1) {
               this.method9379(var7, var8, 2048);
               this.method9379(var7 + 1, var8 + 1, 32768);
            }

            if (arg3 == 2) {
               this.method9379(var7, var8, 8192);
               this.method9379(var7 + 1, var8 - 1, 512);
            }

            if (arg3 == 3) {
               this.method9379(var7, var8, 32768);
               this.method9379(var7 - 1, var8 - 1, 2048);
            }
         }

         if (arg2 == 2) {
            if (arg3 == 0) {
               this.method9379(var7, var8, 66560);
               this.method9379(var7 - 1, var8, 4096);
               this.method9379(var7, var8 + 1, 16384);
            }

            if (arg3 == 1) {
               this.method9379(var7, var8, 5120);
               this.method9379(var7, var8 + 1, 16384);
               this.method9379(var7 + 1, var8, 65536);
            }

            if (arg3 == 2) {
               this.method9379(var7, var8, 20480);
               this.method9379(var7 + 1, var8, 65536);
               this.method9379(var7, var8 - 1, 1024);
            }

            if (arg3 == 3) {
               this.method9379(var7, var8, 81920);
               this.method9379(var7, var8 - 1, 1024);
               this.method9379(var7 - 1, var8, 4096);
            }
         }
      }

      if (arg5) {
         if (arg2 == 0) {
            if (arg3 == 0) {
               this.method9379(var7, var8, 536870912);
               this.method9379(var7 - 1, var8, 33554432);
            }

            if (arg3 == 1) {
               this.method9379(var7, var8, 8388608);
               this.method9379(var7, var8 + 1, 134217728);
            }

            if (arg3 == 2) {
               this.method9379(var7, var8, 33554432);
               this.method9379(var7 + 1, var8, 536870912);
            }

            if (arg3 == 3) {
               this.method9379(var7, var8, 134217728);
               this.method9379(var7, var8 - 1, 8388608);
            }
         }

         if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
               this.method9379(var7, var8, 4194304);
               this.method9379(var7 - 1, var8 + 1, 67108864);
            }

            if (arg3 == 1) {
               this.method9379(var7, var8, 16777216);
               this.method9379(var7 + 1, var8 + 1, 268435456);
            }

            if (arg3 == 2) {
               this.method9379(var7, var8, 67108864);
               this.method9379(var7 + 1, var8 - 1, 4194304);
            }

            if (arg3 == 3) {
               this.method9379(var7, var8, 268435456);
               this.method9379(var7 - 1, var8 - 1, 16777216);
            }
         }

         if (arg2 == 2) {
            if (arg3 == 0) {
               this.method9379(var7, var8, 545259520);
               this.method9379(var7 - 1, var8, 33554432);
               this.method9379(var7, var8 + 1, 134217728);
            }

            if (arg3 == 1) {
               this.method9379(var7, var8, 41943040);
               this.method9379(var7, var8 + 1, 134217728);
               this.method9379(var7 + 1, var8, 536870912);
            }

            if (arg3 == 2) {
               this.method9379(var7, var8, 167772160);
               this.method9379(var7 + 1, var8, 536870912);
               this.method9379(var7, var8 - 1, 8388608);
            }

            if (arg3 == 3) {
               this.method9379(var7, var8, 671088640);
               this.method9379(var7, var8 - 1, 8388608);
               this.method9379(var7 - 1, var8, 33554432);
            }
         }
      }

   }

   @deob.ObfuscatedName("ml.x(IIIIIZZB)V")
   public void method9352(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
      int var8 = 256;
      if (arg5) {
         var8 |= 131072;
      }

      if (arg6) {
         var8 |= 1073741824;
      }

      int var9 = arg0 - this.field5923;
      int var10 = arg1 - this.field5924;
      if (arg4 == 1 || arg4 == 3) {
         int var11 = arg2;
         arg2 = arg3;
         arg3 = var11;
      }

      for(int var12 = var9; var12 < arg2 + var9; ++var12) {
         if (var12 >= 0 && var12 < this.field5885) {
            for(int var13 = var10; var13 < arg3 + var10; ++var13) {
               if (var13 >= 0 && var13 < this.field5898) {
                  this.method9379(var12, var13, var8);
               }
            }
         }
      }

   }

   @deob.ObfuscatedName("ml.s(IIII)V")
   private void method9379(int arg0, int arg1, int arg2) {
      this.field5878[arg0][arg1] &= ~arg2;
   }

   @deob.ObfuscatedName("ml.l(IIB)V")
   public void method9354(int arg0, int arg1) {
      int var3 = arg0 - this.field5923;
      int var4 = arg1 - this.field5924;
      this.field5878[var3][var4] &= -2097153;
   }

   @deob.ObfuscatedName("ml.u(III)V")
   public void method9355(int arg0, int arg1) {
      int var3 = arg0 - this.field5923;
      int var4 = arg1 - this.field5924;
      this.field5878[var3][var4] &= -262145;
   }

   @deob.ObfuscatedName("ml.v(IIIIIIIB)Z")
   public boolean method9356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (arg2 == 1) {
         if (arg0 == arg3 && arg1 == arg4) {
            return true;
         }
      } else if (arg3 >= arg0 && arg3 <= arg0 + arg2 - 1 && arg4 >= arg4 && arg4 <= arg2 + arg4 - 1) {
         return true;
      }

      int var8 = arg0 - this.field5923;
      int var9 = arg1 - this.field5924;
      int var10 = arg3 - this.field5923;
      int var11 = arg4 - this.field5924;
      if (arg2 == 1) {
         if (arg5 == 0) {
            if (arg6 == 0) {
               if (var10 - 1 == var8 && var9 == var11) {
                  return true;
               }

               if (var8 == var10 && var11 + 1 == var9 && (this.field5878[var8][var9] & 2883872) == 0) {
                  return true;
               }

               if (var8 == var10 && var11 - 1 == var9 && (this.field5878[var8][var9] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 1) {
               if (var8 == var10 && var11 + 1 == var9) {
                  return true;
               }

               if (var10 - 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883848) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883968) == 0) {
                  return true;
               }
            } else if (arg6 == 2) {
               if (var10 + 1 == var8 && var9 == var11) {
                  return true;
               }

               if (var8 == var10 && var11 + 1 == var9 && (this.field5878[var8][var9] & 2883872) == 0) {
                  return true;
               }

               if (var8 == var10 && var11 - 1 == var9 && (this.field5878[var8][var9] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 3) {
               if (var8 == var10 && var11 - 1 == var9) {
                  return true;
               }

               if (var10 - 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883848) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883968) == 0) {
                  return true;
               }
            }
         }

         if (arg5 == 2) {
            if (arg6 == 0) {
               if (var10 - 1 == var8 && var9 == var11) {
                  return true;
               }

               if (var8 == var10 && var11 + 1 == var9) {
                  return true;
               }

               if (var10 + 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883968) == 0) {
                  return true;
               }

               if (var8 == var10 && var11 - 1 == var9 && (this.field5878[var8][var9] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 1) {
               if (var10 - 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883848) == 0) {
                  return true;
               }

               if (var8 == var10 && var11 + 1 == var9) {
                  return true;
               }

               if (var10 + 1 == var8 && var9 == var11) {
                  return true;
               }

               if (var8 == var10 && var11 - 1 == var9 && (this.field5878[var8][var9] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 2) {
               if (var10 - 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883848) == 0) {
                  return true;
               }

               if (var8 == var10 && var11 + 1 == var9 && (this.field5878[var8][var9] & 2883872) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var9 == var11) {
                  return true;
               }

               if (var8 == var10 && var11 - 1 == var9) {
                  return true;
               }
            } else if (arg6 == 3) {
               if (var10 - 1 == var8 && var9 == var11) {
                  return true;
               }

               if (var8 == var10 && var11 + 1 == var9 && (this.field5878[var8][var9] & 2883872) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 2883968) == 0) {
                  return true;
               }

               if (var8 == var10 && var11 - 1 == var9) {
                  return true;
               }
            }
         }

         if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field5878[var8][var9] & 32) == 0) {
               return true;
            }

            if (var8 == var10 && var11 - 1 == var9 && (this.field5878[var8][var9] & 2) == 0) {
               return true;
            }

            if (var10 - 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 8) == 0) {
               return true;
            }

            if (var10 + 1 == var8 && var9 == var11 && (this.field5878[var8][var9] & 128) == 0) {
               return true;
            }
         }
      } else {
         int var12 = arg2 + var8 - 1;
         int var13 = arg2 + var9 - 1;
         if (arg5 == 0) {
            if (arg6 == 0) {
               if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field5878[var10][var9] & 2883872) == 0) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field5878[var10][var13] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 1) {
               if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9) {
                  return true;
               }

               if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var12][var11] & 2883848) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var8][var11] & 2883968) == 0) {
                  return true;
               }
            } else if (arg6 == 2) {
               if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field5878[var10][var9] & 2883872) == 0) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field5878[var10][var13] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 3) {
               if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9) {
                  return true;
               }

               if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var12][var11] & 2883848) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var8][var11] & 2883968) == 0) {
                  return true;
               }
            }
         }

         if (arg5 == 2) {
            if (arg6 == 0) {
               if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9) {
                  return true;
               }

               if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var8][var11] & 2883968) == 0) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field5878[var10][var13] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 1) {
               if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var12][var11] & 2883848) == 0) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9) {
                  return true;
               }

               if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field5878[var10][var13] & 2883842) == 0) {
                  return true;
               }
            } else if (arg6 == 2) {
               if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var12][var11] & 2883848) == 0) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field5878[var10][var9] & 2883872) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9) {
                  return true;
               }
            } else if (arg6 == 3) {
               if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field5878[var10][var9] & 2883872) == 0) {
                  return true;
               }

               if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var8][var11] & 2883968) == 0) {
                  return true;
               }

               if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9) {
                  return true;
               }
            }
         }

         if (arg5 == 9) {
            if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field5878[var10][var9] & 2883872) == 0) {
               return true;
            }

            if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field5878[var10][var13] & 2883842) == 0) {
               return true;
            }

            if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var12][var11] & 2883848) == 0) {
               return true;
            }

            if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field5878[var8][var11] & 2883968) == 0) {
               return true;
            }
         }
      }

      return false;
   }

   @deob.ObfuscatedName("ml.g(IIIIIIIIB)Z")
   public boolean method9357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg2 > 1) {
         return method6584(arg0, arg1, arg2, arg2, arg3, arg4, arg5, arg6) ? true : this.method9388(arg0, arg1, arg2, arg2, arg3, arg4, arg5, arg6, arg7);
      } else {
         int var9 = arg3 + arg5 - 1;
         int var10 = arg4 + arg6 - 1;
         if (arg0 >= arg3 && arg0 <= var9 && arg1 >= arg4 && arg1 <= var10) {
            return true;
         } else if (arg3 - 1 == arg0 && arg1 >= arg4 && arg1 <= var10 && (this.field5878[arg0 - this.field5923][arg1 - this.field5924] & 8) == 0 && (arg7 & 8) == 0) {
            return true;
         } else if (var9 + 1 == arg0 && arg1 >= arg4 && arg1 <= var10 && (this.field5878[arg0 - this.field5923][arg1 - this.field5924] & 128) == 0 && (arg7 & 2) == 0) {
            return true;
         } else if (arg4 - 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (this.field5878[arg0 - this.field5923][arg1 - this.field5924] & 2) == 0 && (arg7 & 4) == 0) {
            return true;
         } else {
            return var10 + 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (this.field5878[arg0 - this.field5923][arg1 - this.field5924] & 32) == 0 && (arg7 & 1) == 0;
         }
      }
   }

   @deob.ObfuscatedName("ml.h(IIIIIIIIIB)Z")
   public boolean method9388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg0 + arg2;
      int var11 = arg1 + arg3;
      int var12 = arg4 + arg6;
      int var13 = arg5 + arg7;
      if (arg0 == var12 && (arg8 & 2) == 0) {
         int var14 = arg1 > arg5 ? arg1 : arg5;
         int var15 = var11 < var13 ? var11 : var13;

         while(var14 < var15) {
            if ((this.field5878[var12 - 1 - this.field5923][var14 - this.field5924] & 8) == 0) {
               return true;
            }

            ++var14;
         }
      } else if (arg4 == var10 && (arg8 & 8) == 0) {
         int var16 = arg1 > arg5 ? arg1 : arg5;
         int var17 = var11 < var13 ? var11 : var13;

         while(var16 < var17) {
            if ((this.field5878[arg4 - this.field5923][var16 - this.field5924] & 128) == 0) {
               return true;
            }

            ++var16;
         }
      } else if (arg1 == var13 && (arg8 & 1) == 0) {
         int var18 = arg0 > arg4 ? arg0 : arg4;
         int var19 = var10 < var12 ? var10 : var12;

         while(var18 < var19) {
            if ((this.field5878[var18 - this.field5923][var13 - 1 - this.field5924] & 2) == 0) {
               return true;
            }

            ++var18;
         }
      } else if (arg5 == var11 && (arg8 & 4) == 0) {
         int var20 = arg0 > arg4 ? arg0 : arg4;
         int var21 = var10 < var12 ? var10 : var12;

         while(var20 < var21) {
            if ((this.field5878[var20 - this.field5923][arg5 - this.field5924] & 32) == 0) {
               return true;
            }

            ++var20;
         }
      }

      return false;
   }

   @deob.ObfuscatedName("gb.e(IIIIIIIII)Z")
   public static boolean method6584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg0 < arg4 + arg6 && arg4 < arg0 + arg2) {
         return arg1 < arg5 + arg7 && arg5 < arg1 + arg3;
      } else {
         return false;
      }
   }
}
