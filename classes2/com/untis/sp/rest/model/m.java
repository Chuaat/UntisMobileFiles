// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "Represents an option which can be chosen as solution of a period-conflict.")
public class m
{
    @JsonProperty("isAvailable")
    private Boolean a;
    @JsonProperty("isSelected")
    private Boolean b;
    @JsonProperty("shiftedPeriod")
    private i c;
    @JsonProperty("tags")
    private List<r> d;
    @JsonProperty("teacher")
    private v e;
    @JsonProperty("type")
    private l f;
    
    public m() {
        this.c = null;
        this.d = new ArrayList<r>();
        this.e = null;
    }
    
    private String s(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public m a(final r r) {
        if (this.d == null) {
            this.d = new ArrayList<r>();
        }
        this.d.add(r);
        return this;
    }
    
    @ApiModelProperty("Type SUBSTITUTION only: Indicates if the suggested substitution-teacher is available.")
    public Boolean b() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "Indicates if this option is preselected.")
    public Boolean c() {
        return this.b;
    }
    
    @ApiModelProperty("")
    public i d() {
        return this.c;
    }
    
    @ApiModelProperty("Type SUBSTITUTION only: Describes why the suggested substitution-teacher is a good fit.")
    public List<r> e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final m m = (m)o;
            if (!Objects.equals(this.a, m.a) || !Objects.equals(this.b, m.b) || !Objects.equals(this.c, m.c) || !Objects.equals(this.d, m.d) || !Objects.equals(this.e, m.e) || !Objects.equals(this.f, m.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty("")
    public v f() {
        return this.e;
    }
    
    @ApiModelProperty(required = true, value = "")
    public l g() {
        return this.f;
    }
    
    public m h(final Boolean a) {
        this.a = a;
        return this;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
    }
    
    public m i(final Boolean b) {
        this.b = b;
        return this;
    }
    
    public void j(final Boolean a) {
        this.a = a;
    }
    
    public void k(final Boolean b) {
        this.b = b;
    }
    
    public void l(final i c) {
        this.c = c;
    }
    
    public void m(final List<r> d) {
        this.d = d;
    }
    
    public void n(final v e) {
        this.e = e;
    }
    
    public void o(final l f) {
        this.f = f;
    }
    
    public m p(final i c) {
        this.c = c;
        return this;
    }
    
    public m q(final List<r> d) {
        this.d = d;
        return this;
    }
    
    public m r(final v e) {
        this.e = e;
        return this;
    }
    
    public m t(final l f) {
        this.f = f;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class SolutionOptionDto {\n");
        sb.append("    isAvailable: ");
        sb.append(this.s(this.a));
        sb.append("\n");
        sb.append("    isSelected: ");
        sb.append(this.s(this.b));
        sb.append("\n");
        sb.append("    shiftedPeriod: ");
        sb.append(this.s(this.c));
        sb.append("\n");
        sb.append("    tags: ");
        sb.append(this.s(this.d));
        sb.append("\n");
        sb.append("    teacher: ");
        sb.append(this.s(this.e));
        sb.append("\n");
        sb.append("    type: ");
        sb.append(this.s(this.f));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
