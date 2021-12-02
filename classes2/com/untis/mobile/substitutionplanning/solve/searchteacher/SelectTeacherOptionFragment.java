// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.solve.searchteacher;

import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.text.TextWatcher;
import com.untis.mobile.utils.n0;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import com.untis.mobile.substitutionplanning.model.SolutionTypeOptionDto;
import n6.l;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.content.Context;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%" }, d2 = { "Lcom/untis/mobile/substitutionplanning/solve/searchteacher/SelectTeacherOptionFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "root", "Lcom/untis/mobile/substitutionplanning/solve/searchteacher/b;", "selectTeacherOptionAdapter", "Landroidx/appcompat/widget/AppCompatTextView;", "view", "", "tag", "", "visible", "Lkotlin/j2;", "v", "empty", "z", "button", "isActive", "y", "Landroid/content/Context;", "context", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/substitutionplanning/solve/searchteacher/e;", "G", "Lcom/untis/mobile/substitutionplanning/solve/searchteacher/e;", "delegate", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SelectTeacherOptionFragment extends UmFragment
{
    @e
    public static final a H;
    @e
    public static final String I = "select-teacher-fragment";
    private com.untis.mobile.substitutionplanning.solve.searchteacher.e G;
    
    static {
        H = new a(null);
    }
    
    public static final /* synthetic */ com.untis.mobile.substitutionplanning.solve.searchteacher.e t(final SelectTeacherOptionFragment selectTeacherOptionFragment) {
        return selectTeacherOptionFragment.G;
    }
    
    private final void v(final View view, final b b, final AppCompatTextView appCompatTextView, final String s, final boolean b2) {
        ((TextView)appCompatTextView).setVisibility(h.U(b2, 0, 1, null));
        ((TextView)appCompatTextView).setOnClickListener((View$OnClickListener)new c(b, s, this, appCompatTextView, view));
        this.y(appCompatTextView, b.i().contains(s));
    }
    
    private static final void w(final b b, final String s, final SelectTeacherOptionFragment selectTeacherOptionFragment, final AppCompatTextView appCompatTextView, final View view, final View view2) {
        k0.p(b, "$selectTeacherOptionAdapter");
        k0.p(s, "$tag");
        k0.p(selectTeacherOptionFragment, "this$0");
        k0.p(appCompatTextView, "$view");
        k0.p(view, "$root");
        b.q(s);
        selectTeacherOptionFragment.y(appCompatTextView, b.i().contains(s));
        selectTeacherOptionFragment.z(view, b.j());
    }
    
    private static final void x(final SelectTeacherOptionFragment selectTeacherOptionFragment, final View view) {
        k0.p(selectTeacherOptionFragment, "this$0");
        final com.untis.mobile.substitutionplanning.solve.searchteacher.e g = selectTeacherOptionFragment.G;
        if (g != null) {
            g.c();
            return;
        }
        k0.S("delegate");
        throw null;
    }
    
    private final void y(final AppCompatTextView appCompatTextView, final boolean b) {
        final Context context = this.getContext();
        if (context == null) {
            return;
        }
        int f;
        if (b) {
            ((TextView)appCompatTextView).setBackground(d.i(context, 2131231026));
            f = -1;
        }
        else {
            ((TextView)appCompatTextView).setBackground(d.i(context, 2131231025));
            f = d.f(context, 2131099943);
        }
        ((TextView)appCompatTextView).setTextColor(f);
    }
    
    private final void z(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.xs)).setVisibility(h.U(b, 0, 1, null));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onAttach(@e final Context context) {
        k0.p(context, "context");
        super.onAttach(context);
        if (context instanceof com.untis.mobile.substitutionplanning.solve.searchteacher.e) {
            this.G = (com.untis.mobile.substitutionplanning.solve.searchteacher.e)context;
            return;
        }
        throw new IllegalStateException("parent context must be delegate".toString());
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493124, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final Context context = this.getContext();
        if (context == null) {
            return null;
        }
        final com.untis.mobile.substitutionplanning.solve.searchteacher.e g = this.G;
        if (g == null) {
            k0.S("delegate");
            throw null;
        }
        final b adapter = new b(context, g.a(), null, new l<SolutionTypeOptionDto, j2>() {
            final /* synthetic */ SelectTeacherOptionFragment G;
            
            public final void a(@e final SolutionTypeOptionDto solutionTypeOptionDto) {
                k0.p(solutionTypeOptionDto, "it");
                final com.untis.mobile.substitutionplanning.solve.searchteacher.e t = SelectTeacherOptionFragment.t(this.G);
                if (t != null) {
                    t.d(solutionTypeOptionDto);
                    return;
                }
                k0.S("delegate");
                throw null;
            }
        }, 4, null);
        final int ws = com.untis.mobile.c.i.ws;
        ((RecyclerView)inflate.findViewById(ws)).setAdapter((RecyclerView$h)adapter);
        ((RecyclerView)inflate.findViewById(ws)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(context));
        ((EditText)inflate.findViewById(com.untis.mobile.c.i.ys)).addTextChangedListener((TextWatcher)new n0(new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                adapter.o(s);
                SelectTeacherOptionFragment.this.z(inflate, adapter.j());
            }
        }));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.vs)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.solve.searchteacher.d(this));
        final com.untis.mobile.substitutionplanning.solve.searchteacher.e g2 = this.G;
        if (g2 != null) {
            final List<String> b = g2.b();
            final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(com.untis.mobile.c.i.zs);
            k0.o(appCompatTextView, "view.fragment_select_teacher_option_tag_knows_class");
            this.v(inflate, adapter, appCompatTextView, "KNOWS_CLASS", b.contains("KNOWS_CLASS"));
            final AppCompatTextView appCompatTextView2 = (AppCompatTextView)inflate.findViewById(com.untis.mobile.c.i.As);
            k0.o(appCompatTextView2, "view.fragment_select_teacher_option_tag_knows_subject");
            this.v(inflate, adapter, appCompatTextView2, "KNOWS_SUBJECT", b.contains("KNOWS_SUBJECT"));
            final AppCompatTextView appCompatTextView3 = (AppCompatTextView)inflate.findViewById(com.untis.mobile.c.i.Cs);
            k0.o(appCompatTextView3, "view.fragment_select_teacher_option_tag_on_standby");
            this.v(inflate, adapter, appCompatTextView3, "ON_STANDBY", b.contains("ON_STANDBY"));
            final AppCompatTextView appCompatTextView4 = (AppCompatTextView)inflate.findViewById(com.untis.mobile.c.i.Bs);
            k0.o(appCompatTextView4, "view.fragment_select_teacher_option_tag_non_teaching_period");
            this.v(inflate, adapter, appCompatTextView4, "NON_TEACHING_PERIOD", b.contains("NON_TEACHING_PERIOD"));
            return inflate;
        }
        k0.S("delegate");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "com/untis/mobile/substitutionplanning/solve/searchteacher/SelectTeacherOptionFragment$a", "", "Lcom/untis/mobile/substitutionplanning/solve/searchteacher/SelectTeacherOptionFragment;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final SelectTeacherOptionFragment a() {
            return new SelectTeacherOptionFragment();
        }
    }
}
