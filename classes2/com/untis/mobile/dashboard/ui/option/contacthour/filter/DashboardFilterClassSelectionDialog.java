// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour.filter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import java.util.List;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.j2;
import n6.l;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.view.View;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import kotlin.coroutines.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import n6.a;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/filter/DashboardFilterClassSelectionDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View;", "view", "", "filter", "Lkotlin/j2;", "Y", "W", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klasse", "T", "", "show", "X", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onViewCreated", "Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "h0", "Lkotlin/b0;", "S", "()Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "model", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "i0", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "<init>", "()V", "j0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardFilterClassSelectionDialog extends DialogFragment
{
    @e
    public static final a j0;
    @e
    public static final String k0 = "dashboard-filter-class-selection";
    @e
    private final b0 h0;
    @e
    private final CoroutineExceptionHandler i0;
    
    static {
        j0 = new a(null);
    }
    
    public DashboardFilterClassSelectionDialog() {
        this.h0 = d0.c((n6.a<?>)new n6.a<com.untis.mobile.dashboard.ui.option.contacthour.e>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ a I = new a<d1>(this) {
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
            public final com.untis.mobile.dashboard.ui.option.contacthour.e invoke() {
                return (com.untis.mobile.dashboard.ui.option.contacthour.e)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(com.untis.mobile.dashboard.ui.option.contacthour.e.class), null, this.I, null);
            }
        });
        this.i0 = (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ DashboardFilterClassSelectionDialog G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                final Context context = ((Fragment)this.G).getContext();
                if (context != null) {
                    h.l(context, t);
                }
            }
        };
    }
    
    private final com.untis.mobile.dashboard.ui.option.contacthour.e S() {
        return this.h0.getValue();
    }
    
    private final void T(final Klasse klasse) {
        this.S().x(this.i0, klasse.getId());
        this.u();
    }
    
    private static final void U(final DashboardFilterClassSelectionDialog dashboardFilterClassSelectionDialog, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(dashboardFilterClassSelectionDialog, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        dashboardFilterClassSelectionDialog.Y(view, "");
    }
    
    private static final void V(final DashboardFilterClassSelectionDialog dashboardFilterClassSelectionDialog, final View view) {
        kotlin.jvm.internal.k0.p(dashboardFilterClassSelectionDialog, "this$0");
        dashboardFilterClassSelectionDialog.W();
    }
    
    private final void W() {
        this.S().x(this.i0, -1L);
        this.u();
    }
    
    private final void X(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(h.U(b, 0, 1, null));
        ((FloatingActionButton)view.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(((Fragment)this).requireContext(), 2131231159));
        ((TextView)view.findViewById(c.i.VD)).setText(2131886743);
        ((TextView)view.findViewById(c.i.UD)).setText(2131886742);
    }
    
    private final void Y(final View view, final String s) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.Mp)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.contacthour.filter.DashboardFilterClassSelectionAdapter");
        final i i = (i)adapter;
        i.i(s);
        final int itemCount = i.getItemCount();
        boolean b = true;
        if (itemCount >= 1) {
            b = false;
        }
        this.X(view, b);
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.I(0, 2131951624);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        return layoutInflater.inflate(2131493094, viewGroup, false);
    }
    
    public void onViewCreated(@e final View view, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(view, "view");
        super.onViewCreated(view, bundle);
        final AppCompatEditText appCompatEditText = (AppCompatEditText)view.findViewById(c.i.Qp);
        kotlin.jvm.internal.k0.o(appCompatEditText, "view.fragment_dashboard_filter_classselection_search_edit");
        h.A(appCompatEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                kotlin.jvm.internal.k0.p(s, "it");
                DashboardFilterClassSelectionDialog.this.Y(view, s);
            }
        });
        ((ImageView)view.findViewById(c.i.Pp)).setOnClickListener((View$OnClickListener)new k(this, view));
        ((TextView)view.findViewById(c.i.Lp)).setOnClickListener((View$OnClickListener)new j(this));
        final List list = (List)kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super List<? extends Klasse>>, Object>() {
            int G;
            final /* synthetic */ DashboardFilterClassSelectionDialog H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends Klasse>>, Object>() {
                    int G;
                    final /* synthetic */ DashboardFilterClassSelectionDialog H = this.H;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<Klasse>> d) {
                return ((DashboardFilterClassSelectionDialog$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final com.untis.mobile.dashboard.ui.option.contacthour.e p = DashboardFilterClassSelectionDialog.this.S();
                    this.G = 1;
                    if ((o = p.o(this)) == h) {
                        return h;
                    }
                }
                return o;
            }
        }, 1, (Object)null);
        if (list.isEmpty() ^ true) {
            final RecyclerView recyclerView = (RecyclerView)view.findViewById(c.i.Mp);
            final Context requireContext = ((Fragment)this).requireContext();
            kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
            recyclerView.setAdapter((RecyclerView$h)new i(requireContext, list, new l<Klasse, j2>() {
                public final void a(@e final Klasse klasse) {
                    kotlin.jvm.internal.k0.p(klasse, "it");
                    DashboardFilterClassSelectionDialog.this.T(klasse);
                }
            }));
        }
        else {
            ((ViewGroup)view.findViewById(c.i.Op)).setVisibility(8);
            ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(0);
            ((FloatingActionButton)view.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(((Fragment)this).requireContext(), 2131231091));
            ((TextView)view.findViewById(c.i.VD)).setText(2131886679);
            ((TextView)view.findViewById(c.i.UD)).setText(2131886679);
        }
        view.findViewById(c.i.Np).requestFocus();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/dashboard/ui/option/contacthour/filter/DashboardFilterClassSelectionDialog$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
