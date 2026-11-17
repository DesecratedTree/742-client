package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
   public VorbisComment() {
      this.init();
      if (this.method7855()) {
         throw new IllegalStateException();
      }
   }

   protected native void init();

   protected native void clear();
}
