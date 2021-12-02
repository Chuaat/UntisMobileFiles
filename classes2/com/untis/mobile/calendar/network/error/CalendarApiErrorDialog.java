// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.error;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.untis.mobile.utils.extension.h;
import android.os.Parcelable;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import androidx.fragment.app.FragmentManager;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.Log;
import com.untis.mobile.calendar.network.model.CalendarApiError;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/calendar/network/error/CalendarApiErrorDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/j2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "<init>", "()V", "h0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarApiErrorDialog extends DialogFragment
{
    @e
    public static final a h0;
    @e
    private static final String i0 = "api_error";
    @e
    private static final String j0 = "calendar-api-error-dialog";
    
    static {
        h0 = new a(null);
    }
    
    private static final void O(final CalendarApiErrorDialog calendarApiErrorDialog, final View view) {
        k0.p(calendarApiErrorDialog, "this$0");
        calendarApiErrorDialog.u();
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.I(0, 2131952204);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492973, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final Bundle arguments = ((Fragment)this).getArguments();
        CalendarApiError calendarApiError;
        if (arguments == null) {
            calendarApiError = null;
        }
        else {
            calendarApiError = (CalendarApiError)arguments.getParcelable("api_error");
        }
        if (!(calendarApiError instanceof CalendarApiError)) {
            calendarApiError = null;
        }
        if (calendarApiError == null) {
            return null;
        }
        Log.d("untis_log_cal_ser", calendarApiError.toString());
        ((TextView)inflate.findViewById(c.i.ve)).setText((CharSequence)calendarApiError.getErrorMessage());
        ((TextView)inflate.findViewById(c.i.ue)).setText((CharSequence)calendarApiError.getTraceId());
        ((TextView)inflate.findViewById(c.i.te)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.network.error.a(this));
        return inflate;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e" }, d2 = { "com/untis/mobile/calendar/network/error/CalendarApiErrorDialog$a", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/untis/mobile/calendar/network/model/CalendarApiError;", "calendarApiError", "Lkotlin/j2;", "a", "", "ARGUMENTS_ERROR_PARCELABLE", "Ljava/lang/String;", "TAG", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final void a(@e final FragmentManager fragmentManager, @e final CalendarApiError calendarApiError) {
            k0.p(fragmentManager, "fragmentManager");
            k0.p(calendarApiError, "calendarApiError");
            final CalendarApiErrorDialog calendarApiErrorDialog = new CalendarApiErrorDialog();
            h.e((Fragment)calendarApiErrorDialog, new l<Bundle, j2>() {
                public final void a(@e final Bundle bundle) {
                    k0.p(bundle, "$this$arguments");
                    bundle.putParcelable("api_error", (Parcelable)calendarApiError);
                }
            });
            calendarApiErrorDialog.L(fragmentManager, "calendar-api-error-dialog");
        }
    }
}
