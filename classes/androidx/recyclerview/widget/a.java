// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import androidx.core.util.m;

final class a implements y.a
{
    static final int i = 0;
    static final int j = 1;
    private static final boolean k = false;
    private static final String l = "AHT";
    private m.a<b> a;
    final ArrayList<b> b;
    final ArrayList<b> c;
    final a d;
    Runnable e;
    final boolean f;
    final y g;
    private int h;
    
    a(final a a) {
        this(a, false);
    }
    
    a(final a d, final boolean f) {
        this.a = new m.b<b>(30);
        this.b = new ArrayList<b>();
        this.c = new ArrayList<b>();
        this.h = 0;
        this.d = d;
        this.f = f;
        this.g = new y((y.a)this);
    }
    
    private int A(int i, int d) {
        int j = this.c.size() - 1;
        int n = i;
        while (j >= 0) {
            final b b = this.c.get(j);
            final int a = b.a;
            Label_0338: {
                if (a == 8) {
                    final int b2 = b.b;
                    final int d2 = b.d;
                    int n2;
                    if (b2 < d2) {
                        i = b2;
                        n2 = d2;
                    }
                    else {
                        n2 = b2;
                        i = d2;
                    }
                    if (n >= i && n <= n2) {
                        if (i == b2) {
                            Label_0133: {
                                if (d == 1) {
                                    i = d2 + 1;
                                }
                                else {
                                    if (d != 2) {
                                        break Label_0133;
                                    }
                                    i = d2 - 1;
                                }
                                b.d = i;
                            }
                            i = n + 1;
                        }
                        else {
                            Label_0173: {
                                if (d == 1) {
                                    i = b2 + 1;
                                }
                                else {
                                    if (d != 2) {
                                        break Label_0173;
                                    }
                                    i = b2 - 1;
                                }
                                b.b = i;
                            }
                            i = n - 1;
                        }
                    }
                    else if ((i = n) < b2) {
                        if (d == 1) {
                            b.b = b2 + 1;
                            i = d2 + 1;
                        }
                        else {
                            i = n;
                            if (d != 2) {
                                break Label_0338;
                            }
                            b.b = b2 - 1;
                            i = d2 - 1;
                        }
                        b.d = i;
                        i = n;
                    }
                }
                else {
                    final int b3 = b.b;
                    if (b3 <= n) {
                        if (a == 1) {
                            i = n - b.d;
                        }
                        else {
                            i = n;
                            if (a == 2) {
                                i = n + b.d;
                            }
                        }
                    }
                    else {
                        if (d == 1) {
                            i = b3 + 1;
                        }
                        else {
                            i = n;
                            if (d != 2) {
                                break Label_0338;
                            }
                            i = b3 - 1;
                        }
                        b.b = i;
                        i = n;
                    }
                }
            }
            --j;
            n = i;
        }
        b b4;
        for (i = this.c.size() - 1; i >= 0; --i) {
            b4 = this.c.get(i);
            if (b4.a == 8) {
                d = b4.d;
                if (d != b4.b) {
                    if (d >= 0) {
                        continue;
                    }
                }
            }
            else if (b4.d > 0) {
                continue;
            }
            this.c.remove(i);
            this.a(b4);
        }
        return n;
    }
    
    private void d(final b b) {
        this.w(b);
    }
    
    private void e(final b b) {
        this.w(b);
    }
    
    private void g(final b b) {
        final int b2 = b.b;
        int n = b.d + b2;
        int n2 = -1;
        int i = b2;
        int n3 = 0;
        while (i < n) {
            boolean b4;
            if (this.d.e(i) == null && !this.i(i)) {
                boolean b3;
                if (n2 == 1) {
                    this.w(this.b(2, b2, n3, null));
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                final int n4 = 0;
                b4 = b3;
                n2 = n4;
            }
            else {
                if (n2 == 0) {
                    this.l(this.b(2, b2, n3, null));
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                n2 = 1;
            }
            int n5;
            if (b4) {
                i -= n3;
                n -= n3;
                n5 = 1;
            }
            else {
                n5 = n3 + 1;
            }
            ++i;
            n3 = n5;
        }
        b b5 = b;
        if (n3 != b.d) {
            this.a(b);
            b5 = this.b(2, b2, n3, null);
        }
        if (n2 == 0) {
            this.l(b5);
        }
        else {
            this.w(b5);
        }
    }
    
    private void h(final b b) {
        final int b2 = b.b;
        final int d = b.d;
        int n = b2;
        int n2 = -1;
        int n3 = 0;
        int n6;
        int n9;
        for (int i = b2; i < d + b2; ++i, n2 = n6, n3 = n9) {
            int n7;
            if (this.d.e(i) == null && !this.i(i)) {
                int n4 = n;
                int n5 = n3;
                if (n2 == 1) {
                    this.w(this.b(4, n, n3, b.c));
                    n4 = i;
                    n5 = 0;
                }
                n6 = 0;
                n = n4;
                n7 = n5;
            }
            else {
                int n8 = n;
                n7 = n3;
                if (n2 == 0) {
                    this.l(this.b(4, n, n3, b.c));
                    n8 = i;
                    n7 = 0;
                }
                n6 = 1;
                n = n8;
            }
            n9 = n7 + 1;
        }
        b b3 = b;
        if (n3 != b.d) {
            final Object c = b.c;
            this.a(b);
            b3 = this.b(4, n, n3, c);
        }
        if (n2 == 0) {
            this.l(b3);
        }
        else {
            this.w(b3);
        }
    }
    
    private boolean i(final int n) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final b b = this.c.get(i);
            final int a = b.a;
            if (a == 8) {
                if (this.o(b.d, i + 1) == n) {
                    return true;
                }
            }
            else if (a == 1) {
                for (int b2 = b.b, d = b.d, j = b2; j < d + b2; ++j) {
                    if (this.o(j, i + 1) == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private void l(b b) {
        final int a = b.a;
        if (a != 1 && a != 8) {
            int a2 = this.A(b.b, a);
            int b2 = b.b;
            final int a3 = b.a;
            int n;
            if (a3 != 2) {
                if (a3 != 4) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("op should be remove or update.");
                    sb.append(b);
                    throw new IllegalArgumentException(sb.toString());
                }
                n = 1;
            }
            else {
                n = 0;
            }
            int i = 1;
            int n2 = 1;
            while (i < b.d) {
                final int a4 = this.A(b.b + n * i, b.a);
                final int a5 = b.a;
                if ((a5 == 2) ? (a4 == a2) : (a5 == 4 && a4 == a2 + 1)) {
                    ++n2;
                }
                else {
                    final b b3 = this.b(a5, a2, n2, b.c);
                    this.m(b3, b2);
                    this.a(b3);
                    int n3 = b2;
                    if (b.a == 4) {
                        n3 = b2 + n2;
                    }
                    final int n4 = a4;
                    n2 = 1;
                    b2 = n3;
                    a2 = n4;
                }
                ++i;
            }
            final Object c = b.c;
            this.a(b);
            if (n2 > 0) {
                b = this.b(b.a, a2, n2, c);
                this.m(b, b2);
                this.a(b);
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    
    private void w(final b b) {
        this.c.add(b);
        final int a = b.a;
        if (a != 1) {
            if (a != 2) {
                if (a != 4) {
                    if (a != 8) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown update op type for ");
                        sb.append(b);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.d.a(b.b, b.d);
                }
                else {
                    this.d.c(b.b, b.d, b.c);
                }
            }
            else {
                this.d.f(b.b, b.d);
            }
        }
        else {
            this.d.g(b.b, b.d);
        }
    }
    
    @Override
    public void a(final b b) {
        if (!this.f) {
            b.c = null;
            this.a.a(b);
        }
    }
    
    @Override
    public b b(final int a, final int b, final int d, final Object c) {
        final b b2 = this.a.b();
        b b3;
        if (b2 == null) {
            b3 = new b(a, b, d, c);
        }
        else {
            b2.a = a;
            b2.b = b;
            b2.d = d;
            b2.c = c;
            b3 = b2;
        }
        return b3;
    }
    
    a c(final b... elements) {
        Collections.addAll(this.b, elements);
        return this;
    }
    
    public int f(int n) {
        final int size = this.b.size();
        int i = 0;
        int n2 = n;
        while (i < size) {
            final b b = this.b.get(i);
            n = b.a;
            if (n != 1) {
                if (n != 2) {
                    if (n != 8) {
                        n = n2;
                    }
                    else {
                        n = b.b;
                        if (n == n2) {
                            n = b.d;
                        }
                        else {
                            int n3;
                            if (n < (n3 = n2)) {
                                n3 = n2 - 1;
                            }
                            if (b.d <= (n = n3)) {
                                n = n3 + 1;
                            }
                        }
                    }
                }
                else {
                    final int b2 = b.b;
                    if (b2 <= (n = n2)) {
                        n = b.d;
                        if (b2 + n > n2) {
                            return -1;
                        }
                        n = n2 - n;
                    }
                }
            }
            else if (b.b <= (n = n2)) {
                n = n2 + b.d;
            }
            ++i;
            n2 = n;
        }
        return n2;
    }
    
    void j() {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            this.d.d((b)this.c.get(i));
        }
        this.y(this.c);
        this.h = 0;
    }
    
    void k() {
        this.j();
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final b b = this.b.get(i);
            final int a = b.a;
            if (a != 1) {
                if (a != 2) {
                    if (a != 4) {
                        if (a == 8) {
                            this.d.d(b);
                            this.d.a(b.b, b.d);
                        }
                    }
                    else {
                        this.d.d(b);
                        this.d.c(b.b, b.d, b.c);
                    }
                }
                else {
                    this.d.d(b);
                    this.d.h(b.b, b.d);
                }
            }
            else {
                this.d.d(b);
                this.d.g(b.b, b.d);
            }
            final Runnable e = this.e;
            if (e != null) {
                e.run();
            }
        }
        this.y(this.b);
        this.h = 0;
    }
    
    void m(final b b, final int n) {
        this.d.b(b);
        final int a = b.a;
        if (a != 2) {
            if (a != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.d.c(n, b.d, b.c);
        }
        else {
            this.d.h(n, b.d);
        }
    }
    
    int n(final int n) {
        return this.o(n, 0);
    }
    
    int o(int n, int n2) {
        final int size = this.c.size();
        int i = n2;
        n2 = n;
        while (i < size) {
            final b b = this.c.get(i);
            final int a = b.a;
            if (a == 8) {
                n = b.b;
                if (n == n2) {
                    n = b.d;
                }
                else {
                    int n3;
                    if (n < (n3 = n2)) {
                        n3 = n2 - 1;
                    }
                    if (b.d <= (n = n3)) {
                        n = n3 + 1;
                    }
                }
            }
            else {
                final int b2 = b.b;
                if (b2 <= (n = n2)) {
                    if (a == 2) {
                        n = b.d;
                        if (n2 < b2 + n) {
                            return -1;
                        }
                        n = n2 - n;
                    }
                    else {
                        n = n2;
                        if (a == 1) {
                            n = n2 + b.d;
                        }
                    }
                }
            }
            ++i;
            n2 = n;
        }
        return n2;
    }
    
    boolean p(final int n) {
        return (n & this.h) != 0x0;
    }
    
    boolean q() {
        return this.b.size() > 0;
    }
    
    boolean r() {
        return !this.c.isEmpty() && !this.b.isEmpty();
    }
    
    boolean s(final int n, final int n2, final Object o) {
        boolean b = false;
        if (n2 < 1) {
            return false;
        }
        this.b.add(this.b(4, n, n2, o));
        this.h |= 0x4;
        if (this.b.size() == 1) {
            b = true;
        }
        return b;
    }
    
    boolean t(final int n, final int n2) {
        boolean b = false;
        if (n2 < 1) {
            return false;
        }
        this.b.add(this.b(1, n, n2, null));
        this.h |= 0x1;
        if (this.b.size() == 1) {
            b = true;
        }
        return b;
    }
    
    boolean u(final int n, final int n2, final int n3) {
        boolean b = false;
        if (n == n2) {
            return false;
        }
        if (n3 == 1) {
            this.b.add(this.b(8, n, n2, null));
            this.h |= 0x8;
            if (this.b.size() == 1) {
                b = true;
            }
            return b;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }
    
    boolean v(final int n, final int n2) {
        boolean b = false;
        if (n2 < 1) {
            return false;
        }
        this.b.add(this.b(2, n, n2, null));
        this.h |= 0x2;
        if (this.b.size() == 1) {
            b = true;
        }
        return b;
    }
    
    void x() {
        this.g.b(this.b);
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final b b = this.b.get(i);
            final int a = b.a;
            if (a != 1) {
                if (a != 2) {
                    if (a != 4) {
                        if (a == 8) {
                            this.e(b);
                        }
                    }
                    else {
                        this.h(b);
                    }
                }
                else {
                    this.g(b);
                }
            }
            else {
                this.d(b);
            }
            final Runnable e = this.e;
            if (e != null) {
                e.run();
            }
        }
        this.b.clear();
    }
    
    void y(final List<b> list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.a(list.get(i));
        }
        list.clear();
    }
    
    void z() {
        this.y(this.b);
        this.y(this.c);
        this.h = 0;
    }
    
    interface a
    {
        void a(final int p0, final int p1);
        
        void b(final b p0);
        
        void c(final int p0, final int p1, final Object p2);
        
        void d(final b p0);
        
        RecyclerView.g0 e(final int p0);
        
        void f(final int p0, final int p1);
        
        void g(final int p0, final int p1);
        
        void h(final int p0, final int p1);
    }
    
    static final class b
    {
        static final int e = 1;
        static final int f = 2;
        static final int g = 4;
        static final int h = 8;
        static final int i = 30;
        int a;
        int b;
        Object c;
        int d;
        
        b(final int a, final int b, final int d, final Object c) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.c = c;
        }
        
        String a() {
            final int a = this.a;
            if (a == 1) {
                return "add";
            }
            if (a == 2) {
                return "rm";
            }
            if (a == 4) {
                return "up";
            }
            if (a != 8) {
                return "??";
            }
            return "mv";
        }
        
        @Override
        public boolean equals(Object c) {
            if (this == c) {
                return true;
            }
            if (!(c instanceof b)) {
                return false;
            }
            final b b = (b)c;
            final int a = this.a;
            if (a != b.a) {
                return false;
            }
            if (a == 8 && Math.abs(this.d - this.b) == 1 && this.d == b.b && this.b == b.d) {
                return true;
            }
            if (this.d != b.d) {
                return false;
            }
            if (this.b != b.b) {
                return false;
            }
            c = this.c;
            final Object c2 = b.c;
            if (c != null) {
                if (!c.equals(c2)) {
                    return false;
                }
            }
            else if (c2 != null) {
                return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            return (this.a * 31 + this.b) * 31 + this.d;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(this.a());
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }
}
