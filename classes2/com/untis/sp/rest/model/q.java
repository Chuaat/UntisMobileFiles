// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class q
{
    @JsonProperty("dateFrom")
    private String a;
    @JsonProperty("dateTo")
    private String b;
    @JsonProperty("tenantId")
    private String c;
    
    private String j(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public q a(final String a) {
        this.a = a;
        return this;
    }
    
    public q b(final String b) {
        this.b = b;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String c() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String d() {
        return this.b;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final q q = (q)o;
            if (!Objects.equals(this.a, q.a) || !Objects.equals(this.b, q.b) || !Objects.equals(this.c, q.c)) {
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
    
    public void h(final String c) {
        this.c = c;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
    
    public q i(final String c) {
        this.c = c;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class SyncWithWURequest {\n");
        sb.append("    dateFrom: ");
        sb.append(this.j(this.a));
        sb.append("\n");
        sb.append("    dateTo: ");
        sb.append(this.j(this.b));
        sb.append("\n");
        sb.append("    tenantId: ");
        sb.append(this.j(this.c));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
