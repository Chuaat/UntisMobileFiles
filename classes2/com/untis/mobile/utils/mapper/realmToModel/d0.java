// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import com.untis.mobile.utils.mapper.common.b;
import com.untis.mobile.persistence.models.SchoolColorType;
import com.untis.mobile.api.common.color.UMAppColor;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.realm.c;
import com.untis.mobile.persistence.models.SchoolColor;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/d0;", "", "Lcom/untis/mobile/api/common/color/UMAppColor;", "umAppColor", "Lcom/untis/mobile/persistence/models/SchoolColor;", "b", "Lcom/untis/mobile/persistence/realm/c;", "realmSchoolColor", "c", "schoolColor", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d0
{
    @e
    public static final d0 a;
    
    static {
        a = new d0();
    }
    
    private d0() {
    }
    
    @f
    public final c a(@e final SchoolColor schoolColor) {
        k0.p(schoolColor, "schoolColor");
        return new c(schoolColor.getType().getId(), schoolColor.getText(), schoolColor.getBackground());
    }
    
    @f
    public final SchoolColor b(@e final UMAppColor umAppColor) {
        k0.p(umAppColor, "umAppColor");
        final SchoolColorType by = SchoolColorType.Companion.findBy(umAppColor.type);
        if (by == null) {
            return null;
        }
        return new SchoolColor(by, b.a(umAppColor.foreColor), b.a(umAppColor.backColor));
    }
    
    @f
    public final SchoolColor c(@e final c c) {
        k0.p(c, "realmSchoolColor");
        final SchoolColorType by = SchoolColorType.Companion.findBy(c.t8());
        if (by == null) {
            return null;
        }
        return new SchoolColor(by, c.u8(), c.s8());
    }
}
