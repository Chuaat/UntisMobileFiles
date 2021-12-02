// 
// Decompiled by Procyon v0.5.36
// 

package u1;

import androidx.annotation.j0;
import com.bumptech.glide.util.k;
import com.bumptech.glide.load.engine.v;

public class b implements v<byte[]>
{
    private final byte[] G;
    
    public b(final byte[] array) {
        this.G = k.d(array);
    }
    
    @Override
    public void a() {
    }
    
    @j0
    public byte[] b() {
        return this.G;
    }
    
    @Override
    public int l0() {
        return this.G.length;
    }
    
    @j0
    @Override
    public Class<byte[]> m0() {
        return byte[].class;
    }
}
