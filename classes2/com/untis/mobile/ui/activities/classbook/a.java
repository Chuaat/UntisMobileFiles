// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.d;
import kotlin.text.s;
import android.content.Intent;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.classbook.events.EventDetailActivity;
import android.content.Context;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.ui.activities.classbook.absences.AbsenceDetailActivity;
import android.view.MenuItem;
import android.view.Menu;
import org.jetbrains.annotations.f;
import androidx.appcompat.view.b;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import java.util.HashSet;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.appcompat.view.b$a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u000f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001dj\b\u0012\u0004\u0012\u00020\u0004`\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006&" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/a;", "Landroidx/appcompat/view/b$a;", "Lkotlin/j2;", "g", "", "studentId", "f", "Landroidx/appcompat/view/b;", "mode", "Landroid/view/MenuItem;", "item", "", "d", "Landroid/view/Menu;", "menu", "b", "c", "a", "", "e", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;", "Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;", "classbookActivity", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "selectedStudentIds", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "<init>", "(Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;Lcom/untis/mobile/persistence/models/profile/Profile;Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements b$a
{
    @e
    private final ClassbookActivity a;
    @e
    private final Profile b;
    @e
    private final Period c;
    @e
    private final HashSet<Long> d;
    @e
    private final com.untis.mobile.services.masterdata.a e;
    
    public a(@e final ClassbookActivity a, @e final Profile b, @e final Period c) {
        k0.p(a, "classbookActivity");
        k0.p(b, "profile");
        k0.p(c, "period");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new HashSet<Long>();
        this.e = b.getMasterDataService();
    }
    
    private final void g() {
        final List g0 = ((d)this.a).getSupportFragmentManager().G0();
        k0.o(g0, "classbookActivity.supportFragmentManager.fragments");
        final ArrayList<ClassbookPageFragment> list = new ArrayList<ClassbookPageFragment>();
        for (final ClassbookPageFragment next : g0) {
            if (next instanceof ClassbookPageFragment) {
                list.add(next);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().w(this.d);
        }
        ClassbookActivity.e0(this.a, false, 1, null);
    }
    
    public void a(@f final b b) {
        this.a.S();
        this.d.clear();
        this.g();
    }
    
    public boolean b(@f final b b, @f final Menu menu) {
        return true;
    }
    
    public boolean c(@f final b b, @f final Menu menu) {
        this.a.getMenuInflater().inflate(2131558403, menu);
        return true;
    }
    
    public boolean d(@f final b b, @f final MenuItem menuItem) {
        Integer value;
        if (menuItem == null) {
            value = null;
        }
        else {
            value = menuItem.getItemId();
        }
        ClassbookActivity classbookActivity = null;
        Intent intent = null;
        int n = 0;
        Label_0242: {
            if (value != null) {
                if (value == 2131298429) {
                    classbookActivity = this.a;
                    final AbsenceDetailActivity.a m = AbsenceDetailActivity.M;
                    final String uniqueId = this.b.getUniqueId();
                    final HashSet<Long> d = this.d;
                    final ArrayList<Student> list = new ArrayList<Student>();
                    final Iterator<Number> iterator = d.iterator();
                    while (iterator.hasNext()) {
                        final Student v = this.e.V(iterator.next().longValue());
                        if (v != null) {
                            list.add(v);
                        }
                    }
                    intent = m.c((Context)classbookActivity, uniqueId, list, this.c);
                    n = 1300;
                    break Label_0242;
                }
            }
            if (value == null) {
                return true;
            }
            if (value != 2131298430) {
                return true;
            }
            classbookActivity = this.a;
            intent = EventDetailActivity.Q.a((Context)classbookActivity, this.b.getUniqueId(), this.c.getId(), new Event(0L, this.c.getId(), EntityType.STUDENT, 0L, this.c.getStart(), null, null, false, 233, null), v.I5((Iterable<? extends Long>)this.d), false);
            n = 1400;
        }
        ((ComponentActivity)classbookActivity).startActivityForResult(intent, n);
        this.a.S();
        return true;
    }
    
    @e
    public final String e() {
        if (this.d.isEmpty()) {
            return "";
        }
        if (this.d.size() == 1) {
            final String string = ((Activity)this.a).getString(2131886805);
            k0.o(string, "classbookActivity.getString(R.string.students_oneStudentSelected_text)");
            return string;
        }
        final String string2 = ((Activity)this.a).getString(2131886809);
        k0.o(string2, "classbookActivity.getString(R.string.students_studentsSelected_text)");
        return s.k2(string2, "{0}", String.valueOf(this.d.size()), false, 4, (Object)null);
    }
    
    public final void f(final long l) {
        if (this.d.contains(l)) {
            this.d.remove(l);
        }
        else {
            this.d.add(l);
        }
        this.g();
        if (this.d.isEmpty()) {
            this.a.S();
        }
    }
}
