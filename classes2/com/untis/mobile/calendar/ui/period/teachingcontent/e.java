// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.teachingcontent;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentDto;
import n6.l;
import org.jetbrains.annotations.f;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B6\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/teachingcontent/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/calendar/ui/period/teachingcontent/g;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "holder", "position", "Lkotlin/j2;", "h", "getItemCount", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "content", "j", "a", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "lessonContent", "Lkotlin/Function1;", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentDto;", "Lkotlin/t0;", "name", "onLessonContent", "<init>", "(Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e extends RecyclerView$h<g>
{
    @f
    private CalendarTeachingContentsResponse a;
    @org.jetbrains.annotations.e
    private final l<CalendarTeachingContentDto, j2> b;
    
    public e(@f final CalendarTeachingContentsResponse a, @org.jetbrains.annotations.e final l<? super CalendarTeachingContentDto, j2> b) {
        k0.p(b, "onLessonContent");
        this.a = a;
        this.b = (l<CalendarTeachingContentDto, j2>)b;
    }
    
    public int getItemCount() {
        final CalendarTeachingContentsResponse a = this.a;
        int size = 0;
        if (a != null) {
            final List<CalendarTeachingContentDto> teachingContents = a.getTeachingContents();
            if (teachingContents != null) {
                size = teachingContents.size();
            }
        }
        return size;
    }
    
    public void h(@org.jetbrains.annotations.e final g g, final int n) {
        k0.p(g, "holder");
        final CalendarTeachingContentsResponse a = this.a;
        CalendarTeachingContentDto calendarTeachingContentDto = null;
        if (a != null) {
            final List<CalendarTeachingContentDto> teachingContents = a.getTeachingContents();
            if (teachingContents != null) {
                calendarTeachingContentDto = teachingContents.get(n);
            }
        }
        if (calendarTeachingContentDto == null) {
            return;
        }
        g.b(calendarTeachingContentDto, this.b);
    }
    
    @org.jetbrains.annotations.e
    public g i(@org.jetbrains.annotations.e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493000, viewGroup, false);
        k0.o(inflate, "from(parent.context)\n                .inflate(R.layout.calendar_item_previous_lessoncontent, parent, false)");
        return new g(inflate);
    }
    
    public final void j(@org.jetbrains.annotations.e final CalendarTeachingContentsResponse a) {
        k0.p(a, "content");
        this.a = a;
        this.notifyDataSetChanged();
    }
}
