// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TeacherRefDto
{
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public TeacherRefDto displayName(final String displayName) {
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
            final TeacherRefDto teacherRefDto = (TeacherRefDto)o;
            if (!Objects.equals(this.displayName, teacherRefDto.displayName) || !Objects.equals(this.id, teacherRefDto.id) || !Objects.equals(this.imageUrl, teacherRefDto.imageUrl)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "Nobel Alfred", required = true, value = "A pre-formatted String that should be used to display the teacher.")
    public String getDisplayName() {
        return this.displayName;
    }
    
    @ApiModelProperty(example = "97", required = true, value = "The Id of the teacher.")
    public Long getId() {
        return this.id;
    }
    
    @ApiModelProperty(example = "https://images.webuntis.com/...", required = true, value = "An URL pointing to the teacher's image.")
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.displayName, this.id, this.imageUrl);
    }
    
    public TeacherRefDto id(final Long id) {
        this.id = id;
        return this;
    }
    
    public TeacherRefDto imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherRefDto {\n");
        sb.append("    displayName: ");
        sb.append(this.toIndentedString(this.displayName));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("    imageUrl: ");
        sb.append(this.toIndentedString(this.imageUrl));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
