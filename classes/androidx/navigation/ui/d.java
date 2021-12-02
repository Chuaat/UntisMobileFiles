// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import android.annotation.SuppressLint;
import java.util.Collection;
import androidx.navigation.e0;
import java.util.HashSet;
import android.view.Menu;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.annotation.k0;
import androidx.customview.widget.c;
import androidx.annotation.j0;
import java.util.Set;

public final class d
{
    @j0
    private final Set<Integer> a;
    @k0
    private final androidx.customview.widget.c b;
    @k0
    private final c c;
    
    private d(@j0 final Set<Integer> a, @k0 final androidx.customview.widget.c b, @k0 final c c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Deprecated
    @k0
    public DrawerLayout a() {
        final androidx.customview.widget.c b = this.b;
        if (b instanceof DrawerLayout) {
            return (DrawerLayout)b;
        }
        return null;
    }
    
    @k0
    public c b() {
        return this.c;
    }
    
    @k0
    public androidx.customview.widget.c c() {
        return this.b;
    }
    
    @j0
    public Set<Integer> d() {
        return this.a;
    }
    
    public static final class b
    {
        @j0
        private final Set<Integer> a;
        @k0
        private androidx.customview.widget.c b;
        @k0
        private c c;
        
        public b(@j0 final Menu menu) {
            this.a = new HashSet<Integer>();
            for (int size = menu.size(), i = 0; i < size; ++i) {
                this.a.add(menu.getItem(i).getItemId());
            }
        }
        
        public b(@j0 final e0 e0) {
            (this.a = new HashSet<Integer>()).add(l.b(e0).p());
        }
        
        public b(@j0 final Set<Integer> set) {
            (this.a = new HashSet<Integer>()).addAll(set);
        }
        
        public b(@j0 final int... array) {
            this.a = new HashSet<Integer>();
            for (int length = array.length, i = 0; i < length; ++i) {
                this.a.add(array[i]);
            }
        }
        
        @SuppressLint({ "SyntheticAccessor" })
        @j0
        public d a() {
            return new d(this.a, this.b, this.c, null);
        }
        
        @Deprecated
        @j0
        public b b(@k0 final DrawerLayout b) {
            this.b = b;
            return this;
        }
        
        @j0
        public b c(@k0 final c c) {
            this.c = c;
            return this;
        }
        
        @j0
        public b d(@k0 final androidx.customview.widget.c b) {
            this.b = b;
            return this;
        }
    }
    
    public interface c
    {
        boolean a();
    }
}
