// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import android.widget.TextView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Iterator;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.services.timetable.placeholder.p;
import com.untis.mobile.persistence.models.profile.Child;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.ArrayList;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016R&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0011j\b\u0012\u0004\u0012\u00020\u0002`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#" }, d2 = { "Lcom/untis/mobile/ui/activities/s;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "entity", "Landroid/graphics/drawable/Drawable;", "a", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "b", "", "getItemId", "getCount", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "I", "Ljava/util/ArrayList;", "favoritesAndChildren", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "H", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "", "profileId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s extends BaseAdapter
{
    @e
    private final Context G;
    private final LayoutInflater H;
    @e
    private final ArrayList<DisplayableEntity> I;
    
    public s(@e final Context g, @e final String s) {
        k0.p(g, "context");
        k0.p(s, "profileId");
        this.G = g;
        this.H = LayoutInflater.from(g);
        final ArrayList<DisplayableEntity> i = new ArrayList<DisplayableEntity>();
        this.I = i;
        Profile l;
        if ((l = j0.G.l(s)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        final com.untis.mobile.services.masterdata.a masterDataService = l.getMasterDataService();
        if (l.getUserHasTimeTableAccess() && l.hasEntity()) {
            final DisplayableEntity v = masterDataService.v(l.getEntityType(), l.getEntityId());
            if (v != null) {
                i.add(v);
            }
        }
        final Set<Child> userChildren = l.getUserChildren();
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Child next : userChildren) {
            if (next.getHasTimeTableAccess()) {
                list.add(next);
            }
        }
        if (l.getEntityType().isParentRole() && (list.isEmpty() ^ true)) {
            final ArrayList<DisplayableEntity> j = this.I;
            final Iterator<Child> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final DisplayableEntity v2 = masterDataService.v(EntityType.STUDENT, iterator2.next().getId());
                if (v2 != null) {
                    j.add(v2);
                }
            }
        }
        final List<TimeTableEntity> t = p.Y.a(s).t();
        final ArrayList<TimeTableEntity> list2 = new ArrayList<TimeTableEntity>();
        for (final TimeTableEntity next2 : t) {
            if (next2.getFavorite()) {
                list2.add(next2);
            }
        }
        final ArrayList<DisplayableEntity> k = this.I;
        for (final TimeTableEntity timeTableEntity : list2) {
            final DisplayableEntity v3 = masterDataService.v(timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
            if (v3 != null) {
                k.add(v3);
            }
        }
    }
    
    private final Drawable a(final DisplayableEntity displayableEntity) {
        final int n = a.a[displayableEntity.entityType().ordinal()];
        Context context;
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            context = this.G;
                            n2 = 2131230884;
                        }
                        else {
                            context = this.G;
                            n2 = 2131230950;
                        }
                    }
                    else {
                        context = this.G;
                        n2 = 2131230932;
                    }
                }
                else {
                    context = this.G;
                    n2 = 2131230951;
                }
            }
            else {
                context = this.G;
                n2 = 2131230952;
            }
        }
        else {
            context = this.G;
            n2 = 2131230876;
        }
        return d.i(context, n2);
    }
    
    @e
    public DisplayableEntity b(final int index) {
        final DisplayableEntity value = this.I.get(index);
        k0.o(value, "favoritesAndChildren[position]");
        return value;
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int n, @f final View view, @f final ViewGroup viewGroup) {
        final DisplayableEntity b = this.b(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493247, viewGroup, false);
        }
        ((AppCompatImageView)inflate.findViewById(c.i.JB)).setImageDrawable(this.a(b));
        ((TextView)inflate.findViewById(c.i.LB)).setText((CharSequence)b.getDisplayableTitle());
        final int kb = c.i.KB;
        ((TextView)inflate.findViewById(kb)).setText((CharSequence)b.getDisplayableDescription());
        if (((TextView)inflate.findViewById(kb)).getText().toString().length() == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            ((TextView)inflate.findViewById(kb)).setVisibility(8);
        }
        else {
            ((TextView)inflate.findViewById(kb)).setVisibility(0);
        }
        k0.o(inflate, "view");
        return inflate;
    }
}
