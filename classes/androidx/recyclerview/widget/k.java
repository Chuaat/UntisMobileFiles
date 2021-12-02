// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import androidx.annotation.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import androidx.annotation.j0;
import androidx.annotation.k0;
import java.util.Comparator;

public class k
{
    private static final Comparator<d> a;
    
    static {
        a = new Comparator<d>() {
            public int a(final d d, final d d2) {
                return d.a - d2.a;
            }
        };
    }
    
    private k() {
    }
    
    @k0
    private static i a(final h h, final b b, final c c, final c c2, final int n) {
        final boolean b2 = (h.b() - h.a()) % 2 == 0;
        final int b3 = h.b();
        final int a = h.a();
        int i;
        for (int n2 = i = -n; i <= n; i += 2) {
            int c3;
            int c4;
            if (i != n2 && (i == n || c2.c(i + 1) >= c2.c(i - 1))) {
                c3 = c2.c(i - 1);
                c4 = c3 - 1;
            }
            else {
                c3 = (c4 = c2.c(i + 1));
            }
            int b4 = h.d - (h.b - c4 - i);
            int d;
            if (n != 0 && c4 == c3) {
                d = b4 + 1;
            }
            else {
                d = b4;
            }
            while (c4 > h.a && b4 > h.c && b.b(c4 - 1, b4 - 1)) {
                --c4;
                --b4;
            }
            c2.d(i, c4);
            if (b2) {
                final int n3 = b3 - a - i;
                if (n3 >= n2 && n3 <= n && c.c(n3) >= c4) {
                    final i j = new i();
                    j.a = c4;
                    j.b = b4;
                    j.c = c3;
                    j.d = d;
                    j.e = true;
                    return j;
                }
            }
        }
        return null;
    }
    
    @j0
    public static e b(@j0 final b b) {
        return c(b, true);
    }
    
    @j0
    public static e c(@j0 final b b, final boolean b2) {
        final int e = b.e();
        final int d = b.d();
        final ArrayList<Object> list = new ArrayList<Object>();
        final ArrayList<h> list2 = new ArrayList<h>();
        list2.add(new h(0, e, 0, d));
        final int n = (e + d + 1) / 2 * 2 + 1;
        final c c = new c(n);
        final c c2 = new c(n);
        final ArrayList<h> list3 = (ArrayList<h>)new ArrayList<Object>();
        while (!list2.isEmpty()) {
            final h h = list2.remove(list2.size() - 1);
            final i e2 = e(h, b, c, c2);
            if (e2 != null) {
                if (e2.a() > 0) {
                    list.add(e2.d());
                }
                h h2;
                if (list3.isEmpty()) {
                    h2 = new h();
                }
                else {
                    h2 = list3.remove(list3.size() - 1);
                }
                h2.a = h.a;
                h2.c = h.c;
                h2.b = e2.a;
                h2.d = e2.b;
                list2.add(h2);
                h.b = h.b;
                h.d = h.d;
                h.a = e2.c;
                h.c = e2.d;
                list2.add(h);
            }
            else {
                list3.add(h);
            }
        }
        Collections.sort(list, (Comparator<? super Object>)k.a);
        return new e(b, (List<d>)list, c.a(), c2.a(), b2);
    }
    
    @k0
    private static i d(final h h, final b b, final c c, final c c2, final int n) {
        final int abs = Math.abs(h.b() - h.a());
        boolean b2 = true;
        if (abs % 2 != 1) {
            b2 = false;
        }
        final int b3 = h.b();
        final int a = h.a();
        int i;
        for (int n2 = i = -n; i <= n; i += 2) {
            int c3;
            int c4;
            if (i != n2 && (i == n || c.c(i + 1) <= c.c(i - 1))) {
                c3 = c.c(i - 1);
                c4 = c3 + 1;
            }
            else {
                c3 = (c4 = c.c(i + 1));
            }
            int d = h.c + (c4 - h.a) - i;
            int b4;
            if (n != 0 && c4 == c3) {
                b4 = d - 1;
            }
            else {
                b4 = d;
            }
            while (c4 < h.b && d < h.d && b.b(c4, d)) {
                ++c4;
                ++d;
            }
            c.d(i, c4);
            if (b2) {
                final int n3 = b3 - a - i;
                if (n3 >= n2 + 1 && n3 <= n - 1 && c2.c(n3) <= c4) {
                    final i j = new i();
                    j.a = c3;
                    j.b = b4;
                    j.c = c4;
                    j.d = d;
                    j.e = false;
                    return j;
                }
            }
        }
        return null;
    }
    
    @k0
    private static i e(final h h, final b b, final c c, final c c2) {
        if (h.b() >= 1) {
            if (h.a() >= 1) {
                final int n = (h.b() + h.a() + 1) / 2;
                c.d(1, h.a);
                c2.d(1, h.b);
                for (int i = 0; i < n; ++i) {
                    final i d = d(h, b, c, c2, i);
                    if (d != null) {
                        return d;
                    }
                    final i a = a(h, b, c, c2, i);
                    if (a != null) {
                        return a;
                    }
                }
            }
        }
        return null;
    }
    
    public abstract static class b
    {
        public abstract boolean a(final int p0, final int p1);
        
        public abstract boolean b(final int p0, final int p1);
        
        @k0
        public Object c(final int n, final int n2) {
            return null;
        }
        
        public abstract int d();
        
        public abstract int e();
    }
    
    static class c
    {
        private final int[] a;
        private final int b;
        
        c(final int n) {
            final int[] a = new int[n];
            this.a = a;
            this.b = a.length / 2;
        }
        
        int[] a() {
            return this.a;
        }
        
        public void b(final int val) {
            Arrays.fill(this.a, val);
        }
        
        int c(final int n) {
            return this.a[n + this.b];
        }
        
        void d(final int n, final int n2) {
            this.a[n + this.b] = n2;
        }
    }
    
    static class d
    {
        public final int a;
        public final int b;
        public final int c;
        
        d(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        int a() {
            return this.a + this.c;
        }
        
        int b() {
            return this.b + this.c;
        }
    }
    
    public static class e
    {
        public static final int h = -1;
        private static final int i = 1;
        private static final int j = 2;
        private static final int k = 4;
        private static final int l = 8;
        private static final int m = 12;
        private static final int n = 4;
        private static final int o = 15;
        private final List<d> a;
        private final int[] b;
        private final int[] c;
        private final b d;
        private final int e;
        private final int f;
        private final boolean g;
        
        e(final b d, final List<d> a, final int[] array, final int[] array2, final boolean g) {
            this.a = a;
            this.b = array;
            this.c = array2;
            Arrays.fill(array, 0);
            Arrays.fill(array2, 0);
            this.d = d;
            this.e = d.e();
            this.f = d.d();
            this.g = g;
            this.a();
            this.g();
        }
        
        private void a() {
            d d;
            if (this.a.isEmpty()) {
                d = null;
            }
            else {
                d = this.a.get(0);
            }
            if (d == null || d.a != 0 || d.b != 0) {
                this.a.add(0, new d(0, 0, 0));
            }
            this.a.add(new d(this.e, this.f, 0));
        }
        
        private void f(final int n) {
            final int size = this.a.size();
            int i = 0;
            int j = 0;
            while (i < size) {
                d d;
                for (d = this.a.get(i); j < d.b; ++j) {
                    if (this.c[j] == 0 && this.d.b(n, j)) {
                        int n2;
                        if (this.d.a(n, j)) {
                            n2 = 8;
                        }
                        else {
                            n2 = 4;
                        }
                        this.b[n] = (j << 4 | n2);
                        this.c[j] = (n << 4 | n2);
                        return;
                    }
                }
                j = d.b();
                ++i;
            }
        }
        
        private void g() {
            for (final d d : this.a) {
                for (int i = 0; i < d.c; ++i) {
                    final int n = d.a + i;
                    final int n2 = d.b + i;
                    int n3;
                    if (this.d.a(n, n2)) {
                        n3 = 1;
                    }
                    else {
                        n3 = 2;
                    }
                    this.b[n] = (n2 << 4 | n3);
                    this.c[n2] = (n << 4 | n3);
                }
            }
            if (this.g) {
                this.h();
            }
        }
        
        private void h() {
            final Iterator<d> iterator = this.a.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                d d;
                for (d = iterator.next(); i < d.a; ++i) {
                    if (this.b[i] == 0) {
                        this.f(i);
                    }
                }
                i = d.a();
            }
        }
        
        @k0
        private static g i(final Collection<g> collection, int b, final boolean b2) {
            final Iterator<g> iterator = collection.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    final g g = iterator.next();
                    if (g.a == b && g.c == b2) {
                        iterator.remove();
                        while (iterator.hasNext()) {
                            final g g2 = iterator.next();
                            b = g2.b;
                            if (b2) {
                                --b;
                            }
                            else {
                                ++b;
                            }
                            g2.b = b;
                        }
                        return g;
                    }
                }
                final g g = null;
                continue;
            }
        }
        
        public int b(@b0(from = 0L) int i) {
            if (i < 0 || i >= this.f) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", new list size = ");
                sb.append(this.f);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            i = this.c[i];
            if ((i & 0xF) == 0x0) {
                return -1;
            }
            return i >> 4;
        }
        
        public int c(@b0(from = 0L) int i) {
            if (i < 0 || i >= this.e) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", old list size = ");
                sb.append(this.e);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            i = this.b[i];
            if ((i & 0xF) == 0x0) {
                return -1;
            }
            return i >> 4;
        }
        
        public void d(@j0 final v v) {
            androidx.recyclerview.widget.f f;
            if (v instanceof androidx.recyclerview.widget.f) {
                f = (androidx.recyclerview.widget.f)v;
            }
            else {
                f = new androidx.recyclerview.widget.f(v);
            }
            int e = this.e;
            final ArrayDeque<g> arrayDeque = new ArrayDeque<g>();
            int n = this.e;
            int n2 = this.f;
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final d d = this.a.get(i);
                final int a = d.a();
                final int b = d.b();
                int n3 = n;
                int n4 = e;
                int n5;
                int j;
                while (true) {
                    n5 = 0;
                    e = n4;
                    j = n2;
                    if (n3 <= a) {
                        break;
                    }
                    final int n6 = n3 - 1;
                    final int n7 = this.b[n6];
                    if ((n7 & 0xC) != 0x0) {
                        final int n8 = n7 >> 4;
                        final g k = i(arrayDeque, n8, false);
                        if (k != null) {
                            final int n9 = n4 - k.b - 1;
                            f.a(n6, n9);
                            n3 = n6;
                            if ((n7 & 0x4) == 0x0) {
                                continue;
                            }
                            f.d(n9, 1, this.d.c(n6, n8));
                            n3 = n6;
                        }
                        else {
                            arrayDeque.add(new g(n6, n4 - n6 - 1, true));
                            n3 = n6;
                        }
                    }
                    else {
                        f.c(n6, 1);
                        --n4;
                        n3 = n6;
                    }
                }
                while (j > b) {
                    final int n10 = j - 1;
                    final int n11 = this.c[n10];
                    if ((n11 & 0xC) != 0x0) {
                        final int n12 = n11 >> 4;
                        final g l = i(arrayDeque, n12, true);
                        if (l == null) {
                            arrayDeque.add(new g(n10, e - n3, false));
                            j = n10;
                        }
                        else {
                            f.a(e - l.b - 1, n3);
                            j = n10;
                            if ((n11 & 0x4) == 0x0) {
                                continue;
                            }
                            f.d(n3, 1, this.d.c(n12, n10));
                            j = n10;
                        }
                    }
                    else {
                        f.b(n3, 1);
                        ++e;
                        j = n10;
                    }
                }
                int a2 = d.a;
                int b2 = d.b;
                for (int n13 = n5; n13 < d.c; ++n13) {
                    if ((this.b[a2] & 0xF) == 0x2) {
                        f.d(a2, 1, this.d.c(a2, b2));
                    }
                    ++a2;
                    ++b2;
                }
                n = d.a;
                n2 = d.b;
            }
            f.e();
        }
        
        public void e(@j0 final RecyclerView.h h) {
            this.d(new androidx.recyclerview.widget.b(h));
        }
    }
    
    public abstract static class f<T>
    {
        public abstract boolean a(@j0 final T p0, @j0 final T p1);
        
        public abstract boolean b(@j0 final T p0, @j0 final T p1);
        
        @k0
        public Object c(@j0 final T t, @j0 final T t2) {
            return null;
        }
    }
    
    private static class g
    {
        int a;
        int b;
        boolean c;
        
        g(final int a, final int b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    static class h
    {
        int a;
        int b;
        int c;
        int d;
        
        public h() {
        }
        
        public h(final int a, final int b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        int a() {
            return this.d - this.c;
        }
        
        int b() {
            return this.b - this.a;
        }
    }
    
    static class i
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        
        int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
        
        boolean b() {
            return this.d - this.b != this.c - this.a;
        }
        
        boolean c() {
            return this.d - this.b > this.c - this.a;
        }
        
        @j0
        d d() {
            if (!this.b()) {
                final int a = this.a;
                return new d(a, this.b, this.c - a);
            }
            if (this.e) {
                return new d(this.a, this.b, this.a());
            }
            if (this.c()) {
                return new d(this.a, this.b + 1, this.a());
            }
            return new d(this.a + 1, this.b, this.a());
        }
    }
}
