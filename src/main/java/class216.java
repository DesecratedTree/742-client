import java.awt.Canvas;

@deob.ObfuscatedName("ahy")
public abstract class class216 extends class963 {
   @deob.ObfuscatedName("ahy.k")
   protected final Canvas field1445;
   @deob.ObfuscatedName("ahy.n")
   private final class984 field1446;
   @deob.ObfuscatedName("ahy.d")
   protected int field1444;
   @deob.ObfuscatedName("ahy.b")
   protected int field1447;
   @deob.ObfuscatedName("ahy.o")
   private boolean field1450;
   @deob.ObfuscatedName("ahy.p")
   private float[] field1449;
   @deob.ObfuscatedName("ahy.r")
   protected int[] field1448;

   @deob.ObfuscatedName("rb.n(Lyx;Ljava/awt/Canvas;III)Lahy;")
   public static class216 method11590(class984 arg0, Canvas arg1, int arg2, int arg3) {
      return new class273(arg0, arg1, arg2, arg3);
   }

   public class216(class984 arg0, Canvas arg1, int arg2, int arg3) {
      this.field1445 = arg1;
      this.field1446 = arg0;
      this.field1444 = arg2;
      this.field1447 = arg3;
   }

   @deob.ObfuscatedName("ahy.z(I)V")
   protected void method2936() {
      this.field1448 = new int[this.field1447 * this.field1444];
      this.field1449 = new float[this.field1447 * this.field1444];
      if (this.field1450) {
         this.field1446.method16841(this.field1444, this.field1447, this.field1448, this.field1449);
      }

   }

   @deob.ObfuscatedName("ahy.j(II)V")
   public final void method544(int arg0, int arg1) {
      if (this.field1444 != arg0 || this.field1447 != arg1) {
         this.field1444 = arg0;
         this.field1447 = arg1;
         this.method2936();
      }

   }

   @deob.ObfuscatedName("ahy.k()I")
   public int method566() {
      return this.field1444;
   }

   @deob.ObfuscatedName("ahy.d()I")
   public int method559() {
      return this.field1447;
   }

   @deob.ObfuscatedName("ahy.r()Z")
   public final boolean method540() {
      this.field1446.method16841(this.field1444, this.field1447, this.field1448, this.field1449);
      this.field1450 = true;
      return true;
   }

   @deob.ObfuscatedName("ahy.p()Z")
   public final boolean method541() {
      this.field1450 = false;
      return true;
   }
}
