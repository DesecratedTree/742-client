@deob.ObfuscatedName("acb")
public final class class58 extends class674 {
   @deob.ObfuscatedName("acb.l")
   public static final class58 field433 = new class58(0, -1);
   @deob.ObfuscatedName("acb.u")
   public final int field432;
   @deob.ObfuscatedName("acb.v")
   public final int field434;

   public class58(int arg0, int arg1) {
      this.field432 = arg0;
      this.field434 = arg1;
   }

   @deob.ObfuscatedName("acb.n(B)Z")
   public final boolean method898() {
      return (this.field432 & 1) != 0;
   }

   @deob.ObfuscatedName("acb.k(II)Z")
   public final boolean method899(int arg0) {
      return (this.field432 >> arg0 + 1 & 1) != 0;
   }

   @deob.ObfuscatedName("acb.d(B)I")
   public final int method911() {
      return method9163(this.field432);
   }

   @deob.ObfuscatedName("lx.b(II)I")
   public static final int method9163(int arg0) {
      return arg0 >> 11 & 127;
   }

   @deob.ObfuscatedName("acb.r(I)I")
   public final int method901() {
      return this.field432 >> 18 & 7;
   }

   @deob.ObfuscatedName("acb.p(I)Z")
   public final boolean method902() {
      return (this.field432 >> 21 & 1) != 0;
   }

   @deob.ObfuscatedName("acb.o(I)Z")
   public final boolean method906() {
      return (this.field432 >> 22 & 1) != 0;
   }

   @deob.ObfuscatedName("acb.a(I)Z")
   public final boolean method903() {
      return (this.field432 >> 23 & 1) != 0;
   }
}
