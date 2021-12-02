// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.k0;
import android.os.LocaleList;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import java.util.Locale;

public final class i
{
    private static final i b;
    private k a;
    
    static {
        b = a(new Locale[0]);
    }
    
    private i(final k a) {
        this.a = a;
    }
    
    @j0
    public static i a(@j0 final Locale... array) {
        if (Build$VERSION.SDK_INT >= 24) {
            return n(new LocaleList(array));
        }
        return new i(new j(array));
    }
    
    static Locale b(final String s) {
        if (s.contains("-")) {
            final String[] split = s.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        }
        else {
            if (!s.contains("_")) {
                return new Locale(s);
            }
            final String[] split2 = s.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can not parse language tag: [");
        sb.append(s);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    public static i c(@k0 final String s) {
        if (s != null && !s.isEmpty()) {
            final String[] split = s.split(",", -1);
            final int length = split.length;
            final Locale[] array = new Locale[length];
            for (int i = 0; i < length; ++i) {
                Locale locale;
                if (Build$VERSION.SDK_INT >= 21) {
                    locale = Locale.forLanguageTag(split[i]);
                }
                else {
                    locale = b(split[i]);
                }
                array[i] = locale;
            }
            return a(array);
        }
        return g();
    }
    
    @j0
    @u0(min = 1L)
    public static i e() {
        if (Build$VERSION.SDK_INT >= 24) {
            return n(LocaleList.getAdjustedDefault());
        }
        return a(Locale.getDefault());
    }
    
    @j0
    @u0(min = 1L)
    public static i f() {
        if (Build$VERSION.SDK_INT >= 24) {
            return n(LocaleList.getDefault());
        }
        return a(Locale.getDefault());
    }
    
    @j0
    public static i g() {
        return i.b;
    }
    
    @j0
    @p0(24)
    public static i n(@j0 final LocaleList list) {
        return new i(new l(list));
    }
    
    @Deprecated
    @p0(24)
    public static i o(final Object o) {
        return n((LocaleList)o);
    }
    
    public Locale d(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof i && this.a.equals(((i)o).a);
    }
    
    @k0
    public Locale h(@j0 final String[] array) {
        return this.a.d(array);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @b0(from = -1L)
    public int i(final Locale locale) {
        return this.a.a(locale);
    }
    
    public boolean j() {
        return this.a.isEmpty();
    }
    
    @b0(from = 0L)
    public int k() {
        return this.a.size();
    }
    
    @j0
    public String l() {
        return this.a.b();
    }
    
    @k0
    public Object m() {
        return this.a.c();
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
