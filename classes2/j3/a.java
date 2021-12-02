// 
// Decompiled by Procyon v0.5.36
// 

package j3;

import com.google.firebase.components.g0;

public class a<T>
{
    private final Class<T> a;
    private final T b;
    
    public a(final Class<T> clazz, final T t) {
        this.a = (Class<T>)g0.b((Object)clazz);
        this.b = (T)g0.b((Object)t);
    }
    
    public T a() {
        return this.b;
    }
    
    public Class<T> b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
