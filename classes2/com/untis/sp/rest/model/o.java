// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class o
{
    @JsonProperty("allFilterTags")
    private List<r> a;
    @JsonProperty("allSubstitutionOptions")
    private List<m> b;
    @JsonProperty("options")
    private List<m> c;
    @JsonProperty("teacherAbsenceConflict")
    private t d;
    
    public o() {
        this.a = new ArrayList<r>();
        this.b = new ArrayList<m>();
        this.c = new ArrayList<m>();
        this.d = null;
    }
    
    private String p(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public o a(final r r) {
        this.a.add(r);
        return this;
    }
    
    public o b(final m m) {
        this.b.add(m);
        return this;
    }
    
    public o c(final m m) {
        this.c.add(m);
        return this;
    }
    
    public o d(final List<r> a) {
        this.a = a;
        return this;
    }
    
    public o e(final List<m> b) {
        this.b = b;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final o o2 = (o)o;
            if (!Objects.equals(this.a, o2.a) || !Objects.equals(this.b, o2.b) || !Objects.equals(this.c, o2.c) || !Objects.equals(this.d, o2.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(required = true, value = "All available tags to filter the search by.")
    public List<r> f() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "All available substitution-solution-options, no matter if they are in the top-N options already.")
    public List<m> g() {
        return this.b;
    }
    
    @ApiModelProperty(required = true, value = "The top-N solution-options for the given conflict.")
    public List<m> h() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
    
    @ApiModelProperty(required = true, value = "")
    public t i() {
        return this.d;
    }
    
    public o j(final List<m> c) {
        this.c = c;
        return this;
    }
    
    public void k(final List<r> a) {
        this.a = a;
    }
    
    public void l(final List<m> b) {
        this.b = b;
    }
    
    public void m(final List<m> c) {
        this.c = c;
    }
    
    public void n(final t d) {
        this.d = d;
    }
    
    public o o(final t d) {
        this.d = d;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class SolutionViewDto {\n");
        sb.append("    allFilterTags: ");
        sb.append(this.p(this.a));
        sb.append("\n");
        sb.append("    allSubstitutionOptions: ");
        sb.append(this.p(this.b));
        sb.append("\n");
        sb.append("    options: ");
        sb.append(this.p(this.c));
        sb.append("\n");
        sb.append("    teacherAbsenceConflict: ");
        sb.append(this.p(this.d));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
