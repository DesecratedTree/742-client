@deob.ObfuscatedName("lr")
public final class class627 implements Comparable {
   @deob.ObfuscatedName("lr.n")
   public Object field5705;
   @deob.ObfuscatedName("lr.k")
   public Object field5707;
   @deob.ObfuscatedName("lr.b")
   public long field5704;
   @deob.ObfuscatedName("lr.d")
   public long field5706;

   public class627(Object arg0, Object arg1) {
      this.field5705 = arg0;
      this.field5707 = arg1;
   }

   @deob.ObfuscatedName("lr.n(Llr;B)I")
   private int method9090(class627 arg0) {
      if (this.field5704 < arg0.field5704) {
         return -1;
      } else {
         return this.field5704 > arg0.field5704 ? 1 : 0;
      }
   }

   public boolean equals(Object arg0) {
      if (arg0 instanceof class627) {
         return this.field5707.equals(((class627)arg0).field5707);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int compareTo(Object arg0) {
      return this.method9090((class627)arg0);
   }
}
