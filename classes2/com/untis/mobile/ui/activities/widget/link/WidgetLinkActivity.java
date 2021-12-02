// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.widget.link;

import android.app.Activity;
import android.view.MenuItem;
import java.util.List;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import androidx.annotation.k0;
import android.appwidget.AppWidgetManager;
import com.untis.mobile.persistence.models.widget.ScheduleLinkWidgetContext;
import com.untis.mobile.utils.a;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import android.os.Bundle;
import android.content.Intent;
import android.app.PendingIntent;
import androidx.annotation.j0;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.ui.activities.common.b;

public class WidgetLinkActivity extends b
{
    public static final String H = "profile";
    public static final String I = "entityType";
    public static final String J = "entityId";
    public static final String K = "appWidgetId";
    private int G;
    
    public static PendingIntent t(@j0 final Context context, final int n) {
        final Intent intent = new Intent(context, (Class)WidgetLinkActivity.class);
        intent.setFlags(805339136);
        final Bundle bundle = new Bundle();
        bundle.putInt("appWidgetId", n);
        intent.putExtras(bundle);
        return PendingIntent.getActivity(context, n, intent, 134217728);
    }
    
    private void u(@j0 final Profile profile, @j0 final EntityType entityType, final long n) {
        a.a((Context)this).f1(new ScheduleLinkWidgetContext(this.G, profile.getUniqueId(), entityType, n));
        AppWidgetManager.getInstance((Context)this).updateAppWidgetOptions(this.G, new Bundle());
        final Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.G);
        ((Activity)this).setResult(-1, intent);
        ((Activity)this).finish();
    }
    
    private void v(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            this.G = extras.getInt("appWidgetId", 0);
        }
    }
    
    private void z() {
        if (com.untis.mobile.services.profile.legacy.j0.G.s0().size() > 0) {
            new AlertDialog$Builder((Context)this).setMessage(2131886910).setPositiveButton(2131886660, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.widget.link.a(this)).setNegativeButton(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.widget.link.b.G).create().show();
        }
        else {
            super.onBackPressed();
        }
    }
    
    protected void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 700) {
            super.onActivityResult(n, n2, intent);
        }
        else if (b && intent != null) {
            final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(intent.getStringExtra("profile"));
            final EntityType by = EntityType.Companion.findBy(intent.getIntExtra("entityType", 0));
            final long longExtra = intent.getLongExtra("entityId", 0L);
            if (l != null && by != null && longExtra > 0L) {
                this.u(l, by, longExtra);
            }
        }
    }
    
    public void onBackPressed() {
        this.z();
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492969);
        this.v(bundle);
        final ListView listView = (ListView)this.findViewById(2131296988);
        final View viewById = this.findViewById(2131296987);
        final com.untis.mobile.services.profile.legacy.j0 g = com.untis.mobile.services.profile.legacy.j0.G;
        final List<Profile> s0 = g.s0();
        if (s0.size() == 1 && s0.get(0) != null) {
            WidgetLinkProfileActivity.y(this, this.G, s0.get(0));
        }
        final m adapter = new m((Context)this, g.s0());
        listView.setAdapter((ListAdapter)adapter);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new c(this, adapter));
        listView.setEmptyView(viewById);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886764);
            supportActionBar.Y(true);
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.onBackPressed();
        return true;
    }
}
