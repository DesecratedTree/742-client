@deob.ObfuscatedName("ago")
public class class179 extends class986 {
   @deob.ObfuscatedName("ago.ag")
   private byte[] field1189;
   @deob.ObfuscatedName("ago.ak")
   private int[] field1188;

   public class179(class984 arg0, byte[] arg1, int[] arg2, int arg3, int arg4) {
      super(arg0, arg3, arg4);
      this.field1189 = arg1;
      this.field1188 = arg2;
   }

   @deob.ObfuscatedName("ago.t(IIIIII)V")
   public void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ago.c(III)V")
   public void method2390(int arg0, int arg1, int arg2) {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ago.i()Ldm;")
   public class398 method2391() {
      throw new IllegalStateException();
   }

   @deob.ObfuscatedName("ago.q(IIIII)V")
   public void method2388(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (this.field10459.method16820()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field10459.field10406;
         if (var6 != null) {
            int var7 = this.field10459.field10407;
            int var8 = this.field10453 + arg0;
            int var9 = this.field10461 + arg1;
            int var10 = var7 * var9 + var8;
            int var11 = 0;
            int var12 = this.field10452;
            int var13 = this.field10465;
            int var14 = var7 - var13;
            int var15 = 0;
            if (var9 < this.field10459.field10415) {
               int var16 = this.field10459.field10415 - var9;
               var12 -= var16;
               var9 = this.field10459.field10415;
               var11 += var13 * var16;
               var10 += var7 * var16;
            }

            if (var9 + var12 > this.field10459.field10413) {
               var12 -= var9 + var12 - this.field10459.field10413;
            }

            if (var8 < this.field10459.field10405) {
               int var17 = this.field10459.field10405 - var8;
               var13 -= var17;
               var8 = this.field10459.field10405;
               var11 += var17;
               var10 += var17;
               var15 += var17;
               var14 += var17;
            }

            if (var8 + var13 > this.field10459.field10411) {
               int var18 = var8 + var13 - this.field10459.field10411;
               var13 -= var18;
               var15 += var18;
               var14 += var18;
            }

            if (var13 > 0 && var12 > 0) {
               if (arg4 == 0) {
                  if (arg2 == 1) {
                     for(int var19 = -var12; var19 < 0; ++var19) {
                        int var20 = var10 + var13 - 3;

                        while(var10 < var20) {
                           var6[var10++] = this.field1188[this.field1189[var11++] & 255];
                           var6[var10++] = this.field1188[this.field1189[var11++] & 255];
                           var6[var10++] = this.field1188[this.field1189[var11++] & 255];
                           var6[var10++] = this.field1188[this.field1189[var11++] & 255];
                        }

                        var20 += 3;

                        while(var10 < var20) {
                           var6[var10++] = this.field1188[this.field1189[var11++] & 255];
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else if (arg2 == 0) {
                     int var21 = (arg3 & 16711680) >> 16;
                     int var22 = (arg3 & 65280) >> 8;
                     int var23 = arg3 & 255;

                     for(int var24 = -var12; var24 < 0; ++var24) {
                        for(int var25 = -var13; var25 < 0; ++var25) {
                           int var26 = this.field1188[this.field1189[var11++] & 255];
                           int var27 = (var26 & 16711680) * var21 & -16777216;
                           int var28 = (var26 & 65280) * var22 & 16711680;
                           int var29 = (var26 & 255) * var23 & 65280;
                           var6[var10++] = (var27 | var28 | var29) >>> 8;
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else if (arg2 == 3) {
                     for(int var30 = -var12; var30 < 0; ++var30) {
                        for(int var31 = -var13; var31 < 0; ++var31) {
                           int var32 = this.field1188[this.field1189[var11++] & 255];
                           int var33 = arg3 + var32;
                           int var34 = (arg3 & 16711935) + (var32 & 16711935);
                           int var35 = (var33 - var34 & 65536) + (var34 & 16777472);
                           var6[var10++] = var33 - var35 | var35 - (var35 >>> 8);
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else {
                     if (arg2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var36 = arg3 >>> 24;
                     int var37 = 256 - var36;
                     int var38 = (arg3 & 16711935) * var37 & -16711936;
                     int var39 = (arg3 & 65280) * var37 & 16711680;
                     int var40 = (var38 | var39) >>> 8;

                     for(int var41 = -var12; var41 < 0; ++var41) {
                        for(int var42 = -var13; var42 < 0; ++var42) {
                           int var43 = this.field1188[this.field1189[var11++] & 255];
                           int var44 = (var43 & 16711935) * var36 & -16711936;
                           int var45 = (var43 & 65280) * var36 & 16711680;
                           var6[var10++] = ((var44 | var45) >>> 8) + var40;
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  }
               } else if (arg4 == 1) {
                  if (arg2 == 1) {
                     for(int var46 = -var12; var46 < 0; ++var46) {
                        for(int var47 = -var13; var47 < 0; ++var47) {
                           byte var48 = this.field1189[var11++];
                           if (var48 != 0) {
                              int var49 = this.field1188[var48 & 255] | -16777216;
                              short var50 = 255;
                              byte var51 = 0;
                              int var52 = var6[var10];
                              var6[var10++] = (((var49 & 16711935) * var50 + (var52 & 16711935) * var51 & -16711936) >> 8) + (((var49 & -16711936) >>> 8) * var50 + ((var52 & -16711936) >>> 8) * var51 & -16711936);
                           } else {
                              ++var10;
                           }
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else if (arg2 == 0) {
                     if ((arg3 & 16777215) == 16777215) {
                        int var53 = arg3 >>> 24;
                        int var54 = 256 - var53;

                        for(int var55 = -var12; var55 < 0; ++var55) {
                           for(int var56 = -var13; var56 < 0; ++var56) {
                              byte var57 = this.field1189[var11++];
                              if (var57 != 0) {
                                 int var58 = this.field1188[var57 & 255];
                                 int var59 = var6[var10];
                                 var6[var10++] = ((var58 & 16711935) * var53 + (var59 & 16711935) * var54 & -16711936) + ((var58 & 65280) * var53 + (var59 & 65280) * var54 & 16711680) >> 8;
                              } else {
                                 ++var10;
                              }
                           }

                           var10 += var14;
                           var11 += var15;
                        }
                     } else {
                        int var60 = (arg3 & 16711680) >> 16;
                        int var61 = (arg3 & 65280) >> 8;
                        int var62 = arg3 & 255;
                        int var63 = arg3 >>> 24;
                        int var64 = 256 - var63;

                        for(int var65 = -var12; var65 < 0; ++var65) {
                           for(int var66 = -var13; var66 < 0; ++var66) {
                              byte var67 = this.field1189[var11++];
                              if (var67 != 0) {
                                 int var68 = this.field1188[var67 & 255];
                                 if (var63 != 255) {
                                    int var69 = (var68 & 16711680) * var60 & -16777216;
                                    int var70 = (var68 & 65280) * var61 & 16711680;
                                    int var71 = (var68 & 255) * var62 & 65280;
                                    int var72 = (var69 | var70 | var71) >>> 8;
                                    int var73 = var6[var10];
                                    var6[var10++] = ((var72 & 16711935) * var63 + (var73 & 16711935) * var64 & -16711936) + ((var72 & 65280) * var63 + (var73 & 65280) * var64 & 16711680) >> 8;
                                 } else {
                                    int var74 = (var68 & 16711680) * var60 & -16777216;
                                    int var75 = (var68 & 65280) * var61 & 16711680;
                                    int var76 = (var68 & 255) * var62 & 65280;
                                    var6[var10++] = (var74 | var75 | var76) >>> 8;
                                 }
                              } else {
                                 ++var10;
                              }
                           }

                           var10 += var14;
                           var11 += var15;
                        }
                     }
                  } else if (arg2 == 3) {
                     int var77 = arg3 >>> 24;
                     int var78 = 256 - var77;

                     for(int var79 = -var12; var79 < 0; ++var79) {
                        for(int var80 = -var13; var80 < 0; ++var80) {
                           byte var81 = this.field1189[var11++];
                           int var82 = var81 > 0 ? this.field1188[var81] : 0;
                           int var83 = arg3 + var82;
                           int var84 = (arg3 & 16711935) + (var82 & 16711935);
                           int var85 = (var83 - var84 & 65536) + (var84 & 16777472);
                           int var86 = var83 - var85 | var85 - (var85 >>> 8);
                           if (var82 == 0 && var77 != 255) {
                              int var88 = var6[var10];
                              var86 = ((var86 & 16711935) * var77 + (var88 & 16711935) * var78 & -16711936) + ((var86 & 65280) * var77 + (var88 & 65280) * var78 & 16711680) >> 8;
                           }

                           var6[var10++] = var86;
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else {
                     if (arg2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var89 = arg3 >>> 24;
                     int var90 = 256 - var89;
                     int var91 = (arg3 & 16711935) * var90 & -16711936;
                     int var92 = (arg3 & 65280) * var90 & 16711680;
                     int var93 = (var91 | var92) >>> 8;

                     for(int var94 = -var12; var94 < 0; ++var94) {
                        for(int var95 = -var13; var95 < 0; ++var95) {
                           byte var96 = this.field1189[var11++];
                           if (var96 != 0) {
                              int var97 = this.field1188[var96 & 255];
                              int var98 = (var97 & 16711935) * var89 & -16711936;
                              int var99 = (var97 & 65280) * var89 & 16711680;
                              var6[var10++] = ((var98 | var99) >>> 8) + var93;
                           } else {
                              ++var10;
                           }
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  }
               } else {
                  if (arg4 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if (arg2 == 1) {
                     for(int var100 = -var12; var100 < 0; ++var100) {
                        for(int var101 = -var13; var101 < 0; ++var101) {
                           byte var102 = this.field1189[var11++];
                           if (var102 != 0) {
                              int var103 = this.field1188[var102 & 255];
                              int var104 = var6[var10];
                              int var105 = var103 + var104;
                              int var106 = (var103 & 16711935) + (var104 & 16711935);
                              int var107 = (var105 - var106 & 65536) + (var106 & 16777472);
                              var6[var10++] = var105 - var107 | var107 - (var107 >>> 8);
                           } else {
                              ++var10;
                           }
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else if (arg2 == 0) {
                     int var108 = (arg3 & 16711680) >> 16;
                     int var109 = (arg3 & 65280) >> 8;
                     int var110 = arg3 & 255;

                     for(int var111 = -var12; var111 < 0; ++var111) {
                        for(int var112 = -var13; var112 < 0; ++var112) {
                           byte var113 = this.field1189[var11++];
                           if (var113 != 0) {
                              int var114 = this.field1188[var113 & 255];
                              int var115 = (var114 & 16711680) * var108 & -16777216;
                              int var116 = (var114 & 65280) * var109 & 16711680;
                              int var117 = (var114 & 255) * var110 & 65280;
                              int var118 = (var115 | var116 | var117) >>> 8;
                              int var119 = var6[var10];
                              int var120 = var118 + var119;
                              int var121 = (var118 & 16711935) + (var119 & 16711935);
                              int var122 = (var120 - var121 & 65536) + (var121 & 16777472);
                              var6[var10++] = var120 - var122 | var122 - (var122 >>> 8);
                           } else {
                              ++var10;
                           }
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else if (arg2 == 3) {
                     for(int var123 = -var12; var123 < 0; ++var123) {
                        for(int var124 = -var13; var124 < 0; ++var124) {
                           byte var125 = this.field1189[var11++];
                           int var126 = var125 > 0 ? this.field1188[var125] : 0;
                           int var127 = arg3 + var126;
                           int var128 = (arg3 & 16711935) + (var126 & 16711935);
                           int var129 = (var127 - var128 & 65536) + (var128 & 16777472);
                           int var130 = var127 - var129 | var129 - (var129 >>> 8);
                           int var131 = var6[var10];
                           int var132 = var130 + var131;
                           int var133 = (var130 & 16711935) + (var131 & 16711935);
                           int var134 = (var132 - var133 & 65536) + (var133 & 16777472);
                           var6[var10++] = var132 - var134 | var134 - (var134 >>> 8);
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else {
                     if (arg2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var135 = arg3 >>> 24;
                     int var136 = 256 - var135;
                     int var137 = (arg3 & 16711935) * var136 & -16711936;
                     int var138 = (arg3 & 65280) * var136 & 16711680;
                     int var139 = (var137 | var138) >>> 8;

                     for(int var140 = -var12; var140 < 0; ++var140) {
                        for(int var141 = -var13; var141 < 0; ++var141) {
                           byte var142 = this.field1189[var11++];
                           if (var142 != 0) {
                              int var143 = this.field1188[var142 & 255];
                              int var144 = (var143 & 16711935) * var135 & -16711936;
                              int var145 = (var143 & 65280) * var135 & 16711680;
                              int var146 = ((var144 | var145) >>> 8) + var139;
                              int var147 = var6[var10];
                              int var148 = var146 + var147;
                              int var149 = (var146 & 16711935) + (var147 & 16711935);
                              int var150 = (var148 - var149 & 65536) + (var149 & 16777472);
                              var6[var10++] = var148 - var150 | var150 - (var150 >>> 8);
                           } else {
                              ++var10;
                           }
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  }
               }

            }
         }
      }
   }

   @deob.ObfuscatedName("ago.f(IILta;II)V")
   public void method2393(int arg0, int arg1, class826 arg2, int arg3, int arg4) {
      if (this.field10459.method16820()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field10459.field10406;
         if (var6 != null) {
            int var7 = this.field10453 + arg0;
            int var8 = this.field10461 + arg1;
            int var9 = 0;
            int var10 = this.field10459.field10407;
            int var11 = this.field10465;
            int var12 = this.field10452;
            int var13 = var10 - var11;
            int var14 = 0;
            int var15 = var8 * var10 + var7;
            if (var8 < this.field10459.field10415) {
               int var16 = this.field10459.field10415 - var8;
               var12 -= var16;
               var8 = this.field10459.field10415;
               var9 += var11 * var16;
               var15 += var10 * var16;
            }

            if (var8 + var12 > this.field10459.field10413) {
               var12 -= var8 + var12 - this.field10459.field10413;
            }

            if (var7 < this.field10459.field10405) {
               int var17 = this.field10459.field10405 - var7;
               var11 -= var17;
               var7 = this.field10459.field10405;
               var9 += var17;
               var15 += var17;
               var14 += var17;
               var13 += var17;
            }

            if (var7 + var11 > this.field10459.field10411) {
               int var18 = var7 + var11 - this.field10459.field10411;
               var11 -= var18;
               var14 += var18;
               var13 += var18;
            }

            if (var11 > 0 && var12 > 0) {
               class962 var19 = (class962)arg2;
               int[] var20 = var19.field9621;
               int[] var21 = var19.field9622;
               int var22 = var8;
               if (arg4 > var8) {
                  var22 = arg4;
                  var15 += (arg4 - var8) * var10;
                  var9 += (arg4 - var8) * this.field10465;
               }

               int var23 = var20.length + arg4 < var8 + var12 ? var20.length + arg4 : var8 + var12;

               for(int var24 = var22; var24 < var23; ++var24) {
                  int var25 = var20[var24 - arg4] + arg3;
                  int var26 = var21[var24 - arg4];
                  int var27 = var11;
                  if (var7 > var25) {
                     int var28 = var7 - var25;
                     if (var28 >= var26) {
                        var9 += var11 + var14;
                        var15 += var11 + var13;
                        continue;
                     }

                     var26 -= var28;
                  } else {
                     int var29 = var25 - var7;
                     if (var29 >= var11) {
                        var9 += var11 + var14;
                        var15 += var11 + var13;
                        continue;
                     }

                     var9 += var29;
                     var27 = var11 - var29;
                     var15 += var29;
                  }

                  int var30 = 0;
                  if (var27 < var26) {
                     var26 = var27;
                  } else {
                     var30 = var27 - var26;
                  }

                  for(int var31 = -var26; var31 < 0; ++var31) {
                     byte var32 = this.field1189[var9++];
                     if (var32 != 0) {
                        var6[var15++] = this.field1188[var32 & 255];
                     } else {
                        ++var15;
                     }
                  }

                  var9 += var14 + var30;
                  var15 += var13 + var30;
               }

            }
         }
      }
   }

   @deob.ObfuscatedName("ago.n(ZZZIIFIIIIIIZ)V")
   public void method2409(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
      if (arg6 > 0 && arg7 > 0) {
         if (arg0 || arg1) {
            int var14 = 0;
            int var15 = 0;
            int var16 = this.field10465 + this.field10453 + this.field10469;
            int var17 = this.field10461 + this.field10452 + this.field10474;
            int var18 = (var16 << 16) / arg6;
            int var19 = (var17 << 16) / arg7;
            if (this.field10453 > 0) {
               int var20 = ((this.field10453 << 16) + var18 - 1) / var18;
               arg3 += var20;
               var14 += var18 * var20 - (this.field10453 << 16);
            }

            if (this.field10461 > 0) {
               int var21 = ((this.field10461 << 16) + var19 - 1) / var19;
               arg4 += var21;
               var15 += var19 * var21 - (this.field10461 << 16);
            }

            if (this.field10465 < var16) {
               arg6 = ((this.field10465 << 16) - var14 + var18 - 1) / var18;
            }

            if (this.field10452 < var17) {
               arg7 = ((this.field10452 << 16) - var15 + var19 - 1) / var19;
            }

            int var22 = this.field10459.field10407 * arg4 + arg3;
            int var23 = this.field10459.field10407 - arg6;
            if (arg4 + arg7 > this.field10459.field10413) {
               arg7 -= arg4 + arg7 - this.field10459.field10413;
            }

            if (arg4 < this.field10459.field10415) {
               int var24 = this.field10459.field10415 - arg4;
               arg7 -= var24;
               var22 += this.field10459.field10407 * var24;
               var15 += var19 * var24;
            }

            if (arg3 + arg6 > this.field10459.field10411) {
               int var25 = arg3 + arg6 - this.field10459.field10411;
               arg6 -= var25;
               var23 += var25;
            }

            if (arg3 < this.field10459.field10405) {
               int var26 = this.field10459.field10405 - arg3;
               arg6 -= var26;
               var22 += var26;
               var14 += var18 * var26;
               var23 += var26;
            }

            float[] var27 = this.field10459.field10414;
            int[] var28 = this.field10459.field10406;
            if (arg10 == 0) {
               if (arg8 == 1) {
                  int var29 = var14;

                  for(int var30 = -arg7; var30 < 0; ++var30) {
                     int var31 = (var15 >> 16) * this.field10465;

                     for(int var32 = -arg6; var32 < 0; ++var32) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              var28[var22] = this.field1188[this.field1189[(var14 >> 16) + var31] & 255];
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var29;
                     var22 += var23;
                  }
               } else if (arg8 == 0) {
                  int var33 = (arg9 & 16711680) >> 16;
                  int var34 = (arg9 & 65280) >> 8;
                  int var35 = arg9 & 255;
                  int var36 = var14;

                  for(int var37 = -arg7; var37 < 0; ++var37) {
                     int var38 = (var15 >> 16) * this.field10465;

                     for(int var39 = -arg6; var39 < 0; ++var39) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              int var40 = this.field1188[this.field1189[(var14 >> 16) + var38] & 255];
                              int var41 = (var40 & 16711680) * var33 & -16777216;
                              int var42 = (var40 & 65280) * var34 & 16711680;
                              int var43 = (var40 & 255) * var35 & 65280;
                              var28[var22] = (var41 | var42 | var43) >>> 8;
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var36;
                     var22 += var23;
                  }
               } else if (arg8 == 3) {
                  int var44 = var14;

                  for(int var45 = -arg7; var45 < 0; ++var45) {
                     int var46 = (var15 >> 16) * this.field10465;

                     for(int var47 = -arg6; var47 < 0; ++var47) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              byte var48 = this.field1189[(var14 >> 16) + var46];
                              int var49 = var48 > 0 ? this.field1188[var48] : 0;
                              int var50 = arg9 + var49;
                              int var51 = (arg9 & 16711935) + (var49 & 16711935);
                              int var52 = (var50 - var51 & 65536) + (var51 & 16777472);
                              var28[var22] = var50 - var52 | var52 - (var52 >>> 8);
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var44;
                     var22 += var23;
                  }
               } else {
                  if (arg8 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var53 = arg9 >>> 24;
                  int var54 = 256 - var53;
                  int var55 = (arg9 & 16711935) * var54 & -16711936;
                  int var56 = (arg9 & 65280) * var54 & 16711680;
                  int var57 = (var55 | var56) >>> 8;
                  int var58 = var14;

                  for(int var59 = -arg7; var59 < 0; ++var59) {
                     int var60 = (var15 >> 16) * this.field10465;

                     for(int var61 = -arg6; var61 < 0; ++var61) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              int var62 = this.field1188[this.field1189[(var14 >> 16) + var60] & 255];
                              int var63 = (var62 & 16711935) * var53 & -16711936;
                              int var64 = (var62 & 65280) * var53 & 16711680;
                              var28[var22] = ((var63 | var64) >>> 8) + var57;
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var58;
                     var22 += var23;
                  }
               }
            } else if (arg10 == 1) {
               if (arg8 == 1) {
                  int var65 = var14;

                  for(int var66 = -arg7; var66 < 0; ++var66) {
                     int var67 = (var15 >> 16) * this.field10465;

                     for(int var68 = -arg6; var68 < 0; ++var68) {
                        if (!arg1 || arg5 < var27[var22]) {
                           byte var69 = this.field1189[(var14 >> 16) + var67];
                           if (var69 != 0) {
                              if (arg0) {
                                 var28[var22] = this.field1188[var69 & 255];
                              }

                              if (arg1 && arg12) {
                                 var27[var22] = arg5;
                              }
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var65;
                     var22 += var23;
                  }
               } else if (arg8 == 0) {
                  int var70 = var14;
                  if ((arg9 & 16777215) == 16777215) {
                     int var71 = arg9 >>> 24;
                     int var72 = 256 - var71;

                     for(int var73 = -arg7; var73 < 0; ++var73) {
                        int var74 = (var15 >> 16) * this.field10465;

                        for(int var75 = -arg6; var75 < 0; ++var75) {
                           if (!arg1 || arg5 < var27[var22]) {
                              byte var76 = this.field1189[(var14 >> 16) + var74];
                              if (var76 != 0) {
                                 if (arg0) {
                                    int var77 = this.field1188[var76 & 255];
                                    int var78 = var28[var22];
                                    var28[var22] = ((var77 & 16711935) * var71 + (var78 & 16711935) * var72 & -16711936) + ((var77 & 65280) * var71 + (var78 & 65280) * var72 & 16711680) >> 8;
                                 }

                                 if (arg1 && arg12) {
                                    var27[var22] = arg5;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var22;
                        }

                        var15 += var19;
                        var14 = var70;
                        var22 += var23;
                     }
                  } else {
                     int var79 = (arg9 & 16711680) >> 16;
                     int var80 = (arg9 & 65280) >> 8;
                     int var81 = arg9 & 255;
                     int var82 = arg9 >>> 24;
                     int var83 = 256 - var82;

                     for(int var84 = -arg7; var84 < 0; ++var84) {
                        int var85 = (var15 >> 16) * this.field10465;

                        for(int var86 = -arg6; var86 < 0; ++var86) {
                           if (!arg1 || arg5 < var27[var22]) {
                              byte var87 = this.field1189[(var14 >> 16) + var85];
                              if (var87 != 0) {
                                 int var88 = this.field1188[var87 & 255];
                                 if (var82 != 255) {
                                    if (arg0) {
                                       int var89 = (var88 & 16711680) * var79 & -16777216;
                                       int var90 = (var88 & 65280) * var80 & 16711680;
                                       int var91 = (var88 & 255) * var81 & 65280;
                                       int var92 = (var89 | var90 | var91) >>> 8;
                                       int var93 = var28[var22];
                                       var28[var22] = ((var92 & 16711935) * var82 + (var93 & 16711935) * var83 & -16711936) + ((var92 & 65280) * var82 + (var93 & 65280) * var83 & 16711680) >> 8;
                                    }

                                    if (arg1 && arg12) {
                                       var27[var22] = arg5;
                                    }
                                 } else {
                                    if (arg0) {
                                       int var94 = (var88 & 16711680) * var79 & -16777216;
                                       int var95 = (var88 & 65280) * var80 & 16711680;
                                       int var96 = (var88 & 255) * var81 & 65280;
                                       var28[var22] = (var94 | var95 | var96) >>> 8;
                                    }

                                    if (arg1 && arg12) {
                                       var27[var22] = arg5;
                                    }
                                 }
                              }
                           }

                           var14 += var18;
                           ++var22;
                        }

                        var15 += var19;
                        var14 = var70;
                        var22 += var23;
                     }
                  }
               } else if (arg8 == 3) {
                  int var97 = var14;
                  int var98 = arg9 >>> 24;
                  int var99 = 256 - var98;

                  for(int var100 = -arg7; var100 < 0; ++var100) {
                     int var101 = (var15 >> 16) * this.field10465;

                     for(int var102 = -arg6; var102 < 0; ++var102) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              byte var103 = this.field1189[(var14 >> 16) + var101];
                              int var104 = var103 > 0 ? this.field1188[var103] : 0;
                              int var105 = arg9 + var104;
                              int var106 = (arg9 & 16711935) + (var104 & 16711935);
                              int var107 = (var105 - var106 & 65536) + (var106 & 16777472);
                              int var108 = var105 - var107 | var107 - (var107 >>> 8);
                              if (var104 == 0 && var98 != 255) {
                                 int var110 = var28[var22];
                                 var108 = ((var108 & 16711935) * var98 + (var110 & 16711935) * var99 & -16711936) + ((var108 & 65280) * var98 + (var110 & 65280) * var99 & 16711680) >> 8;
                              }

                              var28[var22] = var108;
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var97;
                     var22 += var23;
                  }
               } else {
                  if (arg8 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var111 = arg9 >>> 24;
                  int var112 = 256 - var111;
                  int var113 = (arg9 & 16711935) * var112 & -16711936;
                  int var114 = (arg9 & 65280) * var112 & 16711680;
                  int var115 = (var113 | var114) >>> 8;
                  int var116 = var14;

                  for(int var117 = -arg7; var117 < 0; ++var117) {
                     int var118 = (var15 >> 16) * this.field10465;

                     for(int var119 = -arg6; var119 < 0; ++var119) {
                        if (!arg1 || arg5 < var27[var22]) {
                           byte var120 = this.field1189[(var14 >> 16) + var118];
                           if (var120 != 0) {
                              if (arg0) {
                                 int var121 = this.field1188[var120 & 255];
                                 int var122 = (var121 & 16711935) * var111 & -16711936;
                                 int var123 = (var121 & 65280) * var111 & 16711680;
                                 var28[var22] = ((var122 | var123) >>> 8) + var115;
                              }

                              if (arg1 && arg12) {
                                 var27[var22] = arg5;
                              }
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var116;
                     var22 += var23;
                  }
               }
            } else {
               if (arg10 != 2) {
                  throw new IllegalArgumentException();
               }

               if (arg8 == 1) {
                  int var124 = var14;

                  for(int var125 = -arg7; var125 < 0; ++var125) {
                     int var126 = (var15 >> 16) * this.field10465;

                     for(int var127 = -arg6; var127 < 0; ++var127) {
                        if (!arg1 || arg5 < var27[var22]) {
                           byte var128 = this.field1189[(var14 >> 16) + var126];
                           if (var128 != 0) {
                              if (arg0) {
                                 int var129 = this.field1188[var128 & 255];
                                 int var130 = var28[var22];
                                 int var131 = var129 + var130;
                                 int var132 = (var129 & 16711935) + (var130 & 16711935);
                                 int var133 = (var131 - var132 & 65536) + (var132 & 16777472);
                                 var28[var22] = var131 - var133 | var133 - (var133 >>> 8);
                              }

                              if (arg1 && arg12) {
                                 var27[var22] = arg5;
                              }
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var124;
                     var22 += var23;
                  }
               } else if (arg8 == 0) {
                  int var134 = var14;
                  int var135 = (arg9 & 16711680) >> 16;
                  int var136 = (arg9 & 65280) >> 8;
                  int var137 = arg9 & 255;

                  for(int var138 = -arg7; var138 < 0; ++var138) {
                     int var139 = (var15 >> 16) * this.field10465;

                     for(int var140 = -arg6; var140 < 0; ++var140) {
                        if (!arg1 || arg5 < var27[var22]) {
                           byte var141 = this.field1189[(var14 >> 16) + var139];
                           if (var141 != 0) {
                              if (arg0) {
                                 int var142 = this.field1188[var141 & 255];
                                 int var143 = (var142 & 16711680) * var135 & -16777216;
                                 int var144 = (var142 & 65280) * var136 & 16711680;
                                 int var145 = (var142 & 255) * var137 & 65280;
                                 int var146 = (var143 | var144 | var145) >>> 8;
                                 int var147 = var28[var22];
                                 int var148 = var146 + var147;
                                 int var149 = (var146 & 16711935) + (var147 & 16711935);
                                 int var150 = (var148 - var149 & 65536) + (var149 & 16777472);
                                 var28[var22] = var148 - var150 | var150 - (var150 >>> 8);
                              }

                              if (arg1 && arg12) {
                                 var27[var22] = arg5;
                              }
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var134;
                     var22 += var23;
                  }
               } else if (arg8 == 3) {
                  int var151 = var14;

                  for(int var152 = -arg7; var152 < 0; ++var152) {
                     int var153 = (var15 >> 16) * this.field10465;

                     for(int var154 = -arg6; var154 < 0; ++var154) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              byte var155 = this.field1189[(var14 >> 16) + var153];
                              int var156 = var155 > 0 ? this.field1188[var155] : 0;
                              int var157 = arg9 + var156;
                              int var158 = (arg9 & 16711935) + (var156 & 16711935);
                              int var159 = (var157 - var158 & 65536) + (var158 & 16777472);
                              int var160 = var157 - var159 | var159 - (var159 >>> 8);
                              int var161 = var28[var22];
                              int var162 = var160 + var161;
                              int var163 = (var160 & 16711935) + (var161 & 16711935);
                              int var164 = (var162 - var163 & 65536) + (var163 & 16777472);
                              var28[var22] = var162 - var164 | var164 - (var164 >>> 8);
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var151;
                     var22 += var23;
                  }
               } else {
                  if (arg8 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var165 = arg9 >>> 24;
                  int var166 = 256 - var165;
                  int var167 = (arg9 & 16711935) * var166 & -16711936;
                  int var168 = (arg9 & 65280) * var166 & 16711680;
                  int var169 = (var167 | var168) >>> 8;
                  int var170 = var14;

                  for(int var171 = -arg7; var171 < 0; ++var171) {
                     int var172 = (var15 >> 16) * this.field10465;

                     for(int var173 = -arg6; var173 < 0; ++var173) {
                        if (!arg1 || arg5 < var27[var22]) {
                           byte var174 = this.field1189[(var14 >> 16) + var172];
                           if (var174 != 0) {
                              if (arg0) {
                                 int var175 = this.field1188[var174 & 255];
                                 int var176 = (var175 & 16711935) * var165 & -16711936;
                                 int var177 = (var175 & 65280) * var165 & 16711680;
                                 int var178 = ((var176 | var177) >>> 8) + var169;
                                 int var179 = var28[var22];
                                 int var180 = var178 + var179;
                                 int var181 = (var178 & 16711935) + (var179 & 16711935);
                                 int var182 = (var180 - var181 & 65536) + (var181 & 16777472);
                                 var28[var22] = var180 - var182 | var182 - (var182 >>> 8);
                              }

                              if (arg1 && arg12) {
                                 var27[var22] = arg5;
                              }
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var170;
                     var22 += var23;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("ago.av(IIIIIIII)V")
   protected void method2394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (this.field10459.method16820()) {
         throw new IllegalStateException();
      } else if (arg2 > 0 && arg3 > 0) {
         int[] var9 = this.field10459.field10406;
         if (var9 != null) {
            int var10 = 0;
            int var11 = 0;
            int var12 = this.field10459.field10407;
            int var13 = this.field10465 + this.field10453 + this.field10469;
            int var14 = this.field10461 + this.field10452 + this.field10474;
            int var15 = (var13 << 16) / arg2;
            int var16 = (var14 << 16) / arg3;
            if (this.field10453 > 0) {
               int var17 = ((this.field10453 << 16) + var15 - 1) / var15;
               arg0 += var17;
               var10 += var15 * var17 - (this.field10453 << 16);
            }

            if (this.field10461 > 0) {
               int var18 = ((this.field10461 << 16) + var16 - 1) / var16;
               arg1 += var18;
               var11 += var16 * var18 - (this.field10461 << 16);
            }

            if (this.field10465 < var13) {
               arg2 = ((this.field10465 << 16) - var10 + var15 - 1) / var15;
            }

            if (this.field10452 < var14) {
               arg3 = ((this.field10452 << 16) - var11 + var16 - 1) / var16;
            }

            int var19 = arg1 * var12 + arg0;
            int var20 = var12 - arg2;
            if (arg1 + arg3 > this.field10459.field10413) {
               arg3 -= arg1 + arg3 - this.field10459.field10413;
            }

            if (arg1 < this.field10459.field10415) {
               int var21 = this.field10459.field10415 - arg1;
               arg3 -= var21;
               var19 += var12 * var21;
               var11 += var16 * var21;
            }

            if (arg0 + arg2 > this.field10459.field10411) {
               int var22 = arg0 + arg2 - this.field10459.field10411;
               arg2 -= var22;
               var20 += var22;
            }

            if (arg0 < this.field10459.field10405) {
               int var23 = this.field10459.field10405 - arg0;
               arg2 -= var23;
               var19 += var23;
               var10 += var15 * var23;
               var20 += var23;
            }

            if (arg6 == 0) {
               if (arg4 == 1) {
                  int var24 = var10;

                  for(int var25 = -arg3; var25 < 0; ++var25) {
                     int var26 = (var11 >> 16) * this.field10465;

                     for(int var27 = -arg2; var27 < 0; ++var27) {
                        var9[var19++] = this.field1188[this.field1189[(var10 >> 16) + var26] & 255];
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var24;
                     var19 += var20;
                  }
               } else if (arg4 == 0) {
                  int var28 = (arg5 & 16711680) >> 16;
                  int var29 = (arg5 & 65280) >> 8;
                  int var30 = arg5 & 255;
                  int var31 = var10;

                  for(int var32 = -arg3; var32 < 0; ++var32) {
                     int var33 = (var11 >> 16) * this.field10465;

                     for(int var34 = -arg2; var34 < 0; ++var34) {
                        int var35 = this.field1188[this.field1189[(var10 >> 16) + var33] & 255];
                        int var36 = (var35 & 16711680) * var28 & -16777216;
                        int var37 = (var35 & 65280) * var29 & 16711680;
                        int var38 = (var35 & 255) * var30 & 65280;
                        var9[var19++] = (var36 | var37 | var38) >>> 8;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var31;
                     var19 += var20;
                  }
               } else if (arg4 == 3) {
                  int var39 = var10;

                  for(int var40 = -arg3; var40 < 0; ++var40) {
                     int var41 = (var11 >> 16) * this.field10465;

                     for(int var42 = -arg2; var42 < 0; ++var42) {
                        byte var43 = this.field1189[(var10 >> 16) + var41];
                        int var44 = var43 > 0 ? this.field1188[var43] : 0;
                        int var45 = arg5 + var44;
                        int var46 = (arg5 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        var9[var19++] = var45 - var47 | var47 - (var47 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var39;
                     var19 += var20;
                  }
               } else {
                  if (arg4 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var48 = arg5 >>> 24;
                  int var49 = 256 - var48;
                  int var50 = (arg5 & 16711935) * var49 & -16711936;
                  int var51 = (arg5 & 65280) * var49 & 16711680;
                  int var52 = (var50 | var51) >>> 8;
                  int var53 = var10;

                  for(int var54 = -arg3; var54 < 0; ++var54) {
                     int var55 = (var11 >> 16) * this.field10465;

                     for(int var56 = -arg2; var56 < 0; ++var56) {
                        int var57 = this.field1188[this.field1189[(var10 >> 16) + var55] & 255];
                        int var58 = (var57 & 16711935) * var48 & -16711936;
                        int var59 = (var57 & 65280) * var48 & 16711680;
                        var9[var19++] = ((var58 | var59) >>> 8) + var52;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var53;
                     var19 += var20;
                  }
               }
            } else if (arg6 == 1) {
               if (arg4 == 1) {
                  int var60 = var10;

                  for(int var61 = -arg3; var61 < 0; ++var61) {
                     int var62 = (var11 >> 16) * this.field10465;

                     for(int var63 = -arg2; var63 < 0; ++var63) {
                        byte var64 = this.field1189[(var10 >> 16) + var62];
                        if (var64 != 0) {
                           var9[var19++] = this.field1188[var64 & 255];
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var60;
                     var19 += var20;
                  }
               } else if (arg4 == 0) {
                  int var65 = var10;
                  if ((arg5 & 16777215) == 16777215) {
                     int var66 = arg5 >>> 24;
                     int var67 = 256 - var66;

                     for(int var68 = -arg3; var68 < 0; ++var68) {
                        int var69 = (var11 >> 16) * this.field10465;

                        for(int var70 = -arg2; var70 < 0; ++var70) {
                           byte var71 = this.field1189[(var10 >> 16) + var69];
                           if (var71 != 0) {
                              int var72 = this.field1188[var71 & 255];
                              int var73 = var9[var19];
                              var9[var19++] = ((var72 & 16711935) * var66 + (var73 & 16711935) * var67 & -16711936) + ((var72 & 65280) * var66 + (var73 & 65280) * var67 & 16711680) >> 8;
                           } else {
                              ++var19;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var65;
                        var19 += var20;
                     }
                  } else {
                     int var74 = (arg5 & 16711680) >> 16;
                     int var75 = (arg5 & 65280) >> 8;
                     int var76 = arg5 & 255;
                     int var77 = arg5 >>> 24;
                     int var78 = 256 - var77;

                     for(int var79 = -arg3; var79 < 0; ++var79) {
                        int var80 = (var11 >> 16) * this.field10465;

                        for(int var81 = -arg2; var81 < 0; ++var81) {
                           byte var82 = this.field1189[(var10 >> 16) + var80];
                           if (var82 != 0) {
                              int var83 = this.field1188[var82 & 255];
                              if (var77 != 255) {
                                 int var84 = (var83 & 16711680) * var74 & -16777216;
                                 int var85 = (var83 & 65280) * var75 & 16711680;
                                 int var86 = (var83 & 255) * var76 & 65280;
                                 int var87 = (var84 | var85 | var86) >>> 8;
                                 int var88 = var9[var19];
                                 var9[var19++] = ((var87 & 16711935) * var77 + (var88 & 16711935) * var78 & -16711936) + ((var87 & 65280) * var77 + (var88 & 65280) * var78 & 16711680) >> 8;
                              } else {
                                 int var89 = (var83 & 16711680) * var74 & -16777216;
                                 int var90 = (var83 & 65280) * var75 & 16711680;
                                 int var91 = (var83 & 255) * var76 & 65280;
                                 var9[var19++] = (var89 | var90 | var91) >>> 8;
                              }
                           } else {
                              ++var19;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var65;
                        var19 += var20;
                     }
                  }
               } else if (arg4 == 3) {
                  int var92 = var10;
                  int var93 = arg5 >>> 24;
                  int var94 = 256 - var93;

                  for(int var95 = -arg3; var95 < 0; ++var95) {
                     int var96 = (var11 >> 16) * this.field10465;

                     for(int var97 = -arg2; var97 < 0; ++var97) {
                        byte var98 = this.field1189[(var10 >> 16) + var96];
                        int var99 = var98 > 0 ? this.field1188[var98] : 0;
                        int var100 = arg5 + var99;
                        int var101 = (arg5 & 16711935) + (var99 & 16711935);
                        int var102 = (var100 - var101 & 65536) + (var101 & 16777472);
                        int var103 = var100 - var102 | var102 - (var102 >>> 8);
                        if (var99 == 0 && var93 != 255) {
                           int var105 = var9[var19];
                           var103 = ((var103 & 16711935) * var93 + (var105 & 16711935) * var94 & -16711936) + ((var103 & 65280) * var93 + (var105 & 65280) * var94 & 16711680) >> 8;
                        }

                        var9[var19++] = var103;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var92;
                     var19 += var20;
                  }
               } else {
                  if (arg4 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var106 = arg5 >>> 24;
                  int var107 = 256 - var106;
                  int var108 = (arg5 & 16711935) * var107 & -16711936;
                  int var109 = (arg5 & 65280) * var107 & 16711680;
                  int var110 = (var108 | var109) >>> 8;
                  int var111 = var10;

                  for(int var112 = -arg3; var112 < 0; ++var112) {
                     int var113 = (var11 >> 16) * this.field10465;

                     for(int var114 = -arg2; var114 < 0; ++var114) {
                        byte var115 = this.field1189[(var10 >> 16) + var113];
                        if (var115 != 0) {
                           int var116 = this.field1188[var115 & 255];
                           int var117 = (var116 & 16711935) * var106 & -16711936;
                           int var118 = (var116 & 65280) * var106 & 16711680;
                           var9[var19++] = ((var117 | var118) >>> 8) + var110;
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var111;
                     var19 += var20;
                  }
               }
            } else {
               if (arg6 != 2) {
                  throw new IllegalArgumentException();
               }

               if (arg4 == 1) {
                  int var119 = var10;

                  for(int var120 = -arg3; var120 < 0; ++var120) {
                     int var121 = (var11 >> 16) * this.field10465;

                     for(int var122 = -arg2; var122 < 0; ++var122) {
                        byte var123 = this.field1189[(var10 >> 16) + var121];
                        if (var123 != 0) {
                           int var124 = this.field1188[var123 & 255];
                           int var125 = var9[var19];
                           int var126 = var124 + var125;
                           int var127 = (var124 & 16711935) + (var125 & 16711935);
                           int var128 = (var126 - var127 & 65536) + (var127 & 16777472);
                           var9[var19++] = var126 - var128 | var128 - (var128 >>> 8);
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var119;
                     var19 += var20;
                  }
               } else if (arg4 == 0) {
                  int var129 = var10;
                  int var130 = (arg5 & 16711680) >> 16;
                  int var131 = (arg5 & 65280) >> 8;
                  int var132 = arg5 & 255;

                  for(int var133 = -arg3; var133 < 0; ++var133) {
                     int var134 = (var11 >> 16) * this.field10465;

                     for(int var135 = -arg2; var135 < 0; ++var135) {
                        byte var136 = this.field1189[(var10 >> 16) + var134];
                        if (var136 != 0) {
                           int var137 = this.field1188[var136 & 255];
                           int var138 = (var137 & 16711680) * var130 & -16777216;
                           int var139 = (var137 & 65280) * var131 & 16711680;
                           int var140 = (var137 & 255) * var132 & 65280;
                           int var141 = (var138 | var139 | var140) >>> 8;
                           int var142 = var9[var19];
                           int var143 = var141 + var142;
                           int var144 = (var141 & 16711935) + (var142 & 16711935);
                           int var145 = (var143 - var144 & 65536) + (var144 & 16777472);
                           var9[var19++] = var143 - var145 | var145 - (var145 >>> 8);
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var129;
                     var19 += var20;
                  }
               } else if (arg4 == 3) {
                  int var146 = var10;

                  for(int var147 = -arg3; var147 < 0; ++var147) {
                     int var148 = (var11 >> 16) * this.field10465;

                     for(int var149 = -arg2; var149 < 0; ++var149) {
                        byte var150 = this.field1189[(var10 >> 16) + var148];
                        int var151 = var150 > 0 ? this.field1188[var150] : 0;
                        int var152 = arg5 + var151;
                        int var153 = (arg5 & 16711935) + (var151 & 16711935);
                        int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                        int var155 = var152 - var154 | var154 - (var154 >>> 8);
                        int var156 = var9[var19];
                        int var157 = var155 + var156;
                        int var158 = (var155 & 16711935) + (var156 & 16711935);
                        int var159 = (var157 - var158 & 65536) + (var158 & 16777472);
                        var9[var19++] = var157 - var159 | var159 - (var159 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var146;
                     var19 += var20;
                  }
               } else {
                  if (arg4 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var160 = arg5 >>> 24;
                  int var161 = 256 - var160;
                  int var162 = (arg5 & 16711935) * var161 & -16711936;
                  int var163 = (arg5 & 65280) * var161 & 16711680;
                  int var164 = (var162 | var163) >>> 8;
                  int var165 = var10;

                  for(int var166 = -arg3; var166 < 0; ++var166) {
                     int var167 = (var11 >> 16) * this.field10465;

                     for(int var168 = -arg2; var168 < 0; ++var168) {
                        byte var169 = this.field1189[(var10 >> 16) + var167];
                        if (var169 != 0) {
                           int var170 = this.field1188[var169 & 255];
                           int var171 = (var170 & 16711935) * var160 & -16711936;
                           int var172 = (var170 & 65280) * var160 & 16711680;
                           int var173 = ((var171 | var172) >>> 8) + var164;
                           int var174 = var9[var19];
                           int var175 = var173 + var174;
                           int var176 = (var173 & 16711935) + (var174 & 16711935);
                           int var177 = (var175 - var176 & 65536) + (var176 & 16777472);
                           var9[var19++] = var175 - var177 | var177 - (var177 >>> 8);
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var165;
                     var19 += var20;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("ago.d(II)V")
   protected void method2396(int arg0, int arg1) {
      int[] var3 = this.field10459.field10406;
      if (var3 != null) {
         if (Statics.field10467 == 0) {
            if (Statics.field10468 == 0) {
               int var4 = Statics.field10464;

               while(var4 < 0) {
                  int var5 = Statics.field10466;
                  int var6 = Statics.field10473;
                  int var7 = Statics.field10479;
                  int var8 = Statics.field10462;
                  if (var6 >= 0 && var7 >= 0 && var6 - (this.field10465 << 12) < 0 && var7 - (this.field10452 << 12) < 0) {
                     while(var8 < 0) {
                        int var9 = (var6 >> 12) + (var7 >> 12) * this.field10465;
                        int var10 = var5++;
                        if (arg1 == 0) {
                           if (arg0 == 1) {
                              var3[var10] = this.field1188[this.field1189[var9] & 255];
                           } else if (arg0 == 0) {
                              int var11 = this.field1188[this.field1189[var9] & 255];
                              int var12 = (var11 & 16711680) * field10480 & -16777216;
                              int var13 = (var11 & 65280) * field10481 & 16711680;
                              int var14 = (var11 & 255) * field10482 & 65280;
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if (arg0 == 3) {
                              int var15 = this.field1188[this.field1189[var9] & 255];
                              int var16 = Statics.field10477;
                              int var17 = var15 + var16;
                              int var18 = (var15 & 16711935) + (var16 & 16711935);
                              int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                              var3[var10] = var17 - var19 | var19 - (var19 >>> 8);
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              int var20 = this.field1188[this.field1189[var9] & 255];
                              int var21 = (var20 & 16711935) * field10478 & -16711936;
                              int var22 = (var20 & 65280) * field10478 & 16711680;
                              var3[var10] = ((var21 | var22) >>> 8) + field10485;
                           }
                        } else if (arg1 == 1) {
                           if (arg0 == 1) {
                              byte var23 = this.field1189[var9];
                              if (var23 != 0) {
                                 var3[var10] = this.field1188[var23 & 255];
                              }
                           } else if (arg0 == 0) {
                              byte var24 = this.field1189[var9];
                              if (var24 != 0) {
                                 int var25 = this.field1188[var24 & 255];
                                 if ((Statics.field10477 & 16777215) == 16777215) {
                                    int var26 = Statics.field10477 >>> 24;
                                    int var27 = 256 - var26;
                                    int var28 = var3[var10];
                                    var3[var10] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                                 } else if (field10478 != 255) {
                                    int var29 = (var25 & 16711680) * field10480 & -16777216;
                                    int var30 = (var25 & 65280) * field10481 & 16711680;
                                    int var31 = (var25 & 255) * field10482 & 65280;
                                    int var32 = (var29 | var30 | var31) >>> 8;
                                    int var33 = var3[var10];
                                    var3[var10] = ((var32 & 16711935) * field10478 + (var33 & 16711935) * field10475 & -16711936) + ((var32 & 65280) * field10478 + (var33 & 65280) * field10475 & 16711680) >> 8;
                                 } else {
                                    int var34 = (var25 & 16711680) * field10480 & -16777216;
                                    int var35 = (var25 & 65280) * field10481 & 16711680;
                                    int var36 = (var25 & 255) * field10482 & 65280;
                                    var3[var10] = (var34 | var35 | var36) >>> 8;
                                 }
                              }
                           } else if (arg0 == 3) {
                              byte var37 = this.field1189[var9];
                              int var38 = var37 > 0 ? this.field1188[var37] : 0;
                              int var39 = Statics.field10477;
                              int var40 = var38 + var39;
                              int var41 = (var38 & 16711935) + (var39 & 16711935);
                              int var42 = (var40 - var41 & 65536) + (var41 & 16777472);
                              int var43 = var40 - var42 | var42 - (var42 >>> 8);
                              if (var38 == 0 && field10478 != 255) {
                                 int var45 = var3[var10];
                                 var43 = ((var43 & 16711935) * field10478 + (var45 & 16711935) * field10475 & -16711936) + ((var43 & 65280) * field10478 + (var45 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var10] = var43;
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              byte var46 = this.field1189[var9];
                              if (var46 != 0) {
                                 int var47 = this.field1188[var46 & 255];
                                 int var48 = (var47 & 16711935) * field10478 & -16711936;
                                 int var49 = (var47 & 65280) * field10478 & 16711680;
                                 var3[var10++] = ((var48 | var49) >>> 8) + field10485;
                              }
                           }
                        } else {
                           if (arg1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (arg0 == 1) {
                              byte var50 = this.field1189[var9];
                              if (var50 != 0) {
                                 int var51 = this.field1188[var50 & 255];
                                 int var52 = var3[var10];
                                 int var53 = var51 + var52;
                                 int var54 = (var51 & 16711935) + (var52 & 16711935);
                                 int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                                 var3[var10] = var53 - var55 | var55 - (var55 >>> 8);
                              }
                           } else if (arg0 == 0) {
                              byte var56 = this.field1189[var9];
                              if (var56 != 0) {
                                 int var57 = this.field1188[var56 & 255];
                                 int var58 = (var57 & 16711680) * field10480 & -16777216;
                                 int var59 = (var57 & 65280) * field10481 & 16711680;
                                 int var60 = (var57 & 255) * field10482 & 65280;
                                 int var61 = (var58 | var59 | var60) >>> 8;
                                 int var62 = var3[var10];
                                 int var63 = var61 + var62;
                                 int var64 = (var61 & 16711935) + (var62 & 16711935);
                                 int var65 = (var63 - var64 & 65536) + (var64 & 16777472);
                                 var3[var10] = var63 - var65 | var65 - (var65 >>> 8);
                              }
                           } else if (arg0 == 3) {
                              byte var66 = this.field1189[var9];
                              int var67 = var66 > 0 ? this.field1188[var66] : 0;
                              int var68 = Statics.field10477;
                              int var69 = var67 + var68;
                              int var70 = (var67 & 16711935) + (var68 & 16711935);
                              int var71 = (var69 - var70 & 65536) + (var70 & 16777472);
                              int var72 = var69 - var71 | var71 - (var71 >>> 8);
                              if (var67 == 0 && field10478 != 255) {
                                 int var74 = var3[var10];
                                 var72 = ((var72 & 16711935) * field10478 + (var74 & 16711935) * field10475 & -16711936) + ((var72 & 65280) * field10478 + (var74 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var10] = var72;
                           } else if (arg0 == 2) {
                              byte var75 = this.field1189[var9];
                              if (var75 != 0) {
                                 int var76 = this.field1188[var75 & 255];
                                 int var77 = (var76 & 16711935) * field10478 & -16711936;
                                 int var78 = (var76 & 65280) * field10478 & 16711680;
                                 int var79 = ((var77 | var78) >>> 8) + field10485;
                                 int var80 = var3[var10];
                                 int var81 = var79 + var80;
                                 int var82 = (var79 & 16711935) + (var80 & 16711935);
                                 int var83 = (var81 - var82 & 65536) + (var82 & 16777472);
                                 var3[var10] = var81 - var83 | var83 - (var83 >>> 8);
                              }
                           }
                        }

                        ++var8;
                     }
                  }

                  ++var4;
                  Statics.field10466 += Statics.field10456;
               }
            } else if (Statics.field10468 < 0) {
               int var84 = Statics.field10464;

               while(var84 < 0) {
                  int var85 = Statics.field10466;
                  int var86 = Statics.field10473;
                  int var87 = Statics.field10479 + Statics.field10455;
                  int var88 = Statics.field10462;
                  if (var86 >= 0 && var86 - (this.field10465 << 12) < 0) {
                     int var89;
                     if ((var89 = var87 - (this.field10452 << 12)) >= 0) {
                        int var90 = (Statics.field10468 - var89) / Statics.field10468;
                        var88 += var90;
                        var87 += Statics.field10468 * var90;
                        var85 += var90;
                     }

                     int var91;
                     if ((var91 = (var87 - Statics.field10468) / Statics.field10468) > var88) {
                        var88 = var91;
                     }

                     while(var88 < 0) {
                        int var92 = (var86 >> 12) + (var87 >> 12) * this.field10465;
                        int var93 = var85++;
                        if (arg1 == 0) {
                           if (arg0 == 1) {
                              var3[var93] = this.field1188[this.field1189[var92] & 255];
                           } else if (arg0 == 0) {
                              int var94 = this.field1188[this.field1189[var92] & 255];
                              int var95 = (var94 & 16711680) * field10480 & -16777216;
                              int var96 = (var94 & 65280) * field10481 & 16711680;
                              int var97 = (var94 & 255) * field10482 & 65280;
                              var3[var93] = (var95 | var96 | var97) >>> 8;
                           } else if (arg0 == 3) {
                              int var98 = this.field1188[this.field1189[var92] & 255];
                              int var99 = Statics.field10477;
                              int var100 = var98 + var99;
                              int var101 = (var98 & 16711935) + (var99 & 16711935);
                              int var102 = (var100 - var101 & 65536) + (var101 & 16777472);
                              var3[var93] = var100 - var102 | var102 - (var102 >>> 8);
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              int var103 = this.field1188[this.field1189[var92] & 255];
                              int var104 = (var103 & 16711935) * field10478 & -16711936;
                              int var105 = (var103 & 65280) * field10478 & 16711680;
                              var3[var93] = ((var104 | var105) >>> 8) + field10485;
                           }
                        } else if (arg1 == 1) {
                           if (arg0 == 1) {
                              byte var106 = this.field1189[var92];
                              if (var106 != 0) {
                                 var3[var93] = this.field1188[var106 & 255];
                              }
                           } else if (arg0 == 0) {
                              byte var107 = this.field1189[var92];
                              if (var107 != 0) {
                                 int var108 = this.field1188[var107 & 255];
                                 if ((Statics.field10477 & 16777215) == 16777215) {
                                    int var109 = Statics.field10477 >>> 24;
                                    int var110 = 256 - var109;
                                    int var111 = var3[var93];
                                    var3[var93] = ((var108 & 16711935) * var109 + (var111 & 16711935) * var110 & -16711936) + ((var108 & 65280) * var109 + (var111 & 65280) * var110 & 16711680) >> 8;
                                 } else if (field10478 != 255) {
                                    int var112 = (var108 & 16711680) * field10480 & -16777216;
                                    int var113 = (var108 & 65280) * field10481 & 16711680;
                                    int var114 = (var108 & 255) * field10482 & 65280;
                                    int var115 = (var112 | var113 | var114) >>> 8;
                                    int var116 = var3[var93];
                                    var3[var93] = ((var115 & 16711935) * field10478 + (var116 & 16711935) * field10475 & -16711936) + ((var115 & 65280) * field10478 + (var116 & 65280) * field10475 & 16711680) >> 8;
                                 } else {
                                    int var117 = (var108 & 16711680) * field10480 & -16777216;
                                    int var118 = (var108 & 65280) * field10481 & 16711680;
                                    int var119 = (var108 & 255) * field10482 & 65280;
                                    var3[var93] = (var117 | var118 | var119) >>> 8;
                                 }
                              }
                           } else if (arg0 == 3) {
                              byte var120 = this.field1189[var92];
                              int var121 = var120 > 0 ? this.field1188[var120] : 0;
                              int var122 = Statics.field10477;
                              int var123 = var121 + var122;
                              int var124 = (var121 & 16711935) + (var122 & 16711935);
                              int var125 = (var123 - var124 & 65536) + (var124 & 16777472);
                              int var126 = var123 - var125 | var125 - (var125 >>> 8);
                              if (var121 == 0 && field10478 != 255) {
                                 int var128 = var3[var93];
                                 var126 = ((var126 & 16711935) * field10478 + (var128 & 16711935) * field10475 & -16711936) + ((var126 & 65280) * field10478 + (var128 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var93] = var126;
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              byte var129 = this.field1189[var92];
                              if (var129 != 0) {
                                 int var130 = this.field1188[var129 & 255];
                                 int var131 = (var130 & 16711935) * field10478 & -16711936;
                                 int var132 = (var130 & 65280) * field10478 & 16711680;
                                 var3[var93++] = ((var131 | var132) >>> 8) + field10485;
                              }
                           }
                        } else {
                           if (arg1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (arg0 == 1) {
                              byte var133 = this.field1189[var92];
                              if (var133 != 0) {
                                 int var134 = this.field1188[var133 & 255];
                                 int var135 = var3[var93];
                                 int var136 = var134 + var135;
                                 int var137 = (var134 & 16711935) + (var135 & 16711935);
                                 int var138 = (var136 - var137 & 65536) + (var137 & 16777472);
                                 var3[var93] = var136 - var138 | var138 - (var138 >>> 8);
                              }
                           } else if (arg0 == 0) {
                              byte var139 = this.field1189[var92];
                              if (var139 != 0) {
                                 int var140 = this.field1188[var139 & 255];
                                 int var141 = (var140 & 16711680) * field10480 & -16777216;
                                 int var142 = (var140 & 65280) * field10481 & 16711680;
                                 int var143 = (var140 & 255) * field10482 & 65280;
                                 int var144 = (var141 | var142 | var143) >>> 8;
                                 int var145 = var3[var93];
                                 int var146 = var144 + var145;
                                 int var147 = (var144 & 16711935) + (var145 & 16711935);
                                 int var148 = (var146 - var147 & 65536) + (var147 & 16777472);
                                 var3[var93] = var146 - var148 | var148 - (var148 >>> 8);
                              }
                           } else if (arg0 == 3) {
                              byte var149 = this.field1189[var92];
                              int var150 = var149 > 0 ? this.field1188[var149] : 0;
                              int var151 = Statics.field10477;
                              int var152 = var150 + var151;
                              int var153 = (var150 & 16711935) + (var151 & 16711935);
                              int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                              int var155 = var152 - var154 | var154 - (var154 >>> 8);
                              if (var150 == 0 && field10478 != 255) {
                                 int var157 = var3[var93];
                                 var155 = ((var155 & 16711935) * field10478 + (var157 & 16711935) * field10475 & -16711936) + ((var155 & 65280) * field10478 + (var157 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var93] = var155;
                           } else if (arg0 == 2) {
                              byte var158 = this.field1189[var92];
                              if (var158 != 0) {
                                 int var159 = this.field1188[var158 & 255];
                                 int var160 = (var159 & 16711935) * field10478 & -16711936;
                                 int var161 = (var159 & 65280) * field10478 & 16711680;
                                 int var162 = ((var160 | var161) >>> 8) + field10485;
                                 int var163 = var3[var93];
                                 int var164 = var162 + var163;
                                 int var165 = (var162 & 16711935) + (var163 & 16711935);
                                 int var166 = (var164 - var165 & 65536) + (var165 & 16777472);
                                 var3[var93] = var164 - var166 | var166 - (var166 >>> 8);
                              }
                           }
                        }

                        var87 += Statics.field10468;
                        ++var88;
                     }
                  }

                  ++var84;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10466 += Statics.field10456;
               }
            } else {
               int var167 = Statics.field10464;

               while(var167 < 0) {
                  int var168 = Statics.field10466;
                  int var169 = Statics.field10473;
                  int var170 = Statics.field10479 + Statics.field10455;
                  int var171 = Statics.field10462;
                  if (var169 >= 0 && var169 - (this.field10465 << 12) < 0) {
                     if (var170 < 0) {
                        int var172 = (Statics.field10468 - 1 - var170) / Statics.field10468;
                        var171 += var172;
                        var170 += Statics.field10468 * var172;
                        var168 += var172;
                     }

                     int var173;
                     if ((var173 = (var170 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var171) {
                        var171 = var173;
                     }

                     while(var171 < 0) {
                        int var174 = (var169 >> 12) + (var170 >> 12) * this.field10465;
                        int var175 = var168++;
                        if (arg1 == 0) {
                           if (arg0 == 1) {
                              var3[var175] = this.field1188[this.field1189[var174] & 255];
                           } else if (arg0 == 0) {
                              int var176 = this.field1188[this.field1189[var174] & 255];
                              int var177 = (var176 & 16711680) * field10480 & -16777216;
                              int var178 = (var176 & 65280) * field10481 & 16711680;
                              int var179 = (var176 & 255) * field10482 & 65280;
                              var3[var175] = (var177 | var178 | var179) >>> 8;
                           } else if (arg0 == 3) {
                              int var180 = this.field1188[this.field1189[var174] & 255];
                              int var181 = Statics.field10477;
                              int var182 = var180 + var181;
                              int var183 = (var180 & 16711935) + (var181 & 16711935);
                              int var184 = (var182 - var183 & 65536) + (var183 & 16777472);
                              var3[var175] = var182 - var184 | var184 - (var184 >>> 8);
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              int var185 = this.field1188[this.field1189[var174] & 255];
                              int var186 = (var185 & 16711935) * field10478 & -16711936;
                              int var187 = (var185 & 65280) * field10478 & 16711680;
                              var3[var175] = ((var186 | var187) >>> 8) + field10485;
                           }
                        } else if (arg1 == 1) {
                           if (arg0 == 1) {
                              byte var188 = this.field1189[var174];
                              if (var188 != 0) {
                                 var3[var175] = this.field1188[var188 & 255];
                              }
                           } else if (arg0 == 0) {
                              byte var189 = this.field1189[var174];
                              if (var189 != 0) {
                                 int var190 = this.field1188[var189 & 255];
                                 if ((Statics.field10477 & 16777215) == 16777215) {
                                    int var191 = Statics.field10477 >>> 24;
                                    int var192 = 256 - var191;
                                    int var193 = var3[var175];
                                    var3[var175] = ((var190 & 16711935) * var191 + (var193 & 16711935) * var192 & -16711936) + ((var190 & 65280) * var191 + (var193 & 65280) * var192 & 16711680) >> 8;
                                 } else if (field10478 != 255) {
                                    int var194 = (var190 & 16711680) * field10480 & -16777216;
                                    int var195 = (var190 & 65280) * field10481 & 16711680;
                                    int var196 = (var190 & 255) * field10482 & 65280;
                                    int var197 = (var194 | var195 | var196) >>> 8;
                                    int var198 = var3[var175];
                                    var3[var175] = ((var197 & 16711935) * field10478 + (var198 & 16711935) * field10475 & -16711936) + ((var197 & 65280) * field10478 + (var198 & 65280) * field10475 & 16711680) >> 8;
                                 } else {
                                    int var199 = (var190 & 16711680) * field10480 & -16777216;
                                    int var200 = (var190 & 65280) * field10481 & 16711680;
                                    int var201 = (var190 & 255) * field10482 & 65280;
                                    var3[var175] = (var199 | var200 | var201) >>> 8;
                                 }
                              }
                           } else if (arg0 == 3) {
                              byte var202 = this.field1189[var174];
                              int var203 = var202 > 0 ? this.field1188[var202] : 0;
                              int var204 = Statics.field10477;
                              int var205 = var203 + var204;
                              int var206 = (var203 & 16711935) + (var204 & 16711935);
                              int var207 = (var205 - var206 & 65536) + (var206 & 16777472);
                              int var208 = var205 - var207 | var207 - (var207 >>> 8);
                              if (var203 == 0 && field10478 != 255) {
                                 int var210 = var3[var175];
                                 var208 = ((var208 & 16711935) * field10478 + (var210 & 16711935) * field10475 & -16711936) + ((var208 & 65280) * field10478 + (var210 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var175] = var208;
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              byte var211 = this.field1189[var174];
                              if (var211 != 0) {
                                 int var212 = this.field1188[var211 & 255];
                                 int var213 = (var212 & 16711935) * field10478 & -16711936;
                                 int var214 = (var212 & 65280) * field10478 & 16711680;
                                 var3[var175++] = ((var213 | var214) >>> 8) + field10485;
                              }
                           }
                        } else {
                           if (arg1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (arg0 == 1) {
                              byte var215 = this.field1189[var174];
                              if (var215 != 0) {
                                 int var216 = this.field1188[var215 & 255];
                                 int var217 = var3[var175];
                                 int var218 = var216 + var217;
                                 int var219 = (var216 & 16711935) + (var217 & 16711935);
                                 int var220 = (var218 - var219 & 65536) + (var219 & 16777472);
                                 var3[var175] = var218 - var220 | var220 - (var220 >>> 8);
                              }
                           } else if (arg0 == 0) {
                              byte var221 = this.field1189[var174];
                              if (var221 != 0) {
                                 int var222 = this.field1188[var221 & 255];
                                 int var223 = (var222 & 16711680) * field10480 & -16777216;
                                 int var224 = (var222 & 65280) * field10481 & 16711680;
                                 int var225 = (var222 & 255) * field10482 & 65280;
                                 int var226 = (var223 | var224 | var225) >>> 8;
                                 int var227 = var3[var175];
                                 int var228 = var226 + var227;
                                 int var229 = (var226 & 16711935) + (var227 & 16711935);
                                 int var230 = (var228 - var229 & 65536) + (var229 & 16777472);
                                 var3[var175] = var228 - var230 | var230 - (var230 >>> 8);
                              }
                           } else if (arg0 == 3) {
                              byte var231 = this.field1189[var174];
                              int var232 = var231 > 0 ? this.field1188[var231] : 0;
                              int var233 = Statics.field10477;
                              int var234 = var232 + var233;
                              int var235 = (var232 & 16711935) + (var233 & 16711935);
                              int var236 = (var234 - var235 & 65536) + (var235 & 16777472);
                              int var237 = var234 - var236 | var236 - (var236 >>> 8);
                              if (var232 == 0 && field10478 != 255) {
                                 int var239 = var3[var175];
                                 var237 = ((var237 & 16711935) * field10478 + (var239 & 16711935) * field10475 & -16711936) + ((var237 & 65280) * field10478 + (var239 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var175] = var237;
                           } else if (arg0 == 2) {
                              byte var240 = this.field1189[var174];
                              if (var240 != 0) {
                                 int var241 = this.field1188[var240 & 255];
                                 int var242 = (var241 & 16711935) * field10478 & -16711936;
                                 int var243 = (var241 & 65280) * field10478 & 16711680;
                                 int var244 = ((var242 | var243) >>> 8) + field10485;
                                 int var245 = var3[var175];
                                 int var246 = var244 + var245;
                                 int var247 = (var244 & 16711935) + (var245 & 16711935);
                                 int var248 = (var246 - var247 & 65536) + (var247 & 16777472);
                                 var3[var175] = var246 - var248 | var248 - (var248 >>> 8);
                              }
                           }
                        }

                        var170 += Statics.field10468;
                        ++var171;
                     }
                  }

                  ++var167;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10466 += Statics.field10456;
               }
            }
         } else if (Statics.field10467 < 0) {
            if (Statics.field10468 == 0) {
               int var249 = Statics.field10464;

               while(var249 < 0) {
                  int var250 = Statics.field10466;
                  int var251 = Statics.field10484 + Statics.field10473;
                  int var252 = Statics.field10479;
                  int var253 = Statics.field10462;
                  if (var252 >= 0 && var252 - (this.field10452 << 12) < 0) {
                     int var254;
                     if ((var254 = var251 - (this.field10465 << 12)) >= 0) {
                        int var255 = (Statics.field10467 - var254) / Statics.field10467;
                        var253 += var255;
                        var251 += Statics.field10467 * var255;
                        var250 += var255;
                     }

                     int var256;
                     if ((var256 = (var251 - Statics.field10467) / Statics.field10467) > var253) {
                        var253 = var256;
                     }

                     while(var253 < 0) {
                        int var257 = (var251 >> 12) + (var252 >> 12) * this.field10465;
                        int var258 = var250++;
                        if (arg1 == 0) {
                           if (arg0 == 1) {
                              var3[var258] = this.field1188[this.field1189[var257] & 255];
                           } else if (arg0 == 0) {
                              int var259 = this.field1188[this.field1189[var257] & 255];
                              int var260 = (var259 & 16711680) * field10480 & -16777216;
                              int var261 = (var259 & 65280) * field10481 & 16711680;
                              int var262 = (var259 & 255) * field10482 & 65280;
                              var3[var258] = (var260 | var261 | var262) >>> 8;
                           } else if (arg0 == 3) {
                              int var263 = this.field1188[this.field1189[var257] & 255];
                              int var264 = Statics.field10477;
                              int var265 = var263 + var264;
                              int var266 = (var263 & 16711935) + (var264 & 16711935);
                              int var267 = (var265 - var266 & 65536) + (var266 & 16777472);
                              var3[var258] = var265 - var267 | var267 - (var267 >>> 8);
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              int var268 = this.field1188[this.field1189[var257] & 255];
                              int var269 = (var268 & 16711935) * field10478 & -16711936;
                              int var270 = (var268 & 65280) * field10478 & 16711680;
                              var3[var258] = ((var269 | var270) >>> 8) + field10485;
                           }
                        } else if (arg1 == 1) {
                           if (arg0 == 1) {
                              byte var271 = this.field1189[var257];
                              if (var271 != 0) {
                                 var3[var258] = this.field1188[var271 & 255];
                              }
                           } else if (arg0 == 0) {
                              byte var272 = this.field1189[var257];
                              if (var272 != 0) {
                                 int var273 = this.field1188[var272 & 255];
                                 if ((Statics.field10477 & 16777215) == 16777215) {
                                    int var274 = Statics.field10477 >>> 24;
                                    int var275 = 256 - var274;
                                    int var276 = var3[var258];
                                    var3[var258] = ((var273 & 16711935) * var274 + (var276 & 16711935) * var275 & -16711936) + ((var273 & 65280) * var274 + (var276 & 65280) * var275 & 16711680) >> 8;
                                 } else if (field10478 != 255) {
                                    int var277 = (var273 & 16711680) * field10480 & -16777216;
                                    int var278 = (var273 & 65280) * field10481 & 16711680;
                                    int var279 = (var273 & 255) * field10482 & 65280;
                                    int var280 = (var277 | var278 | var279) >>> 8;
                                    int var281 = var3[var258];
                                    var3[var258] = ((var280 & 16711935) * field10478 + (var281 & 16711935) * field10475 & -16711936) + ((var280 & 65280) * field10478 + (var281 & 65280) * field10475 & 16711680) >> 8;
                                 } else {
                                    int var282 = (var273 & 16711680) * field10480 & -16777216;
                                    int var283 = (var273 & 65280) * field10481 & 16711680;
                                    int var284 = (var273 & 255) * field10482 & 65280;
                                    var3[var258] = (var282 | var283 | var284) >>> 8;
                                 }
                              }
                           } else if (arg0 == 3) {
                              byte var285 = this.field1189[var257];
                              int var286 = var285 > 0 ? this.field1188[var285] : 0;
                              int var287 = Statics.field10477;
                              int var288 = var286 + var287;
                              int var289 = (var286 & 16711935) + (var287 & 16711935);
                              int var290 = (var288 - var289 & 65536) + (var289 & 16777472);
                              int var291 = var288 - var290 | var290 - (var290 >>> 8);
                              if (var286 == 0 && field10478 != 255) {
                                 int var293 = var3[var258];
                                 var291 = ((var291 & 16711935) * field10478 + (var293 & 16711935) * field10475 & -16711936) + ((var291 & 65280) * field10478 + (var293 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var258] = var291;
                           } else {
                              if (arg0 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              byte var294 = this.field1189[var257];
                              if (var294 != 0) {
                                 int var295 = this.field1188[var294 & 255];
                                 int var296 = (var295 & 16711935) * field10478 & -16711936;
                                 int var297 = (var295 & 65280) * field10478 & 16711680;
                                 var3[var258++] = ((var296 | var297) >>> 8) + field10485;
                              }
                           }
                        } else {
                           if (arg1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (arg0 == 1) {
                              byte var298 = this.field1189[var257];
                              if (var298 != 0) {
                                 int var299 = this.field1188[var298 & 255];
                                 int var300 = var3[var258];
                                 int var301 = var299 + var300;
                                 int var302 = (var299 & 16711935) + (var300 & 16711935);
                                 int var303 = (var301 - var302 & 65536) + (var302 & 16777472);
                                 var3[var258] = var301 - var303 | var303 - (var303 >>> 8);
                              }
                           } else if (arg0 == 0) {
                              byte var304 = this.field1189[var257];
                              if (var304 != 0) {
                                 int var305 = this.field1188[var304 & 255];
                                 int var306 = (var305 & 16711680) * field10480 & -16777216;
                                 int var307 = (var305 & 65280) * field10481 & 16711680;
                                 int var308 = (var305 & 255) * field10482 & 65280;
                                 int var309 = (var306 | var307 | var308) >>> 8;
                                 int var310 = var3[var258];
                                 int var311 = var309 + var310;
                                 int var312 = (var309 & 16711935) + (var310 & 16711935);
                                 int var313 = (var311 - var312 & 65536) + (var312 & 16777472);
                                 var3[var258] = var311 - var313 | var313 - (var313 >>> 8);
                              }
                           } else if (arg0 == 3) {
                              byte var314 = this.field1189[var257];
                              int var315 = var314 > 0 ? this.field1188[var314] : 0;
                              int var316 = Statics.field10477;
                              int var317 = var315 + var316;
                              int var318 = (var315 & 16711935) + (var316 & 16711935);
                              int var319 = (var317 - var318 & 65536) + (var318 & 16777472);
                              int var320 = var317 - var319 | var319 - (var319 >>> 8);
                              if (var315 == 0 && field10478 != 255) {
                                 int var322 = var3[var258];
                                 var320 = ((var320 & 16711935) * field10478 + (var322 & 16711935) * field10475 & -16711936) + ((var320 & 65280) * field10478 + (var322 & 65280) * field10475 & 16711680) >> 8;
                              }

                              var3[var258] = var320;
                           } else if (arg0 == 2) {
                              byte var323 = this.field1189[var257];
                              if (var323 != 0) {
                                 int var324 = this.field1188[var323 & 255];
                                 int var325 = (var324 & 16711935) * field10478 & -16711936;
                                 int var326 = (var324 & 65280) * field10478 & 16711680;
                                 int var327 = ((var325 | var326) >>> 8) + field10485;
                                 int var328 = var3[var258];
                                 int var329 = var327 + var328;
                                 int var330 = (var327 & 16711935) + (var328 & 16711935);
                                 int var331 = (var329 - var330 & 65536) + (var330 & 16777472);
                                 var3[var258] = var329 - var331 | var331 - (var331 >>> 8);
                              }
                           }
                        }

                        var251 += Statics.field10467;
                        ++var253;
                     }
                  }

                  ++var249;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            } else if (Statics.field10468 < 0) {
               int var332 = Statics.field10464;

               while(var332 < 0) {
                  int var333 = Statics.field10466;
                  int var334 = Statics.field10484 + Statics.field10473;
                  int var335 = Statics.field10479 + Statics.field10455;
                  int var336 = Statics.field10462;
                  int var337;
                  if ((var337 = var334 - (this.field10465 << 12)) >= 0) {
                     int var338 = (Statics.field10467 - var337) / Statics.field10467;
                     var336 += var338;
                     var334 += Statics.field10467 * var338;
                     var335 += Statics.field10468 * var338;
                     var333 += var338;
                  }

                  int var339;
                  if ((var339 = (var334 - Statics.field10467) / Statics.field10467) > var336) {
                     var336 = var339;
                  }

                  int var340;
                  if ((var340 = var335 - (this.field10452 << 12)) >= 0) {
                     int var341 = (Statics.field10468 - var340) / Statics.field10468;
                     var336 += var341;
                     var334 += Statics.field10467 * var341;
                     var335 += Statics.field10468 * var341;
                     var333 += var341;
                  }

                  int var342;
                  if ((var342 = (var335 - Statics.field10468) / Statics.field10468) > var336) {
                     var336 = var342;
                  }

                  while(var336 < 0) {
                     int var343 = (var334 >> 12) + (var335 >> 12) * this.field10465;
                     int var344 = var333++;
                     if (arg1 == 0) {
                        if (arg0 == 1) {
                           var3[var344] = this.field1188[this.field1189[var343] & 255];
                        } else if (arg0 == 0) {
                           int var345 = this.field1188[this.field1189[var343] & 255];
                           int var346 = (var345 & 16711680) * field10480 & -16777216;
                           int var347 = (var345 & 65280) * field10481 & 16711680;
                           int var348 = (var345 & 255) * field10482 & 65280;
                           var3[var344] = (var346 | var347 | var348) >>> 8;
                        } else if (arg0 == 3) {
                           int var349 = this.field1188[this.field1189[var343] & 255];
                           int var350 = Statics.field10477;
                           int var351 = var349 + var350;
                           int var352 = (var349 & 16711935) + (var350 & 16711935);
                           int var353 = (var351 - var352 & 65536) + (var352 & 16777472);
                           var3[var344] = var351 - var353 | var353 - (var353 >>> 8);
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var354 = this.field1188[this.field1189[var343] & 255];
                           int var355 = (var354 & 16711935) * field10478 & -16711936;
                           int var356 = (var354 & 65280) * field10478 & 16711680;
                           var3[var344] = ((var355 | var356) >>> 8) + field10485;
                        }
                     } else if (arg1 == 1) {
                        if (arg0 == 1) {
                           byte var357 = this.field1189[var343];
                           if (var357 != 0) {
                              var3[var344] = this.field1188[var357 & 255];
                           }
                        } else if (arg0 == 0) {
                           byte var358 = this.field1189[var343];
                           if (var358 != 0) {
                              int var359 = this.field1188[var358 & 255];
                              if ((Statics.field10477 & 16777215) == 16777215) {
                                 int var360 = Statics.field10477 >>> 24;
                                 int var361 = 256 - var360;
                                 int var362 = var3[var344];
                                 var3[var344] = ((var359 & 16711935) * var360 + (var362 & 16711935) * var361 & -16711936) + ((var359 & 65280) * var360 + (var362 & 65280) * var361 & 16711680) >> 8;
                              } else if (field10478 != 255) {
                                 int var363 = (var359 & 16711680) * field10480 & -16777216;
                                 int var364 = (var359 & 65280) * field10481 & 16711680;
                                 int var365 = (var359 & 255) * field10482 & 65280;
                                 int var366 = (var363 | var364 | var365) >>> 8;
                                 int var367 = var3[var344];
                                 var3[var344] = ((var366 & 16711935) * field10478 + (var367 & 16711935) * field10475 & -16711936) + ((var366 & 65280) * field10478 + (var367 & 65280) * field10475 & 16711680) >> 8;
                              } else {
                                 int var368 = (var359 & 16711680) * field10480 & -16777216;
                                 int var369 = (var359 & 65280) * field10481 & 16711680;
                                 int var370 = (var359 & 255) * field10482 & 65280;
                                 var3[var344] = (var368 | var369 | var370) >>> 8;
                              }
                           }
                        } else if (arg0 == 3) {
                           byte var371 = this.field1189[var343];
                           int var372 = var371 > 0 ? this.field1188[var371] : 0;
                           int var373 = Statics.field10477;
                           int var374 = var372 + var373;
                           int var375 = (var372 & 16711935) + (var373 & 16711935);
                           int var376 = (var374 - var375 & 65536) + (var375 & 16777472);
                           int var377 = var374 - var376 | var376 - (var376 >>> 8);
                           if (var372 == 0 && field10478 != 255) {
                              int var379 = var3[var344];
                              var377 = ((var377 & 16711935) * field10478 + (var379 & 16711935) * field10475 & -16711936) + ((var377 & 65280) * field10478 + (var379 & 65280) * field10475 & 16711680) >> 8;
                           }

                           var3[var344] = var377;
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           byte var380 = this.field1189[var343];
                           if (var380 != 0) {
                              int var381 = this.field1188[var380 & 255];
                              int var382 = (var381 & 16711935) * field10478 & -16711936;
                              int var383 = (var381 & 65280) * field10478 & 16711680;
                              var3[var344++] = ((var382 | var383) >>> 8) + field10485;
                           }
                        }
                     } else {
                        if (arg1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (arg0 == 1) {
                           byte var384 = this.field1189[var343];
                           if (var384 != 0) {
                              int var385 = this.field1188[var384 & 255];
                              int var386 = var3[var344];
                              int var387 = var385 + var386;
                              int var388 = (var385 & 16711935) + (var386 & 16711935);
                              int var389 = (var387 - var388 & 65536) + (var388 & 16777472);
                              var3[var344] = var387 - var389 | var389 - (var389 >>> 8);
                           }
                        } else if (arg0 == 0) {
                           byte var390 = this.field1189[var343];
                           if (var390 != 0) {
                              int var391 = this.field1188[var390 & 255];
                              int var392 = (var391 & 16711680) * field10480 & -16777216;
                              int var393 = (var391 & 65280) * field10481 & 16711680;
                              int var394 = (var391 & 255) * field10482 & 65280;
                              int var395 = (var392 | var393 | var394) >>> 8;
                              int var396 = var3[var344];
                              int var397 = var395 + var396;
                              int var398 = (var395 & 16711935) + (var396 & 16711935);
                              int var399 = (var397 - var398 & 65536) + (var398 & 16777472);
                              var3[var344] = var397 - var399 | var399 - (var399 >>> 8);
                           }
                        } else if (arg0 == 3) {
                           byte var400 = this.field1189[var343];
                           int var401 = var400 > 0 ? this.field1188[var400] : 0;
                           int var402 = Statics.field10477;
                           int var403 = var401 + var402;
                           int var404 = (var401 & 16711935) + (var402 & 16711935);
                           int var405 = (var403 - var404 & 65536) + (var404 & 16777472);
                           int var406 = var403 - var405 | var405 - (var405 >>> 8);
                           if (var401 == 0 && field10478 != 255) {
                              int var408 = var3[var344];
                              var406 = ((var406 & 16711935) * field10478 + (var408 & 16711935) * field10475 & -16711936) + ((var406 & 65280) * field10478 + (var408 & 65280) * field10475 & 16711680) >> 8;
                           }

                           var3[var344] = var406;
                        } else if (arg0 == 2) {
                           byte var409 = this.field1189[var343];
                           if (var409 != 0) {
                              int var410 = this.field1188[var409 & 255];
                              int var411 = (var410 & 16711935) * field10478 & -16711936;
                              int var412 = (var410 & 65280) * field10478 & 16711680;
                              int var413 = ((var411 | var412) >>> 8) + field10485;
                              int var414 = var3[var344];
                              int var415 = var413 + var414;
                              int var416 = (var413 & 16711935) + (var414 & 16711935);
                              int var417 = (var415 - var416 & 65536) + (var416 & 16777472);
                              var3[var344] = var415 - var417 | var417 - (var417 >>> 8);
                           }
                        }
                     }

                     var334 += Statics.field10467;
                     var335 += Statics.field10468;
                     ++var336;
                  }

                  ++var332;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            } else {
               int var418 = Statics.field10464;

               while(var418 < 0) {
                  int var419 = Statics.field10466;
                  int var420 = Statics.field10484 + Statics.field10473;
                  int var421 = Statics.field10479 + Statics.field10455;
                  int var422 = Statics.field10462;
                  int var423;
                  if ((var423 = var420 - (this.field10465 << 12)) >= 0) {
                     int var424 = (Statics.field10467 - var423) / Statics.field10467;
                     var422 += var424;
                     var420 += Statics.field10467 * var424;
                     var421 += Statics.field10468 * var424;
                     var419 += var424;
                  }

                  int var425;
                  if ((var425 = (var420 - Statics.field10467) / Statics.field10467) > var422) {
                     var422 = var425;
                  }

                  if (var421 < 0) {
                     int var426 = (Statics.field10468 - 1 - var421) / Statics.field10468;
                     var422 += var426;
                     var420 += Statics.field10467 * var426;
                     var421 += Statics.field10468 * var426;
                     var419 += var426;
                  }

                  int var427;
                  if ((var427 = (var421 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var422) {
                     var422 = var427;
                  }

                  while(var422 < 0) {
                     int var428 = (var420 >> 12) + (var421 >> 12) * this.field10465;
                     int var429 = var419++;
                     if (arg1 == 0) {
                        if (arg0 == 1) {
                           var3[var429] = this.field1188[this.field1189[var428] & 255];
                        } else if (arg0 == 0) {
                           int var430 = this.field1188[this.field1189[var428] & 255];
                           int var431 = (var430 & 16711680) * field10480 & -16777216;
                           int var432 = (var430 & 65280) * field10481 & 16711680;
                           int var433 = (var430 & 255) * field10482 & 65280;
                           var3[var429] = (var431 | var432 | var433) >>> 8;
                        } else if (arg0 == 3) {
                           int var434 = this.field1188[this.field1189[var428] & 255];
                           int var435 = Statics.field10477;
                           int var436 = var434 + var435;
                           int var437 = (var434 & 16711935) + (var435 & 16711935);
                           int var438 = (var436 - var437 & 65536) + (var437 & 16777472);
                           var3[var429] = var436 - var438 | var438 - (var438 >>> 8);
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var439 = this.field1188[this.field1189[var428] & 255];
                           int var440 = (var439 & 16711935) * field10478 & -16711936;
                           int var441 = (var439 & 65280) * field10478 & 16711680;
                           var3[var429] = ((var440 | var441) >>> 8) + field10485;
                        }
                     } else if (arg1 == 1) {
                        if (arg0 == 1) {
                           byte var442 = this.field1189[var428];
                           if (var442 != 0) {
                              var3[var429] = this.field1188[var442 & 255];
                           }
                        } else if (arg0 == 0) {
                           byte var443 = this.field1189[var428];
                           if (var443 != 0) {
                              int var444 = this.field1188[var443 & 255];
                              if ((Statics.field10477 & 16777215) == 16777215) {
                                 int var445 = Statics.field10477 >>> 24;
                                 int var446 = 256 - var445;
                                 int var447 = var3[var429];
                                 var3[var429] = ((var444 & 16711935) * var445 + (var447 & 16711935) * var446 & -16711936) + ((var444 & 65280) * var445 + (var447 & 65280) * var446 & 16711680) >> 8;
                              } else if (field10478 != 255) {
                                 int var448 = (var444 & 16711680) * field10480 & -16777216;
                                 int var449 = (var444 & 65280) * field10481 & 16711680;
                                 int var450 = (var444 & 255) * field10482 & 65280;
                                 int var451 = (var448 | var449 | var450) >>> 8;
                                 int var452 = var3[var429];
                                 var3[var429] = ((var451 & 16711935) * field10478 + (var452 & 16711935) * field10475 & -16711936) + ((var451 & 65280) * field10478 + (var452 & 65280) * field10475 & 16711680) >> 8;
                              } else {
                                 int var453 = (var444 & 16711680) * field10480 & -16777216;
                                 int var454 = (var444 & 65280) * field10481 & 16711680;
                                 int var455 = (var444 & 255) * field10482 & 65280;
                                 var3[var429] = (var453 | var454 | var455) >>> 8;
                              }
                           }
                        } else if (arg0 == 3) {
                           byte var456 = this.field1189[var428];
                           int var457 = var456 > 0 ? this.field1188[var456] : 0;
                           int var458 = Statics.field10477;
                           int var459 = var457 + var458;
                           int var460 = (var457 & 16711935) + (var458 & 16711935);
                           int var461 = (var459 - var460 & 65536) + (var460 & 16777472);
                           int var462 = var459 - var461 | var461 - (var461 >>> 8);
                           if (var457 == 0 && field10478 != 255) {
                              int var464 = var3[var429];
                              var462 = ((var462 & 16711935) * field10478 + (var464 & 16711935) * field10475 & -16711936) + ((var462 & 65280) * field10478 + (var464 & 65280) * field10475 & 16711680) >> 8;
                           }

                           var3[var429] = var462;
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           byte var465 = this.field1189[var428];
                           if (var465 != 0) {
                              int var466 = this.field1188[var465 & 255];
                              int var467 = (var466 & 16711935) * field10478 & -16711936;
                              int var468 = (var466 & 65280) * field10478 & 16711680;
                              var3[var429++] = ((var467 | var468) >>> 8) + field10485;
                           }
                        }
                     } else {
                        if (arg1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (arg0 == 1) {
                           byte var469 = this.field1189[var428];
                           if (var469 != 0) {
                              int var470 = this.field1188[var469 & 255];
                              int var471 = var3[var429];
                              int var472 = var470 + var471;
                              int var473 = (var470 & 16711935) + (var471 & 16711935);
                              int var474 = (var472 - var473 & 65536) + (var473 & 16777472);
                              var3[var429] = var472 - var474 | var474 - (var474 >>> 8);
                           }
                        } else if (arg0 == 0) {
                           byte var475 = this.field1189[var428];
                           if (var475 != 0) {
                              int var476 = this.field1188[var475 & 255];
                              int var477 = (var476 & 16711680) * field10480 & -16777216;
                              int var478 = (var476 & 65280) * field10481 & 16711680;
                              int var479 = (var476 & 255) * field10482 & 65280;
                              int var480 = (var477 | var478 | var479) >>> 8;
                              int var481 = var3[var429];
                              int var482 = var480 + var481;
                              int var483 = (var480 & 16711935) + (var481 & 16711935);
                              int var484 = (var482 - var483 & 65536) + (var483 & 16777472);
                              var3[var429] = var482 - var484 | var484 - (var484 >>> 8);
                           }
                        } else if (arg0 == 3) {
                           byte var485 = this.field1189[var428];
                           int var486 = var485 > 0 ? this.field1188[var485] : 0;
                           int var487 = Statics.field10477;
                           int var488 = var486 + var487;
                           int var489 = (var486 & 16711935) + (var487 & 16711935);
                           int var490 = (var488 - var489 & 65536) + (var489 & 16777472);
                           int var491 = var488 - var490 | var490 - (var490 >>> 8);
                           if (var486 == 0 && field10478 != 255) {
                              int var493 = var3[var429];
                              var491 = ((var491 & 16711935) * field10478 + (var493 & 16711935) * field10475 & -16711936) + ((var491 & 65280) * field10478 + (var493 & 65280) * field10475 & 16711680) >> 8;
                           }

                           var3[var429] = var491;
                        } else if (arg0 == 2) {
                           byte var494 = this.field1189[var428];
                           if (var494 != 0) {
                              int var495 = this.field1188[var494 & 255];
                              int var496 = (var495 & 16711935) * field10478 & -16711936;
                              int var497 = (var495 & 65280) * field10478 & 16711680;
                              int var498 = ((var496 | var497) >>> 8) + field10485;
                              int var499 = var3[var429];
                              int var500 = var498 + var499;
                              int var501 = (var498 & 16711935) + (var499 & 16711935);
                              int var502 = (var500 - var501 & 65536) + (var501 & 16777472);
                              var3[var429] = var500 - var502 | var502 - (var502 >>> 8);
                           }
                        }
                     }

                     var420 += Statics.field10467;
                     var421 += Statics.field10468;
                     ++var422;
                  }

                  ++var418;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            }
         } else if (Statics.field10468 == 0) {
            int var503 = Statics.field10464;

            while(var503 < 0) {
               int var504 = Statics.field10466;
               int var505 = Statics.field10484 + Statics.field10473;
               int var506 = Statics.field10479;
               int var507 = Statics.field10462;
               if (var506 >= 0 && var506 - (this.field10452 << 12) < 0) {
                  if (var505 < 0) {
                     int var508 = (Statics.field10467 - 1 - var505) / Statics.field10467;
                     var507 += var508;
                     var505 += Statics.field10467 * var508;
                     var504 += var508;
                  }

                  int var509;
                  if ((var509 = (var505 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var507) {
                     var507 = var509;
                  }

                  while(var507 < 0) {
                     int var510 = (var505 >> 12) + (var506 >> 12) * this.field10465;
                     int var511 = var504++;
                     if (arg1 == 0) {
                        if (arg0 == 1) {
                           var3[var511] = this.field1188[this.field1189[var510] & 255];
                        } else if (arg0 == 0) {
                           int var512 = this.field1188[this.field1189[var510] & 255];
                           int var513 = (var512 & 16711680) * field10480 & -16777216;
                           int var514 = (var512 & 65280) * field10481 & 16711680;
                           int var515 = (var512 & 255) * field10482 & 65280;
                           var3[var511] = (var513 | var514 | var515) >>> 8;
                        } else if (arg0 == 3) {
                           int var516 = this.field1188[this.field1189[var510] & 255];
                           int var517 = Statics.field10477;
                           int var518 = var516 + var517;
                           int var519 = (var516 & 16711935) + (var517 & 16711935);
                           int var520 = (var518 - var519 & 65536) + (var519 & 16777472);
                           var3[var511] = var518 - var520 | var520 - (var520 >>> 8);
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var521 = this.field1188[this.field1189[var510] & 255];
                           int var522 = (var521 & 16711935) * field10478 & -16711936;
                           int var523 = (var521 & 65280) * field10478 & 16711680;
                           var3[var511] = ((var522 | var523) >>> 8) + field10485;
                        }
                     } else if (arg1 == 1) {
                        if (arg0 == 1) {
                           byte var524 = this.field1189[var510];
                           if (var524 != 0) {
                              var3[var511] = this.field1188[var524 & 255];
                           }
                        } else if (arg0 == 0) {
                           byte var525 = this.field1189[var510];
                           if (var525 != 0) {
                              int var526 = this.field1188[var525 & 255];
                              if ((Statics.field10477 & 16777215) == 16777215) {
                                 int var527 = Statics.field10477 >>> 24;
                                 int var528 = 256 - var527;
                                 int var529 = var3[var511];
                                 var3[var511] = ((var526 & 16711935) * var527 + (var529 & 16711935) * var528 & -16711936) + ((var526 & 65280) * var527 + (var529 & 65280) * var528 & 16711680) >> 8;
                              } else if (field10478 != 255) {
                                 int var530 = (var526 & 16711680) * field10480 & -16777216;
                                 int var531 = (var526 & 65280) * field10481 & 16711680;
                                 int var532 = (var526 & 255) * field10482 & 65280;
                                 int var533 = (var530 | var531 | var532) >>> 8;
                                 int var534 = var3[var511];
                                 var3[var511] = ((var533 & 16711935) * field10478 + (var534 & 16711935) * field10475 & -16711936) + ((var533 & 65280) * field10478 + (var534 & 65280) * field10475 & 16711680) >> 8;
                              } else {
                                 int var535 = (var526 & 16711680) * field10480 & -16777216;
                                 int var536 = (var526 & 65280) * field10481 & 16711680;
                                 int var537 = (var526 & 255) * field10482 & 65280;
                                 var3[var511] = (var535 | var536 | var537) >>> 8;
                              }
                           }
                        } else if (arg0 == 3) {
                           byte var538 = this.field1189[var510];
                           int var539 = var538 > 0 ? this.field1188[var538] : 0;
                           int var540 = Statics.field10477;
                           int var541 = var539 + var540;
                           int var542 = (var539 & 16711935) + (var540 & 16711935);
                           int var543 = (var541 - var542 & 65536) + (var542 & 16777472);
                           int var544 = var541 - var543 | var543 - (var543 >>> 8);
                           if (var539 == 0 && field10478 != 255) {
                              int var546 = var3[var511];
                              var544 = ((var544 & 16711935) * field10478 + (var546 & 16711935) * field10475 & -16711936) + ((var544 & 65280) * field10478 + (var546 & 65280) * field10475 & 16711680) >> 8;
                           }

                           var3[var511] = var544;
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           byte var547 = this.field1189[var510];
                           if (var547 != 0) {
                              int var548 = this.field1188[var547 & 255];
                              int var549 = (var548 & 16711935) * field10478 & -16711936;
                              int var550 = (var548 & 65280) * field10478 & 16711680;
                              var3[var511++] = ((var549 | var550) >>> 8) + field10485;
                           }
                        }
                     } else {
                        if (arg1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (arg0 == 1) {
                           byte var551 = this.field1189[var510];
                           if (var551 != 0) {
                              int var552 = this.field1188[var551 & 255];
                              int var553 = var3[var511];
                              int var554 = var552 + var553;
                              int var555 = (var552 & 16711935) + (var553 & 16711935);
                              int var556 = (var554 - var555 & 65536) + (var555 & 16777472);
                              var3[var511] = var554 - var556 | var556 - (var556 >>> 8);
                           }
                        } else if (arg0 == 0) {
                           byte var557 = this.field1189[var510];
                           if (var557 != 0) {
                              int var558 = this.field1188[var557 & 255];
                              int var559 = (var558 & 16711680) * field10480 & -16777216;
                              int var560 = (var558 & 65280) * field10481 & 16711680;
                              int var561 = (var558 & 255) * field10482 & 65280;
                              int var562 = (var559 | var560 | var561) >>> 8;
                              int var563 = var3[var511];
                              int var564 = var562 + var563;
                              int var565 = (var562 & 16711935) + (var563 & 16711935);
                              int var566 = (var564 - var565 & 65536) + (var565 & 16777472);
                              var3[var511] = var564 - var566 | var566 - (var566 >>> 8);
                           }
                        } else if (arg0 == 3) {
                           byte var567 = this.field1189[var510];
                           int var568 = var567 > 0 ? this.field1188[var567] : 0;
                           int var569 = Statics.field10477;
                           int var570 = var568 + var569;
                           int var571 = (var568 & 16711935) + (var569 & 16711935);
                           int var572 = (var570 - var571 & 65536) + (var571 & 16777472);
                           int var573 = var570 - var572 | var572 - (var572 >>> 8);
                           if (var568 == 0 && field10478 != 255) {
                              int var575 = var3[var511];
                              var573 = ((var573 & 16711935) * field10478 + (var575 & 16711935) * field10475 & -16711936) + ((var573 & 65280) * field10478 + (var575 & 65280) * field10475 & 16711680) >> 8;
                           }

                           var3[var511] = var573;
                        } else if (arg0 == 2) {
                           byte var576 = this.field1189[var510];
                           if (var576 != 0) {
                              int var577 = this.field1188[var576 & 255];
                              int var578 = (var577 & 16711935) * field10478 & -16711936;
                              int var579 = (var577 & 65280) * field10478 & 16711680;
                              int var580 = ((var578 | var579) >>> 8) + field10485;
                              int var581 = var3[var511];
                              int var582 = var580 + var581;
                              int var583 = (var580 & 16711935) + (var581 & 16711935);
                              int var584 = (var582 - var583 & 65536) + (var583 & 16777472);
                              var3[var511] = var582 - var584 | var584 - (var584 >>> 8);
                           }
                        }
                     }

                     var505 += Statics.field10467;
                     ++var507;
                  }
               }

               ++var503;
               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         } else if (Statics.field10468 < 0) {
            for(int var585 = Statics.field10464; var585 < 0; ++var585) {
               int var586 = Statics.field10466;
               int var587 = Statics.field10484 + Statics.field10473;
               int var588 = Statics.field10479 + Statics.field10455;
               int var589 = Statics.field10462;
               if (var587 < 0) {
                  int var590 = (Statics.field10467 - 1 - var587) / Statics.field10467;
                  var589 += var590;
                  var587 += Statics.field10467 * var590;
                  var588 += Statics.field10468 * var590;
                  var586 += var590;
               }

               int var591;
               if ((var591 = (var587 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var589) {
                  var589 = var591;
               }

               int var592;
               if ((var592 = var588 - (this.field10452 << 12)) >= 0) {
                  int var593 = (Statics.field10468 - var592) / Statics.field10468;
                  var589 += var593;
                  var587 += Statics.field10467 * var593;
                  var588 += Statics.field10468 * var593;
                  var586 += var593;
               }

               int var594;
               if ((var594 = (var588 - Statics.field10468) / Statics.field10468) > var589) {
                  var589 = var594;
               }

               while(var589 < 0) {
                  int var595 = (var587 >> 12) + (var588 >> 12) * this.field10465;
                  int var596 = var586++;
                  if (arg1 == 0) {
                     if (arg0 == 1) {
                        var3[var596] = this.field1188[this.field1189[var595] & 255];
                     } else if (arg0 == 0) {
                        int var597 = this.field1188[this.field1189[var595] & 255];
                        int var598 = (var597 & 16711680) * field10480 & -16777216;
                        int var599 = (var597 & 65280) * field10481 & 16711680;
                        int var600 = (var597 & 255) * field10482 & 65280;
                        var3[var596] = (var598 | var599 | var600) >>> 8;
                     } else if (arg0 == 3) {
                        int var601 = this.field1188[this.field1189[var595] & 255];
                        int var602 = Statics.field10477;
                        int var603 = var601 + var602;
                        int var604 = (var601 & 16711935) + (var602 & 16711935);
                        int var605 = (var603 - var604 & 65536) + (var604 & 16777472);
                        var3[var596] = var603 - var605 | var605 - (var605 >>> 8);
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var606 = this.field1188[this.field1189[var595] & 255];
                        int var607 = (var606 & 16711935) * field10478 & -16711936;
                        int var608 = (var606 & 65280) * field10478 & 16711680;
                        var3[var596] = ((var607 | var608) >>> 8) + field10485;
                     }
                  } else if (arg1 == 1) {
                     if (arg0 == 1) {
                        byte var609 = this.field1189[var595];
                        if (var609 != 0) {
                           var3[var596] = this.field1188[var609 & 255];
                        }
                     } else if (arg0 == 0) {
                        byte var610 = this.field1189[var595];
                        if (var610 != 0) {
                           int var611 = this.field1188[var610 & 255];
                           if ((Statics.field10477 & 16777215) == 16777215) {
                              int var612 = Statics.field10477 >>> 24;
                              int var613 = 256 - var612;
                              int var614 = var3[var596];
                              var3[var596] = ((var611 & 16711935) * var612 + (var614 & 16711935) * var613 & -16711936) + ((var611 & 65280) * var612 + (var614 & 65280) * var613 & 16711680) >> 8;
                           } else if (field10478 != 255) {
                              int var615 = (var611 & 16711680) * field10480 & -16777216;
                              int var616 = (var611 & 65280) * field10481 & 16711680;
                              int var617 = (var611 & 255) * field10482 & 65280;
                              int var618 = (var615 | var616 | var617) >>> 8;
                              int var619 = var3[var596];
                              var3[var596] = ((var618 & 16711935) * field10478 + (var619 & 16711935) * field10475 & -16711936) + ((var618 & 65280) * field10478 + (var619 & 65280) * field10475 & 16711680) >> 8;
                           } else {
                              int var620 = (var611 & 16711680) * field10480 & -16777216;
                              int var621 = (var611 & 65280) * field10481 & 16711680;
                              int var622 = (var611 & 255) * field10482 & 65280;
                              var3[var596] = (var620 | var621 | var622) >>> 8;
                           }
                        }
                     } else if (arg0 == 3) {
                        byte var623 = this.field1189[var595];
                        int var624 = var623 > 0 ? this.field1188[var623] : 0;
                        int var625 = Statics.field10477;
                        int var626 = var624 + var625;
                        int var627 = (var624 & 16711935) + (var625 & 16711935);
                        int var628 = (var626 - var627 & 65536) + (var627 & 16777472);
                        int var629 = var626 - var628 | var628 - (var628 >>> 8);
                        if (var624 == 0 && field10478 != 255) {
                           int var631 = var3[var596];
                           var629 = ((var629 & 16711935) * field10478 + (var631 & 16711935) * field10475 & -16711936) + ((var629 & 65280) * field10478 + (var631 & 65280) * field10475 & 16711680) >> 8;
                        }

                        var3[var596] = var629;
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        byte var632 = this.field1189[var595];
                        if (var632 != 0) {
                           int var633 = this.field1188[var632 & 255];
                           int var634 = (var633 & 16711935) * field10478 & -16711936;
                           int var635 = (var633 & 65280) * field10478 & 16711680;
                           var3[var596++] = ((var634 | var635) >>> 8) + field10485;
                        }
                     }
                  } else {
                     if (arg1 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (arg0 == 1) {
                        byte var636 = this.field1189[var595];
                        if (var636 != 0) {
                           int var637 = this.field1188[var636 & 255];
                           int var638 = var3[var596];
                           int var639 = var637 + var638;
                           int var640 = (var637 & 16711935) + (var638 & 16711935);
                           int var641 = (var639 - var640 & 65536) + (var640 & 16777472);
                           var3[var596] = var639 - var641 | var641 - (var641 >>> 8);
                        }
                     } else if (arg0 == 0) {
                        byte var642 = this.field1189[var595];
                        if (var642 != 0) {
                           int var643 = this.field1188[var642 & 255];
                           int var644 = (var643 & 16711680) * field10480 & -16777216;
                           int var645 = (var643 & 65280) * field10481 & 16711680;
                           int var646 = (var643 & 255) * field10482 & 65280;
                           int var647 = (var644 | var645 | var646) >>> 8;
                           int var648 = var3[var596];
                           int var649 = var647 + var648;
                           int var650 = (var647 & 16711935) + (var648 & 16711935);
                           int var651 = (var649 - var650 & 65536) + (var650 & 16777472);
                           var3[var596] = var649 - var651 | var651 - (var651 >>> 8);
                        }
                     } else if (arg0 == 3) {
                        byte var652 = this.field1189[var595];
                        int var653 = var652 > 0 ? this.field1188[var652] : 0;
                        int var654 = Statics.field10477;
                        int var655 = var653 + var654;
                        int var656 = (var653 & 16711935) + (var654 & 16711935);
                        int var657 = (var655 - var656 & 65536) + (var656 & 16777472);
                        int var658 = var655 - var657 | var657 - (var657 >>> 8);
                        if (var653 == 0 && field10478 != 255) {
                           int var660 = var3[var596];
                           var658 = ((var658 & 16711935) * field10478 + (var660 & 16711935) * field10475 & -16711936) + ((var658 & 65280) * field10478 + (var660 & 65280) * field10475 & 16711680) >> 8;
                        }

                        var3[var596] = var658;
                     } else if (arg0 == 2) {
                        byte var661 = this.field1189[var595];
                        if (var661 != 0) {
                           int var662 = this.field1188[var661 & 255];
                           int var663 = (var662 & 16711935) * field10478 & -16711936;
                           int var664 = (var662 & 65280) * field10478 & 16711680;
                           int var665 = ((var663 | var664) >>> 8) + field10485;
                           int var666 = var3[var596];
                           int var667 = var665 + var666;
                           int var668 = (var665 & 16711935) + (var666 & 16711935);
                           int var669 = (var667 - var668 & 65536) + (var668 & 16777472);
                           var3[var596] = var667 - var669 | var669 - (var669 >>> 8);
                        }
                     }
                  }

                  var587 += Statics.field10467;
                  var588 += Statics.field10468;
                  ++var589;
               }

               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         } else {
            for(int var670 = Statics.field10464; var670 < 0; ++var670) {
               int var671 = Statics.field10466;
               int var672 = Statics.field10484 + Statics.field10473;
               int var673 = Statics.field10479 + Statics.field10455;
               int var674 = Statics.field10462;
               if (var672 < 0) {
                  int var675 = (Statics.field10467 - 1 - var672) / Statics.field10467;
                  var674 += var675;
                  var672 += Statics.field10467 * var675;
                  var673 += Statics.field10468 * var675;
                  var671 += var675;
               }

               int var676;
               if ((var676 = (var672 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var674) {
                  var674 = var676;
               }

               if (var673 < 0) {
                  int var677 = (Statics.field10468 - 1 - var673) / Statics.field10468;
                  var674 += var677;
                  var672 += Statics.field10467 * var677;
                  var673 += Statics.field10468 * var677;
                  var671 += var677;
               }

               int var678;
               if ((var678 = (var673 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var674) {
                  var674 = var678;
               }

               while(var674 < 0) {
                  int var679 = (var672 >> 12) + (var673 >> 12) * this.field10465;
                  int var680 = var671++;
                  if (arg1 == 0) {
                     if (arg0 == 1) {
                        var3[var680] = this.field1188[this.field1189[var679] & 255];
                     } else if (arg0 == 0) {
                        int var681 = this.field1188[this.field1189[var679] & 255];
                        int var682 = (var681 & 16711680) * field10480 & -16777216;
                        int var683 = (var681 & 65280) * field10481 & 16711680;
                        int var684 = (var681 & 255) * field10482 & 65280;
                        var3[var680] = (var682 | var683 | var684) >>> 8;
                     } else if (arg0 == 3) {
                        int var685 = this.field1188[this.field1189[var679] & 255];
                        int var686 = Statics.field10477;
                        int var687 = var685 + var686;
                        int var688 = (var685 & 16711935) + (var686 & 16711935);
                        int var689 = (var687 - var688 & 65536) + (var688 & 16777472);
                        var3[var680] = var687 - var689 | var689 - (var689 >>> 8);
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var690 = this.field1188[this.field1189[var679] & 255];
                        int var691 = (var690 & 16711935) * field10478 & -16711936;
                        int var692 = (var690 & 65280) * field10478 & 16711680;
                        var3[var680] = ((var691 | var692) >>> 8) + field10485;
                     }
                  } else if (arg1 == 1) {
                     if (arg0 == 1) {
                        byte var693 = this.field1189[var679];
                        if (var693 != 0) {
                           var3[var680] = this.field1188[var693 & 255];
                        }
                     } else if (arg0 == 0) {
                        byte var694 = this.field1189[var679];
                        if (var694 != 0) {
                           int var695 = this.field1188[var694 & 255];
                           if ((Statics.field10477 & 16777215) == 16777215) {
                              int var696 = Statics.field10477 >>> 24;
                              int var697 = 256 - var696;
                              int var698 = var3[var680];
                              var3[var680] = ((var695 & 16711935) * var696 + (var698 & 16711935) * var697 & -16711936) + ((var695 & 65280) * var696 + (var698 & 65280) * var697 & 16711680) >> 8;
                           } else if (field10478 != 255) {
                              int var699 = (var695 & 16711680) * field10480 & -16777216;
                              int var700 = (var695 & 65280) * field10481 & 16711680;
                              int var701 = (var695 & 255) * field10482 & 65280;
                              int var702 = (var699 | var700 | var701) >>> 8;
                              int var703 = var3[var680];
                              var3[var680] = ((var702 & 16711935) * field10478 + (var703 & 16711935) * field10475 & -16711936) + ((var702 & 65280) * field10478 + (var703 & 65280) * field10475 & 16711680) >> 8;
                           } else {
                              int var704 = (var695 & 16711680) * field10480 & -16777216;
                              int var705 = (var695 & 65280) * field10481 & 16711680;
                              int var706 = (var695 & 255) * field10482 & 65280;
                              var3[var680] = (var704 | var705 | var706) >>> 8;
                           }
                        }
                     } else if (arg0 == 3) {
                        byte var707 = this.field1189[var679];
                        int var708 = var707 > 0 ? this.field1188[var707] : 0;
                        int var709 = Statics.field10477;
                        int var710 = var708 + var709;
                        int var711 = (var708 & 16711935) + (var709 & 16711935);
                        int var712 = (var710 - var711 & 65536) + (var711 & 16777472);
                        int var713 = var710 - var712 | var712 - (var712 >>> 8);
                        if (var708 == 0 && field10478 != 255) {
                           int var715 = var3[var680];
                           var713 = ((var713 & 16711935) * field10478 + (var715 & 16711935) * field10475 & -16711936) + ((var713 & 65280) * field10478 + (var715 & 65280) * field10475 & 16711680) >> 8;
                        }

                        var3[var680] = var713;
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        byte var716 = this.field1189[var679];
                        if (var716 != 0) {
                           int var717 = this.field1188[var716 & 255];
                           int var718 = (var717 & 16711935) * field10478 & -16711936;
                           int var719 = (var717 & 65280) * field10478 & 16711680;
                           var3[var680++] = ((var718 | var719) >>> 8) + field10485;
                        }
                     }
                  } else {
                     if (arg1 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (arg0 == 1) {
                        byte var720 = this.field1189[var679];
                        if (var720 != 0) {
                           int var721 = this.field1188[var720 & 255];
                           int var722 = var3[var680];
                           int var723 = var721 + var722;
                           int var724 = (var721 & 16711935) + (var722 & 16711935);
                           int var725 = (var723 - var724 & 65536) + (var724 & 16777472);
                           var3[var680] = var723 - var725 | var725 - (var725 >>> 8);
                        }
                     } else if (arg0 == 0) {
                        byte var726 = this.field1189[var679];
                        if (var726 != 0) {
                           int var727 = this.field1188[var726 & 255];
                           int var728 = (var727 & 16711680) * field10480 & -16777216;
                           int var729 = (var727 & 65280) * field10481 & 16711680;
                           int var730 = (var727 & 255) * field10482 & 65280;
                           int var731 = (var728 | var729 | var730) >>> 8;
                           int var732 = var3[var680];
                           int var733 = var731 + var732;
                           int var734 = (var731 & 16711935) + (var732 & 16711935);
                           int var735 = (var733 - var734 & 65536) + (var734 & 16777472);
                           var3[var680] = var733 - var735 | var735 - (var735 >>> 8);
                        }
                     } else if (arg0 == 3) {
                        byte var736 = this.field1189[var679];
                        int var737 = var736 > 0 ? this.field1188[var736] : 0;
                        int var738 = Statics.field10477;
                        int var739 = var737 + var738;
                        int var740 = (var737 & 16711935) + (var738 & 16711935);
                        int var741 = (var739 - var740 & 65536) + (var740 & 16777472);
                        int var742 = var739 - var741 | var741 - (var741 >>> 8);
                        if (var737 == 0 && field10478 != 255) {
                           int var744 = var3[var680];
                           var742 = ((var742 & 16711935) * field10478 + (var744 & 16711935) * field10475 & -16711936) + ((var742 & 65280) * field10478 + (var744 & 65280) * field10475 & 16711680) >> 8;
                        }

                        var3[var680] = var742;
                     } else if (arg0 == 2) {
                        byte var745 = this.field1189[var679];
                        if (var745 != 0) {
                           int var746 = this.field1188[var745 & 255];
                           int var747 = (var746 & 16711935) * field10478 & -16711936;
                           int var748 = (var746 & 65280) * field10478 & 16711680;
                           int var749 = ((var747 | var748) >>> 8) + field10485;
                           int var750 = var3[var680];
                           int var751 = var749 + var750;
                           int var752 = (var749 & 16711935) + (var750 & 16711935);
                           int var753 = (var751 - var752 & 65536) + (var752 & 16777472);
                           var3[var680] = var751 - var753 | var753 - (var753 >>> 8);
                        }
                     }
                  }

                  var672 += Statics.field10467;
                  var673 += Statics.field10468;
                  ++var674;
               }

               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         }

      }
   }

   @deob.ObfuscatedName("ago.b([I[III)V")
   protected void method2397(int[] arg0, int[] arg1, int arg2, int arg3) {
      int[] var5 = this.field10459.field10406;
      if (var5 != null) {
         if (Statics.field10467 == 0) {
            if (Statics.field10468 == 0) {
               int var6 = Statics.field10464;

               while(var6 < 0) {
                  int var7 = arg3 + var6;
                  if (var7 >= 0) {
                     if (var7 >= arg0.length) {
                        return;
                     }

                     int var8 = Statics.field10466;
                     int var9 = Statics.field10473;
                     int var10 = Statics.field10479;
                     int var11 = Statics.field10462;
                     if (var9 >= 0 && var10 >= 0 && var9 - (this.field10465 << 12) < 0 && var10 - (this.field10452 << 12) < 0) {
                        int var12 = arg0[var7] - arg2;
                        int var13 = -arg1[var7];
                        int var14 = var12 - (var8 - Statics.field10466);
                        if (var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += Statics.field10467 * var14;
                           var10 += Statics.field10468 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if (var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           byte var15 = this.field1189[(var9 >> 12) + (var10 >> 12) * this.field10465];
                           if (var15 != 0) {
                              var5[var8++] = this.field1188[var15 & 255];
                           } else {
                              ++var8;
                           }

                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  Statics.field10466 += Statics.field10456;
               }
            } else if (Statics.field10468 < 0) {
               int var16 = Statics.field10464;

               while(var16 < 0) {
                  int var17 = arg3 + var16;
                  if (var17 >= 0) {
                     if (var17 >= arg0.length) {
                        return;
                     }

                     int var18 = Statics.field10466;
                     int var19 = Statics.field10473;
                     int var20 = Statics.field10479 + Statics.field10455;
                     int var21 = Statics.field10462;
                     if (var19 >= 0 && var19 - (this.field10465 << 12) < 0) {
                        int var22;
                        if ((var22 = var20 - (this.field10452 << 12)) >= 0) {
                           int var23 = (Statics.field10468 - var22) / Statics.field10468;
                           var21 += var23;
                           var20 += Statics.field10468 * var23;
                           var18 += var23;
                        }

                        int var24;
                        if ((var24 = (var20 - Statics.field10468) / Statics.field10468) > var21) {
                           var21 = var24;
                        }

                        int var25 = arg0[var17] - arg2;
                        int var26 = -arg1[var17];
                        int var27 = var25 - (var18 - Statics.field10466);
                        if (var27 > 0) {
                           var18 += var27;
                           var21 += var27;
                           var19 += Statics.field10467 * var27;
                           var20 += Statics.field10468 * var27;
                        } else {
                           var26 -= var27;
                        }

                        if (var21 < var26) {
                           var21 = var26;
                        }

                        while(var21 < 0) {
                           byte var28 = this.field1189[(var19 >> 12) + (var20 >> 12) * this.field10465];
                           if (var28 != 0) {
                              var5[var18++] = this.field1188[var28 & 255];
                           } else {
                              ++var18;
                           }

                           var20 += Statics.field10468;
                           ++var21;
                        }
                     }
                  }

                  ++var16;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10466 += Statics.field10456;
               }
            } else {
               int var29 = Statics.field10464;

               while(var29 < 0) {
                  int var30 = arg3 + var29;
                  if (var30 >= 0) {
                     if (var30 >= arg0.length) {
                        return;
                     }

                     int var31 = Statics.field10466;
                     int var32 = Statics.field10473;
                     int var33 = Statics.field10479 + Statics.field10455;
                     int var34 = Statics.field10462;
                     if (var32 >= 0 && var32 - (this.field10465 << 12) < 0) {
                        if (var33 < 0) {
                           int var35 = (Statics.field10468 - 1 - var33) / Statics.field10468;
                           var34 += var35;
                           var33 += Statics.field10468 * var35;
                           var31 += var35;
                        }

                        int var36;
                        if ((var36 = (var33 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var34) {
                           var34 = var36;
                        }

                        int var37 = arg0[var30] - arg2;
                        int var38 = -arg1[var30];
                        int var39 = var37 - (var31 - Statics.field10466);
                        if (var39 > 0) {
                           var31 += var39;
                           var34 += var39;
                           var32 += Statics.field10467 * var39;
                           var33 += Statics.field10468 * var39;
                        } else {
                           var38 -= var39;
                        }

                        if (var34 < var38) {
                           var34 = var38;
                        }

                        while(var34 < 0) {
                           byte var40 = this.field1189[(var32 >> 12) + (var33 >> 12) * this.field10465];
                           if (var40 != 0) {
                              var5[var31++] = this.field1188[var40 & 255];
                           } else {
                              ++var31;
                           }

                           var33 += Statics.field10468;
                           ++var34;
                        }
                     }
                  }

                  ++var29;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10466 += Statics.field10456;
               }
            }
         } else if (Statics.field10467 < 0) {
            if (Statics.field10468 == 0) {
               int var41 = Statics.field10464;

               while(var41 < 0) {
                  int var42 = arg3 + var41;
                  if (var42 >= 0) {
                     if (var42 >= arg0.length) {
                        return;
                     }

                     int var43 = Statics.field10466;
                     int var44 = Statics.field10484 + Statics.field10473;
                     int var45 = Statics.field10479;
                     int var46 = Statics.field10462;
                     if (var45 >= 0 && var45 - (this.field10452 << 12) < 0) {
                        int var47;
                        if ((var47 = var44 - (this.field10465 << 12)) >= 0) {
                           int var48 = (Statics.field10467 - var47) / Statics.field10467;
                           var46 += var48;
                           var44 += Statics.field10467 * var48;
                           var43 += var48;
                        }

                        int var49;
                        if ((var49 = (var44 - Statics.field10467) / Statics.field10467) > var46) {
                           var46 = var49;
                        }

                        int var50 = arg0[var42] - arg2;
                        int var51 = -arg1[var42];
                        int var52 = var50 - (var43 - Statics.field10466);
                        if (var52 > 0) {
                           var43 += var52;
                           var46 += var52;
                           var44 += Statics.field10467 * var52;
                           var45 += Statics.field10468 * var52;
                        } else {
                           var51 -= var52;
                        }

                        if (var46 < var51) {
                           var46 = var51;
                        }

                        while(var46 < 0) {
                           byte var53 = this.field1189[(var44 >> 12) + (var45 >> 12) * this.field10465];
                           if (var53 != 0) {
                              var5[var43++] = this.field1188[var53 & 255];
                           } else {
                              ++var43;
                           }

                           var44 += Statics.field10467;
                           ++var46;
                        }
                     }
                  }

                  ++var41;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            } else if (Statics.field10468 < 0) {
               int var54 = Statics.field10464;

               while(var54 < 0) {
                  int var55 = arg3 + var54;
                  if (var55 >= 0) {
                     if (var55 >= arg0.length) {
                        return;
                     }

                     int var56 = Statics.field10466;
                     int var57 = Statics.field10484 + Statics.field10473;
                     int var58 = Statics.field10479 + Statics.field10455;
                     int var59 = Statics.field10462;
                     int var60;
                     if ((var60 = var57 - (this.field10465 << 12)) >= 0) {
                        int var61 = (Statics.field10467 - var60) / Statics.field10467;
                        var59 += var61;
                        var57 += Statics.field10467 * var61;
                        var58 += Statics.field10468 * var61;
                        var56 += var61;
                     }

                     int var62;
                     if ((var62 = (var57 - Statics.field10467) / Statics.field10467) > var59) {
                        var59 = var62;
                     }

                     int var63;
                     if ((var63 = var58 - (this.field10452 << 12)) >= 0) {
                        int var64 = (Statics.field10468 - var63) / Statics.field10468;
                        var59 += var64;
                        var57 += Statics.field10467 * var64;
                        var58 += Statics.field10468 * var64;
                        var56 += var64;
                     }

                     int var65;
                     if ((var65 = (var58 - Statics.field10468) / Statics.field10468) > var59) {
                        var59 = var65;
                     }

                     int var66 = arg0[var55] - arg2;
                     int var67 = -arg1[var55];
                     int var68 = var66 - (var56 - Statics.field10466);
                     if (var68 > 0) {
                        var56 += var68;
                        var59 += var68;
                        var57 += Statics.field10467 * var68;
                        var58 += Statics.field10468 * var68;
                     } else {
                        var67 -= var68;
                     }

                     if (var59 < var67) {
                        var59 = var67;
                     }

                     while(var59 < 0) {
                        byte var69 = this.field1189[(var57 >> 12) + (var58 >> 12) * this.field10465];
                        if (var69 != 0) {
                           var5[var56++] = this.field1188[var69 & 255];
                        } else {
                           ++var56;
                        }

                        var57 += Statics.field10467;
                        var58 += Statics.field10468;
                        ++var59;
                     }
                  }

                  ++var54;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            } else {
               int var70 = Statics.field10464;

               while(var70 < 0) {
                  int var71 = arg3 + var70;
                  if (var71 >= 0) {
                     if (var71 >= arg0.length) {
                        return;
                     }

                     int var72 = Statics.field10466;
                     int var73 = Statics.field10484 + Statics.field10473;
                     int var74 = Statics.field10479 + Statics.field10455;
                     int var75 = Statics.field10462;
                     int var76;
                     if ((var76 = var73 - (this.field10465 << 12)) >= 0) {
                        int var77 = (Statics.field10467 - var76) / Statics.field10467;
                        var75 += var77;
                        var73 += Statics.field10467 * var77;
                        var74 += Statics.field10468 * var77;
                        var72 += var77;
                     }

                     int var78;
                     if ((var78 = (var73 - Statics.field10467) / Statics.field10467) > var75) {
                        var75 = var78;
                     }

                     if (var74 < 0) {
                        int var79 = (Statics.field10468 - 1 - var74) / Statics.field10468;
                        var75 += var79;
                        var73 += Statics.field10467 * var79;
                        var74 += Statics.field10468 * var79;
                        var72 += var79;
                     }

                     int var80;
                     if ((var80 = (var74 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var75) {
                        var75 = var80;
                     }

                     int var81 = arg0[var71] - arg2;
                     int var82 = -arg1[var71];
                     int var83 = var81 - (var72 - Statics.field10466);
                     if (var83 > 0) {
                        var72 += var83;
                        var75 += var83;
                        var73 += Statics.field10467 * var83;
                        var74 += Statics.field10468 * var83;
                     } else {
                        var82 -= var83;
                     }

                     if (var75 < var82) {
                        var75 = var82;
                     }

                     while(var75 < 0) {
                        byte var84 = this.field1189[(var73 >> 12) + (var74 >> 12) * this.field10465];
                        if (var84 != 0) {
                           var5[var72++] = this.field1188[var84 & 255];
                        } else {
                           ++var72;
                        }

                        var73 += Statics.field10467;
                        var74 += Statics.field10468;
                        ++var75;
                     }
                  }

                  ++var70;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            }
         } else if (Statics.field10468 == 0) {
            int var85 = Statics.field10464;

            while(var85 < 0) {
               int var86 = arg3 + var85;
               if (var86 >= 0) {
                  if (var86 >= arg0.length) {
                     return;
                  }

                  int var87 = Statics.field10466;
                  int var88 = Statics.field10484 + Statics.field10473;
                  int var89 = Statics.field10479;
                  int var90 = Statics.field10462;
                  if (var89 >= 0 && var89 - (this.field10452 << 12) < 0) {
                     if (var88 < 0) {
                        int var91 = (Statics.field10467 - 1 - var88) / Statics.field10467;
                        var90 += var91;
                        var88 += Statics.field10467 * var91;
                        var87 += var91;
                     }

                     int var92;
                     if ((var92 = (var88 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var90) {
                        var90 = var92;
                     }

                     int var93 = arg0[var86] - arg2;
                     int var94 = -arg1[var86];
                     int var95 = var93 - (var87 - Statics.field10466);
                     if (var95 > 0) {
                        var87 += var95;
                        var90 += var95;
                        var88 += Statics.field10467 * var95;
                        var89 += Statics.field10468 * var95;
                     } else {
                        var94 -= var95;
                     }

                     if (var90 < var94) {
                        var90 = var94;
                     }

                     while(var90 < 0) {
                        byte var96 = this.field1189[(var88 >> 12) + (var89 >> 12) * this.field10465];
                        if (var96 != 0) {
                           var5[var87++] = this.field1188[var96 & 255];
                        } else {
                           ++var87;
                        }

                        var88 += Statics.field10467;
                        ++var90;
                     }
                  }
               }

               ++var85;
               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         } else if (Statics.field10468 < 0) {
            int var97 = Statics.field10464;

            while(var97 < 0) {
               int var98 = arg3 + var97;
               if (var98 >= 0) {
                  if (var98 >= arg0.length) {
                     return;
                  }

                  int var99 = Statics.field10466;
                  int var100 = Statics.field10484 + Statics.field10473;
                  int var101 = Statics.field10479 + Statics.field10455;
                  int var102 = Statics.field10462;
                  if (var100 < 0) {
                     int var103 = (Statics.field10467 - 1 - var100) / Statics.field10467;
                     var102 += var103;
                     var100 += Statics.field10467 * var103;
                     var101 += Statics.field10468 * var103;
                     var99 += var103;
                  }

                  int var104;
                  if ((var104 = (var100 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var102) {
                     var102 = var104;
                  }

                  int var105;
                  if ((var105 = var101 - (this.field10452 << 12)) >= 0) {
                     int var106 = (Statics.field10468 - var105) / Statics.field10468;
                     var102 += var106;
                     var100 += Statics.field10467 * var106;
                     var101 += Statics.field10468 * var106;
                     var99 += var106;
                  }

                  int var107;
                  if ((var107 = (var101 - Statics.field10468) / Statics.field10468) > var102) {
                     var102 = var107;
                  }

                  int var108 = arg0[var98] - arg2;
                  int var109 = -arg1[var98];
                  int var110 = var108 - (var99 - Statics.field10466);
                  if (var110 > 0) {
                     var99 += var110;
                     var102 += var110;
                     var100 += Statics.field10467 * var110;
                     var101 += Statics.field10468 * var110;
                  } else {
                     var109 -= var110;
                  }

                  if (var102 < var109) {
                     var102 = var109;
                  }

                  while(var102 < 0) {
                     byte var111 = this.field1189[(var100 >> 12) + (var101 >> 12) * this.field10465];
                     if (var111 != 0) {
                        var5[var99++] = this.field1188[var111 & 255];
                     } else {
                        ++var99;
                     }

                     var100 += Statics.field10467;
                     var101 += Statics.field10468;
                     ++var102;
                  }
               }

               ++var97;
               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         } else {
            int var112 = Statics.field10464;

            while(var112 < 0) {
               int var113 = arg3 + var112;
               if (var113 >= 0) {
                  if (var113 >= arg0.length) {
                     return;
                  }

                  int var114 = Statics.field10466;
                  int var115 = Statics.field10484 + Statics.field10473;
                  int var116 = Statics.field10479 + Statics.field10455;
                  int var117 = Statics.field10462;
                  if (var115 < 0) {
                     int var118 = (Statics.field10467 - 1 - var115) / Statics.field10467;
                     var117 += var118;
                     var115 += Statics.field10467 * var118;
                     var116 += Statics.field10468 * var118;
                     var114 += var118;
                  }

                  int var119;
                  if ((var119 = (var115 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var117) {
                     var117 = var119;
                  }

                  if (var116 < 0) {
                     int var120 = (Statics.field10468 - 1 - var116) / Statics.field10468;
                     var117 += var120;
                     var115 += Statics.field10467 * var120;
                     var116 += Statics.field10468 * var120;
                     var114 += var120;
                  }

                  int var121;
                  if ((var121 = (var116 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var117) {
                     var117 = var121;
                  }

                  int var122 = arg0[var113] - arg2;
                  int var123 = -arg1[var113];
                  int var124 = var122 - (var114 - Statics.field10466);
                  if (var124 > 0) {
                     var114 += var124;
                     var117 += var124;
                     var115 += Statics.field10467 * var124;
                     var116 += Statics.field10468 * var124;
                  } else {
                     var123 -= var124;
                  }

                  if (var117 < var123) {
                     var117 = var123;
                  }

                  while(var117 < 0) {
                     byte var125 = this.field1189[(var115 >> 12) + (var116 >> 12) * this.field10465];
                     if (var125 != 0) {
                        var5[var114++] = this.field1188[var125 & 255];
                     } else {
                        ++var114;
                     }

                     var115 += Statics.field10467;
                     var116 += Statics.field10468;
                     ++var117;
                  }
               }

               ++var112;
               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         }

      }
   }
}
