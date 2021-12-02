// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public enum WuCurrentUserDtoRolesEnum
{
    ADMIN("ADMIN"), 
    DIRECTORATE("DIRECTORATE"), 
    KLASSE("KLASSE"), 
    OTHER("OTHER"), 
    PARENT("PARENT"), 
    STAFF("STAFF"), 
    STUDENT("STUDENT"), 
    TEACHER("TEACHER"), 
    UNTIS("UNTIS");
    
    private String value;
    
    private WuCurrentUserDtoRolesEnum(final String value) {
        this.value = value;
    }
    
    @JsonCreator
    public static WuCurrentUserDtoRolesEnum fromValue(final String s) {
        for (final WuCurrentUserDtoRolesEnum wuCurrentUserDtoRolesEnum : values()) {
            if (wuCurrentUserDtoRolesEnum.value.equals(s)) {
                return wuCurrentUserDtoRolesEnum;
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
