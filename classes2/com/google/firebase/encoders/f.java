// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.encoders;

import androidx.annotation.k0;
import java.io.IOException;
import androidx.annotation.j0;

public interface f
{
    @j0
    f a(@j0 final d p0, final boolean p1) throws IOException;
    
    @j0
    f b(@j0 final d p0, final long p1) throws IOException;
    
    @j0
    f c(@j0 final d p0, final int p1) throws IOException;
    
    @j0
    f d(@j0 final d p0, final float p1) throws IOException;
    
    @j0
    f e(@j0 final d p0) throws IOException;
    
    @j0
    f f(@j0 final d p0, final double p1) throws IOException;
    
    @j0
    f g(@k0 final Object p0) throws IOException;
    
    @Deprecated
    @j0
    f h(@j0 final String p0, final boolean p1) throws IOException;
    
    @Deprecated
    @j0
    f i(@j0 final String p0, final double p1) throws IOException;
    
    @Deprecated
    @j0
    f j(@j0 final String p0, final long p1) throws IOException;
    
    @Deprecated
    @j0
    f k(@j0 final String p0, final int p1) throws IOException;
    
    @Deprecated
    @j0
    f l(@j0 final String p0, @k0 final Object p1) throws IOException;
    
    @j0
    f m(@j0 final String p0) throws IOException;
    
    @j0
    f n(@j0 final d p0, @k0 final Object p1) throws IOException;
}
