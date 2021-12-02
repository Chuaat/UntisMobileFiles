// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.f;
import java.util.Objects;
import org.jetbrains.annotations.e;
import kotlin.collections.m;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0003R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0013\u0010\u0012\u001a\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0018" }, d2 = { "Lkotlinx/coroutines/internal/a;", "", "T", "Lkotlin/j2;", "c", "element", "a", "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "b", "", "I", "tail", "head", "", "d", "()Z", "isEmpty", "", "[Ljava/lang/Object;", "elements", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class a<T>
{
    private Object[] a;
    private int b;
    private int c;
    
    public a() {
        this.a = new Object[16];
    }
    
    private final void c() {
        final Object[] a = this.a;
        final int length = a.length;
        final Object[] a2 = new Object[length << 1];
        m.l1(a, a2, 0, this.b, 0, 10, (Object)null);
        final Object[] a3 = this.a;
        final int length2 = a3.length;
        final int b = this.b;
        m.l1(a3, a2, length2 - b, 0, b, 4, (Object)null);
        this.a = a2;
        this.b = 0;
        this.c = length;
    }
    
    public final void a(@e final T t) {
        final Object[] a = this.a;
        final int c = this.c;
        a[c] = t;
        final int c2 = a.length - 1 & c + 1;
        this.c = c2;
        if (c2 == this.b) {
            this.c();
        }
    }
    
    public final void b() {
        this.b = 0;
        this.c = 0;
        this.a = new Object[this.a.length];
    }
    
    public final boolean d() {
        return this.b == this.c;
    }
    
    @f
    public final T e() {
        final int b = this.b;
        if (b == this.c) {
            return null;
        }
        final Object[] a = this.a;
        final Object obj = a[b];
        a[b] = null;
        this.b = (b + 1 & a.length - 1);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type T");
        return (T)obj;
    }
}
