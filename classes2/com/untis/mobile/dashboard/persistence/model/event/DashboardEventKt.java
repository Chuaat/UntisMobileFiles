// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.event;

import kotlin.h0;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import android.content.Context;
import com.untis.mobile.utils.d0;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0000¨\u0006\b" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "Landroid/content/Context;", "context", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "reminderSubtype", "", "toReminderTitle", "toReminderDescription", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class DashboardEventKt
{
    @e
    public static final String toReminderDescription(@e final DashboardEvent dashboardEvent) {
        k0.p(dashboardEvent, "<this>");
        final StringBuilder sb = new StringBuilder();
        if ((s.U1((CharSequence)dashboardEvent.getTitle()) ^ true) && dashboardEvent.getEventType() != ReminderType.DashboardUpcomingHomework && dashboardEvent.getEventType() != ReminderType.DashboardUpcomingLocalHomework) {
            sb.append(k0.C(dashboardEvent.getTitle(), "\n"));
        }
        if ((s.U1((CharSequence)dashboardEvent.getEntityTitle()) ^ true) && dashboardEvent.getEntityIds().size() > 1) {
            sb.append(k0.C(dashboardEvent.getEntityTitle(), "\n"));
        }
        sb.append(k0.C(d0.n(dashboardEvent.getInterval()), "\n"));
        if (dashboardEvent.getEventType() == ReminderType.DashboardUpcomingExam) {
            sb.append(k0.C(d0.s(dashboardEvent.getInterval()), "\n"));
        }
        if (s.U1((CharSequence)dashboardEvent.getSubject()) ^ true) {
            sb.append(k0.C(dashboardEvent.getSubject(), "\n"));
        }
        if (s.U1((CharSequence)dashboardEvent.getText()) ^ true) {
            sb.append(k0.C(dashboardEvent.getText(), "\n"));
        }
        final String string = sb.toString();
        k0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    public static final String toReminderTitle(@e final DashboardEvent dashboardEvent, @e final Context context, @e final ReminderSubtype reminderSubtype) {
        k0.p(dashboardEvent, "<this>");
        k0.p(context, "context");
        k0.p(reminderSubtype, "reminderSubtype");
        final int n = WhenMappings.$EnumSwitchMapping$0[dashboardEvent.getEventType().ordinal()];
        String s = "";
        String s5;
        if (n != 1 && n != 2) {
            if (n != 3) {
                String s2 = s;
                if (n == 4) {
                    return s2;
                }
                if (n == 5) {
                    s2 = s;
                    return s2;
                }
                throw new h0();
            }
            else {
                final int n2 = WhenMappings.$EnumSwitchMapping$1[reminderSubtype.ordinal()];
                Label_0184: {
                    int n3 = 0;
                    Label_0178: {
                        if (n2 != 1) {
                            String s3;
                            String s4;
                            if (n2 != 2) {
                                if (n2 == 3) {
                                    n3 = 2131886574;
                                    break Label_0178;
                                }
                                if (n2 != 4) {
                                    if (n2 == 5) {
                                        break Label_0184;
                                    }
                                    throw new h0();
                                }
                                else {
                                    s3 = context.getString(2131886573);
                                    k0.o(s3, "context.getString(R.string.reminder_examInXWeeks_text)");
                                    s4 = "2";
                                }
                            }
                            else {
                                s3 = context.getString(2131886572);
                                k0.o(s3, "context.getString(R.string.reminder_examInXDays_text)");
                                s4 = "3";
                            }
                            s = kotlin.text.s.k2(s3, "{0}", s4, false, 4, (Object)null);
                            break Label_0184;
                        }
                        n3 = 2131886575;
                    }
                    s = context.getString(n3);
                }
                s5 = "when (reminderSubtype) {\n            ReminderSubtype.OneDay -> context.getString(R.string.reminder_examTomorrow_text)\n            ReminderSubtype.ThreeDays -> context.getString(R.string.reminder_examInXDays_text).replace(\"{0}\", \"3\")\n            ReminderSubtype.OneWeek -> context.getString(R.string.reminder_examNextWeek_text)\n            ReminderSubtype.TwoWeeks -> context.getString(R.string.reminder_examInXWeeks_text).replace(\"{0}\", \"2\")\n            ReminderSubtype.Custom -> \"\"\n        }";
            }
        }
        else {
            final int n4 = WhenMappings.$EnumSwitchMapping$1[reminderSubtype.ordinal()];
            Label_0299: {
                int n5 = 0;
                Label_0293: {
                    if (n4 != 1) {
                        String s6;
                        String s7;
                        if (n4 != 2) {
                            if (n4 == 3) {
                                n5 = 2131886578;
                                break Label_0293;
                            }
                            if (n4 != 4) {
                                if (n4 == 5) {
                                    break Label_0299;
                                }
                                throw new h0();
                            }
                            else {
                                s6 = context.getString(2131886577);
                                k0.o(s6, "context.getString(R.string.reminder_homeworkInXWeeks_text)");
                                s7 = "2";
                            }
                        }
                        else {
                            s6 = context.getString(2131886576);
                            k0.o(s6, "context.getString(R.string.reminder_homeworkInXDays_text)");
                            s7 = "3";
                        }
                        s = kotlin.text.s.k2(s6, "{0}", s7, false, 4, (Object)null);
                        break Label_0299;
                    }
                    n5 = 2131886579;
                }
                s = context.getString(n5);
            }
            s5 = "when (reminderSubtype) {\n            ReminderSubtype.OneDay -> context.getString(R.string.reminder_homeworkTomorrow_text)\n            ReminderSubtype.ThreeDays -> context.getString(R.string.reminder_homeworkInXDays_text).replace(\"{0}\", \"3\")\n            ReminderSubtype.OneWeek -> context.getString(R.string.reminder_homeworkNextWeek_text)\n            ReminderSubtype.TwoWeeks -> context.getString(R.string.reminder_homeworkInXWeeks_text).replace(\"{0}\", \"2\")\n            ReminderSubtype.Custom -> \"\"\n        }";
        }
        k0.o(s, s5);
        return s;
    }
}
