// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import o6.d;
import java.util.Iterator;
import kotlin.sequences.m;
import n6.p;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import android.view.MenuItem;
import org.jetbrains.annotations.e;
import android.view.Menu;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a3\u0010\u0010\u001a\u00020\b*\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\fH\u0086\b\u00f8\u0001\u0000\u001aH\u0010\u0012\u001a\u00020\b*\u00020\u000026\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0011H\u0086\b\u00f8\u0001\u0000\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0086\u0002\"\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0001*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c" }, d2 = { "Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "d", "item", "", "a", "Lkotlin/j2;", "j", "g", "h", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "i", "Lkotlin/sequences/m;", "e", "(Landroid/view/Menu;)Lkotlin/sequences/m;", "children", "f", "(Landroid/view/Menu;)I", "size", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class q
{
    public static final boolean a(@e final Menu menu, @e final MenuItem menuItem) {
        k0.p((Object)menu, "<this>");
        k0.p((Object)menuItem, "item");
        final int size = menu.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                if (k0.g((Object)menu.getItem(n), (Object)menuItem)) {
                    return true;
                }
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
        return false;
    }
    
    public static final void b(@e final Menu menu, @e final l<? super MenuItem, j2> l) {
        k0.p((Object)menu, "<this>");
        k0.p((Object)l, "action");
        final int size = menu.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                final MenuItem item = menu.getItem(n);
                k0.o((Object)item, "getItem(index)");
                l.invoke((Object)item);
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final void c(@e final Menu menu, @e final p<? super Integer, ? super MenuItem, j2> p2) {
        k0.p((Object)menu, "<this>");
        k0.p((Object)p2, "action");
        final int size = menu.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                final int n = i + 1;
                final MenuItem item = menu.getItem(i);
                k0.o((Object)item, "getItem(index)");
                p2.invoke((Object)i, (Object)item);
                if (n >= size) {
                    break;
                }
                i = n;
            }
        }
    }
    
    @e
    public static final MenuItem d(@e final Menu menu, final int n) {
        k0.p((Object)menu, "<this>");
        final MenuItem item = menu.getItem(n);
        k0.o((Object)item, "getItem(index)");
        return item;
    }
    
    @e
    public static final m<MenuItem> e(@e final Menu menu) {
        k0.p((Object)menu, "<this>");
        return (m<MenuItem>)new m<MenuItem>() {
            @e
            public Iterator<MenuItem> iterator() {
                return q.i(menu);
            }
        };
    }
    
    public static final int f(@e final Menu menu) {
        k0.p((Object)menu, "<this>");
        return menu.size();
    }
    
    public static final boolean g(@e final Menu menu) {
        k0.p((Object)menu, "<this>");
        return menu.size() == 0;
    }
    
    public static final boolean h(@e final Menu menu) {
        k0.p((Object)menu, "<this>");
        return menu.size() != 0;
    }
    
    @e
    public static final Iterator<MenuItem> i(@e final Menu menu) {
        k0.p((Object)menu, "<this>");
        return new Iterator<MenuItem>() {
            private int G;
            
            @e
            public MenuItem a() {
                final MenuItem item = menu.getItem(this.G++);
                if (item != null) {
                    return item;
                }
                throw new IndexOutOfBoundsException();
            }
            
            @Override
            public boolean hasNext() {
                return this.G < menu.size();
            }
            
            @Override
            public void remove() {
                menu.removeItem(--this.G);
            }
        };
    }
    
    public static final void j(@e final Menu menu, @e final MenuItem menuItem) {
        k0.p((Object)menu, "<this>");
        k0.p((Object)menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }
}
