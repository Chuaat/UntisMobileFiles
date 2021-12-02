// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.homework;

import a4.a;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.joda.time.t;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\nH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0013H\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u00d6\u0003R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0017\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\"\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00103\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010'\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+¨\u0006>" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/homework/LocalHomework;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "", "getDisplayableTitle", "getDisplayableDescription", "", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "component1", "component2", "Lorg/joda/time/t;", "component3", "component4", "component5", "component6", "", "component7", "id", "lessonId", "start", "end", "text", "remark", "completed", "copy", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getRemark", "()Ljava/lang/String;", "setRemark", "(Ljava/lang/String;)V", "Lorg/joda/time/t;", "getStart", "()Lorg/joda/time/t;", "setStart", "(Lorg/joda/time/t;)V", "getText", "setText", "Z", "getCompleted", "()Z", "setCompleted", "(Z)V", "J", "getId", "()J", "setId", "(J)V", "getLessonId", "setLessonId", "getEnd", "setEnd", "<init>", "(JJLorg/joda/time/t;Lorg/joda/time/t;Ljava/lang/String;Ljava/lang/String;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class LocalHomework implements DisplayableEntity
{
    private boolean completed;
    @e
    private t end;
    private long id;
    private long lessonId;
    @e
    private String remark;
    @e
    private t start;
    @e
    private String text;
    
    public LocalHomework(final long id, final long lessonId, @e final t start, @e final t end, @e final String text, @e final String remark, final boolean completed) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        k0.p(remark, "remark");
        this.id = id;
        this.lessonId = lessonId;
        this.start = start;
        this.end = end;
        this.text = text;
        this.remark = remark;
        this.completed = completed;
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final long component2() {
        return this.lessonId;
    }
    
    @e
    public final t component3() {
        return this.start;
    }
    
    @e
    public final t component4() {
        return this.end;
    }
    
    @e
    public final String component5() {
        return this.text;
    }
    
    @e
    public final String component6() {
        return this.remark;
    }
    
    public final boolean component7() {
        return this.completed;
    }
    
    @e
    public final LocalHomework copy(final long n, final long n2, @e final t t, @e final t t2, @e final String s, @e final String s2, final boolean b) {
        k0.p(t, "start");
        k0.p(t2, "end");
        k0.p(s, "text");
        k0.p(s2, "remark");
        return new LocalHomework(n, n2, t, t2, s, s2, b);
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
        if (!(o instanceof LocalHomework)) {
            return false;
        }
        final LocalHomework localHomework = (LocalHomework)o;
        return this.id == localHomework.id && this.lessonId == localHomework.lessonId && k0.g(this.start, localHomework.start) && k0.g(this.end, localHomework.end) && k0.g(this.text, localHomework.text) && k0.g(this.remark, localHomework.remark) && this.completed == localHomework.completed;
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
    
    public final long getId() {
        return this.id;
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
        final int a = a4.a.a(this.id);
        final int a2 = a4.a.a(this.lessonId);
        final int hashCode = this.start.hashCode();
        final int hashCode2 = this.end.hashCode();
        final int hashCode3 = this.text.hashCode();
        final int hashCode4 = this.remark.hashCode();
        int completed;
        if ((completed = (this.completed ? 1 : 0)) != 0) {
            completed = 1;
        }
        return (((((a * 31 + a2) * 31 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + completed;
    }
    
    public final void setCompleted(final boolean completed) {
        this.completed = completed;
    }
    
    public final void setEnd(@e final t end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
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
        sb.append("LocalHomework(id=");
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
        sb.append(')');
        return sb.toString();
    }
}
