// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable;

import android.os.Parcelable$Creator;
import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 02\u00020\u0001:\u00010BC\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "timestamp", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "entityId", "getEntityId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "counter", "I", "getCounter", "()I", "setCounter", "(I)V", "favorite", "Z", "getFavorite", "()Z", "setFavorite", "(Z)V", "<init>", "(Lcom/untis/mobile/persistence/models/EntityType;JZIJLjava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeTableEntity implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    private int counter;
    private final long entityId;
    @e
    private final EntityType entityType;
    private boolean favorite;
    @e
    private final String id;
    private long timestamp;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public TimeTableEntity() {
        this(null, 0L, false, 0, 0L, null, 63, null);
    }
    
    public TimeTableEntity(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(EntityType.Companion.findBy(parcel.readInt()), parcel.readLong(), parcel.readByte() != 0, parcel.readInt(), parcel.readLong(), null, 32, null);
    }
    
    public TimeTableEntity(@e final EntityType entityType, final long entityId, final boolean favorite, final int counter, final long timestamp, @e final String id) {
        k0.p(entityType, "entityType");
        k0.p(id, "id");
        this.entityType = entityType;
        this.entityId = entityId;
        this.favorite = favorite;
        this.counter = counter;
        this.timestamp = timestamp;
        this.id = id;
    }
    
    public int describeContents() {
        return 0;
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
        if (!k0.g(TimeTableEntity.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timetable.TimeTableEntity");
        return k0.g(this.id, ((TimeTableEntity)obj).id);
    }
    
    public final int getCounter() {
        return this.counter;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    public final boolean getFavorite() {
        return this.favorite;
    }
    
    @e
    public final String getId() {
        return this.id;
    }
    
    public final long getTimestamp() {
        return this.timestamp;
    }
    
    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    
    public final void setCounter(final int counter) {
        this.counter = counter;
    }
    
    public final void setFavorite(final boolean favorite) {
        this.favorite = favorite;
    }
    
    public final void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.entityId);
        parcel.writeByte((byte)(byte)(this.favorite ? 1 : 0));
        parcel.writeInt(this.counter);
        parcel.writeLong(this.timestamp);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<TimeTableEntity>
    {
        private CREATOR() {
        }
        
        @e
        public TimeTableEntity createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new TimeTableEntity(parcel);
        }
        
        @e
        public TimeTableEntity[] newArray(final int n) {
            return new TimeTableEntity[n];
        }
    }
}
