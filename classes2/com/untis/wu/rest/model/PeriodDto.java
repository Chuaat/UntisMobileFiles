// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PeriodDto
{
    @JsonProperty("currentTeacherIds")
    private List<Long> currentTeacherIds;
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("klassenIds")
    private List<Long> klassenIds;
    @JsonProperty("lessonCode")
    private String lessonCode;
    @JsonProperty("orgTeacherIds")
    private List<Long> orgTeacherIds;
    @JsonProperty("roomIds")
    private List<Long> roomIds;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("states")
    private List<PeriodDtoStatesEnum> states;
    @JsonProperty("subjectId")
    private Long subjectId;
    @JsonProperty("unitOfDay")
    private Integer unitOfDay;
    
    public PeriodDto() {
        this.currentTeacherIds = new ArrayList<Long>();
        this.klassenIds = new ArrayList<Long>();
        this.orgTeacherIds = new ArrayList<Long>();
        this.roomIds = new ArrayList<Long>();
        this.states = new ArrayList<PeriodDtoStatesEnum>();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public PeriodDto addCurrentTeacherIdsItem(final Long n) {
        if (this.currentTeacherIds == null) {
            this.currentTeacherIds = new ArrayList<Long>();
        }
        this.currentTeacherIds.add(n);
        return this;
    }
    
    public PeriodDto addKlassenIdsItem(final Long n) {
        if (this.klassenIds == null) {
            this.klassenIds = new ArrayList<Long>();
        }
        this.klassenIds.add(n);
        return this;
    }
    
    public PeriodDto addOrgTeacherIdsItem(final Long n) {
        if (this.orgTeacherIds == null) {
            this.orgTeacherIds = new ArrayList<Long>();
        }
        this.orgTeacherIds.add(n);
        return this;
    }
    
    public PeriodDto addRoomIdsItem(final Long n) {
        if (this.roomIds == null) {
            this.roomIds = new ArrayList<Long>();
        }
        this.roomIds.add(n);
        return this;
    }
    
    public PeriodDto addStatesItem(final PeriodDtoStatesEnum periodDtoStatesEnum) {
        if (this.states == null) {
            this.states = new ArrayList<PeriodDtoStatesEnum>();
        }
        this.states.add(periodDtoStatesEnum);
        return this;
    }
    
    public PeriodDto currentTeacherIds(final List<Long> currentTeacherIds) {
        this.currentTeacherIds = currentTeacherIds;
        return this;
    }
    
    public PeriodDto endDateTime(final String endDateTime) {
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
            final PeriodDto periodDto = (PeriodDto)o;
            if (!Objects.equals(this.currentTeacherIds, periodDto.currentTeacherIds) || !Objects.equals(this.endDateTime, periodDto.endDateTime) || !Objects.equals(this.id, periodDto.id) || !Objects.equals(this.klassenIds, periodDto.klassenIds) || !Objects.equals(this.lessonCode, periodDto.lessonCode) || !Objects.equals(this.orgTeacherIds, periodDto.orgTeacherIds) || !Objects.equals(this.roomIds, periodDto.roomIds) || !Objects.equals(this.startDateTime, periodDto.startDateTime) || !Objects.equals(this.states, periodDto.states) || !Objects.equals(this.subjectId, periodDto.subjectId) || !Objects.equals(this.unitOfDay, periodDto.unitOfDay)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "[8, 12]", value = "The ID(s) of this period's teacher(s).")
    public List<Long> getCurrentTeacherIds() {
        return this.currentTeacherIds;
    }
    
    @ApiModelProperty(example = "2019-06-01T08:55:00Z", required = true, value = "The end of the period in ISO 8601 format.")
    public String getEndDateTime() {
        return this.endDateTime;
    }
    
    @ApiModelProperty(example = "167492", required = true, value = "The Id of the period.")
    public Long getId() {
        return this.id;
    }
    
    @ApiModelProperty(example = "[25, 26]", value = "The ID(s) of this period's klasse(n).")
    public List<Long> getKlassenIds() {
        return this.klassenIds;
    }
    
    @ApiModelProperty(example = "UNTIS_LESSON,UNTIS_ADDITIONAL,UNTIS_OFFICEHOUR ...", value = "Type of periodslesson")
    public String getLessonCode() {
        return this.lessonCode;
    }
    
    @ApiModelProperty("")
    public List<Long> getOrgTeacherIds() {
        return this.orgTeacherIds;
    }
    
    @ApiModelProperty(example = "[18, 19]", value = "The ID(s) of this period's room(s).")
    public List<Long> getRoomIds() {
        return this.roomIds;
    }
    
    @ApiModelProperty(example = "2019-06-01T08:10:00Z", required = true, value = "The begin of the period in ISO 8601 format.")
    public String getStartDateTime() {
        return this.startDateTime;
    }
    
    @ApiModelProperty(example = "[CANCELLED]", value = "")
    public List<PeriodDtoStatesEnum> getStates() {
        return this.states;
    }
    
    @ApiModelProperty(example = "25", value = "The ID of this period's subject.")
    public Long getSubjectId() {
        return this.subjectId;
    }
    
    @ApiModelProperty(example = "2", required = true, value = "The ordinal number of this period on this day. (This is the n-th period on that day according to the WU timegrid). Might be 0 if WU cannot calculate!")
    public Integer getUnitOfDay() {
        return this.unitOfDay;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.currentTeacherIds, this.endDateTime, this.id, this.klassenIds, this.lessonCode, this.orgTeacherIds, this.roomIds, this.startDateTime, this.states, this.subjectId, this.unitOfDay);
    }
    
    public PeriodDto id(final Long id) {
        this.id = id;
        return this;
    }
    
    public PeriodDto klassenIds(final List<Long> klassenIds) {
        this.klassenIds = klassenIds;
        return this;
    }
    
    public PeriodDto lessonCode(final String lessonCode) {
        this.lessonCode = lessonCode;
        return this;
    }
    
    public PeriodDto orgTeacherIds(final List<Long> orgTeacherIds) {
        this.orgTeacherIds = orgTeacherIds;
        return this;
    }
    
    public PeriodDto roomIds(final List<Long> roomIds) {
        this.roomIds = roomIds;
        return this;
    }
    
    public void setCurrentTeacherIds(final List<Long> currentTeacherIds) {
        this.currentTeacherIds = currentTeacherIds;
    }
    
    public void setEndDateTime(final String endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setKlassenIds(final List<Long> klassenIds) {
        this.klassenIds = klassenIds;
    }
    
    public void setLessonCode(final String lessonCode) {
        this.lessonCode = lessonCode;
    }
    
    public void setOrgTeacherIds(final List<Long> orgTeacherIds) {
        this.orgTeacherIds = orgTeacherIds;
    }
    
    public void setRoomIds(final List<Long> roomIds) {
        this.roomIds = roomIds;
    }
    
    public void setStartDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    public void setStates(final List<PeriodDtoStatesEnum> states) {
        this.states = states;
    }
    
    public void setSubjectId(final Long subjectId) {
        this.subjectId = subjectId;
    }
    
    public void setUnitOfDay(final Integer unitOfDay) {
        this.unitOfDay = unitOfDay;
    }
    
    public PeriodDto startDateTime(final String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    public PeriodDto states(final List<PeriodDtoStatesEnum> states) {
        this.states = states;
        return this;
    }
    
    public PeriodDto subjectId(final Long subjectId) {
        this.subjectId = subjectId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class PeriodDto {\n");
        sb.append("    currentTeacherIds: ");
        sb.append(this.toIndentedString(this.currentTeacherIds));
        sb.append("\n");
        sb.append("    endDateTime: ");
        sb.append(this.toIndentedString(this.endDateTime));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("    klassenIds: ");
        sb.append(this.toIndentedString(this.klassenIds));
        sb.append("\n");
        sb.append("    lessonCode: ");
        sb.append(this.toIndentedString(this.lessonCode));
        sb.append("\n");
        sb.append("    orgTeacherIds: ");
        sb.append(this.toIndentedString(this.orgTeacherIds));
        sb.append("\n");
        sb.append("    roomIds: ");
        sb.append(this.toIndentedString(this.roomIds));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.toIndentedString(this.startDateTime));
        sb.append("\n");
        sb.append("    states: ");
        sb.append(this.toIndentedString(this.states));
        sb.append("\n");
        sb.append("    subjectId: ");
        sb.append(this.toIndentedString(this.subjectId));
        sb.append("\n");
        sb.append("    unitOfDay: ");
        sb.append(this.toIndentedString(this.unitOfDay));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public PeriodDto unitOfDay(final Integer unitOfDay) {
        this.unitOfDay = unitOfDay;
        return this;
    }
}
