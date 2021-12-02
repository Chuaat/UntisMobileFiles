// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import android.app.Activity;
import java.util.List;
import android.widget.ListAdapter;
import java.util.Collection;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.k0;
import android.appwidget.AppWidgetManager;
import com.google.gson.Gson;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import com.untis.mobile.persistence.models.profile.Profile;
import android.widget.AdapterView;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.widget.ScheduleMessageOfDayContext;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.e;

public class MessagesOfDayWidgetSettingsActivity extends e
{
    public static final String J = "messages_of_day_widget_settings";
    private ListView G;
    private View H;
    @j0
    private ScheduleMessageOfDayContext I;
    
    public MessagesOfDayWidgetSettingsActivity() {
        this.I = new ScheduleMessageOfDayContext();
    }
    
    @j0
    public static Intent s(@j0 final Context context, final int n) {
        final Intent intent = new Intent(context, (Class)MessagesOfDayWidgetSettingsActivity.class);
        intent.setFlags(805339136);
        final Bundle bundle = new Bundle();
        bundle.putInt("appWidgetId", n);
        intent.putExtras(bundle);
        return intent;
    }
    
    private void t(final Profile profile) {
        final Bundle extras = ((Activity)this).getIntent().getExtras();
        if (extras != null) {
            final int int1 = extras.getInt("appWidgetId", 0);
            this.I.profileId = profile.getUniqueId();
            this.I.profileName = profile.getUserDisplayName();
            this.I.schoolName = profile.getSchoolDisplayName();
            ((Activity)this).getSharedPreferences("messages_of_day_widget_settings", 0).edit().putString(Integer.toString(this.I.widgetId), new Gson().toJson(this.I)).apply();
            AppWidgetManager.getInstance((Context)this).updateAppWidgetOptions(int1, new Bundle());
            final Intent intent = new Intent();
            intent.putExtra("appWidgetId", int1);
            ((Activity)this).setResult(-1, intent);
            ((Activity)this).finish();
        }
    }
    
    protected void onCreate(@k0 Bundle extras) {
        super.onCreate(extras);
        extras = ((Activity)this).getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.setContentView(2131492933);
        this.G = (ListView)this.findViewById(2131298545);
        this.H = this.findViewById(2131296692);
        this.I.widgetId = extras.getInt("appWidgetId", 0);
        final ArrayAdapter<Profile> adapter = new ArrayAdapter<Profile>(0) {
            public View getView(final int n, View inflate, final ViewGroup viewGroup) {
                a tag;
                if (inflate == null) {
                    inflate = ((Activity)MessagesOfDayWidgetSettingsActivity.this).getLayoutInflater().inflate(2131493376, viewGroup, false);
                    tag = new a();
                    tag.a = (TextView)inflate.findViewById(2131297456);
                    tag.b = (TextView)inflate.findViewById(2131298748);
                    inflate.setTag((Object)tag);
                }
                else {
                    tag = (a)inflate.getTag();
                }
                final Profile profile = (Profile)this.getItem(n);
                if (profile != null) {
                    if (profile.isAnonymousUser()) {
                        profile.setUserDisplayName(((Activity)MessagesOfDayWidgetSettingsActivity.this).getString(2131886345));
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append(profile.getUserDisplayName());
                    sb.append(" [");
                    sb.append(profile.getSchoolDisplayName());
                    sb.append("]");
                    tag.a.setText((CharSequence)sb.toString());
                    tag.b.setText((CharSequence)profile.getSchoolDisplayName());
                }
                return inflate;
            }
            
            class a
            {
                public TextView a;
                public TextView b;
            }
        };
        final ListView g = this.G;
        if (g != null) {
            g.setOnItemClickListener((AdapterView$OnItemClickListener)new p(this));
        }
        final List<Profile> s0 = com.untis.mobile.services.profile.legacy.j0.G.s0();
        if (s0.size() == 1) {
            this.t(s0.get(0));
        }
        else {
            adapter.addAll((Collection)s0);
        }
        this.G.setAdapter((ListAdapter)adapter);
        this.G.setEmptyView(this.H);
    }
}
