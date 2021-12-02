// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import w4.h;
import com.untis.mobile.api.common.masterdata.UMSubject;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/g0;", "", "Lw4/h;", "realmSubject", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "d", "Lcom/untis/mobile/api/common/masterdata/UMSubject;", "umSubject", "c", "a", "subject", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g0
{
    @e
    public static final g0 a;
    
    static {
        a = new g0();
    }
    
    private g0() {
    }
    
    @e
    public final h a(@e final UMSubject umSubject) {
        k0.p(umSubject, "umSubject");
        final long id = umSubject.id;
        String name = umSubject.name;
        if (name == null) {
            name = "";
        }
        String longName = umSubject.longName;
        if (longName == null) {
            longName = "";
        }
        return new h(id, name, longName, b.a(umSubject.foreColor), b.a(umSubject.backColor), umSubject.active, umSubject.displayAllowed);
    }
    
    @e
    public final h b(@e final Subject subject) {
        k0.p(subject, "subject");
        return new h(subject.getId(), subject.getName(), subject.getLongName(), subject.getTextColor(), subject.getBackColor(), subject.getActive(), subject.getDisplayable());
    }
    
    @e
    public final Subject c(@e final UMSubject umSubject) {
        k0.p(umSubject, "umSubject");
        final long id = umSubject.id;
        String name = umSubject.name;
        if (name == null) {
            name = "";
        }
        String longName = umSubject.longName;
        if (longName == null) {
            longName = "";
        }
        return new Subject(id, name, longName, b.a(umSubject.foreColor), b.a(umSubject.backColor), 0, 0, umSubject.active, umSubject.displayAllowed, 96, null);
    }
    
    @e
    public final Subject d(@e final h h) {
        k0.p(h, "realmSubject");
        return new Subject(h.v8(), h.x8(), h.w8(), h.y8(), h.t8(), 0, 0, h.s8(), h.u8(), 96, null);
    }
}
