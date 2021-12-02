// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "Specifies how a period-conflict should be solved.")
public class n
{
    @JsonProperty("conflictId")
    private Long a;
    @JsonProperty("shiftedPeriodId")
    private Long b;
    @JsonProperty("teacherId")
    private Long c;
    @JsonProperty("type")
    private l d;
    
    private String l(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public n a(final Long a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(example = "3", required = true, value = "The Id of the corresponding conflict.")
    public Long b() {
        return this.a;
    }
    
    @ApiModelProperty(example = "97", value = "The Id of the shifted period.")
    public Long c() {
        return this.b;
    }
    
    @ApiModelProperty(example = "97", value = "The Id of the teacher which should be taken as a substitute for the conflict.")
    public Long d() {
        return this.c;
    }
    
    @ApiModelProperty(required = true, value = "")
    public l e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final n n = (n)o;
            if (!Objects.equals(this.a, n.a) || !Objects.equals(this.b, n.b) || !Objects.equals(this.c, n.c) || !Objects.equals(this.d, n.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public void f(final Long a) {
        this.a = a;
    }
    
    public void g(final Long b) {
        this.b = b;
    }
    
    public void h(final Long c) {
        this.c = c;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
    
    public void i(final l d) {
        this.d = d;
    }
    
    public n j(final Long b) {
        this.b = b;
        return this;
    }
    
    public n k(final Long c) {
        this.c = c;
        return this;
    }
    
    public n m(final l d) {
        this.d = d;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class SolutionRefDto {\n");
        sb.append("    conflictId: ");
        sb.append(this.l(this.a));
        sb.append("\n");
        sb.append("    shiftedPeriodId: ");
        sb.append(this.l(this.b));
        sb.append("\n");
        sb.append("    teacherId: ");
        sb.append(this.l(this.c));
        sb.append("\n");
        sb.append("    type: ");
        sb.append(this.l(this.d));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
