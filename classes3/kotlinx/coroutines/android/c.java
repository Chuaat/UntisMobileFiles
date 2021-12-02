// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.android;

import kotlin.jvm.internal.k0;
import kotlinx.coroutines.m0;
import android.view.Choreographer$FrameCallback;
import kotlin.k;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlinx.coroutines.i1;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.p;
import android.os.Handler$Callback;
import java.util.Objects;
import android.os.Build$VERSION;
import android.os.Handler;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.o;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.jvm.internal.w;
import android.os.Looper;
import kotlin.b1;
import android.view.Choreographer;
import org.jetbrains.annotations.f;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/b;", "f", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/b;", "Landroid/os/Looper;", "", "async", "c", "", "d", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/o;", "cont", "Lkotlin/j2;", "j", "Landroid/view/Choreographer;", "choreographer", "i", "a", "J", "MAX_DELAY", "b", "Lkotlinx/coroutines/android/b;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android" }, k = 2, mv = { 1, 4, 2 })
public final class c
{
    private static final long a = 4611686018427387903L;
    @d
    @f
    public static final b b;
    private static volatile Choreographer choreographer;
    
    static {
        final b b2 = null;
        Object b3 = null;
        try {
            final b1$a h = b1.H;
            b1.b((Object)new a(c(Looper.getMainLooper(), true), null, 2, null));
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            b3 = b1.b(c1.a(t));
        }
        if (b1.i(b3)) {
            b3 = b2;
        }
        b = (b)b3;
    }
    
    @androidx.annotation.b1
    @e
    public static final Handler c(@e final Looper looper, final boolean b) {
        if (b) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 16) {
                if (sdk_INT >= 28) {
                    final Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                    Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
                    return (Handler)invoke;
                }
                try {
                    return Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                }
                catch (NoSuchMethodException ex) {
                    return new Handler(looper);
                }
            }
        }
        return new Handler(looper);
    }
    
    @f
    public static final Object d(@e final kotlin.coroutines.d<? super Long> d) {
        final Choreographer choreographer = c.choreographer;
        if (choreographer != null) {
            final p p = new p((kotlin.coroutines.d<? super T>)kotlin.coroutines.intrinsics.b.d((kotlin.coroutines.d)d), 1);
            p.H();
            i(choreographer, p);
            final Object y = p.y();
            if (y == kotlin.coroutines.intrinsics.b.h()) {
                h.c((kotlin.coroutines.d)d);
            }
            return y;
        }
        final p p2 = new p((kotlin.coroutines.d<? super T>)kotlin.coroutines.intrinsics.b.d((kotlin.coroutines.d)d), 1);
        p2.H();
        i1.e().H((g)i.H, new Runnable() {
            @Override
            public final void run() {
                j(p2);
            }
        });
        final Object y2 = p2.y();
        if (y2 == kotlin.coroutines.intrinsics.b.h()) {
            h.c((kotlin.coroutines.d)d);
        }
        return y2;
    }
    
    @m6.g(name = "from")
    @m6.h
    @e
    public static final b e(@e final Handler handler) {
        return g(handler, null, 1, null);
    }
    
    @m6.g(name = "from")
    @m6.h
    @e
    public static final b f(@e final Handler handler, @f final String s) {
        return new a(handler, s);
    }
    
    public static /* synthetic */ b g(final Handler handler, String s, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        return f(handler, s);
    }
    
    private static final void i(final Choreographer choreographer, final o<? super Long> o) {
        choreographer.postFrameCallback((Choreographer$FrameCallback)new Choreographer$FrameCallback() {
            public final void doFrame(final long l) {
                o.F(i1.e(), l);
            }
        });
    }
    
    private static final void j(final o<? super Long> o) {
        Choreographer choreographer = c.choreographer;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            k0.m((Object)choreographer);
            c.choreographer = choreographer;
        }
        i(choreographer, o);
    }
}
