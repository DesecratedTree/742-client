import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

@deob.ObfuscatedName("ajn")
public class class259 extends class87 {
   @deob.ObfuscatedName("ajn.p")
   private final VorbisInfo field1729 = new VorbisInfo();
   @deob.ObfuscatedName("ajn.o")
   private final VorbisComment field1727 = new VorbisComment();
   @deob.ObfuscatedName("ajn.u")
   private double field1732;
   @deob.ObfuscatedName("ajn.v")
   private int field1726;
   @deob.ObfuscatedName("ajn.l")
   private class237 field1730;
   @deob.ObfuscatedName("ajn.s")
   private class639 field1733;
   @deob.ObfuscatedName("ajn.a")
   private DSPState field1728;
   @deob.ObfuscatedName("ajn.x")
   private VorbisBlock field1731;

   public class259(OggStreamState arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("ajn.k(Ljagtheora/ogg/OggPacket;I)V")
   protected void method1221(OggPacket arg0) {
      if (this.field664 < 3) {
         int var2 = this.field1729.headerIn(this.field1727, arg0);
         if (var2 < 0) {
            throw new IllegalStateException("" + var2);
         }

         if (this.field664 == 2) {
            if (this.field1729.channels > 2 || this.field1729.channels < 1) {
               throw new RuntimeException("" + this.field1729.channels);
            }

            this.field1728 = new DSPState(this.field1729);
            this.field1731 = new VorbisBlock(this.field1728);
            this.field1733 = new class639(this.field1729.rate, Statics.field5854);
            this.field1730 = new class237(this.field1729.channels);
         }
      } else {
         if (this.field1731.synthesis(arg0) == 0) {
            this.field1728.blockIn(this.field1731);
         }

         float[][] var3 = this.field1728.pcmOut(this.field1729.channels);
         this.field1732 = this.field1728.granuleTime();
         if (this.field1732 == -1.0D) {
            this.field1732 = (double)((float)this.field1726 / (float)this.field1729.rate);
         }

         this.field1728.read(var3[0].length);
         this.field1726 += var3[0].length;
         class100 var4 = this.field1730.method3321(var3[0].length, this.field1732);
         method4047(var3, var4.field775);

         for(int var5 = 0; var5 < this.field1729.channels; ++var5) {
            var4.field775[var5] = this.field1733.method9215(var4.field775[var5]);
         }

         this.field1730.method3329(var4);
      }

   }

   @deob.ObfuscatedName("at.l([[F[[SI)[[S")
   private static short[][] method4047(float[][] arg0, short[][] arg1) {
      for(int var2 = 0; var2 < arg0.length; ++var2) {
         for(int var3 = 0; var3 < arg1[var2].length; ++var3) {
            arg1[var2][var3] = (short)((int)(arg0[var2][var3] * 16383.0F));
         }
      }

      return arg1;
   }

   @deob.ObfuscatedName("ajn.u(I)Lais;")
   public class237 method3484() {
      return this.field1730;
   }

   @deob.ObfuscatedName("ajn.d(B)V")
   public void method1220() {
      if (this.field1731 != null) {
         this.field1731.method7856();
      }

      if (this.field1728 != null) {
         this.field1728.method7856();
      }

      this.field1727.method7856();
      this.field1729.method7856();
      if (this.field1730 != null) {
         this.field1730.method3322();
      }

   }

   @deob.ObfuscatedName("ajn.z(B)D")
   public double method3485() {
      double var1 = this.field1732;
      if (this.field1730 != null) {
         var1 = this.field1730.method3317();
         if (var1 < 0.0D) {
            var1 = this.field1732;
         }
      }

      return var1 - (double)(256.0F / (float)Statics.field5854);
   }

   @deob.ObfuscatedName("ajn.t(I)I")
   public int method3483() {
      return this.field1730 == null ? 0 : this.field1730.method3318();
   }
}
