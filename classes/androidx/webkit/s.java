// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.webkit.internal.u;
import androidx.annotation.j0;
import androidx.annotation.t0;

public class s
{
    public static final String A = "WEB_MESSAGE_PORT_CLOSE";
    public static final String B = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";
    public static final String C = "CREATE_WEB_MESSAGE_CHANNEL";
    public static final String D = "POST_WEB_MESSAGE";
    public static final String E = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";
    public static final String F = "GET_WEB_VIEW_CLIENT";
    public static final String G = "GET_WEB_CHROME_CLIENT";
    public static final String H = "GET_WEB_VIEW_RENDERER";
    public static final String I = "WEB_VIEW_RENDERER_TERMINATE";
    public static final String J = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";
    public static final String K = "PROXY_OVERRIDE";
    @t0({ t0.a.H })
    public static final String L = "SUPPRESS_ERROR_PAGE";
    public static final String M = "MULTI_PROCESS";
    public static final String N = "FORCE_DARK";
    public static final String O = "FORCE_DARK_STRATEGY";
    public static final String P = "WEB_MESSAGE_LISTENER";
    @t0({ t0.a.H })
    public static final String Q = "DOCUMENT_START_SCRIPT";
    public static final String a = "VISUAL_STATE_CALLBACK";
    public static final String b = "OFF_SCREEN_PRERASTER";
    public static final String c = "SAFE_BROWSING_ENABLE";
    public static final String d = "DISABLED_ACTION_MODE_MENU_ITEMS";
    public static final String e = "START_SAFE_BROWSING";
    public static final String f = "SAFE_BROWSING_ALLOWLIST";
    @Deprecated
    public static final String g = "SAFE_BROWSING_WHITELIST";
    public static final String h = "SAFE_BROWSING_PRIVACY_POLICY_URL";
    public static final String i = "SERVICE_WORKER_BASIC_USAGE";
    public static final String j = "SERVICE_WORKER_CACHE_MODE";
    public static final String k = "SERVICE_WORKER_CONTENT_ACCESS";
    public static final String l = "SERVICE_WORKER_FILE_ACCESS";
    public static final String m = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";
    public static final String n = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";
    public static final String o = "RECEIVE_WEB_RESOURCE_ERROR";
    public static final String p = "RECEIVE_HTTP_ERROR";
    public static final String q = "SHOULD_OVERRIDE_WITH_REDIRECTS";
    public static final String r = "SAFE_BROWSING_HIT";
    public static final String s = "TRACING_CONTROLLER_BASIC_USAGE";
    public static final String t = "WEB_RESOURCE_REQUEST_IS_REDIRECT";
    public static final String u = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";
    public static final String v = "WEB_RESOURCE_ERROR_GET_CODE";
    public static final String w = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";
    public static final String x = "SAFE_BROWSING_RESPONSE_PROCEED";
    public static final String y = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";
    public static final String z = "WEB_MESSAGE_PORT_POST_MESSAGE";
    
    private s() {
    }
    
    public static boolean a(@j0 final String s) {
        return androidx.webkit.internal.u.h(s);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.PARAMETER, ElementType.METHOD })
    @t0({ t0.a.G })
    public @interface a {
    }
}
