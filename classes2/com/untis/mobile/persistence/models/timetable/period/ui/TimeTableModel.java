// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period.ui;

import org.joda.time.base.g;
import java.util.Iterator;
import java.util.Collection;
import com.untis.mobile.utils.time.a;
import java.util.Objects;
import java.util.ArrayList;
import kotlin.collections.v;
import android.os.Parcelable$Creator;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.timetable.placeholder.l;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b=\b\u0086\b\u0018\u0000 a2\u00020\u0001:\u0001aB\u0083\u0001\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0018\u0012\b\b\u0002\u0010)\u001a\u00020\u0013\u0012\b\b\u0002\u0010*\u001a\u00020\u001b\u0012\b\b\u0002\u0010+\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010/\u001a\u00020\r\u0012\b\b\u0002\u00100\u001a\u00020\u0013\u0012\b\b\u0002\u00101\u001a\u00020%¢\u0006\u0004\b^\u0010_B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b^\u0010`J\t\u0010\u0003\u001a\u00020\u0002H\u00c2\u0003J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013J\t\u0010\u0019\u001a\u00020\u0018H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u001bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0013H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010!H\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\t\u0010$\u001a\u00020\u0013H\u00c6\u0003J\t\u0010&\u001a\u00020%H\u00c6\u0003J\u0085\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020\u00132\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010/\u001a\u00020\r2\b\b\u0002\u00100\u001a\u00020\u00132\b\b\u0002\u00101\u001a\u00020%H\u00c6\u0001J\t\u00103\u001a\u00020%H\u00d6\u0001R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010)\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010>\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER\"\u0010/\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010.\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010(\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010+\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00109\u001a\u0004\bU\u0010;\"\u0004\bV\u0010=R\"\u00100\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\bW\u0010;\"\u0004\bX\u0010=R\"\u00101\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006b" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/services/timetable/placeholder/l;", "component1", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "periodModel", "", "", "overlapping", "timetableRefreshSeconds", "serverClientTimeDelta", "getState", "Lcom/untis/mobile/persistence/models/EntityType;", "component2", "component3", "Lorg/joda/time/t;", "component4", "component5", "", "component6", "component7", "Lcom/untis/mobile/persistence/models/timetable/period/ui/HolidayModel;", "component8", "component9", "component10", "", "component11", "state", "entityType", "entityId", "date", "timestamp", "periods", "periodsWithOutCancelled", "holiday", "preLoadedPeriodData", "lastRequestTimestamp", "id", "copy", "toString", "Lorg/joda/time/t;", "getDate", "()Lorg/joda/time/t;", "setDate", "(Lorg/joda/time/t;)V", "J", "getEntityId", "()J", "setEntityId", "(J)V", "Ljava/util/List;", "getPeriods", "()Ljava/util/List;", "setPeriods", "(Ljava/util/List;)V", "getPeriodsWithOutCancelled", "setPeriodsWithOutCancelled", "Lcom/untis/mobile/services/timetable/placeholder/l;", "Z", "getPreLoadedPeriodData", "()Z", "setPreLoadedPeriodData", "(Z)V", "Lcom/untis/mobile/persistence/models/timetable/period/ui/HolidayModel;", "getHoliday", "()Lcom/untis/mobile/persistence/models/timetable/period/ui/HolidayModel;", "setHoliday", "(Lcom/untis/mobile/persistence/models/timetable/period/ui/HolidayModel;)V", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "getTimestamp", "setTimestamp", "getLastRequestTimestamp", "setLastRequestTimestamp", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "(Lcom/untis/mobile/services/timetable/placeholder/l;Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/t;JLjava/util/List;Ljava/util/List;Lcom/untis/mobile/persistence/models/timetable/period/ui/HolidayModel;ZJLjava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeTableModel implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private t date;
    private long entityId;
    @e
    private EntityType entityType;
    @f
    private HolidayModel holiday;
    @e
    private String id;
    private long lastRequestTimestamp;
    @e
    private List<PeriodModel> periods;
    @e
    private List<PeriodModel> periodsWithOutCancelled;
    private boolean preLoadedPeriodData;
    @e
    private l state;
    private long timestamp;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public TimeTableModel() {
        this(null, null, 0L, null, 0L, null, null, null, false, 0L, null, 2047, null);
    }
    
    public TimeTableModel(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final l a = l.H.a(parcel.readInt());
        final EntityType by = EntityType.Companion.findBy(parcel.readInt());
        final long long1 = parcel.readLong();
        final t c0 = t.c0(parcel.readString());
        k0.o(c0, "parse(parcel.readString())");
        final long long2 = parcel.readLong();
        final PeriodModel.CREATOR creator = PeriodModel.CREATOR;
        List<Object> list;
        if ((list = (List<Object>)parcel.createTypedArrayList((Parcelable$Creator)creator)) == null) {
            list = v.E();
        }
        List<Object> list2;
        if ((list2 = (List<Object>)parcel.createTypedArrayList((Parcelable$Creator)creator)) == null) {
            list2 = v.E();
        }
        this(a, by, long1, c0, long2, list, list2, (HolidayModel)parcel.readParcelable(HolidayModel.class.getClassLoader()), parcel.readByte() != 0, 0L, null, 1536, null);
    }
    
    public TimeTableModel(@e final l state, @e final EntityType entityType, final long entityId, @e final t date, final long timestamp, @e final List<PeriodModel> periods, @e final List<PeriodModel> periodsWithOutCancelled, @f final HolidayModel holiday, final boolean preLoadedPeriodData, final long lastRequestTimestamp, @e final String id) {
        k0.p(state, "state");
        k0.p(entityType, "entityType");
        k0.p(date, "date");
        k0.p(periods, "periods");
        k0.p(periodsWithOutCancelled, "periodsWithOutCancelled");
        k0.p(id, "id");
        this.state = state;
        this.entityType = entityType;
        this.entityId = entityId;
        this.date = date;
        this.timestamp = timestamp;
        this.periods = periods;
        this.periodsWithOutCancelled = periodsWithOutCancelled;
        this.holiday = holiday;
        this.preLoadedPeriodData = preLoadedPeriodData;
        this.lastRequestTimestamp = lastRequestTimestamp;
        this.id = id;
    }
    
    private final l component1() {
        return this.state;
    }
    
    public final long component10() {
        return this.lastRequestTimestamp;
    }
    
    @e
    public final String component11() {
        return this.id;
    }
    
    @e
    public final EntityType component2() {
        return this.entityType;
    }
    
    public final long component3() {
        return this.entityId;
    }
    
    @e
    public final t component4() {
        return this.date;
    }
    
    public final long component5() {
        return this.timestamp;
    }
    
    @e
    public final List<PeriodModel> component6() {
        return this.periods;
    }
    
    @e
    public final List<PeriodModel> component7() {
        return this.periodsWithOutCancelled;
    }
    
    @f
    public final HolidayModel component8() {
        return this.holiday;
    }
    
    public final boolean component9() {
        return this.preLoadedPeriodData;
    }
    
    @e
    public final TimeTableModel copy(@e final l l, @e final EntityType entityType, final long n, @e final t t, final long n2, @e final List<PeriodModel> list, @e final List<PeriodModel> list2, @f final HolidayModel holidayModel, final boolean b, final long n3, @e final String s) {
        k0.p(l, "state");
        k0.p(entityType, "entityType");
        k0.p(t, "date");
        k0.p(list, "periods");
        k0.p(list2, "periodsWithOutCancelled");
        k0.p(s, "id");
        return new TimeTableModel(l, entityType, n, t, n2, list, list2, holidayModel, b, n3, s);
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
        if (!k0.g(TimeTableModel.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel");
        final TimeTableModel timeTableModel = (TimeTableModel)obj;
        return this.entityType == timeTableModel.entityType && this.entityId == timeTableModel.entityId && k0.g(this.date, timeTableModel.date);
    }
    
    @e
    public final t getDate() {
        return this.date;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    @f
    public final HolidayModel getHoliday() {
        return this.holiday;
    }
    
    @e
    public final String getId() {
        return this.id;
    }
    
    public final long getLastRequestTimestamp() {
        return this.lastRequestTimestamp;
    }
    
    @e
    public final List<PeriodModel> getPeriods() {
        return this.periods;
    }
    
    @e
    public final List<PeriodModel> getPeriodsWithOutCancelled() {
        return this.periodsWithOutCancelled;
    }
    
    public final boolean getPreLoadedPeriodData() {
        return this.preLoadedPeriodData;
    }
    
    @e
    public final l getState(final long n, final long n2) {
        final l state = this.state;
        if (state == l.L) {
            return state;
        }
        l l;
        if (this.timestamp + n * 1000 > a.d() + n2) {
            l = com.untis.mobile.services.timetable.placeholder.l.K;
        }
        else {
            l = com.untis.mobile.services.timetable.placeholder.l.J;
        }
        return l;
    }
    
    public final long getTimestamp() {
        return this.timestamp;
    }
    
    @Override
    public int hashCode() {
        return (this.entityType.hashCode() * 31 + a4.a.a(this.entityId)) * 31 + this.date.hashCode();
    }
    
    @e
    public final Collection<Long> overlapping(@e final PeriodModel periodModel) {
        k0.p(periodModel, "periodModel");
        final List<PeriodModel> periods = this.periods;
        final ArrayList<PeriodModel> list = new ArrayList<PeriodModel>();
        for (final PeriodModel next : periods) {
            final PeriodModel periodModel2 = next;
            if ((periodModel2.getStartMinute() >= periodModel.getStartMinute() && periodModel2.getStartMinute() < periodModel.getEndMinute()) || (periodModel2.getEndMinute() > periodModel.getStartMinute() && periodModel2.getEndMinute() <= periodModel.getEndMinute()) || (periodModel2.getStartMinute() < periodModel.getStartMinute() && periodModel2.getEndMinute() > periodModel.getEndMinute())) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(Long.valueOf(iterator2.next().getId()));
        }
        return (Collection<Long>)list2;
    }
    
    public final void setDate(@e final t date) {
        k0.p(date, "<set-?>");
        this.date = date;
    }
    
    public final void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setHoliday(@f final HolidayModel holiday) {
        this.holiday = holiday;
    }
    
    public final void setId(@e final String id) {
        k0.p(id, "<set-?>");
        this.id = id;
    }
    
    public final void setLastRequestTimestamp(final long lastRequestTimestamp) {
        this.lastRequestTimestamp = lastRequestTimestamp;
    }
    
    public final void setPeriods(@e final List<PeriodModel> periods) {
        k0.p(periods, "<set-?>");
        this.periods = periods;
    }
    
    public final void setPeriodsWithOutCancelled(@e final List<PeriodModel> periodsWithOutCancelled) {
        k0.p(periodsWithOutCancelled, "<set-?>");
        this.periodsWithOutCancelled = periodsWithOutCancelled;
    }
    
    public final void setPreLoadedPeriodData(final boolean preLoadedPeriodData) {
        this.preLoadedPeriodData = preLoadedPeriodData;
    }
    
    public final void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TimeTableModel(state=");
        sb.append(this.state);
        sb.append(", entityType=");
        sb.append(this.entityType);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", periods=");
        sb.append(this.periods);
        sb.append(", periodsWithOutCancelled=");
        sb.append(this.periodsWithOutCancelled);
        sb.append(", holiday=");
        sb.append(this.holiday);
        sb.append(", preLoadedPeriodData=");
        sb.append(this.preLoadedPeriodData);
        sb.append(", lastRequestTimestamp=");
        sb.append(this.lastRequestTimestamp);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeInt(this.state.d());
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.entityId);
        parcel.writeString(this.date.toString());
        parcel.writeLong(this.timestamp);
        parcel.writeTypedList((List)this.periods);
        parcel.writeTypedList((List)this.periodsWithOutCancelled);
        parcel.writeParcelable((Parcelable)this.holiday, n);
        parcel.writeByte((byte)(byte)(this.preLoadedPeriodData ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<TimeTableModel>
    {
        private CREATOR() {
        }
        
        @e
        public TimeTableModel createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new TimeTableModel(parcel);
        }
        
        @e
        public TimeTableModel[] newArray(final int n) {
            return new TimeTableModel[n];
        }
    }
}
