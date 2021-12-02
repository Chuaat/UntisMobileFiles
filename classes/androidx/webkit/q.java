// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import android.content.res.Resources$NotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import android.util.Log;
import androidx.annotation.b1;
import android.content.Context;
import androidx.webkit.internal.a;
import androidx.annotation.k0;
import androidx.annotation.c1;
import java.util.Iterator;
import android.webkit.WebResourceResponse;
import android.net.Uri;
import androidx.annotation.j0;
import java.util.List;

public final class q
{
    private static final String b = "WebViewAssetLoader";
    public static final String c = "appassets.androidplatform.net";
    private final List<e> a;
    
    q(@j0 final List<e> a) {
        this.a = a;
    }
    
    @c1
    @k0
    public WebResourceResponse a(@j0 final Uri uri) {
        for (final e e : this.a) {
            final d b = e.b(uri);
            if (b == null) {
                continue;
            }
            final WebResourceResponse a = b.a(e.a(uri.getPath()));
            if (a == null) {
                continue;
            }
            return a;
        }
        return null;
    }
    
    public static final class a implements d
    {
        private androidx.webkit.internal.a a;
        
        public a(@j0 final Context context) {
            this.a = new androidx.webkit.internal.a(context);
        }
        
        @b1
        a(@j0 final androidx.webkit.internal.a a) {
            this.a = a;
        }
        
        @c1
        @k0
        @Override
        public WebResourceResponse a(@j0 final String str) {
            try {
                return new WebResourceResponse(androidx.webkit.internal.a.f(str), (String)null, this.a.h(str));
            }
            catch (IOException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Error opening asset path: ");
                sb.append(str);
                Log.e("WebViewAssetLoader", sb.toString(), (Throwable)ex);
                return new WebResourceResponse((String)null, (String)null, (InputStream)null);
            }
        }
    }
    
    public static final class b
    {
        private boolean a;
        private String b;
        @j0
        private List<e> c;
        
        public b() {
            this.a = false;
            this.b = "appassets.androidplatform.net";
            this.c = new ArrayList<e>();
        }
        
        @j0
        public b a(@j0 final String s, @j0 final d d) {
            this.c.add(new e(this.b, s, this.a, d));
            return this;
        }
        
        @j0
        public q b() {
            return new q(this.c);
        }
        
        @j0
        public b c(@j0 final String b) {
            this.b = b;
            return this;
        }
        
        @j0
        public b d(final boolean a) {
            this.a = a;
            return this;
        }
    }
    
    public static final class c implements d
    {
        private static final String[] b;
        @j0
        private final File a;
        
        static {
            b = new String[] { "app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/" };
        }
        
        public c(@j0 final Context context, @j0 final File obj) {
            try {
                this.a = new File(androidx.webkit.internal.a.a(obj));
                if (this.b(context)) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("The given directory \"");
                sb.append(obj);
                sb.append("\" doesn't exist under an allowed app internal storage directory");
                throw new IllegalArgumentException(sb.toString());
            }
            catch (IOException cause) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to resolve the canonical path for the given directory: ");
                sb2.append(obj.getPath());
                throw new IllegalArgumentException(sb2.toString(), cause);
            }
        }
        
        private boolean b(@j0 final Context context) throws IOException {
            final String a = androidx.webkit.internal.a.a(this.a);
            final String a2 = androidx.webkit.internal.a.a(context.getCacheDir());
            final String a3 = androidx.webkit.internal.a.a(androidx.webkit.internal.a.c(context));
            if (!a.startsWith(a2) && !a.startsWith(a3)) {
                return false;
            }
            if (!a.equals(a2) && !a.equals(a3)) {
                for (final String str : c.b) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a3);
                    sb.append(str);
                    if (a.startsWith(sb.toString())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        
        @c1
        @j0
        @Override
        public WebResourceResponse a(@j0 final String str) {
            try {
                final File b = androidx.webkit.internal.a.b(this.a, str);
                if (b != null) {
                    return new WebResourceResponse(androidx.webkit.internal.a.f(str), (String)null, androidx.webkit.internal.a.i(b));
                }
                Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.a));
            }
            catch (IOException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Error opening the requested path: ");
                sb.append(str);
                Log.e("WebViewAssetLoader", sb.toString(), (Throwable)ex);
            }
            return new WebResourceResponse((String)null, (String)null, (InputStream)null);
        }
    }
    
    public interface d
    {
        @c1
        @k0
        WebResourceResponse a(@j0 final String p0);
    }
    
    @b1
    static class e
    {
        static final String e = "http";
        static final String f = "https";
        final boolean a;
        @j0
        final String b;
        @j0
        final String c;
        @j0
        final d d;
        
        e(@j0 final String b, @j0 final String c, final boolean a, @j0 final d d) {
            if (c.isEmpty() || c.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (c.endsWith("/")) {
                this.b = b;
                this.c = c;
                this.a = a;
                this.d = d;
                return;
            }
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        
        @c1
        @j0
        public String a(@j0 final String s) {
            return s.replaceFirst(this.c, "");
        }
        
        @c1
        @k0
        public d b(@j0 final Uri uri) {
            if (uri.getScheme().equals("http") && !this.a) {
                return null;
            }
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                return null;
            }
            if (!uri.getAuthority().equals(this.b)) {
                return null;
            }
            if (!uri.getPath().startsWith(this.c)) {
                return null;
            }
            return this.d;
        }
    }
    
    public static final class f implements d
    {
        private androidx.webkit.internal.a a;
        
        public f(@j0 final Context context) {
            this.a = new androidx.webkit.internal.a(context);
        }
        
        @b1
        f(@j0 final androidx.webkit.internal.a a) {
            this.a = a;
        }
        
        @c1
        @k0
        @Override
        public WebResourceResponse a(@j0 final String str) {
            StringBuilder sb;
            String str2;
            try {
                return new WebResourceResponse(androidx.webkit.internal.a.f(str), (String)null, this.a.j(str));
            }
            catch (IOException ex) {
                sb = new StringBuilder();
                str2 = "Error opening resource from the path: ";
            }
            catch (Resources$NotFoundException ex) {
                sb = new StringBuilder();
                str2 = "Resource not found from the path: ";
            }
            sb.append(str2);
            sb.append(str);
            final IOException ex;
            Log.e("WebViewAssetLoader", sb.toString(), (Throwable)ex);
            return new WebResourceResponse((String)null, (String)null, (InputStream)null);
        }
    }
}
