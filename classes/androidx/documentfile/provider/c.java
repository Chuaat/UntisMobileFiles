// 
// Decompiled by Procyon v0.5.36
// 

package androidx.documentfile.provider;

import java.util.ArrayList;
import android.net.Uri;
import java.io.IOException;
import android.webkit.MimeTypeMap;
import android.util.Log;
import androidx.annotation.k0;
import java.io.File;

class c extends a
{
    private File c;
    
    c(@k0 final a a, final File c) {
        super(a);
        this.c = c;
    }
    
    private static boolean w(File obj) {
        final File[] listFiles = obj.listFiles();
        int n = 1;
        int n2 = 1;
        if (listFiles != null) {
            final int length = listFiles.length;
            int n3 = 0;
            while (true) {
                n = n2;
                if (n3 >= length) {
                    break;
                }
                obj = listFiles[n3];
                boolean b = n2 != 0;
                if (obj.isDirectory()) {
                    b = ((n2 & (w(obj) ? 1 : 0)) != 0x0);
                }
                n2 = (b ? 1 : 0);
                if (!obj.delete()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete ");
                    sb.append(obj);
                    Log.w("DocumentFile", sb.toString());
                    n2 = (false ? 1 : 0);
                }
                ++n3;
            }
        }
        return n != 0;
    }
    
    private static String x(String s) {
        final int lastIndex = s.lastIndexOf(46);
        if (lastIndex >= 0) {
            s = s.substring(lastIndex + 1).toLowerCase();
            s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
            if (s != null) {
                return s;
            }
        }
        return "application/octet-stream";
    }
    
    @Override
    public boolean a() {
        return this.c.canRead();
    }
    
    @Override
    public boolean b() {
        return this.c.canWrite();
    }
    
    @k0
    @Override
    public a c(final String child) {
        final File file = new File(this.c, child);
        if (!file.isDirectory() && !file.mkdir()) {
            return null;
        }
        return new c(this, file);
    }
    
    @k0
    @Override
    public a d(String string, final String str) {
        final String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(string);
        string = str;
        if (extensionFromMimeType != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(extensionFromMimeType);
            string = sb.toString();
        }
        final File file = new File(this.c, string);
        try {
            file.createNewFile();
            return new c(this, file);
        }
        catch (IOException obj) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to createFile: ");
            sb2.append(obj);
            Log.w("DocumentFile", sb2.toString());
            return null;
        }
    }
    
    @Override
    public boolean e() {
        w(this.c);
        return this.c.delete();
    }
    
    @Override
    public boolean f() {
        return this.c.exists();
    }
    
    @Override
    public String k() {
        return this.c.getName();
    }
    
    @k0
    @Override
    public String m() {
        if (this.c.isDirectory()) {
            return null;
        }
        return x(this.c.getName());
    }
    
    @Override
    public Uri n() {
        return Uri.fromFile(this.c);
    }
    
    @Override
    public boolean o() {
        return this.c.isDirectory();
    }
    
    @Override
    public boolean q() {
        return this.c.isFile();
    }
    
    @Override
    public boolean r() {
        return false;
    }
    
    @Override
    public long s() {
        return this.c.lastModified();
    }
    
    @Override
    public long t() {
        return this.c.length();
    }
    
    @Override
    public a[] u() {
        final ArrayList<c> list = new ArrayList<c>();
        final File[] listFiles = this.c.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                list.add(new c(this, listFiles[i]));
            }
        }
        return list.toArray(new a[list.size()]);
    }
    
    @Override
    public boolean v(final String child) {
        final File file = new File(this.c.getParentFile(), child);
        if (this.c.renameTo(file)) {
            this.c = file;
            return true;
        }
        return false;
    }
}
