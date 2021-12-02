// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.a;

public class i<R> implements g<R>
{
    private final j.a a;
    private j<R> b;
    
    public i(final j.a a) {
        this.a = a;
    }
    
    @Override
    public f<R> a(final a a, final boolean b) {
        if (a != a.K && b) {
            if (this.b == null) {
                this.b = new j<R>(this.a);
            }
            return this.b;
        }
        return e.b();
    }
}
