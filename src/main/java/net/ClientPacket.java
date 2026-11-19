package net;

public class ClientPacket {
   private final int opcode;
   public final int size;
   private final String name;

   public ClientPacket(String arg0, int arg1, int arg2) {
      this.name = arg0;
      this.opcode = arg1;
      this.size = arg2;
   }

   public int getOpcode() {
      return this.opcode;
   }

   public String getName() {
      return this.name;
   }
}
