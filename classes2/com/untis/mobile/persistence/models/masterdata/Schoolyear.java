// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.masterdata;

import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import org.joda.time.t;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.Entity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u0006%" }, d2 = { "Lcom/untis/mobile/persistence/models/masterdata/Schoolyear;", "Lcom/untis/mobile/persistence/models/Entity;", "", "other", "", "equals", "", "hashCode", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lorg/joda/time/t;", "end", "Lorg/joda/time/t;", "getEnd", "()Lorg/joda/time/t;", "setEnd", "(Lorg/joda/time/t;)V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "id", "J", "getId", "()J", "setId", "(J)V", "start", "getStart", "setStart", "<init>", "(JLjava/lang/String;Lorg/joda/time/t;Lorg/joda/time/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Schoolyear implements Entity
{
    @e
    private t end;
    private long id;
    @e
    private String name;
    @e
    private t start;
    
    public Schoolyear() {
        this(0L, null, null, null, 15, null);
    }
    
    public Schoolyear(final long id, @e final String name, @e final t start, @e final t end) {
        k0.p(name, "name");
        k0.p(start, "start");
        k0.p(end, "end");
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
    }
    
    @Override
    public long entityId() {
        return this.id;
    }
    
    @e
    @Override
    public EntityType entityType() {
        return EntityType.SCHOOLYEAR;
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
        if (!k0.g(Schoolyear.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.masterdata.Schoolyear");
        return this.id == ((Schoolyear)obj).id;
    }
    
    @e
    public final t getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final t getStart() {
        return this.start;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setEnd(@e final t end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setStart(@e final t start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
}
