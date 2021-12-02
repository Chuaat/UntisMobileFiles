// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import java.util.Iterator;
import kotlin.text.s;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.wu.rest.model.TeacherRefDto;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BR\u0012\u0006\u0010$\u001a\u00020#\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\r0%¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010 \u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006," }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/a1;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "", "position", "", "i", "Landroid/view/ViewGroup;", "parent", "viewType", "l", "getItemCount", "viewHolder", "Lkotlin/j2;", "j", "", "search", "m", "", "Lcom/untis/wu/rest/model/TeacherRefDto;", "a", "Ljava/util/List;", "teachers", "b", "filtered", "f", "I", "highlightColor", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "e", "Ljava/lang/String;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "teacher", "onTeacherClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a1 extends RecyclerView$h<o0>
{
    @e
    private final List<TeacherRefDto> a;
    @e
    private List<? extends TeacherRefDto> b;
    @e
    private final l<TeacherRefDto, j2> c;
    private final LayoutInflater d;
    @e
    private String e;
    private final int f;
    
    public a1(@e final Context context, @e final List<? extends TeacherRefDto> a, @e final List<? extends TeacherRefDto> b, @e final l<? super TeacherRefDto, j2> c) {
        k0.p(context, "context");
        k0.p(a, "teachers");
        k0.p(b, "filtered");
        k0.p(c, "onTeacherClick");
        this.a = (List<TeacherRefDto>)a;
        this.b = b;
        this.c = (l<TeacherRefDto, j2>)c;
        this.d = LayoutInflater.from(context.getApplicationContext());
        this.e = "";
        this.f = androidx.core.content.d.f(context, 2131099946);
    }
    
    private final boolean i(final int n) {
        final int size = this.b.size();
        boolean b = true;
        if (n == size - 1) {
            b = false;
        }
        return b;
    }
    
    private static final void k(final a1 a1, final TeacherRefDto teacherRefDto, final View view) {
        k0.p(a1, "this$0");
        k0.p(teacherRefDto, "$teacher");
        a1.c.invoke(teacherRefDto);
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "viewHolder");
        final TeacherRefDto teacherRefDto = (TeacherRefDto)this.b.get(n);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.vC);
        final String displayName = teacherRefDto.getDisplayName();
        Object p2;
        if (displayName == null) {
            p2 = null;
        }
        else {
            p2 = h.P(displayName, this.f, this.e);
        }
        ((TextView)appCompatTextView).setText((CharSequence)p2);
        o0.itemView.setOnClickListener((View$OnClickListener)new z0(this, teacherRefDto));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.uC)).setVisibility(h.U(this.i(n), 0, 1, null));
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493257, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_sp_select_teacher, parent, false)");
        return new o0(inflate);
    }
    
    public final boolean m(@e final String e) {
        k0.p(e, "search");
        if (s.K1(this.e, e, true)) {
            return this.b.isEmpty() ^ true;
        }
        this.e = e;
        List<TeacherRefDto> a;
        if (s.U1((CharSequence)e)) {
            a = this.a;
        }
        else {
            final List<TeacherRefDto> a2 = this.a;
            final ArrayList<TeacherRefDto> list = new ArrayList<TeacherRefDto>();
            for (final TeacherRefDto next : a2) {
                final String displayName = next.getDisplayName();
                Boolean value;
                if (displayName == null) {
                    value = null;
                }
                else {
                    value = s.S2((CharSequence)displayName, (CharSequence)e, true);
                }
                if (value != null && value) {
                    list.add(next);
                }
            }
            a = list;
        }
        this.b = a;
        this.notifyDataSetChanged();
        return this.b.isEmpty() ^ true;
    }
}
