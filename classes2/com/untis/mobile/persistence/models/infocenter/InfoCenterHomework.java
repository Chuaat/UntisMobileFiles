// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\nH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\nH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u00c6\u0003J}\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u00c6\u0001J\t\u0010%\u001a\u00020\u0002H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010'H\u00d6\u0003R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u001c\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\"\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00108\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010*\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\"\u0010\"\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00103\u001a\u0004\bP\u00105\"\u0004\bQ\u00107¨\u0006T" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterHomework;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "", "getDisplayableTitle", "getDisplayableDescription", "", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "component1", "component2", "component3", "Lorg/joda/time/t;", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "component11", "key", "id", "lessonId", "start", "end", "text", "remark", "completed", "attachments", "copy", "toString", "hashCode", "", "other", "equals", "J", "getLessonId", "()J", "setLessonId", "(J)V", "getId", "setId", "getKey", "setKey", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Lorg/joda/time/t;", "getEnd", "()Lorg/joda/time/t;", "setEnd", "(Lorg/joda/time/t;)V", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "setAttachments", "(Ljava/util/List;)V", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "getStart", "setStart", "getEntityId", "setEntityId", "Z", "getCompleted", "()Z", "setCompleted", "(Z)V", "getRemark", "setRemark", "<init>", "(JJJLorg/joda/time/t;Lorg/joda/time/t;Ljava/lang/String;Ljava/lang/String;ZLcom/untis/mobile/persistence/models/EntityType;JLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterHomework implements DisplayableEntity
{
    @e
    private List<DriveAttachment> attachments;
    private boolean completed;
    @e
    private t end;
    private long entityId;
    @e
    private EntityType entityType;
    private long id;
    private long key;
    private long lessonId;
    @e
    private String remark;
    @e
    private t start;
    @e
    private String text;
    
    public InfoCenterHomework(final long key, final long id, final long lessonId, @e final t start, @e final t end, @e final String text, @e final String remark, final boolean completed, @e final EntityType entityType, final long entityId, @e final List<DriveAttachment> attachments) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        k0.p(remark, "remark");
        k0.p(entityType, "entityType");
        k0.p(attachments, "attachments");
        this.key = key;
        this.id = id;
        this.lessonId = lessonId;
        this.start = start;
        this.end = end;
        this.text = text;
        this.remark = remark;
        this.completed = completed;
        this.entityType = entityType;
        this.entityId = entityId;
        this.attachments = attachments;
    }
    
    public final long component1() {
        return this.key;
    }
    
    public final long component10() {
        return this.entityId;
    }
    
    @e
    public final List<DriveAttachment> component11() {
        return this.attachments;
    }
    
    public final long component2() {
        return this.id;
    }
    
    public final long component3() {
        return this.lessonId;
    }
    
    @e
    public final t component4() {
        return this.start;
    }
    
    @e
    public final t component5() {
        return this.end;
    }
    
    @e
    public final String component6() {
        return this.text;
    }
    
    @e
    public final String component7() {
        return this.remark;
    }
    
    public final boolean component8() {
        return this.completed;
    }
    
    @e
    public final EntityType component9() {
        return this.entityType;
    }
    
    @e
    public final InfoCenterHomework copy(final long n, final long n2, final long n3, @e final t t, @e final t t2, @e final String s, @e final String s2, final boolean b, @e final EntityType entityType, final long n4, @e final List<DriveAttachment> list) {
        k0.p(t, "start");
        k0.p(t2, "end");
        k0.p(s, "text");
        k0.p(s2, "remark");
        k0.p(entityType, "entityType");
        k0.p(list, "attachments");
        return new InfoCenterHomework(n, n2, n3, t, t2, s, s2, b, entityType, n4, list);
    }
    
    @Override
    public long entityId() {
        return this.id;
    }
    
    @e
    @Override
    public EntityType entityType() {
        return EntityType.HOMEWORK;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoCenterHomework)) {
            return false;
        }
        final InfoCenterHomework infoCenterHomework = (InfoCenterHomework)o;
        return this.key == infoCenterHomework.key && this.id == infoCenterHomework.id && this.lessonId == infoCenterHomework.lessonId && k0.g(this.start, infoCenterHomework.start) && k0.g(this.end, infoCenterHomework.end) && k0.g(this.text, infoCenterHomework.text) && k0.g(this.remark, infoCenterHomework.remark) && this.completed == infoCenterHomework.completed && this.entityType == infoCenterHomework.entityType && this.entityId == infoCenterHomework.entityId && k0.g(this.attachments, infoCenterHomework.attachments);
    }
    
    @e
    public final List<DriveAttachment> getAttachments() {
        return this.attachments;
    }
    
    public final boolean getCompleted() {
        return this.completed;
    }
    
    @Override
    public int getDisplayableBackColor() {
        return 0;
    }
    
    @e
    @Override
    public String getDisplayableDescription() {
        return "displayable description";
    }
    
    @Override
    public int getDisplayableTextColor() {
        return -12303292;
    }
    
    @e
    @Override
    public String getDisplayableTitle() {
        return "displayable title";
    }
    
    @e
    public final t getEnd() {
        return this.end;
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
    
    public final long getKey() {
        return this.key;
    }
    
    public final long getLessonId() {
        return this.lessonId;
    }
    
    @e
    public final String getRemark() {
        return this.remark;
    }
    
    @e
    public final t getStart() {
        return this.start;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.key);
        final int a2 = a4.a.a(this.id);
        final int a3 = a4.a.a(this.lessonId);
        final int hashCode = this.start.hashCode();
        final int hashCode2 = this.end.hashCode();
        final int hashCode3 = this.text.hashCode();
        final int hashCode4 = this.remark.hashCode();
        int completed;
        if ((completed = (this.completed ? 1 : 0)) != 0) {
            completed = 1;
        }
        return (((((((((a * 31 + a2) * 31 + a3) * 31 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + completed) * 31 + this.entityType.hashCode()) * 31 + a4.a.a(this.entityId)) * 31 + this.attachments.hashCode();
    }
    
    public final void setAttachments(@e final List<DriveAttachment> attachments) {
        k0.p(attachments, "<set-?>");
        this.attachments = attachments;
    }
    
    public final void setCompleted(final boolean completed) {
        this.completed = completed;
    }
    
    public final void setEnd(@e final t end) {
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
    
    public final void setKey(final long key) {
        this.key = key;
    }
    
    public final void setLessonId(final long lessonId) {
        this.lessonId = lessonId;
    }
    
    public final void setRemark(@e final String remark) {
        k0.p(remark, "<set-?>");
        this.remark = remark;
    }
    
    public final void setStart(@e final t start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoCenterHomework(key=");
        sb.append(this.key);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", lessonId=");
        sb.append(this.lessonId);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", remark=");
        sb.append(this.remark);
        sb.append(", completed=");
        sb.append(this.completed);
        sb.append(", entityType=");
        sb.append(this.entityType);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(')');
        return sb.toString();
    }
}
