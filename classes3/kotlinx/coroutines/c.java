// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.k0;
import kotlin.b1$a;
import kotlin.b1;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.j2;
import n6.l;
import kotlin.coroutines.intrinsics.b;
import java.util.List;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/c;", "T", "", "", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/a1;", "a", "[Lkotlinx/coroutines/a1;", "deferreds", "<init>", "([Lkotlinx/coroutines/a1;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class c<T>
{
    static final /* synthetic */ AtomicIntegerFieldUpdater b;
    private final a1<T>[] a;
    volatile /* synthetic */ int notCompletedCount;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");
    }
    
    public c(@e final a1<? extends T>[] a) {
        this.a = (a1<T>[])a;
        this.notCompletedCount = ((a1<T>[])a).length;
    }
    
    public static final /* synthetic */ a1[] a(final c c) {
        return c.a;
    }
    
    @f
    public final Object b(@e final d<? super List<? extends T>> d) {
        final p<Object> p = new p<Object>((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d((d)d), 1);
        p.H();
        final int length = a(this).length;
        final a[] array = new a[length];
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            final a1 a1 = a(this)[kotlin.coroutines.jvm.internal.b.f(i).intValue()];
            a1.start();
            final a a2 = new a(p);
            a2.P0(a1.N((l)a2));
            array[i] = a2;
        }
        final b b = new b(array);
        for (int j = n; j < length; ++j) {
            array[j].O0(b);
        }
        if (p.g()) {
            b.b();
        }
        else {
            p.t((l<? super Throwable, j2>)b);
        }
        final Object y = p.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e" }, d2 = { "kotlinx/coroutines/c$a", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/o;", "", "L", "Lkotlinx/coroutines/o;", "continuation", "Lkotlinx/coroutines/l1;", "K", "Lkotlinx/coroutines/l1;", "N0", "()Lkotlinx/coroutines/l1;", "P0", "(Lkotlinx/coroutines/l1;)V", "handle", "Lkotlinx/coroutines/c$b;", "Lkotlinx/coroutines/c;", "value", "M0", "()Lkotlinx/coroutines/c$b;", "O0", "(Lkotlinx/coroutines/c$b;)V", "disposer", "<init>", "(Lkotlinx/coroutines/c;Lkotlinx/coroutines/o;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class a extends r2
    {
        public l1 K;
        private final o<List<? extends T>> L;
        private volatile /* synthetic */ Object _disposer;
        
        public a(final o<? super List<? extends T>> l) {
            this.L = (o<List<? extends T>>)l;
            this._disposer = null;
        }
        
        @Override
        public void J0(@f final Throwable t) {
            if (t != null) {
                final Object d = this.L.D(t);
                if (d != null) {
                    this.L.f0(d);
                    final b m0 = this.M0();
                    if (m0 != null) {
                        m0.b();
                    }
                }
            }
            else if (c.b.decrementAndGet(c.this) == 0) {
                final o<List<? extends T>> l = this.L;
                final a1[] a = c.a(c.this);
                final ArrayList list = new ArrayList<Object>(a.length);
                for (int length = a.length, i = 0; i < length; ++i) {
                    list.add(a[i].j());
                }
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)l).resumeWith(b1.b((Object)list));
            }
        }
        
        @f
        public final b M0() {
            return (b)this._disposer;
        }
        
        @org.jetbrains.annotations.e
        public final l1 N0() {
            final l1 k = this.K;
            if (k == null) {
                k0.S("handle");
            }
            return k;
        }
        
        public final void O0(@f final b disposer) {
            this._disposer = disposer;
        }
        
        public final void P0(@org.jetbrains.annotations.e final l1 k) {
            this.K = k;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R&\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "kotlinx/coroutines/c$b", "Lkotlinx/coroutines/m;", "Lkotlin/j2;", "b", "", "cause", "a", "", "toString", "", "Lkotlinx/coroutines/c$a;", "Lkotlinx/coroutines/c;", "G", "[Lkotlinx/coroutines/c$a;", "nodes", "<init>", "(Lkotlinx/coroutines/c;[Lkotlinx/coroutines/c$a;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class b extends m
    {
        private final a[] G;
        
        public b(final a[] g) {
            this.G = g;
        }
        
        @Override
        public void a(@f final Throwable t) {
            this.b();
        }
        
        public final void b() {
            final a[] g = this.G;
            for (int length = g.length, i = 0; i < length; ++i) {
                g[i].N0().dispose();
            }
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("DisposeHandlersOnCancel[");
            sb.append(this.G);
            sb.append(']');
            return sb.toString();
        }
    }
}
