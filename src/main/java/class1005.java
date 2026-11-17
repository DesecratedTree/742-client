import java.util.Arrays;

@deob.ObfuscatedName("zr")
public class class1005 extends class389 {
   @deob.ObfuscatedName("zr.k")
   private final int field10613;
   @deob.ObfuscatedName("zr.r")
   private final int[] field10615;
   @deob.ObfuscatedName("zr.d")
   private final int field10612;
   @deob.ObfuscatedName("zr.b")
   private final int field10614;

   public class1005(class124 arg0) {
      super(arg0);
      this.field10613 = arg0.method1587();
      this.field10615 = new int[class647.method15598().length];
      this.field10612 = arg0.method1608();
      Arrays.fill(this.field10615, 0, this.field10615.length, this.field10612);
      this.field10614 = arg0.method1591();
   }

   @deob.ObfuscatedName("zr.k(I)V")
   public void method74() {
      class4 var1 = Statics.field9261[this.field10613].method5645();
      if (this.field10614 == 0) {
         client.method2051(var1, this.field10615, 0, false);
      } else {
         client.method11048(var1, new int[]{this.field10612}, new int[]{0}, new int[]{this.field10614});
      }

   }

   @deob.ObfuscatedName("zr.b(I)Z")
   public boolean method239() {
      class806 var1 = Statics.field2046.method14475(this.field10612);
      return var1.method14319();
   }
}
