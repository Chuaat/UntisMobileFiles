// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;
import java.util.List;
import java.lang.reflect.Method;

public final class l
{
    private final Method a;
    private final List<?> b;
    
    l(final Method a, final List<?> list) {
        this.a = a;
        this.b = Collections.unmodifiableList(list);
    }
    
    public static l c(final Method obj, final List<?> list) {
        Objects.requireNonNull(obj, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new l(obj, new ArrayList<Object>(list));
    }
    
    public List<?> a() {
        return this.b;
    }
    
    public Method b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
