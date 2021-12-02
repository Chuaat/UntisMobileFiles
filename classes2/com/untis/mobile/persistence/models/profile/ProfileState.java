// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/ProfileState;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "InvalidApiSharedSecret", "ServerDownForMaintenance", "NONE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum ProfileState
{
    @e
    public static final Companion Companion;
    
    InvalidApiSharedSecret(1), 
    NONE(0), 
    ServerDownForMaintenance(2);
    
    private final int value;
    
    private static final /* synthetic */ ProfileState[] $values() {
        return new ProfileState[] { ProfileState.InvalidApiSharedSecret, ProfileState.ServerDownForMaintenance, ProfileState.NONE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private ProfileState(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/ProfileState$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/profile/ProfileState;", "fromValue", "(Ljava/lang/Integer;)Lcom/untis/mobile/persistence/models/profile/ProfileState;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final ProfileState fromValue(@f final Integer n) {
            while (true) {
                for (final ProfileState profileState : ProfileState.values()) {
                    final int value = profileState.getValue();
                    boolean b = false;
                    Label_0054: {
                        if (n != null) {
                            if (value == n) {
                                b = true;
                                break Label_0054;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        final ProfileState profileState2 = profileState;
                        ProfileState none = profileState2;
                        if (profileState2 == null) {
                            none = ProfileState.NONE;
                        }
                        return none;
                    }
                }
                final ProfileState profileState2 = null;
                continue;
            }
        }
    }
}
