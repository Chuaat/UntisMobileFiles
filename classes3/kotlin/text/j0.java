// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003" }, d2 = { "", "", "a", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class j0
{
    @e
    public static final String a(final char c) {
        final String value = String.valueOf(c);
        Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
        final Locale root = Locale.ROOT;
        String s = value.toUpperCase(root);
        k0.o((Object)s, "(this as java.lang.Strin\u2026.toUpperCase(Locale.ROOT)");
        if (s.length() > 1) {
            if (c != '\u0149') {
                final char char1 = s.charAt(0);
                final String substring = s.substring(1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase = substring.toLowerCase(root);
                k0.o((Object)lowerCase, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                final StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(char1));
                sb.append(lowerCase);
                s = sb.toString();
            }
            return s;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
