// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a
{
    static final l d;
    private static final char e = '\u202a';
    private static final char f = '\u202b';
    private static final char g = '\u202c';
    private static final char h = '\u200e';
    private static final char i = '\u200f';
    private static final String j;
    private static final String k;
    private static final String l = "";
    private static final int m = 2;
    private static final int n = 2;
    static final a o;
    static final a p;
    private static final int q = -1;
    private static final int r = 0;
    private static final int s = 1;
    private final boolean a;
    private final int b;
    private final l c;
    
    static {
        final l l = d = androidx.core.text.m.c;
        j = Character.toString('\u200e');
        k = Character.toString('\u200f');
        o = new a(false, 2, l);
        p = new a(true, 2, l);
    }
    
    a(final boolean a, final int b, final l c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static int a(final CharSequence charSequence) {
        return new b(charSequence, false).d();
    }
    
    private static int b(final CharSequence charSequence) {
        return new b(charSequence, false).e();
    }
    
    public static a c() {
        return new a().a();
    }
    
    public static a d(final Locale locale) {
        return new a(locale).a();
    }
    
    public static a e(final boolean b) {
        return new a(b).a();
    }
    
    static boolean j(final Locale locale) {
        final int b = androidx.core.text.n.b(locale);
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        return b2;
    }
    
    private String k(final CharSequence charSequence, final l l) {
        final boolean b = l.b(charSequence, 0, charSequence.length());
        if (!this.a && (b || b(charSequence) == 1)) {
            return androidx.core.text.a.j;
        }
        if (this.a && (!b || b(charSequence) == -1)) {
            return androidx.core.text.a.k;
        }
        return "";
    }
    
    private String l(final CharSequence charSequence, final l l) {
        final boolean b = l.b(charSequence, 0, charSequence.length());
        if (!this.a && (b || a(charSequence) == 1)) {
            return androidx.core.text.a.j;
        }
        if (this.a && (!b || a(charSequence) == -1)) {
            return androidx.core.text.a.k;
        }
        return "";
    }
    
    public boolean f() {
        return (this.b & 0x2) != 0x0;
    }
    
    public boolean g(final CharSequence charSequence) {
        return this.c.b(charSequence, 0, charSequence.length());
    }
    
    public boolean h(final String s) {
        return this.g(s);
    }
    
    public boolean i() {
        return this.a;
    }
    
    public CharSequence m(final CharSequence charSequence) {
        return this.o(charSequence, this.c, true);
    }
    
    public CharSequence n(final CharSequence charSequence, final l l) {
        return this.o(charSequence, l, true);
    }
    
    public CharSequence o(final CharSequence charSequence, l l, final boolean b) {
        if (charSequence == null) {
            return null;
        }
        final boolean b2 = l.b(charSequence, 0, charSequence.length());
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f() && b) {
            if (b2) {
                l = androidx.core.text.m.b;
            }
            else {
                l = androidx.core.text.m.a;
            }
            spannableStringBuilder.append((CharSequence)this.l(charSequence, l));
        }
        if (b2 != this.a) {
            char c;
            if (b2) {
                c = '\u202b';
            }
            else {
                c = '\u202a';
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\u202c');
        }
        else {
            spannableStringBuilder.append(charSequence);
        }
        if (b) {
            if (b2) {
                l = androidx.core.text.m.b;
            }
            else {
                l = androidx.core.text.m.a;
            }
            spannableStringBuilder.append((CharSequence)this.k(charSequence, l));
        }
        return (CharSequence)spannableStringBuilder;
    }
    
    public CharSequence p(final CharSequence charSequence, final boolean b) {
        return this.o(charSequence, this.c, b);
    }
    
    public String q(final String s) {
        return this.s(s, this.c, true);
    }
    
    public String r(final String s, final l l) {
        return this.s(s, l, true);
    }
    
    public String s(final String s, final l l, final boolean b) {
        if (s == null) {
            return null;
        }
        return this.o(s, l, b).toString();
    }
    
    public String t(final String s, final boolean b) {
        return this.s(s, this.c, b);
    }
    
    public static final class a
    {
        private boolean a;
        private int b;
        private l c;
        
        public a() {
            this.c(androidx.core.text.a.j(Locale.getDefault()));
        }
        
        public a(final Locale locale) {
            this.c(androidx.core.text.a.j(locale));
        }
        
        public a(final boolean b) {
            this.c(b);
        }
        
        private static androidx.core.text.a b(final boolean b) {
            androidx.core.text.a a;
            if (b) {
                a = androidx.core.text.a.p;
            }
            else {
                a = androidx.core.text.a.o;
            }
            return a;
        }
        
        private void c(final boolean a) {
            this.a = a;
            this.c = a.d;
            this.b = 2;
        }
        
        public androidx.core.text.a a() {
            if (this.b == 2 && this.c == androidx.core.text.a.d) {
                return b(this.a);
            }
            return new androidx.core.text.a(this.a, this.b, this.c);
        }
        
        public a d(final l c) {
            this.c = c;
            return this;
        }
        
        public a e(final boolean b) {
            int b2;
            if (b) {
                b2 = (this.b | 0x2);
            }
            else {
                b2 = (this.b & 0xFFFFFFFD);
            }
            this.b = b2;
            return this;
        }
    }
    
    private static class b
    {
        private static final int f = 1792;
        private static final byte[] g;
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;
        
        static {
            g = new byte[1792];
            for (int i = 0; i < 1792; ++i) {
                b.g[i] = Character.getDirectionality(i);
            }
        }
        
        b(final CharSequence a, final boolean b) {
            this.a = a;
            this.b = b;
            this.c = a.length();
        }
        
        private static byte c(final char ch) {
            byte directionality;
            if (ch < '\u0700') {
                directionality = b.g[ch];
            }
            else {
                directionality = Character.getDirectionality(ch);
            }
            return directionality;
        }
        
        private byte f() {
            final int d = this.d;
            char char1;
            do {
                int d2 = this.d;
                if (d2 <= 0) {
                    break;
                }
                final CharSequence a = this.a;
                --d2;
                this.d = d2;
                char1 = a.charAt(d2);
                this.e = char1;
                if (char1 == '&') {
                    return 12;
                }
            } while (char1 != ';');
            this.d = d;
            this.e = 59;
            return 13;
        }
        
        private byte g() {
            char char1;
            do {
                final int d = this.d;
                if (d >= this.c) {
                    break;
                }
                final CharSequence a = this.a;
                this.d = d + 1;
                char1 = a.charAt(d);
                this.e = char1;
            } while (char1 != ';');
            return 12;
        }
        
        private byte h() {
            final int d = this.d;
            while (true) {
                int d2 = this.d;
                if (d2 <= 0) {
                    break;
                }
                final CharSequence a = this.a;
                --d2;
                this.d = d2;
                final char char1 = a.charAt(d2);
                this.e = char1;
                if (char1 == '<') {
                    return 12;
                }
                if (char1 == '>') {
                    break;
                }
                if (char1 != '\"' && char1 != '\'') {
                    continue;
                }
                char char2;
                do {
                    int d3 = this.d;
                    if (d3 <= 0) {
                        break;
                    }
                    final CharSequence a2 = this.a;
                    --d3;
                    this.d = d3;
                    char2 = a2.charAt(d3);
                    this.e = char2;
                } while (char2 != char1);
            }
            this.d = d;
            this.e = 62;
            return 13;
        }
        
        private byte i() {
            final int d = this.d;
            while (true) {
                final int d2 = this.d;
                if (d2 >= this.c) {
                    this.d = d;
                    this.e = 60;
                    return 13;
                }
                final CharSequence a = this.a;
                this.d = d2 + 1;
                final char char1 = a.charAt(d2);
                this.e = char1;
                if (char1 == '>') {
                    return 12;
                }
                if (char1 != '\"' && char1 != '\'') {
                    continue;
                }
                char char2;
                do {
                    final int d3 = this.d;
                    if (d3 >= this.c) {
                        break;
                    }
                    final CharSequence a2 = this.a;
                    this.d = d3 + 1;
                    char2 = a2.charAt(d3);
                    this.e = char2;
                } while (char2 != char1);
            }
        }
        
        byte a() {
            final char char1 = this.a.charAt(this.d - 1);
            this.e = char1;
            if (Character.isLowSurrogate(char1)) {
                final int codePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            --this.d;
            byte b = c(this.e);
            if (this.b) {
                final char e = this.e;
                if (e == '>') {
                    b = this.h();
                }
                else {
                    b = b;
                    if (e == ';') {
                        b = this.f();
                    }
                }
            }
            return b;
        }
        
        byte b() {
            final char char1 = this.a.charAt(this.d);
            this.e = char1;
            if (Character.isHighSurrogate(char1)) {
                final int codePoint = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(codePoint);
                return Character.getDirectionality(codePoint);
            }
            ++this.d;
            byte b = c(this.e);
            if (this.b) {
                final char e = this.e;
                if (e == '<') {
                    b = this.i();
                }
                else {
                    b = b;
                    if (e == '&') {
                        b = this.g();
                    }
                }
            }
            return b;
        }
        
        int d() {
            this.d = 0;
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            while (this.d < this.c && n == 0) {
                final byte b = this.b();
                if (b != 0) {
                    if (b != 1 && b != 2) {
                        if (b == 9) {
                            continue;
                        }
                        switch (b) {
                            case 18: {
                                --n3;
                                n2 = 0;
                                continue;
                            }
                            case 16:
                            case 17: {
                                ++n3;
                                n2 = 1;
                                continue;
                            }
                            case 14:
                            case 15: {
                                ++n3;
                                n2 = -1;
                                continue;
                            }
                        }
                    }
                    else if (n3 == 0) {
                        return 1;
                    }
                }
                else if (n3 == 0) {
                    return -1;
                }
                n = n3;
            }
            if (n == 0) {
                return 0;
            }
            if (n2 != 0) {
                return n2;
            }
            while (this.d > 0) {
                switch (this.a()) {
                    default: {
                        continue;
                    }
                    case 18: {
                        ++n3;
                        continue;
                    }
                    case 16:
                    case 17: {
                        if (n == n3) {
                            return 1;
                        }
                        break;
                    }
                    case 14:
                    case 15: {
                        if (n == n3) {
                            return -1;
                        }
                        break;
                    }
                }
                --n3;
            }
            return 0;
        }
        
        int e() {
            this.d = this.c;
            int n = 0;
            int n2 = 0;
            while (this.d > 0) {
                final byte a = this.a();
                Label_0136: {
                    if (a != 0) {
                        if (a != 1 && a != 2) {
                            if (a != 9) {
                                switch (a) {
                                    default: {
                                        if (n2 == 0) {
                                            break Label_0136;
                                        }
                                        continue;
                                    }
                                    case 18: {
                                        ++n;
                                        continue;
                                    }
                                    case 16:
                                    case 17: {
                                        if (n2 == n) {
                                            return 1;
                                        }
                                        break;
                                    }
                                    case 14:
                                    case 15: {
                                        if (n2 == n) {
                                            return -1;
                                        }
                                        break;
                                    }
                                }
                                --n;
                                continue;
                            }
                            continue;
                        }
                        else {
                            if (n == 0) {
                                return 1;
                            }
                            if (n2 != 0) {
                                continue;
                            }
                        }
                    }
                    else {
                        if (n == 0) {
                            return -1;
                        }
                        if (n2 != 0) {
                            continue;
                        }
                    }
                }
                n2 = n;
            }
            return 0;
        }
    }
}
