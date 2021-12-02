// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import java.util.Arrays;
import org.chromium.support_lib_boundary.util.a;
import android.os.Build$VERSION;
import androidx.annotation.b1;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import androidx.annotation.j0;

public enum u implements b
{
    A0("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER"), 
    B0("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    
    private static final int C0 = -1;
    
    J("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 23), 
    K("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 23), 
    L("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 26), 
    M("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 24), 
    N("START_SAFE_BROWSING", "START_SAFE_BROWSING", 27), 
    @Deprecated
    O("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 27), 
    @Deprecated
    P("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 27), 
    Q("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 27), 
    R("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 27), 
    S("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 27), 
    T("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 24), 
    U("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 24), 
    V("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 24), 
    W("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 24), 
    X("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 24), 
    Y("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 24), 
    Z("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 23), 
    a0("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 23), 
    b0("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 24), 
    c0("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 27), 
    d0("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 24), 
    e0("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 23), 
    f0("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 23), 
    g0("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 27), 
    h0("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 27), 
    i0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 27), 
    j0("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 23), 
    k0("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 23), 
    l0("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 23), 
    m0("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 23), 
    n0("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 23), 
    o0("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 23), 
    p0("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 26), 
    q0("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 26), 
    r0("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 29), 
    s0("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 29), 
    t0("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 28), 
    u0("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 29), 
    v0("PROXY_OVERRIDE", "PROXY_OVERRIDE:3"), 
    w0("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE"), 
    x0("MULTI_PROCESS", "MULTI_PROCESS_QUERY"), 
    y0("FORCE_DARK", "FORCE_DARK"), 
    z0("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    
    private final String G;
    private final String H;
    private final int I;
    
    private u(final String s2, final String s3) {
        this(s2, s3, -1);
    }
    
    private u(final String g, final String h, final int i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @j0
    public static UnsupportedOperationException f() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
    
    @j0
    public static Set<String> g() {
        return a.a;
    }
    
    public static boolean h(@j0 final String s) {
        final HashSet<u> set = new HashSet<u>();
        final u[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            set.add(values[i]);
        }
        return i(s, (Collection<b>)set);
    }
    
    @b1
    public static boolean i(@j0 final String s, @j0 final Collection<b> collection) {
        final HashSet<b> set = new HashSet<b>();
        for (final b b : collection) {
            if (b.d().equals(s)) {
                set.add(b);
            }
        }
        if (!set.isEmpty()) {
            final Iterator<Object> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().b()) {
                    return true;
                }
            }
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown feature ");
        sb.append(s);
        throw new RuntimeException(sb.toString());
    }
    
    @Override
    public boolean b() {
        return this.j() || this.k();
    }
    
    @j0
    @Override
    public String d() {
        return this.G;
    }
    
    public boolean j() {
        final int i = this.I;
        boolean b = false;
        if (i == -1) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= i) {
            b = true;
        }
        return b;
    }
    
    public boolean k() {
        return org.chromium.support_lib_boundary.util.a.b((Collection)a.a, this.H);
    }
    
    private static class a
    {
        static final Set<String> a;
        
        static {
            a = new HashSet<String>(Arrays.asList(v.d().a()));
        }
    }
}
