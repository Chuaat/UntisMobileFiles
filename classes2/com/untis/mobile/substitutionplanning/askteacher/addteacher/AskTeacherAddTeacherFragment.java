// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.askteacher.addteacher;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.List;
import androidx.fragment.app.d;
import kotlin.jvm.internal.k0;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J&\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+" }, d2 = { "Lcom/untis/mobile/substitutionplanning/askteacher/addteacher/AskTeacherAddTeacherFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "", "", "checkedTeacherIds", "Lkotlin/j2;", "J", "Landroid/view/View;", "root", "Lcom/untis/mobile/substitutionplanning/askteacher/addteacher/j;", "adapter", "", "filter", "I", "view", "L", "Landroidx/appcompat/widget/AppCompatTextView;", "tag", "K", "", "hasSelection", "M", "enabled", "N", "A", "Landroid/content/Context;", "context", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/substitutionplanning/askteacher/addteacher/h;", "G", "Lcom/untis/mobile/substitutionplanning/askteacher/addteacher/h;", "delegate", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AskTeacherAddTeacherFragment extends UmFragment
{
    @e
    public static final a H;
    @e
    public static final String I = "ask-teacher-add-teacher-fragment";
    private h G;
    
    static {
        H = new a(null);
    }
    
    private final void A(final View view, final j j) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Rm);
        k0.o(appCompatTextView, "root.fragment_ask_teacher_filter_all");
        this.N(appCompatTextView, j.x());
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(c.i.Xm);
        k0.o(appCompatTextView2, "root.fragment_ask_teacher_tag_knows_class");
        this.N(appCompatTextView2, false);
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView)view.findViewById(c.i.Ym);
        k0.o(appCompatTextView3, "root.fragment_ask_teacher_tag_knows_subject");
        this.N(appCompatTextView3, false);
        final AppCompatTextView appCompatTextView4 = (AppCompatTextView)view.findViewById(c.i.Zm);
        k0.o(appCompatTextView4, "root.fragment_ask_teacher_tag_non_teaching_period");
        this.N(appCompatTextView4, false);
        final AppCompatTextView appCompatTextView5 = (AppCompatTextView)view.findViewById(c.i.an);
        k0.o(appCompatTextView5, "root.fragment_ask_teacher_tag_on_standby");
        this.N(appCompatTextView5, false);
        this.L(view, j);
        this.M(view, j.k().isEmpty() ^ true);
    }
    
    private static final void B(final AskTeacherAddTeacherFragment askTeacherAddTeacherFragment, final View view) {
        k0.p(askTeacherAddTeacherFragment, "this$0");
        final d activity = askTeacherAddTeacherFragment.getActivity();
        if (activity != null) {
            ((ComponentActivity)activity).onBackPressed();
        }
    }
    
    private static final void C(final AskTeacherAddTeacherFragment askTeacherAddTeacherFragment, final j j, final View view) {
        k0.p(askTeacherAddTeacherFragment, "this$0");
        k0.p(j, "$adapter");
        askTeacherAddTeacherFragment.J(j.k());
    }
    
    private static final void D(final AskTeacherAddTeacherFragment askTeacherAddTeacherFragment, final View view, final j j, final View view2) {
        k0.p(askTeacherAddTeacherFragment, "this$0");
        k0.p(view, "$view");
        k0.p(j, "$adapter");
        askTeacherAddTeacherFragment.A(view, j);
    }
    
    private static final void E(final AskTeacherAddTeacherFragment askTeacherAddTeacherFragment, final View view, final j j, final View view2) {
        k0.p(askTeacherAddTeacherFragment, "this$0");
        k0.p(view, "$view");
        k0.p(j, "$adapter");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Xm);
        k0.o(appCompatTextView, "view.fragment_ask_teacher_tag_knows_class");
        askTeacherAddTeacherFragment.K(view, appCompatTextView, j, "KNOWS_CLASS");
    }
    
    private static final void F(final AskTeacherAddTeacherFragment askTeacherAddTeacherFragment, final View view, final j j, final View view2) {
        k0.p(askTeacherAddTeacherFragment, "this$0");
        k0.p(view, "$view");
        k0.p(j, "$adapter");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Ym);
        k0.o(appCompatTextView, "view.fragment_ask_teacher_tag_knows_subject");
        askTeacherAddTeacherFragment.K(view, appCompatTextView, j, "KNOWS_SUBJECT");
    }
    
    private static final void G(final AskTeacherAddTeacherFragment askTeacherAddTeacherFragment, final View view, final j j, final View view2) {
        k0.p(askTeacherAddTeacherFragment, "this$0");
        k0.p(view, "$view");
        k0.p(j, "$adapter");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Zm);
        k0.o(appCompatTextView, "view.fragment_ask_teacher_tag_non_teaching_period");
        askTeacherAddTeacherFragment.K(view, appCompatTextView, j, "NON_TEACHING_PERIOD");
    }
    
    private static final void H(final AskTeacherAddTeacherFragment askTeacherAddTeacherFragment, final View view, final j j, final View view2) {
        k0.p(askTeacherAddTeacherFragment, "this$0");
        k0.p(view, "$view");
        k0.p(j, "$adapter");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.an);
        k0.o(appCompatTextView, "view.fragment_ask_teacher_tag_on_standby");
        askTeacherAddTeacherFragment.K(view, appCompatTextView, j, "ON_STANDBY");
    }
    
    private final void I(final View view, final j j, final String s) {
        j.A(s);
        this.L(view, j);
        this.M(view, j.k().isEmpty() ^ true);
    }
    
    private final void J(final List<Long> list) {
        if (list.isEmpty() ^ true) {
            final h g = this.G;
            if (g == null) {
                k0.S("delegate");
                throw null;
            }
            g.b(list);
            final d activity = this.getActivity();
            if (activity != null) {
                ((ComponentActivity)activity).onBackPressed();
            }
        }
    }
    
    private final void K(final View view, AppCompatTextView appCompatTextView, final j j, final String s) {
        this.N(appCompatTextView, j.z(s));
        appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Rm);
        k0.o(appCompatTextView, "root.fragment_ask_teacher_filter_all");
        this.N(appCompatTextView, false);
        this.L(view, j);
        this.M(view, j.k().isEmpty() ^ true);
    }
    
    private final void L(final View view, final j j) {
        ((ViewGroup)view.findViewById(c.i.Tm)).setVisibility(com.untis.mobile.utils.extension.h.U(j.q(), 0, 1, null));
        AppCompatTextView appCompatTextView;
        int text;
        if (j.n().isEmpty()) {
            ((TextView)view.findViewById(c.i.Vm)).setText(2131886814);
            appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Um);
            text = 2131886159;
        }
        else {
            ((TextView)view.findViewById(c.i.Vm)).setText(2131886743);
            appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Um);
            text = 2131886742;
        }
        ((TextView)appCompatTextView).setText(text);
    }
    
    private final void M(final View view, final boolean b) {
        final Context context = this.getContext();
        if (context == null) {
            return;
        }
        AppCompatImageView appCompatImageView;
        int n;
        if (b) {
            appCompatImageView = (AppCompatImageView)view.findViewById(c.i.Qm);
            n = 2131100003;
        }
        else {
            appCompatImageView = (AppCompatImageView)view.findViewById(c.i.Qm);
            n = 2131099943;
        }
        ((ImageView)appCompatImageView).setColorFilter(androidx.core.content.d.f(context, n));
    }
    
    private final void N(final AppCompatTextView appCompatTextView, final boolean b) {
        final Context context = this.getContext();
        if (context == null) {
            return;
        }
        int f;
        if (b) {
            ((TextView)appCompatTextView).setBackground(androidx.core.content.d.i(context, 2131231026));
            f = -1;
        }
        else {
            ((TextView)appCompatTextView).setBackground(androidx.core.content.d.i(context, 2131231025));
            f = androidx.core.content.d.f(context, 2131099943);
        }
        ((TextView)appCompatTextView).setTextColor(f);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onAttach(@e final Context context) {
        k0.p(context, "context");
        super.onAttach(context);
        if (context instanceof h) {
            this.G = (h)context;
            return;
        }
        throw new IllegalStateException("parent must implement delegate");
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final Context context = this.getContext();
        if (context == null) {
            return null;
        }
        final View inflate = layoutInflater.inflate(2131493070, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final h g = this.G;
        if (g != null) {
            final j adapter = new j(context, g.a(), new l<Boolean, j2>() {
                public final void invoke(final boolean b) {
                    AskTeacherAddTeacherFragment.this.M(inflate, b);
                }
            });
            final int sm = c.i.Sm;
            ((RecyclerView)inflate.findViewById(sm)).setAdapter((RecyclerView$h)adapter);
            ((RecyclerView)inflate.findViewById(sm)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(context));
            final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(c.i.Wm);
            k0.o(appCompatEditText, "view.fragment_ask_teacher_search");
            com.untis.mobile.utils.extension.h.A(appCompatEditText, new l<String, j2>() {
                public final void invoke(@e final String s) {
                    k0.p(s, "it");
                    AskTeacherAddTeacherFragment.this.I(inflate, adapter, s);
                }
            });
            ((ImageView)inflate.findViewById(c.i.Pm)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.addteacher.a(this));
            ((ImageView)inflate.findViewById(c.i.Qm)).setOnClickListener((View$OnClickListener)new g(this, adapter));
            this.L(inflate, adapter);
            ((TextView)inflate.findViewById(c.i.Rm)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.addteacher.d(this, inflate, adapter));
            ((TextView)inflate.findViewById(c.i.Xm)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.addteacher.f(this, inflate, adapter));
            ((TextView)inflate.findViewById(c.i.Ym)).setOnClickListener((View$OnClickListener)new b(this, inflate, adapter));
            ((TextView)inflate.findViewById(c.i.Zm)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.addteacher.e(this, inflate, adapter));
            ((TextView)inflate.findViewById(c.i.an)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.addteacher.c(this, inflate, adapter));
            return inflate;
        }
        k0.S("delegate");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "com/untis/mobile/substitutionplanning/askteacher/addteacher/AskTeacherAddTeacherFragment$a", "", "Lcom/untis/mobile/substitutionplanning/askteacher/addteacher/AskTeacherAddTeacherFragment;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final AskTeacherAddTeacherFragment a() {
            return new AskTeacherAddTeacherFragment();
        }
    }
}
