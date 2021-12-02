// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import androidx.annotation.j0;
import java.io.IOException;

public interface e<T>
{
    @j0
    T a() throws IOException;
    
    void b();
    
    public interface a<T>
    {
        @j0
        Class<T> a();
        
        @j0
        e<T> b(@j0 final T p0);
    }
}
