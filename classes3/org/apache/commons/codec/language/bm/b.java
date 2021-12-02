// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language.bm;

import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.Scanner;
import org.apache.commons.codec.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class b
{
    private static final Map<d, b> c;
    private static final String d = "org/apache/commons/codec/language/bm/%s_lang.txt";
    private final c a;
    private final List<b> b;
    
    static {
        c = new EnumMap<d, b>(d.class);
        for (final d d : org.apache.commons.codec.language.bm.d.values()) {
            b.c.put(d, d(String.format("org/apache/commons/codec/language/bm/%s_lang.txt", d.b()), org.apache.commons.codec.language.bm.c.b(d)));
        }
    }
    
    private b(final List<b> list, final c a) {
        this.b = Collections.unmodifiableList((List<? extends b>)list);
        this.a = a;
    }
    
    public static b c(final d d) {
        return b.c.get(d);
    }
    
    public static b d(final String str, final c c) {
        final ArrayList<b> list = new ArrayList<b>();
        final Scanner scanner = new Scanner(i.a(str), "UTF-8");
    Label_0022:
        while (true) {
            int n = 0;
            try {
                while (scanner.hasNextLine()) {
                    final String nextLine = scanner.nextLine();
                    if (n != 0) {
                        if (nextLine.endsWith("*/")) {
                            continue Label_0022;
                        }
                        continue;
                    }
                    else if (nextLine.startsWith("/*")) {
                        n = 1;
                    }
                    else {
                        final int index = nextLine.indexOf("//");
                        String substring;
                        if (index >= 0) {
                            substring = nextLine.substring(0, index);
                        }
                        else {
                            substring = nextLine;
                        }
                        final String trim = substring.trim();
                        if (trim.length() == 0) {
                            continue;
                        }
                        final String[] split = trim.split("\\s+");
                        if (split.length != 3) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Malformed line '");
                            sb.append(nextLine);
                            sb.append("' in language resource '");
                            sb.append(str);
                            sb.append("'");
                            throw new IllegalArgumentException(sb.toString());
                        }
                        list.add(new b(Pattern.compile(split[0]), (Set)new HashSet(Arrays.asList(split[1].split("\\+"))), split[2].equals("true")));
                    }
                }
                scanner.close();
                return new b(list, c);
            }
            finally {
                try {}
                finally {
                    try {
                        scanner.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)str).addSuppressed(exception);
                    }
                }
            }
        }
    }
    
    public String a(String c) {
        final c.c b = this.b(c);
        if (b.e()) {
            c = b.c();
        }
        else {
            c = "any";
        }
        return c;
    }
    
    public c.c b(final String s) {
        final String lowerCase = s.toLowerCase(Locale.ENGLISH);
        final HashSet<String> set = new HashSet<String>(this.a.c());
        for (final b b : this.b) {
            if (b.c(lowerCase)) {
                final boolean a = b.a;
                final Set b2 = b.b;
                if (a) {
                    set.retainAll(b2);
                }
                else {
                    set.removeAll(b2);
                }
            }
        }
        c.c c;
        if ((c = org.apache.commons.codec.language.bm.c.c.b(set)).equals(org.apache.commons.codec.language.bm.c.d)) {
            c = org.apache.commons.codec.language.bm.c.e;
        }
        return c;
    }
    
    private static final class b
    {
        private final boolean a;
        private final Set<String> b;
        private final Pattern c;
        
        private b(final Pattern c, final Set<String> b, final boolean a) {
            this.c = c;
            this.b = b;
            this.a = a;
        }
        
        public boolean c(final String input) {
            return this.c.matcher(input).find();
        }
    }
}
