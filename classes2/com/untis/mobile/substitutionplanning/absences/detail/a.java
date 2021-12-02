// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences.detail;

import android.widget.ImageView;
import android.widget.TextView;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import com.untis.mobile.substitutionplanning.model.TeacherAbsenceDto;
import android.content.Context;
import com.untis.mobile.substitutionplanning.model.ConflictType;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.services.image.b;
import com.untis.mobile.utils.extension.q;
import com.untis.mobile.substitutionplanning.absences.d;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.substitutionplanning.model.PeriodDto;
import kotlin.jvm.internal.k0;
import android.view.View;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.model.PeriodGroupDto;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\r" }, d2 = { "Lcom/untis/mobile/substitutionplanning/absences/detail/a;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "period", "Lkotlin/j2;", "a", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "periodGroupDto", "Landroid/view/View;", "view", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$g0
{
    @e
    private final PeriodGroupDto a;
    
    public a(@e final PeriodGroupDto a, @e final View view) {
        k0.p(a, "periodGroupDto");
        k0.p(view, "view");
        super(view);
        this.a = a;
    }
    
    public final void a(@e final PeriodDto periodDto) {
        k0.p(periodDto, "period");
        final Context context = super.itemView.getContext();
        final AppCompatTextView appCompatTextView = (AppCompatTextView)super.itemView.findViewById(c.i.Qz);
        k0.o(context, "context");
        ((TextView)appCompatTextView).setText((CharSequence)d.f(periodDto, context));
        final View itemView = super.itemView;
        final int rz = c.i.Rz;
        ((TextView)itemView.findViewById(rz)).setText((CharSequence)d.g(periodDto, context));
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)super.itemView.findViewById(rz);
        k0.o(appCompatTextView2, "itemView.item_my_teacher_absence_detail_klassen");
        String imageUrl = null;
        q.e(appCompatTextView2, null, 0, 3, null);
        final View itemView2 = super.itemView;
        final int da = c.i.dA;
        ((TextView)itemView2.findViewById(da)).setText((CharSequence)d.i(periodDto));
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView)super.itemView.findViewById(da);
        k0.o(appCompatTextView3, "itemView.item_my_teacher_absence_detail_subject");
        q.e(appCompatTextView3, null, 0, 3, null);
        final View itemView3 = super.itemView;
        final int vz = c.i.Vz;
        ((TextView)itemView3.findViewById(vz)).setText((CharSequence)d.h(periodDto, context));
        final AppCompatTextView appCompatTextView4 = (AppCompatTextView)super.itemView.findViewById(vz);
        k0.o(appCompatTextView4, "itemView.item_my_teacher_absence_detail_rooms");
        q.e(appCompatTextView4, null, 0, 3, null);
        final TeacherAbsenceDto absence = this.a.getGroup().getAbsence();
        if (absence != null) {
            final TeacherRefDto teacher = absence.getTeacher();
            if (teacher != null) {
                imageUrl = teacher.getImageUrl();
            }
        }
        final TeacherAbsenceDto absence2 = this.a.getGroup().getAbsence();
        String text = "";
        if (absence2 != null) {
            final TeacherRefDto teacher2 = absence2.getTeacher();
            if (teacher2 != null) {
                final String displayName = teacher2.getDisplayName();
                if (displayName != null) {
                    text = displayName;
                }
            }
        }
        final b a = b.a;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)super.itemView.findViewById(c.i.Tz);
        k0.o(appCompatImageView, "itemView.item_my_teacher_absence_detail_original_teacher_image");
        a.a(context, appCompatImageView, imageUrl, h.J(text));
        final View itemView4 = super.itemView;
        final int uz = c.i.Uz;
        ((TextView)itemView4.findViewById(uz)).setText((CharSequence)text);
        final AppCompatTextView appCompatTextView5 = (AppCompatTextView)super.itemView.findViewById(uz);
        k0.o(appCompatTextView5, "itemView.item_my_teacher_absence_detail_original_teacher_title");
        q.c(appCompatTextView5);
        final View itemView5 = super.itemView;
        final int xz = c.i.Xz;
        ((ImageView)itemView5.findViewById(xz)).setVisibility(4);
        final View itemView6 = super.itemView;
        final int aa = c.i.aA;
        ((ImageView)itemView6.findViewById(aa)).setVisibility(4);
        final View itemView7 = super.itemView;
        final int ba = c.i.bA;
        ((TextView)itemView7.findViewById(ba)).setVisibility(4);
        final View itemView8 = super.itemView;
        final int ca = c.i.cA;
        itemView8.findViewById(ca).setVisibility(0);
        final ConflictType b = d.b(periodDto);
        if (b != ConflictType.NO_CONFLICT) {
            if (b != ConflictType.OPEN_CONFLICT) {
                if (b != ConflictType.TEACHER_SUPERVISION) {
                    if (b != ConflictType.ROOM_SHARING) {
                        if (b == ConflictType.SUBSTITUTION) {
                            super.itemView.findViewById(ca).setBackgroundColor(androidx.core.content.d.f(context, 2131100068));
                            ((ImageView)super.itemView.findViewById(xz)).setVisibility(0);
                            final TeacherRefDto k = d.k(periodDto);
                            if (k == null) {
                                return;
                            }
                            ((ImageView)super.itemView.findViewById(aa)).setVisibility(0);
                            final AppCompatImageView appCompatImageView2 = (AppCompatImageView)super.itemView.findViewById(aa);
                            k0.o(appCompatImageView2, "itemView.item_my_teacher_absence_detail_solution_image");
                            a.a(context, appCompatImageView2, k.getImageUrl(), h.J(k.getDisplayName()));
                            ((TextView)super.itemView.findViewById(ba)).setVisibility(0);
                            ((TextView)super.itemView.findViewById(ba)).setText((CharSequence)k.getDisplayName());
                        }
                        else if (b == ConflictType.NO_SUBSTITUTION) {
                            super.itemView.findViewById(ca).setBackgroundColor(androidx.core.content.d.f(context, 2131100068));
                            ((ImageView)super.itemView.findViewById(xz)).setVisibility(0);
                            ((ImageView)super.itemView.findViewById(aa)).setVisibility(0);
                            ((AppCompatImageView)super.itemView.findViewById(aa)).setImageDrawable(androidx.core.content.d.i(context, 2131230944));
                            ((TextView)super.itemView.findViewById(ba)).setVisibility(0);
                            ((TextView)super.itemView.findViewById(ba)).setText(2131886822);
                        }
                        else {
                            final ConflictType ask_TEACHER = ConflictType.ASK_TEACHER;
                        }
                    }
                }
            }
        }
    }
}
