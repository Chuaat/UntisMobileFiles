// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.ArrayList;
import java.util.List;

public class i
{
    final int G;
    Object[] H;
    Object[] I;
    volatile int J;
    int K;
    
    public i(final int g) {
        this.G = g;
    }
    
    public void h(final Object o) {
        if (this.J == 0) {
            final Object[] array = new Object[this.G + 1];
            this.H = array;
            (this.I = array)[0] = o;
            this.K = 1;
            this.J = 1;
        }
        else {
            final int k = this.K;
            final int g = this.G;
            if (k == g) {
                final Object[] i = new Object[g + 1];
                i[0] = o;
                this.I[g] = i;
                this.I = i;
                this.K = 1;
            }
            else {
                this.I[k] = o;
                this.K = k + 1;
            }
            ++this.J;
        }
    }
    
    public int j() {
        return this.G;
    }
    
    public Object[] k() {
        return this.H;
    }
    
    public int l() {
        return this.K;
    }
    
    public int n() {
        return this.J;
    }
    
    public Object[] o() {
        return this.I;
    }
    
    List<Object> p() {
        final int g = this.G;
        final int j = this.J;
        final ArrayList list = new ArrayList<Object>(j + 1);
        Object[] k = this.k();
        int i = 0;
    Label_0030:
        while (true) {
            int n = 0;
            while (i < j) {
                list.add(k[n]);
                final int n2 = i + 1;
                final int n3 = n + 1;
                i = n2;
                if ((n = n3) == g) {
                    k = (Object[])k[g];
                    i = n2;
                    continue Label_0030;
                }
            }
            break;
        }
        return (List<Object>)list;
    }
    
    @Override
    public String toString() {
        return this.p().toString();
    }
}
