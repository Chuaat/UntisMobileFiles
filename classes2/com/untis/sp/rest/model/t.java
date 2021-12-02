// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class t
{
    @JsonProperty("periodConflicts")
    private List<f> a;
    @JsonProperty("teacherAbsence")
    private u b;
    
    public t() {
        this.a = new ArrayList<f>();
        this.b = null;
    }
    
    private String h(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public t a(final f f) {
        this.a.add(f);
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public List<f> b() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "")
    public u c() {
        return this.b;
    }
    
    public t d(final List<f> a) {
        this.a = a;
        return this;
    }
    
    public void e(final List<f> a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final t t = (t)o;
            if (!Objects.equals(this.a, t.a) || !Objects.equals(this.b, t.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public void f(final u b) {
        this.b = b;
    }
    
    public t g(final u b) {
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
        sb.append("class TeacherAbsenceConflictDto {\n");
        sb.append("    periodConflicts: ");
        sb.append(this.h(this.a));
        sb.append("\n");
        sb.append("    teacherAbsence: ");
        sb.append(this.h(this.b));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
