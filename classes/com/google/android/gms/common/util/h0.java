// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.regex.Pattern;

@d0
public final class h0
{
    private static final Pattern a;
    
    static {
        a = Pattern.compile("\\\\u[0-9a-fA-F]{4}");
    }
    
    public static String a(final String input) {
        String string = input;
        if (!TextUtils.isEmpty((CharSequence)input)) {
            final Matcher matcher = h0.a.matcher(input);
            StringBuffer sb = null;
            while (matcher.find()) {
                StringBuffer sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuffer();
                }
                matcher.appendReplacement(sb2, new String(Character.toChars(Integer.parseInt(matcher.group().substring(2), 16))));
                sb = sb2;
            }
            if (sb == null) {
                return input;
            }
            matcher.appendTail(sb);
            string = sb.toString();
        }
        return string;
    }
}
