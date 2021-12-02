// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import android.os.Message;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.f;
import androidx.annotation.j0;
import com.bumptech.glide.util.m;
import androidx.annotation.b1;
import java.nio.ByteBuffer;
import com.bumptech.glide.request.target.p;
import android.os.SystemClock;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.request.h;
import android.os.Handler$Callback;
import android.os.Looper;
import java.util.ArrayList;
import com.bumptech.glide.b;
import androidx.annotation.k0;
import com.bumptech.glide.load.n;
import android.graphics.Bitmap;
import com.bumptech.glide.k;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.l;
import java.util.List;
import android.os.Handler;
import com.bumptech.glide.gifdecoder.a;

class g
{
    private final com.bumptech.glide.gifdecoder.a a;
    private final Handler b;
    private final List<b> c;
    final l d;
    private final e e;
    private boolean f;
    private boolean g;
    private boolean h;
    private k<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private n<Bitmap> n;
    private a o;
    @k0
    private d p;
    private int q;
    private int r;
    private int s;
    
    g(final com.bumptech.glide.b b, final com.bumptech.glide.gifdecoder.a a, final int n, final int n2, final n<Bitmap> n3, final Bitmap bitmap) {
        this(b.g(), com.bumptech.glide.b.D(b.i()), a, null, k(com.bumptech.glide.b.D(b.i()), n, n2), n3, bitmap);
    }
    
    g(final e e, final l d, final com.bumptech.glide.gifdecoder.a a, final Handler handler, final k<Bitmap> i, final n<Bitmap> n, final Bitmap bitmap) {
        this.c = new ArrayList<b>();
        this.d = d;
        Handler b = handler;
        if (handler == null) {
            b = new Handler(Looper.getMainLooper(), (Handler$Callback)new c());
        }
        this.e = e;
        this.b = b;
        this.i = i;
        this.a = a;
        this.q(n, bitmap);
    }
    
    private static com.bumptech.glide.load.g g() {
        return new com.bumptech.glide.signature.e(Math.random());
    }
    
    private static k<Bitmap> k(final l l, final int n, final int n2) {
        return l.w().b1(((com.bumptech.glide.request.a<com.bumptech.glide.request.a<?>>)h.f1(j.b).Y0(true).O0(true)).D0(n, n2));
    }
    
    private void n() {
        if (this.f) {
            if (!this.g) {
                if (this.h) {
                    com.bumptech.glide.util.k.a(this.o == null, "Pending target must be null when starting from the first frame");
                    this.a.q();
                    this.h = false;
                }
                final a o = this.o;
                if (o != null) {
                    this.o = null;
                    this.o(o);
                    return;
                }
                this.g = true;
                final int n = this.a.n();
                final long uptimeMillis = SystemClock.uptimeMillis();
                final long n2 = n;
                this.a.k();
                this.l = new a(this.b, this.a.s(), uptimeMillis + n2);
                this.i.b1(com.bumptech.glide.request.h.y1(g())).A1(this.a).o1(this.l);
            }
        }
    }
    
    private void p() {
        final Bitmap m = this.m;
        if (m != null) {
            this.e.d(m);
            this.m = null;
        }
    }
    
    private void t() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        this.n();
    }
    
    private void u() {
        this.f = false;
    }
    
    void a() {
        this.c.clear();
        this.p();
        this.u();
        final a j = this.j;
        if (j != null) {
            this.d.B(j);
            this.j = null;
        }
        final a l = this.l;
        if (l != null) {
            this.d.B(l);
            this.l = null;
        }
        final a o = this.o;
        if (o != null) {
            this.d.B(o);
            this.o = null;
        }
        this.a.clear();
        this.k = true;
    }
    
    ByteBuffer b() {
        return this.a.getData().asReadOnlyBuffer();
    }
    
    Bitmap c() {
        final a j = this.j;
        Bitmap bitmap;
        if (j != null) {
            bitmap = j.d();
        }
        else {
            bitmap = this.m;
        }
        return bitmap;
    }
    
    int d() {
        final a j = this.j;
        int k;
        if (j != null) {
            k = j.K;
        }
        else {
            k = -1;
        }
        return k;
    }
    
    Bitmap e() {
        return this.m;
    }
    
    int f() {
        return this.a.m();
    }
    
    n<Bitmap> h() {
        return this.n;
    }
    
    int i() {
        return this.s;
    }
    
    int j() {
        return this.a.w();
    }
    
    int l() {
        return this.a.v() + this.q;
    }
    
    int m() {
        return this.r;
    }
    
    @b1
    void o(final a a) {
        final d p = this.p;
        if (p != null) {
            p.a();
        }
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, (Object)a).sendToTarget();
            return;
        }
        if (!this.f) {
            this.o = a;
            return;
        }
        if (a.d() != null) {
            this.p();
            final a j = this.j;
            this.j = a;
            for (int i = this.c.size() - 1; i >= 0; --i) {
                this.c.get(i).a();
            }
            if (j != null) {
                this.b.obtainMessage(2, (Object)j).sendToTarget();
            }
        }
        this.n();
    }
    
    void q(final n<Bitmap> n, final Bitmap bitmap) {
        this.n = com.bumptech.glide.util.k.d(n);
        this.m = com.bumptech.glide.util.k.d(bitmap);
        this.i = this.i.b1(((com.bumptech.glide.request.a<com.bumptech.glide.request.a<?>>)new h()).R0(n));
        this.q = com.bumptech.glide.util.m.h(bitmap);
        this.r = bitmap.getWidth();
        this.s = bitmap.getHeight();
    }
    
    void r() {
        com.bumptech.glide.util.k.a(this.f ^ true, "Can't restart a running animation");
        this.h = true;
        final a o = this.o;
        if (o != null) {
            this.d.B(o);
            this.o = null;
        }
    }
    
    @b1
    void s(@k0 final d p) {
        this.p = p;
    }
    
    void v(final b b) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (!this.c.contains(b)) {
            final boolean empty = this.c.isEmpty();
            this.c.add(b);
            if (empty) {
                this.t();
            }
            return;
        }
        throw new IllegalStateException("Cannot subscribe twice in a row");
    }
    
    void w(final b b) {
        this.c.remove(b);
        if (this.c.isEmpty()) {
            this.u();
        }
    }
    
    @b1
    static class a extends e<Bitmap>
    {
        private final Handler J;
        final int K;
        private final long L;
        private Bitmap M;
        
        a(final Handler j, final int k, final long l) {
            this.J = j;
            this.K = k;
            this.L = l;
        }
        
        Bitmap d() {
            return this.M;
        }
        
        public void g(@j0 final Bitmap m, @k0 final f<? super Bitmap> f) {
            this.M = m;
            this.J.sendMessageAtTime(this.J.obtainMessage(1, (Object)this), this.L);
        }
        
        @Override
        public void p(@k0 final Drawable drawable) {
            this.M = null;
        }
    }
    
    public interface b
    {
        void a();
    }
    
    private class c implements Handler$Callback
    {
        static final int d = 1;
        static final int e = 2;
        
        c() {
        }
        
        public boolean handleMessage(final Message message) {
            final int what = message.what;
            if (what == 1) {
                com.bumptech.glide.load.resource.gif.g.this.o((a)message.obj);
                return true;
            }
            if (what == 2) {
                com.bumptech.glide.load.resource.gif.g.this.d.B((p<?>)message.obj);
            }
            return false;
        }
    }
    
    @b1
    interface d
    {
        void a();
    }
}
