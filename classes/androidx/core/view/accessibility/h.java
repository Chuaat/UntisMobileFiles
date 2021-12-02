// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import androidx.annotation.j0;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityWindowInfo;
import android.os.Build$VERSION;

public class h
{
    private static final int b = -1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private Object a;
    
    private h(final Object a) {
        this.a = a;
    }
    
    public static h n() {
        if (Build$VERSION.SDK_INT >= 21) {
            return r(AccessibilityWindowInfo.obtain());
        }
        return null;
    }
    
    public static h o(final h h) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        h r = null;
        if (sdk_INT >= 21) {
            if (h == null) {
                r = r;
            }
            else {
                r = r(AccessibilityWindowInfo.obtain((AccessibilityWindowInfo)h.a));
            }
        }
        return r;
    }
    
    private static String q(final int n) {
        if (n == 1) {
            return "TYPE_APPLICATION";
        }
        if (n == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (n == 3) {
            return "TYPE_SYSTEM";
        }
        if (n != 4) {
            return "<UNKNOWN>";
        }
        return "TYPE_ACCESSIBILITY_OVERLAY";
    }
    
    static h r(final Object o) {
        if (o != null) {
            return new h(o);
        }
        return null;
    }
    
    public d a() {
        if (Build$VERSION.SDK_INT >= 24) {
            return androidx.core.view.accessibility.d.W1(((AccessibilityWindowInfo)this.a).getAnchor());
        }
        return null;
    }
    
    public void b(final Rect rect) {
        if (Build$VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo)this.a).getBoundsInScreen(rect);
        }
    }
    
    public h c(final int n) {
        if (Build$VERSION.SDK_INT >= 21) {
            return r(((AccessibilityWindowInfo)this.a).getChild(n));
        }
        return null;
    }
    
    public int d() {
        if (Build$VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo)this.a).getChildCount();
        }
        return 0;
    }
    
    public int e() {
        if (Build$VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo)this.a).getId();
        }
        return -1;
    }
    
    @Override
    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (a == null) {
            return false;
        }
        if (!(a instanceof h)) {
            return false;
        }
        final h h = (h)a;
        a = this.a;
        final Object a2 = h.a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        }
        else if (!a.equals(a2)) {
            return false;
        }
        return true;
    }
    
    public int f() {
        if (Build$VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo)this.a).getLayer();
        }
        return -1;
    }
    
    public h g() {
        if (Build$VERSION.SDK_INT >= 21) {
            return r(((AccessibilityWindowInfo)this.a).getParent());
        }
        return null;
    }
    
    public d h() {
        if (Build$VERSION.SDK_INT >= 21) {
            return androidx.core.view.accessibility.d.W1(((AccessibilityWindowInfo)this.a).getRoot());
        }
        return null;
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
    
    public CharSequence i() {
        if (Build$VERSION.SDK_INT >= 24) {
            return ((AccessibilityWindowInfo)this.a).getTitle();
        }
        return null;
    }
    
    public int j() {
        if (Build$VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo)this.a).getType();
        }
        return -1;
    }
    
    public boolean k() {
        return Build$VERSION.SDK_INT < 21 || ((AccessibilityWindowInfo)this.a).isAccessibilityFocused();
    }
    
    public boolean l() {
        return Build$VERSION.SDK_INT < 21 || ((AccessibilityWindowInfo)this.a).isActive();
    }
    
    public boolean m() {
        return Build$VERSION.SDK_INT < 21 || ((AccessibilityWindowInfo)this.a).isFocused();
    }
    
    public void p() {
        if (Build$VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo)this.a).recycle();
        }
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final Rect obj = new Rect();
        this.b(obj);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(this.e());
        sb.append(", type=");
        sb.append(q(this.j()));
        sb.append(", layer=");
        sb.append(this.f());
        sb.append(", bounds=");
        sb.append(obj);
        sb.append(", focused=");
        sb.append(this.m());
        sb.append(", active=");
        sb.append(this.l());
        sb.append(", hasParent=");
        final h g = this.g();
        final boolean b = true;
        sb.append(g != null);
        sb.append(", hasChildren=");
        sb.append(this.d() > 0 && b);
        sb.append(']');
        return sb.toString();
    }
}
