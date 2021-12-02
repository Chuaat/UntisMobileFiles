// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.f;
import com.bumptech.glide.load.engine.v;
import androidx.annotation.j0;
import java.io.IOException;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import java.io.InputStream;
import com.bumptech.glide.load.l;

public class j implements l<InputStream, c>
{
    private static final String d = "StreamGifDecoder";
    private final List<ImageHeaderParser> a;
    private final l<ByteBuffer, c> b;
    private final b c;
    
    public j(final List<ImageHeaderParser> a, final l<ByteBuffer, c> b, final b c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static byte[] e(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            final byte[] array = new byte[16384];
            while (true) {
                final int read = inputStream.read(array);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(array, 0, read);
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", (Throwable)ex);
            }
            return null;
        }
    }
    
    public v<c> c(@j0 final InputStream inputStream, final int n, final int n2, @j0 final com.bumptech.glide.load.j j) throws IOException {
        final byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(e), n, n2, j);
    }
    
    public boolean d(@j0 final InputStream inputStream, @j0 final com.bumptech.glide.load.j j) throws IOException {
        return !j.c(i.b) && f.e(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
