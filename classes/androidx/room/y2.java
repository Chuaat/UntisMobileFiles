// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import android.util.Log;
import androidx.room.util.a;
import androidx.sqlite.db.framework.c;
import java.nio.channels.ReadableByteChannel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.io.File;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.content.Context;
import androidx.sqlite.db.d;

class y2 implements d, p0
{
    @j0
    private final Context G;
    @k0
    private final String H;
    @k0
    private final File I;
    @k0
    private final Callable<InputStream> J;
    private final int K;
    @j0
    private final d L;
    @k0
    private n0 M;
    private boolean N;
    
    y2(@j0 final Context g, @k0 final String h, @k0 final File i, @k0 final Callable<InputStream> j, final int k, @j0 final d l) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    private void a(final File dest, final boolean b) throws IOException {
    Label_0140_Outer:
        while (true) {
            Callable<InputStream> j = null;
            Block_3: {
                InputStream open;
                if (this.H != null) {
                    open = this.G.getAssets().open(this.H);
                }
                else {
                    if (this.I != null) {
                        final ReadableByteChannel readableByteChannel = new FileInputStream(this.I).getChannel();
                        break Label_0140_Outer;
                    }
                    j = this.J;
                    if (j != null) {
                        break Block_3;
                    }
                    throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
                }
                final ReadableByteChannel readableByteChannel = Channels.newChannel(open);
                break Label_0140_Outer;
            }
            try {
                final InputStream open = j.call();
                continue Label_0140_Outer;
                final StringBuilder sb;
                Label_0193: {
                    sb = new StringBuilder();
                }
                sb.append("Failed to move intermediate file (");
                File tempFile = null;
                sb.append(tempFile.getAbsolutePath());
                sb.append(") to destination (");
                sb.append(dest.getAbsolutePath());
                sb.append(").");
                throw new IOException(sb.toString());
                while (true) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to create directories for ");
                    sb2.append(dest.getAbsolutePath());
                    throw new IOException(sb2.toString());
                    Label_0176:
                    this.c(tempFile, b);
                    return;
                    tempFile = File.createTempFile("room-copy-helper", ".tmp", this.G.getCacheDir());
                    tempFile.deleteOnExit();
                    final ReadableByteChannel readableByteChannel;
                    androidx.room.util.d.a(readableByteChannel, new FileOutputStream(tempFile).getChannel());
                    final File parentFile = dest.getParentFile();
                    continue;
                }
            }
            // iftrue(Label_0193:, !tempFile.renameTo(dest))
            // iftrue(Label_0176:, parentFile == null || parentFile.exists() || parentFile.mkdirs())
            catch (Exception cause) {
                throw new IOException("inputStreamCallable exception on call", cause);
            }
            break;
        }
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }
    
    private d b(final File file) {
        final String name = file.getName();
        try {
            return new androidx.sqlite.db.framework.c().a(b.a(this.G).c(name).b(new d.a(androidx.room.util.c.e(file)) {
                @Override
                public void d(@j0 final androidx.sqlite.db.c c) {
                }
                
                @Override
                public void g(@j0 final androidx.sqlite.db.c c, final int n, final int n2) {
                }
            }).a());
        }
        catch (IOException cause) {
            throw new RuntimeException("Malformed database file, unable to read version.", cause);
        }
    }
    
    private void c(final File file, final boolean b) {
        final n0 m = this.M;
        if (m != null) {
            if (m.f != null) {
                final d b2 = this.b(file);
                Label_0039: {
                    if (!b) {
                        break Label_0039;
                    }
                    try {
                        androidx.sqlite.db.c c = b2.T2();
                        while (true) {
                            this.M.f.a(c);
                            return;
                            c = b2.E2();
                            continue;
                        }
                    }
                    finally {
                        b2.close();
                    }
                }
            }
        }
    }
    
    private void e(final boolean b) {
        final String databaseName = this.getDatabaseName();
        final File databasePath = this.G.getDatabasePath(databaseName);
        final n0 m = this.M;
        final a a = new a(databaseName, this.G.getFilesDir(), m == null || m.l);
        try {
            a.b();
            if (!databasePath.exists()) {
                try {
                    this.a(databasePath, b);
                    return;
                }
                catch (IOException cause) {
                    throw new RuntimeException("Unable to copy database file.", cause);
                }
            }
            if (this.M == null) {
                return;
            }
            try {
                final int e = androidx.room.util.c.e(databasePath);
                final int k = this.K;
                if (e == k) {
                    return;
                }
                if (this.M.a(e, k)) {
                    return;
                }
                if (this.G.deleteDatabase(databaseName)) {
                    try {
                        this.a(databasePath, b);
                    }
                    catch (IOException ex) {
                        Log.w("ROOM", "Unable to copy database file.", (Throwable)ex);
                    }
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete database file (");
                    sb.append(databaseName);
                    sb.append(") for a copy destructive migration.");
                    Log.w("ROOM", sb.toString());
                }
            }
            catch (IOException ex2) {
                Log.w("ROOM", "Unable to read database version.", (Throwable)ex2);
            }
        }
        finally {
            a.c();
        }
    }
    
    @Override
    public androidx.sqlite.db.c E2() {
        synchronized (this) {
            if (!this.N) {
                this.e(false);
                this.N = true;
            }
            return this.L.E2();
        }
    }
    
    @Override
    public androidx.sqlite.db.c T2() {
        synchronized (this) {
            if (!this.N) {
                this.e(true);
                this.N = true;
            }
            return this.L.T2();
        }
    }
    
    @Override
    public void close() {
        synchronized (this) {
            this.L.close();
            this.N = false;
        }
    }
    
    void d(@k0 final n0 m) {
        this.M = m;
    }
    
    @j0
    @Override
    public d f() {
        return this.L;
    }
    
    @Override
    public String getDatabaseName() {
        return this.L.getDatabaseName();
    }
    
    @androidx.annotation.p0(api = 16)
    @Override
    public void setWriteAheadLoggingEnabled(final boolean writeAheadLoggingEnabled) {
        this.L.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
}
