// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.os.ParcelFileDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import androidx.core.provider.f;
import androidx.annotation.j0;
import java.nio.MappedByteBuffer;
import android.content.ContentResolver;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.StrictMode$ThreadPolicy;
import android.util.Log;
import java.io.FileOutputStream;
import android.os.StrictMode;
import java.io.InputStream;
import androidx.annotation.p0;
import androidx.annotation.k0;
import java.io.File;
import java.nio.ByteBuffer;
import android.content.res.Resources;
import android.content.Context;
import java.io.IOException;
import java.io.Closeable;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class e0
{
    private static final String a = "TypefaceCompatUtil";
    private static final String b = ".font";
    
    private e0() {
    }
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    @k0
    @p0(19)
    public static ByteBuffer b(Context e, final Resources resources, final int n) {
        e = (Context)e(e);
        if (e == null) {
            return null;
        }
        try {
            if (!c((File)e, resources, n)) {
                return null;
            }
            return g((File)e);
        }
        finally {
            ((File)e).delete();
        }
    }
    
    public static boolean c(final File file, final Resources resources, final int n) {
        Closeable closeable;
        try {
            final InputStream openRawResource = resources.openRawResource(n);
            try {
                final boolean d = d(file, openRawResource);
                a(openRawResource);
                return d;
            }
            finally {}
        }
        finally {
            closeable = null;
        }
        a(closeable);
    }
    
    public static boolean d(final File file, final InputStream ex) {
        final StrictMode$ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        final Closeable closeable = null;
        Closeable closeable2 = null;
        Closeable closeable3;
        try {
            try {
                closeable2 = closeable2;
                final FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                try {
                    final byte[] array = new byte[1024];
                    while (true) {
                        final int read = ((InputStream)ex).read(array);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(array, 0, read);
                    }
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                catch (IOException ex) {}
                finally {
                    closeable2 = fileOutputStream;
                }
            }
            finally {}
        }
        catch (IOException ex) {
            closeable3 = closeable;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Error copying resource contents to temp file: ");
        sb.append(ex.getMessage());
        Log.e("TypefaceCompatUtil", sb.toString());
        a(closeable3);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
        return false;
        a(closeable2);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
    }
    
    @k0
    public static File e(Context cacheDir) {
        cacheDir = (Context)cacheDir.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        final String string = sb.toString();
        int i = 0;
    Label_0115_Outer:
        while (true) {
            Label_0121: {
                if (i >= 100) {
                    break Label_0121;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(i);
                final File file = new File((File)cacheDir, sb2.toString());
                while (true) {
                    try {
                        if (file.createNewFile()) {
                            return file;
                        }
                        ++i;
                        continue Label_0115_Outer;
                        return null;
                    }
                    catch (IOException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    @k0
    @p0(19)
    public static ByteBuffer f(Context openFileDescriptor, CancellationSignal cancellationSignal, final Uri uri) {
        final ContentResolver contentResolver = openFileDescriptor.getContentResolver();
        try {
            openFileDescriptor = (Context)contentResolver.openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                return null;
            }
            try {
                cancellationSignal = (CancellationSignal)new FileInputStream(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor());
                try {
                    final FileChannel channel = ((FileInputStream)cancellationSignal).getChannel();
                    final MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    ((FileInputStream)cancellationSignal).close();
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return map;
                }
                finally {
                    try {
                        ((FileInputStream)cancellationSignal).close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)uri).addSuppressed(exception);
                    }
                }
            }
            finally {
                try {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                finally {
                    final Throwable exception2;
                    ((Throwable)cancellationSignal).addSuppressed(exception2);
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    @k0
    @p0(19)
    private static ByteBuffer g(final File file) {
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                final FileChannel channel = fileInputStream.getChannel();
                final MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            }
            finally {
                try {
                    fileInputStream.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)file).addSuppressed(exception);
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    @j0
    @p0(19)
    @t0({ t0.a.G })
    public static Map<Uri, ByteBuffer> h(@j0 final Context context, @j0 final f.c[] array, @k0 final CancellationSignal cancellationSignal) {
        final HashMap<Uri, ByteBuffer> m = new HashMap<Uri, ByteBuffer>();
        for (final f.c c : array) {
            if (c.b() == 0) {
                final Uri d = c.d();
                if (!m.containsKey(d)) {
                    m.put(d, f(context, cancellationSignal, d));
                }
            }
        }
        return (Map<Uri, ByteBuffer>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
}
