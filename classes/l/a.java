// 
// Decompiled by Procyon v0.5.36
// 

package l;

import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.accessibilityservice.AccessibilityServiceInfo;
import androidx.annotation.k0;
import androidx.annotation.j0;

public final class a
{
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 32;
    public static final int f = -1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 16;
    public static final int k = 32;
    
    private a() {
    }
    
    @j0
    public static String a(final int n) {
        if (n == 1) {
            return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
        }
        if (n == 2) {
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
        }
        if (n == 4) {
            return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (n != 8) {
            return "UNKNOWN";
        }
        return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
    }
    
    @j0
    public static String b(int i) {
        final StringBuilder sb = new StringBuilder();
        String str = "[";
    Label_0011:
        while (true) {
            sb.append(str);
            while (i > 0) {
                final int n = 1 << Integer.numberOfTrailingZeros(i);
                i &= ~n;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                if (n == 1) {
                    str = "FEEDBACK_SPOKEN";
                    continue Label_0011;
                }
                if (n == 2) {
                    str = "FEEDBACK_HAPTIC";
                    continue Label_0011;
                }
                if (n == 4) {
                    str = "FEEDBACK_AUDIBLE";
                    continue Label_0011;
                }
                if (n == 8) {
                    str = "FEEDBACK_VISUAL";
                    continue Label_0011;
                }
                if (n != 16) {
                    continue;
                }
                str = "FEEDBACK_GENERIC";
                continue Label_0011;
            }
            break;
        }
        sb.append("]");
        return sb.toString();
    }
    
    @k0
    public static String c(final int n) {
        if (n == 1) {
            return "DEFAULT";
        }
        if (n == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (n == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (n == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (n == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (n != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }
    
    public static int d(@j0 final AccessibilityServiceInfo accessibilityServiceInfo) {
        if (Build$VERSION.SDK_INT >= 18) {
            return accessibilityServiceInfo.getCapabilities();
        }
        if (accessibilityServiceInfo.getCanRetrieveWindowContent()) {
            return 1;
        }
        return 0;
    }
    
    @k0
    public static String e(@j0 final AccessibilityServiceInfo accessibilityServiceInfo, @j0 final PackageManager packageManager) {
        if (Build$VERSION.SDK_INT >= 16) {
            return accessibilityServiceInfo.loadDescription(packageManager);
        }
        return accessibilityServiceInfo.getDescription();
    }
}
