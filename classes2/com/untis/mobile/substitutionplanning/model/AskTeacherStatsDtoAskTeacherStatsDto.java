// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0013¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "asked", "declined", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDtoAskTeacherStatsDto;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getAsked", "setAsked", "(Ljava/lang/Integer;)V", "getDeclined", "setDeclined", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AskTeacherStatsDtoAskTeacherStatsDto
{
    @f
    private Integer asked;
    @f
    private Integer declined;
    
    public AskTeacherStatsDtoAskTeacherStatsDto() {
        this(null, null, 3, null);
    }
    
    public AskTeacherStatsDtoAskTeacherStatsDto(@f final Integer asked, @f final Integer declined) {
        this.asked = asked;
        this.declined = declined;
    }
    
    @f
    public final Integer component1() {
        return this.asked;
    }
    
    @f
    public final Integer component2() {
        return this.declined;
    }
    
    @e
    public final AskTeacherStatsDtoAskTeacherStatsDto copy(@f final Integer n, @f final Integer n2) {
        return new AskTeacherStatsDtoAskTeacherStatsDto(n, n2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AskTeacherStatsDtoAskTeacherStatsDto)) {
            return false;
        }
        final AskTeacherStatsDtoAskTeacherStatsDto askTeacherStatsDtoAskTeacherStatsDto = (AskTeacherStatsDtoAskTeacherStatsDto)o;
        return k0.g(this.asked, askTeacherStatsDtoAskTeacherStatsDto.asked) && k0.g(this.declined, askTeacherStatsDtoAskTeacherStatsDto.declined);
    }
    
    @f
    public final Integer getAsked() {
        return this.asked;
    }
    
    @f
    public final Integer getDeclined() {
        return this.declined;
    }
    
    @Override
    public int hashCode() {
        final Integer asked = this.asked;
        int hashCode = 0;
        int hashCode2;
        if (asked == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = asked.hashCode();
        }
        final Integer declined = this.declined;
        if (declined != null) {
            hashCode = declined.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final void setAsked(@f final Integer asked) {
        this.asked = asked;
    }
    
    public final void setDeclined(@f final Integer declined) {
        this.declined = declined;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AskTeacherStatsDtoAskTeacherStatsDto(asked=");
        sb.append(this.asked);
        sb.append(", declined=");
        sb.append(this.declined);
        sb.append(')');
        return sb.toString();
    }
}
