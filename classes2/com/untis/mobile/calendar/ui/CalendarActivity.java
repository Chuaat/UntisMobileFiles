// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui;

import android.app.Activity;
import java.util.Collection;
import kotlin.n1;
import kotlin.s0;
import kotlin.jvm.internal.k0;
import android.content.Intent;
import org.joda.time.c;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import kotlin.collections.v;
import kotlin.collections.m;
import android.content.Context;
import com.untis.mobile.ui.activities.launcher.LauncherActivity;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/calendar/ui/CalendarActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/j2;", "onCreate", "onResume", "Lcom/untis/mobile/calendar/ui/a;", "G", "Lkotlin/b0;", "q", "()Lcom/untis/mobile/calendar/ui/a;", "model", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "profile_id";
    @e
    private static final String J = "period_id";
    @e
    private static final String K = "period_ids";
    @e
    private static final String L = "tt_entity_type";
    @e
    private static final String M = "tt_entity_id";
    @e
    private static final String N = "period_start";
    @e
    private static final String O = "period_end";
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public CalendarActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<com.untis.mobile.calendar.ui.a>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final a invoke() {
                return (a)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(a.class), null, null);
            }
        });
    }
    
    private final com.untis.mobile.calendar.ui.a q() {
        return this.G.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        final String d = com.untis.mobile.utils.extension.e.d(this, bundle, "profile_id");
        if (d == null) {
            ((Activity)this).startActivity(LauncherActivity.H.a((Context)this));
            ((Activity)this).finish();
            return;
        }
        this.q().m(d);
        final com.untis.mobile.calendar.ui.a q = this.q();
        final long[] c = com.untis.mobile.utils.extension.e.c(this, bundle, "period_ids");
        final c c2 = null;
        List<Long> dy;
        if (c == null) {
            dy = null;
        }
        else {
            dy = m.dy(c);
        }
        List<Long> e = dy;
        if (dy == null) {
            e = v.E();
        }
        q.k(e);
        final com.untis.mobile.calendar.ui.a q2 = this.q();
        final Long b = com.untis.mobile.utils.extension.e.b(this, bundle, "period_id");
        long n;
        if (b == null) {
            n = v.o2((List<? extends Number>)this.q().c()).longValue();
        }
        else {
            n = b;
        }
        q2.j(n);
        this.q().p(EntityType.Companion.findBy(com.untis.mobile.utils.extension.e.a(this, bundle, "tt_entity_type")));
        this.q().o(com.untis.mobile.utils.extension.e.b(this, bundle, "tt_entity_id"));
        final com.untis.mobile.calendar.ui.a q3 = this.q();
        final String d2 = com.untis.mobile.utils.extension.e.d(this, bundle, "period_start");
        c j;
        if (d2 == null) {
            j = null;
        }
        else {
            j = com.untis.mobile.utils.d0.j(d2);
        }
        q3.n(j);
        final com.untis.mobile.calendar.ui.a q4 = this.q();
        final String d3 = com.untis.mobile.utils.extension.e.d(this, bundle, "period_end");
        c i;
        if (d3 == null) {
            i = c2;
        }
        else {
            i = com.untis.mobile.utils.d0.j(d3);
        }
        q4.i(i);
        this.setContentView(2131492901);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006JL\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001d" }, d2 = { "com/untis/mobile/calendar/ui/CalendarActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "periodId", "Landroid/content/Intent;", "a", "Lcom/untis/mobile/persistence/models/EntityType;", "timetableEntityType", "timetableEntityId", "", "periodIds", "Lorg/joda/time/c;", "start", "end", "b", "ARGUMENT_PERIOD_END_ISO", "Ljava/lang/String;", "ARGUMENT_PERIOD_ID", "ARGUMENT_PERIOD_IDS", "ARGUMENT_PERIOD_START_ISO", "ARGUMENT_PROFILE_ID", "ARGUMENT_TIMETABLE_ENTITY_ID", "ARGUMENT_TIMETABLE_ENTITY_TYPE", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long l) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            return com.untis.mobile.utils.extension.e.i(context, CalendarActivity.class, n1.a("profile_id", s), n1.a("period_id", l));
        }
        
        @e
        public final Intent b(@e final Context context, @e final String s, @e final EntityType entityType, final long l, @e final List<Long> list, final long i, @e final c c, @e final c c2) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(entityType, "timetableEntityType");
            k0.p(list, "periodIds");
            k0.p(c, "start");
            k0.p(c2, "end");
            return com.untis.mobile.utils.extension.e.i(context, CalendarActivity.class, n1.a("profile_id", s), n1.a("period_id", i), n1.a("period_ids", v.J5(list)), n1.a("tt_entity_type", entityType.getWebuntisId()), n1.a("tt_entity_id", l), n1.a("period_start", com.untis.mobile.utils.d0.v(c)), n1.a("period_end", com.untis.mobile.utils.d0.v(c2)));
        }
    }
}
