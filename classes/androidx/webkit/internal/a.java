// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import android.content.res.Resources$NotFoundException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import android.util.TypedValue;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import java.io.IOException;
import java.io.File;
import androidx.annotation.j0;
import android.content.Context;

public class a
{
    private static final String b = "AssetHelper";
    public static final String c = "text/plain";
    @j0
    private Context a;
    
    public a(@j0 final Context a) {
        this.a = a;
    }
    
    @j0
    public static String a(@j0 final File file) throws IOException {
        String s;
        final String str = s = file.getCanonicalPath();
        if (!str.endsWith("/")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            s = sb.toString();
        }
        return s;
    }
    
    @k0
    public static File b(@j0 final File parent, @j0 final String child) throws IOException {
        final String a = a(parent);
        final String canonicalPath = new File(parent, child).getCanonicalPath();
        if (canonicalPath.startsWith(a)) {
            return new File(canonicalPath);
        }
        return null;
    }
    
    @j0
    public static File c(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        return context.getCacheDir().getParentFile();
    }
    
    private int d(@j0 final String s, @j0 final String s2) {
        return this.a.getResources().getIdentifier(s2, s, this.a.getPackageName());
    }
    
    private int e(final int n) {
        final TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(n, typedValue, true);
        return typedValue.type;
    }
    
    @j0
    public static String f(@j0 String guessContentTypeFromName) {
        if ((guessContentTypeFromName = URLConnection.guessContentTypeFromName(guessContentTypeFromName)) == null) {
            guessContentTypeFromName = "text/plain";
        }
        return guessContentTypeFromName;
    }
    
    @j0
    private static InputStream g(@j0 final String s, @j0 final InputStream in) throws IOException {
        InputStream inputStream = in;
        if (s.endsWith(".svgz")) {
            inputStream = new GZIPInputStream(in);
        }
        return inputStream;
    }
    
    @j0
    public static InputStream i(@j0 final File file) throws FileNotFoundException, IOException {
        return g(file.getPath(), new FileInputStream(file));
    }
    
    @j0
    private static String k(@j0 final String s) {
        String substring = s;
        if (s.length() > 1) {
            substring = s;
            if (s.charAt(0) == '/') {
                substring = s.substring(1);
            }
        }
        return substring;
    }
    
    @j0
    public InputStream h(@j0 String k) throws IOException {
        k = k(k);
        return g(k, this.a.getAssets().open(k, 2));
    }
    
    @j0
    public InputStream j(@j0 String substring) throws Resources$NotFoundException, IOException {
        final String k = k(substring);
        final String[] split = k.split("/", -1);
        if (split.length != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Incorrect resource path: ");
            sb.append(k);
            throw new IllegalArgumentException(sb.toString());
        }
        final String s = split[0];
        final String s2 = split[1];
        final int lastIndex = s2.lastIndexOf(46);
        substring = s2;
        if (lastIndex != -1) {
            substring = s2.substring(0, lastIndex);
        }
        final int d = this.d(s, substring);
        final int e = this.e(d);
        if (e == 3) {
            return g(k, this.a.getResources().openRawResource(d));
        }
        throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", k, e));
    }
}
