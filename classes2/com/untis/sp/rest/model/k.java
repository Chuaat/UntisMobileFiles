// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class k
{
    @JsonProperty("conflictId")
    private Long a;
    @JsonProperty("id")
    private Long b;
    @JsonProperty("isPublished")
    private Boolean c;
    @JsonProperty("shiftedPeriod")
    private i d;
    @JsonProperty("teacher")
    private v e;
    @JsonProperty("type")
    private l f;
    
    public k() {
        this.d = null;
        this.e = null;
    }
    
    private String r(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public k a(final Long a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(example = "3", required = true, value = "The Id of the corresponding conflict.")
    public Long b() {
        return this.a;
    }
    
    @ApiModelProperty(example = "21", required = true, value = "The Id of this conflict-solution.")
    public Long c() {
        return this.b;
    }
    
    @ApiModelProperty(required = true, value = "Indicates if this solution has already been published to WU.")
    public Boolean d() {
        return this.c;
    }
    
    @ApiModelProperty("")
    public i e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final k k = (k)o;
            if (!Objects.equals(this.a, k.a) || !Objects.equals(this.b, k.b) || !Objects.equals(this.c, k.c) || !Objects.equals(this.d, k.d) || !Objects.equals(this.e, k.e) || !Objects.equals(this.f, k.f)) {
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
    
    public k h(final Long b) {
        this.b = b;
        return this;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
    }
    
    public k i(final Boolean c) {
        this.c = c;
        return this;
    }
    
    public void j(final Long a) {
        this.a = a;
    }
    
    public void k(final Long b) {
        this.b = b;
    }
    
    public void l(final Boolean c) {
        this.c = c;
    }
    
    public void m(final i d) {
        this.d = d;
    }
    
    public void n(final v e) {
        this.e = e;
    }
    
    public void o(final l f) {
        this.f = f;
    }
    
    public k p(final i d) {
        this.d = d;
        return this;
    }
    
    public k q(final v e) {
        this.e = e;
        return this;
    }
    
    public k s(final l f) {
        this.f = f;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class SolutionDto {\n");
        sb.append("    conflictId: ");
        sb.append(this.r(this.a));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.r(this.b));
        sb.append("\n");
        sb.append("    isPublished: ");
        sb.append(this.r(this.c));
        sb.append("\n");
        sb.append("    shiftedPeriod: ");
        sb.append(this.r(this.d));
        sb.append("\n");
        sb.append("    teacher: ");
        sb.append(this.r(this.e));
        sb.append("\n");
        sb.append("    type: ");
        sb.append(this.r(this.f));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
