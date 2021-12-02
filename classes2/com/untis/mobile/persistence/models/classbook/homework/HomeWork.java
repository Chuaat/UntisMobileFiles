// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.homework;

import com.untis.mobile.persistence.models.masterdata.Subject;
import java.util.Iterator;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import org.joda.time.r;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import com.untis.mobile.services.timetable.placeholder.k;
import android.content.Context;
import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import org.joda.time.l0;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.c;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\u0018\u0000 b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001bB\u0099\u0001\u0012\b\b\u0002\u0010S\u001a\u00020\"\u0012\b\b\u0002\u0010M\u001a\u00020\"\u0012\b\b\u0002\u0010A\u001a\u00020@\u0012\b\b\u0002\u0010Y\u001a\u00020@\u0012\b\b\u0002\u0010\\\u001a\u00020\u0011\u0012\b\b\u0002\u0010G\u001a\u00020\u0011\u0012\b\b\u0002\u0010P\u001a\u00020\f\u0012\b\b\u0002\u0010:\u001a\u000209\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u00106\u001a\u00020\"\u0012\b\b\u0002\u0010V\u001a\u00020\f\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u0010)\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b_\u0010`B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b_\u0010aJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0011J&\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010$\u001a\u0004\bN\u0010&\"\u0004\bO\u0010(R\"\u0010P\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010*\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R\"\u0010S\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010$\u001a\u0004\bT\u0010&\"\u0004\bU\u0010(R\"\u0010V\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010*\u001a\u0004\bW\u0010,\"\u0004\bX\u0010.R\"\u0010Y\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010B\u001a\u0004\bZ\u0010D\"\u0004\b[\u0010FR\"\u0010\\\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010H\u001a\u0004\b]\u0010J\"\u0004\b^\u0010L¨\u0006c" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "Landroid/os/Parcelable;", "", "other", "", "compareTo", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "", "", "equals", "hashCode", "describeContents", "getCompletedStatus", "", "getHomeworkString", "profileId", "Landroid/content/Context;", "context", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "toDashboardEvent", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "driveAttachments", "Ljava/util/List;", "getDriveAttachments", "()Ljava/util/List;", "", "entityId", "J", "getEntityId", "()J", "setEntityId", "(J)V", "synced", "Z", "getSynced", "()Z", "setSynced", "(Z)V", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;", "status", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;", "getStatus", "()Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;", "setStatus", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;)V", "periodId", "getPeriodId", "setPeriodId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "Lorg/joda/time/c;", "start", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "remark", "Ljava/lang/String;", "getRemark", "()Ljava/lang/String;", "setRemark", "(Ljava/lang/String;)V", "lessonId", "getLessonId", "setLessonId", "completed", "getCompleted", "setCompleted", "id", "getId", "setId", "local", "getLocal", "setLocal", "end", "getEnd", "setEnd", "text", "getText", "setText", "<init>", "(JJLorg/joda/time/c;Lorg/joda/time/c;Ljava/lang/String;Ljava/lang/String;ZLcom/untis/mobile/persistence/models/EntityType;JJZLcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;ZLjava/util/List;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HomeWork implements Parcelable, Comparable<HomeWork>
{
    @e
    public static final CREATOR CREATOR;
    private boolean completed;
    @e
    private final List<DriveAttachment> driveAttachments;
    @e
    private c end;
    private long entityId;
    @e
    private EntityType entityType;
    private long id;
    private long lessonId;
    private boolean local;
    private long periodId;
    @e
    private String remark;
    @e
    private c start;
    @e
    private HomeWorkStatus status;
    private boolean synced;
    @e
    private String text;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public HomeWork() {
        this(0L, 0L, null, null, null, null, false, null, 0L, 0L, false, null, false, null, 16383, null);
    }
    
    public HomeWork(final long id, final long lessonId, @e final c start, @e final c end, @e final String text, @e final String remark, final boolean completed, @e final EntityType entityType, final long entityId, final long periodId, final boolean local, @e final HomeWorkStatus status, final boolean synced, @e final List<DriveAttachment> driveAttachments) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        k0.p(remark, "remark");
        k0.p(entityType, "entityType");
        k0.p(status, "status");
        k0.p(driveAttachments, "driveAttachments");
        this.id = id;
        this.lessonId = lessonId;
        this.start = start;
        this.end = end;
        this.text = text;
        this.remark = remark;
        this.completed = completed;
        this.entityType = entityType;
        this.entityId = entityId;
        this.periodId = periodId;
        this.local = local;
        this.status = status;
        this.synced = synced;
        this.driveAttachments = driveAttachments;
    }
    
    public HomeWork(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final long long2 = parcel.readLong();
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        final boolean b = parcel.readByte() != 0;
        final EntityType by = EntityType.Companion.findBy(parcel.readInt());
        final long long3 = parcel.readLong();
        final long long4 = parcel.readLong();
        final boolean b2 = parcel.readByte() != 0;
        final HomeWorkStatus fromValue = HomeWorkStatus.Companion.fromValue(parcel.readInt());
        final boolean b3 = parcel.readByte() != 0;
        ArrayList<DriveAttachment> typedArrayList;
        if ((typedArrayList = (ArrayList<DriveAttachment>)parcel.createTypedArrayList((Parcelable$Creator)DriveAttachment.CREATOR)) == null) {
            typedArrayList = new ArrayList<DriveAttachment>();
        }
        this(long1, long2, k0, k2, string, string2, b, by, long3, long4, b2, fromValue, b3, typedArrayList);
    }
    
    public int compareTo(@e final HomeWork homeWork) {
        k0.p(homeWork, "other");
        return ((org.joda.time.base.c)this.end).b((l0)homeWork.end);
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
        if (!k0.g(HomeWork.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.homework.HomeWork");
        return this.id == ((HomeWork)obj).id;
    }
    
    public final boolean getCompleted() {
        return this.completed;
    }
    
    public final boolean getCompletedStatus() {
        final HomeWorkStatus status = this.status;
        return status == HomeWorkStatus.COMPLETED || (status != HomeWorkStatus.NOT_COMPLETED && this.completed);
    }
    
    @e
    public final List<DriveAttachment> getDriveAttachments() {
        return this.driveAttachments;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    @e
    public final String getHomeworkString() {
        String s;
        if (this.getCompletedStatus()) {
            s = k0.C("@completed@", this.text);
        }
        else {
            s = this.text;
        }
        return s;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getLessonId() {
        return this.lessonId;
    }
    
    public final boolean getLocal() {
        return this.local;
    }
    
    public final long getPeriodId() {
        return this.periodId;
    }
    
    @e
    public final String getRemark() {
        return this.remark;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final HomeWorkStatus getStatus() {
        return this.status;
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
        return a.a(this.id);
    }
    
    public final void setCompleted(final boolean completed) {
        this.completed = completed;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setLessonId(final long lessonId) {
        this.lessonId = lessonId;
    }
    
    public final void setLocal(final boolean local) {
        this.local = local;
    }
    
    public final void setPeriodId(final long periodId) {
        this.periodId = periodId;
    }
    
    public final void setRemark(@e final String remark) {
        k0.p(remark, "<set-?>");
        this.remark = remark;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStatus(@e final HomeWorkStatus status) {
        k0.p(status, "<set-?>");
        this.status = status;
    }
    
    public final void setSynced(final boolean synced) {
        this.synced = synced;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    @e
    public final DashboardEvent toDashboardEvent(@e final String s, @e final Context context, @e final com.untis.mobile.services.masterdata.a a, @e final k k) {
        k0.p(s, "profileId");
        k0.p(context, "context");
        k0.p(a, "masterDataService");
        k0.p(k, "timetableService");
        final EntityType entityType = this.entityType;
        String displayableTitle = null;
        Label_0105: {
            if (entityType != EntityType.STUDENT && entityType != EntityType.CLASS) {
                displayableTitle = "";
            }
            else {
                final DisplayableEntity v = a.v(entityType, this.entityId);
                if (v != null) {
                    displayableTitle = v.getDisplayableTitle();
                    if (displayableTitle != null) {
                        break Label_0105;
                    }
                }
                displayableTitle = "?";
            }
        }
        while (true) {
            for (final Period next : k.v(this.lessonId)) {
                if (next.getStates().contains(PeriodState.REGULAR)) {
                    final Period period = next;
                    long originalId = -1L;
                    if (period != null) {
                        final PeriodElement subject = period.getSubject();
                        if (subject != null) {
                            originalId = subject.getOriginalId();
                        }
                    }
                    List<Klasse> list3 = null;
                    Label_0402: {
                        if (period != null) {
                            final List<PeriodElement> klassen = period.getKlassen();
                            if (klassen != null) {
                                final ArrayList<PeriodElement> list = new ArrayList<PeriodElement>();
                                for (final PeriodElement next2 : klassen) {
                                    final PeriodElement periodElement = next2;
                                    if (periodElement.getCurrentId() == periodElement.getOriginalId() && periodElement.getEntityType() == EntityType.CLASS) {
                                        list.add(next2);
                                    }
                                }
                                final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
                                final Iterator<Object> iterator3 = list.iterator();
                                while (true) {
                                    list3 = list2;
                                    if (!iterator3.hasNext()) {
                                        break Label_0402;
                                    }
                                    final Klasse n = a.N(iterator3.next().getCurrentId());
                                    if (n == null) {
                                        continue;
                                    }
                                    list2.add(n);
                                }
                            }
                        }
                        list3 = null;
                    }
                    Object e;
                    if ((e = list3) == null) {
                        e = v.E();
                    }
                    final Subject u = a.U(originalId);
                    String displayableDescription = null;
                    Label_0447: {
                        if (u != null) {
                            displayableDescription = u.getDisplayableDescription();
                            if (displayableDescription != null) {
                                break Label_0447;
                            }
                        }
                        displayableDescription = "";
                    }
                    final ReminderType dashboardUpcomingLocalHomework = ReminderType.DashboardUpcomingLocalHomework;
                    final long id = this.id;
                    final String string = context.getString(2131886727);
                    final r r = new r((l0)this.start, (l0)this.end);
                    final String text = this.text;
                    final List<Long> i = v.k(this.entityId);
                    final List<DriveAttachment> driveAttachments = this.driveAttachments;
                    final ArrayList list4 = new ArrayList<Attachment>(v.Y((Iterable<?>)driveAttachments, 10));
                    for (final DriveAttachment driveAttachment : driveAttachments) {
                        list4.add(new Attachment(driveAttachment.getId(), driveAttachment.getName(), driveAttachment.getUrl()));
                    }
                    final boolean completedStatus = this.getCompletedStatus();
                    final String h = com.untis.mobile.utils.extension.h.H((List)e, null, false, 3, null);
                    k0.o(string, "getString(R.string.shared_localHomework_text)");
                    return new DashboardEvent(s, dashboardUpcomingLocalHomework, id, string, displayableTitle, i, r, displayableDescription, text, (List<Attachment>)list4, completedStatus, h);
                }
            }
            Period next = null;
            continue;
        }
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeLong(this.lessonId);
        parcel.writeString(((org.joda.time.base.a)this.start).toString());
        parcel.writeString(((org.joda.time.base.a)this.end).toString());
        parcel.writeString(this.text);
        parcel.writeString(this.remark);
        parcel.writeByte((byte)(byte)(this.completed ? 1 : 0));
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.entityId);
        parcel.writeLong(this.periodId);
        parcel.writeByte((byte)(byte)(this.local ? 1 : 0));
        parcel.writeInt(this.status.getValue());
        parcel.writeByte((byte)(byte)(this.synced ? 1 : 0));
        parcel.writeTypedList((List)this.driveAttachments);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<HomeWork>
    {
        private CREATOR() {
        }
        
        @e
        public HomeWork createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new HomeWork(parcel);
        }
        
        @e
        public HomeWork[] newArray(final int n) {
            return new HomeWork[n];
        }
    }
}
