// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model;

import org.joda.time.base.g;
import java.util.Objects;
import kotlin.collections.v;
import a4.a;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import com.untis.mobile.utils.extension.j;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.jsonadapter.b;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.utils.jsonadapter.h;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u0000 =2\u00020\u0001:\u0001=BG\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0004\b:\u0010;B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b:\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u00c6\u0003JU\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010'\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R$\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006>" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/CalendarBlockPeriod;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "Lorg/joda/time/c;", "component2", "component3", "", "component4", "", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "component5", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission;", "component6", "id", "start", "end", "teachingContent", "teachingContentFiles", "permissions", "copy", "toString", "hashCode", "", "other", "", "equals", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "Ljava/util/List;", "getTeachingContentFiles", "()Ljava/util/List;", "setTeachingContentFiles", "(Ljava/util/List;)V", "getEnd", "setEnd", "J", "getId", "()J", "setId", "(J)V", "getPermissions", "setPermissions", "Ljava/lang/String;", "getTeachingContent", "()Ljava/lang/String;", "setTeachingContent", "(Ljava/lang/String;)V", "<init>", "(JLorg/joda/time/c;Lorg/joda/time/c;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarBlockPeriod implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @JsonAdapter(h.class)
    @SerializedName("endDateTime")
    @e
    private c end;
    @SerializedName("id")
    private long id;
    @JsonAdapter(b.class)
    @SerializedName("permissions")
    @e
    private List<? extends CalendarPeriodPermission> permissions;
    @JsonAdapter(h.class)
    @SerializedName("startDateTime")
    @e
    private c start;
    @SerializedName("teachingContent")
    @f
    private String teachingContent;
    @SerializedName("teachingContentFiles")
    @f
    private List<CalendarPeriodAttachment> teachingContentFiles;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarBlockPeriod(final long id, @e final c start, @e final c end, @f final String teachingContent, @f final List<CalendarPeriodAttachment> teachingContentFiles, @e final List<? extends CalendarPeriodPermission> permissions) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(permissions, "permissions");
        this.id = id;
        this.start = start;
        this.end = end;
        this.teachingContent = teachingContent;
        this.teachingContentFiles = teachingContentFiles;
        this.permissions = permissions;
    }
    
    public CalendarBlockPeriod(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final c f = j.f(parcel);
        final c f2 = j.f(parcel);
        final String string = parcel.readString();
        final ArrayList typedArrayList = parcel.createTypedArrayList((Parcelable$Creator)CalendarPeriodAttachment.CREATOR);
        final ArrayList<String> i = j.i(parcel);
        final ArrayList<CalendarPeriodPermission> list = new ArrayList<CalendarPeriodPermission>();
        final Iterator<Object> iterator = i.iterator();
        while (iterator.hasNext()) {
            final CalendarPeriodPermission byKey = CalendarPeriodPermission.Companion.findByKey(iterator.next());
            if (byKey != null) {
                list.add(byKey);
            }
        }
        this(long1, f, f2, string, typedArrayList, list);
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final c component2() {
        return this.start;
    }
    
    @e
    public final c component3() {
        return this.end;
    }
    
    @f
    public final String component4() {
        return this.teachingContent;
    }
    
    @f
    public final List<CalendarPeriodAttachment> component5() {
        return this.teachingContentFiles;
    }
    
    @e
    public final List<CalendarPeriodPermission> component6() {
        return (List<CalendarPeriodPermission>)this.permissions;
    }
    
    @e
    public final CalendarBlockPeriod copy(final long n, @e final c c, @e final c c2, @f final String s, @f final List<CalendarPeriodAttachment> list, @e final List<? extends CalendarPeriodPermission> list2) {
        k0.p(c, "start");
        k0.p(c2, "end");
        k0.p(list2, "permissions");
        return new CalendarBlockPeriod(n, c, c2, s, list, list2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarBlockPeriod)) {
            return false;
        }
        final CalendarBlockPeriod calendarBlockPeriod = (CalendarBlockPeriod)o;
        return this.id == calendarBlockPeriod.id && k0.g(this.start, calendarBlockPeriod.start) && k0.g(this.end, calendarBlockPeriod.end) && k0.g(this.teachingContent, calendarBlockPeriod.teachingContent) && k0.g(this.teachingContentFiles, calendarBlockPeriod.teachingContentFiles) && k0.g(this.permissions, calendarBlockPeriod.permissions);
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final List<CalendarPeriodPermission> getPermissions() {
        return (List<CalendarPeriodPermission>)this.permissions;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @f
    public final String getTeachingContent() {
        return this.teachingContent;
    }
    
    @f
    public final List<CalendarPeriodAttachment> getTeachingContentFiles() {
        return this.teachingContentFiles;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int hashCode = ((org.joda.time.base.c)this.start).hashCode();
        final int hashCode2 = ((org.joda.time.base.c)this.end).hashCode();
        final String teachingContent = this.teachingContent;
        int hashCode3 = 0;
        int hashCode4;
        if (teachingContent == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = teachingContent.hashCode();
        }
        final List<CalendarPeriodAttachment> teachingContentFiles = this.teachingContentFiles;
        if (teachingContentFiles != null) {
            hashCode3 = teachingContentFiles.hashCode();
        }
        return ((((a * 31 + hashCode) * 31 + hashCode2) * 31 + hashCode4) * 31 + hashCode3) * 31 + this.permissions.hashCode();
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setPermissions(@e final List<? extends CalendarPeriodPermission> permissions) {
        k0.p(permissions, "<set-?>");
        this.permissions = permissions;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setTeachingContent(@f final String teachingContent) {
        this.teachingContent = teachingContent;
    }
    
    public final void setTeachingContentFiles(@f final List<CalendarPeriodAttachment> teachingContentFiles) {
        this.teachingContentFiles = teachingContentFiles;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarBlockPeriod(id=");
        sb.append(this.id);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", teachingContent=");
        sb.append((Object)this.teachingContent);
        sb.append(", teachingContentFiles=");
        sb.append(this.teachingContentFiles);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeLong(((g)this.start).n());
        parcel.writeLong(((g)this.end).n());
        parcel.writeString(this.teachingContent);
        parcel.writeTypedList((List)this.teachingContentFiles);
        final List<? extends CalendarPeriodPermission> permissions = this.permissions;
        final ArrayList list = new ArrayList<String>(v.Y((Iterable<?>)permissions, 10));
        final Iterator<CalendarPeriodPermission> iterator = permissions.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getKey());
        }
        final String[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        parcel.writeStringArray((String[])array);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/CalendarBlockPeriod$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/persistence/model/CalendarBlockPeriod;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/persistence/model/CalendarBlockPeriod;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarBlockPeriod>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarBlockPeriod createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarBlockPeriod(parcel);
        }
        
        @e
        public CalendarBlockPeriod[] newArray(final int n) {
            return new CalendarBlockPeriod[n];
        }
    }
}
