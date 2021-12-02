// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g$b;
import n6.p;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.jvm.internal.k0;
import java.util.Objects;
import kotlin.text.s;
import kotlin.coroutines.g;
import kotlin.coroutines.g$c;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0019\u0010\r\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b" }, d2 = { "Lkotlinx/coroutines/p0;", "Lkotlinx/coroutines/q3;", "", "Lkotlin/coroutines/a;", "toString", "Lkotlin/coroutines/g;", "context", "S", "oldState", "Lkotlin/j2;", "M", "", "H", "id", "J", "", "hashCode", "", "other", "", "equals", "G", "L", "()J", "<init>", "(J)V", "a", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class p0 extends kotlin.coroutines.a implements q3<String>
{
    @e
    public static final a H;
    private final long G;
    
    static {
        H = new a(null);
    }
    
    public p0(final long g) {
        super((g$c)p0.H);
        this.G = g;
    }
    
    public final long H() {
        return this.G;
    }
    
    @e
    public final p0 J(final long n) {
        return new p0(n);
    }
    
    public final long L() {
        return this.G;
    }
    
    public void M(@e final g g, @e final String name) {
        Thread.currentThread().setName(name);
    }
    
    @e
    public String S(@e final g g) {
        final q0 q0 = (q0)g.get((g$c)kotlinx.coroutines.q0.H);
        String l = null;
        Label_0032: {
            if (q0 != null) {
                l = q0.L();
                if (l != null) {
                    break Label_0032;
                }
            }
            l = "coroutine";
        }
        final Thread currentThread = Thread.currentThread();
        final String name = currentThread.getName();
        int endIndex;
        if ((endIndex = s.F3(name, " @", 0, false, 6, null)) < 0) {
            endIndex = name.length();
        }
        final StringBuilder sb = new StringBuilder(l.length() + endIndex + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        final String substring = name.substring(0, endIndex);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(l);
        sb.append('#');
        sb.append(this.G);
        final j2 a = j2.a;
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder(capacity).\u2026builderAction).toString()");
        currentThread.setName(string);
        return name;
    }
    
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof p0 && this.G == ((p0)o).G);
    }
    
    public <R> R fold(final R r, @e final p<? super R, ? super g$b, ? extends R> p2) {
        return q3.a.a((q3<Object>)this, r, p2);
    }
    
    @f
    public <E extends g$b> E get(@e final g$c<E> g$c) {
        return q3.a.b((q3<Object>)this, g$c);
    }
    
    public int hashCode() {
        final long g = this.G;
        return (int)(g ^ g >>> 32);
    }
    
    @e
    public g minusKey(@e final g$c<?> g$c) {
        return q3.a.c((q3<Object>)this, g$c);
    }
    
    @e
    public g plus(@e final g g) {
        return q3.a.d((q3<Object>)this, g);
    }
    
    @e
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineId(");
        sb.append(this.G);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "kotlinx/coroutines/p0$a", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/p0;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a implements g$c<p0>
    {
        private a() {
        }
    }
}
