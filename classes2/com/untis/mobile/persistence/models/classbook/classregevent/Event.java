// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.classregevent;

import org.joda.time.base.g;
import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 @2\u00020\u0001:\u0001@BY\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u00103\u001a\u00020\u001c\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010*\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u00107\u001a\u000206\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010-\u001a\u00020\n¢\u0006\u0004\b=\u0010>B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b=\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006A" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "eventReason", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "getEventReason", "()Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "setEventReason", "(Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;)V", "Lorg/joda/time/c;", "dateTime", "Lorg/joda/time/c;", "getDateTime", "()Lorg/joda/time/c;", "setDateTime", "(Lorg/joda/time/c;)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "entityId", "getEntityId", "setEntityId", "synced", "Z", "getSynced", "()Z", "setSynced", "(Z)V", "periodId", "getPeriodId", "setPeriodId", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "<init>", "(JJLcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/c;Ljava/lang/String;Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Event implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private c dateTime;
    private long entityId;
    @e
    private EntityType entityType;
    @f
    private EventReason eventReason;
    private long id;
    private long periodId;
    private boolean synced;
    @e
    private String text;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Event() {
        this(0L, 0L, null, 0L, null, null, null, false, 255, null);
    }
    
    public Event(final long id, final long periodId, @e final EntityType entityType, final long entityId, @e final c dateTime, @e final String text, @f final EventReason eventReason, final boolean synced) {
        k0.p(entityType, "entityType");
        k0.p(dateTime, "dateTime");
        k0.p(text, "text");
        this.id = id;
        this.periodId = periodId;
        this.entityType = entityType;
        this.entityId = entityId;
        this.dateTime = dateTime;
        this.text = text;
        this.eventReason = eventReason;
        this.synced = synced;
    }
    
    public Event(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final long long2 = parcel.readLong();
        final EntityType by = EntityType.Companion.findBy(parcel.readInt());
        final long long3 = parcel.readLong();
        final c c = new c(parcel.readLong());
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        this(long1, long2, by, long3, c, string, (EventReason)parcel.readParcelable(EventReason.class.getClassLoader()), parcel.readByte() != 0);
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
        if (!k0.g(Event.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.classregevent.Event");
        return this.id == ((Event)obj).id;
    }
    
    @e
    public final c getDateTime() {
        return this.dateTime;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    @f
    public final EventReason getEventReason() {
        return this.eventReason;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getPeriodId() {
        return this.periodId;
    }
    
    public final boolean getSynced() {
        return this.synced;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setDateTime(@e final c dateTime) {
        k0.p(dateTime, "<set-?>");
        this.dateTime = dateTime;
    }
    
    public final void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setEventReason(@f final EventReason eventReason) {
        this.eventReason = eventReason;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setPeriodId(final long periodId) {
        this.periodId = periodId;
    }
    
    public final void setSynced(final boolean synced) {
        this.synced = synced;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeLong(this.periodId);
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.entityId);
        parcel.writeLong(((g)this.dateTime).n());
        parcel.writeString(this.text);
        parcel.writeParcelable((Parcelable)this.eventReason, n);
        parcel.writeByte((byte)(byte)(this.synced ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Event>
    {
        private CREATOR() {
        }
        
        @e
        public Event createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Event(parcel);
        }
        
        @e
        public Event[] newArray(final int n) {
            return new Event[n];
        }
    }
}
