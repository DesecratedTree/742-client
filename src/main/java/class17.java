import jaggl.OpenGL;

@deob.ObfuscatedName("aao")
public class class17 extends class422 {
   @deob.ObfuscatedName("aao.g")
   private static final int[] field171 = new int[2];
   @deob.ObfuscatedName("aao.h")
   private static final float[] field173 = new float[16];
   @deob.ObfuscatedName("aao.x")
   public int field177;
   @deob.ObfuscatedName("aao.s")
   private int field168;
   @deob.ObfuscatedName("aao.l")
   private int field162;
   @deob.ObfuscatedName("aao.u")
   private boolean field170;
   @deob.ObfuscatedName("aao.v")
   private int[] field169;
   @deob.ObfuscatedName("aao.c")
   private String field178;
   @deob.ObfuscatedName("aao.w")
   private String field180;
   @deob.ObfuscatedName("aao.a")
   private class9 field166;
   @deob.ObfuscatedName("aao.o")
   private class214 field165;
   @deob.ObfuscatedName("aao.e")
   private float[] field167;
   @deob.ObfuscatedName("aao.z")
   private float[] field174;
   @deob.ObfuscatedName("aao.m")
   private float[] field175;
   @deob.ObfuscatedName("aao.i")
   private float[] field176;
   @deob.ObfuscatedName("aao.t")
   private int[] field179;

   private class17(class214 arg0, class432 arg1) {
      this.field177 = 0;
      this.field168 = 0;
      this.field162 = 0;
      this.field170 = false;
      this.field169 = new int[13];
      this.field3304 = arg1.field3598;
      StringBuilder var3 = new StringBuilder();
      if (arg1.field3596 != null) {
         this.field3305 = arg1.field3596;
         if (arg1.field3597 != null) {
            class429[] var4 = arg1.field3597;

            for(int var5 = 0; var5 < var4.length; ++var5) {
               class429 var6 = var4[var5];
               var3.append("#define " + var6.field3581 + " " + var6.field3580 + '\n');
            }
         }

         var3.append(new String(arg0.method2909(this.field3305)));
         this.field178 = var3.toString();
      }

      if (arg1.field3599 != null) {
         this.field3303 = arg1.field3599;
         var3.setLength(0);
         if (arg1.field3595 != null) {
            class429[] var7 = arg1.field3595;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class429 var9 = var7[var8];
               var3.append("#define " + var9.field3581 + " " + var9.field3580 + '\n');
            }
         }

         var3.append(new String(arg0.method2909(this.field3303)));
         this.field180 = var3.toString();
      }

      class803.method14275(this.field169, 0, this.field169.length, -1);
   }

   public class17(class214 arg0, class9 arg1, class432 arg2) {
      this(arg0, arg2);
      this.field166 = arg1;
      this.field165 = arg0;
   }

   @deob.ObfuscatedName("aao.bp(ILjava/lang/String;Ljava/lang/String;)I")
   private int method379(int arg0, String arg1, String arg2) {
      if (arg1 == null) {
         return 0;
      } else {
         int var4 = OpenGL.glCreateShader(arg0);
         OpenGL.glShaderSource(var4, arg1);
         OpenGL.glCompileShader(var4);
         OpenGL.glGetShaderiv(var4, 35713, field171, 0);
         if (field171[0] == 0) {
            OpenGL.glDeleteShader(var4);
            var4 = 0;
         }

         return var4;
      }
   }

   @deob.ObfuscatedName("aao.k()Z")
   public boolean method284() {
      if (this.field170) {
         return true;
      } else {
         this.field165.field1425 = null;
         this.field168 = this.method379(35633, this.field178, this.field3305);
         this.field162 = this.method379(35632, this.field180, this.field3303);
         if (this.field168 != 0 && this.field162 != 0) {
            this.field177 = OpenGL.glCreateProgram();
            if (this.field168 != 0) {
               OpenGL.glAttachShader(this.field177, this.field168);
            }

            if (this.field162 != 0) {
               OpenGL.glAttachShader(this.field177, this.field162);
            }

            OpenGL.glLinkProgram(this.field177);
            OpenGL.glGetProgramiv(this.field177, 35714, field171, 0);
            if (field171[0] == 0) {
               if (this.field168 != 0) {
                  OpenGL.glDetachShader(this.field177, this.field168);
                  OpenGL.glDeleteShader(this.field168);
               }

               if (this.field162 != 0) {
                  OpenGL.glDetachShader(this.field177, this.field162);
                  OpenGL.glDeleteShader(this.field162);
               }

               OpenGL.glDeleteProgram(this.field177);
               return false;
            } else {
               OpenGL.glUseProgram(this.field177);
               int var1 = -1;

               for(int var2 = 0; var2 < this.field166.method6014(); ++var2) {
                  if (this.field166.method6015(var2) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if (var1 == -1) {
                  return false;
               } else {
                  int var3 = 0;
                  int var4 = 0;

                  for(int var5 = 0; var5 < this.field166.method6041(); ++var5) {
                     class225 var6 = this.field166.method6042(var5);
                     if (var6 != null) {
                        var6.method3132(var1);
                        class420 var7 = var6.method3119();
                        int var8 = ((class286)var6).field1858[var1];
                        if (class420.field3205 != var7 && class420.field3151 != var7 && class420.field3161 != var7 && class420.field3162 != var7 && class420.field3169 != var7) {
                           var4 = Math.max(var8, var4);
                        } else {
                           var3 = Math.max(var8, var3);
                        }
                     }
                  }

                  for(int var9 = 0; var9 < this.field166.method6081(); ++var9) {
                     class225 var10 = this.field166.method6045(var9);
                     if (var10 != null) {
                        var10.method3132(var1);
                        class420 var11 = var10.method3119();
                        int var12 = ((class286)var10).field1858[var1];
                        if (class420.field3205 != var11 && class420.field3151 != var11 && class420.field3161 != var11 && class420.field3162 != var11 && class420.field3169 != var11) {
                           var4 = Math.max(var12, var4);
                        } else {
                           var3 = Math.max(var12, var3);
                        }
                     }
                  }

                  this.field167 = new float[var3 + 1];
                  this.field174 = new float[var3 + 1];
                  this.field175 = new float[var3 + 1];
                  this.field176 = new float[var3 + 1];
                  this.field179 = new int[var4 + 1];

                  for(int var13 = 0; var13 < this.field179.length; ++var13) {
                     this.field179[var13] = -1;
                  }

                  this.field178 = null;
                  this.field180 = null;
                  this.field170 = true;
                  return true;
               }
            }
         } else {
            if (this.field168 != 0) {
               OpenGL.glDeleteShader(this.field168);
            }

            if (this.field162 != 0) {
               OpenGL.glDeleteShader(this.field162);
            }

            return false;
         }
      }
   }

   @deob.ObfuscatedName("aao.b(Laig;F)V")
   public void method285(class225 arg0, float arg1) {
      int var3 = ((class286)arg0).method3672();
      if (var3 != -1) {
         if (this.field167[var3] != arg1) {
            this.field167[var3] = arg1;
            if (arg0.method3119() != class420.field3205 && arg0.method3119() != class420.field3151) {
               throw new class305(arg0, "");
            }

            OpenGL.glUniform1f(var3, arg1);
         }

      }
   }

   @deob.ObfuscatedName("aao.r(Laig;FF)V")
   public void method286(class225 arg0, float arg1, float arg2) {
      int var4 = ((class286)arg0).method3672();
      if (var4 != -1) {
         if (this.field167[var4] != arg1 || this.field174[var4] != arg2) {
            this.field167[var4] = arg1;
            this.field174[var4] = arg2;
            if (arg0.method3119() != class420.field3161) {
               throw new class305(arg0, "");
            }

            OpenGL.glUniform2f(var4, arg1, arg2);
         }

      }
   }

   @deob.ObfuscatedName("aao.p(Laig;FFF)V")
   public void method287(class225 arg0, float arg1, float arg2, float arg3) {
      int var5 = ((class286)arg0).method3672();
      if (var5 != -1) {
         if (this.field167[var5] != arg1 || this.field174[var5] != arg2 || this.field175[var5] != arg3) {
            this.field167[var5] = arg1;
            this.field174[var5] = arg2;
            this.field175[var5] = arg3;
            if (arg0.method3119() != class420.field3162) {
               throw new class305(arg0, "");
            }

            OpenGL.glUniform3f(var5, arg1, arg2, arg3);
         }

      }
   }

   @deob.ObfuscatedName("aao.o(Laig;FFFF)V")
   public void method288(class225 arg0, float arg1, float arg2, float arg3, float arg4) {
      int var6 = ((class286)arg0).method3672();
      if (var6 != -1) {
         if (this.field167[var6] != arg1 || this.field174[var6] != arg2 || this.field175[var6] != arg3 || this.field176[var6] != arg4) {
            this.field167[var6] = arg1;
            this.field174[var6] = arg2;
            this.field175[var6] = arg3;
            this.field176[var6] = arg4;
            if (arg0.method3119() != class420.field3169) {
               throw new class305(arg0, "");
            }

            OpenGL.glUniform4f(var6, arg1, arg2, arg3, arg4);
         }

      }
   }

   @deob.ObfuscatedName("aao.a(Laig;[FI)V")
   public void method333(class225 arg0, float[] arg1, int arg2) {
      int var4 = ((class286)arg0).method3672();
      if (var4 != -1) {
         OpenGL.glUniform4fv(var4, arg2, arg1, 0);
      }
   }

   @deob.ObfuscatedName("aao.l(Laig;Lko;)V")
   public void method311(class225 arg0, class597 arg1) {
      assert arg0.method3119() == class420.field3256;

      int var3 = ((class286)arg0).method3672();
      if (var3 != -1) {
         OpenGL.glUniform2fv(var3, 4, arg1.method8477(field173), 0);
      }
   }

   @deob.ObfuscatedName("aao.u(Laig;Lko;)V")
   public void method304(class225 arg0, class597 arg1) {
      assert arg0.method3119() == class420.field3179;

      int var3 = ((class286)arg0).method3672();
      if (var3 != -1) {
         OpenGL.glUniform4fv(var3, 4, arg1.method8412(field173), 0);
      }
   }

   @deob.ObfuscatedName("aao.v(Laig;ILip;)V")
   public void method283(class225 arg0, int arg1, class536 arg2) {
      int var4 = ((class286)arg0).method3672();
      if (var4 != -1) {
         if (arg2 == null) {
            arg2 = this.field165.field10068;
         }

         if (arg1 < this.field165.field10099) {
            this.field165.method16351(arg1);
            this.field165.method16470(arg2);
         } else {
            OpenGL.glActiveTexture(arg1 + 33984);
            OpenGL.glBindTexture(((class619)arg2).field5580, ((class619)arg2).field5585);
         }

         if (this.field179[var4] != arg1) {
            this.field179[var4] = arg1;
            OpenGL.glUniform1i(var4, arg1);
         }

      }
   }

   @deob.ObfuscatedName("aao.g(IFFF)V")
   public void method293(int arg0, float arg1, float arg2, float arg3) {
      OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("aao.h(IFFFF)V")
   public void method294(int arg0, float arg1, float arg2, float arg3, float arg4) {
      OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("aao.e(I[FI)V")
   public void method327(int arg0, float[] arg1, int arg2) {
      OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
   }

   @deob.ObfuscatedName("aao.z(ILko;)V")
   public void method299(int arg0, class597 arg1) {
      OpenGL.glUniform3fv(arg0, 3, arg1.method8407(field173), 0);
   }

   @deob.ObfuscatedName("aao.m(ILko;)V")
   public void method296(int arg0, class597 arg1) {
      OpenGL.glUniform2fv(arg0, 4, arg1.method8477(field173), 0);
   }

   @deob.ObfuscatedName("aao.i(ILko;)V")
   public void method336(int arg0, class597 arg1) {
      OpenGL.glUniform4fv(arg0, 4, arg1.method8412(field173), 0);
   }

   @deob.ObfuscatedName("aao.t(IILip;)V")
   public void method301(int arg0, int arg1, class536 arg2) {
      this.field165.method16351(arg1);
      this.field165.method16470(arg2);
      OpenGL.glUniform1i(arg0, arg1);
   }

   @deob.ObfuscatedName("aao.d()V")
   public void method302() {
      if (this.field177 != 0) {
         this.field165.method2899(this.field177);
         if (this.field168 != 0) {
            this.field165.method2894((long)this.field168);
         }

         if (this.field162 != 0) {
            this.field165.method2894((long)this.field162);
         }

         this.field177 = 0;
         this.field168 = 0;
         this.field162 = 0;
      }

   }

   public void finalize() {
      this.method302();
   }
}
