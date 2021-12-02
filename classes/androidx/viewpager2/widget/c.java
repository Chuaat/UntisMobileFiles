// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import java.util.Iterator;
import androidx.annotation.j0;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class c implements m
{
    private final List<m> a;
    
    public c() {
        this.a = new ArrayList<m>();
    }
    
    @Override
    public void a(@j0 final View view, final float n) {
        final Iterator<m> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(view, n);
        }
    }
    
    public void b(@j0 final m m) {
        this.a.add(m);
    }
    
    public void c(@j0 final m m) {
        this.a.remove(m);
    }
}
