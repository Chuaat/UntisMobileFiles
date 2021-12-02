// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.timetable;

import io.realm.RealmQuery;
import java.util.Objects;
import com.untis.mobile.utils.j0;
import io.realm.q;
import io.realm.n0;
import kotlin.jvm.internal.m0;
import n6.l;
import com.untis.mobile.utils.extension.h;
import java.util.List;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.j2;
import com.untis.mobile.utils.mapper.realmToModel.x;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.persistence.realm.period.c;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bH\u0016J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/persistence/dao/timetable/b;", "Lcom/untis/mobile/persistence/dao/timetable/a;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "h", "", "", "ids", "f", "lessonId", "b", "id", "a", "periods", "Lkotlin/j2;", "c", "period", "d", "e", "g", "", "Ljava/util/Map;", "cache", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<Period>> b;
    
    public b(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<Period>>();
    }
    
    private final LongSparseArray<Period> h(final String s) {
        final LongSparseArray<Period> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final f0 c = this.a.c(s);
            try {
                final s0<c> b0 = c.f3(c.class).b0();
                k0.o(b0, "realm.where(RealmPeriod::class.java)\n                                .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final c c2 : b0) {
                    final x a = x.a;
                    k0.o(c2, "it");
                    list.add(a.g(c2));
                }
                for (final Period period : list) {
                    longSparseArray.put(period.getId(), (Object)period);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<Period>)longSparseArray);
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
    
    @f
    @Override
    public Period a(@e final String s, final long n) {
        k0.p(s, "profileId");
        return (Period)this.h(s).get(n);
    }
    
    @e
    @Override
    public List<Period> b(@e final String s, final long n) {
        k0.p(s, "profileId");
        final List<Period> k = h.K(this.h(s));
        final ArrayList<Period> list = new ArrayList<Period>();
        for (final Period next : k) {
            if (next.getLessonId() == n) {
                list.add(next);
            }
        }
        return list;
    }
    
    @Override
    public void c(@e final String s, @e final List<Period> list) {
        k0.p(s, "profileId");
        k0.p(list, "periods");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final List<Period> g = list;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(x.a.i(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
        h.b(this.h(s), list);
    }
    
    @Override
    public void d(@e final String s, @e final Period period) {
        k0.p(s, "profileId");
        k0.p(period, "period");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.G0(x.a.i(period), new q[0]);
            }
        });
        this.h(s).put(period.getId(), (Object)period);
    }
    
    @Override
    public void e(@e final String s, @e final List<Long> list) {
        k0.p(s, "profileId");
        k0.p(list, "ids");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<c> f2 = f0.f3(c.class);
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
        final LongSparseArray<Period> h = this.h(s);
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            h.delete(iterator.next().longValue());
        }
    }
    
    @e
    @Override
    public List<Period> f(@e final String s, @e final List<Long> list) {
        k0.p(s, "profileId");
        k0.p(list, "ids");
        final List<Period> k = h.K(this.h(s));
        final ArrayList<Period> list2 = new ArrayList<Period>();
        for (final Period next : k) {
            if (list.contains(next.getId())) {
                list2.add(next);
            }
        }
        return list2;
    }
    
    @Override
    public void g(@e final String s) {
        k0.p(s, "profileId");
        j0.b(this.a.c(s), b$b.G);
        this.b.remove(s);
    }
}
