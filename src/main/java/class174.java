import java.io.File;
import javax.swing.filechooser.FileFilter;

@deob.ObfuscatedName("agj")
public class class174 extends FileFilter {
   // $FF: synthetic field
   private final class328 this$0;
   @deob.ObfuscatedName("agj.n")
   private class328 field1179;

   public class174(class328 arg0, class328 arg1) {
      this.this$0 = arg0;
      this.field1179 = arg1;
   }

   public boolean accept(File arg0) {
      if (this.field1179.method4072() && arg0.isDirectory()) {
         return true;
      } else {
         return !this.field1179.method4072();
      }
   }

   public String getDescription() {
      return null;
   }
}
