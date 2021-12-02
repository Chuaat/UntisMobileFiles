// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import w4.c;
import org.joda.time.t;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.api.common.masterdata.UMHoliday;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/o;", "", "Lw4/c;", "realmHoliday", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "b", "Lcom/untis/mobile/api/common/masterdata/UMHoliday;", "umHoliday", "a", "c", "holiday", "d", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class o
{
    @e
    public static final o a;
    
    static {
        a = new o();
    }
    
    private o() {
    }
    
    @e
    public final Holiday a(@e final UMHoliday umHoliday) {
        k0.p(umHoliday, "umHoliday");
        final long id = umHoliday.id;
        String name = umHoliday.name;
        if (name == null) {
            name = "";
        }
        String longName = umHoliday.longName;
        if (longName == null) {
            longName = "";
        }
        final t d = b.d(umHoliday.startDate);
        k0.o(d, "isoStringToLocalDate(umHoliday.startDate)");
        final t d2 = b.d(umHoliday.endDate);
        k0.o(d2, "isoStringToLocalDate(umHoliday.endDate)");
        return new Holiday(id, name, longName, d, d2);
    }
    
    @e
    public final Holiday b(@e final c c) {
        k0.p(c, "realmHoliday");
        return new Holiday(c.t8(), c.v8(), c.u8(), new t(c.w8()), new t(c.s8()));
    }
    
    @e
    public final c c(@e final UMHoliday umHoliday) {
        k0.p(umHoliday, "umHoliday");
        final long id = umHoliday.id;
        String name = umHoliday.name;
        if (name == null) {
            name = "";
        }
        String longName = umHoliday.longName;
        if (longName == null) {
            longName = "";
        }
        return new c(id, name, longName, ((g)b.d(umHoliday.startDate).F0()).n(), ((g)b.d(umHoliday.endDate).F0().S0(1).v0(1)).n());
    }
    
    @e
    public final c d(@e final Holiday holiday) {
        k0.p(holiday, "holiday");
        return new c(holiday.getId(), holiday.getName(), holiday.getLongName(), ((g)holiday.getStart().F0()).n(), ((g)holiday.getEnd().F0().S0(1).v0(1)).n());
    }
}
