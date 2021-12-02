// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.solve.periodpicker;

import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.joda.time.r;
import com.untis.mobile.utils.d0;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import kotlin.text.s;
import java.util.ArrayList;
import com.untis.mobile.substitutionplanning.model.KlasseRefDto;
import java.util.List;
import com.untis.mobile.substitutionplanning.model.SubjectRefDto;
import android.os.Bundle;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import android.graphics.drawable.Drawable;
import com.untis.mobile.substitutionplanning.common.a;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.substitutionplanning.model.SolutionDto;
import android.content.Context;
import androidx.core.content.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.k0;
import android.view.View;
import com.google.gson.GsonBuilder;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.substitutionplanning.model.PeriodConflictDto;
import com.google.gson.Gson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b3\u00104J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0012\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0002H\u0016J\u0006\u0010*\u001a\u00020\nR\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/¨\u00067" }, d2 = { "Lcom/untis/mobile/substitutionplanning/solve/periodpicker/ConflictSolutionPeriodFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/os/Bundle;", "arguments", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "v", "Landroid/view/View;", "view", "", "unitOfDay", "Lkotlin/j2;", "A", "(Landroid/view/View;Ljava/lang/Integer;)V", "u", "y", "z", "E", "t", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto;", "solution", "F", "Lcom/untis/mobile/substitutionplanning/model/SubjectRefDto;", "subject", "", "w", "", "Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "klassen", "x", "C", "Landroid/content/Context;", "context", "onAttach", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "outState", "onSaveInstanceState", "D", "Lcom/untis/mobile/substitutionplanning/solve/periodpicker/c;", "G", "Lcom/untis/mobile/substitutionplanning/solve/periodpicker/c;", "delegate", "I", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "periodConflictDto", "H", "<init>", "()V", "J", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ConflictSolutionPeriodFragment extends UmFragment
{
    @e
    public static final a J;
    @e
    private static final String K = "a";
    @e
    private static final String L = "b";
    private static final Gson M;
    private c G;
    private int H;
    @f
    private PeriodConflictDto I;
    
    static {
        J = new a(null);
        M = new GsonBuilder().create();
    }
    
    private final void A(final View view, final Integer n) {
        boolean b = false;
        Label_0063: {
            if (n != null) {
                final c g = this.G;
                if (g == null) {
                    k0.S("delegate");
                    throw null;
                }
                if (!g.a(n)) {
                    view.setOnClickListener((View$OnClickListener)new b(this, n));
                    b = true;
                    break Label_0063;
                }
            }
            view.setOnClickListener((View$OnClickListener)null);
            b = false;
        }
        view.setFocusable(b);
        view.setClickable(b);
    }
    
    private static final void B(final ConflictSolutionPeriodFragment conflictSolutionPeriodFragment, final Integer n, final View view) {
        k0.p(conflictSolutionPeriodFragment, "this$0");
        conflictSolutionPeriodFragment.u(n);
    }
    
    private final void C(final View view) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final c g = this.G;
        if (g != null) {
            int n;
            if (g.a(this.H)) {
                n = 2131099946;
            }
            else {
                n = 2131099944;
            }
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Pn)).setBackgroundColor(d.f((Context)o, n));
            return;
        }
        k0.S("delegate");
        throw null;
    }
    
    private final void E(final View view) {
        final c g = this.G;
        if (g != null) {
            final SolutionDto c = g.c(this.H);
            if (c == null) {
                this.t(view);
            }
            else {
                this.F(view, c);
            }
            return;
        }
        k0.S("delegate");
        throw null;
    }
    
    private final void F(final View view, final SolutionDto solutionDto) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final SolutionDto.SolutionEnum type = solutionDto.getType();
        final SolutionDto.SolutionEnum substitution = SolutionDto.SolutionEnum.SUBSTITUTION;
        final Drawable drawable = null;
        final String s = null;
        if (type == substitution) {
            final int ct = com.untis.mobile.c.i.ct;
            ((ImageView)view.findViewById(ct)).setVisibility(0);
            final com.untis.mobile.services.image.b a = com.untis.mobile.services.image.b.a;
            final AppCompatImageView appCompatImageView = (AppCompatImageView)view.findViewById(ct);
            k0.o(appCompatImageView, "view.fragment_solve_conflict_option_icon_avatar");
            final TeacherRefDto teacher = solutionDto.getTeacher();
            String imageUrl;
            if (teacher == null) {
                imageUrl = null;
            }
            else {
                imageUrl = teacher.getImageUrl();
            }
            final TeacherRefDto teacher2 = solutionDto.getTeacher();
            String j;
            if (teacher2 == null) {
                j = s;
            }
            else {
                final String displayName = teacher2.getDisplayName();
                if (displayName == null) {
                    j = s;
                }
                else {
                    j = h.J(displayName);
                }
            }
            a.a((Context)o, appCompatImageView, imageUrl, j);
            ((ImageView)view.findViewById(com.untis.mobile.c.i.jC)).setVisibility(4);
        }
        else {
            ((ImageView)view.findViewById(com.untis.mobile.c.i.ct)).setVisibility(4);
            final int jc = com.untis.mobile.c.i.jC;
            final AppCompatImageView appCompatImageView2 = (AppCompatImageView)view.findViewById(jc);
            final SolutionDto.SolutionEnum type2 = solutionDto.getType();
            Drawable c;
            if (type2 == null) {
                c = drawable;
            }
            else {
                c = com.untis.mobile.substitutionplanning.common.a.c(type2, (Context)o);
            }
            appCompatImageView2.setImageDrawable(c);
            ((ImageView)view.findViewById(jc)).setVisibility(0);
        }
    }
    
    public static final /* synthetic */ Gson s() {
        return ConflictSolutionPeriodFragment.M;
    }
    
    private final void t(final View view) {
        ((ImageView)view.findViewById(com.untis.mobile.c.i.jC)).setVisibility(4);
        ((ImageView)view.findViewById(com.untis.mobile.c.i.ct)).setVisibility(4);
    }
    
    private final void u(final int n) {
        final c g = this.G;
        if (g != null) {
            if (!g.a(n)) {
                final c g2 = this.G;
                if (g2 == null) {
                    k0.S("delegate");
                    throw null;
                }
                g2.b(n);
            }
            return;
        }
        k0.S("delegate");
        throw null;
    }
    
    private final PeriodConflictDto v(final Bundle bundle) {
        PeriodConflictDto periodConflictDto;
        try {
            periodConflictDto = ConflictSolutionPeriodFragment.M.fromJson(bundle.getString("b"), PeriodConflictDto.class);
        }
        catch (Exception ex) {
            periodConflictDto = null;
        }
        return periodConflictDto;
    }
    
    private final String w(final SubjectRefDto subjectRefDto) {
        final String s = "";
        String displayName;
        if (subjectRefDto == null) {
            displayName = s;
        }
        else {
            displayName = subjectRefDto.getDisplayName();
            if (displayName == null) {
                displayName = s;
            }
        }
        return displayName;
    }
    
    private final String x(final List<KlasseRefDto> list) {
        final String s = "";
        String s2;
        if (list == null) {
            s2 = s;
        }
        else {
            final ArrayList<String> list2 = new ArrayList<String>();
            final Iterator<KlasseRefDto> iterator = list.iterator();
            while (iterator.hasNext()) {
                final String displayName = iterator.next().getDisplayName();
                if (displayName != null) {
                    list2.add(displayName);
                }
            }
            final Iterator<Object> iterator2 = list2.iterator();
            if (!iterator2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            String s3 = iterator2.next();
            while (iterator2.hasNext()) {
                final String s4 = iterator2.next();
                String c;
                final String s5 = c = s3;
                if (kotlin.text.s.U1((CharSequence)s5) ^ true) {
                    c = k0.C(s5, ", ");
                }
                s3 = k0.C(c, s4);
            }
            s2 = s3;
            if (s2 == null) {
                s2 = s;
            }
        }
        return s2;
    }
    
    private final void y(final View view) {
        ((TextView)view.findViewById(com.untis.mobile.c.i.Sn)).setText((CharSequence)"");
        ((TextView)view.findViewById(com.untis.mobile.c.i.Qn)).setText((CharSequence)"");
        ((TextView)view.findViewById(com.untis.mobile.c.i.Rn)).setText((CharSequence)"");
        this.E(view);
    }
    
    private final void z(final View view) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.Sn);
        final PeriodConflictDto i = this.I;
        String text = "";
        if (i != null) {
            final r j = com.untis.mobile.substitutionplanning.common.a.j(i);
            if (j != null) {
                final String s = d0.s(j);
                if (s != null) {
                    text = s;
                }
            }
        }
        ((TextView)appCompatTextView).setText((CharSequence)text);
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.Qn);
        final PeriodConflictDto k = this.I;
        final SubjectRefDto subjectRefDto = null;
        List<KlasseRefDto> klassen;
        if (k == null) {
            klassen = null;
        }
        else {
            klassen = k.getKlassen();
        }
        ((TextView)appCompatTextView2).setText((CharSequence)this.x(klassen));
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.Rn);
        final PeriodConflictDto l = this.I;
        SubjectRefDto subject;
        if (l == null) {
            subject = subjectRefDto;
        }
        else {
            subject = l.getSubject();
        }
        ((TextView)appCompatTextView3).setText((CharSequence)this.w(subject));
        this.E(view);
    }
    
    public final void D() {
        final View view = this.getView();
        if (view == null) {
            return;
        }
        this.C(view);
        this.E(view);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onAttach(@e final Context context) {
        k0.p(context, "context");
        super.onAttach(context);
        if (context instanceof c) {
            this.G = (c)context;
            return;
        }
        throw new IllegalStateException("parent of ConflictSolutionPeriodFragment must be ConflictSolutionPeriodFragmentDelegate");
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
            if (arguments == null) {
                throw new IllegalStateException("must define arguments for ConflictSolutionPeriodFragment");
            }
        }
        this.H = arguments.getInt("a");
        this.I = this.v(arguments);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493081, viewGroup, false);
        Integer unitOfDay = null;
        if (inflate == null) {
            return null;
        }
        final PeriodConflictDto i = this.I;
        if (i == null) {
            this.y(inflate);
        }
        else {
            this.z(inflate);
        }
        this.C(inflate);
        if (i != null) {
            unitOfDay = i.getUnitOfDay();
        }
        this.A(inflate, unitOfDay);
        return inflate;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("a", this.H);
        bundle.putString("b", ConflictSolutionPeriodFragment.M.toJson(this.I));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "com/untis/mobile/substitutionplanning/solve/periodpicker/ConflictSolutionPeriodFragment$a", "", "", "unitOfDay", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "periodConflictDto", "Lcom/untis/mobile/substitutionplanning/solve/periodpicker/ConflictSolutionPeriodFragment;", "a", "", "BUNDLE_PERIOD_CONFLICT_DTO", "Ljava/lang/String;", "BUNDLE_UNIT_OF_DAY", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final ConflictSolutionPeriodFragment a(final int n, @f final PeriodConflictDto periodConflictDto) {
            final ConflictSolutionPeriodFragment conflictSolutionPeriodFragment = new ConflictSolutionPeriodFragment();
            final Bundle arguments = new Bundle();
            arguments.putInt("a", n);
            arguments.putString("b", ConflictSolutionPeriodFragment.s().toJson(periodConflictDto));
            conflictSolutionPeriodFragment.setArguments(arguments);
            return conflictSolutionPeriodFragment;
        }
    }
}
