// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class d
{
    @JsonProperty("spDbSchemaName")
    private String a;
    @JsonProperty("tenantId")
    private String b;
    @JsonProperty("wuUrl")
    private String c;
    
    private String i(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    @ApiModelProperty(required = true, value = "")
    public String a() {
        return this.a;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String b() {
        return this.b;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String c() {
        return this.c;
    }
    
    public void d(final String a) {
        this.a = a;
    }
    
    public void e(final String b) {
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final d d = (d)o;
            if (!Objects.equals(this.a, d.a) || !Objects.equals(this.b, d.b) || !Objects.equals(this.c, d.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public void f(final String c) {
        this.c = c;
    }
    
    public d g(final String a) {
        this.a = a;
        return this;
    }
    
    public d h(final String b) {
        this.b = b;
        return this;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
    
    public d j(final String c) {
        this.c = c;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class InstallationDTO {\n");
        sb.append("    spDbSchemaName: ");
        sb.append(this.i(this.a));
        sb.append("\n");
        sb.append("    tenantId: ");
        sb.append(this.i(this.b));
        sb.append("\n");
        sb.append("    wuUrl: ");
        sb.append(this.i(this.c));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
