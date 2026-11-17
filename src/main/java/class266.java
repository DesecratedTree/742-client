import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

@deob.ObfuscatedName("aju")
public class class266 extends class87 {
   @deob.ObfuscatedName("aju.u")
   private float field1782;
   @deob.ObfuscatedName("aju.v")
   private float field1783;
   @deob.ObfuscatedName("aju.a")
   private int field1778;
   @deob.ObfuscatedName("aju.x")
   private int field1784;
   @deob.ObfuscatedName("aju.g")
   private String field1776;
   @deob.ObfuscatedName("aju.l")
   private String field1779;
   @deob.ObfuscatedName("aju.s")
   private String field1780;

   public class266(OggStreamState arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("aju.k(Ljagtheora/ogg/OggPacket;I)V")
   protected void method1221(OggPacket arg0) {
      if (this.field664 <= 0 || "SUB".equals(this.field1779)) {
         class124 var2 = new class124(arg0.getData());
         int var3 = var2.method1688();
         if (this.field664 <= 8) {
            if ((var3 | 128) == 0) {
               throw new IllegalStateException();
            }

            if (this.field664 == 0) {
               var2.field935 += 23;
               this.field1778 = var2.method1592();
               this.field1784 = var2.method1592();
               if (this.field1778 == 0 || this.field1784 == 0) {
                  throw new IllegalStateException();
               }

               class124 var4 = new class124(16);
               var2.method1602(var4.field931, 0, 16);
               this.field1780 = var4.method1599();
               var4.field935 = 0;
               var2.method1602(var4.field931, 0, 16);
               this.field1779 = var4.method1599();
            }
         } else {
            if (var3 == 0) {
               long var5 = var2.method1691();
               long var7 = var2.method1691();
               long var9 = var2.method1691();
               if (var5 < 0L || var7 < 0L || var9 < 0L || var9 > var5) {
                  throw new IllegalStateException();
               }

               this.field1782 = (float)((long)this.field1784 * var5) / (float)this.field1778;
               this.field1783 = (float)((var5 + var7) * (long)this.field1784) / (float)this.field1778;
               int var11 = var2.method1592();
               if (var11 < 0 || var11 > var2.field931.length - var2.field935) {
                  throw new IllegalStateException();
               }

               this.field1776 = class759.method3481(var2.field931, var2.field935, var11);
            }

            if ((var3 | 128) != 0) {
               return;
            }
         }

      }
   }

   @deob.ObfuscatedName("aju.l(B)Ljava/lang/String;")
   public String method3537() {
      return this.field1780;
   }

   @deob.ObfuscatedName("aju.u(I)F")
   public float method3538() {
      return this.field1782;
   }

   @deob.ObfuscatedName("aju.z(I)F")
   public float method3550() {
      return this.field1783;
   }

   @deob.ObfuscatedName("aju.t(I)Ljava/lang/String;")
   public String method3539() {
      return this.field1776;
   }

   @deob.ObfuscatedName("aju.d(B)V")
   public void method1220() {
   }
}
