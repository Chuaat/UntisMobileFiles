// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.classlead;

import a4.a;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import androidx.room.l1;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import androidx.room.i0;
import com.google.gson.annotations.SerializedName;
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import androidx.room.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b9\u0010:J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003R$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010&\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*¨\u0006;" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassbookEvent;", "", "other", "", "compareTo", "", "component1", "Lcom/untis/mobile/persistence/models/EntityType;", "component2", "component3", "Lorg/joda/time/c;", "component4", "", "component5", "component6", "id", "entityType", "entityId", "dateTime", "text", "reasonId", "copy", "toString", "hashCode", "", "", "equals", "klassenId", "Ljava/lang/Long;", "getKlassenId", "()Ljava/lang/Long;", "setKlassenId", "(Ljava/lang/Long;)V", "Lorg/joda/time/c;", "getDateTime", "()Lorg/joda/time/c;", "setDateTime", "(Lorg/joda/time/c;)V", "J", "getEntityId", "()J", "setEntityId", "(J)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getReasonId", "setReasonId", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "getId", "setId", "<init>", "(JLcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/c;Ljava/lang/String;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(tableName = "dashboard_classbook_event")
public final class DashboardClassbookEvent implements Comparable<DashboardClassbookEvent>
{
    @JsonAdapter(b.class)
    @SerializedName("dateTime")
    @i0(name = "date_time")
    @e
    private c dateTime;
    @SerializedName("elementId")
    @i0(name = "entity_Id")
    private long entityId;
    @JsonAdapter(t5.c.class)
    @SerializedName("elementType")
    @i0(name = "entity_type")
    @e
    private EntityType entityType;
    @SerializedName("id")
    @i0(name = "event_id")
    @l1
    private long id;
    @i0(name = "klassen_id")
    @f
    private Long klassenId;
    @SerializedName("eventReasonId")
    @i0(name = "reason_id")
    private long reasonId;
    @SerializedName("text")
    @i0(name = "text")
    @e
    private String text;
    
    public DashboardClassbookEvent(final long id, @e final EntityType entityType, final long entityId, @e final c dateTime, @e final String text, final long reasonId) {
        k0.p(entityType, "entityType");
        k0.p(dateTime, "dateTime");
        k0.p(text, "text");
        this.id = id;
        this.entityType = entityType;
        this.entityId = entityId;
        this.dateTime = dateTime;
        this.text = text;
        this.reasonId = reasonId;
    }
    
    @Override
    public int compareTo(@e final DashboardClassbookEvent dashboardClassbookEvent) {
        k0.p(dashboardClassbookEvent, "other");
        return -((org.joda.time.base.c)this.dateTime).b((l0)dashboardClassbookEvent.dateTime);
    }
    
    public final long component1() {
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
    public final c component4() {
        return this.dateTime;
    }
    
    @e
    public final String component5() {
        return this.text;
    }
    
    public final long component6() {
        return this.reasonId;
    }
    
    @e
    public final DashboardClassbookEvent copy(final long n, @e final EntityType entityType, final long n2, @e final c c, @e final String s, final long n3) {
        k0.p(entityType, "entityType");
        k0.p(c, "dateTime");
        k0.p(s, "text");
        return new DashboardClassbookEvent(n, entityType, n2, c, s, n3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardClassbookEvent)) {
            return false;
        }
        final DashboardClassbookEvent dashboardClassbookEvent = (DashboardClassbookEvent)o;
        return this.id == dashboardClassbookEvent.id && this.entityType == dashboardClassbookEvent.entityType && this.entityId == dashboardClassbookEvent.entityId && k0.g(this.dateTime, dashboardClassbookEvent.dateTime) && k0.g(this.text, dashboardClassbookEvent.text) && this.reasonId == dashboardClassbookEvent.reasonId;
    }
    
    @e
    public final c getDateTime() {
        return this.dateTime;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @f
    public final Long getKlassenId() {
        return this.klassenId;
    }
    
    public final long getReasonId() {
        return this.reasonId;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        return ((((a.a(this.id) * 31 + this.entityType.hashCode()) * 31 + a.a(this.entityId)) * 31 + ((org.joda.time.base.c)this.dateTime).hashCode()) * 31 + this.text.hashCode()) * 31 + a.a(this.reasonId);
    }
    
    public final void setDateTime(@e final c dateTime) {
        k0.p(dateTime, "<set-?>");
        this.dateTime = dateTime;
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
    
    public final void setKlassenId(@f final Long klassenId) {
        this.klassenId = klassenId;
    }
    
    public final void setReasonId(final long reasonId) {
        this.reasonId = reasonId;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardClassbookEvent(id=");
        sb.append(this.id);
        sb.append(", entityType=");
        sb.append(this.entityType);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", dateTime=");
        sb.append(this.dateTime);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", reasonId=");
        sb.append(this.reasonId);
        sb.append(')');
        return sb.toString();
    }
}
