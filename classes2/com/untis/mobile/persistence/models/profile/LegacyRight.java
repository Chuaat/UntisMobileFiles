// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import com.untis.mobile.api.enumeration.UMRight;
import androidx.annotation.j0;
import androidx.annotation.k0;

public enum LegacyRight
{
    CLASSREGISTER(7, "classregister"), 
    NONE(0, "none"), 
    R_EXCUSE(5, "r_excuse"), 
    R_MY_ABSENCES(4, "r_my_absences"), 
    R_OFFICE_HOUR(1, "r_officehours"), 
    W_EXCUSE(6, "w_excuse"), 
    W_OWN_ABSENCE(2, "w_own_absence"), 
    W_OWN_ABSENCE_REASON(3, "w_own_absencereason");
    
    private final String name;
    private final int value;
    
    private LegacyRight(final int value, final String name2) {
        this.value = value;
        this.name = name2;
    }
    
    @j0
    public static LegacyRight fromName(@k0 final String anotherString) {
        if (anotherString != null && !anotherString.isEmpty()) {
            for (final LegacyRight legacyRight : values()) {
                if (legacyRight.getName().equalsIgnoreCase(anotherString)) {
                    return legacyRight;
                }
            }
            return LegacyRight.NONE;
        }
        return LegacyRight.NONE;
    }
    
    @j0
    public static LegacyRight fromUmRight(@k0 final UMRight umRight) {
        if (umRight == null) {
            return LegacyRight.NONE;
        }
        return fromName(umRight.name());
    }
    
    @j0
    public static LegacyRight fromValue(final int n) {
        for (final LegacyRight legacyRight : values()) {
            if (n == legacyRight.getValue()) {
                return legacyRight;
            }
        }
        return LegacyRight.NONE;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getValue() {
        return this.value;
    }
}
