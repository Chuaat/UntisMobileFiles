// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.io.IOException;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.File;
import android.database.AbstractWindowedCursor;
import androidx.annotation.j0;
import android.database.Cursor;
import androidx.sqlite.db.f;
import androidx.room.r2;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.os.CancellationSignal;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class c
{
    private c() {
    }
    
    @k0
    public static CancellationSignal a() {
        if (Build$VERSION.SDK_INT >= 16) {
            return new CancellationSignal();
        }
        return null;
    }
    
    public static void b(final androidx.sqlite.db.c c) {
        final ArrayList<String> list = new ArrayList<String>();
        Object w2 = c.W2("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            while (((Cursor)w2).moveToNext()) {
                list.add(((Cursor)w2).getString(0));
            }
            ((Cursor)w2).close();
            for (final String str : list) {
                if (str.startsWith("room_fts_content_sync_")) {
                    w2 = new StringBuilder();
                    ((StringBuilder)w2).append("DROP TRIGGER IF EXISTS ");
                    ((StringBuilder)w2).append(str);
                    c.J0(((StringBuilder)w2).toString());
                }
            }
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    @Deprecated
    @j0
    public static Cursor c(final r2 r2, final f f, final boolean b) {
        return d(r2, f, b, null);
    }
    
    @j0
    public static Cursor d(@j0 final r2 r2, @j0 final f f, final boolean b, @k0 final CancellationSignal cancellationSignal) {
        Cursor cursor2;
        final Cursor cursor = cursor2 = r2.E(f, cancellationSignal);
        if (b) {
            cursor2 = cursor;
            if (cursor instanceof AbstractWindowedCursor) {
                final AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor)cursor;
                final int count = abstractWindowedCursor.getCount();
                int numRows;
                if (abstractWindowedCursor.hasWindow()) {
                    numRows = abstractWindowedCursor.getWindow().getNumRows();
                }
                else {
                    numRows = count;
                }
                if (Build$VERSION.SDK_INT >= 23) {
                    cursor2 = cursor;
                    if (numRows >= count) {
                        return cursor2;
                    }
                }
                cursor2 = b.a((Cursor)abstractWindowedCursor);
            }
        }
        return cursor2;
    }
    
    public static int e(@j0 final File file) throws IOException {
        AbstractInterruptibleChannel channel;
        final AbstractInterruptibleChannel abstractInterruptibleChannel = channel = null;
        try {
            final ByteBuffer allocate = ByteBuffer.allocate(4);
            channel = abstractInterruptibleChannel;
            channel = abstractInterruptibleChannel;
            final FileInputStream fileInputStream = new FileInputStream(file);
            channel = abstractInterruptibleChannel;
            final FileChannel fileChannel = (FileChannel)(channel = fileInputStream.getChannel());
            fileChannel.tryLock(60L, 4L, true);
            channel = fileChannel;
            fileChannel.position(60L);
            channel = fileChannel;
            if (fileChannel.read(allocate) == 4) {
                channel = fileChannel;
                allocate.rewind();
                channel = fileChannel;
                final int int1 = allocate.getInt();
                fileChannel.close();
                return int1;
            }
            channel = fileChannel;
            channel = fileChannel;
            final IOException ex = new IOException("Bad database header, unable to read 4 bytes at offset 60");
            channel = fileChannel;
            throw ex;
        }
        finally {
            if (channel != null) {
                channel.close();
            }
        }
    }
}
