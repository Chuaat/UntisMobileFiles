// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TeacherSubstitutionDataDto
{
    @JsonProperty("knownKlassenIds")
    private List<Long> knownKlassenIds;
    @JsonProperty("knownSubjectIds")
    private List<Long> knownSubjectIds;
    @JsonProperty("periods")
    private List<PeriodDto> periods;
    @JsonProperty("standbys")
    private List<PeriodDto> standbys;
    @JsonProperty("teacherId")
    private Long teacherId;
    
    public TeacherSubstitutionDataDto() {
        this.knownKlassenIds = new ArrayList<Long>();
        this.knownSubjectIds = new ArrayList<Long>();
        this.periods = new ArrayList<PeriodDto>();
        this.standbys = new ArrayList<PeriodDto>();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherSubstitutionDataDto addKnownKlassenIdsItem(final Long n) {
        if (this.knownKlassenIds == null) {
            this.knownKlassenIds = new ArrayList<Long>();
        }
        this.knownKlassenIds.add(n);
        return this;
    }
    
    public TeacherSubstitutionDataDto addKnownSubjectIdsItem(final Long n) {
        if (this.knownSubjectIds == null) {
            this.knownSubjectIds = new ArrayList<Long>();
        }
        this.knownSubjectIds.add(n);
        return this;
    }
    
    public TeacherSubstitutionDataDto addPeriodsItem(final PeriodDto periodDto) {
        if (this.periods == null) {
            this.periods = new ArrayList<PeriodDto>();
        }
        this.periods.add(periodDto);
        return this;
    }
    
    public TeacherSubstitutionDataDto addStandbysItem(final PeriodDto periodDto) {
        if (this.standbys == null) {
            this.standbys = new ArrayList<PeriodDto>();
        }
        this.standbys.add(periodDto);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final TeacherSubstitutionDataDto teacherSubstitutionDataDto = (TeacherSubstitutionDataDto)o;
            if (!Objects.equals(this.knownKlassenIds, teacherSubstitutionDataDto.knownKlassenIds) || !Objects.equals(this.knownSubjectIds, teacherSubstitutionDataDto.knownSubjectIds) || !Objects.equals(this.periods, teacherSubstitutionDataDto.periods) || !Objects.equals(this.standbys, teacherSubstitutionDataDto.standbys) || !Objects.equals(this.teacherId, teacherSubstitutionDataDto.teacherId)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "[25, 26]", value = "The ID(s) of the klasse(n) that this teacher knows.")
    public List<Long> getKnownKlassenIds() {
        return this.knownKlassenIds;
    }
    
    @ApiModelProperty(example = "[6, 18]", value = "The ID(s) of the subject(s) that this teacher knows.")
    public List<Long> getKnownSubjectIds() {
        return this.knownSubjectIds;
    }
    
    @ApiModelProperty("The (regular) periods of this teacher for the requested date.")
    public List<PeriodDto> getPeriods() {
        return this.periods;
    }
    
    @ApiModelProperty("The standby-periods of this teacher for the requested date.")
    public List<PeriodDto> getStandbys() {
        return this.standbys;
    }
    
    @ApiModelProperty(example = "97", value = "The Id of the teacher.")
    public Long getTeacherId() {
        return this.teacherId;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.knownKlassenIds, this.knownSubjectIds, this.periods, this.standbys, this.teacherId);
    }
    
    public TeacherSubstitutionDataDto knownKlassenIds(final List<Long> knownKlassenIds) {
        this.knownKlassenIds = knownKlassenIds;
        return this;
    }
    
    public TeacherSubstitutionDataDto knownSubjectIds(final List<Long> knownSubjectIds) {
        this.knownSubjectIds = knownSubjectIds;
        return this;
    }
    
    public TeacherSubstitutionDataDto periods(final List<PeriodDto> periods) {
        this.periods = periods;
        return this;
    }
    
    public void setKnownKlassenIds(final List<Long> knownKlassenIds) {
        this.knownKlassenIds = knownKlassenIds;
    }
    
    public void setKnownSubjectIds(final List<Long> knownSubjectIds) {
        this.knownSubjectIds = knownSubjectIds;
    }
    
    public void setPeriods(final List<PeriodDto> periods) {
        this.periods = periods;
    }
    
    public void setStandbys(final List<PeriodDto> standbys) {
        this.standbys = standbys;
    }
    
    public void setTeacherId(final Long teacherId) {
        this.teacherId = teacherId;
    }
    
    public TeacherSubstitutionDataDto standbys(final List<PeriodDto> standbys) {
        this.standbys = standbys;
        return this;
    }
    
    public TeacherSubstitutionDataDto teacherId(final Long teacherId) {
        this.teacherId = teacherId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherSubstitutionDataDto {\n");
        sb.append("    knownKlassenIds: ");
        sb.append(this.toIndentedString(this.knownKlassenIds));
        sb.append("\n");
        sb.append("    knownSubjectIds: ");
        sb.append(this.toIndentedString(this.knownSubjectIds));
        sb.append("\n");
        sb.append("    periods: ");
        sb.append(this.toIndentedString(this.periods));
        sb.append("\n");
        sb.append("    standbys: ");
        sb.append(this.toIndentedString(this.standbys));
        sb.append("\n");
        sb.append("    teacherId: ");
        sb.append(this.toIndentedString(this.teacherId));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
