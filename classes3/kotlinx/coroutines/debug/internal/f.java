// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import kotlinx.coroutines.o2;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.collections.y0;
import kotlin.coroutines.g$c;
import kotlin.jvm.internal.q1;
import kotlinx.coroutines.s2;
import kotlin.n1;
import kotlin.s0;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlin.sequences.m;
import kotlin.jvm.internal.h0;
import java.util.Comparator;
import n6.p;
import kotlin.collections.v;
import kotlinx.coroutines.internal.g0;
import java.util.Map;
import kotlinx.coroutines.k2;
import java.util.Set;
import kotlin.y;
import java.util.ListIterator;
import kotlin.concurrent.b;
import kotlinx.coroutines.internal.j0;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import java.util.Iterator;
import java.util.List;
import java.io.PrintStream;
import kotlin.text.s;
import kotlin.jvm.internal.w;
import kotlin.coroutines.jvm.internal.e;
import kotlin.j2;
import n6.l;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.text.SimpleDateFormat;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000f\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0002\u0090\u0001B\n\b\u0002¢\u0006\u0005\b\u008f\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001c\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b%\u0010&J5\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\u001a2\u0006\u0010'\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b+\u0010,J?\u00102\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0003012\u0006\u0010.\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0/2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\u00020-2\u0006\u00104\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0/2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b5\u00106J#\u0010\u0015\u001a\u00020\u00042\n\u00108\u001a\u0006\u0012\u0002\b\u0003072\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u00109J\u001f\u0010;\u001a\u00020\u00042\u0006\u00108\u001a\u00020:2\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\u0004\u0018\u00010:*\u00020:H\u0082\u0010¢\u0006\u0004\b=\u0010>J/\u0010@\u001a\u00020\u00042\n\u0010?\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u00108\u001a\u0006\u0012\u0002\b\u0003072\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000307H\u0002¢\u0006\u0004\bB\u0010CJ\u001a\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020:H\u0082\u0010¢\u0006\u0004\bD\u0010EJ\u001b\u0010G\u001a\u0004\u0018\u00010F*\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\bG\u0010HJ3\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u0000072\b\u00108\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u00042\n\u0010?\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bM\u0010NJ'\u0010Q\u001a\b\u0012\u0004\u0012\u00020#0\u001a\"\b\b\u0000\u0010I*\u00020O2\u0006\u0010P\u001a\u00028\u0000H\u0002¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u0004¢\u0006\u0004\bS\u0010\bJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\u0015\u0010V\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n¢\u0006\u0004\bV\u0010WJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u001a¢\u0006\u0004\bY\u0010ZJ\u0013\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u001a¢\u0006\u0004\b\\\u0010ZJ\u0015\u0010]\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b]\u0010\"J)\u0010_\u001a\b\u0012\u0004\u0012\u00020#0\u001a2\u0006\u0010^\u001a\u00020X2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001a¢\u0006\u0004\b_\u0010`J\u001b\u0010a\u001a\u00020\u00042\n\u00108\u001a\u0006\u0012\u0002\b\u000307H\u0000¢\u0006\u0004\ba\u0010bJ\u001b\u0010c\u001a\u00020\u00042\n\u00108\u001a\u0006\u0012\u0002\b\u000307H\u0000¢\u0006\u0004\bc\u0010bJ)\u0010d\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0000¢\u0006\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010=R\u0018\u0010i\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\"\u0010s\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010v\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\f0t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010uR\u0016\u0010y\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u00038@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010pR\u0016\u0010~\u001a\u00020|8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010}R$\u0010\u0081\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\bY\u0010n\u001a\u0004\b\u007f\u0010p\"\u0005\b\u0080\u0001\u0010rR$\u0010\u0085\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0082\u00018B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0088\u0001\u001a\u00020\u0003*\u00020#8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R$\u0010\u008c\u0001\u001a\u00020\u0011*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u0089\u0001\u0010WR(\u0010\u008e\u0001\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030t8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010u¨\u0006\u0091\u0001" }, d2 = { "Lkotlinx/coroutines/debug/internal/f;", "", "Lkotlin/Function1;", "", "Lkotlin/j2;", "t", "()Ln6/l;", "M", "()V", "N", "Lkotlinx/coroutines/k2;", "", "Lkotlinx/coroutines/debug/internal/d;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "f", "(Lkotlinx/coroutines/k2;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/f$e;", "Lkotlin/coroutines/g;", "create", "", "j", "(Ln6/p;)Ljava/util/List;", "y", "(Lkotlinx/coroutines/debug/internal/f$e;)Z", "Ljava/io/PrintStream;", "out", "k", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "D", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/s0;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/s0;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/d;", "frame", "(Lkotlin/coroutines/d;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/e;", "Q", "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/String;)V", "I", "(Lkotlin/coroutines/jvm/internal/e;)Lkotlin/coroutines/jvm/internal/e;", "owner", "S", "(Lkotlinx/coroutines/debug/internal/f$e;Lkotlin/coroutines/d;Ljava/lang/String;)V", "B", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/debug/internal/f$e;", "C", "(Lkotlin/coroutines/jvm/internal/e;)Lkotlinx/coroutines/debug/internal/f$e;", "Lkotlinx/coroutines/debug/internal/k;", "O", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/k;", "T", "completion", "g", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/debug/internal/k;)Lkotlin/coroutines/d;", "E", "(Lkotlinx/coroutines/debug/internal/f$e;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "P", "job", "w", "(Lkotlinx/coroutines/k2;)Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/c;", "i", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/h;", "l", "h", "info", "m", "(Lkotlinx/coroutines/debug/internal/c;Ljava/util/List;)Ljava/util/List;", "G", "(Lkotlin/coroutines/d;)V", "H", "F", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "installations", "c", "Ljava/lang/Thread;", "weakRefCleanerThread", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "dateFormat", "Z", "v", "()Z", "L", "(Z)V", "sanitizeStackTraces", "Lkotlinx/coroutines/debug/internal/a;", "Lkotlinx/coroutines/debug/internal/a;", "callerInfoCache", "a", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "z", "isInstalled", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "u", "K", "enableCreationStackTraces", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "A", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "r", "getDebugString$annotations", "(Lkotlinx/coroutines/k2;)V", "debugString", "d", "capturedCoroutinesMap", "<init>", "e", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class f
{
    private static final String a = "Coroutine creation stacktrace";
    private static final SimpleDateFormat b;
    private static Thread c;
    private static final a<e<?>, Boolean> d;
    private static final /* synthetic */ g e;
    private static final /* synthetic */ AtomicLongFieldUpdater f;
    private static final ReentrantReadWriteLock g;
    private static boolean h;
    private static boolean i;
    private static volatile int installations;
    private static final l<Boolean, j2> j;
    private static final a<kotlin.coroutines.jvm.internal.e, d> k;
    @org.jetbrains.annotations.e
    public static final f l;
    
    static {
        final f f2 = l = new f();
        b = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        d = new a<e<?>, Boolean>(false, 1, null);
        e = new g(0L);
        g = new ReentrantReadWriteLock();
        kotlinx.coroutines.debug.internal.f.h = true;
        kotlinx.coroutines.debug.internal.f.i = true;
        j = f2.t();
        k = new a<kotlin.coroutines.jvm.internal.e, d>(true);
        f = AtomicLongFieldUpdater.newUpdater(g.class, "sequenceNumber");
    }
    
    private f() {
    }
    
    private final boolean A(final StackTraceElement stackTraceElement) {
        return s.u2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }
    
    private final e<?> B(kotlin.coroutines.d<?> e) {
        final boolean b = e instanceof kotlin.coroutines.jvm.internal.e;
        final e<?> e2 = null;
        if (!b) {
            e = null;
        }
        final kotlin.coroutines.jvm.internal.e e3 = e;
        e<?> c = e2;
        if (e3 != null) {
            c = this.C(e3);
        }
        return c;
    }
    
    private final e<?> C(kotlin.coroutines.jvm.internal.e callerFrame) {
        while (!(callerFrame instanceof e)) {
            callerFrame = callerFrame.getCallerFrame();
            if (callerFrame != null) {
                continue;
            }
            return null;
        }
        return (e<?>)callerFrame;
    }
    
    private final void D(final PrintStream printStream, final List<StackTraceElement> list) {
        for (final StackTraceElement obj : list) {
            final StringBuilder sb = new StringBuilder();
            sb.append("\n\tat ");
            sb.append(obj);
            printStream.print(sb.toString());
        }
    }
    
    private final void E(final e<?> e) {
        kotlinx.coroutines.debug.internal.f.d.remove(e);
        final kotlin.coroutines.jvm.internal.e e2 = e.H.e();
        if (e2 != null) {
            final kotlin.coroutines.jvm.internal.e i = this.I(e2);
            if (i != null) {
                kotlinx.coroutines.debug.internal.f.k.remove(i);
            }
        }
    }
    
    private final kotlin.coroutines.jvm.internal.e I(kotlin.coroutines.jvm.internal.e e) {
        kotlin.coroutines.jvm.internal.e callerFrame;
        do {
            callerFrame = e.getCallerFrame();
            if (callerFrame == null) {
                return null;
            }
            e = callerFrame;
        } while (callerFrame.getStackTraceElement() == null);
        return callerFrame;
    }
    
    private final <T extends Throwable> List<StackTraceElement> J(final T t) {
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = stackTrace.length;
        final int length2 = stackTrace.length;
        final int n = -1;
        int n2 = length2 - 1;
        int i;
        while (true) {
            i = n;
            if (n2 < 0) {
                break;
            }
            if (k0.g((Object)stackTrace[n2].getClassName(), (Object)"kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                i = n2;
                break;
            }
            --n2;
        }
        if (!kotlinx.coroutines.debug.internal.f.h) {
            final int initialCapacity = length - i;
            final ArrayList list = new ArrayList<StackTraceElement>(initialCapacity);
            for (int j = 0; j < initialCapacity; ++j) {
                StackTraceElement d;
                if (j == 0) {
                    d = j0.d("Coroutine creation stacktrace");
                }
                else {
                    d = stackTrace[j + i];
                }
                list.add(d);
            }
            return (List<StackTraceElement>)list;
        }
        final ArrayList list2 = new ArrayList<StackTraceElement>(length - i + 1);
        list2.add(j0.d("Coroutine creation stacktrace"));
    Label_0156:
        while (true) {
            ++i;
            while (i < length) {
                if (!this.A(stackTrace[i])) {
                    list2.add(stackTrace[i]);
                    continue Label_0156;
                }
                list2.add(stackTrace[i]);
                int n3;
                for (n3 = i + 1; n3 < length && this.A(stackTrace[n3]); ++n3) {}
                int n5;
                int n4;
                for (n4 = (n5 = n3 - 1); n5 > i && stackTrace[n5].getFileName() == null; --n5) {}
                if (n5 > i && n5 < n4) {
                    list2.add(stackTrace[n5]);
                }
                list2.add(stackTrace[n4]);
                i = n3;
            }
            break;
        }
        return (List<StackTraceElement>)list2;
    }
    
    private final void M() {
        kotlinx.coroutines.debug.internal.f.c = kotlin.concurrent.b.c(false, true, (ClassLoader)null, "Coroutines Debugger Cleaner", 0, (n6.a)f$g.G, 21, (Object)null);
    }
    
    private final void N() {
        final Thread c = kotlinx.coroutines.debug.internal.f.c;
        if (c != null) {
            c.interrupt();
        }
        kotlinx.coroutines.debug.internal.f.c = null;
    }
    
    private final k O(final List<StackTraceElement> list) {
        final boolean empty = list.isEmpty();
        k k = null;
        final k i = null;
        if (!empty) {
            final ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            k j = i;
            while (true) {
                k = j;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                j = new k((kotlin.coroutines.jvm.internal.e)j, listIterator.previous());
            }
        }
        return k;
    }
    
    private final void Q(kotlin.coroutines.jvm.internal.e i, final String s) {
        final ReentrantReadWriteLock.ReadLock lock = kotlinx.coroutines.debug.internal.f.g.readLock();
        lock.lock();
        try {
            final f l = kotlinx.coroutines.debug.internal.f.l;
            if (!l.z()) {
                return;
            }
            final a<kotlin.coroutines.jvm.internal.e, d> k = kotlinx.coroutines.debug.internal.f.k;
            d d = k.remove(i);
            Label_0130: {
                if (d == null) {
                    final e<?> c = l.C(i);
                    if (c != null) {
                        final d h = c.H;
                        if (h != null) {
                            final kotlin.coroutines.jvm.internal.e e = h.e();
                            kotlin.coroutines.jvm.internal.e j;
                            if (e != null) {
                                j = l.I(e);
                            }
                            else {
                                j = null;
                            }
                            d = h;
                            if (j != null) {
                                k.remove(j);
                                d = h;
                            }
                            break Label_0130;
                        }
                    }
                    return;
                }
            }
            if (i == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            }
            d.i(s, (kotlin.coroutines.d<?>)i);
            i = l.I(i);
            if (i != null) {
                ((Map<kotlin.coroutines.jvm.internal.e, d>)k).put(i, d);
                final j2 a = j2.a;
            }
        }
        finally {
            lock.unlock();
        }
    }
    
    private final void R(final kotlin.coroutines.d<?> d, final String s) {
        if (!this.z()) {
            return;
        }
        if (k0.g((Object)s, (Object)"RUNNING") && y.L.i(1, 3, 30)) {
            kotlin.coroutines.jvm.internal.e e = (kotlin.coroutines.jvm.internal.e)d;
            if (!(d instanceof kotlin.coroutines.jvm.internal.e)) {
                e = null;
            }
            final kotlin.coroutines.jvm.internal.e e2 = e;
            if (e2 != null) {
                this.Q(e2, s);
            }
            return;
        }
        final e<?> b = this.B(d);
        if (b != null) {
            this.S(b, d, s);
        }
    }
    
    private final void S(final e<?> e, final kotlin.coroutines.d<?> d, final String s) {
        final ReentrantReadWriteLock.ReadLock lock = kotlinx.coroutines.debug.internal.f.g.readLock();
        lock.lock();
        try {
            if (!kotlinx.coroutines.debug.internal.f.l.z()) {
                return;
            }
            e.H.i(s, d);
            final j2 a = j2.a;
        }
        finally {
            lock.unlock();
        }
    }
    
    public static final /* synthetic */ ReentrantReadWriteLock c(final f f) {
        return f.g;
    }
    
    private final void f(final k2 k2, final Map<k2, d> map, final StringBuilder sb, final String str) {
        final d d = map.get(k2);
        String string = null;
        Label_0219: {
            StringBuilder sb3;
            if (d == null) {
                string = str;
                if (k2 instanceof g0) {
                    break Label_0219;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.r(k2));
                sb2.append('\n');
                sb.append(sb2.toString());
                sb3 = new StringBuilder();
            }
            else {
                final StackTraceElement obj = (StackTraceElement)v.t2((List)d.g());
                final String f = d.f();
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(this.r(k2));
                sb4.append(", continuation is ");
                sb4.append(f);
                sb4.append(" at line ");
                sb4.append(obj);
                sb4.append('\n');
                sb.append(sb4.toString());
                sb3 = new StringBuilder();
            }
            sb3.append(str);
            sb3.append("\t");
            string = sb3.toString();
        }
        final Iterator<k2> iterator = k2.q().iterator();
        while (iterator.hasNext()) {
            this.f(iterator.next(), map, sb, string);
        }
    }
    
    private final <T> kotlin.coroutines.d<T> g(final kotlin.coroutines.d<? super T> d, final k k) {
        if (!this.z()) {
            return (kotlin.coroutines.d<T>)d;
        }
        final e<Object> e = new e<Object>((kotlin.coroutines.d<? super Object>)d, new d(d.getContext(), k, kotlinx.coroutines.debug.internal.f.f.incrementAndGet(kotlinx.coroutines.debug.internal.f.e)), (kotlin.coroutines.jvm.internal.e)k);
        final a<e<?>, Boolean> d2 = kotlinx.coroutines.debug.internal.f.d;
        ((Map<e<Object>, Boolean>)d2).put(e, Boolean.TRUE);
        if (!this.z()) {
            d2.clear();
        }
        return (kotlin.coroutines.d<T>)e;
    }
    
    private final <R> List<R> j(final p<? super e<?>, ? super kotlin.coroutines.g, ? extends R> p) {
        final ReentrantReadWriteLock c = c(this);
        final ReentrantReadWriteLock.ReadLock lock = c.readLock();
        final int writeHoldCount = c.getWriteHoldCount();
        final int n = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = c.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = c.writeLock();
        writeLock.lock();
        try {
            final f l = kotlinx.coroutines.debug.internal.f.l;
            if (l.z()) {
                final List h5 = v.h5((Iterable)l.q(), (Comparator)new Comparator<T>() {
                    @Override
                    public final int compare(final T t, final T t2) {
                        return kotlin.comparisons.a.g((Comparable)((e)t).H.f, (Comparable)((e)t2).H.f);
                    }
                });
                final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<R>();
                for (final e e : h5) {
                    final boolean d = kotlinx.coroutines.debug.internal.f.l.y(e);
                    Object invoke = null;
                    if (!d) {
                        final kotlin.coroutines.g b = e.H.b();
                        if (b != null) {
                            invoke = p.invoke((Object)e, (Object)b);
                        }
                    }
                    if (invoke != null) {
                        list.add(invoke);
                    }
                }
                return (List<R>)list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        finally {
            h0.d(1);
            for (int j = n; j < readHoldCount; ++j) {
                lock.lock();
            }
            writeLock.unlock();
            h0.c(1);
        }
    }
    
    private final void k(final PrintStream printStream) {
        final ReentrantReadWriteLock g = kotlinx.coroutines.debug.internal.f.g;
        final ReentrantReadWriteLock.ReadLock lock = g.readLock();
        final int writeHoldCount = g.getWriteHoldCount();
        final int n = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = g.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = g.writeLock();
        writeLock.lock();
        try {
            final f l = kotlinx.coroutines.debug.internal.f.l;
            if (l.z()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Coroutines dump ");
                sb.append(kotlinx.coroutines.debug.internal.f.b.format(System.currentTimeMillis()));
                printStream.print(sb.toString());
                for (final e e : kotlin.sequences.p.D2(kotlin.sequences.p.i0((m<? extends e>)v.n1((Iterable)l.q()), (n6.l<? super e, Boolean>)f$f.G), (Comparator<? super e>)new Comparator<Object>() {
                    @Override
                    public final int compare(final T t, final T t2) {
                        return kotlin.comparisons.a.g((Comparable)((e)t).H.f, (Comparable)((e)t2).H.f);
                    }
                })) {
                    final d h = e.H;
                    final List<StackTraceElement> g2 = h.g();
                    final f j = kotlinx.coroutines.debug.internal.f.l;
                    final List<StackTraceElement> n2 = j.n(h.f(), h.c, g2);
                    String str;
                    if (k0.g((Object)h.f(), (Object)"RUNNING") && n2 == g2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(h.f());
                        sb2.append(" (Last suspension stacktrace, not an actual stacktrace)");
                        str = sb2.toString();
                    }
                    else {
                        str = h.f();
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("\n\nCoroutine ");
                    sb3.append(e.G);
                    sb3.append(", state: ");
                    sb3.append(str);
                    printStream.print(sb3.toString());
                    if (g2.isEmpty()) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("\n\tat ");
                        sb4.append(j0.d("Coroutine creation stacktrace"));
                        printStream.print(sb4.toString());
                        j.D(printStream, h.d());
                    }
                    else {
                        j.D(printStream, n2);
                    }
                }
                final j2 a = j2.a;
                return;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        finally {
            for (int k = n; k < readHoldCount; ++k) {
                lock.lock();
            }
            writeLock.unlock();
        }
    }
    
    private final List<StackTraceElement> n(final String s, final Thread thread, final List<StackTraceElement> list) {
        if (!(k0.g((Object)s, (Object)"RUNNING") ^ true)) {
            if (thread != null) {
                Object b = null;
                try {
                    final b1$a h = b1.H;
                    b1.b((Object)thread.getStackTrace());
                }
                finally {
                    final b1$a h2 = b1.H;
                    final Throwable t;
                    b = b1.b(c1.a(t));
                }
                Object o = b;
                if (b1.i(b)) {
                    o = null;
                }
                final StackTraceElement[] array = (StackTraceElement[])o;
                if (array != null) {
                    final int length = array.length;
                    final int n = 0;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            final StackTraceElement stackTraceElement = array[i];
                            if (k0.g((Object)stackTraceElement.getClassName(), (Object)"kotlin.coroutines.jvm.internal.BaseContinuationImpl") && k0.g((Object)stackTraceElement.getMethodName(), (Object)"resumeWith") && k0.g((Object)stackTraceElement.getFileName(), (Object)"ContinuationImpl.kt")) {
                                final s0<Integer, Boolean> o2 = this.o(i, array, list);
                                final int intValue = ((Number)o2.a()).intValue();
                                final int booleanValue = ((boolean)o2.b()) ? 1 : 0;
                                if (intValue == -1) {
                                    return list;
                                }
                                final ArrayList list2 = new ArrayList<StackTraceElement>(list.size() + i - intValue - 1 - booleanValue);
                                for (int j = n; j < i - booleanValue; ++j) {
                                    list2.add(array[j]);
                                }
                                for (int k = intValue + 1; k < list.size(); ++k) {
                                    list2.add(list.get(k));
                                }
                                return (List<StackTraceElement>)list2;
                            }
                            else {
                                ++i;
                            }
                        }
                        i = -1;
                        continue;
                    }
                }
            }
        }
        return list;
    }
    
    private final s0<Integer, Boolean> o(final int n, final StackTraceElement[] array, final List<StackTraceElement> list) {
        final int p3 = this.p(n - 1, array, list);
        Integer n2;
        Boolean b;
        if (p3 == -1) {
            n2 = this.p(n - 2, array, list);
            b = Boolean.TRUE;
        }
        else {
            n2 = p3;
            b = Boolean.FALSE;
        }
        return (s0<Integer, Boolean>)n1.a((Object)n2, (Object)b);
    }
    
    private final int p(int n, final StackTraceElement[] array, final List<StackTraceElement> list) {
        final StackTraceElement stackTraceElement = (StackTraceElement)kotlin.collections.m.me((Object[])array, n);
        int n2 = -1;
        if (stackTraceElement != null) {
            final Iterator<StackTraceElement> iterator = list.iterator();
            n = 0;
            while (true) {
                n2 = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                final StackTraceElement stackTraceElement2 = iterator.next();
                if (k0.g((Object)stackTraceElement2.getFileName(), (Object)stackTraceElement.getFileName()) && k0.g((Object)stackTraceElement2.getClassName(), (Object)stackTraceElement.getClassName()) && k0.g((Object)stackTraceElement2.getMethodName(), (Object)stackTraceElement.getMethodName())) {
                    n2 = n;
                    break;
                }
                ++n;
            }
        }
        return n2;
    }
    
    private final Set<e<?>> q() {
        return (Set<e<?>>)kotlinx.coroutines.debug.internal.f.d.keySet();
    }
    
    private final String r(final k2 k2) {
        String s;
        if (k2 instanceof s2) {
            s = ((s2)k2).l1();
        }
        else {
            s = k2.toString();
        }
        return s;
    }
    
    private final l<Boolean, j2> t() {
        Object b = null;
        try {
            final b1$a h = b1.H;
            final Object instance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            if (instance == null) {
                throw new NullPointerException("null cannot be cast to non-null type (kotlin.Boolean) -> kotlin.Unit");
            }
            b1.b((Object)q1.q(instance, 1));
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            b = b1.b(c1.a(t));
        }
        Object o = b;
        if (b1.i(b)) {
            o = null;
        }
        return (l<Boolean, j2>)o;
    }
    
    private final boolean y(final e<?> e) {
        final kotlin.coroutines.g b = e.H.b();
        if (b != null) {
            final k2 k2 = (k2)b.get((g$c)kotlinx.coroutines.k2.t);
            if (k2 != null) {
                if (!k2.g()) {
                    return false;
                }
                kotlinx.coroutines.debug.internal.f.d.remove(e);
                return true;
            }
        }
        return false;
    }
    
    @org.jetbrains.annotations.e
    public final <T> kotlin.coroutines.d<T> F(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super T> d) {
        if (!this.z()) {
            return (kotlin.coroutines.d<T>)d;
        }
        if (this.B(d) != null) {
            return (kotlin.coroutines.d<T>)d;
        }
        k o;
        if (kotlinx.coroutines.debug.internal.f.i) {
            o = this.O(this.J(new Exception()));
        }
        else {
            o = null;
        }
        return (kotlin.coroutines.d<T>)this.g((kotlin.coroutines.d<? super Object>)d, o);
    }
    
    public final void G(@org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
        this.R(d, "RUNNING");
    }
    
    public final void H(@org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
        this.R(d, "SUSPENDED");
    }
    
    public final void K(final boolean i) {
        kotlinx.coroutines.debug.internal.f.i = i;
    }
    
    public final void L(final boolean h) {
        kotlinx.coroutines.debug.internal.f.h = h;
    }
    
    public final void P() {
        final ReentrantReadWriteLock g = kotlinx.coroutines.debug.internal.f.g;
        final ReentrantReadWriteLock.ReadLock lock = g.readLock();
        final int writeHoldCount = g.getWriteHoldCount();
        final int n = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = g.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = g.writeLock();
        writeLock.lock();
        try {
            final f l = kotlinx.coroutines.debug.internal.f.l;
            if (!l.z()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            --kotlinx.coroutines.debug.internal.f.installations;
            if (kotlinx.coroutines.debug.internal.f.installations != 0) {
                return;
            }
            l.N();
            kotlinx.coroutines.debug.internal.f.d.clear();
            kotlinx.coroutines.debug.internal.f.k.clear();
            if (kotlinx.coroutines.debug.a.c.b()) {
                return;
            }
            final l<Boolean, j2> j = kotlinx.coroutines.debug.internal.f.j;
            if (j != null) {
                final j2 j2 = (j2)j.invoke((Object)Boolean.FALSE);
            }
            final j2 a = j2.a;
        }
        finally {
            for (int k = n; k < readHoldCount; ++k) {
                lock.lock();
            }
            writeLock.unlock();
        }
    }
    
    public final void h(@org.jetbrains.annotations.e final PrintStream printStream) {
        synchronized (printStream) {
            kotlinx.coroutines.debug.internal.f.l.k(printStream);
            final j2 a = j2.a;
        }
    }
    
    @org.jetbrains.annotations.e
    public final List<c> i() {
        final ReentrantReadWriteLock c = c(this);
        final ReentrantReadWriteLock.ReadLock lock = c.readLock();
        final int writeHoldCount = c.getWriteHoldCount();
        final int n = 0;
        final int n2 = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = c.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = c.writeLock();
        writeLock.lock();
        try {
            final f l = kotlinx.coroutines.debug.internal.f.l;
            if (l.z()) {
                final List h5 = v.h5((Iterable)l.q(), (Comparator)new Comparator<T>() {
                    @Override
                    public final int compare(final T t, final T t2) {
                        return kotlin.comparisons.a.g((Comparable)((e)t).H.f, (Comparable)((e)t2).H.f);
                    }
                });
                final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<c>();
                final Iterator<e> iterator = h5.iterator();
                int j;
                while (true) {
                    j = n2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final e e = iterator.next();
                    final boolean d = kotlinx.coroutines.debug.internal.f.l.y(e);
                    c c2 = null;
                    if (!d) {
                        final kotlin.coroutines.g b = e.H.b();
                        if (b != null) {
                            c2 = new c(e.H, b);
                        }
                    }
                    if (c2 == null) {
                        continue;
                    }
                    list.add(c2);
                }
                while (j < readHoldCount) {
                    lock.lock();
                    ++j;
                }
                writeLock.unlock();
                return (List<c>)list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        finally {
            for (int k = n; k < readHoldCount; ++k) {
                lock.lock();
            }
            writeLock.unlock();
        }
    }
    
    @org.jetbrains.annotations.e
    public final List<h> l() {
        final ReentrantReadWriteLock c = c(this);
        final ReentrantReadWriteLock.ReadLock lock = c.readLock();
        final int writeHoldCount = c.getWriteHoldCount();
        final int n = 0;
        final int n2 = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = c.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = c.writeLock();
        writeLock.lock();
        try {
            final f l = kotlinx.coroutines.debug.internal.f.l;
            if (l.z()) {
                final List h5 = v.h5((Iterable)l.q(), (Comparator)new Comparator<T>() {
                    @Override
                    public final int compare(final T t, final T t2) {
                        return kotlin.comparisons.a.g((Comparable)((e)t).H.f, (Comparable)((e)t2).H.f);
                    }
                });
                final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<h>();
                final Iterator<e> iterator = h5.iterator();
                int j;
                while (true) {
                    j = n2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final e e = iterator.next();
                    final boolean d = kotlinx.coroutines.debug.internal.f.l.y(e);
                    h h6 = null;
                    if (!d) {
                        final kotlin.coroutines.g b = e.H.b();
                        if (b != null) {
                            h6 = new h(e.H, b);
                        }
                    }
                    if (h6 == null) {
                        continue;
                    }
                    list.add(h6);
                }
                while (j < readHoldCount) {
                    lock.lock();
                    ++j;
                }
                writeLock.unlock();
                return (List<h>)list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        finally {
            for (int k = n; k < readHoldCount; ++k) {
                lock.lock();
            }
            writeLock.unlock();
        }
    }
    
    @org.jetbrains.annotations.e
    public final List<StackTraceElement> m(@org.jetbrains.annotations.e final c c, @org.jetbrains.annotations.e final List<StackTraceElement> list) {
        return this.n(c.g(), c.e(), list);
    }
    
    public final boolean u() {
        return kotlinx.coroutines.debug.internal.f.i;
    }
    
    public final boolean v() {
        return kotlinx.coroutines.debug.internal.f.h;
    }
    
    @org.jetbrains.annotations.e
    public final String w(@org.jetbrains.annotations.e final k2 k2) {
        final ReentrantReadWriteLock g = kotlinx.coroutines.debug.internal.f.g;
        final ReentrantReadWriteLock.ReadLock lock = g.readLock();
        final int writeHoldCount = g.getWriteHoldCount();
        final int n = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = g.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = g.writeLock();
        writeLock.lock();
        try {
            final f l = kotlinx.coroutines.debug.internal.f.l;
            if (l.z()) {
                final Set<e<?>> q = l.q();
                final ArrayList<e> list = new ArrayList<e>();
                for (final e next : q) {
                    if (next.G.getContext().get((g$c)k2.t) != null) {
                        list.add(next);
                    }
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap<k2, d>(o.n(y0.j(v.Y((Iterable)list, 10)), 16));
                for (final e next2 : list) {
                    linkedHashMap.put(o2.C(next2.G.getContext()), next2.H);
                }
                final StringBuilder sb = new StringBuilder();
                kotlinx.coroutines.debug.internal.f.l.f(k2, (Map<k2, d>)linkedHashMap, sb, "");
                final String string = sb.toString();
                k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        finally {
            for (int j = n; j < readHoldCount; ++j) {
                lock.lock();
            }
            writeLock.unlock();
        }
    }
    
    public final void x() {
        final ReentrantReadWriteLock g = kotlinx.coroutines.debug.internal.f.g;
        final ReentrantReadWriteLock.ReadLock lock = g.readLock();
        final int writeHoldCount = g.getWriteHoldCount();
        final int n = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = g.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = g.writeLock();
        writeLock.lock();
        try {
            ++kotlinx.coroutines.debug.internal.f.installations;
            if (kotlinx.coroutines.debug.internal.f.installations > 1) {
                return;
            }
            kotlinx.coroutines.debug.internal.f.l.M();
            if (kotlinx.coroutines.debug.a.c.b()) {
                return;
            }
            final l<Boolean, j2> j = kotlinx.coroutines.debug.internal.f.j;
            if (j != null) {
                final j2 j2 = (j2)j.invoke((Object)Boolean.TRUE);
            }
            final j2 a = j2.a;
        }
        finally {
            for (int k = n; k < readHoldCount; ++k) {
                lock.lock();
            }
            writeLock.unlock();
        }
    }
    
    public final boolean z() {
        return kotlinx.coroutines.debug.internal.f.installations > 0;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 " }, d2 = { "kotlinx/coroutines/debug/internal/f$e", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "I", "Lkotlin/coroutines/jvm/internal/e;", "frame", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "G", "Lkotlin/coroutines/d;", "delegate", "Lkotlinx/coroutines/debug/internal/d;", "H", "Lkotlinx/coroutines/debug/internal/d;", "info", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/debug/internal/d;Lkotlin/coroutines/jvm/internal/e;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class e<T> implements kotlin.coroutines.d<T>, kotlin.coroutines.jvm.internal.e
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final kotlin.coroutines.d<T> G;
        @m6.d
        @org.jetbrains.annotations.e
        public final d H;
        private final kotlin.coroutines.jvm.internal.e I;
        
        public e(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super T> g, @org.jetbrains.annotations.e final d h, @org.jetbrains.annotations.f final kotlin.coroutines.jvm.internal.e i) {
            this.G = (kotlin.coroutines.d<T>)g;
            this.H = h;
            this.I = i;
        }
        
        @org.jetbrains.annotations.f
        public kotlin.coroutines.jvm.internal.e getCallerFrame() {
            final kotlin.coroutines.jvm.internal.e i = this.I;
            kotlin.coroutines.jvm.internal.e callerFrame;
            if (i != null) {
                callerFrame = i.getCallerFrame();
            }
            else {
                callerFrame = null;
            }
            return callerFrame;
        }
        
        @org.jetbrains.annotations.e
        public kotlin.coroutines.g getContext() {
            return this.G.getContext();
        }
        
        @org.jetbrains.annotations.f
        public StackTraceElement getStackTraceElement() {
            final kotlin.coroutines.jvm.internal.e i = this.I;
            StackTraceElement stackTraceElement;
            if (i != null) {
                stackTraceElement = i.getStackTraceElement();
            }
            else {
                stackTraceElement = null;
            }
            return stackTraceElement;
        }
        
        public void resumeWith(@org.jetbrains.annotations.e final Object o) {
            kotlinx.coroutines.debug.internal.f.l.E(this);
            this.G.resumeWith(o);
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            return this.G.toString();
        }
    }
}
