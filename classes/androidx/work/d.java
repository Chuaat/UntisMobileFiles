// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.j0;
import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class d
{
    private final Set<a> a;
    
    public d() {
        this.a = new HashSet<a>();
    }
    
    public void a(@j0 final Uri uri, final boolean b) {
        this.a.add(new a(uri, b));
    }
    
    @j0
    public Set<a> b() {
        return this.a;
    }
    
    public int c() {
        return this.a.size();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && d.class == o.getClass() && this.a.equals(((d)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public static final class a
    {
        @j0
        private final Uri a;
        private final boolean b;
        
        a(@j0 final Uri a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @j0
        public Uri a() {
            return this.a;
        }
        
        public boolean b() {
            return this.b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (this.b != a.b || !this.a.equals((Object)a.a)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + (this.b ? 1 : 0);
        }
    }
}
