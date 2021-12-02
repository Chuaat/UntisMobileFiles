// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.api;

import java.util.Iterator;
import java.util.List;
import com.untis.mobile.api.common.color.UMAppColor;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.DefaultColors;
import com.untis.mobile.api.dto.GetColorsResponse;
import com.untis.mobile.utils.mapper.common.b;

public class a extends b<GetColorsResponse, DefaultColors>
{
    @k0
    private static a a;
    
    private a() {
    }
    
    @j0
    public static a i() {
        if (com.untis.mobile.utils.mapper.api.a.a == null) {
            com.untis.mobile.utils.mapper.api.a.a = new a();
        }
        return com.untis.mobile.utils.mapper.api.a.a;
    }
    
    @j0
    private DefaultColors.DefaultColor k(@j0 final UMAppColor umAppColor) {
        return new DefaultColors.DefaultColor(b.a(umAppColor.backColor), b.a(umAppColor.foreColor));
    }
    
    @k0
    public DefaultColors j(@j0 final GetColorsResponse getColorsResponse) {
        final DefaultColors defaultColors = new DefaultColors();
        final List<UMAppColor> appcolors = getColorsResponse.appcolors;
        if (appcolors != null) {
            if (appcolors.size() >= 1) {
                for (final UMAppColor umAppColor : getColorsResponse.appcolors) {
                    switch (a$a.a[umAppColor.type.ordinal()]) {
                        default: {
                            continue;
                        }
                        case 21: {
                            defaultColors.setWorktime(this.k(umAppColor));
                            continue;
                        }
                        case 20: {
                            defaultColors.setAbsence(this.k(umAppColor));
                            continue;
                        }
                        case 19: {
                            defaultColors.setOfficeHours(this.k(umAppColor));
                            continue;
                        }
                        case 18: {
                            defaultColors.setStandby(this.k(umAppColor));
                            continue;
                        }
                        case 17: {
                            defaultColors.setBreakSupervision(this.k(umAppColor));
                            continue;
                        }
                        case 16: {
                            defaultColors.setExam(this.k(umAppColor));
                            continue;
                        }
                        case 15: {
                            defaultColors.setSpecialDuty(this.k(umAppColor));
                            continue;
                        }
                        case 14: {
                            defaultColors.setShift(this.k(umAppColor));
                            continue;
                        }
                        case 13: {
                            defaultColors.setElementChanged(this.k(umAppColor));
                            continue;
                        }
                        case 12: {
                            defaultColors.setWithoutElement(this.k(umAppColor));
                            continue;
                        }
                        case 11: {
                            defaultColors.setCancelled(this.k(umAppColor));
                            continue;
                        }
                        case 10: {
                            defaultColors.setSubstitution(this.k(umAppColor));
                            continue;
                        }
                        case 9: {
                            defaultColors.setConflict(this.k(umAppColor));
                            continue;
                        }
                        case 8: {
                            defaultColors.setHolidayLock(this.k(umAppColor));
                            continue;
                        }
                        case 7: {
                            defaultColors.setHoliday(this.k(umAppColor));
                            continue;
                        }
                        case 6: {
                            defaultColors.setBookingLock(this.k(umAppColor));
                            continue;
                        }
                        case 5: {
                            defaultColors.setStorno(this.k(umAppColor));
                            continue;
                        }
                        case 4: {
                            defaultColors.setBooking(this.k(umAppColor));
                            continue;
                        }
                        case 3: {
                            defaultColors.setReservation(this.k(umAppColor));
                            continue;
                        }
                        case 2: {
                            defaultColors.setLesson(this.k(umAppColor));
                            continue;
                        }
                        case 1: {
                            defaultColors.setFree(this.k(umAppColor));
                            continue;
                        }
                    }
                }
            }
        }
        return defaultColors;
    }
}
