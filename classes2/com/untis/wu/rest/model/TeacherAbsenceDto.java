// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeacherAbsenceDto
{
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("note")
    private String note;
    @JsonProperty("reasonId")
    private Long reasonId;
    @JsonProperty("reasonText")
    private String reasonText;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("teacherId")
    private Long teacherId;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherAbsenceDto endDateTime(final String endDateTime) {
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
            final TeacherAbsenceDto teacherAbsenceDto = (TeacherAbsenceDto)o;
            if (!Objects.equals(this.endDateTime, teacherAbsenceDto.endDateTime) || !Objects.equals(this.id, teacherAbsenceDto.id) || !Objects.equals(this.note, teacherAbsenceDto.note) || !Objects.equals(this.reasonId, teacherAbsenceDto.reasonId) || !Objects.equals(this.reasonText, teacherAbsenceDto.reasonText) || !Objects.equals(this.startDateTime, teacherAbsenceDto.startDateTime) || !Objects.equals(this.teacherId, teacherAbsenceDto.teacherId)) {
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
    
    @ApiModelProperty(example = "5831", required = true, value = "The Id of the teacher-absence.")
    public Long getId() {
        return this.id;
    }
    
    @ApiModelProperty(example = "I'll probably be back next week!", value = "A note regarding the teacher-absence.")
    public String getNote() {
        return this.note;
    }
    
    @ApiModelProperty(example = "17", value = "The ID of this teacher-absence's teacher-absence-reason.")
    public Long getReasonId() {
        return this.reasonId;
    }
    
    @ApiModelProperty(example = "Vacation", value = "The corresponding reason for a given teacher-absence.")
    public String getReasonText() {
        return this.reasonText;
    }
    
    @ApiModelProperty(example = "2019-12-23T07:45:00Z", required = true, value = "The begin of the teacher-absence in ISO 8601 format.")
    public String getStartDateTime() {
        return this.startDateTime;
    }
    
    @ApiModelProperty(example = "97", required = true, value = "The ID of this teacher-absence's teacher.")
    public Long getTeacherId() {
        return this.teacherId;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.endDateTime, this.id, this.note, this.reasonId, this.reasonText, this.startDateTime, this.teacherId);
    }
    
    public TeacherAbsenceDto id(final Long id) {
        this.id = id;
        return this;
    }
    
    public TeacherAbsenceDto note(final String note) {
        this.note = note;
        return this;
    }
    
    public TeacherAbsenceDto reasonId(final Long reasonId) {
        this.reasonId = reasonId;
        return this;
    }
    
    public TeacherAbsenceDto reasonText(final String reasonText) {
        this.reasonText = reasonText;
        return this;
    }
    
    public void setEndDateTime(final String endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setNote(final String note) {
        this.note = note;
    }
    
    public void setReasonId(final Long reasonId) {
        this.reasonId = reasonId;
    }
    
    public void setReasonText(final String reasonText) {
        this.reasonText = reasonText;
    }
    
    public void setStartDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    public void setTeacherId(final Long teacherId) {
        this.teacherId = teacherId;
    }
    
    public TeacherAbsenceDto startDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    public TeacherAbsenceDto teacherId(final Long teacherId) {
        this.teacherId = teacherId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherAbsenceDto {\n");
        sb.append("    endDateTime: ");
        sb.append(this.toIndentedString(this.endDateTime));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("    note: ");
        sb.append(this.toIndentedString(this.note));
        sb.append("\n");
        sb.append("    reasonId: ");
        sb.append(this.toIndentedString(this.reasonId));
        sb.append("\n");
        sb.append("    reasonText: ");
        sb.append(this.toIndentedString(this.reasonText));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.toIndentedString(this.startDateTime));
        sb.append("\n");
        sb.append("    teacherId: ");
        sb.append(this.toIndentedString(this.teacherId));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
