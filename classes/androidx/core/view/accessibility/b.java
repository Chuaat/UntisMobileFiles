// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityEvent;

public final class b
{
    public static final int A = -1;
    @Deprecated
    public static final int a = 128;
    @Deprecated
    public static final int b = 256;
    @Deprecated
    public static final int c = 512;
    @Deprecated
    public static final int d = 1024;
    @Deprecated
    public static final int e = 2048;
    @Deprecated
    public static final int f = 4096;
    @Deprecated
    public static final int g = 8192;
    public static final int h = 16384;
    public static final int i = 32768;
    public static final int j = 65536;
    public static final int k = 131072;
    public static final int l = 262144;
    public static final int m = 524288;
    public static final int n = 1048576;
    public static final int o = 2097152;
    public static final int p = 4194304;
    public static final int q = 8388608;
    public static final int r = 16777216;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 4;
    public static final int w = 8;
    public static final int x = 16;
    public static final int y = 32;
    public static final int z = 64;
    
    private b() {
    }
    
    @Deprecated
    public static void a(final AccessibilityEvent accessibilityEvent, final f f) {
        accessibilityEvent.appendRecord((AccessibilityRecord)f.g());
    }
    
    @Deprecated
    public static f b(final AccessibilityEvent accessibilityEvent) {
        return new f(accessibilityEvent);
    }
    
    public static int c(final AccessibilityEvent accessibilityEvent) {
        if (Build$VERSION.SDK_INT >= 16) {
            return accessibilityEvent.getAction();
        }
        return 0;
    }
    
    public static int d(final AccessibilityEvent accessibilityEvent) {
        if (Build$VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
    
    public static int e(final AccessibilityEvent accessibilityEvent) {
        if (Build$VERSION.SDK_INT >= 16) {
            return accessibilityEvent.getMovementGranularity();
        }
        return 0;
    }
    
    @Deprecated
    public static f f(final AccessibilityEvent accessibilityEvent, final int n) {
        return new f(accessibilityEvent.getRecord(n));
    }
    
    @Deprecated
    public static int g(final AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }
    
    public static void h(final AccessibilityEvent accessibilityEvent, final int action) {
        if (Build$VERSION.SDK_INT >= 16) {
            accessibilityEvent.setAction(action);
        }
    }
    
    public static void i(final AccessibilityEvent accessibilityEvent, final int contentChangeTypes) {
        if (Build$VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(contentChangeTypes);
        }
    }
    
    public static void j(final AccessibilityEvent accessibilityEvent, final int movementGranularity) {
        if (Build$VERSION.SDK_INT >= 16) {
            accessibilityEvent.setMovementGranularity(movementGranularity);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
}
