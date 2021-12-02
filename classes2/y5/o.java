// 
// Decompiled by Procyon v0.5.36
// 

package y5;

import io.reactivex.annotations.g;
import io.reactivex.annotations.f;

public interface o<T>
{
    void clear();
    
    boolean isEmpty();
    
    boolean offer(@f final T p0);
    
    boolean p(@f final T p0, @f final T p1);
    
    @g
    T poll() throws Exception;
}
