import java.util.BitSet;

@deob.ObfuscatedName("ada")
public class class84 extends class674 {
   @deob.ObfuscatedName("ada.r")
   private boolean field624 = true;
   @deob.ObfuscatedName("ada.o")
   public int field622 = 0;
   @deob.ObfuscatedName("ada.s")
   public String field620 = null;
   @deob.ObfuscatedName("ada.l")
   public byte field626;
   @deob.ObfuscatedName("ada.u")
   public byte field627;
   @deob.ObfuscatedName("ada.x")
   public long field619;
   @deob.ObfuscatedName("ada.b")
   private boolean field623;
   @deob.ObfuscatedName("ada.a")
   private int[] field625;
   @deob.ObfuscatedName("ada.p")
   public class472[] field621;

   public class84(class124 arg0) {
      this.method1144(arg0);
   }

   static {
      new BitSet(65536);
   }

   @deob.ObfuscatedName("ada.n(II)V")
   private void method1155(int arg0) {
      if (this.field621 != null) {
         class803.method14271(this.field621, 0, this.field621 = new class472[arg0], 0, this.field622);
      } else {
         this.field621 = new class472[arg0];
      }

   }

   @deob.ObfuscatedName("ada.k(I)[I")
   public int[] method1140() {
      if (this.field625 == null) {
         String[] var1 = new String[this.field622];
         this.field625 = new int[this.field622];
         int var2 = 0;

         while(var2 < this.field622) {
            var1[var2] = this.field621[var2].field3851;
            this.field625[var2] = var2++;
         }

         class781.method6216(var1, this.field625);
      }

      return this.field625;
   }

   @deob.ObfuscatedName("ada.d(Lgf;B)V")
   public void method1139(class472 arg0) {
      if (this.field621 == null || this.field622 >= this.field621.length) {
         this.method1155(this.field622 + 5);
      }

      this.field621[++this.field622 - 1] = arg0;
      this.field625 = null;
   }

   @deob.ObfuscatedName("ada.b(IB)V")
   public void method1142(int arg0) {
      --this.field622;
      if (this.field622 == 0) {
         this.field621 = null;
      } else {
         class803.method14271(this.field621, arg0 + 1, this.field621, arg0, this.field622 - arg0);
      }

      this.field625 = null;
   }

   @deob.ObfuscatedName("ada.r(Ljava/lang/String;B)I")
   public int method1143(String arg0) {
      for(int var2 = 0; var2 < this.field622; ++var2) {
         if (this.field621[var2].field3851.equalsIgnoreCase(arg0)) {
            return var2;
         }
      }

      return -1;
   }

   @deob.ObfuscatedName("ada.p(Laen;B)V")
   private void method1144(class124 arg0) {
      int var2 = arg0.method1688();
      if ((var2 & 1) != 0) {
         this.field623 = true;
      }

      if ((var2 & 2) != 0) {
         this.field624 = true;
      }

      this.field6137 = arg0.method1621();
      this.field619 = arg0.method1621();
      this.field620 = arg0.method1599();
      arg0.method1688();
      this.field627 = arg0.method1623();
      this.field626 = arg0.method1623();
      this.field622 = arg0.method1587();
      if (this.field622 > 0) {
         this.field621 = new class472[this.field622];

         for(int var3 = 0; var3 < this.field622; ++var3) {
            class472 var4 = new class472();
            if (this.field623) {
               arg0.method1621();
            }

            if (this.field624) {
               var4.field3851 = arg0.method1599();
            }

            var4.field3852 = arg0.method1623();
            var4.field3853 = arg0.method1587();
            this.field621[var3] = var4;
         }
      }

   }
}
