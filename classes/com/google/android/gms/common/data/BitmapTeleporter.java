// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import android.os.Parcelable;
import h2.c;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import android.os.Parcel;
import java.util.Objects;
import androidx.annotation.RecentlyNullable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import android.graphics.Bitmap$Config;
import java.io.InputStream;
import java.io.DataInputStream;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import com.google.android.gms.common.internal.x;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import android.graphics.Bitmap;
import androidx.annotation.k0;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.a;

@b0
@f2.a
@h2.d.a(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends a implements ReflectedParcelable
{
    @RecentlyNonNull
    @f2.a
    public static final Parcelable$Creator<BitmapTeleporter> CREATOR;
    @g(id = 1)
    private final int G;
    @k0
    @c(id = 2)
    private ParcelFileDescriptor H;
    @c(id = 3)
    private final int I;
    @k0
    private Bitmap J;
    private boolean K;
    private File L;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    @b
    BitmapTeleporter(@e(id = 1) final int g, @e(id = 2) final ParcelFileDescriptor h, @e(id = 3) final int i) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = null;
        this.K = false;
    }
    
    @f2.a
    public BitmapTeleporter(@RecentlyNonNull final Bitmap j) {
        this.G = 1;
        this.H = null;
        this.I = 0;
        this.J = j;
        this.K = true;
    }
    
    private static void Q1(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (IOException ex) {
            Log.w("BitmapTeleporter", "Could not close stream", (Throwable)ex);
        }
    }
    
    private final FileOutputStream q1() {
        final File l = this.L;
        if (l != null) {
            try {
                final File tempFile = File.createTempFile("teleporter", ".tmp", l);
                try {
                    final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
                    this.H = ParcelFileDescriptor.open(tempFile, 268435456);
                    tempFile.delete();
                    return fileOutputStream;
                }
                catch (FileNotFoundException ex) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            }
            catch (IOException cause) {
                throw new IllegalStateException("Could not create temporary file", cause);
            }
        }
        throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
    }
    
    @RecentlyNullable
    @f2.a
    public Bitmap M() {
        if (!this.K) {
            Object wrap = new DataInputStream((InputStream)new ParcelFileDescriptor$AutoCloseInputStream((ParcelFileDescriptor)x.k(this.H)));
            try {
                try {
                    final byte[] array = new byte[((DataInputStream)wrap).readInt()];
                    final int int1 = ((DataInputStream)wrap).readInt();
                    final int int2 = ((DataInputStream)wrap).readInt();
                    final Bitmap$Config value = Bitmap$Config.valueOf(((DataInputStream)wrap).readUTF());
                    ((DataInputStream)wrap).read(array);
                    Q1((Closeable)wrap);
                    wrap = ByteBuffer.wrap(array);
                    final Bitmap bitmap = Bitmap.createBitmap(int1, int2, value);
                    bitmap.copyPixelsFromBuffer((Buffer)wrap);
                    this.J = bitmap;
                    this.K = true;
                }
                finally {}
            }
            catch (IOException cause) {
                throw new IllegalStateException("Could not read from parcel file descriptor", cause);
            }
            Q1((Closeable)wrap);
        }
        return this.J;
    }
    
    @f2.a
    public void g1(@RecentlyNonNull final File file) {
        Objects.requireNonNull(file, "Cannot set null temp directory");
        this.L = file;
    }
    
    @f2.a
    public void release() {
        if (!this.K) {
            try {
                x.k(this.H).close();
            }
            catch (IOException ex) {
                Log.w("BitmapTeleporter", "Could not close PFD", (Throwable)ex);
            }
        }
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        if (this.H == null) {
            final Bitmap bitmap = x.k(this.J);
            final ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer((Buffer)allocate);
            final byte[] array = allocate.array();
            final DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(this.q1()));
            try {
                try {
                    dataOutputStream.writeInt(array.length);
                    dataOutputStream.writeInt(bitmap.getWidth());
                    dataOutputStream.writeInt(bitmap.getHeight());
                    dataOutputStream.writeUTF(bitmap.getConfig().toString());
                    dataOutputStream.write(array);
                    Q1(dataOutputStream);
                }
                finally {}
            }
            catch (IOException cause) {
                throw new IllegalStateException("Could not write into unlinked file", cause);
            }
            Q1(dataOutputStream);
        }
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.S(parcel, 2, (Parcelable)this.H, n | 0x1, false);
        h2.c.F(parcel, 3, this.I);
        h2.c.b(parcel, a);
        this.H = null;
    }
}
