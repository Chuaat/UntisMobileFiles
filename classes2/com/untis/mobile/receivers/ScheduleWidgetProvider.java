// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.receivers;

import org.joda.time.base.d;
import androidx.annotation.k0;
import android.os.Bundle;
import java.util.List;
import com.untis.mobile.persistence.models.widget.ScheduleWidgetContext;
import com.untis.mobile.ui.activities.period.PeriodDetailActivity;
import com.untis.mobile.calendar.ui.CalendarActivity;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import android.app.PendingIntent;
import com.untis.mobile.ui.activities.ScheduleWidgetSettingsActivity;
import com.untis.mobile.ui.activities.profile.WelcomeActivity;
import org.joda.time.m0;
import org.joda.time.l0;
import org.joda.time.r;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import org.joda.time.c;
import com.untis.mobile.utils.settings.old.e;
import android.widget.RemoteViews;
import android.net.Uri;
import android.content.Intent;
import com.untis.mobile.services.ScheduleWidgetService;
import android.appwidget.AppWidgetManager;
import androidx.annotation.j0;
import android.content.Context;
import com.untis.mobile.b;
import com.untis.mobile.persistence.models.profile.Profile;
import android.appwidget.AppWidgetProvider;

public class ScheduleWidgetProvider extends AppWidgetProvider
{
    private boolean calendarModuleOn(final Profile profile) {
        return b.G.b(profile);
    }
    
    private void updateWidget(@j0 final Context context, @j0 final AppWidgetManager appWidgetManager, final int n) {
        final Intent intent = new Intent(context, (Class)ScheduleWidgetService.class);
        intent.putExtra("appWidgetId", n);
        intent.setData(Uri.parse(intent.toUri(1)));
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131492956);
        remoteViews.setRemoteAdapter(2131298744, intent);
        remoteViews.setEmptyView(2131298744, 2131298742);
        final ScheduleWidgetContext b = e.G.b(context, n);
        if (b == null) {
            return;
        }
        final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(b.profileId);
        if (l == null) {
            return;
        }
        remoteViews.setTextViewText(2131298747, (CharSequence)b.entityName);
        remoteViews.setTextViewText(2131298746, (CharSequence)b.schoolName);
        final c g0 = c.G0();
        final c a2 = g0.Y0(1).a2();
        final List<Long> periodIds = b.periodIds;
        if (periodIds == null || periodIds.isEmpty()) {
            final List<Holiday> e = com.untis.mobile.services.masterdata.b.Z.a(b.profileId).E();
            if (!e.isEmpty()) {
                for (int i = 0; i < e.size(); ++i) {
                    final Holiday holiday = e.get(i);
                    if (((d)new r((l0)g0, (l0)a2)).F((m0)new r((l0)holiday.getStart().F0(), (l0)holiday.getEnd().F0()))) {
                        remoteViews.setTextViewText(2131298742, (CharSequence)holiday.getLongName());
                        break;
                    }
                }
            }
        }
        final WelcomeActivity.a g2 = WelcomeActivity.G;
        Intent a3 = g2.a(context);
        final com.untis.mobile.services.profile.legacy.j0 g3 = com.untis.mobile.services.profile.legacy.j0.G;
        if (g3.s0().size() > 0) {
            final Intent intent2 = new Intent(context, (Class)ScheduleWidgetSettingsActivity.class);
            intent2.putExtra("appWidgetId", n);
            final String profileId = b.profileId;
            a3 = intent2;
            if (profileId != null) {
                intent2.putExtra("profile_id", profileId);
                a3 = intent2;
            }
        }
        a3.setFlags(805339136);
        remoteViews.setOnClickPendingIntent(2131298745, PendingIntent.getActivity(context, n, a3, 134217728));
        Intent intent3 = g2.a(context);
        if (g3.s0().size() > 0) {
            if (b.profileId != null) {
                intent3 = TimeTableActivity.L.e(context, l, new TimeTableEntity(b.entityType, b.entityId, false, 0, 0L, ""));
            }
            else {
                intent3 = new Intent(context, (Class)ScheduleWidgetSettingsActivity.class);
                intent3.putExtra("appWidgetId", n);
            }
        }
        intent3.setFlags(805339136);
        remoteViews.setOnClickPendingIntent(2131298743, PendingIntent.getActivity(context, n, intent3, 134217728));
        Intent intent4;
        if (this.calendarModuleOn(l)) {
            intent4 = new Intent(context, (Class)CalendarActivity.class);
        }
        else {
            intent4 = new Intent(context, (Class)PeriodDetailActivity.class);
        }
        intent4.setFlags(805339136);
        remoteViews.setPendingIntentTemplate(2131298744, PendingIntent.getActivity(context, n, intent4, 134217728));
        appWidgetManager.updateAppWidget(n, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(n, 2131298744);
    }
    
    public void onAppWidgetOptionsChanged(@j0 final Context context, @j0 final AppWidgetManager appWidgetManager, final int n, @k0 final Bundle bundle) {
        this.updateWidget(context, appWidgetManager, n);
    }
    
    public void onDeleted(@j0 final Context context, @k0 final int[] array) {
        if (array == null) {
            return;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            e.G.c(context, array[i]);
        }
    }
    
    public void onUpdate(@j0 final Context context, @j0 final AppWidgetManager appWidgetManager, @k0 final int[] array) {
        if (array == null) {
            return;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            this.updateWidget(context, appWidgetManager, array[i]);
        }
    }
}
