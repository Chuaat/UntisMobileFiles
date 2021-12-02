// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.v;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.profile.AbsenceEndTime;
import com.untis.mobile.persistence.models.profile.ClassbookSettings;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.masterdata.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/e;", "", "Lz4/b;", "realmClassbookSettings", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "a", "classbookSettings", "b", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e
{
    @org.jetbrains.annotations.e
    private final a a;
    
    public e(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "profileId");
        this.a = b.Z.a(s);
    }
    
    @org.jetbrains.annotations.e
    public final ClassbookSettings a(@org.jetbrains.annotations.e final z4.b b) {
        k0.p(b, "realmClassbookSettings");
        return new ClassbookSettings(b.y8(), b.z8(), b.s8(), this.a.H(b.v8()), this.a.H(b.w8()), AbsenceEndTime.Companion.fromValue(b.u8()), com.untis.mobile.utils.mapper.common.b.e(b.t8()));
    }
    
    @org.jetbrains.annotations.e
    public final z4.b b(@org.jetbrains.annotations.e final ClassbookSettings classbookSettings) {
        k0.p(classbookSettings, "classbookSettings");
        final boolean absenceCheckRequired = classbookSettings.getAbsenceCheckRequired();
        final AbsenceReason defaultAbsenceReason = classbookSettings.getDefaultAbsenceReason();
        long id = 0L;
        long id2;
        if (defaultAbsenceReason == null) {
            id2 = 0L;
        }
        else {
            id2 = defaultAbsenceReason.getId();
        }
        final AbsenceReason defaultLatenessReason = classbookSettings.getDefaultLatenessReason();
        if (defaultLatenessReason != null) {
            id = defaultLatenessReason.getId();
        }
        final boolean showAbsenceReason = classbookSettings.getShowAbsenceReason();
        final boolean showAbsenceText = classbookSettings.getShowAbsenceText();
        final int value = classbookSettings.getDefaultAbsenceEndTime().getValue();
        final v customAbsenceEndTime = classbookSettings.getCustomAbsenceEndTime();
        String string;
        if (customAbsenceEndTime == null) {
            string = null;
        }
        else {
            string = customAbsenceEndTime.toString();
        }
        return new z4.b(0L, showAbsenceReason, showAbsenceText, absenceCheckRequired, id2, id, value, string, 1, null);
    }
}
