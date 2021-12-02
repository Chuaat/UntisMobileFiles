// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class IdsDto
{
    @JsonProperty("ids")
    private List<Long> ids;
    
    public IdsDto() {
        this.ids = new ArrayList<Long>();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public IdsDto addIdsItem(final Long n) {
        if (this.ids == null) {
            this.ids = new ArrayList<Long>();
        }
        this.ids.add(n);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.ids, ((IdsDto)o).ids));
    }
    
    @ApiModelProperty("")
    public List<Long> getIds() {
        return this.ids;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.ids);
    }
    
    public IdsDto ids(final List<Long> ids) {
        this.ids = ids;
        return this;
    }
    
    public void setIds(final List<Long> ids) {
        this.ids = ids;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class IdsDto {\n");
        sb.append("    ids: ");
        sb.append(this.toIndentedString(this.ids));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
