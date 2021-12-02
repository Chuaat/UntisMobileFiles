// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import androidx.annotation.p0;
import androidx.core.util.i;
import java.util.Collections;
import java.util.ArrayList;
import androidx.core.os.a;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.core.graphics.j;
import android.view.DisplayCutout;
import android.os.Build$VERSION;
import java.util.List;
import android.graphics.Rect;

public final class e
{
    private final Object a;
    
    public e(final Rect rect, final List<Rect> list) {
        DisplayCutout displayCutout;
        if (Build$VERSION.SDK_INT >= 28) {
            displayCutout = new DisplayCutout(rect, (List)list);
        }
        else {
            displayCutout = null;
        }
        this(displayCutout);
    }
    
    public e(@j0 final j j, @k0 final Rect rect, @k0 final Rect rect2, @k0 final Rect rect3, @k0 final Rect rect4, @j0 final j i) {
        this(a(j, rect, rect2, rect3, rect4, i));
    }
    
    private e(final Object a) {
        this.a = a;
    }
    
    private static DisplayCutout a(@j0 final j j, @k0 final Rect e, @k0 final Rect e2, @k0 final Rect e3, @k0 final Rect e4, @j0 final j i) {
        if (a.h()) {
            return new DisplayCutout(j.h(), e, e2, e3, e4, i.h());
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            return new DisplayCutout(j.h(), e, e2, e3, e4);
        }
        if (sdk_INT >= 28) {
            final Rect rect = new Rect(j.a, j.b, j.c, j.d);
            final ArrayList<Rect> list = new ArrayList<Rect>();
            if (e != null) {
                list.add(e);
            }
            if (e2 != null) {
                list.add(e2);
            }
            if (e3 != null) {
                list.add(e3);
            }
            if (e4 != null) {
                list.add(e4);
            }
            return new DisplayCutout(rect, (List)list);
        }
        return null;
    }
    
    static e i(final Object o) {
        e e;
        if (o == null) {
            e = null;
        }
        else {
            e = new e(o);
        }
        return e;
    }
    
    @j0
    public List<Rect> b() {
        if (Build$VERSION.SDK_INT >= 28) {
            return (List<Rect>)((DisplayCutout)this.a).getBoundingRects();
        }
        return Collections.emptyList();
    }
    
    public int c() {
        if (Build$VERSION.SDK_INT >= 28) {
            return ((DisplayCutout)this.a).getSafeInsetBottom();
        }
        return 0;
    }
    
    public int d() {
        if (Build$VERSION.SDK_INT >= 28) {
            return ((DisplayCutout)this.a).getSafeInsetLeft();
        }
        return 0;
    }
    
    public int e() {
        if (Build$VERSION.SDK_INT >= 28) {
            return ((DisplayCutout)this.a).getSafeInsetRight();
        }
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && e.class == o.getClass() && i.a(this.a, ((e)o).a));
    }
    
    public int f() {
        if (Build$VERSION.SDK_INT >= 28) {
            return ((DisplayCutout)this.a).getSafeInsetTop();
        }
        return 0;
    }
    
    @j0
    public j g() {
        if (androidx.core.os.a.h()) {
            return j.g(((DisplayCutout)this.a).getWaterfallInsets());
        }
        return j.e;
    }
    
    @p0(api = 28)
    DisplayCutout h() {
        return (DisplayCutout)this.a;
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DisplayCutoutCompat{");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
