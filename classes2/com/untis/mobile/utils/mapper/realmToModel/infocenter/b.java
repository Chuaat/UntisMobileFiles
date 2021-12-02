// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import com.untis.mobile.api.common.timetable.UMOfficeHourRegistrationTimeSlot;
import java.util.Iterator;
import io.realm.l0;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.infocenter.InfoCenterContactHour;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.timetable.UMOfficeHour;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.infocenter.InfoCenterContactHourTimeslotState;
import org.joda.time.c;
import com.untis.mobile.persistence.models.infocenter.InfoCenterContactHourTimeslot;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.utils.mapper.common.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/b;", "Lcom/untis/mobile/utils/mapper/common/a;", "Lt4/b;", "slot", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslot;", "l", "contactHourTimeslot", "n", "Lcom/untis/mobile/api/common/timetable/UMOfficeHour;", "umOfficeHour", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHour;", "i", "Lt4/a;", "realmContactHour", "j", "contactHour", "m", "Lcom/untis/mobile/api/common/timetable/UMOfficeHourRegistrationTimeSlot;", "umTimeslot", "k", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends a
{
    @e
    public static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    private final InfoCenterContactHourTimeslot l(final t4.b b) {
        return new InfoCenterContactHourTimeslot(new c((Object)b.t8()), new c((Object)b.s8()), InfoCenterContactHourTimeslotState.Companion.findBy(b.u8()));
    }
    
    private final t4.b n(final InfoCenterContactHourTimeslot infoCenterContactHourTimeslot) {
        final String string = ((org.joda.time.base.a)infoCenterContactHourTimeslot.getStart()).toString();
        k0.o(string, "contactHourTimeslot.start.toString()");
        final String string2 = ((org.joda.time.base.a)infoCenterContactHourTimeslot.getEnd()).toString();
        k0.o(string2, "contactHourTimeslot.end.toString()");
        return new t4.b(string, string2, infoCenterContactHourTimeslot.getState().getValue());
    }
    
    @f
    public final InfoCenterContactHour i(@f final UMOfficeHour umOfficeHour) {
        if (umOfficeHour == null) {
            return null;
        }
        final long id = umOfficeHour.id;
        final c c = this.c(umOfficeHour.startDateTime);
        final c c2 = this.c(umOfficeHour.endDateTime);
        final long teacherId = umOfficeHour.teacherId;
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
        return new InfoCenterContactHour(0L, id, c, c2, teacherId, imageId, email, phone, displayNameRooms, displayNameTeacher, umOfficeHour.registrationPossible, umOfficeHour.registered, v.E(), "", "");
    }
    
    @e
    public final InfoCenterContactHour j(@e final t4.a a) {
        k0.p(a, "realmContactHour");
        final long w8 = a.w8();
        final long u8 = a.u8();
        final c c = this.c(a.B8());
        final c c2 = this.c(a.t8());
        final long d8 = a.D8();
        final long v8 = a.v8();
        final String s8 = a.s8();
        final String x8 = a.x8();
        final String a2 = a.A8();
        final String c3 = a.C8();
        final boolean z8 = a.z8();
        final boolean y8 = a.y8();
        final l0<t4.b> f8 = a.F8();
        final ArrayList list = new ArrayList<InfoCenterContactHourTimeslot>(v.Y((Iterable<?>)f8, 10));
        for (final t4.b b : f8) {
            final b a3 = b.a;
            k0.o(b, "it");
            list.add(a3.l(b));
        }
        return new InfoCenterContactHour(w8, u8, c, c2, d8, v8, s8, x8, a2, c3, z8, y8, (List<InfoCenterContactHourTimeslot>)list, a.G8(), a.E8());
    }
    
    @f
    public final InfoCenterContactHourTimeslot k(@f final UMOfficeHourRegistrationTimeSlot umOfficeHourRegistrationTimeSlot) {
        final InfoCenterContactHourTimeslot infoCenterContactHourTimeslot = null;
        if (umOfficeHourRegistrationTimeSlot == null) {
            return null;
        }
        final c c = this.c(umOfficeHourRegistrationTimeSlot.startTime);
        if (c == null) {
            return null;
        }
        final c c2 = this.c(umOfficeHourRegistrationTimeSlot.endTime);
        if (c2 == null) {
            return null;
        }
        InfoCenterContactHourTimeslot infoCenterContactHourTimeslot2 = infoCenterContactHourTimeslot;
        if (!((org.joda.time.base.c)c).X4((org.joda.time.l0)c2)) {
            if (((org.joda.time.base.c)c).R((org.joda.time.l0)c2)) {
                infoCenterContactHourTimeslot2 = infoCenterContactHourTimeslot;
            }
            else {
                infoCenterContactHourTimeslot2 = new InfoCenterContactHourTimeslot(c, c2, InfoCenterContactHourTimeslotState.Companion.findBy(umOfficeHourRegistrationTimeSlot.state));
            }
        }
        return infoCenterContactHourTimeslot2;
    }
    
    @e
    public final t4.a m(@e final InfoCenterContactHour infoCenterContactHour) {
        k0.p(infoCenterContactHour, "contactHour");
        final long key = infoCenterContactHour.getKey();
        final long id = infoCenterContactHour.getId();
        final c start = infoCenterContactHour.getStart();
        String string;
        if (start == null) {
            string = null;
        }
        else {
            string = ((org.joda.time.base.a)start).toString();
        }
        final c end = infoCenterContactHour.getEnd();
        String string2;
        if (end == null) {
            string2 = null;
        }
        else {
            string2 = ((org.joda.time.base.a)end).toString();
        }
        final long teacherId = infoCenterContactHour.getTeacherId();
        final long imageId = infoCenterContactHour.getImageId();
        final String email = infoCenterContactHour.getEmail();
        final String phone = infoCenterContactHour.getPhone();
        final String displayNameRooms = infoCenterContactHour.getDisplayNameRooms();
        final String displayNameTeacher = infoCenterContactHour.getDisplayNameTeacher();
        final boolean registrationPossible = infoCenterContactHour.getRegistrationPossible();
        final boolean registered = infoCenterContactHour.getRegistered();
        final List<InfoCenterContactHourTimeslot> timeSlots = infoCenterContactHour.getTimeSlots();
        final ArrayList list = new ArrayList<t4.b>(v.Y((Iterable<?>)timeSlots, 10));
        final Iterator<Object> iterator = timeSlots.iterator();
        while (iterator.hasNext()) {
            list.add(b.a.n(iterator.next()));
        }
        final l0<t4.b> h = com.untis.mobile.utils.mapper.common.b.h((List<t4.b>)list);
        k0.o(h, "toRealmList(contactHour.timeSlots.map { toRealmInfoCenterOfficehourTimeslot(it) })");
        return new t4.a(key, id, string, string2, teacherId, imageId, email, phone, displayNameRooms, displayNameTeacher, registrationPossible, registered, h, infoCenterContactHour.getUserText(), infoCenterContactHour.getTeacherText());
    }
}
