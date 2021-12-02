// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.UMPeriodRight;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodRight;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "READ_STUD_ABSENCE", "WRITE_STUD_ABSENCE", "READ_LESSONTOPIC", "WRITE_LESSONTOPIC", "READ_HOMEWORK", "WRITE_HOMEWORK", "READ_CLASSREGEVENT", "WRITE_CLASSREGEVENT", "DELETE_CLASSREGEVENT", "READ_CLASSROLE", "READ_PERIODINFO", "WRITE_PERIODINFO", "ACTION_CHANGE_ROOM", "READ_CHANNEL", "WRITE_CHANNEL", "NONE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum PeriodRight
{
    ACTION_CHANGE_ROOM(13);
    
    @e
    public static final Companion Companion;
    
    DELETE_CLASSREGEVENT(9), 
    NONE(0), 
    READ_CHANNEL(14), 
    READ_CLASSREGEVENT(7), 
    READ_CLASSROLE(10), 
    READ_HOMEWORK(5), 
    READ_LESSONTOPIC(3), 
    READ_PERIODINFO(11), 
    READ_STUD_ABSENCE(1), 
    WRITE_CHANNEL(15), 
    WRITE_CLASSREGEVENT(8), 
    WRITE_HOMEWORK(6), 
    WRITE_LESSONTOPIC(4), 
    WRITE_PERIODINFO(12), 
    WRITE_STUD_ABSENCE(2);
    
    private final int value;
    
    private static final /* synthetic */ PeriodRight[] $values() {
        return new PeriodRight[] { PeriodRight.READ_STUD_ABSENCE, PeriodRight.WRITE_STUD_ABSENCE, PeriodRight.READ_LESSONTOPIC, PeriodRight.WRITE_LESSONTOPIC, PeriodRight.READ_HOMEWORK, PeriodRight.WRITE_HOMEWORK, PeriodRight.READ_CLASSREGEVENT, PeriodRight.WRITE_CLASSREGEVENT, PeriodRight.DELETE_CLASSREGEVENT, PeriodRight.READ_CLASSROLE, PeriodRight.READ_PERIODINFO, PeriodRight.WRITE_PERIODINFO, PeriodRight.ACTION_CHANGE_ROOM, PeriodRight.READ_CHANNEL, PeriodRight.WRITE_CHANNEL, PeriodRight.NONE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private PeriodRight(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodRight$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodRight;", "fromValue", "Lcom/untis/mobile/api/enumeration/UMPeriodRight;", "umPeriodRight", "fromUmPeriodRight", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final PeriodRight fromUmPeriodRight(@f final UMPeriodRight umPeriodRight) {
            int n;
            if (umPeriodRight == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[umPeriodRight.ordinal()];
            }
            PeriodRight periodRight = null;
            switch (n) {
                default: {
                    periodRight = PeriodRight.NONE;
                    break;
                }
                case 15: {
                    periodRight = PeriodRight.WRITE_CHANNEL;
                    break;
                }
                case 14: {
                    periodRight = PeriodRight.READ_CHANNEL;
                    break;
                }
                case 13: {
                    periodRight = PeriodRight.ACTION_CHANGE_ROOM;
                    break;
                }
                case 12: {
                    periodRight = PeriodRight.WRITE_PERIODINFO;
                    break;
                }
                case 11: {
                    periodRight = PeriodRight.READ_PERIODINFO;
                    break;
                }
                case 10: {
                    periodRight = PeriodRight.READ_CLASSROLE;
                    break;
                }
                case 9: {
                    periodRight = PeriodRight.DELETE_CLASSREGEVENT;
                    break;
                }
                case 8: {
                    periodRight = PeriodRight.WRITE_CLASSREGEVENT;
                    break;
                }
                case 7: {
                    periodRight = PeriodRight.READ_CLASSREGEVENT;
                    break;
                }
                case 6: {
                    periodRight = PeriodRight.WRITE_HOMEWORK;
                    break;
                }
                case 5: {
                    periodRight = PeriodRight.READ_HOMEWORK;
                    break;
                }
                case 4: {
                    periodRight = PeriodRight.WRITE_LESSONTOPIC;
                    break;
                }
                case 3: {
                    periodRight = PeriodRight.READ_LESSONTOPIC;
                    break;
                }
                case 2: {
                    periodRight = PeriodRight.WRITE_STUD_ABSENCE;
                    break;
                }
                case 1: {
                    periodRight = PeriodRight.READ_STUD_ABSENCE;
                    break;
                }
            }
            return periodRight;
        }
        
        @e
        public final PeriodRight fromValue(final int n) {
            while (true) {
                for (final PeriodRight periodRight : PeriodRight.values()) {
                    if (periodRight.getValue() == n) {
                        PeriodRight none = periodRight;
                        if (periodRight == null) {
                            none = PeriodRight.NONE;
                        }
                        return none;
                    }
                }
                PeriodRight periodRight = null;
                continue;
            }
        }
    }
}
