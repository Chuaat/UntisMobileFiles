// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TeacherLessonRefDto
{
    @JsonProperty("klassen")
    private List<KlasseRefDto> klassen;
    @JsonProperty("subject")
    private SubjectRefDto subject;
    @JsonProperty("unitOfDay")
    private Integer unitOfDay;
    
    public TeacherLessonRefDto() {
        this.klassen = new ArrayList<KlasseRefDto>();
        this.subject = null;
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherLessonRefDto addKlassenItem(final KlasseRefDto klasseRefDto) {
        if (this.klassen == null) {
            this.klassen = new ArrayList<KlasseRefDto>();
        }
        this.klassen.add(klasseRefDto);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final TeacherLessonRefDto teacherLessonRefDto = (TeacherLessonRefDto)o;
            if (!Objects.equals(this.klassen, teacherLessonRefDto.klassen) || !Objects.equals(this.subject, teacherLessonRefDto.subject) || !Objects.equals(this.unitOfDay, teacherLessonRefDto.unitOfDay)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty("Klasse List of Lesson")
    public List<KlasseRefDto> getKlassen() {
        return this.klassen;
    }
    
    @ApiModelProperty("")
    public SubjectRefDto getSubject() {
        return this.subject;
    }
    
    @ApiModelProperty(example = "3", value = "Unit of lesson")
    public Integer getUnitOfDay() {
        return this.unitOfDay;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.klassen, this.subject, this.unitOfDay);
    }
    
    public TeacherLessonRefDto klassen(final List<KlasseRefDto> klassen) {
        this.klassen = klassen;
        return this;
    }
    
    public void setKlassen(final List<KlasseRefDto> klassen) {
        this.klassen = klassen;
    }
    
    public void setSubject(final SubjectRefDto subject) {
        this.subject = subject;
    }
    
    public void setUnitOfDay(final Integer unitOfDay) {
        this.unitOfDay = unitOfDay;
    }
    
    public TeacherLessonRefDto subject(final SubjectRefDto subject) {
        this.subject = subject;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherLessonRefDto {\n");
        sb.append("    klassen: ");
        sb.append(this.toIndentedString(this.klassen));
        sb.append("\n");
        sb.append("    subject: ");
        sb.append(this.toIndentedString(this.subject));
        sb.append("\n");
        sb.append("    unitOfDay: ");
        sb.append(this.toIndentedString(this.unitOfDay));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public TeacherLessonRefDto unitOfDay(final Integer unitOfDay) {
        this.unitOfDay = unitOfDay;
        return this;
    }
}
