// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "", "", "component1", "", "component2", "id", "displayName", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getId", "()J", "setId", "(J)V", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "<init>", "(JLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RoomRefDto
{
    @e
    private String displayName;
    private long id;
    
    public RoomRefDto(final long id, @e final String displayName) {
        k0.p(displayName, "displayName");
        this.id = id;
        this.displayName = displayName;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final String component2() {
        return this.displayName;
    }
    
    @e
    public final RoomRefDto copy(final long n, @e final String s) {
        k0.p(s, "displayName");
        return new RoomRefDto(n, s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoomRefDto)) {
            return false;
        }
        final RoomRefDto roomRefDto = (RoomRefDto)o;
        return this.id == roomRefDto.id && k0.g(this.displayName, roomRefDto.displayName);
    }
    
    @e
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id) * 31 + this.displayName.hashCode();
    }
    
    public final void setDisplayName(@e final String displayName) {
        k0.p(displayName, "<set-?>");
        this.displayName = displayName;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomRefDto(id=");
        sb.append(this.id);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(')');
        return sb.toString();
    }
}
