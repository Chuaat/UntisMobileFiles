// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.receivers;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.app.PendingIntent;
import com.untis.mobile.ui.activities.messageofday.MessageOfDaysActivity;
import com.untis.mobile.utils.s0;
import com.google.gson.Gson;
import com.untis.mobile.persistence.models.widget.ScheduleMessageOfDayContext;
import android.widget.RemoteViews;
import android.net.Uri;
import android.content.Intent;
import com.untis.mobile.services.MessageOfDayWidgetService;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.appwidget.AppWidgetProvider;

public class MessageOfDayWidgetProvider extends AppWidgetProvider
{
    private void updateWidget(final Context context, final AppWidgetManager appWidgetManager, final int i) {
        final Intent intent = new Intent(context, (Class)MessageOfDayWidgetService.class);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.parse(intent.toUri(1)));
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131492932);
        remoteViews.setRemoteAdapter(2131298456, intent);
        remoteViews.setEmptyView(2131298456, 2131298455);
        final SharedPreferences sharedPreferences = context.getSharedPreferences("messages_of_day_widget_settings", 0);
        final String string = Integer.toString(i);
        ScheduleMessageOfDayContext scheduleMessageOfDayContext = null;
        final String string2 = sharedPreferences.getString(string, (String)null);
        if (string2 != null) {
            scheduleMessageOfDayContext = new Gson().fromJson(string2, ScheduleMessageOfDayContext.class);
        }
        if (scheduleMessageOfDayContext != null) {
            remoteViews.setTextViewText(2131298458, (CharSequence)scheduleMessageOfDayContext.profileName);
            remoteViews.setTextViewText(2131298457, (CharSequence)scheduleMessageOfDayContext.schoolName);
        }
        if (scheduleMessageOfDayContext != null) {
            remoteViews.setOnClickPendingIntent(2131296691, PendingIntent.getActivity(context, s0.a(), MessageOfDaysActivity.I.a(scheduleMessageOfDayContext.profileId), 402653184));
        }
        appWidgetManager.updateAppWidget(i, remoteViews);
    }
    
    public void onAppWidgetOptionsChanged(final Context context, final AppWidgetManager appWidgetManager, final int n, final Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, n, bundle);
        this.updateWidget(context, appWidgetManager, n);
    }
    
    public void onDeleted(final Context context, final int[] array) {
        super.onDeleted(context, array);
        for (int length = array.length, i = 0; i < length; ++i) {
            context.getSharedPreferences("messages_of_day_widget_settings", 0).edit().remove(Integer.toString(array[i])).apply();
        }
    }
    
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] array) {
        super.onUpdate(context, appWidgetManager, array);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.updateWidget(context, appWidgetManager, array[i]);
        }
    }
}
