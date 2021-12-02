// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import android.widget.ImageView;
import android.widget.EditText;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.text.TextWatcher;
import com.untis.mobile.utils.n0;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.c;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import com.untis.wu.rest.model.TeacherAbsenceReasonRefDto;
import n6.l;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/SelectReasonFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/content/Context;", "context", "Lkotlin/j2;", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/substitutionplanning/add/y0;", "G", "Lcom/untis/mobile/substitutionplanning/add/y0;", "delegate", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SelectReasonFragment extends UmFragment
{
    @e
    public static final a H;
    @e
    public static final String I = "select-reason-fragment";
    private y0 G;
    
    static {
        H = new a(null);
    }
    
    public static final /* synthetic */ y0 s(final SelectReasonFragment selectReasonFragment) {
        return selectReasonFragment.G;
    }
    
    private static final void t(final SelectReasonFragment selectReasonFragment, final View view) {
        k0.p(selectReasonFragment, "this$0");
        final y0 g = selectReasonFragment.G;
        if (g != null) {
            g.h();
            return;
        }
        k0.S("delegate");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onAttach(@e final Context context) {
        k0.p(context, "context");
        super.onAttach(context);
        if (context instanceof y0) {
            this.G = (y0)context;
            return;
        }
        throw new IllegalStateException("parent context must be delegate".toString());
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493122, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final Context context = this.getContext();
        if (context == null) {
            return null;
        }
        final y0 g = this.G;
        if (g != null) {
            final w0 adapter = new w0(context, g.n(), null, new l<TeacherAbsenceReasonRefDto, j2>() {
                final /* synthetic */ SelectReasonFragment G;
                
                public final void a(@e final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto) {
                    k0.p(teacherAbsenceReasonRefDto, "it");
                    final y0 s = SelectReasonFragment.s(this.G);
                    if (s != null) {
                        s.m(teacherAbsenceReasonRefDto);
                        return;
                    }
                    k0.S("delegate");
                    throw null;
                }
            }, 4, null);
            final int ps = c.i.ps;
            ((RecyclerView)inflate.findViewById(ps)).setAdapter((RecyclerView$h)adapter);
            ((RecyclerView)inflate.findViewById(ps)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(context));
            ((EditText)inflate.findViewById(c.i.rs)).addTextChangedListener((TextWatcher)new n0(new l<String, j2>() {
                public final void invoke(@e final String s) {
                    k0.p(s, "it");
                    final boolean m = adapter.m(s);
                    ((ViewGroup)inflate.findViewById(c.i.ps)).setVisibility(h.T(m, 4));
                    ((ViewGroup)inflate.findViewById(c.i.qs)).setVisibility(h.T(m ^ true, 4));
                }
            }));
            ((ImageView)inflate.findViewById(c.i.os)).setOnClickListener((View$OnClickListener)new x0(this));
            return inflate;
        }
        k0.S("delegate");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "com/untis/mobile/substitutionplanning/add/SelectReasonFragment$a", "", "Lcom/untis/mobile/substitutionplanning/add/SelectReasonFragment;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final SelectReasonFragment a() {
            return new SelectReasonFragment();
        }
    }
}
