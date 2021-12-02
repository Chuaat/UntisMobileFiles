// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013" }, d2 = { "Lkotlin/reflect/t;", "Lkotlin/reflect/g;", "", "getName", "()Ljava/lang/String;", "name", "", "Lkotlin/reflect/s;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "Lkotlin/reflect/w;", "v", "()Lkotlin/reflect/w;", "variance", "", "r", "()Z", "isReified", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public interface t extends g
{
    @e
    String getName();
    
    @e
    List<s> getUpperBounds();
    
    boolean r();
    
    @e
    w v();
}
