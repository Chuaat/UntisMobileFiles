// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import androidx.annotation.RecentlyNonNull;
import java.net.URI;
import java.util.regex.Pattern;
import f2.a;

@a
public class p
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    
    static {
        a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }
    
    private p() {
    }
    
    @RecentlyNonNull
    @a
    public static Map<String, String> a(@RecentlyNonNull final URI uri, @RecentlyNonNull final String s) {
        final Map<String, String> emptyMap = Collections.emptyMap();
        final String rawQuery = uri.getRawQuery();
        Map<String, String> map = emptyMap;
        if (rawQuery != null) {
            map = emptyMap;
            if (rawQuery.length() > 0) {
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                final Scanner scanner = new Scanner(rawQuery);
                scanner.useDelimiter("&");
                while (true) {
                    map = hashMap;
                    if (!scanner.hasNext()) {
                        break;
                    }
                    final String[] split = scanner.next().split("=");
                    if (split.length == 0 || split.length > 2) {
                        throw new IllegalArgumentException("bad parameter");
                    }
                    final String b = b(split[0], s);
                    String b2 = null;
                    if (split.length == 2) {
                        b2 = b(split[1], s);
                    }
                    hashMap.put(b, b2);
                }
            }
        }
        return map;
    }
    
    private static String b(String decode, String enc) {
        if (enc == null) {
            enc = "ISO-8859-1";
        }
        try {
            decode = URLDecoder.decode(decode, enc);
            return decode;
        }
        catch (UnsupportedEncodingException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
}
