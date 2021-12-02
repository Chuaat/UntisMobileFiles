// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b-\u0010.J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003JR\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b \u0010!R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b'\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "component1", "", "component2", "()Ljava/lang/Boolean;", "component3", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "component4", "", "Lcom/untis/mobile/substitutionplanning/model/TagDto;", "component5", "type", "isSelected", "isAvailable", "teacher", "tags", "copy", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/util/List;)Lcom/untis/mobile/substitutionplanning/model/SolutionTypeOptionDto;", "", "toString", "", "hashCode", "other", "equals", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "getType", "()Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "setType", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;)V", "Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "setAvailable", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "getTeacher", "()Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "setTeacher", "(Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SolutionTypeOptionDto
{
    @f
    private Boolean isAvailable;
    @f
    private Boolean isSelected;
    @f
    private List<TagDto> tags;
    @f
    private TeacherRefDto teacher;
    @f
    private SolutionDto.SolutionEnum type;
    
    public SolutionTypeOptionDto() {
        this(null, null, null, null, null, 31, null);
    }
    
    public SolutionTypeOptionDto(@f final SolutionDto.SolutionEnum type, @f final Boolean isSelected, @f final Boolean isAvailable, @f final TeacherRefDto teacher, @f final List<TagDto> tags) {
        this.type = type;
        this.isSelected = isSelected;
        this.isAvailable = isAvailable;
        this.teacher = teacher;
        this.tags = tags;
    }
    
    @f
    public final SolutionDto.SolutionEnum component1() {
        return this.type;
    }
    
    @f
    public final Boolean component2() {
        return this.isSelected;
    }
    
    @f
    public final Boolean component3() {
        return this.isAvailable;
    }
    
    @f
    public final TeacherRefDto component4() {
        return this.teacher;
    }
    
    @f
    public final List<TagDto> component5() {
        return this.tags;
    }
    
    @e
    public final SolutionTypeOptionDto copy(@f final SolutionDto.SolutionEnum solutionEnum, @f final Boolean b, @f final Boolean b2, @f final TeacherRefDto teacherRefDto, @f final List<TagDto> list) {
        return new SolutionTypeOptionDto(solutionEnum, b, b2, teacherRefDto, list);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SolutionTypeOptionDto)) {
            return false;
        }
        final SolutionTypeOptionDto solutionTypeOptionDto = (SolutionTypeOptionDto)o;
        return this.type == solutionTypeOptionDto.type && k0.g(this.isSelected, solutionTypeOptionDto.isSelected) && k0.g(this.isAvailable, solutionTypeOptionDto.isAvailable) && k0.g(this.teacher, solutionTypeOptionDto.teacher) && k0.g(this.tags, solutionTypeOptionDto.tags);
    }
    
    @f
    public final List<TagDto> getTags() {
        return this.tags;
    }
    
    @f
    public final TeacherRefDto getTeacher() {
        return this.teacher;
    }
    
    @f
    public final SolutionDto.SolutionEnum getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final SolutionDto.SolutionEnum type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Boolean isSelected = this.isSelected;
        int hashCode3;
        if (isSelected == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = isSelected.hashCode();
        }
        final Boolean isAvailable = this.isAvailable;
        int hashCode4;
        if (isAvailable == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = isAvailable.hashCode();
        }
        final TeacherRefDto teacher = this.teacher;
        int hashCode5;
        if (teacher == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = teacher.hashCode();
        }
        final List<TagDto> tags = this.tags;
        if (tags != null) {
            hashCode = tags.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @f
    public final Boolean isAvailable() {
        return this.isAvailable;
    }
    
    @f
    public final Boolean isSelected() {
        return this.isSelected;
    }
    
    public final void setAvailable(@f final Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public final void setSelected(@f final Boolean isSelected) {
        this.isSelected = isSelected;
    }
    
    public final void setTags(@f final List<TagDto> tags) {
        this.tags = tags;
    }
    
    public final void setTeacher(@f final TeacherRefDto teacher) {
        this.teacher = teacher;
    }
    
    public final void setType(@f final SolutionDto.SolutionEnum type) {
        this.type = type;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SolutionTypeOptionDto(type=");
        sb.append(this.type);
        sb.append(", isSelected=");
        sb.append(this.isSelected);
        sb.append(", isAvailable=");
        sb.append(this.isAvailable);
        sb.append(", teacher=");
        sb.append(this.teacher);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(')');
        return sb.toString();
    }
}
