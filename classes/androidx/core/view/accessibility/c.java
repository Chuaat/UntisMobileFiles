// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import androidx.annotation.p0;
import androidx.annotation.j0;
import android.accessibilityservice.AccessibilityServiceInfo;
import java.util.List;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager;

public final class c
{
    private c() {
    }
    
    @Deprecated
    public static boolean a(final AccessibilityManager accessibilityManager, final a a) {
        return a != null && accessibilityManager.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)new c(a));
    }
    
    public static boolean b(final AccessibilityManager accessibilityManager, final d d) {
        return Build$VERSION.SDK_INT >= 19 && d != null && accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new e(d));
    }
    
    @Deprecated
    public static List<AccessibilityServiceInfo> c(final AccessibilityManager accessibilityManager, final int n) {
        return (List<AccessibilityServiceInfo>)accessibilityManager.getEnabledAccessibilityServiceList(n);
    }
    
    @Deprecated
    public static List<AccessibilityServiceInfo> d(final AccessibilityManager accessibilityManager) {
        return (List<AccessibilityServiceInfo>)accessibilityManager.getInstalledAccessibilityServiceList();
    }
    
    @Deprecated
    public static boolean e(final AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }
    
    @Deprecated
    public static boolean f(final AccessibilityManager accessibilityManager, final a a) {
        return a != null && accessibilityManager.removeAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)new c(a));
    }
    
    public static boolean g(final AccessibilityManager accessibilityManager, final d d) {
        return Build$VERSION.SDK_INT >= 19 && d != null && accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new e(d));
    }
    
    @Deprecated
    public interface a
    {
        @Deprecated
        void onAccessibilityStateChanged(final boolean p0);
    }
    
    @Deprecated
    public abstract static class b implements a
    {
    }
    
    private static class c implements AccessibilityManager$AccessibilityStateChangeListener
    {
        a a;
        
        c(@j0 final a a) {
            this.a = a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof c && this.a.equals(((c)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        public void onAccessibilityStateChanged(final boolean b) {
            this.a.onAccessibilityStateChanged(b);
        }
    }
    
    public interface d
    {
        void onTouchExplorationStateChanged(final boolean p0);
    }
    
    @p0(19)
    private static final class e implements AccessibilityManager$TouchExplorationStateChangeListener
    {
        final d a;
        
        e(@j0 final d a) {
            this.a = a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof e && this.a.equals(((e)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        public void onTouchExplorationStateChanged(final boolean b) {
            this.a.onTouchExplorationStateChanged(b);
        }
    }
}
