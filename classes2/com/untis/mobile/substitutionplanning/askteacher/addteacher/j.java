// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.askteacher.addteacher;

import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import org.apmem.tools.layouts.FlowLayout$a;
import org.apmem.tools.layouts.FlowLayout;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import org.koin.core.c$a;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import java.util.Iterator;
import kotlin.collections.v;
import com.untis.mobile.substitutionplanning.model.TagDto;
import java.util.Collection;
import kotlin.text.s;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.math.b;
import androidx.core.content.d;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import java.util.Set;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.substitutionplanning.model.SolutionTypeOptionDto;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B@\u0012\u0006\u0010<\u001a\u000209\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b\u0012!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00060G¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0016J\u0014\u0010\u001d\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001bR\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020!0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020!0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010%R\u0016\u00106\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010A\u001a\n >*\u0004\u0018\u00010=0=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00105R\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010(R=\u0010K\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00060G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001d\u0010V\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00105¨\u0006[" }, d2 = { "Lcom/untis/mobile/substitutionplanning/askteacher/addteacher/j;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lorg/koin/core/c;", "Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "dto", "Lkotlin/j2;", "y", "", "p", "withSelection", "i", "u", "Landroid/view/ViewGroup;", "parent", "", "viewType", "t", "getItemCount", "holder", "position", "r", "", "tag", "z", "filter", "A", "", "options", "B", "x", "o", "q", "", "k", "", "O", "Ljava/util/Set;", "checkedTeacherIds", "H", "Ljava/util/List;", "n", "()Ljava/util/List;", "w", "(Ljava/util/List;)V", "M", "filterTags", "K", "Z", "allToggle", "P", "deselectedTeacherIds", "S", "I", "paddingSmall", "L", "Ljava/lang/String;", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "J", "Landroid/view/LayoutInflater;", "inflater", "Q", "highlightColor", "", "N", "filtered", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "hasSelection", "onItemSelect", "Ln6/l;", "m", "()Ln6/l;", "v", "(Ln6/l;)V", "Lcom/untis/mobile/services/image/a;", "T", "Lkotlin/b0;", "l", "()Lcom/untis/mobile/services/image/a;", "imageService", "R", "paddingTiny", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j extends RecyclerView$h<o0> implements c
{
    @e
    private final Context G;
    @e
    private List<SolutionTypeOptionDto> H;
    @e
    private l<? super Boolean, j2> I;
    private final LayoutInflater J;
    private boolean K;
    @e
    private String L;
    @e
    private final Set<String> M;
    @e
    private final List<SolutionTypeOptionDto> N;
    @e
    private final Set<Long> O;
    @e
    private final Set<Long> P;
    private final int Q;
    private final int R;
    private final int S;
    @e
    private final b0 T;
    
    public j(@e final Context g, @e final List<SolutionTypeOptionDto> h, @e final l<? super Boolean, j2> i) {
        k0.p(g, "context");
        k0.p(h, "options");
        k0.p(i, "onItemSelect");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = LayoutInflater.from(g.getApplicationContext());
        this.L = "";
        this.M = new HashSet<String>();
        this.N = new ArrayList<SolutionTypeOptionDto>();
        this.O = new HashSet<Long>();
        this.P = new HashSet<Long>();
        this.Q = d.f(g, 2131099946);
        this.R = b.H0(g.getResources().getDimension(2131165280));
        this.S = b.H0(g.getResources().getDimension(2131165279));
        this.T = d0.c((a<?>)new a<com.untis.mobile.services.image.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.services.image.a invoke() {
                return (com.untis.mobile.services.image.a)this.G.t(k1.d(com.untis.mobile.services.image.a.class), null, null);
            }
        });
        this.i(false);
    }
    
    private final boolean i(final boolean b) {
        this.N.clear();
        if (s.U1((CharSequence)this.L) && this.M.isEmpty()) {
            this.N.addAll(this.H);
        }
        else {
            for (final SolutionTypeOptionDto solutionTypeOptionDto : this.H) {
                final TeacherRefDto teacher = solutionTypeOptionDto.getTeacher();
                boolean b2 = false;
                if (teacher != null) {
                    final String displayName = teacher.getDisplayName();
                    if (displayName != null) {
                        if (!s.S2((CharSequence)displayName, (CharSequence)this.L, true)) {
                            b2 = true;
                        }
                    }
                }
                if (b2) {
                    continue;
                }
                if (this.M.isEmpty() ^ true) {
                    final List<TagDto> tags = solutionTypeOptionDto.getTags();
                    List<String> list;
                    if (tags == null) {
                        list = null;
                    }
                    else {
                        list = new ArrayList<String>();
                        final Iterator<Object> iterator2 = tags.iterator();
                        while (iterator2.hasNext()) {
                            final String type = iterator2.next().getType();
                            if (type != null) {
                                list.add(type);
                            }
                        }
                    }
                    Object e;
                    if ((e = list) == null) {
                        e = v.E();
                    }
                    if (!((List)e).containsAll(this.M)) {
                        continue;
                    }
                }
                this.N.add(solutionTypeOptionDto);
            }
        }
        if (b) {
            this.u();
        }
        this.notifyDataSetChanged();
        return this.N.isEmpty() ^ true;
    }
    
    static /* synthetic */ boolean j(final j j, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        return j.i(b);
    }
    
    private final com.untis.mobile.services.image.a l() {
        return this.T.getValue();
    }
    
    private final boolean p(final SolutionTypeOptionDto solutionTypeOptionDto) {
        final TeacherRefDto teacher = solutionTypeOptionDto.getTeacher();
        Long value;
        if (teacher == null) {
            value = null;
        }
        else {
            value = teacher.getId();
        }
        return value != null && this.O.contains(value);
    }
    
    private static final void s(final j j, final SolutionTypeOptionDto solutionTypeOptionDto, final o0 o0, final View view) {
        k0.p(j, "this$0");
        k0.p(solutionTypeOptionDto, "$dto");
        k0.p(o0, "$holder");
        j.y(solutionTypeOptionDto);
        final boolean p4 = j.p(solutionTypeOptionDto);
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.su)).setVisibility(h.T(p4, 4));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.tu)).setVisibility(h.T(p4 ^ true, 4));
        j.m().invoke(j.k().isEmpty() ^ true);
    }
    
    private final void u() {
        this.O.clear();
        final Iterator<SolutionTypeOptionDto> iterator = this.N.iterator();
        while (iterator.hasNext()) {
            final TeacherRefDto teacher = iterator.next().getTeacher();
            Long value;
            if (teacher == null) {
                value = null;
            }
            else {
                value = teacher.getId();
            }
            if (value == null) {
                continue;
            }
            final long longValue = value;
            if (this.P.contains(longValue)) {
                continue;
            }
            this.O.add(longValue);
        }
    }
    
    private final void y(final SolutionTypeOptionDto solutionTypeOptionDto) {
        final TeacherRefDto teacher = solutionTypeOptionDto.getTeacher();
        Long value;
        if (teacher == null) {
            value = null;
        }
        else {
            value = teacher.getId();
        }
        if (value == null) {
            return;
        }
        final long longValue = value;
        if (this.O.contains(longValue)) {
            this.O.remove(longValue);
            this.P.add(longValue);
        }
        else {
            this.O.add(longValue);
            this.P.remove(longValue);
        }
    }
    
    public final void A(@e final String l) {
        k0.p(l, "filter");
        if (k0.g(this.L, l)) {
            return;
        }
        this.L = l;
        j(this, false, 1, null);
    }
    
    public final void B(@e final List<SolutionTypeOptionDto> h) {
        k0.p(h, "options");
        this.H = h;
        j(this, false, 1, null);
    }
    
    public int getItemCount() {
        return this.N.size();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @e
    public final List<Long> k() {
        return v.I5((Iterable<? extends Long>)this.O);
    }
    
    @e
    public final l<Boolean, j2> m() {
        return (l<Boolean, j2>)this.I;
    }
    
    @e
    public final List<SolutionTypeOptionDto> n() {
        return this.H;
    }
    
    public final boolean o() {
        return this.K;
    }
    
    public final boolean q() {
        return this.N.isEmpty();
    }
    
    public void r(@e final o0 o0, int n) {
        k0.p(o0, "holder");
        final SolutionTypeOptionDto solutionTypeOptionDto = this.N.get(n);
        final boolean p2 = this.p(solutionTypeOptionDto);
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.su)).setVisibility(h.T(p2, 4));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.tu)).setVisibility(h.T(p2 ^ true, 4));
        final com.untis.mobile.services.image.a l = this.l();
        final Context g = this.G;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.ru);
        k0.o(appCompatImageView, "holder.itemView.item_ask_teacher_option_avatar");
        final TeacherRefDto teacher = solutionTypeOptionDto.getTeacher();
        final CharSequence charSequence = null;
        String imageUrl;
        if (teacher == null) {
            imageUrl = null;
        }
        else {
            imageUrl = teacher.getImageUrl();
        }
        final TeacherRefDto teacher2 = solutionTypeOptionDto.getTeacher();
        String j = null;
        Label_0175: {
            if (teacher2 != null) {
                final String displayName = teacher2.getDisplayName();
                if (displayName != null) {
                    j = h.J(displayName);
                    break Label_0175;
                }
            }
            j = null;
        }
        l.a(g, appCompatImageView, imageUrl, j);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.vu);
        final TeacherRefDto teacher3 = solutionTypeOptionDto.getTeacher();
        Object p3;
        if (teacher3 == null) {
            p3 = charSequence;
        }
        else {
            final String displayName2 = teacher3.getDisplayName();
            if (displayName2 == null) {
                p3 = charSequence;
            }
            else {
                p3 = h.P(displayName2, this.Q, this.L);
            }
        }
        ((TextView)appCompatTextView).setText((CharSequence)p3);
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.uu)).removeAllViews();
        final List<TagDto> tags = solutionTypeOptionDto.getTags();
        if (tags != null) {
            for (final TagDto tagDto : tags) {
                final String translatedMessage = tagDto.getTranslatedMessageFor(this.G);
                if (translatedMessage != null) {
                    final AppCompatTextView appCompatTextView2 = new AppCompatTextView(this.G);
                    final FlowLayout$a flowLayout$a = new FlowLayout$a(-2, -2);
                    ((TextView)appCompatTextView2).setText((CharSequence)translatedMessage);
                    Context context;
                    if (v.J1(this.M, tagDto.getType())) {
                        context = ((TextView)appCompatTextView2).getContext();
                        n = 2131231026;
                    }
                    else {
                        context = ((TextView)appCompatTextView2).getContext();
                        n = 2131231024;
                    }
                    ((TextView)appCompatTextView2).setBackground(d.i(context, n));
                    ((TextView)appCompatTextView2).setTextColor(-1);
                    n = this.S;
                    ((TextView)appCompatTextView2).setPadding(n, 0, n, this.R);
                    n = this.R;
                    ((ViewGroup$MarginLayoutParams)flowLayout$a).setMargins(0, 0, n, n);
                    ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.uu)).addView((View)appCompatTextView2, (ViewGroup$LayoutParams)flowLayout$a);
                }
            }
        }
        o0.itemView.setOnClickListener((View$OnClickListener)new i(this, solutionTypeOptionDto, o0));
    }
    
    @e
    public o0 t(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.J.inflate(2131493164, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_ask_teacher_option, parent, false)");
        return new o0(inflate);
    }
    
    public final void v(@e final l<? super Boolean, j2> i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    public final void w(@e final List<SolutionTypeOptionDto> h) {
        k0.p(h, "<set-?>");
        this.H = h;
    }
    
    public final boolean x() {
        this.M.clear();
        if (this.o()) {
            this.K = false;
            this.O.clear();
            this.i(false);
            return false;
        }
        this.K = true;
        this.O.clear();
        final Set<Long> o = this.O;
        final List<SolutionTypeOptionDto> h = this.H;
        final ArrayList<Long> list = new ArrayList<Long>();
        final Iterator<Object> iterator = h.iterator();
        while (iterator.hasNext()) {
            final TeacherRefDto teacher = iterator.next().getTeacher();
            Long value;
            if (teacher == null) {
                value = null;
            }
            else {
                value = teacher.getId();
            }
            if (value != null) {
                list.add(value);
            }
        }
        final ArrayList<Long> list2 = new ArrayList<Long>();
        for (final Long next : list) {
            if (this.P.contains(next.longValue()) ^ true) {
                list2.add(next);
            }
        }
        o.addAll(list2);
        this.i(false);
        return true;
    }
    
    public final boolean z(@e final String s) {
        k0.p(s, "tag");
        if (this.M.contains(s)) {
            this.M.remove(s);
            this.O.clear();
            this.i(false);
            return false;
        }
        this.K = false;
        this.M.add(s);
        j(this, false, 1, null);
        return true;
    }
}
