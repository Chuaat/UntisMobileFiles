// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.notes;

import android.widget.TextView;
import android.widget.ImageView;
import kotlin.b0;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.k0;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import android.os.Bundle;
import n6.a;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/notes/CalendarPeriodLessonInfoFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/notes/b;", "G", "Landroidx/navigation/m;", "s", "()Lcom/untis/mobile/calendar/ui/period/notes/b;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodLessonInfoFragment extends UmFragment
{
    @e
    private final m G;
    
    public CalendarPeriodLessonInfoFragment() {
        this.G = new m(k1.d(b.class), (a)new a<Bundle>() {
            final /* synthetic */ Fragment G;
            
            @e
            @Override
            public final Bundle invoke() {
                final Bundle arguments = this.G.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this.G);
                sb.append(" has null arguments");
                throw new IllegalStateException(sb.toString());
            }
        });
    }
    
    private final b s() {
        return ((b0<b>)this.G).getValue();
    }
    
    private static final void t(final CalendarPeriodLessonInfoFragment calendarPeriodLessonInfoFragment, final View view) {
        k0.p(calendarPeriodLessonInfoFragment, "this$0");
        calendarPeriodLessonInfoFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492984, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(2131297141)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.notes.a(this));
        ((TextView)inflate.findViewById(2131297143)).setText((CharSequence)this.s().d());
        return inflate;
    }
}
