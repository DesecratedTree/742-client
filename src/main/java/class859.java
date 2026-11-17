import java.io.EOFException;
import java.io.IOException;

@deob.ObfuscatedName("ug")
public class class859 {
   @deob.ObfuscatedName("ug.b")
   private long field8773 = -1L;
   @deob.ObfuscatedName("ug.o")
   private long field8776 = -1L;
   @deob.ObfuscatedName("ug.a")
   private int field8777 = 0;
   @deob.ObfuscatedName("ug.k")
   private class860 field8771;
   @deob.ObfuscatedName("ug.s")
   private long field8774;
   @deob.ObfuscatedName("ug.l")
   private long field8780;
   @deob.ObfuscatedName("ug.d")
   private byte[] field8772;
   @deob.ObfuscatedName("ug.p")
   private byte[] field8779;
   @deob.ObfuscatedName("ug.x")
   private long field8778;
   @deob.ObfuscatedName("ug.r")
   private int field8770;
   @deob.ObfuscatedName("ug.u")
   private long field8781;

   public class859(class860 arg0, int arg1, int arg2) throws IOException {
      this.field8771 = arg0;
      this.field8780 = this.field8774 = arg0.method15148();
      this.field8772 = new byte[arg1];
      this.field8779 = new byte[arg2];
      this.field8778 = 0L;
   }

   @deob.ObfuscatedName("ug.n(I)V")
   public void method15130() throws IOException {
      this.method15120();
      this.field8771.method15151();
   }

   @deob.ObfuscatedName("ug.k(J)V")
   public void method15115(long arg0) throws IOException {
      if (arg0 < 0L) {
         throw new IOException();
      } else {
         this.field8778 = arg0;
      }
   }

   @deob.ObfuscatedName("ug.d(I)J")
   public long method15139() {
      return this.field8780;
   }

   @deob.ObfuscatedName("ug.b([BS)V")
   public void method15117(byte[] arg0) throws IOException {
      this.method15118(arg0, 0, arg0.length);
   }

   @deob.ObfuscatedName("ug.r([BIII)V")
   public void method15118(byte[] arg0, int arg1, int arg2) throws IOException {
      try {
         if (arg1 + arg2 > arg0.length) {
            throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
         }

         if (this.field8776 != -1L && this.field8778 >= this.field8776 && this.field8778 + (long)arg2 <= this.field8776 + (long)this.field8777) {
            System.arraycopy(this.field8779, (int)(this.field8778 - this.field8776), arg0, arg1, arg2);
            this.field8778 += (long)arg2;
            return;
         }

         long var4 = this.field8778;
         int var6 = arg1;
         int var7 = arg2;
         if (this.field8778 >= this.field8773 && this.field8778 < this.field8773 + (long)this.field8770) {
            int var8 = (int)((long)this.field8770 - (this.field8778 - this.field8773));
            if (var8 > arg2) {
               var8 = arg2;
            }

            System.arraycopy(this.field8772, (int)(this.field8778 - this.field8773), arg0, arg1, var8);
            this.field8778 += (long)var8;
            arg1 += var8;
            arg2 -= var8;
         }

         if (arg2 > this.field8772.length) {
            this.field8771.method15147(this.field8778);
            this.field8781 = this.field8778;

            while(arg2 > 0) {
               int var9 = this.field8771.method15149(arg0, arg1, arg2);
               if (var9 == -1) {
                  break;
               }

               this.field8781 += (long)var9;
               this.field8778 += (long)var9;
               arg1 += var9;
               arg2 -= var9;
            }
         } else if (arg2 > 0) {
            this.method15119();
            int var10 = arg2;
            if (arg2 > this.field8770) {
               var10 = this.field8770;
            }

            System.arraycopy(this.field8772, 0, arg0, arg1, var10);
            arg1 += var10;
            arg2 -= var10;
            this.field8778 += (long)var10;
         }

         if (this.field8776 != -1L) {
            if (this.field8776 > this.field8778 && arg2 > 0) {
               int var11 = (int)(this.field8776 - this.field8778) + arg1;
               if (var11 > arg1 + arg2) {
                  var11 = arg1 + arg2;
               }

               while(arg1 < var11) {
                  arg0[arg1++] = 0;
                  --arg2;
                  ++this.field8778;
               }
            }

            long var12 = -1L;
            long var14 = -1L;
            if (this.field8776 >= var4 && this.field8776 < (long)var7 + var4) {
               var12 = this.field8776;
            } else if (var4 >= this.field8776 && var4 < this.field8776 + (long)this.field8777) {
               var12 = var4;
            }

            if (this.field8776 + (long)this.field8777 > var4 && this.field8776 + (long)this.field8777 <= (long)var7 + var4) {
               var14 = this.field8776 + (long)this.field8777;
            } else if ((long)var7 + var4 > this.field8776 && (long)var7 + var4 <= this.field8776 + (long)this.field8777) {
               var14 = (long)var7 + var4;
            }

            if (var12 > -1L && var14 > var12) {
               int var16 = (int)(var14 - var12);
               System.arraycopy(this.field8779, (int)(var12 - this.field8776), arg0, (int)(var12 - var4) + var6, var16);
               if (var14 > this.field8778) {
                  arg2 = (int)((long)arg2 - (var14 - this.field8778));
                  this.field8778 = var14;
               }
            }
         }
      } catch (IOException var18) {
         this.field8781 = -1L;
         throw var18;
      }

      if (arg2 > 0) {
         throw new EOFException();
      }
   }

   @deob.ObfuscatedName("ug.p(I)V")
   private void method15119() throws IOException {
      this.field8770 = 0;
      if (this.field8781 != this.field8778) {
         this.field8771.method15147(this.field8778);
         this.field8781 = this.field8778;
      }

      this.field8773 = this.field8778;

      while(this.field8770 < this.field8772.length) {
         int var1 = this.field8772.length - this.field8770;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         int var2 = this.field8771.method15149(this.field8772, this.field8770, var1);
         if (var2 == -1) {
            break;
         }

         this.field8781 += (long)var2;
         this.field8770 += var2;
      }

   }

   @deob.ObfuscatedName("ug.o([BIII)V")
   public void method15122(byte[] arg0, int arg1, int arg2) throws IOException {
      try {
         if (this.field8778 + (long)arg2 > this.field8780) {
            this.field8780 = this.field8778 + (long)arg2;
         }

         if (this.field8776 != -1L && (this.field8778 < this.field8776 || this.field8778 > this.field8776 + (long)this.field8777)) {
            this.method15120();
         }

         if (this.field8776 != -1L && this.field8778 + (long)arg2 > this.field8776 + (long)this.field8779.length) {
            int var4 = (int)((long)this.field8779.length - (this.field8778 - this.field8776));
            System.arraycopy(arg0, arg1, this.field8779, (int)(this.field8778 - this.field8776), var4);
            this.field8778 += (long)var4;
            arg1 += var4;
            arg2 -= var4;
            this.field8777 = this.field8779.length;
            this.method15120();
         }

         if (arg2 <= this.field8779.length) {
            if (arg2 > 0) {
               if (this.field8776 == -1L) {
                  this.field8776 = this.field8778;
               }

               System.arraycopy(arg0, arg1, this.field8779, (int)(this.field8778 - this.field8776), arg2);
               this.field8778 += (long)arg2;
               if (this.field8778 - this.field8776 > (long)this.field8777) {
                  this.field8777 = (int)(this.field8778 - this.field8776);
               }

            }
         } else {
            if (this.field8781 != this.field8778) {
               this.field8771.method15147(this.field8778);
               this.field8781 = this.field8778;
            }

            this.field8771.method15146(arg0, arg1, arg2);
            this.field8781 += (long)arg2;
            if (this.field8781 > this.field8774) {
               this.field8774 = this.field8781;
            }

            long var5 = -1L;
            long var7 = -1L;
            if (this.field8778 >= this.field8773 && this.field8778 < this.field8773 + (long)this.field8770) {
               var5 = this.field8778;
            } else if (this.field8773 >= this.field8778 && this.field8773 < this.field8778 + (long)arg2) {
               var5 = this.field8773;
            }

            if (this.field8778 + (long)arg2 > this.field8773 && this.field8778 + (long)arg2 <= this.field8773 + (long)this.field8770) {
               var7 = this.field8778 + (long)arg2;
            } else if (this.field8773 + (long)this.field8770 > this.field8778 && this.field8773 + (long)this.field8770 <= this.field8778 + (long)arg2) {
               var7 = this.field8773 + (long)this.field8770;
            }

            if (var5 > -1L && var7 > var5) {
               int var9 = (int)(var7 - var5);
               System.arraycopy(arg0, (int)((long)arg1 + var5 - this.field8778), this.field8772, (int)(var5 - this.field8773), var9);
            }

            this.field8778 += (long)arg2;
         }
      } catch (IOException var11) {
         this.field8781 = -1L;
         throw var11;
      }
   }

   @deob.ObfuscatedName("ug.a(I)V")
   private void method15120() throws IOException {
      if (this.field8776 != -1L) {
         if (this.field8781 != this.field8776) {
            this.field8771.method15147(this.field8776);
            this.field8781 = this.field8776;
         }

         this.field8771.method15146(this.field8779, 0, this.field8777);
         this.field8781 += (long)(this.field8777 * -1231846337) * -1378456641L;
         if (this.field8781 > this.field8774) {
            this.field8774 = this.field8781;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field8776 >= this.field8773 && this.field8776 < this.field8773 + (long)this.field8770) {
            var1 = this.field8776;
         } else if (this.field8773 >= this.field8776 && this.field8773 < this.field8776 + (long)this.field8777) {
            var1 = this.field8773;
         }

         if (this.field8776 + (long)this.field8777 > this.field8773 && this.field8776 + (long)this.field8777 <= this.field8773 + (long)this.field8770) {
            var3 = this.field8776 + (long)this.field8777;
         } else if (this.field8773 + (long)this.field8770 > this.field8776 && this.field8773 + (long)this.field8770 <= this.field8776 + (long)this.field8777) {
            var3 = this.field8773 + (long)this.field8770;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field8779, (int)(var1 - this.field8776), this.field8772, (int)(var1 - this.field8773), var5);
         }

         this.field8776 = -1L;
         this.field8777 = 0;
      }

   }
}
