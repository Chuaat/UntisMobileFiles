// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.a;
import android.graphics.drawable.Drawable;

public class c implements g<Drawable>
{
    private final int a;
    private final boolean b;
    private d c;
    
    protected c(final int a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    private f<Drawable> b() {
        if (this.c == null) {
            this.c = new d(this.a, this.b);
        }
        return this.c;
    }
    
    @Override
    public f<Drawable> a(final com.bumptech.glide.load.a a, final boolean b) {
        f<Drawable> f;
        if (a == a.K) {
            f = e.b();
        }
        else {
            f = this.b();
        }
        return f;
    }
    
    public static class a
    {
        private static final int c = 300;
        private final int a;
        private boolean b;
        
        public a() {
            this(300);
        }
        
        public a(final int a) {
            this.a = a;
        }
        
        public c a() {
            return new c(this.a, this.b);
        }
        
        public a b(final boolean b) {
            this.b = b;
            return this;
        }
    }
}
