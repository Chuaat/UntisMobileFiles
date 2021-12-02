// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import io.realm.RealmQuery;
import java.util.Objects;
import kotlin.collections.v;
import com.untis.mobile.utils.j0;
import io.realm.n0;
import kotlin.jvm.internal.m0;
import n6.l;
import com.untis.mobile.utils.extension.h;
import java.util.List;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import java.util.ArrayList;
import j4.a;
import io.realm.f0;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0016J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u001e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R(\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/r;", "Lcom/untis/mobile/persistence/dao/classbook/q;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "h", "Lio/realm/f0;", "realm", "", "i", "id", "a", "", "b", "ids", "f", "studentAbsences", "Lkotlin/j2;", "c", "e", "studentAbsenceId", "d", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "Ljava/util/Map;", "cache", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class r implements q
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<StudentAbsence>> b;
    
    public r(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<StudentAbsence>>();
    }
    
    private final LongSparseArray<StudentAbsence> h(final String s) {
        final LongSparseArray<StudentAbsence> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final com.untis.mobile.utils.mapper.apiToModel.d d = new com.untis.mobile.utils.mapper.apiToModel.d(s);
            final f0 c = this.a.c(s);
            try {
                final s0<a> b0 = c.f3(a.class).b0();
                k0.o(b0, "realm.where(RealmAbsence::class.java)\n                                .findAll()");
                final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
                for (final a a : b0) {
                    k0.o(a, "it");
                    final StudentAbsence h = d.h(a);
                    if (h != null) {
                        list.add(h);
                    }
                }
                for (final StudentAbsence studentAbsence : list) {
                    longSparseArray.put(studentAbsence.getId(), (Object)studentAbsence);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<StudentAbsence>)longSparseArray);
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a(c, (Throwable)s);
                }
            }
        }
        return value;
    }
    
    private final long i(final f0 f0) {
        final Number j1 = f0.f3(a.class).j1("id");
        long longValue;
        if (j1 == null) {
            longValue = 0L;
        }
        else {
            longValue = j1.longValue();
        }
        return longValue - 1L;
    }
    
    @f
    @Override
    public StudentAbsence a(@e final String s, final long n) {
        k0.p(s, "profileId");
        return (StudentAbsence)this.h(s).get(n);
    }
    
    @e
    @Override
    public List<StudentAbsence> b(@e final String s) {
        k0.p(s, "profileId");
        return h.K(this.h(s));
    }
    
    @Override
    public void c(@e final String s, @e final List<StudentAbsence> list) {
        k0.p(s, "profileId");
        k0.p(list, "studentAbsences");
        final com.untis.mobile.utils.mapper.apiToModel.d d = new com.untis.mobile.utils.mapper.apiToModel.d(s);
        final LongSparseArray<StudentAbsence> h = this.h(s);
        for (final StudentAbsence studentAbsence : list) {
            h.put(studentAbsence.getId(), (Object)studentAbsence);
        }
        j0.b(this.a.c(s), new l<f0, j2>() {
            final /* synthetic */ r H;
            
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final List<StudentAbsence> g = list;
                final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
                final Iterator<Object> iterator = g.iterator();
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    boolean b = false;
                    if (!hasNext) {
                        break;
                    }
                    final StudentAbsence next = iterator.next();
                    if (next.getId() == 0L) {
                        b = true;
                    }
                    if (!b) {
                        continue;
                    }
                    list.add(next);
                }
                final r h = this.H;
                final Iterator<Object> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().setId(h.i(f0));
                }
                final List<StudentAbsence> g2 = list;
                final com.untis.mobile.utils.mapper.apiToModel.d i = d;
                final ArrayList<a> list2 = new ArrayList<a>();
                final Iterator<Object> iterator3 = g2.iterator();
                while (iterator3.hasNext()) {
                    final a f2 = i.f(iterator3.next());
                    if (f2 != null) {
                        list2.add(f2);
                    }
                }
                f0.H0((Iterable<n0>)list2, new io.realm.q[0]);
            }
        });
    }
    
    @Override
    public void d(@e final String s, final long n) {
        k0.p(s, "profileId");
        this.b.clear();
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(a.class).I("id", n).b0().T3();
            }
        });
    }
    
    @Override
    public void e(@e final String s, @e final List<StudentAbsence> list) {
        k0.p(s, "profileId");
        k0.p(list, "studentAbsences");
        final LongSparseArray<StudentAbsence> h = this.h(s);
        final Iterator<StudentAbsence> iterator = (Iterator<StudentAbsence>)list.iterator();
        while (iterator.hasNext()) {
            h.delete(iterator.next().getId());
        }
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<a> f2 = f0.f3(a.class);
                final List<StudentAbsence> g = list;
                final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(Long.valueOf(iterator.next().getId()));
                }
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
    }
    
    @e
    @Override
    public List<StudentAbsence> f(@e final String s, @e final List<Long> list) {
        k0.p(s, "profileId");
        k0.p(list, "ids");
        final List<StudentAbsence> k = h.K(this.h(s));
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : k) {
            if (list.contains(next.getId())) {
                list2.add(next);
            }
        }
        return list2;
    }
}
