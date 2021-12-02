// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata.cache;

import org.jetbrains.annotations.f;
import io.realm.n0;
import com.untis.mobile.persistence.models.Entity;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import com.untis.mobile.utils.mapper.realmToModel.q;
import java.util.ArrayList;
import kotlin.collections.v;
import io.realm.RealmQuery;
import java.util.Objects;
import kotlin.jvm.internal.m0;
import java.util.List;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.masterdata.Klasse;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0016\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0014J\b\u0010\r\u001a\u00020\tH\u0014R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/j;", "Lcom/untis/mobile/services/masterdata/cache/e;", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "", "f", "", "id", "n", "targets", "Lkotlin/j2;", "m", "ids", "d", "c", "", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j extends e<Klasse>
{
    @org.jetbrains.annotations.e
    private final String c;
    @org.jetbrains.annotations.e
    private final d d;
    
    public j(@org.jetbrains.annotations.e final String c, @org.jetbrains.annotations.e final d d) {
        k0.p(c, "profileId");
        k0.p(d, "realmService");
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected void c() {
        j0.b(this.d.c(this.c), j$b.G);
    }
    
    @Override
    protected void d(@org.jetbrains.annotations.e final List<Long> list) {
        k0.p(list, "ids");
        j0.b(this.d.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<w4.d> f2 = f0.f3(w4.d.class);
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected List<Klasse> f() {
        final f0 c = this.d.c(this.c);
        try {
            final s0<w4.d> b0 = c.f3(w4.d.class).b0();
            k0.o(b0, "realm.where(RealmKlasse::class.java).findAll()");
            final ArrayList list = new ArrayList<Klasse>(v.Y((Iterable<?>)b0, 10));
            for (final w4.d d : b0) {
                final q a = q.a;
                k0.o(d, "it");
                list.add(a.b(d));
            }
            kotlin.io.c.a(c, null);
            return (List<Klasse>)list;
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
    protected void m(@org.jetbrains.annotations.e final List<Klasse> list) {
        k0.p(list, "targets");
        j0.b(this.d.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final List<Klasse> g = list;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(q.a.d(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new io.realm.q[0]);
            }
        });
    }
    
    @f
    protected Klasse n(final long l) {
        final f0 c = this.d.c(this.c);
        try {
            final w4.d d = c.f3(w4.d.class).I("id", l).d0();
            if (d == null) {
                kotlin.io.c.a(c, null);
                return null;
            }
            final Klasse b = q.a.b(d);
            kotlin.io.c.a(c, null);
            return b;
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
