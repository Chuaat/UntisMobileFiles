// 
// Decompiled by Procyon v0.5.36
// 

package androidx.multidex;

import java.io.InputStream;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.util.ArrayList;
import java.util.List;
import android.os.Build$VERSION;
import android.content.SharedPreferences;
import android.content.Context;
import java.io.FileNotFoundException;
import java.util.zip.ZipOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.FileFilter;
import java.io.IOException;
import android.util.Log;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.Closeable;

final class d implements Closeable
{
    private static final String M = "MultiDex";
    private static final String N = "classes";
    static final String O = ".dex";
    private static final String P = ".classes";
    static final String Q = ".zip";
    private static final int R = 3;
    private static final String S = "multidex.version";
    private static final String T = "timestamp";
    private static final String U = "crc";
    private static final String V = "dex.number";
    private static final String W = "dex.crc.";
    private static final String X = "dex.time.";
    private static final int Y = 16384;
    private static final long Z = -1L;
    private static final String a0 = "MultiDex.lock";
    private final File G;
    private final long H;
    private final File I;
    private final RandomAccessFile J;
    private final FileChannel K;
    private final FileLock L;
    
    d(File error, final File file) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(((File)error).getPath());
        sb.append(", ");
        sb.append(file.getPath());
        sb.append(")");
        Log.i("MultiDex", sb.toString());
        this.G = (File)error;
        this.I = file;
        this.H = f((File)error);
        error = (Error)new File(file, "MultiDex.lock");
        final RandomAccessFile j = new RandomAccessFile((File)error, "rw");
        this.J = j;
        try {
            final FileChannel channel = j.getChannel();
            this.K = channel;
            try {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(((File)error).getPath());
                Log.i("MultiDex", sb2.toString());
                this.L = channel.lock();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(((File)error).getPath());
                sb3.append(" locked");
                Log.i("MultiDex", sb3.toString());
                return;
            }
            catch (Error error) {}
            catch (RuntimeException error) {}
            catch (IOException ex) {}
            b(this.K);
            throw error;
        }
        catch (Error error) {}
        catch (RuntimeException error) {}
        catch (IOException ex2) {}
        b(this.J);
        throw error;
    }
    
    private void a() {
        final File[] listFiles = this.I.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.getName().equals("MultiDex.lock") ^ true;
            }
        });
        if (listFiles == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.I.getPath());
            sb.append(").");
            Log.w("MultiDex", sb.toString());
            return;
        }
        for (final File file : listFiles) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            Log.i("MultiDex", sb2.toString());
            if (!file.delete()) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file.getPath());
                Log.w("MultiDex", sb3.toString());
            }
            else {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file.getPath());
                Log.i("MultiDex", sb4.toString());
            }
        }
    }
    
    private static void b(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (IOException ex) {
            Log.w("MultiDex", "Failed to close resource", (Throwable)ex);
        }
    }
    
    private static void c(ZipFile inputStream, final ZipEntry entry, final File dest, String tempFile) throws IOException, FileNotFoundException {
        inputStream = (ZipFile)inputStream.getInputStream(entry);
        final StringBuilder sb = new StringBuilder();
        sb.append("tmp-");
        sb.append(tempFile);
        tempFile = (String)File.createTempFile(sb.toString(), ".zip", dest.getParentFile());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Extracting ");
        sb2.append(((File)tempFile).getPath());
        Log.i("MultiDex", sb2.toString());
        try {
            Object o = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream((File)tempFile)));
            try {
                final ZipEntry e = new ZipEntry("classes.dex");
                e.setTime(entry.getTime());
                ((ZipOutputStream)o).putNextEntry(e);
                final byte[] array = new byte[16384];
                while (true) {
                    final int read = ((InputStream)inputStream).read(array);
                    if (read == -1) {
                        break;
                    }
                    ((ZipOutputStream)o).write(array, 0, read);
                }
                ((ZipOutputStream)o).closeEntry();
                ((ZipOutputStream)o).close();
                if (!((File)tempFile).setReadOnly()) {
                    o = new StringBuilder();
                    ((StringBuilder)o).append("Failed to mark readonly \"");
                    ((StringBuilder)o).append(((File)tempFile).getAbsolutePath());
                    ((StringBuilder)o).append("\" (tmp of \"");
                    ((StringBuilder)o).append(dest.getAbsolutePath());
                    ((StringBuilder)o).append("\")");
                    throw new IOException(((StringBuilder)o).toString());
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Renaming to ");
                sb3.append(dest.getPath());
                Log.i("MultiDex", sb3.toString());
                if (((File)tempFile).renameTo(dest)) {
                    return;
                }
                o = new StringBuilder();
                ((StringBuilder)o).append("Failed to rename \"");
                ((StringBuilder)o).append(((File)tempFile).getAbsolutePath());
                ((StringBuilder)o).append("\" to \"");
                ((StringBuilder)o).append(dest.getAbsolutePath());
                ((StringBuilder)o).append("\"");
                throw new IOException(((StringBuilder)o).toString());
            }
            finally {
                ((ZipOutputStream)o).close();
            }
        }
        finally {
            b(inputStream);
            ((File)tempFile).delete();
        }
    }
    
    private static SharedPreferences d(final Context context) {
        int n;
        if (Build$VERSION.SDK_INT < 11) {
            n = 0;
        }
        else {
            n = 4;
        }
        return context.getSharedPreferences("multidex.version", n);
    }
    
    private static long e(final File file) {
        long lastModified;
        final long n = lastModified = file.lastModified();
        if (n == -1L) {
            lastModified = n - 1L;
        }
        return lastModified;
    }
    
    private static long f(final File file) throws IOException {
        long c;
        final long n = c = f.c(file);
        if (n == -1L) {
            c = n - 1L;
        }
        return c;
    }
    
    private static boolean g(final Context context, final File file, final long n, final String s) {
        final SharedPreferences d = d(context);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("timestamp");
        if (d.getLong(sb.toString(), -1L) == e(file)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append("crc");
            if (d.getLong(sb2.toString(), -1L) == n) {
                return false;
            }
        }
        return true;
    }
    
    private List<b> j(final Context context, final String s) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G.getName());
        sb.append(".classes");
        final String string = sb.toString();
        final SharedPreferences d = d(context);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append("dex.number");
        final int int1 = d.getInt(sb2.toString(), 1);
        final ArrayList list = new ArrayList<b>(int1 - 1);
        for (int i = 2; i <= int1; ++i) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(i);
            sb3.append(".zip");
            final b obj = new b(this.I, sb3.toString());
            if (!obj.isFile()) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Missing extracted secondary dex file '");
                sb4.append(obj.getPath());
                sb4.append("'");
                throw new IOException(sb4.toString());
            }
            obj.G = f(obj);
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(s);
            sb5.append("dex.crc.");
            sb5.append(i);
            final long long1 = d.getLong(sb5.toString(), -1L);
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(s);
            sb6.append("dex.time.");
            sb6.append(i);
            final long long2 = d.getLong(sb6.toString(), -1L);
            final long lastModified = obj.lastModified();
            if (long2 != lastModified || long1 != obj.G) {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("Invalid extracted dex: ");
                sb7.append(obj);
                sb7.append(" (key \"");
                sb7.append(s);
                sb7.append("\"), expected modification time: ");
                sb7.append(long2);
                sb7.append(", modification time: ");
                sb7.append(lastModified);
                sb7.append(", expected crc: ");
                sb7.append(long1);
                sb7.append(", file crc: ");
                sb7.append(obj.G);
                throw new IOException(sb7.toString());
            }
            list.add(obj);
        }
        return (List<b>)list;
    }
    
    private List<b> k() throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G.getName());
        sb.append(".classes");
        final String string = sb.toString();
        this.a();
        final ArrayList<b> list = new ArrayList<b>();
        final ZipFile zipFile = new ZipFile(this.G);
        try {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("classes");
            sb2.append(2);
            sb2.append(".dex");
            ZipEntry zipEntry = zipFile.getEntry(sb2.toString());
            int i = 2;
            while (zipEntry != null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(i);
                sb3.append(".zip");
                final b obj = new b(this.I, sb3.toString());
                list.add(obj);
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Extraction is needed for file ");
                sb4.append(obj);
                Log.i("MultiDex", sb4.toString());
                int n;
                int n2;
                for (n = 0, n2 = 0; n < 3 && n2 == 0; ++n) {
                    c(zipFile, zipEntry, obj, string);
                    try {
                        obj.G = f(obj);
                        n2 = 1;
                    }
                    catch (IOException ex) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Failed to read crc from ");
                        sb5.append(obj.getAbsolutePath());
                        Log.w("MultiDex", sb5.toString(), (Throwable)ex);
                        n2 = 0;
                    }
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("Extraction ");
                    String str;
                    if (n2 != 0) {
                        str = "succeeded";
                    }
                    else {
                        str = "failed";
                    }
                    sb6.append(str);
                    sb6.append(" '");
                    sb6.append(obj.getAbsolutePath());
                    sb6.append("': length ");
                    sb6.append(obj.length());
                    sb6.append(" - crc: ");
                    sb6.append(obj.G);
                    Log.i("MultiDex", sb6.toString());
                    if (n2 == 0) {
                        obj.delete();
                        if (obj.exists()) {
                            final StringBuilder sb7 = new StringBuilder();
                            sb7.append("Failed to delete corrupted secondary dex '");
                            sb7.append(obj.getPath());
                            sb7.append("'");
                            Log.w("MultiDex", sb7.toString());
                        }
                    }
                }
                if (n2 == 0) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append("Could not create zip file ");
                    sb8.append(obj.getAbsolutePath());
                    sb8.append(" for secondary dex (");
                    sb8.append(i);
                    sb8.append(")");
                    throw new IOException(sb8.toString());
                }
                ++i;
                final StringBuilder sb9 = new StringBuilder();
                sb9.append("classes");
                sb9.append(i);
                sb9.append(".dex");
                zipEntry = zipFile.getEntry(sb9.toString());
            }
            return list;
        }
        finally {
            try {
                zipFile.close();
            }
            catch (IOException ex2) {
                Log.w("MultiDex", "Failed to close resource", (Throwable)ex2);
            }
        }
    }
    
    private static void n(final Context context, final String str, final long n, final long n2, final List<b> list) {
        final SharedPreferences$Editor edit = d(context).edit();
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), n);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), n2);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        final Iterator<b> iterator = list.iterator();
        int n3 = 2;
        while (iterator.hasNext()) {
            final b b = iterator.next();
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(n3);
            edit.putLong(sb4.toString(), b.G);
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(n3);
            edit.putLong(sb5.toString(), b.lastModified());
            ++n3;
        }
        edit.commit();
    }
    
    @Override
    public void close() throws IOException {
        this.L.release();
        this.K.close();
        this.J.close();
    }
    
    List<? extends File> h(Context j, final String str, final boolean b) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.G.getPath());
        sb.append(", ");
        sb.append(b);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        Log.i("MultiDex", sb.toString());
        if (this.L.isValid()) {
            Label_0192: {
                Label_0165: {
                    if (!b && !g(j, this.G, this.H, str)) {
                        try {
                            j = (Context)this.j(j, str);
                            break Label_0192;
                        }
                        catch (IOException ex) {
                            Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", (Throwable)ex);
                            break Label_0165;
                        }
                    }
                    String s;
                    if (b) {
                        s = "Forced extraction must be performed.";
                    }
                    else {
                        s = "Detected that extraction must be performed.";
                    }
                    Log.i("MultiDex", s);
                }
                final Object k = this.k();
                n(j, str, e(this.G), this.H, (List<b>)k);
                j = (Context)k;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("load found ");
            sb2.append(((List)j).size());
            sb2.append(" secondary dex files");
            Log.i("MultiDex", sb2.toString());
            return (List<? extends File>)j;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
    
    private static class b extends File
    {
        public long G;
        
        public b(final File parent, final String child) {
            super(parent, child);
            this.G = -1L;
        }
    }
}
