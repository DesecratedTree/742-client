package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {
   static {
      init();
   }

   private static native void init();

   protected native void clear();
}
