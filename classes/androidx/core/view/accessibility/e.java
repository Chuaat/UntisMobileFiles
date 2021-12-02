// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import java.util.ArrayList;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.p0;
import java.util.List;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Build$VERSION;

public class e
{
    public static final int b = -1;
    private final Object a;
    
    public e() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        AccessibilityNodeProvider a;
        if (sdk_INT >= 26) {
            a = new c(this);
        }
        else if (sdk_INT >= 19) {
            a = new b(this);
        }
        else if (sdk_INT >= 16) {
            a = new a(this);
        }
        else {
            a = null;
        }
        this.a = a;
    }
    
    public e(final Object a) {
        this.a = a;
    }
    
    public void a(final int n, @j0 final d d, @j0 final String s, @k0 final Bundle bundle) {
    }
    
    @k0
    public d b(final int n) {
        return null;
    }
    
    @k0
    public List<d> c(final String s, final int n) {
        return null;
    }
    
    @k0
    public d d(final int n) {
        return null;
    }
    
    public Object e() {
        return this.a;
    }
    
    public boolean f(final int n, final int n2, final Bundle bundle) {
        return false;
    }
    
    @p0(16)
    static class a extends AccessibilityNodeProvider
    {
        final e a;
        
        a(final e a) {
            this.a = a;
        }
        
        public AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
            final d b = this.a.b(n);
            if (b == null) {
                return null;
            }
            return b.U1();
        }
        
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(final String s, int i) {
            final List<d> c = this.a.c(s, i);
            if (c == null) {
                return null;
            }
            final ArrayList<AccessibilityNodeInfo> list = new ArrayList<AccessibilityNodeInfo>();
            int size;
            for (size = c.size(), i = 0; i < size; ++i) {
                list.add(c.get(i).U1());
            }
            return list;
        }
        
        public boolean performAction(final int n, final int n2, final Bundle bundle) {
            return this.a.f(n, n2, bundle);
        }
    }
    
    @p0(19)
    static class b extends a
    {
        b(final e e) {
            super(e);
        }
        
        public AccessibilityNodeInfo findFocus(final int n) {
            final d d = super.a.d(n);
            if (d == null) {
                return null;
            }
            return d.U1();
        }
    }
    
    @p0(26)
    static class c extends b
    {
        c(final e e) {
            super(e);
        }
        
        public void addExtraDataToAccessibilityNodeInfo(final int n, final AccessibilityNodeInfo accessibilityNodeInfo, final String s, final Bundle bundle) {
            super.a.a(n, d.V1(accessibilityNodeInfo), s, bundle);
        }
    }
}
