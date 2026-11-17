@deob.ObfuscatedName("adv")
public class class105 extends class674 {
   @deob.ObfuscatedName("adv.l")
   private static float[] field806 = new float[3];
   @deob.ObfuscatedName("adv.b")
   public final class370 field802;
   @deob.ObfuscatedName("adv.r")
   public final class537 field799;
   @deob.ObfuscatedName("adv.x")
   public float field804;
   @deob.ObfuscatedName("adv.s")
   public float field805;
   @deob.ObfuscatedName("adv.o")
   public int field800;
   @deob.ObfuscatedName("adv.p")
   public int field801;
   @deob.ObfuscatedName("adv.a")
   public int field803;

   public class105(class370 arg0, class756 arg1) {
      this.field802 = arg0;
      this.field799 = this.field802.method4541();
      this.method1388();
   }

   @deob.ObfuscatedName("adv.n(I)V")
   public void method1388() {
      this.field801 = this.field802.field2384;
      this.field800 = this.field802.field2381;
      this.field803 = this.field802.field2385;
      if (this.field802.field2386 != null) {
         this.field802.field2386.method8396((float)this.field799.field4235, (float)this.field799.field4231, (float)this.field799.field4236, field806);
      }

      this.field804 = field806[0];
      this.field805 = field806[2];
   }
}
