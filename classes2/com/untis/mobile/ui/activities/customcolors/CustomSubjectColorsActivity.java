// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.customcolors;

import androidx.fragment.app.d;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import com.untis.mobile.ui.dialogs.ConfirmationDialog;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView$l;
import androidx.core.view.p;
import androidx.appcompat.widget.SearchView;
import android.view.Menu;
import rx.schedulers.c;
import java.util.concurrent.Callable;
import rx.g;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import com.untis.mobile.utils.u0;
import com.untis.mobile.ui.activities.help.HelpActivity;
import android.widget.ListAdapter;
import com.untis.mobile.persistence.models.masterdata.Subject;
import android.content.Context;
import java.util.List;
import com.untis.mobile.services.profile.legacy.j0;
import androidx.annotation.k0;
import android.os.Bundle;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.masterdata.a;
import android.widget.ListView;
import android.view.View;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class CustomSubjectColorsActivity extends b
{
    private static final String N = "superman";
    private Profile G;
    private View H;
    private ListView I;
    private h J;
    private String K;
    private a L;
    private k M;
    
    public CustomSubjectColorsActivity() {
        this.K = "";
    }
    
    private void B(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        final Profile l = j0.G.l(extras.getString("superman", ""));
        this.G = l;
        this.L = l.getMasterDataService();
        this.M = this.G.getTimeTableService();
    }
    
    public static void F(@androidx.annotation.j0 final b b, @androidx.annotation.j0 final Profile profile) {
        final Intent intent = new Intent((Context)b, (Class)CustomSubjectColorsActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("superman", profile.getUniqueId());
        intent.putExtras(bundle);
        ((ComponentActivity)b).startActivityForResult(intent, 130);
    }
    
    public void onBackPressed() {
        ((Activity)this).setResult(-1);
        ((Activity)this).finish();
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492907);
        this.B(bundle);
        this.H = this.findViewById(2131296540);
        this.I = (ListView)this.findViewById(2131296539);
        this.setSupportActionBar((Toolbar)this.findViewById(2131296542));
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.Y(true);
        }
        g.H2((Callable)new j(this)).E5(c.e()).Q3(rx.android.schedulers.a.c()).C5((rx.functions.b)new l(this), (rx.functions.b)new com.untis.mobile.ui.activities.customcolors.k(this));
    }
    
    public boolean onCreateOptionsMenu(@k0 final Menu menu) {
        this.getMenuInflater().inflate(2131558404, menu);
        final SearchView searchView = (SearchView)p.d(menu.findItem(2131298434));
        if (searchView != null) {
            searchView.setOnQueryTextListener((SearchView$l)new SearchView$l() {
                public boolean onQueryTextChange(final String s) {
                    CustomSubjectColorsActivity.this.J.u(s);
                    CustomSubjectColorsActivity.this.K = s;
                    return true;
                }
                
                public boolean onQueryTextSubmit(final String s) {
                    CustomSubjectColorsActivity.this.J.u(s);
                    CustomSubjectColorsActivity.this.K = s;
                    return true;
                }
            });
        }
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            this.onBackPressed();
            return true;
        }
        if (itemId != 2131298433) {
            return super.onOptionsItemSelected(menuItem);
        }
        ConfirmationDialog.S((ConfirmationDialog.c)new ConfirmationDialog.c() {
            @Override
            public void a() {
                i.a.a(CustomSubjectColorsActivity.this.M);
                final CustomSubjectColorsActivity a = CustomSubjectColorsActivity.this;
                final CustomSubjectColorsActivity a2 = CustomSubjectColorsActivity.this;
                a.J = new h((Context)a2, a2.G, CustomSubjectColorsActivity.this.L.x(true));
                CustomSubjectColorsActivity.this.J.u(CustomSubjectColorsActivity.this.K);
                CustomSubjectColorsActivity.this.I.setAdapter((ListAdapter)CustomSubjectColorsActivity.this.J);
            }
            
            @Override
            public void onCancel() {
            }
        }).L(((d)this).getSupportFragmentManager(), "resetcolorsconfirmation");
        return true;
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("superman", this.G.getUniqueId());
    }
}
