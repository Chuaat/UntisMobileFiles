// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okio.t0;
import java.io.IOException;
import okhttp3.e0;

public interface b<T> extends Cloneable
{
    boolean G();
    
    boolean K();
    
    b<T> M();
    
    void N2(final d<T> p0);
    
    void cancel();
    
    e0 k();
    
    t<T> p() throws IOException;
    
    t0 timeout();
}
