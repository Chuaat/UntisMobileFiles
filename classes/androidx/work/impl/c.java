// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.lifecycle.LiveData;
import androidx.annotation.j0;
import x2.a;
import androidx.lifecycle.k0;
import androidx.annotation.t0;
import androidx.work.u;

@t0({ t0.a.H })
public class c implements u
{
    private final k0<u.b> c;
    private final androidx.work.impl.utils.futures.c<u.b.c> d;
    
    public c() {
        this.c = new k0<u.b>();
        this.d = androidx.work.impl.utils.futures.c.v();
        this.b((u.b)u.b);
    }
    
    @j0
    @Override
    public x2.a<u.b.c> a() {
        return this.d;
    }
    
    public void b(@j0 final u.b b) {
        this.c.n(b);
        if (b instanceof u.b.c) {
            this.d.q((u.b.c)b);
        }
        else if (b instanceof a) {
            this.d.r(((a)b).a());
        }
    }
    
    @j0
    @Override
    public LiveData<u.b> getState() {
        return this.c;
    }
}
