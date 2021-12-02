// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.contacthour;

import a4.a;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.List;
import androidx.room.l1;
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import androidx.room.i0;
import com.google.gson.annotations.SerializedName;
import androidx.room.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0012H\u00c6\u0003J\u007f\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u0012H\u00c6\u0001J\t\u0010!\u001a\u00020\rH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010$\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u001f\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R$\u0010>\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u00101\u001a\u0004\b?\u00103\"\u0004\b@\u00105R$\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\bA\u00103\"\u0004\bB\u00105R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00106\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R$\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00101\u001a\u0004\bG\u00103\"\u0004\bH\u00105R*\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010%\u001a\u0004\bQ\u0010'\"\u0004\bR\u0010)R\"\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\bS\u00103\"\u0004\bT\u00105¨\u0006W" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "", "", "position", "Lorg/joda/time/c;", "getSlotStart", "getSlotEnd", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "", "component10", "component11", "id", "wuId", "start", "end", "teacherId", "email", "phone", "displayRooms", "displayTeacher", "registrationPossible", "registered", "copy", "toString", "hashCode", "other", "equals", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "J", "getWuId", "()J", "setWuId", "(J)V", "getId", "setId", "Ljava/lang/String;", "getDisplayRooms", "()Ljava/lang/String;", "setDisplayRooms", "(Ljava/lang/String;)V", "Z", "getRegistered", "()Z", "setRegistered", "(Z)V", "teacherText", "getTeacherText", "setTeacherText", "userText", "getUserText", "setUserText", "getEmail", "setEmail", "getRegistrationPossible", "setRegistrationPossible", "getTeacherId", "setTeacherId", "getPhone", "setPhone", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlot;", "slots", "Ljava/util/List;", "getSlots", "()Ljava/util/List;", "setSlots", "(Ljava/util/List;)V", "getEnd", "setEnd", "getDisplayTeacher", "setDisplayTeacher", "<init>", "(JJLorg/joda/time/c;Lorg/joda/time/c;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(tableName = "dashboard_contact_hour")
public final class DashboardContactHour
{
    @SerializedName("displayNameRooms")
    @i0(defaultValue = "", name = "display_rooms")
    @e
    private String displayRooms;
    @SerializedName("displayNameTeacher")
    @i0(defaultValue = "", name = "display_teacher")
    @e
    private String displayTeacher;
    @SerializedName("email")
    @i0(defaultValue = "", name = "email")
    @f
    private String email;
    @JsonAdapter(b.class)
    @SerializedName("endDateTime")
    @i0(name = "end")
    @f
    private c end;
    @SerializedName("_ignore_id")
    @i0(name = "contact_hour_id")
    @l1(autoGenerate = true)
    private long id;
    @SerializedName("phone")
    @i0(defaultValue = "", name = "phone")
    @f
    private String phone;
    @SerializedName("registered")
    @i0(name = "registered")
    private boolean registered;
    @SerializedName("registrationPossible")
    @i0(name = "registration_possible")
    private boolean registrationPossible;
    @i0(name = "slots")
    @f
    private List<DashboardContactHourSlot> slots;
    @JsonAdapter(b.class)
    @SerializedName("startDateTime")
    @i0(name = "start")
    @f
    private c start;
    @SerializedName("teacherId")
    @i0(name = "teacher_id")
    private long teacherId;
    @i0(name = "text_teacher")
    @f
    private String teacherText;
    @i0(name = "text_user")
    @f
    private String userText;
    @SerializedName("id")
    @i0(name = "contact_hour_wu_id")
    private long wuId;
    
    public DashboardContactHour(final long id, final long wuId, @f final c start, @f final c end, final long teacherId, @f final String email, @f final String phone, @e final String displayRooms, @e final String displayTeacher, final boolean registrationPossible, final boolean registered) {
        k0.p(displayRooms, "displayRooms");
        k0.p(displayTeacher, "displayTeacher");
        this.id = id;
        this.wuId = wuId;
        this.start = start;
        this.end = end;
        this.teacherId = teacherId;
        this.email = email;
        this.phone = phone;
        this.displayRooms = displayRooms;
        this.displayTeacher = displayTeacher;
        this.registrationPossible = registrationPossible;
        this.registered = registered;
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final boolean component10() {
        return this.registrationPossible;
    }
    
    public final boolean component11() {
        return this.registered;
    }
    
    public final long component2() {
        return this.wuId;
    }
    
    @f
    public final c component3() {
        return this.start;
    }
    
    @f
    public final c component4() {
        return this.end;
    }
    
    public final long component5() {
        return this.teacherId;
    }
    
    @f
    public final String component6() {
        return this.email;
    }
    
    @f
    public final String component7() {
        return this.phone;
    }
    
    @e
    public final String component8() {
        return this.displayRooms;
    }
    
    @e
    public final String component9() {
        return this.displayTeacher;
    }
    
    @e
    public final DashboardContactHour copy(final long n, final long n2, @f final c c, @f final c c2, final long n3, @f final String s, @f final String s2, @e final String s3, @e final String s4, final boolean b, final boolean b2) {
        k0.p(s3, "displayRooms");
        k0.p(s4, "displayTeacher");
        return new DashboardContactHour(n, n2, c, c2, n3, s, s2, s3, s4, b, b2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardContactHour)) {
            return false;
        }
        final DashboardContactHour dashboardContactHour = (DashboardContactHour)o;
        return this.id == dashboardContactHour.id && this.wuId == dashboardContactHour.wuId && k0.g(this.start, dashboardContactHour.start) && k0.g(this.end, dashboardContactHour.end) && this.teacherId == dashboardContactHour.teacherId && k0.g(this.email, dashboardContactHour.email) && k0.g(this.phone, dashboardContactHour.phone) && k0.g(this.displayRooms, dashboardContactHour.displayRooms) && k0.g(this.displayTeacher, dashboardContactHour.displayTeacher) && this.registrationPossible == dashboardContactHour.registrationPossible && this.registered == dashboardContactHour.registered;
    }
    
    @e
    public final String getDisplayRooms() {
        return this.displayRooms;
    }
    
    @e
    public final String getDisplayTeacher() {
        return this.displayTeacher;
    }
    
    @f
    public final String getEmail() {
        return this.email;
    }
    
    @f
    public final c getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @f
    public final String getPhone() {
        return this.phone;
    }
    
    public final boolean getRegistered() {
        return this.registered;
    }
    
    public final boolean getRegistrationPossible() {
        return this.registrationPossible;
    }
    
    @f
    public final c getSlotEnd(final int n) {
        c c;
        try {
            List<DashboardContactHourSlot> list;
            if ((list = this.slots) == null) {
                list = v.E();
            }
            final org.joda.time.v end = list.get(n).getEnd();
            final c end2 = this.end;
            if (end2 == null) {
                c = null;
            }
            else {
                c = end2.Z1(end);
            }
        }
        catch (Exception ex) {
            c = this.end;
        }
        return c;
    }
    
    @f
    public final c getSlotStart(final int n) {
        c c;
        try {
            List<DashboardContactHourSlot> list;
            if ((list = this.slots) == null) {
                list = v.E();
            }
            final org.joda.time.v start = list.get(n).getStart();
            final c start2 = this.start;
            if (start2 == null) {
                c = null;
            }
            else {
                c = start2.Z1(start);
            }
        }
        catch (Exception ex) {
            c = this.start;
        }
        return c;
    }
    
    @f
    public final List<DashboardContactHourSlot> getSlots() {
        return this.slots;
    }
    
    @f
    public final c getStart() {
        return this.start;
    }
    
    public final long getTeacherId() {
        return this.teacherId;
    }
    
    @f
    public final String getTeacherText() {
        return this.teacherText;
    }
    
    @f
    public final String getUserText() {
        return this.userText;
    }
    
    public final long getWuId() {
        return this.wuId;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int a2 = a4.a.a(this.wuId);
        final c start = this.start;
        int hashCode = 0;
        int hashCode2;
        if (start == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((org.joda.time.base.c)start).hashCode();
        }
        final c end = this.end;
        int hashCode3;
        if (end == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = ((org.joda.time.base.c)end).hashCode();
        }
        final int a3 = a4.a.a(this.teacherId);
        final String email = this.email;
        int hashCode4;
        if (email == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = email.hashCode();
        }
        final String phone = this.phone;
        if (phone != null) {
            hashCode = phone.hashCode();
        }
        final int hashCode5 = this.displayRooms.hashCode();
        final int hashCode6 = this.displayTeacher.hashCode();
        final int registrationPossible = this.registrationPossible ? 1 : 0;
        int n = 1;
        int n2 = registrationPossible;
        if (registrationPossible != 0) {
            n2 = 1;
        }
        final int registered = this.registered ? 1 : 0;
        if (registered == 0) {
            n = registered;
        }
        return (((((((((a * 31 + a2) * 31 + hashCode2) * 31 + hashCode3) * 31 + a3) * 31 + hashCode4) * 31 + hashCode) * 31 + hashCode5) * 31 + hashCode6) * 31 + n2) * 31 + n;
    }
    
    public final void setDisplayRooms(@e final String displayRooms) {
        k0.p(displayRooms, "<set-?>");
        this.displayRooms = displayRooms;
    }
    
    public final void setDisplayTeacher(@e final String displayTeacher) {
        k0.p(displayTeacher, "<set-?>");
        this.displayTeacher = displayTeacher;
    }
    
    public final void setEmail(@f final String email) {
        this.email = email;
    }
    
    public final void setEnd(@f final c end) {
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setPhone(@f final String phone) {
        this.phone = phone;
    }
    
    public final void setRegistered(final boolean registered) {
        this.registered = registered;
    }
    
    public final void setRegistrationPossible(final boolean registrationPossible) {
        this.registrationPossible = registrationPossible;
    }
    
    public final void setSlots(@f final List<DashboardContactHourSlot> slots) {
        this.slots = slots;
    }
    
    public final void setStart(@f final c start) {
        this.start = start;
    }
    
    public final void setTeacherId(final long teacherId) {
        this.teacherId = teacherId;
    }
    
    public final void setTeacherText(@f final String teacherText) {
        this.teacherText = teacherText;
    }
    
    public final void setUserText(@f final String userText) {
        this.userText = userText;
    }
    
    public final void setWuId(final long wuId) {
        this.wuId = wuId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardContactHour(id=");
        sb.append(this.id);
        sb.append(", wuId=");
        sb.append(this.wuId);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", teacherId=");
        sb.append(this.teacherId);
        sb.append(", email=");
        sb.append((Object)this.email);
        sb.append(", phone=");
        sb.append((Object)this.phone);
        sb.append(", displayRooms=");
        sb.append(this.displayRooms);
        sb.append(", displayTeacher=");
        sb.append(this.displayTeacher);
        sb.append(", registrationPossible=");
        sb.append(this.registrationPossible);
        sb.append(", registered=");
        sb.append(this.registered);
        sb.append(')');
        return sb.toString();
    }
}
