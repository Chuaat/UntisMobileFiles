// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class w1
{
    static void a(final Object obj, final Object obj2) {
        if (obj == null) {
            final String value = String.valueOf(obj2);
            final StringBuilder sb = new StringBuilder(value.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(value);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        final String value2 = String.valueOf(obj);
        final StringBuilder sb2 = new StringBuilder(value2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(value2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }
}
