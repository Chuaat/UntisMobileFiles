// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import androidx.annotation.n0;
import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.List;

final class b extends j
{
    @j0
    private final List<j> a;
    
    b(final int initialCapacity) {
        this.a = new ArrayList<j>(initialCapacity);
    }
    
    private void f(final ConcurrentModificationException cause) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", cause);
    }
    
    @Override
    public void a(final int n) {
        try {
            final Iterator<j> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(n);
            }
        }
        catch (ConcurrentModificationException ex) {
            this.f(ex);
        }
    }
    
    @Override
    public void b(final int n, final float n2, @n0 final int n3) {
        try {
            final Iterator<j> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(n, n2, n3);
            }
        }
        catch (ConcurrentModificationException ex) {
            this.f(ex);
        }
    }
    
    @Override
    public void c(final int n) {
        try {
            final Iterator<j> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(n);
            }
        }
        catch (ConcurrentModificationException ex) {
            this.f(ex);
        }
    }
    
    void d(final j j) {
        this.a.add(j);
    }
    
    void e(final j j) {
        this.a.remove(j);
    }
}
