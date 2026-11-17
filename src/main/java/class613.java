import jaggl.OpenGL;
import java.awt.Canvas;

@deob.ObfuscatedName("ld")
public class class613 {
   private class613() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("ld.n(Ljava/awt/Canvas;Lma;Llc;I)Lra;")
   public static class772 method8874(Canvas arg0, class637 arg1, class612 arg2, int arg3) {
      try {
         boolean var4 = class979.method16309();
         if (!var4) {
            throw new RuntimeException("");
         } else if (!class926.method5940().method9973("jaggl")) {
            throw new RuntimeException("");
         } else {
            class772.method5151(arg0);
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg3);
            if (var6 == 0L) {
               throw new RuntimeException("");
            } else {
               class214 var8 = new class214(var5, arg0, var6, arg1, arg2, arg3);
               var8.method16310();
               return var8;
            }
         }
      } catch (RuntimeException var11) {
         throw var11;
      } catch (Throwable var12) {
         throw new RuntimeException("");
      }
   }
}
