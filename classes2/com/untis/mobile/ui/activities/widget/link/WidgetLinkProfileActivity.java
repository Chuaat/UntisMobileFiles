// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.widget.link;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.view.MenuItem;
import com.untis.mobile.utils.c0;
import com.untis.mobile.utils.e0;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Context;
import androidx.annotation.k0;
import android.os.Bundle;
import android.content.Intent;
import java.util.Iterator;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.models.DisplayableEntity;
import androidx.annotation.j0;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class WidgetLinkProfileActivity extends b
{
    private static final String K = "appWidgetId";
    private static final String L = "profile";
    private static final String M = "entityType";
    private static final String N = "entityId";
    private int G;
    private Profile H;
    private a I;
    private k J;
    
    @j0
    private List<EntityType> s() {
        final ArrayList<EntityType> list = new ArrayList<EntityType>();
        if (this.I.f(true).size() > 0) {
            list.add(EntityType.CLASS);
        }
        if (this.I.h(true, com.untis.mobile.utils.time.a.b()).size() > 0) {
            list.add(EntityType.TEACHER);
        }
        if (this.I.x(true).size() > 0) {
            list.add(EntityType.SUBJECT);
        }
        if (this.I.m(true).size() > 0) {
            list.add(EntityType.ROOM);
        }
        return list;
    }
    
    @j0
    private List<DisplayableEntity> t() {
        final ArrayList<DisplayableEntity> list = new ArrayList<DisplayableEntity>();
        if (this.H.getUserHasTimeTableAccess()) {
            final DisplayableEntity v = this.I.v(this.H.getEntityType(), this.H.getEntityId());
            if (v != null) {
                list.add(v);
            }
        }
        for (final Child child : this.H.getUserChildren()) {
            if (child.getHasTimeTableAccess()) {
                final DisplayableEntity v2 = this.I.v(EntityType.STUDENT, child.getId());
                if (v2 == null) {
                    continue;
                }
                list.add(v2);
            }
        }
        for (final TimeTableEntity timeTableEntity : this.J.t()) {
            if (timeTableEntity.getFavorite()) {
                final DisplayableEntity v3 = this.I.v(timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
                if (v3 == null) {
                    continue;
                }
                list.add(v3);
            }
        }
        return list;
    }
    
    private void u(@j0 final EntityType entityType, final long n) {
        final Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.G);
        intent.putExtra("profile", this.H.getUniqueId());
        intent.putExtra("entityType", entityType.getWebuntisId());
        intent.putExtra("entityId", n);
        ((Activity)this).setResult(-1, intent);
        ((Activity)this).finish();
    }
    
    private void v(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        this.G = extras.getInt("appWidgetId", 0);
        final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(extras.getString("profile"));
        this.H = l;
        this.I = l.getMasterDataService();
        this.J = this.H.getTimeTableService();
    }
    
    public static void y(@j0 final b b, final int n, @j0 final Profile profile) {
        final Intent intent = new Intent((Context)b, (Class)WidgetLinkProfileActivity.class);
        final Bundle bundle = new Bundle();
        intent.putExtra("appWidgetId", n);
        intent.putExtra("profile", profile.getUniqueId());
        intent.putExtras(bundle);
        ((ComponentActivity)b).startActivityForResult(intent, 700);
    }
    
    protected void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 700) {
            super.onActivityResult(n, n2, intent);
        }
        else if (b && intent != null) {
            ((Activity)this).setResult(-1, intent);
            ((Activity)this).finish();
        }
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492970);
        this.v(bundle);
        final ListView listView = (ListView)this.findViewById(2131296989);
        final ListView listView2 = (ListView)this.findViewById(2131296991);
        final j adapter = new j((Context)this, this.H, this.t());
        listView.setAdapter((ListAdapter)adapter);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.activities.widget.link.k(this, adapter));
        final View viewById = this.findViewById(2131296990);
        final int count = adapter.getCount();
        final int n = 8;
        int visibility;
        if (count == 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        viewById.setVisibility(visibility);
        final n adapter2 = new n((Context)this, this.H, this.s());
        listView2.setAdapter((ListAdapter)adapter2);
        listView2.setOnItemClickListener((AdapterView$OnItemClickListener)new l(this, adapter2));
        final View viewById2 = this.findViewById(2131296992);
        int visibility2;
        if (adapter2.getCount() == 0) {
            visibility2 = n;
        }
        else {
            visibility2 = 0;
        }
        viewById2.setVisibility(visibility2);
        final e0.a a = e0.a;
        a.a(listView);
        a.a(listView2);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)c0.e((Context)this).d(this.H));
            supportActionBar.y0((CharSequence)this.H.getSchoolDisplayName());
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
}
