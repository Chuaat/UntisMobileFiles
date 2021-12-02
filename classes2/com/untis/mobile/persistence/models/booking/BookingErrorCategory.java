// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.booking;

import androidx.annotation.j0;
import androidx.annotation.k0;
import com.untis.mobile.api.enumeration.UMErrorCategory;

public enum BookingErrorCategory
{
    Default(0), 
    GlobalValidationError(2), 
    PropertyValidationError(1);
    
    private final int value;
    
    private BookingErrorCategory(final int value) {
        this.value = value;
    }
    
    @j0
    public static BookingErrorCategory fromUmErrorCategory(@k0 final UMErrorCategory umErrorCategory) {
        if (umErrorCategory == null) {
            return BookingErrorCategory.Default;
        }
        final int n = BookingErrorCategory$1.$SwitchMap$com$untis$mobile$api$enumeration$UMErrorCategory[umErrorCategory.ordinal()];
        if (n == 1) {
            return BookingErrorCategory.Default;
        }
        if (n == 2) {
            return BookingErrorCategory.PropertyValidationError;
        }
        if (n != 3) {
            return BookingErrorCategory.Default;
        }
        return BookingErrorCategory.GlobalValidationError;
    }
    
    @j0
    public static BookingErrorCategory fromValue(final int n) {
        for (final BookingErrorCategory bookingErrorCategory : values()) {
            if (bookingErrorCategory.getValue() == n) {
                return bookingErrorCategory;
            }
        }
        return BookingErrorCategory.Default;
    }
    
    public int getValue() {
        return this.value;
    }
}
