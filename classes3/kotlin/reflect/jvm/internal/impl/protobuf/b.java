// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;

public abstract class b<MessageType extends q> implements s<MessageType>
{
    private static final g a;
    
    static {
        a = g.c();
    }
    
    private MessageType e(final MessageType messageType) throws k {
        if (messageType != null && !messageType.a()) {
            throw this.f(messageType).a().i(messageType);
        }
        return messageType;
    }
    
    private w f(final MessageType messageType) {
        if (messageType instanceof a) {
            return ((a)messageType).e();
        }
        return new w(messageType);
    }
    
    public MessageType g(final InputStream inputStream, final g g) throws k {
        return this.e(this.j(inputStream, g));
    }
    
    public MessageType h(final InputStream inputStream, final g g) throws k {
        return this.e(this.k(inputStream, g));
    }
    
    public MessageType i(final d d, final g g) throws k {
        return this.e(this.l(d, g));
    }
    
    public MessageType j(final InputStream inputStream, final g g) throws k {
        try {
            final int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return this.k(new a.a.a(inputStream, e.B(read, inputStream)), g);
        }
        catch (IOException ex) {
            throw new k(ex.getMessage());
        }
    }
    
    public MessageType k(InputStream inputStream, final g g) throws k {
        final e g2 = e.g(inputStream);
        inputStream = (InputStream)this.b(g2, g);
        try {
            g2.a(0);
            return (MessageType)inputStream;
        }
        catch (k k) {
            throw k.i((q)inputStream);
        }
    }
    
    public MessageType l(d d, final g g) throws k {
        try {
            final e t = d.t();
            d = (d)this.b(t, g);
            try {
                t.a(0);
                return (MessageType)d;
            }
            catch (k k) {
                throw k.i((q)d);
            }
        }
        catch (k i) {
            throw i;
        }
    }
}
