// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.masterdata;

import android.os.Parcelable$Creator;
import a4.a;
import kotlin.text.s;
import java.util.Objects;
import com.untis.mobile.persistence.models.EntityType;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import t5.d;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B=\u0012\b\b\u0002\u0010&\u001a\u00020\u0017\u0012\b\b\u0002\u0010,\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b6\u00107B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b6\u00108J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0006\u0010\u0019\u001a\u00020\u000fR\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006:" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Student;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "", "getDisplayName", "getDisplayableTitle", "getDisplayableDescription", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "getDisplayTitleInverted", "lastName", "Ljava/lang/String;", "getLastName", "()Ljava/lang/String;", "setLastName", "(Ljava/lang/String;)V", "klasse", "Ljava/lang/Long;", "getKlasse", "()Ljava/lang/Long;", "setKlasse", "(Ljava/lang/Long;)V", "id", "J", "getId", "()J", "setId", "(J)V", "firstName", "getFirstName", "setFirstName", "Lorg/joda/time/t;", "birthday", "Lorg/joda/time/t;", "getBirthday", "()Lorg/joda/time/t;", "setBirthday", "(Lorg/joda/time/t;)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lorg/joda/time/t;Ljava/lang/Long;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Student implements Parcelable, DisplayableEntity
{
    @e
    public static final CREATOR CREATOR;
    @JsonAdapter(d.class)
    @SerializedName("birthDate")
    @f
    private t birthday;
    @SerializedName("firstName")
    @e
    private String firstName;
    @SerializedName("id")
    private long id;
    @SerializedName("klasseId")
    @f
    private Long klasse;
    @SerializedName("lastName")
    @e
    private String lastName;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Student() {
        this(0L, null, null, null, null, 31, null);
    }
    
    public Student(final long id, @e final String firstName, @e final String lastName, @f final t birthday, @f final Long klasse) {
        k0.p(firstName, "firstName");
        k0.p(lastName, "lastName");
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.klasse = klasse;
    }
    
    public Student(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        this(long1, string, string2, Student.CREATOR.parcelLocalDate(parcel), parcel.readLong());
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long entityId() {
        return this.id;
    }
    
    @e
    public EntityType entityType() {
        return EntityType.STUDENT;
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        if (this == obj) {
            return true;
        }
        Object class1;
        if (obj == null) {
            class1 = null;
        }
        else {
            class1 = obj.getClass();
        }
        if (!k0.g(Student.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.masterdata.Student");
        return this.id == ((Student)obj).id;
    }
    
    @f
    public final t getBirthday() {
        return this.birthday;
    }
    
    @e
    public final String getDisplayName() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.firstName);
        sb.append(' ');
        sb.append(this.lastName);
        final String string = sb.toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        return s.B5((CharSequence)string).toString();
    }
    
    @e
    public final String getDisplayTitleInverted() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.lastName);
        sb.append(' ');
        sb.append(this.firstName);
        final String string = sb.toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        return s.B5((CharSequence)string).toString();
    }
    
    public int getDisplayableBackColor() {
        return 0;
    }
    
    @e
    public String getDisplayableDescription() {
        return "";
    }
    
    public int getDisplayableTextColor() {
        return 0;
    }
    
    @e
    public String getDisplayableTitle() {
        return this.getDisplayName();
    }
    
    @e
    public final String getFirstName() {
        return this.firstName;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @f
    public final Long getKlasse() {
        return this.klasse;
    }
    
    @e
    public final String getLastName() {
        return this.lastName;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setBirthday(@f final t birthday) {
        this.birthday = birthday;
    }
    
    public final void setFirstName(@e final String firstName) {
        k0.p(firstName, "<set-?>");
        this.firstName = firstName;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setKlasse(@f final Long klasse) {
        this.klasse = klasse;
    }
    
    public final void setLastName(@e final String lastName) {
        k0.p(lastName, "<set-?>");
        this.lastName = lastName;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(String.valueOf(this.birthday));
        final Long klasse = this.klasse;
        long longValue;
        if (klasse == null) {
            longValue = 0L;
        }
        else {
            longValue = klasse;
        }
        parcel.writeLong(longValue);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Student$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "Landroid/os/Parcel;", "parcel", "Lorg/joda/time/t;", "parcelLocalDate", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/masterdata/Student;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Student>
    {
        private CREATOR() {
        }
        
        private final t parcelLocalDate(final Parcel parcel) {
            t c0;
            try {
                c0 = t.c0(parcel.readString());
            }
            catch (Exception ex) {
                c0 = null;
            }
            return c0;
        }
        
        @e
        public Student createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Student(parcel);
        }
        
        @e
        public Student[] newArray(final int n) {
            return new Student[n];
        }
    }
}
