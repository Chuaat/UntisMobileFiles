// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class e
{
    @JsonProperty("displayName")
    private String a;
    
    private String d(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public e a(final String a) {
        this.a = a;
        return this;
    }
    
    @ApiModelProperty(example = "1A", required = true, value = "A pre-formatted String that should be used to display the Klasse.")
    public String b() {
        return this.a;
    }
    
    public void c(final String a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.a, ((e)o).a));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class KlasseRefDto {\n");
        sb.append("    displayName: ");
        sb.append(this.d(this.a));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
