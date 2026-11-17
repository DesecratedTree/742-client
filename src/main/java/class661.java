@deob.ObfuscatedName("my")
public class class661 implements class802 {
   @deob.ObfuscatedName("my.n")
   private static final class661 field6060 = new class661(2, 0);
   @deob.ObfuscatedName("my.k")
   private static final class661 field6054 = new class661(1, 1);
   @deob.ObfuscatedName("my.d")
   private static final class661 field6055 = new class661(4, 2);
   @deob.ObfuscatedName("my.b")
   private static final class661 field6059 = new class661(3, 3);
   @deob.ObfuscatedName("my.r")
   public static final class661 field6057 = new class661(5, 4);
   @deob.ObfuscatedName("my.p")
   private static final class661 field6061 = new class661(6, 5);
   @deob.ObfuscatedName("my.o")
   private static final class661 field6058 = new class661(0, 6);
   @deob.ObfuscatedName("my.a")
   private static final class661 field6053 = new class661(7, 7);
   @deob.ObfuscatedName("my.x")
   public final int field6056;
   @deob.ObfuscatedName("my.s")
   private final int field6062;

   @deob.ObfuscatedName("if.n(I)[Lmy;")
   public static class661[] method7335() {
      return new class661[]{field6058, field6057, field6053, field6054, field6061, field6060, field6059, field6055};
   }

   private class661(int arg0, int arg1) {
      this.field6056 = arg0;
      this.field6062 = arg1;
   }

   @deob.ObfuscatedName("my.k(I)I")
   public int method9329() {
      return this.field6062;
   }

   @deob.ObfuscatedName("my.d(I)Lmy;")
   public class661 method9671() {
      switch(this.field6056) {
      case 0:
         return field6055;
      case 1:
         return field6061;
      case 2:
         return field6057;
      case 3:
         return field6053;
      case 4:
         return field6058;
      case 5:
         return field6060;
      case 6:
         return field6054;
      case 7:
         return field6059;
      default:
         throw new IllegalStateException();
      }
   }
}
