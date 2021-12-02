// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity;

import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import androidx.lifecycle.y;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\u000b" }, d2 = { "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/y;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/c;", "Lkotlin/j2;", "Lkotlin/s;", "onBackPressed", "a", "activity-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class d
{
    @e
    public static final c a(@e final OnBackPressedDispatcher onBackPressedDispatcher, @f final y y, final boolean b, @e final l<? super c, j2> l) {
        k0.q((Object)onBackPressedDispatcher, "$this$addCallback");
        k0.q((Object)l, "onBackPressed");
        final c c = new c() {
            @Override
            public void handleOnBackPressed() {
                l.invoke((Object)this);
            }
        };
        if (y != null) {
            onBackPressedDispatcher.b(y, c);
        }
        else {
            onBackPressedDispatcher.a(c);
        }
        return c;
    }
}
