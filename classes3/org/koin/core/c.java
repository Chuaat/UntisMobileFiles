// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "Lorg/koin/core/c;", "", "Lorg/koin/core/a;", "getKoin", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public interface c
{
    @e
    org.koin.core.a getKoin();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 0 })
    public static final class a
    {
        @e
        public static org.koin.core.a a(final c c) {
            return org.koin.core.context.a.a().j();
        }
    }
}
