// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNullable;
import java.util.regex.Matcher;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONArray;
import com.google.android.gms.common.internal.x;
import org.json.JSONObject;
import androidx.annotation.k0;
import java.util.regex.Pattern;
import f2.a;

@d0
@a
public final class r
{
    private static final Pattern a;
    private static final Pattern b;
    
    static {
        a = Pattern.compile("\\\\.");
        b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }
    
    private r() {
    }
    
    @RecentlyNonNull
    @a
    public static boolean a(@k0 final Object o, @k0 final Object obj) {
        if (o == null && obj == null) {
            return true;
        }
        if (o == null || obj == null) {
            return false;
        }
        Label_0122: {
            if (!(o instanceof JSONObject) || !(obj instanceof JSONObject)) {
                break Label_0122;
            }
            final JSONObject jsonObject = (JSONObject)o;
            final JSONObject jsonObject2 = (JSONObject)obj;
            if (jsonObject.length() != jsonObject2.length()) {
                return false;
            }
            final Iterator keys = jsonObject.keys();
        Label_0162_Outer:
            while (true) {
                if (!keys.hasNext()) {
                    return true;
                }
                final String s = keys.next();
                if (!jsonObject2.has(s)) {
                    return false;
                }
                try {
                    if (!a(jsonObject.get((String)x.k(s)), jsonObject2.get(s))) {
                        return false;
                    }
                    continue Label_0162_Outer;
                    // iftrue(Label_0204:, n >= jsonArray.length())
                    // iftrue(Label_0206:, !o instanceof JSONArray || !obj instanceof JSONArray)
                Block_12:
                    while (true) {
                        Block_14: {
                            break Block_14;
                            Label_0204: {
                                return true;
                            }
                            Label_0206:
                            return o.equals(obj);
                            break Block_12;
                        }
                        try {
                            int n = 0;
                            final JSONArray jsonArray;
                            final JSONArray jsonArray2;
                            if (!a(jsonArray.get(n), jsonArray2.get(n))) {
                                return false;
                            }
                            ++n;
                            continue;
                        }
                        catch (JSONException ex) {
                            return false;
                        }
                        return true;
                        Label_0159: {
                            final int n = 0;
                        }
                        continue;
                    }
                    final JSONArray jsonArray = (JSONArray)o;
                    final JSONArray jsonArray2 = (JSONArray)obj;
                    // iftrue(Label_0159:, jsonArray.length() == jsonArray2.length())
                    return false;
                }
                catch (JSONException ex2) {
                    return false;
                }
                break;
            }
        }
    }
    
    @RecentlyNullable
    @a
    public static String b(@k0 final String input) {
        String string = input;
        if (!TextUtils.isEmpty((CharSequence)input)) {
            final Matcher matcher = r.b.matcher(input);
            StringBuffer sb = null;
            while (matcher.find()) {
                StringBuffer sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuffer();
                }
                final char char1 = matcher.group().charAt(0);
                String replacement;
                if (char1 != '\f') {
                    if (char1 != '\r') {
                        if (char1 != '\"') {
                            if (char1 != '/') {
                                if (char1 != '\\') {
                                    switch (char1) {
                                        default: {
                                            sb = sb2;
                                            continue;
                                        }
                                        case 10: {
                                            replacement = "\\\\n";
                                            break;
                                        }
                                        case 9: {
                                            replacement = "\\\\t";
                                            break;
                                        }
                                        case 8: {
                                            replacement = "\\\\b";
                                            break;
                                        }
                                    }
                                }
                                else {
                                    replacement = "\\\\\\\\";
                                }
                            }
                            else {
                                replacement = "\\\\/";
                            }
                        }
                        else {
                            replacement = "\\\\\\\"";
                        }
                    }
                    else {
                        replacement = "\\\\r";
                    }
                }
                else {
                    replacement = "\\\\f";
                }
                matcher.appendReplacement(sb2, replacement);
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
    
    @RecentlyNonNull
    @a
    public static String c(@RecentlyNonNull String replacement) {
        String string = replacement;
        if (!TextUtils.isEmpty((CharSequence)replacement)) {
            final String a = h0.a(replacement);
            final Matcher matcher = r.a.matcher(a);
            StringBuffer sb = null;
            while (matcher.find()) {
                StringBuffer sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuffer();
                }
                final char char1 = matcher.group().charAt(1);
                if (char1 != '\"') {
                    if (char1 != '/') {
                        if (char1 != '\\') {
                            if (char1 != 'b') {
                                if (char1 != 'f') {
                                    if (char1 != 'n') {
                                        if (char1 != 'r') {
                                            if (char1 != 't') {
                                                throw new IllegalStateException("Found an escaped character that should never be.");
                                            }
                                            replacement = "\t";
                                        }
                                        else {
                                            replacement = "\r";
                                        }
                                    }
                                    else {
                                        replacement = "\n";
                                    }
                                }
                                else {
                                    replacement = "\f";
                                }
                            }
                            else {
                                replacement = "\b";
                            }
                        }
                        else {
                            replacement = "\\\\";
                        }
                    }
                    else {
                        replacement = "/";
                    }
                }
                else {
                    replacement = "\"";
                }
                matcher.appendReplacement(sb2, replacement);
                sb = sb2;
            }
            if (sb == null) {
                return a;
            }
            matcher.appendTail(sb);
            string = sb.toString();
        }
        return string;
    }
}
