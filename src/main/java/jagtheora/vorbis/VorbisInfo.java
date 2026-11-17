package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {
   public int channels;
   public int rate;

   static {
      initFields();
   }

   public VorbisInfo() {
      this.init();
      if (this.method7855()) {
         throw new IllegalStateException();
      }
   }

   private static native void initFields();

   protected native void init();

   public native int headerIn(VorbisComment arg0, OggPacket arg1);

   protected native void clear();
}
