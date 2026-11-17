import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

@deob.ObfuscatedName("nq")
public class class680 implements class920 {
   @deob.ObfuscatedName("nq.d")
   private Hashtable field6182 = new Hashtable();
   @deob.ObfuscatedName("nq.b")
   private Hashtable field6183 = new Hashtable();
   @deob.ObfuscatedName("nq.n")
   private final class612 field6180;
   @deob.ObfuscatedName("nq.k")
   private final String field6181;

   public class680(class612 arg0) {
      this.field6180 = arg0;
      String var2 = "";
      if (!class931.field9436.startsWith("win") && !class931.field9436.startsWith("windows 7")) {
         if (class931.field9436.startsWith("linux")) {
            var2 = var2 + "linux/";
         } else if (class931.field9436.startsWith("mac")) {
            var2 = var2 + "macos/";
         }
      } else {
         var2 = var2 + "windows/";
      }

      String var3;
      if (!class931.field9435.startsWith("amd64") && !class931.field9435.startsWith("x86_64")) {
         if (!class931.field9435.startsWith("i386") && !class931.field9435.startsWith("i486") && !class931.field9435.startsWith("i586") && !class931.field9435.startsWith("x86")) {
            if (class931.field9435.startsWith("ppc")) {
               var3 = var2 + "ppc/";
            } else {
               var3 = var2 + "universal/";
            }
         } else {
            var3 = var2 + "x86/";
         }
      } else {
         var3 = var2 + "x86_64/";
      }

      this.field6181 = var3;
   }

   @deob.ObfuscatedName("fb.n(Ljava/lang/String;I)Ljava/lang/String;")
   private static String method6215(String arg0) {
      if (class931.field9436.startsWith("win")) {
         return arg0 + ".dll";
      } else if (class931.field9436.startsWith("linux")) {
         return "lib" + arg0 + ".so";
      } else {
         return class931.field9436.startsWith("mac") ? "lib" + arg0 + ".dylib" : null;
      }
   }

   @deob.ObfuscatedName("nq.k(Ljava/lang/String;B)I")
   public int method9970(String arg0) {
      if (this.field6182.containsKey(arg0)) {
         return 100;
      } else {
         String var2 = method6215(arg0);
         if (var2 == null) {
            return -1;
         } else {
            String var3 = this.field6181 + var2;
            if (!this.field6180.method8866(var3, "")) {
               // Not in the native index for this platform (jagtheora is absent from some caches).
               return -1;
            }

            if (!this.field6180.method8793(var3)) {
               return this.field6180.method8811(var3);
            } else {
               byte[] var4 = this.field6180.method8823(var3, "");
               Object var5 = null;

               File var6;
               try {
                  var6 = class676.method6284(var2);
               } catch (RuntimeException var15) {
                  return -1;
               }

               if (var4 != null && var6 != null) {
                  boolean var8 = true;
                  byte[] var9 = Statics.method485(var6);
                  if (var9 != null && var4.length == var9.length) {
                     for(int var10 = 0; var10 < var9.length; ++var10) {
                        if (var4[var10] != var9[var10]) {
                           var8 = false;
                           break;
                        }
                     }
                  } else {
                     var8 = false;
                  }

                  try {
                     if (!var8) {
                        try {
                           FileOutputStream var11 = new FileOutputStream(var6);
                           var11.write(var4, 0, var4.length);
                           var11.close();
                        } catch (IOException var14) {
                           throw new RuntimeException();
                        }
                     }
                  } catch (Throwable var16) {
                     return -1;
                  }

                  this.method9971(arg0, var6);
                  return 100;
               } else {
                  return -1;
               }
            }
         }
      }
   }

   @deob.ObfuscatedName("nq.d(Ljava/lang/String;Ljava/io/File;B)V")
   private void method9971(String arg0, File arg1) {
      this.field6182.put(arg0, arg1);
   }

   @deob.ObfuscatedName("nq.b(Ljava/lang/String;B)Z")
   public boolean method9982(String arg0) {
      return this.field6182.containsKey(arg0);
   }

   @deob.ObfuscatedName("nq.r(Ljava/lang/String;S)Z")
   public boolean method9972(String arg0) {
      return this.field6183.containsKey(arg0);
   }

   @deob.ObfuscatedName("nq.p(Ljava/lang/String;I)Z")
   public boolean method9973(String arg0) {
      return this.method9986(arg0, class667.class);
   }

   @deob.ObfuscatedName("nq.o(Ljava/lang/String;Ljava/lang/Class;I)Z")
   private boolean method9986(String arg0, Class arg1) {
      Class var3 = (Class)this.field6183.get(arg0);
      if (var3 != null) {
         return var3.getClassLoader() == arg1.getClassLoader();
      } else {
         File var4 = (File)this.field6182.get(arg0);
         if (var4 == null) {
            return false;
         }

         String var5;
         try {
            var5 = new File(var4.getCanonicalPath()).getPath();
         } catch (Throwable var0) {
            return false;
         }

         // Java 8 loads through Runtime.load0(Class, String) so the library belongs to the game's class
         // loader; that method is gone on newer JVMs, so fall back to System.load either way.
         try {
            Class var6 = Class.forName("java.lang.Runtime");
            Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
            Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
            Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
            var8.invoke(var9, Boolean.TRUE);
            var9.invoke(Runtime.getRuntime(), arg1, var5);
            var8.invoke(var9, Boolean.FALSE);
            this.field6183.put(arg0, arg1);
            return true;
         } catch (Throwable var10) {
         }

         try {
            System.load(var5);
            this.field6183.put(arg0, class667.class);
            return true;
         } catch (Throwable var11) {
            System.err.println("Unable to load native library '" + arg0 + "' from " + var5 + ": " + var11);
            return false;
         }
      }
   }

   @deob.ObfuscatedName("nq.a(B)Z")
   public boolean method9975() {
      Hashtable var1 = new Hashtable();
      Enumeration var2 = this.field6183.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         var1.put(var3, this.field6183.get(var3));
      }

      try {
         Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
         Class var5 = Class.forName("java.lang.ClassLoader");
         Field var6 = var5.getDeclaredField("nativeLibraries");
         Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var7.invoke(var6, Boolean.TRUE);

         try {
            Enumeration var8 = this.field6183.keys();

            while(var8.hasMoreElements()) {
               String var9 = (String)var8.nextElement();

               try {
                  File var10 = (File)this.field6182.get(var9);
                  Class var11 = (Class)this.field6183.get(var9);
                  Vector var12 = (Vector)var6.get(var11.getClassLoader());

                  for(int var13 = 0; var13 < var12.size(); ++var13) {
                     try {
                        Object var14 = var12.elementAt(var13);
                        Field var15 = var14.getClass().getDeclaredField("name");
                        var7.invoke(var15, Boolean.TRUE);

                        try {
                           String var16 = (String)var15.get(var14);
                           if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                              Field var17 = var14.getClass().getDeclaredField("handle");
                              Method var18 = var14.getClass().getDeclaredMethod("finalize");
                              var7.invoke(var17, Boolean.TRUE);
                              var7.invoke(var18, Boolean.TRUE);

                              try {
                                 var18.invoke(var14);
                                 var17.set(var14, new Integer(0));
                                 var1.remove(var9);
                              } catch (Throwable var25) {
                              }

                              var7.invoke(var18, Boolean.FALSE);
                              var7.invoke(var17, Boolean.FALSE);
                           }
                        } catch (Throwable var26) {
                        }

                        var7.invoke(var15, Boolean.FALSE);
                     } catch (Throwable var27) {
                     }
                  }
               } catch (Throwable var28) {
               }
            }
         } catch (Throwable var29) {
         }

         var7.invoke(var6, Boolean.FALSE);
      } catch (Throwable var30) {
      }

      this.field6183 = var1;
      return this.field6183.isEmpty();
   }
}
