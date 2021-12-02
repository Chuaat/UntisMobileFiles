// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class a implements q
{
    protected int G;
    
    public a() {
        this.G = 0;
    }
    
    w e() {
        return new w(this);
    }
    
    public void j(final OutputStream outputStream) throws IOException {
        final int f = this.f();
        final f j = kotlin.reflect.jvm.internal.impl.protobuf.f.J(outputStream, kotlin.reflect.jvm.internal.impl.protobuf.f.u(kotlin.reflect.jvm.internal.impl.protobuf.f.v(f) + f));
        j.o0(f);
        this.d(j);
        j.I();
    }
    
    public abstract static class a<BuilderType extends a> implements q.a
    {
        protected static w m(final q q) {
            return new w(q);
        }
        
        public abstract BuilderType j();
        
        public abstract BuilderType l(final e p0, final g p1) throws IOException;
        
        static final class a extends FilterInputStream
        {
            private int G;
            
            a(final InputStream in, final int g) {
                super(in);
                this.G = g;
            }
            
            @Override
            public int available() throws IOException {
                return Math.min(super.available(), this.G);
            }
            
            @Override
            public int read() throws IOException {
                if (this.G <= 0) {
                    return -1;
                }
                final int read = super.read();
                if (read >= 0) {
                    --this.G;
                }
                return read;
            }
            
            @Override
            public int read(final byte[] b, int read, final int a) throws IOException {
                final int g = this.G;
                if (g <= 0) {
                    return -1;
                }
                read = super.read(b, read, Math.min(a, g));
                if (read >= 0) {
                    this.G -= read;
                }
                return read;
            }
            
            @Override
            public long skip(long skip) throws IOException {
                skip = super.skip(Math.min(skip, this.G));
                if (skip >= 0L) {
                    this.G -= (int)skip;
                }
                return skip;
            }
        }
    }
}
