// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import java.text.FieldPosition;
import java.util.Date;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

public class RFC3339DateFormat extends ISO8601DateFormat
{
    public StringBuffer format(final Date date, final StringBuffer sb, final FieldPosition fieldPosition) {
        sb.append(ISO8601Utils.format(date, true));
        return sb;
    }
}
