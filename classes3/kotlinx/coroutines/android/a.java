// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.android;

import n6.l;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.w2;
import kotlin.jvm.internal.k0;
import android.os.Looper;
import kotlin.ranges.o;
import kotlinx.coroutines.l1;
import kotlin.coroutines.g;
import kotlin.j2;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import android.os.Handler;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlinx.coroutines.c1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)B\u001d\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b(\u0010*J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\u00020\u00008\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&¨\u0006+" }, d2 = { "Lkotlinx/coroutines/android/a;", "Lkotlinx/coroutines/android/b;", "Lkotlinx/coroutines/c1;", "Lkotlin/coroutines/g;", "context", "", "K", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "H", "", "timeMillis", "Lkotlinx/coroutines/o;", "continuation", "e", "Lkotlinx/coroutines/l1;", "D", "", "toString", "", "other", "equals", "", "hashCode", "J", "Ljava/lang/String;", "name", "Landroid/os/Handler;", "I", "Landroid/os/Handler;", "handler", "Lkotlinx/coroutines/android/a;", "a0", "()Lkotlinx/coroutines/android/a;", "immediate", "_immediate", "Z", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android" }, k = 1, mv = { 1, 4, 2 })
public final class a extends b implements c1
{
    @e
    private final a H;
    private final Handler I;
    private final String J;
    private final boolean K;
    private volatile a _immediate;
    
    public a(@e final Handler handler, @f final String s) {
        this(handler, s, false);
    }
    
    private a(final Handler i, final String j, final boolean k) {
        a immediate = null;
        super(null);
        this.I = i;
        this.J = j;
        this.K = k;
        if (k) {
            immediate = this;
        }
        this._immediate = immediate;
        final a immediate2 = this._immediate;
        a a;
        if (immediate2 != null) {
            a = immediate2;
        }
        else {
            a = new a(i, j, true);
            this._immediate = a;
            final j2 a2 = j2.a;
        }
        this.H = a;
    }
    
    public static final /* synthetic */ Handler Z(final a a) {
        return a.I;
    }
    
    @e
    @Override
    public l1 D(final long n, @e final Runnable runnable, @e final g g) {
        this.I.postDelayed(runnable, o.v(n, 4611686018427387903L));
        return new l1(runnable) {
            final /* synthetic */ a G;
            final /* synthetic */ Runnable H;
            
            @Override
            public void dispose() {
                a.Z(this.G).removeCallbacks(this.H);
            }
        };
    }
    
    @Override
    public void H(@e final g g, @e final Runnable runnable) {
        this.I.post(runnable);
    }
    
    @Override
    public boolean K(@e final g g) {
        final boolean k = this.K;
        boolean b = true;
        if (k) {
            b = ((k0.g((Object)Looper.myLooper(), (Object)this.I.getLooper()) ^ true) && b);
        }
        return b;
    }
    
    @e
    public a a0() {
        return this.H;
    }
    
    @Override
    public void e(final long n, @e final kotlinx.coroutines.o<? super j2> o) {
        final Runnable runnable = new Runnable() {
            final /* synthetic */ a G;
            
            @Override
            public final void run() {
                o.F(this.G, j2.a);
            }
        };
        this.I.postDelayed((Runnable)runnable, o.v(n, 4611686018427387903L));
        o.t((l)new l<Throwable, j2>() {
            final /* synthetic */ a G;
            
            public final void a(@f final Throwable t) {
                a.Z(this.G).removeCallbacks(runnable);
            }
        });
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof a && ((a)o).I == this.I;
    }
    
    @Override
    public int hashCode() {
        return System.identityHashCode(this.I);
    }
    
    @e
    @Override
    public String toString() {
        String s = this.S();
        if (s == null) {
            String str = this.J;
            if (str == null) {
                str = this.I.toString();
            }
            s = str;
            if (this.K) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".immediate");
                s = sb.toString();
            }
        }
        return s;
    }
}
