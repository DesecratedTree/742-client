package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPage extends SimplePeer {
   private native long getGranulePos();

   public native int getSerialNumber();

   private native long getPageNumber();

   private native int getCompletedPackets();

   private native int getVersion();

   private native boolean isContinued();

   public native boolean isBOS();

   private native boolean isEOS();

   protected native void clear();
}
