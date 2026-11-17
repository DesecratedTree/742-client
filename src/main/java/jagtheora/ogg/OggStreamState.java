package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer {
   public OggStreamState(int arg0) {
      if (!this.init(arg0)) {
         throw new IllegalStateException();
      }
   }

   private native boolean init(int arg0);

   private native boolean isEOS();

   public native boolean pageIn(OggPage arg0);

   public native int packetOut(OggPacket arg0);

   public native int packetOut();

   public native int packetPeek(OggPacket arg0);

   private native int packetPeek();

   private native boolean resetSerialNo(int arg0);

   private native boolean reset();

   protected native void clear();
}
