// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language.bm;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Set;
import java.util.Map;

public class e
{
    private static final Map<d, Set<String>> f;
    private static final int g = 20;
    private final org.apache.commons.codec.language.bm.b a;
    private final d b;
    private final h c;
    private final boolean d;
    private final int e;
    
    static {
        final Map<d, Set<String>> map = (Map<d, Set<String>>)(f = new EnumMap<d, Set<String>>(d.class));
        map.put(d.H, Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        map.put(d.J, Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        map.put(d.I, Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }
    
    public e(final d d, final h h, final boolean b) {
        this(d, h, b, 20);
    }
    
    public e(final d b, final h c, final boolean d, final int e) {
        final h j = h.J;
        if (c != j) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.a = org.apache.commons.codec.language.bm.b.c(b);
            this.e = e;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ruleType must not be ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private b a(b b, final Map<String, List<g>> obj) {
        Objects.requireNonNull(obj, "finalRules");
        if (obj.isEmpty()) {
            return b;
        }
        final TreeMap<Object, g.k> treeMap = new TreeMap<Object, g.k>((Comparator<? super Object>)org.apache.commons.codec.language.bm.g.k.c);
        for (final g.k k : b.d()) {
            b = org.apache.commons.codec.language.bm.e.b.c(k.d());
            final String string = k.e().toString();
            c c;
            for (int i = 0; i < string.length(); i = c.a()) {
                c = new c(obj, string, b, i, this.e).c();
                final boolean d = c.d();
                b = c.b();
                if (!d) {
                    b.a(string.subSequence(i, i + 1));
                }
            }
            for (g.l g : b.d()) {
                final g.k j = (g.k)g;
                if (treeMap.containsKey(j)) {
                    g = ((g.k)treeMap.remove(j)).g(j.d());
                }
                treeMap.put(g, (g.k)g);
            }
        }
        return new b((Set)treeMap.keySet());
    }
    
    private static String i(final Iterable<String> iterable, final String str) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = iterable.iterator();
        while (true) {
            Label_0038: {
                if (!iterator.hasNext()) {
                    break Label_0038;
                }
                sb.append(iterator.next());
            }
            if (iterator.hasNext()) {
                sb.append(str);
                continue;
            }
            break;
        }
        return sb.toString();
    }
    
    public String b(final String s) {
        return this.c(s, this.a.b(s));
    }
    
    public String c(String str, final org.apache.commons.codec.language.bm.c.c c) {
        final Map<String, List<g>> l = org.apache.commons.codec.language.bm.g.l(this.b, h.J, c);
        final Map<String, List<g>> k = org.apache.commons.codec.language.bm.g.k(this.b, this.c, "common");
        final Map<String, List<g>> i = org.apache.commons.codec.language.bm.g.l(this.b, this.c, c);
        final String trim = str.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
        if (this.b == org.apache.commons.codec.language.bm.d.I) {
            if (trim.length() >= 2 && trim.substring(0, 2).equals("d'")) {
                str = trim.substring(2);
                final StringBuilder sb = new StringBuilder();
                sb.append("d");
                sb.append(str);
                final String string = sb.toString();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("(");
                sb2.append(this.b(str));
                sb2.append(")-(");
                sb2.append(this.b(string));
                sb2.append(")");
                return sb2.toString();
            }
            final Iterator<String> iterator = org.apache.commons.codec.language.bm.e.f.get(this.b).iterator();
            while (iterator.hasNext()) {
                str = iterator.next();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" ");
                if (trim.startsWith(sb3.toString())) {
                    final String substring = trim.substring(str.length() + 1);
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(substring);
                    str = sb4.toString();
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("(");
                    sb5.append(this.b(substring));
                    sb5.append(")-(");
                    sb5.append(this.b(str));
                    sb5.append(")");
                    return sb5.toString();
                }
            }
        }
        final List<String> list = Arrays.asList(trim.split("\\s+"));
        final ArrayList<String> list2 = new ArrayList<String>();
        final int n = e$a.a[this.b.ordinal()];
        Label_0565: {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        list2.addAll((Collection<?>)list);
                        break Label_0565;
                    }
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("Unreachable case: ");
                    sb6.append(this.b);
                    throw new IllegalStateException(sb6.toString());
                }
                else {
                    list2.addAll((Collection<?>)list);
                }
            }
            else {
                final Iterator<String> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    final String[] split = iterator2.next().split("'");
                    list2.add(split[split.length - 1]);
                }
            }
            list2.removeAll(org.apache.commons.codec.language.bm.e.f.get(this.b));
        }
        if (this.d) {
            str = i(list2, " ");
        }
        else {
            if (list2.size() != 1) {
                final StringBuilder sb7 = new StringBuilder();
                final Iterator<Object> iterator3 = list2.iterator();
                while (iterator3.hasNext()) {
                    str = iterator3.next();
                    sb7.append("-");
                    sb7.append(this.b(str));
                }
                return sb7.substring(1);
            }
            str = list.iterator().next();
        }
        Object o = org.apache.commons.codec.language.bm.e.b.c(c);
        c c2;
        for (int j = 0; j < str.length(); j = c2.a(), o = c2.b()) {
            c2 = new c(l, str, (b)o, j, this.e).c();
        }
        return this.a(this.a((b)o, k), i).e();
    }
    
    public org.apache.commons.codec.language.bm.b d() {
        return this.a;
    }
    
    public int e() {
        return this.e;
    }
    
    public d f() {
        return this.b;
    }
    
    public h g() {
        return this.c;
    }
    
    public boolean h() {
        return this.d;
    }
    
    static final class b
    {
        private final Set<g.k> a;
        
        private b(final Set<g.k> a) {
            this.a = a;
        }
        
        private b(final g.k k) {
            (this.a = new LinkedHashSet<g.k>()).add(k);
        }
        
        public static b c(final org.apache.commons.codec.language.bm.c.c c) {
            return new b(new g.k("", c));
        }
        
        public void a(final CharSequence charSequence) {
            final Iterator<g.k> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(charSequence);
            }
        }
        
        public void b(final g.l l, final int initialCapacity) {
            final LinkedHashSet<g.k> set = new LinkedHashSet<g.k>(initialCapacity);
        Label_0144:
            for (final g.k k : this.a) {
                for (final g.k i : l.a()) {
                    final org.apache.commons.codec.language.bm.c.c g = k.d().g(i.d());
                    if (!g.d()) {
                        final g.k j = new g.k(k, i, g);
                        if (set.size() >= initialCapacity) {
                            continue;
                        }
                        set.add(j);
                        if (set.size() >= initialCapacity) {
                            break Label_0144;
                        }
                        continue;
                    }
                }
            }
            this.a.clear();
            this.a.addAll(set);
        }
        
        public Set<g.k> d() {
            return this.a;
        }
        
        public String e() {
            final StringBuilder sb = new StringBuilder();
            for (final g.k k : this.a) {
                if (sb.length() > 0) {
                    sb.append("|");
                }
                sb.append(k.e());
            }
            return sb.toString();
        }
    }
    
    private static final class c
    {
        private final Map<String, List<g>> a;
        private final CharSequence b;
        private final b c;
        private int d;
        private final int e;
        private boolean f;
        
        public c(final Map<String, List<g>> map, final CharSequence b, final b c, final int d, final int e) {
            Objects.requireNonNull(map, "finalRules");
            this.a = map;
            this.c = c;
            this.b = b;
            this.d = d;
            this.e = e;
        }
        
        public int a() {
            return this.d;
        }
        
        public b b() {
            return this.c;
        }
        
        public c c() {
            this.f = false;
            final Map<String, List<g>> a = this.a;
            final CharSequence b = this.b;
            final int d = this.d;
            final List<g> list = a.get(b.subSequence(d, d + 1));
            final int n = 1;
            int length;
            if (list != null) {
                final Iterator<g> iterator = list.iterator();
                length = 1;
                while (iterator.hasNext()) {
                    final g g = iterator.next();
                    length = g.n().length();
                    if (g.u(this.b, this.d)) {
                        this.c.b(g.o(), this.e);
                        this.f = true;
                        break;
                    }
                }
            }
            else {
                length = 1;
            }
            if (!this.f) {
                length = n;
            }
            this.d += length;
            return this;
        }
        
        public boolean d() {
            return this.f;
        }
    }
}
