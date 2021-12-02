// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class i
{
    @JsonProperty("endDateTime")
    private String a;
    @JsonProperty("id")
    private Long b;
    @JsonProperty("klassen")
    private List<e> c;
    @JsonProperty("startDateTime")
    private String d;
    @JsonProperty("subject")
    private p e;
    @JsonProperty("teachers")
    private List<v> f;
    
    public i() {
        this.c = new ArrayList<e>();
        this.e = null;
        this.f = new ArrayList<v>();
    }
    
    private String u(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public i a(final e e) {
        this.c.add(e);
        return this;
    }
    
    public i b(final v v) {
        this.f.add(v);
        return this;
    }
    
    public i c(final String a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String d() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "")
    public Long e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final i i = (i)o;
            if (!Objects.equals(this.a, i.a) || !Objects.equals(this.b, i.b) || !Objects.equals(this.c, i.c) || !Objects.equals(this.d, i.d) || !Objects.equals(this.e, i.e) || !Objects.equals(this.f, i.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(required = true, value = "")
    public List<e> f() {
        return this.c;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String g() {
        return this.d;
    }
    
    @ApiModelProperty(required = true, value = "")
    public p h() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
    }
    
    @ApiModelProperty(required = true, value = "")
    public List<v> i() {
        return this.f;
    }
    
    public i j(final Long b) {
        this.b = b;
        return this;
    }
    
    public i k(final List<e> c) {
        this.c = c;
        return this;
    }
    
    public void l(final String a) {
        this.a = a;
    }
    
    public void m(final Long b) {
        this.b = b;
    }
    
    public void n(final List<e> c) {
        this.c = c;
    }
    
    public void o(final String d) {
        this.d = d;
    }
    
    public void p(final p e) {
        this.e = e;
    }
    
    public void q(final List<v> f) {
        this.f = f;
    }
    
    public i r(final String d) {
        this.d = d;
        return this;
    }
    
    public i s(final p e) {
        this.e = e;
        return this;
    }
    
    public i t(final List<v> f) {
        this.f = f;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class PeriodRefDto {\n");
        sb.append("    endDateTime: ");
        sb.append(this.u(this.a));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.u(this.b));
        sb.append("\n");
        sb.append("    klassen: ");
        sb.append(this.u(this.c));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.u(this.d));
        sb.append("\n");
        sb.append("    subject: ");
        sb.append(this.u(this.e));
        sb.append("\n");
        sb.append("    teachers: ");
        sb.append(this.u(this.f));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
