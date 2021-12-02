// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import io.realm.q;
import java.util.Set;
import kotlin.jvm.internal.q1;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.Collection;
import io.realm.RealmQuery;
import java.util.Objects;
import java.util.List;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.m0;
import n6.l;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R(\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/b;", "Lcom/untis/mobile/persistence/dao/classbook/a;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "b", "", "id", "a", "classbook", "Lkotlin/j2;", "h", "d", "", "ids", "e", "f", "homeworkId", "g", "", "Ljava/util/Map;", "cache", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<Classbook>> b;
    
    public b(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<Classbook>>();
    }
    
    private final LongSparseArray<Classbook> b(final String s) {
        final LongSparseArray<Classbook> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final com.untis.mobile.utils.mapper.realmToModel.d d = new com.untis.mobile.utils.mapper.realmToModel.d(s);
            final f0 c = this.a.c(s);
            try {
                final s0<i4.a> b0 = c.f3(i4.a.class).b0();
                k0.o(b0, "realm.where(RealmClassbook::class.java)\n                                .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final i4.a a : b0) {
                    k0.o(a, "it");
                    list.add(d.a(a));
                }
                for (final Classbook classbook : list) {
                    longSparseArray.put(classbook.getId(), (Object)classbook);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<Classbook>)longSparseArray);
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
    
    @f
    @Override
    public Classbook a(@e final String s, final long n) {
        k0.p(s, "profileId");
        return (Classbook)this.b(s).get(n);
    }
    
    @Override
    public void d(@e final String s, final long n) {
        k0.p(s, "profileId");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(i4.a.class).I("id", n).b0().T3();
            }
        });
        this.b(s).delete(n);
    }
    
    @Override
    public void e(@e final String s, @e final List<Long> list) {
        k0.p(s, "profileId");
        k0.p(list, "ids");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<i4.a> f2 = f0.f3(i4.a.class);
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
        final LongSparseArray<Classbook> b = this.b(s);
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            b.delete(iterator.next().longValue());
        }
    }
    
    @Override
    public void f(@e final String s) {
        k0.p(s, "profileId");
        j0.b(this.a.c(s), b$c.G);
        this.b.remove(s);
    }
    
    @Override
    public void g(@e final String s, final long n) {
        k0.p(s, "profileId");
        final LongSparseArray<Classbook> b = this.b(s);
        final int size = b.size();
        if (size > 0) {
            int n2 = 0;
            while (true) {
                final int n3 = n2 + 1;
                b.keyAt(n2);
                final Classbook classbook = (Classbook)b.valueAt(n2);
                final Set<HomeWork> homeWorks = classbook.getHomeWorks();
                boolean b2 = false;
                Label_0139: {
                    if (!(homeWorks instanceof Collection) || !homeWorks.isEmpty()) {
                        final Iterator<Object> iterator = homeWorks.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().getId() == n) {
                                b2 = true;
                                break Label_0139;
                            }
                        }
                    }
                    b2 = false;
                }
                Label_0389: {
                    if (b2) {
                        final Set<HomeWork> homeWorks2 = classbook.getHomeWorks();
                        while (true) {
                            for (final HomeWork next : classbook.getHomeWorks()) {
                                if (next.getId() == n) {
                                    Objects.requireNonNull(homeWorks2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                                    q1.a(homeWorks2).remove(next);
                                    final f0 c = this.a.c(s);
                                    try {
                                        c.beginTransaction();
                                        final s0<i4.a> b3 = c.f3(i4.a.class).b0();
                                        k0.o(b3, "realm.where(RealmClassbook::class.java).findAll()");
                                        final Iterator<Object> iterator3 = b3.iterator();
                                        while (iterator3.hasNext()) {
                                            final Iterator<com.untis.mobile.persistence.realm.b> iterator4 = iterator3.next().x8().iterator();
                                            k0.o(iterator4, "classbook.homeWorks.iterator()");
                                            while (iterator4.hasNext()) {
                                                if (iterator4.next().s8() == n) {
                                                    iterator4.remove();
                                                    break;
                                                }
                                            }
                                        }
                                        c.n();
                                        final j2 a = j2.a;
                                        kotlin.io.c.a(c, null);
                                    }
                                    finally {
                                        try {}
                                        finally {
                                            kotlin.io.c.a(c, (Throwable)b);
                                        }
                                    }
                                    break Label_0389;
                                }
                            }
                            HomeWork next = null;
                            continue;
                        }
                    }
                }
                if (n3 >= size) {
                    break;
                }
                n2 = n3;
            }
        }
    }
    
    @Override
    public void h(@e final String s, @e final Classbook classbook) {
        k0.p(s, "profileId");
        k0.p(classbook, "classbook");
        j0.b(this.a.c(s), new l<f0, j2>() {
            final /* synthetic */ com.untis.mobile.utils.mapper.realmToModel.d G = new com.untis.mobile.utils.mapper.realmToModel.d(s);
            
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.G0(this.G.b(classbook), new q[0]);
            }
        });
        this.b(s).put(classbook.getId(), (Object)classbook);
    }
}
