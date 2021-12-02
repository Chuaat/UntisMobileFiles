// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.List;

class y
{
    final a a;
    
    y(final a a) {
        this.a = a;
    }
    
    private int a(final List<androidx.recyclerview.widget.a.b> list) {
        int i = list.size() - 1;
        int n = 0;
        while (i >= 0) {
            int n2;
            if (list.get(i).a == 8) {
                if ((n2 = n) != 0) {
                    return i;
                }
            }
            else {
                n2 = 1;
            }
            --i;
            n = n2;
        }
        return -1;
    }
    
    private void c(final List<androidx.recyclerview.widget.a.b> list, final int n, final androidx.recyclerview.widget.a.b b, final int n2, final androidx.recyclerview.widget.a.b b2) {
        final int d = b.d;
        final int b3 = b2.b;
        int n3;
        if (d < b3) {
            n3 = -1;
        }
        else {
            n3 = 0;
        }
        final int b4 = b.b;
        int n4 = n3;
        if (b4 < b3) {
            n4 = n3 + 1;
        }
        if (b3 <= b4) {
            b.b = b4 + b2.d;
        }
        final int b5 = b2.b;
        if (b5 <= d) {
            b.d = d + b2.d;
        }
        b2.b = b5 + n4;
        list.set(n, b2);
        list.set(n2, b);
    }
    
    private void d(final List<androidx.recyclerview.widget.a.b> list, final int n, final int n2) {
        final androidx.recyclerview.widget.a.b b = list.get(n);
        final androidx.recyclerview.widget.a.b b2 = list.get(n2);
        final int a = b2.a;
        if (a != 1) {
            if (a != 2) {
                if (a == 4) {
                    this.f(list, n, b, n2, b2);
                }
            }
            else {
                this.e(list, n, b, n2, b2);
            }
        }
        else {
            this.c(list, n, b, n2, b2);
        }
    }
    
    void b(final List<androidx.recyclerview.widget.a.b> list) {
        while (true) {
            final int a = this.a(list);
            if (a == -1) {
                break;
            }
            this.d(list, a, a + 1);
        }
    }
    
    void e(final List<androidx.recyclerview.widget.a.b> list, final int n, final androidx.recyclerview.widget.a.b b, final int n2, final androidx.recyclerview.widget.a.b b2) {
        final int b3 = b.b;
        final int d = b.d;
        boolean b4 = false;
        final int b5 = b2.b;
        boolean b6 = false;
        Label_0095: {
            if (b3 < d) {
                if (b5 != b3 || b2.d != d - b3) {
                    b6 = false;
                    break Label_0095;
                }
                b6 = false;
            }
            else {
                if (b5 != d + 1 || b2.d != b3 - d) {
                    b6 = true;
                    break Label_0095;
                }
                b6 = true;
            }
            b4 = true;
        }
        final int b7 = b2.b;
        if (d < b7) {
            b2.b = b7 - 1;
        }
        else {
            final int d2 = b2.d;
            if (d < b7 + d2) {
                b2.d = d2 - 1;
                b.a = 2;
                b.d = 1;
                if (b2.d == 0) {
                    list.remove(n2);
                    this.a.a(b2);
                }
                return;
            }
        }
        final int b8 = b.b;
        final int b9 = b2.b;
        androidx.recyclerview.widget.a.b b10 = null;
        if (b8 <= b9) {
            b2.b = b9 + 1;
        }
        else {
            final int d3 = b2.d;
            if (b8 < b9 + d3) {
                b10 = this.a.b(2, b8 + 1, b9 + d3 - b8, null);
                b2.d = b.b - b2.b;
            }
        }
        if (b4) {
            list.set(n, b2);
            list.remove(n2);
            this.a.a(b);
            return;
        }
        Label_0543: {
            int n3;
            if (b6) {
                if (b10 != null) {
                    final int b11 = b.b;
                    if (b11 > b10.b) {
                        b.b = b11 - b10.d;
                    }
                    final int d4 = b.d;
                    if (d4 > b10.b) {
                        b.d = d4 - b10.d;
                    }
                }
                final int b12 = b.b;
                if (b12 > b2.b) {
                    b.b = b12 - b2.d;
                }
                n3 = b.d;
                if (n3 <= b2.b) {
                    break Label_0543;
                }
            }
            else {
                if (b10 != null) {
                    final int b13 = b.b;
                    if (b13 >= b10.b) {
                        b.b = b13 - b10.d;
                    }
                    final int d5 = b.d;
                    if (d5 >= b10.b) {
                        b.d = d5 - b10.d;
                    }
                }
                final int b14 = b.b;
                if (b14 >= b2.b) {
                    b.b = b14 - b2.d;
                }
                n3 = b.d;
                if (n3 < b2.b) {
                    break Label_0543;
                }
            }
            b.d = n3 - b2.d;
        }
        list.set(n, b2);
        if (b.b != b.d) {
            list.set(n2, b);
        }
        else {
            list.remove(n2);
        }
        if (b10 != null) {
            list.add(n, b10);
        }
    }
    
    void f(final List<androidx.recyclerview.widget.a.b> list, final int n, final androidx.recyclerview.widget.a.b b, final int n2, final androidx.recyclerview.widget.a.b b2) {
        final int d = b.d;
        final int b3 = b2.b;
        androidx.recyclerview.widget.a.b b4 = null;
        androidx.recyclerview.widget.a.b b5 = null;
        Label_0089: {
            if (d < b3) {
                b2.b = b3 - 1;
            }
            else {
                final int d2 = b2.d;
                if (d < b3 + d2) {
                    b2.d = d2 - 1;
                    b5 = this.a.b(4, b.b, 1, b2.c);
                    break Label_0089;
                }
            }
            b5 = null;
        }
        final int b6 = b.b;
        final int b7 = b2.b;
        if (b6 <= b7) {
            b2.b = b7 + 1;
        }
        else {
            final int d3 = b2.d;
            if (b6 < b7 + d3) {
                final int n3 = b7 + d3 - b6;
                b4 = this.a.b(4, b6 + 1, n3, b2.c);
                b2.d -= n3;
            }
        }
        list.set(n2, b);
        if (b2.d > 0) {
            list.set(n, b2);
        }
        else {
            list.remove(n);
            this.a.a(b2);
        }
        if (b5 != null) {
            list.add(n, b5);
        }
        if (b4 != null) {
            list.add(n, b4);
        }
    }
    
    interface a
    {
        void a(final androidx.recyclerview.widget.a.b p0);
        
        androidx.recyclerview.widget.a.b b(final int p0, final int p1, final int p2, final Object p3);
    }
}
