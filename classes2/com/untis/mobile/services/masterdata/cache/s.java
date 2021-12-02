// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata.cache;

import io.realm.q;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.collections.v;
import java.util.List;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.EntityType;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import java.util.Map;
import com.untis.mobile.persistence.realm.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/s;", "", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "e", "timeTableEntity", "Lkotlin/j2;", "f", "g", "b", "", "d", "c", "", "Z", "allLoaded", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "a", "Ljava/lang/String;", "profileId", "", "Ljava/util/Map;", "cache", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s
{
    @e
    private final String a;
    @e
    private final d b;
    @e
    private final Map<String, TimeTableEntity> c;
    private boolean d;
    
    public s(@e final String a, @e final d b) {
        k0.p(a, "profileId");
        k0.p(b, "realmService");
        this.a = a;
        this.b = b;
        this.c = new HashMap<String, TimeTableEntity>();
    }
    
    public static final /* synthetic */ Map a(final s s) {
        return s.c;
    }
    
    @e
    public final TimeTableEntity b(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        TimeTableEntity e;
        if ((e = this.e(entityType, n)) == null) {
            e = new TimeTableEntity(entityType, n, false, 0, System.currentTimeMillis(), null, 44, null);
        }
        e.setCounter(e.getCounter() + 1);
        this.f(e);
        return e;
    }
    
    public final void c(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        j0.b(this.b.c(this.a), new l<f0, j2>() {
            final /* synthetic */ s I;
            
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(c5.d.class).H("entityType", entityType.getWebuntisId()).I("entityId", n).b0().T3();
                final Map a = s.a(this.I);
                final StringBuilder sb = new StringBuilder();
                sb.append(entityType.getWebuntisId());
                sb.append('-');
                sb.append(n);
                a.remove(sb.toString());
            }
        });
    }
    
    @e
    public final List<TimeTableEntity> d() {
        if (this.d) {
            return v.I5((Iterable<? extends TimeTableEntity>)this.c.values());
        }
        final f0 c = this.b.c(this.a);
        try {
            final s0<c5.d> b0 = c.f3(c5.d.class).b0();
            k0.o(b0, "realm.where(RealmTimeTableEntity::class.java)\n                            .findAll()");
            for (final c5.d d : b0) {
                final com.untis.mobile.utils.mapper.realmToModel.j0 a = com.untis.mobile.utils.mapper.realmToModel.j0.a;
                k0.o(d, "realmTimetableEntity");
                final TimeTableEntity b2 = a.b(d);
                this.c.put(b2.getId(), b2);
            }
            this.d = true;
            final List<TimeTableEntity> i5 = v.I5((Iterable<? extends TimeTableEntity>)this.c.values());
            kotlin.io.c.a(c, null);
            return i5;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a(c, t);
            }
        }
    }
    
    @f
    public final TimeTableEntity e(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        for (final TimeTableEntity next : this.d()) {
            final TimeTableEntity timeTableEntity = next;
            if (timeTableEntity.getEntityId() == n && timeTableEntity.getEntityType() == entityType) {
                return next;
            }
        }
        return null;
    }
    
    public final void f(@e final TimeTableEntity timeTableEntity) {
        k0.p(timeTableEntity, "timeTableEntity");
        this.c.remove(timeTableEntity.getId());
        this.c.put(timeTableEntity.getId(), timeTableEntity);
        this.g(timeTableEntity);
    }
    
    public final void g(@e final TimeTableEntity timeTableEntity) {
        k0.p(timeTableEntity, "timeTableEntity");
        j0.b(this.b.c(this.a), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.G0(com.untis.mobile.utils.mapper.realmToModel.j0.a.a(timeTableEntity), new q[0]);
            }
        });
    }
}
