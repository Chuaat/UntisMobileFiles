// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import kotlinx.coroutines.q0;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.p0;
import kotlin.coroutines.g;
import java.util.List;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.y0;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010$\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006+" }, d2 = { "Lkotlinx/coroutines/debug/internal/h;", "Ljava/io/Serializable;", "", "I", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "name", "K", "e", "lastObservedThreadState", "", "G", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "coroutineId", "J", "h", "state", "H", "b", "dispatcher", "", "Ljava/lang/StackTraceElement;", "M", "Ljava/util/List;", "c", "()Ljava/util/List;", "lastObservedStackTrace", "L", "d", "lastObservedThreadName", "N", "g", "()J", "sequenceNumber", "Lkotlinx/coroutines/debug/internal/d;", "source", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/d;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@y0
public final class h implements Serializable
{
    @f
    private final Long G;
    @f
    private final String H;
    @f
    private final String I;
    @e
    private final String J;
    @f
    private final String K;
    @f
    private final String L;
    @e
    private final List<StackTraceElement> M;
    private final long N;
    
    public h(@e final d d, @e final g g) {
        final p0 p2 = (p0)g.get((g$c)p0.H);
        final String s = null;
        Long value;
        if (p2 != null) {
            value = p2.L();
        }
        else {
            value = null;
        }
        this.G = value;
        final kotlin.coroutines.e e = (kotlin.coroutines.e)g.get((g$c)kotlin.coroutines.e.q);
        String string;
        if (e != null) {
            string = e.toString();
        }
        else {
            string = null;
        }
        this.H = string;
        final q0 q0 = (q0)g.get((g$c)kotlinx.coroutines.q0.H);
        String l;
        if (q0 != null) {
            l = q0.L();
        }
        else {
            l = null;
        }
        this.I = l;
        this.J = d.f();
        final Thread c = d.c;
        String string2 = null;
        Label_0142: {
            if (c != null) {
                final Thread.State state = c.getState();
                if (state != null) {
                    string2 = state.toString();
                    break Label_0142;
                }
            }
            string2 = null;
        }
        this.K = string2;
        final Thread c2 = d.c;
        String name = s;
        if (c2 != null) {
            name = c2.getName();
        }
        this.L = name;
        this.M = d.g();
        this.N = d.f;
    }
    
    @f
    public final Long a() {
        return this.G;
    }
    
    @f
    public final String b() {
        return this.H;
    }
    
    @e
    public final List<StackTraceElement> c() {
        return this.M;
    }
    
    @f
    public final String d() {
        return this.L;
    }
    
    @f
    public final String e() {
        return this.K;
    }
    
    @f
    public final String f() {
        return this.I;
    }
    
    public final long g() {
        return this.N;
    }
    
    @e
    public final String h() {
        return this.J;
    }
}
