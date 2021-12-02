// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.z0$a;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Collections;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.storage.n;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public class j extends b implements w0
{
    private final e d;
    private final List<b1> e;
    private final Collection<c0> f;
    
    public j(@org.jetbrains.annotations.e final e d, @org.jetbrains.annotations.e final List<? extends b1> c, @org.jetbrains.annotations.e final Collection<c0> c2, @org.jetbrains.annotations.e final n n) {
        if (d == null) {
            q(0);
        }
        if (c == null) {
            q(1);
        }
        if (c2 == null) {
            q(2);
        }
        if (n == null) {
            q(3);
        }
        super(n);
        this.d = d;
        this.e = Collections.unmodifiableList((List<? extends b1>)new ArrayList<b1>(c));
        this.f = Collections.unmodifiableCollection((Collection<? extends c0>)c2);
    }
    
    private static /* synthetic */ void q(final int n) {
        String format;
        if (n != 4 && n != 5 && n != 6 && n != 7) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 4 && n != 5 && n != 6 && n != 7) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "classDescriptor";
                break;
            }
            case 4:
            case 5:
            case 6:
            case 7: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            }
            case 3: {
                args[0] = "storageManager";
                break;
            }
            case 2: {
                args[0] = "supertypes";
                break;
            }
            case 1: {
                args[0] = "parameters";
                break;
            }
        }
        if (n != 4) {
            if (n != 5) {
                if (n != 6) {
                    if (n != 7) {
                        args[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                    }
                    else {
                        args[1] = "getSupertypeLoopChecker";
                    }
                }
                else {
                    args[1] = "computeSupertypes";
                }
            }
            else {
                args[1] = "getDeclarationDescriptor";
            }
        }
        else {
            args[1] = "getParameters";
        }
        if (n != 4 && n != 5 && n != 6 && n != 7) {
            args[2] = "<init>";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 4 && n != 5 && n != 6 && n != 7) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Collection<c0> g() {
        final Collection<c0> f = this.f;
        if (f == null) {
            q(6);
        }
        return f;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<b1> getParameters() {
        final List<b1> e = this.e;
        if (e == null) {
            q(4);
        }
        return e;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected z0 l() {
        final z0$a a = z0$a.a;
        if (a == null) {
            q(7);
        }
        return (z0)a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e s() {
        final e d = this.d;
        if (d == null) {
            q(5);
        }
        return d;
    }
    
    @Override
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.resolve.d.m((m)this.d).b();
    }
}
