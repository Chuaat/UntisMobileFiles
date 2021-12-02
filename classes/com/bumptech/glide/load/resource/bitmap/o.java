// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import java.io.InputStream;
import com.bumptech.glide.util.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import androidx.annotation.j0;
import java.io.IOException;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.nio.charset.Charset;
import com.bumptech.glide.load.ImageHeaderParser;

public final class o implements ImageHeaderParser
{
    private static final String b = "DfltImageHeaderParser";
    private static final int c = 4671814;
    private static final int d = -1991225785;
    static final int e = 65496;
    private static final int f = 19789;
    private static final int g = 18761;
    private static final String h = "Exif\u0000\u0000";
    static final byte[] i;
    private static final int j = 218;
    private static final int k = 217;
    static final int l = 255;
    static final int m = 225;
    private static final int n = 274;
    private static final int[] o;
    private static final int p = 1380533830;
    private static final int q = 1464156752;
    private static final int r = 1448097792;
    private static final int s = -256;
    private static final int t = 255;
    private static final int u = 88;
    private static final int v = 76;
    private static final int w = 16;
    private static final int x = 8;
    
    static {
        i = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        o = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
    }
    
    private static int e(final int n, final int n2) {
        return n + 2 + n2 * 12;
    }
    
    private int f(final c c, final com.bumptech.glide.load.engine.bitmap_recycle.b b) throws IOException {
        try {
            final int a = c.a();
            if (!h(a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(a);
                    Log.d("DfltImageHeaderParser", sb.toString());
                }
                return -1;
            }
            final int j = this.j(c);
            if (j == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            final byte[] array = b.f(j, byte[].class);
            try {
                return this.l(c, array, j);
            }
            finally {
                b.d(array);
            }
        }
        catch (c.a a2) {
            return -1;
        }
    }
    
    @j0
    private ImageType g(final c c) throws IOException {
        try {
            final int a = c.a();
            if (a == 65496) {
                return ImageType.JPEG;
            }
            final int n = a << 8 | c.c();
            if (n == 4671814) {
                return ImageType.GIF;
            }
            final int n2 = n << 8 | c.c();
            if (n2 == -1991225785) {
                c.skip(21L);
                try {
                    ImageType imageType;
                    if (c.c() >= 3) {
                        imageType = ImageType.PNG_A;
                    }
                    else {
                        imageType = ImageType.PNG;
                    }
                    return imageType;
                }
                catch (c.a a2) {
                    return ImageType.PNG;
                }
            }
            if (n2 != 1380533830) {
                return ImageType.UNKNOWN;
            }
            c.skip(4L);
            if ((c.a() << 16 | c.a()) != 0x57454250) {
                return ImageType.UNKNOWN;
            }
            final int n3 = c.a() << 16 | c.a();
            if ((n3 & 0xFFFFFF00) != 0x56503800) {
                return ImageType.UNKNOWN;
            }
            final int n4 = n3 & 0xFF;
            if (n4 == 88) {
                c.skip(4L);
                ImageType imageType2;
                if ((c.c() & 0x10) != 0x0) {
                    imageType2 = ImageType.WEBP_A;
                }
                else {
                    imageType2 = ImageType.WEBP;
                }
                return imageType2;
            }
            if (n4 == 76) {
                c.skip(4L);
                ImageType imageType3;
                if ((c.c() & 0x8) != 0x0) {
                    imageType3 = ImageType.WEBP_A;
                }
                else {
                    imageType3 = ImageType.WEBP;
                }
                return imageType3;
            }
            return ImageType.WEBP;
        }
        catch (c.a a3) {
            return ImageType.UNKNOWN;
        }
    }
    
    private static boolean h(final int n) {
        return (n & 0xFFD8) == 0xFFD8 || n == 19789 || n == 18761;
    }
    
    private boolean i(final byte[] array, int n) {
        final boolean b = false;
        boolean b2 = array != null && n > com.bumptech.glide.load.resource.bitmap.o.i.length;
        if (b2) {
            n = 0;
            while (true) {
                final byte[] i = com.bumptech.glide.load.resource.bitmap.o.i;
                if (n >= i.length) {
                    break;
                }
                if (array[n] != i[n]) {
                    b2 = b;
                    break;
                }
                ++n;
            }
        }
        return b2;
    }
    
    private int j(final c c) throws IOException {
        long skip;
        long n;
        short c3;
        int i;
        do {
            final short c2 = c.c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c2);
                    Log.d("DfltImageHeaderParser", sb.toString());
                }
                return -1;
            }
            c3 = c.c();
            if (c3 == 218) {
                return -1;
            }
            if (c3 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            i = c.a() - 2;
            if (c3 == 225) {
                return i;
            }
            n = i;
            skip = c.skip(n);
        } while (skip == n);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(c3);
            sb2.append(", wanted to skip: ");
            sb2.append(i);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
            Log.d("DfltImageHeaderParser", sb2.toString());
        }
        return -1;
    }
    
    private static int k(final b b) {
        final short a = b.a(6);
        ByteOrder byteOrder;
        if (a != 18761) {
            if (a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        b.e(byteOrder);
        final int n = b.b(10) + 6;
        for (short a2 = b.a(n), i = 0; i < a2; ++i) {
            final int e = e(n, i);
            final short a3 = b.a(e);
            if (a3 == 274) {
                final short a4 = b.a(e + 2);
                String s = null;
                Label_0485: {
                    StringBuilder sb3 = null;
                    Label_0480: {
                        String str;
                        if (a4 >= 1 && a4 <= 12) {
                            final int b2 = b.b(e + 4);
                            if (b2 < 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    s = "Negative tiff component count";
                                    break Label_0485;
                                }
                                continue;
                            }
                            else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Got tagIndex=");
                                    sb2.append(i);
                                    sb2.append(" tagType=");
                                    sb2.append(a3);
                                    sb2.append(" formatCode=");
                                    sb2.append(a4);
                                    sb2.append(" componentCount=");
                                    sb2.append(b2);
                                    Log.d("DfltImageHeaderParser", sb2.toString());
                                }
                                final int n2 = b2 + com.bumptech.glide.load.resource.bitmap.o.o[a4];
                                if (n2 > 4) {
                                    if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        continue;
                                    }
                                    sb3 = new StringBuilder();
                                    str = "Got byte count > 4, not orientation, continuing, formatCode=";
                                }
                                else {
                                    final int j = e + 8;
                                    if (j >= 0 && j <= b.d()) {
                                        if (n2 >= 0 && n2 + j <= b.d()) {
                                            return b.a(j);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            sb3 = new StringBuilder();
                                            sb3.append("Illegal number of bytes for TI tag data tagType=");
                                            sb3.append(a3);
                                            break Label_0480;
                                        }
                                        continue;
                                    }
                                    else {
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            final StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Illegal tagValueOffset=");
                                            sb4.append(j);
                                            sb4.append(" tagType=");
                                            sb4.append(a3);
                                            s = sb4.toString();
                                            break Label_0485;
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                        else {
                            if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                                continue;
                            }
                            sb3 = new StringBuilder();
                            str = "Got invalid format code = ";
                        }
                        sb3.append(str);
                        sb3.append(a4);
                    }
                    s = sb3.toString();
                }
                Log.d("DfltImageHeaderParser", s);
            }
        }
        return -1;
    }
    
    private int l(final c c, final byte[] array, final int i) throws IOException {
        final int b = c.b(array, i);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(b);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            return -1;
        }
        if (this.i(array, i)) {
            return k(new b(array, i));
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
    
    @j0
    @Override
    public ImageType a(@j0 final ByteBuffer byteBuffer) throws IOException {
        return this.g((c)new a(com.bumptech.glide.util.k.d(byteBuffer)));
    }
    
    @Override
    public int b(@j0 final ByteBuffer byteBuffer, @j0 final com.bumptech.glide.load.engine.bitmap_recycle.b b) throws IOException {
        return this.f((c)new a(com.bumptech.glide.util.k.d(byteBuffer)), com.bumptech.glide.util.k.d(b));
    }
    
    @j0
    @Override
    public ImageType c(@j0 final InputStream inputStream) throws IOException {
        return this.g((c)new d(com.bumptech.glide.util.k.d(inputStream)));
    }
    
    @Override
    public int d(@j0 final InputStream inputStream, @j0 final com.bumptech.glide.load.engine.bitmap_recycle.b b) throws IOException {
        return this.f((c)new d(com.bumptech.glide.util.k.d(inputStream)), com.bumptech.glide.util.k.d(b));
    }
    
    private static final class a implements c
    {
        private final ByteBuffer a;
        
        a(final ByteBuffer a) {
            (this.a = a).order(ByteOrder.BIG_ENDIAN);
        }
        
        @Override
        public int a() throws c.a {
            return this.c() << 8 | this.c();
        }
        
        @Override
        public int b(final byte[] dst, int min) {
            min = Math.min(min, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(dst, 0, min);
            return min;
        }
        
        @Override
        public short c() throws c.a {
            if (this.a.remaining() >= 1) {
                return (short)(this.a.get() & 0xFF);
            }
            throw new c.a();
        }
        
        @Override
        public long skip(final long b) {
            final int n = (int)Math.min(this.a.remaining(), b);
            final ByteBuffer a = this.a;
            a.position(a.position() + n);
            return n;
        }
    }
    
    private static final class b
    {
        private final ByteBuffer a;
        
        b(final byte[] array, final int n) {
            this.a = (ByteBuffer)ByteBuffer.wrap(array).order(ByteOrder.BIG_ENDIAN).limit(n);
        }
        
        private boolean c(final int n, final int n2) {
            return this.a.remaining() - n >= n2;
        }
        
        short a(int n) {
            short short1;
            if (this.c(n, 2)) {
                n = (short1 = this.a.getShort(n));
            }
            else {
                n = (short1 = -1);
            }
            return short1;
        }
        
        int b(int int1) {
            if (this.c(int1, 4)) {
                int1 = this.a.getInt(int1);
            }
            else {
                int1 = -1;
            }
            return int1;
        }
        
        int d() {
            return this.a.remaining();
        }
        
        void e(final ByteOrder bo) {
            this.a.order(bo);
        }
    }
    
    private interface c
    {
        int a() throws IOException;
        
        int b(final byte[] p0, final int p1) throws IOException;
        
        short c() throws IOException;
        
        long skip(final long p0) throws IOException;
        
        public static final class a extends IOException
        {
            private static final long G = 1L;
            
            a() {
                super("Unexpectedly reached end of a file");
            }
        }
    }
    
    private static final class d implements c
    {
        private final InputStream a;
        
        d(final InputStream a) {
            this.a = a;
        }
        
        @Override
        public int a() throws IOException {
            return this.c() << 8 | this.c();
        }
        
        @Override
        public int b(final byte[] b, final int n) throws IOException {
            int off = 0;
            int read = 0;
            int n2;
            while (true) {
                n2 = read;
                if (off >= n) {
                    break;
                }
                read = this.a.read(b, off, n - off);
                if ((n2 = read) == -1) {
                    break;
                }
                off += read;
            }
            if (off == 0 && n2 == -1) {
                throw new c.a();
            }
            return off;
        }
        
        @Override
        public short c() throws IOException {
            final int read = this.a.read();
            if (read != -1) {
                return (short)read;
            }
            throw new c.a();
        }
        
        @Override
        public long skip(final long n) throws IOException {
            if (n < 0L) {
                return 0L;
            }
            long n2;
            long skip;
            for (n2 = n; n2 > 0L; n2 -= skip) {
                skip = this.a.skip(n2);
                if (skip <= 0L) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1L;
                }
            }
            return n - n2;
        }
    }
}
