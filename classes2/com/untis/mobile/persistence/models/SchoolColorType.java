// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

import kotlin.h0;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.AppColorType;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!" }, d2 = { "Lcom/untis/mobile/persistence/models/SchoolColorType;", "", "", "background", "I", "getBackground", "()I", "id", "getId", "<init>", "(Ljava/lang/String;III)V", "Companion", "Free", "Lesson", "Reservation", "Booking", "Storno", "BookingLock", "Holiday", "HolidayLock", "Conflict", "Substitution", "Cancelled", "WithoutElement", "ElementChanged", "Shift", "SpecialDuty", "Exam", "BreakSupervision", "Standby", "ContactHour", "Absence", "Worktime", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum SchoolColorType
{
    Absence(20, -1755865), 
    Booking(4, -5194752), 
    BookingLock(6, -5131340), 
    BreakSupervision(17, -1413469), 
    Cancelled(11, -5131340);
    
    @e
    public static final Companion Companion;
    
    Conflict(9, -1755865), 
    ContactHour(19, -745691), 
    ElementChanged(13, -5799499), 
    Exam(16, -4864), 
    Free(1, -1249811), 
    Holiday(7, -11292963), 
    HolidayLock(8, -6104844), 
    Lesson(2, -745691), 
    Reservation(3, -2630278), 
    Shift(14, -5799499), 
    SpecialDuty(15, -5799499), 
    Standby(18, -745691), 
    Storno(5, -801664), 
    Substitution(10, -5799499), 
    WithoutElement(12, -5131340), 
    Worktime(21, -5965154);
    
    private final int background;
    private final int id;
    
    private static final /* synthetic */ SchoolColorType[] $values() {
        return new SchoolColorType[] { SchoolColorType.Free, SchoolColorType.Lesson, SchoolColorType.Reservation, SchoolColorType.Booking, SchoolColorType.Storno, SchoolColorType.BookingLock, SchoolColorType.Holiday, SchoolColorType.HolidayLock, SchoolColorType.Conflict, SchoolColorType.Substitution, SchoolColorType.Cancelled, SchoolColorType.WithoutElement, SchoolColorType.ElementChanged, SchoolColorType.Shift, SchoolColorType.SpecialDuty, SchoolColorType.Exam, SchoolColorType.BreakSupervision, SchoolColorType.Standby, SchoolColorType.ContactHour, SchoolColorType.Absence, SchoolColorType.Worktime };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private SchoolColorType(final int id, final int background) {
        this.id = id;
        this.background = background;
    }
    
    public final int getBackground() {
        return this.background;
    }
    
    public final int getId() {
        return this.id;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/SchoolColorType$Companion;", "", "", "id", "Lcom/untis/mobile/persistence/models/SchoolColorType;", "findBy", "(Ljava/lang/Integer;)Lcom/untis/mobile/persistence/models/SchoolColorType;", "Lcom/untis/mobile/api/enumeration/AppColorType;", "appColorType", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final SchoolColorType findBy(@f final AppColorType appColorType) {
            int n;
            if (appColorType == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[appColorType.ordinal()];
            }
            SchoolColorType schoolColorType = null;
            switch (n) {
                default: {
                    throw new h0();
                }
                case 21: {
                    schoolColorType = SchoolColorType.Worktime;
                    break;
                }
                case 20: {
                    schoolColorType = SchoolColorType.Absence;
                    break;
                }
                case 19: {
                    schoolColorType = SchoolColorType.ContactHour;
                    break;
                }
                case 18: {
                    schoolColorType = SchoolColorType.Standby;
                    break;
                }
                case 17: {
                    schoolColorType = SchoolColorType.BreakSupervision;
                    break;
                }
                case 16: {
                    schoolColorType = SchoolColorType.Exam;
                    break;
                }
                case 15: {
                    schoolColorType = SchoolColorType.SpecialDuty;
                    break;
                }
                case 14: {
                    schoolColorType = SchoolColorType.Shift;
                    break;
                }
                case 13: {
                    schoolColorType = SchoolColorType.ElementChanged;
                    break;
                }
                case 12: {
                    schoolColorType = SchoolColorType.WithoutElement;
                    break;
                }
                case 11: {
                    schoolColorType = SchoolColorType.Cancelled;
                    break;
                }
                case 10: {
                    schoolColorType = SchoolColorType.Substitution;
                    break;
                }
                case 9: {
                    schoolColorType = SchoolColorType.Conflict;
                    break;
                }
                case 8: {
                    schoolColorType = SchoolColorType.HolidayLock;
                    break;
                }
                case 7: {
                    schoolColorType = SchoolColorType.Holiday;
                    break;
                }
                case 6: {
                    schoolColorType = SchoolColorType.BookingLock;
                    break;
                }
                case 5: {
                    schoolColorType = SchoolColorType.Storno;
                    break;
                }
                case 4: {
                    schoolColorType = SchoolColorType.Booking;
                    break;
                }
                case 3: {
                    schoolColorType = SchoolColorType.Reservation;
                    break;
                }
                case 2: {
                    schoolColorType = SchoolColorType.Lesson;
                    break;
                }
                case 1: {
                    schoolColorType = SchoolColorType.Free;
                    break;
                }
                case -1: {
                    schoolColorType = null;
                    break;
                }
            }
            return schoolColorType;
        }
        
        @f
        public final SchoolColorType findBy(@f final Integer n) {
            for (final SchoolColorType schoolColorType : SchoolColorType.values()) {
                final int id = schoolColorType.getId();
                boolean b = false;
                Label_0054: {
                    if (n != null) {
                        if (id == n) {
                            b = true;
                            break Label_0054;
                        }
                    }
                    b = false;
                }
                if (b) {
                    return schoolColorType;
                }
            }
            return null;
        }
    }
}
