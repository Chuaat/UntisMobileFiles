// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

import kotlin.jvm.internal.k0;
import com.untis.mobile.api.enumeration.ElementType;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b \b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u001d\b\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006," }, d2 = { "Lcom/untis/mobile/persistence/models/EntityType;", "", "", "isTimetableEntity", "isProfileEntity", "isParentRole", "isStudentRole", "", "webUntisKey", "Ljava/lang/String;", "getWebUntisKey", "()Ljava/lang/String;", "", "webuntisId", "I", "getWebuntisId", "()I", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "TEACHER", "PARENT", "STUDENT", "LEGAL_GUARDIAN", "APPRENTICE_REPRESENTATIVE", "ROOM", "CLASS", "SUBJECT", "HOMEWORK", "EXAM", "PROFILE", "PERIOD", "HOLIDAY", "ABSENCE_REASON", "DEPARTMENT", "DUTY", "EVENT_REASON", "EVENT_REASON_GROUP", "TEACHING_METHOD", "SCHOOLYEAR", "TIMEGRID", "EXCUSE_STATUS", "EXEMPTION", "NONE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum EntityType
{
    ABSENCE_REASON(1004, (String)null, 2, (w)null), 
    APPRENTICE_REPRESENTATIVE(21, (String)null, 2, (w)null), 
    CLASS(1, "CLASS");
    
    @e
    public static final Companion Companion;
    
    DEPARTMENT(1005, (String)null, 2, (w)null), 
    DUTY(1006, (String)null, 2, (w)null), 
    EVENT_REASON(1007, (String)null, 2, (w)null), 
    EVENT_REASON_GROUP(1008, (String)null, 2, (w)null), 
    EXAM(70, (String)null, 2, (w)null), 
    EXCUSE_STATUS(1012, (String)null, 2, (w)null), 
    EXEMPTION(1013, (String)null, 2, (w)null), 
    HOLIDAY(1003, (String)null, 2, (w)null), 
    HOMEWORK(67, (String)null, 2, (w)null), 
    LEGAL_GUARDIAN(12, (String)null, 2, (w)null), 
    NONE(0, (String)null, 2, (w)null), 
    PARENT(15, "PARENT"), 
    PERIOD(1002, (String)null, 2, (w)null), 
    PROFILE(1001, (String)null, 2, (w)null), 
    ROOM(4, "ROOM"), 
    SCHOOLYEAR(1010, (String)null, 2, (w)null), 
    STUDENT(5, "STUDENT"), 
    SUBJECT(3, "SUBJECT"), 
    TEACHER(2, "TEACHER"), 
    TEACHING_METHOD(1009, (String)null, 2, (w)null), 
    TIMEGRID(1011, (String)null, 2, (w)null);
    
    @f
    private final String webUntisKey;
    private final int webuntisId;
    
    private static final /* synthetic */ EntityType[] $values() {
        return new EntityType[] { EntityType.TEACHER, EntityType.PARENT, EntityType.STUDENT, EntityType.LEGAL_GUARDIAN, EntityType.APPRENTICE_REPRESENTATIVE, EntityType.ROOM, EntityType.CLASS, EntityType.SUBJECT, EntityType.HOMEWORK, EntityType.EXAM, EntityType.PROFILE, EntityType.PERIOD, EntityType.HOLIDAY, EntityType.ABSENCE_REASON, EntityType.DEPARTMENT, EntityType.DUTY, EntityType.EVENT_REASON, EntityType.EVENT_REASON_GROUP, EntityType.TEACHING_METHOD, EntityType.SCHOOLYEAR, EntityType.TIMEGRID, EntityType.EXCUSE_STATUS, EntityType.EXEMPTION, EntityType.NONE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private EntityType(final int webuntisId, final String webUntisKey) {
        this.webuntisId = webuntisId;
        this.webUntisKey = webUntisKey;
    }
    
    @f
    public final String getWebUntisKey() {
        return this.webUntisKey;
    }
    
    public final int getWebuntisId() {
        return this.webuntisId;
    }
    
    public final boolean isParentRole() {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.ordinal()];
        return n == 7 || n == 8 || n == 9;
    }
    
    public final boolean isProfileEntity() {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.ordinal()];
        boolean b2;
        final boolean b = b2 = true;
        if (n != 1) {
            b2 = b;
            if (n != 2) {
                b2 = b;
                if (n != 5) {
                    b2 = b;
                    if (n != 6) {
                        b2 = b;
                        if (n != 7) {
                            b2 = b;
                            if (n != 8) {
                                b2 = false;
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final boolean isStudentRole() {
        return WhenMappings.$EnumSwitchMapping$0[this.ordinal()] == 2;
    }
    
    public final boolean isTimetableEntity() {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.ordinal()];
        boolean b2;
        final boolean b = b2 = true;
        if (n != 1) {
            b2 = b;
            if (n != 2) {
                b2 = b;
                if (n != 3) {
                    b2 = b;
                    if (n != 4) {
                        b2 = b;
                        if (n != 5) {
                            b2 = false;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0005\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/persistence/models/EntityType$Companion;", "", "Lcom/untis/mobile/api/enumeration/ElementType;", "elementType", "Lcom/untis/mobile/persistence/models/EntityType;", "findBy", "", "webuntisId", "(Ljava/lang/Integer;)Lcom/untis/mobile/persistence/models/EntityType;", "findByOrNull", "", "webUntisKey", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final EntityType findBy(@f final ElementType elementType) {
            while (true) {
                for (final EntityType entityType : EntityType.values()) {
                    if (elementType != null && elementType.getWuType() == entityType.getWebuntisId()) {
                        final EntityType entityType2 = entityType;
                        EntityType none = entityType2;
                        if (entityType2 == null) {
                            none = EntityType.NONE;
                        }
                        return none;
                    }
                }
                final EntityType entityType2 = null;
                continue;
            }
        }
        
        @e
        public final EntityType findBy(@f final Integer n) {
            while (true) {
                for (final EntityType entityType : EntityType.values()) {
                    final int webuntisId = entityType.getWebuntisId();
                    boolean b = false;
                    Label_0054: {
                        if (n != null) {
                            if (n == webuntisId) {
                                b = true;
                                break Label_0054;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        final EntityType entityType2 = entityType;
                        EntityType none = entityType2;
                        if (entityType2 == null) {
                            none = EntityType.NONE;
                        }
                        return none;
                    }
                }
                final EntityType entityType2 = null;
                continue;
            }
        }
        
        @f
        public final EntityType findBy(@f final String s) {
            for (final EntityType entityType : EntityType.values()) {
                if (entityType.getWebUntisKey() != null && k0.g(entityType.getWebUntisKey(), s)) {
                    return entityType;
                }
            }
            return null;
        }
        
        @f
        public final EntityType findByOrNull(@f final Integer n) {
            for (final EntityType entityType : EntityType.values()) {
                final int webuntisId = entityType.getWebuntisId();
                boolean b = false;
                Label_0054: {
                    if (n != null) {
                        if (n == webuntisId) {
                            b = true;
                            break Label_0054;
                        }
                    }
                    b = false;
                }
                if (b) {
                    return entityType;
                }
            }
            return null;
        }
    }
}
