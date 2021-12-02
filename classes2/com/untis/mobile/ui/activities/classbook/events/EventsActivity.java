// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.events;

import android.widget.TextView;
import android.widget.ImageButton;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import android.app.Dialog;
import android.app.Activity;
import android.view.MenuItem;
import android.annotation.SuppressLint;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import android.os.Bundle;
import kotlin.n1;
import kotlin.s0;
import com.untis.mobile.utils.g0;
import java.util.ArrayList;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import com.untis.mobile.persistence.models.masterdata.Student;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.d$a;
import android.util.Log;
import java.util.List;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.c;
import android.widget.RelativeLayout;
import com.untis.mobile.persistence.models.Displayable;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.jvm.internal.k0;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0015J\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\rH\u0014J\"\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0013R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010AR\u001d\u0010F\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/events/EventsActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "Q", "Lcom/untis/mobile/persistence/models/Displayable;", "D", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "A", "B", "S", "R", "F", "Landroid/os/Bundle;", "save", "onCreate", "", "writeAllowed", "I", "J", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onResume", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Lcom/untis/mobile/ui/activities/classbook/events/e;", "L", "Lcom/untis/mobile/ui/activities/classbook/events/e;", "adapter", "", "K", "entityId", "Lcom/untis/mobile/services/classbook/a;", "O", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/services/profile/legacy/a;", "P", "Lkotlin/b0;", "E", "()Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/services/masterdata/a;", "M", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/analytics/base/b;", "C", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/services/timetable/placeholder/k;", "N", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class EventsActivity extends com.untis.mobile.ui.activities.common.b
{
    @e
    public static final a R;
    @e
    private static final String S = "berlin";
    @e
    private static final String T = "koeln";
    @e
    private static final String U = "hamburg";
    @e
    private static final String V = "stuttgard";
    private Profile G;
    private Period H;
    private Classbook I;
    @e
    private EntityType J;
    private long K;
    private com.untis.mobile.ui.activities.classbook.events.e L;
    private com.untis.mobile.services.masterdata.a M;
    private k N;
    private com.untis.mobile.services.classbook.a O;
    @e
    private final b0 P;
    @e
    private final b0 Q;
    
    static {
        R = new a(null);
    }
    
    public EventsActivity() {
        this.J = EntityType.NONE;
        this.P = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.profile.legacy.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.services.profile.legacy.a invoke() {
                return (com.untis.mobile.services.profile.legacy.a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.services.profile.legacy.a.class), null, null);
            }
        });
        this.Q = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    private final void A(final Event event) {
        final Classbook i = this.I;
        if (i != null) {
            i.getEvents().remove(event);
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ EventsActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ EventsActivity H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((EventsActivity$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                        final com.untis.mobile.services.classbook.a y = EventsActivity.y(this.H);
                        if (y == null) {
                            k0.S("classBookService");
                            throw null;
                        }
                        final Classbook z = EventsActivity.z(this.H);
                        if (z == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (y.a0(z, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    private final void B(final Event event) {
        event.setSynced(false);
        event.setPeriodId(0L);
        h.h((g)null, (p)new p<r0, d<? super Event>, Object>() {
            int G;
            final /* synthetic */ EventsActivity H;
            final /* synthetic */ Event I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Event>, Object>() {
                    int G;
                    final /* synthetic */ EventsActivity H = this.H;
                    final /* synthetic */ Event I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Event> d) {
                return ((EventsActivity$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object q) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(q);
                }
                else {
                    c1.n(q);
                    final com.untis.mobile.services.classbook.a y = EventsActivity.y(this.H);
                    if (y == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final Event i = this.I;
                    this.G = 1;
                    if ((q = y.q(i, this)) == h) {
                        return h;
                    }
                }
                return q;
            }
        }, 1, (Object)null);
    }
    
    private final com.untis.mobile.analytics.base.b C() {
        return this.Q.getValue();
    }
    
    private final Displayable D() {
        final int n = b.a[this.J.ordinal()];
        Displayable displayable = null;
        if (n != 1) {
            if (n == 2) {
                final com.untis.mobile.services.masterdata.a m = this.M;
                if (m == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                displayable = m.V(this.K);
            }
        }
        else {
            final com.untis.mobile.services.masterdata.a i = this.M;
            if (i == null) {
                k0.S("masterDataService");
                throw null;
            }
            displayable = i.N(this.K);
        }
        return displayable;
    }
    
    private final com.untis.mobile.services.profile.legacy.a E() {
        return this.P.getValue();
    }
    
    private final void F() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(8);
    }
    
    private static final void G(final EventsActivity eventsActivity, final boolean b, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(eventsActivity, "this$0");
        final com.untis.mobile.ui.activities.classbook.events.e l = eventsActivity.L;
        if (l != null) {
            eventsActivity.I(l.g(n), b);
            return;
        }
        k0.S("adapter");
        throw null;
    }
    
    private static final void H(final EventsActivity eventsActivity, final View view) {
        k0.p(eventsActivity, "this$0");
        eventsActivity.Q();
    }
    
    private static final void K(final EventsActivity eventsActivity, final Event event, final List list) {
        k0.p(eventsActivity, "this$0");
        k0.p(event, "$event");
        eventsActivity.A(event);
        eventsActivity.S();
        eventsActivity.F();
        ((Activity)eventsActivity).setResult(-1);
    }
    
    private static final void L(final EventsActivity eventsActivity, final Event event, final Throwable t) {
        k0.p(eventsActivity, "this$0");
        k0.p(event, "$event");
        Log.e("untis_log", "could not delete event", t);
        eventsActivity.F();
        ((Dialog)new d$a((Context)eventsActivity, 2131951624).L(2131493062).r(2131886649, (DialogInterface$OnClickListener)f0.G).B(2131886653, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.d0(eventsActivity, event)).a()).show();
    }
    
    private static final void M(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void N(final EventsActivity eventsActivity, final Event event, final DialogInterface dialogInterface, final int n) {
        k0.p(eventsActivity, "this$0");
        k0.p(event, "$event");
        eventsActivity.B(event);
        eventsActivity.A(event);
        eventsActivity.S();
        dialogInterface.dismiss();
        ((Activity)eventsActivity).setResult(-1);
    }
    
    private static final void O(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void P(final EventsActivity eventsActivity, final Event event, final DialogInterface dialogInterface, final int n) {
        k0.p(eventsActivity, "this$0");
        k0.p(event, "$event");
        eventsActivity.B(event);
        eventsActivity.A(event);
        eventsActivity.S();
        dialogInterface.dismiss();
        ((Activity)eventsActivity).setResult(-1);
    }
    
    private final void Q() {
        Intent intent;
        if (this.J == EntityType.STUDENT) {
            final com.untis.mobile.services.masterdata.a m = this.M;
            if (m == null) {
                k0.S("masterDataService");
                throw null;
            }
            final Student v = m.V(this.K);
            final EventDetailActivity.a q = EventDetailActivity.Q;
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            final String uniqueId = g.getUniqueId();
            final Period h = this.H;
            if (h == null) {
                k0.S("period");
                throw null;
            }
            intent = q.b((Context)this, uniqueId, h, v);
        }
        else {
            final EventDetailActivity.a q2 = EventDetailActivity.Q;
            final Profile g2 = this.G;
            if (g2 == null) {
                k0.S("profile");
                throw null;
            }
            final String uniqueId2 = g2.getUniqueId();
            final Period h2 = this.H;
            if (h2 == null) {
                k0.S("period");
                throw null;
            }
            intent = EventDetailActivity.a.d(q2, (Context)this, uniqueId2, h2, null, 8, null);
        }
        ((ComponentActivity)this).startActivityForResult(intent, 1400);
    }
    
    private final void R() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(0);
    }
    
    private final void S() {
        final k n = this.N;
        if (n == null) {
            k0.S("timeTableService");
            throw null;
        }
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        Period h2;
        if ((h2 = n.l(h.getId())) == null) {
            h2 = this.H;
            if (h2 == null) {
                k0.S("period");
                throw null;
            }
        }
        this.H = h2;
        final com.untis.mobile.services.classbook.a o = this.O;
        if (o == null) {
            k0.S("classBookService");
            throw null;
        }
        Classbook i;
        if ((i = o.S(h2.getId())) == null) {
            i = this.I;
            if (i == null) {
                k0.S("classbook");
                throw null;
            }
        }
        this.I = i;
        final com.untis.mobile.ui.activities.classbook.events.e l = this.L;
        if (l == null) {
            k0.S("adapter");
            throw null;
        }
        l.p();
        final ConstraintLayout constraintLayout = (ConstraintLayout)this.findViewById(c.i.TD);
        final Classbook j = this.I;
        if (j != null) {
            ((ViewGroup)constraintLayout).setVisibility(com.untis.mobile.utils.extension.h.U(j.getEvents().isEmpty(), 0, 1, null));
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a y(final EventsActivity eventsActivity) {
        return eventsActivity.O;
    }
    
    public static final /* synthetic */ Classbook z(final EventsActivity eventsActivity) {
        return eventsActivity.I;
    }
    
    public final void I(@e final Event event, final boolean b) {
        k0.p(event, "event");
        final EventDetailActivity.a q = EventDetailActivity.Q;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final Period h = this.H;
        if (h != null) {
            ((ComponentActivity)this).startActivityForResult(q.a((Context)this, uniqueId, h.getId(), event, new ArrayList<Long>(), b ^ true), 1400);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    public final void J(@e final Event event) {
        k0.p(event, "event");
        event.setPeriodId(0L);
        event.setSynced(false);
        if (g0.a((Context)this)) {
            this.C().c(com.untis.mobile.analytics.base.c.e.P);
        }
        else {
            this.C().d(com.untis.mobile.analytics.base.c.e.P, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
        }
        if (g0.a((Context)this)) {
            this.R();
            final com.untis.mobile.services.classbook.a o = this.O;
            if (o == null) {
                k0.S("classBookService");
                throw null;
            }
            com.untis.mobile.services.classbook.a.a.j(o, event, null, 2, null).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.events.k0(this, event), (rx.functions.b)new j0(this, event));
        }
        else {
            ((Dialog)new d$a((Context)this, 2131951624).L(2131493038).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.classbook.events.g0.G).B(2131886653, (DialogInterface$OnClickListener)new e0(this, event)).a()).show();
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @org.jetbrains.annotations.f final Intent intent) {
        final boolean b = n2 == -1;
        if (b) {
            ((Activity)this).setResult(-1);
        }
        if (n == 1400) {
            if (b) {
                this.S();
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @SuppressLint({ "RestrictedApi" })
    @Override
    protected void onCreate(@org.jetbrains.annotations.f Bundle extras) {
        super.onCreate(extras);
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        final String s = "";
        String string;
        if (extras2 == null || (string = extras2.getString("berlin", "")) == null) {
            string = "";
        }
        Profile g;
        if ((g = this.E().l(string)) == null) {
            g = this.E().n();
            if (g == null) {
                throw new IllegalStateException("invalid profile");
            }
        }
        this.G = g;
        this.M = g.getMasterDataService();
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        this.N = g2.getTimeTableService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.O = g3.getClassBookService();
        Bundle extras3;
        if (extras == null) {
            extras3 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras3 = extras;
        }
        final long n = 0L;
        long long1;
        if (extras3 == null) {
            long1 = 0L;
        }
        else {
            long1 = extras3.getLong("koeln");
        }
        final k n2 = this.N;
        if (n2 == null) {
            k0.S("timeTableService");
            throw null;
        }
        Period l;
        if ((l = n2.l(long1)) == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = l;
        final com.untis.mobile.services.classbook.a o = this.O;
        if (o == null) {
            k0.S("classBookService");
            throw null;
        }
        Classbook s2;
        if ((s2 = o.S(long1)) == null) {
            s2 = new Classbook(long1, null, null, null, null, null, null, false, false, null, 1022, null);
        }
        this.I = s2;
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        final boolean contains = h.getRights().contains(PeriodRight.WRITE_CLASSREGEVENT);
        final EntityType.Companion companion = EntityType.Companion;
        Bundle extras4;
        if (extras == null) {
            extras4 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras4 = extras;
        }
        Integer value;
        if (extras4 == null) {
            value = null;
        }
        else {
            value = extras4.getInt("hamburg", EntityType.NONE.getWebuntisId());
        }
        this.J = companion.findBy(value);
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        long long2;
        if (extras == null) {
            long2 = n;
        }
        else {
            long2 = extras.getLong("stuttgard");
        }
        this.K = long2;
        this.setContentView(2131492915);
        final Profile g4 = this.G;
        if (g4 == null) {
            k0.S("profile");
            throw null;
        }
        final Period h2 = this.H;
        if (h2 == null) {
            k0.S("period");
            throw null;
        }
        final Classbook i = this.I;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        this.L = new com.untis.mobile.ui.activities.classbook.events.e(this, g4, h2, i, this.J, this.K, false, 64, null);
        final int r5 = c.i.r5;
        final ListView listView = (ListView)this.findViewById(r5);
        final com.untis.mobile.ui.activities.classbook.events.e j = this.L;
        if (j == null) {
            k0.S("adapter");
            throw null;
        }
        listView.setAdapter((ListAdapter)j);
        ((ListView)this.findViewById(r5)).setOnItemClickListener((AdapterView$OnItemClickListener)new i0(this, contains));
        final int q5 = c.i.q5;
        final FloatingActionButton floatingActionButton = (FloatingActionButton)this.findViewById(q5);
        final com.untis.mobile.services.a a = com.untis.mobile.services.a.a;
        final Period h3 = this.H;
        if (h3 == null) {
            k0.S("period");
            throw null;
        }
        int visibility;
        if (a.p(h3)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        floatingActionButton.setVisibility(visibility);
        ((ImageButton)this.findViewById(q5)).setOnClickListener((View$OnClickListener)new h0(this));
        ((FloatingActionButton)this.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i((Context)this, 2131231094));
        ((TextView)this.findViewById(c.i.VD)).setText(2131886211);
        ((TextView)this.findViewById(c.i.UD)).setText(2131886750);
        final ConstraintLayout constraintLayout = (ConstraintLayout)this.findViewById(c.i.TD);
        final Classbook k = this.I;
        if (k != null) {
            ((ViewGroup)constraintLayout).setVisibility(com.untis.mobile.utils.extension.h.U(k.getEvents().isEmpty(), 0, 1, null));
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.z0(2131886214);
            }
            final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
            if (supportActionBar2 != null) {
                final Displayable d = this.D();
                String displayableTitle;
                if (d == null) {
                    displayableTitle = s;
                }
                else {
                    displayableTitle = d.getDisplayableTitle();
                    if (displayableTitle == null) {
                        displayableTitle = s;
                    }
                }
                supportActionBar2.y0((CharSequence)displayableTitle);
            }
            final androidx.appcompat.app.a supportActionBar3 = this.getSupportActionBar();
            if (supportActionBar3 != null) {
                supportActionBar3.Y(true);
            }
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        com.untis.mobile.ui.activities.common.b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("berlin", g.getUniqueId());
        final Period h = this.H;
        if (h != null) {
            bundle.putLong("koeln", h.getId());
            bundle.putInt("hamburg", this.J.getWebuntisId());
            bundle.putLong("stuttgard", this.K);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014" }, d2 = { "com/untis/mobile/ui/activities/classbook/events/EventsActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "periodId", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Landroid/content/Intent;", "b", "a", "BUNDLE_ENTITY_ID", "Ljava/lang/String;", "BUNDLE_ENTITY_TYPE", "BUNDLE_PERIOD_ID", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)EventsActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("berlin", s);
            bundle.putLong("koeln", n);
            intent.putExtras(bundle);
            return intent;
        }
        
        @e
        public final Intent b(@e final Context context, @e final String s, final long n, @e final Student student) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(student, "student");
            final Intent intent = new Intent(context, (Class)EventsActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("berlin", s);
            bundle.putLong("koeln", n);
            bundle.putInt("hamburg", EntityType.STUDENT.getWebuntisId());
            bundle.putLong("stuttgard", student.getId());
            intent.putExtras(bundle);
            return intent;
        }
    }
}
