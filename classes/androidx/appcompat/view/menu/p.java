// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import android.content.Context;
import o.a;
import androidx.annotation.t0;
import android.view.Menu;

@t0({ t0.a.I })
public class p extends c implements Menu
{
    private final a o;
    
    public p(final Context context, final a o) {
        super(context);
        if (o != null) {
            this.o = o;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public MenuItem add(final int n) {
        return this.e(((Menu)this.o).add(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.e(((Menu)this.o).add(n, n2, n3, n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.e(((Menu)this.o).add(n, n2, n3, charSequence));
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.e(((Menu)this.o).add(charSequence));
    }
    
    public int addIntentOptions(int i, int length, int addIntentOptions, final ComponentName componentName, final Intent[] array, final Intent intent, final int n, final MenuItem[] array2) {
        MenuItem[] array3;
        if (array2 != null) {
            array3 = new MenuItem[array2.length];
        }
        else {
            array3 = null;
        }
        addIntentOptions = ((Menu)this.o).addIntentOptions(i, length, addIntentOptions, componentName, array, intent, n, array3);
        if (array3 != null) {
            for (i = 0, length = array3.length; i < length; ++i) {
                array2[i] = this.e(array3[i]);
            }
        }
        return addIntentOptions;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.f(((Menu)this.o).addSubMenu(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.f(((Menu)this.o).addSubMenu(n, n2, n3, n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.f(((Menu)this.o).addSubMenu(n, n2, n3, charSequence));
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.f(((Menu)this.o).addSubMenu(charSequence));
    }
    
    public void clear() {
        this.g();
        ((Menu)this.o).clear();
    }
    
    public void close() {
        ((Menu)this.o).close();
    }
    
    public MenuItem findItem(final int n) {
        return this.e(((Menu)this.o).findItem(n));
    }
    
    public MenuItem getItem(final int n) {
        return this.e(((Menu)this.o).getItem(n));
    }
    
    public boolean hasVisibleItems() {
        return ((Menu)this.o).hasVisibleItems();
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return ((Menu)this.o).isShortcutKey(n, keyEvent);
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return ((Menu)this.o).performIdentifierAction(n, n2);
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        return ((Menu)this.o).performShortcut(n, keyEvent, n2);
    }
    
    public void removeGroup(final int n) {
        this.h(n);
        ((Menu)this.o).removeGroup(n);
    }
    
    public void removeItem(final int n) {
        this.i(n);
        ((Menu)this.o).removeItem(n);
    }
    
    public void setGroupCheckable(final int n, final boolean b, final boolean b2) {
        ((Menu)this.o).setGroupCheckable(n, b, b2);
    }
    
    public void setGroupEnabled(final int n, final boolean b) {
        ((Menu)this.o).setGroupEnabled(n, b);
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        ((Menu)this.o).setGroupVisible(n, b);
    }
    
    public void setQwertyMode(final boolean qwertyMode) {
        ((Menu)this.o).setQwertyMode(qwertyMode);
    }
    
    public int size() {
        return ((Menu)this.o).size();
    }
}
