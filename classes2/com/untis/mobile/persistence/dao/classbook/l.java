// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import io.realm.q;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import com.untis.mobile.utils.extension.h;
import org.jetbrains.annotations.f;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import com.untis.mobile.utils.mapper.realmToModel.p;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.Iterator;
import com.untis.mobile.utils.j0;
import io.realm.RealmQuery;
import java.util.Objects;
import m4.a;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import java.util.List;
import io.realm.f0;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006 " }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/l;", "Lcom/untis/mobile/persistence/dao/classbook/k;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "h", "Lio/realm/f0;", "realm", "", "i", "", "ids", "Lkotlin/j2;", "g", "b", "id", "a", "homeWork", "", "overrideStatus", "e", "c", "d", "", "Ljava/util/Map;", "cache", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class l implements k
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<HomeWork>> b;
    
    public l(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<HomeWork>>();
    }
    
    private final void g(final String s, final List<Long> list) {
        j0.b(this.a.c(s), new n6.l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<m4.a> f2 = f0.f3(m4.a.class);
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
        final LongSparseArray<HomeWork> h = this.h(s);
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            h.remove(iterator.next().longValue());
        }
    }
    
    private final LongSparseArray<HomeWork> h(final String s) {
        final LongSparseArray<HomeWork> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final f0 c = this.a.c(s);
            try {
                final s0<m4.a> b0 = c.f3(m4.a.class).b0();
                k0.o(b0, "realm.where(RealmHomework::class.java)\n                                .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final m4.a a : b0) {
                    final p a2 = p.a;
                    k0.o(a, "it");
                    list.add(a2.b(a));
                }
                for (final HomeWork homeWork : list) {
                    longSparseArray.put(homeWork.getId(), (Object)homeWork);
                }
                final j2 a3 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<HomeWork>)longSparseArray);
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a(c, (Throwable)value);
                }
            }
        }
        return value;
    }
    
    private final long i(final f0 f0) {
        final Number j1 = f0.f3(m4.a.class).j1("id");
        long longValue;
        if (j1 == null) {
            longValue = 0L;
        }
        else {
            longValue = j1.longValue();
        }
        long n = longValue - 1L;
        if (n >= 0L) {
            n = -1L;
        }
        return n;
    }
    
    @f
    @Override
    public HomeWork a(@e final String s, final long n) {
        k0.p(s, "profileId");
        return (HomeWork)this.h(s).get(n);
    }
    
    @e
    @Override
    public List<HomeWork> b(@e final String s) {
        k0.p(s, "profileId");
        return h.K(this.h(s));
    }
    
    @Override
    public void c(@e final String s, @e final HomeWork homeWork) {
        k0.p(s, "profileId");
        k0.p(homeWork, "homeWork");
        j0.b(this.a.c(s), new n6.l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(m4.a.class).I("id", homeWork.getId()).b0().T3();
            }
        });
        this.h(s).remove(homeWork.getId());
    }
    
    @Override
    public void d(@e final String s) {
        k0.p(s, "profileId");
        final List<HomeWork> k = h.K(this.h(s));
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : k) {
            final HomeWork homeWork = next;
            final org.joda.time.c end = homeWork.getEnd();
            boolean b = true;
            if (!((org.joda.time.base.c)end.W0(1)).j() || homeWork.getLocal()) {
                b = false;
            }
            if (b) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(Long.valueOf(iterator2.next().getId()));
        }
        this.g(s, (List<Long>)list2);
    }
    
    @Override
    public void e(@e final String s, @e final HomeWork homeWork, final boolean b) {
        k0.p(s, "profileId");
        k0.p(homeWork, "homeWork");
        j0.b(this.a.c(s), new n6.l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                if (homeWork.getId() == 0L) {
                    homeWork.setId(l.this.i(f0));
                }
                else {
                    final m4.a a = f0.f3(m4.a.class).I("id", homeWork.getId()).d0();
                    if (a != null && !b) {
                        homeWork.setStatus(HomeWorkStatus.Companion.fromValue(a.E8()));
                    }
                }
                f0.G0(p.a.d(homeWork), new q[0]);
            }
        });
        this.h(s).put(homeWork.getId(), (Object)homeWork);
    }
}
