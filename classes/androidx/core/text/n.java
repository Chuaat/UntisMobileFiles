// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.TextUtils;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.Locale;

public final class n
{
    private static final Locale a;
    private static final String b = "Arab";
    private static final String c = "Hebr";
    
    static {
        a = new Locale("", "");
    }
    
    private n() {
    }
    
    private static int a(@j0 final Locale inLocale) {
        final byte directionality = Character.getDirectionality(inLocale.getDisplayName(inLocale).charAt(0));
        if (directionality != 1 && directionality != 2) {
            return 0;
        }
        return 1;
    }
    
    public static int b(@k0 final Locale locale) {
        if (Build$VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(n.a)) {
            final String c = e.c(locale);
            if (c == null) {
                return a(locale);
            }
            if (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
    
    @j0
    public static String c(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 17) {
            return TextUtils.htmlEncode(s);
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            String str;
            if (char1 != '\"') {
                if (char1 != '<') {
                    if (char1 != '>') {
                        if (char1 != '&') {
                            if (char1 != '\'') {
                                sb.append(char1);
                                continue;
                            }
                            str = "&#39;";
                        }
                        else {
                            str = "&amp;";
                        }
                    }
                    else {
                        str = "&gt;";
                    }
                }
                else {
                    str = "&lt;";
                }
            }
            else {
                str = "&quot;";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
