// 
// Decompiled by Procyon v0.5.36
// 

package androidx.dynamicanimation.animation;

import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import androidx.annotation.p0;
import android.os.Looper;
import android.os.Handler;
import android.os.Build$VERSION;
import android.os.SystemClock;
import java.util.ArrayList;
import androidx.collection.m;

class a
{
    private static final long g = 10L;
    public static final ThreadLocal<a> h;
    private final m<b, Long> a;
    final ArrayList<b> b;
    private final a c;
    private c d;
    long e;
    private boolean f;
    
    static {
        h = new ThreadLocal<a>();
    }
    
    a() {
        this.a = new m<b, Long>();
        this.b = new ArrayList<b>();
        this.c = new a();
        this.e = 0L;
        this.f = false;
    }
    
    private void b() {
        if (this.f) {
            for (int i = this.b.size() - 1; i >= 0; --i) {
                if (this.b.get(i) == null) {
                    this.b.remove(i);
                }
            }
            this.f = false;
        }
    }
    
    public static long d() {
        final ThreadLocal<a> h = a.h;
        if (h.get() == null) {
            return 0L;
        }
        return h.get().e;
    }
    
    public static a e() {
        final ThreadLocal<a> h = a.h;
        if (h.get() == null) {
            h.set(new a());
        }
        return h.get();
    }
    
    private boolean g(final b b, final long n) {
        final Long n2 = this.a.get(b);
        if (n2 == null) {
            return true;
        }
        if (n2 < n) {
            this.a.remove(b);
            return true;
        }
        return false;
    }
    
    public void a(final b b, final long n) {
        if (this.b.size() == 0) {
            this.f().a();
        }
        if (!this.b.contains(b)) {
            this.b.add(b);
        }
        if (n > 0L) {
            this.a.put(b, SystemClock.uptimeMillis() + n);
        }
    }
    
    void c(final long n) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); ++i) {
            final b b = this.b.get(i);
            if (b != null) {
                if (this.g(b, uptimeMillis)) {
                    b.a(n);
                }
            }
        }
        this.b();
    }
    
    c f() {
        if (this.d == null) {
            c d;
            if (Build$VERSION.SDK_INT >= 16) {
                d = new e(this.c);
            }
            else {
                d = new d(this.c);
            }
            this.d = d;
        }
        return this.d;
    }
    
    public void h(final b o) {
        this.a.remove(o);
        final int index = this.b.indexOf(o);
        if (index >= 0) {
            this.b.set(index, null);
            this.f = true;
        }
    }
    
    public void i(final c d) {
        this.d = d;
    }
    
    class a
    {
        void a() {
            androidx.dynamicanimation.animation.a.this.e = SystemClock.uptimeMillis();
            final androidx.dynamicanimation.animation.a a = androidx.dynamicanimation.animation.a.this;
            a.c(a.e);
            if (androidx.dynamicanimation.animation.a.this.b.size() > 0) {
                androidx.dynamicanimation.animation.a.this.f().a();
            }
        }
    }
    
    interface b
    {
        boolean a(final long p0);
    }
    
    abstract static class c
    {
        final a a;
        
        c(final a a) {
            this.a = a;
        }
        
        abstract void a();
    }
    
    private static class d extends c
    {
        private final Runnable b;
        private final Handler c;
        long d;
        
        d(final a a) {
            super(a);
            this.d = -1L;
            this.b = new Runnable() {
                @Override
                public void run() {
                    androidx.dynamicanimation.animation.a.d.this.d = SystemClock.uptimeMillis();
                    androidx.dynamicanimation.animation.a.d.this.a.a();
                }
            };
            this.c = new Handler(Looper.myLooper());
        }
        
        @Override
        void a() {
            this.c.postDelayed(this.b, Math.max(10L - (SystemClock.uptimeMillis() - this.d), 0L));
        }
    }
    
    @p0(16)
    private static class e extends c
    {
        private final Choreographer b;
        private final Choreographer$FrameCallback c;
        
        e(final a a) {
            super(a);
            this.b = Choreographer.getInstance();
            this.c = (Choreographer$FrameCallback)new Choreographer$FrameCallback() {
                public void doFrame(final long n) {
                    e.this.a.a();
                }
            };
        }
        
        @Override
        void a() {
            this.b.postFrameCallback(this.c);
        }
    }
}
