// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import android.app.Activity;
import androidx.annotation.k0;
import android.os.Bundle;
import android.content.Intent;
import com.untis.mobile.services.widget.c;
import com.untis.mobile.UntisMobileApplication;
import android.widget.AdapterView;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.content.Context;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.s0;
import com.untis.mobile.persistence.models.widget.ScheduleWidgetContext;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.e;

public class ScheduleWidgetSettingsActivity extends e
{
    private int G;
    private t H;
    private q I;
    private s J;
    private r K;
    private ListView L;
    private ListView M;
    private ListView N;
    private ListView O;
    private View P;
    private ScheduleWidgetContext Q;
    
    public ScheduleWidgetSettingsActivity() {
        this.G = 0;
        this.Q = new ScheduleWidgetContext();
    }
    
    private void A(final String s, final s0<EntityType, List<DisplayableEntity>> s2) {
        this.N.setVisibility(8);
        this.M.setVisibility(8);
        if (this.O != null) {
            final r r = new r((Context)this, s2.f());
            this.K = r;
            this.O.setAdapter((ListAdapter)r);
            this.O.setOnItemClickListener((AdapterView$OnItemClickListener)new x(this, s));
            this.O.setVisibility(0);
            if (this.K.getCount() == 1) {
                this.z(s, this.K.a(0));
            }
        }
        ++this.G;
    }
    
    private void B(@j0 final Profile profile) {
        this.L.setVisibility(8);
        this.Q.profileId = profile.getUniqueId();
        this.Q.schoolName = profile.getSchoolDisplayName();
        if (this.N != null && this.M != null) {
            final s s = new s((Context)this, profile.getUniqueId());
            this.J = s;
            this.N.setAdapter((ListAdapter)s);
            this.N.setVisibility(0);
            this.N.setOnItemClickListener((AdapterView$OnItemClickListener)new w(this, profile));
            final q q = new q((Context)this, profile.getUniqueId());
            this.I = q;
            this.M.setAdapter((ListAdapter)q);
            this.M.setVisibility(0);
            this.M.setOnItemClickListener((AdapterView$OnItemClickListener)new v(this, profile));
            if (this.J.getCount() == 1 && this.M.getCount() == 0) {
                this.z(profile.getUniqueId(), this.J.b(0));
            }
            if (this.J.getCount() == 0 && this.M.getCount() == 1) {
                this.A(profile.getUniqueId(), this.I.b(0));
            }
        }
        ++this.G;
    }
    
    private void u() {
        final Bundle extras = ((Activity)this).getIntent().getExtras();
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        if (b == null) {
            return;
        }
        if (extras != null) {
            final int int1 = extras.getInt("appWidgetId", 0);
            com.untis.mobile.utils.settings.old.e.G.a((Context)b, this.Q);
            c.G.a(int1);
            final Intent intent = new Intent();
            intent.putExtra("appWidgetId", int1);
            ((Activity)this).setResult(-1, intent);
            ((Activity)this).finish();
        }
    }
    
    private void z(final String profileId, final DisplayableEntity displayableEntity) {
        final ScheduleWidgetContext q = this.Q;
        q.profileId = profileId;
        q.entityType = displayableEntity.entityType();
        this.Q.entityId = displayableEntity.entityId();
        this.Q.entityName = displayableEntity.getDisplayableTitle();
        final ScheduleWidgetContext q2 = this.Q;
        q2.lastUpdate = 0L;
        q2.periodIds.clear();
        this.u();
    }
    
    public void onBackPressed() {
        final int g = this.G;
        Label_0109: {
            if (g != 0) {
                Label_0057: {
                    ListView listView;
                    if (g != 1) {
                        if (g != 2) {
                            this.O.setVisibility(0);
                            break Label_0057;
                        }
                        this.M.setVisibility(0);
                        this.N.setVisibility(0);
                        listView = this.O;
                    }
                    else {
                        if (this.H.getCount() <= 1) {
                            break Label_0109;
                        }
                        this.L.setVisibility(0);
                        this.M.setVisibility(8);
                        listView = this.N;
                    }
                    listView.setVisibility(8);
                }
                --this.G;
                return;
            }
        }
        super.onBackPressed();
    }
    
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        this.setContentView(2131492957);
        this.L = (ListView)this.findViewById(2131297834);
        this.M = (ListView)this.findViewById(2131297832);
        this.N = (ListView)this.findViewById(2131297833);
        this.O = (ListView)this.findViewById(2131297831);
        this.P = this.findViewById(2131296818);
        this.Q.widgetId = extras.getInt("appWidgetId", 0);
        final int widgetId = this.Q.widgetId;
        if (widgetId != 0) {
            final ScheduleWidgetContext b = com.untis.mobile.utils.settings.old.e.G.b((Context)this, widgetId);
            if (b != null) {
                this.Q = b;
            }
        }
        if (this.L != null) {
            final t t = new t((Context)this, com.untis.mobile.services.profile.legacy.j0.G.s0());
            this.H = t;
            this.L.setAdapter((ListAdapter)t);
            this.L.setOnItemClickListener((AdapterView$OnItemClickListener)new u(this));
            this.L.setEmptyView(this.P);
            if (this.H.getCount() == 1) {
                this.B(this.H.a(0));
            }
        }
    }
}
