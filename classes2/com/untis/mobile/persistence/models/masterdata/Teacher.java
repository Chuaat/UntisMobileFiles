// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.masterdata;

import android.os.Parcelable$Creator;
import a4.a;
import kotlin.text.s;
import java.util.Objects;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JBk\u0012\b\b\u0002\u00102\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010>\u001a\u00020\u000f\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010D\u001a\u00020(\u0012\b\b\u0002\u0010A\u001a\u00020\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0005\u0012\b\b\u0002\u0010/\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b¢\u0006\u0004\bG\u0010HB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bG\u0010IJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00102\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001a\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\"\u0010A\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R\"\u0010D\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.¨\u0006K" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "", "getDisplayName", "getDisplayableTitle", "getDisplayableDescription", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "firstName", "getFirstName", "setFirstName", "displayable", "Z", "getDisplayable", "()Z", "setDisplayable", "(Z)V", "Lorg/joda/time/t;", "start", "Lorg/joda/time/t;", "getStart", "()Lorg/joda/time/t;", "setStart", "(Lorg/joda/time/t;)V", "active", "getActive", "setActive", "id", "J", "getId", "()J", "setId", "(J)V", "backColor", "I", "getBackColor", "()I", "setBackColor", "(I)V", "lastName", "getLastName", "setLastName", "textColor", "getTextColor", "setTextColor", "end", "getEnd", "setEnd", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/t;Lorg/joda/time/t;IIZZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Teacher implements Parcelable, DisplayableEntity
{
    @e
    public static final CREATOR CREATOR;
    private boolean active;
    private int backColor;
    private boolean displayable;
    @e
    private t end;
    @e
    private String firstName;
    private long id;
    @e
    private String lastName;
    @e
    private String name;
    @e
    private t start;
    private int textColor;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Teacher() {
        this(0L, null, null, null, null, null, 0, 0, false, false, 1023, null);
    }
    
    public Teacher(final long id, @e final String name, @e final String firstName, @e final String lastName, @e final t start, @e final t end, final int textColor, final int backColor, final boolean active, final boolean displayable) {
        k0.p(name, "name");
        k0.p(firstName, "firstName");
        k0.p(lastName, "lastName");
        k0.p(start, "start");
        k0.p(end, "end");
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.start = start;
        this.end = end;
        this.textColor = textColor;
        this.backColor = backColor;
        this.active = active;
        this.displayable = displayable;
    }
    
    public Teacher(@e final Parcel parcel) {
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
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        final t c0 = t.c0(parcel.readString());
        k0.o(c0, "parse(parcel.readString())");
        final t c2 = t.c0(parcel.readString());
        k0.o(c2, "parse(parcel.readString())");
        this(long1, string, string2, string3, c0, c2, parcel.readInt(), parcel.readInt(), parcel.readByte() != 0, parcel.readByte() != 0);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long entityId() {
        return this.id;
    }
    
    @e
    public EntityType entityType() {
        return EntityType.TEACHER;
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
        if (!k0.g(Teacher.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.masterdata.Teacher");
        return this.id == ((Teacher)obj).id;
    }
    
    public final boolean getActive() {
        return this.active;
    }
    
    public final int getBackColor() {
        return this.backColor;
    }
    
    @e
    public final String getDisplayName() {
        String obj;
        if (!(s.U1((CharSequence)this.firstName) ^ true) && !(s.U1((CharSequence)this.lastName) ^ true)) {
            obj = this.name;
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.firstName);
            sb.append(' ');
            sb.append(this.lastName);
            obj = sb.toString();
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        return s.B5((CharSequence)obj).toString();
    }
    
    public final boolean getDisplayable() {
        return this.displayable;
    }
    
    public int getDisplayableBackColor() {
        return this.backColor;
    }
    
    @e
    public String getDisplayableDescription() {
        return this.getDisplayName();
    }
    
    public int getDisplayableTextColor() {
        return this.textColor;
    }
    
    @e
    public String getDisplayableTitle() {
        return this.name;
    }
    
    @e
    public final t getEnd() {
        return this.end;
    }
    
    @e
    public final String getFirstName() {
        return this.firstName;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getLastName() {
        return this.lastName;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final t getStart() {
        return this.start;
    }
    
    public final int getTextColor() {
        return this.textColor;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setActive(final boolean active) {
        this.active = active;
    }
    
    public final void setBackColor(final int backColor) {
        this.backColor = backColor;
    }
    
    public final void setDisplayable(final boolean displayable) {
        this.displayable = displayable;
    }
    
    public final void setEnd(@e final t end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setFirstName(@e final String firstName) {
        k0.p(firstName, "<set-?>");
        this.firstName = firstName;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setLastName(@e final String lastName) {
        k0.p(lastName, "<set-?>");
        this.lastName = lastName;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setStart(@e final t start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setTextColor(final int textColor) {
        this.textColor = textColor;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.start.toString());
        parcel.writeString(this.end.toString());
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.backColor);
        parcel.writeByte((byte)(byte)(this.active ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.displayable ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Teacher$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Teacher>
    {
        private CREATOR() {
        }
        
        @e
        public Teacher createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Teacher(parcel);
        }
        
        @e
        public Teacher[] newArray(final int n) {
            return new Teacher[n];
        }
    }
}
