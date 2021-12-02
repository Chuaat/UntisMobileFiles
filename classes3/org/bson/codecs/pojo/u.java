// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

final class u<T> implements t<T>
{
    private final l<T> a;
    
    u(final l<T> a) {
        this.a = a;
    }
    
    @Override
    public s<T> create() {
        return new v<T>(this.a);
    }
}
