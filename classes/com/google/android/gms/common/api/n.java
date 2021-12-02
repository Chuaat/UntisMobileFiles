// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;
import androidx.annotation.j0;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@f2.a
public abstract class n<R extends t>
{
    @f2.a
    public void c(@RecentlyNonNull final a a) {
        throw new UnsupportedOperationException();
    }
    
    @j0
    public abstract R d();
    
    @j0
    public abstract R e(@RecentlyNonNull final long p0, @RecentlyNonNull final TimeUnit p1);
    
    public abstract void f();
    
    @RecentlyNonNull
    public abstract boolean g();
    
    public abstract void h(@RecentlyNonNull final u<? super R> p0);
    
    public abstract void i(@RecentlyNonNull final u<? super R> p0, @RecentlyNonNull final long p1, @RecentlyNonNull final TimeUnit p2);
    
    @j0
    public <S extends t> x<S> j(@RecentlyNonNull final w<? super R, ? extends S> w) {
        throw new UnsupportedOperationException();
    }
    
    @f2.a
    public interface a
    {
        @f2.a
        void a(@RecentlyNonNull final Status p0);
    }
}
