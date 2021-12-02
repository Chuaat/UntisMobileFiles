// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.j0;
import android.util.Log;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewParent;

public final class o0
{
    private static final String a = "ViewParentCompat";
    private static int[] b;
    
    private o0() {
    }
    
    private static int[] a() {
        final int[] b = o0.b;
        if (b == null) {
            o0.b = new int[2];
        }
        else {
            b[1] = (b[0] = 0);
        }
        return o0.b;
    }
    
    public static void b(final ViewParent viewParent, final View view, final View view2, final int n) {
        if (Build$VERSION.SDK_INT >= 19) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, n);
        }
    }
    
    public static boolean c(final ViewParent obj, final View view, final float n, final float n2, final boolean b) {
        if (Build$VERSION.SDK_INT >= 21) {
            try {
                return obj.onNestedFling(view, n, n2, b);
            }
            catch (AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(obj);
                sb.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                return false;
            }
        }
        if (obj instanceof y) {
            return ((y)obj).onNestedFling(view, n, n2, b);
        }
        return false;
    }
    
    public static boolean d(final ViewParent obj, final View view, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 21) {
            try {
                return obj.onNestedPreFling(view, n, n2);
            }
            catch (AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(obj);
                sb.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                return false;
            }
        }
        if (obj instanceof y) {
            return ((y)obj).onNestedPreFling(view, n, n2);
        }
        return false;
    }
    
    public static void e(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array) {
        f(viewParent, view, n, n2, array, 0);
    }
    
    public static void f(final ViewParent obj, final View view, final int n, final int n2, final int[] array, final int n3) {
        if (obj instanceof w) {
            ((w)obj).u(view, n, n2, array, n3);
        }
        else if (n3 == 0) {
            if (Build$VERSION.SDK_INT >= 21) {
                try {
                    obj.onNestedPreScroll(view, n, n2, array);
                }
                catch (AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(obj);
                    sb.append(" does not implement interface method onNestedPreScroll");
                    Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                }
            }
            else if (obj instanceof y) {
                ((y)obj).onNestedPreScroll(view, n, n2, array);
            }
        }
    }
    
    public static void g(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4) {
        i(viewParent, view, n, n2, n3, n4, 0, a());
    }
    
    public static void h(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        i(viewParent, view, n, n2, n3, n4, n5, a());
    }
    
    public static void i(final ViewParent obj, final View view, final int n, final int n2, final int n3, final int n4, final int n5, @j0 final int[] array) {
        if (obj instanceof x) {
            ((x)obj).p(view, n, n2, n3, n4, n5, array);
        }
        else {
            array[0] += n3;
            array[1] += n4;
            if (obj instanceof w) {
                ((w)obj).q(view, n, n2, n3, n4, n5);
            }
            else if (n5 == 0) {
                if (Build$VERSION.SDK_INT >= 21) {
                    try {
                        obj.onNestedScroll(view, n, n2, n3, n4);
                    }
                    catch (AbstractMethodError abstractMethodError) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("ViewParent ");
                        sb.append(obj);
                        sb.append(" does not implement interface method onNestedScroll");
                        Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                    }
                }
                else if (obj instanceof y) {
                    ((y)obj).onNestedScroll(view, n, n2, n3, n4);
                }
            }
        }
    }
    
    public static void j(final ViewParent viewParent, final View view, final View view2, final int n) {
        k(viewParent, view, view2, n, 0);
    }
    
    public static void k(final ViewParent obj, final View view, final View view2, final int n, final int n2) {
        if (obj instanceof w) {
            ((w)obj).s(view, view2, n, n2);
        }
        else if (n2 == 0) {
            if (Build$VERSION.SDK_INT >= 21) {
                try {
                    obj.onNestedScrollAccepted(view, view2, n);
                }
                catch (AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(obj);
                    sb.append(" does not implement interface method onNestedScrollAccepted");
                    Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                }
            }
            else if (obj instanceof y) {
                ((y)obj).onNestedScrollAccepted(view, view2, n);
            }
        }
    }
    
    public static boolean l(final ViewParent viewParent, final View view, final View view2, final int n) {
        return m(viewParent, view, view2, n, 0);
    }
    
    public static boolean m(final ViewParent obj, final View view, final View view2, final int n, final int n2) {
        if (obj instanceof w) {
            return ((w)obj).r(view, view2, n, n2);
        }
        if (n2 == 0) {
            if (Build$VERSION.SDK_INT >= 21) {
                try {
                    return obj.onStartNestedScroll(view, view2, n);
                }
                catch (AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(obj);
                    sb.append(" does not implement interface method onStartNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                    return false;
                }
            }
            if (obj instanceof y) {
                return ((y)obj).onStartNestedScroll(view, view2, n);
            }
        }
        return false;
    }
    
    public static void n(final ViewParent viewParent, final View view) {
        o(viewParent, view, 0);
    }
    
    public static void o(final ViewParent obj, final View view, final int n) {
        if (obj instanceof w) {
            ((w)obj).t(view, n);
        }
        else if (n == 0) {
            if (Build$VERSION.SDK_INT >= 21) {
                try {
                    obj.onStopNestedScroll(view);
                }
                catch (AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(obj);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
                }
            }
            else if (obj instanceof y) {
                ((y)obj).onStopNestedScroll(view);
            }
        }
    }
    
    @Deprecated
    public static boolean p(final ViewParent viewParent, final View view, final AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
