// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class j
{
    public static final byte[] a;
    public static final ByteBuffer b;
    
    static {
        b = ByteBuffer.wrap(a = new byte[0]);
    }
    
    public static boolean a(final byte[] array) {
        return y.e(array);
    }
    
    public static String b(final byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        }
        catch (UnsupportedEncodingException cause) {
            throw new RuntimeException("UTF-8 not supported?", cause);
        }
    }
    
    public interface a
    {
        int q();
    }
    
    public interface b<T extends a>
    {
        T a(final int p0);
    }
}
