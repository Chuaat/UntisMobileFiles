// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import org.bson.p0;
import org.bson.z0;
import org.bson.r0;
import java.util.regex.Pattern;

public class n1 implements n0<Pattern>
{
    private static final int a = 256;
    
    private static int i(final org.bson.r0 r0) {
        final String x0 = r0.X0();
        int i = 0;
        if (x0 != null && x0.length() != 0) {
            final String lowerCase = x0.toLowerCase();
            int n = 0;
            while (i < lowerCase.length()) {
                final a g = n1.a.g(lowerCase.charAt(i));
                if (g == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unrecognized flag [");
                    sb.append(lowerCase.charAt(i));
                    sb.append("] ");
                    sb.append((int)lowerCase.charAt(i));
                    throw new IllegalArgumentException(sb.toString());
                }
                n |= g.G;
                g.I;
                ++i;
            }
            return n;
        }
        return 0;
    }
    
    private static String j(final Pattern pattern) {
        int flags = pattern.flags();
        final StringBuilder sb = new StringBuilder();
        final a[] values = n1.a.values();
        int n;
        for (int length = values.length, i = 0; i < length; ++i, flags = n) {
            final a a = values[i];
            n = flags;
            if ((pattern.flags() & a.G) > 0) {
                sb.append(a.H);
                n = flags - a.G;
            }
        }
        if (flags <= 0) {
            return sb.toString();
        }
        throw new IllegalArgumentException("some flags could not be recognized.");
    }
    
    public Pattern e(final p0 p2, final s0 s0) {
        final org.bson.r0 c4 = p2.C4();
        return Pattern.compile(c4.Y0(), i(c4));
    }
    
    @Override
    public Class<Pattern> g() {
        return Pattern.class;
    }
    
    public void h(final z0 z0, final Pattern pattern, final x0 x0) {
        z0.Y(new org.bson.r0(pattern.pattern(), j(pattern)));
    }
    
    private enum a
    {
        J(128, 'c', "Pattern.CANON_EQ"), 
        K(1, 'd', "Pattern.UNIX_LINES"), 
        L(256, 'g', (String)null), 
        M(2, 'i', (String)null), 
        N(8, 'm', (String)null), 
        O(32, 's', "Pattern.DOTALL"), 
        P(16, 't', "Pattern.LITERAL"), 
        Q(64, 'u', "Pattern.UNICODE_CASE"), 
        R(4, 'x', (String)null);
        
        private static final Map<Character, a> S;
        private final int G;
        private final char H;
        private final String I;
        
        static {
            int i = 0;
            S = new HashMap<Character, a>();
            for (a[] values = values(); i < values.length; ++i) {
                final a a10 = values[i];
                a.S.put(a10.H, a10);
            }
        }
        
        private a(final int g, final char c, final String i) {
            this.G = g;
            this.H = c;
            this.I = i;
        }
        
        public static a g(final char c) {
            return a.S.get(c);
        }
    }
}
