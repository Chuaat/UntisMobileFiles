// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.error;

import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import kotlin.jvm.internal.k0;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import i5.a;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.error.WebUntisError;
import java.util.List;
import androidx.appcompat.app.d$a;
import android.content.Context;
import android.content.DialogInterface;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/ui/activities/error/b;", "", "Landroid/content/Context;", "context", "Landroidx/appcompat/app/d$a;", "builder", "", "Lcom/untis/mobile/persistence/models/error/WebUntisError;", "errors", "Lkotlin/j2;", "b", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    @SuppressLint({ "InflateParams" })
    private final void b(final Context context, final d$a d$a, final List<WebUntisError> list) {
        final View inflate = LayoutInflater.from(context).inflate(2131493066, (ViewGroup)null, false);
        final int wl = c.i.Wl;
        ((RecyclerView)inflate.findViewById(wl)).setAdapter((RecyclerView$h)new a(context, list));
        ((RecyclerView)inflate.findViewById(wl)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(context));
        ((RecyclerView)inflate.findViewById(wl)).n((RecyclerView$o)new l(context, 1));
        d$a.M(inflate);
    }
    
    private static final void d(final DialogInterface dialogInterface, final int n) {
    }
    
    public final void c(@e final Context context, @e final List<WebUntisError> list) {
        k0.p(context, "context");
        k0.p(list, "errors");
        if (list.isEmpty()) {
            return;
        }
        final d$a d$a = new d$a(context, 2131951624);
        if (list.size() == 1) {
            final WebUntisError webUntisError = list.get(0);
            d$a.K((CharSequence)webUntisError.getTitle());
            if (webUntisError.getDescription() != null) {
                d$a.n((CharSequence)webUntisError.getDescription());
            }
        }
        else {
            d$a.K((CharSequence)"§WebUntis conflicts");
            this.b(context, d$a, list);
        }
        d$a.B(2131886660, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.error.a.G);
        ((Dialog)d$a.a()).show();
    }
}
