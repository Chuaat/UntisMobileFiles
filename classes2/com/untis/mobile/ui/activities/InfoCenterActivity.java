// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import androidx.activity.ComponentActivity;
import android.widget.HorizontalScrollView;
import android.app.Activity;
import android.widget.FrameLayout;
import com.untis.mobile.persistence.models.profile.ProfileState;
import com.untis.mobile.utils.g0;
import android.os.Build$VERSION;
import com.untis.mobile.services.infocenter.w;
import com.untis.mobile.persistence.models.profile.Child;
import com.google.android.material.tabs.TabLayout$i;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import java.util.Iterator;
import rx.functions.q;
import java.util.ArrayList;
import androidx.annotation.w0;
import com.untis.mobile.utils.u0;
import android.util.Log;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.help.HelpActivity;
import android.view.Menu;
import com.google.android.material.bottomnavigation.BottomNavigationView$b;
import com.untis.mobile.ui.adapters.infocenter.c;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.j0;
import android.view.View$OnClickListener;
import com.untis.mobile.ui.adapters.j;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import com.untis.mobile.persistence.models.exam.Exam;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.List;
import rx.g;
import org.joda.time.t;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.k0;
import android.view.MenuItem;
import com.google.android.material.tabs.TabLayout;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.untis.mobile.ui.adapters.infocenter.d;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.View;
import com.google.android.material.tabs.TabLayout$f;
import com.untis.mobile.ui.activities.common.b;

public class InfoCenterActivity extends b implements TabLayout$f
{
    private static final String X = "exam";
    private static final String Y = "profile";
    private static final String Z = "itemId";
    private View G;
    private BottomNavigationView H;
    private ViewPager I;
    private d J;
    private CardView K;
    private TextView L;
    private LinearLayout M;
    private RelativeLayout N;
    private TabLayout O;
    @k0
    private MenuItem P;
    private Profile Q;
    private boolean R;
    private boolean S;
    private int T;
    private a U;
    private com.untis.mobile.services.infocenter.a V;
    private com.untis.mobile.systemNotifications.b W;
    
    public InfoCenterActivity() {
        this.T = -1;
    }
    
    private g<List<HomeWork>> A(final t t, final t t2) {
        return (g<List<HomeWork>>)g.U2((Object)this.V.c(this.Q, t, t2));
    }
    
    private g<List<Exam>> B(final t t, final t t2) {
        return this.V.w(this.Q, t, t2);
    }
    
    private g<List<HomeWork>> C(final t t, final t t2) {
        return this.V.g(this.Q, t, t2);
    }
    
    private g<List<Exam>> D(final t t, final t t2) {
        return this.V.f(this.Q, t, t2);
    }
    
    private g<List<HomeWork>> E(final t t, final t t2) {
        return this.V.u(this.Q, t, t2);
    }
    
    private void G(final List<OfficeHour> list) {
        this.J.f(list);
        this.W.l(this.Q.getUniqueId());
    }
    
    private void H(@k0 final List<StudentAbsence> list) {
        this.J.d(list);
    }
    
    private void I(final List<j.a> list) {
        this.J.g(list);
    }
    
    private void J() {
        ((FrameLayout)this.K).setVisibility(8);
        this.L.setVisibility(8);
        this.N.setOnClickListener((View$OnClickListener)null);
    }
    
    @j0
    public static Bundle K(@j0 final String s, final boolean b) {
        final Bundle bundle = new Bundle();
        bundle.putString("profile", s);
        bundle.putBoolean("exam", b);
        return bundle;
    }
    
    public static Intent L(final Context context, final String s) {
        final Intent intent = new Intent(context, (Class)InfoCenterActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("profile", s);
        bundle.putBoolean("exam", false);
        intent.putExtras(bundle);
        return intent;
    }
    
    private void M() {
        ((com.google.android.material.navigation.e)this.H).h(2131558412);
        final Menu menu = ((com.google.android.material.navigation.e)this.H).getMenu();
        int n;
        if (this.J.c(c.G) >= 0) {
            menu.add(0, 2131298451, 0, 2131886254).setIcon(2131230926);
            n = 2;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.J.c(c.H) >= 0) {
            menu.add(0, 2131298448, 3, 2131886128).setIcon(2131230867);
            n2 = n + 1;
        }
        int n3 = n2;
        if (this.J.c(c.J) >= 0) {
            menu.add(0, 2131298449, 4, 2131886205).setIcon(2131230876);
            n3 = n2 + 1;
        }
        ((androidx.viewpager.widget.a)this.J).notifyDataSetChanged();
        this.H.setOnNavigationItemSelectedListener((BottomNavigationView$b)new com.untis.mobile.ui.activities.b(this));
        if (n3 == 1) {
            ((FrameLayout)this.H).setVisibility(8);
            ((com.google.android.material.navigation.e)this.H).setSelectedItemId(menu.getItem(0).getItemId());
        }
    }
    
    private boolean N() {
        final Profile q = this.Q;
        boolean b = true;
        if (q == null || !q.getEntityType().isParentRole() || this.Q.getUserChildren().size() <= 1) {
            b = false;
        }
        return b;
    }
    
    private boolean P(@j0 final MenuItem menuItem) {
        final com.untis.mobile.utils.settings.old.b n = com.untis.mobile.utils.settings.old.d.n((Context)this);
        final com.untis.mobile.ui.adapters.infocenter.a i = n.i();
        final int itemId = menuItem.getItemId();
        final int n2 = 0;
        int visibility = 0;
        switch (itemId) {
            default: {
                return false;
            }
            case 2131298451: {
                this.I.setCurrentItem(this.J.c(c.G));
                this.setTitle(2131886254);
                this.T(((Activity)this).getString(2131886723).replace("{0}", n.j().g4("dd.MM.yyyy")));
                this.J();
                ((HorizontalScrollView)this.O).setVisibility(8);
                this.V(true);
                return true;
            }
            case 2131298450: {
                this.I.setCurrentItem(this.J.c(c.I));
                this.setTitle(2131886478);
                this.T("");
                this.J();
                final TabLayout o = this.O;
                if (!this.N()) {
                    visibility = 8;
                }
                ((HorizontalScrollView)o).setVisibility(visibility);
                this.V(true);
                HelpActivity.v(this, this.G);
                return true;
            }
            case 2131298449: {
                this.I.setCurrentItem(this.J.c(c.J));
                Label_0301: {
                    if (this.Q.getUserClasses().size() == 1) {
                        final String s = this.U.S(EntityType.CLASS, this.Q.getUserClasses().iterator().next());
                        if (!s.isEmpty()) {
                            this.U(s);
                            break Label_0301;
                        }
                    }
                    this.setTitle(2131886205);
                }
                this.T(i.j((Context)this));
                this.J();
                ((HorizontalScrollView)this.O).setVisibility(8);
                this.V(true);
                return true;
            }
            case 2131298448: {
                this.I.setCurrentItem(this.J.c(c.H));
                this.setTitle(2131886128);
                String s2;
                if (com.untis.mobile.ui.adapters.infocenter.a.M.equals(i)) {
                    s2 = ((Activity)this).getString(2131886330);
                }
                else {
                    s2 = ((Activity)this).getString(2131886683).replace("{0}", i.g().g4("dd.MM.yyyy")).replace("{1}", com.untis.mobile.utils.time.a.b().n0(1).g4("dd.MM.yyyy"));
                }
                this.T(s2);
                if (!this.R) {
                    this.W(2131886486);
                }
                else {
                    this.J();
                }
                final TabLayout o2 = this.O;
                int visibility2;
                if (this.N()) {
                    visibility2 = n2;
                }
                else {
                    visibility2 = 8;
                }
                ((HorizontalScrollView)o2).setVisibility(visibility2);
                this.V(true);
                HelpActivity.u(this, this.G);
                return true;
            }
        }
    }
    
    private void Q() {
        this.M.setVisibility(8);
        if (this.S) {
            HelpActivity.t(this, this.G);
            this.S = false;
        }
        else {
            com.untis.mobile.utils.a.a((Context)this).O0(false);
        }
    }
    
    private void R(@j0 final Throwable t) {
        try {
            Log.e("untis_log", String.format("error on render", new Object[0]), t);
            u0.d(this.G, t);
            this.M.setVisibility(8);
        }
        catch (Exception ex) {
            Log.e("untis_log", "error while handling throwable", (Throwable)ex);
        }
    }
    
    private void W(@w0 final int text) {
        ((FrameLayout)this.K).setVisibility(0);
        this.L.setVisibility(0);
        this.L.setText(text);
        this.N.setOnClickListener((View$OnClickListener)null);
    }
    
    private void X() {
        final com.untis.mobile.ui.adapters.infocenter.a i = com.untis.mobile.utils.settings.old.d.n((Context)this).i();
        final com.untis.mobile.services.a a = com.untis.mobile.services.a.a;
        final boolean f = a.f(this.Q);
        final boolean b = this.R && a.h(this.Q);
        final boolean j = com.untis.mobile.utils.a.a((Context)this).J(this.Q);
        if (f) {
            g.D0((g)this.V.z(com.untis.mobile.utils.settings.old.d.n((Context)this).j()), (g)this.V.n(-1L, com.untis.mobile.utils.settings.old.d.n((Context)this).j())).D5((rx.functions.b)new com.untis.mobile.ui.activities.g(this), (rx.functions.b)new com.untis.mobile.ui.activities.d(this), (rx.functions.a)new com.untis.mobile.ui.activities.c(this));
        }
        if (b) {
            g.D0((g)this.V.m(i.g(), com.untis.mobile.utils.time.a.b().n0(1)), (g)this.V.v(i.g(), com.untis.mobile.utils.time.a.b().n0(1))).D5((rx.functions.b)new f(this), (rx.functions.b)new com.untis.mobile.ui.activities.d(this), (rx.functions.a)new com.untis.mobile.ui.activities.c(this));
        }
        if (j) {
            final t b2 = com.untis.mobile.utils.time.a.b();
            final t f2 = this.F(b2);
            g.D0(g.E0((g)this.B(b2, f2), (g)this.C(b2, f2), (g)this.A(b2, f2)).m4((Object)new ArrayList(), (q)new h(this)), g.E0((g)this.D(b2, f2), (g)this.E(b2, f2), (g)this.A(b2, f2)).m4((Object)new ArrayList(), (q)new h(this))).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c()).D5((rx.functions.b)new e(this), (rx.functions.b)new com.untis.mobile.ui.activities.d(this), (rx.functions.a)new com.untis.mobile.ui.activities.c(this));
        }
        if (!f && !b && !j) {
            this.M.setVisibility(8);
        }
    }
    
    public static void Y(@j0 final Context context, @j0 final Profile profile, final int n) {
        final Intent intent = new Intent(context, (Class)InfoCenterActivity.class);
        intent.putExtras(K(profile.getUniqueId(), false));
        intent.getExtras().putInt("itemId", n);
        intent.putExtra("itemId", n);
        context.startActivity(intent);
    }
    
    public static void Z(@j0 final Context context, @j0 final Profile profile, final boolean b) {
        final Intent intent = new Intent(context, (Class)InfoCenterActivity.class);
        intent.putExtras(K(profile.getUniqueId(), b));
        context.startActivity(intent);
    }
    
    @j0
    private List<j.a> y(@j0 final List<j.a> list, @k0 final Object o) {
        if (o == null) {
            list.add(null);
            return list;
        }
        if (o instanceof ArrayList) {
            for (final Exam next : (ArrayList)o) {
                if (next instanceof Exam) {
                    list.add(new j.a(next, this.Q.getUniqueId()));
                }
                if (next instanceof HomeWork) {
                    list.add(new j.a((HomeWork)next, this.Q.getUniqueId()));
                }
            }
        }
        return list;
    }
    
    @j0
    private List<c> z(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final ArrayList<c> list = new ArrayList<c>();
        if (b4) {
            list.add(c.I);
        }
        if (b) {
            list.add(c.G);
        }
        if (b2) {
            list.add(c.H);
        }
        if (b3) {
            list.add(c.J);
        }
        return list;
    }
    
    public t F(final t t) {
        final Schoolyear m = this.U.M(t);
        if (m != null) {
            return m.getEnd();
        }
        return t.q0(1);
    }
    
    public void S(@w0 final int n) {
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.x0(n);
        }
    }
    
    public void T(@j0 final String s) {
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.y0((CharSequence)s);
        }
    }
    
    public void U(@j0 final String s) {
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)s);
        }
    }
    
    public void V(final boolean visible) {
        final MenuItem p = this.P;
        if (p != null) {
            p.setVisible(visible);
        }
    }
    
    public void a0() {
        this.J.h();
    }
    
    public void g(final TabLayout$i tabLayout$i) {
    }
    
    public void i(@j0 final TabLayout$i tabLayout$i) {
        final Object m = tabLayout$i.m();
        if (m != null && m instanceof Child) {
            final Child child = (Child)m;
            Log.d("untis_log", String.format("onTabSelected for %s", child.toString()));
            this.J.e(child);
        }
        else {
            Log.d("untis_log", String.format("onTabSelected for null-tag (all or self)", new Object[0]));
            this.J.e(null);
        }
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean b = n2 == -1;
        Label_0081: {
            if (n != 120) {
                if (n != 130) {
                    if (n != 900) {
                        break Label_0081;
                    }
                    if (!b) {
                        return;
                    }
                }
                else if (!b) {
                    return;
                }
                Y((Context)this, this.Q, ((com.google.android.material.navigation.e)this.H).getSelectedItemId());
                ((Activity)this).finish();
                return;
            }
            if (b) {
                this.a0();
            }
        }
        super.onActivityResult(n, n2, intent);
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492923);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        final boolean b = false;
        boolean boolean1;
        if (extras != null) {
            this.Q = com.untis.mobile.services.profile.legacy.j0.G.l(extras.getString("profile", ""));
            boolean1 = extras.getBoolean("exam", false);
            this.T = extras.getInt("itemId", -1);
        }
        else {
            boolean1 = false;
        }
        if (this.Q == null) {
            this.Q = com.untis.mobile.services.profile.legacy.j0.G.n();
        }
        this.U = this.Q.getMasterDataService();
        this.V = new w(this.Q.getUniqueId());
        this.W = new com.untis.mobile.systemNotifications.d().a();
        this.G = this.findViewById(2131296640);
        this.M = (LinearLayout)this.findViewById(2131296775);
        this.O = (TabLayout)this.findViewById(2131296641);
        this.I = (ViewPager)this.findViewById(2131296642);
        this.H = (BottomNavigationView)this.findViewById(2131296623);
        this.K = (CardView)this.findViewById(2131296636);
        this.L = (TextView)this.findViewById(2131296637);
        this.N = (RelativeLayout)this.findViewById(2131296639);
        this.R = com.untis.mobile.utils.a.a((Context)this).I(this.Q);
        final com.untis.mobile.services.a a = com.untis.mobile.services.a.a;
        boolean b2 = b;
        Label_0311: {
            if (a.h(this.Q)) {
                if (!this.Q.getEntityType().isParentRole()) {
                    b2 = b;
                    if (!this.Q.getEntityType().isStudentRole()) {
                        break Label_0311;
                    }
                }
                b2 = true;
            }
        }
        final boolean f = a.f(this.Q);
        final List<c> z = this.z(f, b2, a.b(this.Q), a.i(this.Q));
        if (z.isEmpty()) {
            ((Activity)this).finish();
            return;
        }
        this.J = new d(this, ((androidx.fragment.app.d)this).getSupportFragmentManager(), this.Q, z);
        this.I.setOffscreenPageLimit(3);
        this.I.setAdapter((androidx.viewpager.widget.a)this.J);
        this.M();
        int t = this.T;
        Label_0452: {
            if (t <= -1) {
                t = 2131298450;
                if (!boolean1) {
                    if (f) {
                        ((com.google.android.material.navigation.e)this.H).setSelectedItemId(2131298451);
                        break Label_0452;
                    }
                }
            }
            ((com.google.android.material.navigation.e)this.H).setSelectedItemId(t);
        }
        if (this.N()) {
            if (Build$VERSION.SDK_INT >= 21 && this.getSupportActionBar() != null) {
                this.O.setElevation(this.getSupportActionBar().q());
                this.getSupportActionBar().f0(0.0f);
            }
            if (this.Q.getUserChildren().size() > 0) {
                final TabLayout$i d = this.O.D();
                d.D((CharSequence)((Activity)this).getString(2131886670));
                d.B((Object)null);
                this.O.e(d);
            }
            for (final Child child : this.Q.getUserChildren()) {
                final TabLayout$i d2 = this.O.D();
                final StringBuilder sb = new StringBuilder();
                sb.append(child.getFirstName());
                sb.append(" ");
                sb.append(child.getLastName());
                d2.D((CharSequence)sb.toString());
                d2.B((Object)child);
                this.O.e(d2);
            }
            this.O.d((TabLayout$f)this);
        }
        else {
            ((HorizontalScrollView)this.O).setVisibility(8);
        }
        this.X();
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.Y(true);
        }
        this.findViewById(2131296771).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.a(this));
    }
    
    public boolean onCreateOptionsMenu(@k0 final Menu menu) {
        this.getMenuInflater().inflate(2131558407, menu);
        if (menu != null && (this.P = menu.findItem(2131298437)) != null) {
            this.P.setVisible(com.untis.mobile.services.a.a.f(this.Q));
        }
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@j0 final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            return true;
        }
        if (itemId != 2131298437) {
            return super.onOptionsItemSelected(menuItem);
        }
        InfoCenterFilterActivity.G(this, this.J.a(this.I.getCurrentItem()));
        return true;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        final boolean a = g0.a((Context)this);
        int visibility = 0;
        View view;
        if (a && !this.Q.hasAnyState(ProfileState.InvalidApiSharedSecret, ProfileState.ServerDownForMaintenance)) {
            view = this.findViewById(2131296771);
            visibility = 8;
        }
        else {
            view = this.findViewById(2131296771);
        }
        view.setVisibility(visibility);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final BottomNavigationView h = this.H;
        if (h != null) {
            bundle.putInt("itemId", ((com.google.android.material.navigation.e)h).getSelectedItemId());
        }
        bundle.putString("profile", this.Q.getUniqueId());
    }
    
    public void p(final TabLayout$i tabLayout$i) {
    }
    
    public void setTitle(@w0 final int n) {
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(n);
        }
    }
}
