// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.homeworks;

import android.widget.ImageButton;
import android.app.Activity;
import com.untis.mobile.UntisMobileApplication;
import android.content.Intent;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.services.timetable.placeholder.p;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import com.untis.mobile.utils.time.a;
import java.util.Iterator;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.c;
import java.util.List;
import android.content.Context;
import java.util.Collection;
import kotlin.collections.v;
import org.joda.time.t;
import org.joda.time.n0;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.view.View;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0014R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorkDateSelectActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "v", "t", "Lorg/joda/time/t;", "date", "y", "Landroid/os/Bundle;", "save", "onCreate", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/services/timetable/placeholder/k;", "J", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/ui/activities/classbook/homeworks/h;", "I", "Lcom/untis/mobile/ui/activities/classbook/homeworks/h;", "adapter", "", "G", "Ljava/lang/String;", "profileId", "<init>", "()V", "K", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HomeWorkDateSelectActivity extends b
{
    @e
    public static final a K;
    @e
    private static final String L = "drumpf";
    @e
    private static final String M = "hillaryous";
    @e
    private static final String N = "bushy";
    private String G;
    private Period H;
    private h I;
    private k J;
    
    static {
        K = new a(null);
    }
    
    private final void t() {
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        final t h2 = h.getStart().h1();
        final k j = this.J;
        if (j == null) {
            k0.S("timeTableService");
            throw null;
        }
        final Period h3 = this.H;
        if (h3 == null) {
            k0.S("period");
            throw null;
        }
        final List<Period> v = j.v(h3.getLessonId());
        final ArrayList<Period> list = new ArrayList<Period>();
        for (final Period next : v) {
            if (((org.joda.time.base.e)next.getStart().h1()).m((n0)h2)) {
                list.add(next);
            }
        }
        final ArrayList<t> list2 = new ArrayList<t>();
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final t h4 = iterator2.next().getStart().h1();
            if (h4 != null) {
                list2.add(h4);
            }
        }
        this.I = new h((Context)this, (List<t>)kotlin.collections.v.L5((Collection<?>)kotlin.collections.v.h1((Iterable<? extends Comparable>)list2)));
        final int x5 = c.i.x5;
        final ListView listView = (ListView)this.findViewById(x5);
        final h i = this.I;
        if (i != null) {
            listView.setAdapter((ListAdapter)i);
            ((ListView)this.findViewById(x5)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.activities.classbook.homeworks.k(this));
            return;
        }
        k0.S("adapter");
        throw null;
    }
    
    private static final void u(final HomeWorkDateSelectActivity homeWorkDateSelectActivity, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(homeWorkDateSelectActivity, "this$0");
        final h i = homeWorkDateSelectActivity.I;
        if (i != null) {
            homeWorkDateSelectActivity.y(i.d(n));
            return;
        }
        k0.S("adapter");
        throw null;
    }
    
    private final void v() {
        final t b = com.untis.mobile.utils.time.a.b();
        new DatePickerDialog((Context)this, (DatePickerDialog$OnDateSetListener)new i(this), b.k2(), b.f3() - 1, b.X3()).show();
    }
    
    private static final void w(final HomeWorkDateSelectActivity homeWorkDateSelectActivity, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(homeWorkDateSelectActivity, "this$0");
        final h i = homeWorkDateSelectActivity.I;
        if (i != null) {
            i.b(new t(n, n2 + 1, n3));
            return;
        }
        k0.S("adapter");
        throw null;
    }
    
    private static final void x(final HomeWorkDateSelectActivity homeWorkDateSelectActivity, final View view) {
        k0.p(homeWorkDateSelectActivity, "this$0");
        homeWorkDateSelectActivity.v();
    }
    
    private final void y(final t t) {
        ((Activity)this).setResult(-1, HomeWorkDateSelectActivity.K.b(t));
        ((Activity)this).finish();
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
            string = extras2.getString("drumpf", "");
            if (string == null) {
                string = s;
            }
        }
        this.G = string;
        this.J = p.Y.a(string);
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        long long1;
        if (extras == null) {
            long1 = 0L;
        }
        else {
            long1 = extras.getLong("hillaryous");
        }
        final k j = this.J;
        if (j != null) {
            Period l;
            if ((l = j.l(long1)) == null) {
                l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
            }
            this.H = l;
            this.setContentView(2131492919);
            this.t();
            ((ImageButton)this.findViewById(c.i.w5)).setOnClickListener((View$OnClickListener)new j(this));
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0((CharSequence)((Activity)this).getString(2131886288));
            }
            final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.Y(true);
            }
            return;
        }
        k0.S("timeTableService");
        throw null;
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final String g = this.G;
        if (g == null) {
            k0.S("profileId");
            throw null;
        }
        bundle.putString("drumpf", g);
        final Period h = this.H;
        if (h != null) {
            bundle.putLong("hillaryous", h.getId());
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014" }, d2 = { "com/untis/mobile/ui/activities/classbook/homeworks/HomeWorkDateSelectActivity$a", "", "", "profileId", "", "periodId", "Landroid/content/Intent;", "c", "data", "Lorg/joda/time/t;", "kotlin.jvm.PlatformType", "a", "localDate", "b", "BUNDLE_PERIOD_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "BUNDLE_SELECTED_DATE_ISO", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final t a(@e final Intent intent) {
            k0.p(intent, "data");
            return t.c0(intent.getStringExtra("bushy"));
        }
        
        @e
        public final Intent b(@e final t t) {
            k0.p(t, "localDate");
            final Intent intent = new Intent();
            intent.putExtra("bushy", t.toString());
            return intent;
        }
        
        @e
        public final Intent c(@e final String s, final long n) {
            k0.p(s, "profileId");
            final Intent intent = new Intent((Context)UntisMobileApplication.I.b(), (Class)HomeWorkDateSelectActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("drumpf", s);
            bundle.putLong("hillaryous", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
