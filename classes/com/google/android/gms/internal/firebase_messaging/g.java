// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import androidx.annotation.k0;
import androidx.annotation.j0;
import java.io.IOException;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.h;

final class g implements h
{
    private boolean a;
    private boolean b;
    private d c;
    private final c d;
    
    g(final c d) {
        this.a = false;
        this.b = false;
        this.d = d;
    }
    
    private final void b() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new com.google.firebase.encoders.c("Cannot encode a second value in the ValueEncoderContext");
    }
    
    final void a(final d c, final boolean b) {
        this.a = false;
        this.c = c;
        this.b = b;
    }
    
    @j0
    public final h add(final int n) throws IOException {
        this.b();
        this.d.r(this.c, n, this.b);
        return (h)this;
    }
    
    @j0
    public final h f0(final long n) throws IOException {
        this.b();
        this.d.s(this.c, n, this.b);
        return (h)this;
    }
    
    @j0
    public final h g0(@j0 final byte[] array) throws IOException {
        this.b();
        this.d.o(this.c, array, this.b);
        return (h)this;
    }
    
    @j0
    public final h h0(@k0 final String s) throws IOException {
        this.b();
        this.d.o(this.c, s, this.b);
        return (h)this;
    }
    
    @j0
    public final h i0(final boolean b) throws IOException {
        this.b();
        this.d.r(this.c, b ? 1 : 0, this.b);
        return (h)this;
    }
    
    @j0
    public final h j0(final double n) throws IOException {
        this.b();
        this.d.p(this.c, n, this.b);
        return (h)this;
    }
    
    @j0
    public final h k0(final float n) throws IOException {
        this.b();
        this.d.q(this.c, n, this.b);
        return (h)this;
    }
}
