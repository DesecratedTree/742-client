package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
   public VorbisBlock(DSPState arg0) {
      this.init(arg0);
      if (this.method7855()) {
         throw new IllegalStateException();
      }
   }

   private native void init(DSPState arg0);

   public native int synthesis(OggPacket arg0);

   protected native void clear();
}
