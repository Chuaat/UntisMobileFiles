// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.io.d;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.bson.io.f;
import java.nio.ByteBuffer;
import org.bson.io.c;

public class p extends a
{
    private final org.bson.io.c L;
    private c M;
    
    public p(final ByteBuffer byteBuffer) {
        this(new f(new c1(e7.a.e("byteBuffer", byteBuffer))));
    }
    
    public p(final org.bson.io.c l) {
        if (l != null) {
            this.L = l;
            this.a0((a.b)new b(null, u.G, 0, 0));
            return;
        }
        throw new IllegalArgumentException("bsonInput is null");
    }
    
    private int y0() {
        final int b0 = this.L.b0();
        if (b0 >= 0) {
            return b0;
        }
        throw new s0(String.format("Size %s is not valid because it is negative.", b0));
    }
    
    @Override
    protected long C() {
        return this.L.k0();
    }
    
    @Override
    protected String D() {
        return this.L.U();
    }
    
    @Override
    protected String F() {
        this.a0((a.b)new b(this.w0(), u.J, this.L.getPosition(), this.y0()));
        return this.L.U();
    }
    
    @Override
    protected void G() {
    }
    
    @Override
    protected void H() {
    }
    
    @Override
    protected void J() {
    }
    
    @Override
    protected ObjectId K() {
        return this.L.E();
    }
    
    @Override
    protected r0 L() {
        return new r0(this.L.x1(), this.L.x1());
    }
    
    public void M() {
        this.a0((a.b)new b(this.w0(), u.I, this.L.getPosition(), this.y0()));
    }
    
    @Override
    protected void N() {
        u u;
        if (this.Z() == d.K) {
            u = org.bson.u.K;
        }
        else {
            u = org.bson.u.H;
        }
        this.a0((a.b)new b(this.w0(), u, this.L.getPosition(), this.y0()));
    }
    
    @Deprecated
    @Override
    public void O() {
        if (this.M == null) {
            this.M = new c();
            return;
        }
        throw new h("A mark already exists; it needs to be reset before creating a new one");
    }
    
    @Override
    protected String Q() {
        return this.L.U();
    }
    
    @Override
    protected String R() {
        return this.L.U();
    }
    
    @Override
    protected v0 S() {
        return new v0(this.L.k0());
    }
    
    @Override
    public q0 S4() {
        return new c();
    }
    
    @Override
    protected void T() {
    }
    
    @Override
    protected void V() {
    }
    
    @Override
    protected void W() {
        if (this.isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        final d z = this.Z();
        final d j = d.J;
        int y0 = 1;
        if (z != j) {
            this.i0("skipValue", j);
        }
        while (true) {
            switch (p$a.b[this.O5().ordinal()]) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected BSON type: ");
                    sb.append(this.O5());
                    throw new h(sb.toString());
                }
                case 3: {
                    this.L.F3(y0);
                    this.f0(d.H);
                }
                case 21: {
                    y0 = this.y0() + 12;
                    continue;
                }
                case 15: {
                    y0 = 12;
                    continue;
                }
                case 16: {
                    this.L.x3();
                    this.L.x3();
                }
                case 12:
                case 13:
                case 14:
                case 20: {
                    y0 = 0;
                    continue;
                }
                case 10:
                case 17:
                case 18: {
                    y0 = this.y0();
                    continue;
                }
                case 9: {
                    y0 = 16;
                    continue;
                }
                case 7: {
                    y0 = 4;
                    continue;
                }
                case 4:
                case 6:
                case 8:
                case 19: {
                    y0 = 8;
                    continue;
                }
                case 2: {
                    y0 = 1 + this.y0();
                    continue;
                }
                case 1:
                case 5:
                case 11: {
                    y0 = this.y0() - 4;
                    continue;
                }
            }
            break;
        }
    }
    
    @Override
    public void close() {
        super.close();
    }
    
    @Override
    protected int j() {
        this.O();
        final int y0 = this.y0();
        this.reset();
        return y0;
    }
    
    @Override
    protected byte k() {
        this.O();
        this.y0();
        final byte byte1 = this.L.readByte();
        this.reset();
        return byte1;
    }
    
    @Override
    protected o n() {
        final int y0 = this.y0();
        final byte byte1 = this.L.readByte();
        int n = y0;
        if (byte1 == q.J.b()) {
            if (this.L.b0() != y0 - 4) {
                throw new s0("Binary sub type OldBinary has inconsistent sizes");
            }
            n = y0 - 4;
        }
        final byte[] array = new byte[n];
        this.L.i2(array);
        return new o(byte1, array);
    }
    
    @Override
    protected boolean o() {
        final byte byte1 = this.L.readByte();
        boolean b = false;
        if (byte1 != 0 && byte1 != 1) {
            throw new s0(String.format("Expected a boolean value but found %d", byte1));
        }
        if (byte1 == 1) {
            b = true;
        }
        return b;
    }
    
    @Override
    public w0 o5() {
        if (this.isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        if (this.Z() == d.G || this.Z() == d.N || this.Z() == d.K) {
            this.d0(w0.K);
            this.f0(d.J);
            return this.O5();
        }
        final d z = this.Z();
        final d h = d.H;
        if (z != h) {
            this.i0("ReadBSONType", h);
        }
        final byte byte1 = this.L.readByte();
        final w0 b = w0.b(byte1);
        if (b == null) {
            throw new s0(String.format("Detected unknown BSON type \"\\x%x\" for fieldname \"%s\". Are you using the latest driver version?", byte1, this.L.x1()));
        }
        this.d0(b);
        final w0 o5 = this.O5();
        final w0 h2 = w0.H;
        if (o5 == h2) {
            final int n = p$a.a[((a.b)this.w0()).c().ordinal()];
            d d;
            if (n != 1) {
                if (n != 2 && n != 3) {
                    throw new s0(String.format("BSONType EndOfDocument is not valid when ContextType is %s.", ((a.b)this.w0()).c()));
                }
                d = a.d.L;
            }
            else {
                d = a.d.M;
            }
            this.f0(d);
            return h2;
        }
        final int n2 = p$a.a[((a.b)this.w0()).c().ordinal()];
        d d2;
        if (n2 != 1) {
            if (n2 != 2 && n2 != 3) {
                throw new h("Unexpected ContextType.");
            }
            this.e0(this.L.x1());
            d2 = d.I;
        }
        else {
            this.L.x3();
            d2 = d.J;
        }
        this.f0(d2);
        return this.O5();
    }
    
    @Override
    protected w q() {
        return new w(this.L.U(), this.L.E());
    }
    
    @Override
    protected long r() {
        return this.L.k0();
    }
    
    @Deprecated
    @Override
    public void reset() {
        final c m = this.M;
        if (m != null) {
            m.reset();
            this.M = null;
            return;
        }
        throw new h("trying to reset a mark before creating it");
    }
    
    public Decimal128 s() {
        return Decimal128.fromIEEE754BIDEncoding(this.L.k0(), this.L.k0());
    }
    
    public org.bson.io.c s0() {
        return this.L;
    }
    
    @Override
    protected double t() {
        return this.L.readDouble();
    }
    
    @Override
    protected void w() {
        this.a0((a.b)this.w0().h(this.L.getPosition()));
    }
    
    protected b w0() {
        return (b)super.X();
    }
    
    @Override
    protected void x() {
        this.a0((a.b)this.w0().h(this.L.getPosition()));
        if (((a.b)this.w0()).c() == u.J) {
            this.a0((a.b)this.w0().h(this.L.getPosition()));
        }
    }
    
    @Override
    protected int y() {
        return this.L.b0();
    }
    
    protected class b extends a.b
    {
        private final int d;
        private final int e;
        
        b(final b b, final u u, final int d, final int e) {
            super((a.b)b, u);
            this.d = d;
            this.e = e;
        }
        
        protected b g() {
            return (b)super.d();
        }
        
        b h(int i) {
            i -= this.d;
            if (i == this.e) {
                return this.g();
            }
            throw new s0(String.format("Expected size to be %d, not %d.", this.e, i));
        }
    }
    
    protected class c extends a.c
    {
        private final int g;
        private final int h;
        private final org.bson.io.d i;
        
        protected c() {
            this.g = p.this.w0().d;
            this.h = p.this.w0().e;
            this.i = p.this.L.o4(Integer.MAX_VALUE);
        }
        
        @Override
        public void reset() {
            super.reset();
            this.i.reset();
            final p j = p.this;
            j.a0((a.b)j.new b((p.b)((a.c)this).b(), ((a.c)this).a(), this.g, this.h));
        }
    }
}
