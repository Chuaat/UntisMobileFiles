// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import androidx.annotation.a1;
import java.util.concurrent.Executor;
import java.util.HashSet;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import android.webkit.ValueCallback;
import android.webkit.WebView$VisualStateCallback;
import android.webkit.WebViewRenderProcessClient;
import androidx.webkit.internal.a0;
import android.webkit.WebViewRenderProcess;
import androidx.webkit.internal.b0;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import androidx.webkit.internal.w;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import androidx.webkit.internal.v;
import androidx.webkit.internal.x;
import androidx.annotation.k0;
import android.content.pm.PackageInfo;
import android.content.Context;
import android.annotation.SuppressLint;
import androidx.webkit.internal.q;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.os.Looper;
import android.os.Build$VERSION;
import androidx.annotation.t0;
import androidx.webkit.internal.u;
import java.util.Set;
import androidx.annotation.j0;
import android.webkit.WebView;
import android.net.Uri;

public class r
{
    private static final Uri a;
    private static final Uri b;
    
    static {
        a = Uri.parse("*");
        b = Uri.parse("");
    }
    
    private r() {
    }
    
    @j0
    @t0({ t0.a.H })
    public static f a(@j0 final WebView webView, @j0 final String s, @j0 final Set<String> set) {
        if (u.B0.k()) {
            return j(webView).a(s, set.toArray(new String[0]));
        }
        throw u.f();
    }
    
    public static void b(@j0 final WebView webView, @j0 final String s, @j0 final Set<String> set, @j0 final c c) {
        if (Build$VERSION.SDK_INT < 21) {
            throw new AssertionError((Object)"Should be on Lollipop and above.");
        }
        if (u.A0.k()) {
            j(webView).b(s, set.toArray(new String[0]), c);
            return;
        }
        throw u.f();
    }
    
    private static void c(final WebView obj) {
        if (Build$VERSION.SDK_INT >= 28) {
            if (obj.getWebViewLooper() == Looper.myLooper()) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("A WebView method was called on thread '");
            sb.append(Thread.currentThread().getName());
            sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
            sb.append(obj.getWebViewLooper());
            sb.append(" called on ");
            sb.append(Looper.myLooper());
            sb.append(", FYI main Looper is ");
            sb.append(Looper.getMainLooper());
            sb.append(")");
            throw new RuntimeException(sb.toString());
        }
        try {
            final Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", (Class<?>[])new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, new Object[0]);
        }
        catch (InvocationTargetException cause) {
            throw new RuntimeException(cause);
        }
        catch (IllegalAccessException cause2) {
            throw new RuntimeException(cause2);
        }
        catch (NoSuchMethodException cause3) {
            throw new RuntimeException(cause3);
        }
    }
    
    private static WebViewProviderBoundaryInterface d(final WebView webView) {
        return g().createWebView(webView);
    }
    
    @SuppressLint({ "NewApi" })
    @j0
    public static m[] e(@j0 final WebView webView) {
        final u m0 = u.m0;
        if (m0.j()) {
            return q.l(webView.createWebMessageChannel());
        }
        if (m0.k()) {
            return j(webView).c();
        }
        throw u.f();
    }
    
    @k0
    public static PackageInfo f(@j0 final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 21) {
            return null;
        }
        if (sdk_INT >= 26) {
            return WebView.getCurrentWebViewPackage();
        }
        try {
            final PackageInfo h = h();
            if (h != null) {
                return h;
            }
            return i(context);
        }
        catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            return null;
        }
    }
    
    private static x g() {
        return v.d();
    }
    
    @SuppressLint({ "PrivateApi" })
    private static PackageInfo h() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo)Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
    }
    
    @SuppressLint({ "PrivateApi" })
    private static PackageInfo i(final Context context) {
        try {
            final int sdk_INT = Build$VERSION.SDK_INT;
            Label_0047: {
                if (sdk_INT < 21 || sdk_INT > 23) {
                    break Label_0047;
                }
                Object o = Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                while (true) {
                    final String s = (String)o;
                    Label_0073: {
                        break Label_0073;
                        try {
                            o = Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                            continue;
                            final PackageManager packageManager;
                            Label_0079: {
                                packageManager = context.getPackageManager();
                            }
                            try {
                                return packageManager.getPackageInfo(s, 0);
                            }
                            catch (PackageManager$NameNotFoundException ex) {
                                return null;
                            }
                        }
                        // iftrue(Label_0079:, s != null)
                        catch (IllegalAccessException ex2) {}
                        catch (InvocationTargetException ex3) {}
                    }
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex4) {}
        catch (IllegalAccessException ex5) {}
        catch (InvocationTargetException ex6) {}
        catch (NoSuchMethodException ex7) {}
    }
    
    private static w j(final WebView webView) {
        return new w(d(webView));
    }
    
    @SuppressLint({ "NewApi" })
    @j0
    public static Uri k() {
        final u s = u.S;
        if (s.j()) {
            return WebView.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (s.k()) {
            return g().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @k0
    public static WebChromeClient l(@j0 final WebView webView) {
        final u q0 = u.q0;
        if (q0.j()) {
            return webView.getWebChromeClient();
        }
        if (q0.k()) {
            return j(webView).d();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @j0
    public static WebViewClient m(@j0 final WebView webView) {
        final u p = u.p0;
        if (p.j()) {
            return webView.getWebViewClient();
        }
        if (p.k()) {
            return j(webView).e();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @k0
    public static t n(@j0 final WebView webView) {
        final u r0 = u.r0;
        if (r0.j()) {
            final WebViewRenderProcess webViewRenderProcess = webView.getWebViewRenderProcess();
            b0 b;
            if (webViewRenderProcess != null) {
                b = b0.b(webViewRenderProcess);
            }
            else {
                b = null;
            }
            return b;
        }
        if (r0.k()) {
            return j(webView).f();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @k0
    public static androidx.webkit.u o(@j0 final WebView webView) {
        final u u0 = u.u0;
        if (u0.j()) {
            final WebViewRenderProcessClient webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
            if (webViewRenderProcessClient != null && webViewRenderProcessClient instanceof a0) {
                return ((a0)webViewRenderProcessClient).a();
            }
            return null;
        }
        else {
            if (u0.k()) {
                return j(webView).g();
            }
            throw u.f();
        }
    }
    
    public static boolean p() {
        if (u.x0.k()) {
            return g().getStatics().isMultiProcessEnabled();
        }
        throw u.f();
    }
    
    public static void q(@j0 final WebView webView, final long n, @j0 final b b) {
        final u j = u.J;
        if (j.j()) {
            webView.postVisualStateCallback(n, (WebView$VisualStateCallback)new WebView$VisualStateCallback() {
                public void onComplete(final long n) {
                    b.onComplete(n);
                }
            });
        }
        else {
            if (!j.k()) {
                throw u.f();
            }
            c(webView);
            j(webView).h(n, b);
        }
    }
    
    @SuppressLint({ "NewApi" })
    public static void r(@j0 final WebView webView, @j0 final l l, @j0 final Uri uri) {
        Uri b = uri;
        if (r.a.equals((Object)uri)) {
            b = r.b;
        }
        final u n0 = u.n0;
        if (n0.j()) {
            webView.postWebMessage(q.g(l), b);
        }
        else {
            if (!n0.k()) {
                throw u.f();
            }
            j(webView).i(l, b);
        }
    }
    
    public static void s(@j0 final WebView webView, @j0 final String s) {
        if (u.A0.k()) {
            j(webView).j(s);
            return;
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    public static void t(@j0 final Set<String> c, @k0 final ValueCallback<Boolean> valueCallback) {
        final u r = u.R;
        final u q = u.Q;
        if (r.k()) {
            g().getStatics().setSafeBrowsingAllowlist((Set)c, (ValueCallback)valueCallback);
            return;
        }
        final ArrayList list = new ArrayList((Collection<? extends E>)c);
        if (q.j()) {
            WebView.setSafeBrowsingWhitelist((List)list, (ValueCallback)valueCallback);
        }
        else {
            if (!q.k()) {
                throw u.f();
            }
            g().getStatics().setSafeBrowsingWhitelist((List)list, (ValueCallback)valueCallback);
        }
    }
    
    @Deprecated
    @SuppressLint({ "NewApi" })
    public static void u(@j0 final List<String> c, @k0 final ValueCallback<Boolean> valueCallback) {
        t(new HashSet<String>(c), valueCallback);
    }
    
    @SuppressLint({ "NewApi" })
    public static void v(@j0 final WebView webView, @k0 final androidx.webkit.u u) {
        final u u2 = u.u0;
        final boolean j = u2.j();
        WebViewRenderProcessClient webViewRenderProcessClient = null;
        if (j) {
            if (u != null) {
                webViewRenderProcessClient = new a0(u);
            }
            webView.setWebViewRenderProcessClient(webViewRenderProcessClient);
        }
        else {
            if (!u2.k()) {
                throw u.f();
            }
            j(webView).k(null, u);
        }
    }
    
    @SuppressLint({ "LambdaLast", "NewApi" })
    public static void w(@j0 final WebView webView, @j0 final Executor executor, @j0 final androidx.webkit.u u) {
        final u u2 = u.u0;
        if (u2.j()) {
            a0 a0;
            if (u != null) {
                a0 = new a0(u);
            }
            else {
                a0 = null;
            }
            webView.setWebViewRenderProcessClient(executor, (WebViewRenderProcessClient)a0);
        }
        else {
            if (!u2.k()) {
                throw u.f();
            }
            j(webView).k(executor, u);
        }
    }
    
    @SuppressLint({ "NewApi" })
    public static void x(@j0 final Context context, @k0 final ValueCallback<Boolean> valueCallback) {
        final u n = u.N;
        if (n.j()) {
            WebView.startSafeBrowsing(context, (ValueCallback)valueCallback);
        }
        else {
            if (!n.k()) {
                throw u.f();
            }
            g().getStatics().initSafeBrowsing(context, (ValueCallback)valueCallback);
        }
    }
    
    public interface b
    {
        @a1
        void onComplete(final long p0);
    }
    
    public interface c
    {
        @a1
        void a(@j0 final WebView p0, @j0 final l p1, @j0 final Uri p2, final boolean p3, @j0 final a p4);
    }
}
