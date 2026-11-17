import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;

@deob.ObfuscatedName("aeb")
public class class112 extends class674 {
   @deob.ObfuscatedName("aeb.aj")
   private int[] field871 = new int[3];
   @deob.ObfuscatedName("aeb.x")
   private int field850;
   @deob.ObfuscatedName("aeb.s")
   private boolean field851;
   @deob.ObfuscatedName("aeb.y")
   private int field865;
   @deob.ObfuscatedName("aeb.av")
   private int field870;
   @deob.ObfuscatedName("aeb.ax")
   public int field876;
   @deob.ObfuscatedName("aeb.af")
   private int field881;
   @deob.ObfuscatedName("aeb.at")
   public int field891;
   @deob.ObfuscatedName("aeb.ah")
   private boolean field888;
   @deob.ObfuscatedName("aeb.aw")
   private int field857;
   @deob.ObfuscatedName("aeb.an")
   private int field877;
   @deob.ObfuscatedName("aeb.as")
   private int field887;
   @deob.ObfuscatedName("aeb.aa")
   private int field880;
   @deob.ObfuscatedName("aeb.ak")
   public int field845;
   @deob.ObfuscatedName("aeb.ad")
   private String field847;
   @deob.ObfuscatedName("aeb.ac")
   private int field867;
   @deob.ObfuscatedName("aeb.au")
   private int field862;
   @deob.ObfuscatedName("aeb.am")
   private String field890;
   @deob.ObfuscatedName("aeb.ao")
   private String field873;
   @deob.ObfuscatedName("aeb.ar")
   private int field886;
   @deob.ObfuscatedName("aeb.aq")
   private int field885;
   @deob.ObfuscatedName("aeb.ae")
   private String field883;
   @deob.ObfuscatedName("aeb.ab")
   private String field882;
   @deob.ObfuscatedName("aeb.az")
   private String field849;

   public class112(boolean arg0) {
      if (arg0) {
         if (Statics.field6120.startsWith("win")) {
            this.field850 = 1;
         } else if (Statics.field6120.startsWith("mac")) {
            this.field850 = 2;
         } else if (Statics.field6120.startsWith("linux")) {
            this.field850 = 3;
         } else {
            this.field850 = 4;
         }

         if (!Statics.field4156.startsWith("amd64") && !Statics.field4156.startsWith("x86_64")) {
            this.field851 = false;
         } else {
            this.field851 = true;
         }

         if (this.field850 == 1) {
            if (Statics.field5999.indexOf("4.0") != -1) {
               this.field865 = 1;
            } else if (Statics.field5999.indexOf("4.1") != -1) {
               this.field865 = 2;
            } else if (Statics.field5999.indexOf("4.9") != -1) {
               this.field865 = 3;
            } else if (Statics.field5999.indexOf("5.0") != -1) {
               this.field865 = 4;
            } else if (Statics.field5999.indexOf("5.1") != -1) {
               this.field865 = 5;
            } else if (Statics.field5999.indexOf("5.2") != -1) {
               this.field865 = 8;
            } else if (Statics.field5999.indexOf("6.0") != -1) {
               this.field865 = 6;
            } else if (Statics.field5999.indexOf("6.1") != -1) {
               this.field865 = 7;
            } else if (Statics.field5999.indexOf("6.2") != -1) {
               this.field865 = 9;
            }
         } else if (this.field850 == 2) {
            if (Statics.field5999.indexOf("10.4") != -1) {
               this.field865 = 20;
            } else if (Statics.field5999.indexOf("10.5") != -1) {
               this.field865 = 21;
            } else if (Statics.field5999.indexOf("10.6") != -1) {
               this.field865 = 22;
            } else if (Statics.field5999.indexOf("10.7") != -1) {
               this.field865 = 23;
            }
         }

         if (Statics.field5425.toLowerCase().indexOf("sun") != -1) {
            this.field870 = 1;
         } else if (Statics.field5425.toLowerCase().indexOf("microsoft") != -1) {
            this.field870 = 2;
         } else if (Statics.field5425.toLowerCase().indexOf("apple") != -1) {
            this.field870 = 3;
         } else {
            this.field870 = 4;
         }

         int var2 = 2;
         int var3 = 0;

         try {
            while(var2 < Statics.field5702.length()) {
               char var4 = Statics.field5702.charAt(var2);
               if (var4 < '0' || var4 > '9') {
                  break;
               }

               var3 = var3 * 10 + (var4 - '0');
               ++var2;
            }
         } catch (Exception var48) {
         }

         this.field876 = var3;
         int var6 = Statics.field5702.indexOf(46, 2) + 1;
         int var7 = 0;

         try {
            while(var6 < Statics.field5702.length()) {
               char var8 = Statics.field5702.charAt(var6);
               if (var8 < '0' || var8 > '9') {
                  break;
               }

               var7 = var7 * 10 + (var8 - '0');
               ++var6;
            }
         } catch (Exception var47) {
         }

         this.field881 = var7;
         int var10 = Statics.field5702.indexOf(95, 4) + 1;
         int var11 = 0;

         try {
            while(var10 < Statics.field5702.length()) {
               char var12 = Statics.field5702.charAt(var10);
               if (var12 < '0' || var12 > '9') {
                  break;
               }

               var11 = var11 * 10 + (var12 - '0');
               ++var10;
            }
         } catch (Exception var46) {
         }

         this.field891 = var11;
         this.field888 = false;
         this.field857 = class671.field6130;
         if (this.field876 > 3) {
            this.field877 = class671.field6097;
         } else {
            this.field877 = 0;
         }

         try {
            int[] var14 = HardwareInfo.getCPUInfo();
            if (var14 != null && var14.length == 3) {
               this.field887 = var14[0];
               this.field880 = var14[1];
               this.field845 = var14[2];
            }

            int[] var15 = HardwareInfo.getRawCPUInfo();
            if (var15 != null && var15.length % 5 == 0) {
               HashMap var16 = new HashMap();

               for(int var17 = 0; var17 < var15.length / 5; ++var17) {
                  int var18 = var15[var17 * 5];
                  int var19 = var15[var17 * 5 + 1];
                  int var20 = var15[var17 * 5 + 2];
                  int var21 = var15[var17 * 5 + 3];
                  int var22 = var15[var17 * 5 + 4];
                  class857 var23 = new class857(var18, var19, var20, var21, var22);
                  var16.put(var18, var23);
               }

               class857 var24 = (class857)var16.get(0);
               if (var24 != null) {
                  class124 var25 = new class124(13);
                  var25.method1573(var24.field8767);
                  var25.method1573(var24.field8763);
                  var25.method1573(var24.field8765);
                  var25.field935 = 0;
                  this.field847 = var25.method1599();
               }

               class857 var26 = (class857)var16.get(1);
               if (var26 != null) {
                  this.field867 = var26.field8764;
                  int var27 = var26.field8767;
                  this.field862 = var27 >> 16 & 255;
                  this.field871[0] = var26.field8765;
                  this.field871[1] = var26.field8763;
               }

               class857 var28 = (class857)var16.get(-2147483647);
               if (var28 != null) {
                  this.field871[2] = var28.field8763;
               }

               class124 var29 = new class124(49);

               for(int var30 = -2147483646; var30 <= -2147483644; ++var30) {
                  class857 var31 = (class857)var16.get(var30);
                  if (var31 != null) {
                     var29.method1573(var31.field8764);
                     var29.method1573(var31.field8767);
                     var29.method1573(var31.field8765);
                     var29.method1573(var31.field8763);
                  }
               }

               var29.field935 = 0;
               this.field890 = var29.method1599();
            }

            String[][] var32 = HardwareInfo.getDXDiagDisplayDevicesProps();
            if (var32 != null && var32.length > 0 && var32[0] != null) {
               for(int var33 = 0; var33 < var32[0].length; var33 += 2) {
                  if (var32[0][var33].equalsIgnoreCase("szDescription")) {
                     this.field873 = var32[0][var33 + 1];
                  } else if (var32[0][var33].equalsIgnoreCase("szDriverDateEnglish")) {
                     String var34 = var32[0][var33 + 1];

                     try {
                        int var35 = var34.indexOf("/");
                        int var36 = var34.indexOf("/", var35 + 1);
                        this.field886 = Integer.parseInt(var34.substring(0, var35));
                        this.field885 = Integer.parseInt(var34.substring(var36 + 1, var34.indexOf(" ", var36)));
                     } catch (Exception var44) {
                     }
                  }
               }
            }

            String[] var38 = HardwareInfo.getDXDiagSystemProps();
            if (var38 != null) {
               String var39 = "";
               String var40 = "";
               String var41 = "";

               for(int var42 = 0; var42 < var38.length; var42 += 2) {
                  if (var38[var42].equalsIgnoreCase("dwDirectXVersionMajor")) {
                     var39 = var38[var42 + 1];
                  } else if (var38[var42].equalsIgnoreCase("dwDirectXVersionMinor")) {
                     var40 = var38[var42 + 1];
                  } else if (var38[var42].equalsIgnoreCase("dwDirectXVersionLetter")) {
                     var41 = var38[var42 + 1];
                  }
               }

               this.field883 = var39 + "." + var40 + var41;
            }
         } catch (Throwable var45) {
            this.field845 = 0;
         }
      }

      if (this.field873 == null) {
         this.field873 = "";
      }

      if (this.field882 == null) {
         this.field882 = "";
      }

      if (this.field883 == null) {
         this.field883 = "";
      }

      if (this.field849 == null) {
         this.field849 = "";
      }

      if (this.field847 == null) {
         this.field847 = "";
      }

      if (this.field890 == null) {
         this.field890 = "";
      }

      this.method1460();
   }

   @deob.ObfuscatedName("aeb.n(I)V")
   private void method1460() {
      if (this.field873.length() > 40) {
         this.field873 = this.field873.substring(0, 40);
      }

      if (this.field882.length() > 40) {
         this.field882 = this.field882.substring(0, 40);
      }

      if (this.field883.length() > 10) {
         this.field883 = this.field883.substring(0, 10);
      }

      if (this.field849.length() > 10) {
         this.field849 = this.field849.substring(0, 10);
      }

   }

   @deob.ObfuscatedName("aeb.k(Laen;I)V")
   public void method1458(class124 arg0) {
      arg0.method1568(6);
      arg0.method1568(this.field850);
      arg0.method1568(this.field851 ? 1 : 0);
      arg0.method1568(this.field865);
      arg0.method1568(this.field870);
      arg0.method1568(this.field876);
      arg0.method1568(this.field881);
      arg0.method1568(this.field891);
      arg0.method1568(this.field888 ? 1 : 0);
      arg0.method1569(this.field857);
      arg0.method1568(this.field877);
      arg0.method1571(this.field845);
      arg0.method1569(this.field880);
      arg0.method1578(this.field873);
      arg0.method1578(this.field882);
      arg0.method1578(this.field883);
      arg0.method1578(this.field849);
      arg0.method1568(this.field886);
      arg0.method1569(this.field885);
      arg0.method1578(this.field847);
      arg0.method1578(this.field890);
      arg0.method1568(this.field887);
      arg0.method1568(this.field862);

      for(int var2 = 0; var2 < this.field871.length; ++var2) {
         arg0.method1572(this.field871[var2]);
      }

      arg0.method1572(this.field867);
   }

   @deob.ObfuscatedName("aeb.d(I)I")
   public int method1466() {
      byte var1 = 38;
      int var2 = var1 + class124.method14353(this.field873);
      int var3 = var2 + class124.method14353(this.field882);
      int var4 = var3 + class124.method14353(this.field883);
      int var5 = var4 + class124.method14353(this.field849);
      int var6 = var5 + class124.method14353(this.field847);
      return var6 + class124.method14353(this.field890);
   }
}
