// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.net;

import java.util.Iterator;
import java.util.Map;
import java.util.Locale;
import androidx.core.util.n;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.net.Uri;
import java.util.HashMap;

public final class c
{
    public static final String b = "mailto:";
    private static final String c = "mailto";
    private static final String d = "to";
    private static final String e = "body";
    private static final String f = "cc";
    private static final String g = "bcc";
    private static final String h = "subject";
    private HashMap<String, String> a;
    
    private c() {
        this.a = new HashMap<String, String>();
    }
    
    public static boolean g(@k0 final Uri uri) {
        return uri != null && "mailto".equals(uri.getScheme());
    }
    
    public static boolean h(@k0 final String s) {
        return s != null && s.startsWith("mailto:");
    }
    
    @j0
    public static c i(@j0 final Uri uri) throws d {
        return j(uri.toString());
    }
    
    @j0
    public static c j(@j0 String str) throws d {
        n.g(str);
        if (h(str)) {
            final int index = str.indexOf(35);
            String substring = str;
            if (index != -1) {
                substring = str.substring(0, index);
            }
            final int index2 = substring.indexOf(63);
            String substring2;
            if (index2 == -1) {
                str = Uri.decode(substring.substring(7));
                substring2 = null;
            }
            else {
                str = Uri.decode(substring.substring(7, index2));
                substring2 = substring.substring(index2 + 1);
            }
            final c c = new c();
            if (substring2 != null) {
                final String[] split = substring2.split("&");
                for (int length = split.length, i = 0; i < length; ++i) {
                    final String[] split2 = split[i].split("=", 2);
                    if (split2.length != 0) {
                        final String lowerCase = Uri.decode(split2[0]).toLowerCase(Locale.ROOT);
                        String decode;
                        if (split2.length > 1) {
                            decode = Uri.decode(split2[1]);
                        }
                        else {
                            decode = null;
                        }
                        c.a.put(lowerCase, decode);
                    }
                }
            }
            final String f = c.f();
            String string = str;
            if (f != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                sb.append(f);
                string = sb.toString();
            }
            c.a.put("to", string);
            return c;
        }
        throw new d("Not a mailto scheme");
    }
    
    @k0
    public String a() {
        return this.a.get("bcc");
    }
    
    @k0
    public String b() {
        return this.a.get("body");
    }
    
    @k0
    public String c() {
        return this.a.get("cc");
    }
    
    @k0
    public Map<String, String> d() {
        return this.a;
    }
    
    @k0
    public String e() {
        return this.a.get("subject");
    }
    
    @k0
    public String f() {
        return this.a.get("to");
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("mailto:");
        sb.append('?');
        for (final Map.Entry<String, String> entry : this.a.entrySet()) {
            sb.append(Uri.encode((String)entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode((String)entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }
}
