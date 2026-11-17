@deob.ObfuscatedName("gq")
public class class483 {
   @deob.ObfuscatedName("gq.r")
   public int field3925 = 0;
   @deob.ObfuscatedName("gq.p")
   public String field3912 = null;
   @deob.ObfuscatedName("gq.o")
   private int field3913 = 0;
   @deob.ObfuscatedName("gq.i")
   public int field3920 = -1;
   @deob.ObfuscatedName("gq.t")
   public int field3918 = -1;
   @deob.ObfuscatedName("gq.l")
   public byte field3917;
   @deob.ObfuscatedName("gq.x")
   public byte field3926;
   @deob.ObfuscatedName("gq.s")
   public byte field3929;
   @deob.ObfuscatedName("gq.u")
   public byte field3933;
   @deob.ObfuscatedName("gq.v")
   public int field3911;
   @deob.ObfuscatedName("gq.c")
   public int field3919;
   @deob.ObfuscatedName("gq.b")
   public long field3910;
   @deob.ObfuscatedName("gq.j")
   private class875 field3931;
   @deob.ObfuscatedName("gq.k")
   private boolean field3908;
   @deob.ObfuscatedName("gq.d")
   private boolean field3909;
   @deob.ObfuscatedName("gq.a")
   public boolean field3914;
   @deob.ObfuscatedName("gq.h")
   public byte[] field3921;
   @deob.ObfuscatedName("gq.e")
   private int[] field3922;
   @deob.ObfuscatedName("gq.z")
   private int[] field3923;
   @deob.ObfuscatedName("gq.m")
   public int[] field3924;
   @deob.ObfuscatedName("gq.w")
   private long[] field3928;
   @deob.ObfuscatedName("gq.g")
   private long[] field3932;
   @deob.ObfuscatedName("gq.q")
   public String[] field3907;
   @deob.ObfuscatedName("gq.y")
   public String[] field3930;

   public class483(class124 arg0) {
      this.method6853(arg0);
   }

   @deob.ObfuscatedName("gq.n(II)V")
   private void method6792(int arg0) {
      if (this.field3908) {
         if (this.field3932 != null) {
            class803.method14283(this.field3932, 0, this.field3932 = new long[arg0], 0, this.field3911);
         } else {
            this.field3932 = new long[arg0];
         }
      }

      if (this.field3909) {
         if (this.field3907 != null) {
            class803.method14271(this.field3907, 0, this.field3907 = new String[arg0], 0, this.field3911);
         } else {
            this.field3907 = new String[arg0];
         }
      }

      if (this.field3921 != null) {
         class803.method14264(this.field3921, 0, this.field3921 = new byte[arg0], 0, this.field3911);
      } else {
         this.field3921 = new byte[arg0];
      }

      if (this.field3923 != null) {
         class803.method14267(this.field3923, 0, this.field3923 = new int[arg0], 0, this.field3911);
      } else {
         this.field3923 = new int[arg0];
      }

      if (this.field3924 != null) {
         class803.method14267(this.field3924, 0, this.field3924 = new int[arg0], 0, this.field3911);
      } else {
         this.field3924 = new int[arg0];
      }

   }

   @deob.ObfuscatedName("gq.k(IB)V")
   private void method6793(int arg0) {
      if (this.field3908) {
         if (this.field3928 != null) {
            class803.method14283(this.field3928, 0, this.field3928 = new long[arg0], 0, this.field3919);
         } else {
            this.field3928 = new long[arg0];
         }
      }

      if (this.field3909) {
         if (this.field3930 != null) {
            class803.method14271(this.field3930, 0, this.field3930 = new String[arg0], 0, this.field3919);
         } else {
            this.field3930 = new String[arg0];
         }
      }

   }

   @deob.ObfuscatedName("gq.d(Ljava/lang/String;B)I")
   public int method6821(String arg0) {
      if (arg0 != null && arg0.length() != 0) {
         for(int var2 = 0; var2 < this.field3911; ++var2) {
            if (this.field3907[var2].equals(arg0)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @deob.ObfuscatedName("gq.b(IIIB)I")
   public int method6841(int arg0, int arg1, int arg2) {
      int var4 = arg2 == 31 ? -1 : (1 << arg2 + 1) - 1;
      return (this.field3923[arg0] & var4) >>> arg1;
   }

   @deob.ObfuscatedName("gq.r(II)Ljava/lang/Integer;")
   public Integer method6799(int arg0) {
      if (this.field3931 == null) {
         return null;
      } else {
         class674 var2 = this.field3931.method15322((long)arg0);
         return var2 != null && var2 instanceof class108 ? new Integer(((class108)var2).field811) : null;
      }
   }

   @deob.ObfuscatedName("gq.p(IIIS)Ljava/lang/Integer;")
   public Integer method6797(int arg0, int arg1, int arg2) {
      if (this.field3931 == null) {
         return null;
      } else {
         class674 var4 = this.field3931.method15322((long)arg0);
         if (var4 != null && var4 instanceof class108) {
            int var5 = arg2 == 31 ? -1 : (1 << arg2 + 1) - 1;
            return new Integer((((class108)var4).field811 & var5) >>> arg1);
         } else {
            return null;
         }
      }
   }

   @deob.ObfuscatedName("gq.o(II)Ljava/lang/Long;")
   public Long method6798(int arg0) {
      if (this.field3931 == null) {
         return null;
      } else {
         class674 var2 = this.field3931.method15322((long)arg0);
         return var2 != null && var2 instanceof class97 ? new Long(((class97)var2).field730) : null;
      }
   }

   @deob.ObfuscatedName("gq.a(IB)Ljava/lang/String;")
   public String method6831(int arg0) {
      if (this.field3931 == null) {
         return null;
      } else {
         class674 var2 = this.field3931.method15322((long)arg0);
         return var2 != null && var2 instanceof class106 ? (String)((class106)var2).field807 : null;
      }
   }

   @deob.ObfuscatedName("gq.x(I)[I")
   public int[] method6800() {
      if (this.field3922 == null) {
         String[] var1 = new String[this.field3911];
         this.field3922 = new int[this.field3911];
         int var2 = 0;

         while(var2 < this.field3911) {
            var1[var2] = this.field3907[var2];
            this.field3922[var2] = var2++;
         }

         class781.method6216(var1, this.field3922);
      }

      return this.field3922;
   }

   @deob.ObfuscatedName("gq.s(JLjava/lang/String;IB)V")
   public void method6801(long arg0, String arg1, int arg2) {
      if (arg1 != null && arg1.length() == 0) {
         arg1 = null;
      }

      if (arg0 > 0L != this.field3908) {
         throw new RuntimeException("");
      } else if (this.field3909 != (arg1 != null)) {
         throw new RuntimeException("");
      } else {
         if (arg0 > 0L && (this.field3932 == null || this.field3911 >= this.field3932.length) || arg1 != null && (this.field3907 == null || this.field3911 >= this.field3907.length)) {
            this.method6792(this.field3911 + 5);
         }

         if (this.field3932 != null) {
            this.field3932[this.field3911] = arg0;
         }

         if (this.field3907 != null) {
            this.field3907[this.field3911] = arg1;
         }

         if (this.field3920 == -1) {
            this.field3920 = this.field3911;
            this.field3921[this.field3911] = 126;
         } else {
            this.field3921[this.field3911] = 0;
         }

         this.field3923[this.field3911] = 0;
         this.field3924[this.field3911] = arg2;
         ++this.field3911;
         this.field3922 = null;
      }
   }

   @deob.ObfuscatedName("gq.l(II)V")
   public void method6794(int arg0) {
      if (arg0 >= 0 && arg0 < this.field3911) {
         --this.field3911;
         this.field3922 = null;
         if (this.field3911 == 0) {
            this.field3932 = null;
            this.field3907 = null;
            this.field3921 = null;
            this.field3923 = null;
            this.field3924 = null;
            this.field3920 = -1;
            this.field3918 = -1;
         } else {
            class803.method14264(this.field3921, arg0 + 1, this.field3921, arg0, this.field3911 - arg0);
            class803.method14267(this.field3923, arg0 + 1, this.field3923, arg0, this.field3911 - arg0);
            class803.method14267(this.field3924, arg0 + 1, this.field3924, arg0, this.field3911 - arg0);
            if (this.field3932 != null) {
               class803.method14283(this.field3932, arg0 + 1, this.field3932, arg0, this.field3911 - arg0);
            }

            if (this.field3907 != null) {
               class803.method14271(this.field3907, arg0 + 1, this.field3907, arg0, this.field3911 - arg0);
            }

            if (this.field3920 == arg0 || this.field3918 == arg0) {
               this.method6803();
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @deob.ObfuscatedName("gq.u(B)V")
   private void method6803() {
      if (this.field3911 == 0) {
         this.field3920 = -1;
         this.field3918 = -1;
      } else {
         this.field3920 = -1;
         this.field3918 = -1;
         int var1 = 0;
         byte var2 = this.field3921[0];

         for(int var3 = 1; var3 < this.field3911; ++var3) {
            if (this.field3921[var3] > var2) {
               if (var2 == 125) {
                  this.field3918 = var1;
               }

               var1 = var3;
               var2 = this.field3921[var3];
            } else if (this.field3918 == -1 && this.field3921[var3] == 125) {
               this.field3918 = var3;
            }
         }

         this.field3920 = var1;
         if (this.field3920 != -1) {
            this.field3921[this.field3920] = 126;
         }

      }
   }

   @deob.ObfuscatedName("gq.v(JLjava/lang/String;I)V")
   public void method6823(long arg0, String arg1) {
      if (arg1 != null && arg1.length() == 0) {
         arg1 = null;
      }

      if (arg0 > 0L != this.field3908) {
         throw new RuntimeException("");
      } else if (arg1 != null != this.field3909) {
         throw new RuntimeException("");
      } else {
         if (arg0 > 0L && (this.field3928 == null || this.field3919 >= this.field3928.length) || arg1 != null && (this.field3930 == null || this.field3919 >= this.field3930.length)) {
            this.method6793(this.field3919 + 5);
         }

         if (this.field3928 != null) {
            this.field3928[this.field3919] = arg0;
         }

         if (this.field3930 != null) {
            this.field3930[this.field3919] = arg1;
         }

         ++this.field3919;
      }
   }

   @deob.ObfuscatedName("gq.g(IS)V")
   public void method6805(int arg0) {
      --this.field3919;
      if (this.field3919 == 0) {
         this.field3928 = null;
         this.field3930 = null;
      } else {
         if (this.field3928 != null) {
            class803.method14283(this.field3928, arg0 + 1, this.field3928, arg0, this.field3919 - arg0);
         }

         if (this.field3930 != null) {
            class803.method14271(this.field3930, arg0 + 1, this.field3930, arg0, this.field3919 - arg0);
         }
      }

   }

   @deob.ObfuscatedName("gq.h(IBB)I")
   public int method6807(int arg0, byte arg1) {
      if (arg1 != 126 && arg1 != 127) {
         if (this.field3920 == arg0 && (this.field3918 == -1 || this.field3921[this.field3918] < 125)) {
            return -1;
         } else if (this.field3921[arg0] == arg1) {
            return -1;
         } else {
            this.field3921[arg0] = arg1;
            this.method6803();
            return arg0;
         }
      } else {
         return -1;
      }
   }

   @deob.ObfuscatedName("gq.e(IIIIB)I")
   public int method6808(int arg0, int arg1, int arg2, int arg3) {
      int var5 = (1 << arg2) - 1;
      int var6 = arg3 == 31 ? -1 : (1 << arg3 + 1) - 1;
      int var7 = var6 ^ var5;
      int var8 = arg1 << arg2;
      int var9 = var8 & var7;
      int var10 = this.field3923[arg0];
      if ((var10 & var7) == var9) {
         return -1;
      } else {
         int var11 = var10 & ~var7;
         this.field3923[arg0] = var11 | var9;
         return arg0;
      }
   }

   @deob.ObfuscatedName("gq.z(III)Z")
   public boolean method6791(int arg0, int arg1) {
      if (this.field3931 != null) {
         class674 var3 = this.field3931.method15322((long)arg0);
         if (var3 != null) {
            if (var3 instanceof class108) {
               class108 var4 = (class108)var3;
               if (var4.field811 == arg1) {
                  return false;
               }

               var4.field811 = arg1;
               return true;
            }

            var3.method9864();
         }
      } else {
         this.field3931 = new class875(4);
      }

      this.field3931.method15311(new class108(arg1), (long)arg0);
      return true;
   }

   @deob.ObfuscatedName("gq.m(IIIIS)Z")
   public boolean method6809(int arg0, int arg1, int arg2, int arg3) {
      int var5 = (1 << arg2) - 1;
      int var6 = arg3 == 31 ? -1 : (1 << arg3 + 1) - 1;
      int var7 = var6 ^ var5;
      int var8 = arg1 << arg2;
      int var9 = var8 & var7;
      if (this.field3931 != null) {
         class674 var10 = this.field3931.method15322((long)arg0);
         if (var10 != null) {
            if (var10 instanceof class108) {
               class108 var11 = (class108)var10;
               if ((var11.field811 & var7) == var9) {
                  return false;
               }

               var11.field811 &= ~var7;
               var11.field811 |= var9;
               return true;
            }

            var10.method9864();
         }
      } else {
         this.field3931 = new class875(4);
      }

      this.field3931.method15311(new class108(var9), (long)arg0);
      return true;
   }

   @deob.ObfuscatedName("gq.i(IJ)Z")
   public boolean method6810(int arg0, long arg1) {
      if (this.field3931 != null) {
         class674 var4 = this.field3931.method15322((long)arg0);
         if (var4 != null) {
            if (var4 instanceof class97) {
               class97 var5 = (class97)var4;
               if (var5.field730 == arg1) {
                  return false;
               }

               var5.field730 = arg1;
               return true;
            }

            var4.method9864();
         }
      } else {
         this.field3931 = new class875(4);
      }

      this.field3931.method15311(new class97(arg1), (long)arg0);
      return true;
   }

   @deob.ObfuscatedName("gq.t(ILjava/lang/String;B)Z")
   public boolean method6811(int arg0, String arg1) {
      if (arg1 == null) {
         arg1 = "";
      } else if (arg1.length() > 80) {
         arg1 = arg1.substring(0, 80);
      }

      if (this.field3931 != null) {
         class674 var3 = this.field3931.method15322((long)arg0);
         if (var3 != null) {
            if (var3 instanceof class106) {
               class106 var4 = (class106)var3;
               if (var4.field807 instanceof String) {
                  if (arg1.equals(var4.field807)) {
                     return false;
                  }

                  var4.method9864();
                  var4.method9864();
                  this.field3931.method15311(new class106(arg1), var4.field6137);
                  return true;
               }
            }

            var3.method9864();
         }
      } else {
         this.field3931 = new class875(4);
      }

      this.field3931.method15311(new class106(arg1), (long)arg0);
      return true;
   }

   @deob.ObfuscatedName("gq.c(Laen;I)V")
   private void method6853(class124 arg0) {
      int var2 = arg0.method1688();
      if (var2 >= 1 && var2 <= 5) {
         int var3 = arg0.method1688();
         if ((var3 & 1) != 0) {
            this.field3908 = true;
         }

         if ((var3 & 2) != 0) {
            this.field3909 = true;
         }

         if (!this.field3908) {
            this.field3932 = null;
            this.field3928 = null;
         }

         if (!this.field3909) {
            this.field3907 = null;
            this.field3930 = null;
         }

         this.field3925 = arg0.method1591();
         this.field3913 = arg0.method1591();
         if (var2 <= 3 && this.field3913 != 0) {
            this.field3913 += 16912800;
         }

         this.field3911 = arg0.method1587();
         this.field3919 = arg0.method1688();
         this.field3912 = arg0.method1599();
         if (var2 >= 4) {
            arg0.method1591();
         }

         this.field3914 = arg0.method1688() == 1;
         this.field3926 = arg0.method1623();
         this.field3929 = arg0.method1623();
         this.field3917 = arg0.method1623();
         this.field3933 = arg0.method1623();
         if (this.field3911 > 0) {
            if (this.field3908 && (this.field3932 == null || this.field3932.length < this.field3911)) {
               this.field3932 = new long[this.field3911];
            }

            if (this.field3909 && (this.field3907 == null || this.field3907.length < this.field3911)) {
               this.field3907 = new String[this.field3911];
            }

            if (this.field3921 == null || this.field3921.length < this.field3911) {
               this.field3921 = new byte[this.field3911];
            }

            if (this.field3923 == null || this.field3923.length < this.field3911) {
               this.field3923 = new int[this.field3911];
            }

            if (this.field3924 == null || this.field3924.length < this.field3911) {
               this.field3924 = new int[this.field3911];
            }

            for(int var4 = 0; var4 < this.field3911; ++var4) {
               if (this.field3908) {
                  this.field3932[var4] = arg0.method1621();
               }

               if (this.field3909) {
                  this.field3907[var4] = arg0.method1598();
               }

               this.field3921[var4] = arg0.method1623();
               if (var2 >= 2) {
                  this.field3923[var4] = arg0.method1591();
               }

               if (var2 >= 5) {
                  this.field3924[var4] = arg0.method1587();
               } else {
                  this.field3924[var4] = 0;
               }
            }

            this.method6803();
         }

         if (this.field3919 > 0) {
            if (this.field3908 && (this.field3928 == null || this.field3928.length < this.field3919)) {
               this.field3928 = new long[this.field3919];
            }

            if (this.field3909 && (this.field3930 == null || this.field3930.length < this.field3919)) {
               this.field3930 = new String[this.field3919];
            }

            for(int var5 = 0; var5 < this.field3919; ++var5) {
               if (this.field3908) {
                  this.field3928[var5] = arg0.method1621();
               }

               if (this.field3909) {
                  this.field3930[var5] = arg0.method1598();
               }
            }
         }

         if (var2 >= 3) {
            int var6 = arg0.method1587();
            if (var6 > 0) {
               this.field3931 = new class875(var6 < 16 ? class887.method4053(var6) : 16);

               while(var6-- > 0) {
                  int var7 = arg0.method1591();
                  int var8 = var7 & 1073741823;
                  int var9 = var7 >>> 30;
                  if (var9 == 0) {
                     int var10 = arg0.method1591();
                     this.field3931.method15311(new class108(var10), (long)var8);
                  } else if (var9 == 1) {
                     long var11 = arg0.method1621();
                     this.field3931.method15311(new class97(var11), (long)var8);
                  } else if (var9 == 2) {
                     String var13 = arg0.method1599();
                     this.field3931.method15311(new class106(var13), (long)var8);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }
}
