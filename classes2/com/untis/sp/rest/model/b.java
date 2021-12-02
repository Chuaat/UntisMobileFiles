// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class b
{
    @JsonProperty("date")
    private String a;
    @JsonProperty("displayName")
    private String b;
    @JsonProperty("state")
    private c c;
    
    private String j(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public b a(final String a) {
        this.a = a;
        return this;
    }
    
    public b b(final String b) {
        this.b = b;
        return this;
    }
    
    @ApiModelProperty(example = "2019-11-30T08:00:00Z", required = true, value = "The full date of the day, ISO-8601 zoned date+time String.")
    public String c() {
        return this.a;
    }
    
    @ApiModelProperty(example = "29", required = true, value = "A pre-formatted String that should be used to display the day.")
    public String d() {
        return this.b;
    }
    
    @ApiModelProperty(required = true, value = "")
    public c e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final b b2 = (b)o;
            if (!Objects.equals(this.a, b2.a) || !Objects.equals(this.b, b2.b) || !Objects.equals(this.c, b2.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public void f(final String a) {
        this.a = a;
    }
    
    public void g(final String b) {
        this.b = b;
    }
    
    public void h(final c c) {
        this.c = c;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
    
    public b i(final c c) {
        this.c = c;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class DayStateDto {\n");
        sb.append("    date: ");
        sb.append(this.j(this.a));
        sb.append("\n");
        sb.append("    displayName: ");
        sb.append(this.j(this.b));
        sb.append("\n");
        sb.append("    state: ");
        sb.append(this.j(this.c));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
