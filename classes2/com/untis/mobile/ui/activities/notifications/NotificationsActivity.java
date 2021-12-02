// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.notifications;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.widget.ListAdapter;
import android.view.MenuItem;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemClickListener;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import android.content.Intent;
import android.content.Context;
import com.untis.mobile.services.profile.legacy.j0;
import androidx.annotation.k0;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListView;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class NotificationsActivity extends b
{
    private static final String K = "neverForever";
    private Profile G;
    private ListView H;
    private c I;
    private boolean J;
    
    public NotificationsActivity() {
        this.J = true;
    }
    
    private void s(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        final j0 g = j0.G;
        if ((this.G = g.l(extras.getString("neverForever", ""))) == null) {
            this.G = g.n();
        }
    }
    
    public static Intent v(final Context context, @androidx.annotation.j0 final Profile profile) {
        final Intent intent = new Intent(context, (Class)NotificationsActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("neverForever", profile.getUniqueId());
        intent.putExtras(bundle);
        return intent;
    }
    
    private boolean w(@androidx.annotation.j0 final List<com.untis.mobile.ui.activities.notifications.b> list) {
        final Iterator<com.untis.mobile.ui.activities.notifications.b<Collection>> iterator = list.iterator();
        boolean b = false;
        int n = 0;
        while (iterator.hasNext()) {
            final com.untis.mobile.ui.activities.notifications.b<Collection> b2 = iterator.next();
            if (b2.c() instanceof Collection) {
                if (b2.c().size() == 0) {
                    continue;
                }
                ++n;
            }
        }
        if (n == 1) {
            b = true;
        }
        return b;
    }
    
    private void x(@androidx.annotation.j0 final List<com.untis.mobile.ui.activities.notifications.b> list) {
        for (final com.untis.mobile.ui.activities.notifications.b<Collection> b : list) {
            if (b.c() instanceof Collection) {
                if (b.c().size() == 0) {
                    continue;
                }
                b.e(this);
                break;
            }
        }
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492936);
        this.s(bundle);
        (this.H = (ListView)this.findViewById(2131296712)).setOnItemClickListener((AdapterView$OnItemClickListener)new f(this));
        this.findViewById(2131296711).setOnClickListener((View$OnClickListener)new e(this));
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((ComponentActivity)this).onBackPressed();
        return true;
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        this.J = false;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        final List<com.untis.mobile.ui.activities.notifications.b> a = h.c().A(this.G);
        final c c = new c((Context)this, a);
        this.I = c;
        this.H.setAdapter((ListAdapter)c);
        if (this.J) {
            if (this.w(a)) {
                this.x(a);
            }
        }
        else if (this.w(a)) {
            ((Activity)this).finish();
        }
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("neverForever", this.G.getUniqueId());
    }
}
