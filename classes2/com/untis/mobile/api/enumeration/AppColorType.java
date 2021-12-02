// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.enumeration;

public enum AppColorType
{
    ABSENCE(20), 
    BK_LOCK(6), 
    BOOK(4), 
    BREAKSUPERVISION(17), 
    CANCELLED(11), 
    CONFLICT(9), 
    ELEM_CHANGED(13), 
    EXAM(16), 
    FREE(1), 
    HOLIDAY(7), 
    HOLIDAY_LOCK(8), 
    LESSON(2), 
    OFFICEHOUR(19), 
    RESERVATION(3), 
    SHIFT(14), 
    SPECIALDUTY(15), 
    STANDBY(18), 
    STORNO(5), 
    SUBST(10), 
    WITHOUT_ELEM(12), 
    WORKTIME(21);
    
    private int wuId;
    
    private AppColorType(final int wuId) {
        this.wuId = wuId;
    }
    
    public static AppColorType fromWebUntisId(final int n) {
        for (final AppColorType appColorType : values()) {
            if (appColorType.wuId == n) {
                return appColorType;
            }
        }
        return null;
    }
    
    public int getWuId() {
        return this.wuId;
    }
}
