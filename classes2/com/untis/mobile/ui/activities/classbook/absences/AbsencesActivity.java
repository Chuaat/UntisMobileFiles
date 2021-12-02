// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.absences;

import android.widget.ImageButton;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import kotlin.collections.v;
import android.view.MenuItem;
import java.util.Iterator;
import com.untis.mobile.services.masterdata.a;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import kotlin.sequences.p;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.collections.m;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import java.util.List;
import com.untis.mobile.utils.u0;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import org.jetbrains.annotations.f;
import android.content.Intent;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.widget.AdapterView;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\b0\u001fj\b\u0012\u0004\u0012\u00020\b` 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00064" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/absences/AbsencesActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "w", "Landroid/os/Bundle;", "save", "onCreate", "onResume", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "studentAbsence", "t", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "J", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "K", "Ljava/util/ArrayList;", "absences", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/ui/activities/classbook/absences/h;", "L", "Lcom/untis/mobile/ui/activities/classbook/absences/h;", "absenceAdapter", "<init>", "()V", "M", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AbsencesActivity extends b
{
    @e
    public static final a M;
    @e
    private static final String N = "blab";
    @e
    private static final String O = "blub";
    @e
    private static final String P = "blob";
    @e
    private static final String Q = "blib";
    private Profile G;
    private Period H;
    private Classbook I;
    private Student J;
    @e
    private final ArrayList<StudentAbsence> K;
    private h L;
    
    static {
        M = new a(null);
    }
    
    public AbsencesActivity() {
        this.K = new ArrayList<StudentAbsence>();
    }
    
    public static final /* synthetic */ Profile s(final AbsencesActivity absencesActivity) {
        return absencesActivity.G;
    }
    
    private static final void u(final AbsencesActivity absencesActivity, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(absencesActivity, "this$0");
        final h l = absencesActivity.L;
        if (l != null) {
            absencesActivity.t(l.o(n));
            return;
        }
        k0.S("absenceAdapter");
        throw null;
    }
    
    private static final void v(final AbsencesActivity absencesActivity, final View view) {
        k0.p(absencesActivity, "this$0");
        absencesActivity.w();
    }
    
    private final void w() {
        final AbsenceDetailActivity.a m = AbsenceDetailActivity.M;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final Student j = this.J;
        if (j == null) {
            k0.S("student");
            throw null;
        }
        final Period h = this.H;
        if (h != null) {
            ((ComponentActivity)this).startActivityForResult(m.b((Context)this, uniqueId, j, h), 1301);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n == 1301) {
            if (b && intent != null) {
                final AbsenceDetailActivity.a m = AbsenceDetailActivity.M;
                h h;
                List<StudentAbsence> list;
                if (m.e(intent)) {
                    this.K.removeAll(m.k(intent));
                    h = this.L;
                    if (h == null) {
                        k0.S("absenceAdapter");
                        throw null;
                    }
                    list = this.K;
                }
                else {
                    h = this.L;
                    if (h == null) {
                        k0.S("absenceAdapter");
                        throw null;
                    }
                    list = m.k(intent);
                }
                h.w(list);
                if (m.f(intent)) {
                    u0.p(this.findViewById(c.i.u2), ((Activity)this).getString(2131886217));
                }
                ((Activity)this).setResult(-1);
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
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
        String string = null;
        Label_0048: {
            if (extras2 != null) {
                string = extras2.getString("blab", "");
                if (string != null) {
                    break Label_0048;
                }
            }
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
        Bundle extras3;
        if (extras == null) {
            extras3 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras3 = extras;
        }
        final long n = 0L;
        long long1;
        if (extras3 == null) {
            long1 = 0L;
        }
        else {
            long1 = extras3.getLong("blub");
        }
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        Period l;
        if ((l = g3.getTimeTableService().l(long1)) == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = l;
        final Profile g4 = this.G;
        if (g4 == null) {
            k0.S("profile");
            throw null;
        }
        Classbook s;
        if ((s = g4.getClassBookService().S(long1)) == null) {
            s = new Classbook(long1, null, null, null, null, null, null, false, false, null, 1022, null);
        }
        this.I = s;
        final Profile g5 = this.G;
        if (g5 == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.masterdata.a masterDataService = g5.getMasterDataService();
        Bundle extras4;
        if (extras == null) {
            extras4 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras4 = extras;
        }
        long long2;
        if (extras4 == null) {
            long2 = n;
        }
        else {
            long2 = extras4.getLong("blob");
        }
        Student v;
        if ((v = masterDataService.V(long2)) == null) {
            v = new Student(0L, null, null, null, null, 31, null);
        }
        this.J = v;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            final long[] longArray = extras.getLongArray("blib");
            if (longArray != null) {
                final kotlin.sequences.m<Long> g6 = m.g5(longArray);
                if (g6 != null) {
                    final kotlin.sequences.m i1 = p.i1((kotlin.sequences.m)g6, (l)new l<Long, StudentAbsence>() {
                        final /* synthetic */ AbsencesActivity G;
                        
                        @f
                        public final StudentAbsence a(final long n) {
                            final Profile s = AbsencesActivity.s(this.G);
                            if (s != null) {
                                return s.getClassBookService().Z(n);
                            }
                            k0.S("profile");
                            throw null;
                        }
                    });
                    if (i1 != null) {
                        final Iterator iterator = i1.iterator();
                        while (iterator.hasNext()) {
                            this.K.add(iterator.next());
                        }
                    }
                }
            }
        }
        this.setContentView(2131492896);
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        final Classbook j = this.I;
        if (j == null) {
            k0.S("classbook");
            throw null;
        }
        this.L = new h(this, string, h, j, this.K);
        final int t2 = c.i.t2;
        final ListView listView = (ListView)this.findViewById(t2);
        final h k = this.L;
        if (k != null) {
            listView.setAdapter((ListAdapter)k);
            ((ListView)this.findViewById(t2)).setOnItemClickListener((AdapterView$OnItemClickListener)new d1(this));
            ((ImageButton)this.findViewById(c.i.s2)).setOnClickListener((View$OnClickListener)new c1(this));
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0((CharSequence)((Activity)this).getString(2131886128));
            }
            final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
            if (supportActionBar2 != null) {
                final Student m = this.J;
                if (m == null) {
                    k0.S("student");
                    throw null;
                }
                supportActionBar2.y0((CharSequence)m.getDisplayName());
            }
            final androidx.appcompat.app.a supportActionBar3 = this.getSupportActionBar();
            if (supportActionBar3 != null) {
                supportActionBar3.Y(true);
            }
            return;
        }
        k0.S("absenceAdapter");
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
        bundle.putString("blab", g.getUniqueId());
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        bundle.putLong("blub", h.getId());
        final Student j = this.J;
        if (j != null) {
            bundle.putLong("blob", j.getId());
            final ArrayList<StudentAbsence> k = this.K;
            final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)k, 10));
            final Iterator<Object> iterator = k.iterator();
            while (iterator.hasNext()) {
                list.add(Long.valueOf(iterator.next().getId()));
            }
            bundle.putLongArray("blib", v.J5((Collection<Long>)list));
            return;
        }
        k0.S("student");
        throw null;
    }
    
    public final void t(@e final StudentAbsence studentAbsence) {
        k0.p(studentAbsence, "studentAbsence");
        final AbsenceDetailActivity.a m = AbsenceDetailActivity.M;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final Period h = this.H;
        if (h != null) {
            ((ComponentActivity)this).startActivityForResult(m.a((Context)this, uniqueId, studentAbsence, h.getId()), 1301);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0016" }, d2 = { "com/untis/mobile/ui/activities/classbook/absences/AbsencesActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "studentAbsences", "Landroid/content/Intent;", "a", "BUNDLE_PERIOD_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "BUNDLE_STUDENT_ABSENCE_IDS", "BUNDLE_STUDENT_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, @e final Period period, @e final Student student, @e final List<StudentAbsence> list) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(period, "period");
            k0.p(student, "student");
            k0.p(list, "studentAbsences");
            final Intent intent = new Intent(context, (Class)AbsencesActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("blab", s);
            bundle.putLong("blub", period.getId());
            bundle.putLong("blob", student.getId());
            final ArrayList<Long> list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
            final Iterator<? extends T> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(((StudentAbsence)iterator.next()).getId());
            }
            bundle.putLongArray("blib", v.J5(list2));
            intent.putExtras(bundle);
            return intent;
        }
    }
}
