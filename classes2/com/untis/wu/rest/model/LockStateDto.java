// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LockStateDto
{
    @JsonProperty("isImportLock")
    private Boolean isImportLock;
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.isImportLock, ((LockStateDto)o).isImportLock));
    }
    
    @ApiModelProperty(example = "true", required = true, value = "A boolean that is either: true = import is currently locked | false = import is not locked")
    public Boolean getIsImportLock() {
        return this.isImportLock;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.isImportLock);
    }
    
    public LockStateDto isImportLock(final Boolean isImportLock) {
        this.isImportLock = isImportLock;
        return this;
    }
    
    public void setIsImportLock(final Boolean isImportLock) {
        this.isImportLock = isImportLock;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class LockStateDto {\n");
        sb.append("    isImportLock: ");
        sb.append(this.toIndentedString(this.isImportLock));
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
