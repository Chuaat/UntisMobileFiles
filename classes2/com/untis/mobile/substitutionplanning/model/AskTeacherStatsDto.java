// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/AskTeacherStatsDto;", "", "", "component1", "component2", "declined", "asked", "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getDeclined", "()I", "setDeclined", "(I)V", "getAsked", "setAsked", "<init>", "(II)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AskTeacherStatsDto
{
    private int asked;
    private int declined;
    
    public AskTeacherStatsDto(final int declined, final int asked) {
        this.declined = declined;
        this.asked = asked;
    }
    
    public final int component1() {
        return this.declined;
    }
    
    public final int component2() {
        return this.asked;
    }
    
    @e
    public final AskTeacherStatsDto copy(final int n, final int n2) {
        return new AskTeacherStatsDto(n, n2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AskTeacherStatsDto)) {
            return false;
        }
        final AskTeacherStatsDto askTeacherStatsDto = (AskTeacherStatsDto)o;
        return this.declined == askTeacherStatsDto.declined && this.asked == askTeacherStatsDto.asked;
    }
    
    public final int getAsked() {
        return this.asked;
    }
    
    public final int getDeclined() {
        return this.declined;
    }
    
    @Override
    public int hashCode() {
        return this.declined * 31 + this.asked;
    }
    
    public final void setAsked(final int asked) {
        this.asked = asked;
    }
    
    public final void setDeclined(final int declined) {
        this.declined = declined;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AskTeacherStatsDto(declined=");
        sb.append(this.declined);
        sb.append(", asked=");
        sb.append(this.asked);
        sb.append(')');
        return sb.toString();
    }
}
