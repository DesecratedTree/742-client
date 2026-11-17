@deob.ObfuscatedName("gk")
public class class477 {
   private class477() throws Throwable {
      throw new Error();
   }

   @deob.ObfuscatedName("gk.n(II)Z")
   public static final boolean method6722(int arg0, int arg1) {
      return (arg0 & 33) != 0;
   }

   @deob.ObfuscatedName("gk.k(II)Z")
   public static final boolean method6648(int arg0, int arg1) {
      return (arg0 & 34) != 0;
   }

   @deob.ObfuscatedName("gk.d(II)Z")
   public static final boolean method6681(int arg0, int arg1) {
      return (arg0 & 52) != 0;
   }

   @deob.ObfuscatedName("gk.b(II)Z")
   public static final boolean method6650(int arg0, int arg1) {
      return (arg0 & 55) != 0;
   }

   @deob.ObfuscatedName("gk.r(II)Z")
   public static final boolean method6651(int arg0, int arg1) {
      return (arg0 & 544) == 544 | (arg0 & 24) != 0;
   }

   @deob.ObfuscatedName("gk.p(II)Z")
   public static final boolean method6652(int arg0, int arg1) {
      return (arg0 & 540800) != 0;
   }

   @deob.ObfuscatedName("gk.o(II)Z")
   public static final boolean method6661(int arg0, int arg1) {
      return (arg0 & 256) != 0;
   }

   @deob.ObfuscatedName("gk.a(II)Z")
   public static final boolean method6654(int arg0, int arg1) {
      return false;
   }

   @deob.ObfuscatedName("gk.x(II)Z")
   public static final boolean method6675(int arg0, int arg1) {
      return (arg0 & 16) != 0;
   }

   @deob.ObfuscatedName("gk.s(II)Z")
   public static final boolean method6656(int arg0, int arg1) {
      return (arg0 & 32768) != 0;
   }

   @deob.ObfuscatedName("gk.l(II)Z")
   public static final boolean method6657(int arg0, int arg1) {
      return (arg0 & 50560) != 0;
   }

   @deob.ObfuscatedName("gk.u(II)Z")
   private static final boolean method6658(int arg0, int arg1) {
      return (arg0 & 65536) != 0;
   }

   @deob.ObfuscatedName("gk.v(II)Z")
   public static final boolean method6705(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("gk.g(II)Z")
   public static final boolean method6660(int arg0, int arg1) {
      return (arg0 & 2048) != 0 && (arg1 & 55) != 0;
   }

   @deob.ObfuscatedName("gk.h(II)Z")
   public static final boolean method6734(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("gk.e(II)Z")
   public static final boolean method6662(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("gk.z(II)Z")
   public static final boolean method6653(int arg0, int arg1) {
      return (arg0 & 2048) != 0;
   }

   @deob.ObfuscatedName("gk.m(II)Z")
   public static final boolean method6664(int arg0, int arg1) {
      return (method6722(arg0, arg1) | method6648(arg0, arg1) | method6681(arg0, arg1)) & method6705(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.i(II)Z")
   public static final boolean method6665(int arg0, int arg1) {
      return method6660(arg0, arg1) & ((arg0 & 8192) != 0 | method6651(arg0, arg1) | method6658(arg0, arg1));
   }

   @deob.ObfuscatedName("gk.t(II)Z")
   public static final boolean method6724(int arg0, int arg1) {
      if (!method6734(arg0, arg1)) {
         return false;
      } else {
         return (arg0 & 36864) != 0 | method6652(arg0, arg1) | method6661(arg0, arg1) ? true : (arg1 & 55) == 0 & ((arg0 & 8192) != 0 | method6651(arg0, arg1) | method6658(arg0, arg1));
      }
   }

   @deob.ObfuscatedName("gk.c(II)Z")
   public static final boolean method6649(int arg0, int arg1) {
      return method6654(arg0, arg1) & method6662(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.w(II)Z")
   public static final boolean method6707(int arg0, int arg1) {
      return method6675(arg0, arg1) & method6653(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.q(II)Z")
   public static final boolean method6669(int arg0, int arg1) {
      return (arg0 & 458752) != 0 || method6722(arg0, arg1) || method6664(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.y(II)Z")
   public static final boolean method6670(int arg0, int arg1) {
      return (arg0 & 458752) != 0 || method6648(arg0, arg1) || method6664(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.j(II)Z")
   public static final boolean method6671(int arg0, int arg1) {
      return (arg0 & 458752) != 0 || method6681(arg0, arg1) || method6664(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.f(II)Z")
   public static final boolean method6672(int arg0, int arg1) {
      boolean var2 = (arg1 & 55) != 0 ? method6665(arg0, arg1) : method6724(arg0, arg1);
      return (arg0 & 65536) != 0 | method6651(arg0, arg1) | var2;
   }

   @deob.ObfuscatedName("gk.ai(II)Z")
   public static final boolean method6673(int arg0, int arg1) {
      return method6652(arg0, arg1) || method6724(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.ap(II)Z")
   public static final boolean method6674(int arg0, int arg1) {
      return (arg0 & 262144) != 0 | method6661(arg0, arg1) || method6724(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.av(II)Z")
   public static final boolean method6721(int arg0, int arg1) {
      return method6654(arg0, arg1) || method6649(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.ax(II)Z")
   public static final boolean method6689(int arg0, int arg1) {
      return (arg0 & 384) != 0;
   }

   @deob.ObfuscatedName("gk.af(II)Z")
   public static final boolean method6677(int arg0, int arg1) {
      return (arg0 & 32) != 0;
   }

   @deob.ObfuscatedName("gk.at(II)Z")
   public static final boolean method6706(int arg0, int arg1) {
      return (arg0 & 1024) != 0;
   }

   @deob.ObfuscatedName("gk.ah(II)Z")
   public static final boolean method6679(int arg0, int arg1) {
      return (arg0 & 393216) != 0 | method6675(arg0, arg1) || method6707(arg0, arg1);
   }

   @deob.ObfuscatedName("gk.aw(II)Z")
   public static final boolean method6680(int arg0, int arg1) {
      return (arg0 & 2048) != 0 | method6656(arg0, arg1) || method6724(arg0, arg1);
   }
}
