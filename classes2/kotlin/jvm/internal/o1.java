// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class o1
{
    private final ArrayList<Object> a;
    
    public o1(final int initialCapacity) {
        this.a = new ArrayList<Object>(initialCapacity);
    }
    
    public void a(final Object e) {
        this.a.add(e);
    }
    
    public void b(Object next) {
        if (next == null) {
            return;
        }
        if (next instanceof Object[]) {
            final Object[] elements = (Object[])next;
            if (elements.length > 0) {
                final ArrayList<Object> a = this.a;
                a.ensureCapacity(a.size() + elements.length);
                Collections.addAll(this.a, elements);
            }
        }
        else if (next instanceof Collection) {
            this.a.addAll((Collection<?>)next);
        }
        else if (next instanceof Iterable) {
            final Iterator<Object> iterator = ((Iterable)next).iterator();
            while (iterator.hasNext()) {
                next = iterator.next();
                this.a.add(next);
            }
        }
        else {
            if (!(next instanceof Iterator)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Don't know how to spread ");
                sb.append(next.getClass());
                throw new UnsupportedOperationException(sb.toString());
            }
            final Iterator iterator2 = (Iterator)next;
            while (iterator2.hasNext()) {
                this.a.add(iterator2.next());
            }
        }
    }
    
    public int c() {
        return this.a.size();
    }
    
    public Object[] d(final Object[] a) {
        return this.a.toArray(a);
    }
}
