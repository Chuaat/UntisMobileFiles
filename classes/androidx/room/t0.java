// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.util.Iterator;
import androidx.sqlite.db.h;

@androidx.annotation.t0({ androidx.annotation.t0.a.I })
public abstract class t0<T> extends a3
{
    public t0(final r2 r2) {
        super(r2);
    }
    
    protected abstract void bind(final h p0, final T p1);
    
    @Override
    protected abstract String createQuery();
    
    public final int handle(final T t) {
        final h acquire = this.acquire();
        try {
            this.bind(acquire, t);
            return acquire.c1();
        }
        finally {
            this.release(acquire);
        }
    }
    
    public final int handleMultiple(final Iterable<? extends T> iterable) {
        final h acquire = this.acquire();
        int n = 0;
        try {
            final Iterator<? extends T> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.bind(acquire, iterator.next());
                n += acquire.c1();
            }
            return n;
        }
        finally {
            this.release(acquire);
        }
    }
    
    public final int handleMultiple(final T[] array) {
        final h acquire = this.acquire();
        try {
            final int length = array.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                this.bind(acquire, array[i]);
                n += acquire.c1();
                ++i;
            }
            return n;
        }
        finally {
            this.release(acquire);
        }
    }
}
