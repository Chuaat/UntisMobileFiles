// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubjectRefDto
{
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("id")
    private Long id;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public SubjectRefDto displayName(final String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final SubjectRefDto subjectRefDto = (SubjectRefDto)o;
            if (!Objects.equals(this.displayName, subjectRefDto.displayName) || !Objects.equals(this.id, subjectRefDto.id)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "Math", required = true, value = "A pre-formatted String that should be used to display the subject.")
    public String getDisplayName() {
        return this.displayName;
    }
    
    @ApiModelProperty(example = "46", required = true, value = "Id of Subject")
    public Long getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.displayName, this.id);
    }
    
    public SubjectRefDto id(final Long id) {
        this.id = id;
        return this;
    }
    
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class SubjectRefDto {\n");
        sb.append("    displayName: ");
        sb.append(this.toIndentedString(this.displayName));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
