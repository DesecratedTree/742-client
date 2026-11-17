@deob.ObfuscatedName("agv")
public class class186 extends class939 {
   @deob.ObfuscatedName("agv.m")
   public final int field1203;
   @deob.ObfuscatedName("agv.i")
   public final int field1204;
   @deob.ObfuscatedName("agv.t")
   public final float field1205;
   @deob.ObfuscatedName("agv.c")
   public final float field1206;
   @deob.ObfuscatedName("agv.w")
   public final boolean field1208;
   @deob.ObfuscatedName("agv.q")
   private final boolean field1207;

   @deob.ObfuscatedName("agv.ay(Lyw;Lcn;Ldt;II)Lagv;")
   public static class186 method2452(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4) {
      if (!arg0.field10382 && (!class887.method15054(arg3) || !class887.method15054(arg4))) {
         return arg0.field10389 ? new class186(arg0, 34037, arg1, arg2, arg3, arg4) : new class186(arg0, arg1, arg2, arg3, arg4, class887.method4053(arg3), class887.method4053(arg4));
      } else {
         return new class186(arg0, 3553, arg1, arg2, arg3, arg4);
      }
   }

   @deob.ObfuscatedName("agv.bf(Lyw;IIZ[III)Lagv;")
   public static class186 method2444(class983 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      if (!arg0.field10382 && (!class887.method15054(arg1) || !class887.method15054(arg2))) {
         return arg0.field10389 ? new class186(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6) : new class186(arg0, arg1, arg2, class887.method4053(arg1), class887.method4053(arg2), arg4);
      } else {
         return new class186(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6);
      }
   }

   @deob.ObfuscatedName("agv.bp(Lyw;Lcn;Ldt;IIZ[BLcn;)Lagv;")
   public static class186 method2453(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4, boolean arg5, byte[] arg6, class372 arg7) {
      if (!arg0.field10382 && (!class887.method15054(arg3) || !class887.method15054(arg4))) {
         return arg0.field10389 ? new class186(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6, arg7) : new class186(arg0, arg1, arg2, arg3, arg4, class887.method4053(arg3), class887.method4053(arg4), arg6, arg7);
      } else {
         return new class186(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
      }
   }

   @deob.ObfuscatedName("agv.bs(Lyw;IIII)Lagv;")
   public static class186 method2446(class983 arg0, int arg1, int arg2, int arg3, int arg4) {
      if (!arg0.field10382 && (!class887.method15054(arg3) || !class887.method15054(arg4))) {
         return arg0.field10389 ? new class186(arg0, 34037, arg1, arg2, arg3, arg4, true) : new class186(arg0, arg1, arg2, arg3, arg4, class887.method4053(arg3), class887.method4053(arg4), true);
      } else {
         return new class186(arg0, 3553, arg1, arg2, arg3, arg4, true);
      }
   }

   private class186(class983 arg0, int arg1, class372 arg2, class405 arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
      this.field1203 = arg4;
      this.field1204 = arg5;
      if (this.field2263 == 34037) {
         this.field1205 = (float)arg5;
         this.field1206 = (float)arg4;
         this.field1208 = false;
      } else {
         this.field1205 = 1.0F;
         this.field1206 = 1.0F;
         this.field1208 = true;
      }

      this.field1207 = false;
   }

   private class186(class983 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
      this.field1203 = arg2;
      this.field1204 = arg3;
      if (this.field2263 == 34037) {
         this.field1205 = (float)arg3;
         this.field1206 = (float)arg2;
         this.field1208 = false;
      } else {
         this.field1205 = 1.0F;
         this.field1206 = 1.0F;
         this.field1208 = true;
      }

      this.field1207 = false;
   }

   private class186(class983 arg0, int arg1, class372 arg2, class405 arg3, int arg4, int arg5, boolean arg6, byte[] arg7, class372 arg8) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, true);
      this.field1203 = arg4;
      this.field1204 = arg5;
      if (this.field2263 == 34037) {
         this.field1205 = (float)arg5;
         this.field1206 = (float)arg4;
         this.field1208 = false;
      } else {
         this.field1205 = 1.0F;
         this.field1206 = 1.0F;
         this.field1208 = true;
      }

      this.field1207 = false;
   }

   private class186(class983 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
      this.field1203 = arg4;
      this.field1204 = arg5;
      if (this.field2263 == 34037) {
         this.field1205 = (float)arg5;
         this.field1206 = (float)arg4;
         this.field1208 = false;
      } else {
         this.field1205 = 1.0F;
         this.field1206 = 1.0F;
         this.field1208 = true;
      }

      this.field1207 = false;
   }

   private class186(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);
      this.field1203 = arg3;
      this.field1204 = arg4;
      this.field1205 = (float)arg4 / (float)arg6;
      this.field1206 = (float)arg3 / (float)arg5;
      this.field1208 = false;
      this.field1207 = true;
      this.method15984(false, false);
   }

   private class186(class983 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, class372.field2736, class405.field3052, arg3, arg4);
      this.field1203 = arg1;
      this.field1204 = arg2;
      this.method15985(0, arg4 - arg2, arg1, arg2, arg5, 0, 0, true);
      this.field1205 = (float)arg2 / (float)arg4;
      this.field1206 = (float)arg1 / (float)arg3;
      this.field1208 = false;
      this.field1207 = true;
      this.method15984(false, false);
   }

   private class186(class983 arg0, class372 arg1, class405 arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class372 arg8) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);
      this.field1203 = arg3;
      this.field1204 = arg4;
      this.method15983(0, arg6 - arg4, arg3, arg4, arg7, arg8, 0, 0, true);
      this.field1205 = (float)arg4 / (float)arg6;
      this.field1206 = (float)arg3 / (float)arg5;
      this.field1208 = false;
      this.field1207 = true;
      this.method15984(false, false);
   }

   private class186(class983 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);
      this.field1203 = arg3;
      this.field1204 = arg4;
      this.field1205 = (float)arg4 / (float)arg6;
      this.field1206 = (float)arg3 / (float)arg5;
      this.field1208 = false;
      this.field1207 = true;
      this.method15984(false, false);
   }

   @deob.ObfuscatedName("agv.n(Z)V")
   public void method2448(boolean arg0) {
      super.method2448(arg0 && !this.field1207);
   }
}
