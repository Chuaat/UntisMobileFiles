// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata.cache;

import org.jetbrains.annotations.f;
import io.realm.q;
import io.realm.n0;
import com.untis.mobile.persistence.models.Entity;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import com.untis.mobile.utils.mapper.realmToModel.g;
import java.util.ArrayList;
import kotlin.collections.v;
import io.realm.RealmQuery;
import java.util.Objects;
import w4.b;
import kotlin.jvm.internal.m0;
import java.util.List;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.masterdata.Department;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0016\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0014J\b\u0010\r\u001a\u00020\tH\u0014R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/c;", "Lcom/untis/mobile/services/masterdata/cache/e;", "Lcom/untis/mobile/persistence/models/masterdata/Department;", "", "f", "", "id", "n", "targets", "Lkotlin/j2;", "m", "ids", "d", "c", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "Ljava/lang/String;", "profileId", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends e<Department>
{
    @org.jetbrains.annotations.e
    private final String c;
    @org.jetbrains.annotations.e
    private final d d;
    
    public c(@org.jetbrains.annotations.e final String c, @org.jetbrains.annotations.e final d d) {
        k0.p(c, "profileId");
        k0.p(d, "realmService");
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected void c() {
        j0.b(this.d.c(this.c), c$b.G);
    }
    
    @Override
    protected void d(@org.jetbrains.annotations.e final List<Long> list) {
        k0.p(list, "ids");
        j0.b(this.d.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<b> f2 = f0.f3(b.class);
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected List<Department> f() {
        final f0 c = this.d.c(this.c);
        try {
            final s0<b> b0 = c.f3(b.class).b0();
            k0.o(b0, "realm.where(RealmDepartment::class.java)\n                            .findAll()");
            final ArrayList list = new ArrayList<Department>(v.Y((Iterable<?>)b0, 10));
            for (final b b2 : b0) {
                final g a = g.a;
                k0.o(b2, "it");
                list.add(a.b(b2));
            }
            kotlin.io.c.a(c, null);
            return (List<Department>)list;
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
    protected void m(@org.jetbrains.annotations.e final List<Department> list) {
        k0.p(list, "targets");
        j0.b(this.d.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final List<Department> g = list;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(com.untis.mobile.utils.mapper.realmToModel.g.a.c(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
    }
    
    @f
    protected Department n(final long l) {
        final f0 c = this.d.c(this.c);
        try {
            final b b = c.f3(b.class).I("id", l).d0();
            if (b == null) {
                kotlin.io.c.a(c, null);
                return null;
            }
            final Department b2 = g.a.b(b);
            kotlin.io.c.a(c, null);
            return b2;
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
