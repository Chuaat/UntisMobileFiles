// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.storage;

class l<T>
{
    private final T a;
    private final Thread b;
    
    l(final T a) {
        this.a = a;
        this.b = Thread.currentThread();
    }
    
    public T a() {
        if (this.b()) {
            return this.a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
    
    public boolean b() {
        return this.b == Thread.currentThread();
    }
}
