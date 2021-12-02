// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NoSubstituteDto
{
    @JsonProperty("teacherId")
    private Long teacherId;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.teacherId, ((NoSubstituteDto)o).teacherId));
    }
    
    @ApiModelProperty(example = "27", value = "The original teacher of the period that should be substituted.")
    public Long getTeacherId() {
        return this.teacherId;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.teacherId);
    }
    
    public void setTeacherId(final Long teacherId) {
        this.teacherId = teacherId;
    }
    
    public NoSubstituteDto teacherId(final Long teacherId) {
        this.teacherId = teacherId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class NoSubstituteDto {\n");
        sb.append("    teacherId: ");
        sb.append(this.toIndentedString(this.teacherId));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
