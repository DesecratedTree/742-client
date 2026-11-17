import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import sun.misc.Unsafe;

@deob.ObfuscatedName("ys")
public abstract class class979 extends class772 {
   @deob.ObfuscatedName("ys.j")
   private static final Object field10010 = new Object();
   @deob.ObfuscatedName("ys.br")
   private static final class597 field10011 = new class597();
   @deob.ObfuscatedName("ys.f")
   private class925 field10129 = new class925();
   @deob.ObfuscatedName("ys.ao")
   private final int field9977 = 4194304;
   @deob.ObfuscatedName("ys.aq")
   private class849 field9981 = new class849();
   @deob.ObfuscatedName("ys.ad")
   private class583 field9985 = new class583();
   @deob.ObfuscatedName("ys.am")
   private class597 field9986 = new class597();
   @deob.ObfuscatedName("ys.aj")
   private class583 field9987 = new class583();
   @deob.ObfuscatedName("ys.ac")
   public class583 field9988 = new class583();
   @deob.ObfuscatedName("ys.ay")
   public class597 field10066 = new class597();
   @deob.ObfuscatedName("ys.bf")
   public class597 field9970 = new class597();
   @deob.ObfuscatedName("ys.bp")
   private class583 field10083 = new class583();
   @deob.ObfuscatedName("ys.bs")
   private class597 field9992 = new class597();
   @deob.ObfuscatedName("ys.ba")
   public class583 field9994 = new class583();
   @deob.ObfuscatedName("ys.bg")
   public class597 field9995 = new class597();
   @deob.ObfuscatedName("ys.bc")
   public class597 field9979 = new class597();
   @deob.ObfuscatedName("ys.bw")
   public class584 field9997 = new class584();
   @deob.ObfuscatedName("ys.bq")
   public float[] field9998 = new float[4];
   @deob.ObfuscatedName("ys.by")
   private boolean field10085 = false;
   @deob.ObfuscatedName("ys.bx")
   private class518 field10087 = class518.field4115;
   @deob.ObfuscatedName("ys.bm")
   private boolean field10001 = false;
   @deob.ObfuscatedName("ys.bh")
   private class597 field10002 = new class597();
   @deob.ObfuscatedName("ys.bn")
   private class597 field10003 = new class597();
   @deob.ObfuscatedName("ys.bk")
   private boolean field10128 = false;
   @deob.ObfuscatedName("ys.bo")
   public class597 field10005 = new class597();
   @deob.ObfuscatedName("ys.bj")
   private class597 field10006 = new class597();
   @deob.ObfuscatedName("ys.bv")
   private class597 field10007 = this.field10006;
   @deob.ObfuscatedName("ys.bd")
   public class597 field10008 = new class597();
   @deob.ObfuscatedName("ys.bi")
   public class597 field10009 = new class597();
   @deob.ObfuscatedName("ys.bz")
   public class597 field10076 = new class597();
   @deob.ObfuscatedName("ys.bt")
   public float[][] field9991 = new float[6][4];
   @deob.ObfuscatedName("ys.cm")
   protected float field10016 = 0.0F;
   @deob.ObfuscatedName("ys.co")
   protected float field10118 = 1.0F;
   @deob.ObfuscatedName("ys.ca")
   private float field10018 = 0.0F;
   @deob.ObfuscatedName("ys.ce")
   private float field10110 = 1.0F;
   @deob.ObfuscatedName("ys.cf")
   protected float field10020 = 50.0F;
   @deob.ObfuscatedName("ys.cj")
   protected float field10021 = 3584.0F;
   @deob.ObfuscatedName("ys.cw")
   protected int field10022 = 0;
   @deob.ObfuscatedName("ys.cd")
   protected int field10023 = 0;
   @deob.ObfuscatedName("ys.ck")
   protected int field10024 = 0;
   @deob.ObfuscatedName("ys.cs")
   protected int field9966 = 0;
   @deob.ObfuscatedName("ys.cg")
   private int field10026 = 0;
   @deob.ObfuscatedName("ys.cp")
   private int field10027 = 0;
   @deob.ObfuscatedName("ys.cv")
   private int field10028 = 0;
   @deob.ObfuscatedName("ys.cr")
   private int field10029 = 0;
   @deob.ObfuscatedName("ys.cc")
   protected int field10030 = 0;
   @deob.ObfuscatedName("ys.cx")
   protected int field10031 = 0;
   @deob.ObfuscatedName("ys.ch")
   protected int field10032 = 0;
   @deob.ObfuscatedName("ys.cu")
   protected int field10061 = 0;
   @deob.ObfuscatedName("ys.cy")
   protected int field10034 = 0;
   @deob.ObfuscatedName("ys.cl")
   protected int field10035 = 0;
   @deob.ObfuscatedName("ys.cb")
   public boolean field10036 = true;
   @deob.ObfuscatedName("ys.ci")
   protected boolean field10037 = false;
   @deob.ObfuscatedName("ys.cz")
   protected boolean field10038 = false;
   @deob.ObfuscatedName("ys.ct")
   public boolean field10004 = false;
   @deob.ObfuscatedName("ys.cn")
   protected boolean field10075 = true;
   @deob.ObfuscatedName("ys.cq")
   protected boolean field10090 = false;
   @deob.ObfuscatedName("ys.dr")
   public float[] field10042 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
   @deob.ObfuscatedName("ys.do")
   protected float[] field10043 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
   @deob.ObfuscatedName("ys.df")
   private float[] field10044 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
   @deob.ObfuscatedName("ys.dk")
   private float[] field9965 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
   @deob.ObfuscatedName("ys.de")
   private int field10046 = 16777215;
   @deob.ObfuscatedName("ys.dp")
   public float field10047 = 1.0F;
   @deob.ObfuscatedName("ys.dh")
   public float field10048 = 1.0F;
   @deob.ObfuscatedName("ys.dc")
   public float field10058 = 1.0F;
   @deob.ObfuscatedName("ys.dw")
   public float field10050 = 1.0F;
   @deob.ObfuscatedName("ys.ds")
   public float field10051 = -1.0F;
   @deob.ObfuscatedName("ys.dm")
   public float field9996 = -1.0F;
   @deob.ObfuscatedName("ys.dv")
   public int field10040 = 8;
   @deob.ObfuscatedName("ys.dj")
   public int field10057 = 3;
   @deob.ObfuscatedName("ys.dl")
   protected int field10113 = 0;
   @deob.ObfuscatedName("ys.ee")
   private boolean field10095 = false;
   @deob.ObfuscatedName("ys.eu")
   private final class486[] field10000 = new class486[16];
   @deob.ObfuscatedName("ys.ez")
   private final class499[] field10086 = new class499[2];
   @deob.ObfuscatedName("ys.ev")
   private boolean field10107 = false;
   @deob.ObfuscatedName("ys.ey")
   protected boolean field10093 = true;
   @deob.ObfuscatedName("ys.fs")
   public int field10112 = -1;
   @deob.ObfuscatedName("ys.fk")
   public int field10065 = -1;
   @deob.ObfuscatedName("ys.fc")
   protected int field10041 = 0;
   @deob.ObfuscatedName("ys.fo")
   private int field10053 = 1;
   @deob.ObfuscatedName("ys.fz")
   protected class513 field10100 = class513.field4079;
   @deob.ObfuscatedName("ys.fb")
   protected boolean field10101 = true;
   @deob.ObfuscatedName("ys.ft")
   protected boolean field10102 = true;
   @deob.ObfuscatedName("ys.fq")
   private boolean field10106 = false;
   @deob.ObfuscatedName("ys.gv")
   public class981[] field10056;
   @deob.ObfuscatedName("ys.gw")
   public class981[] field10126;
   @deob.ObfuscatedName("ys.gz")
   private class597 field10127;
   @deob.ObfuscatedName("ys.gc")
   private class583 field10094;
   @deob.ObfuscatedName("ys.gr")
   protected int field10130;
   @deob.ObfuscatedName("ys.al")
   private final class612 field10089;
   @deob.ObfuscatedName("ys.fr")
   public final int field10103;
   @deob.ObfuscatedName("ys.fe")
   public int field10108;
   @deob.ObfuscatedName("ys.dy")
   public final class506 field10067;
   @deob.ObfuscatedName("ys.ag")
   public int[] field9974;
   @deob.ObfuscatedName("ys.ab")
   public Unsafe field9978;
   @deob.ObfuscatedName("ys.ak")
   public ByteBuffer field9975;
   @deob.ObfuscatedName("ys.aa")
   public long field9976;
   @deob.ObfuscatedName("ys.be")
   public float field10012;
   @deob.ObfuscatedName("ys.bb")
   public float field10013;
   @deob.ObfuscatedName("ys.bu")
   public float field10014;
   @deob.ObfuscatedName("ys.bl")
   public float field10015;
   @deob.ObfuscatedName("ys.fl")
   public float field10060;
   @deob.ObfuscatedName("ys.fn")
   public float field10109;
   @deob.ObfuscatedName("ys.ar")
   public int field10017;
   @deob.ObfuscatedName("ys.di")
   public int field10019;
   @deob.ObfuscatedName("ys.db")
   public int field10045;
   @deob.ObfuscatedName("ys.dt")
   protected int field10055;
   @deob.ObfuscatedName("ys.fu")
   public int field10099;
   @deob.ObfuscatedName("ys.ff")
   public int field10104;
   @deob.ObfuscatedName("ys.fj")
   private int field10105;
   @deob.ObfuscatedName("ys.eb")
   public int field9963;
   @deob.ObfuscatedName("ys.dd")
   protected int field9969;
   @deob.ObfuscatedName("ys.fd")
   protected int field9982;
   @deob.ObfuscatedName("ys.as")
   public int field9983;
   @deob.ObfuscatedName("ys.au")
   protected int field9984;
   @deob.ObfuscatedName("ys.dx")
   public int field9993;
   @deob.ObfuscatedName("ys.em")
   public class201 field10082;
   @deob.ObfuscatedName("ys.eo")
   public class203 field10081;
   @deob.ObfuscatedName("ys.ex")
   public class203 field10125;
   @deob.ObfuscatedName("ys.ep")
   private class402 field10091;
   @deob.ObfuscatedName("ys.ek")
   public class447 field10033;
   @deob.ObfuscatedName("ys.ei")
   public class463 field9968;
   @deob.ObfuscatedName("ys.ew")
   public class475 field10077;
   @deob.ObfuscatedName("ys.ae")
   private class481 field9999;
   @deob.ObfuscatedName("ys.er")
   private class486 field10074;
   @deob.ObfuscatedName("ys.el")
   public class487 field10078;
   @deob.ObfuscatedName("ys.fw")
   private class494 field10096;
   @deob.ObfuscatedName("ys.gj")
   public class505 field10039;
   @deob.ObfuscatedName("ys.fx")
   private class505 field10119;
   @deob.ObfuscatedName("ys.gu")
   public class505 field10120;
   @deob.ObfuscatedName("ys.gi")
   public class505 field10121;
   @deob.ObfuscatedName("ys.gn")
   public class505 field10122;
   @deob.ObfuscatedName("ys.fh")
   private class508 field10073;
   @deob.ObfuscatedName("ys.fa")
   private class508 field10116;
   @deob.ObfuscatedName("ys.fm")
   public class508 field10117;
   @deob.ObfuscatedName("ys.ea")
   public class511 field10068;
   @deob.ObfuscatedName("ys.ef")
   private class511 field10069;
   @deob.ObfuscatedName("ys.ec")
   public class512 field10079;
   @deob.ObfuscatedName("ys.en")
   private class516 field10054;
   @deob.ObfuscatedName("ys.gb")
   private class534 field10124;
   @deob.ObfuscatedName("ys.es")
   private class961 field10070;
   @deob.ObfuscatedName("ys.ed")
   private class961 field10071;
   @deob.ObfuscatedName("ys.eh")
   private class974 field9989;
   @deob.ObfuscatedName("ys.az")
   private NativeHeap field9980;
   @deob.ObfuscatedName("ys.gy")
   protected boolean field10072;
   @deob.ObfuscatedName("ys.fi")
   public boolean field10080;
   @deob.ObfuscatedName("ys.eq")
   public boolean field10088;
   @deob.ObfuscatedName("ys.eg")
   protected boolean field10092;
   @deob.ObfuscatedName("ys.fy")
   public boolean field10111;
   @deob.ObfuscatedName("ys.fp")
   protected boolean field10114;
   @deob.ObfuscatedName("ys.fg")
   public boolean field10115;
   @deob.ObfuscatedName("ys.fv")
   public boolean field9972;
   @deob.ObfuscatedName("ys.an")
   public boolean field9973;
   @deob.ObfuscatedName("ys.du")
   protected class503[] field10063;
   @deob.ObfuscatedName("ys.dz")
   protected class517[] field10025;
   @deob.ObfuscatedName("ys.dn")
   protected class517[] field10064;
   @deob.ObfuscatedName("ys.da")
   private class536[] field10049;
   @deob.ObfuscatedName("ys.dg")
   protected class597[] field10062;
   @deob.ObfuscatedName("ys.dq")
   public class81[] field9962;

   protected class979(class637 arg0, class612 arg1, int arg2, int arg3) {
      super(arg0);
      new Stream();
      this.field10056 = new class981[7];
      this.field10126 = new class981[7];
      this.field10127 = new class597();
      this.field10094 = new class583();
      this.field10130 = -1;

      try {
         this.field10089 = arg1;
         this.field10103 = arg2;
         this.field10108 = arg3;
         class789.method6469(false, true);
         if (this.field7118 != null) {
            this.field10067 = new class506(this, this.field7118);
         } else {
            this.field10067 = null;
         }

         if (this.field10108 == 0) {
            this.field9974 = Statics.field7196;
         } else {
            this.field9974 = Statics.field7193;
         }

         try {
            Field var5 = Unsafe.class.getDeclaredField("theUnsafe");
            var5.setAccessible(true);
            this.field9978 = (Unsafe)var5.get((Object)null);
         } catch (Exception var8) {
         }

         this.field9975 = ByteBuffer.allocateDirect(4194304);
         this.field9975.order(ByteOrder.nativeOrder());
         this.field9976 = DirectBufferHelper.getDirectBufferAddress(this.field9975);
      } catch (Throwable var9) {
         var9.printStackTrace();
         this.method11494();
         if (var9 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var9;
         }

         throw new RuntimeException("");
      }

      this.method7709(this.method7526(131072));
   }

   @deob.ObfuscatedName("ys.n(Lgg;)V")
   public void method16317(class473 arg0) {
      this.field10129.method15895(arg0, field10010);
   }

   @deob.ObfuscatedName("ys.k(Lgg;)V")
   public void method16305(class473 arg0) {
      this.field10129.method15893(arg0);
   }

   @deob.ObfuscatedName("ys.d()V")
   private void method16306() {
      ArrayList var1 = this.field10129.method15896();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class473 var3 = (class473)var2.next();
         var3.method302();
      }

   }

   @deob.ObfuscatedName("ys.q()Z")
   private final boolean method16518() {
      return this.field9973;
   }

   @deob.ObfuscatedName("ys.da(Ljava/lang/String;Ljava/lang/String;)[B")
   protected byte[] method16308(String arg0, String arg1) {
      return this.field10089.method8823(arg0, arg1);
   }

   @deob.ObfuscatedName("ys.ma([B)Leb;")
   protected class414 method16391(byte[] arg0) {
      if (arg0 == null) {
         return null;
      } else {
         try {
            return new class414(arg0);
         } catch (Exception var3) {
            return null;
         }
      }
   }

   @deob.ObfuscatedName("ys.ne()Z")
   public static boolean method16309() {
      return class926.method5940().method9973("jaclib");
   }

   @deob.ObfuscatedName("ys.np()V")
   public final void method16310() {
      this.field10049 = new class536[this.field10099];
      this.field10062 = new class597[this.field10099];
      this.field10063 = new class503[this.field10099];
      this.field10064 = new class517[this.field10099];
      this.field10025 = new class517[this.field10099];

      for(int var1 = 0; var1 < this.field10099; ++var1) {
         this.field10025[var1] = class517.field4109;
         this.field10064[var1] = class517.field4109;
         this.field10063[var1] = class503.field4043;
         this.field10062[var1] = new class597();
      }

      this.field9962 = new class81[this.field9982 - 2];
      int[] var2 = new int[]{-1};
      this.field10068 = this.method2542(1, 1, false, var2, 0, 0);
      var2[0] = -16777216;
      this.field10069 = this.method2542(1, 1, false, var2, 0, 0);
      this.method7709(new class204(262144));
      this.field10039 = this.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3990})});
      this.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3988})});
      this.field10122 = this.method2571(new class509[]{new class509(class496.field3995), new class509(class496.field3988), new class509(class496.field3990), new class509(class496.field3993)});
      this.field10121 = this.method2571(new class509[]{new class509(class496.field3995), new class509(class496.field3988), new class509(class496.field3990)});

      for(int var3 = 0; var3 < 7; ++var3) {
         this.field10056[var3] = new class981(this, 0, 0, false, false);
         this.field10126[var3] = new class981(this, 0, 0, true, true);
      }

      this.method16311();
      this.field10124 = this.method2569(true);
      this.method2549();
      this.method2513();
      this.method7508();
      this.method2520();
      this.field10070 = new class961(this, this.field10068);
      this.field10071 = new class961(this, this.field10069);
      this.method2522(3, 0);
   }

   @deob.ObfuscatedName("ys.nk()V")
   private final void method16311() {
      this.field9999 = new class481(this);
      this.field9973 = false;

      try {
         this.field10033 = new class11(this);
         this.field10077 = new class28(this);
         this.field10078 = new class26(this);
         this.field9968 = new class14(this);
         this.field10125 = new class203(this, this.field9999, false);
         this.field10081 = new class203(this, this.field9999, true);
         this.field10082 = new class201(this, this.field9999);
      } catch (Exception var4) {
         var4.printStackTrace();
         this.field10033 = new class6(this);
         this.field10077 = new class21(this);
         this.field10078 = new class27(this);
         this.field9968 = new class20(this);
         this.field10125 = null;
         this.field10081 = null;
         this.field10082 = null;
         this.field9973 = true;
      }

      int var2;
      int var3;
      if (this.field7109 != null) {
         var2 = this.field7109.method566();
         var3 = this.field7109.method559();
      } else {
         var3 = 0;
         var2 = 0;
      }

      this.field10054 = new class516(this, var2, var3);
      if (!this.field9973) {
         this.field10086[1] = new class39(this);
         this.field10054.method7192(this.field10086[1]);
      }

      if (this.field10074 != null) {
         this.field10074.method768();
         this.field10074 = null;
      }

      this.method2501();
   }

   @deob.ObfuscatedName("ys.nl(I)Lgt;")
   public class486 method16312(int arg0) {
      return this.field10000[arg0];
   }

   @deob.ObfuscatedName("ys.nj()V")
   protected void method2549() {
      this.method2562(7);
      this.method16361();
   }

   @deob.ObfuscatedName("ys.na()V")
   private final void method16361() {
      this.method2533();
      this.method2534();
      this.method2697();
      this.method16345();
      this.method2535();
      this.method2732();
      this.method2536();
      this.method2529();
      this.method2531();
      this.method2566();
      this.method2550();
      this.method2565();
      this.method2509();
      this.method2563();

      for(int var1 = this.field10099 - 1; var1 >= 0; --var1) {
         this.method16351(var1);
         this.method2554();
         this.method2555();
         this.method16359();
      }

      this.method2558();
      this.method2523();
   }

   @deob.ObfuscatedName("ys.nr()V")
   protected void method2675() {
      this.field10054.method7199();
      this.field10117.method302();
      this.field10116.method302();
      this.field10073.method302();

      for(int var1 = 0; var1 < 7; ++var1) {
         this.field10126[var1].method16548();
      }

      this.field10096.method7082();
      this.field10124.method302();
      this.field10079.method7153();
      this.field10079 = null;
   }

   @deob.ObfuscatedName("ys.ny()V")
   protected void method2501() {
      this.field10054.method7193();

      for(int var1 = 0; var1 < this.field10086.length; ++var1) {
         if (this.field10086[var1] != null && this.field10086[var1].method7110()) {
            this.field10086[var1].method7114();
         }
      }

      this.field10096 = new class494(this);
      this.method16313();
      this.method16314();
      this.method16315();
      this.field10096.method7081(this);
      this.field10079 = new class512(this, 1024);
   }

   @deob.ObfuscatedName("ys.nc()V")
   private final void method16313() {
      this.field10117 = this.method2570(false);
      short var1 = 160;
      this.field10117.method728(var1, 32);
      this.field9975.clear();
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putInt(-1);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putInt(-1);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putInt(-1);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putInt(-1);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(1.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putInt(-1);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field10117.method700(0, this.field9975.position(), this.field9976);
      this.field10120 = this.method2571(new class509[]{new class509(new class496[]{class496.field3995, class496.field3988, class496.field3990, class496.field3990})});
   }

   @deob.ObfuscatedName("ys.nv()V")
   private final void method16314() {
      this.field10116 = this.method2570(true);
      this.field10116.method728(24, 12);
      this.field10119 = this.method2571(new class509[]{new class509(class496.field3995)});
   }

   @deob.ObfuscatedName("ys.ok()V")
   private final void method16315() {
      this.field10073 = this.method2570(false);
      this.field10073.method728(3096, 12);
      this.field9975.clear();
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);
      this.field9975.putFloat(0.0F);

      for(int var1 = 0; var1 <= 256; ++var1) {
         double var2 = (double)(var1 * 2) * 3.141592653589793D / 256.0D;
         float var4 = (float)Math.cos(var2);
         float var5 = (float)Math.sin(var2);
         this.field9975.putFloat(var5);
         this.field9975.putFloat(var4);
         this.field9975.putFloat(0.0F);
      }

      this.field10073.method700(0, this.field9975.position(), this.field9976);
   }

   @deob.ObfuscatedName("ys.ol(FFFFFF)Z")
   private boolean method16316(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      this.field9975.clear();
      this.field9975.putFloat(arg0);
      this.field9975.putFloat(arg1);
      this.field9975.putFloat(arg2);
      this.field9975.putFloat(arg3);
      this.field9975.putFloat(arg4);
      this.field9975.putFloat(arg5);
      return this.field10116.method700(0, this.field9975.position(), this.field9976);
   }

   @deob.ObfuscatedName("ys.e()V")
   protected void method2508() {
      if (!this.field10106) {
         this.method2675();
         this.field10067.method7118();

         for(class674 var1 = this.field9981.method14964(); var1 != null; var1 = this.field9981.method15006()) {
            ((class204)var1).method2847();
         }

         class789.method9269(false, true);

         for(int var2 = 0; var2 < this.field10000.length; ++var2) {
            if (this.field10000[var2] != null) {
               this.field10000[var2].method6876();
               this.field10000[var2] = null;
            }
         }

         for(int var3 = 0; var3 < this.field10086.length; ++var3) {
            if (this.field10086[var3] != null) {
               this.field10086[var3].method7112();
               this.field10086[var3] = null;
            }
         }

         this.method16306();
         this.method2580(0);
         this.field10106 = true;
      }

   }

   @deob.ObfuscatedName("ys.t()Z")
   public final boolean method7489() {
      return true;
   }

   @deob.ObfuscatedName("ys.w()Z")
   public final boolean method7490() {
      return true;
   }

   @deob.ObfuscatedName("ys.j()Z")
   public final boolean method7491() {
      return true;
   }

   @deob.ObfuscatedName("ys.ai()Z")
   public final boolean method7492() {
      return this.field10086[1] != null;
   }

   @deob.ObfuscatedName("ys.ap()Z")
   public final boolean method7668() {
      return true;
   }

   @deob.ObfuscatedName("ys.f()Z")
   public final boolean method7494() {
      return true;
   }

   @deob.ObfuscatedName("ys.ax()Z")
   public final boolean method7496() {
      return true;
   }

   @deob.ObfuscatedName("ys.af()Z")
   public final boolean method7497() {
      return true;
   }

   @deob.ObfuscatedName("ys.at()Z")
   public final boolean method7484() {
      return false;
   }

   @deob.ObfuscatedName("ys.av()Z")
   public final boolean method7495() {
      return this.field10114;
   }

   @deob.ObfuscatedName("ys.i(I)V")
   public void method2580(int arg0) {
      if (this.field10067 != null) {
         this.field10067.method7122();
      }

      this.field10104 = arg0 & Integer.MAX_VALUE;
   }

   @deob.ObfuscatedName("ys.of()Lgh;")
   public class474 method16323() {
      return this.field10079 == null ? class474.field3857 : this.field10079.method7152();
   }

   @deob.ObfuscatedName("ys.bu()V")
   public void method11515() {
      if (this.field10079 != null) {
         this.field10079.method7154();
      }

   }

   @deob.ObfuscatedName("ys.bl()V")
   public void method11513() {
      if (this.field10079 != null) {
         this.field10079.method7160();
      }

   }

   @deob.ObfuscatedName("ys.cm()V")
   public void method11514() {
      if (this.field10079 != null) {
         this.field10079.method7161();
      }

   }

   @deob.ObfuscatedName("ys.on()V")
   public void method16320() {
      this.method16469();
   }

   @deob.ObfuscatedName("ys.ou()V")
   public void method16469() {
      this.method16415();
      this.method16340();
      this.method16337();
      this.method7503();
      this.method7508();
   }

   @deob.ObfuscatedName("ys.cz()Z")
   public final boolean method7558() {
      if (this.field10086[1] != null && !this.field10086[1].method7110()) {
         boolean var1 = this.field10054.method7192(this.field10086[1]);
         if (var1) {
            this.field10067.method7118();
         }

         return var1;
      } else {
         return false;
      }
   }

   @deob.ObfuscatedName("ys.ct()V")
   public final void method7559() {
      if (this.field10086[1] != null && this.field10086[1].method7110()) {
         this.field10054.method7195(this.field10086[1]);
         this.field10067.method7118();
      }

   }

   @deob.ObfuscatedName("ys.cn()Z")
   public final boolean method7574() {
      return this.field10086[1] != null && this.field10086[1].method7110();
   }

   @deob.ObfuscatedName("ys.dr(FFFFFF)V")
   protected final void method7561(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      class39.field280 = arg0;
      class39.field275 = arg1;
      class39.field274 = arg2;
      class39.field276 = arg5;
   }

   @deob.ObfuscatedName("ys.do(IIII)V")
   public final void method7556(int arg0, int arg1, int arg2, int arg3) {
      this.field10054.method7209(arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ys.df()V")
   public final void method7557() {
      this.field10054.method7197();
   }

   @deob.ObfuscatedName("ys.bj(I)Lv;")
   public final class879 method7526(int arg0) {
      class204 var2 = new class204(arg0);
      this.field9981.method14959(var2);
      return var2;
   }

   @deob.ObfuscatedName("ys.bv(Lv;)V")
   public final void method7709(class879 arg0) {
      this.field9980 = ((class204)arg0).field1364;
   }

   @deob.ObfuscatedName("ys.oa(IZ)Ljaclib/memory/heap/NativeHeapBuffer;")
   public final NativeHeapBuffer method16322(int arg0, boolean arg1) {
      return this.field9980.method7793(arg0, arg1);
   }

   @deob.ObfuscatedName("ys.ot(I)Lin;")
   public final class534 method16446(int arg0) {
      if (this.field10124.method709() < arg0 * 2) {
         this.field10124.method695(arg0);
      }

      return this.field10124;
   }

   @deob.ObfuscatedName("ys.za()I")
   public final int method7488() {
      return this.field9983 + this.field10017 + this.field9984;
   }

   @deob.ObfuscatedName("ys.bi(IIZZ)Lcy;")
   public final class383 method7612(int arg0, int arg1, boolean arg2, boolean arg3) {
      return new class961(this, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ys.be(Ldv;Z)Lcy;")
   public final class383 method7529(class407 arg0, boolean arg1) {
      class383 var4;
      if (arg0.method5551() != 0 && arg0.method5554() != 0) {
         int[] var3 = arg0.method5555(false);
         var4 = this.method11534(var3, 0, arg0.method5551(), arg0.method5551(), arg0.method5554());
      } else {
         var4 = this.method11534(new int[]{0}, 0, 1, 1, 1);
      }

      var4.method5214(arg0.method5542(), arg0.method5544(), arg0.method5543(), arg0.method5545());
      return var4;
   }

   @deob.ObfuscatedName("ys.bz([IIIIIZ)Lcy;")
   public final class383 method7654(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class961(this, arg3, arg4, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ys.bb(IIIIZ)Lcy;")
   public final class383 method7530(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      class961 var6 = new class961(this, arg2, arg3, arg4, false);
      var6.method2389(0, 0, arg2, arg3, arg0, arg1);
      return var6;
   }

   @deob.ObfuscatedName("ys.ca(Lvd;[Lzk;Z)Ll;")
   public final class609 method7606(class883 arg0, class998[] arg1, boolean arg2) {
      return new class1000(this, arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("ys.co(II[I[I)Lta;")
   public final class826 method7531(int arg0, int arg1, int[] arg2, int[] arg3) {
      return class982.method16587(this, arg0, arg1, arg2, arg3);
   }

   @deob.ObfuscatedName("ys.cj(I)V")
   public final void method7695(int arg0) {
   }

   @deob.ObfuscatedName("ys.cw(Ldk;IIII)Lqa;")
   public final class745 method7528(class396 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class981(this, arg0, arg1, arg3, arg4, arg2);
   }

   @deob.ObfuscatedName("ys.cd(II)I")
   public final int method7534(int arg0, int arg1) {
      return arg0 & arg1 ^ arg1;
   }

   @deob.ObfuscatedName("ys.ck(II)I")
   public final int method7535(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @deob.ObfuscatedName("ys.cs(II[[I[[IIII)Lxa;")
   public final class934 method7536(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class970(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("ys.ce()Lko;")
   public final class597 method7509() {
      return this.field10127;
   }

   @deob.ObfuscatedName("ys.cf()Lka;")
   public final class583 method7763() {
      return this.field10094;
   }

   @deob.ObfuscatedName("ys.cl(IIIIII)Ldo;")
   public final class400 method7553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return new class192(this, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @deob.ObfuscatedName("ys.ci(Ldo;)V")
   public final void method7560(class400 arg0) {
      this.field9989 = (class974)arg0;
   }

   @deob.ObfuscatedName("ys.ob()Lio;")
   public final class535 method16497() {
      return this.field9989 != null ? this.field9989.method2488() : null;
   }

   @deob.ObfuscatedName("ys.ac()V")
   public void method7503() {
      this.field10026 = 0;
      this.field10027 = 0;
      this.field10028 = this.field7109.method566();
      this.field10029 = this.field7109.method559();
      this.method16498();
   }

   @deob.ObfuscatedName("ys.ay(IIII)V")
   public void method7505(int arg0, int arg1, int arg2, int arg3) {
      this.field10026 = arg0;
      this.field10027 = arg1;
      this.field10028 = arg2;
      this.field10029 = arg3;
      this.method16498();
   }

   @deob.ObfuscatedName("ys.op()V")
   private final void method16498() {
      if (class518.field4117 == this.field10087) {
         this.field10030 = this.field10026;
         this.field10031 = this.field10027;
         this.field10032 = this.field10028;
         this.field10061 = this.field10029;
         this.field10016 = this.field10018;
         this.field10118 = this.field10110;
      } else {
         this.field10030 = 0;
         this.field10031 = 0;
         this.field10032 = this.field7109.method566();
         this.field10061 = this.field7109.method559();
         this.field10016 = 0.0F;
         this.field10118 = 1.0F;
      }

      this.method2523();
      this.field10013 = (float)this.field10028 / 2.0F;
      this.field10015 = (float)this.field10029 / 2.0F;
      this.field10012 = (float)this.field10026 + this.field10013;
      this.field10014 = (float)this.field10027 + this.field10015;
   }

   @deob.ObfuscatedName("ys.GA(FF)V")
   public void method7507(float arg0, float arg1) {
      this.field10018 = arg0;
      this.field10110 = arg1;
      this.method16498();
   }

   @deob.ObfuscatedName("ys.qa([I)V")
   public final void method7511(int[] arg0) {
      arg0[0] = this.field10024;
      arg0[1] = this.field10022;
      arg0[2] = this.field9966;
      arg0[3] = this.field10023;
   }

   @deob.ObfuscatedName("ys.L()V")
   public final void method7508() {
      if (this.field7109 != null) {
         this.field10022 = 0;
         this.field10024 = 0;
         this.field9966 = this.field7109.method566();
         this.field10023 = this.field7109.method559();
      } else {
         this.field10023 = 0;
         this.field9966 = 0;
         this.field10022 = 0;
         this.field10024 = 0;
      }

      if (this.field10072) {
         this.field10072 = false;
         this.method2525();
      }

   }

   @deob.ObfuscatedName("ys.r(IIII)V")
   public final void method7716(int arg0, int arg1, int arg2, int arg3) {
      int var5;
      int var6;
      if (this.field7109 != null) {
         var5 = this.field7109.method566();
         var6 = this.field7109.method559();
      } else {
         var6 = 0;
         var5 = 0;
      }

      if (arg0 <= 0 && arg2 >= var5 - 1 && arg1 <= 0 && arg3 >= var6 - 1) {
         this.method7508();
      } else {
         this.field10024 = arg0 >= 0 ? arg0 : 0;
         this.field9966 = arg2 <= var5 ? arg2 : var5;
         this.field10022 = arg1 >= 0 ? arg1 : 0;
         this.field10023 = arg3 <= var6 ? arg3 : var6;
         if (!this.field10072 && (this.field10095 || this.method16323() == class474.field3857)) {
            this.field10072 = true;
            this.method2525();
         }

         this.method2765();
      }
   }

   @deob.ObfuscatedName("ys.o(IIII)V")
   public final void method7510(int arg0, int arg1, int arg2, int arg3) {
      int var5;
      int var6;
      if (this.field7109 != null) {
         var5 = this.field7109.method566();
         var6 = this.field7109.method559();
      } else {
         var6 = 0;
         var5 = 0;
      }

      int var7 = arg0 >= 0 ? arg0 : 0;
      int var8 = arg2 <= var5 ? arg2 : var5;
      int var9 = arg1 >= 0 ? arg1 : 0;
      int var10 = arg3 <= var6 ? arg3 : var6;
      boolean var11 = false;
      if (this.field10024 < var7) {
         this.field10024 = var7;
         var11 = true;
      }

      if (this.field9966 > var8) {
         this.field9966 = var8;
         var11 = true;
      }

      if (this.field10022 < var9) {
         this.field10022 = var9;
         var11 = true;
      }

      if (this.field10023 > var10) {
         this.field10023 = var10;
         var11 = true;
      }

      if (var11) {
         if (!this.field10072 && (this.field10095 || this.method16323() == class474.field3857)) {
            this.field10072 = true;
            this.method2525();
         }

         this.method2765();
      }

   }

   @deob.ObfuscatedName("ys.or(II)V")
   public final void method16329(int arg0, int arg1) {
      this.field10034 = arg0;
      this.field10035 = arg1;
      this.method2523();
      this.method2765();
   }

   @deob.ObfuscatedName("ys.bf(Z)V")
   public void method11504(boolean arg0) {
      this.field10095 = arg0;
   }

   @deob.ObfuscatedName("ys.oq()Lko;")
   public final class597 method16403() {
      return class518.field4117 == this.field10087 ? this.field10066 : field10011;
   }

   @deob.ObfuscatedName("ys.ox()Lko;")
   public final class597 method16331() {
      return class518.field4117 == this.field10087 ? this.field9970 : field10011;
   }

   @deob.ObfuscatedName("ys.cv(Lka;)V")
   public final void method7778(class583 arg0) {
      this.field9987 = arg0;
      this.field10066.method8391(this.field9987);
      this.field9988.method8089(arg0);
      this.field9988.method8130();
      this.field9970.method8391(this.field9988);
      this.method16471();
      if (class518.field4117 == this.field10087) {
         this.method16373();
      }

   }

   @deob.ObfuscatedName("ys.cr()Lka;")
   public class583 method7544() {
      return this.field9987;
   }

   @deob.ObfuscatedName("ys.cc(Lko;)V")
   public final void method7545(class597 arg0) {
      this.field10005.method8386(arg0);
      this.method16471();
      if (class518.field4117 == this.field10087) {
         this.method16342();
      }

   }

   @deob.ObfuscatedName("ys.oc()V")
   private final void method16471() {
      this.field10009.method8386(this.field10066);
      this.field10009.method8388(this.field10005);
      this.field10009.method8409(this.field9991[0]);
      this.field10009.method8410(this.field9991[1]);
      this.field10009.method8405(this.field9991[2]);
      this.field10009.method8406(this.field9991[3]);
      this.field10009.method8464(this.field9991[4]);
      this.field10009.method8408(this.field9991[5]);
      this.field10076.method8386(this.field10009);
      this.method2647(this.field10076);
   }

   @deob.ObfuscatedName("ys.cx()Lko;")
   public final class597 method7498() {
      return this.field10005;
   }

   @deob.ObfuscatedName("ys.oo()V")
   private final void method16373() {
      this.field10085 = false;
   }

   @deob.ObfuscatedName("ys.ow()Lko;")
   public class597 method16378() {
      return this.field9986;
   }

   @deob.ObfuscatedName("ys.om()Lka;")
   private class583 method16334() {
      if (class518.field4117 == this.field10087) {
         if (!this.field10085) {
            this.field10083.method8089(this.field9985);
            this.field10083.method8054(this.field9987);
            this.field9992.method8391(this.field10083);
            this.field10085 = true;
         }

         return this.field10083;
      } else {
         return this.field9985;
      }
   }

   @deob.ObfuscatedName("ys.oy()Lko;")
   public class597 method16335() {
      if (class518.field4117 == this.field10087) {
         if (!this.field10085) {
            this.method16334();
         }

         return this.field9992;
      } else {
         return this.field9986;
      }
   }

   @deob.ObfuscatedName("ys.oz()Lko;")
   public final class597 method16336() {
      return this.field10076;
   }

   @deob.ObfuscatedName("ys.oh()Lko;")
   public final class597 method16508() {
      return this.field10008;
   }

   @deob.ObfuscatedName("ys.ov()V")
   protected final void method16337() {
      if (class518.field4115 != this.field10087) {
         class518 var1 = this.field10087;
         this.field10087 = class518.field4115;
         if (class518.field4117 == var1) {
            this.method16373();
         }

         this.field10007 = this.field10006;
         this.method16342();
         this.method16498();
         this.field10105 &= -16;
      }

   }

   @deob.ObfuscatedName("ys.oi()V")
   public final void method16338() {
      if (class518.field4116 != this.field10087) {
         class518 var1 = this.field10087;
         this.field10087 = class518.field4116;
         if (class518.field4117 == var1) {
            this.method16373();
         }

         this.method16442();
         this.field10007 = this.field10002;
         this.method16342();
         this.method16498();
         this.field10105 &= -9;
      }

   }

   @deob.ObfuscatedName("ys.pb()V")
   private final void method16415() {
      this.field10001 = false;
      if (class518.field4116 == this.field10087) {
         this.method16442();
         this.method16342();
      }

   }

   @deob.ObfuscatedName("ys.pl()V")
   private final void method16339() {
      if (class518.field4117 != this.field10087) {
         this.field10087 = class518.field4117;
         this.method16373();
         this.method16352();
         this.field10007 = this.field10005;
         this.method16342();
         this.method16498();
         this.field10105 &= -8;
      }

   }

   @deob.ObfuscatedName("ys.pi()V")
   private final void method16340() {
      this.field10128 = false;
      this.method16352();
      if (class518.field4117 == this.field10087) {
         this.method16342();
      }

   }

   @deob.ObfuscatedName("ys.pc()V")
   private final void method16442() {
      if (!this.field10001) {
         int var1;
         int var2;
         if (this.field7109 != null) {
            var1 = this.field7109.method566();
            var2 = this.field7109.method559();
         } else {
            var2 = 0;
            var1 = 0;
         }

         class597 var3 = this.field10002;
         if (var1 != 0 && var2 != 0) {
            var3.method8397(0.0F, (float)var1, 0.0F, (float)var2, -1.0F, 1.0F);
         } else {
            var3.method8480();
         }

         this.field10003.method8386(var3);
         this.method2647(this.field10003);
         this.field10001 = true;
      }

   }

   @deob.ObfuscatedName("ys.pg()V")
   private final void method16352() {
      if (!this.field10128) {
         this.field10128 = true;
      }

   }

   @deob.ObfuscatedName("ys.ps()V")
   private final void method16342() {
      this.field10008.method8386(this.field10007);
      this.method2647(this.field10008);
      this.field10021 = (this.field10008.field5413[14] - this.field10008.field5413[15]) / (this.field10008.field5413[11] - this.field10008.field5413[10]);
      this.field10020 = -this.field10008.field5413[14] / this.field10008.field5413[10];
      this.method16365();
   }

   @deob.ObfuscatedName("ys.RA(Z)V")
   public final void method7551(boolean arg0) {
      this.field10036 = arg0;
      this.method2531();
   }

   @deob.ObfuscatedName("ys.pk(Z)V")
   protected final void method16420(boolean arg0) {
      if (this.field10038 != arg0) {
         this.field10038 = arg0;
         this.method2529();
         this.field10105 &= -16;
      }

   }

   @deob.ObfuscatedName("ys.pq(Z)V")
   protected final void method16381(boolean arg0) {
      if (this.field10037 != arg0) {
         this.field10037 = arg0;
         this.method2531();
         this.field10105 &= -16;
      }

   }

   @deob.ObfuscatedName("ys.dh(FFF[F)V")
   public void method7736(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field10009.field5413[11] * arg2 + this.field10009.field5413[7] * arg1 + this.field10009.field5413[3] * arg0 + this.field10009.field5413[15];
      float var6 = this.field10009.field5413[8] * arg2 + this.field10009.field5413[4] * arg1 + this.field10009.field5413[0] * arg0 + this.field10009.field5413[12];
      float var7 = this.field10009.field5413[9] * arg2 + this.field10009.field5413[5] * arg1 + this.field10009.field5413[1] * arg0 + this.field10009.field5413[13];
      float var8 = this.field10066.field5413[10] * arg2 + this.field10066.field5413[6] * arg1 + this.field10066.field5413[2] * arg0 + this.field10066.field5413[14];
      arg3[0] = this.field10013 * var6 / var5 + this.field10012;
      arg3[1] = this.field10015 * var7 / var5 + this.field10014;
      arg3[2] = var8;
   }

   @deob.ObfuscatedName("ys.dp(FFF[F)V")
   public void method7525(float arg0, float arg1, float arg2, float[] arg3) {
      float var5 = this.field10009.field5413[10] * arg2 + this.field10009.field5413[6] * arg1 + this.field10009.field5413[2] * arg0 + this.field10009.field5413[14];
      float var6 = this.field10009.field5413[11] * arg2 + this.field10009.field5413[7] * arg1 + this.field10009.field5413[3] * arg0 + this.field10009.field5413[15];
      if (!(var5 < -var6) && !(var5 > var6)) {
         float var7 = this.field10009.field5413[8] * arg2 + this.field10009.field5413[4] * arg1 + this.field10009.field5413[0] * arg0 + this.field10009.field5413[12];
         if (!(var7 < -var6) && !(var7 > var6)) {
            float var8 = this.field10009.field5413[9] * arg2 + this.field10009.field5413[5] * arg1 + this.field10009.field5413[1] * arg0 + this.field10009.field5413[13];
            if (!(var8 < -var6) && !(var8 > var6)) {
               float var9 = this.field10066.field5413[10] * arg2 + this.field10066.field5413[6] * arg1 + this.field10066.field5413[2] * arg0 + this.field10066.field5413[14];
               arg3[0] = this.field10013 * var7 / var6 + this.field10012;
               arg3[1] = this.field10015 * var8 / var6 + this.field10014;
               arg3[2] = var9;
            } else {
               arg3[2] = Float.NaN;
               arg3[1] = Float.NaN;
               arg3[0] = Float.NaN;
            }
         } else {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
         }
      } else {
         arg3[2] = Float.NaN;
         arg3[1] = Float.NaN;
         arg3[0] = Float.NaN;
      }
   }

   @deob.ObfuscatedName("ys.bo(IIIIII)I")
   public int method7523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = 0;
      float var8 = this.field10009.field5413[10] * (float)arg2 + this.field10009.field5413[6] * (float)arg1 + this.field10009.field5413[2] * (float)arg0 + this.field10009.field5413[14];
      float var9 = this.field10009.field5413[10] * (float)arg5 + this.field10009.field5413[6] * (float)arg4 + this.field10009.field5413[2] * (float)arg3 + this.field10009.field5413[14];
      float var10 = this.field10009.field5413[11] * (float)arg2 + this.field10009.field5413[7] * (float)arg1 + this.field10009.field5413[3] * (float)arg0 + this.field10009.field5413[15];
      float var11 = this.field10009.field5413[11] * (float)arg5 + this.field10009.field5413[7] * (float)arg4 + this.field10009.field5413[3] * (float)arg3 + this.field10009.field5413[15];
      if (var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if (var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.field10009.field5413[8] * (float)arg2 + this.field10009.field5413[4] * (float)arg1 + this.field10009.field5413[0] * (float)arg0 + this.field10009.field5413[12];
      float var13 = this.field10009.field5413[8] * (float)arg5 + this.field10009.field5413[4] * (float)arg4 + this.field10009.field5413[0] * (float)arg3 + this.field10009.field5413[12];
      if (var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if (var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.field10009.field5413[9] * (float)arg2 + this.field10009.field5413[5] * (float)arg1 + this.field10009.field5413[1] * (float)arg0 + this.field10009.field5413[13];
      float var15 = this.field10009.field5413[9] * (float)arg5 + this.field10009.field5413[5] * (float)arg4 + this.field10009.field5413[1] * (float)arg3 + this.field10009.field5413[13];
      if (var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if (var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   @deob.ObfuscatedName("ys.ch()I")
   public final int method7499() {
      return this.field9982 - 2;
   }

   @deob.ObfuscatedName("ys.pm(Z)V")
   public final void method16343(boolean arg0) {
      if (this.field10004 != arg0) {
         this.field10004 = arg0;
         this.method2697();
         this.field10105 &= -8;
      }

   }

   @deob.ObfuscatedName("ys.cy(I[Lacy;)V")
   public final void method7552(int arg0, class81[] arg1) {
      for(int var3 = 0; var3 < arg0; ++var3) {
         this.field9962[var3] = arg1[var3];
      }

      this.field10055 = arg0;
      if (class518.field4117 == this.field10087) {
         this.method16345();
      }

   }

   @deob.ObfuscatedName("ys.IA(F)V")
   public final void method7547(float arg0) {
      if (this.field10050 != arg0) {
         this.field10050 = arg0;
         this.method2533();
         this.method2732();
      }

   }

   @deob.ObfuscatedName("ys.m(IFFFFF)V")
   public final void method7588(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      boolean var7 = this.field10046 != arg0;
      if (var7 || this.field10051 != arg1 || this.field9996 != arg2) {
         this.field10046 = arg0;
         this.field10051 = arg1;
         this.field9996 = arg2;
         if (var7) {
            this.field10047 = (float)(this.field10046 & 16711680) / 1.671168E7F;
            this.field10048 = (float)(this.field10046 & 65280) / 65280.0F;
            this.field10058 = (float)(this.field10046 & 255) / 255.0F;
            this.method2533();
         }

         this.method2534();
      }

      if (this.field10044[0] != arg3 || this.field10044[1] != arg4 || this.field10044[2] != arg5) {
         this.field10044[0] = arg3;
         this.field10044[1] = arg4;
         this.field10044[2] = arg5;
         this.field9965[0] = -arg3;
         this.field9965[1] = -arg4;
         this.field9965[2] = -arg5;
         float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
         this.field10042[0] = arg3 * var8;
         this.field10042[1] = arg4 * var8;
         this.field10042[2] = arg5 * var8;
         this.field10043[0] = -this.field10042[0];
         this.field10043[1] = -this.field10042[1];
         this.field10043[2] = -this.field10042[2];
         this.method2535();
         this.field10019 = (int)(arg3 * 256.0F / arg4);
         this.field9993 = (int)(arg5 * 256.0F / arg4);
      }

      this.method2732();
   }

   @deob.ObfuscatedName("ys.J(I)V")
   public final void method7549(int arg0) {
      this.field10057 = 0;

      while(arg0 > 1) {
         ++this.field10057;
         arg0 >>= 1;
      }

      this.field10040 = 1 << this.field10057;
   }

   @deob.ObfuscatedName("ys.px()V")
   private final void method16345() {
      if (this.method16518()) {
         this.method2538();
      }

      this.field10045 = this.field10055;
      this.field10055 = 0;
   }

   @deob.ObfuscatedName("ys.pr(IIZ[I)Lhr;")
   public final class511 method16347(int arg0, int arg1, boolean arg2, int[] arg3) {
      return this.method2542(arg0, arg1, arg2, arg3, 0, 0);
   }

   @deob.ObfuscatedName("ys.pf(Lcn;IIZ[B)Lhr;")
   public final class511 method16348(class372 arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
      return this.method2543(arg0, arg1, arg2, arg3, arg4, 0, 0);
   }

   @deob.ObfuscatedName("ys.pv(Lcn;IIZ[F)Lhr;")
   public final class511 method16330(class372 arg0, int arg1, int arg2, boolean arg3, float[] arg4) {
      return this.method2544(arg0, arg1, arg2, arg3, arg4, 0, 0);
   }

   @deob.ObfuscatedName("ys.qn()I")
   public final int method16382() {
      return this.field10113;
   }

   @deob.ObfuscatedName("ys.qp(I)V")
   public final void method16351(int arg0) {
      if (this.field10113 != arg0) {
         this.field10113 = arg0;
         this.method2695();
      }

   }

   @deob.ObfuscatedName("ys.qx(Lip;)V")
   public final void method16470(class536 arg0) {
      if (this.field10049[this.field10113] != arg0) {
         this.field10049[this.field10113] = arg0;
         if (arg0 != null) {
            arg0.method502();
         } else {
            this.field10068.method502();
         }

         this.field10105 &= -2;
      }

   }

   @deob.ObfuscatedName("ys.qt(I)V")
   public final void method16353(int arg0) {
      switch(arg0) {
      case 0:
         this.method16328(class517.field4109, class517.field4109);
         break;
      case 1:
         this.method16328(class517.field4110, class517.field4110);
         break;
      case 2:
         this.method16328(class517.field4113, class517.field4110);
         break;
      case 3:
         this.method16328(class517.field4111, class517.field4109);
         break;
      case 4:
         this.method16328(class517.field4112, class517.field4112);
      }

   }

   @deob.ObfuscatedName("ys.ql(Lhx;Lhx;)V")
   public final void method16328(class517 arg0, class517 arg1) {
      boolean var3 = false;
      if (this.field10064[this.field10113] != arg0) {
         this.field10064[this.field10113] = arg0;
         this.method2554();
         var3 = true;
      }

      if (this.field10025[this.field10113] != arg1) {
         this.field10025[this.field10113] = arg1;
         this.method2555();
         var3 = true;
      }

      if (var3) {
         this.field10105 &= -14;
      }

   }

   @deob.ObfuscatedName("ys.qz(ILhk;)V")
   public final void method16355(int arg0, class504 arg1) {
      this.method2556(arg0, arg1, false, false);
   }

   @deob.ObfuscatedName("ys.qy(ILhk;)V")
   public final void method16356(int arg0, class504 arg1) {
      this.method2557(arg0, arg1, false);
   }

   @deob.ObfuscatedName("ys.qd(I)V")
   public void method16375(int arg0) {
      if (this.field9969 != arg0) {
         this.field9969 = arg0;
         this.method2558();
      }

   }

   @deob.ObfuscatedName("ys.qf()Lko;")
   public final class597 method16466() {
      return this.field10062[this.field10113];
   }

   @deob.ObfuscatedName("ys.qq()Lko;")
   public final class597 method16357() {
      return this.field10062[this.field10113];
   }

   @deob.ObfuscatedName("ys.qs(Lhj;)V")
   public final void method16358(class503 arg0) {
      this.field10063[this.field10113] = arg0;
      this.method16332();
   }

   @deob.ObfuscatedName("ys.qe()V")
   private final void method16359() {
      if (this.field10063[this.field10113] != class503.field4043) {
         this.field10063[this.field10113] = class503.field4043;
         this.field10062[this.field10113].method8480();
         this.method16332();
      }

   }

   @deob.ObfuscatedName("ys.qr()V")
   private final void method16332() {
      this.method2552();
   }

   @deob.ObfuscatedName("ys.ru()Ldq;")
   public class402 method16360() {
      return this.field10091;
   }

   @deob.ObfuscatedName("ys.dk(ILdq;)V")
   public final void method7565(int arg0, class402 arg1) {
      this.field9963 = arg0;
      this.field10091 = arg1;
      this.field10088 = true;
   }

   @deob.ObfuscatedName("ys.de(ILdq;)V")
   public final void method7562(int arg0, class402 arg1) {
      if (!this.field10088) {
         throw new RuntimeException("");
      } else {
         this.field9963 = arg0;
         this.field10091 = arg1;
         if (this.field10107) {
            this.field10000[3].method6867();
            this.field10000[3].method781();
         }

      }
   }

   @deob.ObfuscatedName("ys.O()V")
   public final void method7564() {
      this.field10088 = false;
   }

   @deob.ObfuscatedName("ys.rn(I)V")
   public final void method16521(int arg0) {
      if (this.field10053 != arg0) {
         class513 var2;
         boolean var3;
         boolean var4;
         if (arg0 == 1) {
            var2 = class513.field4079;
            var3 = true;
            var4 = true;
         } else if (arg0 == 2) {
            var2 = class513.field4080;
            var3 = false;
            var4 = true;
         } else if (arg0 == 128) {
            var2 = class513.field4083;
            var3 = true;
            var4 = true;
         } else {
            var2 = class513.field4081;
            var3 = false;
            var4 = false;
         }

         if (this.field10102 != var3) {
            this.field10102 = var3;
            this.method2563();
         }

         if (this.field10101 != var4) {
            this.field10101 = var4;
            this.method2565();
         }

         if (this.field10100 != var2) {
            this.field10100 = var2;
            this.method2509();
         }

         this.field10053 = arg0;
         this.field10105 &= -13;
      }

   }

   @deob.ObfuscatedName("ys.rj(I)V")
   public final void method16416(int arg0) {
      if (this.field10130 != arg0) {
         this.field10130 = arg0;
         this.method2509();
      }

   }

   @deob.ObfuscatedName("ys.rf(Z)V")
   protected final void method16364(boolean arg0) {
      if (this.field10092 != arg0) {
         this.field10092 = arg0;
         this.method2566();
         this.field10105 &= -16;
      }

   }

   @deob.ObfuscatedName("ys.c(III)V")
   public final void method7550(int arg0, int arg1, int arg2) {
      if (this.field10112 != arg0 || this.field10065 != arg1 || this.field10041 != arg2) {
         this.field10112 = arg0;
         this.field10065 = arg1;
         this.field10041 = arg2;
         this.method16365();
         this.method2566();
      }

   }

   @deob.ObfuscatedName("ys.ri()V")
   private final void method16365() {
      if (this.field10074 != null) {
         this.field10074.method781();
      }

      this.method2550();
   }

   @deob.ObfuscatedName("ys.DA(ILta;II)V")
   public final void method7593(int arg0, class826 arg1, int arg2, int arg3) {
      this.method7551(false);
      this.field10071.method5232(0.0F, 0.0F, (float)this.method11517().method566(), 0.0F, 0.0F, (float)this.method11517().method559(), 0, arg1, arg2, arg3);
      this.method7551(true);
   }

   @deob.ObfuscatedName("ys.B(IIIIII)V")
   public final void method7513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (this.field10036) {
         this.method7551(false);
         this.field10070.method5263(arg0, arg1, arg2, arg3, 0, arg4, arg5);
         this.method7551(true);
      } else {
         this.field10070.method5263(arg0, arg1, arg2, arg3, 0, arg4, arg5);
      }

   }

   @deob.ObfuscatedName("ys.bq(IIIIII)V")
   public final void method7751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var8 = arg2 - 1;
      int var9 = arg3 - 1;
      byte var7 = 0;
      if (this instanceof class214) {
         var7 = -1;
      }

      this.method7517(arg0, arg1 + var7, arg0 + var8, arg1 + var7, arg4, arg5);
      this.method7517(arg0, arg1 + var9 + var7, arg0 + var8, arg1 + var9 + var7, arg4, arg5);
      this.method7517(arg0, arg1, arg0, arg1 + var9, arg4, arg5);
      this.method7517(arg0 + var8, arg1, arg0 + var8, arg1 + var9, arg4, arg5);
   }

   @deob.ObfuscatedName("ys.N(IIIIII[BII)V")
   public final void method7769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
   }

   @deob.ObfuscatedName("ys.by(IIFIIFIIFIIII)V")
   public final void method7475(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @deob.ObfuscatedName("ys.CA(IIIII)V")
   protected final void method7519(int arg0, int arg1, int arg2, int arg3, int arg4) {
   }

   @deob.ObfuscatedName("ys.XA(IIIII)V")
   public final void method7514(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method7517(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
   }

   @deob.ObfuscatedName("ys.G(IIIII)V")
   public final void method7516(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method7517(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
   }

   @deob.ObfuscatedName("ys.bx(IIIIII)V")
   public final void method7517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method7727(arg0, arg1, arg2, arg3, arg4, 1, arg5);
   }

   @deob.ObfuscatedName("ys.bh(IIIIIIIII)V")
   public void method7522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      float var10 = (float)arg2 - (float)arg0;
      float var11 = (float)arg3 - (float)arg1;
      float var12;
      if (var10 == 0.0F && var11 == 0.0F) {
         var12 = 1.0F;
      } else {
         float var13 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11)));
         var12 = var10 * var13;
         var11 *= var13;
      }

      this.method16338();
      class486 var14 = this.field10000[13];
      var14.method766();
      var14.method6870(arg4);
      this.method16521(arg5);
      var14.method777();
      this.method2607(false);
      int var15 = arg8 % (arg6 + arg7);
      float var16 = (float)arg6 * var12;
      float var17 = (float)arg6 * var11;
      float var18 = 0.0F;
      float var19 = 0.0F;
      float var20 = var16;
      float var21 = var17;
      if (var15 > arg6) {
         var18 = (float)(arg6 + arg7 - var15) * var12;
         var19 = (float)(arg6 + arg7 - var15) * var11;
      } else {
         var20 = (float)(arg6 - var15) * var12;
         var21 = (float)(arg6 - var15) * var11;
      }

      float var22 = (float)arg0 + var18;
      float var23 = (float)arg1 + var19;
      float var24 = (float)arg7 * var12;
      float var25 = (float)arg7 * var11;

      while(true) {
         if (arg2 > arg0) {
            if (var22 > (float)arg2) {
               break;
            }

            if (var20 + var22 > (float)arg2) {
               var20 = (float)arg2 - var22;
            }
         } else {
            if (var22 < (float)arg2) {
               break;
            }

            if (var20 + var22 < (float)arg2) {
               var20 = (float)arg2 - var22;
            }
         }

         if (arg3 > arg1) {
            if (var23 > (float)arg3) {
               break;
            }

            if (var21 + var23 > (float)arg3) {
               var21 = (float)arg3 - var23;
            }
         } else {
            if (var23 < (float)arg3) {
               break;
            }

            if (var21 + var23 < (float)arg3) {
               var21 = (float)arg3 - var23;
            }
         }

         if (!this.method16316(var22, var23, 0.0F, var20 + var22, var21 + var23, 0.0F)) {
            return;
         }

         this.method16366();
         var22 += var20 + var24;
         var23 += var21 + var25;
         var20 = var16;
         var21 = var17;
      }

      this.method2607(true);
      var14.method768();
   }

   @deob.ObfuscatedName("ys.bn(IIIIIILta;IIIII)V")
   public void method7521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @deob.ObfuscatedName("ys.bm(IIIIIILta;II)V")
   public final void method7518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class826 arg6, int arg7, int arg8) {
   }

   @deob.ObfuscatedName("ys.bk(IIIIIII)V")
   public final void method7727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = (int)((float)arg0 + 1.0F);
      int var9 = (int)((float)arg1 + 1.0F);
      int var10 = (int)((float)arg2 + 1.0F);
      int var11 = (int)((float)arg3 + 1.0F);
      float var12 = (float)(var10 - var8);
      float var13 = (float)(var11 - var9);
      float var14 = 1.0F / (float)Math.sqrt((double)(var12 * var12 + var13 * var13));
      float var15 = var12 * var14;
      float var16 = var13 * var14;
      int var17 = (int)((float)var8 - var15);
      int var18 = (int)((float)var9 - var16);
      float var19 = -var16;
      float var21 = (float)arg5 * 0.5F * var19;
      float var22 = (float)arg5 * 0.5F * var15;
      this.field10070.method5230((float)var17 - var21, (float)var18 - var22, (float)var10 - var21, (float)var11 - var22, (float)var17 + var21, (float)var18 + var22, 0, arg4, arg6);
   }

   @deob.ObfuscatedName("ys.cp(Ldf;)V")
   public final void method7542(class391 arg0) {
      this.field10096.method7083(this, arg0);
   }

   @deob.ObfuscatedName("ys.rq()V")
   private final void method16366() {
      this.method2539(0, this.field10116);
      this.method2572(this.field10119);
      this.method2575(class522.field4134, 0, 1);
   }

   @deob.ObfuscatedName("ys.rh()V")
   public final void method16362() {
      this.method16402(class522.field4129, 2);
   }

   @deob.ObfuscatedName("ys.rl(Lib;I)V")
   private final void method16402(class522 arg0, int arg1) {
      this.method2539(0, this.field10117);
      this.method2572(this.field10120);
      this.method2575(arg0, 0, arg1);
   }

   @deob.ObfuscatedName("ys.ry()V")
   public final void method16368() {
      if (this.field10105 != 2) {
         this.method16338();
         this.method16364(false);
         this.method16343(false);
         this.method16420(false);
         this.method16381(false);
         this.field10105 = 2;
      }

   }

   @deob.ObfuscatedName("ys.sq()V")
   public final void method16383() {
      if (this.field10105 != 8) {
         this.method16339();
         this.method16364(true);
         this.method16420(true);
         this.method16381(true);
         this.method16521(1);
         this.field10105 = 8;
      }

   }

   @deob.ObfuscatedName("ys.h()Z")
   public abstract boolean method2631();

   @deob.ObfuscatedName("ys.y(Ljava/lang/String;)Lev;")
   public abstract class434 method2579(String arg0);

   @deob.ObfuscatedName("ys.nu(Lko;Lko;Lko;)V")
   public abstract void method2528(class597 arg0, class597 arg1, class597 arg2);

   @deob.ObfuscatedName("ys.pd()V")
   protected abstract void method2534();

   @deob.ObfuscatedName("ys.od()V")
   protected abstract void method2523();

   @deob.ObfuscatedName("ys.oe()V")
   protected abstract void method2765();

   @deob.ObfuscatedName("ys.os(Lko;)V")
   public abstract void method2647(class597 arg0);

   @deob.ObfuscatedName("ys.pn()V")
   protected abstract void method2531();

   @deob.ObfuscatedName("ys.pw()V")
   protected abstract void method2697();

   @deob.ObfuscatedName("ys.pe()V")
   protected abstract void method2535();

   @deob.ObfuscatedName("ys.pu()V")
   protected abstract void method2538();

   @deob.ObfuscatedName("ys.pa()V")
   protected abstract void method2536();

   @deob.ObfuscatedName("ys.ph(Lcn;IIZ[BII)Lhr;")
   protected abstract class511 method2543(class372 arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6);

   @deob.ObfuscatedName("ys.qj(Lcn;IIZ[FII)Lhr;")
   protected abstract class511 method2544(class372 arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6);

   @deob.ObfuscatedName("ys.qu(IIZ[III)Lhr;")
   public abstract class511 method2542(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ys.qh(Lcn;IIIZ[B)Lga;")
   public abstract class467 method2547(class372 arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5);

   @deob.ObfuscatedName("ys.qk(Lcn;Ldt;II)Lii;")
   public abstract class529 method2545(class372 arg0, class405 arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ys.qb()V")
   public abstract void method2551();

   @deob.ObfuscatedName("ys.qg(ILhk;ZZ)V")
   protected abstract void method2556(int arg0, class504 arg1, boolean arg2, boolean arg3);

   @deob.ObfuscatedName("ys.qc(ILhk;Z)V")
   protected abstract void method2557(int arg0, class504 arg1, boolean arg2);

   @deob.ObfuscatedName("ys.qm()V")
   protected abstract void method2558();

   @deob.ObfuscatedName("ys.qo()V")
   protected abstract void method2552();

   @deob.ObfuscatedName("ys.qv()V")
   protected abstract void method2695();

   @deob.ObfuscatedName("ys.qw()V")
   protected abstract void method2554();

   @deob.ObfuscatedName("ys.rk()V")
   protected abstract void method2509();

   @deob.ObfuscatedName("ys.rc()V")
   protected abstract void method2565();

   @deob.ObfuscatedName("ys.rz()V")
   protected abstract void method2550();

   @deob.ObfuscatedName("ys.rw()V")
   protected abstract void method2566();

   @deob.ObfuscatedName("ys.rt(Z)V")
   protected abstract void method2607(boolean arg0);

   @deob.ObfuscatedName("ys.ro(Z)Lin;")
   public abstract class534 method2569(boolean arg0);

   @deob.ObfuscatedName("ys.rr()V")
   protected abstract void method2555();

   @deob.ObfuscatedName("ys.ra([Lhp;)Lhl;")
   public abstract class505 method2571(class509[] arg0);

   @deob.ObfuscatedName("ys.re(Lhl;)V")
   public abstract void method2572(class505 arg0);

   @deob.ObfuscatedName("ys.rx(ILho;)V")
   public abstract void method2539(int arg0, class508 arg1);

   @deob.ObfuscatedName("ys.rp(Lin;)V")
   public abstract void method2624(class534 arg0);

   @deob.ObfuscatedName("ys.pj(Lcn;Ldt;)Z")
   public abstract boolean method2735(class372 arg0, class405 arg1);

   @deob.ObfuscatedName("ys.rg(Lin;Lib;IIII)V")
   public abstract void method2736(class534 arg0, class522 arg1, int arg2, int arg3, int arg4, int arg5);

   @deob.ObfuscatedName("ys.rb(Lib;IIII)V")
   public abstract void method2577(class522 arg0, int arg1, int arg2, int arg3, int arg4);

   @deob.ObfuscatedName("ys.sg(I)V")
   public abstract void method2500(int arg0);

   @deob.ObfuscatedName("ys.po()V")
   protected abstract void method2732();

   @deob.ObfuscatedName("ys.rv()V")
   protected abstract void method2563();

   @deob.ObfuscatedName("ys.rs(Lib;II)V")
   public abstract void method2575(class522 arg0, int arg1, int arg2);

   @deob.ObfuscatedName("ys.py(Lcn;Ldt;II)Lhr;")
   public abstract class511 method2541(class372 arg0, class405 arg1, int arg2, int arg3);

   @deob.ObfuscatedName("ys.og()F")
   public abstract float method2510();

   @deob.ObfuscatedName("ys.rm(Z)Lho;")
   public abstract class508 method2570(boolean arg0);

   @deob.ObfuscatedName("ys.pp()V")
   protected abstract void method2533();

   @deob.ObfuscatedName("ys.pz()V")
   protected abstract void method2529();

   @deob.ObfuscatedName("ys.pt(Lcn;Ldt;)Z")
   public abstract boolean method2540(class372 arg0, class405 arg1);

   @deob.ObfuscatedName("ys.z()Z")
   public abstract boolean method2498();

   @deob.ObfuscatedName("ys.qi(IZ[[I)Lio;")
   public abstract class535 method2596(int arg0, boolean arg1, int[][] arg2);

   @deob.ObfuscatedName("ys.rd(I)V")
   public abstract void method2562(int arg0);

   @deob.ObfuscatedName("ys.oj()V")
   protected abstract void method2525();
}
