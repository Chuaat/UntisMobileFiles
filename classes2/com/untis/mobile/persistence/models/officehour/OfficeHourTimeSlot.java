// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.officehour;

import org.joda.time.base.a;
import android.os.Parcelable$Creator;
import org.joda.time.l0;
import org.joda.time.r;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u001a\u001a\u00020\u00178F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006\"" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlot;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "Lorg/joda/time/c;", "start", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState;", "state", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState;", "getState", "()Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState;", "setState", "(Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState;)V", "Lorg/joda/time/r;", "getInterval", "()Lorg/joda/time/r;", "interval", "end", "getEnd", "setEnd", "<init>", "(Lorg/joda/time/c;Lorg/joda/time/c;Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class OfficeHourTimeSlot implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private c end;
    @e
    private c start;
    @e
    private OfficeHourTimeSlotState state;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public OfficeHourTimeSlot() {
        this(null, null, null, 7, null);
    }
    
    public OfficeHourTimeSlot(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        this(k0, k2, OfficeHourTimeSlotState.Companion.fromValue(parcel.readInt()));
    }
    
    public OfficeHourTimeSlot(@e final c start, @e final c end, @e final OfficeHourTimeSlotState state) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(state, "state");
        this.start = start;
        this.end = end;
        this.state = state;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    @e
    public final r getInterval() {
        return new r((l0)this.start, (l0)this.end);
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final OfficeHourTimeSlotState getState() {
        return this.state;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setState(@e final OfficeHourTimeSlotState state) {
        k0.p(state, "<set-?>");
        this.state = state;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(((a)this.start).toString());
        parcel.writeString(((a)this.end).toString());
        parcel.writeInt(this.state.getValue());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlot$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlot;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlot;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<OfficeHourTimeSlot>
    {
        private CREATOR() {
        }
        
        @e
        public OfficeHourTimeSlot createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new OfficeHourTimeSlot(parcel);
        }
        
        @e
        public OfficeHourTimeSlot[] newArray(final int n) {
            return new OfficeHourTimeSlot[n];
        }
    }
}
