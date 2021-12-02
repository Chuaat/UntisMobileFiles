// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.duty;

import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B/\u0012\b\b\u0002\u0010!\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000f\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b.\u00100J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00062" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "", "other", "", "equals", "", "hashCode", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "getDisplayableTitle", "getDisplayableDescription", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "longName", "getLongName", "setLongName", "id", "J", "getId", "()J", "setId", "(J)V", "Lcom/untis/mobile/persistence/models/classbook/duty/DutyType;", "type", "Lcom/untis/mobile/persistence/models/classbook/duty/DutyType;", "getType", "()Lcom/untis/mobile/persistence/models/classbook/duty/DutyType;", "setType", "(Lcom/untis/mobile/persistence/models/classbook/duty/DutyType;)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/untis/mobile/persistence/models/classbook/duty/DutyType;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Duty implements Parcelable, DisplayableEntity
{
    @e
    public static final CREATOR CREATOR;
    private long id;
    @e
    private String longName;
    @e
    private String name;
    @e
    private DutyType type;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Duty() {
        this(0L, null, null, null, 15, null);
    }
    
    public Duty(final long id, @e final String name, @e final String longName, @e final DutyType type) {
        k0.p(name, "name");
        k0.p(longName, "longName");
        k0.p(type, "type");
        this.id = id;
        this.name = name;
        this.longName = longName;
        this.type = type;
    }
    
    public Duty(@e final Parcel parcel) {
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
        this(long1, string, string2, DutyType.Companion.fromValue(parcel.readInt()));
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long entityId() {
        return this.id;
    }
    
    @e
    public EntityType entityType() {
        return EntityType.DUTY;
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
        if (!k0.g(Duty.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.duty.Duty");
        return this.id == ((Duty)obj).id;
    }
    
    public int getDisplayableBackColor() {
        return 0;
    }
    
    @e
    public String getDisplayableDescription() {
        if (this.longName.length() == 0) {
            return this.name;
        }
        return this.longName;
    }
    
    public int getDisplayableTextColor() {
        return 0;
    }
    
    @e
    public String getDisplayableTitle() {
        return this.name;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getLongName() {
        return this.longName;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final DutyType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setLongName(@e final String longName) {
        k0.p(longName, "<set-?>");
        this.longName = longName;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setType(@e final DutyType type) {
        k0.p(type, "<set-?>");
        this.type = type;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.longName);
        parcel.writeInt(this.type.getValue());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/duty/Duty$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Duty>
    {
        private CREATOR() {
        }
        
        @e
        public Duty createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Duty(parcel);
        }
        
        @e
        public Duty[] newArray(final int n) {
            return new Duty[n];
        }
    }
}
