// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.lessontopic;

import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.joda.time.c;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 72\u00020\u0001:\u00017BI\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010)\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b4\u00105B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00106J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR(\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00068" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "synced", "Z", "getSynced", "()Z", "setSynced", "(Z)V", "Lorg/joda/time/c;", "end", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "", "periodId", "J", "getPeriodId", "()J", "setPeriodId", "(J)V", "start", "getStart", "setStart", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "attachments", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "setAttachments", "(Ljava/util/List;)V", "<init>", "(JLjava/lang/String;Lorg/joda/time/c;Lorg/joda/time/c;Ljava/util/List;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class LessonTopic implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private List<DriveAttachment> attachments;
    @e
    private c end;
    private long periodId;
    @e
    private c start;
    private boolean synced;
    @e
    private String text;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public LessonTopic() {
        this(0L, null, null, null, null, false, 63, null);
    }
    
    public LessonTopic(final long periodId, @e final String text, @e final c start, @e final c end, @e final List<DriveAttachment> attachments, final boolean synced) {
        k0.p(text, "text");
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(attachments, "attachments");
        this.periodId = periodId;
        this.text = text;
        this.start = start;
        this.end = end;
        this.attachments = attachments;
        this.synced = synced;
    }
    
    public LessonTopic(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        ArrayList<DriveAttachment> typedArrayList;
        if ((typedArrayList = (ArrayList<DriveAttachment>)parcel.createTypedArrayList((Parcelable$Creator)DriveAttachment.CREATOR)) == null) {
            typedArrayList = new ArrayList<DriveAttachment>();
        }
        this(long1, string, k0, k2, typedArrayList, parcel.readByte() != 0);
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
        if (!k0.g(LessonTopic.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic");
        return this.periodId == ((LessonTopic)obj).periodId;
    }
    
    @e
    public final List<DriveAttachment> getAttachments() {
        return this.attachments;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getPeriodId() {
        return this.periodId;
    }
    
    @e
    public final c getStart() {
        return this.start;
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
        return a.a(this.periodId);
    }
    
    public final void setAttachments(@e final List<DriveAttachment> attachments) {
        k0.p(attachments, "<set-?>");
        this.attachments = attachments;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setPeriodId(final long periodId) {
        this.periodId = periodId;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
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
        parcel.writeLong(this.periodId);
        parcel.writeString(this.text);
        parcel.writeString(((org.joda.time.base.a)this.start).toString());
        parcel.writeString(((org.joda.time.base.a)this.end).toString());
        parcel.writeTypedList((List)this.attachments);
        parcel.writeByte((byte)(byte)(this.synced ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<LessonTopic>
    {
        private CREATOR() {
        }
        
        @e
        public LessonTopic createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new LessonTopic(parcel);
        }
        
        @e
        public LessonTopic[] newArray(final int n) {
            return new LessonTopic[n];
        }
    }
}
