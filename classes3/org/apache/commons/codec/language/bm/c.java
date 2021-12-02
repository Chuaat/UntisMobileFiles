// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language.bm;

import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import org.apache.commons.codec.i;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.EnumMap;
import java.util.Set;
import java.util.Map;

public class c
{
    public static final String b = "any";
    private static final Map<org.apache.commons.codec.language.bm.d, c> c;
    public static final c d;
    public static final c e;
    private final Set<String> a;
    
    static {
        c = new EnumMap<org.apache.commons.codec.language.bm.d, c>(org.apache.commons.codec.language.bm.d.class);
        for (final org.apache.commons.codec.language.bm.d d2 : org.apache.commons.codec.language.bm.d.values()) {
            org.apache.commons.codec.language.bm.c.c.put(d2, a(d(d2)));
        }
        d = (c)new c() {
            @Override
            public boolean a(final String s) {
                return false;
            }
            
            @Override
            public String c() {
                throw new NoSuchElementException("Can't fetch any language from the empty language set.");
            }
            
            @Override
            public boolean d() {
                return true;
            }
            
            @Override
            public boolean e() {
                return false;
            }
            
            public c f(final c c) {
                return c;
            }
            
            @Override
            public c g(final c c) {
                return this;
            }
            
            @Override
            public String toString() {
                return "NO_LANGUAGES";
            }
        };
        e = (c)new c() {
            @Override
            public boolean a(final String s) {
                return true;
            }
            
            @Override
            public String c() {
                throw new NoSuchElementException("Can't fetch any language from the any language set.");
            }
            
            @Override
            public boolean d() {
                return false;
            }
            
            @Override
            public boolean e() {
                return false;
            }
            
            public c f(final c c) {
                return c;
            }
            
            @Override
            public c g(final c c) {
                return c;
            }
            
            @Override
            public String toString() {
                return "ANY_LANGUAGE";
            }
        };
    }
    
    private c(final Set<String> a) {
        this.a = a;
    }
    
    public static c a(String exception) {
        final HashSet<String> s = new HashSet<String>();
        exception = new Scanner(i.a((String)exception), "UTF-8");
    Label_0022:
        while (true) {
            int n = 0;
            try {
                while (((Scanner)exception).hasNextLine()) {
                    final String trim = ((Scanner)exception).nextLine().trim();
                    if (n != 0) {
                        if (trim.endsWith("*/")) {
                            continue Label_0022;
                        }
                        continue;
                    }
                    else if (trim.startsWith("/*")) {
                        n = 1;
                    }
                    else {
                        if (trim.length() <= 0) {
                            continue;
                        }
                        s.add(trim);
                    }
                }
                final c c = new c(Collections.unmodifiableSet((Set<? extends String>)s));
                ((Scanner)exception).close();
                return c;
            }
            finally {
                try {}
                finally {
                    try {
                        ((Scanner)exception).close();
                    }
                    finally {
                        final Throwable t;
                        t.addSuppressed((Throwable)exception);
                    }
                }
            }
        }
    }
    
    public static c b(final org.apache.commons.codec.language.bm.d d) {
        return org.apache.commons.codec.language.bm.c.c.get(d);
    }
    
    private static String d(final org.apache.commons.codec.language.bm.d d) {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", d.b());
    }
    
    public Set<String> c() {
        return this.a;
    }
    
    public abstract static class c
    {
        public static c b(final Set<String> set) {
            Object d;
            if (set.isEmpty()) {
                d = org.apache.commons.codec.language.bm.c.d;
            }
            else {
                d = new d((Set)set);
            }
            return (c)d;
        }
        
        public abstract boolean a(final String p0);
        
        public abstract String c();
        
        public abstract boolean d();
        
        public abstract boolean e();
        
        abstract c f(final c p0);
        
        public abstract c g(final c p0);
    }
    
    public static final class d extends c
    {
        private final Set<String> a;
        
        private d(final Set<String> s) {
            this.a = Collections.unmodifiableSet((Set<? extends String>)s);
        }
        
        @Override
        public boolean a(final String s) {
            return this.a.contains(s);
        }
        
        @Override
        public String c() {
            return this.a.iterator().next();
        }
        
        @Override
        public boolean d() {
            return this.a.isEmpty();
        }
        
        @Override
        public boolean e() {
            final int size = this.a.size();
            boolean b = true;
            if (size != 1) {
                b = false;
            }
            return b;
        }
        
        public c f(final c c) {
            if (c == c.d) {
                return this;
            }
            if (c == c.e) {
                return c;
            }
            final d d = (d)c;
            final HashSet<String> set = new HashSet<String>(this.a);
            final Iterator<String> iterator = d.a.iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next());
            }
            return c.b(set);
        }
        
        @Override
        public c g(final c c) {
            if (c == c.d) {
                return c;
            }
            if (c == c.e) {
                return this;
            }
            final d d = (d)c;
            final HashSet set = new HashSet<String>(Math.min(this.a.size(), d.a.size()));
            for (final String s : this.a) {
                if (d.a.contains(s)) {
                    set.add(s);
                }
            }
            return c.b((Set<String>)set);
        }
        
        public Set<String> h() {
            return this.a;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Languages(");
            sb.append(this.a.toString());
            sb.append(")");
            return sb.toString();
        }
    }
}
