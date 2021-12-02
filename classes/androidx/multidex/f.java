// 
// Decompiled by Procyon v0.5.36
// 

package androidx.multidex;

import java.io.File;
import java.util.zip.ZipException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.io.RandomAccessFile;

final class f
{
    private static final int a = 22;
    private static final int b = 101010256;
    private static final int c = 16384;
    
    static long a(final RandomAccessFile randomAccessFile, final a a) throws IOException {
        final CRC32 crc32 = new CRC32();
        long b = a.b;
        randomAccessFile.seek(a.a);
        int len = (int)Math.min(16384L, b);
        final byte[] array = new byte[16384];
        while (true) {
            final int read = randomAccessFile.read(array, 0, len);
            if (read == -1) {
                break;
            }
            crc32.update(array, 0, read);
            b -= read;
            if (b == 0L) {
                break;
            }
            len = (int)Math.min(16384L, b);
        }
        return crc32.getValue();
    }
    
    static a b(final RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long pos = randomAccessFile.length() - 22L;
        long n = 0L;
        if (pos < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("File too short to be a zip file: ");
            sb.append(randomAccessFile.length());
            throw new ZipException(sb.toString());
        }
        final long n2 = pos - 65536L;
        if (n2 >= 0L) {
            n = n2;
        }
        final int reverseBytes = Integer.reverseBytes(101010256);
        while (true) {
            randomAccessFile.seek(pos);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                final a a = new a();
                a.b = ((long)Integer.reverseBytes(randomAccessFile.readInt()) & 0xFFFFFFFFL);
                a.a = ((long)Integer.reverseBytes(randomAccessFile.readInt()) & 0xFFFFFFFFL);
                return a;
            }
            --pos;
            if (pos >= n) {
                continue;
            }
            throw new ZipException("End Of Central Directory signature not found");
        }
    }
    
    static long c(final File file) throws IOException {
        final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        }
        finally {
            randomAccessFile.close();
        }
    }
    
    static class a
    {
        long a;
        long b;
    }
}
