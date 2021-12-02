// 
// Decompiled by Procyon v0.5.36
// 

package androidx.documentfile.provider;

import android.database.Cursor;
import android.provider.DocumentsContract;
import android.content.ContentResolver;
import android.util.Log;
import androidx.annotation.k0;
import android.text.TextUtils;
import android.net.Uri;
import android.content.Context;
import androidx.annotation.p0;

@p0(19)
class b
{
    private static final String a = "DocumentFile";
    private static final int b = 512;
    
    private b() {
    }
    
    public static boolean a(final Context context, final Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty((CharSequence)g(context, uri));
    }
    
    public static boolean b(final Context context, final Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        final String g = g(context, uri);
        final int n = n(context, uri, "flags", 0);
        return !TextUtils.isEmpty((CharSequence)g) && ((n & 0x4) != 0x0 || ("vnd.android.document/directory".equals(g) && (n & 0x8) != 0x0) || (!TextUtils.isEmpty((CharSequence)g) && (n & 0x2) != 0x0));
    }
    
    private static void c(@k0 final AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            goto Label_0016;
        }
        try {
            autoCloseable.close();
            goto Label_0016;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {
            goto Label_0016;
        }
    }
    
    public static boolean d(Context query, final Uri uri) {
        final ContentResolver contentResolver = query.getContentResolver();
        boolean b = false;
        Object o = null;
        query = null;
        try {
            try {
                final Context context = (Context)(o = (query = (Context)contentResolver.query(uri, new String[] { "document_id" }, (String)null, (String[])null, (String)null)));
                if (((Cursor)context).getCount() > 0) {
                    b = true;
                }
                c((AutoCloseable)context);
                return b;
            }
            finally {}
        }
        catch (Exception obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(obj);
            Log.w("DocumentFile", sb.toString());
            c((AutoCloseable)o);
            return false;
        }
        c((AutoCloseable)query);
    }
    
    public static long e(final Context context, final Uri uri) {
        return o(context, uri, "flags", 0L);
    }
    
    @k0
    public static String f(final Context context, final Uri uri) {
        return p(context, uri, "_display_name", null);
    }
    
    @k0
    private static String g(final Context context, final Uri uri) {
        return p(context, uri, "mime_type", null);
    }
    
    @k0
    public static String h(final Context context, final Uri uri) {
        String g;
        if ("vnd.android.document/directory".equals(g = g(context, uri))) {
            g = null;
        }
        return g;
    }
    
    public static boolean i(final Context context, final Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }
    
    public static boolean j(final Context context, final Uri uri) {
        final String g = g(context, uri);
        return !"vnd.android.document/directory".equals(g) && !TextUtils.isEmpty((CharSequence)g);
    }
    
    public static boolean k(final Context context, final Uri uri) {
        final boolean documentUri = DocumentsContract.isDocumentUri(context, uri);
        boolean b = false;
        if (!documentUri) {
            return false;
        }
        if ((e(context, uri) & 0x200L) != 0x0L) {
            b = true;
        }
        return b;
    }
    
    public static long l(final Context context, final Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }
    
    public static long m(final Context context, final Uri uri) {
        return o(context, uri, "_size", 0L);
    }
    
    private static int n(final Context context, final Uri uri, final String s, final int n) {
        return (int)o(context, uri, s, n);
    }
    
    private static long o(Context query, final Uri uri, final String s, final long n) {
        final ContentResolver contentResolver = query.getContentResolver();
        Object o = null;
        query = null;
        try {
            try {
                final Object o2 = o = (query = (Context)contentResolver.query(uri, new String[] { s }, (String)null, (String[])null, (String)null));
                if (((Cursor)o2).moveToFirst()) {
                    query = (Context)o2;
                    o = o2;
                    if (!((Cursor)o2).isNull(0)) {
                        query = (Context)o2;
                        o = o2;
                        final long long1 = ((Cursor)o2).getLong(0);
                        c((AutoCloseable)o2);
                        return long1;
                    }
                }
                c((AutoCloseable)o2);
                return n;
            }
            finally {}
        }
        catch (Exception obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(obj);
            Log.w("DocumentFile", sb.toString());
            c((AutoCloseable)o);
            return n;
        }
        c((AutoCloseable)query);
    }
    
    @k0
    private static String p(Context query, final Uri uri, String string, @k0 final String s) {
        final ContentResolver contentResolver = query.getContentResolver();
        Object o = null;
        query = null;
        try {
            try {
                final Object o2 = o = (query = (Context)contentResolver.query(uri, new String[] { string }, (String)null, (String[])null, (String)null));
                if (((Cursor)o2).moveToFirst()) {
                    query = (Context)o2;
                    o = o2;
                    if (!((Cursor)o2).isNull(0)) {
                        query = (Context)o2;
                        o = o2;
                        string = ((Cursor)o2).getString(0);
                        c((AutoCloseable)o2);
                        return string;
                    }
                }
                c((AutoCloseable)o2);
                return s;
            }
            finally {}
        }
        catch (Exception obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(obj);
            Log.w("DocumentFile", sb.toString());
            c((AutoCloseable)o);
            return s;
        }
        c((AutoCloseable)query);
    }
}
