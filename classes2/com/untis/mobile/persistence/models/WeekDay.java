// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

import androidx.annotation.j0;

public enum WeekDay
{
    FRI(6, 5), 
    MON(2, 1), 
    SAT(7, 6), 
    SUN(1, 7), 
    THU(5, 4), 
    TUE(3, 2), 
    WED(4, 3);
    
    private final int mDateTimeConstant;
    private final int mWebUntis;
    
    private WeekDay(final int mWebUntis, final int mDateTimeConstant) {
        this.mWebUntis = mWebUntis;
        this.mDateTimeConstant = mDateTimeConstant;
    }
    
    @j0
    public static WeekDay fromDateTimeConstant(final int n) {
        switch (n) {
            default: {
                return WeekDay.MON;
            }
            case 7: {
                return WeekDay.SUN;
            }
            case 6: {
                return WeekDay.SAT;
            }
            case 5: {
                return WeekDay.FRI;
            }
            case 4: {
                return WeekDay.THU;
            }
            case 3: {
                return WeekDay.WED;
            }
            case 2: {
                return WeekDay.TUE;
            }
        }
    }
    
    @j0
    public static WeekDay fromWebUntis(final int n) {
        if (n == 1) {
            return WeekDay.SUN;
        }
        if (n == 3) {
            return WeekDay.TUE;
        }
        if (n == 4) {
            return WeekDay.WED;
        }
        if (n == 5) {
            return WeekDay.THU;
        }
        if (n == 6) {
            return WeekDay.FRI;
        }
        if (n != 7) {
            return WeekDay.MON;
        }
        return WeekDay.SAT;
    }
    
    public int getDateTimeConstant() {
        return this.mDateTimeConstant;
    }
    
    public int getWebUntis() {
        return this.mWebUntis;
    }
}
