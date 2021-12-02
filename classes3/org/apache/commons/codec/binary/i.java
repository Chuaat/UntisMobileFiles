// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.util.Objects;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

public class i extends FilterOutputStream
{
    private final boolean G;
    private final g H;
    private final byte[] I;
    private final g.a J;
    
    public i(final OutputStream out, final g h, final boolean g) {
        super(out);
        this.I = new byte[1];
        this.J = new g.a();
        this.H = h;
        this.G = g;
    }
    
    private void b(final boolean b) throws IOException {
        final int g = this.H.g(this.J);
        if (g > 0) {
            final byte[] b2 = new byte[g];
            final int y = this.H.y(b2, 0, g, this.J);
            if (y > 0) {
                super.out.write(b2, 0, y);
            }
        }
        if (b) {
            super.out.flush();
        }
    }
    
    public void a() throws IOException {
        if (this.G) {
            this.H.m(this.I, 0, -1, this.J);
        }
        else {
            this.H.k(this.I, 0, -1, this.J);
        }
    }
    
    @Override
    public void close() throws IOException {
        this.a();
        this.flush();
        super.out.close();
    }
    
    @Override
    public void flush() throws IOException {
        this.b(true);
    }
    
    @Override
    public void write(final int n) throws IOException {
        final byte[] i = this.I;
        i[0] = (byte)n;
        this.write(i, 0, 1);
    }
    
    @Override
    public void write(final byte[] obj, final int n, final int n2) throws IOException {
        Objects.requireNonNull(obj, "array");
        if (n < 0 || n2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n <= obj.length && n + n2 <= obj.length) {
            if (n2 > 0) {
                if (this.G) {
                    this.H.m(obj, n, n2, this.J);
                }
                else {
                    this.H.k(obj, n, n2, this.J);
                }
                this.b(false);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
