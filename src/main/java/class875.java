import java.util.Iterator;

@deob.ObfuscatedName("uw")
public final class class875 implements Iterable {
   @deob.ObfuscatedName("uw.p")
   private int field8865 = 0;
   @deob.ObfuscatedName("uw.n")
   public int field8862;
   @deob.ObfuscatedName("uw.k")
   public class674[] field8860;
   @deob.ObfuscatedName("uw.d")
   private long field8861;
   @deob.ObfuscatedName("uw.b")
   private class674 field8863;
   @deob.ObfuscatedName("uw.r")
   private class674 field8864;

   public class875(int arg0) {
      this.field8862 = arg0;
      this.field8860 = new class674[arg0];

      for(int var2 = 0; var2 < arg0; ++var2) {
         class674 var3 = this.field8860[var2] = new class674();
         var3.field6136 = var3;
         var3.field6135 = var3;
      }

   }

   @deob.ObfuscatedName("uw.n(J)Lnk;")
   public class674 method15322(long arg0) {
      this.field8861 = arg0;
      class674 var3 = this.field8860[(int)(arg0 & (long)(this.field8862 - 1))];

      for(this.field8863 = var3.field6136; this.field8863 != var3; this.field8863 = this.field8863.field6136) {
         if (this.field8863.field6137 == arg0) {
            class674 var4 = this.field8863;
            this.field8863 = this.field8863.field6136;
            return var4;
         }
      }

      this.field8863 = null;
      return null;
   }

   @deob.ObfuscatedName("uw.k(I)Lnk;")
   public class674 method15308() {
      if (this.field8863 == null) {
         return null;
      } else {
         class674 var1 = this.field8860[(int)(this.field8861 & (long)(this.field8862 - 1))];

         while(this.field8863 != var1) {
            if (this.field8863.field6137 == this.field8861) {
               class674 var2 = this.field8863;
               this.field8863 = this.field8863.field6136;
               return var2;
            }

            this.field8863 = this.field8863.field6136;
         }

         this.field8863 = null;
         return null;
      }
   }

   @deob.ObfuscatedName("uw.d([Lnk;B)I")
   public int method15317(class674[] arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.field8862; ++var3) {
         class674 var4 = this.field8860[var3];

         for(class674 var5 = var4.field6136; var4 != var5; var5 = var5.field6136) {
            arg0[var2++] = var5;
         }
      }

      return var2;
   }

   @deob.ObfuscatedName("uw.b(I)I")
   public int method15321() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.field8862; ++var2) {
         class674 var3 = this.field8860[var2];

         for(class674 var4 = var3.field6136; var3 != var4; var4 = var4.field6136) {
            ++var1;
         }
      }

      return var1;
   }

   @deob.ObfuscatedName("uw.r(Lnk;J)V")
   public void method15311(class674 arg0, long arg1) {
      if (arg0.field6135 != null) {
         arg0.method9864();
      }

      class674 var4 = this.field8860[(int)(arg1 & (long)(this.field8862 - 1))];
      arg0.field6135 = var4.field6135;
      arg0.field6136 = var4;
      arg0.field6135.field6136 = arg0;
      arg0.field6136.field6135 = arg0;
      arg0.field6137 = arg1;
   }

   @deob.ObfuscatedName("uw.p(I)V")
   public void method15312() {
      for(int var1 = 0; var1 < this.field8862; ++var1) {
         class674 var2 = this.field8860[var1];

         while(true) {
            class674 var3 = var2.field6136;
            if (var2 == var3) {
               break;
            }

            var3.method9864();
         }
      }

      this.field8863 = null;
      this.field8864 = null;
   }

   @deob.ObfuscatedName("uw.o(B)Lnk;")
   public class674 method15313() {
      this.field8865 = 0;
      return this.method15314();
   }

   @deob.ObfuscatedName("uw.a(I)Lnk;")
   public class674 method15314() {
      if (this.field8865 > 0 && this.field8860[this.field8865 - 1] != this.field8864) {
         class674 var1 = this.field8864;
         this.field8864 = var1.field6136;
         return var1;
      } else {
         class674 var2;
         do {
            if (this.field8865 >= this.field8862) {
               return null;
            }

            var2 = this.field8860[++this.field8865 - 1].field6136;
         } while(this.field8860[this.field8865 - 1] == var2);

         this.field8864 = var2.field6136;
         return var2;
      }
   }

   public Iterator iterator() {
      return new class874(this);
   }
}
