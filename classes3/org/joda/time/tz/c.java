// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

import org.joda.time.h;
import java.util.Map;
import java.util.Locale;
import java.util.HashMap;

public class c implements e
{
    private HashMap<Locale, Map<String, Map<String, Object>>> a;
    private HashMap<Locale, Map<String, Map<Boolean, Object>>> b;
    
    public c() {
        this.a = (HashMap<Locale, Map<String, Map<String, Object>>>)this.c();
        this.b = (HashMap<Locale, Map<String, Map<Boolean, Object>>>)this.c();
    }
    
    private HashMap c() {
        return new HashMap(7);
    }
    
    private String[] e(final Locale locale, final String s, final String s2) {
        // monitorenter(this)
        final String[] array = null;
        if (locale != null && s != null) {
            if (s2 != null) {
                try {
                    Map<String, Map<String, Object>> c;
                    if ((c = this.a.get(locale)) == null) {
                        final HashMap<Locale, Map<String, Map<String, Object>>> a = this.a;
                        c = (Map<String, Map<String, Object>>)this.c();
                        a.put(locale, c);
                    }
                    Object o;
                    if ((o = c.get(s)) == null) {
                        final HashMap c2 = this.c();
                        c.put(s, c2);
                        final String[][] zoneStrings = h.f(Locale.ENGLISH).getZoneStrings();
                        final int length = zoneStrings.length;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                final String[] array2 = zoneStrings[i];
                                if (array2 != null && array2.length >= 5 && s.equals(array2[0])) {
                                    final String[][] zoneStrings2 = h.f(locale).getZoneStrings();
                                    final int length2 = zoneStrings2.length;
                                    int n = 0;
                                    String[] array3;
                                    while (true) {
                                        array3 = array;
                                        if (n >= length2) {
                                            break;
                                        }
                                        array3 = zoneStrings2[n];
                                        if (array3 != null && array3.length >= 5 && s.equals(array3[0])) {
                                            break;
                                        }
                                        ++n;
                                    }
                                    o = c2;
                                    if (array2 == null) {
                                        return ((Map<String, String[]>)o).get(s2);
                                    }
                                    o = c2;
                                    if (array3 == null) {
                                        return ((Map<String, String[]>)o).get(s2);
                                    }
                                    c2.put(array2[2], new String[] { array3[2], array3[1] });
                                    if (array2[2].equals(array2[4])) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(array2[4]);
                                        sb.append("-Summer");
                                        c2.put(sb.toString(), new String[] { array3[4], array3[3] });
                                        o = c2;
                                        return ((Map<String, String[]>)o).get(s2);
                                    }
                                    c2.put(array2[4], new String[] { array3[4], array3[3] });
                                    o = c2;
                                    return ((Map<String, String[]>)o).get(s2);
                                }
                                else {
                                    ++i;
                                }
                            }
                            final String[] array2 = null;
                            continue;
                        }
                    }
                    return ((Map<String, String[]>)o).get(s2);
                }
                finally {
                }
                // monitorexit(this)
            }
        }
        // monitorexit(this)
        return null;
    }
    
    private String[] f(final Locale locale, final String s, String substring, final boolean b) {
        // monitorenter(this)
        final String[] array = null;
        if (locale != null && s != null) {
            if (substring != null) {
                substring = s;
                try {
                    if (s.startsWith("Etc/")) {
                        substring = s.substring(4);
                    }
                    Map<String, Map<Boolean, Object>> c;
                    if ((c = this.b.get(locale)) == null) {
                        final HashMap<Locale, Map<String, Map<Boolean, Object>>> b2 = this.b;
                        c = (Map<String, Map<Boolean, Object>>)this.c();
                        b2.put(locale, c);
                    }
                    Object o;
                    if ((o = c.get(substring)) == null) {
                        final HashMap c2 = this.c();
                        c.put(substring, c2);
                        final String[][] zoneStrings = h.f(Locale.ENGLISH).getZoneStrings();
                        final int length = zoneStrings.length;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                final String[] array2 = zoneStrings[i];
                                if (array2 != null && array2.length >= 5 && substring.equals(array2[0])) {
                                    final String[][] zoneStrings2 = h.f(locale).getZoneStrings();
                                    final int length2 = zoneStrings2.length;
                                    int n = 0;
                                    String[] array3;
                                    while (true) {
                                        array3 = array;
                                        if (n >= length2) {
                                            break;
                                        }
                                        array3 = zoneStrings2[n];
                                        if (array3 != null && array3.length >= 5 && substring.equals(array3[0])) {
                                            break;
                                        }
                                        ++n;
                                    }
                                    o = c2;
                                    if (array2 == null) {
                                        return ((Map<Boolean, String[]>)o).get(b);
                                    }
                                    o = c2;
                                    if (array3 != null) {
                                        c2.put(Boolean.TRUE, new String[] { array3[2], array3[1] });
                                        c2.put(Boolean.FALSE, new String[] { array3[4], array3[3] });
                                        o = c2;
                                        return ((Map<Boolean, String[]>)o).get(b);
                                    }
                                    return ((Map<Boolean, String[]>)o).get(b);
                                }
                                else {
                                    ++i;
                                }
                            }
                            final String[] array2 = null;
                            continue;
                        }
                    }
                    return ((Map<Boolean, String[]>)o).get(b);
                }
                finally {
                }
                // monitorexit(this)
            }
        }
        // monitorexit(this)
        return null;
    }
    
    @Override
    public String a(final Locale locale, final String s, final String s2) {
        final String[] e = this.e(locale, s, s2);
        String s3;
        if (e == null) {
            s3 = null;
        }
        else {
            s3 = e[1];
        }
        return s3;
    }
    
    @Override
    public String b(final Locale locale, final String s, final String s2) {
        final String[] e = this.e(locale, s, s2);
        String s3;
        if (e == null) {
            s3 = null;
        }
        else {
            s3 = e[0];
        }
        return s3;
    }
    
    public String d(final Locale locale, final String s, final String s2, final boolean b) {
        final String[] f = this.f(locale, s, s2, b);
        String s3;
        if (f == null) {
            s3 = null;
        }
        else {
            s3 = f[1];
        }
        return s3;
    }
    
    public String g(final Locale locale, final String s, final String s2, final boolean b) {
        final String[] f = this.f(locale, s, s2, b);
        String s3;
        if (f == null) {
            s3 = null;
        }
        else {
            s3 = f[0];
        }
        return s3;
    }
}
