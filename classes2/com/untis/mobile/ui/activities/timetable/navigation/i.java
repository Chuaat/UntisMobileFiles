// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable.navigation;

import android.widget.TextView;
import android.widget.ImageView;
import java.util.Collection;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import kotlinx.coroutines.h;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.untis.mobile.persistence.models.Displayable;
import android.graphics.drawable.Drawable;
import android.content.DialogInterface;
import android.view.View;
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
import org.jetbrains.annotations.e;
import com.untis.mobile.ui.activities.timetable.v;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00107\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0014\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017R\u001e\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00103R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010*¨\u0006:" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/navigation/i;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lkotlin/j2;", "j", "m", "Landroid/graphics/drawable/Drawable;", "e", "", "h", "g", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "f", "", "getItemId", "getCount", "", "histories", "n", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "J", "Landroid/view/LayoutInflater;", "inflater", "H", "Ljava/util/List;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "N", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/services/masterdata/a;", "O", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "M", "I", "colorIcon", "Lcom/untis/mobile/ui/activities/timetable/v;", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "L", "colorHighlighted", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/ui/activities/common/b;", "activity", "K", "colorDefault", "profileId", "<init>", "(Lcom/untis/mobile/ui/activities/timetable/v;Ljava/lang/String;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i extends BaseAdapter
{
    @e
    private final v G;
    @e
    private final List<TimeTableEntity> H;
    @e
    private final b I;
    private final LayoutInflater J;
    private final int K;
    private final int L;
    private final int M;
    @e
    private final k N;
    @e
    private final com.untis.mobile.services.masterdata.a O;
    
    public i(@e final v g, @e final String s, @e final List<TimeTableEntity> h) {
        k0.p(g, "timeTableActivityService");
        k0.p(s, "profileId");
        k0.p(h, "histories");
        this.G = g;
        this.H = h;
        final b w0 = g.W0();
        this.I = w0;
        this.J = LayoutInflater.from((Context)w0);
        this.K = d.f((Context)w0, 2131099995);
        this.L = d.f((Context)w0, 2131099677);
        this.M = d.f((Context)w0, 2131099992);
        this.N = p.Y.a(s);
        this.O = com.untis.mobile.services.masterdata.b.Z.a(s);
    }
    
    public static final /* synthetic */ k d(final i i) {
        return i.N;
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
                            displayable = this.O.V(timeTableEntity.getEntityId());
                        }
                    }
                    else {
                        displayable = this.O.P(timeTableEntity.getEntityId());
                    }
                }
                else {
                    displayable = this.O.U(timeTableEntity.getEntityId());
                }
            }
            else {
                displayable = this.O.N(timeTableEntity.getEntityId());
            }
        }
        else {
            displayable = this.O.k(timeTableEntity.getEntityId());
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
        synchronized (this) {
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
                                displayable = this.O.V(timeTableEntity.getEntityId());
                            }
                        }
                        else {
                            displayable = this.O.P(timeTableEntity.getEntityId());
                        }
                    }
                    else {
                        displayable = this.O.U(timeTableEntity.getEntityId());
                    }
                }
                else {
                    displayable = this.O.N(timeTableEntity.getEntityId());
                }
            }
            else {
                displayable = this.O.k(timeTableEntity.getEntityId());
            }
            String displayableTitle;
            if (displayable == null || (displayableTitle = displayable.getDisplayableTitle()) == null) {
                displayableTitle = "";
            }
            return displayableTitle;
        }
    }
    
    private static final void i(final i i, final TimeTableEntity timeTableEntity, final View view) {
        k0.p(i, "this$0");
        k0.p(timeTableEntity, "$timeTableEntity");
        i.j(timeTableEntity);
    }
    
    private final void j(final TimeTableEntity timeTableEntity) {
        new AlertDialog$Builder((Context)this.G.W0()).setMessage(2131886855).setPositiveButton(2131886653, (DialogInterface$OnClickListener)new f(this, timeTableEntity)).setNegativeButton(2131886649, (DialogInterface$OnClickListener)g.G).create().show();
    }
    
    private static final void k(final i i, final TimeTableEntity timeTableEntity, final DialogInterface dialogInterface, final int n) {
        k0.p(i, "this$0");
        k0.p(timeTableEntity, "$timeTableEntity");
        i.m(timeTableEntity);
    }
    
    private static final void l(final DialogInterface dialogInterface, final int n) {
    }
    
    private final void m(final TimeTableEntity timeTableEntity) {
        h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ i H;
            final /* synthetic */ TimeTableEntity I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ i H = this.H;
                    final /* synthetic */ TimeTableEntity I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((i$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                    final k d = i.d(this.H);
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
    
    @e
    public TimeTableEntity f(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int n, @org.jetbrains.annotations.f final View view, @org.jetbrains.annotations.f final ViewGroup viewGroup) {
        final TimeTableEntity f = this.f(n);
        final int n2 = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.J.inflate(2131493230, viewGroup, false);
        }
        final EntityType entityType = this.G.k1().getEntityType();
        final EntityType entityType2 = f.getEntityType();
        final int n3 = 1;
        if (entityType == entityType2 && this.G.k1().getEntityId() == f.getEntityId()) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int xa = c.i.xA;
        ((AppCompatImageView)inflate.findViewById(xa)).setImageDrawable(this.e(f));
        final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(xa);
        int colorFilter;
        if (n != 0) {
            colorFilter = this.L;
        }
        else {
            colorFilter = this.M;
        }
        ((ImageView)appCompatImageView).setColorFilter(colorFilter);
        final int za = c.i.zA;
        ((TextView)inflate.findViewById(za)).setText((CharSequence)this.h(f));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(za);
        if (n != 0) {
            n = this.L;
        }
        else {
            n = this.K;
        }
        ((TextView)appCompatTextView).setTextColor(n);
        final int ya = c.i.yA;
        ((TextView)inflate.findViewById(ya)).setText((CharSequence)this.g(f));
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)inflate.findViewById(ya);
        final CharSequence text = ((AppCompatTextView)inflate.findViewById(ya)).getText();
        k0.o(text, "view.item_navigation_history_subtitle.text");
        if (text.length() > 0) {
            n = n3;
        }
        else {
            n = 0;
        }
        if (n != 0 && !k0.g(((AppCompatTextView)inflate.findViewById(ya)).getText(), ((AppCompatTextView)inflate.findViewById(za)).getText())) {
            n = n2;
        }
        else {
            n = 8;
        }
        ((TextView)appCompatTextView2).setVisibility(n);
        ((ImageView)inflate.findViewById(c.i.wA)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.navigation.h(this, f));
        k0.o(inflate, "view");
        return inflate;
    }
    
    public final void n(@e final List<TimeTableEntity> list) {
        k0.p(list, "histories");
        this.H.clear();
        this.H.addAll(list);
        this.notifyDataSetChanged();
    }
}
