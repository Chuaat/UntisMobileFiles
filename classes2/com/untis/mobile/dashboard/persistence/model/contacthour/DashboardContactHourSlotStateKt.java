// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.contacthour;

import org.jetbrains.annotations.f;
import android.graphics.drawable.Drawable;
import androidx.core.content.d;
import kotlin.h0;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\t" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlotState;", "Landroid/content/Context;", "context", "", "getTitle", "", "getColor", "Landroid/graphics/drawable/Drawable;", "getIcon", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class DashboardContactHourSlotStateKt
{
    public static final int getColor(@e final DashboardContactHourSlotState dashboardContactHourSlotState, @e final Context context) {
        k0.p(dashboardContactHourSlotState, "<this>");
        k0.p(context, "context");
        final int n = WhenMappings.$EnumSwitchMapping$0[dashboardContactHourSlotState.ordinal()];
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                n2 = 2131099989;
            }
            else {
                n2 = 2131100004;
            }
        }
        else {
            n2 = 2131099995;
        }
        return d.f(context, n2);
    }
    
    @f
    public static final Drawable getIcon(@e final DashboardContactHourSlotState dashboardContactHourSlotState, @e final Context context) {
        k0.p(dashboardContactHourSlotState, "<this>");
        k0.p(context, "context");
        final int n = WhenMappings.$EnumSwitchMapping$0[dashboardContactHourSlotState.ordinal()];
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                n2 = 2131231087;
            }
            else {
                n2 = 2131231128;
            }
        }
        else {
            n2 = 2131231165;
        }
        return d.i(context, n2);
    }
    
    @e
    public static final String getTitle(@e final DashboardContactHourSlotState dashboardContactHourSlotState, @e final Context context) {
        k0.p(dashboardContactHourSlotState, "<this>");
        k0.p(context, "context");
        final int n = WhenMappings.$EnumSwitchMapping$0[dashboardContactHourSlotState.ordinal()];
        String s;
        String s2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                s = context.getString(2131886249);
                s2 = "context.getString(R.string.contactHours_registeredState_text)";
            }
            else {
                s = context.getString(2131886253);
                s2 = "context.getString(R.string.contactHours_scheduledState_text)";
            }
        }
        else {
            s = context.getString(2131886246);
            s2 = "context.getString(R.string.contactHours_availableState_text)";
        }
        k0.o(s, s2);
        return s;
    }
}
