@deob.ObfuscatedName("aby")
public class class54 extends class625 {
   @deob.ObfuscatedName("aby.cg")
   private static boolean field396 = false;
   @deob.ObfuscatedName("aby.cp")
   private static boolean field392 = false;
   @deob.ObfuscatedName("aby.ch")
   private static final int[] field395 = new int[]{1, 0, -1, 0};
   @deob.ObfuscatedName("aby.cu")
   private static final int[] field387 = new int[]{0, -1, 0, 1};
   @deob.ObfuscatedName("aby.cy")
   private static final int[] field393 = new int[]{1, -1, -1, 1};
   @deob.ObfuscatedName("aby.cl")
   private static final int[] field394 = new int[]{-1, -1, 1, 1};
   @deob.ObfuscatedName("aby.cb")
   private int field391 = 99;
   @deob.ObfuscatedName("aby.cz")
   private class831 field397;
   @deob.ObfuscatedName("aby.ci")
   private class751 field386;

   public class54(class713 arg0, class831 arg1, int arg2, int arg3, int arg4, boolean arg5, class611 arg6, class751 arg7) {
      super(arg0, arg2, arg3, arg4, arg5, Statics.field1613, Statics.field8466, arg6);
      this.field397 = arg1;
      this.field386 = arg7;
   }

   @deob.ObfuscatedName("aby.cj(Lra;Laen;IIB)V")
   public final void method857(class772 arg0, class124 arg1, int arg2, int arg3) {
      if (!this.field5691) {
         boolean var5 = false;
         class769 var6 = null;

         while(true) {
            while(arg1.field935 < arg1.field931.length) {
               int var7 = arg1.method1688();
               if (var7 == 0) {
                  if (var6 == null) {
                     var6 = new class769(arg1, this.field386);
                  } else {
                     var6.method11449(arg1, this.field386);
                  }
               } else if (var7 == 1) {
                  int var8 = arg1.method1688();
                  if (var8 > 0) {
                     for(int var9 = 0; var9 < var8; ++var9) {
                        class698 var10 = new class698(arg0, this.field5612.field6567, arg1, 2);
                        if (var10.field6450 == 31) {
                           class891 var11 = Statics.field6797.method15596(arg1.method1587());
                           var10.method10274(var11.field9086, var11.field9085, var11.field9082, var11.field9084);
                        }

                        if (arg0.method7499() > 0) {
                           class81 var12 = var10.field6435;
                           int var13 = var12.method1123() + (arg2 << 9);
                           int var14 = var12.method1111() + (arg3 << 9);
                           int var15 = var13 >> 9;
                           int var16 = var14 >> 9;
                           if (var15 >= 0 && var16 >= 0 && var15 < this.field5623 && var16 < this.field5624) {
                              var12.method1116(var13, this.field5626[var10.field6448][var15][var16] - var12.method1110(), var14);
                              this.field5612.method10531(var10);
                           }
                        }
                     }
                  }
               } else if (var7 == 2) {
                  if (var6 == null) {
                     var6 = new class769();
                  }

                  var6.method11440(arg1);
               } else if (var7 == 128) {
                  if (var6 == null) {
                     var6 = new class769();
                  }

                  var6.method11436(arg1, this.field386);
               } else {
                  if (var7 != 129) {
                     throw new IllegalStateException("");
                  }

                  if (this.field5627 == null) {
                     this.field5627 = new byte[4][][];
                  }

                  for(int var17 = 0; var17 < 4; ++var17) {
                     byte var18 = arg1.method1623();
                     if (var18 == 0 && this.field5627[var17] != null) {
                        int var19 = arg2;
                        int var20 = arg2 + 64;
                        int var21 = arg3;
                        int var22 = arg3 + 64;
                        if (arg2 < 0) {
                           var19 = 0;
                        } else if (arg2 >= this.field5623) {
                           var19 = this.field5623;
                        }

                        if (var20 < 0) {
                           var20 = 0;
                        } else if (var20 >= this.field5623) {
                           var20 = this.field5623;
                        }

                        if (arg3 < 0) {
                           var21 = 0;
                        } else if (arg3 >= this.field5624) {
                           var21 = this.field5624;
                        }

                        if (var22 < 0) {
                           var22 = 0;
                        } else if (var22 >= this.field5624) {
                           var22 = this.field5624;
                        }

                        while(var19 < var20) {
                           while(var21 < var22) {
                              this.field5627[var17][var19][var21] = 0;
                              ++var21;
                           }

                           ++var19;
                        }
                     } else if (var18 == 1) {
                        if (this.field5627[var17] == null) {
                           this.field5627[var17] = new byte[this.field5623 + 1][this.field5624 + 1];
                        }

                        for(int var23 = 0; var23 < 64; var23 += 4) {
                           for(int var24 = 0; var24 < 64; var24 += 4) {
                              byte var25 = arg1.method1623();

                              for(int var26 = arg2 + var23; var26 < arg2 + var23 + 4; ++var26) {
                                 for(int var27 = arg3 + var24; var27 < arg3 + var24 + 4; ++var27) {
                                    if (var26 >= 0 && var26 < this.field5623 && var27 >= 0 && var27 < this.field5624) {
                                       this.field5627[var17][var26][var27] = var25;
                                    }
                                 }
                              }
                           }
                        }
                     } else if (var18 == 2) {
                        if (this.field5627[var17] == null) {
                           this.field5627[var17] = new byte[this.field5623 + 1][this.field5624 + 1];
                        }

                        if (var17 > 0) {
                           int var28 = arg2;
                           int var29 = arg2 + 64;
                           int var30 = arg3;
                           int var31 = arg3 + 64;
                           if (arg2 < 0) {
                              var28 = 0;
                           } else if (arg2 >= this.field5623) {
                              var28 = this.field5623;
                           }

                           if (var29 < 0) {
                              var29 = 0;
                           } else if (var29 >= this.field5623) {
                              var29 = this.field5623;
                           }

                           if (arg3 < 0) {
                              var30 = 0;
                           } else if (arg3 >= this.field5624) {
                              var30 = this.field5624;
                           }

                           if (var31 < 0) {
                              var31 = 0;
                           } else if (var31 >= this.field5624) {
                              var31 = this.field5624;
                           }

                           while(var28 < var29) {
                              while(var30 < var31) {
                                 this.field5627[var17][var28][var30] = this.field5627[var17 - 1][var28][var30];
                                 ++var30;
                              }

                              ++var28;
                           }
                        }
                     }
                  }

                  var5 = true;
               }
            }

            if (var6 != null) {
               for(int var32 = 0; var32 < 8; ++var32) {
                  for(int var33 = 0; var33 < 8; ++var33) {
                     int var34 = (arg2 >> 3) + var32;
                     int var35 = (arg3 >> 3) + var33;
                     if (var34 >= 0 && var34 < this.field5623 >> 3 && var35 >= 0 && var35 < this.field5624 >> 3) {
                        this.field386.method11121(var34, var35, var6);
                     }
                  }
               }
            }

            if (!var5 && this.field5627 != null) {
               for(int var36 = 0; var36 < 4; ++var36) {
                  if (this.field5627[var36] != null) {
                     for(int var37 = 0; var37 < 16; ++var37) {
                        for(int var38 = 0; var38 < 16; ++var38) {
                           int var39 = (arg2 >> 2) + var37;
                           int var40 = (arg3 >> 2) + var38;
                           if (var39 >= 0 && var39 < 26 && var40 >= 0 && var40 < 26) {
                              this.field5627[var36][var39][var40] = 0;
                           }
                        }
                     }
                  }
               }
            }

            return;
         }
      }
   }

   @deob.ObfuscatedName("aby.cw(Lra;Laen;IIIIIIII)V")
   public final void method858(class772 arg0, class124 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (!this.field5691) {
         boolean var10 = false;
         class769 var11 = null;
         int var12 = (arg6 & 7) * 8;
         int var13 = (arg7 & 7) * 8;

         while(true) {
            while(arg1.field935 < arg1.field931.length) {
               int var14 = arg1.method1688();
               if (var14 == 0) {
                  if (var11 == null) {
                     var11 = new class769(arg1, this.field386);
                  } else {
                     var11.method11449(arg1, this.field386);
                  }
               } else if (var14 == 1) {
                  int var15 = arg1.method1688();
                  if (var15 > 0) {
                     for(int var16 = 0; var16 < var15; ++var16) {
                        class698 var17 = new class698(arg0, this.field5612.field6567, arg1, 2);
                        if (var17.field6450 == 31) {
                           class891 var18 = Statics.field6797.method15596(arg1.method1587());
                           var17.method10274(var18.field9086, var18.field9085, var18.field9082, var18.field9084);
                        }

                        if (arg0.method7499() > 0) {
                           class81 var19 = var17.field6435;
                           int var20 = var19.method1123() >> 9;
                           int var21 = var19.method1111() >> 9;
                           if (var17.field6448 == arg5 && var20 >= var12 && var20 < var12 + 8 && var21 >= var13 && var21 < var13 + 8) {
                              int var22 = (arg3 << 9) + class626.method14217(var19.method1123() & 4095, var19.method1111() & 4095, arg8);
                              int var23 = (arg4 << 9) + class626.method10808(var19.method1123() & 4095, var19.method1111() & 4095, arg8);
                              int var24 = var22 >> 9;
                              int var25 = var23 >> 9;
                              if (var24 >= 0 && var25 >= 0 && var24 < this.field5623 && var25 < this.field5624) {
                                 var19.method1116(var22, this.field5626[arg5][var24][var25] - var19.method1110(), var23);
                                 this.field5612.method10531(var17);
                              }
                           }
                        }
                     }
                  }
               } else if (var14 == 2) {
                  if (var11 == null) {
                     var11 = new class769();
                  }

                  var11.method11440(arg1);
               } else if (var14 == 128) {
                  if (var11 == null) {
                     var11 = new class769();
                  }

                  var11.method11436(arg1, this.field386);
               } else {
                  if (var14 != 129) {
                     throw new IllegalStateException("");
                  }

                  if (this.field5627 == null) {
                     this.field5627 = new byte[4][][];
                  }

                  for(int var26 = 0; var26 < 4; ++var26) {
                     byte var27 = arg1.method1623();
                     if (var27 == 0 && this.field5627[arg2] != null) {
                        if (var26 <= arg5) {
                           int var28 = arg3;
                           int var29 = arg3 + 7;
                           int var30 = arg4;
                           int var31 = arg4 + 7;
                           if (arg3 < 0) {
                              var28 = 0;
                           } else if (arg3 >= this.field5623) {
                              var28 = this.field5623;
                           }

                           if (var29 < 0) {
                              var29 = 0;
                           } else if (var29 >= this.field5623) {
                              var29 = this.field5623;
                           }

                           if (arg4 < 0) {
                              var30 = 0;
                           } else if (arg4 >= this.field5624) {
                              var30 = this.field5624;
                           }

                           if (var31 < 0) {
                              var31 = 0;
                           } else if (var31 >= this.field5624) {
                              var31 = this.field5624;
                           }

                           while(var28 < var29) {
                              while(var30 < var31) {
                                 this.field5627[arg2][var28][var30] = 0;
                                 ++var30;
                              }

                              ++var28;
                           }
                        }
                     } else if (var27 != 1) {
                        if (var27 == 2) {
                        }
                     } else {
                        if (this.field5627[arg2] == null) {
                           this.field5627[arg2] = new byte[this.field5623 + 1][this.field5624 + 1];
                        }

                        for(int var32 = 0; var32 < 64; var32 += 4) {
                           for(int var33 = 0; var33 < 64; var33 += 4) {
                              byte var34 = arg1.method1623();
                              if (var26 <= arg5) {
                                 for(int var35 = var32; var35 < var32 + 4; ++var35) {
                                    for(int var36 = var33; var36 < var33 + 4; ++var36) {
                                       if (var35 >= var12 && var35 < var12 + 8 && var36 >= var13 && var36 < var13 + 8) {
                                          int var37 = arg3 + class626.method5630(var35 & 7, var36 & 7, arg8);
                                          int var38 = arg4 + class626.method8889(var35 & 7, var36 & 7, arg8);
                                          if (var37 >= 0 && var37 < this.field5623 && var38 >= 0 && var38 < this.field5624) {
                                             this.field5627[arg2][var37][var38] = var34;
                                             var10 = true;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (var11 != null) {
               this.field386.method11121(arg3 >> 3, arg4 >> 3, var11);
            }

            if (!var10 && this.field5627 != null && this.field5627[arg2] != null) {
               int var39 = arg3 + 7;
               int var40 = arg4 + 7;

               for(int var41 = arg3; var41 < var39; ++var41) {
                  for(int var42 = arg4; var42 < var40; ++var42) {
                     this.field5627[arg2][var41][var42] = 0;
                  }
               }
            }

            return;
         }
      }
   }

   @deob.ObfuscatedName("xh.cd(Ltf;[BIIIII)I")
   public static final int method16011(class831 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = 0;
      class124 var7 = new class124(arg1);
      int var8 = -1;

      label57:
      while(true) {
         int var9 = var7.method1606();
         if (var9 == 0) {
            return var6;
         }

         var8 += var9;
         int var10 = 0;
         boolean var11 = false;

         while(true) {
            while(!var11) {
               int var13 = var7.method1604();
               if (var13 == 0) {
                  continue label57;
               }

               var10 += var13 - 1;
               int var14 = var10 & 63;
               int var15 = var10 >> 6 & 63;
               int var16 = var7.method1688() >> 2;
               int var17 = arg2 + var15;
               int var18 = arg3 + var14;
               if (var17 > 0 && var18 > 0 && var17 < arg4 - 1 && var18 < arg5 - 1) {
                  class843 var19 = arg0.method14651(var8);
                  if (class850.field8730.field8736 != var16 || Statics.field9361.field982.method2079() != 0 || var19.field8638 != 0 || var19.field8594 == 1 || var19.field8619) {
                     if (!var19.method14849()) {
                        ++var6;
                     }

                     var11 = true;
                  }
               }
            }

            int var12 = var7.method1604();
            if (var12 == 0) {
               break;
            }

            var7.method1688();
         }
      }
   }

   @deob.ObfuscatedName("xr.ck(Ltf;IIB)Z")
   public static final boolean method16030(class831 arg0, int arg1, int arg2) {
      class843 var3 = arg0.method14651(arg1);
      if (arg2 == 11) {
         arg2 = 10;
      }

      if (arg2 >= 5 && arg2 <= 8) {
         arg2 = 4;
      }

      return var3.method14848(arg2);
   }

   @deob.ObfuscatedName("aby.cs(Lra;[BII[Lml;B)V")
   public final void method859(class772 arg0, byte[] arg1, int arg2, int arg3, class648[] arg4) {
      class124 var6 = new class124(arg1);
      int var7 = -1;

      while(true) {
         int var8 = var6.method1606();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.method1604();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.method1688();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = arg2 + var12;
            int var18 = arg3 + var11;
            if (var17 > 0 && var18 > 0 && var17 < this.field5623 - 1 && var18 < this.field5624 - 1) {
               class648 var19 = null;
               if (!this.field5691) {
                  int var20 = var13;
                  if ((this.field5653.field5520[1][var17][var18] & 2) == 2) {
                     var20 = var13 - 1;
                  }

                  if (var20 >= 0) {
                     var19 = arg4[var20];
                  }
               }

               this.method861(arg0, var13, var13, var17, var18, var7, var16, var15, var19, -1);
            }
         }
      }
   }

   @deob.ObfuscatedName("aby.cg(Lra;[BIIIIIII[Lml;I)V")
   public final void method860(class772 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class648[] arg9) {
      class124 var11 = new class124(arg1);
      int var12 = -1;

      while(true) {
         int var13 = var11.method1606();
         if (var13 == 0) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while(true) {
            int var15 = var11.method1604();
            if (var15 == 0) {
               break;
            }

            var14 += var15 - 1;
            int var16 = var14 & 63;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.method1688();
            int var20 = var19 >> 2;
            int var21 = var19 & 3;
            if (arg5 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg7 && var16 < arg7 + 8) {
               class843 var22 = this.field397.method14651(var12);
               int var23 = arg3 + class626.method7900(var17 & 7, var16 & 7, arg8, var22.field8585, var22.field8570, var21);
               int var24 = arg4 + class626.method10310(var17 & 7, var16 & 7, arg8, var22.field8585, var22.field8570, var21);
               if (var23 > 0 && var24 > 0 && var23 < this.field5623 - 1 && var24 < this.field5624 - 1) {
                  class648 var25 = null;
                  if (!this.field5691) {
                     int var26 = arg2;
                     if ((this.field5653.field5520[1][var23][var24] & 2) == 2) {
                        var26 = arg2 - 1;
                     }

                     if (var26 >= 0) {
                        var25 = arg9[var26];
                     }
                  }

                  this.method861(arg0, arg2, arg2, var23, var24, var12, arg8 + var21 & 3, var20, var25, -1);
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("aby.cp(Lra;IIIIIIILml;II)V")
   public final void method861(class772 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class648 arg8, int arg9) {
      if (arg2 < this.field391) {
         this.field391 = arg2;
      }

      class843 var11 = this.field397.method14651(arg5);
      if (Statics.field9361.field972.method2268() != 0 || !var11.field8636) {
         int var12;
         int var13;
         if (arg6 != 1 && arg6 != 3) {
            var12 = var11.field8585;
            var13 = var11.field8570;
         } else {
            var12 = var11.field8570;
            var13 = var11.field8585;
         }

         int var14;
         int var15;
         if (arg3 + var12 <= this.field5623) {
            var14 = (var12 >> 1) + arg3;
            var15 = (var12 + 1 >> 1) + arg3;
         } else {
            var14 = arg3;
            var15 = arg3 + 1;
         }

         int var16;
         int var17;
         if (arg4 + var13 <= this.field5624) {
            var16 = (var13 >> 1) + arg4;
            var17 = (var13 + 1 >> 1) + arg4;
         } else {
            var16 = arg4;
            var17 = arg4 + 1;
         }

         class934 var18 = this.field5612.field6580[arg1];
         int var19 = var18.method15966(var14, var16) + var18.method15966(var15, var16) + var18.method15966(var14, var17) + var18.method15966(var15, var17) >> 2;
         int var20 = (arg3 << 9) + (var12 << 8);
         int var21 = (arg4 << 9) + (var13 << 8);
         boolean var22 = this.field5628 && !this.field5691 && var11.field8589;
         if (var11.method14880()) {
            class98.method7934(arg2, arg3, arg4, arg6, var11, (class200)null, (class211)null);
         }

         boolean var23 = arg9 == -1 && !var11.method14877() && var11.field8609 == null && !var11.field8640 && !var11.field8644;
         if (!field396 || (!class850.method1519(arg7) || var11.field8593 == 1) && (!class850.method14921(arg7) || var11.field8593 != 0)) {
            if (class850.field8730.field8736 == arg7) {
               if (Statics.field9361.field982.method2079() != 0 || var11.field8638 != 0 || var11.field8594 == 1 || var11.field8619) {
                  class275 var25;
                  if (var23) {
                     class967 var24 = new class967(this.field5612, arg0, this.field397, var11, arg2, arg1, var20, var19, var21, this.field5691, arg6, var22);
                     if (var24.method5086()) {
                        var24.method5101(arg0);
                     }

                     var25 = var24;
                  } else {
                     var25 = new class956(this.field5612, arg0, this.field397, var11, arg2, arg1, var20, var19, var21, this.field5691, arg6, arg9);
                  }

                  this.field5612.method10494(arg2, arg3, arg4, var25);
                  if (var11.field8594 == 1 && arg8 != null) {
                     arg8.method9349(arg3, arg4);
                  }

               }
            } else if (class850.field8733.field8736 != arg7 && class850.field8734.field8736 != arg7) {
               if (!class850.method14921(arg7) && !class850.method10986(arg7)) {
                  if (!this.method865(arg0, arg7, arg6, var23, var11, arg9, arg2, arg1, var20, var19, var21, arg3, arg4, var22, var18, arg8, var12, var13)) {
                     if (!this.method885(arg0, arg7, arg6, var23, var11, arg9, arg2, arg1, var20, var19, var21, arg3, arg4)) {
                        ;
                     }
                  }
               } else {
                  class290 var27;
                  if (var23) {
                     class964 var26 = new class964(this.field5612, arg0, this.field397, var11, arg2, arg1, var20, var19, var21, this.field5691, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, var22);
                     if (var26.method5086()) {
                        var26.method5101(arg0);
                     }

                     var27 = var26;
                  } else {
                     var27 = new class941(this.field5612, arg0, this.field397, var11, arg2, arg1, var20, var19, var21, this.field5691, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, arg9);
                  }

                  this.field5612.method10498(var27, false);
                  if (this.field5628 && !this.field5691 && class850.method14921(arg7) && class850.field8724.field8736 != arg7 && arg2 > 0 && var11.field8593 != 0) {
                     this.field5633[arg2][arg3][arg4] = (byte)(this.field5633[arg2][arg3][arg4] | 4);
                  }

                  if (var11.field8594 != 0 && arg8 != null) {
                     arg8.method9351(arg3, arg4, var12, var13, var11.field8586, !var11.field8620);
                  }

               }
            } else {
               class964 var28 = null;
               int var30;
               class290 var31;
               if (var23) {
                  class964 var29 = new class964(this.field5612, arg0, this.field397, var11, arg2, arg1, var20, var19, var21, this.field5691, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, var22);
                  var30 = var29.method16073();
                  var31 = var29;
                  var28 = var29;
               } else {
                  var31 = new class941(this.field5612, arg0, this.field397, var11, arg2, arg1, var20, var19, var21, this.field5691, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, arg9);
                  var30 = 15;
               }

               if (this.field5612.method10498(var31, false)) {
                  if (var28 != null && var28.method5086()) {
                     var28.method5101(arg0);
                  }

                  if (var11.field8633 && this.field5628) {
                     if (var30 > 30) {
                        var30 = 30;
                     }

                     for(int var32 = 0; var32 <= var12; ++var32) {
                        for(int var33 = 0; var33 <= var13; ++var33) {
                           var18.method7246(arg3 + var32, arg4 + var33, var30);
                        }
                     }
                  }
               }

               if (var11.field8594 != 0 && arg8 != null) {
                  arg8.method9351(arg3, arg4, var12, var13, var11.field8586, !var11.field8620);
               }

            }
         }
      }
   }

   @deob.ObfuscatedName("aby.cv(Lra;IIZLtr;IIIIIIIIZLxa;Lml;III)Z")
   private boolean method865(class772 arg0, int arg1, int arg2, boolean arg3, class843 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, class934 arg14, class648 arg15, int arg16, int arg17) {
      if (class850.field8735.field8736 == arg1) {
         int var19 = arg4.field8593;
         if (field392 && arg4.field8593 == -1) {
            var19 = 1;
         }

         class276 var21;
         if (arg3) {
            class975 var20 = new class975(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2, arg13);
            if (var20.method5086()) {
               var20.method5101(arg0);
            }

            var21 = var20;
         } else {
            var21 = new class965(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2, arg5);
         }

         this.field5612.method10560(arg6, arg11, arg12, var21, (class276)null);
         if (arg2 == 0) {
            if (this.field5628 && arg4.field8633) {
               arg14.method7246(arg11, arg12, 50);
               arg14.method7246(arg11, arg12 + 1, 50);
            }

            if (var19 == 1 && !this.field5691) {
               this.field5612.field6566.method10418(1, arg6, arg11, arg12, arg4.field8632, arg4.field8595);
            }
         } else if (arg2 == 1) {
            if (this.field5628 && arg4.field8633) {
               arg14.method7246(arg11, arg12 + 1, 50);
               arg14.method7246(arg11 + 1, arg12 + 1, 50);
            }

            if (var19 == 1 && !this.field5691) {
               this.field5612.field6566.method10418(2, arg6, arg11, arg12 + 1, arg4.field8632, -arg4.field8595);
            }
         } else if (arg2 == 2) {
            if (this.field5628 && arg4.field8633) {
               arg14.method7246(arg11 + 1, arg12, 50);
               arg14.method7246(arg11 + 1, arg12 + 1, 50);
            }

            if (var19 == 1 && !this.field5691) {
               this.field5612.field6566.method10418(1, arg6, arg11 + 1, arg12, arg4.field8632, -arg4.field8595);
            }
         } else if (arg2 == 3) {
            if (this.field5628 && arg4.field8633) {
               arg14.method7246(arg11, arg12, 50);
               arg14.method7246(arg11 + 1, arg12, 50);
            }

            if (var19 == 1 && !this.field5691) {
               this.field5612.field6566.method10418(2, arg6, arg11, arg12, arg4.field8632, arg4.field8595);
            }
         }

         if (arg4.field8594 != 0 && arg15 != null) {
            arg15.method9358(arg11, arg12, arg1, arg2, arg4.field8586, !arg4.field8620);
         }

         if (arg4.field8598 != 64) {
            this.field5612.method10499(arg6, arg11, arg12, arg4.field8598);
         }

         return true;
      } else if (class850.field8716.field8736 == arg1) {
         class276 var23;
         if (arg3) {
            class975 var22 = new class975(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2, arg13);
            if (var22.method5086()) {
               var22.method5101(arg0);
            }

            var23 = var22;
         } else {
            var23 = new class965(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2, arg5);
         }

         this.field5612.method10560(arg6, arg11, arg12, var23, (class276)null);
         if (arg4.field8633 && this.field5628) {
            if (arg2 == 0) {
               arg14.method7246(arg11, arg12 + 1, 50);
            } else if (arg2 == 1) {
               arg14.method7246(arg11 + 1, arg12 + 1, 50);
            } else if (arg2 == 2) {
               arg14.method7246(arg11 + 1, arg12, 50);
            } else if (arg2 == 3) {
               arg14.method7246(arg11, arg12, 50);
            }
         }

         if (arg4.field8594 != 0 && arg15 != null) {
            arg15.method9358(arg11, arg12, arg1, arg2, arg4.field8586, !arg4.field8620);
         }

         return true;
      } else if (class850.field8715.field8736 == arg1) {
         int var24 = arg2 + 1 & 3;
         class276 var27;
         class276 var28;
         if (arg3) {
            class975 var25 = new class975(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2 + 4, arg13);
            class975 var26 = new class975(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, var24, arg13);
            if (var25.method5086()) {
               var25.method5101(arg0);
            }

            if (var26.method5086()) {
               var26.method5101(arg0);
            }

            var27 = var25;
            var28 = var26;
         } else {
            var27 = new class965(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2 + 4, arg5);
            var28 = new class965(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, var24, arg5);
         }

         this.field5612.method10560(arg6, arg11, arg12, var27, var28);
         if ((arg4.field8593 == 1 || field392 && arg4.field8593 == -1) && !this.field5691) {
            if (arg2 == 0) {
               this.field5612.field6566.method10418(1, arg6, arg11, arg12, arg4.field8632, arg4.field8595);
               this.field5612.field6566.method10418(2, arg6, arg11, arg12 + 1, arg4.field8632, arg4.field8595);
            } else if (arg2 == 1) {
               this.field5612.field6566.method10418(1, arg6, arg11 + 1, arg12, arg4.field8632, arg4.field8595);
               this.field5612.field6566.method10418(2, arg6, arg11, arg12 + 1, arg4.field8632, arg4.field8595);
            } else if (arg2 == 2) {
               this.field5612.field6566.method10418(1, arg6, arg11 + 1, arg12, arg4.field8632, arg4.field8595);
               this.field5612.field6566.method10418(2, arg6, arg11, arg12, arg4.field8632, arg4.field8595);
            } else if (arg2 == 3) {
               this.field5612.field6566.method10418(1, arg6, arg11, arg12, arg4.field8632, arg4.field8595);
               this.field5612.field6566.method10418(2, arg6, arg11, arg12, arg4.field8632, arg4.field8595);
            }
         }

         if (arg4.field8594 != 0 && arg15 != null) {
            arg15.method9358(arg11, arg12, arg1, arg2, arg4.field8586, !arg4.field8620);
         }

         if (arg4.field8598 != 64) {
            this.field5612.method10499(arg6, arg11, arg12, arg4.field8598);
         }

         return true;
      } else if (class850.field8725.field8736 == arg1) {
         class276 var30;
         if (arg3) {
            class975 var29 = new class975(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2, arg13);
            if (var29.method5086()) {
               var29.method5101(arg0);
            }

            var30 = var29;
         } else {
            var30 = new class965(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg1, arg2, arg5);
         }

         this.field5612.method10560(arg6, arg11, arg12, var30, (class276)null);
         if (arg4.field8633 && this.field5628) {
            if (arg2 == 0) {
               arg14.method7246(arg11, arg12 + 1, 50);
            } else if (arg2 == 1) {
               arg14.method7246(arg11 + 1, arg12 + 1, 50);
            } else if (arg2 == 2) {
               arg14.method7246(arg11 + 1, arg12, 50);
            } else if (arg2 == 3) {
               arg14.method7246(arg11, arg12, 50);
            }
         }

         if (arg4.field8594 != 0 && arg15 != null) {
            arg15.method9358(arg11, arg12, arg1, arg2, arg4.field8586, !arg4.field8620);
         }

         return true;
      } else if (class850.field8717.field8736 == arg1) {
         class290 var32;
         if (arg3) {
            class964 var31 = new class964(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg11, arg11, arg12, arg12, arg1, arg2, arg13);
            if (var31.method5086()) {
               var31.method5101(arg0);
            }

            var32 = var31;
         } else {
            var32 = new class941(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, arg11, arg11 + arg16 - 1, arg12, arg12 + arg17 - 1, arg1, arg2, arg5);
         }

         this.field5612.method10498(var32, false);
         if (arg4.field8593 == 1 && !this.field5691) {
            byte var33;
            if ((arg2 & 1) == 0) {
               var33 = 8;
            } else {
               var33 = 16;
            }

            this.field5612.field6566.method10418(var33, arg6, arg11, arg12, arg4.field8632, 0);
         }

         if (arg4.field8594 != 0 && arg15 != null) {
            arg15.method9351(arg11, arg12, arg16, arg17, arg4.field8586, !arg4.field8620);
         }

         if (arg4.field8598 != 64) {
            this.field5612.method10499(arg6, arg11, arg12, arg4.field8598);
         }

         return true;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("aby.cr(Lra;IIZLtr;IIIIIIIII)Z")
   private boolean method885(class772 arg0, int arg1, int arg2, boolean arg3, class843 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      if (class850.field8718.field8736 == arg1) {
         class288 var15;
         if (arg3) {
            class978 var14 = new class978(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, 0, 0, arg1, arg2);
            if (var14.method5086()) {
               var14.method5101(arg0);
            }

            var15 = var14;
         } else {
            var15 = new class968(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, 0, 0, arg1, arg2, arg5);
         }

         this.field5612.method10497(arg6, arg11, arg12, var15, (class288)null);
         return true;
      } else if (class850.field8727.field8736 == arg1) {
         int var16 = 65;
         class376 var17 = (class376)this.field5612.method10510(arg6, arg11, arg12);
         if (var17 != null) {
            var16 = this.field397.method14651(var17.method5093()).field8598 + 1;
         }

         class288 var19;
         if (arg3) {
            class978 var18 = new class978(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, field395[arg2] * var16, field387[arg2] * var16, arg1, arg2);
            if (var18.method5086()) {
               var18.method5101(arg0);
            }

            var19 = var18;
         } else {
            var19 = new class968(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, field395[arg2] * var16, field387[arg2] * var16, arg1, arg2, arg5);
         }

         this.field5612.method10497(arg6, arg11, arg12, var19, (class288)null);
         return true;
      } else if (class850.field8720.field8736 == arg1) {
         int var20 = 33;
         class376 var21 = (class376)this.field5612.method10510(arg6, arg11, arg12);
         if (var21 != null) {
            var20 = this.field397.method14651(var21.method5093()).field8598 / 2 + 1;
         }

         class288 var23;
         if (arg3) {
            class978 var22 = new class978(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, field395[arg2] * var20, field387[arg2] * var20, arg1, arg2 + 4);
            if (var22.method5086()) {
               var22.method5101(arg0);
            }

            var23 = var22;
         } else {
            var23 = new class968(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, field393[arg2] * var20, field394[arg2] * var20, arg1, arg2 + 4, arg5);
         }

         this.field5612.method10497(arg6, arg11, arg12, var23, (class288)null);
         return true;
      } else if (class850.field8714.field8736 == arg1) {
         int var24 = arg2 + 2 & 3;
         class288 var26;
         if (arg3) {
            class978 var25 = new class978(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, 0, 0, arg1, var24 + 4);
            if (var25.method5086()) {
               var25.method5101(arg0);
            }

            var26 = var25;
         } else {
            var26 = new class968(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, 0, 0, arg1, var24 + 4, arg5);
         }

         this.field5612.method10497(arg6, arg11, arg12, var26, (class288)null);
         return true;
      } else if (class850.field8722.field8736 == arg1) {
         int var27 = arg2 + 2 & 3;
         int var28 = 33;
         class376 var29 = (class376)this.field5612.method10510(arg6, arg11, arg12);
         if (var29 != null) {
            var28 = this.field397.method14651(var29.method5093()).field8598 / 2 + 1;
         }

         class288 var32;
         class288 var33;
         if (arg3) {
            class978 var30 = new class978(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, field393[arg2] * var28, field394[arg2] * var28, arg1, arg2 + 4);
            class978 var31 = new class978(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, 0, 0, arg1, var27 + 4);
            if (var30.method5086()) {
               var30.method5101(arg0);
            }

            if (var31.method5086()) {
               var31.method5101(arg0);
            }

            var32 = var30;
            var33 = var31;
         } else {
            class968 var34 = new class968(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, field393[arg2] * var28, field394[arg2] * var28, arg1, arg2 + 4, arg5);
            class968 var35 = new class968(this.field5612, arg0, this.field397, arg4, arg6, arg7, arg8, arg9, arg10, this.field5691, 0, 0, arg1, var27 + 4, arg5);
            var32 = var34;
            var33 = var35;
         }

         this.field5612.method10497(arg6, arg11, arg12, var32, var33);
         return true;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("aby.cc(Lra;IIIILml;I)V")
   public void method863(class772 arg0, int arg1, int arg2, int arg3, int arg4, class648 arg5) {
      class376 var7 = this.method856(arg1, arg2, arg3, arg4);
      if (var7 != null) {
         class843 var8 = this.field397.method14651(var7.method5093());
         int var9 = var7.method5083();
         int var10 = var7.method5084();
         if (var8.method14880()) {
            class98.method7315(arg1, arg3, arg4, var8);
         }

         if (var7.method5086()) {
            var7.method5088(arg0);
         }

         if (arg2 == 0) {
            this.field5612.method10501(arg1, arg3, arg4);
            this.field5612.method10502(arg1, arg3, arg4);
            if (var8.field8594 != 0) {
               arg5.method9344(arg3, arg4, var9, var10, var8.field8586, !var8.field8620);
            }

            if (var8.field8593 == 1) {
               if (var10 == 0) {
                  this.field5612.field6566.method10416(1, arg1, arg3, arg4);
               } else if (var10 == 1) {
                  this.field5612.field6566.method10416(2, arg1, arg3, arg4 + 1);
               } else if (var10 == 2) {
                  this.field5612.field6566.method10416(1, arg1, arg3 + 1, arg4);
               } else if (var10 == 3) {
                  this.field5612.field6566.method10416(2, arg1, arg3, arg4);
               }
            }
         } else if (arg2 == 1) {
            this.field5612.method10620(arg1, arg3, arg4);
            this.field5612.method10504(arg1, arg3, arg4);
         } else if (arg2 == 2) {
            this.field5612.method10507(arg1, arg3, arg4, client.field2704);
            if (var8.field8594 != 0 && var8.field8585 + arg3 < this.field5623 && var8.field8585 + arg4 < this.field5624 && var8.field8570 + arg3 < this.field5623 && var8.field8570 + arg4 < this.field5624) {
               arg5.method9352(arg3, arg4, var8.field8585, var8.field8570, var10, var8.field8586, !var8.field8620);
            }

            if (class850.field8717.field8736 == var9) {
               if ((var10 & 1) == 0) {
                  this.field5612.field6566.method10416(8, arg1, arg3, arg4);
               } else {
                  this.field5612.field6566.method10416(16, arg1, arg3, arg4);
               }
            }
         } else if (arg2 == 3) {
            this.field5612.method10505(arg1, arg3, arg4);
            if (var8.field8594 == 1) {
               arg5.method9355(arg3, arg4);
            }
         }
      }

   }

   @deob.ObfuscatedName("aby.cx(IIIIB)Lcr;")
   public class376 method856(int arg0, int arg1, int arg2, int arg3) {
      class376 var5 = null;
      if (arg1 == 0) {
         var5 = (class376)this.field5612.method10510(arg0, arg2, arg3);
      }

      if (arg1 == 1) {
         var5 = (class376)this.field5612.method10577(arg0, arg2, arg3);
      }

      if (arg1 == 2) {
         var5 = (class376)this.field5612.method10514(arg0, arg2, arg3, client.field2704);
      }

      if (arg1 == 3) {
         var5 = (class376)this.field5612.method10516(arg0, arg2, arg3);
      }

      return var5;
   }

   @deob.ObfuscatedName("aby.ch(Lra;ZI)V")
   public final void method866(class772 arg0, boolean arg1) {
      this.field5612.method10517();
      if (!arg1) {
         if (this.field5622 > 1) {
            for(int var3 = 0; var3 < this.field5623; ++var3) {
               for(int var4 = 0; var4 < this.field5624; ++var4) {
                  if ((this.field5653.field5520[1][var3][var4] & 2) == 2) {
                     this.field5612.method10483(var3, var4);
                  }
               }
            }
         }

         for(int var5 = 0; var5 < this.field5622; ++var5) {
            for(int var6 = 0; var6 <= this.field5624; ++var6) {
               for(int var7 = 0; var7 <= this.field5623; ++var7) {
                  if ((this.field5633[var5][var7][var6] & 4) != 0) {
                     int var8 = var7;
                     int var9 = var7;
                     int var10 = var6;
                     int var11 = var6;

                     while(var10 > 0 && (this.field5633[var5][var7][var10 - 1] & 4) != 0 && var11 - var10 < 10) {
                        --var10;
                     }

                     while(var11 < this.field5624 && (this.field5633[var5][var7][var11 + 1] & 4) != 0 && var11 - var10 < 10) {
                        ++var11;
                     }

                     label108:
                     while(var8 > 0 && var9 - var8 < 10) {
                        for(int var12 = var10; var12 <= var11; ++var12) {
                           if ((this.field5633[var5][var8 - 1][var12] & 4) == 0) {
                              break label108;
                           }
                        }

                        --var8;
                     }

                     label95:
                     while(var9 < this.field5623 && var9 - var8 < 10) {
                        for(int var13 = var10; var13 <= var11; ++var13) {
                           if ((this.field5633[var5][var9 + 1][var13] & 4) == 0) {
                              break label95;
                           }
                        }

                        ++var9;
                     }

                     if ((var9 - var8 + 1) * (var11 - var10 + 1) >= 4) {
                        int var14 = this.field5626[var5][var8][var10];
                        this.field5612.field6566.method10397(4, var5, var8 << 9, (var9 << 9) + 512, var10 << 9, (var11 << 9) + 512, var14, var14);

                        for(int var15 = var8; var15 <= var9; ++var15) {
                           for(int var16 = var10; var16 <= var11; ++var16) {
                              this.field5633[var5][var15][var16] &= -5;
                           }
                        }
                     }
                  }
               }
            }
         }

         this.field5612.field6566.method10423();
      }

      this.field5633 = (byte[][][])null;
   }
}
