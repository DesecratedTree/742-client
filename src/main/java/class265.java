import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

@deob.ObfuscatedName("ajt")
public class class265 extends class87 {
   @deob.ObfuscatedName("ajt.a")
   private final SetupInfo field1773 = new SetupInfo();
   @deob.ObfuscatedName("ajt.x")
   private final TheoraInfo field1762 = new TheoraInfo();
   @deob.ObfuscatedName("ajt.s")
   private final TheoraComment field1759 = new TheoraComment();
   @deob.ObfuscatedName("ajt.g")
   private double field1767;
   @deob.ObfuscatedName("ajt.m")
   private int field1771;
   @deob.ObfuscatedName("ajt.i")
   private int field1772;
   @deob.ObfuscatedName("ajt.h")
   private long field1768;
   @deob.ObfuscatedName("ajt.l")
   private DecoderContext field1770;
   @deob.ObfuscatedName("ajt.v")
   private Frame field1760;
   @deob.ObfuscatedName("ajt.u")
   private GranulePos field1765;
   @deob.ObfuscatedName("ajt.c")
   private Object field1769;
   @deob.ObfuscatedName("ajt.z")
   private boolean field1761;
   @deob.ObfuscatedName("ajt.t")
   private boolean field1763;
   @deob.ObfuscatedName("ajt.e")
   private boolean field1766;
   @deob.ObfuscatedName("ajt.w")
   private boolean field1775;

   public class265(OggStreamState arg0) {
      super(arg0);
   }

   @deob.ObfuscatedName("ajt.k(Ljagtheora/ogg/OggPacket;I)V")
   protected void method1221(OggPacket arg0) {
      if (!this.field1766) {
         int var2 = this.field1773.decodeHeader(this.field1762, this.field1759, arg0);
         if (var2 == 0) {
            this.field1766 = true;
            if (this.field1762.frameWidth > 2048 || this.field1762.frameHeight > 1024) {
               throw new IllegalStateException();
            }

            this.field1770 = new DecoderContext(this.field1762, this.field1773);
            this.field1765 = new GranulePos();
            this.field1760 = new Frame(this.field1762.frameWidth, this.field1762.frameHeight);
            this.field1771 = this.field1770.getMaxPostProcessingLevel();
            this.method3522(this.field1772);
         } else if (var2 < 0) {
            throw new IllegalStateException("" + var2);
         }
      } else {
         this.field1768 = class431.method2169();
         int var3 = this.field1770.decodePacketIn(arg0, this.field1765);
         if (var3 < 0) {
            throw new IllegalStateException("" + var3);
         }

         this.field1770.granuleFrame(this.field1765);
         this.field1767 = this.field1770.granuleTime(this.field1765);
         if (this.field1763) {
            boolean var4 = arg0.isKeyFrame() == 1;
            if (!var4) {
               return;
            }

            this.field1763 = false;
         }

         if (!this.field1761 || arg0.isKeyFrame() == 1) {
            if (this.field1770.decodeFrame(this.field1760) != 0) {
               throw new IllegalStateException("" + var3);
            }

            this.field1775 = true;
         }
      }

   }

   @deob.ObfuscatedName("ajt.l(IB)V")
   private void method3522(int arg0) {
      this.field1772 = arg0;
      if (this.field1766) {
         if (this.field1772 > this.field1771) {
            this.field1772 = this.field1771;
         }

         if (this.field1772 < 0) {
            this.field1772 = 0;
         }

         this.field1770.setPostProcessingLevel(this.field1772);
      }

   }

   @deob.ObfuscatedName("ajt.u(I)F")
   public float method3523() {
      return this.field1766 && !this.field1762.method7855() ? (float)this.field1762.fpsNumerator / (float)this.field1762.fpsDenominator : 0.0F;
   }

   @deob.ObfuscatedName("ajt.z(I)D")
   public double method3525() {
      return this.field1767;
   }

   @deob.ObfuscatedName("ajt.t(I)J")
   public long method3533() {
      return this.field1768;
   }

   @deob.ObfuscatedName("ajt.c(B)Z")
   public boolean method3527() {
      return this.field1766;
   }

   @deob.ObfuscatedName("ajt.d(B)V")
   public void method1220() {
      if (this.field1760 != null) {
         this.field1760.method7856();
      }

      if (this.field1770 != null) {
         this.field1770.method7856();
         this.field1770 = null;
      }

      if (this.field1765 != null) {
         this.field1765.method7856();
         this.field1765 = null;
      }

      this.field1762.method7856();
      this.field1759.method7856();
      this.field1773.method7856();
   }

   @deob.ObfuscatedName("ajt.w(Lnr;I)Ljava/lang/Object;")
   public Object method3521(class681 arg0) {
      if (this.field1760 == null) {
         return null;
      } else if (!this.field1775 && this.field1769 != null) {
         return this.field1769;
      } else {
         this.field1769 = arg0.method10002(this.field1760.pixels, 0, this.field1760.field4772, this.field1760.field4772, this.field1760.field4773, false);
         this.field1775 = false;
         return this.field1769;
      }
   }
}
