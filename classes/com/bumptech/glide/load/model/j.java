// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import androidx.annotation.k0;
import androidx.annotation.b1;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import android.text.TextUtils;
import androidx.annotation.j0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class j implements h
{
    private final Map<String, List<i>> c;
    private volatile Map<String, String> d;
    
    j(final Map<String, List<i>> m) {
        this.c = Collections.unmodifiableMap((Map<? extends String, ? extends List<i>>)m);
    }
    
    @j0
    private String b(@j0 final List<i> list) {
        final StringBuilder sb = new StringBuilder();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final String a = list.get(i).a();
            if (!TextUtils.isEmpty((CharSequence)a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }
    
    private Map<String, String> c() {
        final HashMap<Object, String> hashMap = new HashMap<Object, String>();
        for (final Map.Entry<String, List<i>> entry : this.c.entrySet()) {
            final String b = this.b(entry.getValue());
            if (!TextUtils.isEmpty((CharSequence)b)) {
                hashMap.put(entry.getKey(), b);
            }
        }
        return (Map<String, String>)hashMap;
    }
    
    @Override
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = Collections.unmodifiableMap((Map<? extends String, ? extends String>)this.c());
                }
            }
        }
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof j && this.c.equals(((j)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
    
    public static final class a
    {
        private static final String d = "User-Agent";
        private static final String e;
        private static final Map<String, List<i>> f;
        private boolean a;
        private Map<String, List<i>> b;
        private boolean c;
        
        static {
            final String s = e = g();
            final HashMap<String, List<b>> m = new HashMap<String, List<b>>(2);
            if (!TextUtils.isEmpty((CharSequence)s)) {
                m.put("User-Agent", Collections.singletonList(new b(s)));
            }
            f = Collections.unmodifiableMap((Map<? extends String, ? extends List<i>>)m);
        }
        
        public a() {
            this.a = true;
            this.b = a.f;
            this.c = true;
        }
        
        private Map<String, List<i>> d() {
            final HashMap<String, ArrayList<i>> hashMap = (HashMap<String, ArrayList<i>>)new HashMap<String, List<i>>(this.b.size());
            for (final Map.Entry<String, List<i>> entry : this.b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList<i>(entry.getValue()));
            }
            return (Map<String, List<i>>)hashMap;
        }
        
        private void e() {
            if (this.a) {
                this.a = false;
                this.b = this.d();
            }
        }
        
        private List<i> f(final String s) {
            List<i> list;
            if ((list = this.b.get(s)) == null) {
                list = new ArrayList<i>();
                this.b.put(s, list);
            }
            return list;
        }
        
        @b1
        static String g() {
            final String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty((CharSequence)property)) {
                return property;
            }
            final int length = property.length();
            final StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; ++i) {
                final char char1 = property.charAt(i);
                char c;
                if ((char1 > '\u001f' || char1 == '\t') && char1 < '\u007f') {
                    c = char1;
                }
                else {
                    c = '?';
                }
                sb.append(c);
            }
            return sb.toString();
        }
        
        public a a(@j0 final String anotherString, @j0 final i i) {
            if (this.c && "User-Agent".equalsIgnoreCase(anotherString)) {
                return this.h(anotherString, i);
            }
            this.e();
            this.f(anotherString).add(i);
            return this;
        }
        
        public a b(@j0 final String s, @j0 final String s2) {
            return this.a(s, new b(s2));
        }
        
        public j c() {
            this.a = true;
            return new j(this.b);
        }
        
        public a h(@j0 final String anotherString, @k0 final i i) {
            this.e();
            if (i == null) {
                this.b.remove(anotherString);
            }
            else {
                final List<i> f = this.f(anotherString);
                f.clear();
                f.add(i);
            }
            if (this.c && "User-Agent".equalsIgnoreCase(anotherString)) {
                this.c = false;
            }
            return this;
        }
        
        public a i(@j0 final String s, @k0 final String s2) {
            i i;
            if (s2 == null) {
                i = null;
            }
            else {
                i = new b(s2);
            }
            return this.h(s, i);
        }
    }
    
    static final class b implements i
    {
        @j0
        private final String a;
        
        b(@j0 final String a) {
            this.a = a;
        }
        
        @Override
        public String a() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof b && this.a.equals(((b)o).a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("StringHeaderFactory{value='");
            sb.append(this.a);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
