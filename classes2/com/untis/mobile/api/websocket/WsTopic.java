// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.websocket;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lcom/untis/mobile/api/websocket/WsTopic;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "SUBSTITUTION_REQUESTS", "SUBSTITUTION_PLANNING", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum WsTopic
{
    @e
    public static final Companion Companion;
    
    SUBSTITUTION_PLANNING("sp"), 
    SUBSTITUTION_REQUESTS("sr");
    
    @e
    private final String code;
    
    private static final /* synthetic */ WsTopic[] $values() {
        return new WsTopic[] { WsTopic.SUBSTITUTION_REQUESTS, WsTopic.SUBSTITUTION_PLANNING };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private WsTopic(final String code) {
        this.code = code;
    }
    
    @e
    public final String getCode() {
        return this.code;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/api/websocket/WsTopic$Companion;", "", "", "code", "Lcom/untis/mobile/api/websocket/WsTopic;", "findBy", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final WsTopic findBy(@e final String s) {
            k0.p(s, "code");
            for (final WsTopic wsTopic : WsTopic.values()) {
                if (k0.g(wsTopic.getCode(), s)) {
                    return wsTopic;
                }
            }
            return null;
        }
    }
}
