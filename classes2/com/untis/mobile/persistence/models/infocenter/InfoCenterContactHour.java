// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import kotlin.text.s;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.f;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.sectionlist.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\u0006\u0010%\u001a\u00020\u0012\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b\\\u0010]J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0012H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003J©\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u0002H\u00c6\u0001J\t\u0010*\u001a\u00020\u0002H\u00d6\u0001J\t\u0010+\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003R\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010/\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010/\u001a\u0004\b@\u00101\"\u0004\bA\u00103R$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00109\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00104\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010/\u001a\u0004\bK\u00101\"\u0004\bL\u00103R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010/\u001a\u0004\bM\u00101\"\u0004\bN\u00103R\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00104\u001a\u0004\bO\u00106\"\u0004\bP\u00108R\"\u0010$\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010Q\u001a\u0004\bV\u0010S\"\u0004\bW\u0010UR\"\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00104\u001a\u0004\bX\u00106\"\u0004\bY\u00108R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010/\u001a\u0004\bZ\u00101\"\u0004\b[\u00103¨\u0006^" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHour;", "Lcom/untis/mobile/ui/activities/sectionlist/a;", "", "queryText", "", "filter", "", "component1", "component2", "Lorg/joda/time/c;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "component12", "", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslot;", "component13", "component14", "component15", "key", "id", "start", "end", "teacherId", "imageId", "email", "phone", "displayNameRooms", "displayNameTeacher", "registrationPossible", "registered", "timeSlots", "userText", "teacherText", "copy", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getDisplayNameRooms", "()Ljava/lang/String;", "setDisplayNameRooms", "(Ljava/lang/String;)V", "J", "getId", "()J", "setId", "(J)V", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "getEmail", "setEmail", "getPhone", "setPhone", "getStart", "setStart", "Ljava/util/List;", "getTimeSlots", "()Ljava/util/List;", "setTimeSlots", "(Ljava/util/List;)V", "getTeacherId", "setTeacherId", "getTeacherText", "setTeacherText", "getUserText", "setUserText", "getKey", "setKey", "Z", "getRegistrationPossible", "()Z", "setRegistrationPossible", "(Z)V", "getRegistered", "setRegistered", "getImageId", "setImageId", "getDisplayNameTeacher", "setDisplayNameTeacher", "<init>", "(JJLorg/joda/time/c;Lorg/joda/time/c;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterContactHour implements a
{
    @e
    private String displayNameRooms;
    @e
    private String displayNameTeacher;
    @e
    private String email;
    @f
    private c end;
    private long id;
    private long imageId;
    private long key;
    @e
    private String phone;
    private boolean registered;
    private boolean registrationPossible;
    @f
    private c start;
    private long teacherId;
    @e
    private String teacherText;
    @e
    private List<InfoCenterContactHourTimeslot> timeSlots;
    @e
    private String userText;
    
    public InfoCenterContactHour(final long key, final long id, @f final c start, @f final c end, final long teacherId, final long imageId, @e final String email, @e final String phone, @e final String displayNameRooms, @e final String displayNameTeacher, final boolean registrationPossible, final boolean registered, @e final List<InfoCenterContactHourTimeslot> timeSlots, @e final String userText, @e final String teacherText) {
        k0.p(email, "email");
        k0.p(phone, "phone");
        k0.p(displayNameRooms, "displayNameRooms");
        k0.p(displayNameTeacher, "displayNameTeacher");
        k0.p(timeSlots, "timeSlots");
        k0.p(userText, "userText");
        k0.p(teacherText, "teacherText");
        this.key = key;
        this.id = id;
        this.start = start;
        this.end = end;
        this.teacherId = teacherId;
        this.imageId = imageId;
        this.email = email;
        this.phone = phone;
        this.displayNameRooms = displayNameRooms;
        this.displayNameTeacher = displayNameTeacher;
        this.registrationPossible = registrationPossible;
        this.registered = registered;
        this.timeSlots = timeSlots;
        this.userText = userText;
        this.teacherText = teacherText;
    }
    
    public final long component1() {
        return this.key;
    }
    
    @e
    public final String component10() {
        return this.displayNameTeacher;
    }
    
    public final boolean component11() {
        return this.registrationPossible;
    }
    
    public final boolean component12() {
        return this.registered;
    }
    
    @e
    public final List<InfoCenterContactHourTimeslot> component13() {
        return this.timeSlots;
    }
    
    @e
    public final String component14() {
        return this.userText;
    }
    
    @e
    public final String component15() {
        return this.teacherText;
    }
    
    public final long component2() {
        return this.id;
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
    
    public final long component6() {
        return this.imageId;
    }
    
    @e
    public final String component7() {
        return this.email;
    }
    
    @e
    public final String component8() {
        return this.phone;
    }
    
    @e
    public final String component9() {
        return this.displayNameRooms;
    }
    
    @e
    public final InfoCenterContactHour copy(final long n, final long n2, @f final c c, @f final c c2, final long n3, final long n4, @e final String s, @e final String s2, @e final String s3, @e final String s4, final boolean b, final boolean b2, @e final List<InfoCenterContactHourTimeslot> list, @e final String s5, @e final String s6) {
        k0.p(s, "email");
        k0.p(s2, "phone");
        k0.p(s3, "displayNameRooms");
        k0.p(s4, "displayNameTeacher");
        k0.p(list, "timeSlots");
        k0.p(s5, "userText");
        k0.p(s6, "teacherText");
        return new InfoCenterContactHour(n, n2, c, c2, n3, n4, s, s2, s3, s4, b, b2, list, s5, s6);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoCenterContactHour)) {
            return false;
        }
        final InfoCenterContactHour infoCenterContactHour = (InfoCenterContactHour)o;
        return this.key == infoCenterContactHour.key && this.id == infoCenterContactHour.id && k0.g(this.start, infoCenterContactHour.start) && k0.g(this.end, infoCenterContactHour.end) && this.teacherId == infoCenterContactHour.teacherId && this.imageId == infoCenterContactHour.imageId && k0.g(this.email, infoCenterContactHour.email) && k0.g(this.phone, infoCenterContactHour.phone) && k0.g(this.displayNameRooms, infoCenterContactHour.displayNameRooms) && k0.g(this.displayNameTeacher, infoCenterContactHour.displayNameTeacher) && this.registrationPossible == infoCenterContactHour.registrationPossible && this.registered == infoCenterContactHour.registered && k0.g(this.timeSlots, infoCenterContactHour.timeSlots) && k0.g(this.userText, infoCenterContactHour.userText) && k0.g(this.teacherText, infoCenterContactHour.teacherText);
    }
    
    @Override
    public int filter(@e final String s) {
        k0.p(s, "queryText");
        final int n3 = s.n3((CharSequence)this.displayNameTeacher, s, 0, true);
        if (n3 > -1) {
            return n3;
        }
        return s.n3((CharSequence)this.displayNameRooms, s, 0, true);
    }
    
    @e
    public final String getDisplayNameRooms() {
        return this.displayNameRooms;
    }
    
    @e
    public final String getDisplayNameTeacher() {
        return this.displayNameTeacher;
    }
    
    @e
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
    
    public final long getImageId() {
        return this.imageId;
    }
    
    public final long getKey() {
        return this.key;
    }
    
    @e
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
    public final c getStart() {
        return this.start;
    }
    
    public final long getTeacherId() {
        return this.teacherId;
    }
    
    @e
    public final String getTeacherText() {
        return this.teacherText;
    }
    
    @e
    public final List<InfoCenterContactHourTimeslot> getTimeSlots() {
        return this.timeSlots;
    }
    
    @e
    public final String getUserText() {
        return this.userText;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.key);
        final int a2 = a4.a.a(this.id);
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
        if (end != null) {
            hashCode = ((org.joda.time.base.c)end).hashCode();
        }
        final int a3 = a4.a.a(this.teacherId);
        final int a4 = a4.a.a(this.imageId);
        final int hashCode3 = this.email.hashCode();
        final int hashCode4 = this.phone.hashCode();
        final int hashCode5 = this.displayNameRooms.hashCode();
        final int hashCode6 = this.displayNameTeacher.hashCode();
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
        return (((((((((((((a * 31 + a2) * 31 + hashCode2) * 31 + hashCode) * 31 + a3) * 31 + a4) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + n2) * 31 + n) * 31 + this.timeSlots.hashCode()) * 31 + this.userText.hashCode()) * 31 + this.teacherText.hashCode();
    }
    
    public final void setDisplayNameRooms(@e final String displayNameRooms) {
        k0.p(displayNameRooms, "<set-?>");
        this.displayNameRooms = displayNameRooms;
    }
    
    public final void setDisplayNameTeacher(@e final String displayNameTeacher) {
        k0.p(displayNameTeacher, "<set-?>");
        this.displayNameTeacher = displayNameTeacher;
    }
    
    public final void setEmail(@e final String email) {
        k0.p(email, "<set-?>");
        this.email = email;
    }
    
    public final void setEnd(@f final c end) {
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setImageId(final long imageId) {
        this.imageId = imageId;
    }
    
    public final void setKey(final long key) {
        this.key = key;
    }
    
    public final void setPhone(@e final String phone) {
        k0.p(phone, "<set-?>");
        this.phone = phone;
    }
    
    public final void setRegistered(final boolean registered) {
        this.registered = registered;
    }
    
    public final void setRegistrationPossible(final boolean registrationPossible) {
        this.registrationPossible = registrationPossible;
    }
    
    public final void setStart(@f final c start) {
        this.start = start;
    }
    
    public final void setTeacherId(final long teacherId) {
        this.teacherId = teacherId;
    }
    
    public final void setTeacherText(@e final String teacherText) {
        k0.p(teacherText, "<set-?>");
        this.teacherText = teacherText;
    }
    
    public final void setTimeSlots(@e final List<InfoCenterContactHourTimeslot> timeSlots) {
        k0.p(timeSlots, "<set-?>");
        this.timeSlots = timeSlots;
    }
    
    public final void setUserText(@e final String userText) {
        k0.p(userText, "<set-?>");
        this.userText = userText;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoCenterContactHour(key=");
        sb.append(this.key);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", teacherId=");
        sb.append(this.teacherId);
        sb.append(", imageId=");
        sb.append(this.imageId);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", displayNameRooms=");
        sb.append(this.displayNameRooms);
        sb.append(", displayNameTeacher=");
        sb.append(this.displayNameTeacher);
        sb.append(", registrationPossible=");
        sb.append(this.registrationPossible);
        sb.append(", registered=");
        sb.append(this.registered);
        sb.append(", timeSlots=");
        sb.append(this.timeSlots);
        sb.append(", userText=");
        sb.append(this.userText);
        sb.append(", teacherText=");
        sb.append(this.teacherText);
        sb.append(')');
        return sb.toString();
    }
}
