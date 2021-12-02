// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/AskTeacherViewDto;", "", "", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "component1", "substitutionRequests", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getSubstitutionRequests", "()Ljava/util/List;", "setSubstitutionRequests", "(Ljava/util/List;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AskTeacherViewDto
{
    @e
    private List<SubstitutionRequestDto> substitutionRequests;
    
    public AskTeacherViewDto(@e final List<SubstitutionRequestDto> substitutionRequests) {
        k0.p(substitutionRequests, "substitutionRequests");
        this.substitutionRequests = substitutionRequests;
    }
    
    @e
    public final List<SubstitutionRequestDto> component1() {
        return this.substitutionRequests;
    }
    
    @e
    public final AskTeacherViewDto copy(@e final List<SubstitutionRequestDto> list) {
        k0.p(list, "substitutionRequests");
        return new AskTeacherViewDto(list);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof AskTeacherViewDto && k0.g(this.substitutionRequests, ((AskTeacherViewDto)o).substitutionRequests));
    }
    
    @e
    public final List<SubstitutionRequestDto> getSubstitutionRequests() {
        return this.substitutionRequests;
    }
    
    @Override
    public int hashCode() {
        return this.substitutionRequests.hashCode();
    }
    
    public final void setSubstitutionRequests(@e final List<SubstitutionRequestDto> substitutionRequests) {
        k0.p(substitutionRequests, "<set-?>");
        this.substitutionRequests = substitutionRequests;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AskTeacherViewDto(substitutionRequests=");
        sb.append(this.substitutionRequests);
        sb.append(')');
        return sb.toString();
    }
}
