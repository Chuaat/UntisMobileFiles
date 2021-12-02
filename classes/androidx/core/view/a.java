// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.p0;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Build$VERSION;
import androidx.core.view.accessibility.e;
import android.view.accessibility.AccessibilityEvent;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.text.style.ClickableSpan;
import java.util.Collections;
import androidx.core.view.accessibility.d;
import java.util.List;
import android.view.View;
import androidx.annotation.t0;
import android.view.View$AccessibilityDelegate;

public class a
{
    private static final View$AccessibilityDelegate c;
    private final View$AccessibilityDelegate a;
    private final View$AccessibilityDelegate b;
    
    static {
        c = new View$AccessibilityDelegate();
    }
    
    public a() {
        this(androidx.core.view.a.c);
    }
    
    @t0({ t0.a.I })
    public a(final View$AccessibilityDelegate a) {
        this.a = a;
        this.b = new a(this);
    }
    
    static List<d.a> c(final View view) {
        List<d.a> emptyList;
        if ((emptyList = (List<d.a>)view.getTag(k.a.e.d0)) == null) {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    private boolean e(final ClickableSpan clickableSpan, final View view) {
        if (clickableSpan != null) {
            final ClickableSpan[] w = d.w(view.createAccessibilityNodeInfo().getText());
            for (int n = 0; w != null && n < w.length; ++n) {
                if (clickableSpan.equals(w[n])) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean k(final int n, final View view) {
        final SparseArray sparseArray = (SparseArray)view.getTag(k.a.e.e0);
        if (sparseArray != null) {
            final WeakReference weakReference = (WeakReference)sparseArray.get(n);
            if (weakReference != null) {
                final ClickableSpan clickableSpan = weakReference.get();
                if (this.e(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean a(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public e b(final View view) {
        if (Build$VERSION.SDK_INT >= 16) {
            final AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new e(accessibilityNodeProvider);
            }
        }
        return null;
    }
    
    View$AccessibilityDelegate d() {
        return this.b;
    }
    
    public void f(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void g(final View view, final d d) {
        this.a.onInitializeAccessibilityNodeInfo(view, d.U1());
    }
    
    public void h(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public boolean i(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean j(final View view, final int n, final Bundle bundle) {
        final List<d.a> c = c(view);
        final int n2 = 0;
        int n3 = 0;
        int d;
        while (true) {
            d = n2;
            if (n3 >= c.size()) {
                break;
            }
            final d.a a = c.get(n3);
            if (a.b() == n) {
                d = (a.d(view, bundle) ? 1 : 0);
                break;
            }
            ++n3;
        }
        int performAccessibilityAction = d;
        if (d == 0) {
            performAccessibilityAction = d;
            if (Build$VERSION.SDK_INT >= 16) {
                performAccessibilityAction = (this.a.performAccessibilityAction(view, n, bundle) ? 1 : 0);
            }
        }
        int k;
        if ((k = performAccessibilityAction) == 0) {
            k = performAccessibilityAction;
            if (n == k.a.e.a) {
                k = (this.k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view) ? 1 : 0);
            }
        }
        return k != 0;
    }
    
    public void l(final View view, final int n) {
        this.a.sendAccessibilityEvent(view, n);
    }
    
    public void m(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    static final class a extends View$AccessibilityDelegate
    {
        final androidx.core.view.a a;
        
        a(final androidx.core.view.a a) {
            this.a = a;
        }
        
        public boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }
        
        @p0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
            final e b = this.a.b(view);
            AccessibilityNodeProvider accessibilityNodeProvider;
            if (b != null) {
                accessibilityNodeProvider = (AccessibilityNodeProvider)b.e();
            }
            else {
                accessibilityNodeProvider = null;
            }
            return accessibilityNodeProvider;
        }
        
        public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }
        
        public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
            final d v1 = d.V1(accessibilityNodeInfo);
            v1.C1(j0.Y0(view));
            v1.i1(j0.M0(view));
            v1.w1(j0.H(view));
            v1.I1(j0.u0(view));
            this.a.g(view, v1);
            v1.f(accessibilityNodeInfo.getText(), view);
            final List<d.a> c = androidx.core.view.a.c(view);
            for (int i = 0; i < c.size(); ++i) {
                v1.b((d.a)c.get(i));
            }
        }
        
        public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }
        
        public boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }
        
        public boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
            return this.a.j(view, n, bundle);
        }
        
        public void sendAccessibilityEvent(final View view, final int n) {
            this.a.l(view, n);
        }
        
        public void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }
}
