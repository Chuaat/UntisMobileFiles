// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.HashMap;
import android.util.SparseIntArray;

public class l
{
    public static final int c = -1;
    private SparseIntArray a;
    private HashMap<Integer, HashSet<WeakReference<a>>> b;
    
    public l() {
        this.a = new SparseIntArray();
        this.b = new HashMap<Integer, HashSet<WeakReference<a>>>();
    }
    
    public void a(final int n, final a referent) {
        HashSet<WeakReference<a>> value;
        if ((value = this.b.get(n)) == null) {
            value = new HashSet<WeakReference<a>>();
            this.b.put(n, value);
        }
        value.add(new WeakReference<a>(referent));
    }
    
    public void b() {
        this.b.clear();
    }
    
    public void c(final int i, final int n) {
        final int value = this.a.get(i, -1);
        if (value == n) {
            return;
        }
        this.a.put(i, n);
        final HashSet<WeakReference<a>> set = this.b.get(i);
        if (set == null) {
            return;
        }
        final Iterator<WeakReference<a>> iterator = set.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final a a = iterator.next().get();
            if (a != null) {
                a.a(i, n, value);
            }
            else {
                b = true;
            }
        }
        if (b) {
            final ArrayList<Object> c = new ArrayList<Object>();
            for (final WeakReference<a> weakReference : set) {
                if (weakReference.get() == null) {
                    c.add(weakReference);
                }
            }
            set.removeAll(c);
        }
    }
    
    public int d(final int n) {
        return this.a.get(n, -1);
    }
    
    public void e(final int i, final a a) {
        final HashSet<WeakReference<a>> set = this.b.get(i);
        if (set == null) {
            return;
        }
        final ArrayList<Object> c = new ArrayList<Object>();
        for (final WeakReference<a> weakReference : set) {
            final a a2 = weakReference.get();
            if (a2 == null || a2 == a) {
                c.add(weakReference);
            }
        }
        set.removeAll(c);
    }
    
    public void f(final a a) {
        final Iterator<Integer> iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            this.e(iterator.next(), a);
        }
    }
    
    public interface a
    {
        void a(final int p0, final int p1, final int p2);
    }
}
