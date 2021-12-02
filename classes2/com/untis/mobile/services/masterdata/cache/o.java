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
import kotlin.io.c;
import com.untis.mobile.utils.mapper.realmToModel.g0;
import java.util.ArrayList;
import kotlin.collections.v;
import io.realm.RealmQuery;
import java.util.Objects;
import w4.h;
import kotlin.jvm.internal.m0;
import java.util.List;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.realm.d;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.masterdata.Subject;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0014J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0014J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0014J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/o;", "Lcom/untis/mobile/services/masterdata/cache/e;", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "subject", "n", "", "f", "", "id", "o", "targets", "Lkotlin/j2;", "m", "ids", "d", "c", "k", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "Lcom/untis/mobile/services/masterdata/cache/e;", "subjectColorCache", "", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/realm/d;", "e", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/services/masterdata/cache/e;Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class o extends e<Subject>
{
    @org.jetbrains.annotations.e
    private final String c;
    @org.jetbrains.annotations.e
    private final e<CustomEntityColor> d;
    @org.jetbrains.annotations.e
    private final d e;
    
    public o(@org.jetbrains.annotations.e final String c, @org.jetbrains.annotations.e final e<CustomEntityColor> d, @org.jetbrains.annotations.e final d e) {
        k0.p(c, "profileId");
        k0.p(d, "subjectColorCache");
        k0.p(e, "realmService");
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final Subject n(final Subject subject) {
        final CustomEntityColor customEntityColor = this.d.g(subject.getId());
        if (customEntityColor == null) {
            return subject;
        }
        if (customEntityColor.getBackColor() != 0) {
            subject.setCustomBackColor(customEntityColor.getBackColor());
        }
        if (customEntityColor.getTextColor() != 0 && customEntityColor.getTextColor() != subject.getBackColor()) {
            subject.setCustomTextColor(customEntityColor.getTextColor());
        }
        return subject;
    }
    
    @Override
    protected void c() {
        j0.b(this.e.c(this.c), o$b.G);
    }
    
    @Override
    protected void d(@org.jetbrains.annotations.e final List<Long> list) {
        k0.p(list, "ids");
        j0.b(this.e.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<h> f2 = f0.f3(h.class);
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                f2.D0("id", array).b0().T3();
            }
        });
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected List<Subject> f() {
        final f0 c = this.e.c(this.c);
        try {
            this.d.e();
            final s0<h> b0 = c.f3(h.class).b0();
            k0.o(b0, "realm.where(RealmSubject::class.java)\n                            .findAll()");
            final ArrayList list = new ArrayList<Subject>(v.Y((Iterable<?>)b0, 10));
            for (final h h : b0) {
                final g0 a = g0.a;
                k0.o(h, "it");
                list.add(this.n(a.d(h)));
            }
            kotlin.io.c.a(c, null);
            return (List<Subject>)list;
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
    public void k() {
        super.k();
        this.d.k();
    }
    
    @Override
    protected void m(@org.jetbrains.annotations.e final List<Subject> list) {
        k0.p(list, "targets");
        j0.b(this.e.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final List<Subject> g = list;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(g0.a.b(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
    }
    
    @f
    protected Subject o(final long l) {
        final f0 c = this.e.c(this.c);
        try {
            final h h = c.f3(h.class).I("id", l).d0();
            if (h == null) {
                kotlin.io.c.a(c, null);
                return null;
            }
            final Subject n = this.n(g0.a.d(h));
            kotlin.io.c.a(c, null);
            return n;
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
