// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import androidx.fragment.app.d;
import android.app.Activity;
import android.content.Context;
import com.untis.mobile.UntisMobileApplication;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.material.tabs.TabLayout$i;
import java.util.Iterator;
import androidx.fragment.app.FragmentManager;
import kotlin.collections.v;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import com.viewpagerindicator.CirclePageIndicator;
import androidx.viewpager.widget.a;
import com.untis.mobile.ui.activities.views.NonSwipeableViewPager;
import androidx.appcompat.widget.Toolbar;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import org.joda.time.c;
import org.joda.time.t;
import org.joda.time.l0;
import org.joda.time.n0;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import org.joda.time.r;
import java.util.List;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0014R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/ui/activities/parentday/ParentDayMultipleDayAppointmentActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "", "Lorg/joda/time/r;", "q", "Landroid/os/Bundle;", "save", "Lkotlin/j2;", "onCreate", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "H", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "parentDay", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ParentDayMultipleDayAppointmentActivity extends b
{
    @e
    public static final a I;
    @e
    private static final String J = "hund";
    @e
    private static final String K = "giraffe";
    private Profile G;
    private ParentDay H;
    
    static {
        I = new a(null);
    }
    
    private final List<r> q() {
        final ArrayList<r> list = new ArrayList<r>();
        final ParentDay h = this.H;
        if (h == null) {
            k0.S("parentDay");
            throw null;
        }
        t t = h.getStart().h1();
        final ParentDay h2 = this.H;
        if (h2 != null) {
            while (((org.joda.time.base.e)t).o((n0)h2.getEnd().h1().l0(1))) {
                final ParentDay h3 = this.H;
                if (h3 == null) {
                    k0.S("parentDay");
                    throw null;
                }
                final c x0 = t.x0(h3.getStart().j1());
                final ParentDay h4 = this.H;
                if (h4 == null) {
                    k0.S("parentDay");
                    throw null;
                }
                list.add(new r((l0)x0, (l0)t.x0(h4.getEnd().j1())));
                t = t.l0(1);
            }
            return list;
        }
        k0.S("parentDay");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        final j0 g = j0.G;
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
            string = extras2.getString("hund", "");
            if (string == null) {
                string = s;
            }
        }
        Profile l;
        if ((l = g.l(string)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.G = l;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        ParentDay parentDay;
        if (extras == null) {
            parentDay = null;
        }
        else {
            parentDay = (ParentDay)extras.getParcelable("giraffe");
        }
        ParentDay h = parentDay;
        if (parentDay == null) {
            h = new ParentDay(0L, null, null, null, null, 31, null);
        }
        this.H = h;
        this.setContentView(2131492943);
        this.setSupportActionBar((Toolbar)this.findViewById(com.untis.mobile.c.i.B8));
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            final ParentDay h2 = this.H;
            if (h2 == null) {
                k0.S("parentDay");
                throw null;
            }
            supportActionBar.A0((CharSequence)h2.getName());
        }
        final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
        if (supportActionBar2 != null) {
            final StringBuilder sb = new StringBuilder();
            final ParentDay h3 = this.H;
            if (h3 == null) {
                k0.S("parentDay");
                throw null;
            }
            sb.append(((org.joda.time.base.a)h3.getStart()).g4("H:mm"));
            sb.append(" - ");
            final ParentDay h4 = this.H;
            if (h4 == null) {
                k0.S("parentDay");
                throw null;
            }
            sb.append((Object)((org.joda.time.base.a)h4.getEnd()).g4("H:mm"));
            supportActionBar2.y0((CharSequence)sb.toString());
        }
        final androidx.appcompat.app.a supportActionBar3 = this.getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.Y(true);
        }
        final List<r> q = this.q();
        final int c8 = com.untis.mobile.c.i.C8;
        final NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager)this.findViewById(c8);
        final FragmentManager supportFragmentManager = ((d)this).getSupportFragmentManager();
        k0.o(supportFragmentManager, "supportFragmentManager");
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g2.getUniqueId();
        final ParentDay h5 = this.H;
        if (h5 != null) {
            nonSwipeableViewPager.setAdapter((androidx.viewpager.widget.a)new i(supportFragmentManager, uniqueId, h5, q));
            ((NonSwipeableViewPager)this.findViewById(c8)).setOffscreenPageLimit(3);
            ((CirclePageIndicator)this.findViewById(com.untis.mobile.c.i.z8)).setViewPager((ViewPager)this.findViewById(c8));
            ((TabLayout)this.findViewById(com.untis.mobile.c.i.A8)).setupWithViewPager((ViewPager)this.findViewById(c8));
            int n = 0;
            for (final r next : q) {
                if (n < 0) {
                    v.W();
                }
                final r r = next;
                final TabLayout$i z = ((TabLayout)this.findViewById(com.untis.mobile.c.i.A8)).z(n);
                if (z != null) {
                    z.D((CharSequence)((org.joda.time.base.a)((org.joda.time.base.d)r).b()).g4("E dd.MM.yyyy"));
                }
                ++n;
            }
            return;
        }
        k0.S("parentDay");
        throw null;
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("hund", g.getUniqueId());
        final ParentDay h = this.H;
        if (h != null) {
            bundle.putParcelable("giraffe", (Parcelable)h);
            return;
        }
        k0.S("parentDay");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e" }, d2 = { "com/untis/mobile/ui/activities/parentday/ParentDayMultipleDayAppointmentActivity$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "parentday", "Landroid/content/Intent;", "a", "", "BUNDLE_PARENT_DAY", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Profile profile, @e final ParentDay parentDay) {
            k0.p(profile, "profile");
            k0.p(parentDay, "parentday");
            final Intent intent = new Intent((Context)UntisMobileApplication.I.b(), (Class)ParentDayMultipleDayAppointmentActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("hund", profile.getUniqueId());
            bundle.putParcelable("giraffe", (Parcelable)parentDay);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
