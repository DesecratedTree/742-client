@deob.ObfuscatedName("acm")
public class class69 extends class674 {
   @deob.ObfuscatedName("acm.g")
   public int field508;
   @deob.ObfuscatedName("acm.h")
   public int field509;
   @deob.ObfuscatedName("acm.e")
   public int[] field499;
   @deob.ObfuscatedName("acm.z")
   public int[][] field511;
   @deob.ObfuscatedName("acm.m")
   public boolean[] field512;
   @deob.ObfuscatedName("acm.i")
   public int[] field510;

   public class69(int arg0, byte[] arg1) {
      this.field508 = arg0;
      class124 var3 = new class124(arg1);
      this.field509 = var3.method1587();
      this.field499 = new int[this.field509];
      this.field511 = new int[this.field509][];
      this.field512 = new boolean[this.field509];
      this.field510 = new int[this.field509];

      for(int var4 = 0; var4 < this.field509; ++var4) {
         this.field499[var4] = var3.method1688();
         if (this.field499[var4] == 6) {
            this.field499[var4] = 2;
         }
      }

      for(int var5 = 0; var5 < this.field509; ++var5) {
         this.field512[var5] = var3.method1688() == 1;
      }

      for(int var6 = 0; var6 < this.field509; ++var6) {
         this.field510[var6] = var3.method1587();
      }

      for(int var7 = 0; var7 < this.field509; ++var7) {
         this.field511[var7] = new int[var3.method1604()];
      }

      for(int var8 = 0; var8 < this.field509; ++var8) {
         for(int var9 = 0; var9 < this.field511[var8].length; ++var9) {
            this.field511[var8][var9] = var3.method1604();
         }
      }

   }
}
