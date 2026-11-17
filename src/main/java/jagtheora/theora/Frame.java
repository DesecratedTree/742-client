package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
   public int[] pixels;
   @deob.ObfuscatedName("jagtheora/theora/Frame.n")
   public final int field4772;
   @deob.ObfuscatedName("jagtheora/theora/Frame.k")
   public final int field4773;

   static {
      init();
   }

   public Frame(int arg0, int arg1) {
      this.field4772 = arg0;
      this.field4773 = arg1;
      this.pixels = new int[this.field4773 * this.field4772];
   }

   private static native void init();

   protected native void clear();
}
