// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import androidx.appcompat.view.menu.k;
import o.c;
import android.view.MenuItem;
import androidx.collection.m;
import java.util.ArrayList;
import android.view.ActionMode$Callback;
import android.view.MenuInflater;
import androidx.appcompat.view.menu.p;
import o.a;
import android.view.Menu;
import android.view.View;
import android.content.Context;
import androidx.annotation.t0;
import android.view.ActionMode;

@t0({ t0.a.I })
public class f extends ActionMode
{
    final Context a;
    final b b;
    
    public f(final Context a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public void finish() {
        this.b.c();
    }
    
    public View getCustomView() {
        return this.b.d();
    }
    
    public Menu getMenu() {
        return (Menu)new p(this.a, (o.a)this.b.e());
    }
    
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }
    
    public CharSequence getSubtitle() {
        return this.b.g();
    }
    
    public Object getTag() {
        return this.b.h();
    }
    
    public CharSequence getTitle() {
        return this.b.i();
    }
    
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }
    
    public void invalidate() {
        this.b.k();
    }
    
    public boolean isTitleOptional() {
        return this.b.l();
    }
    
    public void setCustomView(final View view) {
        this.b.n(view);
    }
    
    public void setSubtitle(final int n) {
        this.b.o(n);
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        this.b.p(charSequence);
    }
    
    public void setTag(final Object o) {
        this.b.q(o);
    }
    
    public void setTitle(final int n) {
        this.b.r(n);
    }
    
    public void setTitle(final CharSequence charSequence) {
        this.b.s(charSequence);
    }
    
    public void setTitleOptionalHint(final boolean b) {
        this.b.t(b);
    }
    
    @t0({ t0.a.I })
    public static class a implements b.a
    {
        final ActionMode$Callback a;
        final Context b;
        final ArrayList<f> c;
        final m<Menu, Menu> d;
        
        public a(final Context b, final ActionMode$Callback a) {
            this.b = b;
            this.a = a;
            this.c = new ArrayList<f>();
            this.d = new m<Menu, Menu>();
        }
        
        private Menu f(final Menu menu) {
            Object o;
            if ((o = this.d.get(menu)) == null) {
                o = new p(this.b, (o.a)menu);
                this.d.put(menu, (Menu)o);
            }
            return (Menu)o;
        }
        
        @Override
        public void a(final b b) {
            this.a.onDestroyActionMode(this.e(b));
        }
        
        @Override
        public boolean b(final b b, final Menu menu) {
            return this.a.onCreateActionMode(this.e(b), this.f(menu));
        }
        
        @Override
        public boolean c(final b b, final Menu menu) {
            return this.a.onPrepareActionMode(this.e(b), this.f(menu));
        }
        
        @Override
        public boolean d(final b b, final MenuItem menuItem) {
            return this.a.onActionItemClicked(this.e(b), (MenuItem)new k(this.b, (c)menuItem));
        }
        
        public ActionMode e(final b b) {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final f f = this.c.get(i);
                if (f != null && f.b == b) {
                    return f;
                }
            }
            final f e = new f(this.b, b);
            this.c.add(e);
            return e;
        }
    }
}
