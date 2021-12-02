// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.masterdata;

import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 I2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001IBa\u0012\b\b\u0002\u0010'\u001a\u00020\u0018\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\b\b\u0002\u00107\u001a\u000206\u0012\b\b\u0002\u0010=\u001a\u000206\u0012\b\b\u0002\u0010C\u001a\u00020\u0006\u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\b\b\u0002\u0010@\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r¢\u0006\u0004\bF\u0010GB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bF\u0010HJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002R\"\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\"\u0010@\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001c\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\"\u0010C\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00101\u001a\u0004\bD\u00103\"\u0004\bE\u00105¨\u0006J" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "getDisplayName", "getDisplayableTitle", "getDisplayableDescription", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "compareTo", "displayable", "Z", "getDisplayable", "()Z", "setDisplayable", "(Z)V", "longName", "Ljava/lang/String;", "getLongName", "()Ljava/lang/String;", "setLongName", "(Ljava/lang/String;)V", "id", "J", "getId", "()J", "setId", "(J)V", "name", "getName", "setName", "backColor", "I", "getBackColor", "()I", "setBackColor", "(I)V", "Lorg/joda/time/t;", "start", "Lorg/joda/time/t;", "getStart", "()Lorg/joda/time/t;", "setStart", "(Lorg/joda/time/t;)V", "end", "getEnd", "setEnd", "active", "getActive", "setActive", "textColor", "getTextColor", "setTextColor", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lorg/joda/time/t;Lorg/joda/time/t;IIZZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Klasse implements Parcelable, DisplayableEntity, Comparable<Klasse>
{
    @e
    public static final CREATOR CREATOR;
    private boolean active;
    private int backColor;
    private boolean displayable;
    @e
    private t end;
    private long id;
    @e
    private String longName;
    @e
    private String name;
    @e
    private t start;
    private int textColor;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Klasse() {
        this(0L, null, null, null, null, 0, 0, false, false, 511, null);
    }
    
    public Klasse(final long id, @e final String name, @e final String longName, @e final t start, @e final t end, final int textColor, final int backColor, final boolean active, final boolean displayable) {
        k0.p(name, "name");
        k0.p(longName, "longName");
        k0.p(start, "start");
        k0.p(end, "end");
        this.id = id;
        this.name = name;
        this.longName = longName;
        this.start = start;
        this.end = end;
        this.textColor = textColor;
        this.backColor = backColor;
        this.active = active;
        this.displayable = displayable;
    }
    
    public Klasse(@e final Parcel parcel) {
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
        final t c0 = t.c0(parcel.readString());
        k0.o(c0, "parse(parcel.readString())");
        final t c2 = t.c0(parcel.readString());
        k0.o(c2, "parse(parcel.readString())");
        this(long1, string, string2, c0, c2, parcel.readInt(), parcel.readInt(), parcel.readByte() != 0, parcel.readByte() != 0);
    }
    
    public int compareTo(@e final Klasse klasse) {
        k0.p(klasse, "other");
        int n;
        if ((n = this.getDisplayableTitle().compareTo(klasse.getDisplayableTitle())) == 0) {
            n = this.getDisplayableDescription().compareTo(klasse.getDisplayableDescription());
        }
        return n;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long entityId() {
        return this.id;
    }
    
    @e
    public EntityType entityType() {
        return EntityType.CLASS;
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
        if (!k0.g(Klasse.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.masterdata.Klasse");
        return this.id == ((Klasse)obj).id;
    }
    
    public final boolean getActive() {
        return this.active;
    }
    
    public final int getBackColor() {
        return this.backColor;
    }
    
    @e
    public final String getDisplayName() {
        String s;
        if (this.longName.length() > 0) {
            s = this.longName;
        }
        else {
            s = this.name;
        }
        return s;
    }
    
    public final boolean getDisplayable() {
        return this.displayable;
    }
    
    public int getDisplayableBackColor() {
        return this.backColor;
    }
    
    @e
    public String getDisplayableDescription() {
        return this.getDisplayName();
    }
    
    public int getDisplayableTextColor() {
        return this.textColor;
    }
    
    @e
    public String getDisplayableTitle() {
        return this.name;
    }
    
    @e
    public final t getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getLongName() {
        return this.longName;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final t getStart() {
        return this.start;
    }
    
    public final int getTextColor() {
        return this.textColor;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setActive(final boolean active) {
        this.active = active;
    }
    
    public final void setBackColor(final int backColor) {
        this.backColor = backColor;
    }
    
    public final void setDisplayable(final boolean displayable) {
        this.displayable = displayable;
    }
    
    public final void setEnd(@e final t end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setLongName(@e final String longName) {
        k0.p(longName, "<set-?>");
        this.longName = longName;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setStart(@e final t start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setTextColor(final int textColor) {
        this.textColor = textColor;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.longName);
        parcel.writeString(this.start.toString());
        parcel.writeString(this.end.toString());
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.backColor);
        parcel.writeByte((byte)(byte)(this.active ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.displayable ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Klasse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Klasse>
    {
        private CREATOR() {
        }
        
        @e
        public Klasse createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Klasse(parcel);
        }
        
        @e
        public Klasse[] newArray(final int n) {
            return new Klasse[n];
        }
    }
}
