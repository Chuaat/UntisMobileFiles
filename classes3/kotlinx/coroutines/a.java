// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import n6.p;
import kotlin.coroutines.g$c;
import n6.l;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u0019\u0012\u0006\u0010:\u001a\u000200\u0012\b\b\u0002\u0010;\u001a\u00020\u0010¢\u0006\u0004\b<\u0010=J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0014J\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004J\u001e\u0010\u001a\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\rJ\u0012\u0010\u001b\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001f\u0010 J6\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u001c\u0010$\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150#\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&JO\u0010+\u001a\u00020\u0006\"\u0004\b\u0001\u0010'2\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00028\u00012'\u0010$\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150)¢\u0006\u0002\b*\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001f\u00106\u001a\u0002008\u0006@\u0006¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010\b\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0002008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00104R\u0016\u0010:\u001a\u0002008\u0004@\u0005X\u0085\u0004¢\u0006\u0006\n\u0004\b9\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>" }, d2 = { "Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/s2;", "Lkotlinx/coroutines/k2;", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/r0;", "Lkotlin/j2;", "t1", "()V", "w1", "a1", "value", "v1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "u1", "", "n0", "", "state", "Z0", "Lkotlin/b1;", "result", "resumeWith", "r1", "exception", "H0", "(Ljava/lang/Throwable;)V", "T0", "()Ljava/lang/String;", "Lkotlinx/coroutines/u0;", "start", "Lkotlin/Function1;", "block", "y1", "(Lkotlinx/coroutines/u0;Ln6/l;)V", "R", "receiver", "Lkotlin/Function2;", "Lkotlin/s;", "x1", "(Lkotlinx/coroutines/u0;Ljava/lang/Object;Ln6/p;)V", "a", "()Z", "isActive", "Lkotlin/coroutines/g;", "H", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "getContext$annotations", "context", "J", "coroutineContext", "I", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public abstract class a<T> extends s2 implements k2, d<T>, r0
{
    @e
    private final g H;
    @m6.d
    @e
    protected final g I;
    
    public a(@e final g i, final boolean b) {
        super(b);
        this.I = i;
        this.H = i.plus((g)this);
    }
    
    @Override
    public final void H0(@e final Throwable t) {
        o0.b(this.H, t);
    }
    
    @e
    public g J() {
        return this.H;
    }
    
    @e
    @Override
    public String T0() {
        final String b = l0.b(this.H);
        if (b != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append('\"');
            sb.append(b);
            sb.append("\":");
            sb.append(super.T0());
            return sb.toString();
        }
        return super.T0();
    }
    
    @Override
    protected final void Z0(@f final Object o) {
        if (o instanceof d0) {
            final d0 d0 = (d0)o;
            this.u1(d0.a, d0.a());
        }
        else {
            this.v1(o);
        }
    }
    
    @Override
    public boolean a() {
        return super.a();
    }
    
    @Override
    public final void a1() {
        this.w1();
    }
    
    @e
    public final g getContext() {
        return this.H;
    }
    
    @e
    @Override
    protected String n0() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append(" was cancelled");
        return sb.toString();
    }
    
    protected void r1(@f final Object o) {
        this.e0(o);
    }
    
    public final void resumeWith(@e Object r0) {
        r0 = this.R0(j0.d(r0, null, 1, null));
        if (r0 == t2.b) {
            return;
        }
        this.r1(r0);
    }
    
    public final void t1() {
        this.I0((k2)this.I.get((g$c)k2.t));
    }
    
    protected void u1(@e final Throwable t, final boolean b) {
    }
    
    protected void v1(final T t) {
    }
    
    protected void w1() {
    }
    
    public final <R> void x1(@e final u0 u0, final R r, @e final p<? super R, ? super d<? super T>, ?> p3) {
        this.t1();
        u0.d((n6.p<? super R, ? super kotlin.coroutines.d<? super Object>, ?>)p3, r, (kotlin.coroutines.d<? super Object>)this);
    }
    
    public final void y1(@e final u0 u0, @e final l<? super d<? super T>, ?> l) {
        this.t1();
        u0.b((n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l, (kotlin.coroutines.d<? super Object>)this);
    }
}
