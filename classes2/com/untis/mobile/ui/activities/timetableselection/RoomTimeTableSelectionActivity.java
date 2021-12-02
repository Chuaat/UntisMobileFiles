// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection;

import org.joda.time.base.e;
import androidx.fragment.app.d;
import org.joda.time.base.g;
import android.os.PersistableBundle;
import androidx.appcompat.widget.SearchView$l;
import androidx.core.view.p;
import androidx.appcompat.widget.SearchView;
import android.view.Menu;
import com.untis.mobile.ui.activities.help.HelpActivity;
import android.util.Log;
import org.joda.time.n0;
import com.google.android.material.tabs.TabLayout$i;
import com.google.android.material.tabs.TabLayout$f;
import android.os.Build$VERSION;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import org.joda.time.c;
import com.untis.mobile.services.profile.legacy.j0;
import androidx.annotation.k0;
import android.os.Bundle;
import com.untis.mobile.utils.time.a;
import com.untis.mobile.ui.adapters.l;
import com.untis.mobile.ui.activities.views.NonSwipeableViewPager;
import com.google.android.material.tabs.TabLayout;
import android.view.View;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class RoomTimeTableSelectionActivity extends b
{
    private static final String N = "andreas";
    private static final String O = "start";
    private static final String P = "end";
    private Profile G;
    private View H;
    private TabLayout I;
    private NonSwipeableViewPager J;
    private l K;
    private long L;
    private long M;
    
    public RoomTimeTableSelectionActivity() {
        this.L = a.d();
        this.M = ((g)a.a().V0(15)).n();
    }
    
    private void t(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        final c a = com.untis.mobile.utils.time.a.a();
        this.L = extras.getLong("start", ((g)a).n());
        this.M = extras.getLong("end", ((g)a.V0(15)).n());
        final j0 g = j0.G;
        if ((this.G = g.l(extras.getString("andreas", ""))) == null) {
            this.G = g.n();
        }
    }
    
    public static Intent u(final Context context, final Profile profile) {
        final Intent intent = new Intent(context, (Class)RoomTimeTableSelectionActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("andreas", profile.getUniqueId());
        intent.putExtras(bundle);
        return intent;
    }
    
    public static void v(@androidx.annotation.j0 final Activity activity, final Profile profile) {
        activity.startActivityForResult(u((Context)activity, profile), 400);
        activity.overridePendingTransition(2130771996, 2130771998);
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492953);
        this.t(bundle);
        this.setSupportActionBar((Toolbar)this.findViewById(2131296810));
        this.H = this.findViewById(2131296806);
        this.I = (TabLayout)this.findViewById(2131296807);
        this.J = (NonSwipeableViewPager)this.findViewById(2131296808);
        final l l = new l(((d)this).getSupportFragmentManager(), this.G);
        this.K = l;
        this.J.setAdapter((androidx.viewpager.widget.a)l);
        this.I.setupWithViewPager((ViewPager)this.J);
        this.I.z(0).C(2131886670).B((Object)0);
        this.I.z(1).C(2131886170).B((Object)1);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886767);
            supportActionBar.Y(true);
            if (Build$VERSION.SDK_INT >= 21) {
                this.I.setElevation(supportActionBar.q());
                this.findViewById(2131296809).setElevation(0.0f);
            }
            supportActionBar.f0(0.0f);
        }
        this.I.d((TabLayout$f)new TabLayout$f() {
            public void g(final TabLayout$i tabLayout$i) {
            }
            
            public void i(final TabLayout$i tabLayout$i) {
                try {
                    final int intValue = (int)tabLayout$i.m();
                    final androidx.appcompat.app.a supportActionBar = RoomTimeTableSelectionActivity.this.getSupportActionBar();
                    String s;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            return;
                        }
                        final c c = new c(RoomTimeTableSelectionActivity.this.L);
                        final c c2 = new c(RoomTimeTableSelectionActivity.this.M);
                        if (((e)c.h1()).p((n0)c2.h1())) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(((org.joda.time.base.a)c).g4("dd.MM.yyyy, H:mm"));
                            sb.append(" - ");
                            sb.append(((org.joda.time.base.a)c2).g4("H:mm"));
                            s = sb.toString();
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(((org.joda.time.base.a)c).g4("dd.MM.yyyy, H:mm"));
                            sb2.append(" - ");
                            sb2.append(((org.joda.time.base.a)c2).g4("dd.MM.yyyy, H:mm"));
                            s = sb2.toString();
                        }
                    }
                    else {
                        s = "";
                    }
                    supportActionBar.y0((CharSequence)s);
                }
                catch (Exception ex) {
                    Log.e("untis_log", "could not get tag from tablayout", (Throwable)ex);
                }
            }
            
            public void p(final TabLayout$i tabLayout$i) {
            }
        });
        HelpActivity.w(this, this.G, this.findViewById(2131296806));
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131558413, menu);
        final SearchView searchView = (SearchView)p.d(menu.findItem(2131298452));
        if (searchView != null) {
            searchView.setOnQueryTextListener((SearchView$l)new SearchView$l() {
                public boolean onQueryTextChange(final String s) {
                    RoomTimeTableSelectionActivity.this.K.a(s);
                    return true;
                }
                
                public boolean onQueryTextSubmit(final String s) {
                    RoomTimeTableSelectionActivity.this.K.a(s);
                    if (s.isEmpty()) {
                        searchView.clearFocus();
                        searchView.h();
                    }
                    return true;
                }
            });
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onSaveInstanceState(final Bundle bundle, final PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putLong("start", this.L);
        bundle.putLong("end", this.M);
        bundle.putString("andreas", this.G.getUniqueId());
    }
}
