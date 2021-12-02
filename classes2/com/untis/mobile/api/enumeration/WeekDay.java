// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.enumeration;

import java.io.Serializable;

public enum WeekDay implements Serializable
{
    FRI(6), 
    MON(2), 
    SAT(7), 
    SUN(1), 
    THU(5), 
    TUE(3), 
    WED(4);
    
    private final int webUntisDay;
    
    private WeekDay(final int webUntisDay) {
        this.webUntisDay = webUntisDay;
    }
    
    public static WeekDay fromWebUntisDay(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return WeekDay.SAT;
            }
            case 6: {
                return WeekDay.FRI;
            }
            case 5: {
                return WeekDay.THU;
            }
            case 4: {
                return WeekDay.WED;
            }
            case 3: {
                return WeekDay.TUE;
            }
            case 2: {
                return WeekDay.MON;
            }
            case 1: {
                return WeekDay.SUN;
            }
        }
    }
    
    public int getWebUntisDay() {
        return this.webUntisDay;
    }
}
