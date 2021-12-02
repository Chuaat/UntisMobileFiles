// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "", "", "component1", "displayName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class KlasseRefDto
{
    @f
    private String displayName;
    
    public KlasseRefDto() {
        this(null, 1, null);
    }
    
    public KlasseRefDto(@f final String displayName) {
        this.displayName = displayName;
    }
    
    @f
    public final String component1() {
        return this.displayName;
    }
    
    @e
    public final KlasseRefDto copy(@f final String s) {
        return new KlasseRefDto(s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof KlasseRefDto && k0.g(this.displayName, ((KlasseRefDto)o).displayName));
    }
    
    @f
    public final String getDisplayName() {
        return this.displayName;
    }
    
    @Override
    public int hashCode() {
        final String displayName = this.displayName;
        int hashCode;
        if (displayName == null) {
            hashCode = 0;
        }
        else {
            hashCode = displayName.hashCode();
        }
        return hashCode;
    }
    
    public final void setDisplayName(@f final String displayName) {
        this.displayName = displayName;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("KlasseRefDto(displayName=");
        sb.append((Object)this.displayName);
        sb.append(')');
        return sb.toString();
    }
}
