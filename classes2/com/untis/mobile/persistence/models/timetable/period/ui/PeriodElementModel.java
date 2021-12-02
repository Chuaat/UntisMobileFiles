// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period.ui;

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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 52\u00020\u0001:\u00015BM\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010/\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010)\u001a\u00020\"\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b2\u00103B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b2\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000f\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013R\"\u0010/\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!¨\u00066" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "backGround", "I", "getBackGround", "()I", "setBackGround", "(I)V", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "", "originalId", "J", "getOriginalId", "()J", "setOriginalId", "(J)V", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "labelLong", "getLabelLong", "setLabelLong", "textColor", "getTextColor", "setTextColor", "currentId", "getCurrentId", "setCurrentId", "<init>", "(Lcom/untis/mobile/persistence/models/EntityType;JJLjava/lang/String;Ljava/lang/String;II)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodElementModel implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    private int backGround;
    private long currentId;
    @e
    private EntityType entityType;
    @e
    private String label;
    @e
    private String labelLong;
    private long originalId;
    private int textColor;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public PeriodElementModel() {
        this(null, 0L, 0L, null, null, 0, 0, 127, null);
    }
    
    public PeriodElementModel(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final EntityType by = EntityType.Companion.findBy(parcel.readInt());
        final long long1 = parcel.readLong();
        final long long2 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        this(by, long1, long2, string, string2, parcel.readInt(), parcel.readInt());
    }
    
    public PeriodElementModel(@e final EntityType entityType, final long currentId, final long originalId, @e final String label, @e final String labelLong, final int textColor, final int backGround) {
        k0.p(entityType, "entityType");
        k0.p(label, "label");
        k0.p(labelLong, "labelLong");
        this.entityType = entityType;
        this.currentId = currentId;
        this.originalId = originalId;
        this.label = label;
        this.labelLong = labelLong;
        this.textColor = textColor;
        this.backGround = backGround;
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
        if (!k0.g(PeriodElementModel.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel");
        final PeriodElementModel periodElementModel = (PeriodElementModel)obj;
        return this.entityType == periodElementModel.entityType && this.currentId == periodElementModel.currentId && this.originalId == periodElementModel.originalId;
    }
    
    public final int getBackGround() {
        return this.backGround;
    }
    
    public final long getCurrentId() {
        return this.currentId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    @e
    public final String getLabel() {
        return this.label;
    }
    
    @e
    public final String getLabelLong() {
        return this.labelLong;
    }
    
    public final long getOriginalId() {
        return this.originalId;
    }
    
    public final int getTextColor() {
        return this.textColor;
    }
    
    @Override
    public int hashCode() {
        return (this.entityType.hashCode() * 31 + a.a(this.currentId)) * 31 + a.a(this.originalId);
    }
    
    public final void setBackGround(final int backGround) {
        this.backGround = backGround;
    }
    
    public final void setCurrentId(final long currentId) {
        this.currentId = currentId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setLabel(@e final String label) {
        k0.p(label, "<set-?>");
        this.label = label;
    }
    
    public final void setLabelLong(@e final String labelLong) {
        k0.p(labelLong, "<set-?>");
        this.labelLong = labelLong;
    }
    
    public final void setOriginalId(final long originalId) {
        this.originalId = originalId;
    }
    
    public final void setTextColor(final int textColor) {
        this.textColor = textColor;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.currentId);
        parcel.writeLong(this.originalId);
        parcel.writeString(this.label);
        parcel.writeString(this.labelLong);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.backGround);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<PeriodElementModel>
    {
        private CREATOR() {
        }
        
        @e
        public PeriodElementModel createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new PeriodElementModel(parcel);
        }
        
        @e
        public PeriodElementModel[] newArray(final int n) {
            return new PeriodElementModel[n];
        }
    }
}
