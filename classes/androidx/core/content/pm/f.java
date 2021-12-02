// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.pm;

import androidx.annotation.c1;
import java.util.ArrayList;
import androidx.annotation.d;
import java.util.List;
import androidx.annotation.t0;

@t0({ t0.a.I })
public abstract class f<T>
{
    @d
    public abstract T a(final List<e> p0);
    
    @c1
    public List<e> b() throws Exception {
        return new ArrayList<e>();
    }
    
    @d
    public abstract T c();
    
    @d
    public abstract T d(final List<String> p0);
    
    @t0({ t0.a.G })
    public static class a extends f<Void>
    {
        public Void e(final List<e> list) {
            return null;
        }
        
        public Void f() {
            return null;
        }
        
        public Void g(final List<String> list) {
            return null;
        }
    }
}
