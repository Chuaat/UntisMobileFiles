// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.solve.searchteacher;

import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import com.untis.mobile.substitutionplanning.model.SolutionDto;
import android.view.ViewGroup$LayoutParams;
import org.apmem.tools.layouts.FlowLayout$a;
import org.apmem.tools.layouts.FlowLayout;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.substitutionplanning.common.a;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.v;
import com.untis.mobile.substitutionplanning.model.TagDto;
import java.util.ArrayList;
import kotlin.text.s;
import android.view.View;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import androidx.core.content.d;
import java.util.HashSet;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import android.graphics.drawable.Drawable;
import java.util.Set;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.substitutionplanning.model.SolutionTypeOptionDto;
import java.util.List;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BP\u0012\u0006\u0010(\u001a\u00020%\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00070:¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0005R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0016\u00102\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00109\u001a\n 6*\u0004\u0018\u000105058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006A" }, d2 = { "Lcom/untis/mobile/substitutionplanning/solve/searchteacher/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "", "position", "", "k", "Lkotlin/j2;", "p", "Landroid/view/ViewGroup;", "parent", "viewType", "n", "getItemCount", "viewHolder", "l", "", "search", "o", "tag", "q", "j", "I", "paddingTiny", "paddingSmall", "", "g", "Ljava/util/Set;", "i", "()Ljava/util/Set;", "tags", "", "Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "c", "Ljava/util/List;", "filtered", "selectedTagColor", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "textColor", "b", "options", "h", "highlightColor", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "notAvailableIcon", "m", "notAvailableColor", "f", "Ljava/lang/String;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "e", "Landroid/view/LayoutInflater;", "inflater", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "option", "onOptionClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    public static final a o;
    @e
    private final Context a;
    @e
    private final List<SolutionTypeOptionDto> b;
    @e
    private List<SolutionTypeOptionDto> c;
    @e
    private final l<SolutionTypeOptionDto, j2> d;
    private final LayoutInflater e;
    @e
    private String f;
    @e
    private final Set<String> g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    @f
    private final Drawable l;
    private final int m;
    private final int n;
    
    static {
        o = new a(null);
    }
    
    public b(@e final Context a, @e final List<SolutionTypeOptionDto> b, @e final List<SolutionTypeOptionDto> c, @e final l<? super SolutionTypeOptionDto, j2> d) {
        k0.p(a, "context");
        k0.p(b, "options");
        k0.p(c, "filtered");
        k0.p(d, "onOptionClick");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (l<SolutionTypeOptionDto, j2>)d;
        this.e = LayoutInflater.from(a.getApplicationContext());
        this.f = "";
        this.g = new HashSet<String>();
        this.h = androidx.core.content.d.f(a, 2131099946);
        this.i = androidx.core.content.d.f(a, 2131099979);
        this.j = kotlin.math.b.H0(a.getResources().getDimension(2131165280));
        this.k = kotlin.math.b.H0(a.getResources().getDimension(2131165279));
        final Drawable i = androidx.core.content.d.i(a, 2131230887);
        Drawable mutate;
        if (i == null) {
            mutate = null;
        }
        else {
            mutate = i.mutate();
        }
        this.l = mutate;
        this.m = androidx.core.content.d.f(a, 2131099944);
        this.n = androidx.core.content.d.f(a, 2131099942);
        if (mutate != null) {
            mutate.setColorFilter((ColorFilter)new PorterDuffColorFilter(androidx.core.content.d.f(a, 2131099944), PorterDuff$Mode.SRC_ATOP));
        }
    }
    
    private final boolean k(final int n) {
        final int size = this.c.size();
        boolean b = true;
        if (n == size - 1) {
            b = false;
        }
        return b;
    }
    
    private static final void m(final b b, final SolutionTypeOptionDto solutionTypeOptionDto, final View view) {
        k0.p(b, "this$0");
        k0.p(solutionTypeOptionDto, "$option");
        b.d.invoke(solutionTypeOptionDto);
    }
    
    private final void p() {
        List<SolutionTypeOptionDto> a;
        if (s.U1((CharSequence)this.f) && this.g.isEmpty()) {
            a = com.untis.mobile.substitutionplanning.solve.searchteacher.b.o.a(this.b);
        }
        else {
            final List<SolutionTypeOptionDto> b = this.b;
            final ArrayList<SolutionTypeOptionDto> list = new ArrayList<SolutionTypeOptionDto>();
            for (final SolutionTypeOptionDto next : b) {
                final SolutionTypeOptionDto solutionTypeOptionDto = next;
                final TeacherRefDto teacher = solutionTypeOptionDto.getTeacher();
                final boolean b2 = true;
                boolean b3 = false;
                Label_0130: {
                    if (teacher != null) {
                        final String displayName = teacher.getDisplayName();
                        if (displayName != null) {
                            if (!s.S2((CharSequence)displayName, (CharSequence)this.f, true)) {
                                b3 = true;
                                break Label_0130;
                            }
                        }
                    }
                    b3 = false;
                }
                int n = 0;
                Label_0267: {
                    if (!b3) {
                        n = (b2 ? 1 : 0);
                        if (!(this.i().isEmpty() ^ true)) {
                            break Label_0267;
                        }
                        final List<TagDto> tags = solutionTypeOptionDto.getTags();
                        List<String> list2;
                        if (tags == null) {
                            list2 = null;
                        }
                        else {
                            list2 = new ArrayList<String>();
                            final Iterator<Object> iterator2 = tags.iterator();
                            while (iterator2.hasNext()) {
                                final String type = iterator2.next().getType();
                                if (type != null) {
                                    list2.add(type);
                                }
                            }
                        }
                        Object e;
                        if ((e = list2) == null) {
                            e = v.E();
                        }
                        n = (b2 ? 1 : 0);
                        if (((List)e).containsAll(this.i())) {
                            break Label_0267;
                        }
                    }
                    n = 0;
                }
                if (n != 0) {
                    list.add(next);
                }
            }
            a = list;
        }
        this.c = a;
        this.notifyDataSetChanged();
    }
    
    public int getItemCount() {
        return this.c.size();
    }
    
    @e
    public final Set<String> i() {
        return this.g;
    }
    
    public final boolean j() {
        return this.c.isEmpty();
    }
    
    public void l(@e final o0 o0, final int n) {
        k0.p(o0, "viewHolder");
        final SolutionTypeOptionDto solutionTypeOptionDto = this.c.get(n);
        final AppCompatImageView appCompatImageView = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.kC);
        final SolutionDto.SolutionEnum type = solutionTypeOptionDto.getType();
        Drawable imageDrawable;
        if (type == null) {
            imageDrawable = null;
        }
        else {
            final Context context = ((ImageView)appCompatImageView).getContext();
            k0.o(context, "context");
            imageDrawable = com.untis.mobile.substitutionplanning.common.a.c(type, context);
        }
        final Boolean available = solutionTypeOptionDto.isAvailable();
        final Boolean true = Boolean.TRUE;
        if (!k0.g(available, true)) {
            imageDrawable = this.l;
        }
        if (imageDrawable == null) {
            final View itemView = o0.itemView;
            final int ct = com.untis.mobile.c.i.ct;
            ((ImageView)itemView.findViewById(ct)).setVisibility(0);
            final com.untis.mobile.services.image.b a = com.untis.mobile.services.image.b.a;
            final Context context2 = ((ImageView)appCompatImageView).getContext();
            k0.o(context2, "context");
            final AppCompatImageView appCompatImageView2 = (AppCompatImageView)o0.itemView.findViewById(ct);
            k0.o(appCompatImageView2, "viewHolder.itemView.fragment_solve_conflict_option_icon_avatar");
            final TeacherRefDto teacher = solutionTypeOptionDto.getTeacher();
            String imageUrl;
            if (teacher == null) {
                imageUrl = null;
            }
            else {
                imageUrl = teacher.getImageUrl();
            }
            final TeacherRefDto teacher2 = solutionTypeOptionDto.getTeacher();
            String j = null;
            Label_0237: {
                if (teacher2 != null) {
                    final String displayName = teacher2.getDisplayName();
                    if (displayName != null) {
                        j = com.untis.mobile.utils.extension.h.J(displayName);
                        break Label_0237;
                    }
                }
                j = null;
            }
            a.a(context2, appCompatImageView2, imageUrl, j);
        }
        else {
            ((ImageView)appCompatImageView).setColorFilter(androidx.core.content.d.f(((ImageView)appCompatImageView).getContext(), 2131099943));
            ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.lC)).setVisibility(0);
            appCompatImageView.setImageDrawable(imageDrawable);
            final View itemView2 = o0.itemView;
            final int ct2 = com.untis.mobile.c.i.ct;
            ((ImageView)itemView2.findViewById(ct2)).setVisibility(4);
            ((AppCompatImageView)o0.itemView.findViewById(ct2)).setImageDrawable((Drawable)null);
        }
        ((ImageView)appCompatImageView).setVisibility(com.untis.mobile.utils.extension.h.T(imageDrawable != null, 4));
        final View itemView3 = o0.itemView;
        final int rc = com.untis.mobile.c.i.rC;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)itemView3.findViewById(rc);
        final TeacherRefDto teacher3 = solutionTypeOptionDto.getTeacher();
        Object p2 = null;
        Label_0429: {
            if (teacher3 != null) {
                final String displayName2 = teacher3.getDisplayName();
                if (displayName2 != null) {
                    p2 = com.untis.mobile.utils.extension.h.P(displayName2, this.h, this.f);
                    break Label_0429;
                }
            }
            p2 = null;
        }
        ((TextView)appCompatTextView).setText((CharSequence)p2);
        AppCompatTextView appCompatTextView2;
        int textColor;
        if (!k0.g(solutionTypeOptionDto.isAvailable(), true)) {
            appCompatTextView2 = (AppCompatTextView)o0.itemView.findViewById(rc);
            textColor = this.m;
        }
        else {
            appCompatTextView2 = (AppCompatTextView)o0.itemView.findViewById(rc);
            textColor = this.n;
        }
        ((TextView)appCompatTextView2).setTextColor(textColor);
        o0.itemView.setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.solve.searchteacher.a(this, solutionTypeOptionDto));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.pC)).removeAllViews();
        final List<TagDto> tags = solutionTypeOptionDto.getTags();
        if (tags != null) {
            for (final TagDto tagDto : tags) {
                final String translatedMessage = tagDto.getTranslatedMessageFor(this.a);
                if (translatedMessage != null) {
                    final AppCompatTextView appCompatTextView3 = new AppCompatTextView(this.a);
                    final FlowLayout$a flowLayout$a = new FlowLayout$a(-2, -2);
                    ((TextView)appCompatTextView3).setText((CharSequence)translatedMessage);
                    Context context3;
                    int n2;
                    if (v.J1(this.i(), tagDto.getType())) {
                        context3 = ((TextView)appCompatTextView3).getContext();
                        n2 = 2131231026;
                    }
                    else {
                        context3 = ((TextView)appCompatTextView3).getContext();
                        n2 = 2131231024;
                    }
                    ((TextView)appCompatTextView3).setBackground(androidx.core.content.d.i(context3, n2));
                    ((TextView)appCompatTextView3).setTextColor(-1);
                    final int k = this.k;
                    ((TextView)appCompatTextView3).setPadding(k, 0, k, this.j);
                    final int i = this.j;
                    ((ViewGroup$MarginLayoutParams)flowLayout$a).setMargins(0, 0, i, i);
                    ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.pC)).addView((View)appCompatTextView3, (ViewGroup$LayoutParams)flowLayout$a);
                }
            }
        }
        final AppCompatImageView appCompatImageView3 = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.mC);
        final Boolean selected = solutionTypeOptionDto.isSelected();
        int u;
        if (selected == null) {
            u = 8;
        }
        else {
            u = com.untis.mobile.utils.extension.h.U(selected, 0, 1, null);
        }
        ((ImageView)appCompatImageView3).setVisibility(u);
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.iC)).setVisibility(com.untis.mobile.utils.extension.h.U(this.k(n), 0, 1, null));
    }
    
    @e
    public o0 n(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.e.inflate(2131493174, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_conflict_solution_option, parent, false)");
        return new o0(inflate);
    }
    
    public final void o(@e final String f) {
        k0.p(f, "search");
        if (s.K1(this.f, f, true)) {
            return;
        }
        this.f = f;
        this.p();
    }
    
    public final void q(@e final String s) {
        k0.p(s, "tag");
        if (this.g.contains(s)) {
            this.g.remove(s);
        }
        else {
            this.g.add(s);
        }
        this.p();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/substitutionplanning/solve/searchteacher/b$a", "", "", "Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "options", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final List<SolutionTypeOptionDto> a(@e final List<SolutionTypeOptionDto> list) {
            k0.p(list, "options");
            final ArrayList<SolutionTypeOptionDto> list2 = new ArrayList<SolutionTypeOptionDto>();
            for (final SolutionTypeOptionDto next : list) {
                if (k0.g(next.isAvailable(), Boolean.TRUE)) {
                    list2.add(next);
                }
            }
            return list2;
        }
    }
}
