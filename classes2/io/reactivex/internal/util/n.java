// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.ArrayList;

public class n
{
    final int a;
    Object[] b;
    Object[] c;
    volatile int d;
    int e;
    
    public n(final int a) {
        this.a = a;
    }
    
    public void a(final Object o) {
        if (this.d == 0) {
            final Object[] array = new Object[this.a + 1];
            this.b = array;
            (this.c = array)[0] = o;
            this.e = 1;
            this.d = 1;
        }
        else {
            final int e = this.e;
            final int a = this.a;
            if (e == a) {
                final Object[] c = new Object[a + 1];
                c[0] = o;
                this.c[a] = c;
                this.c = c;
                this.e = 1;
            }
            else {
                this.c[e] = o;
                this.e = e + 1;
            }
            ++this.d;
        }
    }
    
    public Object[] b() {
        return this.b;
    }
    
    public int c() {
        return this.d;
    }
    
    @Override
    public String toString() {
        final int a = this.a;
        final int d = this.d;
        final ArrayList list = new ArrayList<Object>(d + 1);
        Object[] b = this.b();
        int n = 0;
    Label_0030:
        while (true) {
            int n2 = 0;
            int i = n;
            while (i < d) {
                list.add(b[n2]);
                n = i + 1;
                final int n3 = n2 + 1;
                i = n;
                if ((n2 = n3) == a) {
                    b = (Object[])b[a];
                    continue Label_0030;
                }
            }
            break;
        }
        return list.toString();
    }
}
