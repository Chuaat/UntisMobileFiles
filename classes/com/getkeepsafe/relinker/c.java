// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker;

import java.util.Arrays;

public class c extends RuntimeException
{
    public c(final String str, final String[] a, final String[] a2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not find '");
        sb.append(str);
        sb.append("'. Looked for: ");
        sb.append(Arrays.toString(a));
        sb.append(", but only found: ");
        sb.append(Arrays.toString(a2));
        sb.append(".");
        super(sb.toString());
    }
}
