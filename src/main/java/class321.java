@deob.ObfuscatedName("aq")
public class class321 {
   @deob.ObfuscatedName("aq.r")
   public float field2004 = 0.85F;
   @deob.ObfuscatedName("aq.p")
   public float field2018 = 1.0F - this.field2004;
   @deob.ObfuscatedName("aq.o")
   public int field2006 = 0;
   @deob.ObfuscatedName("aq.a")
   public int field2007 = 0;
   @deob.ObfuscatedName("aq.x")
   public boolean field2008 = false;
   @deob.ObfuscatedName("aq.s")
   public int field2039 = 0;
   @deob.ObfuscatedName("aq.l")
   public int field2010 = 0;
   @deob.ObfuscatedName("aq.u")
   public boolean field2011 = true;
   @deob.ObfuscatedName("aq.v")
   public class597 field2012 = new class597();
   @deob.ObfuscatedName("aq.g")
   public class583 field2013 = new class583();
   @deob.ObfuscatedName("aq.e")
   public class583 field2015 = new class583();
   @deob.ObfuscatedName("aq.z")
   public class597 field2016 = new class597();
   @deob.ObfuscatedName("aq.m")
   public class597 field2017 = new class597();
   @deob.ObfuscatedName("aq.i")
   public int[] field2029 = new int[class972.field9854];
   @deob.ObfuscatedName("aq.t")
   public float[] field2019 = new float[class972.field9854];
   @deob.ObfuscatedName("aq.c")
   public float[] field2020 = new float[class972.field9854];
   @deob.ObfuscatedName("aq.w")
   public float[] field2021 = new float[class972.field9854];
   @deob.ObfuscatedName("aq.q")
   public float[] field2009 = new float[class972.field9854];
   @deob.ObfuscatedName("aq.y")
   public int[] field2023 = new int[8];
   @deob.ObfuscatedName("aq.j")
   public int[] field2024 = new int[8];
   @deob.ObfuscatedName("aq.f")
   public int[] field2002 = new int[8];
   @deob.ObfuscatedName("aq.ai")
   public int[] field2036 = new int[10000];
   @deob.ObfuscatedName("aq.ap")
   public int[] field2027 = new int[10000];
   @deob.ObfuscatedName("aq.aw")
   public float field2033 = 1.0F;
   @deob.ObfuscatedName("aq.al")
   public float field2034 = 0.0F;
   @deob.ObfuscatedName("aq.an")
   public float field2035 = 1.0F;
   @deob.ObfuscatedName("aq.ak")
   public float[] field2000 = new float[2];
   @deob.ObfuscatedName("aq.aa")
   public class972[] field2038 = new class972[7];
   @deob.ObfuscatedName("aq.ao")
   public class972[] field2001 = new class972[7];
   @deob.ObfuscatedName("aq.ab")
   public float[] field2032 = new float[64];
   @deob.ObfuscatedName("aq.ae")
   public float[] field2025 = new float[64];
   @deob.ObfuscatedName("aq.az")
   public float[] field2005 = new float[64];
   @deob.ObfuscatedName("aq.aq")
   public float[] field2043 = new float[64];
   @deob.ObfuscatedName("aq.ar")
   public float[] field2044 = new float[64];
   @deob.ObfuscatedName("aq.as")
   public float[] field2026 = new float[3];
   @deob.ObfuscatedName("aq.n")
   private class984 field2042;
   @deob.ObfuscatedName("aq.h")
   public class350 field2014;
   @deob.ObfuscatedName("aq.av")
   public int[] field2028;
   @deob.ObfuscatedName("aq.ax")
   public float field2022;
   @deob.ObfuscatedName("aq.af")
   public float field2030;
   @deob.ObfuscatedName("aq.at")
   public float field2031;
   @deob.ObfuscatedName("aq.ah")
   public float field2041;
   @deob.ObfuscatedName("aq.ag")
   public int field2045;
   @deob.ObfuscatedName("aq.k")
   public Runnable field2040;
   @deob.ObfuscatedName("aq.b")
   public boolean field2003;

   public class321(class984 arg0) {
      this.field2042 = arg0;
      this.field2014 = new class350(arg0, this);

      for(int var2 = 0; var2 < 7; ++var2) {
         this.field2038[var2] = new class972(this.field2042);
         this.field2001[var2] = new class972(this.field2042);
      }

      this.field2028 = new int[class972.field9789];

      for(int var3 = 0; var3 < class972.field9789; ++var3) {
         this.field2028[var3] = -1;
      }

   }

   @deob.ObfuscatedName("aq.n(B)V")
   public void method3996() {
      this.field2014 = new class350(this.field2042, this);
   }

   @deob.ObfuscatedName("aq.k(Ljava/lang/Runnable;B)V")
   public void method3998(Runnable arg0) {
      this.field2040 = arg0;
   }
}
