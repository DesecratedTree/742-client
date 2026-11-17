import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@deob.ObfuscatedName("nm")
public class class676 {
   @deob.ObfuscatedName("nm.n")
   private static boolean field6138 = false;
   @deob.ObfuscatedName("nm.d")
   private static Hashtable field6140 = new Hashtable(16);

   private class676() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("cc.n(Ljava/io/File;I)V")
   public static void method4452(File arg0) {
      Statics.field6139 = arg0;
      if (!Statics.field6139.exists() && !Statics.field6139.mkdirs()) {
         throw new RuntimeException("");
      }

      field6138 = true;
   }

   @deob.ObfuscatedName("fk.k(Ljava/lang/String;I)Ljava/io/File;")
   public static File method6284(String arg0) {
      if (!field6138 || Statics.field6139 == null) {
         // Without a configured native directory the libraries go to the system temp directory.
         Statics.field6139 = new File(System.getProperty("java.io.tmpdir"));
         field6138 = true;
      }

      {
         File var1 = (File)field6140.get(arg0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(Statics.field6139, arg0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists() && !var4.mkdirs()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field6140.put(arg0, var2);
                  return var2;
               }
            } catch (Exception var10) {
               try {
                  if (var3 != null) {
                     var3.close();
                     Object var7 = null;
                  }
               } catch (Exception var9) {
               }

               throw new RuntimeException();
            }
         }
      }
   }
}
