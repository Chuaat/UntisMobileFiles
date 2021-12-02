// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import kotlin.e1;
import org.jetbrains.annotations.f;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH&¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001d\u0010\u0015R\u001e\u0010#\u001a\u0004\u0018\u00010\u001f8&@'X§\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0011\u001a\u0004\b \u0010!R\u0016\u0010'\u001a\u00020$8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010(\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0011\u001a\u0004\b(\u0010\u0015R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u000f¨\u0006," }, d2 = { "Lkotlin/reflect/c;", "R", "Lkotlin/reflect/b;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/n;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "", "Lkotlin/reflect/t;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "()V", "typeParameters", "", "isAbstract", "()Z", "isAbstract$annotations", "isFinal", "isFinal$annotations", "", "getName", "()Ljava/lang/String;", "name", "isOpen", "isOpen$annotations", "Lkotlin/reflect/x;", "getVisibility", "()Lkotlin/reflect/x;", "getVisibility$annotations", "visibility", "Lkotlin/reflect/s;", "getReturnType", "()Lkotlin/reflect/s;", "returnType", "isSuspend", "isSuspend$annotations", "getParameters", "parameters", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public interface c<R> extends b
{
    R call(@e final Object... p0);
    
    R callBy(@e final Map<n, ?> p0);
    
    @e
    String getName();
    
    @e
    List<n> getParameters();
    
    @e
    s getReturnType();
    
    @e
    List<t> getTypeParameters();
    
    @f
    x getVisibility();
    
    boolean isAbstract();
    
    boolean isFinal();
    
    boolean isOpen();
    
    boolean isSuspend();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
