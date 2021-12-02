// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.timetable;

import org.joda.time.base.g;
import org.jetbrains.annotations.f;
import java.io.Closeable;
import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.utils.j0;
import io.realm.q;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/persistence/dao/timetable/d;", "Lcom/untis/mobile/persistence/dao/timetable/c;", "", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lorg/joda/time/t;", "date", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "b", "timeTableModel", "Lkotlin/j2;", "a", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements c
{
    @e
    private final com.untis.mobile.persistence.realm.d a;
    
    public d(@e final com.untis.mobile.persistence.realm.d a) {
        k0.p(a, "realmService");
        this.a = a;
    }
    
    @Override
    public void a(@e final String s, @e final TimeTableModel timeTableModel) {
        k0.p(s, "profileId");
        k0.p(timeTableModel, "timeTableModel");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.G0(com.untis.mobile.utils.mapper.realmToModel.k0.a.a(timeTableModel), new q[0]);
            }
        });
    }
    
    @f
    @Override
    public TimeTableModel b(@e final String s, @e final EntityType entityType, final long l, @e final t t) {
        k0.p(s, "profileId");
        k0.p(entityType, "entityType");
        k0.p(t, "date");
        final f0 c = this.a.c(s);
        try {
            final c5.e e = c.f3(c5.e.class).H("entityType", entityType.getWebuntisId()).I("entityId", l).I("date", ((g)t.F0()).n()).d0();
            if (e == null) {
                kotlin.io.c.a(c, null);
                return null;
            }
            final TimeTableModel b = com.untis.mobile.utils.mapper.realmToModel.k0.a.b(s, e);
            kotlin.io.c.a(c, null);
            return b;
        }
        finally {
            try {}
            finally {
                kotlin.io.c.a(c, (Throwable)entityType);
            }
        }
    }
}
