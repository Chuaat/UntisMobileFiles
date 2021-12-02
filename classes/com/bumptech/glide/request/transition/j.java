// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import android.view.View;

public class j<R> implements f<R>
{
    private final a a;
    
    public j(final a a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final R r, final f.a a) {
        if (a.g() != null) {
            this.a.a(a.g());
        }
        return false;
    }
    
    public interface a
    {
        void a(final View p0);
    }
}
