// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.duty;

import android.widget.TextView;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.Intent;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.y0;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.LinkedHashMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.utils.extension.q;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import kotlin.collections.v;
import java.util.Objects;
import java.util.Comparator;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import java.util.Iterator;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import com.untis.mobile.persistence.models.classbook.duty.Duty;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k0;
import android.content.Context;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0003J\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001e¨\u0006," }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/duty/DutiesActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "", "appBarSubtitle", "Lkotlin/j2;", "w", "x", "y", "Lcom/untis/mobile/ui/activities/classbook/duty/c;", "q", "", "Lcom/untis/mobile/ui/activities/classbook/duty/b;", "r", "Lcom/untis/mobile/persistence/models/classbook/duty/ClassRole;", "u", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "v", "duty", "classRoles", "s", "t", "z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/services/classbook/a;", "J", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/services/masterdata/a;", "I", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "H", "periodId", "<init>", "()V", "K", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DutiesActivity extends b
{
    @e
    public static final a K;
    @e
    public static final String L = "bumblebees";
    @e
    public static final String M = "breadberries";
    @e
    public static final String N = "cranberries";
    private Profile G;
    private long H;
    private com.untis.mobile.services.masterdata.a I;
    private com.untis.mobile.services.classbook.a J;
    
    static {
        K = new a(null);
    }
    
    public DutiesActivity() {
        this.H = -1L;
    }
    
    private final c q() {
        final List<com.untis.mobile.ui.activities.classbook.duty.b> r = this.r();
        final Profile g = this.G;
        if (g != null) {
            return new c((Context)this, r, g.getUniqueId(), this.H);
        }
        k0.S("profile");
        throw null;
    }
    
    private final List<com.untis.mobile.ui.activities.classbook.duty.b> r() {
        final ArrayList<com.untis.mobile.ui.activities.classbook.duty.b> list = new ArrayList<com.untis.mobile.ui.activities.classbook.duty.b>();
        final List<ClassRole> u = this.u();
        final Iterator<Duty> iterator = this.v().iterator();
        while (iterator.hasNext()) {
            final com.untis.mobile.ui.activities.classbook.duty.b s = this.s(iterator.next(), u);
            if (s.a().isEmpty() ^ true) {
                list.add(s);
            }
        }
        return list;
    }
    
    private final com.untis.mobile.ui.activities.classbook.duty.b s(final Duty duty, final List<ClassRole> list) {
        return new com.untis.mobile.ui.activities.classbook.duty.b(duty, this.z(this.t(list, duty)));
    }
    
    private final List<ClassRole> t(final List<ClassRole> list, final Duty duty) {
        final ArrayList<ClassRole> list2 = new ArrayList<ClassRole>();
        for (final ClassRole classRole : list) {
            if (duty.getId() == classRole.getDutyId()) {
                list2.add(classRole);
            }
        }
        return list2;
    }
    
    private final List<ClassRole> u() {
        final com.untis.mobile.services.classbook.a j = this.J;
        if (j != null) {
            Classbook s;
            if ((s = j.S(this.H)) == null) {
                s = new Classbook(this.H, null, null, null, null, null, null, false, false, null, 1022, null);
            }
            return s.getClassRoles();
        }
        k0.S("classBookService");
        throw null;
    }
    
    @SuppressLint({ "DefaultLocale" })
    private final List<Duty> v() {
        final com.untis.mobile.services.masterdata.a i = this.I;
        if (i != null) {
            return (List<Duty>)v.h5((Iterable<?>)i.F(), (Comparator<? super Object>)new Comparator<Object>() {
                @Override
                public final int compare(final T t, final T t2) {
                    final String name = ((Duty)t).getName();
                    Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
                    final String lowerCase = name.toLowerCase();
                    k0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                    final String name2 = ((Duty)t2).getName();
                    Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
                    final String lowerCase2 = name2.toLowerCase();
                    k0.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    return kotlin.comparisons.a.g(lowerCase, lowerCase2);
                }
            });
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private final void w(final String s) {
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)((Activity)this).getString(2131886203));
            supportActionBar.y0((CharSequence)s);
            supportActionBar.Y(true);
        }
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    private final void x() {
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(com.untis.mobile.c.i.U4);
        boolean b = true;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((RecyclerView$h)this.q());
        recyclerView.setLayoutManager((RecyclerView$p)new LinearLayoutManager(((ViewGroup)recyclerView).getContext()));
        final RecyclerView$h adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() != 0) {
            b = false;
        }
        if (b) {
            this.y();
        }
    }
    
    private final void y() {
        ((FloatingActionButton)this.findViewById(com.untis.mobile.c.i.SD)).setImageDrawable(d.i((Context)this, 2131231096));
        ((TextView)this.findViewById(com.untis.mobile.c.i.VD)).setText(2131886221);
        final int ud = com.untis.mobile.c.i.UD;
        ((TextView)this.findViewById(ud)).setText((CharSequence)"");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(ud);
        k0.o(appCompatTextView, "layout_empty_view_subtitle");
        q.e(appCompatTextView, null, 0, 3, null);
        ((ViewGroup)this.findViewById(com.untis.mobile.c.i.TD)).setVisibility(0);
    }
    
    private final List<ClassRole> z(final List<ClassRole> list) {
        final com.untis.mobile.services.masterdata.a i = this.I;
        if (i != null) {
            final List<Student> s = i.s();
            final LinkedHashMap<String, ClassRole> linkedHashMap = new LinkedHashMap<String, ClassRole>();
        Label_0032:
            for (final ClassRole classRole : list) {
                while (true) {
                    for (final Student next : s) {
                        if (next.getId() == classRole.getStudentId()) {
                            final Student student = next;
                            String lastName;
                            if (student == null) {
                                lastName = null;
                            }
                            else {
                                lastName = student.getLastName();
                            }
                            if (lastName == null) {
                                continue Label_0032;
                            }
                            linkedHashMap.put(lastName, classRole);
                            continue Label_0032;
                        }
                    }
                    Student next = null;
                    continue;
                }
            }
            final Collection<Object> values = y0.q((Map<? extends Comparable, ?>)linkedHashMap).values();
            k0.o(values, "lastNameToClassRole.toSortedMap().values");
            return v.I5((Iterable<? extends ClassRole>)values);
        }
        k0.S("masterDataService");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492910);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
            if (extras == null) {
                throw new IllegalStateException("extras must not be null");
            }
        }
        final String s = "";
        String string;
        if ((string = extras.getString("breadberries", "")) == null) {
            string = "";
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
        final Profile g3 = this.G;
        if (g3 != null) {
            this.J = g3.getClassBookService();
            this.H = extras.getLong("cranberries");
            String string2 = extras.getString("bumblebees", "");
            if (string2 == null) {
                string2 = s;
            }
            this.w(string2);
            this.x();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011" }, d2 = { "com/untis/mobile/ui/activities/classbook/duty/DutiesActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "periodId", "actionBarSubtitle", "Landroid/content/Intent;", "a", "BUNDLE_ACTIONBAR_SUBTITLE", "Ljava/lang/String;", "BUNDLE_PERIOD_ID", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n, @e final String s2) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(s2, "actionBarSubtitle");
            final Intent intent = new Intent(context, (Class)DutiesActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("breadberries", s);
            bundle.putLong("cranberries", n);
            bundle.putString("bumblebees", s2);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
