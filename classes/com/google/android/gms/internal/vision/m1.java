// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class m1
{
    private static String a(@NullableDecl Object o) {
        if (o == null) {
            return "null";
        }
        try {
            return o.toString();
        }
        catch (Exception thrown) {
            final String name = o.getClass().getName();
            final String hexString = Integer.toHexString(System.identityHashCode(o));
            final StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            final String string = sb.toString();
            final Logger logger = Logger.getLogger("com.google.common.base.Strings");
            final Level warning = Level.WARNING;
            final String value = String.valueOf(string);
            String concat;
            if (value.length() != 0) {
                concat = "Exception during lenientFormat for ".concat(value);
            }
            else {
                concat = new String("Exception during lenientFormat for ");
            }
            logger.logp(warning, "com.google.common.base.Strings", "lenientToString", concat, thrown);
            final String name2 = thrown.getClass().getName();
            o = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
            ((StringBuilder)o).append("<");
            ((StringBuilder)o).append(string);
            ((StringBuilder)o).append(" threw ");
            ((StringBuilder)o).append(name2);
            ((StringBuilder)o).append(">");
            return ((StringBuilder)o).toString();
        }
    }
    
    public static String b(@NullableDecl final String s) {
        return g1.a(s);
    }
    
    public static String c(@NullableDecl final String obj, @NullableDecl final Object... array) {
        final String value = String.valueOf(obj);
        final int n = 0;
        for (int i = 0; i < array.length; ++i) {
            array[i] = a(array[i]);
        }
        final StringBuilder sb = new StringBuilder(value.length() + array.length * 16);
        int start = 0;
        int j;
        for (j = n; j < array.length; ++j) {
            final int index = value.indexOf("%s", start);
            if (index == -1) {
                break;
            }
            sb.append(value, start, index);
            sb.append(array[j]);
            start = index + 2;
        }
        sb.append(value, start, value.length());
        if (j < array.length) {
            sb.append(" [");
            final int n2 = j + 1;
            sb.append(array[j]);
            for (int k = n2; k < array.length; ++k) {
                sb.append(", ");
                sb.append(array[k]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
