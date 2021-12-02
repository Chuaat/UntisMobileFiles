// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter.classlead;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b1\u00102J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLeadEvent;", "", "", "component1", "Lcom/untis/mobile/persistence/models/EntityType;", "component2", "component3", "Lorg/joda/time/c;", "component4", "", "component5", "component6", "id", "entityType", "entityId", "timestamp", "text", "eventReasonId", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getEventReasonId", "()J", "setEventReasonId", "(J)V", "getId", "setId", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Lorg/joda/time/c;", "getTimestamp", "()Lorg/joda/time/c;", "setTimestamp", "(Lorg/joda/time/c;)V", "getEntityId", "setEntityId", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "<init>", "(JLcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/c;Ljava/lang/String;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ClassLeadEvent
{
    private long entityId;
    @e
    private EntityType entityType;
    private long eventReasonId;
    private long id;
    @e
    private String text;
    @e
    private c timestamp;
    
    public ClassLeadEvent(final long id, @e final EntityType entityType, final long entityId, @e final c timestamp, @e final String text, final long eventReasonId) {
        k0.p(entityType, "entityType");
        k0.p(timestamp, "timestamp");
        k0.p(text, "text");
        this.id = id;
        this.entityType = entityType;
        this.entityId = entityId;
        this.timestamp = timestamp;
        this.text = text;
        this.eventReasonId = eventReasonId;
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
        return this.timestamp;
    }
    
    @e
    public final String component5() {
        return this.text;
    }
    
    public final long component6() {
        return this.eventReasonId;
    }
    
    @e
    public final ClassLeadEvent copy(final long n, @e final EntityType entityType, final long n2, @e final c c, @e final String s, final long n3) {
        k0.p(entityType, "entityType");
        k0.p(c, "timestamp");
        k0.p(s, "text");
        return new ClassLeadEvent(n, entityType, n2, c, s, n3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClassLeadEvent)) {
            return false;
        }
        final ClassLeadEvent classLeadEvent = (ClassLeadEvent)o;
        return this.id == classLeadEvent.id && this.entityType == classLeadEvent.entityType && this.entityId == classLeadEvent.entityId && k0.g(this.timestamp, classLeadEvent.timestamp) && k0.g(this.text, classLeadEvent.text) && this.eventReasonId == classLeadEvent.eventReasonId;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    public final long getEventReasonId() {
        return this.eventReasonId;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @e
    public final c getTimestamp() {
        return this.timestamp;
    }
    
    @Override
    public int hashCode() {
        return ((((a.a(this.id) * 31 + this.entityType.hashCode()) * 31 + a.a(this.entityId)) * 31 + ((org.joda.time.base.c)this.timestamp).hashCode()) * 31 + this.text.hashCode()) * 31 + a.a(this.eventReasonId);
    }
    
    public final void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setEventReasonId(final long eventReasonId) {
        this.eventReasonId = eventReasonId;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public final void setTimestamp(@e final c timestamp) {
        k0.p(timestamp, "<set-?>");
        this.timestamp = timestamp;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassLeadEvent(id=");
        sb.append(this.id);
        sb.append(", entityType=");
        sb.append(this.entityType);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", eventReasonId=");
        sb.append(this.eventReasonId);
        sb.append(')');
        return sb.toString();
    }
}
