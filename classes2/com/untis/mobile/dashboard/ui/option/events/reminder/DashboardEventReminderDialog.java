// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events.reminder;

import android.widget.TextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import n6.l;
import kotlin.c1;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.jvm.internal.k0;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import com.untis.mobile.c;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import com.untis.mobile.dashboard.ui.option.events.j;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import kotlin.coroutines.g;
import kotlin.coroutines.a;
import kotlin.jvm.internal.w;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import kotlin.b0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/reminder/DashboardEventReminderDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "S", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "type", "T", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onViewCreated", "outState", "onSaveInstanceState", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "h0", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lcom/untis/mobile/dashboard/ui/option/events/j;", "i0", "Lkotlin/b0;", "R", "()Lcom/untis/mobile/dashboard/ui/option/events/j;", "model", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "j0", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "event", "<init>", "()V", "k0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardEventReminderDialog extends DialogFragment
{
    @e
    public static final a k0;
    @e
    public static final String l0 = "dashboard-event-notification-dialog";
    @e
    private static final String m0 = "event_type";
    @e
    private static final String n0 = "event_id";
    @e
    private final CoroutineExceptionHandler h0;
    @e
    private final b0 i0;
    private DashboardEvent j0;
    
    static {
        k0 = new a(null);
    }
    
    public DashboardEventReminderDialog() {
        this.h0 = (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ DashboardEventReminderDialog G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                final Context context = ((Fragment)this.G).getContext();
                if (context != null) {
                    h.l(context, t);
                }
                t.printStackTrace();
            }
        };
        this.i0 = d0.c((n6.a<?>)new n6.a<j>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ n6.a I = new n6.a<d1>(this) {
                final /* synthetic */ Fragment G;
                
                @e
                @Override
                public final d1 invoke() {
                    final d activity = this.G.getActivity();
                    if (activity != null) {
                        return (d1)activity;
                    }
                    throw new p1("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
            
            @e
            @Override
            public final j invoke() {
                return (j)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(j.class), null, this.I, null);
            }
        });
    }
    
    public static final /* synthetic */ DashboardEvent O(final DashboardEventReminderDialog dashboardEventReminderDialog) {
        return dashboardEventReminderDialog.j0;
    }
    
    private final j R() {
        return this.i0.getValue();
    }
    
    private final void S(final View view) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.Gp)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.events.reminder.DashboardEventReminderAdapter");
        ((b)adapter).n(new ArrayList<ReminderSubtype>());
        final j r = this.R();
        final CoroutineExceptionHandler h0 = this.h0;
        final DashboardEvent j0 = this.j0;
        if (j0 != null) {
            r.k(h0, j0);
            return;
        }
        kotlin.jvm.internal.k0.S("event");
        throw null;
    }
    
    private final void T(final ReminderSubtype reminderSubtype) {
        final j r = this.R();
        final CoroutineExceptionHandler h0 = this.h0;
        final DashboardEvent j0 = this.j0;
        if (j0 != null) {
            r.y(h0, j0, reminderSubtype);
            return;
        }
        kotlin.jvm.internal.k0.S("event");
        throw null;
    }
    
    private static final void U(final DashboardEventReminderDialog dashboardEventReminderDialog, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(dashboardEventReminderDialog, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        dashboardEventReminderDialog.S(view);
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f Bundle bundle) {
        super.onCreate(bundle);
        this.I(0, 2131951624);
        final ReminderType.Companion companion = ReminderType.Companion;
        Bundle arguments;
        if ((arguments = ((Fragment)this).getArguments()) == null) {
            arguments = bundle;
        }
        final Long n = null;
        Long value;
        if (arguments == null) {
            value = null;
        }
        else {
            value = arguments.getLong("event_type");
        }
        final ReminderType byId = companion.findById(value);
        if (byId == null) {
            throw new IllegalArgumentException("no valid type");
        }
        final Bundle arguments2 = ((Fragment)this).getArguments();
        if (arguments2 != null) {
            bundle = arguments2;
        }
        Long value2;
        if (bundle == null) {
            value2 = n;
        }
        else {
            value2 = bundle.getLong("event_id");
        }
        if (value2 != null) {
            this.j0 = this.R().o(byId, value2);
            return;
        }
        throw new IllegalArgumentException("no valid id");
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        return layoutInflater.inflate(2131493092, viewGroup, false);
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        kotlin.jvm.internal.k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final DashboardEvent j0 = this.j0;
        if (j0 == null) {
            kotlin.jvm.internal.k0.S("event");
            throw null;
        }
        bundle.putLong("event_type", j0.getEventType().getId());
        final DashboardEvent j2 = this.j0;
        if (j2 != null) {
            bundle.putLong("event_id", j2.getEventId());
            return;
        }
        kotlin.jvm.internal.k0.S("event");
        throw null;
    }
    
    public void onViewCreated(@e final View view, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(view, "view");
        super.onViewCreated(view, bundle);
        final List list = (List)kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super List<ReminderSubtype>>, Object>() {
            int G;
            final /* synthetic */ DashboardEventReminderDialog H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<ReminderSubtype>>, Object>() {
                    int G;
                    final /* synthetic */ DashboardEventReminderDialog H = this.H;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<ReminderSubtype>> d) {
                return ((DashboardEventReminderDialog$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object s) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(s);
                }
                else {
                    c1.n(s);
                    final j p = DashboardEventReminderDialog.this.R();
                    final DashboardEvent o = DashboardEventReminderDialog.O(this.H);
                    if (o == null) {
                        kotlin.jvm.internal.k0.S("event");
                        throw null;
                    }
                    this.G = 1;
                    if ((s = p.s(o, this)) == h) {
                        return h;
                    }
                }
                return s;
            }
        }, 1, (Object)null);
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(c.i.Gp);
        final Context requireContext = ((Fragment)this).requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        final DashboardEvent j0 = this.j0;
        if (j0 != null) {
            recyclerView.setAdapter((RecyclerView$h)new b(requireContext, list, j0.sectionLocalDate(), new l<ReminderSubtype, j2>() {
                public final void a(@e final ReminderSubtype reminderSubtype) {
                    kotlin.jvm.internal.k0.p(reminderSubtype, "it");
                    DashboardEventReminderDialog.this.T(reminderSubtype);
                }
            }));
            ((TextView)view.findViewById(c.i.Fp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.events.reminder.c(this, view));
            return;
        }
        kotlin.jvm.internal.k0.S("event");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r" }, d2 = { "com/untis/mobile/dashboard/ui/option/events/reminder/DashboardEventReminderDialog$a", "", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "event", "Lcom/untis/mobile/dashboard/ui/option/events/reminder/DashboardEventReminderDialog;", "a", "", "ARGUMENT_EVENT_ID", "Ljava/lang/String;", "ARGUMENT_EVENT_TYPE", "TAG", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final DashboardEventReminderDialog a(@e final DashboardEvent dashboardEvent) {
            kotlin.jvm.internal.k0.p(dashboardEvent, "event");
            final DashboardEventReminderDialog dashboardEventReminderDialog = new DashboardEventReminderDialog();
            final Bundle arguments = new Bundle();
            arguments.putLong("event_type", dashboardEvent.getEventType().getId());
            arguments.putLong("event_id", dashboardEvent.getEventId());
            ((Fragment)dashboardEventReminderDialog).setArguments(arguments);
            return dashboardEventReminderDialog;
        }
    }
}
