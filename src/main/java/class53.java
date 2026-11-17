import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;

@deob.ObfuscatedName("abx")
public class class53 extends class646 {
   @deob.ObfuscatedName("abx.ah")
   private boolean field383 = false;
   @deob.ObfuscatedName("abx.al")
   private boolean field384 = false;
   @deob.ObfuscatedName("abx.at")
   private int field379;
   @deob.ObfuscatedName("abx.ax")
   private AudioFormat field381;
   @deob.ObfuscatedName("abx.af")
   public SourceDataLine field380;
   @deob.ObfuscatedName("abx.aw")
   private byte[] field382;

   @deob.ObfuscatedName("abx.v(Ljava/awt/Component;)V")
   protected void method834(Component arg0) {
      Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         Info[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                  this.field384 = true;
               }
            }
         }
      }

      this.field381 = new AudioFormat((float)Statics.field5854, 16, Statics.field5844 ? 2 : 1, true, false);
      this.field382 = new byte[256 << (Statics.field5844 ? 2 : 1)];
   }

   @deob.ObfuscatedName("abx.g(I)V")
   protected void method835(int arg0) throws LineUnavailableException {
      if (this.field380 != null) {
         if (!this.field383) {
            throw new IllegalStateException("");
         }

         if (this.field379 == arg0) {
            this.field383 = false;
            return;
         }

         if (!this.method839()) {
            return;
         }
      }

      try {
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field381, arg0 << (Statics.field5844 ? 2 : 1));
         this.field380 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field380.open();
         this.field380.start();
         this.field379 = arg0;
         this.field383 = false;
      } catch (LineUnavailableException var4) {
         if (class887.method7897(arg0) != 1) {
            this.method835(class887.method4053(arg0));
         } else {
            this.field383 = true;
            throw var4;
         }
      }
   }

   @deob.ObfuscatedName("abx.h()I")
   protected int method833() {
      return this.field379 - (this.field380.available() >> (Statics.field5844 ? 2 : 1));
   }

   @deob.ObfuscatedName("abx.e()V")
   protected void method837() {
      if (!this.field383) {
         int var1 = 256;
         if (Statics.field5844) {
            var1 <<= 1;
         }

         for(int var2 = 0; var2 < var1; ++var2) {
            int var3 = this.field5849[var2];
            if ((var3 + 8388608 & -16777216) != 0) {
               var3 = 8388607 ^ var3 >> 31;
            }

            this.field382[var2 * 2] = (byte)(var3 >> 8);
            this.field382[var2 * 2 + 1] = (byte)(var3 >> 16);
         }

         this.field380.write(this.field382, 0, var1 << 1);
      }
   }

   @deob.ObfuscatedName("abx.z(Z)V")
   protected void method838(boolean arg0) {
      if (arg0) {
         this.method839();
      } else {
         try {
            this.method843();
         } catch (LineUnavailableException var3) {
         }

         this.field383 = true;
      }
   }

   @deob.ObfuscatedName("abx.bq()Z")
   private boolean method839() {
      boolean var1 = false;
      if (this.field380 != null) {
         Thread var2 = new Thread(new class654(this));
         var2.start();
         boolean var8 = false;

         label84: {
            try {
               var8 = true;
               var2.join(2000L);
               var8 = false;
               break label84;
            } catch (InterruptedException var9) {
               var8 = false;
            } finally {
               if (var8) {
                  if (this.field380 != null) {
                     this.field380 = null;
                     this.method9324();
                  }

                  boolean var5 = true;
               }
            }

            if (this.field380 != null) {
               this.field380 = null;
               this.method9324();
            }

            var1 = true;
            return var1;
         }

         if (this.field380 != null) {
            this.field380 = null;
            this.method9324();
         }

         var1 = true;
      }

      return var1;
   }

   @deob.ObfuscatedName("abx.m()V")
   protected void method843() throws LineUnavailableException {
      if (!this.field383) {
         this.field380.flush();
         if (this.field384) {
            if (!this.method839()) {
               return;
            }

            javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field381, this.field379 << (Statics.field5844 ? 2 : 1));
            this.field380 = (SourceDataLine)AudioSystem.getLine(var1);
            this.field380.open();
            this.field380.start();
         }

      }
   }
}
