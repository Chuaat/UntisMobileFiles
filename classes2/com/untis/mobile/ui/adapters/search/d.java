// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.search;

import android.widget.ImageView;
import com.untis.mobile.persistence.models.EntityType;
import java.util.Iterator;
import java.util.Comparator;
import kotlin.collections.v;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import com.untis.mobile.utils.comparator.b;
import android.annotation.SuppressLint;
import android.text.style.ForegroundColorSpan;
import kotlin.text.s;
import java.util.Objects;
import android.text.SpannableString;
import android.text.Spannable;
import android.view.View;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.utils.a;
import java.util.ArrayList;
import com.untis.mobile.services.timetable.placeholder.p;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.f;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010@\u001a\u00020\n\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0004\bA\u0010BJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\nR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0018\u0010)\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001e\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u001aR\u0018\u0010=\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u001a¨\u0006C" }, d2 = { "Lcom/untis/mobile/ui/adapters/search/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/ui/adapters/search/e;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "displayableEntity", "Landroid/graphics/drawable/Drawable;", "n", "", "m", "l", "", "text", "Landroid/text/Spannable;", "k", "getItemCount", "Landroid/view/ViewGroup;", "parent", "position", "r", "viewHolder", "Lkotlin/j2;", "o", "t", "s", "filter", "u", "Landroid/graphics/drawable/Drawable;", "iconDuck", "iconEmptyStar", "j", "iconSubject", "", "a", "Ljava/util/List;", "displayableEntities", "f", "entities", "e", "Ljava/lang/String;", "i", "iconStudent", "iconStar", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "iconRoom", "", "Z", "premium", "Lcom/untis/mobile/services/timetable/placeholder/k;", "b", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "d", "I", "colorHighlight", "g", "iconTeacher", "h", "iconClass", "Landroid/content/Context;", "context", "profileId", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class d extends RecyclerView$h<e>
{
    @org.jetbrains.annotations.e
    private final List<DisplayableEntity> a;
    @org.jetbrains.annotations.e
    private final k b;
    private final LayoutInflater c;
    private final int d;
    @org.jetbrains.annotations.e
    private String e;
    @org.jetbrains.annotations.e
    private List<? extends DisplayableEntity> f;
    @f
    private final Drawable g;
    @f
    private final Drawable h;
    @f
    private final Drawable i;
    @f
    private final Drawable j;
    @f
    private final Drawable k;
    @f
    private final Drawable l;
    @f
    private final Drawable m;
    @f
    private final Drawable n;
    private boolean o;
    
    public d(@org.jetbrains.annotations.e final Context context, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final List<? extends DisplayableEntity> a) {
        k0.p(context, "context");
        k0.p(s, "profileId");
        k0.p(a, "displayableEntities");
        this.a = (List<DisplayableEntity>)a;
        this.b = p.Y.a(s);
        this.c = LayoutInflater.from(context);
        this.d = androidx.core.content.d.f(context, 2131099692);
        this.e = "";
        this.f = new ArrayList<DisplayableEntity>();
        final Drawable i = androidx.core.content.d.i(context, 2131230952);
        final Drawable drawable = null;
        Drawable mutate;
        if (i == null) {
            mutate = null;
        }
        else {
            mutate = i.mutate();
        }
        this.g = mutate;
        final Drawable j = androidx.core.content.d.i(context, 2131230876);
        Drawable mutate2;
        if (j == null) {
            mutate2 = null;
        }
        else {
            mutate2 = j.mutate();
        }
        this.h = mutate2;
        final Drawable k = androidx.core.content.d.i(context, 2131230950);
        Drawable mutate3;
        if (k == null) {
            mutate3 = null;
        }
        else {
            mutate3 = k.mutate();
        }
        this.i = mutate3;
        final Drawable l = androidx.core.content.d.i(context, 2131230951);
        Drawable mutate4;
        if (l == null) {
            mutate4 = null;
        }
        else {
            mutate4 = l.mutate();
        }
        this.j = mutate4;
        final Drawable m = androidx.core.content.d.i(context, 2131230932);
        Drawable mutate5;
        if (m == null) {
            mutate5 = null;
        }
        else {
            mutate5 = m.mutate();
        }
        this.k = mutate5;
        final Drawable i2 = androidx.core.content.d.i(context, 2131230884);
        Drawable mutate6;
        if (i2 == null) {
            mutate6 = null;
        }
        else {
            mutate6 = i2.mutate();
        }
        this.l = mutate6;
        final Drawable i3 = androidx.core.content.d.i(context, 2131230948);
        Drawable mutate7;
        if (i3 == null) {
            mutate7 = null;
        }
        else {
            mutate7 = i3.mutate();
        }
        this.m = mutate7;
        final Drawable i4 = androidx.core.content.d.i(context, 2131230949);
        Drawable mutate8;
        if (i4 == null) {
            mutate8 = drawable;
        }
        else {
            mutate8 = i4.mutate();
        }
        this.n = mutate8;
        this.o = com.untis.mobile.utils.a.a(context).I(j0.G.l(s));
    }
    
    @SuppressLint({ "DefaultLocale" })
    private final Spannable k(String lowerCase) {
        final SpannableString spannableString = new SpannableString((CharSequence)lowerCase);
        if (this.e.length() > 0) {
            Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
            lowerCase = lowerCase.toLowerCase();
            k0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            final String e = this.e;
            Objects.requireNonNull(e, "null cannot be cast to non-null type java.lang.String");
            final String lowerCase2 = e.toLowerCase();
            k0.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
            final int n3 = s.n3((CharSequence)lowerCase, lowerCase2, 0, true);
            if (n3 > -1) {
                spannableString.setSpan((Object)new ForegroundColorSpan(this.d), n3, this.e.length() + n3, 256);
            }
        }
        return (Spannable)spannableString;
    }
    
    private final Drawable l(final DisplayableEntity displayableEntity) {
        Drawable drawable;
        if (this.b.i(displayableEntity.entityType(), displayableEntity.entityId())) {
            drawable = this.m;
        }
        else {
            drawable = this.n;
        }
        return drawable;
    }
    
    private final int m() {
        int n;
        if (this.o) {
            n = 0;
        }
        else {
            n = 8;
        }
        return n;
    }
    
    private final Drawable n(final DisplayableEntity displayableEntity) {
        final int n = com.untis.mobile.ui.adapters.search.d.a.a[displayableEntity.entityType().ordinal()];
        Drawable drawable;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            drawable = this.l;
                        }
                        else {
                            drawable = this.k;
                        }
                    }
                    else {
                        drawable = this.j;
                    }
                }
                else {
                    drawable = this.i;
                }
            }
            else {
                drawable = this.h;
            }
        }
        else {
            drawable = this.g;
        }
        return drawable;
    }
    
    private static final void p(final d d, final DisplayableEntity displayableEntity, final View view) {
        k0.p(d, "this$0");
        k0.p(displayableEntity, "$displayableEntity");
        d.t(displayableEntity);
    }
    
    private static final void q(final d d, final DisplayableEntity displayableEntity, final int n, final View view) {
        k0.p(d, "this$0");
        k0.p(displayableEntity, "$displayableEntity");
        d.s(displayableEntity);
        d.notifyItemChanged(n);
    }
    
    private static final int w(final d d, final String s, final DisplayableEntity displayableEntity, final DisplayableEntity displayableEntity2) {
        k0.p(d, "this$0");
        k0.p(s, "$filter");
        final int length = d.e.length();
        boolean b = false;
        if (length > 0) {
            final boolean b2 = s.s2(displayableEntity.getDisplayableTitle(), s, true) || s.s2(displayableEntity.getDisplayableDescription(), s, true);
            if (s.s2(displayableEntity2.getDisplayableTitle(), s, true) || s.s2(displayableEntity2.getDisplayableDescription(), s, true)) {
                b = true;
            }
            if (b2 && !b) {
                return -1;
            }
            if (!b2 && b) {
                return 1;
            }
        }
        return com.untis.mobile.utils.comparator.b.G.c(displayableEntity.getDisplayableTitle(), displayableEntity2.getDisplayableTitle());
    }
    
    public int getItemCount() {
        return this.f.size();
    }
    
    public void o(@org.jetbrains.annotations.e final e e, final int n) {
        k0.p(e, "viewHolder");
        final DisplayableEntity displayableEntity = (DisplayableEntity)this.f.get(n);
        final View itemView = e.itemView;
        final int ey = com.untis.mobile.c.i.ey;
        ((ImageView)itemView.findViewById(ey)).setVisibility(0);
        ((AppCompatImageView)e.itemView.findViewById(ey)).setImageDrawable(this.n(displayableEntity));
        ((TextView)e.itemView.findViewById(com.untis.mobile.c.i.hy)).setText((CharSequence)com.untis.mobile.utils.extension.h.P(displayableEntity.getDisplayableTitle(), this.d, this.e));
        ((TextView)e.itemView.findViewById(com.untis.mobile.c.i.gy)).setText((CharSequence)com.untis.mobile.utils.extension.h.P(displayableEntity.getDisplayableDescription(), this.d, this.e));
        final View itemView2 = e.itemView;
        final int dy = com.untis.mobile.c.i.dy;
        ((ImageView)itemView2.findViewById(dy)).setVisibility(this.m());
        ((AppCompatImageView)e.itemView.findViewById(dy)).setImageDrawable(this.l(displayableEntity));
        e.itemView.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.adapters.search.a(this, displayableEntity));
        ((ImageView)e.itemView.findViewById(dy)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.adapters.search.b(this, displayableEntity, n));
    }
    
    @org.jetbrains.annotations.e
    public e r(@org.jetbrains.annotations.e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131493204, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_entity_search, parent, false)");
        return new e(inflate);
    }
    
    public abstract void s(@org.jetbrains.annotations.e final DisplayableEntity p0);
    
    public abstract void t(@org.jetbrains.annotations.e final DisplayableEntity p0);
    
    public final void u(@org.jetbrains.annotations.e final String e) {
        k0.p(e, "filter");
        this.e = e;
        final List<DisplayableEntity> a = this.a;
        final ArrayList<DisplayableEntity> f = new ArrayList<DisplayableEntity>();
        for (final DisplayableEntity next : a) {
            final DisplayableEntity displayableEntity = next;
            final String displayableTitle = displayableEntity.getDisplayableTitle();
            final String e2 = this.e;
            int n = 1;
            if (!s.S2((CharSequence)displayableTitle, (CharSequence)e2, true)) {
                if (s.S2((CharSequence)displayableEntity.getDisplayableDescription(), (CharSequence)this.e, true)) {
                    n = n;
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                f.add(next);
            }
        }
        this.f = f;
        this.f = (List<? extends DisplayableEntity>)v.h5((Iterable<?>)f, (Comparator<? super Object>)new com.untis.mobile.ui.adapters.search.c(this, e));
        this.notifyDataSetChanged();
    }
}
