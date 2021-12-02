// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.widget.link;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.k0;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.SimpleEntity;
import java.util.List;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.j0;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class WidgetLinkElementActivity extends b
{
    private static final String K = "appWidgetId";
    private static final String L = "profile";
    private static final String M = "entityType";
    private static final String N = "entityId";
    private int G;
    private Profile H;
    private EntityType I;
    private a J;
    
    public static void E(@j0 final b b, final int n, @j0 final Profile profile, @j0 final EntityType entityType) {
        final Intent intent = new Intent((Context)b, (Class)WidgetLinkElementActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putInt("appWidgetId", n);
        bundle.putString("profile", profile.getUniqueId());
        bundle.putInt("entityType", entityType.getWebuntisId());
        intent.putExtras(bundle);
        ((ComponentActivity)b).startActivityForResult(intent, 700);
    }
    
    @j0
    private List<SimpleEntity> v() {
        final ArrayList<SimpleEntity> list = new ArrayList<SimpleEntity>();
        final int n = WidgetLinkElementActivity$a.a[this.I.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 4) {
                    if (n == 5) {
                        final List<Klasse> f = this.J.f(true);
                        Collections.sort((List<Object>)f, e.G);
                        final Iterator<Klasse> iterator = f.iterator();
                        while (iterator.hasNext()) {
                            list.add(new SimpleEntity(EntityType.CLASS, iterator.next().getId()));
                        }
                    }
                }
                else {
                    final List<Subject> x = this.J.x(true);
                    Collections.sort((List<Object>)x, g.G);
                    final Iterator<Subject> iterator2 = x.iterator();
                    while (iterator2.hasNext()) {
                        list.add(new SimpleEntity(EntityType.SUBJECT, iterator2.next().getId()));
                    }
                }
            }
            else {
                final List<Room> m = this.J.m(true);
                Collections.sort((List<Object>)m, f.G);
                final Iterator<Room> iterator3 = m.iterator();
                while (iterator3.hasNext()) {
                    list.add(new SimpleEntity(EntityType.ROOM, iterator3.next().getId()));
                }
            }
        }
        else {
            final List<Teacher> h = this.J.h(true, com.untis.mobile.utils.time.a.b());
            Collections.sort((List<Object>)h, com.untis.mobile.ui.activities.widget.link.h.G);
            final Iterator<Teacher> iterator4 = h.iterator();
            while (iterator4.hasNext()) {
                list.add(new SimpleEntity(EntityType.TEACHER, iterator4.next().getId()));
            }
        }
        return list;
    }
    
    private void w(final long n) {
        final Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.G);
        intent.putExtra("profile", this.H.getUniqueId());
        intent.putExtra("entityType", this.I.getWebuntisId());
        intent.putExtra("entityId", n);
        ((Activity)this).setResult(-1, intent);
        ((Activity)this).finish();
    }
    
    private int x(@j0 final EntityType entityType) {
        final int n = WidgetLinkElementActivity$a.a[entityType.ordinal()];
        if (n == 1) {
            return 2131886783;
        }
        if (n == 2) {
            return 2131886767;
        }
        if (n == 3) {
            return 2131886810;
        }
        if (n == 4) {
            return 2131886781;
        }
        if (n != 5) {
            return 2131886140;
        }
        return 2131886680;
    }
    
    private void y(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        this.G = extras.getInt("appWidgetId", 0);
        this.H = com.untis.mobile.services.profile.legacy.j0.G.l(extras.getString("profile"));
        this.I = EntityType.Companion.findBy(extras.getInt("entityType"));
        this.J = this.H.getMasterDataService();
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492971);
        this.y(bundle);
        final ListView listView = (ListView)this.findViewById(2131296993);
        final i adapter = new i((Context)this, this.H, this.v());
        listView.setAdapter((ListAdapter)adapter);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new d(this, adapter));
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(this.x(this.I));
            supportActionBar.Y(true);
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((ComponentActivity)this).onBackPressed();
        return true;
    }
    
    public void onSaveInstanceState(final Bundle bundle, final PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putInt("appWidgetId", this.G);
        bundle.putString("profile", this.H.getUniqueId());
        bundle.putInt("entityType", this.I.getWebuntisId());
    }
}
