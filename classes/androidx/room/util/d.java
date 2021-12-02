// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.Channels;
import android.os.Build$VERSION;
import java.nio.channels.FileChannel;
import androidx.annotation.j0;
import java.nio.channels.ReadableByteChannel;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class d
{
    private d() {
    }
    
    @SuppressLint({ "LambdaLast" })
    public static void a(@j0 final ReadableByteChannel ch, @j0 final FileChannel ch2) throws IOException {
        try {
            if (Build$VERSION.SDK_INT > 23) {
                ch2.transferFrom(ch, 0L, Long.MAX_VALUE);
            }
            else {
                final InputStream inputStream = Channels.newInputStream(ch);
                final OutputStream outputStream = Channels.newOutputStream(ch2);
                final byte[] array = new byte[4096];
                while (true) {
                    final int read = inputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    outputStream.write(array, 0, read);
                }
            }
            ch2.force(false);
        }
        finally {
            ch.close();
            ch2.close();
        }
    }
}
