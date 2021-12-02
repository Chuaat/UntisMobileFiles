// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class g
{
    @JsonProperty("currentTeacherIds")
    private List<Long> a;
    @JsonProperty("endDateTime")
    private String b;
    @JsonProperty("id")
    private Long c;
    @JsonProperty("klassenIds")
    private List<Long> d;
    @JsonProperty("lessonCode")
    private String e;
    @JsonProperty("orgTeacherIds")
    private List<Long> f;
    @JsonProperty("roomIds")
    private List<Long> g;
    @JsonProperty("startDateTime")
    private String h;
    @JsonProperty("states")
    private List<h> i;
    @JsonProperty("subjectId")
    private Long j;
    @JsonProperty("unitOfDay")
    private Integer k;
    
    public g() {
        this.a = new ArrayList<Long>();
        this.d = new ArrayList<Long>();
        this.f = new ArrayList<Long>();
        this.g = new ArrayList<Long>();
        this.i = new ArrayList<h>();
    }
    
    private String L(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public void A(final List<Long> d) {
        this.d = d;
    }
    
    public void B(final String e) {
        this.e = e;
    }
    
    public void C(final List<Long> f) {
        this.f = f;
    }
    
    public void D(final List<Long> g) {
        this.g = g;
    }
    
    public void E(final String h) {
        this.h = h;
    }
    
    public void F(final List<h> i) {
        this.i = i;
    }
    
    public void G(final Long j) {
        this.j = j;
    }
    
    public void H(final Integer k) {
        this.k = k;
    }
    
    public g I(final String h) {
        this.h = h;
        return this;
    }
    
    public g J(final List<h> i) {
        this.i = i;
        return this;
    }
    
    public g K(final Long j) {
        this.j = j;
        return this;
    }
    
    public g M(final Integer k) {
        this.k = k;
        return this;
    }
    
    public g a(final Long n) {
        if (this.a == null) {
            this.a = new ArrayList<Long>();
        }
        this.a.add(n);
        return this;
    }
    
    public g b(final Long n) {
        if (this.d == null) {
            this.d = new ArrayList<Long>();
        }
        this.d.add(n);
        return this;
    }
    
    public g c(final Long n) {
        if (this.f == null) {
            this.f = new ArrayList<Long>();
        }
        this.f.add(n);
        return this;
    }
    
    public g d(final Long n) {
        if (this.g == null) {
            this.g = new ArrayList<Long>();
        }
        this.g.add(n);
        return this;
    }
    
    public g e(final h h) {
        if (this.i == null) {
            this.i = new ArrayList<h>();
        }
        this.i.add(h);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final g g = (g)o;
            if (!Objects.equals(this.a, g.a) || !Objects.equals(this.b, g.b) || !Objects.equals(this.c, g.c) || !Objects.equals(this.d, g.d) || !Objects.equals(this.e, g.e) || !Objects.equals(this.f, g.f) || !Objects.equals(this.g, g.g) || !Objects.equals(this.h, g.h) || !Objects.equals(this.i, g.i) || !Objects.equals(this.j, g.j) || !Objects.equals(this.k, g.k)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public g f(final List<Long> a) {
        this.a = a;
        return this;
    }
    
    public g g(final String b) {
        this.b = b;
        return this;
    }
    
    @ApiModelProperty(example = "[8, 12]", value = "The ID(s) of this period's teacher(s).")
    public List<Long> h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
    
    @ApiModelProperty(example = "2019-06-01T08:55:00Z", required = true, value = "The end of the period in ISO 8601 format.")
    public String i() {
        return this.b;
    }
    
    @ApiModelProperty(example = "167492", required = true, value = "The Id of the period.")
    public Long j() {
        return this.c;
    }
    
    @ApiModelProperty(example = "[25, 26]", value = "The ID(s) of this period's klasse(n).")
    public List<Long> k() {
        return this.d;
    }
    
    @ApiModelProperty(example = "UNTIS_LESSON,UNTIS_ADDITIONAL,UNTIS_OFFICEHOUR ...", value = "Type of periodslesson")
    public String l() {
        return this.e;
    }
    
    @ApiModelProperty("")
    public List<Long> m() {
        return this.f;
    }
    
    @ApiModelProperty(example = "[18, 19]", value = "The ID(s) of this period's room(s).")
    public List<Long> n() {
        return this.g;
    }
    
    @ApiModelProperty(example = "2019-06-01T08:10:00Z", required = true, value = "The begin of the period in ISO 8601 format.")
    public String o() {
        return this.h;
    }
    
    @ApiModelProperty(example = "[CANCELLED]", value = "")
    public List<h> p() {
        return this.i;
    }
    
    @ApiModelProperty(example = "25", value = "The ID of this period's subject.")
    public Long q() {
        return this.j;
    }
    
    @ApiModelProperty(example = "2", required = true, value = "The ordinal number of this period on this day. (This is the n-th period on that day according to the WU timegrid). Might be 0 if WU cannot calculate!")
    public Integer r() {
        return this.k;
    }
    
    public g s(final Long c) {
        this.c = c;
        return this;
    }
    
    public g t(final List<Long> d) {
        this.d = d;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class PeriodDto {\n");
        sb.append("    currentTeacherIds: ");
        sb.append(this.L(this.a));
        sb.append("\n");
        sb.append("    endDateTime: ");
        sb.append(this.L(this.b));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.L(this.c));
        sb.append("\n");
        sb.append("    klassenIds: ");
        sb.append(this.L(this.d));
        sb.append("\n");
        sb.append("    lessonCode: ");
        sb.append(this.L(this.e));
        sb.append("\n");
        sb.append("    orgTeacherIds: ");
        sb.append(this.L(this.f));
        sb.append("\n");
        sb.append("    roomIds: ");
        sb.append(this.L(this.g));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.L(this.h));
        sb.append("\n");
        sb.append("    states: ");
        sb.append(this.L(this.i));
        sb.append("\n");
        sb.append("    subjectId: ");
        sb.append(this.L(this.j));
        sb.append("\n");
        sb.append("    unitOfDay: ");
        sb.append(this.L(this.k));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public g u(final String e) {
        this.e = e;
        return this;
    }
    
    public g v(final List<Long> f) {
        this.f = f;
        return this;
    }
    
    public g w(final List<Long> g) {
        this.g = g;
        return this;
    }
    
    public void x(final List<Long> a) {
        this.a = a;
    }
    
    public void y(final String b) {
        this.b = b;
    }
    
    public void z(final Long c) {
        this.c = c;
    }
}
