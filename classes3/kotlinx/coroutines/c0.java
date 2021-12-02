// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J&\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J`\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0013\u0010 \u001a\u00020\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010#¨\u0006&" }, d2 = { "Lkotlinx/coroutines/c0;", "", "Lkotlinx/coroutines/p;", "cont", "", "cause", "Lkotlin/j2;", "i", "a", "Lkotlinx/coroutines/m;", "b", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "c", "d", "e", "result", "cancelHandler", "onCancellation", "idempotentResume", "cancelCause", "f", "", "toString", "", "hashCode", "other", "", "equals", "h", "()Z", "cancelled", "Ljava/lang/Object;", "Ljava/lang/Throwable;", "Lkotlinx/coroutines/m;", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/m;Ln6/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class c0
{
    @d
    @f
    public final Object a;
    @d
    @f
    public final m b;
    @d
    @f
    public final l<Throwable, j2> c;
    @d
    @f
    public final Object d;
    @d
    @f
    public final Throwable e;
    
    public c0(@f final Object a, @f final m b, @f final l<? super Throwable, j2> c, @f final Object d, @f final Throwable e) {
        this.a = a;
        this.b = b;
        this.c = (l<Throwable, j2>)c;
        this.d = d;
        this.e = e;
    }
    
    @f
    public final Object a() {
        return this.a;
    }
    
    @f
    public final m b() {
        return this.b;
    }
    
    @f
    public final l<Throwable, j2> c() {
        return this.c;
    }
    
    @f
    public final Object d() {
        return this.d;
    }
    
    @f
    public final Throwable e() {
        return this.e;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof c0) {
                final c0 c0 = (c0)o;
                if (k0.g(this.a, c0.a) && k0.g((Object)this.b, (Object)c0.b) && k0.g((Object)this.c, (Object)c0.c) && k0.g(this.d, c0.d) && k0.g((Object)this.e, (Object)c0.e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final c0 f(@f final Object o, @f final m m, @f final l<? super Throwable, j2> l, @f final Object o2, @f final Throwable t) {
        return new c0(o, m, l, o2, t);
    }
    
    public final boolean h() {
        return this.e != null;
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final m b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final l<Throwable, j2> c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final Object d = this.d;
        int hashCode5;
        if (d != null) {
            hashCode5 = d.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final Throwable e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    public final void i(@e final p<?> p2, @e final Throwable t) {
        final m b = this.b;
        if (b != null) {
            p2.m(b, t);
        }
        final l<Throwable, j2> c = this.c;
        if (c != null) {
            p2.p(c, t);
        }
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append(this.b);
        sb.append(", onCancellation=");
        sb.append(this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
