// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import kotlin.jvm.internal.k0;
import org.joda.time.t;
import com.untis.mobile.persistence.models.infocenter.InfoCenterExcuse;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.masterdata.UMExcuse;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.utils.mapper.common.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\f" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/d;", "Lcom/untis/mobile/utils/mapper/common/a;", "Lcom/untis/mobile/api/common/masterdata/UMExcuse;", "umExcuse", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "i", "Lq4/a;", "excuse", "j", "k", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends a
{
    @e
    public static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    @f
    public final InfoCenterExcuse i(@f final UMExcuse umExcuse) {
        if (umExcuse == null) {
            return null;
        }
        final long id = umExcuse.id;
        final long excuseStatusId = umExcuse.excuseStatusId;
        String text;
        if ((text = umExcuse.text) == null) {
            text = "";
        }
        final long number = umExcuse.number;
        final t g = this.g(umExcuse.date);
        if (g == null) {
            return null;
        }
        return new InfoCenterExcuse(id, excuseStatusId, text, number, g);
    }
    
    @f
    public final InfoCenterExcuse j(@f final q4.a a) {
        if (a == null) {
            return null;
        }
        final long u8 = a.u8();
        final long t8 = a.t8();
        final String w8 = a.w8();
        final long v8 = a.v8();
        final t c0 = t.c0(a.s8());
        k0.o(c0, "parse(excuse.date)");
        return new InfoCenterExcuse(u8, t8, w8, v8, c0);
    }
    
    @f
    public final q4.a k(@f final InfoCenterExcuse infoCenterExcuse) {
        if (infoCenterExcuse == null) {
            return null;
        }
        final long id = infoCenterExcuse.getId();
        final long excuseStatusId = infoCenterExcuse.getExcuseStatusId();
        final String text = infoCenterExcuse.getText();
        final long number = infoCenterExcuse.getNumber();
        final String string = infoCenterExcuse.getDate().toString();
        k0.o(string, "excuse.date.toString()");
        return new q4.a(id, excuseStatusId, text, number, string);
    }
}
