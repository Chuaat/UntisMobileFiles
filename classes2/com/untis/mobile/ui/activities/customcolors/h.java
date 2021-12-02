// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.customcolors;

import android.app.Dialog;
import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.Comparator;
import kotlin.collections.v;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import org.koin.core.c$a;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import com.untis.mobile.persistence.models.EntityType;
import kotlinx.coroutines.b2;
import android.util.Log;
import kotlin.text.s;
import java.util.Objects;
import android.content.DialogInterface$OnClickListener;
import com.flask.colorpicker.e$c;
import android.widget.TextView;
import android.content.DialogInterface;
import android.widget.ImageButton;
import android.view.View;
import com.untis.mobile.analytics.base.b;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.b0;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.masterdata.a;
import java.util.ArrayList;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.masterdata.Subject;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010>\u001a\u00020=\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00108\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006A" }, d2 = { "Lcom/untis/mobile/ui/activities/customcolors/h;", "Landroid/widget/BaseAdapter;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "subject", "", "t", "s", "newTextColor", "Lkotlin/j2;", "x", "newBackgroundColor", "w", "getCount", "position", "k", "", "getItemId", "Landroid/view/View;", "contentView", "Landroid/view/ViewGroup;", "parent", "getView", "", "query", "u", "Lcom/untis/mobile/services/timetable/placeholder/k;", "L", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "", "H", "Ljava/util/List;", "subjects", "Ljava/util/ArrayList;", "J", "Ljava/util/ArrayList;", "filtered", "Lcom/untis/mobile/analytics/base/b;", "N", "Lkotlin/b0;", "j", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/services/masterdata/a;", "K", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/lockscreen/a;", "M", "l", "()Lcom/untis/mobile/lockscreen/a;", "lockScreen", "Landroid/view/LayoutInflater;", "I", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/persistence/models/profile/Profile;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends BaseAdapter implements c
{
    @e
    private final Context G;
    @e
    private final List<Subject> H;
    @e
    private final LayoutInflater I;
    @e
    private final ArrayList<Subject> J;
    @e
    private final a K;
    @e
    private final k L;
    @e
    private final b0 M;
    @e
    private final b0 N;
    
    public h(@e final Context g, @e final Profile profile, @e final List<Subject> h) {
        k0.p(g, "context");
        k0.p(profile, "profile");
        k0.p(h, "subjects");
        this.G = g;
        this.H = h;
        final LayoutInflater from = LayoutInflater.from(g);
        k0.o(from, "from(context)");
        this.I = from;
        this.J = new ArrayList<Subject>();
        this.M = d0.c((n6.a<?>)new n6.a<com.untis.mobile.lockscreen.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.lockscreen.a invoke() {
                return (com.untis.mobile.lockscreen.a)this.G.t(k1.d(com.untis.mobile.lockscreen.a.class), null, null);
            }
        });
        this.N = d0.c((n6.a<?>)new n6.a<b>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final b invoke() {
                return (b)this.G.t(k1.d(b.class), null, null);
            }
        });
        this.u("");
        this.K = profile.getMasterDataService();
        this.L = profile.getTimeTableService();
    }
    
    public static final /* synthetic */ a h(final h h) {
        return h.K;
    }
    
    public static final /* synthetic */ k i(final h h) {
        return h.L;
    }
    
    private final b j() {
        return this.N.getValue();
    }
    
    private final com.untis.mobile.lockscreen.a l() {
        return this.M.getValue();
    }
    
    private static final void m(final h h, final int n, final Subject subject, final View view, final ImageButton imageButton, final View view2) {
        k0.p(h, "this$0");
        k0.p(subject, "$subject");
        ((Dialog)com.flask.colorpicker.builder.b.B(h.G).u(2131886678).h(n).A(e$c.H).d(5).s(2131886660, (com.flask.colorpicker.builder.a)new com.untis.mobile.ui.activities.customcolors.e(subject, view, imageButton, h)).n(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.customcolors.a.G).c()).show();
    }
    
    private static final void n(final Subject subject, final View view, final ImageButton imageButton, final h h, final DialogInterface dialogInterface, final int colorFilter, final Integer[] array) {
        k0.p(subject, "$subject");
        k0.p(h, "this$0");
        subject.setCustomBackColor(colorFilter);
        view.setBackgroundColor(colorFilter);
        imageButton.setColorFilter(colorFilter);
        h.w(subject, colorFilter);
        h.j().c(com.untis.mobile.analytics.base.c.c.L);
    }
    
    private static final void o(final DialogInterface dialogInterface, final int n) {
    }
    
    private static final void p(final h h, final int n, final Subject subject, final TextView textView, final TextView textView2, final ImageButton imageButton, final View view) {
        k0.p(h, "this$0");
        k0.p(subject, "$subject");
        ((Dialog)com.flask.colorpicker.builder.b.B(h.G).u(2131886678).h(n).A(e$c.H).d(5).s(2131886660, (com.flask.colorpicker.builder.a)new f(subject, textView, textView2, imageButton, h)).n(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.customcolors.b.G).c()).show();
    }
    
    private static final void q(final Subject subject, final TextView textView, final TextView textView2, final ImageButton imageButton, final h h, final DialogInterface dialogInterface, final int n, final Integer[] array) {
        k0.p(subject, "$subject");
        k0.p(h, "this$0");
        subject.setCustomTextColor(n);
        textView.setTextColor(n);
        textView2.setTextColor(n);
        imageButton.setColorFilter(n);
        h.x(subject, n);
    }
    
    private static final void r(final DialogInterface dialogInterface, final int n) {
    }
    
    private final int s(final Subject subject) {
        int displayableBackColor = subject.getDisplayableBackColor();
        if (displayableBackColor == 0) {
            displayableBackColor = -1;
        }
        return displayableBackColor;
    }
    
    private final int t(final Subject subject) {
        int displayableTextColor = subject.getDisplayableTextColor();
        if (displayableTextColor == 0) {
            displayableTextColor = -12303292;
        }
        return displayableTextColor;
    }
    
    private static final int v(final String s, final Subject subject, final Subject subject2) {
        k0.p(s, "$filter");
        if (s.length() > 0) {
            final String name = subject.getName();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            final String lowerCase = name.toLowerCase();
            k0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            final boolean u2 = s.u2(lowerCase, s, false, 2, (Object)null);
            final String name2 = subject2.getName();
            Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
            final String lowerCase2 = name2.toLowerCase();
            k0.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
            final boolean u3 = s.u2(lowerCase2, s, false, 2, (Object)null);
            if (u2 && !u3) {
                return -1;
            }
            if (!u2 && u3) {
                return 1;
            }
        }
        return s.r1(subject.getName(), subject2.getName(), true);
    }
    
    private final void w(Subject u, final int n) {
        u = this.K.U(u.getId());
        if (u == null) {
            Log.e("untis_log", "subject == null");
            return;
        }
        kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ h H;
            final /* synthetic */ CustomEntityColor I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ h H = this.H;
                    final /* synthetic */ CustomEntityColor I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((h$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final com.untis.mobile.services.masterdata.a h2 = com.untis.mobile.ui.activities.customcolors.h.h(this.H);
                    final CustomEntityColor i = this.I;
                    this.G = 1;
                    if (h2.q(i, this) == h) {
                        return h;
                    }
                }
                final k j = com.untis.mobile.ui.activities.customcolors.h.i(this.H);
                final CustomEntityColor k = this.I;
                this.G = 2;
                if (j.u(k, this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 3, (Object)null);
        this.l().stop();
        this.l().start();
    }
    
    private final void x(Subject u, final int n) {
        u = this.K.U(u.getId());
        if (u == null) {
            Log.e("untis_log", "subject == null");
            return;
        }
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ h H;
            final /* synthetic */ CustomEntityColor I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ h H = this.H;
                    final /* synthetic */ CustomEntityColor I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((h$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final com.untis.mobile.services.masterdata.a h2 = com.untis.mobile.ui.activities.customcolors.h.h(this.H);
                    final CustomEntityColor i = this.I;
                    this.G = 1;
                    if (h2.q(i, this) == h) {
                        return h;
                    }
                }
                final k j = com.untis.mobile.ui.activities.customcolors.h.i(this.H);
                final CustomEntityColor k = this.I;
                this.G = 2;
                if (j.u(k, this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        this.l().stop();
        this.l().start();
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @org.jetbrains.annotations.f
    public View getView(int s, @org.jetbrains.annotations.f View viewById, @org.jetbrains.annotations.f final ViewGroup viewGroup) {
        View inflate = viewById;
        if (viewById == null) {
            inflate = this.I.inflate(2131493175, viewGroup, false);
        }
        if (inflate == null) {
            return null;
        }
        final Subject k = this.k(s);
        s = this.s(k);
        final int t = this.t(k);
        viewById = inflate.findViewById(2131297941);
        final TextView textView = (TextView)inflate.findViewById(2131297940);
        final TextView textView2 = (TextView)inflate.findViewById(2131297939);
        final ImageButton imageButton = (ImageButton)inflate.findViewById(2131297938);
        final ImageButton imageButton2 = (ImageButton)inflate.findViewById(2131297937);
        viewById.setBackgroundColor(s);
        textView.setTextColor(t);
        textView.setText((CharSequence)k.getName());
        if (s.K1(k.getDisplayName(), k.getName(), true)) {
            textView2.setVisibility(8);
        }
        else {
            textView2.setVisibility(0);
            textView2.setTextColor(t);
            textView2.setText((CharSequence)k.getDisplayName());
        }
        imageButton2.setColorFilter(s);
        imageButton.setColorFilter(t);
        imageButton2.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.customcolors.c(this, s, k, viewById, imageButton2));
        imageButton.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.customcolors.d(this, t, k, textView, textView2, imageButton));
        return inflate;
    }
    
    @e
    public Subject k(final int index) {
        final Subject value = this.J.get(index);
        k0.o(value, "filtered[position]");
        return value;
    }
    
    @SuppressLint({ "DefaultLocale" })
    public final void u(@org.jetbrains.annotations.f String lowerCase) {
        this.J.clear();
        for (final Subject e : this.H) {
            if (lowerCase != null && lowerCase.length() != 0) {
                final String displayName = e.getDisplayName();
                Objects.requireNonNull(displayName, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase2 = displayName.toLowerCase();
                k0.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
                final String lowerCase3 = lowerCase.toLowerCase();
                k0.o(lowerCase3, "(this as java.lang.String).toLowerCase()");
                if (!s.V2((CharSequence)lowerCase2, (CharSequence)lowerCase3, false, 2, (Object)null)) {
                    continue;
                }
            }
            this.J.add(e);
        }
        final String s = "";
        if (lowerCase == null) {
            lowerCase = s;
        }
        else {
            lowerCase = lowerCase.toLowerCase();
            k0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase == null) {
                lowerCase = s;
            }
        }
        v.p0(this.J, new com.untis.mobile.ui.activities.customcolors.g(lowerCase));
        this.notifyDataSetInvalidated();
    }
}
