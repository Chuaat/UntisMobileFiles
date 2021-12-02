// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import java.util.Arrays;
import org.apache.commons.codec.h;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import org.apache.commons.codec.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.k;

public class f implements k
{
    private static final String b = "//";
    private static final String c = "\"";
    private static final String d = "*/";
    private static final String e = "/*";
    private static final String f = "org/apache/commons/codec/language/dmrules.txt";
    private static final int g = 6;
    private static final Map<Character, List<c>> h;
    private static final Map<Character, Character> i;
    private final boolean a;
    
    static {
        final Map<Character, List<c>> map = (Map<Character, List<c>>)(h = new HashMap<Character, List<c>>());
        final Map<Character, Character> map2 = (Map<Character, Character>)(i = new HashMap<Character, Character>());
        Object iterator = new Scanner(org.apache.commons.codec.i.a("org/apache/commons/codec/language/dmrules.txt"), "UTF-8");
        try {
            c((Scanner)iterator, "org/apache/commons/codec/language/dmrules.txt", map, map2);
            ((Scanner)iterator).close();
            iterator = map.entrySet().iterator();
            while (((Iterator)iterator).hasNext()) {
                Collections.sort((List<Object>)((Iterator<Map.Entry<K, List>>)iterator).next().getValue(), (Comparator<? super Object>)new Comparator<c>() {
                    public int a(final c c, final c c2) {
                        return c2.b() - c.b();
                    }
                });
            }
        }
        finally {
            try {}
            finally {
                try {
                    ((Scanner)iterator).close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
        }
    }
    
    public f() {
        this(true);
    }
    
    public f(final boolean a) {
        this.a = a;
    }
    
    private String b(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (final char c : s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                char c3;
                final char c2 = c3 = Character.toLowerCase(c);
                if (this.a) {
                    final Map<Character, Character> j = org.apache.commons.codec.language.f.i;
                    c3 = c2;
                    if (j.containsKey(c2)) {
                        c3 = j.get(c2);
                    }
                }
                sb.append(c3);
            }
        }
        return sb.toString();
    }
    
    private static void c(final Scanner scanner, final String s, final Map<Character, List<c>> map, final Map<Character, Character> map2) {
        int i = 0;
        String nextLine = null;
        String[] split2 = null;
    Label_0517:
        while (true) {
            int n = 0;
            int n2 = i;
            while (scanner.hasNextLine()) {
                i = n2 + 1;
                nextLine = scanner.nextLine();
                if (n != 0) {
                    n2 = i;
                    if (nextLine.endsWith("*/")) {
                        continue Label_0517;
                    }
                    continue;
                }
                else if (nextLine.startsWith("/*")) {
                    n = 1;
                    n2 = i;
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
                        n2 = i;
                    }
                    else if (trim.contains("=")) {
                        final String[] split = trim.split("=");
                        if (split.length != 2) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Malformed folding statement split into ");
                            sb.append(split.length);
                            sb.append(" parts: ");
                            sb.append(nextLine);
                            sb.append(" in ");
                            sb.append(s);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        final String s2 = split[0];
                        final String s3 = split[1];
                        if (s2.length() != 1 || s3.length() != 1) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Malformed folding statement - patterns are not single characters: ");
                            sb2.append(nextLine);
                            sb2.append(" in ");
                            sb2.append(s);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        map2.put(s2.charAt(0), s3.charAt(0));
                        n2 = i;
                    }
                    else {
                        split2 = trim.split("\\s+");
                        if (split2.length == 4) {
                            try {
                                final c c = new c(h(split2[0]), h(split2[1]), h(split2[2]), h(split2[3]));
                                final char char1 = c.a.charAt(0);
                                List<c> list;
                                if ((list = map.get(char1)) == null) {
                                    list = new ArrayList<c>();
                                    map.put(char1, list);
                                }
                                list.add(c);
                                n2 = i;
                                continue;
                            }
                            catch (IllegalArgumentException cause) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Problem parsing line '");
                                sb3.append(i);
                                sb3.append("' in ");
                                sb3.append(s);
                                throw new IllegalStateException(sb3.toString(), cause);
                            }
                            break Label_0517;
                        }
                        break Label_0517;
                    }
                }
            }
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Malformed rule statement split into ");
        sb4.append(split2.length);
        sb4.append(" parts: ");
        sb4.append(nextLine);
        sb4.append(" in ");
        sb4.append(s);
        throw new IllegalArgumentException(sb4.toString());
    }
    
    private String[] g(String b, final boolean b2) {
        if (b == null) {
            return null;
        }
        b = this.b(b);
        final LinkedHashSet<b> set = new LinkedHashSet<b>();
        set.add(new b());
        int i = 0;
        int n = 0;
        while (i < b.length()) {
            final char char1 = b.charAt(i);
            if (!Character.isWhitespace(char1)) {
                final String substring = b.substring(i);
                final List<c> list = org.apache.commons.codec.language.f.h.get(char1);
                if (list != null) {
                    List<Object> emptyList;
                    if (b2) {
                        emptyList = new ArrayList<Object>();
                    }
                    else {
                        emptyList = Collections.emptyList();
                    }
                    for (final c c : list) {
                        if (c.e(substring)) {
                            if (b2) {
                                emptyList.clear();
                            }
                            final String[] c2 = c.c(substring, n == 0);
                            final boolean b3 = c2.length > 1 && b2;
                            for (final b b4 : set) {
                                for (final String s : c2) {
                                    b a;
                                    if (b3) {
                                        a = b4.a();
                                    }
                                    else {
                                        a = b4;
                                    }
                                    a.c(s, (n == 109 && char1 == 'n') || (n == 110 && char1 == 'm'));
                                    if (!b2) {
                                        break;
                                    }
                                    emptyList.add(a);
                                }
                            }
                            if (b2) {
                                set.clear();
                                set.addAll((Collection<?>)emptyList);
                            }
                            i += c.b() - 1;
                            break;
                        }
                    }
                    n = char1;
                }
            }
            ++i;
        }
        final String[] array = new String[set.size()];
        final Iterator<Object> iterator3 = set.iterator();
        int n2 = 0;
        while (iterator3.hasNext()) {
            final b b5 = iterator3.next();
            b5.b();
            array[n2] = b5.toString();
            ++n2;
        }
        return array;
    }
    
    private static String h(String substring) {
        String substring2 = substring;
        if (substring.startsWith("\"")) {
            substring2 = substring.substring(1);
        }
        substring = substring2;
        if (substring2.endsWith("\"")) {
            substring = substring2.substring(0, substring2.length() - 1);
        }
        return substring;
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.d((String)o);
        }
        throw new h("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
    }
    
    @Override
    public String d(final String s) {
        if (s == null) {
            return null;
        }
        return this.g(s, false)[0];
    }
    
    public String f(final String s) {
        final String[] g = this.g(s, true);
        final StringBuilder sb = new StringBuilder();
        final int length = g.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            sb.append(g[i]);
            if (++n < g.length) {
                sb.append('|');
            }
            ++i;
        }
        return sb.toString();
    }
    
    private static final class b
    {
        private final StringBuilder a;
        private String b;
        private String c;
        
        private b() {
            this.a = new StringBuilder();
            this.c = null;
            this.b = null;
        }
        
        public b a() {
            final b b = new b();
            b.a.append(this.toString());
            b.c = this.c;
            return b;
        }
        
        public void b() {
            while (this.a.length() < 6) {
                this.a.append('0');
                this.b = null;
            }
        }
        
        public void c(final String c, final boolean b) {
            final String c2 = this.c;
            if ((c2 == null || !c2.endsWith(c) || b) && this.a.length() < 6) {
                this.a.append(c);
                if (this.a.length() > 6) {
                    final StringBuilder a = this.a;
                    a.delete(6, a.length());
                }
                this.b = null;
            }
            this.c = c;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof b && this.toString().equals(((b)o).toString()));
        }
        
        @Override
        public int hashCode() {
            return this.toString().hashCode();
        }
        
        @Override
        public String toString() {
            if (this.b == null) {
                this.b = this.a.toString();
            }
            return this.b;
        }
    }
    
    private static final class c
    {
        private final String a;
        private final String[] b;
        private final String[] c;
        private final String[] d;
        
        protected c(final String a, final String s, final String s2, final String s3) {
            this.a = a;
            this.b = s.split("\\|");
            this.c = s2.split("\\|");
            this.d = s3.split("\\|");
        }
        
        private boolean d(final char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
        
        public int b() {
            return this.a.length();
        }
        
        public String[] c(final String s, final boolean b) {
            if (b) {
                return this.b;
            }
            final int b2 = this.b();
            if (b2 < s.length() && this.d(s.charAt(b2))) {
                return this.c;
            }
            return this.d;
        }
        
        public boolean e(final String s) {
            return s.startsWith(this.a);
        }
        
        @Override
        public String toString() {
            return String.format("%s=(%s,%s,%s)", this.a, Arrays.asList(this.b), Arrays.asList(this.c), Arrays.asList(this.d));
        }
    }
}
