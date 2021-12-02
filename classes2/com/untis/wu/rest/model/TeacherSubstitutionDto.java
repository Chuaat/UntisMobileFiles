// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeacherSubstitutionDto
{
    @JsonProperty("newTeacherId")
    private Long newTeacherId;
    @JsonProperty("oldTeacherId")
    private Long oldTeacherId;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final TeacherSubstitutionDto teacherSubstitutionDto = (TeacherSubstitutionDto)o;
            if (!Objects.equals(this.newTeacherId, teacherSubstitutionDto.newTeacherId) || !Objects.equals(this.oldTeacherId, teacherSubstitutionDto.oldTeacherId)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "6", value = "The new, substituting teacher.")
    public Long getNewTeacherId() {
        return this.newTeacherId;
    }
    
    @ApiModelProperty(example = "27", value = "The original teacher of the period that should be substituted.")
    public Long getOldTeacherId() {
        return this.oldTeacherId;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.newTeacherId, this.oldTeacherId);
    }
    
    public TeacherSubstitutionDto newTeacherId(final Long newTeacherId) {
        this.newTeacherId = newTeacherId;
        return this;
    }
    
    public TeacherSubstitutionDto oldTeacherId(final Long oldTeacherId) {
        this.oldTeacherId = oldTeacherId;
        return this;
    }
    
    public void setNewTeacherId(final Long newTeacherId) {
        this.newTeacherId = newTeacherId;
    }
    
    public void setOldTeacherId(final Long oldTeacherId) {
        this.oldTeacherId = oldTeacherId;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherSubstitutionDto {\n");
        sb.append("    newTeacherId: ");
        sb.append(this.toIndentedString(this.newTeacherId));
        sb.append("\n");
        sb.append("    oldTeacherId: ");
        sb.append(this.toIndentedString(this.oldTeacherId));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
