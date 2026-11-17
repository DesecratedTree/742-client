@deob.ObfuscatedName("agl")
public class class176 extends class986 {
   @deob.ObfuscatedName("agl.ag")
   private int[] field1182;

   public class176(class984 arg0, int arg1, int arg2) {
      super(arg0, arg1, arg2);
      this.field1182 = new int[arg1 * arg2];
   }

   public class176(class984 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg4, arg5);
      if (arg6) {
         this.field1182 = new int[arg4 * arg5];
      } else {
         this.field1182 = arg1;
      }

      int var8 = arg3 - this.field10465;
      int var9 = 0;

      for(int var10 = 0; var10 < arg5; ++var10) {
         for(int var11 = 0; var11 < arg4; ++var11) {
            int var12 = arg1[arg2++];
            if (var12 >>> 24 == 255) {
               this.field1182[var9++] = (var12 & 16777215) == 0 ? -16777215 : var12;
            } else {
               this.field1182[var9++] = 0;
            }
         }

         arg2 += var8;
      }

   }

   public class176(class984 arg0, int[] arg1, int arg2, int arg3) {
      super(arg0, arg2, arg3);
      this.field1182 = arg1;
   }

   @deob.ObfuscatedName("agl.t(IIIIII)V")
   public void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int[] var7 = this.field10459.field10406;
      if (var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < arg3; ++var8) {
            int var9 = (arg1 + var8) * this.field10465 + arg0;
            int var10 = this.field10459.field10407 * (arg5 + var8) + arg4;

            for(int var11 = 0; var11 < arg2; ++var11) {
               this.field1182[var9 + var11] = var7[var10 + var11];
            }
         }

      }
   }

   @deob.ObfuscatedName("agl.c(III)V")
   public void method2390(int arg0, int arg1, int arg2) {
      throw new IllegalStateException("");
   }

   @deob.ObfuscatedName("agl.i()Ldm;")
   public class398 method2391() {
      return new class317(this.field10465, this.field10452, this.field1182);
   }

   @deob.ObfuscatedName("agl.q(IIIII)V")
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
                           var6[var10++] = this.field1182[var11++];
                           var6[var10++] = this.field1182[var11++];
                           var6[var10++] = this.field1182[var11++];
                           var6[var10++] = this.field1182[var11++];
                        }

                        var20 += 3;

                        while(var10 < var20) {
                           var6[var10++] = this.field1182[var11++];
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
                           int var26 = this.field1182[var11++];
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
                           int var32 = this.field1182[var11++];
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
                           int var43 = this.field1182[var11++];
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
                        int var47 = var10 + var13 - 3;

                        while(var10 < var47) {
                           int var48 = this.field1182[var11++];
                           if (var48 != 0) {
                              var6[var10++] = var48;
                           } else {
                              ++var10;
                           }

                           int var49 = this.field1182[var11++];
                           if (var49 != 0) {
                              var6[var10++] = var49;
                           } else {
                              ++var10;
                           }

                           int var50 = this.field1182[var11++];
                           if (var50 != 0) {
                              var6[var10++] = var50;
                           } else {
                              ++var10;
                           }

                           int var51 = this.field1182[var11++];
                           if (var51 != 0) {
                              var6[var10++] = var51;
                           } else {
                              ++var10;
                           }
                        }

                        var47 += 3;

                        while(var10 < var47) {
                           int var52 = this.field1182[var11++];
                           if (var52 != 0) {
                              var6[var10++] = var52;
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
                              int var57 = this.field1182[var11++];
                              if (var57 != 0) {
                                 int var58 = var6[var10];
                                 var6[var10++] = ((var57 & 16711935) * var53 + (var58 & 16711935) * var54 & -16711936) + ((var57 & 65280) * var53 + (var58 & 65280) * var54 & 16711680) >> 8;
                              } else {
                                 ++var10;
                              }
                           }

                           var10 += var14;
                           var11 += var15;
                        }
                     } else {
                        int var59 = (arg3 & 16711680) >> 16;
                        int var60 = (arg3 & 65280) >> 8;
                        int var61 = arg3 & 255;
                        int var62 = arg3 >>> 24;
                        int var63 = 256 - var62;

                        for(int var64 = -var12; var64 < 0; ++var64) {
                           for(int var65 = -var13; var65 < 0; ++var65) {
                              int var66 = this.field1182[var11++];
                              if (var66 != 0) {
                                 if (var62 != 255) {
                                    int var67 = (var66 & 16711680) * var59 & -16777216;
                                    int var68 = (var66 & 65280) * var60 & 16711680;
                                    int var69 = (var66 & 255) * var61 & 65280;
                                    int var70 = (var67 | var68 | var69) >>> 8;
                                    int var71 = var6[var10];
                                    var6[var10++] = ((var70 & 16711935) * var62 + (var71 & 16711935) * var63 & -16711936) + ((var70 & 65280) * var62 + (var71 & 65280) * var63 & 16711680) >> 8;
                                 } else {
                                    int var72 = (var66 & 16711680) * var59 & -16777216;
                                    int var73 = (var66 & 65280) * var60 & 16711680;
                                    int var74 = (var66 & 255) * var61 & 65280;
                                    var6[var10++] = (var72 | var73 | var74) >>> 8;
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
                     int var75 = arg3 >>> 24;
                     int var76 = 256 - var75;

                     for(int var77 = -var12; var77 < 0; ++var77) {
                        for(int var78 = -var13; var78 < 0; ++var78) {
                           int var79 = this.field1182[var11++];
                           int var80 = arg3 + var79;
                           int var81 = (arg3 & 16711935) + (var79 & 16711935);
                           int var82 = (var80 - var81 & 65536) + (var81 & 16777472);
                           int var83 = var80 - var82 | var82 - (var82 >>> 8);
                           if (var79 == 0 && var75 != 255) {
                              int var85 = var6[var10];
                              var83 = ((var83 & 16711935) * var75 + (var85 & 16711935) * var76 & -16711936) + ((var83 & 65280) * var75 + (var85 & 65280) * var76 & 16711680) >> 8;
                           }

                           var6[var10++] = var83;
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else {
                     if (arg2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var86 = arg3 >>> 24;
                     int var87 = 256 - var86;
                     int var88 = (arg3 & 16711935) * var87 & -16711936;
                     int var89 = (arg3 & 65280) * var87 & 16711680;
                     int var90 = (var88 | var89) >>> 8;

                     for(int var91 = -var12; var91 < 0; ++var91) {
                        for(int var92 = -var13; var92 < 0; ++var92) {
                           int var93 = this.field1182[var11++];
                           if (var93 != 0) {
                              int var94 = (var93 & 16711935) * var86 & -16711936;
                              int var95 = (var93 & 65280) * var86 & 16711680;
                              var6[var10++] = ((var94 | var95) >>> 8) + var90;
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
                     for(int var96 = -var12; var96 < 0; ++var96) {
                        for(int var97 = -var13; var97 < 0; ++var97) {
                           int var98 = this.field1182[var11++];
                           if (var98 != 0) {
                              int var99 = var6[var10];
                              int var100 = var98 + var99;
                              int var101 = (var98 & 16711935) + (var99 & 16711935);
                              int var102 = (var100 - var101 & 65536) + (var101 & 16777472);
                              var6[var10++] = var100 - var102 | var102 - (var102 >>> 8);
                           } else {
                              ++var10;
                           }
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else if (arg2 == 0) {
                     int var103 = (arg3 & 16711680) >> 16;
                     int var104 = (arg3 & 65280) >> 8;
                     int var105 = arg3 & 255;

                     for(int var106 = -var12; var106 < 0; ++var106) {
                        for(int var107 = -var13; var107 < 0; ++var107) {
                           int var108 = this.field1182[var11++];
                           if (var108 != 0) {
                              int var109 = (var108 & 16711680) * var103 & -16777216;
                              int var110 = (var108 & 65280) * var104 & 16711680;
                              int var111 = (var108 & 255) * var105 & 65280;
                              int var112 = (var109 | var110 | var111) >>> 8;
                              int var113 = var6[var10];
                              int var114 = var112 + var113;
                              int var115 = (var112 & 16711935) + (var113 & 16711935);
                              int var116 = (var114 - var115 & 65536) + (var115 & 16777472);
                              var6[var10++] = var114 - var116 | var116 - (var116 >>> 8);
                           } else {
                              ++var10;
                           }
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else if (arg2 == 3) {
                     for(int var117 = -var12; var117 < 0; ++var117) {
                        for(int var118 = -var13; var118 < 0; ++var118) {
                           int var119 = this.field1182[var11++];
                           int var120 = arg3 + var119;
                           int var121 = (arg3 & 16711935) + (var119 & 16711935);
                           int var122 = (var120 - var121 & 65536) + (var121 & 16777472);
                           int var123 = var120 - var122 | var122 - (var122 >>> 8);
                           int var124 = var6[var10];
                           int var125 = var123 + var124;
                           int var126 = (var123 & 16711935) + (var124 & 16711935);
                           int var127 = (var125 - var126 & 65536) + (var126 & 16777472);
                           var6[var10++] = var125 - var127 | var127 - (var127 >>> 8);
                        }

                        var10 += var14;
                        var11 += var15;
                     }
                  } else {
                     if (arg2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var128 = arg3 >>> 24;
                     int var129 = 256 - var128;
                     int var130 = (arg3 & 16711935) * var129 & -16711936;
                     int var131 = (arg3 & 65280) * var129 & 16711680;
                     int var132 = (var130 | var131) >>> 8;

                     for(int var133 = -var12; var133 < 0; ++var133) {
                        for(int var134 = -var13; var134 < 0; ++var134) {
                           int var135 = this.field1182[var11++];
                           if (var135 != 0) {
                              int var136 = (var135 & 16711935) * var128 & -16711936;
                              int var137 = (var135 & 65280) * var128 & 16711680;
                              int var138 = ((var136 | var137) >>> 8) + var132;
                              int var139 = var6[var10];
                              int var140 = var138 + var139;
                              int var141 = (var138 & 16711935) + (var139 & 16711935);
                              int var142 = (var140 - var141 & 65536) + (var141 & 16777472);
                              var6[var10++] = var140 - var142 | var142 - (var142 >>> 8);
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

   @deob.ObfuscatedName("agl.f(IILta;II)V")
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
                     int var32 = this.field1182[var9++];
                     if (var32 != 0) {
                        var6[var15++] = var32;
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

   @deob.ObfuscatedName("agl.av(IIIIIIII)V")
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
                        var9[var19++] = this.field1182[(var10 >> 16) + var26];
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
                        int var35 = this.field1182[(var10 >> 16) + var33];
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
                        int var43 = this.field1182[(var10 >> 16) + var41];
                        int var44 = arg5 + var43;
                        int var45 = (arg5 & 16711935) + (var43 & 16711935);
                        int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                        var9[var19++] = var44 - var46 | var46 - (var46 >>> 8);
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

                  int var47 = arg5 >>> 24;
                  int var48 = 256 - var47;
                  int var49 = (arg5 & 16711935) * var48 & -16711936;
                  int var50 = (arg5 & 65280) * var48 & 16711680;
                  int var51 = (var49 | var50) >>> 8;
                  int var52 = var10;

                  for(int var53 = -arg3; var53 < 0; ++var53) {
                     int var54 = (var11 >> 16) * this.field10465;

                     for(int var55 = -arg2; var55 < 0; ++var55) {
                        int var56 = this.field1182[(var10 >> 16) + var54];
                        int var57 = (var56 & 16711935) * var47 & -16711936;
                        int var58 = (var56 & 65280) * var47 & 16711680;
                        var9[var19++] = ((var57 | var58) >>> 8) + var51;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var52;
                     var19 += var20;
                  }
               }
            } else if (arg6 == 1) {
               if (arg4 == 1) {
                  int var59 = var10;

                  for(int var60 = -arg3; var60 < 0; ++var60) {
                     int var61 = (var11 >> 16) * this.field10465;

                     for(int var62 = -arg2; var62 < 0; ++var62) {
                        int var63 = this.field1182[(var10 >> 16) + var61];
                        if (var63 != 0) {
                           var9[var19++] = var63;
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var59;
                     var19 += var20;
                  }
               } else if (arg4 == 0) {
                  int var64 = var10;
                  if ((arg5 & 16777215) == 16777215) {
                     int var65 = arg5 >>> 24;
                     int var66 = 256 - var65;

                     for(int var67 = -arg3; var67 < 0; ++var67) {
                        int var68 = (var11 >> 16) * this.field10465;

                        for(int var69 = -arg2; var69 < 0; ++var69) {
                           int var70 = this.field1182[(var10 >> 16) + var68];
                           if (var70 != 0) {
                              int var71 = var9[var19];
                              var9[var19++] = ((var70 & 16711935) * var65 + (var71 & 16711935) * var66 & -16711936) + ((var70 & 65280) * var65 + (var71 & 65280) * var66 & 16711680) >> 8;
                           } else {
                              ++var19;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var64;
                        var19 += var20;
                     }
                  } else {
                     int var72 = (arg5 & 16711680) >> 16;
                     int var73 = (arg5 & 65280) >> 8;
                     int var74 = arg5 & 255;
                     int var75 = arg5 >>> 24;
                     int var76 = 256 - var75;

                     for(int var77 = -arg3; var77 < 0; ++var77) {
                        int var78 = (var11 >> 16) * this.field10465;

                        for(int var79 = -arg2; var79 < 0; ++var79) {
                           int var80 = this.field1182[(var10 >> 16) + var78];
                           if (var80 != 0) {
                              if (var75 != 255) {
                                 int var81 = (var80 & 16711680) * var72 & -16777216;
                                 int var82 = (var80 & 65280) * var73 & 16711680;
                                 int var83 = (var80 & 255) * var74 & 65280;
                                 int var84 = (var81 | var82 | var83) >>> 8;
                                 int var85 = var9[var19];
                                 var9[var19++] = ((var84 & 16711935) * var75 + (var85 & 16711935) * var76 & -16711936) + ((var84 & 65280) * var75 + (var85 & 65280) * var76 & 16711680) >> 8;
                              } else {
                                 int var86 = (var80 & 16711680) * var72 & -16777216;
                                 int var87 = (var80 & 65280) * var73 & 16711680;
                                 int var88 = (var80 & 255) * var74 & 65280;
                                 var9[var19++] = (var86 | var87 | var88) >>> 8;
                              }
                           } else {
                              ++var19;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var64;
                        var19 += var20;
                     }
                  }
               } else if (arg4 == 3) {
                  int var89 = var10;
                  int var90 = arg5 >>> 24;
                  int var91 = 256 - var90;

                  for(int var92 = -arg3; var92 < 0; ++var92) {
                     int var93 = (var11 >> 16) * this.field10465;

                     for(int var94 = -arg2; var94 < 0; ++var94) {
                        int var95 = this.field1182[(var10 >> 16) + var93];
                        int var96 = arg5 + var95;
                        int var97 = (arg5 & 16711935) + (var95 & 16711935);
                        int var98 = (var96 - var97 & 65536) + (var97 & 16777472);
                        int var99 = var96 - var98 | var98 - (var98 >>> 8);
                        if (var95 == 0 && var90 != 255) {
                           int var101 = var9[var19];
                           var99 = ((var99 & 16711935) * var90 + (var101 & 16711935) * var91 & -16711936) + ((var99 & 65280) * var90 + (var101 & 65280) * var91 & 16711680) >> 8;
                        }

                        var9[var19++] = var99;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var89;
                     var19 += var20;
                  }
               } else {
                  if (arg4 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var102 = arg5 >>> 24;
                  int var103 = 256 - var102;
                  int var104 = (arg5 & 16711935) * var103 & -16711936;
                  int var105 = (arg5 & 65280) * var103 & 16711680;
                  int var106 = (var104 | var105) >>> 8;
                  int var107 = var10;

                  for(int var108 = -arg3; var108 < 0; ++var108) {
                     int var109 = (var11 >> 16) * this.field10465;

                     for(int var110 = -arg2; var110 < 0; ++var110) {
                        int var111 = this.field1182[(var10 >> 16) + var109];
                        if (var111 != 0) {
                           int var112 = (var111 & 16711935) * var102 & -16711936;
                           int var113 = (var111 & 65280) * var102 & 16711680;
                           var9[var19++] = ((var112 | var113) >>> 8) + var106;
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var107;
                     var19 += var20;
                  }
               }
            } else {
               if (arg6 != 2) {
                  throw new IllegalArgumentException();
               }

               if (arg4 == 1) {
                  int var114 = var10;

                  for(int var115 = -arg3; var115 < 0; ++var115) {
                     int var116 = (var11 >> 16) * this.field10465;

                     for(int var117 = -arg2; var117 < 0; ++var117) {
                        int var118 = this.field1182[(var10 >> 16) + var116];
                        if (var118 != 0) {
                           int var119 = var9[var19];
                           int var120 = var118 + var119;
                           int var121 = (var118 & 16711935) + (var119 & 16711935);
                           int var122 = (var120 - var121 & 65536) + (var121 & 16777472);
                           var9[var19++] = var120 - var122 | var122 - (var122 >>> 8);
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var114;
                     var19 += var20;
                  }
               } else if (arg4 == 0) {
                  int var123 = var10;
                  int var124 = (arg5 & 16711680) >> 16;
                  int var125 = (arg5 & 65280) >> 8;
                  int var126 = arg5 & 255;

                  for(int var127 = -arg3; var127 < 0; ++var127) {
                     int var128 = (var11 >> 16) * this.field10465;

                     for(int var129 = -arg2; var129 < 0; ++var129) {
                        int var130 = this.field1182[(var10 >> 16) + var128];
                        if (var130 != 0) {
                           int var131 = (var130 & 16711680) * var124 & -16777216;
                           int var132 = (var130 & 65280) * var125 & 16711680;
                           int var133 = (var130 & 255) * var126 & 65280;
                           int var134 = (var131 | var132 | var133) >>> 8;
                           int var135 = var9[var19];
                           int var136 = var134 + var135;
                           int var137 = (var134 & 16711935) + (var135 & 16711935);
                           int var138 = (var136 - var137 & 65536) + (var137 & 16777472);
                           var9[var19++] = var136 - var138 | var138 - (var138 >>> 8);
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var123;
                     var19 += var20;
                  }
               } else if (arg4 == 3) {
                  int var139 = var10;

                  for(int var140 = -arg3; var140 < 0; ++var140) {
                     int var141 = (var11 >> 16) * this.field10465;

                     for(int var142 = -arg2; var142 < 0; ++var142) {
                        int var143 = this.field1182[(var10 >> 16) + var141];
                        int var144 = arg5 + var143;
                        int var145 = (arg5 & 16711935) + (var143 & 16711935);
                        int var146 = (var144 - var145 & 65536) + (var145 & 16777472);
                        int var147 = var144 - var146 | var146 - (var146 >>> 8);
                        int var148 = var9[var19];
                        int var149 = var147 + var148;
                        int var150 = (var147 & 16711935) + (var148 & 16711935);
                        int var151 = (var149 - var150 & 65536) + (var150 & 16777472);
                        var9[var19++] = var149 - var151 | var151 - (var151 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var139;
                     var19 += var20;
                  }
               } else {
                  if (arg4 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var152 = arg5 >>> 24;
                  int var153 = 256 - var152;
                  int var154 = (arg5 & 16711935) * var153 & -16711936;
                  int var155 = (arg5 & 65280) * var153 & 16711680;
                  int var156 = (var154 | var155) >>> 8;
                  int var157 = var10;

                  for(int var158 = -arg3; var158 < 0; ++var158) {
                     int var159 = (var11 >> 16) * this.field10465;

                     for(int var160 = -arg2; var160 < 0; ++var160) {
                        int var161 = this.field1182[(var10 >> 16) + var159];
                        if (var161 != 0) {
                           int var162 = (var161 & 16711935) * var152 & -16711936;
                           int var163 = (var161 & 65280) * var152 & 16711680;
                           int var164 = ((var162 | var163) >>> 8) + var156;
                           int var165 = var9[var19];
                           int var166 = var164 + var165;
                           int var167 = (var164 & 16711935) + (var165 & 16711935);
                           int var168 = (var166 - var167 & 65536) + (var167 & 16777472);
                           var9[var19++] = var166 - var168 | var168 - (var168 >>> 8);
                        } else {
                           ++var19;
                        }

                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var157;
                     var19 += var20;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("agl.n(ZZZIIFIIIIIIZ)V")
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
                              var28[var22] = this.field1182[(var14 >> 16) + var31];
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
                              int var40 = this.field1182[(var14 >> 16) + var38];
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
                              int var48 = this.field1182[(var14 >> 16) + var46];
                              int var49 = arg9 + var48;
                              int var50 = (arg9 & 16711935) + (var48 & 16711935);
                              int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                              var28[var22] = var49 - var51 | var51 - (var51 >>> 8);
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

                  int var52 = arg9 >>> 24;
                  int var53 = 256 - var52;
                  int var54 = (arg9 & 16711935) * var53 & -16711936;
                  int var55 = (arg9 & 65280) * var53 & 16711680;
                  int var56 = (var54 | var55) >>> 8;
                  int var57 = var14;

                  for(int var58 = -arg7; var58 < 0; ++var58) {
                     int var59 = (var15 >> 16) * this.field10465;

                     for(int var60 = -arg6; var60 < 0; ++var60) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              int var61 = this.field1182[(var14 >> 16) + var59];
                              int var62 = (var61 & 16711935) * var52 & -16711936;
                              int var63 = (var61 & 65280) * var52 & 16711680;
                              var28[var22] = ((var62 | var63) >>> 8) + var56;
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var57;
                     var22 += var23;
                  }
               }
            } else if (arg10 == 1) {
               if (arg8 == 1) {
                  int var64 = var14;

                  for(int var65 = -arg7; var65 < 0; ++var65) {
                     int var66 = (var15 >> 16) * this.field10465;

                     for(int var67 = -arg6; var67 < 0; ++var67) {
                        if (!arg1 || arg5 < var27[var22]) {
                           int var68 = this.field1182[(var14 >> 16) + var66];
                           if (var68 != 0) {
                              if (arg0) {
                                 var28[var22] = var68;
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
                     var14 = var64;
                     var22 += var23;
                  }
               } else if (arg8 == 0) {
                  int var69 = var14;
                  if ((arg9 & 16777215) == 16777215) {
                     int var70 = arg9 >>> 24;
                     int var71 = 256 - var70;

                     for(int var72 = -arg7; var72 < 0; ++var72) {
                        int var73 = (var15 >> 16) * this.field10465;

                        for(int var74 = -arg6; var74 < 0; ++var74) {
                           if (!arg1 || arg5 < var27[var22]) {
                              int var75 = this.field1182[(var14 >> 16) + var73];
                              if (var75 != 0) {
                                 if (arg0) {
                                    int var76 = var28[var22];
                                    var28[var22] = ((var75 & 16711935) * var70 + (var76 & 16711935) * var71 & -16711936) + ((var75 & 65280) * var70 + (var76 & 65280) * var71 & 16711680) >> 8;
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
                        var14 = var69;
                        var22 += var23;
                     }
                  } else {
                     int var77 = (arg9 & 16711680) >> 16;
                     int var78 = (arg9 & 65280) >> 8;
                     int var79 = arg9 & 255;
                     int var80 = arg9 >>> 24;
                     int var81 = 256 - var80;

                     for(int var82 = -arg7; var82 < 0; ++var82) {
                        int var83 = (var15 >> 16) * this.field10465;

                        for(int var84 = -arg6; var84 < 0; ++var84) {
                           if (!arg1 || arg5 < var27[var22]) {
                              int var85 = this.field1182[(var14 >> 16) + var83];
                              if (var85 != 0) {
                                 if (var80 != 255) {
                                    if (arg0) {
                                       int var86 = (var85 & 16711680) * var77 & -16777216;
                                       int var87 = (var85 & 65280) * var78 & 16711680;
                                       int var88 = (var85 & 255) * var79 & 65280;
                                       int var89 = (var86 | var87 | var88) >>> 8;
                                       int var90 = var28[var22];
                                       var28[var22] = ((var89 & 16711935) * var80 + (var90 & 16711935) * var81 & -16711936) + ((var89 & 65280) * var80 + (var90 & 65280) * var81 & 16711680) >> 8;
                                    }

                                    if (arg1 && arg12) {
                                       var27[var22] = arg5;
                                    }
                                 } else {
                                    if (arg0) {
                                       int var91 = (var85 & 16711680) * var77 & -16777216;
                                       int var92 = (var85 & 65280) * var78 & 16711680;
                                       int var93 = (var85 & 255) * var79 & 65280;
                                       var28[var22] = (var91 | var92 | var93) >>> 8;
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
                        var14 = var69;
                        var22 += var23;
                     }
                  }
               } else if (arg8 == 3) {
                  int var94 = var14;
                  int var95 = arg9 >>> 24;
                  int var96 = 256 - var95;

                  for(int var97 = -arg7; var97 < 0; ++var97) {
                     int var98 = (var15 >> 16) * this.field10465;

                     for(int var99 = -arg6; var99 < 0; ++var99) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              int var100 = this.field1182[(var14 >> 16) + var98];
                              int var101 = arg9 + var100;
                              int var102 = (arg9 & 16711935) + (var100 & 16711935);
                              int var103 = (var101 - var102 & 65536) + (var102 & 16777472);
                              int var104 = var101 - var103 | var103 - (var103 >>> 8);
                              if (var100 == 0 && var95 != 255) {
                                 int var106 = var28[var22];
                                 var104 = ((var104 & 16711935) * var95 + (var106 & 16711935) * var96 & -16711936) + ((var104 & 65280) * var95 + (var106 & 65280) * var96 & 16711680) >> 8;
                              }

                              var28[var22] = var104;
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var94;
                     var22 += var23;
                  }
               } else {
                  if (arg8 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var107 = arg9 >>> 24;
                  int var108 = 256 - var107;
                  int var109 = (arg9 & 16711935) * var108 & -16711936;
                  int var110 = (arg9 & 65280) * var108 & 16711680;
                  int var111 = (var109 | var110) >>> 8;
                  int var112 = var14;

                  for(int var113 = -arg7; var113 < 0; ++var113) {
                     int var114 = (var15 >> 16) * this.field10465;

                     for(int var115 = -arg6; var115 < 0; ++var115) {
                        if (!arg1 || arg5 < var27[var22]) {
                           int var116 = this.field1182[(var14 >> 16) + var114];
                           if (var116 != 0) {
                              if (arg0) {
                                 int var117 = (var116 & 16711935) * var107 & -16711936;
                                 int var118 = (var116 & 65280) * var107 & 16711680;
                                 var28[var22] = ((var117 | var118) >>> 8) + var111;
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
                     var14 = var112;
                     var22 += var23;
                  }
               }
            } else {
               if (arg10 != 2) {
                  throw new IllegalArgumentException();
               }

               if (arg8 == 1) {
                  int var119 = var14;

                  for(int var120 = -arg7; var120 < 0; ++var120) {
                     int var121 = (var15 >> 16) * this.field10465;

                     for(int var122 = -arg6; var122 < 0; ++var122) {
                        if (!arg1 || arg5 < var27[var22]) {
                           int var123 = this.field1182[(var14 >> 16) + var121];
                           if (var123 != 0) {
                              if (arg0) {
                                 int var124 = var28[var22];
                                 int var125 = var123 + var124;
                                 int var126 = (var123 & 16711935) + (var124 & 16711935);
                                 int var127 = (var125 - var126 & 65536) + (var126 & 16777472);
                                 var28[var22] = var125 - var127 | var127 - (var127 >>> 8);
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
                     var14 = var119;
                     var22 += var23;
                  }
               } else if (arg8 == 0) {
                  int var128 = var14;
                  int var129 = (arg9 & 16711680) >> 16;
                  int var130 = (arg9 & 65280) >> 8;
                  int var131 = arg9 & 255;

                  for(int var132 = -arg7; var132 < 0; ++var132) {
                     int var133 = (var15 >> 16) * this.field10465;

                     for(int var134 = -arg6; var134 < 0; ++var134) {
                        if (!arg1 || arg5 < var27[var22]) {
                           int var135 = this.field1182[(var14 >> 16) + var133];
                           if (var135 != 0) {
                              if (arg0) {
                                 int var136 = (var135 & 16711680) * var129 & -16777216;
                                 int var137 = (var135 & 65280) * var130 & 16711680;
                                 int var138 = (var135 & 255) * var131 & 65280;
                                 int var139 = (var136 | var137 | var138) >>> 8;
                                 int var140 = var28[var22];
                                 int var141 = var139 + var140;
                                 int var142 = (var139 & 16711935) + (var140 & 16711935);
                                 int var143 = (var141 - var142 & 65536) + (var142 & 16777472);
                                 var28[var22] = var141 - var143 | var143 - (var143 >>> 8);
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
                     var14 = var128;
                     var22 += var23;
                  }
               } else if (arg8 == 3) {
                  int var144 = var14;

                  for(int var145 = -arg7; var145 < 0; ++var145) {
                     int var146 = (var15 >> 16) * this.field10465;

                     for(int var147 = -arg6; var147 < 0; ++var147) {
                        if (!arg1 || arg5 < var27[var22]) {
                           if (arg0) {
                              int var148 = this.field1182[(var14 >> 16) + var146];
                              int var149 = arg9 + var148;
                              int var150 = (arg9 & 16711935) + (var148 & 16711935);
                              int var151 = (var149 - var150 & 65536) + (var150 & 16777472);
                              int var152 = var149 - var151 | var151 - (var151 >>> 8);
                              int var153 = var28[var22];
                              int var154 = var152 + var153;
                              int var155 = (var152 & 16711935) + (var153 & 16711935);
                              int var156 = (var154 - var155 & 65536) + (var155 & 16777472);
                              var28[var22] = var154 - var156 | var156 - (var156 >>> 8);
                           }

                           if (arg1 && arg12) {
                              var27[var22] = arg5;
                           }
                        }

                        var14 += var18;
                        ++var22;
                     }

                     var15 += var19;
                     var14 = var144;
                     var22 += var23;
                  }
               } else {
                  if (arg8 != 2) {
                     throw new IllegalArgumentException();
                  }

                  int var157 = arg9 >>> 24;
                  int var158 = 256 - var157;
                  int var159 = (arg9 & 16711935) * var158 & -16711936;
                  int var160 = (arg9 & 65280) * var158 & 16711680;
                  int var161 = (var159 | var160) >>> 8;
                  int var162 = var14;

                  for(int var163 = -arg7; var163 < 0; ++var163) {
                     int var164 = (var15 >> 16) * this.field10465;

                     for(int var165 = -arg6; var165 < 0; ++var165) {
                        if (!arg1 || arg5 < var27[var22]) {
                           int var166 = this.field1182[(var14 >> 16) + var164];
                           if (var166 != 0) {
                              if (arg0) {
                                 int var167 = (var166 & 16711935) * var157 & -16711936;
                                 int var168 = (var166 & 65280) * var157 & 16711680;
                                 int var169 = ((var167 | var168) >>> 8) + var161;
                                 int var170 = var28[var22];
                                 int var171 = var169 + var170;
                                 int var172 = (var169 & 16711935) + (var170 & 16711935);
                                 int var173 = (var171 - var172 & 65536) + (var172 & 16777472);
                                 var28[var22] = var171 - var173 | var173 - (var173 >>> 8);
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
                     var14 = var162;
                     var22 += var23;
                  }
               }
            }

         }
      }
   }

   @deob.ObfuscatedName("agl.d(II)V")
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
                        this.method2398((var6 >> 12) + (var7 >> 12) * this.field10465, var5++, var3, arg0, arg1);
                        ++var8;
                     }
                  }

                  ++var4;
                  Statics.field10466 += Statics.field10456;
               }
            } else if (Statics.field10468 < 0) {
               int var9 = Statics.field10464;

               while(var9 < 0) {
                  int var10 = Statics.field10466;
                  int var11 = Statics.field10473;
                  int var12 = Statics.field10479 + Statics.field10455;
                  int var13 = Statics.field10462;
                  if (var11 >= 0 && var11 - (this.field10465 << 12) < 0) {
                     int var14;
                     if ((var14 = var12 - (this.field10452 << 12)) >= 0) {
                        int var15 = (Statics.field10468 - var14) / Statics.field10468;
                        var13 += var15;
                        var12 += Statics.field10468 * var15;
                        var10 += var15;
                     }

                     int var16;
                     if ((var16 = (var12 - Statics.field10468) / Statics.field10468) > var13) {
                        var13 = var16;
                     }

                     while(var13 < 0) {
                        this.method2398((var11 >> 12) + (var12 >> 12) * this.field10465, var10++, var3, arg0, arg1);
                        var12 += Statics.field10468;
                        ++var13;
                     }
                  }

                  ++var9;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10466 += Statics.field10456;
               }
            } else {
               int var17 = Statics.field10464;

               while(var17 < 0) {
                  int var18 = Statics.field10466;
                  int var19 = Statics.field10473;
                  int var20 = Statics.field10479 + Statics.field10455;
                  int var21 = Statics.field10462;
                  if (var19 >= 0 && var19 - (this.field10465 << 12) < 0) {
                     if (var20 < 0) {
                        int var22 = (Statics.field10468 - 1 - var20) / Statics.field10468;
                        var21 += var22;
                        var20 += Statics.field10468 * var22;
                        var18 += var22;
                     }

                     int var23;
                     if ((var23 = (var20 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var21) {
                        var21 = var23;
                     }

                     while(var21 < 0) {
                        this.method2398((var19 >> 12) + (var20 >> 12) * this.field10465, var18++, var3, arg0, arg1);
                        var20 += Statics.field10468;
                        ++var21;
                     }
                  }

                  ++var17;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10466 += Statics.field10456;
               }
            }
         } else if (Statics.field10467 < 0) {
            if (Statics.field10468 == 0) {
               int var24 = Statics.field10464;

               while(var24 < 0) {
                  int var25 = Statics.field10466;
                  int var26 = Statics.field10484 + Statics.field10473;
                  int var27 = Statics.field10479;
                  int var28 = Statics.field10462;
                  if (var27 >= 0 && var27 - (this.field10452 << 12) < 0) {
                     int var29;
                     if ((var29 = var26 - (this.field10465 << 12)) >= 0) {
                        int var30 = (Statics.field10467 - var29) / Statics.field10467;
                        var28 += var30;
                        var26 += Statics.field10467 * var30;
                        var25 += var30;
                     }

                     int var31;
                     if ((var31 = (var26 - Statics.field10467) / Statics.field10467) > var28) {
                        var28 = var31;
                     }

                     while(var28 < 0) {
                        this.method2398((var26 >> 12) + (var27 >> 12) * this.field10465, var25++, var3, arg0, arg1);
                        var26 += Statics.field10467;
                        ++var28;
                     }
                  }

                  ++var24;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            } else if (Statics.field10468 < 0) {
               int var32 = Statics.field10464;

               while(var32 < 0) {
                  int var33 = Statics.field10466;
                  int var34 = Statics.field10484 + Statics.field10473;
                  int var35 = Statics.field10479 + Statics.field10455;
                  int var36 = Statics.field10462;
                  int var37;
                  if ((var37 = var34 - (this.field10465 << 12)) >= 0) {
                     int var38 = (Statics.field10467 - var37) / Statics.field10467;
                     var36 += var38;
                     var34 += Statics.field10467 * var38;
                     var35 += Statics.field10468 * var38;
                     var33 += var38;
                  }

                  int var39;
                  if ((var39 = (var34 - Statics.field10467) / Statics.field10467) > var36) {
                     var36 = var39;
                  }

                  int var40;
                  if ((var40 = var35 - (this.field10452 << 12)) >= 0) {
                     int var41 = (Statics.field10468 - var40) / Statics.field10468;
                     var36 += var41;
                     var34 += Statics.field10467 * var41;
                     var35 += Statics.field10468 * var41;
                     var33 += var41;
                  }

                  int var42;
                  if ((var42 = (var35 - Statics.field10468) / Statics.field10468) > var36) {
                     var36 = var42;
                  }

                  while(var36 < 0) {
                     this.method2398((var34 >> 12) + (var35 >> 12) * this.field10465, var33++, var3, arg0, arg1);
                     var34 += Statics.field10467;
                     var35 += Statics.field10468;
                     ++var36;
                  }

                  ++var32;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            } else {
               int var43 = Statics.field10464;

               while(var43 < 0) {
                  int var44 = Statics.field10466;
                  int var45 = Statics.field10484 + Statics.field10473;
                  int var46 = Statics.field10479 + Statics.field10455;
                  int var47 = Statics.field10462;
                  int var48;
                  if ((var48 = var45 - (this.field10465 << 12)) >= 0) {
                     int var49 = (Statics.field10467 - var48) / Statics.field10467;
                     var47 += var49;
                     var45 += Statics.field10467 * var49;
                     var46 += Statics.field10468 * var49;
                     var44 += var49;
                  }

                  int var50;
                  if ((var50 = (var45 - Statics.field10467) / Statics.field10467) > var47) {
                     var47 = var50;
                  }

                  if (var46 < 0) {
                     int var51 = (Statics.field10468 - 1 - var46) / Statics.field10468;
                     var47 += var51;
                     var45 += Statics.field10467 * var51;
                     var46 += Statics.field10468 * var51;
                     var44 += var51;
                  }

                  int var52;
                  if ((var52 = (var46 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var47) {
                     var47 = var52;
                  }

                  while(var47 < 0) {
                     this.method2398((var45 >> 12) + (var46 >> 12) * this.field10465, var44++, var3, arg0, arg1);
                     var45 += Statics.field10467;
                     var46 += Statics.field10468;
                     ++var47;
                  }

                  ++var43;
                  Statics.field10473 += Statics.field10451;
                  Statics.field10479 += Statics.field10470;
                  Statics.field10466 += Statics.field10456;
               }
            }
         } else if (Statics.field10468 == 0) {
            int var53 = Statics.field10464;

            while(var53 < 0) {
               int var54 = Statics.field10466;
               int var55 = Statics.field10484 + Statics.field10473;
               int var56 = Statics.field10479;
               int var57 = Statics.field10462;
               if (var56 >= 0 && var56 - (this.field10452 << 12) < 0) {
                  if (var55 < 0) {
                     int var58 = (Statics.field10467 - 1 - var55) / Statics.field10467;
                     var57 += var58;
                     var55 += Statics.field10467 * var58;
                     var54 += var58;
                  }

                  int var59;
                  if ((var59 = (var55 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var57) {
                     var57 = var59;
                  }

                  while(var57 < 0) {
                     this.method2398((var55 >> 12) + (var56 >> 12) * this.field10465, var54++, var3, arg0, arg1);
                     var55 += Statics.field10467;
                     ++var57;
                  }
               }

               ++var53;
               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         } else if (Statics.field10468 < 0) {
            for(int var60 = Statics.field10464; var60 < 0; ++var60) {
               int var61 = Statics.field10466;
               int var62 = Statics.field10484 + Statics.field10473;
               int var63 = Statics.field10479 + Statics.field10455;
               int var64 = Statics.field10462;
               if (var62 < 0) {
                  int var65 = (Statics.field10467 - 1 - var62) / Statics.field10467;
                  var64 += var65;
                  var62 += Statics.field10467 * var65;
                  var63 += Statics.field10468 * var65;
                  var61 += var65;
               }

               int var66;
               if ((var66 = (var62 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var64) {
                  var64 = var66;
               }

               int var67;
               if ((var67 = var63 - (this.field10452 << 12)) >= 0) {
                  int var68 = (Statics.field10468 - var67) / Statics.field10468;
                  var64 += var68;
                  var62 += Statics.field10467 * var68;
                  var63 += Statics.field10468 * var68;
                  var61 += var68;
               }

               int var69;
               if ((var69 = (var63 - Statics.field10468) / Statics.field10468) > var64) {
                  var64 = var69;
               }

               while(var64 < 0) {
                  this.method2398((var62 >> 12) + (var63 >> 12) * this.field10465, var61++, var3, arg0, arg1);
                  var62 += Statics.field10467;
                  var63 += Statics.field10468;
                  ++var64;
               }

               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         } else {
            for(int var70 = Statics.field10464; var70 < 0; ++var70) {
               int var71 = Statics.field10466;
               int var72 = Statics.field10484 + Statics.field10473;
               int var73 = Statics.field10479 + Statics.field10455;
               int var74 = Statics.field10462;
               if (var72 < 0) {
                  int var75 = (Statics.field10467 - 1 - var72) / Statics.field10467;
                  var74 += var75;
                  var72 += Statics.field10467 * var75;
                  var73 += Statics.field10468 * var75;
                  var71 += var75;
               }

               int var76;
               if ((var76 = (var72 + 1 - (this.field10465 << 12) - Statics.field10467) / Statics.field10467) > var74) {
                  var74 = var76;
               }

               if (var73 < 0) {
                  int var77 = (Statics.field10468 - 1 - var73) / Statics.field10468;
                  var74 += var77;
                  var72 += Statics.field10467 * var77;
                  var73 += Statics.field10468 * var77;
                  var71 += var77;
               }

               int var78;
               if ((var78 = (var73 + 1 - (this.field10452 << 12) - Statics.field10468) / Statics.field10468) > var74) {
                  var74 = var78;
               }

               while(var74 < 0) {
                  this.method2398((var72 >> 12) + (var73 >> 12) * this.field10465, var71++, var3, arg0, arg1);
                  var72 += Statics.field10467;
                  var73 += Statics.field10468;
                  ++var74;
               }

               Statics.field10473 += Statics.field10451;
               Statics.field10479 += Statics.field10470;
               Statics.field10466 += Statics.field10456;
            }
         }

      }
   }

   @deob.ObfuscatedName("agl.b([I[III)V")
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
                           int var15 = this.field1182[(var9 >> 12) + (var10 >> 12) * this.field10465];
                           if (var15 != 0) {
                              var5[var8++] = var15;
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
                           int var28 = this.field1182[(var19 >> 12) + (var20 >> 12) * this.field10465];
                           if (var28 != 0) {
                              var5[var18++] = var28;
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
                           int var40 = this.field1182[(var32 >> 12) + (var33 >> 12) * this.field10465];
                           if (var40 != 0) {
                              var5[var31++] = var40;
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
                           int var53 = this.field1182[(var44 >> 12) + (var45 >> 12) * this.field10465];
                           if (var53 != 0) {
                              var5[var43++] = var53;
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
                        int var69 = this.field1182[(var57 >> 12) + (var58 >> 12) * this.field10465];
                        if (var69 != 0) {
                           var5[var56++] = var69;
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
                        int var84 = this.field1182[(var73 >> 12) + (var74 >> 12) * this.field10465];
                        if (var84 != 0) {
                           var5[var72++] = var84;
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
                        int var96 = this.field1182[(var88 >> 12) + (var89 >> 12) * this.field10465];
                        if (var96 != 0) {
                           var5[var87++] = var96;
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
                     int var111 = this.field1182[(var100 >> 12) + (var101 >> 12) * this.field10465];
                     if (var111 != 0) {
                        var5[var99++] = var111;
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
                     int var125 = this.field1182[(var115 >> 12) + (var116 >> 12) * this.field10465];
                     if (var125 != 0) {
                        var5[var114++] = var125;
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

   @deob.ObfuscatedName("agl.z(II[III)V")
   private void method2398(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
      int var10001;
      if (arg4 == 0) {
         if (arg3 == 1) {
            arg2[arg1] = this.field1182[arg0];
         } else {
            int var74;
            if (arg3 == 0) {
               var10001 = arg0;
               var74 = arg0 + 1;
               int var6 = this.field1182[var10001];
               int var7 = (var6 & 16711680) * field10480 & -16777216;
               int var8 = (var6 & 65280) * field10481 & 16711680;
               int var9 = (var6 & 255) * field10482 & 65280;
               arg2[arg1] = (var7 | var8 | var9) >>> 8;
            } else if (arg3 == 3) {
               var10001 = arg0;
               var74 = arg0 + 1;
               int var10 = this.field1182[var10001];
               int var11 = Statics.field10477;
               int var12 = var10 + var11;
               int var13 = (var10 & 16711935) + (var11 & 16711935);
               int var14 = (var12 - var13 & 65536) + (var13 & 16777472);
               arg2[arg1] = var12 - var14 | var14 - (var14 >>> 8);
            } else {
               if (arg3 != 2) {
                  throw new IllegalArgumentException();
               }

               int var15 = this.field1182[arg0];
               int var16 = (var15 & 16711935) * field10478 & -16711936;
               int var17 = (var15 & 65280) * field10478 & 16711680;
               arg2[arg1] = ((var16 | var17) >>> 8) + field10485;
            }
         }
      } else if (arg4 == 1) {
         if (arg3 == 1) {
            int var18 = this.field1182[arg0];
            if (var18 != 0) {
               arg2[arg1] = var18;
            }
         } else if (arg3 == 0) {
            int var19 = this.field1182[arg0];
            if (var19 != 0) {
               if ((Statics.field10477 & 16777215) == 16777215) {
                  int var20 = Statics.field10477 >>> 24;
                  int var21 = 256 - var20;
                  int var22 = arg2[arg1];
                  arg2[arg1] = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + ((var19 & 65280) * var20 + (var22 & 65280) * var21 & 16711680) >> 8;
               } else if (field10478 != 255) {
                  int var23 = (var19 & 16711680) * field10480 & -16777216;
                  int var24 = (var19 & 65280) * field10481 & 16711680;
                  int var25 = (var19 & 255) * field10482 & 65280;
                  int var26 = (var23 | var24 | var25) >>> 8;
                  int var27 = arg2[arg1];
                  arg2[arg1] = ((var26 & 16711935) * field10478 + (var27 & 16711935) * field10475 & -16711936) + ((var26 & 65280) * field10478 + (var27 & 65280) * field10475 & 16711680) >> 8;
               } else {
                  int var28 = (var19 & 16711680) * field10480 & -16777216;
                  int var29 = (var19 & 65280) * field10481 & 16711680;
                  int var30 = (var19 & 255) * field10482 & 65280;
                  arg2[arg1] = (var28 | var29 | var30) >>> 8;
               }
            }
         } else if (arg3 == 3) {
            int var31 = this.field1182[arg0];
            int var32 = Statics.field10477;
            int var33 = var31 + var32;
            int var34 = (var31 & 16711935) + (var32 & 16711935);
            int var35 = (var33 - var34 & 65536) + (var34 & 16777472);
            int var36 = var33 - var35 | var35 - (var35 >>> 8);
            if (var31 == 0 && field10478 != 255) {
               int var38 = arg2[arg1];
               var36 = ((var36 & 16711935) * field10478 + (var38 & 16711935) * field10475 & -16711936) + ((var36 & 65280) * field10478 + (var38 & 65280) * field10475 & 16711680) >> 8;
            }

            arg2[arg1] = var36;
         } else {
            if (arg3 != 2) {
               throw new IllegalArgumentException();
            }

            int var39 = this.field1182[arg0];
            if (var39 != 0) {
               int var40 = (var39 & 16711935) * field10478 & -16711936;
               int var41 = (var39 & 65280) * field10478 & 16711680;
               var10001 = arg1;
               int var75 = arg1 + 1;
               arg2[var10001] = ((var40 | var41) >>> 8) + field10485;
            }
         }
      } else {
         if (arg4 != 2) {
            throw new IllegalArgumentException();
         }

         if (arg3 == 1) {
            int var42 = this.field1182[arg0];
            if (var42 != 0) {
               int var43 = arg2[arg1];
               int var44 = var42 + var43;
               int var45 = (var42 & 16711935) + (var43 & 16711935);
               int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
               arg2[arg1] = var44 - var46 | var46 - (var46 >>> 8);
            }
         } else if (arg3 == 0) {
            int var47 = this.field1182[arg0];
            if (var47 != 0) {
               int var48 = (var47 & 16711680) * field10480 & -16777216;
               int var49 = (var47 & 65280) * field10481 & 16711680;
               int var50 = (var47 & 255) * field10482 & 65280;
               int var51 = (var48 | var49 | var50) >>> 8;
               int var52 = arg2[arg1];
               int var53 = var51 + var52;
               int var54 = (var51 & 16711935) + (var52 & 16711935);
               int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
               arg2[arg1] = var53 - var55 | var55 - (var55 >>> 8);
            }
         } else if (arg3 == 3) {
            int var56 = this.field1182[arg0];
            int var57 = Statics.field10477;
            int var58 = var56 + var57;
            int var59 = (var56 & 16711935) + (var57 & 16711935);
            int var60 = (var58 - var59 & 65536) + (var59 & 16777472);
            int var61 = var58 - var60 | var60 - (var60 >>> 8);
            int var62 = arg2[arg1];
            int var63 = var61 + var62;
            int var64 = (var61 & 16711935) + (var62 & 16711935);
            int var65 = (var63 - var64 & 65536) + (var64 & 16777472);
            arg2[arg1] = var63 - var65 | var65 - (var65 >>> 8);
         } else if (arg3 == 2) {
            int var66 = this.field1182[arg0];
            if (var66 != 0) {
               int var67 = (var66 & 16711935) * field10478 & -16711936;
               int var68 = (var66 & 65280) * field10478 & 16711680;
               int var69 = ((var67 | var68) >>> 8) + field10485;
               int var70 = arg2[arg1];
               int var71 = var69 + var70;
               int var72 = (var69 & 16711935) + (var70 & 16711935);
               int var73 = (var71 - var72 & 65536) + (var72 & 16777472);
               arg2[arg1] = var71 - var73 | var73 - (var73 >>> 8);
            }
         }
      }

   }
}
