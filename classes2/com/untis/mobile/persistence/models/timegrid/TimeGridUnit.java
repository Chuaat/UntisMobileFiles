// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timegrid;

import android.os.Parcelable$Creator;
import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import org.joda.time.v;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#" }, d2 = { "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "Lorg/joda/time/v;", "start", "Lorg/joda/time/v;", "getStart", "()Lorg/joda/time/v;", "setStart", "(Lorg/joda/time/v;)V", "end", "getEnd", "setEnd", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Lorg/joda/time/v;Lorg/joda/time/v;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class TimeGridUnit implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private v end;
    @e
    private String label;
    @e
    private v start;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public TimeGridUnit() {
        this(null, null, null, 7, null);
    }
    
    public TimeGridUnit(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        final v c0 = v.c0(parcel.readString());
        k0.o(c0, "parse(parcel.readString())");
        final v c2 = v.c0(parcel.readString());
        k0.o(c2, "parse(parcel.readString())");
        this(string, c0, c2);
    }
    
    public TimeGridUnit(@e final String label, @e final v start, @e final v end) {
        k0.p(label, "label");
        k0.p(start, "start");
        k0.p(end, "end");
        this.label = label;
        this.start = start;
        this.end = end;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        if (this == obj) {
            return true;
        }
        final Class<? extends TimeGridUnit> class1 = this.getClass();
        Object class2;
        if (obj == null) {
            class2 = null;
        }
        else {
            class2 = obj.getClass();
        }
        if (!k0.g(class1, class2)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timegrid.TimeGridUnit");
        final TimeGridUnit timeGridUnit = (TimeGridUnit)obj;
        return k0.g(this.label, timeGridUnit.label) && k0.g(this.start, timeGridUnit.start) && k0.g(this.end, timeGridUnit.end);
    }
    
    @e
    public final v getEnd() {
        return this.end;
    }
    
    @e
    public final String getLabel() {
        return this.label;
    }
    
    @e
    public final v getStart() {
        return this.start;
    }
    
    @Override
    public int hashCode() {
        return (this.label.hashCode() * 31 + ((org.joda.time.base.e)this.start).hashCode()) * 31 + ((org.joda.time.base.e)this.end).hashCode();
    }
    
    public final void setEnd(@e final v end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setLabel(@e final String label) {
        k0.p(label, "<set-?>");
        this.label = label;
    }
    
    public final void setStart(@e final v start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(this.label);
        parcel.writeString(this.start.toString());
        parcel.writeString(this.end.toString());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<TimeGridUnit>
    {
        private CREATOR() {
        }
        
        @e
        public TimeGridUnit createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new TimeGridUnit(parcel);
        }
        
        @e
        public TimeGridUnit[] newArray(final int n) {
            return new TimeGridUnit[n];
        }
    }
}
