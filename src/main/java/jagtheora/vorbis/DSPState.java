package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer {
   public DSPState(VorbisInfo arg0) {
      this.init(arg0);
      if (this.method7855()) {
         throw new IllegalStateException();
      }
   }

   private native void init(VorbisInfo arg0);

   public native void blockIn(VorbisBlock arg0);

   public native float[][] pcmOut(int arg0);

   public native void read(int arg0);

   public native double granuleTime();

   protected native void clear();
}
