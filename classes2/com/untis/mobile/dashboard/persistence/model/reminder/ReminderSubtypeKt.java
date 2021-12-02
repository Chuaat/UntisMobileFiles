// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.reminder;

import com.untis.mobile.utils.v;
import org.joda.time.n0;
import org.joda.time.t;
import kotlin.h0;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¨\u0006\n" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "Landroid/content/Context;", "context", "", "getTitle", "Lorg/joda/time/t;", "date", "today", "", "isAvailable", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class ReminderSubtypeKt
{
    @e
    public static final String getTitle(@e final ReminderSubtype reminderSubtype, @e final Context context) {
        k0.p(reminderSubtype, "<this>");
        k0.p(context, "context");
        final int n = WhenMappings.$EnumSwitchMapping$0[reminderSubtype.ordinal()];
        String s;
        if (n != 1) {
            String s2;
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        s = context.getString(2131886791);
                        s2 = "context.getString(R.string.shared_twoWeeks_text)";
                    }
                    else {
                        s = context.getString(2131886754);
                        s2 = "context.getString(R.string.shared_oneWeek_text)";
                    }
                }
                else {
                    s = context.getString(2131886786);
                    s2 = "context.getString(R.string.shared_threeDays_text)";
                }
            }
            else {
                s = context.getString(2131886751);
                s2 = "context.getString(R.string.shared_oneDay_text)";
            }
            k0.o(s, s2);
        }
        else {
            s = "";
        }
        return s;
    }
    
    public static final boolean isAvailable(@e final ReminderSubtype reminderSubtype, @e final t t, @e final t t2) {
        k0.p(reminderSubtype, "<this>");
        k0.p(t, "date");
        k0.p(t2, "today");
        final int n = WhenMappings.$EnumSwitchMapping$0[reminderSubtype.ordinal()];
        boolean m = true;
        if (n != 1) {
            t t3;
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        t3 = t.Q(2);
                    }
                    else {
                        t3 = t.Q(1);
                    }
                }
                else {
                    t3 = t.O(3);
                }
            }
            else {
                t3 = t.O(1);
            }
            m = ((org.joda.time.base.e)t3).m((n0)t2);
        }
        return m;
    }
}
