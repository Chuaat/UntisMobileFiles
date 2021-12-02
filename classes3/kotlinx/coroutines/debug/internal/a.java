// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import o6.g$a;
import java.util.NoSuchElementException;
import o6.d;
import kotlin.ranges.o;
import kotlin.jvm.internal.k0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.ref.Reference;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import org.jetbrains.annotations.e;
import n6.p;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.w;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u001f\u0017\u001bB\u0011\u0012\b\b\u0002\u0010$\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0007R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e0\u00168V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006(" }, d2 = { "Lkotlinx/coroutines/debug/internal/a;", "", "K", "V", "Lkotlin/collections/h;", "Lkotlin/j2;", "h", "()V", "key", "value", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/i;", "w", "g", "(Lkotlinx/coroutines/debug/internal/i;)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "remove", "clear", "k", "", "b", "()Ljava/util/Set;", "keys", "", "c", "()I", "size", "", "a", "entries", "Ljava/lang/ref/ReferenceQueue;", "G", "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", "<init>", "(Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class a<K, V> extends h<K, V>
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater H;
    private final ReferenceQueue<K> G;
    private volatile /* synthetic */ int _size;
    volatile /* synthetic */ Object core;
    
    static {
        H = AtomicIntegerFieldUpdater.newUpdater(a.class, "_size");
    }
    
    public a() {
        this(false, 1, null);
    }
    
    public a(final boolean b) {
        this._size = 0;
        this.core = new a(16);
        ReferenceQueue<K> g;
        if (b) {
            g = new ReferenceQueue<K>();
        }
        else {
            g = null;
        }
        this.G = g;
    }
    
    public static final /* synthetic */ ReferenceQueue f(final a a) {
        return a.G;
    }
    
    private final void g(final i<?> i) {
        ((a)this.core).b(i);
    }
    
    private final void h() {
        a.H.decrementAndGet(this);
    }
    
    private final V i(final K k, final V v) {
        synchronized (this) {
            a h = (a)this.core;
            Object g;
            while (true) {
                g = a.g(h, k, v, null, 4, null);
                if (g != kotlinx.coroutines.debug.internal.b.a()) {
                    break;
                }
                h = h.h();
                this.core = h;
            }
            return (V)g;
        }
    }
    
    @e
    public Set<Map.Entry<K, V>> a() {
        return (Set<Map.Entry<K, V>>)new c((n6.p<? super K, ? super V, ?>)a$d.G);
    }
    
    @e
    public Set<K> b() {
        return (Set<K>)new c((n6.p<? super K, ? super V, ?>)a$e.G);
    }
    
    public int c() {
        return this._size;
    }
    
    public void clear() {
        final Iterator<Object> iterator = this.keySet().iterator();
        while (iterator.hasNext()) {
            this.remove(iterator.next());
        }
    }
    
    @f
    public V get(@e final Object o) {
        if (o != null) {
            return ((a)this.core).c(o);
        }
        return null;
    }
    
    public final void k() {
        if (this.G != null) {
            try {
                while (true) {
                    final Reference<? extends K> remove = this.G.remove();
                    if (remove == null) {
                        break;
                    }
                    this.g((i<?>)remove);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
    }
    
    @f
    public V put(@e final K k, @e final V v) {
        Object o;
        if ((o = a.g((a)this.core, k, v, null, 4, null)) == kotlinx.coroutines.debug.internal.b.a()) {
            o = this.i(k, v);
        }
        if (o == null) {
            a.H.incrementAndGet(this);
        }
        return (V)o;
    }
    
    @f
    public V remove(@e final Object o) {
        if (o != null) {
            Object o2;
            if ((o2 = a.g((a)this.core, o, null, null, 4, null)) == kotlinx.coroutines.debug.internal.b.a()) {
                o2 = this.i(o, null);
            }
            if (o2 != null) {
                a.H.decrementAndGet(this);
            }
            return (V)o2;
        }
        return null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00120\u0012R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00072\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u001c\"\u0004\b\u0002\u0010\u00192\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006&" }, d2 = { "kotlinx/coroutines/debug/internal/a$a", "", "", "hash", "d", "(I)I", "index", "Lkotlin/j2;", "i", "(I)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlinx/coroutines/debug/internal/i;", "weakKey0", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/i;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/a$a;", "Lkotlinx/coroutines/debug/internal/a;", "h", "()Lkotlinx/coroutines/debug/internal/a$a;", "weakRef", "b", "(Lkotlinx/coroutines/debug/internal/i;)V", "E", "Lkotlin/Function2;", "factory", "", "e", "(Ln6/p;)Ljava/util/Iterator;", "I", "threshold", "allocated", "a", "shift", "<init>", "(Lkotlinx/coroutines/debug/internal/a;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class a
    {
        private static final /* synthetic */ AtomicIntegerFieldUpdater g;
        private final int a;
        private final int b;
        /* synthetic */ AtomicReferenceArray c;
        /* synthetic */ AtomicReferenceArray d;
        private final int e;
        private volatile /* synthetic */ int load;
        
        static {
            g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");
        }
        
        public a(final int n) {
            this.e = n;
            this.a = Integer.numberOfLeadingZeros(n) + 1;
            this.b = n * 2 / 3;
            this.load = 0;
            this.c = new AtomicReferenceArray(n);
            this.d = new AtomicReferenceArray(n);
        }
        
        public static final /* synthetic */ int a(final a a) {
            return a.e;
        }
        
        private final int d(final int n) {
            return n * -1640531527 >>> this.a;
        }
        
        public static /* synthetic */ Object g(final a a, final Object o, final Object o2, i i, final int n, final Object o3) {
            if ((n & 0x4) != 0x0) {
                i = null;
            }
            return a.f(o, o2, i);
        }
        
        private final void i(final int n) {
            Object value;
            do {
                value = this.d.get(n);
                if (value == null) {
                    return;
                }
                if (value instanceof j) {
                    return;
                }
            } while (!this.d.compareAndSet(n, value, null));
            kotlinx.coroutines.debug.internal.a.this.h();
        }
        
        public final void b(@e final i<?> i) {
            int d = this.d(i.a);
            while (true) {
                final i<?> j = this.c.get(d);
                if (j == null) {
                    return;
                }
                if (j == i) {
                    this.i(d);
                    return;
                }
                int e;
                if ((e = d) == 0) {
                    e = this.e;
                }
                d = e - 1;
            }
        }
        
        @f
        public final V c(@e final K k) {
            int d = this.d(k.hashCode());
            while (true) {
                final i<Object> i = this.c.get(d);
                if (i == null) {
                    return null;
                }
                final Object value = i.get();
                if (k0.g((Object)k, value)) {
                    Object o2;
                    final Object o = o2 = this.d.get(d);
                    if (o instanceof j) {
                        o2 = ((j)o).a;
                    }
                    return (V)o2;
                }
                if (value == null) {
                    this.i(d);
                }
                int e;
                if ((e = d) == 0) {
                    e = this.e;
                }
                d = e - 1;
            }
        }
        
        @e
        public final <E> Iterator<E> e(@e final p<? super K, ? super V, ? extends E> p) {
            return new a<E>(p);
        }
        
        @f
        public final Object f(@e final K k, @f final V newValue, @f i<K> i) {
            int d = this.d(k.hashCode());
            int n = 0;
            while (true) {
                final i<Object> j = this.c.get(d);
                if (j == null) {
                    if (newValue == null) {
                        return null;
                    }
                    int n2;
                    if ((n2 = n) == 0) {
                        int load;
                        do {
                            load = this.load;
                            if (load >= this.b) {
                                return kotlinx.coroutines.debug.internal.b.a();
                            }
                        } while (!kotlinx.coroutines.debug.internal.a.a.g.compareAndSet(this, load, load + 1));
                        n2 = 1;
                    }
                    i<K> newValue2;
                    if ((newValue2 = i) == null) {
                        newValue2 = new i<K>(k, kotlinx.coroutines.debug.internal.a.f(kotlinx.coroutines.debug.internal.a.this));
                    }
                    n = n2;
                    i = newValue2;
                    if (this.c.compareAndSet(d, null, newValue2)) {
                        break;
                    }
                    continue;
                }
                else {
                    final Object value = j.get();
                    if (k0.g((Object)k, value)) {
                        if (n != 0) {
                            kotlinx.coroutines.debug.internal.a.a.g.decrementAndGet(this);
                            break;
                        }
                        break;
                    }
                    else {
                        if (value == null) {
                            this.i(d);
                        }
                        int e;
                        if ((e = d) == 0) {
                            e = this.e;
                        }
                        d = e - 1;
                    }
                }
            }
            Object value2;
            do {
                value2 = this.d.get(d);
                if (value2 instanceof j) {
                    return kotlinx.coroutines.debug.internal.b.a();
                }
            } while (!this.d.compareAndSet(d, value2, newValue));
            return value2;
        }
        
        @e
        public final a h() {
            a a = null;
        Label_0000:
            while (true) {
                a = new a(Integer.highestOneBit(o.n(kotlinx.coroutines.debug.internal.a.this.size(), 4)) * 4);
                for (int i = 0; i < this.e; ++i) {
                    final i<Object> j = this.c.get(i);
                    K value;
                    if (j != null) {
                        value = j.get();
                    }
                    else {
                        value = null;
                    }
                    if (j != null && value == null) {
                        this.i(i);
                    }
                    Object expectedValue;
                    do {
                        expectedValue = this.d.get(i);
                        if (expectedValue instanceof j) {
                            expectedValue = ((j)expectedValue).a;
                            break;
                        }
                    } while (!this.d.compareAndSet(i, expectedValue, kotlinx.coroutines.debug.internal.b.b(expectedValue)));
                    if (value != null && expectedValue != null && a.f(value, (V)expectedValue, (i<K>)j) == kotlinx.coroutines.debug.internal.b.a()) {
                        continue Label_0000;
                    }
                }
                break;
            }
            return a;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\r\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0017" }, d2 = { "kotlinx/coroutines/debug/internal/a$a$a", "E", "", "Lkotlin/j2;", "a", "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "H", "Ljava/lang/Object;", "key", "", "G", "I", "index", "value", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/a$a;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
        private final class a<E> implements Iterator<E>, d
        {
            private int G;
            private K H;
            private V I;
            private final p<K, V, E> J;
            
            public a(final p<? super K, ? super V, ? extends E> j) {
                this.J = (p<K, V, E>)j;
                this.G = -1;
                this.a();
            }
            
            private final void a() {
                while (++this.G < kotlinx.coroutines.debug.internal.a.a.a(kotlinx.coroutines.debug.internal.a.a.this)) {
                    final i<Object> i = kotlinx.coroutines.debug.internal.a.a.this.c.get(this.G);
                    if (i != null) {
                        final K value = i.get();
                        if (value == null) {
                            continue;
                        }
                        this.H = value;
                        Object j;
                        final Object o = j = kotlinx.coroutines.debug.internal.a.a.this.d.get(this.G);
                        if (o instanceof j) {
                            j = ((j)o).a;
                        }
                        if (j != null) {
                            this.I = (V)j;
                            break;
                        }
                        continue;
                    }
                }
            }
            
            @e
            public Void b() {
                kotlinx.coroutines.debug.internal.b.c();
                throw new kotlin.w();
            }
            
            @Override
            public boolean hasNext() {
                return this.G < kotlinx.coroutines.debug.internal.a.a.a(kotlinx.coroutines.debug.internal.a.a.this);
            }
            
            @Override
            public E next() {
                if (this.G < kotlinx.coroutines.debug.internal.a.a.a(kotlinx.coroutines.debug.internal.a.a.this)) {
                    final p<K, V, E> j = this.J;
                    final K h = this.H;
                    if (h == null) {
                        k0.S("key");
                    }
                    final V i = this.I;
                    if (i == null) {
                        k0.S("value");
                    }
                    final Object invoke = j.invoke((Object)h, (Object)i);
                    this.a();
                    return (E)invoke;
                }
                throw new NoSuchElementException();
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0002\u0012\u0006\u0010\u000b\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\u00028\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\u00028\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011" }, d2 = { "kotlinx/coroutines/debug/internal/a$b", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "H", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "G", "getKey", "key", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class b<K, V> implements Entry<K, V>, g$a
    {
        private final K G;
        private final V H;
        
        public b(final K g, final V h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public K getKey() {
            return this.G;
        }
        
        @Override
        public V getValue() {
            return this.H;
        }
        
        @Override
        public V setValue(final V v) {
            kotlinx.coroutines.debug.internal.b.c();
            throw new kotlin.w();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0096\u0002R\u0016\u0010\f\u001a\u00020\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011" }, d2 = { "kotlinx/coroutines/debug/internal/a$c", "E", "Lkotlin/collections/i;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "", "b", "()I", "size", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/a;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class c<E> extends kotlin.collections.i<E>
    {
        private final p<K, V, E> G;
        
        public c(final p<? super K, ? super V, ? extends E> g) {
            this.G = (p<K, V, E>)g;
        }
        
        public boolean add(final E e) {
            kotlinx.coroutines.debug.internal.b.c();
            throw new kotlin.w();
        }
        
        public int b() {
            return a.this.size();
        }
        
        @e
        public Iterator<E> iterator() {
            return ((a)a.this.core).e((n6.p<? super K, ? super V, ? extends E>)this.G);
        }
    }
}
