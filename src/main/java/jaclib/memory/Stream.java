package jaclib.memory;

public final class Stream {
   @deob.ObfuscatedName("jaclib/memory/Stream.p")
   private static final boolean field4411 = getLSB(-65536) == -1;
   @deob.ObfuscatedName("jaclib/memory/Stream.r")
   private final byte[] field4410;
   @deob.ObfuscatedName("jaclib/memory/Stream.k")
   private int field4407;
   @deob.ObfuscatedName("jaclib/memory/Stream.d")
   private int field4408;
   @deob.ObfuscatedName("jaclib/memory/Stream.b")
   private int field4409;
   @deob.ObfuscatedName("jaclib/memory/Stream.n")
   private Buffer field4406;

   public Stream() {
      this(4096);
   }

   private Stream(int arg0) {
      this.field4410 = new byte[arg0];
   }

   public Stream(Buffer arg0) {
      this(arg0, 0, arg0.method7782());
   }

   private Stream(Buffer arg0, int arg1, int arg2) {
      this(arg0.method7782() < 4096 ? arg0.method7782() : 4096);
      this.method7805(arg0, arg1, arg2);
   }

   @deob.ObfuscatedName("jaclib/memory/Stream.n(Ljaclib/memory/Buffer;II)V")
   private void method7805(Buffer arg0, int arg1, int arg2) {
      this.method7811();
      this.field4406 = arg0;
      this.field4408 = arg1;
      this.field4407 = arg1 + arg2;
      if (this.field4407 > arg0.method7782()) {
         throw new RuntimeException();
      }
   }

   @deob.ObfuscatedName("jaclib/memory/Stream.k()I")
   public int method7806() {
      return this.field4409 + this.field4408;
   }

   @deob.ObfuscatedName("jaclib/memory/Stream.d(I)V")
   public void method7807(int arg0) {
      this.method7811();
      this.field4408 = arg0;
   }

   @deob.ObfuscatedName("jaclib/memory/Stream.b(I)V")
   public void method7808(int arg0) {
      if (this.field4409 >= this.field4410.length) {
         this.method7811();
      }

      this.field4410[++this.field4409 - 1] = (byte)arg0;
   }

   @deob.ObfuscatedName("jaclib/memory/Stream.r(F)V")
   public void method7809(float arg0) {
      if (this.field4409 + 3 >= this.field4410.length) {
         this.method7811();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field4410[++this.field4409 - 1] = (byte)(var2 >> 24);
      this.field4410[++this.field4409 - 1] = (byte)(var2 >> 16);
      this.field4410[++this.field4409 - 1] = (byte)(var2 >> 8);
      this.field4410[++this.field4409 - 1] = (byte)var2;
   }

   @deob.ObfuscatedName("jaclib/memory/Stream.p(F)V")
   public void method7810(float arg0) {
      if (this.field4409 + 3 >= this.field4410.length) {
         this.method7811();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field4410[++this.field4409 - 1] = (byte)var2;
      this.field4410[++this.field4409 - 1] = (byte)(var2 >> 8);
      this.field4410[++this.field4409 - 1] = (byte)(var2 >> 16);
      this.field4410[++this.field4409 - 1] = (byte)(var2 >> 24);
   }

   @deob.ObfuscatedName("jaclib/memory/Stream.o()V")
   public void method7811() {
      if (this.field4409 > 0) {
         if (this.field4409 + this.field4408 > this.field4407) {
            throw new RuntimeException();
         }

         this.field4406.method7784(this.field4410, 0, this.field4408, this.field4409);
         this.field4408 += this.field4409;
         this.field4409 = 0;
      }

   }

   @deob.ObfuscatedName("jaclib/memory/Stream.a()Z")
   public static final boolean method7812() {
      return field4411;
   }

   public static native int floatToRawIntBits(float arg0);

   private static final native byte getLSB(int arg0);
}
