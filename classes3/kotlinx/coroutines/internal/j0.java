// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.w0;
import kotlin.coroutines.d;
import kotlin.text.s;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayDeque;
import kotlin.n1;
import kotlin.jvm.internal.k0;
import kotlin.s0;
import kotlinx.coroutines.f2;
import kotlin.coroutines.jvm.internal.e;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00170\u0016\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00172\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080H\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\"\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b!\u0010\u0004\u001a!\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\"\u0010\u0004\u001a\u001e\u0010#\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00102\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0014\u0010&\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010%\u001a\u00020$H\u0007\u001a\u0010\u0010(\u001a\u00020'*\u00060\u0011j\u0002`\u0012H\u0000\u001a%\u0010+\u001a\u00020**\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00172\u0006\u0010)\u001a\u00020$H\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010-\u001a\u00020'*\u00060\u0011j\u0002`\u00122\n\u0010\u0018\u001a\u00060\u0011j\u0002`\u0012H\u0002\u001a\u0014\u0010.\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000\"\u001e\u00101\u001a\n /*\u0004\u0018\u00010$0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00100\"\u001e\u00103\u001a\n /*\u0004\u0018\u00010$0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100\"\u0016\u00105\u001a\u00020$8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00100\"\u0016\u00107\u001a\u00020$8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00100*\f\b\u0000\u00108\"\u00020\n2\u00020\n*\f\b\u0000\u00109\"\u00020\u00112\u00020\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:" }, d2 = { "", "E", "exception", "p", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "r", "Lkotlin/coroutines/d;", "continuation", "q", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "o", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/e;)Ljava/lang/Throwable;", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "f", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/s0;", "", "e", "(Ljava/lang/Throwable;)Lkotlin/s0;", "recoveredStacktrace", "Lkotlin/j2;", "l", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "m", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "s", "t", "g", "", "message", "d", "", "k", "methodName", "", "i", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "h", "j", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "stackTraceRecoveryClassName", "c", "baseContinuationImplClassName", "b", "stackTraceRecoveryClass", "a", "baseContinuationImplClass", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class j0
{
    private static final String a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String c;
    private static final String d;
    
    static {
        Object b = null;
        try {
            final b1$a h = b1.H;
            b1.b((Object)Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            b = b1.b(c1.a(t));
        }
        if (b1.e(b) != null) {
            b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        c = (String)b;
        Object b2 = null;
        try {
            final b1$a h3 = b1.H;
            b1.b((Object)j0.class.getCanonicalName());
        }
        finally {
            final b1$a h4 = b1.H;
            final Throwable t2;
            b2 = b1.b(c1.a(t2));
        }
        if (b1.e(b2) != null) {
            b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        d = (String)b2;
    }
    
    @f2
    @org.jetbrains.annotations.e
    public static final StackTraceElement d(@org.jetbrains.annotations.e final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("\b\b\b(");
        sb.append(str);
        return new StackTraceElement(sb.toString(), "\b", "\b", -1);
    }
    
    private static final <E extends Throwable> s0<E, StackTraceElement[]> e(final E e) {
        final Throwable cause = e.getCause();
        if (cause != null && k0.g((Object)cause.getClass(), (Object)e.getClass())) {
            final StackTraceElement[] stackTrace = e.getStackTrace();
            final int length = stackTrace.length;
            int i = 0;
            while (true) {
                while (i < length) {
                    if (k(stackTrace[i])) {
                        final boolean b = true;
                        if (b) {
                            final s0 s0 = n1.a((Object)cause, (Object)stackTrace);
                            return (s0<E, StackTraceElement[]>)s0;
                        }
                        final s0 s0 = n1.a((Object)e, (Object)new StackTraceElement[0]);
                        return (s0<E, StackTraceElement[]>)s0;
                    }
                    else {
                        ++i;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
        final s0 s0 = n1.a((Object)e, (Object)new StackTraceElement[0]);
        return (s0<E, StackTraceElement[]>)s0;
    }
    
    private static final <E extends Throwable> E f(final E e, final E e2, final ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        final StackTraceElement[] stackTrace = e.getStackTrace();
        final int i = i(stackTrace, j0.c);
        final int n = 0;
        if (i == -1) {
            final Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e2.setStackTrace((StackTraceElement[])array);
            return e2;
        }
        final StackTraceElement[] stackTrace2 = new StackTraceElement[arrayDeque.size() + i];
        for (int j = 0; j < i; ++j) {
            stackTrace2[j] = stackTrace[j];
        }
        final Iterator<StackTraceElement> iterator = (Iterator<StackTraceElement>)arrayDeque.iterator();
        int n2 = n;
        while (iterator.hasNext()) {
            stackTrace2[i + n2] = iterator.next();
            ++n2;
        }
        e2.setStackTrace(stackTrace2);
        return e2;
    }
    
    private static final ArrayDeque<StackTraceElement> g(e callerFrame) {
        final ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<StackTraceElement>();
        final StackTraceElement stackTraceElement = callerFrame.getStackTraceElement();
        e e = callerFrame;
        while (true) {
            StackTraceElement e2 = null;
            Label_0023: {
                if (stackTraceElement != null) {
                    e2 = stackTraceElement;
                    break Label_0023;
                }
                StackTraceElement stackTraceElement2;
                do {
                    callerFrame = e.getCallerFrame();
                    if (callerFrame == null) {
                        return arrayDeque;
                    }
                    stackTraceElement2 = callerFrame.getStackTraceElement();
                    e = callerFrame;
                } while (stackTraceElement2 == null);
                e2 = stackTraceElement2;
            }
            arrayDeque.add(e2);
            e = callerFrame;
            continue;
        }
    }
    
    private static final boolean h(final StackTraceElement stackTraceElement, final StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && k0.g((Object)stackTraceElement.getMethodName(), (Object)stackTraceElement2.getMethodName()) && k0.g((Object)stackTraceElement.getFileName(), (Object)stackTraceElement2.getFileName()) && k0.g((Object)stackTraceElement.getClassName(), (Object)stackTraceElement2.getClassName());
    }
    
    private static final int i(final StackTraceElement[] array, final String s) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (k0.g((Object)s, (Object)array[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
    
    public static final void j(@org.jetbrains.annotations.e final Throwable t, @org.jetbrains.annotations.e final Throwable cause) {
        t.initCause(cause);
    }
    
    public static final boolean k(@org.jetbrains.annotations.e final StackTraceElement stackTraceElement) {
        return s.u2(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }
    
    private static final void l(final StackTraceElement[] array, final ArrayDeque<StackTraceElement> arrayDeque) {
        while (true) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (k(array[i])) {
                    final int n = i + 1;
                    int n2 = array.length - 1;
                    if (n2 >= n) {
                        while (true) {
                            if (h(array[n2], arrayDeque.getLast())) {
                                arrayDeque.removeLast();
                            }
                            arrayDeque.addFirst(array[n2]);
                            if (n2 == n) {
                                break;
                            }
                            --n2;
                        }
                    }
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    @f
    public static final Object m(@org.jetbrains.annotations.e final Throwable t, @org.jetbrains.annotations.e final d<?> d) {
        if (!w0.e()) {
            throw t;
        }
        if (!(d instanceof e)) {
            throw t;
        }
        throw o(t, (e)d);
    }
    
    @f
    private static final Object n(@org.jetbrains.annotations.e final Throwable t, @org.jetbrains.annotations.e final d d) {
        if (!w0.e()) {
            throw t;
        }
        h0.e(0);
        if (!(d instanceof e)) {
            throw t;
        }
        throw o(t, (e)d);
    }
    
    private static final <E extends Throwable> E o(final E e, final e e2) {
        final kotlin.s0<E, StackTraceElement[]> e3 = e(e);
        final Throwable t = (Throwable)e3.a();
        final StackTraceElement[] array = (StackTraceElement[])e3.b();
        final Throwable f = l.f(t);
        Throwable f2 = e;
        if (f != null) {
            if (k0.g((Object)f.getMessage(), (Object)t.getMessage()) ^ true) {
                return e;
            }
            final ArrayDeque<StackTraceElement> g = g(e2);
            if (g.isEmpty()) {
                return e;
            }
            if (t != e) {
                l(array, g);
            }
            f2 = f(t, f, g);
        }
        return (E)f2;
    }
    
    @org.jetbrains.annotations.e
    public static final <E extends Throwable> E p(@org.jetbrains.annotations.e E r) {
        if (!w0.e()) {
            return r;
        }
        final Throwable f = l.f(r);
        if (f != null) {
            r = (E)r(f);
        }
        return r;
    }
    
    @org.jetbrains.annotations.e
    public static final <E extends Throwable> E q(@org.jetbrains.annotations.e final E e, @org.jetbrains.annotations.e final d<?> d) {
        Throwable c = e;
        if (w0.e()) {
            if (!(d instanceof e)) {
                c = e;
            }
            else {
                c = o(e, (e)d);
            }
        }
        return (E)c;
    }
    
    private static final <E extends Throwable> E r(final E e) {
        final StackTraceElement[] stackTrace = e.getStackTrace();
        final int length = stackTrace.length;
        final int i = i(stackTrace, j0.d);
        final int j = i(stackTrace, j0.c);
        final int n = 0;
        int n2;
        if (j == -1) {
            n2 = 0;
        }
        else {
            n2 = length - j;
        }
        final int n3 = length - i - n2;
        final StackTraceElement[] stackTrace2 = new StackTraceElement[n3];
        for (int k = n; k < n3; ++k) {
            StackTraceElement d;
            if (k == 0) {
                d = d("Coroutine boundary");
            }
            else {
                d = stackTrace[i + 1 + k - 1];
            }
            stackTrace2[k] = d;
        }
        e.setStackTrace(stackTrace2);
        return e;
    }
    
    @org.jetbrains.annotations.e
    public static final <E extends Throwable> E s(@org.jetbrains.annotations.e E t) {
        if (w0.e()) {
            t = (E)t((Throwable)t);
        }
        return t;
    }
    
    @org.jetbrains.annotations.e
    public static final <E extends Throwable> E t(@org.jetbrains.annotations.e final E e) {
        final Throwable cause = e.getCause();
        if (cause != null) {
            final boolean g = k0.g((Object)cause.getClass(), (Object)e.getClass());
            final int n = 1;
            if (!(g ^ true)) {
                final StackTraceElement[] stackTrace = e.getStackTrace();
                final int length = stackTrace.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (k(stackTrace[i])) {
                            final int n2 = n;
                            if (n2 != 0) {
                                return (E)cause;
                            }
                            return e;
                        }
                        else {
                            ++i;
                        }
                    }
                    final int n2 = 0;
                    continue;
                }
            }
        }
        return e;
    }
}
