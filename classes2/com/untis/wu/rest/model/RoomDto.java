// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomDto
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
    
    public RoomDto active(final Boolean active) {
        this.active = active;
        return this;
    }
    
    public RoomDto deleted(final Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    public RoomDto displayName(final String displayName) {
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
            final RoomDto roomDto = (RoomDto)o;
            if (!Objects.equals(this.active, roomDto.active) || !Objects.equals(this.deleted, roomDto.deleted) || !Objects.equals(this.displayName, roomDto.displayName) || !Objects.equals(this.id, roomDto.id)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "true", value = "The \"active\"-status of the room.")
    public Boolean getActive() {
        return this.active;
    }
    
    @ApiModelProperty(example = "false", value = "The \"deleted\"-status of the room.")
    public Boolean getDeleted() {
        return this.deleted;
    }
    
    @ApiModelProperty(example = "TS1", required = true, value = "A pre-formatted String that should be used to display the room.")
    public String getDisplayName() {
        return this.displayName;
    }
    
    @ApiModelProperty(example = "10", required = true, value = "The Id of the room.")
    public Long getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.active, this.deleted, this.displayName, this.id);
    }
    
    public RoomDto id(final Long id) {
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
        sb.append("class RoomDto {\n");
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
