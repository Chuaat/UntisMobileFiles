// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeacherDto
{
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("birthdate")
    private String birthdate;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("entryDate")
    private String entryDate;
    @JsonProperty("exitDate")
    private String exitDate;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("personnelNumber")
    private String personnelNumber;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherDto active(final Boolean active) {
        this.active = active;
        return this;
    }
    
    public TeacherDto birthdate(final String birthdate) {
        this.birthdate = birthdate;
        return this;
    }
    
    public TeacherDto deleted(final Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    public TeacherDto displayName(final String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    public TeacherDto entryDate(final String entryDate) {
        this.entryDate = entryDate;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final TeacherDto teacherDto = (TeacherDto)o;
            if (!Objects.equals(this.active, teacherDto.active) || !Objects.equals(this.birthdate, teacherDto.birthdate) || !Objects.equals(this.deleted, teacherDto.deleted) || !Objects.equals(this.displayName, teacherDto.displayName) || !Objects.equals(this.entryDate, teacherDto.entryDate) || !Objects.equals(this.exitDate, teacherDto.exitDate) || !Objects.equals(this.firstName, teacherDto.firstName) || !Objects.equals(this.id, teacherDto.id) || !Objects.equals(this.imageUrl, teacherDto.imageUrl) || !Objects.equals(this.lastName, teacherDto.lastName) || !Objects.equals(this.name, teacherDto.name) || !Objects.equals(this.personnelNumber, teacherDto.personnelNumber)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public TeacherDto exitDate(final String exitDate) {
        this.exitDate = exitDate;
        return this;
    }
    
    public TeacherDto firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "The \"active\"-status of the teacher.")
    public Boolean getActive() {
        return this.active;
    }
    
    @ApiModelProperty(example = "1996-12-17", value = "The teacher's birthdate")
    public String getBirthdate() {
        return this.birthdate;
    }
    
    @ApiModelProperty(example = "false", value = "The \"deleted\"-status of the teacher.")
    public Boolean getDeleted() {
        return this.deleted;
    }
    
    @ApiModelProperty(example = "Nobel Alfred", value = "A pre-formatted String that should be used to display the teacher.")
    public String getDisplayName() {
        return this.displayName;
    }
    
    @ApiModelProperty(example = "2016-09-01", value = "The teacher's entry-date (= 'When has the teacher entered school?').")
    public String getEntryDate() {
        return this.entryDate;
    }
    
    @ApiModelProperty(example = "2019-12-31", value = "The teacher's exit-date (= 'When has the teacher left school?').")
    public String getExitDate() {
        return this.exitDate;
    }
    
    @ApiModelProperty(example = "Alfred", value = "The teacher's first name.")
    public String getFirstName() {
        return this.firstName;
    }
    
    @ApiModelProperty(example = "97", value = "The Id of the teacher.")
    public Long getId() {
        return this.id;
    }
    
    @ApiModelProperty(example = "https://images.webuntis.com/...", value = "An URL pointing to the teacher's image. Will be NULL if the teacher has no image!")
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    @ApiModelProperty(example = "Nobel", value = "The teacher's last name.")
    public String getLastName() {
        return this.lastName;
    }
    
    @ApiModelProperty(example = "nobel", required = true, value = "The short name (e.g. initials or abbreviation) of the teacher.")
    public String getName() {
        return this.name;
    }
    
    @ApiModelProperty(example = "007text", value = "The teacher's personnel number")
    public String getPersonnelNumber() {
        return this.personnelNumber;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.active, this.birthdate, this.deleted, this.displayName, this.entryDate, this.exitDate, this.firstName, this.id, this.imageUrl, this.lastName, this.name, this.personnelNumber);
    }
    
    public TeacherDto id(final Long id) {
        this.id = id;
        return this;
    }
    
    public TeacherDto imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    public TeacherDto lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    public TeacherDto name(final String name) {
        this.name = name;
        return this;
    }
    
    public TeacherDto personnelNumber(final String personnelNumber) {
        this.personnelNumber = personnelNumber;
        return this;
    }
    
    public void setActive(final Boolean active) {
        this.active = active;
    }
    
    public void setBirthdate(final String birthdate) {
        this.birthdate = birthdate;
    }
    
    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }
    
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }
    
    public void setEntryDate(final String entryDate) {
        this.entryDate = entryDate;
    }
    
    public void setExitDate(final String exitDate) {
        this.exitDate = exitDate;
    }
    
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setPersonnelNumber(final String personnelNumber) {
        this.personnelNumber = personnelNumber;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherDto {\n");
        sb.append("    active: ");
        sb.append(this.toIndentedString(this.active));
        sb.append("\n");
        sb.append("    birthdate: ");
        sb.append(this.toIndentedString(this.birthdate));
        sb.append("\n");
        sb.append("    deleted: ");
        sb.append(this.toIndentedString(this.deleted));
        sb.append("\n");
        sb.append("    displayName: ");
        sb.append(this.toIndentedString(this.displayName));
        sb.append("\n");
        sb.append("    entryDate: ");
        sb.append(this.toIndentedString(this.entryDate));
        sb.append("\n");
        sb.append("    exitDate: ");
        sb.append(this.toIndentedString(this.exitDate));
        sb.append("\n");
        sb.append("    firstName: ");
        sb.append(this.toIndentedString(this.firstName));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("    imageUrl: ");
        sb.append(this.toIndentedString(this.imageUrl));
        sb.append("\n");
        sb.append("    lastName: ");
        sb.append(this.toIndentedString(this.lastName));
        sb.append("\n");
        sb.append("    name: ");
        sb.append(this.toIndentedString(this.name));
        sb.append("\n");
        sb.append("    personnelNumber: ");
        sb.append(this.toIndentedString(this.personnelNumber));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
