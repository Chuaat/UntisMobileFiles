// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import androidx.appcompat.widget.SearchView$l;
import androidx.core.view.p;
import androidx.appcompat.widget.SearchView;
import android.view.Menu;
import com.untis.mobile.ui.activities.help.HelpActivity;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.content.Context;
import androidx.appcompat.app.e;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import com.untis.mobile.services.profile.legacy.j0;
import androidx.annotation.k0;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.ui.adapters.timetableselection.i;
import android.widget.ListView;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class SubjectTimeTableSelectionActivity extends b
{
    private static final String K = "patronus";
    private Profile G;
    private ListView H;
    private i I;
    private a J;
    
    private void s(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        final j0 g = j0.G;
        if ((this.G = g.l(extras.getString("patronus", ""))) == null) {
            this.G = g.n();
        }
        this.J = this.G.getMasterDataService();
    }
    
    public static void u(@androidx.annotation.j0 final e e, final Profile profile) {
        ((ComponentActivity)e).startActivityForResult(v((Context)e, profile), 400);
        ((Activity)e).overridePendingTransition(2130771996, 2130771998);
    }
    
    public static Intent v(final Context context, final Profile profile) {
        final Intent intent = new Intent(context, (Class)SubjectTimeTableSelectionActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("patronus", profile.getUniqueId());
        intent.putExtras(bundle);
        return intent;
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492967);
        this.s(bundle);
        this.setSupportActionBar((Toolbar)this.findViewById(2131296984));
        this.H = (ListView)this.findViewById(2131296982);
        final i i = new i((Context)this, this.G, this.J.x(true));
        this.I = i;
        this.H.setAdapter((ListAdapter)i);
        this.H.setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.activities.timetableselection.b(this));
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886781);
            supportActionBar.Y(true);
        }
        HelpActivity.w(this, this.G, this.findViewById(2131296983));
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131558413, menu);
        final SearchView searchView = (SearchView)p.d(menu.findItem(2131298452));
        if (searchView != null) {
            searchView.setOnQueryTextListener((SearchView$l)new SearchView$l() {
                public boolean onQueryTextChange(final String s) {
                    SubjectTimeTableSelectionActivity.this.I.n(s);
                    return true;
                }
                
                public boolean onQueryTextSubmit(final String s) {
                    SubjectTimeTableSelectionActivity.this.I.n(s);
                    return true;
                }
            });
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("patronus", this.G.getUniqueId());
    }
}
