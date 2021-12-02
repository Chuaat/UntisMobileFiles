// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import com.untis.mobile.utils.settings.old.d;
import android.widget.ListView;
import android.os.Bundle;
import android.content.Context;
import androidx.annotation.k0;
import android.content.Intent;
import androidx.annotation.j0;
import com.untis.mobile.ui.adapters.infocenter.a;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.ui.activities.common.b;

public class InfoCenterDateRangeActivity extends b
{
    private static final String H = "daterange";
    private static final String I = "past";
    private boolean G;
    
    @j0
    public static Intent r(@j0 final a a) {
        final Intent intent = new Intent();
        intent.putExtra("daterange", a.h());
        return intent;
    }
    
    @j0
    public static a s(@k0 final Intent intent) {
        if (intent != null && intent.hasExtra("daterange")) {
            return a.d(intent.getIntExtra("daterange", 0));
        }
        return a.I;
    }
    
    public static void u(@j0 final b b, final boolean b2) {
        final Intent intent = new Intent((Context)b, (Class)InfoCenterDateRangeActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putBoolean("past", b2);
        intent.putExtras(bundle);
        ((ComponentActivity)b).startActivityForResult(intent, 130);
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492924);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            this.G = extras.getBoolean("past");
        }
        final ListView listView = (ListView)this.findViewById(2131296624);
        final com.untis.mobile.ui.adapters.infocenter.b adapter = new com.untis.mobile.ui.adapters.infocenter.b((Context)this, d.n((Context)this).i(), this.G);
        listView.setAdapter((ListAdapter)adapter);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new i(this, adapter));
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
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
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("past", this.G);
    }
}
