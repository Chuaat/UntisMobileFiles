// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.askteacher.list;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.annotation.SuppressLint;
import com.untis.mobile.substitutionplanning.model.SubjectRefDto;
import com.untis.mobile.substitutionplanning.model.PeriodDto;
import org.joda.time.r;
import com.untis.mobile.substitutionplanning.model.PeriodConflictDto;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import com.untis.mobile.substitutionplanning.model.TeamTeacherDto;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.utils.d0;
import com.untis.mobile.substitutionplanning.common.a;
import com.untis.mobile.substitutionplanning.model.RoomRefDto;
import com.untis.mobile.substitutionplanning.model.PeriodRoomDto;
import com.untis.mobile.substitutionplanning.model.PeriodKlasseDto;
import java.util.Iterator;
import java.util.ArrayList;
import android.text.SpannableStringBuilder;
import android.text.Spannable;
import com.untis.mobile.substitutionplanning.model.KlasseRefDto;
import kotlin.h0;
import com.untis.mobile.substitutionplanning.model.SubstitutionRequestDtoStateEnum;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.substitutionplanning.model.SubstitutionRequestDto;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BB\u0012\u0006\u00104\u001a\u000201\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020&0:¢\u0006\u0004\b>\u0010?J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013H\u0002J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0013H\u0002J\u0018\u0010\u001e\u001a\u00020\u00162\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0013H\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0018\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\tH\u0017J\u0014\u0010)\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013R\u001e\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106¨\u0006@" }, d2 = { "Lcom/untis/mobile/substitutionplanning/askteacher/list/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "dto", "", "l", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDtoStateEnum;", "state", "", "k", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "teacherDto", "", "isAbsent", "Landroid/view/View;", "j", "Landroid/widget/LinearLayout$LayoutParams;", "i", "", "Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "rooms", "Landroid/text/Spannable;", "s", "Lcom/untis/mobile/substitutionplanning/model/PeriodRoomDto;", "r", "Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "klassen", "p", "Lcom/untis/mobile/substitutionplanning/model/PeriodKlasseDto;", "q", "Landroid/view/ViewGroup;", "parent", "viewType", "o", "getItemCount", "holder", "position", "Lkotlin/j2;", "m", "dtos", "t", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "b", "Ljava/util/List;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "e", "I", "separatorColor", "f", "darkSeparatorColor", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onItemClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private List<SubstitutionRequestDto> b;
    @e
    private final l<SubstitutionRequestDto, j2> c;
    private final LayoutInflater d;
    private final int e;
    private final int f;
    
    public b(@e final Context a, @e final List<SubstitutionRequestDto> b, @e final l<? super SubstitutionRequestDto, j2> c) {
        k0.p(a, "context");
        k0.p(b, "dtos");
        k0.p(c, "onItemClick");
        this.a = a;
        this.b = b;
        this.c = (l<SubstitutionRequestDto, j2>)c;
        this.d = LayoutInflater.from(a.getApplicationContext());
        this.e = androidx.core.content.d.f(a, 2131099943);
        this.f = androidx.core.content.d.f(a, 2131099941);
    }
    
    private final LinearLayout$LayoutParams i() {
        return new LinearLayout$LayoutParams(-2, -2);
    }
    
    private final View j(final TeacherRefDto teacherRefDto, final boolean b) {
        final LayoutInflater d = this.d;
        final String s = null;
        final View inflate = d.inflate(2131493227, (ViewGroup)null, false);
        if (inflate == null) {
            return null;
        }
        final int ma = com.untis.mobile.c.i.mA;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(ma);
        final String displayName = teacherRefDto.getDisplayName();
        if (displayName == null) {
            return null;
        }
        ((TextView)appCompatTextView).setText((CharSequence)displayName);
        final com.untis.mobile.services.image.b a = b.a;
        final Context a2 = this.a;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(com.untis.mobile.c.i.lA);
        k0.o(appCompatImageView, "view.item_my_teacher_absence_teacher_image");
        final String imageUrl = teacherRefDto.getImageUrl();
        final String displayName2 = teacherRefDto.getDisplayName();
        String j;
        if (displayName2 == null) {
            j = s;
        }
        else {
            j = h.J(displayName2);
        }
        a.a(a2, appCompatImageView, imageUrl, j);
        if (b) {
            ((TextView)inflate.findViewById(ma)).setPaintFlags(((TextView)inflate.findViewById(ma)).getPaintFlags() | 0x10);
        }
        return inflate;
    }
    
    private final int k(final SubstitutionRequestDtoStateEnum substitutionRequestDtoStateEnum) {
        final int n = com.untis.mobile.substitutionplanning.askteacher.list.b.a.a[substitutionRequestDtoStateEnum.ordinal()];
        int n2 = 2131100004;
        Context context = null;
        switch (n) {
            default: {
                throw new h0();
            }
            case 4: {
                context = this.a;
                n2 = 2131099990;
                break;
            }
            case 2:
            case 3:
            case 5:
            case 6: {
                context = this.a;
                break;
            }
            case 1: {
                context = this.a;
                n2 = 2131099989;
                break;
            }
        }
        return androidx.core.content.d.f(context, n2);
    }
    
    private final String l(final SubstitutionRequestDto substitutionRequestDto) {
        Context context = null;
        int n = 0;
        switch (com.untis.mobile.substitutionplanning.askteacher.list.b.a.a[substitutionRequestDto.getState().ordinal()]) {
            default: {
                throw new h0();
            }
            case 6: {
                context = this.a;
                n = 2131886151;
                break;
            }
            case 5: {
                context = this.a;
                n = 2131886156;
                break;
            }
            case 4: {
                return null;
            }
            case 3: {
                context = this.a;
                n = 2131886153;
                break;
            }
            case 2: {
                context = this.a;
                n = 2131886142;
                break;
            }
            case 1: {
                context = this.a;
                n = 2131886144;
                break;
            }
        }
        return context.getString(n);
    }
    
    private static final void n(final b b, final SubstitutionRequestDto substitutionRequestDto, final View view) {
        k0.p(b, "this$0");
        k0.p(substitutionRequestDto, "$dto");
        b.c.invoke(substitutionRequestDto);
    }
    
    private final Spannable p(final List<KlasseRefDto> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        final Iterator<KlasseRefDto> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String displayName = iterator.next().getDisplayName();
            if (displayName != null) {
                list2.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, " | ");
                }
                s = k0.C(c, s2);
            }
            return h.N(s, "|", this.e);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    private final Spannable q(final List<PeriodKlasseDto> list) {
        if (list == null || list.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        final Iterator<PeriodKlasseDto> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String displayName = iterator.next().getKlasse().getDisplayName();
            if (displayName != null) {
                list2.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, " | ");
                }
                s = k0.C(c, s2);
            }
            return h.N(s, "|", this.e);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    private final Spannable r(final List<PeriodRoomDto> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        final Iterator<PeriodRoomDto> iterator = list.iterator();
        while (iterator.hasNext()) {
            final RoomRefDto currentRoom = iterator.next().getCurrentRoom();
            String displayName;
            if (currentRoom == null) {
                displayName = null;
            }
            else {
                displayName = currentRoom.getDisplayName();
            }
            if (displayName != null) {
                list2.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, " | ");
                }
                s = k0.C(c, s2);
            }
            return h.N(s, "|", this.e);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    private final Spannable s(final List<RoomRefDto> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        final Iterator<RoomRefDto> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String displayName = iterator.next().getDisplayName();
            if (displayName != null) {
                list2.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, " | ");
                }
                s = k0.C(c, s2);
            }
            return h.N(s, "|", this.e);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    @SuppressLint({ "SetTextI18n" })
    public void m(@e final o0 o0, int n) {
        k0.p(o0, "holder");
        final SubstitutionRequestDto substitutionRequestDto = this.b.get(n);
        final PeriodConflictDto periodConflict = substitutionRequestDto.getPeriodConflict();
        String n2 = null;
        Label_0060: {
            if (periodConflict != null) {
                final r j = com.untis.mobile.substitutionplanning.common.a.j(periodConflict);
                if (j != null) {
                    n2 = d0.n(j);
                    break Label_0060;
                }
            }
            n2 = null;
        }
        String n3 = n2;
        Label_0108: {
            if (n2 == null) {
                final PeriodDto period = substitutionRequestDto.getPeriod();
                if (period != null) {
                    final r k = com.untis.mobile.substitutionplanning.common.a.k(period);
                    if (k != null) {
                        n3 = d0.n(k);
                        break Label_0108;
                    }
                }
                n3 = null;
            }
        }
        final PeriodConflictDto periodConflict2 = substitutionRequestDto.getPeriodConflict();
        String s = null;
        Label_0147: {
            if (periodConflict2 != null) {
                final r i = com.untis.mobile.substitutionplanning.common.a.j(periodConflict2);
                if (i != null) {
                    s = d0.s(i);
                    break Label_0147;
                }
            }
            s = null;
        }
        String s2 = s;
        Label_0195: {
            if (s == null) {
                final PeriodDto period2 = substitutionRequestDto.getPeriod();
                if (period2 != null) {
                    final r l = com.untis.mobile.substitutionplanning.common.a.k(period2);
                    if (l != null) {
                        s2 = d0.s(l);
                        break Label_0195;
                    }
                }
                s2 = null;
            }
        }
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Qz);
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)n3);
        sb.append(" | ");
        sb.append((Object)s2);
        ((TextView)appCompatTextView).setText((CharSequence)h.P(sb.toString(), this.f, "|"));
        final View itemView = o0.itemView;
        n = com.untis.mobile.c.i.Rz;
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)itemView.findViewById(n);
        final PeriodConflictDto periodConflict3 = substitutionRequestDto.getPeriodConflict();
        List<KlasseRefDto> klassen;
        if (periodConflict3 == null) {
            klassen = null;
        }
        else {
            klassen = periodConflict3.getKlassen();
        }
        Spannable text;
        if ((text = this.p(klassen)) == null) {
            final PeriodDto period3 = substitutionRequestDto.getPeriod();
            List<PeriodKlasseDto> klassen2;
            if (period3 == null) {
                klassen2 = null;
            }
            else {
                klassen2 = period3.getKlassen();
            }
            text = this.q(klassen2);
        }
        ((TextView)appCompatTextView2).setText((CharSequence)text);
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView)o0.itemView.findViewById(n);
        k0.o(appCompatTextView3, "holder.itemView.item_my_teacher_absence_detail_klassen");
        h.X(appCompatTextView3);
        final View itemView2 = o0.itemView;
        n = com.untis.mobile.c.i.dA;
        final AppCompatTextView appCompatTextView4 = (AppCompatTextView)itemView2.findViewById(n);
        final PeriodConflictDto periodConflict4 = substitutionRequestDto.getPeriodConflict();
        String displayName = null;
        Label_0451: {
            if (periodConflict4 != null) {
                final SubjectRefDto subject = periodConflict4.getSubject();
                if (subject != null) {
                    displayName = subject.getDisplayName();
                    break Label_0451;
                }
            }
            displayName = null;
        }
        String displayName2 = displayName;
        Label_0499: {
            if (displayName == null) {
                final PeriodDto period4 = substitutionRequestDto.getPeriod();
                if (period4 != null) {
                    final SubjectRefDto subject2 = period4.getSubject();
                    if (subject2 != null) {
                        displayName2 = subject2.getDisplayName();
                        break Label_0499;
                    }
                }
                displayName2 = null;
            }
        }
        ((TextView)appCompatTextView4).setText((CharSequence)displayName2);
        final AppCompatTextView appCompatTextView5 = (AppCompatTextView)o0.itemView.findViewById(n);
        k0.o(appCompatTextView5, "holder.itemView.item_my_teacher_absence_detail_subject");
        h.X(appCompatTextView5);
        final View itemView3 = o0.itemView;
        n = com.untis.mobile.c.i.Vz;
        final AppCompatTextView appCompatTextView6 = (AppCompatTextView)itemView3.findViewById(n);
        final PeriodConflictDto periodConflict5 = substitutionRequestDto.getPeriodConflict();
        List<RoomRefDto> rooms;
        if (periodConflict5 == null) {
            rooms = null;
        }
        else {
            rooms = periodConflict5.getRooms();
        }
        Spannable text2;
        if ((text2 = this.s(rooms)) == null) {
            final PeriodDto period5 = substitutionRequestDto.getPeriod();
            List<PeriodRoomDto> rooms2;
            if (period5 == null) {
                rooms2 = null;
            }
            else {
                rooms2 = period5.getRooms();
            }
            text2 = this.r(rooms2);
        }
        ((TextView)appCompatTextView6).setText((CharSequence)text2);
        final AppCompatTextView appCompatTextView7 = (AppCompatTextView)o0.itemView.findViewById(n);
        k0.o(appCompatTextView7, "holder.itemView.item_my_teacher_absence_detail_rooms");
        h.X(appCompatTextView7);
        final List<TeacherRefDto> d = com.untis.mobile.substitutionplanning.common.a.d(substitutionRequestDto);
        final com.untis.mobile.services.image.b a = com.untis.mobile.services.image.b.a;
        final Context a2 = this.a;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Tz);
        k0.o(appCompatImageView, "holder.itemView.item_my_teacher_absence_detail_original_teacher_image");
        final PeriodConflictDto periodConflict6 = substitutionRequestDto.getPeriodConflict();
        String imageUrl = null;
        Label_0738: {
            if (periodConflict6 != null) {
                final TeacherRefDto originalTeacher = periodConflict6.getOriginalTeacher();
                if (originalTeacher != null) {
                    imageUrl = originalTeacher.getImageUrl();
                    break Label_0738;
                }
            }
            imageUrl = null;
        }
        String imageUrl2 = imageUrl;
        Label_0783: {
            if (imageUrl == null) {
                if (d != null) {
                    final TeacherRefDto teacherRefDto = v.t2((List<? extends TeacherRefDto>)d);
                    if (teacherRefDto != null) {
                        imageUrl2 = teacherRefDto.getImageUrl();
                        break Label_0783;
                    }
                }
                imageUrl2 = null;
            }
        }
        final PeriodConflictDto periodConflict7 = substitutionRequestDto.getPeriodConflict();
        String m = null;
        Label_0837: {
            if (periodConflict7 != null) {
                final TeacherRefDto originalTeacher2 = periodConflict7.getOriginalTeacher();
                if (originalTeacher2 != null) {
                    final String displayName3 = originalTeacher2.getDisplayName();
                    if (displayName3 != null) {
                        m = h.J(displayName3);
                        break Label_0837;
                    }
                }
            }
            m = null;
        }
        String j2 = m;
        Label_0897: {
            if (m == null) {
                if (d != null) {
                    final TeacherRefDto teacherRefDto2 = v.t2((List<? extends TeacherRefDto>)d);
                    if (teacherRefDto2 != null) {
                        final String displayName4 = teacherRefDto2.getDisplayName();
                        if (displayName4 != null) {
                            j2 = h.J(displayName4);
                            break Label_0897;
                        }
                    }
                }
                j2 = null;
            }
        }
        a.a(a2, appCompatImageView, imageUrl2, j2);
        final View itemView4 = o0.itemView;
        n = com.untis.mobile.c.i.Uz;
        final AppCompatTextView appCompatTextView8 = (AppCompatTextView)itemView4.findViewById(n);
        final PeriodConflictDto periodConflict8 = substitutionRequestDto.getPeriodConflict();
        String displayName5 = null;
        Label_0970: {
            if (periodConflict8 != null) {
                final TeacherRefDto originalTeacher3 = periodConflict8.getOriginalTeacher();
                if (originalTeacher3 != null) {
                    displayName5 = originalTeacher3.getDisplayName();
                    break Label_0970;
                }
            }
            displayName5 = null;
        }
        String displayName6 = displayName5;
        Label_1015: {
            if (displayName5 == null) {
                if (d != null) {
                    final TeacherRefDto teacherRefDto3 = v.t2((List<? extends TeacherRefDto>)d);
                    if (teacherRefDto3 != null) {
                        displayName6 = teacherRefDto3.getDisplayName();
                        break Label_1015;
                    }
                }
                displayName6 = null;
            }
        }
        ((TextView)appCompatTextView8).setText((CharSequence)displayName6);
        ((TextView)o0.itemView.findViewById(n)).setPaintFlags(((TextView)o0.itemView.findViewById(n)).getPaintFlags() | 0x10);
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Zz)).setVisibility(8);
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.aA)).setVisibility(8);
        final String l2 = this.l(substitutionRequestDto);
        final View itemView5 = o0.itemView;
        n = com.untis.mobile.c.i.bA;
        ((TextView)itemView5.findViewById(n)).setText((CharSequence)l2);
        ((TextView)o0.itemView.findViewById(n)).setTextColor(this.k(substitutionRequestDto.getState()));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Wz)).setVisibility(h.U(l2 != null, 0, 1, null));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Xz)).setVisibility(h.U(l2 != null, 0, 1, null));
        final View itemView6 = o0.itemView;
        n = com.untis.mobile.c.i.cA;
        itemView6.findViewById(n).setVisibility(0);
        o0.itemView.findViewById(n).setBackgroundColor(this.k(substitutionRequestDto.getState()));
        final PeriodConflictDto periodConflict9 = substitutionRequestDto.getPeriodConflict();
        if (periodConflict9 != null) {
            final List<TeamTeacherDto> teamTeachers = periodConflict9.getTeamTeachers();
            if (teamTeachers != null) {
                for (final TeamTeacherDto teamTeacherDto : teamTeachers) {
                    final TeacherRefDto teacher = teamTeacherDto.getTeacher();
                    if (teacher == null) {
                        continue;
                    }
                    final View j3 = this.j(teacher, k0.g(teamTeacherDto.isAbsent(), Boolean.TRUE));
                    if (j3 == null) {
                        continue;
                    }
                    ((LinearLayout)o0.itemView.findViewById(com.untis.mobile.c.i.eA)).addView(j3, (ViewGroup$LayoutParams)this.i());
                }
            }
        }
        if (d != null) {
            final Iterator<Object> iterator2 = d.iterator();
            n = 0;
            while (iterator2.hasNext()) {
                final TeacherRefDto next = iterator2.next();
                if (n < 0) {
                    v.W();
                }
                final TeacherRefDto teacherRefDto4 = next;
                if (n != 0) {
                    final View j4 = this.j(teacherRefDto4, false);
                    if (j4 != null) {
                        ((LinearLayout)o0.itemView.findViewById(com.untis.mobile.c.i.eA)).addView(j4, (ViewGroup$LayoutParams)this.i());
                    }
                }
                ++n;
            }
        }
        final SubstitutionRequestDtoStateEnum state = substitutionRequestDto.getState();
        final SubstitutionRequestDtoStateEnum pending = SubstitutionRequestDtoStateEnum.PENDING;
        final View itemView7 = o0.itemView;
        if (state == pending) {
            ((ViewGroup)itemView7.findViewById(com.untis.mobile.c.i.Pz)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.list.a(this, substitutionRequestDto));
        }
        else {
            ((ViewGroup)itemView7.findViewById(com.untis.mobile.c.i.Pz)).setOnClickListener((View$OnClickListener)null);
        }
    }
    
    @e
    public o0 o(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493226, viewGroup, false);
        k0.o(inflate, "inflater.inflate(\n                R.layout.item_my_teacher_absence_detail,\n                parent,\n                false\n            )");
        return new o0(inflate);
    }
    
    public final void t(@e final List<SubstitutionRequestDto> b) {
        k0.p(b, "dtos");
        this.b = b;
        this.notifyDataSetChanged();
    }
}
