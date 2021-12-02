// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services;

import android.text.Html;
import android.widget.RemoteViews;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.Collection;
import com.untis.mobile.services.messages.e;
import com.untis.mobile.ui.activities.MessagesOfDayWidgetSettingsActivity;
import com.google.gson.Gson;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.widget.ScheduleMessageOfDayContext;
import android.content.Context;
import android.widget.RemoteViewsService$RemoteViewsFactory;
import android.content.Intent;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.List;
import android.widget.RemoteViewsService;

public class MessageOfDayWidgetService extends RemoteViewsService
{
    @j0
    private List<MessageOfDay> G;
    
    public MessageOfDayWidgetService() {
        this.G = new ArrayList<MessageOfDay>();
    }
    
    public RemoteViewsService$RemoteViewsFactory onGetViewFactory(final Intent intent) {
        return (RemoteViewsService$RemoteViewsFactory)new a((Context)this, intent);
    }
    
    class a implements RemoteViewsService$RemoteViewsFactory
    {
        @j0
        private Context G;
        private int H;
        @k0
        private ScheduleMessageOfDayContext I;
        
        public a(final Context context, final Intent intent) {
            this.G = context.getApplicationContext();
            this.H = intent.getIntExtra("appWidgetId", 0);
            final String string = this.G.getSharedPreferences("messages_of_day_widget_settings", 0).getString(Integer.toString(this.H), (String)null);
            if (string != null) {
                this.I = new Gson().fromJson(string, ScheduleMessageOfDayContext.class);
            }
        }
        
        private void a() {
            final ScheduleMessageOfDayContext i = this.I;
            if (i == null) {
                final MessageOfDayWidgetService j = MessageOfDayWidgetService.this;
                j.startActivity(MessagesOfDayWidgetSettingsActivity.s(j.getApplicationContext(), this.H));
                return;
            }
            final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(i.profileId);
            if (l == null) {
                final MessageOfDayWidgetService k = MessageOfDayWidgetService.this;
                k.startActivity(MessagesOfDayWidgetSettingsActivity.s(k.getApplicationContext(), this.H));
                return;
            }
            final e e = new e(l.getUniqueId());
            MessageOfDayWidgetService.this.G.clear();
            MessageOfDayWidgetService.this.G.addAll(e.l(false));
        }
        
        public int getCount() {
            return MessageOfDayWidgetService.this.G.size();
        }
        
        public long getItemId(final int n) {
            return n;
        }
        
        public RemoteViews getLoadingView() {
            return null;
        }
        
        public RemoteViews getViewAt(final int n) {
            final MessageOfDay messageOfDay = MessageOfDayWidgetService.this.G.get(n);
            final RemoteViews remoteViews = new RemoteViews(this.G.getPackageName(), 2131493373);
            remoteViews.setTextViewText(2131298547, (CharSequence)Html.fromHtml(messageOfDay.getSubject()));
            remoteViews.setTextViewText(2131298546, (CharSequence)Html.fromHtml(messageOfDay.getText()));
            return remoteViews;
        }
        
        public int getViewTypeCount() {
            return 1;
        }
        
        public boolean hasStableIds() {
            return false;
        }
        
        public void onCreate() {
            this.a();
        }
        
        public void onDataSetChanged() {
            this.a();
        }
        
        public void onDestroy() {
        }
    }
}
