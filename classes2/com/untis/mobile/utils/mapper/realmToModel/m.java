// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.k0;
import j4.d;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMExcuseStatus;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/m;", "", "Lcom/untis/mobile/api/common/masterdata/UMExcuseStatus;", "umExcuseStatus", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "a", "Lj4/d;", "realmExcuseStatus", "b", "excuseStatus", "d", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class m
{
    @e
    public static final m a;
    
    static {
        a = new m();
    }
    
    private m() {
    }
    
    @f
    public final ExcuseStatus a(@f final UMExcuseStatus umExcuseStatus) {
        if (umExcuseStatus == null) {
            return null;
        }
        final long id = umExcuseStatus.id;
        final String name = umExcuseStatus.name;
        if (name == null) {
            return null;
        }
        final String longName = umExcuseStatus.longName;
        if (longName == null) {
            return null;
        }
        return new ExcuseStatus(id, name, longName, umExcuseStatus.excused);
    }
    
    @e
    public final ExcuseStatus b(@e final d d) {
        k0.p(d, "realmExcuseStatus");
        return new ExcuseStatus(d.t8(), d.v8(), d.u8(), d.s8());
    }
    
    @f
    public final d c(@f final UMExcuseStatus umExcuseStatus) {
        if (umExcuseStatus == null) {
            return null;
        }
        final long id = umExcuseStatus.id;
        String name = umExcuseStatus.name;
        if (name == null) {
            name = "";
        }
        String longName = umExcuseStatus.longName;
        if (longName == null) {
            longName = "";
        }
        return new d(id, name, longName, umExcuseStatus.excused);
    }
    
    @e
    public final d d(@e final ExcuseStatus excuseStatus) {
        k0.p(excuseStatus, "excuseStatus");
        return new d(excuseStatus.getId(), excuseStatus.getName(), excuseStatus.getLongName(), excuseStatus.getExcused());
    }
}
