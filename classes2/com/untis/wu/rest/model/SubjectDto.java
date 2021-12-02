// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubjectDto
{
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("deleted")
    private Boolean deleted;
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
    
    public SubjectDto active(final Boolean active) {
        this.active = active;
        return this;
    }
    
    public SubjectDto deleted(final Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    public SubjectDto displayName(final String displayName) {
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
            final SubjectDto subjectDto = (SubjectDto)o;
            if (!Objects.equals(this.active, subjectDto.active) || !Objects.equals(this.deleted, subjectDto.deleted) || !Objects.equals(this.displayName, subjectDto.displayName) || !Objects.equals(this.id, subjectDto.id)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "true", value = "The \"active\"-status of the subject.")
    public Boolean getActive() {
        return this.active;
    }
    
    @ApiModelProperty(example = "false", value = "The \"deleted\"-status of the subject.")
    public Boolean getDeleted() {
        return this.deleted;
    }
    
    @ApiModelProperty(example = "Math", required = true, value = "A pre-formatted String that should be used to display the subject.")
    public String getDisplayName() {
        return this.displayName;
    }
    
    @ApiModelProperty(example = "25", required = true, value = "The Id of the subject.")
    public Long getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.active, this.deleted, this.displayName, this.id);
    }
    
    public SubjectDto id(final Long id) {
        this.id = id;
        return this;
    }
    
    public void setActive(final Boolean active) {
        this.active = active;
    }
    
    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
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
        sb.append("class SubjectDto {\n");
        sb.append("    active: ");
        sb.append(this.toIndentedString(this.active));
        sb.append("\n");
        sb.append("    deleted: ");
        sb.append(this.toIndentedString(this.deleted));
        sb.append("\n");
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
