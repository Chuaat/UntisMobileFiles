// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;
import c6.a;

public final class k
{
    public static String a(@a final String s, @a final Object... array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
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
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
                    sb2.append("<");
                    sb2.append(string);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    s2 = sb2.toString();
                }
            }
            array[n2] = s2;
            ++n2;
        }
        final StringBuilder sb3 = new StringBuilder(s.length() + length * 16);
        int start = 0;
        int n3 = n;
        int length2;
        while (true) {
            length2 = array.length;
            if (n3 >= length2) {
                break;
            }
            final int index = s.indexOf("%s", start);
            if (index == -1) {
                break;
            }
            sb3.append(s, start, index);
            sb3.append(array[n3]);
            start = index + 2;
            ++n3;
        }
        sb3.append(s, start, s.length());
        if (n3 < length2) {
            sb3.append(" [");
            final int n4 = n3 + 1;
            sb3.append(array[n3]);
            for (int i = n4; i < array.length; ++i) {
                sb3.append(", ");
                sb3.append(array[i]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
