// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import java.util.Collection;
import io.realm.RealmQuery;
import java.util.Objects;
import com.untis.mobile.utils.j0;
import io.realm.q;
import io.realm.n0;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import n6.l;
import com.untis.mobile.utils.extension.h;
import java.util.List;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import java.util.ArrayList;
import i4.b;
import com.untis.mobile.utils.mapper.realmToModel.n;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R(\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/j;", "Lcom/untis/mobile/persistence/dao/classbook/i;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "g", "", "b", "", "id", "a", "", "ids", "f", "exemptions", "Lkotlin/j2;", "c", "exemption", "d", "e", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "Ljava/util/Map;", "cache", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j implements i
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<Exemption>> b;
    
    public j(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<Exemption>>();
    }
    
    private final LongSparseArray<Exemption> g(final String s) {
        final LongSparseArray<Exemption> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final n n = new n(s);
            final f0 c = this.a.c(s);
            try {
                final s0<b> b0 = c.f3(b.class).b0();
                k0.o(b0, "realm.where(RealmExemption::class.java)\n                                .findAll()");
                final ArrayList<Exemption> list = new ArrayList<Exemption>();
                for (final b b2 : b0) {
                    k0.o(b2, "it");
                    final Exemption b3 = n.b(b2);
                    if (b3 != null) {
                        list.add(b3);
                    }
                }
                for (final Exemption exemption : list) {
                    longSparseArray.put(exemption.getId(), (Object)exemption);
                }
                final j2 a = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<Exemption>)longSparseArray);
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
    public Exemption a(@e final String s, final long n) {
        k0.p(s, "profileId");
        return (Exemption)this.g(s).get(n);
    }
    
    @e
    @Override
    public List<Exemption> b(@e final String s) {
        k0.p(s, "profileId");
        return h.K(this.g(s));
    }
    
    @Override
    public void c(@e final String s, @e final List<Exemption> list) {
        k0.p(s, "profileId");
        k0.p(list, "exemptions");
        h.b(this.g(s), list);
        j0.b(this.a.c(s), new l<f0, j2>() {
            final /* synthetic */ n H = new n(s);
            
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final List<Exemption> g = list;
                final n h = this.H;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(h.c(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
    }
    
    @Override
    public void d(@e final String s, @e final Exemption exemption) {
        k0.p(s, "profileId");
        k0.p(exemption, "exemption");
        this.g(s).put(exemption.getId(), (Object)exemption);
        j0.b(this.a.c(s), new l<f0, j2>() {
            final /* synthetic */ n G = new n(s);
            
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.G0(this.G.c(exemption), new q[0]);
            }
        });
    }
    
    @Override
    public void e(@e final String s, @e final List<Exemption> list) {
        k0.p(s, "profileId");
        k0.p(list, "exemptions");
        this.b.remove(s);
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<b> f2 = f0.f3(b.class);
                final List<Exemption> g = list;
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
    public List<Exemption> f(@e final String s, @e final Collection<Long> collection) {
        k0.p(s, "profileId");
        k0.p(collection, "ids");
        final List<Exemption> k = h.K(this.g(s));
        final ArrayList<Exemption> list = new ArrayList<Exemption>();
        for (final Exemption next : k) {
            if (collection.contains(next.getId())) {
                list.add(next);
            }
        }
        return list;
    }
}
