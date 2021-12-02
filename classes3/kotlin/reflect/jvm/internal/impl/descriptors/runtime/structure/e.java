// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.c;

public final class e extends d implements c
{
    @org.jetbrains.annotations.e
    private final Annotation c;
    
    public e(@f final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final Annotation c) {
        k0.p((Object)c, "annotation");
        super(e);
        this.c = c;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.load.java.structure.a a() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c(this.c);
    }
}
