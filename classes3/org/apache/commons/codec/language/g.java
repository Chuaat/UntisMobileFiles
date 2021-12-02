// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;
import org.apache.commons.codec.binary.m;
import java.util.Locale;
import org.apache.commons.codec.k;

public class g implements k
{
    private static final String b = "AEIOUY";
    private static final String[] c;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    private int a;
    
    static {
        c = new String[] { "GN", "KN", "PN", "WR", "PS" };
        d = new String[] { "L", "R", "N", "M", "B", "H", "F", "V", "W", " " };
        e = new String[] { "ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER" };
        f = new String[] { "L", "T", "K", "S", "N", "M", "B", "Z" };
    }
    
    public g() {
        this.a = 4;
    }
    
    private int A(final String s, final a a, int b, final boolean b2) {
        if (!k(s, b - 1, 3, "ISL", "YSL")) {
            if (b != 0 || !k(s, b, 5, "SUGAR")) {
                Label_0132: {
                    if (k(s, b, 2, "SH")) {
                        if (k(s, b + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                            a.a('S');
                        }
                        else {
                            a.a('X');
                        }
                    }
                    else {
                        if (k(s, b, 3, "SIO", "SIA") || k(s, b, 4, "SIAN")) {
                            if (b2) {
                                a.a('S');
                            }
                            else {
                                a.b('S', 'X');
                            }
                            b += 3;
                            return b;
                        }
                        if (b != 0 || !k(s, b + 1, 1, "M", "N", "L", "W")) {
                            final int n = b + 1;
                            if (!k(s, n, 1, "Z")) {
                                if (k(s, b, 2, "SC")) {
                                    b = this.B(s, a, b);
                                    return b;
                                }
                                if (b == s.length() - 1 && k(s, b - 2, 2, "AI", "OI")) {
                                    a.e('S');
                                }
                                else {
                                    a.a('S');
                                }
                                if (k(s, n, 1, "S", "Z")) {
                                    break Label_0132;
                                }
                                b = n;
                                return b;
                            }
                        }
                        a.b('S', 'X');
                        final int n2 = b + 1;
                        if (!k(s, n2, 1, "Z")) {
                            b = n2;
                            return b;
                        }
                    }
                }
                b += 2;
                return b;
            }
            a.b('X', 'S');
        }
        ++b;
        return b;
    }
    
    private int B(final String s, final a a, final int n) {
        final int n2 = n + 2;
        if (this.b(s, n2) == 'H') {
            final int n3 = n + 3;
            if (k(s, n3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (k(s, n3, 2, "ER", "EN")) {
                    a.d("X", "SK");
                    return n + 3;
                }
            }
            else {
                if (n == 0 && !this.K(this.b(s, 3)) && this.b(s, 3) != 'W') {
                    a.b('X', 'S');
                    return n + 3;
                }
                a.a('X');
                return n + 3;
            }
        }
        else if (k(s, n2, 1, "I", "E", "Y")) {
            a.a('S');
            return n + 3;
        }
        a.c("SK");
        return n + 3;
    }
    
    private int C(final String s, final a a, int n) {
        if (!k(s, n, 4, "TION") && !k(s, n, 3, "TIA", "TCH")) {
            if (!k(s, n, 2, "TH") && !k(s, n, 3, "TTH")) {
                a.a('T');
                final int n2 = n + 1;
                if (k(s, n2, 1, "T", "D")) {
                    n += 2;
                }
                else {
                    n = n2;
                }
            }
            else {
                n += 2;
                if (!k(s, n, 2, "OM", "AM") && !k(s, 0, 4, "VAN ", "VON ") && !k(s, 0, 3, "SCH")) {
                    a.b('0', 'T');
                }
                else {
                    a.a('T');
                }
            }
        }
        else {
            a.a('X');
            n += 3;
        }
        return n;
    }
    
    private int D(final String s, final a a, int n) {
        int n2 = 2;
        if (!k(s, n, 2, "WR")) {
            if (n == 0) {
                final int n3 = n + 1;
                if (this.K(this.b(s, n3)) || k(s, n, 2, "WH")) {
                    if (this.K(this.b(s, n3))) {
                        a.b('A', 'F');
                    }
                    else {
                        a.a('A');
                    }
                    n = n3;
                    return n;
                }
            }
            if ((n != s.length() - 1 || !this.K(this.b(s, n - 1))) && !k(s, n - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") && !k(s, 0, 3, "SCH")) {
                n2 = 4;
                if (k(s, n, 4, "WICZ", "WITZ")) {
                    a.d("TS", "FX");
                    return n + n2;
                }
            }
            else {
                a.e('F');
            }
            ++n;
            return n;
        }
        a.a('R');
        n += n2;
        return n;
    }
    
    private int E(final String s, final a a, int n) {
        if (n == 0) {
            a.a('S');
            ++n;
        }
        else {
            if (n != s.length() - 1 || (!k(s, n - 3, 3, "IAU", "EAU") && !k(s, n - 2, 2, "AU", "OU"))) {
                a.c("KS");
            }
            final int n2 = n + 1;
            if (k(s, n2, 1, "C", "X")) {
                n += 2;
            }
            else {
                n = n2;
            }
        }
        return n;
    }
    
    private int F(final String s, final a a, int n, final boolean b) {
        final int n2 = n + 1;
        if (this.b(s, n2) == 'H') {
            a.a('J');
            n += 2;
        }
        else {
            if (!k(s, n2, 2, "ZO", "ZI", "ZA") && (!b || n <= 0 || this.b(s, n - 1) == 'T')) {
                a.a('S');
            }
            else {
                a.d("S", "TS");
            }
            int n3 = n2;
            if (this.b(s, n2) == 'Z') {
                n3 = n + 2;
            }
            n = n3;
        }
        return n;
    }
    
    private boolean I(final String s) {
        final String[] c = g.c;
        final int length = c.length;
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= length) {
                break;
            }
            if (s.startsWith(c[n])) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    private boolean J(final String s) {
        return s.indexOf(87) > -1 || s.indexOf(75) > -1 || s.indexOf("CZ") > -1 || s.indexOf("WITZ") > -1;
    }
    
    private boolean K(final char ch) {
        return "AEIOUY".indexOf(ch) != -1;
    }
    
    private String c(String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim.toUpperCase(Locale.ENGLISH);
    }
    
    private boolean f(final String s, int b) {
        final boolean k = k(s, b, 4, "CHIA");
        final boolean b2 = true;
        if (k) {
            return true;
        }
        if (b <= 1) {
            return false;
        }
        final int n = b - 2;
        if (this.K(this.b(s, n))) {
            return false;
        }
        if (!k(s, b - 1, 3, "ACH")) {
            return false;
        }
        b = this.b(s, b + 2);
        if (b != 73) {
            final boolean b3 = b2;
            if (b != 69) {
                return b3;
            }
        }
        return k(s, n, 6, "BACHER", "MACHER") && b2;
    }
    
    private boolean g(final String s, int n) {
        if (n != 0) {
            return false;
        }
        ++n;
        return (k(s, n, 5, "HARAC", "HARIS") || k(s, n, 3, "HOR", "HYM", "HIA", "HEM")) && !k(s, 0, 5, "CHORE");
    }
    
    private boolean h(final String s, final int n) {
        final boolean b = false;
        if (!k(s, 0, 4, "VAN ", "VON ") && !k(s, 0, 3, "SCH") && !k(s, n - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            final int n2 = n + 2;
            if (!k(s, n2, 1, "T", "S")) {
                if (!k(s, n - 1, 1, "A", "O", "U", "E")) {
                    final boolean b2 = b;
                    if (n != 0) {
                        return b2;
                    }
                }
                if (!k(s, n2, 1, g.d)) {
                    final boolean b2 = b;
                    if (n + 1 != s.length() - 1) {
                        return b2;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean i(final String s, final int n) {
        return (n == s.length() - 3 && k(s, n - 1, 4, "ILLO", "ILLA", "ALLE")) || ((k(s, s.length() - 2, 2, "AS", "OS") || k(s, s.length() - 1, 1, "A", "O")) && k(s, n - 1, 4, "ALLE"));
    }
    
    private boolean j(final String s, final int n) {
        final int n2 = n + 1;
        final char b = this.b(s, n2);
        final boolean b2 = true;
        if (b == 'M') {
            return true;
        }
        if (k(s, n - 1, 3, "UMB")) {
            boolean b3 = b2;
            if (n2 == s.length() - 1) {
                return b3;
            }
            if (k(s, n + 2, 2, "ER")) {
                b3 = b2;
                return b3;
            }
        }
        return false;
    }
    
    protected static boolean k(String substring, int beginIndex, int length, final String... array) {
        boolean b2;
        final boolean b = b2 = false;
        if (beginIndex >= 0) {
            length += beginIndex;
            b2 = b;
            if (length <= substring.length()) {
                substring = substring.substring(beginIndex, length);
                length = array.length;
                beginIndex = 0;
                while (true) {
                    b2 = b;
                    if (beginIndex >= length) {
                        break;
                    }
                    if (substring.equals(array[beginIndex])) {
                        b2 = true;
                        break;
                    }
                    ++beginIndex;
                }
            }
        }
        return b2;
    }
    
    private int o(final a a, final int n) {
        if (n == 0) {
            a.a('A');
        }
        return n + 1;
    }
    
    private int p(final String s, final a a, int r) {
        Label_0015: {
            Label_0009: {
                if (!this.f(s, r)) {
                    Label_0045: {
                        if (r != 0 || !k(s, r, 6, "CAESAR")) {
                            if (k(s, r, 2, "CH")) {
                                r = this.r(s, a, r);
                                return r;
                            }
                            Label_0122: {
                                if (!k(s, r, 2, "CZ") || k(s, r - 2, 4, "WICZ")) {
                                    final int n = r + 1;
                                    if (k(s, n, 3, "CIA")) {
                                        a.a('X');
                                    }
                                    else {
                                        if (k(s, r, 2, "CC") && (r != 1 || this.b(s, 0) != 'M')) {
                                            return this.q(s, a, r);
                                        }
                                        if (k(s, r, 2, "CK", "CG", "CQ")) {
                                            break Label_0009;
                                        }
                                        if (k(s, r, 2, "CI", "CE", "CY")) {
                                            if (k(s, r, 3, "CIO", "CIE", "CIA")) {
                                                break Label_0122;
                                            }
                                            break Label_0045;
                                        }
                                        else {
                                            a.a('K');
                                            if (!k(s, n, 2, " C", " Q", " G")) {
                                                if (k(s, n, 1, "C", "K", "Q") && !k(s, n, 2, "CE", "CI")) {
                                                    break Label_0015;
                                                }
                                                r = n;
                                                return r;
                                            }
                                        }
                                    }
                                    r += 3;
                                    return r;
                                }
                            }
                            a.b('S', 'X');
                            break Label_0015;
                        }
                    }
                    a.a('S');
                    break Label_0015;
                }
            }
            a.a('K');
        }
        r += 2;
        return r;
    }
    
    private int q(final String s, final a a, int n) {
        final int n2 = n + 2;
        if (k(s, n2, 1, "I", "E", "H") && !k(s, n2, 2, "HU")) {
            if ((n == 1 && this.b(s, n - 1) == 'A') || k(s, n - 1, 5, "UCCEE", "UCCES")) {
                a.c("KS");
            }
            else {
                a.a('X');
            }
            n += 3;
        }
        else {
            a.a('K');
            n = n2;
        }
        return n;
    }
    
    private int r(final String s, final a a, final int n) {
        if (n > 0 && k(s, n, 4, "CHAE")) {
            a.b('K', 'X');
        }
        else {
            if (!this.g(s, n) && !this.h(s, n)) {
                if (n > 0) {
                    if (k(s, 0, 2, "MC")) {
                        a.a('K');
                    }
                    else {
                        a.b('X', 'K');
                    }
                }
                else {
                    a.a('X');
                }
                return n + 2;
            }
            a.a('K');
        }
        return n + 2;
    }
    
    private int s(final String s, final a a, int n) {
        if (k(s, n, 2, "DG")) {
            final int n2 = n + 2;
            if (k(s, n2, 1, "I", "E", "Y")) {
                a.a('J');
                n += 3;
            }
            else {
                a.c("TK");
                n = n2;
            }
        }
        else {
            final boolean k = k(s, n, 2, "DT", "DD");
            a.a('T');
            if (k) {
                n += 2;
            }
            else {
                ++n;
            }
        }
        return n;
    }
    
    private int t(final String s, final a a, int u, final boolean b) {
        final int n = u + 1;
        if (this.b(s, n) == 'H') {
            u = this.u(s, a, u);
        }
        else {
            if (this.b(s, n) == 'N') {
                if (u == 1 && this.K(this.b(s, 0)) && !b) {
                    a.d("KN", "N");
                }
                else if (!k(s, u + 2, 2, "EY") && this.b(s, n) != 'Y' && !b) {
                    a.d("N", "KN");
                }
                else {
                    a.c("KN");
                }
            }
            else if (k(s, n, 2, "LI") && !b) {
                a.d("KL", "L");
            }
            else if (u == 0 && (this.b(s, n) == 'Y' || k(s, n, 2, g.e))) {
                a.b('K', 'J');
            }
            else {
                while (true) {
                    Label_0343: {
                        if ((!k(s, n, 2, "ER") && this.b(s, n) != 'Y') || k(s, 0, 6, "DANGER", "RANGER", "MANGER")) {
                            break Label_0343;
                        }
                        final int n2 = u - 1;
                        if (k(s, n2, 1, "E", "I") || k(s, n2, 3, "RGY", "OGY")) {
                            break Label_0343;
                        }
                        a.b('K', 'J');
                        u += 2;
                        return u;
                    }
                    if (!k(s, n, 1, "E", "I", "Y") && !k(s, u - 1, 4, "AGGI", "OGGI")) {
                        int n3 = n;
                        if (this.b(s, n) == 'G') {
                            n3 = u + 2;
                        }
                        a.a('K');
                        u = n3;
                        return u;
                    }
                    if (k(s, 0, 4, "VAN ", "VON ") || k(s, 0, 3, "SCH") || k(s, n, 2, "ET")) {
                        a.a('K');
                        continue;
                    }
                    if (k(s, n, 3, "IER")) {
                        a.a('J');
                        continue;
                    }
                    a.b('J', 'K');
                    continue;
                }
            }
            u += 2;
        }
        return u;
    }
    
    private int u(final String s, final a a, int n) {
        Label_0025: {
            if (n <= 0 || this.K(this.b(s, n - 1))) {
                if (n == 0) {
                    n += 2;
                    if (this.b(s, n) == 'I') {
                        a.a('J');
                        return n;
                    }
                    a.a('K');
                    return n;
                }
                else {
                    if ((n > 1 && k(s, n - 2, 1, "B", "H", "D")) || (n > 2 && k(s, n - 3, 1, "B", "H", "D"))) {
                        break Label_0025;
                    }
                    if (n > 3 && k(s, n - 4, 1, "B", "H")) {
                        break Label_0025;
                    }
                    if (n > 2 && this.b(s, n - 1) == 'U' && k(s, n - 3, 1, "C", "G", "L", "R", "T")) {
                        a.a('F');
                        break Label_0025;
                    }
                    if (n <= 0 || this.b(s, n - 1) == 'I') {
                        break Label_0025;
                    }
                }
            }
            a.a('K');
        }
        n += 2;
        return n;
    }
    
    private int v(final String s, final a a, int n) {
        if ((n == 0 || this.K(this.b(s, n - 1))) && this.K(this.b(s, n + 1))) {
            a.a('H');
            n += 2;
        }
        else {
            ++n;
        }
        return n;
    }
    
    private int w(final String s, final a a, final int n, final boolean b) {
        int n4;
        if (!k(s, n, 4, "JOSE") && !k(s, 0, 4, "SAN ")) {
            Label_0209: {
                if (n == 0 && !k(s, n, 4, "JOSE")) {
                    a.b('J', 'A');
                }
                else {
                    final int n2 = n - 1;
                    if (this.K(this.b(s, n2)) && !b) {
                        final int n3 = n + 1;
                        if (this.b(s, n3) == 'A' || this.b(s, n3) == 'O') {
                            a.b('J', 'H');
                            break Label_0209;
                        }
                    }
                    if (n == s.length() - 1) {
                        a.b('J', ' ');
                    }
                    else if (!k(s, n + 1, 1, g.f) && !k(s, n2, 1, "S", "K", "L")) {
                        a.a('J');
                    }
                }
            }
            if (this.b(s, n4 = n + 1) == 'J') {
                n4 = n + 2;
            }
        }
        else {
            if ((n != 0 || this.b(s, n + 4) != ' ') && s.length() != 4 && !k(s, 0, 4, "SAN ")) {
                a.b('J', 'H');
            }
            else {
                a.a('H');
            }
            n4 = n + 1;
        }
        return n4;
    }
    
    private int x(final String s, final a a, int n) {
        final int n2 = n + 1;
        if (this.b(s, n2) == 'L') {
            if (this.i(s, n)) {
                a.g('L');
            }
            else {
                a.a('L');
            }
            n += 2;
        }
        else {
            a.a('L');
            n = n2;
        }
        return n;
    }
    
    private int y(final String s, final a a, final int n) {
        final int n2 = n + 1;
        int n3;
        if (this.b(s, n2) == 'H') {
            a.a('F');
            n3 = n + 2;
        }
        else {
            a.a('P');
            n3 = n2;
            if (k(s, n2, 1, "P", "B")) {
                n3 = n + 2;
            }
        }
        return n3;
    }
    
    private int z(final String s, final a a, final int n, final boolean b) {
        if (n == s.length() - 1 && !b && k(s, n - 2, 2, "IE") && !k(s, n - 4, 2, "ME", "MA")) {
            a.e('R');
        }
        else {
            a.a('R');
        }
        int n2;
        if (this.b(s, n2 = n + 1) == 'R') {
            n2 = n + 2;
        }
        return n2;
    }
    
    public boolean G(final String s, final String s2) {
        return this.H(s, s2, false);
    }
    
    public boolean H(final String s, final String s2, final boolean b) {
        return m.a(this.m(s, b), this.m(s2, b));
    }
    
    public void L(final int a) {
        this.a = a;
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.l((String)o);
        }
        throw new h("DoubleMetaphone encode parameter is not of type String");
    }
    
    protected char b(final String s, final int index) {
        if (index >= 0 && index < s.length()) {
            return s.charAt(index);
        }
        return '\0';
    }
    
    @Override
    public String d(final String s) {
        return this.l(s);
    }
    
    public String l(final String s) {
        return this.m(s, false);
    }
    
    public String m(String s, final boolean b) {
        s = this.c(s);
        if (s == null) {
            return null;
        }
        final boolean j = this.J(s);
        int index = this.I(s) ? 1 : 0;
        final a a = new a(this.n());
        while (!a.k() && index <= s.length() - 1) {
            final char char1 = s.charAt(index);
            Label_0646: {
                if (char1 != '\u00c7') {
                    if (char1 != '\u00d1') {
                        int n = 0;
                        Label_0285: {
                            switch (char1) {
                                default: {
                                    break Label_0646;
                                }
                                case 90: {
                                    index = this.F(s, a, index, j);
                                    continue;
                                }
                                case 88: {
                                    index = this.E(s, a, index);
                                    continue;
                                }
                                case 87: {
                                    index = this.D(s, a, index);
                                    continue;
                                }
                                case 86: {
                                    a.a('F');
                                    if (this.b(s, n = index + 1) == 'V') {
                                        break;
                                    }
                                    break Label_0285;
                                }
                                case 84: {
                                    index = this.C(s, a, index);
                                    continue;
                                }
                                case 83: {
                                    index = this.A(s, a, index, j);
                                    continue;
                                }
                                case 82: {
                                    index = this.z(s, a, index, j);
                                    continue;
                                }
                                case 81: {
                                    a.a('K');
                                    if (this.b(s, n = index + 1) == 'Q') {
                                        break;
                                    }
                                    break Label_0285;
                                }
                                case 80: {
                                    index = this.y(s, a, index);
                                    continue;
                                }
                                case 78: {
                                    a.a('N');
                                    if (this.b(s, n = index + 1) == 'N') {
                                        break;
                                    }
                                    break Label_0285;
                                }
                                case 77: {
                                    a.a('M');
                                    if (this.j(s, index)) {
                                        break;
                                    }
                                    break Label_0646;
                                }
                                case 76: {
                                    index = this.x(s, a, index);
                                    continue;
                                }
                                case 75: {
                                    a.a('K');
                                    if (this.b(s, n = index + 1) == 'K') {
                                        break;
                                    }
                                    break Label_0285;
                                }
                                case 74: {
                                    index = this.w(s, a, index, j);
                                    continue;
                                }
                                case 72: {
                                    index = this.v(s, a, index);
                                    continue;
                                }
                                case 71: {
                                    index = this.t(s, a, index, j);
                                    continue;
                                }
                                case 70: {
                                    a.a('F');
                                    if (this.b(s, n = index + 1) == 'F') {
                                        break;
                                    }
                                    break Label_0285;
                                }
                                case 68: {
                                    index = this.s(s, a, index);
                                    continue;
                                }
                                case 67: {
                                    index = this.p(s, a, index);
                                    continue;
                                }
                                case 66: {
                                    a.a('P');
                                    if (this.b(s, n = index + 1) == 'B') {
                                        break;
                                    }
                                    break Label_0285;
                                }
                                case 65:
                                case 69:
                                case 73:
                                case 79:
                                case 85:
                                case 89: {
                                    index = this.o(a, index);
                                    continue;
                                }
                            }
                            index += 2;
                            continue;
                        }
                        index = n;
                        continue;
                    }
                    a.a('N');
                }
                else {
                    a.a('S');
                }
            }
            ++index;
        }
        if (b) {
            s = a.i();
        }
        else {
            s = a.j();
        }
        return s;
    }
    
    public int n() {
        return this.a;
    }
    
    public class a
    {
        private final StringBuilder a;
        private final StringBuilder b;
        private final int c;
        
        public a(final int c) {
            this.a = new StringBuilder(g.this.n());
            this.b = new StringBuilder(g.this.n());
            this.c = c;
        }
        
        public void a(final char c) {
            this.g(c);
            this.e(c);
        }
        
        public void b(final char c, final char c2) {
            this.g(c);
            this.e(c2);
        }
        
        public void c(final String s) {
            this.h(s);
            this.f(s);
        }
        
        public void d(final String s, final String s2) {
            this.h(s);
            this.f(s2);
        }
        
        public void e(final char c) {
            if (this.b.length() < this.c) {
                this.b.append(c);
            }
        }
        
        public void f(final String str) {
            final int endIndex = this.c - this.b.length();
            if (str.length() <= endIndex) {
                this.b.append(str);
            }
            else {
                this.b.append(str.substring(0, endIndex));
            }
        }
        
        public void g(final char c) {
            if (this.a.length() < this.c) {
                this.a.append(c);
            }
        }
        
        public void h(final String str) {
            final int endIndex = this.c - this.a.length();
            if (str.length() <= endIndex) {
                this.a.append(str);
            }
            else {
                this.a.append(str.substring(0, endIndex));
            }
        }
        
        public String i() {
            return this.b.toString();
        }
        
        public String j() {
            return this.a.toString();
        }
        
        public boolean k() {
            return this.a.length() >= this.c && this.b.length() >= this.c;
        }
    }
}
