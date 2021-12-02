// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.disposables.c;
import y5.n;
import io.reactivex.internal.util.r;
import io.reactivex.i0;

public abstract class v<T, U, V> extends x implements i0<T>, r<U, V>
{
    protected final i0<? super V> l0;
    protected final n<U> m0;
    protected volatile boolean n0;
    protected volatile boolean o0;
    protected Throwable p0;
    
    public v(final i0<? super V> l0, final n<U> m0) {
        this.l0 = l0;
        this.m0 = m0;
    }
    
    @Override
    public final boolean a() {
        return this.o0;
    }
    
    @Override
    public final Throwable c() {
        return this.p0;
    }
    
    public final boolean d() {
        final int value = super.V.get();
        boolean b = true;
        if (value != 0 || !super.V.compareAndSet(0, 1)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean e() {
        return super.V.getAndIncrement() == 0;
    }
    
    @Override
    public final boolean g() {
        return this.n0;
    }
    
    @Override
    public final int h(final int delta) {
        return super.V.addAndGet(delta);
    }
    
    @Override
    public void j(final i0<? super V> i0, final U u) {
    }
    
    protected final void k(final U u, final boolean b, final c c) {
        final i0<? super V> l0 = this.l0;
        final n<U> m0 = this.m0;
        if (super.V.get() == 0 && super.V.compareAndSet(0, 1)) {
            this.j(l0, u);
            if (this.h(-1) == 0) {
                return;
            }
        }
        else {
            m0.offer(u);
            if (!this.e()) {
                return;
            }
        }
        io.reactivex.internal.util.v.d(m0, (i0<? super Object>)l0, b, c, (r<U, Object>)this);
    }
    
    protected final void n(final U u, final boolean b, final c c) {
        final i0<? super V> l0 = this.l0;
        final n<U> m0 = this.m0;
        if (super.V.get() == 0 && super.V.compareAndSet(0, 1)) {
            if (m0.isEmpty()) {
                this.j(l0, u);
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                m0.offer(u);
            }
        }
        else {
            m0.offer(u);
            if (!this.e()) {
                return;
            }
        }
        io.reactivex.internal.util.v.d(m0, (i0<? super Object>)l0, b, c, (r<U, Object>)this);
    }
}
