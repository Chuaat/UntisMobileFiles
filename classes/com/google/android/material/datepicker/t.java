// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import androidx.annotation.k0;

class t
{
    private static final t c;
    @k0
    private final Long a;
    @k0
    private final TimeZone b;
    
    static {
        c = new t(null, null);
    }
    
    private t(@k0 final Long a, @k0 final TimeZone b) {
        this.a = a;
        this.b = b;
    }
    
    static t a(final long l) {
        return new t(l, null);
    }
    
    static t b(final long l, @k0 final TimeZone timeZone) {
        return new t(l, timeZone);
    }
    
    static t e() {
        return t.c;
    }
    
    Calendar c() {
        return this.d(this.b);
    }
    
    Calendar d(@k0 final TimeZone zone) {
        Calendar calendar;
        if (zone == null) {
            calendar = Calendar.getInstance();
        }
        else {
            calendar = Calendar.getInstance(zone);
        }
        final Long a = this.a;
        if (a != null) {
            calendar.setTimeInMillis(a);
        }
        return calendar;
    }
}
