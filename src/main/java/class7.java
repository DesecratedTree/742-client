@deob.ObfuscatedName("aae")
public class class7 extends class389 {
   @deob.ObfuscatedName("aae.p")
   private final int field82;
   @deob.ObfuscatedName("aae.o")
   private final int field83;
   @deob.ObfuscatedName("aae.r")
   private final int field81;
   @deob.ObfuscatedName("aae.s")
   private final int field78;
   @deob.ObfuscatedName("aae.l")
   private final int field89;
   @deob.ObfuscatedName("aae.x")
   private final int field87;
   @deob.ObfuscatedName("aae.b")
   private final int field80;
   @deob.ObfuscatedName("aae.v")
   private final int field79;
   @deob.ObfuscatedName("aae.a")
   private final int field84;
   @deob.ObfuscatedName("aae.u")
   private final int field91;
   @deob.ObfuscatedName("aae.g")
   private final int field90;
   @deob.ObfuscatedName("aae.h")
   private final int field86;
   @deob.ObfuscatedName("aae.e")
   private final int field92;

   public class7(class124 arg0, int arg1, int arg2) {
      super(arg0);
      if (arg1 == 0) {
         int var4 = arg0.method1591();
         this.field82 = var4 >>> 16;
         this.field83 = var4 & 65535;
         this.field81 = -1;
      } else {
         this.field82 = -1;
         this.field83 = -1;
         this.field81 = arg0.method1587();
      }

      if (arg2 == 0) {
         int var5 = arg0.method1591();
         this.field78 = var5 >>> 16;
         this.field89 = var5 & 65535;
         this.field87 = -1;
      } else {
         this.field78 = -1;
         this.field89 = -1;
         this.field87 = arg0.method1587();
      }

      if (arg1 == 0 && arg2 == 0) {
         this.field80 = arg0.method1688();
      } else {
         this.field80 = -1;
      }

      this.field79 = arg0.method1587();
      this.field84 = arg0.method1688();
      this.field91 = arg0.method1688();
      this.field90 = arg0.method1589();
      this.field86 = arg0.method1587();
      this.field92 = arg0.method1688();
   }

   @deob.ObfuscatedName("aae.k(I)V")
   public void method74() {
      int var1;
      int var2;
      int var3;
      if (this.field82 >= 0) {
         var1 = this.field82 * 512 + 256;
         var2 = this.field83 * 512 + 256;
         var3 = this.field80;
      } else {
         class4 var4 = Statics.field9261[this.field81].method5645();
         class584 var5 = var4.method11602().field5446;
         var1 = (int)var5.field5328;
         var2 = (int)var5.field5331;
         var3 = var4.field1032;
      }

      int var6;
      int var7;
      if (this.field83 >= 0) {
         var6 = this.field78 * 512 + 256;
         var7 = this.field89 * 512 + 256;
      } else {
         class4 var8 = Statics.field9261[this.field87].method5645();
         class584 var9 = var8.method11602().field5446;
         var6 = (int)var9.field5328;
         var7 = (int)var9.field5331;
         if (var3 < 0) {
            var3 = var8.field1032;
         }
      }

      int var10 = this.field92 << 2;
      class312 var11 = new class312(client.field2468.method9639(), this.field79, var3, var3, var1, var2, this.field84 << 2, client.field2418, client.field2418 + this.field90, this.field86, var10, this.field81 + 1, this.field87 + 1, this.field91 << 2, false, 0, 0);
      var11.method3914(var6, var7, this.field91 << 2, client.field2418 + this.field90);
      client.field2577.method14959(new class246(var11));
   }

   @deob.ObfuscatedName("aae.b(I)Z")
   public boolean method239() {
      class815 var1 = Statics.field3758.method14209(this.field79);
      boolean var2 = var1.method14384();
      class806 var3 = Statics.field2046.method14475(var1.field8406);
      return var2 & var3.method14319();
   }
}
