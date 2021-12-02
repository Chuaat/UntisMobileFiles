// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u0000 02\u00020\u0001:\u00010B?\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010'\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061" }, d2 = { "Lcom/untis/mobile/persistence/models/MessageOfDay;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "subject", "Ljava/lang/String;", "getSubject", "()Ljava/lang/String;", "setSubject", "(Ljava/lang/String;)V", "text", "getText", "setText", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "driveAttachments", "Ljava/util/List;", "getDriveAttachments", "()Ljava/util/List;", "setDriveAttachments", "(Ljava/util/List;)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "read", "Z", "getRead", "()Z", "setRead", "(Z)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageOfDay implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private List<DriveAttachment> driveAttachments;
    private long id;
    private boolean read;
    @e
    private String subject;
    @e
    private String text;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public MessageOfDay() {
        this(0L, null, null, null, false, 31, null);
    }
    
    public MessageOfDay(final long id, @e final String subject, @e final String text, @e final List<DriveAttachment> driveAttachments, final boolean read) {
        k0.p(subject, "subject");
        k0.p(text, "text");
        k0.p(driveAttachments, "driveAttachments");
        this.id = id;
        this.subject = subject;
        this.text = text;
        this.driveAttachments = driveAttachments;
        this.read = read;
    }
    
    public MessageOfDay(@e final Parcel parcel) {
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
        ArrayList typedArrayList;
        if ((typedArrayList = parcel.createTypedArrayList((Parcelable$Creator)DriveAttachment.CREATOR)) == null) {
            typedArrayList = new ArrayList();
        }
        this(long1, string, string2, typedArrayList, false, 16, null);
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
        if (!k0.g(MessageOfDay.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.MessageOfDay");
        return this.id == ((MessageOfDay)obj).id;
    }
    
    @e
    public final List<DriveAttachment> getDriveAttachments() {
        return this.driveAttachments;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final boolean getRead() {
        return this.read;
    }
    
    @e
    public final String getSubject() {
        return this.subject;
    }
    
    @e
    public final String getText() {
        return this.text;
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
    
    public final void setRead(final boolean read) {
        this.read = read;
    }
    
    public final void setSubject(@e final String subject) {
        k0.p(subject, "<set-?>");
        this.subject = subject;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.subject);
        parcel.writeString(this.text);
        parcel.writeTypedList((List)this.driveAttachments);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/MessageOfDay$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/MessageOfDay;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<MessageOfDay>
    {
        private CREATOR() {
        }
        
        @e
        public MessageOfDay createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new MessageOfDay(parcel);
        }
        
        @e
        public MessageOfDay[] newArray(final int n) {
            return new MessageOfDay[n];
        }
    }
}
