import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@deob.ObfuscatedName("us")
public class class871 {
   @deob.ObfuscatedName("us.d")
   private String field8834 = "null";
   @deob.ObfuscatedName("us.o")
   private int field8831 = 0;
   @deob.ObfuscatedName("us.k")
   public char field8830;
   @deob.ObfuscatedName("us.n")
   public char field8835;
   @deob.ObfuscatedName("us.b")
   private int field8832;
   @deob.ObfuscatedName("us.a")
   private HashMap field8836;
   @deob.ObfuscatedName("us.r")
   private Map field8833;
   @deob.ObfuscatedName("us.p")
   private Object[] field8829;

   @deob.ObfuscatedName("us.n(Laen;I)V")
   public void method15236(class124 arg0) {
      while(true) {
         int var2 = arg0.method1688();
         if (var2 == 0) {
            return;
         }

         this.method15260(arg0, var2);
      }
   }

   @deob.ObfuscatedName("us.k(Laen;IS)V")
   private void method15260(class124 arg0, int arg1) {
      if (arg1 == 1) {
         this.field8835 = class813.method10307(arg0.method1623());
      } else if (arg1 == 2) {
         this.field8830 = class813.method10307(arg0.method1623());
      } else if (arg1 == 3) {
         this.field8834 = arg0.method1599();
      } else if (arg1 == 4) {
         this.field8832 = arg0.method1591();
      } else if (arg1 != 5 && arg1 != 6) {
         if (arg1 == 7 || arg1 == 8) {
            int var3 = arg0.method1587();
            this.field8831 = arg0.method1587();
            this.field8829 = new Object[var3];

            for(int var4 = 0; var4 < this.field8831; ++var4) {
               int var5 = arg0.method1587();
               if (arg1 == 7) {
                  this.field8829[var5] = arg0.method1599();
               } else {
                  this.field8829[var5] = new Integer(arg0.method1591());
               }
            }
         }
      } else {
         this.field8831 = arg0.method1587();
         this.field8833 = new HashMap(this.field8831);

         for(int var6 = 0; var6 < this.field8831; ++var6) {
            int var7 = arg0.method1591();
            Object var8;
            if (arg1 == 5) {
               var8 = arg0.method1599();
            } else {
               var8 = new Integer(arg0.method1591());
            }

            this.field8833.put(new Integer(var7), var8);
         }
      }

   }

   @deob.ObfuscatedName("us.d(II)I")
   public int method15235(int arg0) {
      Object var2 = this.method15240(arg0);
      return var2 == null ? this.field8832 : (Integer)var2;
   }

   @deob.ObfuscatedName("us.b(II)Ljava/lang/String;")
   public String method15239(int arg0) {
      Object var2 = this.method15240(arg0);
      return var2 == null ? this.field8834 : (String)var2;
   }

   @deob.ObfuscatedName("us.r(II)Ljava/lang/Object;")
   private Object method15240(int arg0) {
      if (this.field8829 != null) {
         return arg0 >= 0 && arg0 < this.field8829.length ? this.field8829[arg0] : null;
      } else {
         return this.field8833 != null ? this.field8833.get(new Integer(arg0)) : null;
      }
   }

   @deob.ObfuscatedName("us.p(Ljava/lang/Object;I)Z")
   public boolean method15256(Object arg0) {
      if (this.field8831 == 0) {
         return false;
      } else {
         if (this.field8836 == null) {
            this.method15244();
         }

         return this.field8836.containsKey(arg0);
      }
   }

   @deob.ObfuscatedName("us.o(Ljava/lang/Object;I)[I")
   public int[] method15242(Object arg0) {
      if (this.field8831 == 0) {
         return null;
      } else {
         if (this.field8836 == null) {
            this.method15244();
         }

         return (int[])((int[])this.field8836.get(arg0));
      }
   }

   @deob.ObfuscatedName("us.a(I)I")
   public int method15243() {
      return this.field8831;
   }

   @deob.ObfuscatedName("us.x(I)V")
   private void method15244() {
      HashMap var1 = new HashMap();
      if (this.field8829 != null) {
         for(int var2 = 0; var2 < this.field8829.length; ++var2) {
            if (this.field8829[var2] != null) {
               Object var3 = this.field8829[var2];
               List var4 = (List)var1.get(var3);
               if (var4 == null) {
                  var4 = new LinkedList();
                  var1.put(var3, var4);
               }

               var4.add(new Integer(var2));
            }
         }
      } else {
         if (this.field8833 == null) {
            throw new IllegalStateException();
         }

         Iterator var5 = this.field8833.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            Object var7 = var6.getValue();
            List var8 = (List)var1.get(var7);
            if (var8 == null) {
               var8 = new LinkedList();
               var1.put(var7, var8);
            }

            var8.add(var6.getKey());
         }
      }

      this.field8836 = new HashMap();
      Iterator var9 = var1.entrySet().iterator();

      while(var9.hasNext()) {
         Entry var10 = (Entry)var9.next();
         List var11 = (List)var10.getValue();
         int[] var12 = new int[var11.size()];
         int var13 = 0;
         Iterator var14 = var11.iterator();

         while(var14.hasNext()) {
            Integer var15 = (Integer)var14.next();
            var12[var13++] = var15;
         }

         if (this.field8829 == null) {
            Arrays.sort(var12);
         }

         this.field8836.put(var10.getKey(), var12);
      }

   }
}
