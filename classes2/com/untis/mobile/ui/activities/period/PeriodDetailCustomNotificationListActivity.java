// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period;

import android.widget.TextView;
import androidx.activity.ComponentActivity;
import org.joda.time.base.g;
import org.joda.time.base.i;
import android.app.Activity;
import org.jetbrains.annotations.e;
import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Intent;
import com.untis.mobile.systemNotifications.a;
import android.content.Context;
import com.untis.mobile.systemNotifications.d;
import com.untis.mobile.services.profile.legacy.j0;
import androidx.annotation.k0;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import com.untis.mobile.services.timetable.placeholder.k;
import android.widget.ListView;
import org.joda.time.r;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class PeriodDetailCustomNotificationListActivity extends b
{
    private static final String P = "gilgamesch";
    private static final String Q = "period_id";
    private static final String R = "start";
    private static final String S = "end";
    private static final String T = "timetable_entity_type_value";
    private static final String U = "timetable_entity_id";
    private Profile G;
    private EntityType H;
    private long I;
    private Period J;
    private r K;
    private ListView L;
    private p M;
    private k N;
    private com.untis.mobile.systemNotifications.b O;
    
    private void t(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        final Profile l = j0.G.l(extras.getString("gilgamesch", ""));
        this.G = l;
        this.N = l.getTimeTableService();
        this.O = new d().a();
        this.J = this.N.l(extras.getLong("period_id"));
        try {
            this.K = new r(extras.getLong("start"), extras.getLong("end"));
        }
        catch (Exception ex) {
            this.K = null;
        }
        this.H = EntityType.Companion.findBy(extras.getInt("timetable_entity_type_value"));
        this.I = extras.getLong("timetable_entity_id");
        final r k = this.K;
        if (k == null || ((i)k).n() == 0L) {
            this.K = new r(((g)this.J.getStart()).n(), ((g)this.J.getStart()).n());
        }
    }
    
    @androidx.annotation.j0
    public static Intent x(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final Profile profile, final long n, final long n2, final long n3, @androidx.annotation.j0 final EntityType entityType, final long n4) {
        final Intent intent = new Intent(context, (Class)PeriodDetailCustomNotificationListActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("gilgamesch", profile.getUniqueId());
        bundle.putLong("period_id", n);
        bundle.putLong("start", n2);
        bundle.putLong("end", n3);
        bundle.putInt("timetable_entity_type_value", entityType.getWebuntisId());
        bundle.putLong("timetable_entity_id", n4);
        intent.putExtras(bundle);
        return intent;
    }
    
    protected void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 1000) {
            super.onActivityResult(n, n2, intent);
        }
        else if (b && intent != null) {
            final a y = PeriodDetailCustomNotificationActivity.y(intent);
            if (y != null) {
                if (y.e() != 0) {
                    this.O.p(y);
                }
                this.O.n(this.G.getUniqueId(), y);
                if (this.M.getCount() == 0) {
                    ((Activity)this).setResult(-1);
                    ((Activity)this).finish();
                }
                this.M.d(y);
            }
        }
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492946);
        this.t(bundle);
        ((TextView)this.findViewById(2131296763)).setText((CharSequence)com.untis.mobile.utils.time.b.d(this.K));
        this.findViewById(2131296760).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.r(this));
        this.L = (ListView)this.findViewById(2131296762);
        final p p = new p(this, this.O.c(this.G.getUniqueId(), this.J.getId()));
        this.M = p;
        this.L.setAdapter((ListAdapter)p);
        this.L.setOnItemClickListener((AdapterView$OnItemClickListener)new s(this));
        this.findViewById(2131296761).setOnClickListener((View$OnClickListener)new q(this));
        if (this.M.getCount() == 0) {
            ((ComponentActivity)this).startActivityForResult(PeriodDetailCustomNotificationActivity.H((Context)this, this.G, null, this.J.getId(), ((i)this.K).n(), ((i)this.K).I(), this.H, this.I), 1000);
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("gilgamesch", this.G.getUniqueId());
        bundle.putLong("period_id", this.J.getId());
        bundle.putLong("start", ((i)this.K).n());
        bundle.putLong("end", ((i)this.K).I());
        bundle.putInt("timetable_entity_type_value", this.H.getWebuntisId());
        bundle.putLong("timetable_entity_id", this.I);
    }
}
