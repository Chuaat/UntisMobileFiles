// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class u
{
    @JsonProperty("endDateTime")
    private String a;
    @JsonProperty("missedPeriods")
    private Integer b;
    @JsonProperty("note")
    private String c;
    @JsonProperty("reason")
    private a d;
    @JsonProperty("startDateTime")
    private String e;
    @JsonProperty("teacher")
    private v f;
    @JsonProperty("wuAbsenceId")
    private Long g;
    
    public u() {
        this.d = null;
        this.f = null;
    }
    
    private String u(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public u a(final String a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(example = "2020-01-05T23:59:59Z", required = true, value = "The end of the underlying teacher-absence in ISO 8601 format.")
    public String b() {
        return this.a;
    }
    
    @ApiModelProperty(example = "22", required = true, value = "The number of periods that the teacher misses during her absence.")
    public Integer c() {
        return this.b;
    }
    
    @ApiModelProperty("Description about the teacher absence")
    public String d() {
        return this.c;
    }
    
    @ApiModelProperty("")
    public a e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final u u = (u)o;
            if (!Objects.equals(this.a, u.a) || !Objects.equals(this.b, u.b) || !Objects.equals(this.c, u.c) || !Objects.equals(this.d, u.d) || !Objects.equals(this.e, u.e) || !Objects.equals(this.f, u.f) || !Objects.equals(this.g, u.g)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "2019-12-23T07:45:00Z", required = true, value = "The begin of the underlying teacher-absence in ISO 8601 format.")
    public String f() {
        return this.e;
    }
    
    @ApiModelProperty(required = true, value = "")
    public v g() {
        return this.f;
    }
    
    @ApiModelProperty(example = "21", required = true, value = "The Id of this teacher-absence.")
    public Long h() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
    
    public u i(final Integer b) {
        this.b = b;
        return this;
    }
    
    public u j(final String c) {
        this.c = c;
        return this;
    }
    
    public u k(final a d) {
        this.d = d;
        return this;
    }
    
    public void l(final String a) {
        this.a = a;
    }
    
    public void m(final Integer b) {
        this.b = b;
    }
    
    public void n(final String c) {
        this.c = c;
    }
    
    public void o(final a d) {
        this.d = d;
    }
    
    public void p(final String e) {
        this.e = e;
    }
    
    public void q(final v f) {
        this.f = f;
    }
    
    public void r(final Long g) {
        this.g = g;
    }
    
    public u s(final String e) {
        this.e = e;
        return this;
    }
    
    public u t(final v f) {
        this.f = f;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherAbsenceDto {\n");
        sb.append("    endDateTime: ");
        sb.append(this.u(this.a));
        sb.append("\n");
        sb.append("    missedPeriods: ");
        sb.append(this.u(this.b));
        sb.append("\n");
        sb.append("    note: ");
        sb.append(this.u(this.c));
        sb.append("\n");
        sb.append("    reason: ");
        sb.append(this.u(this.d));
        sb.append("\n");
        sb.append("    startDateTime: ");
        sb.append(this.u(this.e));
        sb.append("\n");
        sb.append("    teacher: ");
        sb.append(this.u(this.f));
        sb.append("\n");
        sb.append("    wuAbsenceId: ");
        sb.append(this.u(this.g));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public u v(final Long g) {
        this.g = g;
        return this;
    }
}
