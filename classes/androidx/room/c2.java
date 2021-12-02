// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.j0;
import java.util.concurrent.Executor;
import androidx.sqlite.db.d;

final class c2 implements c
{
    private final c a;
    private final r2.f b;
    private final Executor c;
    
    c2(@j0 final c a, @j0 final r2.f b, @j0 final Executor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    @Override
    public d a(@j0 final b b) {
        return new b2(this.a.a(b), this.b, this.c);
    }
}
