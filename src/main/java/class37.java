import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;

@deob.ObfuscatedName("abh")
public class class37 extends class505 {
   @deob.ObfuscatedName("abh.d")
   public long field265 = 0L;
   @deob.ObfuscatedName("abh.k")
   private class197 field266;

   public class37(class197 arg0, class509[] arg1) {
      super(arg1);
      this.field266 = arg0;
      byte var3 = 0;
      ByteBuffer var4 = this.field266.field9975;
      var4.clear();

      for(short var5 = 0; var5 < this.field4051.length; ++var5) {
         short var6 = 0;
         class509 var7 = this.field4051[var5];

         for(int var8 = 0; var8 < var7.method7137(); ++var8) {
            class496 var9 = var7.method7138(var8);
            if (class496.field3995 == var9) {
               this.method586(var4, var5, var6, (byte)2, (byte)0, (byte)0, (byte)0);
            } else if (class496.field3993 == var9) {
               this.method586(var4, var5, var6, (byte)2, (byte)0, (byte)3, (byte)0);
            } else if (class496.field3988 == var9) {
               this.method586(var4, var5, var6, (byte)4, (byte)0, (byte)10, (byte)0);
            } else if (class496.field3989 == var9) {
               this.method586(var4, var5, var6, (byte)0, (byte)0, (byte)5, var3++);
            } else if (class496.field3990 == var9) {
               this.method586(var4, var5, var6, (byte)1, (byte)0, (byte)5, var3++);
            } else if (class496.field3996 == var9) {
               this.method586(var4, var5, var6, (byte)2, (byte)0, (byte)5, var3++);
            } else if (class496.field3991 == var9) {
               this.method586(var4, var5, var6, (byte)3, (byte)0, (byte)5, var3++);
            }

            var6 = (short)(var9.field4002 + var6);
         }
      }

      this.method586(var4, (short)255, (short)0, (byte)17, (byte)0, (byte)0, (byte)0);
      this.field265 = IDirect3DDevice.CreateVertexDeclaration(this.field266.field1256, this.field266.field9976);
      this.field266.method16317(this);
   }

   @deob.ObfuscatedName("abh.n(Ljava/nio/ByteBuffer;SSBBBB)V")
   private void method586(ByteBuffer arg0, short arg1, short arg2, byte arg3, byte arg4, byte arg5, byte arg6) {
      arg0.putShort(arg1);
      arg0.putShort(arg2);
      arg0.put(arg3);
      arg0.put(arg4);
      arg0.put(arg5);
      arg0.put(arg6);
   }

   @deob.ObfuscatedName("abh.d()V")
   public void method302() {
      if (this.field265 != 0L) {
         IUnknown.Release(this.field265);
         this.field265 = 0L;
      }

      this.field266.method16305(this);
   }

   @deob.ObfuscatedName("abh.k()V")
   private void method587() {
      if (this.field265 != 0L) {
         this.field266.method2586(this.field265);
         this.field265 = 0L;
      }

   }

   public void finalize() {
      this.method587();
   }
}
