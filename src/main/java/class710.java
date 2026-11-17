import java.io.IOException;
import java.io.OutputStream;

@deob.ObfuscatedName("ot")
public class class710 implements Runnable {
   @deob.ObfuscatedName("ot.r")
   private int field6547 = 0;
   @deob.ObfuscatedName("ot.p")
   private int field6552 = 0;
   @deob.ObfuscatedName("ot.k")
   private OutputStream field6548;
   @deob.ObfuscatedName("ot.d")
   private int field6549;
   @deob.ObfuscatedName("ot.b")
   private byte[] field6551;
   @deob.ObfuscatedName("ot.n")
   private Thread field6550;
   @deob.ObfuscatedName("ot.o")
   private IOException field6553;
   @deob.ObfuscatedName("ot.a")
   private boolean field6554;

   public class710(OutputStream arg0, int arg1) {
      this.field6548 = arg0;
      this.field6549 = arg1 + 1;
      this.field6551 = new byte[this.field6549];
      this.field6550 = new Thread(this);
      this.field6550.setDaemon(true);
      this.field6550.start();
   }

   @deob.ObfuscatedName("ot.n(B)Z")
   private boolean method10448() {
      if (this.field6554) {
         try {
            this.field6548.close();
            if (this.field6553 == null) {
               this.field6553 = new IOException("");
            }
         } catch (IOException var2) {
            if (this.field6553 == null) {
               this.field6553 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var2;
         synchronized(this) {
            while(true) {
               if (this.field6553 != null) {
                  return;
               }

               if (this.field6547 <= this.field6552) {
                  var2 = this.field6552 - this.field6547;
               } else {
                  var2 = this.field6552 + (this.field6549 - this.field6547);
               }

               if (var2 > 0) {
                  break;
               }

               try {
                  this.field6548.flush();
               } catch (IOException var15) {
                  this.field6553 = var15;
                  return;
               }

               if (this.method10448()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var16) {
               }
            }
         }

         try {
            if (this.field6547 + var2 <= this.field6549) {
               this.field6548.write(this.field6551, this.field6547, var2);
            } else {
               int var6 = this.field6549 - this.field6547;
               this.field6548.write(this.field6551, this.field6547, var6);
               this.field6548.write(this.field6551, 0, var2 - var6);
            }
         } catch (IOException var14) {
            IOException var7 = var14;
            synchronized(this) {
               this.field6553 = var7;
               return;
            }
         }

         synchronized(this) {
            this.field6547 = (this.field6547 + var2) % this.field6549;
         }
      } while(!this.method10448());

   }

   @deob.ObfuscatedName("ot.k([BIII)V")
   public void method10449(byte[] arg0, int arg1, int arg2) throws IOException {
      if (arg2 >= 0 && arg1 >= 0 && arg1 + arg2 <= arg0.length) {
         synchronized(this) {
            if (this.field6553 != null) {
               throw new IOException(this.field6553.toString());
            } else {
               int var5;
               if (this.field6547 <= this.field6552) {
                  var5 = this.field6547 + (this.field6549 - this.field6552) - 1;
               } else {
                  var5 = this.field6547 - this.field6552 - 1;
               }

               if (var5 < arg2) {
                  throw new IOException("");
               } else {
                  if (this.field6552 + arg2 <= this.field6549) {
                     System.arraycopy(arg0, arg1, this.field6551, this.field6552, arg2);
                  } else {
                     int var6 = this.field6549 - this.field6552;
                     System.arraycopy(arg0, arg1, this.field6551, this.field6552, var6);
                     System.arraycopy(arg0, arg1 + var6, this.field6551, 0, arg2 - var6);
                  }

                  this.field6552 = (this.field6552 + arg2) % this.field6549;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @deob.ObfuscatedName("ot.d(I)V")
   public void method10457() {
      synchronized(this) {
         this.field6554 = true;
         this.notifyAll();
      }

      try {
         this.field6550.join();
      } catch (InterruptedException var4) {
      }

   }

   @deob.ObfuscatedName("ot.b(I)V")
   public void method10450() {
      this.field6548 = new class172();
   }
}
