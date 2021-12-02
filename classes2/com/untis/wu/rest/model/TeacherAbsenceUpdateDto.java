// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeacherAbsenceUpdateDto
{
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("note")
    private String note;
    @JsonProperty("reasonId")
    private Long reasonId;
    @JsonProperty("startDateTime")
    private String startDateTime;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherAbsenceUpdateDto endDateTime(final String endDateTime) {
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
            final TeacherAbsenceUpdateDto teacherAbsenceUpdateDto = (TeacherAbsenceUpdateDto)o;
            if (!Objects.equals(this.endDateTime, teacherAbsenceUpdateDto.endDateTime) || !Objects.equals(this.note, teacherAbsenceUpdateDto.note) || !Objects.equals(this.reasonId, teacherAbsenceUpdateDto.reasonId) || !Objects.equals(this.startDateTime, teacherAbsenceUpdateDto.startDateTime)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "2020-01-05T23:59:59Z", required = true, value = "The end of the teacher-absence in ISO 8601 format.")
    public String getEndDateTime() {
        return this.endDateTime;
    }
    
    @ApiModelProperty(example = "I'll probably be back next week!", value = "A note regarding the teacher-absence.")
    public String getNote() {
        return this.note;
    }
    
    @ApiModelProperty(example = "17", value = "The ID of this teacher-absence's teacher-absence-reason.")
    public Long getReasonId() {
        return this.reasonId;
    }
    
    @ApiModelProperty(example = "2019-12-23T07:45:00Z", required = true, value = "The begin of the teacher-absence in ISO 8601 format.")
    public String getStartDateTime() {
        return this.startDateTime;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.endDateTime, this.note, this.reasonId, this.startDateTime);
    }
    
    public TeacherAbsenceUpdateDto note(final String note) {
        this.note = note;
        return this;
    }
    
    public TeacherAbsenceUpdateDto reasonId(final Long reasonId) {
        this.reasonId = reasonId;
        return this;
    }
    
    public void setEndDateTime(final String endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    public void setNote(final String note) {
        this.note = note;
    }
    
    public void setReasonId(final Long reasonId) {
        this.reasonId = reasonId;
    }
    
    public void setStartDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    public TeacherAbsenceUpdateDto startDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherAbsenceUpdateDto {\n");
        sb.append("    endDateTime: ");
        sb.append(this.toIndentedString(this.endDateTime));
        sb.append("\n");
        sb.append("    note: ");
        sb.append(this.toIndentedString(this.note));
        sb.append("\n");
        sb.append("    reasonId: ");
        sb.append(this.toIndentedString(this.reasonId));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.toIndentedString(this.startDateTime));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
