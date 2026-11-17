@deob.ObfuscatedName("ajv")
public class class267 extends class107 {
   @deob.ObfuscatedName("ajv.o")
   public String field1789;
   @deob.ObfuscatedName("ajv.x")
   public char[] field1785;
   @deob.ObfuscatedName("ajv.l")
   public char[] field1787;
   @deob.ObfuscatedName("ajv.a")
   public int[] field1786;
   @deob.ObfuscatedName("ajv.s")
   public int[] field1788;

   @deob.ObfuscatedName("ajv.n(Laen;B)V")
   public void method3564(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method3553(arg0, var2);
      }
   }

   @deob.ObfuscatedName("ajv.k(Laen;IB)V")
   private void method3553(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field1789 = arg0.method1599();
      } else if (arg1 == 2) {
         int var3 = arg0.method1688();
         this.field1786 = new int[var3];
         this.field1785 = new char[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field1786[var4] = arg0.method1587();
            byte var5 = arg0.method1623();
            this.field1785[var4] = var5 == 0 ? 0 : class813.method10307(var5);
         }
      } else if (arg1 == 3) {
         int var6 = arg0.method1688();
         this.field1788 = new int[var6];
         this.field1787 = new char[var6];

         for(int var7 = 0; var7 < var6; ++var7) {
            this.field1788[var7] = arg0.method1587();
            byte var8 = arg0.method1623();
            this.field1787[var7] = var8 == 0 ? 0 : class813.method10307(var8);
         }
      } else if (arg1 == 4) {
      }

   }

   @deob.ObfuscatedName("ajv.d(CB)I")
   public int method3559(char arg0) {
      if (this.field1786 == null) {
         return -1;
      } else {
         for(int var2 = 0; var2 < this.field1786.length; ++var2) {
            if (this.field1785[var2] == arg0) {
               return this.field1786[var2];
            }
         }

         return -1;
      }
   }

   @deob.ObfuscatedName("ajv.b(CB)I")
   public int method3555(char arg0) {
      if (this.field1788 == null) {
         return -1;
      } else {
         for(int var2 = 0; var2 < this.field1788.length; ++var2) {
            if (this.field1787[var2] == arg0) {
               return this.field1788[var2];
            }
         }

         return -1;
      }
   }

   @deob.ObfuscatedName("ajv.r(S)V")
   public void method3556() {
      if (this.field1788 != null) {
         for(int var1 = 0; var1 < this.field1788.length; ++var1) {
            this.field1788[var1] |= 32768;
         }
      }

      if (this.field1786 != null) {
         for(int var2 = 0; var2 < this.field1786.length; ++var2) {
            this.field1786[var2] |= 32768;
         }
      }

   }
}
