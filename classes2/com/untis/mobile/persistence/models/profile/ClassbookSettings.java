// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import android.os.Parcelable$Creator;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import org.jetbrains.annotations.f;
import org.joda.time.v;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 12\u00020\u0001:\u00011BS\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b.\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000f¨\u00062" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "defaultLatenessReason", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "getDefaultLatenessReason", "()Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "setDefaultLatenessReason", "(Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;)V", "", "showAbsenceReason", "Z", "getShowAbsenceReason", "()Z", "setShowAbsenceReason", "(Z)V", "showAbsenceText", "getShowAbsenceText", "setShowAbsenceText", "Lorg/joda/time/v;", "customAbsenceEndTime", "Lorg/joda/time/v;", "getCustomAbsenceEndTime", "()Lorg/joda/time/v;", "setCustomAbsenceEndTime", "(Lorg/joda/time/v;)V", "absenceCheckRequired", "getAbsenceCheckRequired", "setAbsenceCheckRequired", "Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;", "defaultAbsenceEndTime", "Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;", "getDefaultAbsenceEndTime", "()Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;", "setDefaultAbsenceEndTime", "(Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;)V", "defaultAbsenceReason", "getDefaultAbsenceReason", "setDefaultAbsenceReason", "<init>", "(ZZZLcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;Lorg/joda/time/v;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ClassbookSettings implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    private boolean absenceCheckRequired;
    @f
    private v customAbsenceEndTime;
    @e
    private AbsenceEndTime defaultAbsenceEndTime;
    @f
    private AbsenceReason defaultAbsenceReason;
    @f
    private AbsenceReason defaultLatenessReason;
    private boolean showAbsenceReason;
    private boolean showAbsenceText;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public ClassbookSettings() {
        this(false, false, false, null, null, null, null, 127, null);
    }
    
    public ClassbookSettings(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final boolean b = parcel.readByte() != 0;
        final boolean b2 = parcel.readByte() != 0;
        final boolean b3 = parcel.readByte() != 0;
        final AbsenceReason absenceReason = (AbsenceReason)parcel.readParcelable(AbsenceReason.class.getClassLoader());
        final AbsenceReason absenceReason2 = (AbsenceReason)parcel.readParcelable(AbsenceReason.class.getClassLoader());
        final AbsenceEndTime fromValue = AbsenceEndTime.Companion.fromValue(parcel.readInt());
        final CREATOR creator = ClassbookSettings.CREATOR;
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        this(b, b2, b3, absenceReason, absenceReason2, fromValue, creator.customAbsenceEndTimeOrNull(string));
    }
    
    public ClassbookSettings(final boolean showAbsenceReason, final boolean showAbsenceText, final boolean absenceCheckRequired, @f final AbsenceReason defaultAbsenceReason, @f final AbsenceReason defaultLatenessReason, @e final AbsenceEndTime defaultAbsenceEndTime, @f final v customAbsenceEndTime) {
        k0.p(defaultAbsenceEndTime, "defaultAbsenceEndTime");
        this.showAbsenceReason = showAbsenceReason;
        this.showAbsenceText = showAbsenceText;
        this.absenceCheckRequired = absenceCheckRequired;
        this.defaultAbsenceReason = defaultAbsenceReason;
        this.defaultLatenessReason = defaultLatenessReason;
        this.defaultAbsenceEndTime = defaultAbsenceEndTime;
        this.customAbsenceEndTime = customAbsenceEndTime;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final boolean getAbsenceCheckRequired() {
        return this.absenceCheckRequired;
    }
    
    @f
    public final v getCustomAbsenceEndTime() {
        return this.customAbsenceEndTime;
    }
    
    @e
    public final AbsenceEndTime getDefaultAbsenceEndTime() {
        return this.defaultAbsenceEndTime;
    }
    
    @f
    public final AbsenceReason getDefaultAbsenceReason() {
        return this.defaultAbsenceReason;
    }
    
    @f
    public final AbsenceReason getDefaultLatenessReason() {
        return this.defaultLatenessReason;
    }
    
    public final boolean getShowAbsenceReason() {
        return this.showAbsenceReason;
    }
    
    public final boolean getShowAbsenceText() {
        return this.showAbsenceText;
    }
    
    public final void setAbsenceCheckRequired(final boolean absenceCheckRequired) {
        this.absenceCheckRequired = absenceCheckRequired;
    }
    
    public final void setCustomAbsenceEndTime(@f final v customAbsenceEndTime) {
        this.customAbsenceEndTime = customAbsenceEndTime;
    }
    
    public final void setDefaultAbsenceEndTime(@e final AbsenceEndTime defaultAbsenceEndTime) {
        k0.p(defaultAbsenceEndTime, "<set-?>");
        this.defaultAbsenceEndTime = defaultAbsenceEndTime;
    }
    
    public final void setDefaultAbsenceReason(@f final AbsenceReason defaultAbsenceReason) {
        this.defaultAbsenceReason = defaultAbsenceReason;
    }
    
    public final void setDefaultLatenessReason(@f final AbsenceReason defaultLatenessReason) {
        this.defaultLatenessReason = defaultLatenessReason;
    }
    
    public final void setShowAbsenceReason(final boolean showAbsenceReason) {
        this.showAbsenceReason = showAbsenceReason;
    }
    
    public final void setShowAbsenceText(final boolean showAbsenceText) {
        this.showAbsenceText = showAbsenceText;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeByte((byte)(byte)(this.showAbsenceReason ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.showAbsenceText ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.absenceCheckRequired ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.defaultAbsenceReason, n);
        parcel.writeParcelable((Parcelable)this.defaultLatenessReason, n);
        parcel.writeInt(this.defaultAbsenceEndTime.getValue());
        final v customAbsenceEndTime = this.customAbsenceEndTime;
        String s = "";
        if (customAbsenceEndTime != null) {
            final String string = customAbsenceEndTime.toString();
            if (string != null) {
                s = string;
            }
        }
        parcel.writeString(s);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "", "readString", "Lorg/joda/time/v;", "customAbsenceEndTimeOrNull", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<ClassbookSettings>
    {
        private CREATOR() {
        }
        
        private final v customAbsenceEndTimeOrNull(final String s) {
            if (s.length() > 0) {
                return v.c0(s);
            }
            return null;
        }
        
        @e
        public ClassbookSettings createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new ClassbookSettings(parcel);
        }
        
        @e
        public ClassbookSettings[] newArray(final int n) {
            return new ClassbookSettings[n];
        }
    }
}
