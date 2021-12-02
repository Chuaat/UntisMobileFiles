// 
// Decompiled by Procyon v0.5.36
// 

package a;

import androidx.annotation.k0;
import java.util.Iterator;
import androidx.annotation.j0;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import java.util.Set;

public final class b
{
    private final Set<c> a;
    private volatile Context b;
    
    public b() {
        this.a = new CopyOnWriteArraySet<c>();
    }
    
    public void a(@j0 final c c) {
        if (this.b != null) {
            c.a(this.b);
        }
        this.a.add(c);
    }
    
    public void b() {
        this.b = null;
    }
    
    public void c(@j0 final Context b) {
        this.b = b;
        final Iterator<c> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b);
        }
    }
    
    @k0
    public Context d() {
        return this.b;
    }
    
    public void e(@j0 final c c) {
        this.a.remove(c);
    }
}
