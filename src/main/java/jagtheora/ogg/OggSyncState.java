package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {
   public OggSyncState() {
      this.init();
      if (this.method7855()) {
         throw new IllegalStateException();
      }
   }

   protected native void init();

   public native boolean write(byte[] arg0, int arg1);

   private native long pageSeek(OggPage arg0);

   public native int pageOut(OggPage arg0);

   private native boolean reset();

   protected native void clear();
}
