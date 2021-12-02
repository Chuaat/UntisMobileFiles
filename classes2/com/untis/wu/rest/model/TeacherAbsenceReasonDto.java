// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeacherAbsenceReasonDto
{
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("name")
    private String name;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherAbsenceReasonDto active(final Boolean active) {
        this.active = active;
        return this;
    }
    
    public TeacherAbsenceReasonDto displayName(final String displayName) {
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
            final TeacherAbsenceReasonDto teacherAbsenceReasonDto = (TeacherAbsenceReasonDto)o;
            if (!Objects.equals(this.active, teacherAbsenceReasonDto.active) || !Objects.equals(this.displayName, teacherAbsenceReasonDto.displayName) || !Objects.equals(this.id, teacherAbsenceReasonDto.id) || !Objects.equals(this.longName, teacherAbsenceReasonDto.longName) || !Objects.equals(this.name, teacherAbsenceReasonDto.name)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "true", value = "The \"active\"-status of the teacher-absence-reason.")
    public Boolean getActive() {
        return this.active;
    }
    
    @ApiModelProperty(example = "External education / training.", required = true, value = "A pre-formatted String that should be used to display the teacher-absence-reason.")
    public String getDisplayName() {
        return this.displayName;
    }
    
    @ApiModelProperty(example = "17", required = true, value = "The Id of the teacher-absence-reason.")
    public Long getId() {
        return this.id;
    }
    
    @ApiModelProperty(example = "External education / training.", value = "The full name of the teacher-absence-reason.")
    public String getLongName() {
        return this.longName;
    }
    
    @ApiModelProperty(example = "EET", value = "The short name (e.g. abbreviation) of the teacher-absence-reason.")
    public String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.active, this.displayName, this.id, this.longName, this.name);
    }
    
    public TeacherAbsenceReasonDto id(final Long id) {
        this.id = id;
        return this;
    }
    
    public TeacherAbsenceReasonDto longName(final String longName) {
        this.longName = longName;
        return this;
    }
    
    public TeacherAbsenceReasonDto name(final String name) {
        this.name = name;
        return this;
    }
    
    public void setActive(final Boolean active) {
        this.active = active;
    }
    
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setLongName(final String longName) {
        this.longName = longName;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherAbsenceReasonDto {\n");
        sb.append("    active: ");
        sb.append(this.toIndentedString(this.active));
        sb.append("\n");
        sb.append("    displayName: ");
        sb.append(this.toIndentedString(this.displayName));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("    longName: ");
        sb.append(this.toIndentedString(this.longName));
        sb.append("\n");
        sb.append("    name: ");
        sb.append(this.toIndentedString(this.name));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
