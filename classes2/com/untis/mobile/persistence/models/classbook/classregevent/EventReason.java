// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.classregevent;

import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018BC\u0012\b\b\u0002\u00102\u001a\u00020\u0011\u0012\b\b\u0002\u0010)\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010,\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b5\u00106B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b5\u00107J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016R\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\"\u0010,\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101¨\u00069" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "", "getDisplayableTitle", "getDisplayableDescription", "getDisplayableTextColor", "getDisplayableBackColor", "longName", "Ljava/lang/String;", "getLongName", "()Ljava/lang/String;", "setLongName", "(Ljava/lang/String;)V", "active", "Z", "getActive", "()Z", "setActive", "(Z)V", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "name", "getName", "setName", "groupId", "J", "getGroupId", "()J", "setGroupId", "(J)V", "id", "getId", "setId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;JZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class EventReason implements Parcelable, DisplayableEntity
{
    @e
    public static final CREATOR CREATOR;
    private boolean active;
    @e
    private EntityType entityType;
    private long groupId;
    private long id;
    @e
    private String longName;
    @e
    private String name;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public EventReason() {
        this(0L, null, null, null, 0L, false, 63, null);
    }
    
    public EventReason(final long id, @e final String name, @e final String longName, @e final EntityType entityType, final long groupId, final boolean active) {
        k0.p(name, "name");
        k0.p(longName, "longName");
        k0.p(entityType, "entityType");
        this.id = id;
        this.name = name;
        this.longName = longName;
        this.entityType = entityType;
        this.groupId = groupId;
        this.active = active;
    }
    
    public EventReason(@e final Parcel parcel) {
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
        this(long1, string, string2, EntityType.Companion.findBy(parcel.readInt()), parcel.readLong(), parcel.readByte() != 0);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long entityId() {
        return this.id;
    }
    
    @e
    public EntityType entityType() {
        return EntityType.EVENT_REASON;
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
        if (!k0.g(EventReason.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.classregevent.EventReason");
        return this.id == ((EventReason)obj).id;
    }
    
    public final boolean getActive() {
        return this.active;
    }
    
    public int getDisplayableBackColor() {
        return 0;
    }
    
    @e
    public String getDisplayableDescription() {
        String s;
        if (this.longName.length() > 0) {
            s = this.longName;
        }
        else {
            s = this.name;
        }
        return s;
    }
    
    public int getDisplayableTextColor() {
        return 0;
    }
    
    @e
    public String getDisplayableTitle() {
        return this.name;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    public final long getGroupId() {
        return this.groupId;
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
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setActive(final boolean active) {
        this.active = active;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setGroupId(final long groupId) {
        this.groupId = groupId;
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
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.longName);
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.groupId);
        parcel.writeByte((byte)(byte)(this.active ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<EventReason>
    {
        private CREATOR() {
        }
        
        @e
        public EventReason createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new EventReason(parcel);
        }
        
        @e
        public EventReason[] newArray(final int n) {
            return new EventReason[n];
        }
    }
}
