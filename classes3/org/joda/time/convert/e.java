// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

class e
{
    private final c[] a;
    private a[] b;
    
    e(final c[] a) {
        this.a = a;
        this.b = new a[16];
    }
    
    private static c f(final e e, final Class<?> clazz) {
        final c[] a = e.a;
        int n2;
        int n = n2 = a.length;
        e e2 = e;
        c[] array = a;
        while (true) {
            final int n3 = n - 1;
            if (n3 >= 0) {
                final c c = array[n3];
                final Class<?> g = c.g();
                if (g == clazz) {
                    return c;
                }
                if (g != null) {
                    n = n3;
                    if (clazz == null) {
                        continue;
                    }
                    n = n3;
                    if (g.isAssignableFrom(clazz)) {
                        continue;
                    }
                }
                e2 = e2.c(n3, null);
                array = e2.a;
                n2 = array.length;
                n = n3;
            }
            else {
                if (clazz == null || n2 == 0) {
                    return null;
                }
                final int n4 = 0;
                if (n2 == 1) {
                    return array[0];
                }
                int n5 = n2;
                int n6 = n2;
                while (true) {
                    final int n7 = n6 - 1;
                    if (n7 < 0) {
                        break;
                    }
                    final Class<?> g2 = array[n7].g();
                    int length = n5;
                    int n8 = n5;
                    int n9 = n7;
                    while (true) {
                        final int n10 = n8 - 1;
                        if (n10 < 0) {
                            break;
                        }
                        if ((n8 = n10) == n9) {
                            continue;
                        }
                        n8 = n10;
                        if (!array[n10].g().isAssignableFrom(g2)) {
                            continue;
                        }
                        e2 = e2.c(n10, null);
                        array = e2.a;
                        length = array.length;
                        n9 = length - 1;
                        n8 = n10;
                    }
                    n6 = n9;
                    n5 = length;
                }
                if (n5 == 1) {
                    return array[0];
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to find best converter for type \"");
                sb.append(clazz.getName());
                sb.append("\" from remaining set: ");
                for (int i = n4; i < n5; ++i) {
                    final c c2 = array[i];
                    final Class<?> g3 = c2.g();
                    sb.append(c2.getClass().getName());
                    sb.append('[');
                    String name;
                    if (g3 == null) {
                        name = null;
                    }
                    else {
                        name = g3.getName();
                    }
                    sb.append(name);
                    sb.append("], ");
                }
                throw new IllegalStateException(sb.toString());
            }
        }
    }
    
    e a(final c c, final c[] array) {
        final c[] a = this.a;
        final int length = a.length;
        for (int i = 0; i < length; ++i) {
            final c obj = a[i];
            if (c.equals(obj)) {
                if (array != null) {
                    array[0] = null;
                }
                return this;
            }
            if (c.g() == obj.g()) {
                final c[] array2 = new c[length];
                for (int j = 0; j < length; ++j) {
                    if (j != i) {
                        array2[j] = a[j];
                    }
                    else {
                        array2[j] = c;
                    }
                }
                if (array != null) {
                    array[0] = obj;
                }
                return new e(array2);
            }
        }
        final c[] array3 = new c[length + 1];
        System.arraycopy(a, 0, array3, 0, length);
        array3[length] = c;
        if (array != null) {
            array[0] = null;
        }
        return new e(array3);
    }
    
    void b(final c[] array) {
        final c[] a = this.a;
        System.arraycopy(a, 0, array, 0, a.length);
    }
    
    e c(final int n, c[] array) {
        final c[] a = this.a;
        final int length = a.length;
        if (n < length) {
            int i = 0;
            if (array != null) {
                array[0] = a[n];
            }
            array = new c[length - 1];
            int n2 = 0;
            while (i < length) {
                int n3 = n2;
                if (i != n) {
                    array[n2] = a[i];
                    n3 = n2 + 1;
                }
                ++i;
                n2 = n3;
            }
            return new e(array);
        }
        throw new IndexOutOfBoundsException();
    }
    
    e d(final c c, final c[] array) {
        final c[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (c.equals(a[i])) {
                return this.c(i, array);
            }
        }
        if (array != null) {
            array[0] = null;
        }
        return this;
    }
    
    c e(final Class<?> clazz) throws IllegalStateException {
        final a[] b = this.b;
        final int length = b.length;
        while (true) {
            Label_0067: {
                if (clazz == null) {
                    break Label_0067;
                }
                int n = clazz.hashCode() & length - 1;
                do {
                    final a a = b[n];
                    if (a == null) {
                        final c f = f(this, clazz);
                        final a a2 = new a(clazz, f);
                        final a[] b2 = b.clone();
                        b2[n] = a2;
                        for (int i = 0; i < length; ++i) {
                            if (b2[i] == null) {
                                this.b = b2;
                                return f;
                            }
                        }
                        final int n2 = length << 1;
                        final a[] b3 = new a[n2];
                        int j = 0;
                    Label_0189_Outer:
                        while (j < length) {
                            final a a3 = b2[j];
                            final Class<?> a4 = a3.a;
                            while (true) {
                                Label_0213: {
                                    if (a4 == null) {
                                        break Label_0213;
                                    }
                                    int n3 = a4.hashCode() & n2 - 1;
                                    while (b3[n3] != null) {
                                        if (++n3 >= n2) {
                                            break Label_0213;
                                        }
                                    }
                                    b3[n3] = a3;
                                    ++j;
                                    continue Label_0189_Outer;
                                }
                                int n3 = 0;
                                continue;
                            }
                        }
                        this.b = b3;
                        return f;
                    }
                    if (a.a == clazz) {
                        return a.b;
                    }
                } while (++n < length);
            }
            int n = 0;
            continue;
        }
    }
    
    int g() {
        return this.a.length;
    }
    
    static class a
    {
        final Class<?> a;
        final c b;
        
        a(final Class<?> a, final c b) {
            this.a = a;
            this.b = b;
        }
    }
}
