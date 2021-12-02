// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

class n0 implements a<Long>
{
    public void b(final Long n, final y0 y0) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String s;
        if (n >= -59014396800000L && n <= 253399536000000L) {
            s = String.format("ISODate(\"%s\")", simpleDateFormat.format(new Date(n)));
        }
        else {
            s = String.format("new Date(%d)", n);
        }
        y0.d(s);
    }
}
