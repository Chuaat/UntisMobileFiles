// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.events;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.text.s;
import java.util.Objects;
import android.annotation.SuppressLint;
import java.util.Comparator;
import kotlin.collections.v;
import java.util.List;
import kotlin.jvm.internal.k0;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.c;
import android.content.Context;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import android.view.View;
import android.widget.AdapterView;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0014R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/events/EventReasonGroupActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "s", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReasonGroup;", "u", "Landroid/os/Bundle;", "save", "onCreate", "onResume", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "outState", "onSaveInstanceState", "Lcom/untis/mobile/services/masterdata/a;", "I", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "H", "J", "selectedGroupId", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class EventReasonGroupActivity extends b
{
    @e
    public static final a J;
    @e
    private static final String K = "hugo";
    @e
    private static final String L = "herbert";
    private Profile G;
    private long H;
    private com.untis.mobile.services.masterdata.a I;
    
    static {
        J = new a(null);
    }
    
    private final void s() {
        final c0 adapter = new c0((Context)this, this.u(), this.H);
        final int m5 = c.i.m5;
        ((ListView)this.findViewById(m5)).setAdapter((ListAdapter)adapter);
        ((ListView)this.findViewById(m5)).setOnItemClickListener((AdapterView$OnItemClickListener)new a0(this, adapter));
    }
    
    private static final void t(final EventReasonGroupActivity eventReasonGroupActivity, final c0 c0, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(eventReasonGroupActivity, "this$0");
        k0.p(c0, "$eventReasonGroupAdapter");
        ((Activity)eventReasonGroupActivity).setResult(-1, EventReasonGroupActivity.J.c(c0.a(n).getId()));
        ((Activity)eventReasonGroupActivity).finish();
    }
    
    @SuppressLint({ "DefaultLocale" })
    private final List<EventReasonGroup> u() {
        final com.untis.mobile.services.masterdata.a i = this.I;
        if (i != null) {
            return (List<EventReasonGroup>)v.h5((Iterable<?>)i.i(true), (Comparator<? super Object>)b0.G);
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private static final int v(final EventReasonGroup eventReasonGroup, final EventReasonGroup eventReasonGroup2) {
        final String name = eventReasonGroup.getName();
        Objects.requireNonNull(name, "null cannot be cast to non-null type kotlin.CharSequence");
        final String string = s.B5((CharSequence)name).toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        final String lowerCase = string.toLowerCase();
        k0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
        final String name2 = eventReasonGroup2.getName();
        Objects.requireNonNull(name2, "null cannot be cast to non-null type kotlin.CharSequence");
        final String string2 = s.B5((CharSequence)name2).toString();
        Objects.requireNonNull(string2, "null cannot be cast to non-null type java.lang.String");
        final String lowerCase2 = string2.toLowerCase();
        k0.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
        return lowerCase.compareTo(lowerCase2);
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
            string = extras.getString("hugo", "");
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
        this.I = g2.getMasterDataService();
        Bundle extras2;
        if ((extras2 = bundle) == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        long long1;
        if (extras2 == null) {
            long1 = 0L;
        }
        else {
            long1 = extras2.getLong("herbert");
        }
        this.H = long1;
        this.setContentView(2131492914);
        this.s();
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)((Activity)this).getString(2131886210));
        }
        final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.Y(true);
        }
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
    
    @Override
    protected void onResume() {
        super.onResume();
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g != null) {
            bundle.putString("hugo", g.getUniqueId());
            bundle.putLong("herbert", this.H);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012" }, d2 = { "com/untis/mobile/ui/activities/classbook/events/EventReasonGroupActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "selectedGroupId", "Landroid/content/Intent;", "a", "data", "b", "c", "BUNDLE_PROFILE_ID", "Ljava/lang/String;", "BUNDLE_SELECTED_GROUP_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)EventReasonGroupActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("hugo", s);
            bundle.putLong("herbert", n);
            intent.putExtras(bundle);
            return intent;
        }
        
        public final long b(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getLongExtra("herbert", 0L);
        }
        
        @e
        public final Intent c(final long n) {
            final Intent intent = new Intent();
            intent.putExtra("herbert", n);
            return intent;
        }
    }
}
