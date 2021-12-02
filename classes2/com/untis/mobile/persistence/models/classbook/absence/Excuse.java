// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.absence;

import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 02\u00020\u0001:\u00010B;\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010*\u001a\u00020#\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)¨\u00061" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "Lorg/joda/time/t;", "date", "Lorg/joda/time/t;", "getDate", "()Lorg/joda/time/t;", "setDate", "(Lorg/joda/time/t;)V", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "excuseStatus", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "getExcuseStatus", "()Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "setExcuseStatus", "(Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;)V", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "number", "getNumber", "setNumber", "<init>", "(JLcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;Ljava/lang/String;JLorg/joda/time/t;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Excuse implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private t date;
    @f
    private ExcuseStatus excuseStatus;
    private long id;
    private long number;
    @e
    private String text;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Excuse() {
        this(0L, null, null, 0L, null, 31, null);
    }
    
    public Excuse(final long id, @f final ExcuseStatus excuseStatus, @e final String text, final long number, @e final t date) {
        k0.p(text, "text");
        k0.p(date, "date");
        this.id = id;
        this.excuseStatus = excuseStatus;
        this.text = text;
        this.number = number;
        this.date = date;
    }
    
    public Excuse(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final ExcuseStatus excuseStatus = (ExcuseStatus)parcel.readParcelable(ExcuseStatus.class.getClassLoader());
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        final long long2 = parcel.readLong();
        final t c0 = t.c0(parcel.readString());
        k0.o(c0, "parse(parcel.readString())");
        this(long1, excuseStatus, string, long2, c0);
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
        if (!k0.g(Excuse.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.absence.Excuse");
        return this.id == ((Excuse)obj).id;
    }
    
    @e
    public final t getDate() {
        return this.date;
    }
    
    @f
    public final ExcuseStatus getExcuseStatus() {
        return this.excuseStatus;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getNumber() {
        return this.number;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setDate(@e final t date) {
        k0.p(date, "<set-?>");
        this.date = date;
    }
    
    public final void setExcuseStatus(@f final ExcuseStatus excuseStatus) {
        this.excuseStatus = excuseStatus;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setNumber(final long number) {
        this.number = number;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeParcelable((Parcelable)this.excuseStatus, n);
        parcel.writeString(this.text);
        parcel.writeLong(this.number);
        parcel.writeString(this.date.toString());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/Excuse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Excuse>
    {
        private CREATOR() {
        }
        
        @e
        public Excuse createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Excuse(parcel);
        }
        
        @e
        public Excuse[] newArray(final int n) {
            return new Excuse[n];
        }
    }
}
