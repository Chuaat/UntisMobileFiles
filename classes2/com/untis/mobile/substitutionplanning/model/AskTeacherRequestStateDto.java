// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDto;", "", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDtoRequestStateEnum;", "component1", "Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "component2", "requestState", "solutionOption", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDtoRequestStateEnum;", "getRequestState", "()Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDtoRequestStateEnum;", "setRequestState", "(Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDtoRequestStateEnum;)V", "Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "getSolutionOption", "()Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "setSolutionOption", "(Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDtoRequestStateEnum;Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AskTeacherRequestStateDto
{
    @f
    private AskTeacherRequestStateDtoRequestStateEnum requestState;
    @f
    private SolutionTypeOptionDto solutionOption;
    
    public AskTeacherRequestStateDto() {
        this(null, null, 3, null);
    }
    
    public AskTeacherRequestStateDto(@f final AskTeacherRequestStateDtoRequestStateEnum requestState, @f final SolutionTypeOptionDto solutionOption) {
        this.requestState = requestState;
        this.solutionOption = solutionOption;
    }
    
    @f
    public final AskTeacherRequestStateDtoRequestStateEnum component1() {
        return this.requestState;
    }
    
    @f
    public final SolutionTypeOptionDto component2() {
        return this.solutionOption;
    }
    
    @e
    public final AskTeacherRequestStateDto copy(@f final AskTeacherRequestStateDtoRequestStateEnum askTeacherRequestStateDtoRequestStateEnum, @f final SolutionTypeOptionDto solutionTypeOptionDto) {
        return new AskTeacherRequestStateDto(askTeacherRequestStateDtoRequestStateEnum, solutionTypeOptionDto);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AskTeacherRequestStateDto)) {
            return false;
        }
        final AskTeacherRequestStateDto askTeacherRequestStateDto = (AskTeacherRequestStateDto)o;
        return this.requestState == askTeacherRequestStateDto.requestState && k0.g(this.solutionOption, askTeacherRequestStateDto.solutionOption);
    }
    
    @f
    public final AskTeacherRequestStateDtoRequestStateEnum getRequestState() {
        return this.requestState;
    }
    
    @f
    public final SolutionTypeOptionDto getSolutionOption() {
        return this.solutionOption;
    }
    
    @Override
    public int hashCode() {
        final AskTeacherRequestStateDtoRequestStateEnum requestState = this.requestState;
        int hashCode = 0;
        int hashCode2;
        if (requestState == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = requestState.hashCode();
        }
        final SolutionTypeOptionDto solutionOption = this.solutionOption;
        if (solutionOption != null) {
            hashCode = solutionOption.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final void setRequestState(@f final AskTeacherRequestStateDtoRequestStateEnum requestState) {
        this.requestState = requestState;
    }
    
    public final void setSolutionOption(@f final SolutionTypeOptionDto solutionOption) {
        this.solutionOption = solutionOption;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AskTeacherRequestStateDto(requestState=");
        sb.append(this.requestState);
        sb.append(", solutionOption=");
        sb.append(this.solutionOption);
        sb.append(')');
        return sb.toString();
    }
}
