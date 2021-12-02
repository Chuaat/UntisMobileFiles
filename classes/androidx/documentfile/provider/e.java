// 
// Decompiled by Procyon v0.5.36
// 

package androidx.documentfile.provider;

import android.database.Cursor;
import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import android.provider.DocumentsContract;
import androidx.annotation.k0;
import android.net.Uri;
import android.content.Context;
import androidx.annotation.p0;

@p0(21)
class e extends a
{
    private Context c;
    private Uri d;
    
    e(@k0 final a a, final Context c, final Uri d) {
        super(a);
        this.c = c;
        this.d = d;
    }
    
    private static void w(@k0 final AutoCloseable autoCloseable) {
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
    
    @k0
    private static Uri x(final Context context, final Uri uri, final String s, final String s2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, s, s2);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    @Override
    public boolean a() {
        return androidx.documentfile.provider.b.a(this.c, this.d);
    }
    
    @Override
    public boolean b() {
        return androidx.documentfile.provider.b.b(this.c, this.d);
    }
    
    @k0
    @Override
    public a c(final String s) {
        final Uri x = x(this.c, this.d, "vnd.android.document/directory", s);
        e e;
        if (x != null) {
            e = new e(this, this.c, x);
        }
        else {
            e = null;
        }
        return e;
    }
    
    @k0
    @Override
    public a d(final String s, final String s2) {
        final Uri x = x(this.c, this.d, s, s2);
        e e;
        if (x != null) {
            e = new e(this, this.c, x);
        }
        else {
            e = null;
        }
        return e;
    }
    
    @Override
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    @Override
    public boolean f() {
        return androidx.documentfile.provider.b.d(this.c, this.d);
    }
    
    @k0
    @Override
    public String k() {
        return androidx.documentfile.provider.b.f(this.c, this.d);
    }
    
    @k0
    @Override
    public String m() {
        return androidx.documentfile.provider.b.h(this.c, this.d);
    }
    
    @Override
    public Uri n() {
        return this.d;
    }
    
    @Override
    public boolean o() {
        return androidx.documentfile.provider.b.i(this.c, this.d);
    }
    
    @Override
    public boolean q() {
        return androidx.documentfile.provider.b.j(this.c, this.d);
    }
    
    @Override
    public boolean r() {
        return androidx.documentfile.provider.b.k(this.c, this.d);
    }
    
    @Override
    public long s() {
        return androidx.documentfile.provider.b.l(this.c, this.d);
    }
    
    @Override
    public long t() {
        return androidx.documentfile.provider.b.m(this.c, this.d);
    }
    
    @Override
    public a[] u() {
        final ContentResolver contentResolver = this.c.getContentResolver();
        final Uri d = this.d;
        final Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(d, DocumentsContract.getDocumentId(d));
        final ArrayList<Uri> list = new ArrayList<Uri>();
        int i = 0;
        Object o = null;
        while (true) {
            try {
                try {
                    final Cursor query = contentResolver.query(buildChildDocumentsUriUsingTree, new String[] { "document_id" }, (String)null, (String[])null, (String)null);
                    AutoCloseable autoCloseable;
                    while (true) {
                        autoCloseable = (AutoCloseable)query;
                        o = query;
                        if (!query.moveToNext()) {
                            break;
                        }
                        o = query;
                        final String string = query.getString(0);
                        o = query;
                        list.add(DocumentsContract.buildDocumentUriUsingTree(this.d, string));
                    }
                    w(autoCloseable);
                }
                finally {}
            }
            catch (Exception obj) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed query: ");
                sb.append(obj);
                final AutoCloseable autoCloseable2;
                o = autoCloseable2;
                Log.w("DocumentFile", sb.toString());
                final AutoCloseable autoCloseable = autoCloseable2;
                continue;
            }
            break;
        }
        final Uri[] array = list.toArray(new Uri[list.size()]);
        final a[] array2 = new a[array.length];
        while (i < array.length) {
            array2[i] = new e(this, this.c, array[i]);
            ++i;
        }
        return array2;
        w((AutoCloseable)o);
    }
    
    @Override
    public boolean v(final String s) {
        try {
            final Uri renameDocument = DocumentsContract.renameDocument(this.c.getContentResolver(), this.d, s);
            if (renameDocument != null) {
                this.d = renameDocument;
                return true;
            }
            return false;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
