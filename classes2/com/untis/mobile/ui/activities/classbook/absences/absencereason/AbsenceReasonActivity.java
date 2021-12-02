// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.absences.absencereason;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.c;
import android.content.Context;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import android.view.View;
import android.widget.AdapterView;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0014R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/absences/absencereason/AbsenceReasonActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "absenceReason", "Lkotlin/j2;", "r", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "H", "J", "absenceReasonId", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AbsenceReasonActivity extends b
{
    @e
    public static final a I;
    @e
    private static final String J = "olaSeniorita";
    @e
    private static final String K = "uiUiUi";
    private Profile G;
    private long H;
    
    static {
        I = new a(null);
    }
    
    private final void r(final AbsenceReason absenceReason) {
        ((Activity)this).setResult(-1, AbsenceReasonActivity.I.c(absenceReason.getId()));
        ((Activity)this).finish();
    }
    
    private static final void s(final AbsenceReasonActivity absenceReasonActivity, final com.untis.mobile.ui.activities.classbook.absences.absencereason.b b, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(absenceReasonActivity, "this$0");
        k0.p(b, "$absenceReasonAdapter");
        absenceReasonActivity.r(b.a(n));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras = bundle;
        }
        final String s = "";
        String string;
        if (extras == null) {
            string = s;
        }
        else {
            string = extras.getString("olaSeniorita", "");
            if (string == null) {
                string = s;
            }
        }
        final j0 g = j0.G;
        Profile g2;
        if ((g2 = g.l(string)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        Bundle extras2;
        if ((extras2 = bundle) == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        long long1 = 0L;
        if (extras2 != null) {
            long1 = extras2.getLong("uiUiUi", 0L);
        }
        this.H = long1;
        this.setContentView(2131492895);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886119);
        }
        final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.Y(true);
        }
        final Profile g3 = this.G;
        if (g3 != null) {
            final com.untis.mobile.ui.activities.classbook.absences.absencereason.b adapter = new com.untis.mobile.ui.activities.classbook.absences.absencereason.b((Context)this, g3.getMasterDataService().d(true), this.H);
            final int q2 = c.i.q2;
            ((ListView)this.findViewById(q2)).setAdapter((ListAdapter)adapter);
            ((ListView)this.findViewById(q2)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.activities.classbook.absences.absencereason.a(this, adapter));
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g != null) {
            bundle.putString("olaSeniorita", g.getUniqueId());
            bundle.putLong("uiUiUi", this.H);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014" }, d2 = { "com/untis/mobile/ui/activities/classbook/absences/absencereason/AbsenceReasonActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "absenceReason", "Landroid/content/Intent;", "a", "data", "", "b", "absenceReasonId", "c", "BUNDLE_ABSENCE_REASON_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, @f final AbsenceReason absenceReason) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)AbsenceReasonActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("olaSeniorita", s);
            long id;
            if (absenceReason == null) {
                id = 0L;
            }
            else {
                id = absenceReason.getId();
            }
            bundle.putLong("uiUiUi", id);
            intent.putExtras(bundle);
            return intent;
        }
        
        public final long b(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getLongExtra("uiUiUi", 0L);
        }
        
        @e
        public final Intent c(final long n) {
            final Intent intent = new Intent();
            intent.putExtra("uiUiUi", n);
            return intent;
        }
    }
}
