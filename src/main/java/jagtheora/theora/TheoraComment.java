package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {
   public TheoraComment() {
      this.init();
      if (this.method7855()) {
         throw new IllegalStateException();
      }
   }

   protected native void init();

   protected native void clear();
}
