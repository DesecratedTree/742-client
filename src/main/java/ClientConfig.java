import java.math.BigInteger;

/**
 * Settings for this client build. Edit the constants for your own server; everything the client
 * needs to connect, decrypt the login block and find its cache is read from here.
 */
public final class ClientConfig {
   public static final String SERVER_HOST = "127.0.0.1";       /** Game server address, also used as the jav_config host. */
   public static final int SERVER_PORT = 40001;                /** Game/cache port; 0 keeps the port jav_config provides (param 8 offset). */
   public static final String CONFIG_URL =                     /** jav_config.ws location; the web server usually listens on a different port to the game. */
           "http://" + SERVER_HOST + ":8080/jav_config.ws";
   public static final int REVISION = 742;
   public static final int SUBREVISION = 1;
   public static final String RSA_MODULUS =                    /** Hex RSA modulus of the key the server signs the login block with. */
           "91f62191c11c3eec1ff013cf31c4d6cedc41df6d339e8ca0ea9e11b6d22fc808c61d5fe5c83b56ef3801e05654dff58a9c9f619a5ba5be419a1c81d80d73232c7a726822edfeb05e1920e8f1fafdfc03dbe19c8dcb1c8138fee1565a5e6fa5968afa9588ecb3797a0a187fd6b6f753731283ca22efb2ff9846ae19a0734dcb88cc2da5242552fe8ad928115e1696bdbf5c2d55b4acf000655967eb942cba727dad0527822fac7ebf9a4927a6aacf35410756ab3eb6dc51520eecb9d079689e1b855d270849d4842c8a2ec337271e5fcbad36b098fd084c5df19906b9f94e0f2f8a6b749cbc307419acb87e70bfa48869cad11704dcf5af88654b7bee829e685b";
   public static final String RSA_EXPONENT = "10001";          /** Hex RSA public exponent. */
   public static final int FPS_LIMIT = 80;                     /** Frames per second the client caps at; -1 draws uncapped. */
   public static final int ZOOM_MIN = 40000;                   /** Closest camera zoom (thousandths, 100000 = 100%), Ctrl+scroll lower bound. */
   public static final int ZOOM_MAX = 150000;                  /** Furthest camera zoom (thousandths), Ctrl+scroll upper bound. */
   public static final int RENDER_DISTANCE_MIN = 50;           /** Smallest render distance percent, Alt+scroll lower bound. */
   public static final int RENDER_DISTANCE_MAX = 0;            /** Largest render distance percent; 0 uses the scene's own limit. */
   public static final boolean PACKET_LOGGING = true;          /** Print every game packet's name, id and size to the console. */

   private ClientConfig() {
   }

   public static BigInteger rsaModulus() {
      return new BigInteger(RSA_MODULUS, 16);
   }

   public static BigInteger rsaExponent() {
      return new BigInteger(RSA_EXPONENT, 16);
   }
}
