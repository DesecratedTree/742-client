package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {
   public int fpsDenominator;
   public int fpsNumerator;
   public int frameHeight;
   public int frameWidth;

   static {
      initFields();
   }

   public TheoraInfo() {
      this.init();
      if (this.method7855()) {
         throw new IllegalStateException();
      }
   }

   private static native void initFields();

   protected native void init();

   protected native void clear();
}
