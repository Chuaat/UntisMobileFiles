// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class v
{
    @JsonProperty("displayName")
    private String a;
    @JsonProperty("id")
    private Long b;
    @JsonProperty("imageUrl")
    private String c;
    
    private String j(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public v a(final String a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(example = "Nobel Alfred", required = true, value = "A pre-formatted String that should be used to display the teacher. (As configured in WU)")
    public String b() {
        return this.a;
    }
    
    @ApiModelProperty(example = "21", required = true, value = "The SP Id of this teacher.")
    public Long c() {
        return this.b;
    }
    
    @ApiModelProperty(example = "https://images.webuntis.com/image/7407400/1248af3a52231248af3a52231248af3a", value = "An URL pointing to the teacher's image.")
    public String d() {
        return this.c;
    }
    
    public v e(final Long b) {
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
            final v v = (v)o;
            if (!Objects.equals(this.a, v.a) || !Objects.equals(this.b, v.b) || !Objects.equals(this.c, v.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public v f(final String c) {
        this.c = c;
        return this;
    }
    
    public void g(final String a) {
        this.a = a;
    }
    
    public void h(final Long b) {
        this.b = b;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
    
    public void i(final String c) {
        this.c = c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class TeacherRefDto {\n");
        sb.append("    displayName: ");
        sb.append(this.j(this.a));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.j(this.b));
        sb.append("\n");
        sb.append("    imageUrl: ");
        sb.append(this.j(this.c));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
