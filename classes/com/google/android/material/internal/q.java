// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.j0;
import android.graphics.Typeface;
import com.google.android.material.resources.d;
import androidx.annotation.k0;
import java.lang.ref.WeakReference;
import com.google.android.material.resources.f;
import android.text.TextPaint;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class q
{
    private final TextPaint a;
    private final f b;
    private float c;
    private boolean d;
    @k0
    private WeakReference<b> e;
    @k0
    private d f;
    
    public q(@k0 final b b) {
        this.a = new TextPaint(1);
        this.b = new f() {
            @Override
            public void a(final int n) {
                q.this.d = true;
                final b b = (b)q.this.e.get();
                if (b != null) {
                    b.a();
                }
            }
            
            @Override
            public void b(@j0 final Typeface typeface, final boolean b) {
                if (b) {
                    return;
                }
                q.this.d = true;
                final b b2 = (b)q.this.e.get();
                if (b2 != null) {
                    b2.a();
                }
            }
        };
        this.d = true;
        this.e = new WeakReference<b>(null);
        this.h(b);
    }
    
    private float c(@k0 final CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }
    
    @k0
    public d d() {
        return this.f;
    }
    
    @j0
    public TextPaint e() {
        return this.a;
    }
    
    public float f(final String s) {
        if (!this.d) {
            return this.c;
        }
        final float c = this.c(s);
        this.c = c;
        this.d = false;
        return c;
    }
    
    public boolean g() {
        return this.d;
    }
    
    public void h(@k0 final b referent) {
        this.e = new WeakReference<b>(referent);
    }
    
    public void i(@k0 final d f, final Context context) {
        if (this.f != f) {
            if ((this.f = f) != null) {
                f.k(context, this.a, this.b);
                final b b = this.e.get();
                if (b != null) {
                    this.a.drawableState = b.getState();
                }
                f.j(context, this.a, this.b);
                this.d = true;
            }
            final b b2 = this.e.get();
            if (b2 != null) {
                b2.a();
                b2.onStateChange(b2.getState());
            }
        }
    }
    
    public void j(final boolean d) {
        this.d = d;
    }
    
    public void k(final Context context) {
        this.f.j(context, this.a, this.b);
    }
    
    public interface b
    {
        void a();
        
        @j0
        int[] getState();
        
        boolean onStateChange(final int[] p0);
    }
}
