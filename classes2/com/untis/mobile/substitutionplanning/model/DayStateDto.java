// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB+\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001a¨\u0006 " }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/DayStateDto;", "", "", "component1", "component2", "Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;", "component3", "date", "displayName", "state", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;", "getState", "()Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;", "setState", "(Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;)V", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getDate", "setDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;)V", "StateEnum", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DayStateDto
{
    @f
    private String date;
    @f
    private String displayName;
    @f
    private StateEnum state;
    
    public DayStateDto() {
        this(null, null, null, 7, null);
    }
    
    public DayStateDto(@f final String date, @f final String displayName, @f final StateEnum state) {
        this.date = date;
        this.displayName = displayName;
        this.state = state;
    }
    
    @f
    public final String component1() {
        return this.date;
    }
    
    @f
    public final String component2() {
        return this.displayName;
    }
    
    @f
    public final StateEnum component3() {
        return this.state;
    }
    
    @e
    public final DayStateDto copy(@f final String s, @f final String s2, @f final StateEnum stateEnum) {
        return new DayStateDto(s, s2, stateEnum);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DayStateDto)) {
            return false;
        }
        final DayStateDto dayStateDto = (DayStateDto)o;
        return k0.g(this.date, dayStateDto.date) && k0.g(this.displayName, dayStateDto.displayName) && this.state == dayStateDto.state;
    }
    
    @f
    public final String getDate() {
        return this.date;
    }
    
    @f
    public final String getDisplayName() {
        return this.displayName;
    }
    
    @f
    public final StateEnum getState() {
        return this.state;
    }
    
    @Override
    public int hashCode() {
        final String date = this.date;
        int hashCode = 0;
        int hashCode2;
        if (date == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = date.hashCode();
        }
        final String displayName = this.displayName;
        int hashCode3;
        if (displayName == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = displayName.hashCode();
        }
        final StateEnum state = this.state;
        if (state != null) {
            hashCode = state.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void setDate(@f final String date) {
        this.date = date;
    }
    
    public final void setDisplayName(@f final String displayName) {
        this.displayName = displayName;
    }
    
    public final void setState(@f final StateEnum state) {
        this.state = state;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DayStateDto(date=");
        sb.append((Object)this.date);
        sb.append(", displayName=");
        sb.append((Object)this.displayName);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;", "", "", "id", "I", "getId", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "WEEKEND_NOWORK", "NOWORK", "WORK", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum StateEnum
    {
        @e
        public static final Companion Companion;
        
        NOWORK(2), 
        WEEKEND_NOWORK(1), 
        WORK(3);
        
        private final int id;
        
        private static final /* synthetic */ StateEnum[] $values() {
            return new StateEnum[] { StateEnum.WEEKEND_NOWORK, StateEnum.NOWORK, StateEnum.WORK };
        }
        
        static {
            $VALUES = $values();
            Companion = new Companion(null);
        }
        
        private StateEnum(final int id) {
            this.id = id;
        }
        
        public final int getId() {
            return this.id;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum$Companion;", "", "", "id", "Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;", "findBy", "(Ljava/lang/Integer;)Lcom/untis/mobile/substitutionplanning/model/DayStateDto$StateEnum;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        public static final class Companion
        {
            private Companion() {
            }
            
            @f
            public final StateEnum findBy(@f final Integer n) {
                for (final StateEnum stateEnum : StateEnum.values()) {
                    final int id = stateEnum.getId();
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
                        return stateEnum;
                    }
                }
                return null;
            }
        }
    }
}
