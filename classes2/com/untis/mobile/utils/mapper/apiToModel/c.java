// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToModel;

import com.untis.mobile.utils.mapper.realmToModel.h0;
import w4.i;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import java.util.List;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import com.untis.mobile.api.common.timetable.UMOfficeHour;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/apiToModel/c;", "", "Lcom/untis/mobile/api/common/timetable/UMOfficeHour;", "umOfficeHour", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "a", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "profileId", "<init>", "(Ljava/lang/String;)V", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final a b;
    @e
    private final com.untis.mobile.services.masterdata.a a;
    
    static {
        b = new a(null);
    }
    
    public c(@e final String s) {
        k0.p(s, "profileId");
        this.a = com.untis.mobile.services.masterdata.b.Z.a(s);
    }
    
    @e
    public final OfficeHour a(@e final UMOfficeHour umOfficeHour) {
        k0.p(umOfficeHour, "umOfficeHour");
        final long id = umOfficeHour.id;
        final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(umOfficeHour.startDateTime);
        k0.o(c, "isoStringToDateTime(umOfficeHour.startDateTime)");
        final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umOfficeHour.endDateTime);
        k0.o(c2, "isoStringToDateTime(umOfficeHour.endDateTime)");
        final Teacher k = this.a.k(umOfficeHour.teacherId);
        final long imageId = umOfficeHour.imageId;
        String email = umOfficeHour.email;
        if (email == null) {
            email = "";
        }
        String phone = umOfficeHour.phone;
        if (phone == null) {
            phone = "";
        }
        String displayNameRooms = umOfficeHour.displayNameRooms;
        if (displayNameRooms == null) {
            displayNameRooms = "";
        }
        String displayNameTeacher = umOfficeHour.displayNameTeacher;
        if (displayNameTeacher == null) {
            displayNameTeacher = "";
        }
        return new OfficeHour(id, c, c2, k, imageId, email, phone, displayNameRooms, displayNameTeacher, umOfficeHour.registrationPossible, umOfficeHour.registered, null, null, null, 14336, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f" }, d2 = { "com/untis/mobile/utils/mapper/apiToModel/c$a", "", "Lw4/i;", "realmTeacher", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "b", "Ly4/a;", "realmOfficeHour", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final Teacher b(final i i) {
            if (i == null) {
                return null;
            }
            return h0.a.d(i);
        }
        
        @e
        public final OfficeHour a(@e final y4.a a) {
            k0.p(a, "realmOfficeHour");
            return new OfficeHour(a.w8(), new org.joda.time.c(a.B8()), new org.joda.time.c(a.v8()), this.b(a.C8()), a.x8(), a.u8(), a.y8(), a.s8(), a.t8(), a.A8(), a.z8(), null, null, null, 14336, null);
        }
    }
}
