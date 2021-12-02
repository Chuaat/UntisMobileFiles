// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import n6.p;
import org.jetbrains.annotations.f;
import java.util.ArrayList;
import java.util.List;
import n6.l;
import kotlinx.coroutines.w0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.e;
import m6.d;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\b\u0000\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0017\u0013B\u0017\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J3\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016R\u0016\u0010%\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0016\u0010&\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0016\u0010(\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0013\u0010*\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0013\u0010-\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061" }, d2 = { "Lkotlinx/coroutines/internal/w;", "", "E", "", "index", "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/w;", "oldHead", "newHead", "m", "(II)Lkotlinx/coroutines/internal/w;", "", "j", "()J", "state", "c", "(J)Lkotlinx/coroutines/internal/w;", "b", "", "d", "()Z", "a", "(Ljava/lang/Object;)I", "l", "()Ljava/lang/Object;", "k", "()Lkotlinx/coroutines/internal/w;", "R", "Lkotlin/Function1;", "transform", "", "i", "(Ln6/l;)Ljava/util/List;", "g", "I", "capacity", "mask", "Z", "singleConsumer", "h", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "w", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class w<E>
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater e;
    private static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final int g = 8;
    public static final int h = 30;
    public static final int i = 1073741823;
    public static final int j = 0;
    public static final long k = 1073741823L;
    public static final int l = 30;
    public static final long m = 1152921503533105152L;
    public static final int n = 60;
    public static final long o = 1152921504606846976L;
    public static final int p = 61;
    public static final long q = 2305843009213693952L;
    public static final int r = 1024;
    @d
    @e
    public static final k0 s;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    @e
    public static final a w;
    private volatile /* synthetic */ Object _next;
    private volatile /* synthetic */ long _state;
    private final int a;
    private /* synthetic */ AtomicReferenceArray b;
    private final int c;
    private final boolean d;
    
    static {
        w = new a(null);
        s = new k0("REMOVE_FROZEN");
        e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_next");
        f = AtomicLongFieldUpdater.newUpdater(w.class, "_state");
    }
    
    public w(final int n, final boolean d) {
        this.c = n;
        this.d = d;
        final int a = n - 1;
        this.a = a;
        this._next = null;
        this._state = 0L;
        this.b = new AtomicReferenceArray(n);
        final int n2 = 0;
        if (a > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int n3 = n2;
        if ((n & a) == 0x0) {
            n3 = 1;
        }
        if (n3 != 0) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    private final w<E> b(final long n) {
        final w w = new w(this.c * 2, this.d);
        int n2 = (int)((0x3FFFFFFFL & n) >> 0);
        final int n3 = (int)((0xFFFFFFFC0000000L & n) >> 30);
        while (true) {
            final int a = this.a;
            if ((n2 & a) == (n3 & a)) {
                break;
            }
            Object value = this.b.get(a & n2);
            if (value == null) {
                value = new b(n2);
            }
            w.b.set(w.a & n2, value);
            ++n2;
        }
        w._state = kotlinx.coroutines.internal.w.w.e(n, 1152921504606846976L);
        return w;
    }
    
    private final w<E> c(final long n) {
        w w;
        while (true) {
            w = (w)this._next;
            if (w != null) {
                break;
            }
            kotlinx.coroutines.internal.w.e.compareAndSet(this, null, this.b(n));
        }
        return w;
    }
    
    private final w<E> e(final int n, final E newValue) {
        final b value = this.b.get(this.a & n);
        if (value instanceof b && value.a == n) {
            this.b.set(n & this.a, newValue);
            return this;
        }
        return null;
    }
    
    private final long j() {
        long state;
        long n;
        do {
            state = this._state;
            if ((state & 0x1000000000000000L) != 0x0L) {
                return state;
            }
            n = (state | 0x1000000000000000L);
        } while (!kotlinx.coroutines.internal.w.f.compareAndSet(this, state, n));
        return n;
    }
    
    private final w<E> m(final int n, final int n2) {
        long state;
        a w;
        int n3;
        do {
            state = this._state;
            w = kotlinx.coroutines.internal.w.w;
            boolean b = false;
            n3 = (int)((0x3FFFFFFFL & state) >> 0);
            if (w0.b()) {
                if (n3 == n) {
                    b = true;
                }
                if (!b) {
                    throw new AssertionError();
                }
            }
            if ((0x1000000000000000L & state) != 0x0L) {
                return this.k();
            }
        } while (!kotlinx.coroutines.internal.w.f.compareAndSet(this, state, w.b(state, n2)));
        this.b.set(this.a & n3, null);
        return null;
    }
    
    public final int a(@e final E newValue) {
        while (true) {
            final long state = this._state;
            if ((0x3000000000000000L & state) != 0x0L) {
                return kotlinx.coroutines.internal.w.w.a(state);
            }
            final a w = kotlinx.coroutines.internal.w.w;
            final int n = (int)((0x3FFFFFFFL & state) >> 0);
            final int n2 = (int)((0xFFFFFFFC0000000L & state) >> 30);
            final int a = this.a;
            if ((n2 + 2 & a) == (n & a)) {
                return 1;
            }
            if (!this.d && this.b.get(n2 & a) != null) {
                final int c = this.c;
                if (c < 1024 || (n2 - n & 0x3FFFFFFF) > c >> 1) {
                    return 1;
                }
                continue;
            }
            else {
                if (kotlinx.coroutines.internal.w.f.compareAndSet(this, state, w.c(state, n2 + 1 & 0x3FFFFFFF))) {
                    this.b.set(n2 & a, newValue);
                    w e = this;
                    while ((e._state & 0x1000000000000000L) != 0x0L) {
                        e = e.k().e(n2, newValue);
                        if (e != null) {
                            continue;
                        }
                        return 0;
                    }
                    return 0;
                }
                continue;
            }
        }
    }
    
    public final boolean d() {
        long state;
        do {
            state = this._state;
            if ((state & 0x2000000000000000L) != 0x0L) {
                return true;
            }
            if ((0x1000000000000000L & state) != 0x0L) {
                return false;
            }
        } while (!kotlinx.coroutines.internal.w.f.compareAndSet(this, state, state | 0x2000000000000000L));
        return true;
    }
    
    public final int f() {
        final long state = this._state;
        return 0x3FFFFFFF & (int)((state & 0xFFFFFFFC0000000L) >> 30) - (int)((0x3FFFFFFFL & state) >> 0);
    }
    
    public final boolean g() {
        return (this._state & 0x2000000000000000L) != 0x0L;
    }
    
    public final boolean h() {
        final long state = this._state;
        boolean b = false;
        if ((int)((0x3FFFFFFFL & state) >> 0) == (int)((state & 0xFFFFFFFC0000000L) >> 30)) {
            b = true;
        }
        return b;
    }
    
    @e
    public final <R> List<R> i(@e final l<? super E, ? extends R> l) {
        final ArrayList<R> list = new ArrayList<R>(this.c);
        final long state = this._state;
        int n = (int)((0x3FFFFFFFL & state) >> 0);
        final int n2 = (int)((state & 0xFFFFFFFC0000000L) >> 30);
        while (true) {
            final int a = this.a;
            if ((n & a) == (n2 & a)) {
                break;
            }
            final Object value = this.b.get(a & n);
            if (value != null && !(value instanceof b)) {
                list.add((R)l.invoke(value));
            }
            ++n;
        }
        return list;
    }
    
    @e
    public final w<E> k() {
        return this.c(this.j());
    }
    
    @f
    public final Object l() {
        while (true) {
            final long state = this._state;
            if ((0x1000000000000000L & state) != 0x0L) {
                return kotlinx.coroutines.internal.w.s;
            }
            final a w = kotlinx.coroutines.internal.w.w;
            final int n = (int)((0x3FFFFFFFL & state) >> 0);
            final int n2 = (int)((0xFFFFFFFC0000000L & state) >> 30);
            final int a = this.a;
            if ((n2 & a) == (n & a)) {
                return null;
            }
            final Object value = this.b.get(a & n);
            if (value == null) {
                if (this.d) {
                    return null;
                }
                continue;
            }
            else {
                if (value instanceof b) {
                    return null;
                }
                final int n3 = n + 1 & 0x3FFFFFFF;
                if (kotlinx.coroutines.internal.w.f.compareAndSet(this, state, w.b(state, n3))) {
                    this.b.set(this.a & n, null);
                    return value;
                }
                if (!this.d) {
                    continue;
                }
                w m = this;
                do {
                    m = m.m(n, n3);
                } while (m != null);
                return value;
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0016\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0016\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0016\u0010!\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0016\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0016\u0010$\u001a\u00020#8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0016\u0010'\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*" }, d2 = { "kotlinx/coroutines/internal/w$a", "", "", "other", "e", "", "newHead", "b", "newTail", "c", "T", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "head", "tail", "block", "d", "(JLn6/p;)Ljava/lang/Object;", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/k0;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/k0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a
    {
        private a() {
        }
        
        public final int a(final long n) {
            int n2;
            if ((n & 0x2000000000000000L) != 0x0L) {
                n2 = 2;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
        
        public final long b(final long n, final int n2) {
            return this.e(n, 1073741823L) | (long)n2 << 0;
        }
        
        public final long c(final long n, final int n2) {
            return this.e(n, 1152921503533105152L) | (long)n2 << 30;
        }
        
        public final <T> T d(final long n, @e final p<? super Integer, ? super Integer, ? extends T> p2) {
            return (T)p2.invoke((Object)(int)((0x3FFFFFFFL & n) >> 0), (Object)(int)((n & 0xFFFFFFFC0000000L) >> 30));
        }
        
        public final long e(final long n, final long n2) {
            return n & ~n2;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "kotlinx/coroutines/internal/w$b", "", "", "a", "I", "index", "<init>", "(I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class b
    {
        @d
        public final int a;
        
        public b(final int a) {
            this.a = a;
        }
    }
}
