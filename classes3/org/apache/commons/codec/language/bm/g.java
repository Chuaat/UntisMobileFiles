// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language.bm;

import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import org.apache.commons.codec.i;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class g
{
    public static final n e;
    public static final String f = "ALL";
    private static final String g = "\"";
    private static final String h = "#include";
    private static final Map<d, Map<h, Map<String, Map<String, List<g>>>>> i;
    private final n a;
    private final String b;
    private final l c;
    private final n d;
    
    static {
        e = (n)new n() {
            @Override
            public boolean a(final CharSequence charSequence) {
                return true;
            }
        };
        i = new EnumMap<d, Map<h, Map<String, Map<String, List<g>>>>>(d.class);
        for (final d d : d.values()) {
            final EnumMap<h, Map<String, Map<String, List<g>>>> m = new EnumMap<h, Map<String, Map<String, List<g>>>>(h.class);
            for (final h h : org.apache.commons.codec.language.bm.h.values()) {
                final HashMap l = new HashMap<String, Map<String, List<g>>>();
                for (final String s : c.b(d).c()) {
                    try {
                        final Scanner g = g(d, h, s);
                        try {
                            l.put(s, s(g, e(d, h, s)));
                            if (g != null) {
                                g.close();
                                continue;
                            }
                            continue;
                        }
                        finally {
                            try {}
                            finally {
                                if (g != null) {
                                    try {
                                        g.close();
                                    }
                                    finally {
                                        final Throwable exception;
                                        ((Throwable)l).addSuppressed(exception);
                                    }
                                }
                            }
                        }
                    }
                    catch (IllegalStateException cause) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Problem processing ");
                        sb.append(e(d, h, s));
                        throw new IllegalStateException(sb.toString(), cause);
                    }
                    break;
                }
                if (!h.equals(org.apache.commons.codec.language.bm.h.J)) {
                    final Scanner g2 = g(d, h, "common");
                    try {
                        l.put("common", s(g2, e(d, h, "common")));
                        if (g2 != null) {
                            g2.close();
                        }
                    }
                    finally {
                        try {}
                        finally {
                            if (g2 != null) {
                                try {
                                    g2.close();
                                }
                                finally {
                                    final Throwable exception2;
                                    ((Throwable)h).addSuppressed(exception2);
                                }
                            }
                        }
                    }
                }
                m.put(h, Collections.unmodifiableMap((Map<?, ?>)l));
            }
            org.apache.commons.codec.language.bm.g.i.put(d, (Map<h, Map<String, Map<String, List<g>>>>)Collections.unmodifiableMap((Map<?, ?>)m));
        }
    }
    
    public g(final String b, final String str, final String str2, final l c) {
        this.b = b;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("$");
        this.a = t(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("^");
        sb2.append(str2);
        this.d = t(sb2.toString());
        this.c = c;
    }
    
    private static boolean d(final CharSequence charSequence, final char c) {
        for (int i = 0; i < charSequence.length(); ++i) {
            if (charSequence.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
    
    private static String e(final d d, final h h, final String s) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", d.b(), h.b(), s);
    }
    
    private static Scanner f(final String s) {
        return new Scanner(org.apache.commons.codec.i.a(String.format("org/apache/commons/codec/language/bm/%s.txt", s)), "UTF-8");
    }
    
    private static Scanner g(final d d, final h h, final String s) {
        return new Scanner(org.apache.commons.codec.i.a(e(d, h, s)), "UTF-8");
    }
    
    private static boolean h(final CharSequence charSequence, final CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int n = charSequence.length() - 1;
        for (int i = charSequence2.length() - 1; i >= 0; --i) {
            if (charSequence.charAt(n) != charSequence2.charAt(i)) {
                return false;
            }
            --n;
        }
        return true;
    }
    
    public static List<g> i(final d d, final h h, final String s) {
        return j(d, h, c.c.b(new HashSet<String>(Arrays.asList(s))));
    }
    
    public static List<g> j(final d d, final h h, final c.c c) {
        final Map<String, List<g>> l = l(d, h, c);
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<g>();
        final Iterator<List<g>> iterator = l.values().iterator();
        while (iterator.hasNext()) {
            list.addAll(iterator.next());
        }
        return (List<g>)list;
    }
    
    public static Map<String, List<g>> k(final d d, final h h, final String s) {
        final Map<String, List<g>> map = org.apache.commons.codec.language.bm.g.i.get(d).get(h).get(s);
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", d.b(), h.b(), s));
    }
    
    public static Map<String, List<g>> l(final d d, final h h, final c.c c) {
        String c2;
        if (c.e()) {
            c2 = c.c();
        }
        else {
            c2 = "any";
        }
        return k(d, h, c2);
    }
    
    private static k q(final String s) {
        final int index = s.indexOf("[");
        if (index < 0) {
            return new k(s, c.e);
        }
        if (s.endsWith("]")) {
            return new k(s.substring(0, index), c.c.b(new HashSet<String>(Arrays.asList(s.substring(index + 1, s.length() - 1).split("[+]")))));
        }
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
    }
    
    private static l r(String substring) {
        if (!substring.startsWith("(")) {
            return (l)q(substring);
        }
        if (substring.endsWith(")")) {
            final ArrayList<k> list = new ArrayList<k>();
            substring = substring.substring(1, substring.length() - 1);
            final String[] split = substring.split("[|]");
            for (int length = split.length, i = 0; i < length; ++i) {
                list.add(q(split[i]));
            }
            if (substring.startsWith("|") || substring.endsWith("|")) {
                list.add(new k("", c.e));
            }
            return (l)new m(list);
        }
        throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
    }
    
    private static Map<String, List<g>> s(final Scanner cause, final String s) {
        final HashMap<String, List<g>> hashMap = new HashMap<String, List<g>>();
        int i = 0;
        int n = 0;
        while (((Scanner)cause).hasNextLine()) {
            ++i;
            final String nextLine = ((Scanner)cause).nextLine();
            Label_0447: {
                String[] split = null;
                Block_10: {
                    Label_0051: {
                        if (n != 0) {
                            if (nextLine.endsWith("*/")) {
                                n = 0;
                                break Label_0447;
                            }
                            break Label_0051;
                        }
                        else {
                            if (nextLine.startsWith("/*")) {
                                n = 1;
                                break Label_0447;
                            }
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
                            if (trim.startsWith("#include")) {
                                final String trim2 = trim.substring(8).trim();
                                if (!trim2.contains(" ")) {
                                    final Scanner f = f(trim2);
                                    try {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(s);
                                        sb.append("->");
                                        sb.append(trim2);
                                        hashMap.putAll((Map<?, ?>)s(f, sb.toString()));
                                        if (f != null) {
                                            f.close();
                                            break Label_0051;
                                        }
                                        break Label_0051;
                                    }
                                    finally {
                                        try {}
                                        finally {
                                            if (f != null) {
                                                try {
                                                    f.close();
                                                }
                                                finally {
                                                    final Throwable exception;
                                                    cause.addSuppressed(exception);
                                                }
                                            }
                                        }
                                    }
                                }
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Malformed import statement '");
                                sb2.append(nextLine);
                                sb2.append("' in ");
                                sb2.append(s);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            split = trim.split("\\s+");
                            if (split.length == 4) {
                                break Block_10;
                            }
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Malformed rule statement split into ");
                            sb3.append(split.length);
                            sb3.append(" parts: ");
                            sb3.append(nextLine);
                            sb3.append(" in ");
                            sb3.append(s);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    }
                    break Label_0447;
                }
                try {
                    final String w = w(split[0]);
                    final String w2 = w(split[1]);
                    final String w3 = w(split[2]);
                    final l r = r(w(split[3]));
                    try {
                        final g g = new g(w, w2, w3, r) {
                            private final int j = n;
                            private final String k = s4;
                            
                            @Override
                            public String toString() {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Rule");
                                sb.append("{line=");
                                sb.append(this.j);
                                sb.append(", loc='");
                                sb.append(this.k);
                                sb.append('\'');
                                sb.append(", pat='");
                                sb.append(w);
                                sb.append('\'');
                                sb.append(", lcon='");
                                sb.append(w2);
                                sb.append('\'');
                                sb.append(", rcon='");
                                sb.append(w3);
                                sb.append('\'');
                                sb.append('}');
                                return sb.toString();
                            }
                        };
                        final String substring2 = g.b.substring(0, 1);
                        List<g> list;
                        if ((list = hashMap.get(substring2)) == null) {
                            list = new ArrayList<g>();
                            hashMap.put(substring2, list);
                        }
                        list.add(g);
                    }
                    catch (IllegalArgumentException cause) {}
                }
                catch (IllegalArgumentException ex) {}
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Problem parsing line '");
            sb4.append(i);
            sb4.append("' in ");
            sb4.append(s);
            throw new IllegalStateException(sb4.toString(), cause);
        }
        return hashMap;
    }
    
    private static n t(final String s) {
        final int startsWith = s.startsWith("^") ? 1 : 0;
        final boolean endsWith = s.endsWith("$");
        int length = s.length();
        if (endsWith) {
            --length;
        }
        final String substring = s.substring(startsWith, length);
        if (!substring.contains("[")) {
            if (startsWith != 0 && endsWith) {
                if (substring.length() == 0) {
                    return (n)new n() {
                        @Override
                        public boolean a(final CharSequence charSequence) {
                            return charSequence.length() == 0;
                        }
                    };
                }
                return (n)new n() {
                    @Override
                    public boolean a(final CharSequence charSequence) {
                        return charSequence.equals(substring);
                    }
                };
            }
            else {
                if ((startsWith != 0 || endsWith) && substring.length() == 0) {
                    return org.apache.commons.codec.language.bm.g.e;
                }
                if (startsWith != 0) {
                    return (n)new n() {
                        @Override
                        public boolean a(final CharSequence charSequence) {
                            return v(charSequence, substring);
                        }
                    };
                }
                if (endsWith) {
                    return (n)new n() {
                        @Override
                        public boolean a(final CharSequence charSequence) {
                            return h(charSequence, substring);
                        }
                    };
                }
            }
        }
        else {
            final boolean startsWith2 = substring.startsWith("[");
            final boolean endsWith2 = substring.endsWith("]");
            if (startsWith2 && endsWith2) {
                final String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains("[")) {
                    final boolean startsWith3 = substring2.startsWith("^");
                    String substring3 = substring2;
                    if (startsWith3) {
                        substring3 = substring2.substring(1);
                    }
                    final boolean b = startsWith3 ^ true;
                    if (startsWith != 0 && endsWith) {
                        return (n)new n() {
                            @Override
                            public boolean a(final CharSequence charSequence) {
                                final int length = charSequence.length();
                                boolean b = false;
                                if (length == 1) {
                                    b = b;
                                    if (d(substring3, charSequence.charAt(0)) == b) {
                                        b = true;
                                    }
                                }
                                return b;
                            }
                        };
                    }
                    if (startsWith != 0) {
                        return (n)new n() {
                            @Override
                            public boolean a(final CharSequence charSequence) {
                                final int length = charSequence.length();
                                boolean b = false;
                                if (length > 0) {
                                    b = b;
                                    if (d(substring3, charSequence.charAt(0)) == b) {
                                        b = true;
                                    }
                                }
                                return b;
                            }
                        };
                    }
                    if (endsWith) {
                        return (n)new n() {
                            @Override
                            public boolean a(final CharSequence charSequence) {
                                final int length = charSequence.length();
                                boolean b = true;
                                if (length <= 0 || d(substring3, charSequence.charAt(charSequence.length() - 1)) != b) {
                                    b = false;
                                }
                                return b;
                            }
                        };
                    }
                }
            }
        }
        return (n)new n() {
            Pattern a = Pattern.compile(s);
            
            @Override
            public boolean a(final CharSequence input) {
                return this.a.matcher(input).find();
            }
        };
    }
    
    private static boolean v(final CharSequence charSequence, final CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i = 0; i < charSequence2.length(); ++i) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    private static String w(String substring) {
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
    
    public n m() {
        return this.a;
    }
    
    public String n() {
        return this.b;
    }
    
    public l o() {
        return this.c;
    }
    
    public n p() {
        return this.d;
    }
    
    public boolean u(final CharSequence charSequence, final int n) {
        if (n >= 0) {
            final int n2 = this.b.length() + n;
            return n2 <= charSequence.length() && charSequence.subSequence(n, n2).equals(this.b) && this.d.a(charSequence.subSequence(n2, charSequence.length())) && this.a.a(charSequence.subSequence(0, n));
        }
        throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
    }
    
    public static final class k implements l
    {
        public static final Comparator<k> c;
        private final StringBuilder a;
        private final c.c b;
        
        static {
            c = new Comparator<k>() {
                public int a(final k k, final k i) {
                    for (int j = 0; j < k.a.length(); ++j) {
                        if (j >= i.a.length()) {
                            return 1;
                        }
                        final int n = k.a.charAt(j) - i.a.charAt(j);
                        if (n != 0) {
                            return n;
                        }
                    }
                    if (k.a.length() < i.a.length()) {
                        return -1;
                    }
                    return 0;
                }
            };
        }
        
        public k(final CharSequence seq, final c.c b) {
            this.a = new StringBuilder(seq);
            this.b = b;
        }
        
        public k(final k k, final k i) {
            this(k.a, k.b);
            this.a.append((CharSequence)i.a);
        }
        
        public k(final k k, final k i, final c.c c) {
            this(k.a, c);
            this.a.append((CharSequence)i.a);
        }
        
        @Override
        public Iterable<k> a() {
            return Collections.singleton(this);
        }
        
        public k c(final CharSequence s) {
            this.a.append(s);
            return this;
        }
        
        public c.c d() {
            return this.b;
        }
        
        public CharSequence e() {
            return this.a;
        }
        
        @Deprecated
        public k f(final k k) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a.toString());
            sb.append(k.a.toString());
            return new k(sb.toString(), this.b.g(k.b));
        }
        
        public k g(final c.c c) {
            return new k(this.a.toString(), this.b.f(c));
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a.toString());
            sb.append("[");
            sb.append(this.b);
            sb.append("]");
            return sb.toString();
        }
    }
    
    public interface l
    {
        Iterable<k> a();
    }
    
    public static final class m implements l
    {
        private final List<k> a;
        
        public m(final List<k> a) {
            this.a = a;
        }
        
        public List<k> b() {
            return this.a;
        }
    }
    
    public interface n
    {
        boolean a(final CharSequence p0);
    }
}
