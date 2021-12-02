// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.text.s;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.wu.rest.model.TeacherAbsenceReasonRefDto;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\u0006\u0010$\u001a\u00020#\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\r0%¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u001e\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001d¨\u0006," }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/w0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "", "position", "", "i", "Landroid/view/ViewGroup;", "parent", "viewType", "l", "getItemCount", "viewHolder", "Lkotlin/j2;", "j", "", "search", "m", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "f", "I", "highlightColor", "", "Lcom/untis/wu/rest/model/TeacherAbsenceReasonRefDto;", "a", "Ljava/util/List;", "reasons", "e", "Ljava/lang/String;", "b", "filtered", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "reason", "onReasonClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class w0 extends RecyclerView$h<o0>
{
    @e
    private final List<TeacherAbsenceReasonRefDto> a;
    @e
    private List<? extends TeacherAbsenceReasonRefDto> b;
    @e
    private final l<TeacherAbsenceReasonRefDto, j2> c;
    private final LayoutInflater d;
    @e
    private String e;
    private final int f;
    
    public w0(@e final Context context, @e final List<? extends TeacherAbsenceReasonRefDto> a, @e final List<? extends TeacherAbsenceReasonRefDto> b, @e final l<? super TeacherAbsenceReasonRefDto, j2> c) {
        k0.p(context, "context");
        k0.p(a, "reasons");
        k0.p(b, "filtered");
        k0.p(c, "onReasonClick");
        this.a = (List<TeacherAbsenceReasonRefDto>)a;
        this.b = b;
        this.c = (l<TeacherAbsenceReasonRefDto, j2>)c;
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
    
    private static final void k(final w0 w0, final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto, final View view) {
        k0.p(w0, "this$0");
        k0.p(teacherAbsenceReasonRefDto, "$reason");
        w0.c.invoke(teacherAbsenceReasonRefDto);
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "viewHolder");
        final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto = (TeacherAbsenceReasonRefDto)this.b.get(n);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.tC);
        final String displayName = teacherAbsenceReasonRefDto.getDisplayName();
        Object p2;
        if (displayName == null) {
            p2 = null;
        }
        else {
            p2 = h.P(displayName, this.f, this.e);
        }
        ((TextView)appCompatTextView).setText((CharSequence)p2);
        o0.itemView.setOnClickListener((View$OnClickListener)new v0(this, teacherAbsenceReasonRefDto));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.sC)).setVisibility(h.U(this.i(n), 0, 1, null));
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493256, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_sp_select_reason, parent, false)");
        return new o0(inflate);
    }
    
    public final boolean m(@e final String e) {
        k0.p(e, "search");
        if (s.K1(this.e, e, true)) {
            return this.b.isEmpty() ^ true;
        }
        this.e = e;
        List<TeacherAbsenceReasonRefDto> a;
        if (s.U1((CharSequence)e)) {
            a = this.a;
        }
        else {
            final List<TeacherAbsenceReasonRefDto> a2 = this.a;
            final ArrayList<TeacherAbsenceReasonRefDto> list = new ArrayList<TeacherAbsenceReasonRefDto>();
            for (final TeacherAbsenceReasonRefDto next : a2) {
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
