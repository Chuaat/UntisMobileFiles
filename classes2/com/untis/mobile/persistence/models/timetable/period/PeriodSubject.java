// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period;

import android.os.Parcelable$Creator;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Subject;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodSubject;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "current", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "getCurrent", "()Lcom/untis/mobile/persistence/models/masterdata/Subject;", "setCurrent", "(Lcom/untis/mobile/persistence/models/masterdata/Subject;)V", "original", "getOriginal", "setOriginal", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Subject;Lcom/untis/mobile/persistence/models/masterdata/Subject;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodSubject implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @f
    private Subject current;
    @f
    private Subject original;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public PeriodSubject() {
        this(null, null, 3, null);
    }
    
    public PeriodSubject(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this((Subject)parcel.readParcelable(Subject.class.getClassLoader()), (Subject)parcel.readParcelable(Subject.class.getClassLoader()));
    }
    
    public PeriodSubject(@f final Subject current, @f final Subject original) {
        this.current = current;
        this.original = original;
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
        if (!k0.g(PeriodSubject.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timetable.period.PeriodSubject");
        final PeriodSubject periodSubject = (PeriodSubject)obj;
        return k0.g(this.current, periodSubject.current) && k0.g(this.original, periodSubject.original);
    }
    
    @f
    public final Subject getCurrent() {
        return this.current;
    }
    
    @f
    public final Subject getOriginal() {
        return this.original;
    }
    
    @Override
    public int hashCode() {
        final Subject current = this.current;
        int hashCode = 0;
        int hashCode2;
        if (current == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = current.hashCode();
        }
        final Subject original = this.original;
        if (original != null) {
            hashCode = original.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final void setCurrent(@f final Subject current) {
        this.current = current;
    }
    
    public final void setOriginal(@f final Subject original) {
        this.original = original;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeParcelable((Parcelable)this.current, n);
        parcel.writeParcelable((Parcelable)this.original, n);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodSubject$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodSubject;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timetable/period/PeriodSubject;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<PeriodSubject>
    {
        private CREATOR() {
        }
        
        @e
        public PeriodSubject createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new PeriodSubject(parcel);
        }
        
        @e
        public PeriodSubject[] newArray(final int n) {
            return new PeriodSubject[n];
        }
    }
}
