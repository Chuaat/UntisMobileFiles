// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.info;

import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 62\u00020\u0001:\u00016BS\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u00100\u001a\u00020\u000e\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b3\u00104B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b3\u00105J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\"\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0010\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014¨\u00067" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "", "lesson", "Ljava/lang/String;", "getLesson", "()Ljava/lang/String;", "setLesson", "(Ljava/lang/String;)V", "info", "getInfo", "setInfo", "", "id", "J", "getId", "()J", "setId", "(J)V", "substitution", "getSubstitution", "setSubstitution", "sync", "Z", "getSync", "()Z", "setSync", "(Z)V", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "driveAttachments", "Ljava/util/List;", "getDriveAttachments", "()Ljava/util/List;", "setDriveAttachments", "(Ljava/util/List;)V", "local", "getLocal", "setLocal", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodInfo implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private List<DriveAttachment> driveAttachments;
    private long id;
    @e
    private String info;
    @e
    private String lesson;
    @e
    private String local;
    @e
    private String substitution;
    private boolean sync;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public PeriodInfo() {
        this(0L, null, null, null, null, false, null, 127, null);
    }
    
    public PeriodInfo(final long id, @e final String info, @e final String substitution, @e final String lesson, @e final String local, final boolean sync, @e final List<DriveAttachment> driveAttachments) {
        k0.p(info, "info");
        k0.p(substitution, "substitution");
        k0.p(lesson, "lesson");
        k0.p(local, "local");
        k0.p(driveAttachments, "driveAttachments");
        this.id = id;
        this.info = info;
        this.substitution = substitution;
        this.lesson = lesson;
        this.local = local;
        this.sync = sync;
        this.driveAttachments = driveAttachments;
    }
    
    public PeriodInfo(@e final Parcel parcel) {
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
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            string4 = "";
        }
        final boolean b = parcel.readByte() != 0;
        ArrayList<DriveAttachment> typedArrayList;
        if ((typedArrayList = (ArrayList<DriveAttachment>)parcel.createTypedArrayList((Parcelable$Creator)DriveAttachment.CREATOR)) == null) {
            typedArrayList = new ArrayList<DriveAttachment>();
        }
        this(long1, string, string2, string3, string4, b, typedArrayList);
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
        if (!k0.g(PeriodInfo.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.info.PeriodInfo");
        return this.id == ((PeriodInfo)obj).id;
    }
    
    @e
    public final List<DriveAttachment> getDriveAttachments() {
        return this.driveAttachments;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getInfo() {
        return this.info;
    }
    
    @e
    public final String getLesson() {
        return this.lesson;
    }
    
    @e
    public final String getLocal() {
        return this.local;
    }
    
    @e
    public final String getSubstitution() {
        return this.substitution;
    }
    
    public final boolean getSync() {
        return this.sync;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setDriveAttachments(@e final List<DriveAttachment> driveAttachments) {
        k0.p(driveAttachments, "<set-?>");
        this.driveAttachments = driveAttachments;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setInfo(@e final String info) {
        k0.p(info, "<set-?>");
        this.info = info;
    }
    
    public final void setLesson(@e final String lesson) {
        k0.p(lesson, "<set-?>");
        this.lesson = lesson;
    }
    
    public final void setLocal(@e final String local) {
        k0.p(local, "<set-?>");
        this.local = local;
    }
    
    public final void setSubstitution(@e final String substitution) {
        k0.p(substitution, "<set-?>");
        this.substitution = substitution;
    }
    
    public final void setSync(final boolean sync) {
        this.sync = sync;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.info);
        parcel.writeString(this.substitution);
        parcel.writeString(this.lesson);
        parcel.writeString(this.local);
        parcel.writeByte((byte)(byte)(this.sync ? 1 : 0));
        parcel.writeTypedList((List)this.driveAttachments);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<PeriodInfo>
    {
        private CREATOR() {
        }
        
        @e
        public PeriodInfo createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new PeriodInfo(parcel);
        }
        
        @e
        public PeriodInfo[] newArray(final int n) {
            return new PeriodInfo[n];
        }
    }
}
