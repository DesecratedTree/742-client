@deob.ObfuscatedName("by")
public class class356 {
   private class356() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("by.n(II)Z")
   public static final boolean method4315(int arg0, int arg1) {
      return (arg0 & 33) != 0;
   }

   @deob.ObfuscatedName("by.k(II)Z")
   public static final boolean method4316(int arg0, int arg1) {
      return (arg0 & 34) != 0;
   }

   @deob.ObfuscatedName("by.d(II)Z")
   public static final boolean method4363(int arg0, int arg1) {
      return (arg0 & 52) != 0;
   }

   @deob.ObfuscatedName("by.b(II)Z")
   public static final boolean method4318(int arg0, int arg1) {
      return (arg0 & 55) != 0;
   }

   @deob.ObfuscatedName("by.r(II)Z")
   public static final boolean method4319(int arg0, int arg1) {
      return (arg0 & 544) == 544 | (arg0 & 24) != 0;
   }

   @deob.ObfuscatedName("by.p(II)Z")
   public static final boolean method4370(int arg0, int arg1) {
      return (arg0 & 540800) != 0;
   }

   @deob.ObfuscatedName("by.o(II)Z")
   public static final boolean method4353(int arg0, int arg1) {
      return (arg0 & 1048832) != 0;
   }

   @deob.ObfuscatedName("by.a(II)Z")
   public static final boolean method4321(int arg0, int arg1) {
      return false;
   }

   @deob.ObfuscatedName("by.x(II)Z")
   public static final boolean method4322(int arg0, int arg1) {
      return (arg0 & 16) != 0;
   }

   @deob.ObfuscatedName("by.s(II)Z")
   public static final boolean method4323(int arg0, int arg1) {
      return (arg0 & 32768) != 0;
   }

   @deob.ObfuscatedName("by.l(II)Z")
   public static final boolean method4324(int arg0, int arg1) {
      return (arg0 & 50560) != 0;
   }

   @deob.ObfuscatedName("by.u(II)Z")
   private static final boolean method4325(int arg0, int arg1) {
      return (arg0 & 65536) != 0;
   }

   @deob.ObfuscatedName("by.v(II)Z")
   public static final boolean method4326(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("by.g(II)Z")
   public static final boolean method4375(int arg0, int arg1) {
      return (arg0 & 2048) != 0 && (arg1 & 55) != 0;
   }

   @deob.ObfuscatedName("by.h(II)Z")
   public static final boolean method4328(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("by.e(II)Z")
   public static final boolean method4329(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("by.z(II)Z")
   public static final boolean method4330(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("by.m(II)Z")
   public static final boolean method4391(int arg0, int arg1) {
      return (method4315(arg0, arg1) | method4316(arg0, arg1) | method4363(arg0, arg1)) & method4326(arg0, arg1);
   }

   @deob.ObfuscatedName("by.i(II)Z")
   public static final boolean method4332(int arg0, int arg1) {
      return ((arg0 & 8192) != 0 | method4319(arg0, arg1) | method4325(arg0, arg1)) & method4375(arg0, arg1);
   }

   @deob.ObfuscatedName("by.t(II)Z")
   public static final boolean method4377(int arg0, int arg1) {
      if (!method4328(arg0, arg1)) {
         return false;
      } else {
         return (arg0 & 45056) != 0 | method4370(arg0, arg1) | method4353(arg0, arg1) ? true : (arg1 & 55) == 0 & (method4319(arg0, arg1) | method4325(arg0, arg1));
      }
   }

   @deob.ObfuscatedName("by.c(II)Z")
   public static final boolean method4398(int arg0, int arg1) {
      return method4321(arg0, arg1) & method4329(arg0, arg1);
   }

   @deob.ObfuscatedName("by.w(II)Z")
   public static final boolean method4371(int arg0, int arg1) {
      return method4322(arg0, arg1) & method4330(arg0, arg1);
   }

   @deob.ObfuscatedName("by.q(II)Z")
   public static final boolean method4333(int arg0, int arg1) {
      return (arg0 & 458752) != 0 | method4315(arg0, arg1) || method4391(arg0, arg1);
   }

   @deob.ObfuscatedName("by.y(II)Z")
   public static final boolean method4401(int arg0, int arg1) {
      return (arg0 & 458752) != 0 | method4316(arg0, arg1) || method4391(arg0, arg1);
   }

   @deob.ObfuscatedName("by.j(II)Z")
   public static final boolean method4338(int arg0, int arg1) {
      return (arg0 & 458752) != 0 | method4363(arg0, arg1) || method4391(arg0, arg1);
   }

   @deob.ObfuscatedName("by.f(II)Z")
   public static final boolean method4383(int arg0, int arg1) {
      if (!((arg0 & 65536) != 0 | method4319(arg0, arg1)) && !method4332(arg0, arg1)) {
         return (arg1 & 55) == 0 && method4377(arg0, arg1);
      } else {
         return true;
      }
   }

   @deob.ObfuscatedName("by.ai(II)Z")
   public static final boolean method4340(int arg0, int arg1) {
      return method4370(arg0, arg1) || method4377(arg0, arg1);
   }

   @deob.ObfuscatedName("by.ap(II)Z")
   public static final boolean method4341(int arg0, int arg1) {
      return (arg0 & 262144) != 0 | method4353(arg0, arg1) || method4377(arg0, arg1);
   }

   @deob.ObfuscatedName("by.av(II)Z")
   public static final boolean method4342(int arg0, int arg1) {
      return method4321(arg0, arg1) || method4398(arg0, arg1);
   }

   @deob.ObfuscatedName("by.ax(II)Z")
   public static final boolean method4339(int arg0, int arg1) {
      return (arg0 & 384) != 0;
   }

   @deob.ObfuscatedName("by.af(II)Z")
   public static final boolean method4347(int arg0, int arg1) {
      return (arg0 & 32) != 0;
   }

   @deob.ObfuscatedName("by.at(II)Z")
   public static final boolean method4335(int arg0, int arg1) {
      return (arg0 & 1024) != 0;
   }

   @deob.ObfuscatedName("by.ah(II)Z")
   public static final boolean method4409(int arg0, int arg1) {
      return (arg0 & 393216) != 0 | method4322(arg0, arg1) || method4377(arg0, arg1) || method4371(arg0, arg1);
   }

   @deob.ObfuscatedName("by.aw(II)Z")
   public static final boolean method4361(int arg0, int arg1) {
      return (arg0 & 2048) != 0 | method4323(arg0, arg1) || method4377(arg0, arg1);
   }
}
