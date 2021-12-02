// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class f
{
    @JsonProperty("endDateTime")
    private String a;
    @JsonProperty("id")
    private Long b;
    @JsonProperty("klassen")
    private List<e> c;
    @JsonProperty("originalTeacher")
    private v d;
    @JsonProperty("rooms")
    private List<j> e;
    @JsonProperty("solution")
    private k f;
    @JsonProperty("startDateTime")
    private String g;
    @JsonProperty("subject")
    private p h;
    @JsonProperty("teamTeachers")
    private List<w> i;
    @JsonProperty("unitOfDay")
    private Integer j;
    
    public f() {
        this.c = new ArrayList<e>();
        this.d = null;
        this.e = new ArrayList<j>();
        this.f = null;
        this.h = null;
        this.i = new ArrayList<w>();
    }
    
    private String G(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public void A(final List<w> i) {
        this.i = i;
    }
    
    public void B(final Integer j) {
        this.j = j;
    }
    
    public f C(final k f) {
        this.f = f;
        return this;
    }
    
    public f D(final String g) {
        this.g = g;
        return this;
    }
    
    public f E(final p h) {
        this.h = h;
        return this;
    }
    
    public f F(final List<w> i) {
        this.i = i;
        return this;
    }
    
    public f H(final Integer j) {
        this.j = j;
        return this;
    }
    
    public f a(final e e) {
        this.c.add(e);
        return this;
    }
    
    public f b(final j j) {
        this.e.add(j);
        return this;
    }
    
    public f c(final w w) {
        this.i.add(w);
        return this;
    }
    
    public f d(final String a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(example = "2020-01-05T23:59:59Z", required = true, value = "The end of the underlying period (not only conflict) in ISO 8601 format.")
    public String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final f f = (f)o;
            if (!Objects.equals(this.a, f.a) || !Objects.equals(this.b, f.b) || !Objects.equals(this.c, f.c) || !Objects.equals(this.d, f.d) || !Objects.equals(this.e, f.e) || !Objects.equals(this.f, f.f) || !Objects.equals(this.g, f.g) || !Objects.equals(this.h, f.h) || !Objects.equals(this.i, f.i) || !Objects.equals(this.j, f.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "21", required = true, value = "The SP Id of this period-conflict.")
    public Long f() {
        return this.b;
    }
    
    @ApiModelProperty(required = true, value = "The Klassen which are affected in this period. Might be empty, but NOT NULL")
    public List<e> g() {
        return this.c;
    }
    
    @ApiModelProperty(required = true, value = "")
    public v h() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
    
    @ApiModelProperty(required = true, value = "The rooms which are affected in this period. Might be empty, but NOT NULL")
    public List<j> i() {
        return this.e;
    }
    
    @ApiModelProperty("")
    public k j() {
        return this.f;
    }
    
    @ApiModelProperty(example = "2019-12-23T07:45:00Z", required = true, value = "The begin of the underlying period (not only conflict) in ISO 8601 format.")
    public String k() {
        return this.g;
    }
    
    @ApiModelProperty("")
    public p l() {
        return this.h;
    }
    
    @ApiModelProperty(required = true, value = "All team teachers which are additionally teaching in this period. Will NOT contain the original teacher. Might be empty, but NOT NULL.")
    public List<w> m() {
        return this.i;
    }
    
    @ApiModelProperty(example = "2", required = true, value = "The ordinal number of this period on this day. (This is the n-th period on that day according to the WU timegrid). Might be 0 if WU cannot calculate!")
    public Integer n() {
        return this.j;
    }
    
    public f o(final Long b) {
        this.b = b;
        return this;
    }
    
    public f p(final List<e> c) {
        this.c = c;
        return this;
    }
    
    public f q(final v d) {
        this.d = d;
        return this;
    }
    
    public f r(final List<j> e) {
        this.e = e;
        return this;
    }
    
    public void s(final String a) {
        this.a = a;
    }
    
    public void t(final Long b) {
        this.b = b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class PeriodConflictDto {\n");
        sb.append("    endDateTime: ");
        sb.append(this.G(this.a));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.G(this.b));
        sb.append("\n");
        sb.append("    klassen: ");
        sb.append(this.G(this.c));
        sb.append("\n");
        sb.append("    originalTeacher: ");
        sb.append(this.G(this.d));
        sb.append("\n");
        sb.append("    rooms: ");
        sb.append(this.G(this.e));
        sb.append("\n");
        sb.append("    solution: ");
        sb.append(this.G(this.f));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.G(this.g));
        sb.append("\n");
        sb.append("    subject: ");
        sb.append(this.G(this.h));
        sb.append("\n");
        sb.append("    teamTeachers: ");
        sb.append(this.G(this.i));
        sb.append("\n");
        sb.append("    unitOfDay: ");
        sb.append(this.G(this.j));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public void u(final List<e> c) {
        this.c = c;
    }
    
    public void v(final v d) {
        this.d = d;
    }
    
    public void w(final List<j> e) {
        this.e = e;
    }
    
    public void x(final k f) {
        this.f = f;
    }
    
    public void y(final String g) {
        this.g = g;
    }
    
    public void z(final p h) {
        this.h = h;
    }
}
