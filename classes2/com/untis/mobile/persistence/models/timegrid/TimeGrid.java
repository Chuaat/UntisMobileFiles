// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timegrid;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import org.joda.time.n0;
import org.joda.time.v;
import com.untis.mobile.persistence.models.EntityType;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.Entity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;", "Lcom/untis/mobile/persistence/models/Entity;", "Lorg/joda/time/v;", "getEarliestStart", "getLatestEnd", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridDay;", "days", "Ljava/util/List;", "getDays", "()Ljava/util/List;", "setDays", "(Ljava/util/List;)V", "id", "J", "getId", "()J", "setId", "(J)V", "<init>", "(JLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeGrid implements Entity
{
    @e
    private List<TimeGridDay> days;
    private long id;
    
    public TimeGrid() {
        this(0L, null, 3, null);
    }
    
    public TimeGrid(final long id, @e final List<TimeGridDay> days) {
        k0.p(days, "days");
        this.id = id;
        this.days = days;
    }
    
    @Override
    public long entityId() {
        return this.id;
    }
    
    @e
    @Override
    public EntityType entityType() {
        return EntityType.TIMEGRID;
    }
    
    @e
    public final List<TimeGridDay> getDays() {
        return this.days;
    }
    
    @f
    public final v getEarliestStart() {
        final Iterator<TimeGridDay> iterator = this.days.iterator();
        n0 n0 = null;
        while (iterator.hasNext()) {
            final Iterator<Object> iterator2 = iterator.next().getUnits().iterator();
            v v = (v)n0;
            while (true) {
                n0 = (n0)v;
                if (!iterator2.hasNext()) {
                    break;
                }
                final TimeGridUnit timeGridUnit = iterator2.next();
                if (v != null && !((org.joda.time.base.e)timeGridUnit.getStart()).o((n0)v)) {
                    continue;
                }
                v = new v((Object)timeGridUnit.getStart());
            }
        }
        return (v)n0;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @f
    public final v getLatestEnd() {
        final Iterator<TimeGridDay> iterator = this.days.iterator();
        n0 n0 = null;
        while (iterator.hasNext()) {
            final Iterator<Object> iterator2 = iterator.next().getUnits().iterator();
            v v = (v)n0;
            while (true) {
                n0 = (n0)v;
                if (!iterator2.hasNext()) {
                    break;
                }
                final TimeGridUnit timeGridUnit = iterator2.next();
                if (v != null && !((org.joda.time.base.e)timeGridUnit.getEnd()).m((n0)v)) {
                    continue;
                }
                v = new v((Object)timeGridUnit.getEnd());
            }
        }
        return (v)n0;
    }
    
    public final void setDays(@e final List<TimeGridDay> days) {
        k0.p(days, "<set-?>");
        this.days = days;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
}
