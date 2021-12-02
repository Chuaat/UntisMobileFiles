// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import java.util.Collections;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.joda.time.e0;
import org.joda.time.m;
import java.util.Set;
import java.util.HashSet;
import org.joda.time.i0;
import java.io.IOException;
import java.util.Locale;
import org.joda.time.o0;
import java.io.Writer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.ConcurrentMap;

public class r
{
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private static final int n = 5;
    private static final int o = 0;
    private static final int p = 1;
    private static final int q = 2;
    private static final int r = 3;
    private static final int s = 4;
    private static final int t = 5;
    private static final int u = 6;
    private static final int v = 7;
    private static final int w = 8;
    private static final int x = 9;
    private static final int y = 9;
    private static final ConcurrentMap<String, Pattern> z;
    private int a;
    private int b;
    private int c;
    private boolean d;
    private f e;
    private List<Object> f;
    private boolean g;
    private boolean h;
    private c[] i;
    
    static {
        z = new ConcurrentHashMap<String, Pattern>();
    }
    
    public r() {
        this.G();
    }
    
    private r C(final f f) {
        final int size = this.f.size();
        Object value = null;
        Object value2;
        if (size > 0) {
            final List<Object> f2 = this.f;
            value = f2.get(f2.size() - 2);
            final List<Object> f3 = this.f;
            value2 = f3.get(f3.size() - 1);
        }
        else {
            value2 = null;
        }
        if (value != null && value2 != null && value == value2 && value instanceof c) {
            this.H();
            final c c = new c((c)value, f);
            final List<Object> f4 = this.f;
            f4.set(f4.size() - 2, c);
            final List<Object> f5 = this.f;
            f5.set(f5.size() - 1, c);
            this.i[c.g()] = c;
            return this;
        }
        throw new IllegalStateException("No field to apply suffix to");
    }
    
    private void H() throws IllegalStateException {
        if (this.e == null) {
            this.e = null;
            return;
        }
        throw new IllegalStateException("Prefix not followed by field");
    }
    
    private static Object[] I(final List<Object> list) {
        final int size = list.size();
        if (size == 0) {
            final e b = e.b;
            return new Object[] { b, b };
        }
        if (size != 1) {
            final a a = new a(list);
            return new Object[] { a, a };
        }
        return new Object[] { list.get(0), list.get(1) };
    }
    
    private static q S(final List<Object> list, final boolean b, final boolean b2) {
        if (b && b2) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        final int size = list.size();
        if (size >= 2 && list.get(0) instanceof i) {
            final i i = list.get(0);
            if (i.i == null && i.g == null) {
                final q s = S(list.subList(2, size), b, b2);
                final i h = i.h(s.g(), s.f());
                return new q(h, h);
            }
        }
        final Object[] j = I(list);
        if (b) {
            return new q(null, (s)j[1]);
        }
        if (b2) {
            return new q((t)j[0], null);
        }
        return new q((t)j[0], (s)j[1]);
    }
    
    private r d(final t t, final s s) {
        this.f.add(t);
        this.f.add(s);
        final boolean g = this.g;
        final boolean b = true;
        this.g = (t == null | g);
        this.h |= (s == null && b);
        return this;
    }
    
    private void f(final int n) {
        this.g(n, this.a);
    }
    
    private void g(final int n, final int n2) {
        final c c = new c(n2, this.b, this.c, this.d, n, this.i, this.e, null);
        this.d(c, c);
        this.i[n] = c;
        this.e = null;
    }
    
    private r p(final f f) {
        if (f != null) {
            final f e = this.e;
            Object e2 = f;
            if (e != null) {
                e2 = new b(e, f);
            }
            this.e = (f)e2;
            return this;
        }
        throw new IllegalArgumentException();
    }
    
    private r x(final String s, final String s2, final String[] array, final boolean b, final boolean b2) {
        if (s == null || s2 == null) {
            throw new IllegalArgumentException();
        }
        this.H();
        final List<Object> f = this.f;
        if (f.size() == 0) {
            if (b2 && !b) {
                final e b3 = org.joda.time.format.r.e.b;
                final i i = new i(s, s2, array, b3, b3, b, b2);
                this.d(i, i);
            }
            return this;
        }
        final i j = null;
        int size = f.size();
        Object subList;
        i k;
        while (true) {
            --size;
            subList = f;
            k = j;
            if (size < 0) {
                break;
            }
            if (f.get(size) instanceof i) {
                k = f.get(size);
                subList = f.subList(size + 1, f.size());
                break;
            }
            --size;
        }
        if (k != null && ((List)subList).size() == 0) {
            throw new IllegalStateException("Cannot have two adjacent separators");
        }
        final Object[] l = I((List<Object>)subList);
        ((List)subList).clear();
        final i m = new i(s, s2, array, (t)l[0], (s)l[1], b, b2);
        ((List<i>)subList).add(m);
        ((List<i>)subList).add(m);
        return this;
    }
    
    public r A(final String s) {
        if (s != null) {
            return this.C((f)new j(s));
        }
        throw new IllegalArgumentException();
    }
    
    public r B(final String s, final String s2) {
        if (s != null && s2 != null) {
            return this.C((f)new g(s, s2));
        }
        throw new IllegalArgumentException();
    }
    
    public r D(final String[] array, final String[] array2) {
        if (array != null && array2 != null && array.length >= 1 && array.length == array2.length) {
            return this.C((f)new h(array, array2));
        }
        throw new IllegalArgumentException();
    }
    
    public r E() {
        this.f(2);
        return this;
    }
    
    public r F() {
        this.f(0);
        return this;
    }
    
    public void G() {
        this.a = 1;
        this.b = 2;
        this.c = 10;
        this.d = false;
        this.e = null;
        final List<Object> f = this.f;
        if (f == null) {
            this.f = new ArrayList<Object>();
        }
        else {
            f.clear();
        }
        this.g = false;
        this.h = false;
        this.i = new c[10];
    }
    
    public r J(final int c) {
        this.c = c;
        return this;
    }
    
    public r K(final int a) {
        this.a = a;
        return this;
    }
    
    public r L() {
        this.b = 4;
        return this;
    }
    
    public r M() {
        this.b = 3;
        return this;
    }
    
    public r N() {
        this.b = 5;
        return this;
    }
    
    public r O() {
        this.b = 1;
        return this;
    }
    
    public r P() {
        this.b = 2;
        return this;
    }
    
    public r Q(final boolean d) {
        this.d = d;
        return this;
    }
    
    public q R() {
        final q s = S(this.f, this.g, this.h);
        for (final c c : this.i) {
            if (c != null) {
                c.f(this.i);
            }
        }
        this.i = this.i.clone();
        return s;
    }
    
    public s T() {
        if (this.h) {
            return null;
        }
        return this.R().f();
    }
    
    public t U() {
        if (this.g) {
            return null;
        }
        return this.R().g();
    }
    
    public r b(final q q) {
        if (q != null) {
            this.H();
            this.d(q.g(), q.f());
            return this;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }
    
    public r c(final t t, final s s) {
        if (t == null && s == null) {
            throw new IllegalArgumentException("No printer or parser supplied");
        }
        this.H();
        this.d(t, s);
        return this;
    }
    
    public r e() {
        this.f(3);
        return this;
    }
    
    public r h() {
        this.f(4);
        return this;
    }
    
    public r i(final String s) {
        if (s != null) {
            this.H();
            final e e = new e(s);
            this.d(e, e);
            return this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }
    
    public r j() {
        this.f(7);
        return this;
    }
    
    public r k() {
        this.g(7, 3);
        return this;
    }
    
    public r l() {
        this.f(5);
        return this;
    }
    
    public r m() {
        this.f(1);
        return this;
    }
    
    public r n(final String s) {
        if (s != null) {
            return this.p((f)new j(s));
        }
        throw new IllegalArgumentException();
    }
    
    public r o(final String s, final String s2) {
        if (s != null && s2 != null) {
            return this.p((f)new g(s, s2));
        }
        throw new IllegalArgumentException();
    }
    
    public r q(final String[] array, final String[] array2) {
        if (array != null && array2 != null && array.length >= 1 && array.length == array2.length) {
            return this.p((f)new h(array, array2));
        }
        throw new IllegalArgumentException();
    }
    
    public r r() {
        this.f(6);
        return this;
    }
    
    public r s() {
        this.f(8);
        return this;
    }
    
    public r t() {
        this.f(9);
        return this;
    }
    
    public r u(final String s) {
        return this.x(s, s, null, true, true);
    }
    
    public r v(final String s, final String s2) {
        return this.x(s, s2, null, true, true);
    }
    
    public r w(final String s, final String s2, final String[] array) {
        return this.x(s, s2, array, true, true);
    }
    
    public r y(final String s) {
        return this.x(s, s, null, false, true);
    }
    
    public r z(final String s) {
        return this.x(s, s, null, true, false);
    }
    
    static class a implements t, s
    {
        private final t[] a;
        private final s[] b;
        
        a(final List<Object> list) {
            final ArrayList<Object> list2 = new ArrayList<Object>();
            final ArrayList<Object> list3 = new ArrayList<Object>();
            this.g(list, list2, list3);
            if (list2.size() <= 0) {
                this.a = null;
            }
            else {
                this.a = list2.toArray(new t[list2.size()]);
            }
            if (list3.size() <= 0) {
                this.b = null;
            }
            else {
                this.b = list3.toArray(new s[list3.size()]);
            }
        }
        
        private void f(final List<Object> list, final Object[] array) {
            if (array != null) {
                for (int i = 0; i < array.length; ++i) {
                    list.add(array[i]);
                }
            }
        }
        
        private void g(final List<Object> list, final List<Object> list2, final List<Object> list3) {
            for (int size = list.size(), i = 0; i < size; i += 2) {
                final a value = list.get(i);
                if (value instanceof t) {
                    if (value instanceof a) {
                        this.f(list2, value.a);
                    }
                    else {
                        list2.add(value);
                    }
                }
                final a value2 = list.get(i + 1);
                if (value2 instanceof s) {
                    if (value2 instanceof a) {
                        this.f(list3, value2.b);
                    }
                    else {
                        list3.add(value2);
                    }
                }
            }
        }
        
        @Override
        public void a(final Writer writer, final o0 o0, final Locale locale) throws IOException {
            final t[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                a[i].a(writer, o0, locale);
            }
        }
        
        @Override
        public void b(final StringBuffer sb, final o0 o0, final Locale locale) {
            final t[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                a[i].b(sb, o0, locale);
            }
        }
        
        @Override
        public int c(final o0 o0, final Locale locale) {
            final t[] a = this.a;
            int length = a.length;
            int n = 0;
            while (--length >= 0) {
                n += a[length].c(o0, locale);
            }
            return n;
        }
        
        @Override
        public int d(final i0 i0, final String s, int d, final Locale locale) {
            final s[] b = this.b;
            if (b != null) {
                for (int length = b.length, n = 0; n < length && d >= 0; d = b[n].d(i0, s, d, locale), ++n) {}
                return d;
            }
            throw new UnsupportedOperationException();
        }
        
        @Override
        public int e(final o0 o0, final int n, final Locale locale) {
            t[] a;
            int length;
            int n2;
            for (a = this.a, length = a.length, n2 = 0; n2 < n && --length >= 0; n2 += a[length].e(o0, Integer.MAX_VALUE, locale)) {}
            return n2;
        }
    }
    
    static class b extends d
    {
        private final f b;
        private final f c;
        private final String[] d;
        
        b(final f b, final f c) {
            this.b = b;
            this.c = c;
            final HashSet<String> set = new HashSet<String>();
            for (final String str : b.f()) {
                for (final String str2 : this.c.f()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    set.add(sb.toString());
                }
            }
            this.d = set.toArray(new String[set.size()]);
        }
        
        @Override
        public int a(final String s, final int n) {
            final int a = this.b.a(s, n);
            if (a >= 0) {
                final int a2 = this.c.a(s, this.b.c(s, a));
                if (a2 < 0 || !((d)this).h(this.c.c(s, a2) - a, s, n)) {
                    if (a > 0) {
                        return a;
                    }
                    return a2;
                }
            }
            return ~n;
        }
        
        @Override
        public int b(final int n) {
            return this.b.b(n) + this.c.b(n);
        }
        
        @Override
        public int c(final String s, final int n) {
            int c;
            final int n2 = c = this.b.c(s, n);
            if (n2 >= 0) {
                final int c2 = this.c.c(s, n2);
                if ((c = c2) >= 0) {
                    c = c2;
                    if (((d)this).h(this.c(s, c2) - c2, s, n)) {
                        return ~n;
                    }
                }
            }
            return c;
        }
        
        @Override
        public void d(final StringBuffer sb, final int n) {
            this.b.d(sb, n);
            this.c.d(sb, n);
        }
        
        @Override
        public void e(final Writer writer, final int n) throws IOException {
            this.b.e(writer, n);
            this.c.e(writer, n);
        }
        
        @Override
        public String[] f() {
            return this.d.clone();
        }
    }
    
    static class c implements t, s
    {
        private final int a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;
        private final c[] f;
        private final f g;
        private final f h;
        
        c(final int a, final int b, final int c, final boolean d, final int e, final c[] f, final f g, final f h) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        c(final c c, final f f) {
            this.a = c.a;
            this.b = c.b;
            this.c = c.c;
            this.d = c.d;
            this.e = c.e;
            this.f = c.f;
            this.g = c.g;
            final f h = c.h;
            f h2 = f;
            if (h != null) {
                h2 = new b(h, f);
            }
            this.h = h2;
        }
        
        private int k(final String s, int n, int index) {
            if (index >= 10) {
                return Integer.parseInt(s.substring(n, index + n));
            }
            boolean b = false;
            if (index <= 0) {
                return 0;
            }
            final int index2 = n + 1;
            final char char1 = s.charAt(n);
            final int n2 = index - 1;
            index = index2;
            char char2 = char1;
            n = n2;
            if (char1 == '-') {
                n = n2 - 1;
                if (n < 0) {
                    return 0;
                }
                char2 = s.charAt(index2);
                index = index2 + 1;
                b = true;
            }
            final int n3 = char2 - '0';
            int i = n;
            n = n3;
            while (i > 0) {
                final char char3 = s.charAt(index);
                ++index;
                n = (n << 3) + (n << 1) + char3 - 48;
                --i;
            }
            index = n;
            if (b) {
                index = -n;
            }
            return index;
        }
        
        @Override
        public void a(final Writer writer, final o0 o0, final Locale locale) throws IOException {
            final long h = this.h(o0);
            if (h == Long.MAX_VALUE) {
                return;
            }
            int n = (int)h;
            if (this.e >= 8) {
                n = (int)(h / 1000L);
            }
            final f g = this.g;
            if (g != null) {
                g.e(writer, n);
            }
            final int a = this.a;
            if (a <= 1) {
                org.joda.time.format.i.n(writer, n);
            }
            else {
                org.joda.time.format.i.l(writer, n, a);
            }
            if (this.e >= 8) {
                final int n2 = (int)(Math.abs(h) % 1000L);
                if (this.e == 8 || n2 > 0) {
                    writer.write(46);
                    org.joda.time.format.i.l(writer, n2, 3);
                }
            }
            final f h2 = this.h;
            if (h2 != null) {
                h2.e(writer, n);
            }
        }
        
        @Override
        public void b(final StringBuffer sb, final o0 o0, final Locale locale) {
            final long h = this.h(o0);
            if (h == Long.MAX_VALUE) {
                return;
            }
            int n = (int)h;
            if (this.e >= 8) {
                n = (int)(h / 1000L);
            }
            final f g = this.g;
            if (g != null) {
                g.d(sb, n);
            }
            final int length = sb.length();
            final int a = this.a;
            if (a <= 1) {
                org.joda.time.format.i.g(sb, n);
            }
            else {
                org.joda.time.format.i.c(sb, n, a);
            }
            if (this.e >= 8) {
                final int n2 = (int)(Math.abs(h) % 1000L);
                if (this.e == 8 || n2 > 0) {
                    if (h < 0L && h > -1000L) {
                        sb.insert(length, '-');
                    }
                    sb.append('.');
                    org.joda.time.format.i.c(sb, n2, 3);
                }
            }
            final f h2 = this.h;
            if (h2 != null) {
                h2.d(sb, n);
            }
        }
        
        @Override
        public int c(final o0 o0, final Locale locale) {
            final long h = this.h(o0);
            if (h == Long.MAX_VALUE) {
                return 0;
            }
            int max;
            final int a = max = Math.max(org.joda.time.format.i.i(h), this.a);
            long n = h;
            if (this.e >= 8) {
                int b;
                if (h < 0L) {
                    b = 5;
                }
                else {
                    b = 4;
                }
                final int n2 = max = Math.max(a, b) + 1;
                if (this.e == 9) {
                    max = n2;
                    if (Math.abs(h) % 1000L == 0L) {
                        max = n2 - 4;
                    }
                }
                n = h / 1000L;
            }
            final int n3 = (int)n;
            final f g = this.g;
            int n4 = max;
            if (g != null) {
                n4 = max + g.b(n3);
            }
            final f h2 = this.h;
            int n5 = n4;
            if (h2 != null) {
                n5 = n4 + h2.b(n3);
            }
            return n5;
        }
        
        @Override
        public int d(final i0 i0, final String s, int n, final Locale locale) {
            int n2 = n;
            final boolean b = this.b == 4;
            if (n2 >= s.length()) {
                if (b) {
                    n2 ^= -1;
                }
                return n2;
            }
            final f g = this.g;
            n = n2;
            int n3 = b ? 1 : 0;
            if (g != null) {
                n = g.c(s, n2);
                if (n >= 0) {
                    n3 = 1;
                }
                else {
                    if (!b) {
                        return ~n;
                    }
                    return n;
                }
            }
            final f h = this.h;
            int n4 = -1;
            int a;
            if (h != null && n3 == 0) {
                a = h.a(s, n);
                if (a >= 0) {
                    n3 = 1;
                }
                else {
                    if (n3 == 0) {
                        return ~a;
                    }
                    return a;
                }
            }
            else {
                a = -1;
            }
            if (n3 == 0 && !this.i(i0.I(), this.e)) {
                return n;
            }
            final int c = this.c;
            int b2;
            if (a > 0) {
                b2 = a - n;
            }
            else {
                b2 = s.length() - n;
            }
            int n5 = Math.min(c, b2);
            int n6 = 0;
            boolean b3 = false;
            int n7 = 0;
            int n8 = n;
            int n9;
            while (true) {
                n9 = n7;
                if (n6 >= n5) {
                    break;
                }
                final int index = n8 + n6;
                n = s.charAt(index);
                if (n6 == 0 && (n == 45 || n == 43) && !this.d) {
                    if (n == 45) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    final int n10 = n6 + 1;
                    n9 = n;
                    if (n10 >= n5) {
                        break;
                    }
                    final char char1 = s.charAt(index + 1);
                    n9 = n;
                    if (char1 < '0') {
                        break;
                    }
                    if (char1 > '9') {
                        n9 = n;
                        break;
                    }
                    if (n != 0) {
                        n6 = n10;
                    }
                    else {
                        ++n8;
                    }
                    n5 = Math.min(n5 + 1, s.length() - n8);
                    n7 = n;
                }
                else {
                    if (n >= 48 && n <= 57) {
                        b3 = true;
                    }
                    else {
                        if (n != 46) {
                            n9 = n7;
                            if (n != 44) {
                                break;
                            }
                        }
                        n = this.e;
                        if (n != 8) {
                            n9 = n7;
                            if (n != 9) {
                                break;
                            }
                        }
                        if (n4 >= 0) {
                            n9 = n7;
                            break;
                        }
                        n5 = Math.min(n5 + 1, s.length() - n8);
                        n4 = index + 1;
                    }
                    ++n6;
                }
            }
            if (!b3) {
                return ~n8;
            }
            if (a >= 0 && n8 + n6 != a) {
                return n8;
            }
            int e = this.e;
            Label_0699: {
                Label_0526: {
                    if (e != 8 && e != 9) {
                        n = this.k(s, n8, n6);
                    }
                    else {
                        final int n11 = 7;
                        if (n4 < 0) {
                            this.l(i0, 6, this.k(s, n8, n6));
                            this.l(i0, 7, 0);
                            break Label_0699;
                        }
                        final int k = this.k(s, n8, n4 - n8 - 1);
                        this.l(i0, 6, k);
                        n = n8 + n6 - n4;
                        if (n <= 0) {
                            n = 0;
                            e = n11;
                        }
                        else {
                            int j;
                            if (n >= 3) {
                                j = this.k(s, n4, 3);
                            }
                            else {
                                final int l = this.k(s, n4, n);
                                if (n == 1) {
                                    n = l * 100;
                                }
                                else {
                                    n = l * 10;
                                }
                                j = n;
                            }
                            if (n9 == 0) {
                                e = n11;
                                n = j;
                                if (k >= 0) {
                                    break Label_0526;
                                }
                            }
                            n = -j;
                            e = n11;
                        }
                    }
                }
                this.l(i0, e, n);
            }
            final int n12 = n = n8 + n6;
            if (n12 >= 0) {
                final f h2 = this.h;
                n = n12;
                if (h2 != null) {
                    n = h2.c(s, n12);
                }
            }
            return n;
        }
        
        @Override
        public int e(final o0 o0, final int n, final Locale locale) {
            if (n <= 0) {
                return 0;
            }
            if (this.b != 4 && this.h(o0) == Long.MAX_VALUE) {
                return 0;
            }
            return 1;
        }
        
        public void f(final c[] array) {
            final HashSet<f> set = new HashSet<f>();
            final HashSet<f> set2 = new HashSet<f>();
            for (final c obj : array) {
                if (obj != null && !this.equals(obj)) {
                    set.add(obj.g);
                    set2.add(obj.h);
                }
            }
            final f g = this.g;
            if (g != null) {
                g.g(set);
            }
            final f h = this.h;
            if (h != null) {
                h.g(set2);
            }
        }
        
        int g() {
            return this.e;
        }
        
        long h(final o0 o0) {
            e0 i;
            if (this.b == 4) {
                i = null;
            }
            else {
                i = o0.I();
            }
            if (i != null && !this.i(i, this.e)) {
                return Long.MAX_VALUE;
            }
            long n = 0L;
            Label_0212: {
                m m = null;
                switch (this.e) {
                    default: {
                        return Long.MAX_VALUE;
                    }
                    case 8:
                    case 9: {
                        n = o0.y(org.joda.time.m.l()) * 1000L + o0.y(org.joda.time.m.i());
                        break Label_0212;
                    }
                    case 7: {
                        m = org.joda.time.m.i();
                        break;
                    }
                    case 6: {
                        m = org.joda.time.m.l();
                        break;
                    }
                    case 5: {
                        m = org.joda.time.m.j();
                        break;
                    }
                    case 4: {
                        m = org.joda.time.m.g();
                        break;
                    }
                    case 3: {
                        m = org.joda.time.m.b();
                        break;
                    }
                    case 2: {
                        m = org.joda.time.m.m();
                        break;
                    }
                    case 1: {
                        m = org.joda.time.m.k();
                        break;
                    }
                    case 0: {
                        m = org.joda.time.m.o();
                        break;
                    }
                }
                n = o0.y(m);
            }
            if (n == 0L) {
                final int b = this.b;
                if (b == 1) {
                    if (this.j(o0)) {
                        final c[] f = this.f;
                        final int e = this.e;
                        if (f[e] == this) {
                            int min = Math.min(e, 8);
                            while (true) {
                                final int n2 = min - 1;
                                if (n2 < 0 || n2 > 9) {
                                    return n;
                                }
                                min = n2;
                                if (!this.i(i, n2)) {
                                    continue;
                                }
                                min = n2;
                                if (this.f[n2] != null) {
                                    break;
                                }
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                }
                if (b == 2) {
                    if (this.j(o0)) {
                        final c[] f2 = this.f;
                        int j = this.e;
                        if (f2[j] == this) {
                            ++j;
                            while (j <= 9) {
                                if (this.i(i, j) && this.f[j] != null) {
                                    return Long.MAX_VALUE;
                                }
                                ++j;
                            }
                            return n;
                        }
                    }
                    return Long.MAX_VALUE;
                }
                if (b == 5) {
                    return Long.MAX_VALUE;
                }
            }
            return n;
        }
        
        boolean i(final e0 e0, final int n) {
            boolean b = false;
            m m = null;
            switch (n) {
                default: {
                    return false;
                }
                case 8:
                case 9: {
                    if (e0.j(org.joda.time.m.l()) || e0.j(org.joda.time.m.i())) {
                        b = true;
                    }
                    return b;
                }
                case 7: {
                    m = org.joda.time.m.i();
                    break;
                }
                case 6: {
                    m = org.joda.time.m.l();
                    break;
                }
                case 5: {
                    m = org.joda.time.m.j();
                    break;
                }
                case 4: {
                    m = org.joda.time.m.g();
                    break;
                }
                case 3: {
                    m = org.joda.time.m.b();
                    break;
                }
                case 2: {
                    m = org.joda.time.m.m();
                    break;
                }
                case 1: {
                    m = org.joda.time.m.k();
                    break;
                }
                case 0: {
                    m = org.joda.time.m.o();
                    break;
                }
            }
            return e0.j(m);
        }
        
        boolean j(final o0 o0) {
            for (int size = o0.size(), i = 0; i < size; ++i) {
                if (o0.e0(i) != 0) {
                    return false;
                }
            }
            return true;
        }
        
        void l(final i0 i0, final int n, final int n2) {
            switch (n) {
                case 7: {
                    i0.E(n2);
                    break;
                }
                case 6: {
                    i0.v(n2);
                    break;
                }
                case 5: {
                    i0.d(n2);
                    break;
                }
                case 4: {
                    i0.m(n2);
                    break;
                }
                case 3: {
                    i0.u(n2);
                    break;
                }
                case 2: {
                    i0.g(n2);
                    break;
                }
                case 1: {
                    i0.Q(n2);
                    break;
                }
                case 0: {
                    i0.l(n2);
                    break;
                }
            }
        }
    }
    
    abstract static class d implements f
    {
        private volatile String[] a;
        
        @Override
        public void g(final Set<f> set) {
            if (this.a == null) {
                int n = Integer.MAX_VALUE;
                String s = null;
                final String[] f = ((f)this).f();
                int length2;
                for (int length = f.length, i = 0; i < length; ++i, n = length2) {
                    final String s2 = f[i];
                    if (s2.length() < (length2 = n)) {
                        length2 = s2.length();
                        s = s2;
                    }
                }
                final HashSet<String> set2 = new HashSet<String>();
                for (final f f2 : set) {
                    if (f2 != null) {
                        for (final String s3 : f2.f()) {
                            if (s3.length() > n || (s3.equalsIgnoreCase(s) && !s3.equals(s))) {
                                set2.add(s3);
                            }
                        }
                    }
                }
                this.a = set2.toArray(new String[set2.size()]);
            }
        }
        
        protected boolean h(final int n, final String s, final int n2) {
            if (this.a != null) {
                for (final String s2 : this.a) {
                    final int length2 = s2.length();
                    if ((n < length2 && s.regionMatches(true, n2, s2, 0, length2)) || (n == length2 && s.regionMatches(false, n2, s2, 0, length2))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
    
    static class e implements t, s
    {
        static final e b;
        private final String a;
        
        static {
            b = new e("");
        }
        
        e(final String a) {
            this.a = a;
        }
        
        @Override
        public void a(final Writer writer, final o0 o0, final Locale locale) throws IOException {
            writer.write(this.a);
        }
        
        @Override
        public void b(final StringBuffer sb, final o0 o0, final Locale locale) {
            sb.append(this.a);
        }
        
        @Override
        public int c(final o0 o0, final Locale locale) {
            return this.a.length();
        }
        
        @Override
        public int d(final i0 i0, final String s, final int toffset, final Locale locale) {
            final String a = this.a;
            if (s.regionMatches(true, toffset, a, 0, a.length())) {
                return toffset + this.a.length();
            }
            return ~toffset;
        }
        
        @Override
        public int e(final o0 o0, final int n, final Locale locale) {
            return 0;
        }
    }
    
    interface f
    {
        int a(final String p0, final int p1);
        
        int b(final int p0);
        
        int c(final String p0, final int p1);
        
        void d(final StringBuffer p0, final int p1);
        
        void e(final Writer p0, final int p1) throws IOException;
        
        String[] f();
        
        void g(final Set<f> p0);
    }
    
    static class g extends d
    {
        private final String b;
        private final String c;
        
        g(final String b, final String c) {
            this.b = b;
            this.c = c;
        }
        
        @Override
        public int a(final String s, final int n) {
            final String c = this.c;
            String b = this.b;
            String other;
            if (c.length() < b.length()) {
                other = b;
                b = c;
            }
            else {
                other = c;
            }
            final int length = other.length();
            final int length2 = b.length();
            for (int length3 = s.length(), i = n; i < length3; ++i) {
                if (s.regionMatches(true, i, other, 0, length) && !((d)this).h(other.length(), s, i)) {
                    return i;
                }
                if (s.regionMatches(true, i, b, 0, length2) && !((d)this).h(b.length(), s, i)) {
                    return i;
                }
            }
            return ~n;
        }
        
        @Override
        public int b(final int n) {
            String s;
            if (n == 1) {
                s = this.b;
            }
            else {
                s = this.c;
            }
            return s.length();
        }
        
        @Override
        public int c(final String s, final int n) {
            final String c = this.c;
            String b = this.b;
            String other;
            if (c.length() < b.length()) {
                other = c;
            }
            else {
                other = b;
                b = c;
            }
            int n2;
            if (s.regionMatches(true, n, b, 0, b.length()) && !((d)this).h(b.length(), s, n)) {
                n2 = b.length();
            }
            else {
                if (!s.regionMatches(true, n, other, 0, other.length()) || ((d)this).h(other.length(), s, n)) {
                    return ~n;
                }
                n2 = other.length();
            }
            return n + n2;
        }
        
        @Override
        public void d(final StringBuffer sb, final int n) {
            String str;
            if (n == 1) {
                str = this.b;
            }
            else {
                str = this.c;
            }
            sb.append(str);
        }
        
        @Override
        public void e(final Writer writer, final int n) throws IOException {
            String str;
            if (n == 1) {
                str = this.b;
            }
            else {
                str = this.c;
            }
            writer.write(str);
        }
        
        @Override
        public String[] f() {
            return new String[] { this.b, this.c };
        }
    }
    
    static class h extends d
    {
        private static final Comparator<String> e;
        private final String[] b;
        private final Pattern[] c;
        private final String[] d;
        
        static {
            e = new Comparator<String>() {
                public int a(final String s, final String s2) {
                    return s2.length() - s.length();
                }
            };
        }
        
        h(String[] d, final String[] array) {
            this.b = array.clone();
            this.c = new Pattern[d.length];
            for (int i = 0; i < d.length; ++i) {
                Pattern compile;
                if ((compile = (Pattern)org.joda.time.format.r.z.get(d[i])) == null) {
                    compile = Pattern.compile(d[i]);
                    org.joda.time.format.r.z.putIfAbsent(d[i], compile);
                }
                this.c[i] = compile;
            }
            d = this.b.clone();
            Arrays.sort(this.d = d, h.e);
        }
        
        private int i(final int i) {
            int n = 0;
            while (true) {
                final Pattern[] c = this.c;
                if (n >= c.length) {
                    return c.length - 1;
                }
                if (c[n].matcher(String.valueOf(i)).matches()) {
                    return n;
                }
                ++n;
            }
        }
        
        @Override
        public int a(final String s, final int n) {
            for (int length = s.length(), i = n; i < length; ++i) {
                for (final String other : this.d) {
                    if (s.regionMatches(true, i, other, 0, other.length()) && !((d)this).h(other.length(), s, i)) {
                        return i;
                    }
                }
            }
            return ~n;
        }
        
        @Override
        public int b(final int n) {
            return this.b[this.i(n)].length();
        }
        
        @Override
        public int c(final String s, final int toffset) {
            for (final String other : this.d) {
                if (s.regionMatches(true, toffset, other, 0, other.length()) && !((d)this).h(other.length(), s, toffset)) {
                    return toffset + other.length();
                }
            }
            return ~toffset;
        }
        
        @Override
        public void d(final StringBuffer sb, final int n) {
            sb.append(this.b[this.i(n)]);
        }
        
        @Override
        public void e(final Writer writer, final int n) throws IOException {
            writer.write(this.b[this.i(n)]);
        }
        
        @Override
        public String[] f() {
            return this.b.clone();
        }
    }
    
    static class i implements t, s
    {
        private final String a;
        private final String b;
        private final String[] c;
        private final boolean d;
        private final boolean e;
        private final t f;
        private volatile t g;
        private final s h;
        private volatile s i;
        
        i(final String s, final String e, final String[] array, final t f, final s h, final boolean d, final boolean e2) {
            this.a = s;
            this.b = e;
            if ((e == null || s.equals(e)) && (array == null || array.length == 0)) {
                this.c = new String[] { s };
            }
            else {
                final TreeSet<String> c = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
                c.add(s);
                c.add(e);
                if (array != null) {
                    int length = array.length;
                    while (--length >= 0) {
                        c.add(array[length]);
                    }
                }
                final ArrayList list = new ArrayList<Object>(c);
                Collections.reverse(list);
                this.c = list.toArray(new String[list.size()]);
            }
            this.f = f;
            this.h = h;
            this.d = d;
            this.e = e2;
        }
        
        @Override
        public void a(final Writer writer, final o0 o0, final Locale locale) throws IOException {
            final t f = this.f;
            final t g = this.g;
            f.a(writer, o0, locale);
            Label_0116: {
                String str = null;
                Label_0110: {
                    if (this.d) {
                        if (f.e(o0, 1, locale) <= 0) {
                            break Label_0116;
                        }
                        if (this.e) {
                            final int e = g.e(o0, 2, locale);
                            if (e <= 0) {
                                break Label_0116;
                            }
                            if (e <= 1) {
                                str = this.b;
                                break Label_0110;
                            }
                        }
                    }
                    else if (!this.e || g.e(o0, 1, locale) <= 0) {
                        break Label_0116;
                    }
                    str = this.a;
                }
                writer.write(str);
            }
            g.a(writer, o0, locale);
        }
        
        @Override
        public void b(final StringBuffer sb, final o0 o0, final Locale locale) {
            final t f = this.f;
            final t g = this.g;
            f.b(sb, o0, locale);
            Label_0117: {
                String str = null;
                Label_0110: {
                    if (this.d) {
                        if (f.e(o0, 1, locale) <= 0) {
                            break Label_0117;
                        }
                        if (this.e) {
                            final int e = g.e(o0, 2, locale);
                            if (e <= 0) {
                                break Label_0117;
                            }
                            if (e <= 1) {
                                str = this.b;
                                break Label_0110;
                            }
                        }
                    }
                    else if (!this.e || g.e(o0, 1, locale) <= 0) {
                        break Label_0117;
                    }
                    str = this.a;
                }
                sb.append(str);
            }
            g.b(sb, o0, locale);
        }
        
        @Override
        public int c(final o0 o0, final Locale locale) {
            final t f = this.f;
            final t g = this.g;
            final int n = f.c(o0, locale) + g.c(o0, locale);
            if (this.d) {
                int n2 = n;
                if (f.e(o0, 1, locale) <= 0) {
                    return n2;
                }
                if (this.e) {
                    final int e = g.e(o0, 2, locale);
                    n2 = n;
                    if (e <= 0) {
                        return n2;
                    }
                    if (e <= 1) {
                        final String s = this.b;
                        return n + s.length();
                    }
                }
            }
            else {
                int n2 = n;
                if (!this.e) {
                    return n2;
                }
                n2 = n;
                if (g.e(o0, 1, locale) <= 0) {
                    return n2;
                }
            }
            final String s = this.a;
            return n + s.length();
        }
        
        @Override
        public int d(final i0 i0, final String s, int length, final Locale locale) {
            final int d = this.h.d(i0, s, length, locale);
            if (d < 0) {
                return d;
            }
            final int n = -1;
            final int n2 = 0;
            int n3 = d;
            int n4 = n;
            int n5 = n2;
            if (d > length) {
                final String[] c = this.c;
                final int length2 = c.length;
                length = 0;
                while (true) {
                    n3 = d;
                    n4 = n;
                    n5 = n2;
                    if (length >= length2) {
                        break;
                    }
                    final String other = c[length];
                    if (other == null || other.length() == 0 || s.regionMatches(true, d, other, 0, other.length())) {
                        if (other == null) {
                            length = 0;
                        }
                        else {
                            length = other.length();
                        }
                        n3 = d + length;
                        n5 = 1;
                        n4 = length;
                        break;
                    }
                    ++length;
                }
            }
            final int d2 = this.i.d(i0, s, n3, locale);
            if (d2 < 0) {
                return d2;
            }
            if (n5 != 0 && d2 == n3 && n4 > 0) {
                return ~n3;
            }
            if ((length = d2) > n3) {
                length = d2;
                if (n5 == 0) {
                    length = d2;
                    if (!this.d) {
                        length = ~n3;
                    }
                }
            }
            return length;
        }
        
        @Override
        public int e(final o0 o0, final int n, final Locale locale) {
            int e;
            final int n2 = e = this.f.e(o0, n, locale);
            if (n2 < n) {
                e = n2 + this.g.e(o0, n, locale);
            }
            return e;
        }
        
        i h(final t g, final s i) {
            this.g = g;
            this.i = i;
            return this;
        }
    }
    
    static class j extends d
    {
        private final String b;
        
        j(final String b) {
            this.b = b;
        }
        
        @Override
        public int a(final String s, final int n) {
            final String b = this.b;
            final int length = b.length();
            final int length2 = s.length();
            int i = n;
        Label_0145:
            while (i < length2) {
                if (s.regionMatches(true, i, b, 0, length) && !((d)this).h(length, s, i)) {
                    return i;
                }
                switch (s.charAt(i)) {
                    default: {
                        break Label_0145;
                    }
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9': {
                        ++i;
                        continue;
                    }
                }
            }
            return ~n;
        }
        
        @Override
        public int b(final int n) {
            return this.b.length();
        }
        
        @Override
        public int c(final String s, final int toffset) {
            final String b = this.b;
            final int length = b.length();
            if (s.regionMatches(true, toffset, b, 0, length) && !((d)this).h(length, s, toffset)) {
                return toffset + length;
            }
            return ~toffset;
        }
        
        @Override
        public void d(final StringBuffer sb, final int n) {
            sb.append(this.b);
        }
        
        @Override
        public void e(final Writer writer, final int n) throws IOException {
            writer.write(this.b);
        }
        
        @Override
        public String[] f() {
            return new String[] { this.b };
        }
    }
}
