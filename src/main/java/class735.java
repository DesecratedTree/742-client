@deob.ObfuscatedName("pr")
public final class class735 {
   @deob.ObfuscatedName("pr.n")
   private class107 field6770 = new class107();
   @deob.ObfuscatedName("pr.r")
   private class846 field6774 = new class846();
   @deob.ObfuscatedName("pr.k")
   private int field6771;
   @deob.ObfuscatedName("pr.d")
   private int field6772;
   @deob.ObfuscatedName("pr.b")
   private class875 field6773;

   public class735(int arg0) {
      this.field6771 = arg0;
      this.field6772 = arg0;

      int var2;
      for(var2 = 1; var2 + var2 < arg0; var2 += var2) {
      }

      this.field6773 = new class875(var2);
   }

   @deob.ObfuscatedName("pr.n(J)Ladx;")
   public class107 method10867(long arg0) {
      class107 var3 = (class107)this.field6773.method15322(arg0);
      if (var3 != null) {
         this.field6774.method14938(var3);
      }

      return var3;
   }

   @deob.ObfuscatedName("pr.k(Ladx;J)V")
   public void method10862(class107 arg0, long arg1) {
      if (this.field6772 == 0) {
         class107 var4 = this.field6774.method14923();
         var4.method9864();
         var4.method1393();
         if (this.field6770 == var4) {
            class107 var5 = this.field6774.method14923();
            var5.method9864();
            var5.method1393();
         }
      } else {
         --this.field6772;
      }

      this.field6773.method15311(arg0, arg1);
      this.field6774.method14938(arg0);
   }

   @deob.ObfuscatedName("pr.d(I)V")
   public void method10863() {
      this.field6774.method14924();
      this.field6773.method15312();
      this.field6770 = new class107();
      this.field6772 = this.field6771;
   }
}
