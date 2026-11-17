package jagdx;

public class IDirect3DCubeTexture extends IDirect3DBaseTexture {
   private IDirect3DCubeTexture() throws Throwable {
      throw new Error();
   }

   public static native int Upload(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9);

   private static native int Download(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9);
}
