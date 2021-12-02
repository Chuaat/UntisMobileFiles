// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import java.util.Arrays;
import androidx.annotation.k0;
import androidx.annotation.b1;
import androidx.annotation.b0;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.Locale;

final class j implements k
{
    private static final Locale[] c;
    private static final Locale d;
    private static final Locale e;
    private static final Locale f;
    private final Locale[] a;
    @j0
    private final String b;
    
    static {
        c = new Locale[0];
        d = new Locale("en", "XA");
        e = new Locale("ar", "XB");
        f = i.b("en-Latn");
    }
    
    j(@j0 final Locale... array) {
        String string;
        if (array.length == 0) {
            this.a = j.c;
            string = "";
        }
        else {
            final ArrayList<Locale> list = new ArrayList<Locale>();
            final HashSet<Locale> set = new HashSet<Locale>();
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                final Locale o = array[i];
                if (o == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("list[");
                    sb2.append(i);
                    sb2.append("] is null");
                    throw new NullPointerException(sb2.toString());
                }
                if (!set.contains(o)) {
                    final Locale e = (Locale)o.clone();
                    list.add(e);
                    k(sb, e);
                    if (i < array.length - 1) {
                        sb.append(',');
                    }
                    set.add(e);
                }
            }
            this.a = list.toArray(new Locale[list.size()]);
            string = sb.toString();
        }
        this.b = string;
    }
    
    private Locale e(final Collection<String> collection, final boolean b) {
        final int f = this.f(collection, b);
        Locale locale;
        if (f == -1) {
            locale = null;
        }
        else {
            locale = this.a[f];
        }
        return locale;
    }
    
    private int f(final Collection<String> collection, final boolean b) {
        final Locale[] a = this.a;
        if (a.length == 1) {
            return 0;
        }
        if (a.length == 0) {
            return -1;
        }
        int g = 0;
        Label_0054: {
            if (b) {
                g = this.g(j.f);
                if (g == 0) {
                    return 0;
                }
                if (g < Integer.MAX_VALUE) {
                    break Label_0054;
                }
            }
            g = Integer.MAX_VALUE;
        }
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final int g2 = this.g(i.b(iterator.next()));
            if (g2 == 0) {
                return 0;
            }
            if (g2 >= g) {
                continue;
            }
            g = g2;
        }
        if (g == Integer.MAX_VALUE) {
            return 0;
        }
        return g;
    }
    
    private int g(final Locale locale) {
        int n = 0;
        while (true) {
            final Locale[] a = this.a;
            if (n >= a.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, a[n]) > 0) {
                return n;
            }
            ++n;
        }
    }
    
    private static String h(final Locale locale) {
        if (Build$VERSION.SDK_INT >= 21) {
            final String script = locale.getScript();
            if (!script.isEmpty()) {
                return script;
            }
        }
        return "";
    }
    
    private static boolean i(final Locale locale) {
        return j.d.equals(locale) || j.e.equals(locale);
    }
    
    @b0(from = 0L, to = 1L)
    private static int j(final Locale locale, final Locale obj) {
        final boolean equals = locale.equals(obj);
        final boolean b = true;
        if (equals) {
            return 1;
        }
        if (!locale.getLanguage().equals(obj.getLanguage())) {
            return 0;
        }
        if (i(locale) || i(obj)) {
            return 0;
        }
        final String h = h(locale);
        if (h.isEmpty()) {
            final String country = locale.getCountry();
            int n = b ? 1 : 0;
            if (!country.isEmpty()) {
                if (country.equals(obj.getCountry())) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
            return n;
        }
        return h.equals(h(obj)) ? 1 : 0;
    }
    
    @b1
    static void k(final StringBuilder sb, final Locale locale) {
        sb.append(locale.getLanguage());
        final String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }
    
    @Override
    public int a(final Locale obj) {
        int n = 0;
        while (true) {
            final Locale[] a = this.a;
            if (n >= a.length) {
                return -1;
            }
            if (a[n].equals(obj)) {
                return n;
            }
            ++n;
        }
    }
    
    @Override
    public String b() {
        return this.b;
    }
    
    @k0
    @Override
    public Object c() {
        return null;
    }
    
    @Override
    public Locale d(@j0 final String[] a) {
        return this.e(Arrays.asList(a), false);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final Locale[] a = ((j)o).a;
        if (this.a.length != a.length) {
            return false;
        }
        int n = 0;
        while (true) {
            final Locale[] a2 = this.a;
            if (n >= a2.length) {
                return true;
            }
            if (!a2[n].equals(a[n])) {
                return false;
            }
            ++n;
        }
    }
    
    @Override
    public Locale get(final int n) {
        if (n >= 0) {
            final Locale[] a = this.a;
            if (n < a.length) {
                return a[n];
            }
        }
        return null;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        int n2 = 0;
        while (true) {
            final Locale[] a = this.a;
            if (n2 >= a.length) {
                break;
            }
            n = n * 31 + a[n2].hashCode();
            ++n2;
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return this.a.length == 0;
    }
    
    @Override
    public int size() {
        return this.a.length;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        int n = 0;
        while (true) {
            final Locale[] a = this.a;
            if (n >= a.length) {
                break;
            }
            sb.append(a[n]);
            if (n < this.a.length - 1) {
                sb.append(',');
            }
            ++n;
        }
        sb.append("]");
        return sb.toString();
    }
}
