// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.masterdata;

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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b-\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001CBa\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0017\u0012\b\b\u0002\u0010%\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\b\u0002\u00107\u001a\u00020\u0007\u0012\b\b\u0002\u00104\u001a\u00020\u0007\u0012\b\b\u0002\u0010:\u001a\u00020\u0007\u0012\b\b\u0002\u0010=\u001a\u00020\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0005¢\u0006\u0004\b@\u0010AB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b@\u0010BJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010(\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010:\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010/\u001a\u0004\b;\u00101\"\u0004\b<\u00103R\"\u0010=\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010)\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-¨\u0006D" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "", "other", "", "equals", "", "hashCode", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "getDisplayName", "getDisplayableTitle", "getDisplayableDescription", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "longName", "Ljava/lang/String;", "getLongName", "()Ljava/lang/String;", "setLongName", "(Ljava/lang/String;)V", "id", "J", "getId", "()J", "setId", "(J)V", "name", "getName", "setName", "displayable", "Z", "getDisplayable", "()Z", "setDisplayable", "(Z)V", "textColor", "I", "getTextColor", "()I", "setTextColor", "(I)V", "customTextColor", "getCustomTextColor", "setCustomTextColor", "backColor", "getBackColor", "setBackColor", "customBackColor", "getCustomBackColor", "setCustomBackColor", "active", "getActive", "setActive", "<init>", "(JLjava/lang/String;Ljava/lang/String;IIIIZZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Subject implements Parcelable, DisplayableEntity
{
    @e
    public static final CREATOR CREATOR;
    private boolean active;
    private int backColor;
    private int customBackColor;
    private int customTextColor;
    private boolean displayable;
    private long id;
    @e
    private String longName;
    @e
    private String name;
    private int textColor;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Subject() {
        this(0L, null, null, 0, 0, 0, 0, false, false, 511, null);
    }
    
    public Subject(final long id, @e final String name, @e final String longName, final int textColor, final int backColor, final int customTextColor, final int customBackColor, final boolean active, final boolean displayable) {
        k0.p(name, "name");
        k0.p(longName, "longName");
        this.id = id;
        this.name = name;
        this.longName = longName;
        this.textColor = textColor;
        this.backColor = backColor;
        this.customTextColor = customTextColor;
        this.customBackColor = customBackColor;
        this.active = active;
        this.displayable = displayable;
    }
    
    public Subject(@e final Parcel parcel) {
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
        this(long1, string, string2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readByte() != 0, parcel.readByte() != 0);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long entityId() {
        return this.id;
    }
    
    @e
    public EntityType entityType() {
        return EntityType.SUBJECT;
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
        if (!k0.g(Subject.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.masterdata.Subject");
        return this.id == ((Subject)obj).id;
    }
    
    public final boolean getActive() {
        return this.active;
    }
    
    public final int getBackColor() {
        return this.backColor;
    }
    
    public final int getCustomBackColor() {
        return this.customBackColor;
    }
    
    public final int getCustomTextColor() {
        return this.customTextColor;
    }
    
    @e
    public final String getDisplayName() {
        String s;
        if (this.longName.length() > 0) {
            s = this.longName;
        }
        else {
            s = this.name;
        }
        return s;
    }
    
    public final boolean getDisplayable() {
        return this.displayable;
    }
    
    public int getDisplayableBackColor() {
        int n = this.customBackColor;
        if (n == 0) {
            n = this.backColor;
        }
        return n;
    }
    
    @e
    public String getDisplayableDescription() {
        return this.getDisplayName();
    }
    
    public int getDisplayableTextColor() {
        int n = this.customTextColor;
        if (n == 0) {
            n = this.textColor;
        }
        return n;
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
    
    public final void setCustomBackColor(final int customBackColor) {
        this.customBackColor = customBackColor;
    }
    
    public final void setCustomTextColor(final int customTextColor) {
        this.customTextColor = customTextColor;
    }
    
    public final void setDisplayable(final boolean displayable) {
        this.displayable = displayable;
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
    
    public final void setTextColor(final int textColor) {
        this.textColor = textColor;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.longName);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.backColor);
        parcel.writeInt(this.customTextColor);
        parcel.writeInt(this.customBackColor);
        parcel.writeByte((byte)(byte)(this.active ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.displayable ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Subject$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/masterdata/Subject;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Subject>
    {
        private CREATOR() {
        }
        
        @e
        public Subject createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Subject(parcel);
        }
        
        @e
        public Subject[] newArray(final int n) {
            return new Subject[n];
        }
    }
}
