// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.h0;
import n6.a;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g;
import kotlinx.coroutines.scheduling.d;
import kotlinx.coroutines.internal.m0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a6\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a(\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u0013\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u00020\u0014H\u0080\u0010\"\u001c\u0010\u001b\u001a\u00020\u00168\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0016\u0010\u001e\u001a\u00020\u001c8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u001d\"\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d\"\u001c\u0010!\u001a\u0004\u0018\u00010\u001c*\u00020\u00038@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010 ¨\u0006\"" }, d2 = { "Lkotlinx/coroutines/m0;", "a", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "d", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "h", "(Lkotlin/coroutines/g;Ljava/lang/Object;Ln6/a;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "continuation", "g", "(Lkotlin/coroutines/d;Ljava/lang/Object;Ln6/a;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/c4;", "f", "Lkotlin/coroutines/jvm/internal/e;", "e", "", "b", "Z", "c", "()Z", "useCoroutinesScheduler", "", "Ljava/lang/String;", "COROUTINES_SCHEDULER_PROPERTY_NAME", "DEBUG_THREAD_NAME_SEPARATOR", "(Lkotlin/coroutines/g;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class l0
{
    @e
    public static final String a = "kotlinx.coroutines.scheduler";
    private static final boolean b;
    private static final String c = " @";
    
    static {
        final String d = m0.d("kotlinx.coroutines.scheduler");
        boolean b2 = false;
        Label_0072: {
            Label_0070: {
                if (d != null) {
                    final int hashCode = d.hashCode();
                    if (hashCode != 0) {
                        if (hashCode != 3551) {
                            if (hashCode == 109935 && d.equals("off")) {
                                b2 = false;
                                break Label_0072;
                            }
                        }
                        else if (d.equals("on")) {
                            break Label_0070;
                        }
                    }
                    else if (d.equals("")) {
                        break Label_0070;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("System property 'kotlinx.coroutines.scheduler' has unrecognized value '");
                    sb.append(d);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            b2 = true;
        }
        b = b2;
    }
    
    @e
    public static final kotlinx.coroutines.m0 a() {
        v1 v1;
        if (l0.b) {
            v1 = d.O;
        }
        else {
            v1 = x.L;
        }
        return v1;
    }
    
    @f
    public static final String b(@e final g g) {
        if (!w0.d()) {
            return null;
        }
        final p0 p = (p0)g.get((g$c)p0.H);
        if (p != null) {
            final q0 q0 = (q0)g.get((g$c)kotlinx.coroutines.q0.H);
            String l = null;
            Label_0057: {
                if (q0 != null) {
                    l = q0.L();
                    if (l != null) {
                        break Label_0057;
                    }
                }
                l = "coroutine";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(l);
            sb.append('#');
            sb.append(p.L());
            return sb.toString();
        }
        return null;
    }
    
    public static final boolean c() {
        return l0.b;
    }
    
    @z1
    @e
    public static final g d(@e final r0 r0, @e g plus) {
        final g plus2 = r0.J().plus(plus);
        g plus3;
        if (w0.d()) {
            plus3 = plus2.plus((g)new p0(w0.c().incrementAndGet()));
        }
        else {
            plus3 = plus2;
        }
        plus = plus3;
        if (plus2 != i1.a()) {
            plus = plus3;
            if (plus2.get((g$c)kotlin.coroutines.e.q) == null) {
                plus = plus3.plus((g)i1.a());
            }
        }
        return plus;
    }
    
    @f
    public static final c4<?> e(@e kotlin.coroutines.jvm.internal.e e) {
        while (!(e instanceof e1)) {
            final Object callerFrame = e.getCallerFrame();
            if (callerFrame == null) {
                return null;
            }
            e = (kotlin.coroutines.jvm.internal.e)callerFrame;
            if (callerFrame instanceof c4) {
                return (c4<?>)callerFrame;
            }
        }
        return null;
    }
    
    @f
    public static final c4<?> f(@e final kotlin.coroutines.d<?> d, @e final g g, @f final Object o) {
        if (!(d instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (g.get((g$c)d4.G) == null) {
            return null;
        }
        final c4<?> e = e((kotlin.coroutines.jvm.internal.e)d);
        if (e != null) {
            e.B1(g, o);
        }
        return e;
    }
    
    public static final <T> T g(@e kotlin.coroutines.d<?> f, @f Object c, @e final a<? extends T> a) {
        final g context = ((kotlin.coroutines.d)f).getContext();
        c = kotlinx.coroutines.internal.p0.c(context, c);
        if (c != kotlinx.coroutines.internal.p0.a) {
            f = f((kotlin.coroutines.d<?>)f, context, c);
        }
        else {
            f = null;
        }
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            if (f == null || ((c4)f).A1()) {
                kotlinx.coroutines.internal.p0.a(context, c);
            }
            h0.c(1);
        }
    }
    
    public static final <T> T h(@e final g g, @f Object c, @e final a<? extends T> a) {
        c = kotlinx.coroutines.internal.p0.c(g, c);
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            kotlinx.coroutines.internal.p0.a(g, c);
            h0.c(1);
        }
    }
}
