// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import android.widget.TextView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.j2;
import android.content.Context;
import androidx.core.content.d;
import java.util.Objects;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.persistence.models.masterdata.Room;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\\\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\b¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/w;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "", "isFavorite", "Lkotlin/j2;", "f", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "room", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onRoom", "onFavoriteRoom", "c", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class w extends RecyclerView$g0
{
    public w(@e final View view) {
        k0.p(view, "view");
        super(view);
    }
    
    private static final void d(final l l, final Room room, final w w, final AppCompatImageView appCompatImageView, final View view) {
        k0.p(l, "$onFavoriteRoom");
        k0.p(room, "$room");
        k0.p(w, "this$0");
        l.invoke(room);
        final Object tag = ((ImageView)appCompatImageView).getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
        w.f((boolean)tag ^ true);
    }
    
    private static final void e(final l l, final Room room, final View view) {
        k0.p(l, "$onRoom");
        k0.p(room, "$room");
        l.invoke(room);
    }
    
    private final void f(final boolean b) {
        final AppCompatImageView appCompatImageView = (AppCompatImageView)super.itemView.findViewById(2131298257);
        Context context;
        int n;
        if (b) {
            ((ImageView)appCompatImageView).setTag((Object)Boolean.TRUE);
            context = super.itemView.getContext();
            n = 2131230948;
        }
        else {
            ((ImageView)appCompatImageView).setTag((Object)Boolean.FALSE);
            context = super.itemView.getContext();
            n = 2131230949;
        }
        appCompatImageView.setImageDrawable(d.i(context, n));
    }
    
    public final void c(@e final Room room, final boolean b, @e final l<? super Room, j2> l, @e final l<? super Room, j2> i) {
        k0.p(room, "room");
        k0.p(l, "onRoom");
        k0.p(i, "onFavoriteRoom");
        ((TextView)super.itemView.findViewById(2131298259)).setText((CharSequence)room.getDisplayableTitle());
        ((TextView)super.itemView.findViewById(2131298258)).setText((CharSequence)room.getDisplayableDescription());
        final AppCompatImageView appCompatImageView = (AppCompatImageView)super.itemView.findViewById(2131298257);
        ((ImageView)appCompatImageView).setTag((Object)b);
        ((ImageView)appCompatImageView).setOnClickListener((View$OnClickListener)new v(i, room, this, appCompatImageView));
        this.f(b);
        super.itemView.setOnClickListener((View$OnClickListener)new u(l, room));
    }
}
