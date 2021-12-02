// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.reminder;

import a4.a;
import org.jetbrains.annotations.f;
import androidx.core.app.r$p;
import androidx.core.app.r$e;
import androidx.core.app.r$g;
import android.app.Notification;
import android.content.Context;
import kotlin.h0;
import android.app.PendingIntent;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import androidx.room.l1;
import org.jetbrains.annotations.e;
import androidx.room.i0;
import org.joda.time.c;
import androidx.room.d1;
import androidx.room.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\bD\u0010EJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u0014H\u00c6\u0001J\t\u0010\u001f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010!\u001a\u00020 H\u00d6\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010/\u001a\u0004\bB\u00101\"\u0004\bC\u00103¨\u0006F" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "", "Landroid/app/PendingIntent;", "createContentIntent", "createUpcomingEventFragmentIntent", "Landroid/content/Context;", "context", "Landroid/app/Notification;", "createNotification", "", "component1", "", "component2", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "component3", "component4", "component5", "component6", "Lorg/joda/time/c;", "component7", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "component8", "id", "profileId", "sourceType", "sourceId", "title", "description", "dateTime", "sourceSubType", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "getSourceSubType", "()Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "setSourceSubType", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;)V", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "getSourceType", "()Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "setSourceType", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "J", "getSourceId", "()J", "setSourceId", "(J)V", "getDescription", "setDescription", "getId", "setId", "Lorg/joda/time/c;", "getDateTime", "()Lorg/joda/time/c;", "setDateTime", "(Lorg/joda/time/c;)V", "getProfileId", "setProfileId", "<init>", "(JLjava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLjava/lang/String;Ljava/lang/String;Lorg/joda/time/c;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(indices = { @d1(name = "index_reminder_01", unique = false, value = { "profile_id", "source_type", "source_id" }) }, tableName = "reminder")
public final class Reminder
{
    @i0(name = "date_time")
    @e
    private c dateTime;
    @i0(name = "description")
    @e
    private String description;
    @i0(name = "reminder_id")
    @l1(autoGenerate = true)
    private long id;
    @i0(name = "profile_id")
    @e
    private String profileId;
    @i0(name = "source_id")
    private long sourceId;
    @i0(name = "subtype")
    @e
    private ReminderSubtype sourceSubType;
    @i0(name = "source_type")
    @e
    private ReminderType sourceType;
    @i0(name = "title")
    @e
    private String title;
    
    public Reminder(final long id, @e final String profileId, @e final ReminderType sourceType, final long sourceId, @e final String title, @e final String description, @e final c dateTime, @e final ReminderSubtype sourceSubType) {
        k0.p(profileId, "profileId");
        k0.p(sourceType, "sourceType");
        k0.p(title, "title");
        k0.p(description, "description");
        k0.p(dateTime, "dateTime");
        k0.p(sourceSubType, "sourceSubType");
        this.id = id;
        this.profileId = profileId;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.sourceSubType = sourceSubType;
    }
    
    private final PendingIntent createContentIntent() {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.sourceType.ordinal()];
        final PendingIntent pendingIntent = null;
        PendingIntent upcomingEventFragmentIntent;
        if (n != 1 && n != 2 && n != 3) {
            upcomingEventFragmentIntent = pendingIntent;
            if (n != 4) {
                if (n != 5) {
                    throw new h0();
                }
                upcomingEventFragmentIntent = pendingIntent;
            }
        }
        else {
            upcomingEventFragmentIntent = this.createUpcomingEventFragmentIntent();
        }
        return upcomingEventFragmentIntent;
    }
    
    private final PendingIntent createUpcomingEventFragmentIntent() {
        return null;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final String component2() {
        return this.profileId;
    }
    
    @e
    public final ReminderType component3() {
        return this.sourceType;
    }
    
    public final long component4() {
        return this.sourceId;
    }
    
    @e
    public final String component5() {
        return this.title;
    }
    
    @e
    public final String component6() {
        return this.description;
    }
    
    @e
    public final c component7() {
        return this.dateTime;
    }
    
    @e
    public final ReminderSubtype component8() {
        return this.sourceSubType;
    }
    
    @e
    public final Reminder copy(final long n, @e final String s, @e final ReminderType reminderType, final long n2, @e final String s2, @e final String s3, @e final c c, @e final ReminderSubtype reminderSubtype) {
        k0.p(s, "profileId");
        k0.p(reminderType, "sourceType");
        k0.p(s2, "title");
        k0.p(s3, "description");
        k0.p(c, "dateTime");
        k0.p(reminderSubtype, "sourceSubType");
        return new Reminder(n, s, reminderType, n2, s2, s3, c, reminderSubtype);
    }
    
    @e
    public final Notification createNotification(@e final Context context) {
        k0.p(context, "context");
        final Notification h = new r$g(context, "untismobile").r0(ReminderTypeKt.getSmallIconId(this.sourceType)).O((CharSequence)this.title).N((CharSequence)this.description).x0((r$p)new r$e().A((CharSequence)this.description)).i0(0).M(this.createContentIntent()).C(true).h();
        k0.o(h, "Builder(context, REMINDER_CHANNEL_ID)\n                .setSmallIcon(sourceType.getSmallIconId())\n                .setContentTitle(title)\n                .setContentText(description)\n                .setStyle(NotificationCompat.BigTextStyle().bigText(description))\n                .setPriority(NotificationCompat.PRIORITY_DEFAULT)\n                .setContentIntent(createContentIntent())\n                .setAutoCancel(true)\n                .build()");
        return h;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Reminder)) {
            return false;
        }
        final Reminder reminder = (Reminder)o;
        return this.id == reminder.id && k0.g(this.profileId, reminder.profileId) && this.sourceType == reminder.sourceType && this.sourceId == reminder.sourceId && k0.g(this.title, reminder.title) && k0.g(this.description, reminder.description) && k0.g(this.dateTime, reminder.dateTime) && this.sourceSubType == reminder.sourceSubType;
    }
    
    @e
    public final c getDateTime() {
        return this.dateTime;
    }
    
    @e
    public final String getDescription() {
        return this.description;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getProfileId() {
        return this.profileId;
    }
    
    public final long getSourceId() {
        return this.sourceId;
    }
    
    @e
    public final ReminderSubtype getSourceSubType() {
        return this.sourceSubType;
    }
    
    @e
    public final ReminderType getSourceType() {
        return this.sourceType;
    }
    
    @e
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        return ((((((a.a(this.id) * 31 + this.profileId.hashCode()) * 31 + this.sourceType.hashCode()) * 31 + a.a(this.sourceId)) * 31 + this.title.hashCode()) * 31 + this.description.hashCode()) * 31 + ((org.joda.time.base.c)this.dateTime).hashCode()) * 31 + this.sourceSubType.hashCode();
    }
    
    public final void setDateTime(@e final c dateTime) {
        k0.p(dateTime, "<set-?>");
        this.dateTime = dateTime;
    }
    
    public final void setDescription(@e final String description) {
        k0.p(description, "<set-?>");
        this.description = description;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setProfileId(@e final String profileId) {
        k0.p(profileId, "<set-?>");
        this.profileId = profileId;
    }
    
    public final void setSourceId(final long sourceId) {
        this.sourceId = sourceId;
    }
    
    public final void setSourceSubType(@e final ReminderSubtype sourceSubType) {
        k0.p(sourceSubType, "<set-?>");
        this.sourceSubType = sourceSubType;
    }
    
    public final void setSourceType(@e final ReminderType sourceType) {
        k0.p(sourceType, "<set-?>");
        this.sourceType = sourceType;
    }
    
    public final void setTitle(@e final String title) {
        k0.p(title, "<set-?>");
        this.title = title;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Reminder(id=");
        sb.append(this.id);
        sb.append(", profileId=");
        sb.append(this.profileId);
        sb.append(", sourceType=");
        sb.append(this.sourceType);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", dateTime=");
        sb.append(this.dateTime);
        sb.append(", sourceSubType=");
        sb.append(this.sourceSubType);
        sb.append(')');
        return sb.toString();
    }
}
