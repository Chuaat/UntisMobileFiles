// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.ObjectId;
import java.util.List;

public class g1 extends e1
{
    private Object a;
    
    private Object F() {
        return this.a;
    }
    
    private void G(final Object a) {
        this.a = a;
    }
    
    public List C(final byte[] array, final int n) {
        return new i1(array, n, this);
    }
    
    public Object D(final String s, final ObjectId objectId) {
        return new m("$ns", s).a("$id", objectId);
    }
    
    public Object E(final byte[] array, final int n) {
        return new j1(array, n, this);
    }
    
    @Override
    public Object get() {
        return this.F();
    }
    
    @Override
    public void reset() {
        this.a = null;
    }
    
    @Override
    public void v(final String s, final byte b, final byte[] array) {
        this.G(this.E(array, 0));
    }
}
