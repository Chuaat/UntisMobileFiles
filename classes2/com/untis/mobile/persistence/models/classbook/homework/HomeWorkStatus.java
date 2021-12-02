// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.homework;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "COMPLETED", "NOT_COMPLETED", "NO_STATEMENT", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum HomeWorkStatus
{
    COMPLETED(1);
    
    @e
    public static final Companion Companion;
    
    NOT_COMPLETED(2), 
    NO_STATEMENT(0);
    
    private final int value;
    
    private static final /* synthetic */ HomeWorkStatus[] $values() {
        return new HomeWorkStatus[] { HomeWorkStatus.COMPLETED, HomeWorkStatus.NOT_COMPLETED, HomeWorkStatus.NO_STATEMENT };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private HomeWorkStatus(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;", "fromValue", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final HomeWorkStatus fromValue(final int n) {
            while (true) {
                for (final HomeWorkStatus homeWorkStatus : HomeWorkStatus.values()) {
                    if (homeWorkStatus.getValue() == n) {
                        HomeWorkStatus no_STATEMENT = homeWorkStatus;
                        if (homeWorkStatus == null) {
                            no_STATEMENT = HomeWorkStatus.NO_STATEMENT;
                        }
                        return no_STATEMENT;
                    }
                }
                HomeWorkStatus homeWorkStatus = null;
                continue;
            }
        }
    }
}
