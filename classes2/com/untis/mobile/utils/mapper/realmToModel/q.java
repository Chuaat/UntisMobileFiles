// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import w4.d;
import org.joda.time.t;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.api.common.masterdata.UMKlasse;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/q;", "", "Lcom/untis/mobile/api/common/masterdata/UMKlasse;", "umKlasse", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "a", "Lw4/d;", "realmKlasse", "b", "c", "klasse", "d", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class q
{
    @e
    public static final q a;
    
    static {
        a = new q();
    }
    
    private q() {
    }
    
    @e
    public final Klasse a(@e final UMKlasse umKlasse) {
        k0.p(umKlasse, "umKlasse");
        final long id = umKlasse.id;
        String name = umKlasse.name;
        if (name == null) {
            name = "";
        }
        String longName = umKlasse.longName;
        if (longName == null) {
            longName = "";
        }
        final t d = b.d(umKlasse.startDate);
        k0.o(d, "isoStringToLocalDate(umKlasse.startDate)");
        final t d2 = b.d(umKlasse.endDate);
        k0.o(d2, "isoStringToLocalDate(umKlasse.endDate)");
        return new Klasse(id, name, longName, d, d2, b.a(umKlasse.foreColor), b.a(umKlasse.backColor), umKlasse.active, umKlasse.displayable);
    }
    
    @e
    public final Klasse b(@e final d d) {
        k0.p(d, "realmKlasse");
        return new Klasse(d.w8(), d.y8(), d.x8(), new t(d.z8()), new t(d.v8()), d.A8(), d.t8(), d.s8(), d.u8());
    }
    
    @e
    public final d c(@e final UMKlasse umKlasse) {
        k0.p(umKlasse, "umKlasse");
        final long id = umKlasse.id;
        String name = umKlasse.name;
        if (name == null) {
            name = "";
        }
        String longName = umKlasse.longName;
        if (longName == null) {
            longName = "";
        }
        return new d(id, name, longName, ((g)b.d(umKlasse.startDate).F0()).n(), ((g)b.d(umKlasse.endDate).F0().S0(1).v0(1)).n(), b.a(umKlasse.foreColor), b.a(umKlasse.backColor), umKlasse.active, umKlasse.displayable);
    }
    
    @e
    public final d d(@e final Klasse klasse) {
        k0.p(klasse, "klasse");
        return new d(klasse.getId(), klasse.getName(), klasse.getLongName(), ((g)klasse.getStart().F0()).n(), ((g)klasse.getEnd().F0()).n(), klasse.getTextColor(), klasse.getBackColor(), klasse.getActive(), klasse.getDisplayable());
    }
}
