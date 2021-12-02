// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeacherAbsenceViewDto
{
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("reasons")
    private List<TeacherAbsenceReasonRefDto> reasons;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("teachers")
    private List<TeacherRefDto> teachers;
    
    public TeacherAbsenceViewDto() {
        this.reasons = new ArrayList<TeacherAbsenceReasonRefDto>();
        this.teachers = new ArrayList<TeacherRefDto>();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherAbsenceViewDto addReasonsItem(final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<TeacherAbsenceReasonRefDto>();
        }
        this.reasons.add(teacherAbsenceReasonRefDto);
        return this;
    }
    
    public TeacherAbsenceViewDto addTeachersItem(final TeacherRefDto teacherRefDto) {
        if (this.teachers == null) {
            this.teachers = new ArrayList<TeacherRefDto>();
        }
        this.teachers.add(teacherRefDto);
        return this;
    }
    
    public TeacherAbsenceViewDto endDateTime(final String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final TeacherAbsenceViewDto teacherAbsenceViewDto = (TeacherAbsenceViewDto)o;
            if (!Objects.equals(this.endDateTime, teacherAbsenceViewDto.endDateTime) || !Objects.equals(this.reasons, teacherAbsenceViewDto.reasons) || !Objects.equals(this.startDateTime, teacherAbsenceViewDto.startDateTime) || !Objects.equals(this.teachers, teacherAbsenceViewDto.teachers)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "2019-12-23T19:00:00Z", required = true, value = "The default end Date (today) + Time (7pm) of the teacher-absence in ISO 8601 format.")
    public String getEndDateTime() {
        return this.endDateTime;
    }
    
    @ApiModelProperty("The possible absence reasons for a teacher.")
    public List<TeacherAbsenceReasonRefDto> getReasons() {
        return this.reasons;
    }
    
    @ApiModelProperty(example = "2019-12-23T07:00:00Z", required = true, value = "The default start Date (today) + Time (7am) of the teacher-absence in ISO 8601 format.")
    public String getStartDateTime() {
        return this.startDateTime;
    }
    
    @ApiModelProperty("A List of all teachers.")
    public List<TeacherRefDto> getTeachers() {
        return this.teachers;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.endDateTime, this.reasons, this.startDateTime, this.teachers);
    }
    
    public TeacherAbsenceViewDto reasons(final List<TeacherAbsenceReasonRefDto> reasons) {
        this.reasons = reasons;
        return this;
    }
    
    public void setEndDateTime(final String endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    public void setReasons(final List<TeacherAbsenceReasonRefDto> reasons) {
        this.reasons = reasons;
    }
    
    public void setStartDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    public void setTeachers(final List<TeacherRefDto> teachers) {
        this.teachers = teachers;
    }
    
    public TeacherAbsenceViewDto startDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    public TeacherAbsenceViewDto teachers(final List<TeacherRefDto> teachers) {
        this.teachers = teachers;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherAbsenceViewDto {\n");
        sb.append("    endDateTime: ");
        sb.append(this.toIndentedString(this.endDateTime));
        sb.append("\n");
        sb.append("    reasons: ");
        sb.append(this.toIndentedString(this.reasons));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.toIndentedString(this.startDateTime));
        sb.append("\n");
        sb.append("    teachers: ");
        sb.append(this.toIndentedString(this.teachers));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
