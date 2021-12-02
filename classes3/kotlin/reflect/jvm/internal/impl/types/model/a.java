// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;

public final class a extends ArrayList<n> implements m
{
    public a(final int initialCapacity) {
        super(initialCapacity);
    }
    
    public /* bridge */ boolean b(final n o) {
        return super.contains(o);
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof n && this.b((n)o);
    }
    
    public /* bridge */ int f() {
        return super.size();
    }
    
    public /* bridge */ int i(final n o) {
        return super.indexOf(o);
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof n)) {
            return -1;
        }
        return this.i((n)o);
    }
    
    public /* bridge */ int l(final n o) {
        return super.lastIndexOf(o);
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof n)) {
            return -1;
        }
        return this.l((n)o);
    }
    
    public /* bridge */ boolean m(final n o) {
        return super.remove(o);
    }
    
    @Override
    public final /* bridge */ boolean remove(final Object o) {
        return o instanceof n && this.m((n)o);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.f();
    }
}
