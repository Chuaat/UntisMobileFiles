// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import kotlin.reflect.x;
import kotlin.reflect.t;
import kotlin.reflect.s;
import m6.o;
import kotlin.reflect.h;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.n;
import java.util.Map;
import kotlin.e1;
import java.io.Serializable;
import kotlin.reflect.c;

public abstract class q implements c, Serializable
{
    @e1(version = "1.1")
    public static final Object NO_RECEIVER;
    @e1(version = "1.4")
    private final boolean isTopLevel;
    @e1(version = "1.4")
    private final String name;
    @e1(version = "1.4")
    private final Class owner;
    @e1(version = "1.1")
    protected final Object receiver;
    private transient c reflected;
    @e1(version = "1.4")
    private final String signature;
    
    static {
        NO_RECEIVER = a.G;
    }
    
    public q() {
        this(q.NO_RECEIVER);
    }
    
    @e1(version = "1.1")
    protected q(final Object o) {
        this(o, null, null, null, false);
    }
    
    @e1(version = "1.4")
    protected q(final Object receiver, final Class owner, final String name, final String signature, final boolean isTopLevel) {
        this.receiver = receiver;
        this.owner = owner;
        this.name = name;
        this.signature = signature;
        this.isTopLevel = isTopLevel;
    }
    
    @Override
    public Object call(final Object... array) {
        return this.getReflected().call(array);
    }
    
    @Override
    public Object callBy(final Map map) {
        return this.getReflected().callBy(map);
    }
    
    @e1(version = "1.1")
    public c compute() {
        c reflected;
        if ((reflected = this.reflected) == null) {
            reflected = this.computeReflected();
            this.reflected = reflected;
        }
        return reflected;
    }
    
    protected abstract c computeReflected();
    
    @Override
    public List<Annotation> getAnnotations() {
        return (List<Annotation>)this.getReflected().getAnnotations();
    }
    
    @e1(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public h getOwner() {
        final Class owner = this.owner;
        h h;
        if (owner == null) {
            h = null;
        }
        else if (this.isTopLevel) {
            h = k1.g(owner);
        }
        else {
            h = k1.d(owner);
        }
        return h;
    }
    
    @Override
    public List<n> getParameters() {
        return (List<n>)this.getReflected().getParameters();
    }
    
    @e1(version = "1.1")
    protected c getReflected() {
        final c compute = this.compute();
        if (compute != this) {
            return compute;
        }
        throw new o();
    }
    
    @Override
    public s getReturnType() {
        return this.getReflected().getReturnType();
    }
    
    public String getSignature() {
        return this.signature;
    }
    
    @e1(version = "1.1")
    @Override
    public List<t> getTypeParameters() {
        return (List<t>)this.getReflected().getTypeParameters();
    }
    
    @e1(version = "1.1")
    @Override
    public x getVisibility() {
        return this.getReflected().getVisibility();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isAbstract() {
        return this.getReflected().isAbstract();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isFinal() {
        return this.getReflected().isFinal();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isOpen() {
        return this.getReflected().isOpen();
    }
    
    @e1(version = "1.3")
    @Override
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }
    
    @e1(version = "1.2")
    private static class a implements Serializable
    {
        private static final a G;
        
        static {
            G = new a();
        }
        
        private Object b() throws ObjectStreamException {
            return a.G;
        }
    }
}
