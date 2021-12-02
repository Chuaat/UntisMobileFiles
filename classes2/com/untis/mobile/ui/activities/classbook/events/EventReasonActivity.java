// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.events;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.view.MenuItem;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.text.s;
import java.util.Objects;
import android.annotation.SuppressLint;
import java.util.Iterator;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import java.util.Comparator;
import com.untis.mobile.persistence.models.EntityType;
import java.util.Collection;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k0;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.c;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0014R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016¨\u0006$" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/events/EventReasonActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "s", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "u", "Landroid/os/Bundle;", "save", "onCreate", "onResume", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "H", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "Lcom/untis/mobile/services/masterdata/a;", "J", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "I", "groupId", "<init>", "()V", "K", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class EventReasonActivity extends b
{
    @e
    public static final a K;
    @e
    private static final String L = "schlange";
    @e
    private static final String M = "echse";
    @e
    private static final String N = "dinosaurier";
    private Profile G;
    private Event H;
    private long I;
    private com.untis.mobile.services.masterdata.a J;
    
    static {
        K = new a(null);
    }
    
    private final void s() {
        final List<EventReason> u = this.u();
        final Event h = this.H;
        if (h != null) {
            final EventReason eventReason = h.getEventReason();
            long id;
            if (eventReason == null) {
                id = 0L;
            }
            else {
                id = eventReason.getId();
            }
            final z adapter = new z((Context)this, u, id);
            final int o5 = c.i.o5;
            ((ListView)this.findViewById(o5)).setAdapter((ListAdapter)adapter);
            ((ListView)this.findViewById(o5)).setOnItemClickListener((AdapterView$OnItemClickListener)new x(this, adapter));
            return;
        }
        k0.S("event");
        throw null;
    }
    
    private static final void t(final EventReasonActivity eventReasonActivity, final z z, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(eventReasonActivity, "this$0");
        k0.p(z, "$eventReasonAdapter");
        final Event h = eventReasonActivity.H;
        if (h == null) {
            k0.S("event");
            throw null;
        }
        h.setEventReason(z.a(n));
        final a k = EventReasonActivity.K;
        final Event h2 = eventReasonActivity.H;
        if (h2 != null) {
            ((Activity)eventReasonActivity).setResult(-1, k.c(h2));
            ((Activity)eventReasonActivity).finish();
            return;
        }
        k0.S("event");
        throw null;
    }
    
    @SuppressLint({ "DefaultLocale" })
    private final List<EventReason> u() {
        final com.untis.mobile.services.masterdata.a j = this.J;
        if (j == null) {
            k0.S("masterDataService");
            throw null;
        }
        final EventReasonGroup c = j.C(this.I);
        final com.untis.mobile.services.masterdata.a i = this.J;
        if (i != null) {
            final List<EventReason> r = i.r(true);
            final ArrayList<Object> list = new ArrayList<Object>();
            for (final EventReason next : r) {
                final EventReason eventReason = next;
                final EntityType entityType = eventReason.getEntityType();
                final Event h = this.H;
                if (h == null) {
                    k0.S("event");
                    throw null;
                }
                final EntityType entityType2 = h.getEntityType();
                boolean b = false;
                if (entityType == entityType2) {
                    if (c == null || eventReason.getGroupId() == c.getId()) {
                        b = true;
                    }
                }
                if (!b) {
                    continue;
                }
                list.add(next);
            }
            final List<EventReason> l5 = v.L5((Collection<? extends EventReason>)list);
            final String string = ((Activity)this).getString(2131886745);
            k0.o(string, "getString(R.string.shared_noSelection_text)");
            l5.add(new EventReason(0L, string, null, null, 0L, false, 60, null));
            v.p0((List<Object>)l5, y.G);
            return l5;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private static final int v(final EventReason eventReason, final EventReason eventReason2) {
        if (eventReason.getId() == 0L) {
            return -1;
        }
        if (eventReason2.getId() == 0L) {
            return 1;
        }
        final String name = eventReason.getName();
        Objects.requireNonNull(name, "null cannot be cast to non-null type kotlin.CharSequence");
        final String string = s.B5((CharSequence)name).toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        final String lowerCase = string.toLowerCase();
        k0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
        final String name2 = eventReason2.getName();
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
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        final String s = "";
        String string;
        if (extras2 == null) {
            string = s;
        }
        else {
            string = extras2.getString("schlange", "");
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
        this.J = g2.getMasterDataService();
        Bundle extras3;
        if (extras == null) {
            extras3 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras3 = extras;
        }
        Event event;
        if (extras3 == null) {
            event = null;
        }
        else {
            event = (Event)extras3.getParcelable("echse");
        }
        Event h = event;
        if (event == null) {
            h = new Event(0L, 0L, null, 0L, null, null, null, false, 255, null);
        }
        this.H = h;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        long long1 = 0L;
        if (extras != null) {
            long1 = extras.getLong("dinosaurier", 0L);
        }
        this.I = long1;
        this.setContentView(2131492913);
        this.s();
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)((Activity)this).getString(2131886213));
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
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("schlange", g.getUniqueId());
        final Event h = this.H;
        if (h != null) {
            bundle.putParcelable("echse", (Parcelable)h);
            return;
        }
        k0.S("event");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015" }, d2 = { "com/untis/mobile/ui/activities/classbook/events/EventReasonActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "", "groupId", "Landroid/content/Intent;", "b", "data", "a", "c", "BUNDLE_EVENT", "Ljava/lang/String;", "BUNDLE_GROUP_ID", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @f
        public final Event a(@e final Intent intent) {
            k0.p(intent, "data");
            return (Event)intent.getParcelableExtra("echse");
        }
        
        @e
        public final Intent b(@e final Context context, @e final String s, @e final Event event, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(event, "event");
            final Intent intent = new Intent(context, (Class)EventReasonActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("schlange", s);
            bundle.putParcelable("echse", (Parcelable)event);
            bundle.putLong("dinosaurier", n);
            intent.putExtras(bundle);
            return intent;
        }
        
        @e
        public final Intent c(@e final Event event) {
            k0.p(event, "event");
            final Intent intent = new Intent();
            intent.putExtra("echse", (Parcelable)event);
            return intent;
        }
    }
}
