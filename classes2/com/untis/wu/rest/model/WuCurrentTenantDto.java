// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WuCurrentTenantDto
{
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("id")
    private BigDecimal id;
    @JsonProperty("wuHostName")
    private String wuHostName;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    public WuCurrentTenantDto displayName(final String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final WuCurrentTenantDto wuCurrentTenantDto = (WuCurrentTenantDto)o;
            if (!Objects.equals(this.displayName, wuCurrentTenantDto.displayName) || !Objects.equals(this.id, wuCurrentTenantDto.id) || !Objects.equals(this.wuHostName, wuCurrentTenantDto.wuHostName)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @ApiModelProperty(example = "Hogwarts School of Sorcery", value = "A pre-formatted String that should be used to display the tenant / school.")
    public String getDisplayName() {
        return this.displayName;
    }
    
    @ApiModelProperty(example = "1234500.0", value = "The Id of the tenant.")
    public BigDecimal getId() {
        return this.id;
    }
    
    @ApiModelProperty(example = "https://kirke.webuntis.com/WebUntis", value = "An URL pointing to the tenant's instance of WebUntis.")
    public String getWuHostName() {
        return this.wuHostName;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.displayName, this.id, this.wuHostName);
    }
    
    public WuCurrentTenantDto id(final BigDecimal id) {
        this.id = id;
        return this;
    }
    
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }
    
    public void setId(final BigDecimal id) {
        this.id = id;
    }
    
    public void setWuHostName(final String wuHostName) {
        this.wuHostName = wuHostName;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class WuCurrentTenantDto {\n");
        sb.append("    displayName: ");
        sb.append(this.toIndentedString(this.displayName));
        sb.append("\n");
        sb.append("    id: ");
        sb.append(this.toIndentedString(this.id));
        sb.append("\n");
        sb.append("    wuHostName: ");
        sb.append(this.toIndentedString(this.wuHostName));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    public WuCurrentTenantDto wuHostName(final String wuHostName) {
        this.wuHostName = wuHostName;
        return this;
    }
}
