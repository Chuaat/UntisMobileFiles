// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec;

import java.io.InputStream;

public class i
{
    public static InputStream a(final String s) {
        final InputStream resourceAsStream = i.class.getClassLoader().getResourceAsStream(s);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to resolve required resource: ");
        sb.append(s);
        throw new IllegalArgumentException(sb.toString());
    }
}
