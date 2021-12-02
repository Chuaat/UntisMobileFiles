// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import java.util.Objects;
import c6.h;
import retrofit2.t;

public final class f<T>
{
    @h
    private final t<T> a;
    @h
    private final Throwable b;
    
    private f(@h final t<T> a, @h final Throwable b) {
        this.a = a;
        this.b = b;
    }
    
    public static <T> f<T> b(final Throwable obj) {
        Objects.requireNonNull(obj, "error == null");
        return new f<T>(null, obj);
    }
    
    public static <T> f<T> e(final t<T> obj) {
        Objects.requireNonNull(obj, "response == null");
        return new f<T>(obj, null);
    }
    
    @h
    public Throwable a() {
        return this.b;
    }
    
    public boolean c() {
        return this.b != null;
    }
    
    @h
    public t<T> d() {
        return this.a;
    }
    
    @Override
    public String toString() {
        StringBuilder sb;
        if (this.b != null) {
            sb = new StringBuilder();
            sb.append("Result{isError=true, error=\"");
            sb.append(this.b);
            sb.append("\"}");
        }
        else {
            sb = new StringBuilder();
            sb.append("Result{isError=false, response=");
            sb.append(this.a);
            sb.append('}');
        }
        return sb.toString();
    }
}
