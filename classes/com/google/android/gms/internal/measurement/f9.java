// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class f9<MessageType extends j9<MessageType, BuilderType>, BuilderType extends f9<MessageType, BuilderType>> extends p7<MessageType, BuilderType>
{
    private final MessageType G;
    protected MessageType H;
    protected boolean I;
    
    protected f9(final MessageType g) {
        this.G = g;
        this.H = (MessageType)g.u(4, null, null);
        this.I = false;
    }
    
    private static final void m(final MessageType messageType, final MessageType messageType2) {
        ab.a().b(messageType.getClass()).g((j9)messageType, (j9)messageType2);
    }
    
    public final MessageType n() {
        final j9 q = this.q();
        boolean b = true;
        final byte byteValue = (byte)q.u(1, null, null);
        if (byteValue != 1) {
            if (byteValue == 0) {
                b = false;
            }
            else {
                b = ab.a().b(q.getClass()).b((j9)q);
                Object o;
                if (!b) {
                    o = null;
                }
                else {
                    o = q;
                }
                q.u(2, o, null);
            }
        }
        if (b) {
            return (MessageType)q;
        }
        throw new ub(q);
    }
    
    public MessageType q() {
        if (this.I) {
            return this.H;
        }
        final j9<MessageType, BuilderType> h = this.H;
        ab.a().b(h.getClass()).d((j9)h);
        this.I = true;
        return this.H;
    }
    
    protected void r() {
        final j9 h = (j9)this.H.u(4, null, null);
        m((MessageType)h, this.H);
        this.H = (MessageType)h;
    }
    
    public final BuilderType s() {
        final f9 f9 = (f9)this.G.u(5, null, null);
        f9.t(this.q());
        return (BuilderType)f9;
    }
    
    public final BuilderType t(final MessageType messageType) {
        if (this.I) {
            this.r();
            this.I = false;
        }
        m(this.H, messageType);
        return (BuilderType)this;
    }
    
    public final BuilderType u(final byte[] array, final int n, final int n2, final v8 v8) throws u9 {
        if (this.I) {
            this.r();
            this.I = false;
        }
        try {
            ab.a().b(this.H.getClass()).f((j9)this.H, array, 0, n2, new t7(v8));
            return (BuilderType)this;
        }
        catch (IOException cause) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", cause);
        }
        catch (IndexOutOfBoundsException ex) {
            throw u9.f();
        }
        catch (u9 u9) {
            throw u9;
        }
    }
}
