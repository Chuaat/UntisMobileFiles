// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period;

import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006#" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "", "originalId", "J", "getOriginalId", "()J", "setOriginalId", "(J)V", "currentId", "getCurrentId", "setCurrentId", "<init>", "(Lcom/untis/mobile/persistence/models/EntityType;JJ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodElement implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    private long currentId;
    @e
    private EntityType entityType;
    private long originalId;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public PeriodElement() {
        this(null, 0L, 0L, 7, null);
    }
    
    public PeriodElement(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(EntityType.Companion.findBy(parcel.readInt()), parcel.readLong(), parcel.readLong());
    }
    
    public PeriodElement(@e final EntityType entityType, final long originalId, final long currentId) {
        k0.p(entityType, "entityType");
        this.entityType = entityType;
        this.originalId = originalId;
        this.currentId = currentId;
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
        if (!k0.g(PeriodElement.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timetable.period.PeriodElement");
        final PeriodElement periodElement = (PeriodElement)obj;
        return this.entityType == periodElement.entityType && this.originalId == periodElement.originalId && this.currentId == periodElement.currentId;
    }
    
    public final long getCurrentId() {
        return this.currentId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    public final long getOriginalId() {
        return this.originalId;
    }
    
    @Override
    public int hashCode() {
        return (this.entityType.hashCode() * 31 + a.a(this.originalId)) * 31 + a.a(this.currentId);
    }
    
    public final void setCurrentId(final long currentId) {
        this.currentId = currentId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setOriginalId(final long originalId) {
        this.originalId = originalId;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.originalId);
        parcel.writeLong(this.currentId);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<PeriodElement>
    {
        private CREATOR() {
        }
        
        @e
        public PeriodElement createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new PeriodElement(parcel);
        }
        
        @e
        public PeriodElement[] newArray(final int n) {
            return new PeriodElement[n];
        }
    }
}
