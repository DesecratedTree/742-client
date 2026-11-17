import jaclib.memory.Buffer;
import jaggl.OpenGL;

@deob.ObfuscatedName("bt")
public abstract class class351 {
   @deob.ObfuscatedName("bt.a")
   private boolean field2255 = false;
   @deob.ObfuscatedName("bt.d")
   protected final class983 field2248;
   @deob.ObfuscatedName("bt.b")
   private final int field2251;
   @deob.ObfuscatedName("bt.p")
   private int field2253;
   @deob.ObfuscatedName("bt.o")
   private boolean field2249;
   @deob.ObfuscatedName("bt.r")
   protected final int field2252;
   @deob.ObfuscatedName("bt.x")
   private static final int[] field2256 = new int[1];

   public class351(class983 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      this.field2248 = arg0;
      this.field2251 = arg1;
      this.field2253 = arg3;
      this.field2249 = arg4;
      OpenGL.glGenBuffersARB(1, field2256, 0);
      this.field2252 = field2256[0];
      this.method4264();
      OpenGL.glBufferDataARBa(arg1, this.field2253, arg2.method7783(), this.field2249 ? 35040 : 35044);
      this.field2248.field10262 += this.field2253;
   }

   public class351(class983 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      this.field2248 = arg0;
      this.field2251 = arg1;
      this.field2253 = arg3;
      this.field2249 = arg4;
      OpenGL.glGenBuffersARB(1, field2256, 0);
      this.field2252 = field2256[0];
      this.method4264();
      OpenGL.glBufferDataARBub(arg1, this.field2253, arg2, 0, this.field2249 ? 35040 : 35044);
      this.field2248.field10262 += this.field2253;
   }

   @deob.ObfuscatedName("bt.m([BI)V")
   protected void method4265(byte[] arg0, int arg1) {
      this.method4264();
      if (arg1 > this.field2253) {
         OpenGL.glBufferDataARBub(this.field2251, arg1, arg0, 0, this.field2249 ? 35040 : 35044);
         this.field2248.field10262 += arg1 - this.field2253;
         this.field2253 = arg1;
      } else {
         OpenGL.glBufferSubDataARBub(this.field2251, 0, arg1, arg0, 0);
      }

   }

   public void finalize() throws Throwable {
      if (!this.field2255) {
         this.field2248.method16654(this.field2252, this.field2253);
         this.field2255 = true;
      }

      super.finalize();
   }

   @deob.ObfuscatedName("bt.z()V")
   protected abstract void method4264();
}
