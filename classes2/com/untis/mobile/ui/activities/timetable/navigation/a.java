// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable.navigation;

import android.widget.ImageView;
import kotlin.text.s;
import java.util.Objects;
import android.widget.TextView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.persistence.models.EntityType;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import com.untis.mobile.ui.activities.common.b;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.ui.activities.timetable.v;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b+\u0010,J$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001e\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0011¨\u0006-" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/navigation/a;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/persistence/models/profile/Child;", "a", "", "getItemId", "getCount", "Lkotlin/j2;", "b", "O", "I", "colorIconLight", "K", "colorDefault", "Lcom/untis/mobile/ui/activities/timetable/v;", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "", "H", "Ljava/util/List;", "favorites", "M", "colorHighlightedLight", "N", "colorIcon", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "J", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/ui/activities/common/b;", "activity", "L", "colorHighlighted", "<init>", "(Lcom/untis/mobile/ui/activities/timetable/v;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends BaseAdapter
{
    @e
    private final v G;
    @e
    private final List<Child> H;
    @e
    private final b I;
    private final LayoutInflater J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    
    public a(@e final v g, @e final List<Child> h) {
        k0.p(g, "timeTableActivityService");
        k0.p(h, "favorites");
        this.G = g;
        this.H = h;
        final b w0 = g.W0();
        this.I = w0;
        this.J = LayoutInflater.from((Context)w0);
        this.K = d.f((Context)w0, 2131100016);
        this.L = d.f((Context)w0, 2131100003);
        this.M = d.f((Context)w0, 2131100003);
        this.N = d.f((Context)w0, 2131099992);
        this.O = d.f((Context)w0, 2131100026);
    }
    
    @e
    public Child a(final int n) {
        return this.H.get(n);
    }
    
    public final void b() {
        this.notifyDataSetInvalidated();
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int textColor, @f final View view, @f final ViewGroup viewGroup) {
        final Child a = this.a(textColor);
        final int n = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.J.inflate(2131493228, viewGroup, false);
        }
        textColor = n;
        if (this.G.k1().getEntityType() == EntityType.STUDENT) {
            textColor = n;
            if (this.G.k1().getEntityId() == a.getId()) {
                textColor = 1;
            }
        }
        final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(c.i.oA);
        TextView textView;
        if (textColor != 0) {
            ((ImageView)appCompatImageView).setColorFilter(this.L);
            ((ImageView)inflate.findViewById(c.i.pA)).setColorFilter(this.M);
            textView = (TextView)inflate.findViewById(c.i.qA);
            textColor = this.L;
        }
        else {
            ((ImageView)appCompatImageView).setColorFilter(this.N);
            ((ImageView)inflate.findViewById(c.i.pA)).setColorFilter(this.O);
            textView = (TextView)inflate.findViewById(c.i.qA);
            textColor = this.K;
        }
        textView.setTextColor(textColor);
        final TextView textView2 = (TextView)inflate.findViewById(c.i.qA);
        final StringBuilder sb = new StringBuilder();
        sb.append(a.getFirstName());
        sb.append(' ');
        sb.append(a.getLastName());
        final String string = sb.toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        textView2.setText((CharSequence)s.B5((CharSequence)string).toString());
        k0.o(inflate, "view");
        return inflate;
    }
}
