// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import android.text.TextUtils;
import java.util.Iterator;
import android.net.Uri$Builder;
import java.util.Map;
import android.database.MatrixCursor;
import android.database.Cursor;
import java.io.FileNotFoundException;
import android.os.ParcelFileDescriptor;
import android.content.ContentValues;
import android.webkit.MimeTypeMap;
import androidx.annotation.k0;
import android.content.res.XmlResourceParser;
import android.content.pm.ProviderInfo;
import android.os.Build$VERSION;
import android.os.Environment;
import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.j0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.Context;
import androidx.annotation.w;
import java.util.HashMap;
import java.io.File;
import android.content.ContentProvider;

public class FileProvider extends ContentProvider
{
    private static final String[] H;
    private static final String I = "android.support.FILE_PROVIDER_PATHS";
    private static final String J = "root-path";
    private static final String K = "files-path";
    private static final String L = "cache-path";
    private static final String M = "external-path";
    private static final String N = "external-files-path";
    private static final String O = "external-cache-path";
    private static final String P = "external-media-path";
    private static final String Q = "name";
    private static final String R = "path";
    private static final String S = "displayName";
    private static final File T;
    @w("sCache")
    private static HashMap<String, a> U;
    private a G;
    
    static {
        H = new String[] { "_display_name", "_size" };
        T = new File("/");
        FileProvider.U = new HashMap<String, a>();
    }
    
    private static File a(File parent, final String... array) {
        File file;
        for (int length = array.length, i = 0; i < length; ++i, parent = file) {
            final String child = array[i];
            file = parent;
            if (child != null) {
                file = new File(parent, child);
            }
        }
        return parent;
    }
    
    private static Object[] b(final Object[] array, final int n) {
        final Object[] array2 = new Object[n];
        System.arraycopy(array, 0, array2, 0, n);
        return array2;
    }
    
    private static String[] c(final String[] array, final int n) {
        final String[] array2 = new String[n];
        System.arraycopy(array, 0, array2, 0, n);
        return array2;
    }
    
    private static a d(final Context context, final String s) {
        synchronized (FileProvider.U) {
            a h;
            if ((h = FileProvider.U.get(s)) == null) {
                try {
                    h = h(context, s);
                    FileProvider.U.put(s, h);
                }
                catch (XmlPullParserException cause) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", (Throwable)cause);
                }
                catch (IOException cause2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", cause2);
                }
            }
            return h;
        }
    }
    
    public static Uri e(@j0 final Context context, @j0 final String s, @j0 final File file) {
        return d(context, s).b(file);
    }
    
    @SuppressLint({ "StreamFiles" })
    @j0
    public static Uri f(@j0 final Context context, @j0 final String s, @j0 final File file, @j0 final String s2) {
        return e(context, s, file).buildUpon().appendQueryParameter("displayName", s2).build();
    }
    
    private static int g(final String str) {
        int n;
        if ("r".equals(str)) {
            n = 268435456;
        }
        else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                n = 704643072;
            }
            else if ("rw".equals(str)) {
                n = 939524096;
            }
            else {
                if (!"rwt".equals(str)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid mode: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
                n = 1006632960;
            }
        }
        else {
            n = 738197504;
        }
        return n;
    }
    
    private static a h(final Context context, final String str) throws IOException, XmlPullParserException {
        final b b = new b(str);
        final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Couldn't find meta-data for provider with authority ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        final XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            while (true) {
                final int next = loadXmlMetaData.next();
                if (next == 1) {
                    break;
                }
                if (next != 2) {
                    continue;
                }
                final String name = loadXmlMetaData.getName();
                final File file = null;
                final String attributeValue = loadXmlMetaData.getAttributeValue((String)null, "name");
                final String attributeValue2 = loadXmlMetaData.getAttributeValue((String)null, "path");
                File file2;
                if ("root-path".equals(name)) {
                    file2 = FileProvider.T;
                }
                else if ("files-path".equals(name)) {
                    file2 = context.getFilesDir();
                }
                else if ("cache-path".equals(name)) {
                    file2 = context.getCacheDir();
                }
                else if ("external-path".equals(name)) {
                    file2 = Environment.getExternalStorageDirectory();
                }
                else if ("external-files-path".equals(name)) {
                    final File[] k = d.k(context, null);
                    file2 = file;
                    if (k.length > 0) {
                        file2 = k[0];
                    }
                }
                else if ("external-cache-path".equals(name)) {
                    final File[] j = d.j(context);
                    file2 = file;
                    if (j.length > 0) {
                        file2 = j[0];
                    }
                }
                else {
                    file2 = file;
                    if (Build$VERSION.SDK_INT >= 21) {
                        file2 = file;
                        if ("external-media-path".equals(name)) {
                            final File[] externalMediaDirs = context.getExternalMediaDirs();
                            file2 = file;
                            if (externalMediaDirs.length > 0) {
                                file2 = externalMediaDirs[0];
                            }
                        }
                    }
                }
                if (file2 == null) {
                    continue;
                }
                b.c(attributeValue, a(file2, attributeValue2));
            }
            return (a)b;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }
    
    public void attachInfo(@j0 final Context context, @j0 final ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (providerInfo.grantUriPermissions) {
            this.G = d(context, providerInfo.authority.split(";")[0]);
            return;
        }
        throw new SecurityException("Provider must grant uri permissions");
    }
    
    public int delete(@j0 final Uri uri, @k0 final String s, @k0 final String[] array) {
        return this.G.a(uri).delete() ? 1 : 0;
    }
    
    public String getType(@j0 final Uri uri) {
        final File a = this.G.a(uri);
        final int lastIndex = a.getName().lastIndexOf(46);
        if (lastIndex >= 0) {
            final String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndex + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }
    
    public Uri insert(@j0 final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }
    
    public boolean onCreate() {
        return true;
    }
    
    @SuppressLint({ "UnknownNullness" })
    public ParcelFileDescriptor openFile(@j0 final Uri uri, @j0 final String s) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.G.a(uri), g(s));
    }
    
    public Cursor query(@j0 final Uri uri, @k0 String[] c, @k0 String queryParameter, @k0 final String[] array, @k0 final String s) {
        final File a = this.G.a(uri);
        queryParameter = uri.getQueryParameter("displayName");
        String[] h = c;
        if (c == null) {
            h = FileProvider.H;
        }
        final String[] array2 = new String[h.length];
        final Object[] array3 = new Object[h.length];
        final int length = h.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final String s2 = h[i];
            int n4 = 0;
            Label_0162: {
                int n3;
                if ("_display_name".equals(s2)) {
                    array2[n] = "_display_name";
                    final int n2 = n + 1;
                    String name;
                    if (queryParameter == null) {
                        name = a.getName();
                    }
                    else {
                        name = queryParameter;
                    }
                    array3[n] = name;
                    n3 = n2;
                }
                else {
                    n4 = n;
                    if (!"_size".equals(s2)) {
                        break Label_0162;
                    }
                    array2[n] = "_size";
                    final int n5 = n + 1;
                    array3[n] = a.length();
                    n3 = n5;
                }
                n4 = n3;
            }
            ++i;
            n = n4;
        }
        c = c(array2, n);
        final Object[] b = b(array3, n);
        final MatrixCursor matrixCursor = new MatrixCursor(c, 1);
        matrixCursor.addRow(b);
        return (Cursor)matrixCursor;
    }
    
    public int update(@j0 final Uri uri, final ContentValues contentValues, @k0 final String s, @k0 final String[] array) {
        throw new UnsupportedOperationException("No external updates");
    }
    
    interface a
    {
        File a(final Uri p0);
        
        Uri b(final File p0);
    }
    
    static class b implements a
    {
        private final String a;
        private final HashMap<String, File> b;
        
        b(final String a) {
            this.b = new HashMap<String, File>();
            this.a = a;
        }
        
        @Override
        public File a(Uri uri) {
            final String encodedPath = uri.getEncodedPath();
            final int index = encodedPath.indexOf(47, 1);
            final String decode = Uri.decode(encodedPath.substring(1, index));
            final String decode2 = Uri.decode(encodedPath.substring(index + 1));
            final File parent = this.b.get(decode);
            if (parent != null) {
                uri = (Uri)new File(parent, decode2);
                try {
                    final File canonicalFile = ((File)uri).getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(parent.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
                catch (IOException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to resolve canonical path for ");
                    sb.append(uri);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to find configured root for ");
            sb2.append(uri);
            throw new IllegalArgumentException(sb2.toString());
        }
        
        @Override
        public Uri b(File string) {
            try {
                final String canonicalPath = string.getCanonicalPath();
                string = null;
                for (final Object o : this.b.entrySet()) {
                    final String path = ((Map.Entry<String, File>)o).getValue().getPath();
                    if (canonicalPath.startsWith(path) && (string == null || path.length() > ((Map.Entry<K, File>)string).getValue().getPath().length())) {
                        string = (File)o;
                    }
                }
                if (string != null) {
                    final String path2 = ((Map.Entry<K, File>)string).getValue().getPath();
                    final boolean endsWith = path2.endsWith("/");
                    int length = path2.length();
                    if (!endsWith) {
                        ++length;
                    }
                    final String substring = canonicalPath.substring(length);
                    final StringBuilder sb = new StringBuilder();
                    sb.append(Uri.encode((String)((Map.Entry<String, V>)string).getKey()));
                    sb.append('/');
                    sb.append(Uri.encode(substring, "/"));
                    string = (File)sb.toString();
                    return new Uri$Builder().scheme("content").authority(this.a).encodedPath((String)string).build();
                }
                string = (File)new StringBuilder();
                ((StringBuilder)string).append("Failed to find configured root that contains ");
                ((StringBuilder)string).append(canonicalPath);
                throw new IllegalArgumentException(((StringBuilder)string).toString());
            }
            catch (IOException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to resolve canonical path for ");
                sb2.append(string);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        
        void c(final String key, final File obj) {
            if (!TextUtils.isEmpty((CharSequence)key)) {
                try {
                    this.b.put(key, obj.getCanonicalFile());
                    return;
                }
                catch (IOException cause) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to resolve canonical path for ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString(), cause);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }
}
