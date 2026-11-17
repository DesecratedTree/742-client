import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;

@deob.ObfuscatedName("ax")
public class class328 implements Runnable {
   @deob.ObfuscatedName("ax.d")
   private File field2086 = null;
   @deob.ObfuscatedName("ax.b")
   private boolean field2087 = false;
   @deob.ObfuscatedName("ax.n")
   private String field2085;
   @deob.ObfuscatedName("ax.k")
   private boolean field2084;

   public class328(String arg0, boolean arg1) {
      this.field2085 = arg0;
      this.field2084 = arg1;
      (new Thread(this)).start();
   }

   public void run() {
      Container var1 = class671.method8973();
      Frame var2 = null;
      if (Statics.field4149 != null) {
         var2 = Statics.field4149;
      } else {
         while(var1 != null) {
            if (var1 instanceof Frame) {
               var2 = (Frame)var1;
               break;
            }

            var1 = var1.getParent();
         }
      }

      if (var2 == null) {
         throw new RuntimeException("");
      } else {
         JFileChooser var3 = new JFileChooser("");
         var3.setDialogTitle(this.field2085);
         var3.setFileFilter(new class174(this, this));
         var3.setFileSelectionMode(1);
         var3.setAcceptAllFileFilterUsed(false);
         int var4 = var3.showOpenDialog(var2);
         if (var4 == 0) {
            this.field2086 = var3.getSelectedFile();
         }

         this.field2087 = true;
      }
   }

   @deob.ObfuscatedName("ax.n(S)Ljava/io/File;")
   public File method4070() {
      return this.field2086;
   }

   @deob.ObfuscatedName("ax.k(I)Z")
   public boolean method4069() {
      return this.field2087;
   }

   @deob.ObfuscatedName("ax.d(S)Z")
   public boolean method4072() {
      return this.field2084;
   }
}
