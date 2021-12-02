// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.coroutines.i;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.coroutines.g$b;
import n6.p;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g$c;
import kotlin.Metadata;
import kotlinx.coroutines.q3;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "Lkotlinx/coroutines/internal/q0;", "T", "Lkotlinx/coroutines/q3;", "Lkotlin/coroutines/g;", "context", "X", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/j2;", "Q", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlin/coroutines/g$c;", "key", "minusKey", "Lkotlin/coroutines/g$b;", "E", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "", "toString", "H", "Ljava/lang/Object;", "value", "G", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "Ljava/lang/ThreadLocal;", "I", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class q0<T> implements q3<T>
{
    @e
    private final g$c<?> G;
    private final T H;
    private final ThreadLocal<T> I;
    
    public q0(final T h, @e final ThreadLocal<T> i) {
        this.H = h;
        this.I = i;
        this.G = (g$c<?>)new r0(i);
    }
    
    @Override
    public void Q(@e final g g, final T value) {
        this.I.set(value);
    }
    
    @Override
    public T X(@e final g g) {
        final T value = this.I.get();
        this.I.set(this.H);
        return value;
    }
    
    public <R> R fold(final R r, @e final p<? super R, ? super g$b, ? extends R> p2) {
        return a.a((q3<Object>)this, r, p2);
    }
    
    @f
    public <E extends g$b> E get(@e final g$c<E> g$c) {
        Object o;
        if (k0.g((Object)this.getKey(), (Object)g$c)) {
            o = this;
        }
        else {
            o = null;
        }
        return (E)o;
    }
    
    @e
    public g$c<?> getKey() {
        return this.G;
    }
    
    @e
    public g minusKey(@e final g$c<?> g$c) {
        Object h;
        if (k0.g((Object)this.getKey(), (Object)g$c)) {
            h = i.H;
        }
        else {
            h = this;
        }
        return (g)h;
    }
    
    @e
    public g plus(@e final g g) {
        return a.d((q3<Object>)this, g);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ThreadLocal(value=");
        sb.append(this.H);
        sb.append(", threadLocal = ");
        sb.append(this.I);
        sb.append(')');
        return sb.toString();
    }
}
