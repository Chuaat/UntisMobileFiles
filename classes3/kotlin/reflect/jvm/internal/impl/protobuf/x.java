// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

public class x extends AbstractList<String> implements RandomAccess, o
{
    private final o G;
    
    public x(final o g) {
        this.G = g;
    }
    
    @Override
    public void C5(final d d) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public List<?> G2() {
        return this.G.G2();
    }
    
    @Override
    public o K4() {
        return this;
    }
    
    public String f(final int n) {
        return this.G.get(n);
    }
    
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            Iterator<String> G = x.this.G.iterator();
            
            public String a() {
                return this.G.next();
            }
            
            @Override
            public boolean hasNext() {
                return this.G.hasNext();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    @Override
    public ListIterator<String> listIterator(final int n) {
        return new ListIterator<String>() {
            ListIterator<String> G = x.this.G.listIterator(h);
            
            public void a(final String s) {
                throw new UnsupportedOperationException();
            }
            
            public String b() {
                return this.G.next();
            }
            
            public String c() {
                return this.G.previous();
            }
            
            public void d(final String s) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public boolean hasNext() {
                return this.G.hasNext();
            }
            
            @Override
            public boolean hasPrevious() {
                return this.G.hasPrevious();
            }
            
            @Override
            public int nextIndex() {
                return this.G.nextIndex();
            }
            
            @Override
            public int previousIndex() {
                return this.G.previousIndex();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    @Override
    public d p4(final int n) {
        return this.G.p4(n);
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
}
