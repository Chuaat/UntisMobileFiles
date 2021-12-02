// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WuCurrentUserDtoPermissions
{
    @JsonProperty("views")
    private List<String> views;
    
    public WuCurrentUserDtoPermissions() {
        this.views = new ArrayList<String>();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public WuCurrentUserDtoPermissions addViewsItem(final String s) {
        if (this.views == null) {
            this.views = new ArrayList<String>();
        }
        this.views.add(s);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.views, ((WuCurrentUserDtoPermissions)o).views));
    }
    
    @ApiModelProperty(example = "[TIMETABLE_CLASS, CLASS_REGISTER, ...]", value = "The available views the user has access to.")
    public List<String> getViews() {
        return this.views;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.views);
    }
    
    public void setViews(final List<String> views) {
        this.views = views;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class WuCurrentUserDtoPermissions {\n");
        sb.append("    views: ");
        sb.append(this.toIndentedString(this.views));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public WuCurrentUserDtoPermissions views(final List<String> views) {
        this.views = views;
        return this;
    }
}
