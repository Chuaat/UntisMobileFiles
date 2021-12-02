// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.events;

import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatEditText;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import android.app.Dialog;
import android.app.Activity;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.Menu;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Set;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import java.util.Collection;
import android.util.Log;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import kotlin.n1;
import kotlin.s0;
import android.content.Context;
import com.untis.mobile.utils.g0;
import com.untis.mobile.c;
import android.widget.RelativeLayout;
import java.util.Iterator;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.Displayable;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.jvm.internal.k0;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import java.util.List;
import android.view.View;
import android.content.DialogInterface;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.services.masterdata.a;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 P2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0003J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0013\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H\u0002J\u0016\u0010\u0014\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u0012\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u001bH\u0014J\"\u0010-\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0014R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR&\u0010F\u001a\u0012\u0012\u0004\u0012\u0002020Cj\b\u0012\u0004\u0012\u000202`D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010HR\u001d\u0010M\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\b5\u0010L¨\u0006R" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/events/EventDetailActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "s0", "r0", "", "Lcom/untis/mobile/persistence/models/Displayable;", "M", "", "N", "n0", "X", "W", "Y", "b0", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "J", "events", "l0", "j0", "i0", "K", "k0", "m0", "O", "P", "Landroid/os/Bundle;", "save", "onCreate", "onResume", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "groupId", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "L", "Z", "readOnly", "Lcom/untis/mobile/services/classbook/a;", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "entityIds", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/analytics/base/b;", "Lkotlin/b0;", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "<init>", "()V", "Q", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class EventDetailActivity extends com.untis.mobile.ui.activities.common.b
{
    @e
    public static final a Q;
    @e
    private static final String R = "wien";
    @e
    private static final String S = "eisenstadt";
    @e
    private static final String T = "innsbruck";
    @e
    private static final String U = "graz";
    @e
    private static final String V = "bregenz";
    private Profile G;
    @f
    private Period H;
    @f
    private Classbook I;
    private Event J;
    private long K;
    private boolean L;
    @e
    private final ArrayList<Long> M;
    private com.untis.mobile.services.masterdata.a N;
    private com.untis.mobile.services.classbook.a O;
    @e
    private final b0 P;
    
    static {
        Q = new a(null);
    }
    
    public EventDetailActivity() {
        this.L = true;
        this.M = new ArrayList<Long>();
        this.P = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a H(final EventDetailActivity eventDetailActivity) {
        return eventDetailActivity.O;
    }
    
    public static final /* synthetic */ Event I(final EventDetailActivity eventDetailActivity) {
        return eventDetailActivity.J;
    }
    
    private final void J(final Event event) {
        final Classbook i = this.I;
        if (i == null) {
            return;
        }
        i.getEvents().remove(event);
        h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ EventDetailActivity H;
            final /* synthetic */ Classbook I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ EventDetailActivity H = this.H;
                    final /* synthetic */ Classbook I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((EventDetailActivity$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
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
                    final com.untis.mobile.services.classbook.a h2 = EventDetailActivity.H(this.H);
                    if (h2 == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final Classbook i = this.I;
                    this.G = 1;
                    if (h2.a0(i, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    private final void K(final Event event) {
        event.setSynced(false);
        event.setPeriodId(0L);
        h.h((g)null, (p)new p<r0, d<? super Event>, Object>() {
            int G;
            final /* synthetic */ EventDetailActivity H;
            final /* synthetic */ Event I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Event>, Object>() {
                    int G;
                    final /* synthetic */ EventDetailActivity H = this.H;
                    final /* synthetic */ Event I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super Event> d) {
                return ((EventDetailActivity$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
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
                    final com.untis.mobile.services.classbook.a h2 = EventDetailActivity.H(this.H);
                    if (h2 == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final Event i = this.I;
                    this.G = 1;
                    if ((q = h2.q(i, this)) == h) {
                        return h;
                    }
                }
                return q;
            }
        }, 1, (Object)null);
    }
    
    private final com.untis.mobile.analytics.base.b L() {
        return this.P.getValue();
    }
    
    private final List<Displayable> M() {
        final ArrayList<Klasse> list = (ArrayList<Klasse>)new ArrayList<Displayable>();
        final Event j = this.J;
        if (j == null) {
            k0.S("event");
            throw null;
        }
        if (j.getEntityType() == EntityType.CLASS) {
            final com.untis.mobile.services.masterdata.a n = this.N;
            if (n == null) {
                k0.S("masterDataService");
                throw null;
            }
            final Event i = this.J;
            if (i == null) {
                k0.S("event");
                throw null;
            }
            final Klasse n2 = n.N(i.getEntityId());
            if (n2 != null) {
                list.add(n2);
            }
            final ArrayList<Long> m = this.M;
            final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
            final Iterator<Number> iterator = m.iterator();
            while (iterator.hasNext()) {
                final long longValue = iterator.next().longValue();
                final com.untis.mobile.services.masterdata.a n3 = this.N;
                if (n3 == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final Klasse n4 = n3.N(longValue);
                if (n4 == null) {
                    continue;
                }
                list2.add(n4);
            }
            final Iterator<Object> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list.add(iterator2.next());
            }
        }
        final Event k = this.J;
        if (k != null) {
            if (k.getEntityType() == EntityType.STUDENT) {
                final com.untis.mobile.services.masterdata.a n5 = this.N;
                if (n5 == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final Event l = this.J;
                if (l == null) {
                    k0.S("event");
                    throw null;
                }
                final Student v = n5.V(l.getEntityId());
                if (v != null) {
                    list.add((Klasse)v);
                }
                final ArrayList<Long> m2 = this.M;
                final ArrayList<Student> list3 = new ArrayList<Student>();
                final Iterator<Number> iterator3 = m2.iterator();
                while (iterator3.hasNext()) {
                    final long longValue2 = iterator3.next().longValue();
                    final com.untis.mobile.services.masterdata.a n6 = this.N;
                    if (n6 == null) {
                        k0.S("masterDataService");
                        throw null;
                    }
                    final Student v2 = n6.V(longValue2);
                    if (v2 == null) {
                        continue;
                    }
                    list3.add(v2);
                }
                final Iterator<Object> iterator4 = list3.iterator();
                while (iterator4.hasNext()) {
                    list.add((Klasse)iterator4.next());
                }
            }
            return (List<Displayable>)list;
        }
        k0.S("event");
        throw null;
    }
    
    private final String N() {
        final Event j = this.J;
        if (j != null) {
            final int n = b.a[j.getEntityType().ordinal()];
            String string = null;
            Label_0057: {
                int n2;
                if (n != 1) {
                    if (n != 2) {
                        string = "";
                        break Label_0057;
                    }
                    n2 = 2131886810;
                }
                else {
                    n2 = 2131886680;
                }
                string = ((Activity)this).getString(n2);
            }
            k0.o(string, "when (event.entityType) {\n        EntityType.CLASS -> getString(R.string.shared_classes_text)\n        EntityType.STUDENT -> getString(R.string.students_title)\n        else -> \"\"\n    }");
            return string;
        }
        k0.S("event");
        throw null;
    }
    
    private final void O() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(8);
    }
    
    private final void P() {
        final Event j = this.J;
        if (j == null) {
            k0.S("event");
            throw null;
        }
        j.setSynced(false);
        final Event i = this.J;
        if (i != null) {
            i.setPeriodId(0L);
            if (g0.a((Context)this)) {
                this.L().c(com.untis.mobile.analytics.base.c.e.P);
            }
            else {
                this.L().d(com.untis.mobile.analytics.base.c.e.P, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
            }
            if (g0.a((Context)this)) {
                this.m0();
                final com.untis.mobile.services.classbook.a o = this.O;
                if (o == null) {
                    k0.S("classBookService");
                    throw null;
                }
                final Event k = this.J;
                if (k == null) {
                    k0.S("event");
                    throw null;
                }
                com.untis.mobile.services.classbook.a.a.j(o, k, null, 2, null).C5((rx.functions.b)new k(this), (rx.functions.b)new j(this));
            }
            else {
                ((Dialog)new d$a((Context)this, 2131951624).L(2131493038).r(2131886649, (DialogInterface$OnClickListener)v.G).B(2131886653, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.o(this)).a()).show();
            }
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private static final void Q(final EventDetailActivity eventDetailActivity, final List list) {
        k0.p(eventDetailActivity, "this$0");
        final Event j = eventDetailActivity.J;
        if (j != null) {
            eventDetailActivity.J(j);
            eventDetailActivity.O();
            ((Activity)eventDetailActivity).setResult(-1);
            ((Activity)eventDetailActivity).finish();
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private static final void R(final EventDetailActivity eventDetailActivity, final Throwable t) {
        k0.p(eventDetailActivity, "this$0");
        Log.e("untis_log", "could not deleteFromPeriod event", t);
        eventDetailActivity.O();
        ((Dialog)new d$a((Context)eventDetailActivity, 2131951624).L(2131493062).r(2131886649, (DialogInterface$OnClickListener)r.G).B(2131886653, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.f(eventDetailActivity)).a()).show();
    }
    
    private static final void S(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void T(final EventDetailActivity eventDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(eventDetailActivity, "this$0");
        final Event j = eventDetailActivity.J;
        if (j == null) {
            k0.S("event");
            throw null;
        }
        eventDetailActivity.K(j);
        final Event i = eventDetailActivity.J;
        if (i != null) {
            eventDetailActivity.J(i);
            dialogInterface.dismiss();
            ((Activity)eventDetailActivity).setResult(-1);
            ((Activity)eventDetailActivity).finish();
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private static final void U(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void V(final EventDetailActivity eventDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(eventDetailActivity, "this$0");
        final Event j = eventDetailActivity.J;
        if (j == null) {
            k0.S("event");
            throw null;
        }
        eventDetailActivity.K(j);
        final Event i = eventDetailActivity.J;
        if (i != null) {
            eventDetailActivity.J(i);
            dialogInterface.dismiss();
            ((Activity)eventDetailActivity).setResult(-1);
            ((Activity)eventDetailActivity).finish();
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private final void W() {
        final EventReasonGroupActivity.a j = EventReasonGroupActivity.J;
        final Profile g = this.G;
        if (g != null) {
            ((ComponentActivity)this).startActivityForResult(j.a((Context)this, g.getUniqueId(), this.K), 1401);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void X() {
        final EventReasonActivity.a k = EventReasonActivity.K;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final Event j = this.J;
        if (j != null) {
            ((ComponentActivity)this).startActivityForResult(k.b((Context)this, uniqueId, j, this.K), 1402);
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private final void Y() {
        this.b0();
    }
    
    private static final void Z(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void a0(final EventDetailActivity eventDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(eventDetailActivity, "this$0");
        eventDetailActivity.P();
        dialogInterface.dismiss();
    }
    
    @SuppressLint({ "InflateParams" })
    private final void b0() {
        final Period h = this.H;
        if (h == null) {
            return;
        }
        if (g0.a((Context)this)) {
            this.m0();
            final ArrayList<Long> list = new ArrayList<Long>();
            if (this.M.isEmpty() ^ true) {
                list.addAll(this.M);
            }
            final com.untis.mobile.services.classbook.a o = this.O;
            if (o == null) {
                k0.S("classBookService");
                throw null;
            }
            final Event j = this.J;
            if (j == null) {
                k0.S("event");
                throw null;
            }
            o.r(j, list).C5((rx.functions.b)new l(this), (rx.functions.b)new m(this, h));
        }
        else {
            new d$a((Context)this, 2131951624).L(2131493060).r(2131886649, (DialogInterface$OnClickListener)s.G).B(2131886664, (DialogInterface$OnClickListener)new q(this, h)).O();
        }
    }
    
    private static final void c0(final EventDetailActivity eventDetailActivity, final Period period, final Throwable t) {
        k0.p(eventDetailActivity, "this$0");
        k0.p(period, "$period");
        Log.e("untis_log", "could not submit event", t);
        eventDetailActivity.O();
        new d$a((Context)eventDetailActivity, 2131951624).M(((Activity)eventDetailActivity).getLayoutInflater().inflate(2131493063, (ViewGroup)null, false)).r(2131886649, (DialogInterface$OnClickListener)t.G).B(2131886664, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.p(eventDetailActivity, period)).O();
    }
    
    private static final void d0(final EventDetailActivity eventDetailActivity, final Period period, final DialogInterface dialogInterface, final int n) {
        k0.p(eventDetailActivity, "this$0");
        k0.p(period, "$period");
        eventDetailActivity.L().d(com.untis.mobile.analytics.base.c.e.P, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
        Label_0330: {
            if (eventDetailActivity.M.isEmpty() ^ true) {
                final Event j = eventDetailActivity.J;
                if (j == null) {
                    k0.S("event");
                    throw null;
                }
                if (j.getEntityId() == 0L) {
                    final ArrayList<Long> m = eventDetailActivity.M;
                    final ArrayList list = new ArrayList<Event>(kotlin.collections.v.Y((Iterable<?>)m, 10));
                    final Iterator<Number> iterator = m.iterator();
                    while (iterator.hasNext()) {
                        final long longValue = iterator.next().longValue();
                        final long id = period.getId();
                        final Event i = eventDetailActivity.J;
                        if (i == null) {
                            k0.S("event");
                            throw null;
                        }
                        final EntityType entityType = i.getEntityType();
                        final Event k = eventDetailActivity.J;
                        if (k == null) {
                            k0.S("event");
                            throw null;
                        }
                        final org.joda.time.c dateTime = k.getDateTime();
                        final Event l = eventDetailActivity.J;
                        if (l == null) {
                            k0.S("event");
                            throw null;
                        }
                        final String text = l.getText();
                        final Event j2 = eventDetailActivity.J;
                        if (j2 == null) {
                            k0.S("event");
                            throw null;
                        }
                        list.add(new Event(0L, id, entityType, longValue, dateTime, text, j2.getEventReason(), false, 1, null));
                    }
                    eventDetailActivity.j0((List<Event>)list);
                    eventDetailActivity.l0((List<Event>)list);
                    break Label_0330;
                }
            }
            final Event j3 = eventDetailActivity.J;
            if (j3 == null) {
                k0.S("event");
                throw null;
            }
            eventDetailActivity.i0(j3);
            final Event j4 = eventDetailActivity.J;
            if (j4 == null) {
                k0.S("event");
                throw null;
            }
            eventDetailActivity.k0(j4);
        }
        dialogInterface.dismiss();
        ((Activity)eventDetailActivity).setResult(-1);
        ((Activity)eventDetailActivity).finish();
    }
    
    private static final void e0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void f0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void g0(final EventDetailActivity eventDetailActivity, final Period period, final DialogInterface dialogInterface, final int n) {
        k0.p(eventDetailActivity, "this$0");
        k0.p(period, "$period");
        eventDetailActivity.L().d(com.untis.mobile.analytics.base.c.e.P, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
        Label_0330: {
            if (eventDetailActivity.M.isEmpty() ^ true) {
                final Event j = eventDetailActivity.J;
                if (j == null) {
                    k0.S("event");
                    throw null;
                }
                if (j.getEntityId() == 0L) {
                    final ArrayList<Long> m = eventDetailActivity.M;
                    final ArrayList list = new ArrayList<Event>(kotlin.collections.v.Y((Iterable<?>)m, 10));
                    final Iterator<Number> iterator = m.iterator();
                    while (iterator.hasNext()) {
                        final long longValue = iterator.next().longValue();
                        final long id = period.getId();
                        final Event i = eventDetailActivity.J;
                        if (i == null) {
                            k0.S("event");
                            throw null;
                        }
                        final EntityType entityType = i.getEntityType();
                        final Event k = eventDetailActivity.J;
                        if (k == null) {
                            k0.S("event");
                            throw null;
                        }
                        final org.joda.time.c dateTime = k.getDateTime();
                        final Event l = eventDetailActivity.J;
                        if (l == null) {
                            k0.S("event");
                            throw null;
                        }
                        final String text = l.getText();
                        final Event j2 = eventDetailActivity.J;
                        if (j2 == null) {
                            k0.S("event");
                            throw null;
                        }
                        list.add(new Event(0L, id, entityType, longValue, dateTime, text, j2.getEventReason(), false, 1, null));
                    }
                    eventDetailActivity.j0((List<Event>)list);
                    eventDetailActivity.l0((List<Event>)list);
                    break Label_0330;
                }
            }
            final Event j3 = eventDetailActivity.J;
            if (j3 == null) {
                k0.S("event");
                throw null;
            }
            eventDetailActivity.i0(j3);
            final Event j4 = eventDetailActivity.J;
            if (j4 == null) {
                k0.S("event");
                throw null;
            }
            eventDetailActivity.k0(j4);
        }
        dialogInterface.dismiss();
        ((Activity)eventDetailActivity).setResult(-1);
        ((Activity)eventDetailActivity).finish();
    }
    
    private static final void h0(final EventDetailActivity eventDetailActivity, final List list) {
        k0.p(eventDetailActivity, "this$0");
        k0.o(list, "events");
        eventDetailActivity.l0(list);
        eventDetailActivity.O();
        eventDetailActivity.L().c(com.untis.mobile.analytics.base.c.e.P);
        ((Activity)eventDetailActivity).setResult(-1);
        ((Activity)eventDetailActivity).finish();
    }
    
    private final void i0(final Event event) {
        event.setSynced(false);
        h.h((g)null, (p)new p<r0, d<? super Event>, Object>() {
            int G;
            final /* synthetic */ EventDetailActivity H;
            final /* synthetic */ Event I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Event>, Object>() {
                    int G;
                    final /* synthetic */ EventDetailActivity H = this.H;
                    final /* synthetic */ Event I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super Event> d) {
                return ((EventDetailActivity$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
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
                    final com.untis.mobile.services.classbook.a h2 = EventDetailActivity.H(this.H);
                    if (h2 == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final Event i = this.I;
                    this.G = 1;
                    if ((q = h2.q(i, this)) == h) {
                        return h;
                    }
                }
                return q;
            }
        }, 1, (Object)null);
    }
    
    private final void j0(final List<Event> list) {
        for (final Event event : list) {
            event.setSynced(false);
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ EventDetailActivity H;
                final /* synthetic */ Event I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ EventDetailActivity H = this.H;
                        final /* synthetic */ Event I = this.I;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((EventDetailActivity$e)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
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
                        final com.untis.mobile.services.classbook.a h2 = EventDetailActivity.H(this.H);
                        if (h2 == null) {
                            k0.S("classBookService");
                            throw null;
                        }
                        final Event i = this.I;
                        this.G = 1;
                        if (h2.q(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
        }
    }
    
    private final void k0(final Event event) {
        final Classbook i = this.I;
        if (i == null) {
            return;
        }
        while (true) {
            for (final Event next : i.getEvents()) {
                if (next.getId() == event.getId()) {
                    if (next == null) {
                        i.getEvents().add(event);
                    }
                    h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ EventDetailActivity H;
                        final /* synthetic */ Classbook I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ EventDetailActivity H = this.H;
                                final /* synthetic */ Classbook I = this.I;
                            };
                        }
                        
                        @f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                            return ((EventDetailActivity$h)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @f
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
                                final com.untis.mobile.services.classbook.a h2 = EventDetailActivity.H(this.H);
                                if (h2 == null) {
                                    k0.S("classBookService");
                                    throw null;
                                }
                                final Classbook i = this.I;
                                this.G = 1;
                                if (h2.a0(i, this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 1, (Object)null);
                    return;
                }
            }
            Event next = null;
            continue;
        }
    }
    
    private final void l0(final List<Event> list) {
        final Classbook i = this.I;
        if (i == null) {
            return;
        }
        final Iterator<Object> iterator = list.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final int n = 1;
            if (!hasNext) {
                break;
            }
            final Event event = iterator.next();
            final Set<Event> events = i.getEvents();
            int n2 = 0;
            Label_0135: {
                if (!(events instanceof Collection) || !events.isEmpty()) {
                    final Iterator<Object> iterator2 = events.iterator();
                    while (iterator2.hasNext()) {
                        if (event.getId() == iterator2.next().getId()) {
                            n2 = n;
                            break Label_0135;
                        }
                    }
                }
                n2 = 0;
            }
            if (n2 != 0) {
                i.getEvents().remove(event);
            }
            i.getEvents().add(event);
        }
        h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ EventDetailActivity H;
            final /* synthetic */ Classbook I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ EventDetailActivity H = this.H;
                    final /* synthetic */ Classbook I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((EventDetailActivity$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
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
                    final com.untis.mobile.services.classbook.a h2 = EventDetailActivity.H(this.H);
                    if (h2 == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final Classbook i = this.I;
                    this.G = 1;
                    if (h2.a0(i, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    private final void m0() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(0);
    }
    
    private final void n0() {
        ((TextView)this.findViewById(c.i.a5)).setText((CharSequence)this.N());
        ((ListView)this.findViewById(c.i.Z4)).setAdapter((ListAdapter)new com.untis.mobile.ui.activities.classbook.events.w((Context)this, this.M()));
        final CardView cardView = (CardView)this.findViewById(c.i.b5);
        final com.untis.mobile.services.masterdata.a n = this.N;
        if (n == null) {
            k0.S("masterDataService");
            throw null;
        }
        final boolean empty = n.i(true).isEmpty();
        final int n2 = 8;
        final long n3 = 0L;
        final int n4 = 0;
        int visibility = 0;
        Label_0171: {
            if (empty) {
                final com.untis.mobile.services.masterdata.a n5 = this.N;
                if (n5 == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final Event j = this.J;
                if (j == null) {
                    k0.S("event");
                    throw null;
                }
                final EventReason eventReason = j.getEventReason();
                long groupId;
                if (eventReason == null) {
                    groupId = 0L;
                }
                else {
                    groupId = eventReason.getGroupId();
                }
                if (n5.C(groupId) == null) {
                    visibility = 8;
                    break Label_0171;
                }
            }
            visibility = 0;
        }
        ((FrameLayout)cardView).setVisibility(visibility);
        final int c5 = c.i.c5;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(c5);
        final com.untis.mobile.services.masterdata.a n6 = this.N;
        if (n6 == null) {
            k0.S("masterDataService");
            throw null;
        }
        final EventReasonGroup c6 = n6.C(this.K);
        final String s = "";
        String longName;
        if (c6 == null || (longName = c6.getLongName()) == null) {
            longName = "";
        }
        ((TextView)appCompatTextView).setText((CharSequence)longName);
        ((ViewGroup)this.findViewById(c.i.W4)).setOnClickListener((View$OnClickListener)new i(this));
        final CharSequence text = ((AppCompatTextView)this.findViewById(c5)).getText();
        k0.o(text, "activity_event_detail_group_subtitle.text");
        if (text.length() == 0) {
            ((TextView)this.findViewById(c5)).setText((CharSequence)((Activity)this).getString(2131886745));
        }
        final CardView cardView2 = (CardView)this.findViewById(c.i.k5);
        final com.untis.mobile.services.masterdata.a n7 = this.N;
        if (n7 == null) {
            k0.S("masterDataService");
            throw null;
        }
        int visibility2 = 0;
        Label_0409: {
            if (n7.r(true).isEmpty()) {
                final Event i = this.J;
                if (i == null) {
                    k0.S("event");
                    throw null;
                }
                if (i.getEventReason() == null) {
                    visibility2 = n2;
                    break Label_0409;
                }
            }
            visibility2 = 0;
        }
        ((FrameLayout)cardView2).setVisibility(visibility2);
        final int l5 = c.i.l5;
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)this.findViewById(l5);
        final com.untis.mobile.services.masterdata.a n8 = this.N;
        if (n8 == null) {
            k0.S("masterDataService");
            throw null;
        }
        final Event k = this.J;
        if (k == null) {
            k0.S("event");
            throw null;
        }
        final EventReason eventReason2 = k.getEventReason();
        long id;
        if (eventReason2 == null) {
            id = n3;
        }
        else {
            id = eventReason2.getId();
        }
        final EventReason w = n8.w(id);
        String longName2;
        if (w == null) {
            longName2 = s;
        }
        else {
            longName2 = w.getLongName();
            if (longName2 == null) {
                longName2 = s;
            }
        }
        ((TextView)appCompatTextView2).setText((CharSequence)longName2);
        ((ViewGroup)this.findViewById(c.i.X4)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.g(this));
        final CharSequence text2 = ((AppCompatTextView)this.findViewById(l5)).getText();
        k0.o(text2, "activity_event_detail_reason_subtitle.text");
        int n9 = n4;
        if (text2.length() == 0) {
            n9 = 1;
        }
        if (n9 != 0) {
            ((TextView)this.findViewById(l5)).setText((CharSequence)((Activity)this).getString(2131886745));
        }
        final int y4 = c.i.Y4;
        ((EditText)this.findViewById(y4)).addTextChangedListener((TextWatcher)new TextWatcher() {
            final /* synthetic */ EventDetailActivity G;
            
            public void afterTextChanged(@f final Editable editable) {
            }
            
            public void beforeTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
                final Event i = EventDetailActivity.I(this.G);
                if (i != null) {
                    i.setText(String.valueOf(((AppCompatEditText)this.G.findViewById(c.i.Y4)).getText()));
                    return;
                }
                k0.S("event");
                throw null;
            }
        });
        final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(y4);
        final Event m = this.J;
        if (m != null) {
            ((EditText)textInputEditText).setText((CharSequence)m.getText());
            final TextInputEditText textInputEditText2 = (TextInputEditText)this.findViewById(y4);
            k0.o(textInputEditText2, "activity_event_detail_edit_text");
            com.untis.mobile.utils.extension.h.D(textInputEditText2, null, 1, null);
            ((ImageButton)this.findViewById(c.i.V4)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.h(this));
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private static final void o0(final EventDetailActivity eventDetailActivity, final View view) {
        k0.p(eventDetailActivity, "this$0");
        eventDetailActivity.W();
    }
    
    private static final void p0(final EventDetailActivity eventDetailActivity, final View view) {
        k0.p(eventDetailActivity, "this$0");
        eventDetailActivity.X();
    }
    
    private static final void q0(final EventDetailActivity eventDetailActivity, final View view) {
        k0.p(eventDetailActivity, "this$0");
        eventDetailActivity.Y();
    }
    
    private final void r0() {
        ((TextView)this.findViewById(c.i.e5)).setText((CharSequence)this.N());
        ((ListView)this.findViewById(c.i.d5)).setAdapter((ListAdapter)new com.untis.mobile.ui.activities.classbook.events.w((Context)this, this.M()));
        final int g5 = c.i.g5;
        final TextView textView = (TextView)this.findViewById(g5);
        final com.untis.mobile.services.masterdata.a n = this.N;
        if (n == null) {
            k0.S("masterDataService");
            throw null;
        }
        final Event j = this.J;
        if (j == null) {
            k0.S("event");
            throw null;
        }
        final EventReason eventReason = j.getEventReason();
        final long n2 = 0L;
        long groupId;
        if (eventReason == null) {
            groupId = 0L;
        }
        else {
            groupId = eventReason.getGroupId();
        }
        final EventReasonGroup c = n.C(groupId);
        final String s = "";
        String longName;
        if (c == null || (longName = c.getLongName()) == null) {
            longName = "";
        }
        textView.setText((CharSequence)longName);
        final int i5 = com.untis.mobile.c.i.i5;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(i5);
        final com.untis.mobile.services.masterdata.a n3 = this.N;
        if (n3 == null) {
            k0.S("masterDataService");
            throw null;
        }
        final Event k = this.J;
        if (k == null) {
            k0.S("event");
            throw null;
        }
        final EventReason eventReason2 = k.getEventReason();
        long id;
        if (eventReason2 == null) {
            id = n2;
        }
        else {
            id = eventReason2.getId();
        }
        final EventReason w = n3.w(id);
        String longName2;
        if (w == null) {
            longName2 = s;
        }
        else {
            longName2 = w.getLongName();
            if (longName2 == null) {
                longName2 = s;
            }
        }
        ((TextView)appCompatTextView).setText((CharSequence)longName2);
        final int j2 = com.untis.mobile.c.i.j5;
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)this.findViewById(j2);
        final Event l = this.J;
        if (l != null) {
            ((TextView)appCompatTextView2).setText((CharSequence)l.getText());
            final CardView cardView = (CardView)this.findViewById(com.untis.mobile.c.i.f5);
            final CharSequence text = ((TextView)this.findViewById(g5)).getText();
            k0.o(text, "activity_event_detail_readonly_group_subtitle.text");
            final int length = text.length();
            final int n4 = 1;
            int visibility;
            if (length == 0) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            ((FrameLayout)cardView).setVisibility(visibility);
            final CharSequence text2 = ((AppCompatTextView)this.findViewById(i5)).getText();
            k0.o(text2, "activity_event_detail_readonly_reason_subtitle.text");
            if (text2.length() == 0) {
                ((TextView)this.findViewById(i5)).setText((CharSequence)((Activity)this).getString(2131886745));
            }
            final CharSequence text3 = ((AppCompatTextView)this.findViewById(j2)).getText();
            k0.o(text3, "activity_event_detail_readonly_text_subtitle.text");
            int n5;
            if (text3.length() == 0) {
                n5 = n4;
            }
            else {
                n5 = 0;
            }
            if (n5 != 0) {
                ((TextView)this.findViewById(j2)).setText(2131886737);
            }
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private final void s0() {
        if (this.L) {
            this.r0();
        }
        else {
            this.n0();
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 1401) {
            if (n != 1402) {
                super.onActivityResult(n, n2, intent);
                return;
            }
            if (!b || intent == null) {
                return;
            }
            final Event a = EventReasonActivity.K.a(intent);
            if (a == null) {
                return;
            }
            this.J = a;
        }
        else {
            if (!b || intent == null) {
                return;
            }
            this.K = EventReasonGroupActivity.J.b(intent);
        }
        this.s0();
    }
    
    @Override
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        String s = "";
        if (extras2 != null) {
            final String string = extras2.getString("wien", "");
            if (string != null) {
                s = string;
            }
        }
        final j0 g = j0.G;
        Profile g2;
        if ((g2 = g.l(s)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        this.N = g2.getMasterDataService();
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
        Event event;
        if (extras3 == null) {
            event = null;
        }
        else {
            event = (Event)extras3.getParcelable("eisenstadt");
        }
        Event j = event;
        if (event == null) {
            j = new Event(0L, 0L, null, 0L, null, null, null, false, 255, null);
        }
        this.J = j;
        Bundle extras4;
        if (extras == null) {
            extras4 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras4 = extras;
        }
        long long1;
        if (extras4 == null) {
            long1 = 0L;
        }
        else {
            long1 = extras4.getLong("bregenz");
        }
        this.H = com.untis.mobile.services.timetable.placeholder.p.Y.a(s).l(long1);
        Bundle extras5;
        if (extras == null) {
            extras5 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras5 = extras;
        }
        boolean l = false;
        Label_0355: {
            if (extras5 == null || !extras5.getBoolean("innsbruck")) {
                final com.untis.mobile.services.a a = com.untis.mobile.services.a.a;
                Period h;
                if ((h = this.H) == null) {
                    h = new Period(0L, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131071, null);
                }
                if (a.k(h)) {
                    break Label_0355;
                }
            }
            l = true;
        }
        this.L = l;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        long[] longArray;
        if (extras == null) {
            longArray = null;
        }
        else {
            longArray = extras.getLongArray("graz");
        }
        if (longArray != null) {
            this.M.addAll(kotlin.collections.m.dy(longArray));
        }
        final com.untis.mobile.services.classbook.a o = this.O;
        if (o != null) {
            this.I = o.S(long1);
            int contentView;
            if (this.L) {
                contentView = 2131492912;
            }
            else {
                contentView = 2131492911;
            }
            this.setContentView(contentView);
            this.s0();
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                final Event i = this.J;
                if (i == null) {
                    k0.S("event");
                    throw null;
                }
                int n;
                if (i.getId() == 0L) {
                    n = 2131886206;
                }
                else {
                    n = 2131886209;
                }
                supportActionBar.A0((CharSequence)((Activity)this).getString(n));
            }
            final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
            if (supportActionBar2 != null) {
                final Event k = this.J;
                if (k == null) {
                    k0.S("event");
                    throw null;
                }
                int n2;
                if (k.getEntityType() == EntityType.CLASS) {
                    n2 = 2131886680;
                }
                else {
                    n2 = 2131886810;
                }
                supportActionBar2.y0((CharSequence)((Activity)this).getString(n2));
            }
            final androidx.appcompat.app.a supportActionBar3 = this.getSupportActionBar();
            if (supportActionBar3 != null) {
                supportActionBar3.Y(true);
            }
            return;
        }
        k0.S("classBookService");
        throw null;
    }
    
    public boolean onCreateOptionsMenu(@f final Menu menu) {
        if (!this.L) {
            final Event j = this.J;
            if (j == null) {
                k0.S("event");
                throw null;
            }
            if (j.getId() != 0L) {
                this.getMenuInflater().inflate(2131558405, menu);
            }
        }
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        final int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            if (itemId == 2131298435) {
                if (this.L) {
                    return false;
                }
                ((Dialog)new d$a((Context)this, 2131951624).L(2131493035).r(2131886649, (DialogInterface$OnClickListener)u.G).B(2131886653, (DialogInterface$OnClickListener)new n(this)).a()).show();
            }
            return super.onOptionsItemSelected(menuItem);
        }
        ((ComponentActivity)this).onBackPressed();
        return true;
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
        bundle.putString("wien", g.getUniqueId());
        final Event j = this.J;
        if (j != null) {
            bundle.putParcelable("eisenstadt", (Parcelable)j);
            bundle.putBoolean("innsbruck", this.L);
            final Period h = this.H;
            long id;
            if (h == null) {
                id = 0L;
            }
            else {
                id = h.getId();
            }
            bundle.putLong("bregenz", id);
            return;
        }
        k0.S("event");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ>\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001d" }, d2 = { "com/untis/mobile/ui/activities/classbook/events/EventDetailActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Landroid/content/Intent;", "b", "", "periodId", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "", "entityIds", "", "readOnly", "a", "BUNDLE_ENTITY_IDS", "Ljava/lang/String;", "BUNDLE_EVENT", "BUNDLE_PERIOD_ID", "BUNDLE_PROFILE_ID", "BUNDLE_READ_ONLY", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n, @e final Event event, @e final List<Long> list, final boolean b) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(event, "event");
            k0.p(list, "entityIds");
            final Intent intent = new Intent(context, (Class)EventDetailActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("wien", s);
            bundle.putParcelable("eisenstadt", (Parcelable)event);
            bundle.putBoolean("innsbruck", b);
            bundle.putLongArray("graz", kotlin.collections.v.J5(list));
            bundle.putLong("bregenz", n);
            intent.putExtras(bundle);
            return intent;
        }
        
        @e
        public final Intent b(@e final Context context, @e final String s, @e final Period period, @f final Student student) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(period, "period");
            final Event event = new Event(0L, period.getId(), null, 0L, period.getStart(), null, null, true, 109, null);
            List<Long> l5;
            if (student != null) {
                event.setEntityType(EntityType.STUDENT);
                event.setEntityId(student.getId());
                l5 = new ArrayList<Long>();
            }
            else {
                event.setEntityType(EntityType.CLASS);
                final List<PeriodElement> klassen = period.getKlassen();
                final ArrayList list = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)klassen, 10));
                final Iterator<Object> iterator = klassen.iterator();
                while (iterator.hasNext()) {
                    list.add(Long.valueOf(iterator.next().getCurrentId()));
                }
                final List<Long> list2 = l5 = kotlin.collections.v.L5((Collection<? extends Long>)list);
                if (list2.isEmpty() ^ true) {
                    event.setEntityId(list2.get(0).longValue());
                    list2.remove(0);
                    l5 = list2;
                }
            }
            return this.a(context, s, period.getId(), event, l5, period.getRights().contains(PeriodRight.WRITE_CLASSREGEVENT) ^ true);
        }
    }
}
