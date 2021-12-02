// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import java.util.Objects;
import kotlinx.coroutines.internal.k0;
import c7.a;
import kotlinx.coroutines.w0;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlinx.coroutines.o;
import kotlinx.coroutines.r;
import kotlin.j2;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.selects.g;
import n6.p;
import kotlinx.coroutines.selects.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.selects.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\u0006\u001d\t\u0015\u0014\u001aB\u000f\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJT\u0010\u0012\u001a\u00020\b\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%" }, d2 = { "Lkotlinx/coroutines/sync/d;", "Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/selects/e;", "", "owner", "", "a", "(Ljava/lang/Object;)Z", "Lkotlin/j2;", "c", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "P", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Ln6/p;)V", "e", "d", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "f", "()Lkotlinx/coroutines/selects/e;", "onLock", "b", "()Z", "isLocked", "g", "isLockedEmptyQueueState", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class d implements kotlinx.coroutines.sync.c, kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c>
{
    static final /* synthetic */ AtomicReferenceFieldUpdater G;
    volatile /* synthetic */ Object _state;
    
    static {
        G = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    }
    
    public d(final boolean b) {
        kotlinx.coroutines.sync.b state;
        if (b) {
            state = kotlinx.coroutines.sync.e.c();
        }
        else {
            state = kotlinx.coroutines.sync.e.d();
        }
        this._state = state;
    }
    
    @Override
    public <R> void P(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> f, @org.jetbrains.annotations.f final Object obj, @org.jetbrains.annotations.e final p<? super kotlinx.coroutines.sync.c, ? super d<? super R>, ?> p3) {
        while (!f.s()) {
            final Object state = this._state;
            if (state instanceof kotlinx.coroutines.sync.b) {
                final kotlinx.coroutines.sync.b b = (kotlinx.coroutines.sync.b)state;
                if (b.a != kotlinx.coroutines.sync.e.h()) {
                    d.G.compareAndSet(this, state, new d(b.a));
                }
                else {
                    final Object m = f.M(new e(this, obj));
                    if (m == null) {
                        c7.b.d((n6.p<? super d, ? super d<? super Object>, ?>)p3, this, f.w());
                        return;
                    }
                    if (m == g.d()) {
                        return;
                    }
                    if (m == kotlinx.coroutines.sync.e.f()) {
                        continue;
                    }
                    if (m == kotlinx.coroutines.internal.c.b) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("performAtomicTrySelect(TryLockDesc) returned ");
                    sb.append(m);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            else if (state instanceof d) {
                final d d = (d)state;
                final Object j = d.J;
                final int n = 0;
                if (j == obj) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Already locked by ");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString().toString());
                }
                final b<Object> b2 = new b<Object>(obj, (kotlinx.coroutines.selects.f<? super Object>)f, p3);
                final t.c c = new t.c() {
                    final /* synthetic */ d e;
                    
                    @org.jetbrains.annotations.f
                    public Object k(@org.jetbrains.annotations.e final t t) {
                        Object a;
                        if (this.e._state == state) {
                            a = null;
                        }
                        else {
                            a = s.a();
                        }
                        return a;
                    }
                };
                int h0;
                int n2;
                do {
                    h0 = d.w0().H0(b2, d, (t.c)c);
                    if (h0 == 1) {
                        n2 = 1;
                        break;
                    }
                    n2 = n;
                } while (h0 != 2);
                if (n2 != 0) {
                    f.d0(b2);
                    return;
                }
                continue;
            }
            else {
                if (!(state instanceof d0)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Illegal state ");
                    sb3.append(state);
                    throw new IllegalStateException(sb3.toString().toString());
                }
                ((d0)state).c(this);
            }
        }
    }
    
    @Override
    public boolean a(@org.jetbrains.annotations.f Object obj) {
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof kotlinx.coroutines.sync.b;
            boolean b2 = true;
            if (b) {
                if (((kotlinx.coroutines.sync.b)state).a != kotlinx.coroutines.sync.e.h()) {
                    return false;
                }
                kotlinx.coroutines.sync.b c;
                if (obj == null) {
                    c = kotlinx.coroutines.sync.e.c();
                }
                else {
                    c = new kotlinx.coroutines.sync.b(obj);
                }
                if (d.G.compareAndSet(this, state, c)) {
                    return true;
                }
                continue;
            }
            else if (state instanceof d) {
                if (((d)state).J == obj) {
                    b2 = false;
                }
                if (b2) {
                    return false;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Already locked by ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            else {
                if (!(state instanceof d0)) {
                    obj = new StringBuilder();
                    ((StringBuilder)obj).append("Illegal state ");
                    ((StringBuilder)obj).append(state);
                    throw new IllegalStateException(((StringBuilder)obj).toString().toString());
                }
                ((d0)state).c(this);
            }
        }
    }
    
    @Override
    public boolean b() {
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof kotlinx.coroutines.sync.b;
            boolean b2 = true;
            if (b) {
                if (((kotlinx.coroutines.sync.b)state).a == kotlinx.coroutines.sync.e.h()) {
                    b2 = false;
                }
                return b2;
            }
            if (state instanceof d) {
                return true;
            }
            if (!(state instanceof d0)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Illegal state ");
                sb.append(state);
                throw new IllegalStateException(sb.toString().toString());
            }
            ((d0)state).c(this);
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@org.jetbrains.annotations.f Object h, @org.jetbrains.annotations.e final d<? super j2> d) {
        if (this.a(h)) {
            return j2.a;
        }
        h = this.h(h, d);
        if (h == kotlin.coroutines.intrinsics.b.h()) {
            return h;
        }
        return j2.a;
    }
    
    @Override
    public void d(@org.jetbrains.annotations.f Object j) {
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof kotlinx.coroutines.sync.b;
            final int n = 1;
            final int n2 = 1;
            boolean b2 = true;
            if (b) {
                final kotlinx.coroutines.sync.b b3 = (kotlinx.coroutines.sync.b)state;
                if (j == null) {
                    if (b3.a == kotlinx.coroutines.sync.e.h()) {
                        b2 = false;
                    }
                    if (!b2) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                }
                else {
                    int n3;
                    if (b3.a == j) {
                        n3 = n;
                    }
                    else {
                        n3 = 0;
                    }
                    if (n3 == 0) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Mutex is locked by ");
                        sb.append(b3.a);
                        sb.append(" but expected ");
                        sb.append(j);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                if (d.G.compareAndSet(this, state, kotlinx.coroutines.sync.e.d())) {
                    return;
                }
                continue;
            }
            else if (state instanceof d0) {
                ((d0)state).c(this);
            }
            else {
                if (!(state instanceof d)) {
                    j = new StringBuilder();
                    ((StringBuilder)j).append("Illegal state ");
                    ((StringBuilder)j).append(state);
                    throw new IllegalStateException(((StringBuilder)j).toString().toString());
                }
                if (j != null) {
                    final d d = (d)state;
                    int n4;
                    if (d.J == j) {
                        n4 = n2;
                    }
                    else {
                        n4 = 0;
                    }
                    if (n4 == 0) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Mutex is locked by ");
                        sb2.append(d.J);
                        sb2.append(" but expected ");
                        sb2.append(j);
                        throw new IllegalStateException(sb2.toString().toString());
                    }
                }
                final d d2 = (d)state;
                final t e0 = d2.E0();
                if (e0 == null) {
                    final f f = new f(d2);
                    if (d.G.compareAndSet(this, state, f) && f.c(this) == null) {
                        return;
                    }
                    continue;
                }
                else {
                    final c c = (c)e0;
                    final Object k0 = c.K0();
                    if (k0 != null) {
                        j = c.J;
                        if (j == null) {
                            j = kotlinx.coroutines.sync.e.e();
                        }
                        d2.J = j;
                        c.J0(k0);
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    @Override
    public boolean e(@org.jetbrains.annotations.e final Object o) {
        final Object state = this._state;
        final boolean b = state instanceof kotlinx.coroutines.sync.b;
        boolean b2 = true;
        if (b) {
            if (((kotlinx.coroutines.sync.b)state).a == o) {
                return b2;
            }
        }
        else if (state instanceof d && ((d)state).J == o) {
            return b2;
        }
        b2 = false;
        return b2;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> f() {
        return this;
    }
    
    public final boolean g() {
        final Object state = this._state;
        return state instanceof d && ((d)state).K0();
    }
    
    final /* synthetic */ Object h(Object y, final d<? super j2> d) {
        final kotlinx.coroutines.p<Object> b = r.b((d<? super Object>)kotlin.coroutines.intrinsics.b.d((d)d));
        final a a = new a(y, b);
        while (true) {
            final Object state = this._state;
            if (state instanceof kotlinx.coroutines.sync.b) {
                final kotlinx.coroutines.sync.b b2 = (kotlinx.coroutines.sync.b)state;
                if (b2.a != kotlinx.coroutines.sync.e.h()) {
                    d.G.compareAndSet(this, state, new d(b2.a));
                }
                else {
                    kotlinx.coroutines.sync.b c;
                    if (y == null) {
                        c = kotlinx.coroutines.sync.e.c();
                    }
                    else {
                        c = new kotlinx.coroutines.sync.b(y);
                    }
                    if (d.G.compareAndSet(this, state, c)) {
                        b.Z(j2.a, (l<? super Throwable, j2>)new l<Throwable, j2>() {
                            final /* synthetic */ d I;
                            
                            public final void a(@org.jetbrains.annotations.e final Throwable t) {
                                this.I.d(y);
                            }
                        });
                        break;
                    }
                    continue;
                }
            }
            else if (state instanceof d) {
                final d d2 = (d)state;
                final Object j = d2.J;
                final int n = 0;
                if (j == y) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Already locked by ");
                    sb.append(y);
                    throw new IllegalStateException(sb.toString().toString());
                }
                final t.c c2 = new t.c() {
                    final /* synthetic */ d h;
                    
                    @org.jetbrains.annotations.f
                    public Object k(@org.jetbrains.annotations.e final t t) {
                        Object a;
                        if (this.h._state == state) {
                            a = null;
                        }
                        else {
                            a = s.a();
                        }
                        return a;
                    }
                };
                int h0;
                int n2;
                do {
                    h0 = d2.w0().H0(a, d2, (t.c)c2);
                    if (h0 == 1) {
                        n2 = 1;
                        break;
                    }
                    n2 = n;
                } while (h0 != 2);
                if (n2 != 0) {
                    r.c(b, a);
                    break;
                }
                continue;
            }
            else {
                if (!(state instanceof d0)) {
                    y = new StringBuilder();
                    ((StringBuilder)y).append("Illegal state ");
                    ((StringBuilder)y).append(state);
                    throw new IllegalStateException(((StringBuilder)y).toString().toString());
                }
                ((d0)state).c(this);
            }
        }
        y = b.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        StringBuilder sb;
        Object obj;
        while (true) {
            final Object state = this._state;
            if (state instanceof kotlinx.coroutines.sync.b) {
                sb = new StringBuilder();
                sb.append("Mutex[");
                obj = ((kotlinx.coroutines.sync.b)state).a;
                break;
            }
            if (state instanceof d0) {
                ((d0)state).c(this);
            }
            else {
                if (state instanceof d) {
                    sb = new StringBuilder();
                    sb.append("Mutex[");
                    obj = ((d)state).J;
                    break;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Illegal state ");
                sb2.append(state);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011" }, d2 = { "kotlinx/coroutines/sync/d$a", "Lkotlinx/coroutines/sync/d$c;", "Lkotlinx/coroutines/sync/d;", "", "K0", "token", "Lkotlin/j2;", "J0", "", "toString", "Lkotlinx/coroutines/o;", "L", "Lkotlinx/coroutines/o;", "cont", "owner", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;Lkotlinx/coroutines/o;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class a extends c
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final o<j2> L;
        final /* synthetic */ d M;
        
        public a(@org.jetbrains.annotations.e final Object o, final o<? super j2> l) {
            super(o);
            this.L = (o<j2>)l;
        }
        
        @Override
        public void J0(@org.jetbrains.annotations.e final Object o) {
            this.L.f0(o);
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object K0() {
            return this.L.S(j2.a, null, (l<? super Throwable, j2>)new l<Throwable, j2>() {
                final /* synthetic */ a G;
                
                public final void a(@org.jetbrains.annotations.e final Throwable t) {
                    final a g = this.G;
                    g.M.d(g.J);
                }
            });
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("LockCont[");
            sb.append(super.J);
            sb.append(", ");
            sb.append(this.L);
            sb.append("] for ");
            sb.append(d.this);
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016" }, d2 = { "kotlinx/coroutines/sync/d$b", "R", "Lkotlinx/coroutines/sync/d$c;", "Lkotlinx/coroutines/sync/d;", "", "K0", "token", "Lkotlin/j2;", "J0", "", "toString", "Lkotlinx/coroutines/selects/f;", "L", "Lkotlinx/coroutines/selects/f;", "select", "owner", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/c;", "Lkotlin/coroutines/d;", "block", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;Lkotlinx/coroutines/selects/f;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class b<R> extends c
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final kotlinx.coroutines.selects.f<R> L;
        @m6.d
        @org.jetbrains.annotations.e
        public final p<kotlinx.coroutines.sync.c, d<? super R>, Object> M;
        final /* synthetic */ d N;
        
        public b(@org.jetbrains.annotations.e final Object o, @org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> l, final p<? super kotlinx.coroutines.sync.c, ? super d<? super R>, ?> m) {
            super(o);
            this.L = (kotlinx.coroutines.selects.f<R>)l;
            this.M = (p<kotlinx.coroutines.sync.c, d<? super R>, Object>)m;
        }
        
        @Override
        public void J0(@org.jetbrains.annotations.e final Object o) {
            if (w0.b() && o != e.g()) {
                throw new AssertionError();
            }
            a.d((n6.p<? super d, ? super d<? super Object>, ?>)this.M, d.this, (d<? super Object>)this.L.w(), (l<? super Throwable, j2>)new l<Throwable, j2>() {
                final /* synthetic */ b G;
                
                public final void a(@org.jetbrains.annotations.e final Throwable t) {
                    final b g = this.G;
                    g.N.d(g.J);
                }
            });
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object K0() {
            k0 g;
            if (this.L.l()) {
                g = e.g();
            }
            else {
                g = null;
            }
            return g;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("LockSelect[");
            sb.append(super.J);
            sb.append(", ");
            sb.append(this.L);
            sb.append("] for ");
            sb.append(d.this);
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0004\u001a\u00020\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "kotlinx/coroutines/sync/d$c", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/l1;", "Lkotlin/j2;", "dispose", "", "K0", "token", "J0", "J", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private abstract class c extends t implements l1
    {
        @m6.d
        @org.jetbrains.annotations.f
        public final Object J;
        
        public c(final Object j) {
            this.J = j;
        }
        
        public abstract void J0(@org.jetbrains.annotations.e final Object p0);
        
        @org.jetbrains.annotations.f
        public abstract Object K0();
        
        @Override
        public final void dispose() {
            this.C0();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "kotlinx/coroutines/sync/d$d", "Lkotlinx/coroutines/internal/r;", "", "toString", "", "J", "Ljava/lang/Object;", "owner", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class d extends r
    {
        @m6.d
        @org.jetbrains.annotations.e
        public Object J;
        
        public d(@org.jetbrains.annotations.e final Object j) {
            this.J = j;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("LockedQueue[");
            sb.append(this.J);
            sb.append(']');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "kotlinx/coroutines/sync/d$e", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/d;", "op", "", "c", "failure", "Lkotlin/j2;", "a", "Ljava/lang/Object;", "owner", "Lkotlinx/coroutines/sync/d;", "b", "Lkotlinx/coroutines/sync/d;", "mutex", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class e extends kotlinx.coroutines.internal.b
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final d b;
        @m6.d
        @org.jetbrains.annotations.f
        public final Object c;
        
        public e(@org.jetbrains.annotations.e final d b, @org.jetbrains.annotations.f final Object c) {
            this.b = b;
            this.c = c;
        }
        
        @Override
        public void a(@org.jetbrains.annotations.e final kotlinx.coroutines.internal.d<?> d, @org.jetbrains.annotations.f Object c) {
            b b;
            if (c != null) {
                b = kotlinx.coroutines.sync.e.d();
            }
            else {
                c = this.c;
                if (c == null) {
                    b = kotlinx.coroutines.sync.e.c();
                }
                else {
                    b = new b(c);
                }
            }
            d.G.compareAndSet(this.b, d, b);
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object c(@org.jetbrains.annotations.e final kotlinx.coroutines.internal.d<?> d) {
            final a a = new a(d);
            if (!d.G.compareAndSet(this.b, kotlinx.coroutines.sync.e.d(), a)) {
                return kotlinx.coroutines.sync.e.f();
            }
            return a.c(this.b);
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f" }, d2 = { "kotlinx/coroutines/sync/d$e$a", "Lkotlinx/coroutines/internal/d0;", "", "affected", "c", "Lkotlinx/coroutines/internal/d;", "a", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/sync/d$e;Lkotlinx/coroutines/internal/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
        private final class a extends d0
        {
            @org.jetbrains.annotations.e
            private final kotlinx.coroutines.internal.d<?> a;
            
            public a(final kotlinx.coroutines.internal.d<?> a) {
                this.a = a;
            }
            
            @org.jetbrains.annotations.e
            @Override
            public kotlinx.coroutines.internal.d<?> a() {
                return this.a;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object c(@org.jetbrains.annotations.f final Object obj) {
                Object o;
                if (this.a().h()) {
                    o = kotlinx.coroutines.sync.e.d();
                }
                else {
                    o = this.a();
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                d.G.compareAndSet(obj, this, o);
                return null;
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "kotlinx/coroutines/sync/d$f", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/sync/d;", "affected", "", "k", "failure", "Lkotlin/j2;", "j", "Lkotlinx/coroutines/sync/d$d;", "b", "Lkotlinx/coroutines/sync/d$d;", "queue", "<init>", "(Lkotlinx/coroutines/sync/d$d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class f extends kotlinx.coroutines.internal.d<d>
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final d b;
        
        public f(@org.jetbrains.annotations.e final d b) {
            this.b = b;
        }
        
        public void j(@org.jetbrains.annotations.e final d d, @org.jetbrains.annotations.f final Object o) {
            Object o2;
            if (o == null) {
                o2 = kotlinx.coroutines.sync.e.d();
            }
            else {
                o2 = this.b;
            }
            d.G.compareAndSet(d, this, o2);
        }
        
        @org.jetbrains.annotations.f
        public Object k(@org.jetbrains.annotations.e final d d) {
            Object i;
            if (this.b.K0()) {
                i = null;
            }
            else {
                i = kotlinx.coroutines.sync.e.i();
            }
            return i;
        }
    }
}
