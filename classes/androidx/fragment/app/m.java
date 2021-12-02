// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import kotlin.i;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a:\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b¨\u0006\f" }, d2 = { "Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/a0;", "Lkotlin/j2;", "Lkotlin/s;", "body", "a", "c", "now", "e", "fragment-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class m
{
    public static final void a(@e final FragmentManager fragmentManager, final boolean b, @e final l<? super a0, j2> l) {
        k0.q((Object)fragmentManager, "$this$commit");
        k0.q((Object)l, "body");
        final a0 r = fragmentManager.r();
        k0.h((Object)r, "beginTransaction()");
        l.invoke((Object)r);
        if (b) {
            r.s();
        }
        else {
            r.r();
        }
    }
    
    public static final void c(@e final FragmentManager fragmentManager, final boolean b, @e final l<? super a0, j2> l) {
        k0.q((Object)fragmentManager, "$this$commitNow");
        k0.q((Object)l, "body");
        final a0 r = fragmentManager.r();
        k0.h((Object)r, "beginTransaction()");
        l.invoke((Object)r);
        if (b) {
            r.u();
        }
        else {
            r.t();
        }
    }
    
    @i(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void e(@e final FragmentManager fragmentManager, final boolean b, final boolean b2, @e final l<? super a0, j2> l) {
        k0.q((Object)fragmentManager, "$this$transaction");
        k0.q((Object)l, "body");
        final a0 r = fragmentManager.r();
        k0.h((Object)r, "beginTransaction()");
        l.invoke((Object)r);
        if (b) {
            if (b2) {
                r.u();
            }
            else {
                r.t();
            }
        }
        else if (b2) {
            r.s();
        }
        else {
            r.r();
        }
    }
}
