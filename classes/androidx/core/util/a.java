// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import androidx.annotation.k0;
import java.io.IOException;
import java.io.FileOutputStream;
import android.util.Log;
import androidx.annotation.j0;
import java.io.File;

public class a
{
    private static final String d = "AtomicFile";
    private final File a;
    private final File b;
    private final File c;
    
    public a(@j0 final File a) {
        this.a = a;
        final StringBuilder sb = new StringBuilder();
        sb.append(a.getPath());
        sb.append(".new");
        this.b = new File(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(a.getPath());
        sb2.append(".bak");
        this.c = new File(sb2.toString());
    }
    
    private static void g(@j0 final File obj, @j0 final File obj2) {
        if (obj2.isDirectory() && !obj2.delete()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete file which is a directory ");
            sb.append(obj2);
            Log.e("AtomicFile", sb.toString());
        }
        if (!obj.renameTo(obj2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to rename ");
            sb2.append(obj);
            sb2.append(" to ");
            sb2.append(obj2);
            Log.e("AtomicFile", sb2.toString());
        }
    }
    
    private static boolean i(@j0 final FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public void a() {
        this.a.delete();
        this.b.delete();
        this.c.delete();
    }
    
    public void b(@k0 final FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        }
        catch (IOException ex) {
            Log.e("AtomicFile", "Failed to close file output stream", (Throwable)ex);
        }
        if (!this.b.delete()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete new file ");
            sb.append(this.b);
            Log.e("AtomicFile", sb.toString());
        }
    }
    
    public void c(@k0 final FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        }
        catch (IOException ex) {
            Log.e("AtomicFile", "Failed to close file output stream", (Throwable)ex);
        }
        g(this.b, this.a);
    }
    
    @j0
    public File d() {
        return this.a;
    }
    
    @j0
    public FileInputStream e() throws FileNotFoundException {
        if (this.c.exists()) {
            g(this.c, this.a);
        }
        if (this.b.exists() && this.a.exists() && !this.b.delete()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete outdated new file ");
            sb.append(this.b);
            Log.e("AtomicFile", sb.toString());
        }
        return new FileInputStream(this.a);
    }
    
    @j0
    public byte[] f() throws IOException {
        final FileInputStream e = this.e();
        try {
            byte[] b = new byte[e.available()];
            int off = 0;
            while (true) {
                final int read = e.read(b, off, b.length - off);
                if (read <= 0) {
                    break;
                }
                final int n = off + read;
                final int available = e.available();
                off = n;
                if (available <= b.length - n) {
                    continue;
                }
                final byte[] array = new byte[available + n];
                System.arraycopy(b, 0, array, 0, n);
                b = array;
                off = n;
            }
            return b;
        }
        finally {
            e.close();
        }
    }
    
    @j0
    public FileOutputStream h() throws IOException {
        if (this.c.exists()) {
            g(this.c, this.a);
        }
        try {
            return new FileOutputStream(this.b);
        }
        catch (FileNotFoundException ex) {
            if (this.b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.b);
                }
                catch (FileNotFoundException cause) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to create new file ");
                    sb.append(this.b);
                    throw new IOException(sb.toString(), cause);
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to create directory for ");
            sb2.append(this.b);
            throw new IOException(sb2.toString());
        }
    }
}
