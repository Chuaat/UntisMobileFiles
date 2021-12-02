// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.gifdecoder;

import java.util.Iterator;
import java.nio.ByteOrder;
import java.io.IOException;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import androidx.annotation.j0;
import android.graphics.Bitmap$Config;
import androidx.annotation.k0;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import androidx.annotation.l;

public class f implements a
{
    private static final String A = "f";
    private static final int B = 4096;
    private static final int C = -1;
    private static final int D = -1;
    private static final int E = 4;
    private static final int F = 255;
    @l
    private static final int G = 0;
    @l
    private int[] f;
    @l
    private final int[] g;
    private final a h;
    private ByteBuffer i;
    private byte[] j;
    private d k;
    private short[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    @l
    private int[] p;
    private int q;
    private c r;
    private Bitmap s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    @k0
    private Boolean y;
    @j0
    private Bitmap$Config z;
    
    public f(@j0 final a h) {
        this.g = new int[256];
        this.z = Bitmap$Config.ARGB_8888;
        this.h = h;
        this.r = new c();
    }
    
    public f(@j0 final a a, final c c, final ByteBuffer byteBuffer) {
        this(a, c, byteBuffer, 1);
    }
    
    public f(@j0 final a a, final c c, final ByteBuffer byteBuffer, final int n) {
        this(a);
        this.t(c, byteBuffer, n);
    }
    
    private int A() {
        return this.i.get() & 0xFF;
    }
    
    private Bitmap B(final com.bumptech.glide.gifdecoder.b b, final com.bumptech.glide.gifdecoder.b b2) {
        final int[] p2 = this.p;
        final boolean b3 = false;
        if (b2 == null) {
            final Bitmap s = this.s;
            if (s != null) {
                this.h.c(s);
            }
            this.s = null;
            Arrays.fill(p2, 0);
        }
        if (b2 != null && b2.g == 3 && this.s == null) {
            Arrays.fill(p2, 0);
        }
        if (b2 != null) {
            final int g = b2.g;
            if (g > 0) {
                if (g == 2) {
                    int l = b3 ? 1 : 0;
                    if (!b.f) {
                        final c r = this.r;
                        l = r.l;
                        if (b.k != null && r.j == b.h) {
                            l = (b3 ? 1 : 0);
                        }
                    }
                    final int d = b2.d;
                    final int v = this.v;
                    final int n = d / v;
                    final int n2 = b2.b / v;
                    final int n3 = b2.c / v;
                    int i = 0;
                    for (int n4 = b2.a / v, x = this.x; i < n * x + (i = n2 * x + n4); i += this.x) {
                        for (int j = i; j < i + n3; ++j) {
                            p2[j] = l;
                        }
                    }
                }
                else if (g == 3) {
                    final Bitmap s2 = this.s;
                    if (s2 != null) {
                        final int x2 = this.x;
                        s2.getPixels(p2, 0, x2, 0, 0, x2, this.w);
                    }
                }
            }
        }
        this.f(b);
        if (!b.e && this.v == 1) {
            this.e(b);
        }
        else {
            this.d(b);
        }
        if (this.t) {
            final int g2 = b.g;
            if (g2 == 0 || g2 == 1) {
                if (this.s == null) {
                    this.s = this.y();
                }
                final Bitmap s3 = this.s;
                final int x3 = this.x;
                s3.setPixels(p2, 0, x3, 0, 0, x3, this.w);
            }
        }
        final Bitmap y = this.y();
        final int x4 = this.x;
        y.setPixels(p2, 0, x4, 0, 0, x4, this.w);
        return y;
    }
    
    @l
    private int c(int i, final int n, int n2) {
        int j = i;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (j < this.v + i) {
            final byte[] o = this.o;
            if (j >= o.length || j >= n) {
                break;
            }
            final int n8 = this.f[o[j] & 0xFF];
            int n9 = n3;
            int n10 = n4;
            int n11 = n5;
            int n12 = n6;
            int n13 = n7;
            if (n8 != 0) {
                n9 = n3 + (n8 >> 24 & 0xFF);
                n10 = n4 + (n8 >> 16 & 0xFF);
                n11 = n5 + (n8 >> 8 & 0xFF);
                n12 = n6 + (n8 & 0xFF);
                n13 = n7 + 1;
            }
            ++j;
            n3 = n9;
            n4 = n10;
            n5 = n11;
            n6 = n12;
            n7 = n13;
        }
        final int n14 = i += n2;
        int n15 = n4;
        int n16 = n3;
        while (i < this.v + n14) {
            final byte[] o2 = this.o;
            if (i >= o2.length || i >= n) {
                break;
            }
            n2 = o2[i];
            final int n17 = this.f[n2 & 0xFF];
            int n18 = n16;
            int n19 = n15;
            int n20 = n5;
            int n21 = n6;
            n2 = n7;
            if (n17 != 0) {
                n18 = n16 + (n17 >> 24 & 0xFF);
                n19 = n15 + (n17 >> 16 & 0xFF);
                n20 = n5 + (n17 >> 8 & 0xFF);
                n21 = n6 + (n17 & 0xFF);
                n2 = n7 + 1;
            }
            ++i;
            n16 = n18;
            n15 = n19;
            n5 = n20;
            n6 = n21;
            n7 = n2;
        }
        if (n7 == 0) {
            return 0;
        }
        return n16 / n7 << 24 | n15 / n7 << 16 | n5 / n7 << 8 | n6 / n7;
    }
    
    private void d(final com.bumptech.glide.gifdecoder.b b) {
        final int[] p = this.p;
        final int d = b.d;
        final int v = this.v;
        final int n = d / v;
        int n2 = b.b / v;
        int n3 = b.c / v;
        final int n4 = b.a / v;
        final boolean b2 = this.q == 0;
        final int x = this.x;
        final int w = this.w;
        final byte[] o = this.o;
        final int[] f = this.f;
        Boolean y = this.y;
        int n5 = 8;
        int i = 0;
        int n6 = 0;
        int n7 = 1;
        while (i < n) {
            int n9;
            int n10;
            int n11;
            if (b.e) {
                if (n6 >= n) {
                    if (++n7 != 2) {
                        if (n7 != 3) {
                            final int n8;
                            if ((n8 = n7) != 4) {
                                n7 = n8;
                            }
                            else {
                                n6 = 1;
                                n5 = 2;
                                n7 = n8;
                            }
                        }
                        else {
                            n6 = 2;
                            n5 = 4;
                        }
                    }
                    else {
                        n6 = 4;
                    }
                }
                n9 = n6 + n5;
                n10 = n6;
                n11 = n7;
            }
            else {
                n10 = i;
                n11 = n7;
                n9 = n6;
            }
            final int n12 = n10 + n2;
            final boolean b3 = v == 1;
            int n20 = 0;
            Boolean b4 = null;
            int n28 = 0;
            Label_0522: {
                if (n12 < w) {
                    final int n13 = n12 * x;
                    final int n14 = n13 + n4;
                    final int n15 = n14 + n3;
                    final int n16 = n13 + x;
                    int n17;
                    if (n16 < (n17 = n15)) {
                        n17 = n16;
                    }
                    int n18 = i * v * b.c;
                    if (b3) {
                        int n19 = n14;
                        while (true) {
                            n20 = n2;
                            b4 = y;
                            if (n19 >= n17) {
                                break;
                            }
                            final int n21 = f[o[n18] & 0xFF];
                            Boolean true;
                            if (n21 != 0) {
                                p[n19] = n21;
                                true = y;
                            }
                            else {
                                true = y;
                                if (b2 && (true = y) == null) {
                                    true = Boolean.TRUE;
                                }
                            }
                            n18 += v;
                            ++n19;
                            y = true;
                        }
                    }
                    else {
                        final int n22 = n2;
                        final int n23 = n14;
                        int n24 = n18;
                        final int n25 = n3;
                        int n26 = n23;
                        while (true) {
                            final int n27 = n24;
                            n20 = n22;
                            b4 = y;
                            n28 = n25;
                            if (n26 >= n17) {
                                break Label_0522;
                            }
                            final int c = this.c(n27, (n17 - n14) * v + n18, b.c);
                            Boolean true2;
                            if (c != 0) {
                                p[n26] = c;
                                true2 = y;
                            }
                            else {
                                true2 = y;
                                if (b2 && (true2 = y) == null) {
                                    true2 = Boolean.TRUE;
                                }
                            }
                            n24 = n27 + v;
                            ++n26;
                            y = true2;
                        }
                    }
                }
                else {
                    b4 = y;
                    n20 = n2;
                }
                n28 = n3;
            }
            y = b4;
            ++i;
            n3 = n28;
            n6 = n9;
            n2 = n20;
            n7 = n11;
        }
        if (this.y == null) {
            this.y = (y != null && y);
        }
    }
    
    private void e(final com.bumptech.glide.gifdecoder.b b) {
        final int[] p = this.p;
        final int d = b.d;
        final int b2 = b.b;
        final int c = b.c;
        final int a = b.a;
        final boolean b3 = this.q == 0;
        final int x = this.x;
        final byte[] o = this.o;
        final int[] f = this.f;
        int i = 0;
        int n = -1;
        while (i < d) {
            final int n2 = (i + b2) * x;
            int j = n2 + a;
            final int n3 = j + c;
            final int n4 = n2 + x;
            int n5;
            if (n4 < (n5 = n3)) {
                n5 = n4;
            }
            int n6 = b.c * i;
            while (j < n5) {
                final byte b4 = o[n6];
                final int n7 = b4 & 0xFF;
                int n8;
                if (n7 != (n8 = n)) {
                    final int n9 = f[n7];
                    if (n9 != 0) {
                        p[j] = n9;
                        n8 = n;
                    }
                    else {
                        n8 = b4;
                    }
                }
                ++n6;
                ++j;
                n = n8;
            }
            ++i;
        }
        final Boolean y = this.y;
        this.y = ((y != null && y) || (this.y == null && b3 && n != -1));
    }
    
    private void f(final com.bumptech.glide.gifdecoder.b b) {
        if (b != null) {
            this.i.position(b.j);
        }
        int n;
        int n2;
        if (b == null) {
            final c r = this.r;
            n = r.f;
            n2 = r.g;
        }
        else {
            n = b.c;
            n2 = b.d;
        }
        final int toIndex = n * n2;
        final byte[] o = this.o;
        if (o == null || o.length < toIndex) {
            this.o = this.h.e(toIndex);
        }
        final byte[] o2 = this.o;
        if (this.l == null) {
            this.l = new short[4096];
        }
        final short[] l = this.l;
        if (this.m == null) {
            this.m = new byte[4096];
        }
        final byte[] m = this.m;
        if (this.n == null) {
            this.n = new byte[4097];
        }
        final byte[] n3 = this.n;
        final int a = this.A();
        final int n4 = 1 << a;
        int n5 = n4 + 2;
        final int n6 = a + 1;
        final int n7 = (1 << n6) - 1;
        int i = 0;
        for (int j = 0; j < n4; ++j) {
            l[j] = 0;
            m[j] = (byte)j;
        }
        final byte[] k = this.j;
        int n8 = n6;
        int n9 = n5;
        int n10 = n7;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int fromIndex = 0;
        int n15 = -1;
        int n16 = 0;
        int n17 = 0;
    Label_0267:
        while (i < toIndex) {
            int z;
            if ((z = n11) == 0) {
                z = this.z();
                if (z <= 0) {
                    this.u = 3;
                    break;
                }
                n12 = 0;
            }
            n14 += (k[n12] & 0xFF) << n13;
            final int n18 = n12 + 1;
            final int n19 = z - 1;
            final int n20 = n13 + 8;
            final int n21 = n9;
            final int n22 = n16;
            int n23 = n8;
            int n24 = i;
            int n25 = n5;
            int n26 = n21;
            int n27 = n22;
            n13 = n20;
            while (n13 >= n23) {
                final int n28 = n14 & n10;
                n14 >>= n23;
                n13 -= n23;
                if (n28 == n4) {
                    n10 = n7;
                    n23 = n6;
                    final int n29 = n25;
                    n15 = -1;
                    n26 = n25;
                    n25 = n29;
                }
                else {
                    if (n28 == n4 + 1) {
                        final int n30 = n27;
                        n5 = n25;
                        n8 = n23;
                        i = n24;
                        n11 = n19;
                        n12 = n18;
                        n9 = n26;
                        n16 = n30;
                        continue Label_0267;
                    }
                    if (n15 == -1) {
                        o2[fromIndex] = m[n28];
                        ++fromIndex;
                        ++n24;
                        n15 = (n27 = n28);
                    }
                    else {
                        int n31;
                        int n32;
                        if (n28 >= n26) {
                            n3[n17] = (byte)n27;
                            n31 = n17 + 1;
                            n32 = n15;
                        }
                        else {
                            final int n33 = n28;
                            n31 = n17;
                            n32 = n33;
                        }
                        while (n32 >= n4) {
                            n3[n31] = m[n32];
                            ++n31;
                            n32 = l[n32];
                        }
                        final int n34 = m[n32] & 0xFF;
                        final byte b2 = (byte)n34;
                        o2[fromIndex] = b2;
                        n17 = n31;
                        while (true) {
                            ++fromIndex;
                            ++n24;
                            if (n17 <= 0) {
                                break;
                            }
                            --n17;
                            o2[fromIndex] = n3[n17];
                        }
                        int n35 = n26;
                        int n36 = n23;
                        int n37 = n10;
                        if (n26 < 4096) {
                            l[n26] = (short)n15;
                            m[n26] = b2;
                            final int n38 = n35 = n26 + 1;
                            n36 = n23;
                            n37 = n10;
                            if ((n38 & n10) == 0x0) {
                                n35 = n38;
                                n36 = n23;
                                n37 = n10;
                                if (n38 < 4096) {
                                    n36 = n23 + 1;
                                    n37 = n10 + n38;
                                    n35 = n38;
                                }
                            }
                        }
                        n15 = n28;
                        n27 = n34;
                        n26 = n35;
                        n23 = n36;
                        n10 = n37;
                    }
                }
            }
            final int n39 = n26;
            n16 = n27;
            final int n40 = n23;
            n5 = n25;
            i = n24;
            n11 = n19;
            n12 = n18;
            n9 = n39;
            n8 = n40;
        }
        Arrays.fill(o2, fromIndex, toIndex, (byte)0);
    }
    
    @j0
    private d g() {
        if (this.k == null) {
            this.k = new d();
        }
        return this.k;
    }
    
    private Bitmap y() {
        final Boolean y = this.y;
        Bitmap$Config bitmap$Config;
        if (y != null && !y) {
            bitmap$Config = this.z;
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap a = this.h.a(this.x, this.w, bitmap$Config);
        a.setHasAlpha(true);
        return a;
    }
    
    private int z() {
        final int a = this.A();
        if (a <= 0) {
            return a;
        }
        final ByteBuffer i = this.i;
        i.get(this.j, 0, Math.min(a, i.remaining()));
        return a;
    }
    
    @Override
    public int a() {
        return this.r.g;
    }
    
    @Override
    public int b() {
        return this.r.f;
    }
    
    @Override
    public void clear() {
        this.r = null;
        final byte[] o = this.o;
        if (o != null) {
            this.h.d(o);
        }
        final int[] p = this.p;
        if (p != null) {
            this.h.f(p);
        }
        final Bitmap s = this.s;
        if (s != null) {
            this.h.c(s);
        }
        this.s = null;
        this.i = null;
        this.y = null;
        final byte[] j = this.j;
        if (j != null) {
            this.h.d(j);
        }
    }
    
    @j0
    @Override
    public ByteBuffer getData() {
        return this.i;
    }
    
    @Override
    public int h() {
        return this.u;
    }
    
    @Override
    public int i(@k0 final InputStream inputStream, int read) {
        if (inputStream != null) {
            if (read > 0) {
                read += 4096;
            }
            else {
                read = 16384;
            }
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(read);
                final byte[] array = new byte[16384];
                while (true) {
                    read = inputStream.read(array, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(array, 0, read);
                }
                byteArrayOutputStream.flush();
                this.read(byteArrayOutputStream.toByteArray());
            }
            catch (IOException ex) {
                Log.w(com.bumptech.glide.gifdecoder.f.A, "Error reading data from stream", (Throwable)ex);
            }
        }
        else {
            this.u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            catch (IOException ex2) {
                Log.w(com.bumptech.glide.gifdecoder.f.A, "Error closing stream", (Throwable)ex2);
            }
        }
        return this.u;
    }
    
    @k0
    @Override
    public Bitmap j() {
        synchronized (this) {
            if (this.r.c <= 0 || this.q < 0) {
                final String a = com.bumptech.glide.gifdecoder.f.A;
                if (Log.isLoggable(a, 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to decode frame, frameCount=");
                    sb.append(this.r.c);
                    sb.append(", framePointer=");
                    sb.append(this.q);
                    Log.d(a, sb.toString());
                }
                this.u = 1;
            }
            final int u = this.u;
            if (u == 1 || u == 2) {
                final String a2 = com.bumptech.glide.gifdecoder.f.A;
                if (Log.isLoggable(a2, 3)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to decode frame, status=");
                    sb2.append(this.u);
                    Log.d(a2, sb2.toString());
                }
                return null;
            }
            this.u = 0;
            if (this.j == null) {
                this.j = this.h.e(255);
            }
            final com.bumptech.glide.gifdecoder.b b = this.r.e.get(this.q);
            final int n = this.q - 1;
            com.bumptech.glide.gifdecoder.b b2;
            if (n >= 0) {
                b2 = this.r.e.get(n);
            }
            else {
                b2 = null;
            }
            int[] f = b.k;
            if (f == null) {
                f = this.r.a;
            }
            this.f = f;
            if (f == null) {
                final String a3 = com.bumptech.glide.gifdecoder.f.A;
                if (Log.isLoggable(a3, 3)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("No valid color table found for frame #");
                    sb3.append(this.q);
                    Log.d(a3, sb3.toString());
                }
                this.u = 1;
                return null;
            }
            if (b.f) {
                System.arraycopy(f, 0, this.g, 0, f.length);
                (this.f = this.g)[b.h] = 0;
                if (b.g == 2 && this.q == 0) {
                    this.y = Boolean.TRUE;
                }
            }
            return this.B(b, b2);
        }
    }
    
    @Override
    public void k() {
        this.q = (this.q + 1) % this.r.c;
    }
    
    @Override
    public void l(@j0 final c c, @j0 final byte[] array) {
        synchronized (this) {
            this.r(c, ByteBuffer.wrap(array));
        }
    }
    
    @Override
    public int m() {
        return this.r.c;
    }
    
    @Override
    public int n() {
        if (this.r.c > 0) {
            final int q = this.q;
            if (q >= 0) {
                return this.p(q);
            }
        }
        return 0;
    }
    
    @Override
    public void o(@j0 final Bitmap$Config bitmap$Config) {
        if (bitmap$Config != Bitmap$Config.ARGB_8888 && bitmap$Config != Bitmap$Config.RGB_565) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsupported format: ");
            sb.append(bitmap$Config);
            sb.append(", must be one of ");
            sb.append(Bitmap$Config.ARGB_8888);
            sb.append(" or ");
            sb.append(Bitmap$Config.RGB_565);
            throw new IllegalArgumentException(sb.toString());
        }
        this.z = bitmap$Config;
    }
    
    @Override
    public int p(int i) {
        if (i >= 0) {
            final c r = this.r;
            if (i < r.c) {
                i = r.e.get(i).i;
                return i;
            }
        }
        i = -1;
        return i;
    }
    
    @Override
    public void q() {
        this.q = -1;
    }
    
    @Override
    public void r(@j0 final c c, @j0 final ByteBuffer byteBuffer) {
        synchronized (this) {
            this.t(c, byteBuffer, 1);
        }
    }
    
    @Override
    public int read(@k0 final byte[] array) {
        synchronized (this) {
            final c d = this.g().r(array).d();
            this.r = d;
            if (array != null) {
                this.l(d, array);
            }
            return this.u;
        }
    }
    
    @Override
    public int s() {
        return this.q;
    }
    
    @Override
    public void t(@j0 final c r, @j0 ByteBuffer readOnlyBuffer, int f) {
        // monitorenter(this)
        Label_0179: {
            if (f > 0) {
                Label_0215: {
                    try {
                        final int highestOneBit = Integer.highestOneBit(f);
                        this.u = 0;
                        this.r = r;
                        this.q = -1;
                        readOnlyBuffer = readOnlyBuffer.asReadOnlyBuffer();
                        (this.i = readOnlyBuffer).position(0);
                        this.i.order(ByteOrder.LITTLE_ENDIAN);
                        this.t = false;
                        final Iterator<com.bumptech.glide.gifdecoder.b> iterator = r.e.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().g == 3) {
                                this.t = true;
                                break;
                            }
                        }
                        this.v = highestOneBit;
                        f = r.f;
                        this.x = f / highestOneBit;
                        final int g = r.g;
                        this.w = g / highestOneBit;
                        this.o = this.h.e(f * g);
                        this.p = this.h.b(this.x * this.w);
                        // monitorexit(this)
                        return;
                    }
                    finally {
                        break Label_0215;
                    }
                    break Label_0179;
                }
            }
            // monitorexit(this)
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Sample size must be >=0, not: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public int u() {
        return this.r.m;
    }
    
    @Override
    public int v() {
        return this.i.limit() + this.o.length + this.p.length * 4;
    }
    
    @Override
    public int w() {
        final int m = this.r.m;
        if (m == -1) {
            return 1;
        }
        if (m == 0) {
            return 0;
        }
        return m + 1;
    }
    
    @Deprecated
    @Override
    public int x() {
        int m;
        if ((m = this.r.m) == -1) {
            m = 1;
        }
        return m;
    }
}
