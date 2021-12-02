// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata.cache;

import io.realm.q;
import io.realm.n0;
import com.untis.mobile.persistence.models.Entity;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import com.untis.mobile.utils.mapper.realmToModel.f;
import java.util.ArrayList;
import kotlin.collections.v;
import io.realm.RealmQuery;
import java.util.Objects;
import java.util.List;
import com.untis.mobile.utils.j0;
import w4.a;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.realm.d;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0014J\u0016\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0014J\b\u0010\r\u001a\u00020\tH\u0014R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/b;", "Lcom/untis/mobile/services/masterdata/cache/e;", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "", "f", "", "id", "o", "targets", "Lkotlin/j2;", "m", "ids", "d", "c", "", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/realm/d;", "e", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends e<CustomEntityColor>
{
    @org.jetbrains.annotations.e
    private final String c;
    @org.jetbrains.annotations.e
    private final EntityType d;
    @org.jetbrains.annotations.e
    private final d e;
    
    public b(@org.jetbrains.annotations.e final String c, @org.jetbrains.annotations.e final EntityType d, @org.jetbrains.annotations.e final d e) {
        k0.p(c, "profileId");
        k0.p(d, "entityType");
        k0.p(e, "realmService");
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final /* synthetic */ EntityType n(final b b) {
        return b.d;
    }
    
    @Override
    protected void c() {
        j0.b(this.e.c(this.c), new l<f0, j2>() {
            final /* synthetic */ b G;
            
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(a.class).H("entityType", b.n(this.G).getWebuntisId()).b0().T3();
            }
        });
    }
    
    @Override
    protected void d(@org.jetbrains.annotations.e final List<Long> list) {
        k0.p(list, "ids");
        j0.b(this.e.c(this.c), new l<f0, j2>() {
            final /* synthetic */ b G;
            
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final RealmQuery<a> h = f0.f3(a.class).H("entityType", b.n(this.G).getWebuntisId());
                final Long[] array = list.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                h.D0("entityId", array).b0().T3();
            }
        });
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected List<CustomEntityColor> f() {
        final f0 c = this.e.c(this.c);
        try {
            final s0<a> b0 = c.f3(a.class).b0();
            k0.o(b0, "realm.where(RealmCustomEntityColor::class.java).findAll()");
            final ArrayList list = new ArrayList<CustomEntityColor>(v.Y((Iterable<?>)b0, 10));
            for (final a a : b0) {
                final f a2 = f.a;
                k0.o(a, "it");
                list.add(a2.a(a));
            }
            kotlin.io.c.a(c, null);
            return (List<CustomEntityColor>)list;
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
    protected void m(@org.jetbrains.annotations.e final List<? extends CustomEntityColor> list) {
        k0.p(list, "targets");
        j0.b(this.e.c(this.c), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                final List<CustomEntityColor> g = (List<CustomEntityColor>)list;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(f.a.b(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
    }
    
    @org.jetbrains.annotations.f
    protected CustomEntityColor o(final long l) {
        final f0 c = this.e.c(this.c);
        try {
            final a a = c.f3(a.class).H("entityType", this.d.getWebuntisId()).I("entityId", l).d0();
            if (a == null) {
                kotlin.io.c.a(c, null);
                return null;
            }
            final CustomEntityColor a2 = f.a.a(a);
            kotlin.io.c.a(c, null);
            return a2;
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
