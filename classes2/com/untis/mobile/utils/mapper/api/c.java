// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.api;

import com.untis.mobile.api.common.error.UMErrorMetaData;
import com.untis.mobile.persistence.models.booking.BookingErrorData;
import com.untis.mobile.persistence.models.booking.BookingErrorCategory;
import com.untis.mobile.utils.h0;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.booking.ValidationError;
import com.untis.mobile.api.common.error.UMError;
import com.untis.mobile.utils.mapper.common.b;

public class c extends b<UMError, ValidationError>
{
    @j0
    private static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    @j0
    public static c j() {
        return c.a;
    }
    
    @j0
    public ValidationError i(@j0 final UMError umError) {
        final ValidationError validationError = new ValidationError();
        validationError.setCode(h0.f(umError.code));
        validationError.setTitle(h0.f(umError.title));
        validationError.setDetails(umError.details);
        final UMErrorMetaData meta = umError.meta;
        if (meta != null && meta.category != null) {
            validationError.setData(new BookingErrorData(BookingErrorCategory.fromUmErrorCategory(umError.meta.category)));
        }
        else {
            validationError.setData(new BookingErrorData());
        }
        return validationError;
    }
}
