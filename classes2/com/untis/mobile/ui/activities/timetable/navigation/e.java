// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable.navigation;

import android.widget.ImageView;
import java.util.Collection;
import android.view.View$OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.untis.mobile.persistence.models.Displayable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.DialogInterface;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.timetable.placeholder.p;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.services.timetable.placeholder.k;
import android.view.LayoutInflater;
import com.untis.mobile.ui.activities.common.b;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import java.util.List;
import com.untis.mobile.ui.activities.timetable.v;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000209¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0014\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010/\u001a\n ,*\u0004\u0018\u00010+0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001bR\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/navigation/e;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lkotlin/j2;", "j", "m", "Landroid/graphics/drawable/Drawable;", "e", "", "h", "g", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "f", "", "getItemId", "getCount", "", "favorites", "n", "O", "I", "colorIconLight", "Lcom/untis/mobile/services/timetable/placeholder/k;", "P", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "N", "colorIcon", "M", "colorHighlightedLight", "K", "colorDefault", "Lcom/untis/mobile/services/masterdata/a;", "Q", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "J", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/ui/activities/common/b;", "activity", "L", "colorHighlighted", "Lcom/untis/mobile/ui/activities/timetable/v;", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "", "H", "Ljava/util/List;", "profileId", "<init>", "(Lcom/untis/mobile/ui/activities/timetable/v;Ljava/lang/String;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e extends BaseAdapter
{
    @org.jetbrains.annotations.e
    private final v G;
    @org.jetbrains.annotations.e
    private final List<TimeTableEntity> H;
    @org.jetbrains.annotations.e
    private final b I;
    private final LayoutInflater J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    @org.jetbrains.annotations.e
    private final k P;
    @org.jetbrains.annotations.e
    private final com.untis.mobile.services.masterdata.a Q;
    
    public e(@org.jetbrains.annotations.e final v g, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final List<TimeTableEntity> h) {
        k0.p(g, "timeTableActivityService");
        k0.p(s, "profileId");
        k0.p(h, "favorites");
        this.G = g;
        this.H = h;
        final b w0 = g.W0();
        this.I = w0;
        this.J = LayoutInflater.from((Context)w0);
        this.K = d.f((Context)w0, 2131099995);
        this.L = d.f((Context)w0, 2131099677);
        this.M = d.f((Context)w0, 2131099685);
        this.N = d.f((Context)w0, 2131099992);
        this.O = d.f((Context)w0, 2131099993);
        this.P = p.Y.a(s);
        this.Q = com.untis.mobile.services.masterdata.b.Z.a(s);
    }
    
    public static final /* synthetic */ k d(final e e) {
        return e.P;
    }
    
    private final Drawable e(final TimeTableEntity timeTableEntity) {
        final int n = a.a[timeTableEntity.getEntityType().ordinal()];
        b b;
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            b = this.I;
                            n2 = 2131230884;
                        }
                        else {
                            b = this.I;
                            n2 = 2131231089;
                        }
                    }
                    else {
                        b = this.I;
                        n2 = 2131231146;
                    }
                }
                else {
                    b = this.I;
                    n2 = 2131231156;
                }
            }
            else {
                b = this.I;
                n2 = 2131231091;
            }
        }
        else {
            b = this.I;
            n2 = 2131231159;
        }
        return d.i((Context)b, n2);
    }
    
    private final String g(final TimeTableEntity timeTableEntity) {
        final int n = a.a[timeTableEntity.getEntityType().ordinal()];
        Displayable displayable;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            displayable = null;
                        }
                        else {
                            displayable = this.Q.V(timeTableEntity.getEntityId());
                        }
                    }
                    else {
                        displayable = this.Q.P(timeTableEntity.getEntityId());
                    }
                }
                else {
                    displayable = this.Q.U(timeTableEntity.getEntityId());
                }
            }
            else {
                displayable = this.Q.N(timeTableEntity.getEntityId());
            }
        }
        else {
            displayable = this.Q.k(timeTableEntity.getEntityId());
        }
        final String s = "";
        String displayableDescription;
        if (displayable == null) {
            displayableDescription = s;
        }
        else {
            displayableDescription = displayable.getDisplayableDescription();
            if (displayableDescription == null) {
                displayableDescription = s;
            }
        }
        return displayableDescription;
    }
    
    private final String h(final TimeTableEntity timeTableEntity) {
        final int n = a.a[timeTableEntity.getEntityType().ordinal()];
        Displayable displayable;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            displayable = null;
                        }
                        else {
                            displayable = this.Q.V(timeTableEntity.getEntityId());
                        }
                    }
                    else {
                        displayable = this.Q.P(timeTableEntity.getEntityId());
                    }
                }
                else {
                    displayable = this.Q.U(timeTableEntity.getEntityId());
                }
            }
            else {
                displayable = this.Q.N(timeTableEntity.getEntityId());
            }
        }
        else {
            displayable = this.Q.k(timeTableEntity.getEntityId());
        }
        final String s = "";
        String displayableTitle;
        if (displayable == null) {
            displayableTitle = s;
        }
        else {
            displayableTitle = displayable.getDisplayableTitle();
            if (displayableTitle == null) {
                displayableTitle = s;
            }
        }
        return displayableTitle;
    }
    
    private static final void i(final e e, final TimeTableEntity timeTableEntity, final View view) {
        k0.p(e, "this$0");
        k0.p(timeTableEntity, "$timeTableEntity");
        e.j(timeTableEntity);
    }
    
    private final void j(final TimeTableEntity timeTableEntity) {
        new AlertDialog$Builder((Context)this.G.W0()).setMessage(2131886855).setPositiveButton(2131886653, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.timetable.navigation.b(this, timeTableEntity)).setNegativeButton(2131886649, (DialogInterface$OnClickListener)c.G).create().show();
    }
    
    private static final void k(final e e, final TimeTableEntity timeTableEntity, final DialogInterface dialogInterface, final int n) {
        k0.p(e, "this$0");
        k0.p(timeTableEntity, "$timeTableEntity");
        e.m(timeTableEntity);
    }
    
    private static final void l(final DialogInterface dialogInterface, final int n) {
    }
    
    private final void m(final TimeTableEntity timeTableEntity) {
        h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ e H;
            final /* synthetic */ TimeTableEntity I;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ e H = this.H;
                    final /* synthetic */ TimeTableEntity I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((e$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final k d = e.d(this.H);
                    final EntityType entityType = this.I.getEntityType();
                    final long entityId = this.I.getEntityId();
                    this.G = 1;
                    if (d.c(entityType, entityId, false, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        this.G.x2();
    }
    
    @org.jetbrains.annotations.e
    public TimeTableEntity f(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @org.jetbrains.annotations.e
    public View getView(int colorFilter, @org.jetbrains.annotations.f final View view, @org.jetbrains.annotations.f final ViewGroup viewGroup) {
        final TimeTableEntity f = this.f(colorFilter);
        final EntityType entityType = this.G.k1().getEntityType();
        final EntityType entityType2 = f.getEntityType();
        boolean b = true;
        final int n = 0;
        if (entityType == entityType2 && this.G.k1().getEntityId() == f.getEntityId()) {
            colorFilter = 1;
        }
        else {
            colorFilter = 0;
        }
        View inflate = view;
        if (view == null) {
            inflate = this.J.inflate(2131493229, viewGroup, false);
        }
        final int sa = com.untis.mobile.c.i.sA;
        ((AppCompatImageView)inflate.findViewById(sa)).setImageDrawable(this.e(f));
        final int va = com.untis.mobile.c.i.vA;
        ((TextView)inflate.findViewById(va)).setText((CharSequence)this.h(f));
        final int ua = com.untis.mobile.c.i.uA;
        ((TextView)inflate.findViewById(ua)).setText((CharSequence)this.g(f));
        final TextView textView = (TextView)inflate.findViewById(ua);
        final CharSequence text = ((TextView)inflate.findViewById(ua)).getText();
        k0.o(text, "view.item_navigation_favorite_subtitle.text");
        if (text.length() <= 0) {
            b = false;
        }
        int visibility;
        if (b) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        textView.setVisibility(visibility);
        final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(sa);
        AppCompatImageView appCompatImageView2;
        if (colorFilter != 0) {
            ((ImageView)appCompatImageView).setColorFilter(this.L);
            ((TextView)inflate.findViewById(va)).setTextColor(this.L);
            appCompatImageView2 = (AppCompatImageView)inflate.findViewById(com.untis.mobile.c.i.tA);
            colorFilter = this.M;
        }
        else {
            ((ImageView)appCompatImageView).setColorFilter(this.N);
            ((TextView)inflate.findViewById(va)).setTextColor(this.K);
            appCompatImageView2 = (AppCompatImageView)inflate.findViewById(com.untis.mobile.c.i.tA);
            colorFilter = this.O;
        }
        ((ImageView)appCompatImageView2).setColorFilter(colorFilter);
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.rA)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.navigation.d(this, f));
        k0.o(inflate, "view");
        return inflate;
    }
    
    public final void n(@org.jetbrains.annotations.e final List<TimeTableEntity> list) {
        k0.p(list, "favorites");
        this.H.clear();
        this.H.addAll(list);
        this.notifyDataSetChanged();
    }
}
