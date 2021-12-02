// 
// Decompiled by Procyon v0.5.36
// 

package u1;

import androidx.annotation.j0;
import java.io.IOException;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.data.e;

public class a implements e<ByteBuffer>
{
    private final ByteBuffer a;
    
    public a(final ByteBuffer a) {
        this.a = a;
    }
    
    @Override
    public void b() {
    }
    
    @j0
    public ByteBuffer c() {
        this.a.position(0);
        return this.a;
    }
    
    public static class a implements e.a<ByteBuffer>
    {
        @j0
        @Override
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }
        
        @j0
        public e<ByteBuffer> c(final ByteBuffer byteBuffer) {
            return new u1.a(byteBuffer);
        }
    }
}
