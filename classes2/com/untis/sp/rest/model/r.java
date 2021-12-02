// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "Tags describe why some teacher is a good fit for a given conflict.")
public class r
{
    @JsonProperty("displayName")
    private String a;
    @JsonProperty("type")
    private s b;
    
    private String f(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public r a(final String a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty("Type ADDITIONAL_ATTENDANCE: The pre-formatted additional attendance of the teacher, e.g. +2h 45min. Type HAS_ABSENCE: The reason of absence or null (if not available). Type HAS_PERIOD_COLLISION: The pre-formatted colliding period, e.g. 'Maths - 1a', or null (if not available).")
    public String b() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "")
    public s c() {
        return this.b;
    }
    
    public void d(final String a) {
        this.a = a;
    }
    
    public void e(final s b) {
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final r r = (r)o;
            if (!Objects.equals(this.a, r.a) || !Objects.equals(this.b, r.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public r g(final s b) {
        this.b = b;
        return this;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TagDto {\n");
        sb.append("    displayName: ");
        sb.append(this.f(this.a));
        sb.append("\n");
        sb.append("    type: ");
        sb.append(this.f(this.b));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
