// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest.model;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public enum s
{
    H("UNKNOWN"), 
    I("ADDITIONAL_ATTENDANCE"), 
    J("HAS_ABSENCE"), 
    K("HAS_PERIOD_COLLISION"), 
    L("HAS_UNPUBLISHED_SUBSTITUTION"), 
    M("KNOWS_CLASS"), 
    N("KNOWS_SUBJECT"), 
    O("NON_TEACHING_PERIOD"), 
    P("NOT_AT_SCHOOL"), 
    Q("ON_STANDBY"), 
    R("IMPORTED_FROM_UNTIS");
    
    private String G;
    
    private s(final String g) {
        this.G = g;
    }
    
    @JsonCreator
    public static s b(final String s) {
        for (final s s2 : values()) {
            if (s2.G.equals(s)) {
                return s2;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected value '");
        sb.append(s);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @JsonValue
    public String d() {
        return this.G;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.G);
    }
}
