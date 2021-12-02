// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import java.util.List;
import kotlin.e1;
import org.jetbrains.annotations.e;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H'J\u0013\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H¦\u0002J\b\u0010\f\u001a\u00020\u000bH&R\u001c\u0010\r\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00000\u00148&@'X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0010\u001a\u0004\b!\u0010\u000eR\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0010\u001a\u0004\b(\u0010\u000eR\u001e\u0010/\u001a\u0004\u0018\u00010+8&@'X§\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0010\u001a\u0004\b,\u0010-R\u001c\u00102\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0010\u001a\u0004\b0\u0010\u000eR\"\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00148&@'X§\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0010\u001a\u0004\b4\u0010\u0017R\u0018\u00108\u001a\u0004\u0018\u00010\u001d8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001fR \u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090#8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010&R \u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000#8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010&R\u0018\u0010@\u001a\u0004\u0018\u00018\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001c\u0010A\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0010\u001a\u0004\bA\u0010\u000eR\u001c\u0010E\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0010\u001a\u0004\bC\u0010\u000eR\u001c\u0010H\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\bG\u0010\u0010\u001a\u0004\bF\u0010\u000eR\u001c\u0010K\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u0010\u001a\u0004\bI\u0010\u000e¨\u0006L" }, d2 = { "Lkotlin/reflect/d;", "", "T", "Lkotlin/reflect/h;", "Lkotlin/reflect/b;", "Lkotlin/reflect/g;", "value", "", "S", "other", "equals", "", "hashCode", "isFinal", "()Z", "isFinal$annotations", "()V", "M", "isCompanion$annotations", "isCompanion", "", "Lkotlin/reflect/t;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "typeParameters", "s", "getSealedSubclasses$annotations", "sealedSubclasses", "", "H", "()Ljava/lang/String;", "simpleName", "isAbstract", "isAbstract$annotations", "", "Lkotlin/reflect/i;", "j", "()Ljava/util/Collection;", "constructors", "w", "isSealed$annotations", "isSealed", "Lkotlin/reflect/x;", "getVisibility", "()Lkotlin/reflect/x;", "getVisibility$annotations", "visibility", "D", "isData$annotations", "isData", "Lkotlin/reflect/s;", "k", "getSupertypes$annotations", "supertypes", "E", "qualifiedName", "Lkotlin/reflect/c;", "x", "members", "F", "nestedClasses", "J", "()Ljava/lang/Object;", "objectInstance", "isOpen", "isOpen$annotations", "u", "isInner$annotations", "isInner", "q", "isFun$annotations", "isFun", "t", "isValue$annotations", "isValue", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public interface d<T> extends h, b, g
{
    boolean D();
    
    @f
    String E();
    
    @e
    Collection<d<?>> F();
    
    @f
    String H();
    
    @f
    T J();
    
    boolean M();
    
    @e1(version = "1.1")
    boolean S(@f final Object p0);
    
    boolean equals(@f final Object p0);
    
    @e
    List<t> getTypeParameters();
    
    @f
    x getVisibility();
    
    int hashCode();
    
    boolean isAbstract();
    
    boolean isFinal();
    
    boolean isOpen();
    
    @e
    Collection<i<T>> j();
    
    @e
    List<s> k();
    
    boolean q();
    
    @e
    List<d<? extends T>> s();
    
    boolean t();
    
    boolean u();
    
    boolean w();
    
    @e
    Collection<c<?>> x();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
