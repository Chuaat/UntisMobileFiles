// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public enum PeriodDtoStatesEnum
{
    CANCELLED("CANCELLED"), 
    LOCKED("LOCKED");
    
    private String value;
    
    private PeriodDtoStatesEnum(final String value) {
        this.value = value;
    }
    
    @JsonCreator
    public static PeriodDtoStatesEnum fromValue(final String s) {
        for (final PeriodDtoStatesEnum periodDtoStatesEnum : values()) {
            if (periodDtoStatesEnum.value.equals(s)) {
                return periodDtoStatesEnum;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected value '");
        sb.append(s);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @JsonValue
    public String getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
