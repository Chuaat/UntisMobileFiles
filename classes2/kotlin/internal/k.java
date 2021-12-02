// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.internal;

import m6.d;
import kotlin.collections.v;
import kotlin.collections.m;
import java.util.List;
import kotlin.text.j;
import java.util.regex.MatchResult;
import kotlin.random.b;
import kotlin.random.f;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0013" }, d2 = { "Lkotlin/internal/k;", "", "", "cause", "exception", "Lkotlin/j2;", "a", "", "d", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/j;", "c", "Lkotlin/random/f;", "b", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public class k
{
    public void a(@e final Throwable obj, @e final Throwable t) {
        k0.p(obj, "cause");
        k0.p(t, "exception");
        final Method a = k.a.a;
        if (a != null) {
            a.invoke(obj, t);
        }
    }
    
    @e
    public f b() {
        return new b();
    }
    
    @org.jetbrains.annotations.f
    public j c(@e final MatchResult matchResult, @e final String s) {
        k0.p(matchResult, "matchResult");
        k0.p(s, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
    
    @e
    public List<Throwable> d(@e final Throwable obj) {
        k0.p(obj, "exception");
        final Method b = a.b;
        if (b != null) {
            final Object invoke = b.invoke(obj, new Object[0]);
            if (invoke != null) {
                final List<Throwable> list = m.t((Throwable[])invoke);
                if (list != null) {
                    return list;
                }
            }
        }
        return v.E();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n" }, d2 = { "kotlin/internal/k$a", "", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "addSuppressed", "b", "getSuppressed", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
        @d
        @org.jetbrains.annotations.f
        public static final Method a;
        @d
        @org.jetbrains.annotations.f
        public static final Method b;
        @e
        public static final a c;
        
        static {
            c = new a();
            final Method[] methods = Throwable.class.getMethods();
            k0.o(methods, "throwableMethods");
            final int length = methods.length;
            final int n = 0;
            int n2 = 0;
            Method method;
            Method a2;
            while (true) {
                method = null;
                if (n2 >= length) {
                    a2 = null;
                    break;
                }
                a2 = methods[n2];
                k0.o(a2, "it");
                boolean b2 = false;
                Label_0101: {
                    if (k0.g(a2.getName(), "addSuppressed")) {
                        final Class<?>[] parameterTypes = a2.getParameterTypes();
                        k0.o(parameterTypes, "it.parameterTypes");
                        if (k0.g(m.Ws(parameterTypes), Throwable.class)) {
                            b2 = true;
                            break Label_0101;
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    break;
                }
                ++n2;
            }
            a = a2;
            final int length2 = methods.length;
            int n3 = n;
            Method b3;
            while (true) {
                b3 = method;
                if (n3 >= length2) {
                    break;
                }
                b3 = methods[n3];
                k0.o(b3, "it");
                if (k0.g(b3.getName(), "getSuppressed")) {
                    break;
                }
                ++n3;
            }
            b = b3;
        }
    }
}
