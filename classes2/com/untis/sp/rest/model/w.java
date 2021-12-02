// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class w
{
    @JsonProperty("isAbsent")
    private Boolean a;
    @JsonProperty("teacher")
    private v b;
    
    public w() {
        this.b = null;
    }
    
    private String g(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    @ApiModelProperty(required = true, value = "Indicates if the teacher is absent or not.")
    public Boolean a() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "")
    public v b() {
        return this.b;
    }
    
    public w c(final Boolean a) {
        this.a = a;
        return this;
    }
    
    public void d(final Boolean a) {
        this.a = a;
    }
    
    public void e(final v b) {
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final w w = (w)o;
            if (!Objects.equals(this.a, w.a) || !Objects.equals(this.b, w.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public w f(final v b) {
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
        sb.append("class TeamTeacherDto {\n");
        sb.append("    isAbsent: ");
        sb.append(this.g(this.a));
        sb.append("\n");
        sb.append("    teacher: ");
        sb.append(this.g(this.b));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
