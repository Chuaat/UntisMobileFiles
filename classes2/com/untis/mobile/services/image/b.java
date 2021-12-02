// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.image;

import android.widget.ImageView;
import com.bumptech.glide.request.h;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.k;
import org.jetbrains.annotations.f;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.d;
import com.amulyakhare.textdrawable.c$e;
import kotlin.jvm.internal.k0;
import com.amulyakhare.textdrawable.c;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0002J,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/services/image/b;", "Lcom/untis/mobile/services/image/a;", "Landroid/content/Context;", "context", "", "text", "", "backGroundColor", "textColor", "Lcom/amulyakhare/textdrawable/c;", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "url", "initials", "Lkotlin/j2;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    public static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    private final c b(final Context context, final String s, final int n, final int n2) {
        final c$e b = c.a().n().i(context.getResources().getDimensionPixelSize(2131165283)).h().p(n2).g().b();
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        final c c = b.c(s2, n);
        k0.o(c, "builder()\n                .beginConfig()\n                .fontSize(context.resources.getDimensionPixelSize(R.dimen.common_text_large))\n                .bold()\n                .textColor(textColor)\n                .toUpperCase()\n                .endConfig()\n                .buildRound(text ?: \"\", backGroundColor)");
        return c;
    }
    
    static /* synthetic */ c c(final b b, final Context context, final String s, int f, int f2, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            f = d.f(context, 2131099992);
        }
        if ((n & 0x8) != 0x0) {
            f2 = d.f(context, 2131100072);
        }
        return b.b(context, s, f, f2);
    }
    
    @Override
    public void a(@e final Context context, @e final AppCompatImageView appCompatImageView, @f final String s, @f final String s2) {
        k0.p(context, "context");
        k0.p(appCompatImageView, "imageView");
        ((k)((com.bumptech.glide.request.a)((com.bumptech.glide.request.a)com.bumptech.glide.b.D(context).O(s)).w(j.e)).F0((Drawable)c(this, context, s2, 0, 0, 12, null))).b1((com.bumptech.glide.request.a)h.d1()).s1((ImageView)appCompatImageView);
    }
}
