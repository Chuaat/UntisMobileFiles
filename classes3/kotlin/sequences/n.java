// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.c1;
import kotlin.b1$a;
import kotlin.b1;
import kotlin.jvm.internal.k0;
import kotlin.coroutines.i;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.e;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.f;
import kotlin.Metadata;
import o6.a;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.Iterator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00060(j\u0002`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006." }, d2 = { "Lkotlin/sequences/n;", "T", "Lkotlin/sequences/o;", "", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "o", "()Ljava/lang/Object;", "", "h", "", "hasNext", "next", "value", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "iterator", "e", "(Ljava/util/Iterator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/b1;", "result", "resumeWith", "(Ljava/lang/Object;)V", "J", "Lkotlin/coroutines/d;", "i", "()Lkotlin/coroutines/d;", "p", "(Lkotlin/coroutines/d;)V", "nextStep", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "H", "Ljava/lang/Object;", "nextValue", "I", "Ljava/util/Iterator;", "nextIterator", "", "Lkotlin/sequences/State;", "G", "state", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class n<T> extends o<T> implements Iterator<T>, d<j2>, a
{
    private int G;
    private T H;
    private Iterator<? extends T> I;
    @f
    private d<? super j2> J;
    
    public n() {
    }
    
    private final Throwable h() {
        final int g = this.G;
        RuntimeException ex;
        if (g != 4) {
            if (g != 5) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state of the iterator: ");
                sb.append(this.G);
                ex = new IllegalStateException(sb.toString());
            }
            else {
                ex = new IllegalStateException("Iterator has failed.");
            }
        }
        else {
            ex = new NoSuchElementException();
        }
        return ex;
    }
    
    private final T o() {
        if (this.hasNext()) {
            return this.next();
        }
        throw new NoSuchElementException();
    }
    
    @f
    @Override
    public Object b(final T h, @e final d<? super j2> j) {
        this.H = h;
        this.G = 3;
        this.J = j;
        final Object h2 = b.h();
        if (h2 == b.h()) {
            h.c((d)j);
        }
        if (h2 == b.h()) {
            return h2;
        }
        return j2.a;
    }
    
    @f
    @Override
    public Object e(@e final Iterator<? extends T> i, @e final d<? super j2> j) {
        if (!i.hasNext()) {
            return j2.a;
        }
        this.I = i;
        this.G = 2;
        this.J = j;
        final Object h = b.h();
        if (h == b.h()) {
            kotlin.coroutines.jvm.internal.h.c((d)j);
        }
        if (h == b.h()) {
            return h;
        }
        return j2.a;
    }
    
    @e
    public g getContext() {
        return (g)i.H;
    }
    
    @Override
    public boolean hasNext() {
        while (true) {
            final int g = this.G;
            if (g != 0) {
                if (g != 1) {
                    if (g == 2 || g == 3) {
                        return true;
                    }
                    if (g == 4) {
                        return false;
                    }
                    throw this.h();
                }
                else {
                    final Iterator<? extends T> i = this.I;
                    k0.m((Object)i);
                    if (i.hasNext()) {
                        this.G = 2;
                        return true;
                    }
                    this.I = null;
                }
            }
            this.G = 5;
            final d<? super j2> j = this.J;
            k0.m((Object)j);
            this.J = null;
            final j2 a = j2.a;
            final b1$a h = b1.H;
            j.resumeWith(b1.b((Object)a));
        }
    }
    
    @f
    public final d<j2> i() {
        return (d<j2>)this.J;
    }
    
    @Override
    public T next() {
        final int g = this.G;
        if (g == 0 || g == 1) {
            return this.o();
        }
        if (g == 2) {
            this.G = 1;
            final Iterator<? extends T> i = this.I;
            k0.m((Object)i);
            return (T)i.next();
        }
        if (g == 3) {
            this.G = 0;
            final T h = this.H;
            this.H = null;
            return h;
        }
        throw this.h();
    }
    
    public final void p(@f final d<? super j2> j) {
        this.J = j;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public void resumeWith(@e final Object o) {
        c1.n(o);
        this.G = 4;
    }
}
