// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import com.bumptech.glide.request.transition.i;
import com.bumptech.glide.request.transition.j;
import com.bumptech.glide.util.k;
import com.bumptech.glide.request.transition.h;
import androidx.annotation.j0;
import com.bumptech.glide.request.transition.e;
import com.bumptech.glide.request.transition.g;

public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable
{
    private g<? super TranscodeType> G;
    
    public m() {
        this.G = e.c();
    }
    
    private CHILD d() {
        return (CHILD)this;
    }
    
    public final CHILD a() {
        try {
            return (CHILD)super.clone();
        }
        catch (CloneNotSupportedException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    @j0
    public final CHILD b() {
        return this.g(e.c());
    }
    
    final g<? super TranscodeType> c() {
        return this.G;
    }
    
    @j0
    public final CHILD f(final int n) {
        return this.g(new h<Object>(n));
    }
    
    @j0
    public final CHILD g(@j0 final g<? super TranscodeType> g) {
        this.G = k.d(g);
        return this.d();
    }
    
    @j0
    public final CHILD i(@j0 final j.a a) {
        return this.g(new i<Object>(a));
    }
}
