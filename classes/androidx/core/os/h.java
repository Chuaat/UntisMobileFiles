// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.a;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import android.os.Handler;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f" }, d2 = { "Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lkotlin/j2;", "action", "Ljava/lang/Runnable;", "c", "uptimeMillis", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    @e
    public static final Runnable a(@e final Handler handler, final long n, @f final Object o, @e final a<j2> a) {
        k0.p((Object)handler, "<this>");
        k0.p((Object)a, "action");
        final Runnable runnable = new Runnable() {
            final /* synthetic */ a<j2> G;
            
            @Override
            public final void run() {
                this.G.invoke();
            }
        };
        handler.postAtTime((Runnable)runnable, o, n);
        return runnable;
    }
    
    @e
    public static final Runnable c(@e final Handler handler, final long n, @f final Object o, @e final a<j2> a) {
        k0.p((Object)handler, "<this>");
        k0.p((Object)a, "action");
        final Runnable runnable = new Runnable() {
            final /* synthetic */ a<j2> G;
            
            @Override
            public final void run() {
                this.G.invoke();
            }
        };
        if (o == null) {
            handler.postDelayed((Runnable)runnable, n);
        }
        else {
            g.d(handler, runnable, o, n);
        }
        return runnable;
    }
}
