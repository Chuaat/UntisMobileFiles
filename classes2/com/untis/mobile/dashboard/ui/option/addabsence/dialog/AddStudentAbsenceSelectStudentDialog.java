// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.addabsence.dialog;

import java.util.Iterator;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.List;
import kotlin.j2;
import n6.l;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import com.untis.mobile.persistence.models.profile.Child;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import com.untis.mobile.dashboard.ui.option.absence.student.c;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/addabsence/dialog/AddStudentAbsenceSelectStudentDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "Lkotlin/j2;", "P", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "h0", "Lkotlin/b0;", "O", "()Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "model", "<init>", "()V", "i0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AddStudentAbsenceSelectStudentDialog extends DialogFragment
{
    @e
    public static final a i0;
    @e
    public static final String j0 = "add-student-absence-select-student-dialog";
    @e
    private final b0 h0;
    
    static {
        i0 = new a(null);
    }
    
    public AddStudentAbsenceSelectStudentDialog() {
        this.h0 = d0.c((n6.a<?>)new n6.a<c>() {
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
            public final c invoke() {
                return (c)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(c.class), null, this.I, null);
            }
        });
    }
    
    private final c O() {
        return this.h0.getValue();
    }
    
    private final void P(final Child child) {
        this.O().M(child);
        this.u();
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.I(0, 2131951624);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493029, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.el);
        final Context requireContext = ((Fragment)this).requireContext();
        k0.o(requireContext, "requireContext()");
        final List<Child> t = this.O().t();
        final ArrayList<Child> list = new ArrayList<Child>();
        for (final Child child : t) {
            if (child != null) {
                list.add(child);
            }
        }
        recyclerView.setAdapter((RecyclerView$h)new b(requireContext, list, new l<Child, j2>() {
            public final void a(@e final Child child) {
                k0.p(child, "it");
                AddStudentAbsenceSelectStudentDialog.this.P(child);
            }
        }));
        return inflate;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/dashboard/ui/option/addabsence/dialog/AddStudentAbsenceSelectStudentDialog$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
