// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.util.Iterator;
import androidx.annotation.j0;
import androidx.lifecycle.c1;
import java.util.UUID;
import java.util.HashMap;
import androidx.lifecycle.z0;
import androidx.lifecycle.w0;

class t extends w0
{
    private static final z0.b b;
    private final HashMap<UUID, c1> a;
    
    static {
        b = new z0.b() {
            @j0
            @Override
            public <T extends w0> T a(@j0 final Class<T> clazz) {
                return (T)new t();
            }
        };
    }
    
    t() {
        this.a = new HashMap<UUID, c1>();
    }
    
    @j0
    static t b(final c1 c1) {
        return new z0(c1, t.b).a(t.class);
    }
    
    void a(@j0 final UUID key) {
        final c1 c1 = this.a.remove(key);
        if (c1 != null) {
            c1.a();
        }
    }
    
    @j0
    c1 c(@j0 final UUID uuid) {
        c1 value;
        if ((value = this.a.get(uuid)) == null) {
            value = new c1();
            this.a.put(uuid, value);
        }
        return value;
    }
    
    @Override
    protected void onCleared() {
        final Iterator<c1> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.a.clear();
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        final Iterator<UUID> iterator = this.a.keySet().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
