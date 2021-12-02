// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.target.f;
import androidx.annotation.k0;
import java.util.Arrays;
import androidx.annotation.j0;
import android.view.View;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.e;

public class n<T> implements b<T>, o
{
    private int[] a;
    private a b;
    
    public n() {
    }
    
    public n(@j0 final View view) {
        (this.b = new a(view)).r(this);
    }
    
    @k0
    @Override
    public int[] a(@j0 final T t, final int n, final int n2) {
        final int[] a = this.a;
        if (a == null) {
            return null;
        }
        return Arrays.copyOf(a, a.length);
    }
    
    public void b(@j0 final View view) {
        if (this.a == null) {
            if (this.b == null) {
                (this.b = new a(view)).r(this);
            }
        }
    }
    
    @Override
    public void f(final int n, final int n2) {
        this.a = new int[] { n, n2 };
        this.b = null;
    }
    
    static final class a extends f<View, Object>
    {
        a(@j0 final View view) {
            super(view);
        }
        
        @Override
        public void c(@j0 final Object o, @k0 final com.bumptech.glide.request.transition.f<? super Object> f) {
        }
        
        @Override
        public void h(@k0 final Drawable drawable) {
        }
        
        @Override
        protected void m(@k0 final Drawable drawable) {
        }
    }
}
