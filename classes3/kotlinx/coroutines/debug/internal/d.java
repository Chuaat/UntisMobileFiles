// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.sequences.m;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.sequences.o;
import n6.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010+\u001a\u0004\u0018\u00010'\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b2\u00103J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J'\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082P\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\fH\u0016R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010$R\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001b\u0010+\u001a\u0004\u0018\u00010'8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b)\u0010-R\u0016\u00100\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0013\u0010\r\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064" }, d2 = { "Lkotlinx/coroutines/debug/internal/d;", "", "", "Ljava/lang/StackTraceElement;", "a", "g", "Lkotlin/sequences/o;", "Lkotlin/coroutines/jvm/internal/e;", "frame", "Lkotlin/j2;", "j", "(Lkotlin/sequences/o;Lkotlin/coroutines/jvm/internal/e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "state", "Lkotlin/coroutines/d;", "i", "(Ljava/lang/String;Lkotlin/coroutines/d;)V", "toString", "Ljava/lang/ref/WeakReference;", "d", "Ljava/lang/ref/WeakReference;", "_lastObservedFrame", "", "f", "J", "sequenceNumber", "Lkotlin/coroutines/g;", "b", "()Lkotlin/coroutines/g;", "context", "value", "e", "()Lkotlin/coroutines/jvm/internal/e;", "h", "(Lkotlin/coroutines/jvm/internal/e;)V", "lastObservedFrame", "()Ljava/util/List;", "creationStackTrace", "_context", "Lkotlinx/coroutines/debug/internal/k;", "Lkotlinx/coroutines/debug/internal/k;", "c", "()Lkotlinx/coroutines/debug/internal/k;", "creationStackBottom", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "lastObservedThread", "Ljava/lang/String;", "_state", "()Ljava/lang/String;", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/debug/internal/k;J)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class d
{
    private final WeakReference<g> a;
    private String b;
    @m6.d
    @f
    public Thread c;
    private WeakReference<e> d;
    @f
    private final k e;
    @m6.d
    public final long f;
    
    public d(@f final g referent, @f final k e, final long f) {
        this.e = e;
        this.f = f;
        this.a = new WeakReference<g>(referent);
        this.b = "CREATED";
    }
    
    private final List<StackTraceElement> a() {
        final k e = this.e;
        if (e != null) {
            return (List<StackTraceElement>)kotlin.sequences.p.V2((m<?>)kotlin.sequences.p.e((n6.p<? super o<? super Object>, ? super kotlin.coroutines.d<? super j2>, ?>)new p<o<? super StackTraceElement>, kotlin.coroutines.d<? super j2>, Object>() {
                private /* synthetic */ Object H;
                int I;
                final /* synthetic */ d J;
                final /* synthetic */ k K;
                
                @org.jetbrains.annotations.e
                public final kotlin.coroutines.d<j2> create(@f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    final p<o<? super StackTraceElement>, kotlin.coroutines.d<? super j2>, Object> p2 = (p<o<? super StackTraceElement>, kotlin.coroutines.d<? super j2>, Object>)new p<o<? super StackTraceElement>, kotlin.coroutines.d<? super j2>, Object>() {
                        private /* synthetic */ Object H;
                        int I;
                        final /* synthetic */ d J = this.J;
                        final /* synthetic */ k K = this.K;
                    };
                    p2.H = h;
                    return (kotlin.coroutines.d<j2>)p2;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((d$a)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int i = this.I;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final o o2 = (o)this.H;
                        final d j = this.J;
                        final e callerFrame = this.K.getCallerFrame();
                        this.I = 1;
                        if (j.j(o2, callerFrame, (kotlin.coroutines.d<? super j2>)this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }));
        }
        return (List<StackTraceElement>)v.E();
    }
    
    @f
    public final g b() {
        return this.a.get();
    }
    
    @f
    public final k c() {
        return this.e;
    }
    
    @org.jetbrains.annotations.e
    public final List<StackTraceElement> d() {
        return this.a();
    }
    
    @f
    public final e e() {
        final WeakReference<e> d = this.d;
        e e;
        if (d != null) {
            e = d.get();
        }
        else {
            e = null;
        }
        return e;
    }
    
    @org.jetbrains.annotations.e
    public final String f() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    public final List<StackTraceElement> g() {
        e e = this.e();
        if (e != null) {
            final ArrayList<StackTraceElement> list = new ArrayList<StackTraceElement>();
            while (e != null) {
                final StackTraceElement stackTraceElement = e.getStackTraceElement();
                if (stackTraceElement != null) {
                    list.add(stackTraceElement);
                }
                e = e.getCallerFrame();
            }
            return list;
        }
        return (List<StackTraceElement>)v.E();
    }
    
    public final void h(@f final e referent) {
        WeakReference<e> d;
        if (referent != null) {
            d = new WeakReference<e>(referent);
        }
        else {
            d = null;
        }
        this.d = d;
    }
    
    public final void i(@org.jetbrains.annotations.e final String b, @org.jetbrains.annotations.e kotlin.coroutines.d<?> e) {
        if (k0.g((Object)this.b, (Object)b) && k0.g((Object)b, (Object)"SUSPENDED") && this.e() != null) {
            return;
        }
        this.b = b;
        final boolean b2 = e instanceof e;
        final Thread thread = null;
        if (!b2) {
            e = null;
        }
        this.h(e);
        Thread currentThread = thread;
        if (k0.g((Object)b, (Object)"RUNNING")) {
            currentThread = Thread.currentThread();
        }
        this.c = currentThread;
    }
    
    final /* synthetic */ Object j(final o<? super StackTraceElement> o, e callerFrame, final kotlin.coroutines.d<? super j2> d) {
        j i = null;
        Label_0054: {
            if (d instanceof d$b) {
                final j j = (d$b)d;
                final int h = j.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    j.H = h + Integer.MIN_VALUE;
                    i = j;
                    break Label_0054;
                }
            }
            i = new j(d) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ d I;
                Object J;
                Object K;
                Object L;
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.j(null, null, (kotlin.coroutines.d<? super j2>)this);
                }
            };
        }
        final Object g = i.G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = i.H;
        while (true) {
            j m = null;
            d d2 = null;
            o<StackTraceElement> o3 = null;
            e e2 = null;
            Label_0233: {
                e e = null;
                o<StackTraceElement> o2 = null;
                d k = null;
                Label_0220: {
                    o<StackTraceElement> l;
                    if (h3 != 0) {
                        if (h3 == 1) {
                            e = (e)i.L;
                            o2 = (o<StackTraceElement>)i.K;
                            k = (d)i.J;
                            c1.n(g);
                            break Label_0220;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(g);
                        l = (o<StackTraceElement>)o;
                        k = this;
                    }
                    if (callerFrame == null) {
                        return j2.a;
                    }
                    final StackTraceElement stackTraceElement = callerFrame.getStackTraceElement();
                    m = i;
                    d2 = k;
                    o3 = l;
                    e2 = callerFrame;
                    if (stackTraceElement == null) {
                        break Label_0233;
                    }
                    i.J = k;
                    i.K = l;
                    i.L = callerFrame;
                    i.H = 1;
                    if (l.b(stackTraceElement, (kotlin.coroutines.d<? super j2>)i) == h2) {
                        return h2;
                    }
                    final o<StackTraceElement> o4 = l;
                    e = callerFrame;
                    o2 = o4;
                }
                e2 = e;
                o3 = o2;
                d2 = k;
                m = i;
            }
            callerFrame = e2.getCallerFrame();
            if (callerFrame != null) {
                i = m;
                final d k = d2;
                final o<StackTraceElement> l = o3;
                continue;
            }
            break;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DebugCoroutineInfo(state=");
        sb.append(this.f());
        sb.append(",context=");
        sb.append(this.b());
        sb.append(')');
        return sb.toString();
    }
}
