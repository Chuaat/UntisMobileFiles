// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata.cache;

import org.joda.time.t;
import io.realm.q;
import io.realm.n0;
import com.untis.mobile.persistence.models.Entity;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import com.untis.mobile.utils.mapper.realmToModel.e0;
import java.util.ArrayList;
import kotlin.collections.v;
import io.realm.RealmQuery;
import java.util.Objects;
import w4.f;
import kotlin.jvm.internal.m0;
import java.util.List;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0016\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0014J\b\u0010\r\u001a\u00020\tH\u0014J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/m;", "Lcom/untis/mobile/services/masterdata/cache/e;", "Lcom/untis/mobile/persistence/models/masterdata/Schoolyear;", "", "f", "", "id", "o", "targets", "Lkotlin/j2;", "m", "ids", "d", "c", "Lorg/joda/time/t;", "date", "n", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "Ljava/lang/String;", "profileId", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class m extends e<Schoolyear>
{
    @org.jetbrains.annotations.e
    private final String c;
    @org.jetbrains.annotations.e
    private final d d;
    
    public m(@org.jetbrains.annotations.e final String c, @org.jetbrains.annotations.e final d d) {
        k0.p(c, "profileId");
        k0.p(d, "realmService");
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected void c() {
        j0.b(this.d.c(this.c), m$b.G);
    }
    
    @Override
    protected void d(@org.jetbrains.annotations.e final List<Long> list) {
        k0.p(list, "ids");
        j0.b(this.d.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<f> f2 = f0.f3(f.class);
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected List<Schoolyear> f() {
        final f0 c = this.d.c(this.c);
        try {
            final s0<f> b0 = c.f3(f.class).b0();
            k0.o(b0, "realm.where(RealmSchoolyear::class.java)\n                            .findAll()");
            final ArrayList list = new ArrayList<Schoolyear>(v.Y((Iterable<?>)b0, 10));
            for (final f f : b0) {
                final e0 a = e0.a;
                k0.o(f, "it");
                list.add(a.k(f));
            }
            kotlin.io.c.a(c, null);
            return (List<Schoolyear>)list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a(c, t);
            }
        }
    }
    
    @Override
    protected void m(@org.jetbrains.annotations.e final List<Schoolyear> list) {
        k0.p(list, "targets");
        j0.b(this.d.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final List<Schoolyear> g = list;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(e0.a.i(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
    }
    
    @org.jetbrains.annotations.f
    public final Schoolyear n(@org.jetbrains.annotations.e final t t) {
        k0.p(t, "date");
        for (final Schoolyear next : this.e()) {
            final Schoolyear schoolyear = next;
            final boolean p = ((org.joda.time.base.e)t).p((org.joda.time.n0)schoolyear.getStart());
            int n2;
            final int n = n2 = 1;
            if (!p) {
                if (((org.joda.time.base.e)t).p((org.joda.time.n0)schoolyear.getEnd())) {
                    n2 = n;
                }
                else if (((org.joda.time.base.e)t).m((org.joda.time.n0)schoolyear.getStart()) && ((org.joda.time.base.e)t).o((org.joda.time.n0)schoolyear.getEnd())) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                return next;
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.f
    protected Schoolyear o(final long l) {
        final f0 c = this.d.c(this.c);
        try {
            final f f = c.f3(f.class).I("id", l).d0();
            if (f == null) {
                kotlin.io.c.a(c, null);
                return null;
            }
            final Schoolyear k = e0.a.k(f);
            kotlin.io.c.a(c, null);
            return k;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a(c, t);
            }
        }
    }
}
