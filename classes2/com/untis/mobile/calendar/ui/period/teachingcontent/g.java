// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.teachingcontent;

import org.joda.time.base.a;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import org.joda.time.c;
import java.util.Iterator;
import android.view.View$OnClickListener;
import androidx.core.content.d;
import android.widget.TextView;
import com.untis.mobile.messages.util.ExtensionsKt;
import java.util.List;
import kotlin.collections.v;
import org.joda.time.l0;
import com.untis.mobile.utils.d0;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentRelatedEntryDto;
import org.joda.time.r;
import java.util.ArrayList;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.j2;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentDto;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/teachingcontent/g;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentDto;", "lessoncontent", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "content", "Lkotlin/j2;", "onLessonContent", "b", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g extends RecyclerView$g0
{
    public g(@e final View view) {
        k0.p(view, "view");
        super(view);
    }
    
    private static final void c(final l l, final CalendarTeachingContentDto calendarTeachingContentDto, final View view) {
        k0.p(l, "$onLessonContent");
        k0.p(calendarTeachingContentDto, "$lessoncontent");
        l.invoke(calendarTeachingContentDto);
    }
    
    @SuppressLint({ "SetTextI18n" })
    public final void b(@e final CalendarTeachingContentDto calendarTeachingContentDto, @e final l<? super CalendarTeachingContentDto, j2> l) {
        k0.p(calendarTeachingContentDto, "lessoncontent");
        k0.p(l, "onLessonContent");
        ((TextView)super.itemView.findViewById(2131297281)).setText((CharSequence)calendarTeachingContentDto.getText());
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)super.itemView.findViewById(2131297280);
        ((ViewGroup)linearLayoutCompat).removeAllViews();
        final List<CalendarTeachingContentRelatedEntryDto> relatedEntries = calendarTeachingContentDto.getRelatedEntries();
        final ArrayList<r> list = new ArrayList<r>();
        for (final CalendarTeachingContentRelatedEntryDto calendarTeachingContentRelatedEntryDto : relatedEntries) {
            final c j = d0.j(calendarTeachingContentRelatedEntryDto.getStartDateTime());
            r r = null;
            if (j != null) {
                final c i = d0.j(calendarTeachingContentRelatedEntryDto.getEndDateTime());
                if (i != null) {
                    r = new r((l0)j, (l0)i);
                }
            }
            if (r != null) {
                list.add((T)r);
            }
        }
        final r r2 = v.t2((List<? extends r>)list);
        if (r2 != null) {
            final AppCompatTextView appCompatTextView = new AppCompatTextView(((ViewGroup)linearLayoutCompat).getContext());
            ExtensionsKt.setTextStyle((TextView)appCompatTextView, 2131952223);
            ((TextView)appCompatTextView).setTextColor(d.f(((ViewGroup)linearLayoutCompat).getContext(), 2131100054));
            ((TextView)appCompatTextView).setText((CharSequence)k0.C(((a)((org.joda.time.base.d)r2).b()).g4("EEE dd.MM.yyyy, HH:mm -"), ((a)((org.joda.time.base.d)r2).s()).g4(" HH:mm")));
            ((ViewGroup)linearLayoutCompat).addView((View)appCompatTextView, -2, -2);
        }
        super.itemView.setOnClickListener((View$OnClickListener)new f(l, calendarTeachingContentDto));
    }
}
