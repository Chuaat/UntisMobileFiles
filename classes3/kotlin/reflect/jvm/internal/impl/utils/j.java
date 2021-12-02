// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import java.util.NoSuchElementException;
import java.util.Collection;
import kotlin.jvm.internal.i;
import o6.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.q1;
import kotlin.j2;
import java.util.Arrays;
import kotlin.collections.j1;
import kotlin.collections.m;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import m6.k;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.util.AbstractSet;

public final class j<T> extends AbstractSet<T>
{
    @e
    public static final b I;
    @f
    private Object G;
    private int H;
    
    static {
        I = new b(null);
    }
    
    private j() {
    }
    
    @k
    @e
    public static final <T> j<T> b() {
        return j.I.a();
    }
    
    @Override
    public boolean add(final T t) {
        if (this.size() == 0) {
            this.G = t;
        }
        else if (this.size() == 1) {
            if (k0.g(this.G, (Object)t)) {
                return false;
            }
            this.G = new Object[] { this.G, t };
        }
        else if (this.size() < 5) {
            final Object g = this.G;
            Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            final Object[] original = (Object[])g;
            if (m.P7(original, (Object)t)) {
                return false;
            }
            LinkedHashSet<T> g2;
            if (this.size() == 4) {
                final Object[] array = new Object[original.length];
                System.arraycopy(original, 0, array, 0, original.length);
                final LinkedHashSet o = j1.o(array);
                o.add(t);
                g2 = (LinkedHashSet<T>)o;
            }
            else {
                final Object[] copy = Arrays.copyOf(original, this.size() + 1);
                k0.o((Object)copy, "java.util.Arrays.copyOf(this, newSize)");
                copy[copy.length - 1] = t;
                g2 = (LinkedHashSet<T>)copy;
            }
            final j2 a = j2.a;
            this.G = g2;
        }
        else {
            final Object g3 = this.G;
            Objects.requireNonNull(g3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!q1.o(g3).add(t)) {
                return false;
            }
        }
        this.h(this.size() + 1);
        return true;
    }
    
    @Override
    public void clear() {
        this.G = null;
        this.h(0);
    }
    
    @Override
    public boolean contains(final Object o) {
        boolean b;
        if (this.size() == 0) {
            b = false;
        }
        else if (this.size() == 1) {
            b = k0.g(this.G, o);
        }
        else if (this.size() < 5) {
            final Object g = this.G;
            Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            b = m.P7((Object[])g, o);
        }
        else {
            final Object g2 = this.G;
            Objects.requireNonNull(g2, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
            b = ((Set)g2).contains(o);
        }
        return b;
    }
    
    public int f() {
        return this.H;
    }
    
    public void h(final int h) {
        this.H = h;
    }
    
    @e
    @Override
    public Iterator<T> iterator() {
        Set<T> set;
        if (this.size() == 0) {
            set = Collections.emptySet();
        }
        else {
            if (this.size() == 1) {
                final Object iterator = new c<T>(this.G);
                return (Iterator<T>)iterator;
            }
            if (this.size() < 5) {
                final Object g = this.G;
                Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                final Object iterator = new a<T>((Object[])g);
                return (Iterator<T>)iterator;
            }
            final Object g2 = this.G;
            Objects.requireNonNull(g2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            set = (Set<T>)q1.o(g2);
        }
        final Object iterator = set.iterator();
        return (Iterator<T>)iterator;
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.f();
    }
    
    private static final class a<T> implements Iterator<T>, d
    {
        @e
        private final Iterator<T> G;
        
        public a(@e final T[] array) {
            k0.p((Object)array, "array");
            this.G = (Iterator<T>)i.a((Object[])array);
        }
        
        @e
        public Void a() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean hasNext() {
            return this.G.hasNext();
        }
        
        @Override
        public T next() {
            return this.G.next();
        }
    }
    
    public static final class b
    {
        private b() {
        }
        
        @k
        @e
        public final <T> j<T> a() {
            return new j<T>(null);
        }
        
        @k
        @e
        public final <T> j<T> b(@e final Collection<? extends T> c) {
            k0.p((Object)c, "set");
            final j<Object> j = (j<Object>)new j<T>(null);
            j.addAll(c);
            return (j<T>)j;
        }
    }
    
    private static final class c<T> implements Iterator<T>, d
    {
        private final T G;
        private boolean H;
        
        public c(final T g) {
            this.G = g;
            this.H = true;
        }
        
        @e
        public Void a() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean hasNext() {
            return this.H;
        }
        
        @Override
        public T next() {
            if (this.H) {
                this.H = false;
                return this.G;
            }
            throw new NoSuchElementException();
        }
    }
}
