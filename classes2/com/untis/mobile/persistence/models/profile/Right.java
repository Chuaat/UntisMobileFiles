// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.UMRight;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/Right;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "READ_OFFICE_HOUR", "WRITE_OWN_ABSENCE", "WRITE_OWN_ABSENCE_REASON", "READ_MY_ABSENCES", "READ_EXCUSE", "WRITE_EXCUSE", "CLASSREGISTER", "READ_PARENTSDAY", "MESSENGER", "TEACHER_ABSENCE_CREATE", "TEACHER_ABSENCE_READ", "SUBSTITUTION_PLANNING", "SUBSTITUTION_ASK_TEACHER_READ", "SUBSTITUTION_ASK_TEACHER", "MESSAGES", "NONE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum Right
{
    CLASSREGISTER(7);
    
    @e
    public static final Companion Companion;
    
    MESSAGES(15), 
    MESSENGER(9), 
    NONE(0), 
    READ_EXCUSE(5), 
    READ_MY_ABSENCES(4), 
    READ_OFFICE_HOUR(1), 
    READ_PARENTSDAY(8), 
    SUBSTITUTION_ASK_TEACHER(14), 
    SUBSTITUTION_ASK_TEACHER_READ(13), 
    SUBSTITUTION_PLANNING(12), 
    TEACHER_ABSENCE_CREATE(10), 
    TEACHER_ABSENCE_READ(11), 
    WRITE_EXCUSE(6), 
    WRITE_OWN_ABSENCE(2), 
    WRITE_OWN_ABSENCE_REASON(3);
    
    private final int value;
    
    private static final /* synthetic */ Right[] $values() {
        return new Right[] { Right.READ_OFFICE_HOUR, Right.WRITE_OWN_ABSENCE, Right.WRITE_OWN_ABSENCE_REASON, Right.READ_MY_ABSENCES, Right.READ_EXCUSE, Right.WRITE_EXCUSE, Right.CLASSREGISTER, Right.READ_PARENTSDAY, Right.MESSENGER, Right.TEACHER_ABSENCE_CREATE, Right.TEACHER_ABSENCE_READ, Right.SUBSTITUTION_PLANNING, Right.SUBSTITUTION_ASK_TEACHER_READ, Right.SUBSTITUTION_ASK_TEACHER, Right.MESSAGES, Right.NONE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private Right(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/Right$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/profile/Right;", "fromValue", "Lcom/untis/mobile/api/enumeration/UMRight;", "umRight", "fromUmRight", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final Right fromUmRight(@f final UMRight umRight) {
            int n;
            if (umRight == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[umRight.ordinal()];
            }
            Right right = null;
            switch (n) {
                default: {
                    right = Right.NONE;
                    break;
                }
                case 9: {
                    right = Right.MESSENGER;
                    break;
                }
                case 8: {
                    right = Right.READ_PARENTSDAY;
                    break;
                }
                case 7: {
                    right = Right.CLASSREGISTER;
                    break;
                }
                case 6: {
                    right = Right.WRITE_EXCUSE;
                    break;
                }
                case 5: {
                    right = Right.READ_EXCUSE;
                    break;
                }
                case 4: {
                    right = Right.WRITE_OWN_ABSENCE_REASON;
                    break;
                }
                case 3: {
                    right = Right.WRITE_OWN_ABSENCE;
                    break;
                }
                case 2: {
                    right = Right.READ_OFFICE_HOUR;
                    break;
                }
                case 1: {
                    right = Right.READ_MY_ABSENCES;
                    break;
                }
            }
            return right;
        }
        
        @e
        public final Right fromValue(final int n) {
            while (true) {
                for (final Right right : Right.values()) {
                    if (right.getValue() == n) {
                        Right none = right;
                        if (right == null) {
                            none = Right.NONE;
                        }
                        return none;
                    }
                }
                Right right = null;
                continue;
            }
        }
    }
}
