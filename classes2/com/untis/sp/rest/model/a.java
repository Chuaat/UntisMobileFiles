// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class a
{
    @JsonProperty("displayName")
    private String a;
    @JsonProperty("id")
    private Long b;
    
    private String g(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public a a(final String a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(example = "Sick", required = true, value = "A pre-formatted String that should be used to display the absence reason.")
    public String b() {
        return this.a;
    }
    
    @ApiModelProperty(example = "21", required = true, value = "The SP id of the TeacherAbsenceReason")
    public Long c() {
        return this.b;
    }
    
    public a d(final Long b) {
        this.b = b;
        return this;
    }
    
    public void e(final String a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final a a = (a)o;
            if (!Objects.equals(this.a, a.a) || !Objects.equals(this.b, a.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public void f(final Long b) {
        this.b = b;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AbsenceReasonRefDto {\n");
        sb.append("    displayName: ");
        sb.append(this.g(this.a));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.g(this.b));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
