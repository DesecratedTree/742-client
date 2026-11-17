import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

@deob.ObfuscatedName("add")
public abstract class class87 extends class674 {
   @deob.ObfuscatedName("add.b")
   public final OggStreamState field665;
   @deob.ObfuscatedName("add.r")
   public int field664;

   public class87(OggStreamState arg0) {
      this.field665 = arg0;
   }

   @deob.ObfuscatedName("add.n(Ljagtheora/ogg/OggPacket;I)V")
   public void method1224(OggPacket arg0) {
      this.method1221(arg0);
      ++this.field664;
   }

   @deob.ObfuscatedName("add.d(B)V")
   public abstract void method1220();

   @deob.ObfuscatedName("add.k(Ljagtheora/ogg/OggPacket;I)V")
   protected abstract void method1221(OggPacket arg0);
}
