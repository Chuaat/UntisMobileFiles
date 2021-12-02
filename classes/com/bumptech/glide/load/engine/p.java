// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.j0;
import com.bumptech.glide.util.k;
import com.bumptech.glide.load.g;

class p<Z> implements v<Z>
{
    private final boolean G;
    private final boolean H;
    private final v<Z> I;
    private final a J;
    private final g K;
    private int L;
    private boolean M;
    
    p(final v<Z> v, final boolean g, final boolean h, final g k, final a a) {
        this.I = k.d(v);
        this.G = g;
        this.H = h;
        this.K = k;
        this.J = k.d(a);
    }
    
    @Override
    public void a() {
        synchronized (this) {
            if (this.L > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (!this.M) {
                this.M = true;
                if (this.H) {
                    this.I.a();
                }
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }
    
    void b() {
        synchronized (this) {
            if (!this.M) {
                ++this.L;
                return;
            }
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }
    
    v<Z> c() {
        return this.I;
    }
    
    boolean d() {
        return this.G;
    }
    
    void e() {
        synchronized (this) {
            int l = this.L;
            if (l > 0) {
                boolean b = true;
                --l;
                if ((this.L = l) != 0) {
                    b = false;
                }
                // monitorexit(this)
                if (b) {
                    this.J.d(this.K, this);
                }
                return;
            }
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
    }
    
    @j0
    @Override
    public Z get() {
        return this.I.get();
    }
    
    @Override
    public int l0() {
        return this.I.l0();
    }
    
    @j0
    @Override
    public Class<Z> m0() {
        return this.I.m0();
    }
    
    @Override
    public String toString() {
        synchronized (this) {
            final StringBuilder sb = new StringBuilder();
            sb.append("EngineResource{isMemoryCacheable=");
            sb.append(this.G);
            sb.append(", listener=");
            sb.append(this.J);
            sb.append(", key=");
            sb.append(this.K);
            sb.append(", acquired=");
            sb.append(this.L);
            sb.append(", isRecycled=");
            sb.append(this.M);
            sb.append(", resource=");
            sb.append(this.I);
            sb.append('}');
            return sb.toString();
        }
    }
    
    interface a
    {
        void d(final g p0, final p<?> p1);
    }
}
