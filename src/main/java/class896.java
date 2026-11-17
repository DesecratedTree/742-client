import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@deob.ObfuscatedName("vq")
public class class896 {
   @deob.ObfuscatedName("vq.n")
   private static class849 field9109 = new class849();

   private class896() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("pt.n(I)V")
   public static void method10916() {
      field9109 = new class849();
   }

   @deob.ObfuscatedName("py.k(I)Z")
   public static boolean method10959() {
      class121 var0 = (class121)field9109.method14964();
      return var0 != null;
   }

   @deob.ObfuscatedName("nn.d(Lajf;I)V")
   public static void method9947(class251 arg0) {
      class121 var1 = (class121)field9109.method14964();
      if (var1 != null) {
         int var2 = arg0.field935;
         arg0.method1572(var1.field922);

         for(int var3 = 0; var3 < var1.field918; ++var3) {
            if (var1.field919[var3] != 0) {
               arg0.method1568(var1.field919[var3]);
            } else {
               try {
                  int var4 = var1.field917[var3];
                  if (var4 == 0) {
                     Field var5 = var1.field920[var3];
                     int var6 = var5.getInt((Object)null);
                     arg0.method1568(0);
                     arg0.method1572(var6);
                  } else if (var4 == 1) {
                     Field var7 = var1.field920[var3];
                     var7.setInt((Object)null, var1.field921[var3]);
                     arg0.method1568(0);
                  } else if (var4 == 2) {
                     Field var8 = var1.field920[var3];
                     int var9 = var8.getModifiers();
                     arg0.method1568(0);
                     arg0.method1572(var9);
                  }

                  if (var4 != 3) {
                     if (var4 == 4) {
                        Method var16 = var1.field916[var3];
                        int var17 = var16.getModifiers();
                        arg0.method1568(0);
                        arg0.method1572(var17);
                     }
                  } else {
                     Method var10 = var1.field916[var3];
                     byte[][] var11 = var1.field923[var3];
                     Object[] var12 = new Object[var11.length];

                     for(int var13 = 0; var13 < var11.length; ++var13) {
                        ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                        var12[var13] = var14.readObject();
                     }

                     Object var15 = var10.invoke((Object)null, var12);
                     if (var15 == null) {
                        arg0.method1568(0);
                     } else if (var15 instanceof Number) {
                        arg0.method1568(1);
                        arg0.method1575(((Number)var15).longValue());
                     } else if (var15 instanceof String) {
                        arg0.method1568(2);
                        arg0.method1577((String)var15);
                     } else {
                        arg0.method1568(4);
                     }
                  }
               } catch (ClassNotFoundException var30) {
                  arg0.method1568(-10);
               } catch (InvalidClassException var31) {
                  arg0.method1568(-11);
               } catch (StreamCorruptedException var32) {
                  arg0.method1568(-12);
               } catch (OptionalDataException var33) {
                  arg0.method1568(-13);
               } catch (IllegalAccessException var34) {
                  arg0.method1568(-14);
               } catch (IllegalArgumentException var35) {
                  arg0.method1568(-15);
               } catch (InvocationTargetException var36) {
                  arg0.method1568(-16);
               } catch (SecurityException var37) {
                  arg0.method1568(-17);
               } catch (IOException var38) {
                  arg0.method1568(-18);
               } catch (NullPointerException var39) {
                  arg0.method1568(-19);
               } catch (Exception var40) {
                  arg0.method1568(-20);
               } catch (Throwable var41) {
                  arg0.method1568(-21);
               }
            }
         }

         arg0.method1614(var2);
         var1.method9864();
      }
   }

   @deob.ObfuscatedName("ag.b(Laen;II)V")
   public static void method2289(class124 arg0, int arg1) {
      class121 var2 = new class121();
      var2.field918 = arg0.method1688();
      var2.field922 = arg0.method1591();
      var2.field917 = new int[var2.field918];
      var2.field919 = new int[var2.field918];
      var2.field920 = new Field[var2.field918];
      var2.field921 = new int[var2.field918];
      var2.field916 = new Method[var2.field918];
      var2.field923 = new byte[var2.field918][][];

      for(int var3 = 0; var3 < var2.field918; ++var3) {
         try {
            int var4 = arg0.method1688();
            if (var4 != 0 && var4 != 1 && var4 != 2) {
               if (var4 == 3 || var4 == 4) {
                  String var8 = arg0.method1599();
                  String var9 = arg0.method1599();
                  int var10 = arg0.method1688();
                  String[] var11 = new String[var10];

                  for(int var12 = 0; var12 < var10; ++var12) {
                     var11[var12] = arg0.method1599();
                  }

                  String var13 = arg0.method1599();
                  byte[][] var14 = new byte[var10][];
                  if (var4 == 3) {
                     for(int var15 = 0; var15 < var10; ++var15) {
                        int var16 = arg0.method1591();
                        var14[var15] = new byte[var16];
                        arg0.method1602(var14[var15], 0, var16);
                     }
                  }

                  var2.field917[var3] = var4;
                  Class[] var17 = new Class[var10];

                  for(int var18 = 0; var18 < var10; ++var18) {
                     var17[var18] = method6510(var11[var18]);
                  }

                  Class var19 = method6510(var13);
                  if (method6510(var8).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var20 = method6510(var8).getDeclaredMethods();
                  Method[] var21 = var20;

                  for(int var22 = 0; var22 < var21.length; ++var22) {
                     Method var23 = var21[var22];
                     if (var23.getName().equals(var9)) {
                        Class[] var24 = var23.getParameterTypes();
                        if (var17.length == var24.length) {
                           boolean var25 = true;

                           for(int var26 = 0; var26 < var17.length; ++var26) {
                              if (var17[var26] != var24[var26]) {
                                 var25 = false;
                                 break;
                              }
                           }

                           if (var25 && var19 == var23.getReturnType()) {
                              var2.field916[var3] = var23;
                           }
                        }
                     }
                  }

                  var2.field923[var3] = var14;
               }
            } else {
               String var5 = arg0.method1599();
               String var6 = arg0.method1599();
               int var7 = 0;
               if (var4 == 1) {
                  var7 = arg0.method1591();
               }

               var2.field917[var3] = var4;
               var2.field921[var3] = var7;
               if (method6510(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field920[var3] = method6510(var5).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var32) {
            var2.field919[var3] = -1;
         } catch (SecurityException var33) {
            var2.field919[var3] = -2;
         } catch (NullPointerException var34) {
            var2.field919[var3] = -3;
         } catch (Exception var35) {
            var2.field919[var3] = -4;
         } catch (Throwable var36) {
            var2.field919[var3] = -5;
         }
      }

      field9109.method14959(var2);
   }

   @deob.ObfuscatedName("fs.r(Ljava/lang/String;I)Ljava/lang/Class;")
   private static Class method6510(String arg0) throws ClassNotFoundException {
      if (arg0.equals("B")) {
         return Byte.TYPE;
      } else if (arg0.equals("I")) {
         return Integer.TYPE;
      } else if (arg0.equals("S")) {
         return Short.TYPE;
      } else if (arg0.equals("J")) {
         return Long.TYPE;
      } else if (arg0.equals("Z")) {
         return Boolean.TYPE;
      } else if (arg0.equals("F")) {
         return Float.TYPE;
      } else if (arg0.equals("D")) {
         return Double.TYPE;
      } else if (arg0.equals("C")) {
         return Character.TYPE;
      } else {
         return arg0.equals("void") ? Void.TYPE : Class.forName(arg0);
      }
   }
}
