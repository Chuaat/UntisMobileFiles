// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.solve;

import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import java.util.Iterator;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import com.untis.mobile.substitutionplanning.model.SolutionTypeOptionDto;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import org.apmem.tools.layouts.FlowLayout$a;
import com.untis.mobile.substitutionplanning.model.TagDto;
import kotlin.collections.v;
import org.apmem.tools.layouts.FlowLayout;
import androidx.core.content.d;
import com.untis.mobile.substitutionplanning.model.AskTeacherRequestStateDtoRequestStateEnum;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import org.koin.core.c$a;
import kotlin.math.b;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import android.view.LayoutInflater;
import com.untis.mobile.substitutionplanning.model.AskTeacherRequestStateDto;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\"¢\u0006\u0004\b(\u0010)J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0012¨\u0006*" }, d2 = { "Lcom/untis/mobile/substitutionplanning/solve/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lorg/koin/core/c;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "getItemCount", "holder", "position", "Lkotlin/j2;", "j", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDto;", "i", "l", "K", "I", "paddingTiny", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/services/image/a;", "J", "Lkotlin/b0;", "h", "()Lcom/untis/mobile/services/image/a;", "imageService", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "", "H", "Ljava/util/List;", "dtos", "L", "paddingSmall", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$h<o0> implements c
{
    @e
    private final Context G;
    @e
    private List<AskTeacherRequestStateDto> H;
    private final LayoutInflater I;
    @e
    private final b0 J;
    private final int K;
    private final int L;
    
    public a(@e final Context g, @e final List<AskTeacherRequestStateDto> h) {
        k0.p(g, "context");
        k0.p(h, "dtos");
        this.G = g;
        this.H = h;
        this.I = LayoutInflater.from(g);
        this.J = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.image.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.services.image.a invoke() {
                return (com.untis.mobile.services.image.a)this.G.t(k1.d(com.untis.mobile.services.image.a.class), null, null);
            }
        });
        this.K = b.H0(g.getResources().getDimension(2131165280));
        this.L = b.H0(g.getResources().getDimension(2131165279));
    }
    
    private final com.untis.mobile.services.image.a h() {
        return this.J.getValue();
    }
    
    public int getItemCount() {
        return this.H.size();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @e
    public final AskTeacherRequestStateDto i(final int n) {
        return this.H.get(n);
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final AskTeacherRequestStateDto askTeacherRequestStateDto = this.H.get(n);
        final SolutionTypeOptionDto solutionOption = askTeacherRequestStateDto.getSolutionOption();
        if (solutionOption != null) {
            solutionOption.getTeacher();
        }
        final com.untis.mobile.services.image.a h = this.h();
        final Context g = this.G;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.wu);
        k0.o(appCompatImageView, "holder.itemView.item_ask_teacher_solution_avatar");
        final SolutionTypeOptionDto solutionOption2 = askTeacherRequestStateDto.getSolutionOption();
        String imageUrl = null;
        Label_0113: {
            if (solutionOption2 != null) {
                final TeacherRefDto teacher = solutionOption2.getTeacher();
                if (teacher != null) {
                    imageUrl = teacher.getImageUrl();
                    break Label_0113;
                }
            }
            imageUrl = null;
        }
        final SolutionTypeOptionDto solutionOption3 = askTeacherRequestStateDto.getSolutionOption();
        String j = null;
        Label_0167: {
            if (solutionOption3 != null) {
                final TeacherRefDto teacher2 = solutionOption3.getTeacher();
                if (teacher2 != null) {
                    final String displayName = teacher2.getDisplayName();
                    if (displayName != null) {
                        j = com.untis.mobile.utils.extension.h.J(displayName);
                        break Label_0167;
                    }
                }
            }
            j = null;
        }
        h.a(g, appCompatImageView, imageUrl, j);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Bu);
        final SolutionTypeOptionDto solutionOption4 = askTeacherRequestStateDto.getSolutionOption();
        CharSequence displayName2 = null;
        Label_0236: {
            if (solutionOption4 != null) {
                final TeacherRefDto teacher3 = solutionOption4.getTeacher();
                if (teacher3 != null) {
                    displayName2 = teacher3.getDisplayName();
                    break Label_0236;
                }
            }
            displayName2 = null;
        }
        ((TextView)appCompatTextView).setText(displayName2);
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.zu);
        Context context;
        int n2;
        if (askTeacherRequestStateDto.getRequestState() == AskTeacherRequestStateDtoRequestStateEnum.PENDING) {
            context = ((ImageView)appCompatImageView2).getContext();
            n2 = 2131231045;
        }
        else {
            context = ((ImageView)appCompatImageView2).getContext();
            n2 = 2131231044;
        }
        appCompatImageView2.setImageDrawable(d.i(context, n2));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Au)).removeAllViews();
        final SolutionTypeOptionDto solutionOption5 = askTeacherRequestStateDto.getSolutionOption();
        Iterable<TagDto> tags;
        if (solutionOption5 == null) {
            tags = null;
        }
        else {
            tags = solutionOption5.getTags();
        }
        Object e = tags;
        if (tags == null) {
            e = v.E();
        }
        final Iterator<TagDto> iterator = ((Iterable<TagDto>)e).iterator();
        while (iterator.hasNext()) {
            final String translatedMessage = iterator.next().getTranslatedMessageFor(this.G);
            if (translatedMessage != null) {
                final AppCompatTextView appCompatTextView2 = new AppCompatTextView(this.G);
                final FlowLayout$a flowLayout$a = new FlowLayout$a(-2, -2);
                ((TextView)appCompatTextView2).setText((CharSequence)translatedMessage);
                ((TextView)appCompatTextView2).setBackground(d.i(this.G, 2131231022));
                ((TextView)appCompatTextView2).setTextColor(-1);
                final int l = this.L;
                ((TextView)appCompatTextView2).setPadding(l, 0, l, 0);
                final int k = this.K;
                ((ViewGroup$MarginLayoutParams)flowLayout$a).setMargins(0, 0, k, k);
                ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Au)).addView((View)appCompatTextView2, (ViewGroup$LayoutParams)flowLayout$a);
            }
        }
        final View itemView = o0.itemView;
        final int au = com.untis.mobile.c.i.Au;
        ((ViewGroup)itemView.findViewById(au)).setVisibility(com.untis.mobile.utils.extension.h.U(((ViewGroup)o0.itemView.findViewById(au)).getChildCount() > 0, 0, 1, null));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.yu)).setVisibility(com.untis.mobile.utils.extension.h.U(n < this.getItemCount() - 1, 0, 1, null));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.I.inflate(2131493165, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_ask_teacher_solution, parent, false)");
        return new o0(inflate);
    }
    
    public final void l(final int n) {
        this.H.remove(n);
        this.notifyItemRemoved(n);
    }
}
