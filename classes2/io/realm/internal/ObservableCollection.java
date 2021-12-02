// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import c6.h;
import io.realm.i0;
import io.realm.y;
import io.realm.z;

@Keep
interface ObservableCollection
{
    void notifyChangeListeners(final long p0);
    
    public static class a implements m.a<ObservableCollection.b>
    {
        private final OsCollectionChangeSet a;
        
        a(final OsCollectionChangeSet a) {
            this.a = a;
        }
        
        public void b(final ObservableCollection.b b, final Object o) {
            b.a(o, this.a);
        }
    }
    
    public static class b<T> extends m.b<T, Object>
    {
        b(final T t, final Object o) {
            super(t, o);
        }
        
        public void a(final T t, final OsCollectionChangeSet set) {
            final S b = (S)super.b;
            if (b instanceof z) {
                ((z<T>)b).a(t, new s(set));
            }
            else {
                if (!(b instanceof i0)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported listener type: ");
                    sb.append(super.b);
                    throw new RuntimeException(sb.toString());
                }
                ((i0<T>)b).a(t);
            }
        }
    }
    
    public static class c<T> implements z<T>
    {
        private final i0<T> a;
        
        c(final i0<T> a) {
            this.a = a;
        }
        
        @Override
        public void a(final T t, @h final y y) {
            this.a.a(t);
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof c && this.a == ((c)o).a;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
}
