import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@deob.ObfuscatedName("of")
public class class696 implements Runnable {
   @deob.ObfuscatedName("of.r")
   private int field6379 = 0;
   @deob.ObfuscatedName("of.p")
   private int field6381 = 0;
   @deob.ObfuscatedName("of.k")
   private InputStream field6377;
   @deob.ObfuscatedName("of.d")
   private int field6378;
   @deob.ObfuscatedName("of.b")
   private byte[] field6376;
   @deob.ObfuscatedName("of.n")
   private Thread field6380;
   @deob.ObfuscatedName("of.o")
   private IOException field6382;

   public class696(InputStream arg0, int arg1) {
      this.field6377 = arg0;
      this.field6378 = arg1 + 1;
      this.field6376 = new byte[this.field6378];
      this.field6380 = new Thread(this);
      this.field6380.setDaemon(true);
      this.field6380.start();
   }

   public void run() {
      while(true) {
         int var2;
         synchronized(this) {
            while(true) {
               if (this.field6382 != null) {
                  return;
               }

               if (this.field6379 == 0) {
                  var2 = this.field6378 - this.field6381 - 1;
               } else if (this.field6379 <= this.field6381) {
                  var2 = this.field6378 - this.field6381;
               } else {
                  var2 = this.field6379 - this.field6381 - 1;
               }

               if (var2 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }

         int var5;
         try {
            var5 = this.field6377.read(this.field6376, this.field6381, var2);
            if (var5 == -1) {
               throw new EOFException();
            }
         } catch (IOException var14) {
            IOException var6 = var14;
            synchronized(this) {
               this.field6382 = var6;
               return;
            }
         }

         synchronized(this) {
            this.field6381 = (this.field6381 + var5) % this.field6378;
         }
      }
   }

   @deob.ObfuscatedName("of.n(II)Z")
   public boolean method10181(int arg0) throws IOException {
      if (arg0 > 0 && arg0 < this.field6378) {
         synchronized(this) {
            int var3;
            if (this.field6379 <= this.field6381) {
               var3 = this.field6381 - this.field6379;
            } else {
               var3 = this.field6381 + (this.field6378 - this.field6379);
            }

            if (var3 < arg0) {
               if (this.field6382 != null) {
                  throw new IOException(this.field6382.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @deob.ObfuscatedName("of.k(B)I")
   public int method10183() throws IOException {
      synchronized(this) {
         int var2;
         if (this.field6379 <= this.field6381) {
            var2 = this.field6381 - this.field6379;
         } else {
            var2 = this.field6381 + (this.field6378 - this.field6379);
         }

         if (this.field6382 != null) {
            throw new IOException(this.field6382.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @deob.ObfuscatedName("of.d([BIII)I")
   public int method10184(byte[] arg0, int arg1, int arg2) throws IOException {
      if (arg2 >= 0 && arg1 >= 0 && arg1 + arg2 <= arg0.length) {
         synchronized(this) {
            int var5;
            if (this.field6379 <= this.field6381) {
               var5 = this.field6381 - this.field6379;
            } else {
               var5 = this.field6381 + (this.field6378 - this.field6379);
            }

            if (arg2 > var5) {
               arg2 = var5;
            }

            if (arg2 == 0 && this.field6382 != null) {
               throw new IOException(this.field6382.toString());
            } else {
               if (this.field6379 + arg2 <= this.field6378) {
                  System.arraycopy(this.field6376, this.field6379, arg0, arg1, arg2);
               } else {
                  int var6 = this.field6378 - this.field6379;
                  System.arraycopy(this.field6376, this.field6379, arg0, arg1, var6);
                  System.arraycopy(this.field6376, 0, arg0, arg1 + var6, arg2 - var6);
               }

               this.field6379 = (this.field6379 + arg2) % this.field6378;
               this.notifyAll();
               return arg2;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @deob.ObfuscatedName("of.b(I)V")
   public void method10193() {
      synchronized(this) {
         if (this.field6382 == null) {
            this.field6382 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field6380.join();
      } catch (InterruptedException var4) {
      }

   }

   @deob.ObfuscatedName("of.r(I)V")
   public void method10191() {
      this.field6377 = new class167();
   }
}
