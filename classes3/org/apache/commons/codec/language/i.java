// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.h;
import org.apache.commons.codec.k;

public class i implements k
{
    private static final String b = "AEIOU";
    private static final String c = "EIY";
    private static final String d = "CSPTG";
    private int a;
    
    public i() {
        this.a = 4;
    }
    
    private boolean c(final int n, final int n2) {
        boolean b = true;
        if (n2 + 1 != n) {
            b = false;
        }
        return b;
    }
    
    private boolean g(final StringBuilder sb, final int n, final char c) {
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 0) {
            b2 = b;
            if (n < sb.length() - 1) {
                b2 = b;
                if (sb.charAt(n + 1) == c) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    private boolean h(final StringBuilder sb, final int n, final char c) {
        boolean b2;
        final boolean b = b2 = false;
        if (n > 0) {
            b2 = b;
            if (n < sb.length()) {
                b2 = b;
                if (sb.charAt(n - 1) == c) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    private boolean i(final StringBuilder sb, final int n) {
        return "AEIOU".indexOf(sb.charAt(n)) >= 0;
    }
    
    private boolean k(final StringBuilder sb, final int n, final String anObject) {
        return n >= 0 && anObject.length() + n - 1 < sb.length() && sb.substring(n, anObject.length() + n).equals(anObject);
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.j((String)o);
        }
        throw new h("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }
    
    public int b() {
        return this.a;
    }
    
    @Override
    public String d(final String s) {
        return this.j(s);
    }
    
    public boolean f(final String s, final String s2) {
        return this.j(s).equals(this.j(s2));
    }
    
    public String j(final String s) {
        if (s != null) {
            final int length = s.length();
            if (length != 0) {
                if (length == 1) {
                    return s.toUpperCase(Locale.ENGLISH);
                }
                final char[] charArray = s.toUpperCase(Locale.ENGLISH).toCharArray();
                final StringBuilder sb = new StringBuilder(40);
                final StringBuilder sb2 = new StringBuilder(10);
                int n = 0;
                final char c = charArray[0];
                Label_0198: {
                    Label_0187: {
                        if (c != 'A') {
                            if (c != 'G' && c != 'K' && c != 'P') {
                                if (c != 'W') {
                                    if (c == 'X') {
                                        charArray[0] = 83;
                                    }
                                }
                                else {
                                    if (charArray[1] == 'R') {
                                        break Label_0187;
                                    }
                                    if (charArray[1] == 'H') {
                                        sb.append(charArray, 1, charArray.length - 1);
                                        sb.setCharAt(0, 'W');
                                        break Label_0198;
                                    }
                                }
                            }
                            else if (charArray[1] == 'N') {
                                break Label_0187;
                            }
                        }
                        else if (charArray[1] == 'E') {
                            break Label_0187;
                        }
                        sb.append(charArray);
                        break Label_0198;
                    }
                    sb.append(charArray, 1, charArray.length - 1);
                }
                int n2 = 0;
                for (int length2 = sb.length(); sb2.length() < this.b() && n < length2; n = n2) {
                    final char char1 = sb.charAt(n);
                    if (char1 != 'C' && this.h(sb, n, char1)) {
                        n2 = n + 1;
                    }
                    else {
                        Label_1100: {
                            Label_0907: {
                            Label_0840_Outer:
                                while (true) {
                                Label_0434_Outer:
                                    while (true) {
                                    Label_0562_Outer:
                                        while (true) {
                                            while (true) {
                                                switch (char1) {
                                                    default: {
                                                        n2 = n;
                                                        break Label_1100;
                                                    }
                                                    case 'X': {
                                                        sb2.append('K');
                                                    }
                                                    case 'Z': {
                                                        sb2.append('S');
                                                        n2 = n;
                                                        break Label_1100;
                                                    }
                                                    case 'W':
                                                    case 'Y': {
                                                        n2 = n;
                                                        if (this.c(length2, n)) {
                                                            break Label_1100;
                                                        }
                                                        n2 = n;
                                                        if (this.i(sb, n + 1)) {
                                                            break Label_0840;
                                                        }
                                                        break Label_1100;
                                                    }
                                                    case 'V': {
                                                        sb2.append('F');
                                                        n2 = n;
                                                        break Label_1100;
                                                    }
                                                    case 'T': {
                                                        if (this.k(sb, n, "TIA")) {
                                                            break;
                                                        }
                                                        if (this.k(sb, n, "TIO")) {
                                                            break;
                                                        }
                                                        if (this.k(sb, n, "TCH")) {
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        if (this.k(sb, n, "TH")) {
                                                            sb2.append('0');
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        break Label_0907;
                                                    }
                                                    case 'S': {
                                                        if (this.k(sb, n, "SH") || this.k(sb, n, "SIO") || this.k(sb, n, "SIA")) {
                                                            break;
                                                        }
                                                        continue Label_0840_Outer;
                                                    }
                                                    case 'Q': {
                                                        sb2.append('K');
                                                        n2 = n;
                                                        break Label_1100;
                                                    }
                                                    case 'P': {
                                                        if (this.g(sb, n, 'H')) {
                                                            continue Label_0562_Outer;
                                                        }
                                                        break Label_0840;
                                                    }
                                                    case 'K': {
                                                        if (n <= 0) {
                                                            break Label_0840;
                                                        }
                                                        n2 = n;
                                                        if (!this.h(sb, n, 'C')) {
                                                            break Label_0840;
                                                        }
                                                        break Label_1100;
                                                    }
                                                    case 'H': {
                                                        if (this.c(length2, n)) {
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        if (n > 0 && "CSPTG".indexOf(sb.charAt(n - 1)) >= 0) {
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        n2 = n;
                                                        if (this.i(sb, n + 1)) {
                                                            sb2.append('H');
                                                            n2 = n;
                                                        }
                                                        break Label_1100;
                                                    }
                                                    case 'G': {
                                                        final int n3 = n + 1;
                                                        if (this.c(length2, n3) && this.g(sb, n, 'H')) {
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        if (!this.c(length2, n3) && this.g(sb, n, 'H') && !this.i(sb, n + 2)) {
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        if (n > 0) {
                                                            n2 = n;
                                                            if (this.k(sb, n, "GN")) {
                                                                break Label_1100;
                                                            }
                                                            if (this.k(sb, n, "GNED")) {
                                                                n2 = n;
                                                                break Label_1100;
                                                            }
                                                        }
                                                        final boolean h = this.h(sb, n, 'G');
                                                        if (!this.c(length2, n) && "EIY".indexOf(sb.charAt(n3)) >= 0 && !h) {
                                                            sb2.append('J');
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        continue;
                                                    }
                                                    case 'F':
                                                    case 'J':
                                                    case 'L':
                                                    case 'M':
                                                    case 'N':
                                                    case 'R': {
                                                        sb2.append(char1);
                                                        n2 = n;
                                                        break Label_1100;
                                                    }
                                                    case 'D': {
                                                        if (this.c(length2, n + 1) || !this.g(sb, n, 'G')) {
                                                            break Label_0907;
                                                        }
                                                        n2 = n + 2;
                                                        if ("EIY".indexOf(sb.charAt(n2)) >= 0) {
                                                            sb2.append('J');
                                                            break Label_1100;
                                                        }
                                                        break Label_0907;
                                                    }
                                                    case 'C': {
                                                        if (this.h(sb, n, 'S') && !this.c(length2, n) && "EIY".indexOf(sb.charAt(n + 1)) >= 0) {
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        if (this.k(sb, n, "CIA")) {
                                                            break;
                                                        }
                                                        if (!this.c(length2, n) && "EIY".indexOf(sb.charAt(n + 1)) >= 0) {
                                                            continue Label_0840_Outer;
                                                        }
                                                        if (this.h(sb, n, 'S') && this.g(sb, n, 'H')) {
                                                            continue;
                                                        }
                                                        if (!this.g(sb, n, 'H')) {
                                                            continue;
                                                        }
                                                        if (n == 0 && length2 >= 3 && this.i(sb, 2)) {
                                                            continue;
                                                        }
                                                        break;
                                                    }
                                                    case 'B': {
                                                        if (this.h(sb, n, 'M') && this.c(length2, n)) {
                                                            n2 = n;
                                                            break Label_1100;
                                                        }
                                                        continue Label_0434_Outer;
                                                    }
                                                    case 'A':
                                                    case 'E':
                                                    case 'I':
                                                    case 'O':
                                                    case 'U': {
                                                        n2 = n;
                                                        if (n == 0) {
                                                            continue Label_0434_Outer;
                                                        }
                                                        break Label_1100;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                sb2.append('X');
                                n2 = n;
                                break Label_1100;
                            }
                            sb2.append('T');
                            n2 = n;
                        }
                        ++n2;
                    }
                    n = n2;
                    if (sb2.length() > this.b()) {
                        sb2.setLength(this.b());
                    }
                }
                return sb2.toString();
            }
        }
        return "";
    }
    
    public void l(final int a) {
        this.a = a;
    }
}
