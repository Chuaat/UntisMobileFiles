// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.officehour;

import org.joda.time.base.a;
import java.util.ListIterator;
import com.untis.mobile.utils.comparator.b;
import java.util.Objects;
import kotlin.collections.v;
import kotlin.text.o;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 R2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001RB\u009b\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u00106\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?\u0012\b\b\u0002\u0010F\u001a\u00020\u0013\u0012\b\b\u0002\u0010I\u001a\u00020\f\u0012\b\b\u0002\u0010L\u001a\u00020\f\u0012\b\b\u0002\u00103\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u00109\u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\b\b\u0002\u00100\u001a\u00020\f\u0012\b\b\u0002\u0010<\u001a\u00020\f¢\u0006\u0004\bO\u0010PB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bO\u0010QJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u000e\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u0010\u0012R\"\u00103\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u0010\u0010\"\u0004\b5\u0010\u0012R\"\u00106\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\"\u00109\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'R\"\u0010<\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u000e\u001a\u0004\b=\u0010\u0010\"\u0004\b>\u0010\u0012R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0015\u001a\u0004\bG\u0010\u0017\"\u0004\bH\u0010\u0019R\"\u0010I\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u000e\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010\u0012R\"\u0010L\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u000e\u001a\u0004\bM\u0010\u0010\"\u0004\bN\u0010\u0012¨\u0006S" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "Landroid/os/Parcelable;", "", "other", "", "compareTo", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "displayNameTeacher", "Ljava/lang/String;", "getDisplayNameTeacher", "()Ljava/lang/String;", "setDisplayNameTeacher", "(Ljava/lang/String;)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "Lorg/joda/time/c;", "end", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "", "registered", "Z", "getRegistered", "()Z", "setRegistered", "(Z)V", "", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlot;", "timeSlots", "Ljava/util/List;", "getTimeSlots", "()Ljava/util/List;", "setTimeSlots", "(Ljava/util/List;)V", "userText", "getUserText", "setUserText", "displayNameRooms", "getDisplayNameRooms", "setDisplayNameRooms", "start", "getStart", "setStart", "registrationPossible", "getRegistrationPossible", "setRegistrationPossible", "teacherText", "getTeacherText", "setTeacherText", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "teacher", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "getTeacher", "()Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "setTeacher", "(Lcom/untis/mobile/persistence/models/masterdata/Teacher;)V", "imageId", "getImageId", "setImageId", "email", "getEmail", "setEmail", "phone", "getPhone", "setPhone", "<init>", "(JLorg/joda/time/c;Lorg/joda/time/c;Lcom/untis/mobile/persistence/models/masterdata/Teacher;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class OfficeHour implements Parcelable, Comparable<OfficeHour>
{
    @e
    public static final CREATOR CREATOR;
    @e
    private String displayNameRooms;
    @e
    private String displayNameTeacher;
    @e
    private String email;
    @e
    private c end;
    private long id;
    private long imageId;
    @e
    private String phone;
    private boolean registered;
    private boolean registrationPossible;
    @e
    private c start;
    @f
    private Teacher teacher;
    @e
    private String teacherText;
    @e
    private List<OfficeHourTimeSlot> timeSlots;
    @e
    private String userText;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public OfficeHour() {
        this(0L, null, null, null, 0L, null, null, null, null, false, false, null, null, null, 16383, null);
    }
    
    public OfficeHour(final long id, @e final c start, @e final c end, @f final Teacher teacher, final long imageId, @e final String email, @e final String phone, @e final String displayNameRooms, @e final String displayNameTeacher, final boolean registrationPossible, final boolean registered, @e final List<OfficeHourTimeSlot> timeSlots, @e final String userText, @e final String teacherText) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(email, "email");
        k0.p(phone, "phone");
        k0.p(displayNameRooms, "displayNameRooms");
        k0.p(displayNameTeacher, "displayNameTeacher");
        k0.p(timeSlots, "timeSlots");
        k0.p(userText, "userText");
        k0.p(teacherText, "teacherText");
        this.id = id;
        this.start = start;
        this.end = end;
        this.teacher = teacher;
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
    
    public OfficeHour(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        final Teacher teacher = (Teacher)parcel.readParcelable(Teacher.class.getClassLoader());
        final long long2 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            string4 = "";
        }
        final byte byte1 = parcel.readByte();
        boolean b = false;
        final boolean b2 = byte1 != 0;
        if (parcel.readByte() != 0) {
            b = true;
        }
        ArrayList<OfficeHourTimeSlot> typedArrayList;
        if ((typedArrayList = (ArrayList<OfficeHourTimeSlot>)parcel.createTypedArrayList((Parcelable$Creator)OfficeHourTimeSlot.CREATOR)) == null) {
            typedArrayList = new ArrayList<OfficeHourTimeSlot>();
        }
        String string5 = parcel.readString();
        if (string5 == null) {
            string5 = "";
        }
        String string6 = parcel.readString();
        if (string6 == null) {
            string6 = "";
        }
        this(long1, k0, k2, teacher, long2, string, string2, string3, string4, b2, b, typedArrayList, string5, string6);
    }
    
    public int compareTo(@e final OfficeHour officeHour) {
        k0.p(officeHour, "other");
        final boolean registered = this.registered;
        if (registered && !officeHour.registered) {
            return -1;
        }
        if (!registered && officeHour.registered) {
            return 1;
        }
        final String displayNameTeacher = this.displayNameTeacher;
        final String displayNameTeacher2 = officeHour.displayNameTeacher;
        final o o = new o(" ");
        final int n = 0;
        final List m = o.m((CharSequence)displayNameTeacher, 0);
        List<Object> list = null;
        Label_0155: {
            if (!m.isEmpty()) {
                final ListIterator<String> listIterator = m.listIterator(m.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = v.w5((Iterable<?>)m, listIterator.nextIndex() + 1);
                        break Label_0155;
                    }
                }
            }
            list = v.E();
        }
        final Object[] array = list.toArray((Object[])new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        final String[] array2 = (String[])array;
        final boolean b = array2.length == 0;
        String s = displayNameTeacher;
        if (b ^ true) {
            s = array2[array2.length - 1];
        }
        final List i = new o(" ").m((CharSequence)displayNameTeacher2, 0);
        List<Object> list2 = null;
        Label_0315: {
            if (!i.isEmpty()) {
                final ListIterator<String> listIterator2 = i.listIterator(i.size());
                while (listIterator2.hasPrevious()) {
                    if (listIterator2.previous().length() != 0) {
                        list2 = v.w5((Iterable<?>)i, listIterator2.nextIndex() + 1);
                        break Label_0315;
                    }
                }
            }
            list2 = v.E();
        }
        final Object[] array3 = list2.toArray((Object[])new String[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        final String[] array4 = (String[])array3;
        int n2 = n;
        if (array4.length == 0) {
            n2 = 1;
        }
        String s2 = displayNameTeacher2;
        if ((n2 ^ 0x1) != 0x0) {
            s2 = array4[array4.length - 1];
        }
        return com.untis.mobile.utils.comparator.b.G.b(s, s2);
    }
    
    public int describeContents() {
        return 0;
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
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getImageId() {
        return this.imageId;
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
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @f
    public final Teacher getTeacher() {
        return this.teacher;
    }
    
    @e
    public final String getTeacherText() {
        return this.teacherText;
    }
    
    @e
    public final List<OfficeHourTimeSlot> getTimeSlots() {
        return this.timeSlots;
    }
    
    @e
    public final String getUserText() {
        return this.userText;
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
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setImageId(final long imageId) {
        this.imageId = imageId;
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
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setTeacher(@f final Teacher teacher) {
        this.teacher = teacher;
    }
    
    public final void setTeacherText(@e final String teacherText) {
        k0.p(teacherText, "<set-?>");
        this.teacherText = teacherText;
    }
    
    public final void setTimeSlots(@e final List<OfficeHourTimeSlot> timeSlots) {
        k0.p(timeSlots, "<set-?>");
        this.timeSlots = timeSlots;
    }
    
    public final void setUserText(@e final String userText) {
        k0.p(userText, "<set-?>");
        this.userText = userText;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(((a)this.start).toString());
        parcel.writeString(((a)this.end).toString());
        parcel.writeParcelable((Parcelable)this.teacher, n);
        parcel.writeLong(this.imageId);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
        parcel.writeString(this.displayNameRooms);
        parcel.writeString(this.displayNameTeacher);
        parcel.writeByte((byte)(byte)(this.registrationPossible ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.registered ? 1 : 0));
        parcel.writeTypedList((List)this.timeSlots);
        parcel.writeString(this.userText);
        parcel.writeString(this.teacherText);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHour$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<OfficeHour>
    {
        private CREATOR() {
        }
        
        @e
        public OfficeHour createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new OfficeHour(parcel);
        }
        
        @e
        public OfficeHour[] newArray(final int n) {
            return new OfficeHour[n];
        }
    }
}
