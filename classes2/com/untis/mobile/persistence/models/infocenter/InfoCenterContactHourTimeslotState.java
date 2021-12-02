// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.UMOfficeHourRegistrationTimeSlotState;
import androidx.core.content.d;
import kotlin.h0;
import kotlin.jvm.internal.k0;
import android.content.Context;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;", "", "Landroid/content/Context;", "context", "", "getTextcolor", "", "getTitle", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "Free", "BookedByOther", "Registered", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum InfoCenterContactHourTimeslotState
{
    BookedByOther(1);
    
    @e
    public static final Companion Companion;
    
    Free(0), 
    Registered(2);
    
    private final int value;
    
    private static final /* synthetic */ InfoCenterContactHourTimeslotState[] $values() {
        return new InfoCenterContactHourTimeslotState[] { InfoCenterContactHourTimeslotState.Free, InfoCenterContactHourTimeslotState.BookedByOther, InfoCenterContactHourTimeslotState.Registered };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private InfoCenterContactHourTimeslotState(final int value) {
        this.value = value;
    }
    
    public final int getTextcolor(@e final Context context) {
        k0.p(context, "context");
        final int n = WhenMappings.$EnumSwitchMapping$0[this.ordinal()];
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                n2 = 2131099701;
            }
            else {
                n2 = 2131099700;
            }
        }
        else {
            n2 = 2131099699;
        }
        return d.f(context, n2);
    }
    
    @e
    public final String getTitle(@e final Context context) {
        k0.p(context, "context");
        final int n = WhenMappings.$EnumSwitchMapping$0[this.ordinal()];
        String s;
        String s2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                s = context.getString(2131886249);
                s2 = "context.getString(R.string.contactHours_registeredState_text)";
            }
            else {
                s = context.getString(2131886253);
                s2 = "context.getString(R.string.contactHours_scheduledState_text)";
            }
        }
        else {
            s = context.getString(2131886246);
            s2 = "context.getString(R.string.contactHours_availableState_text)";
        }
        k0.o(s, s2);
        return s;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;", "findBy", "(Ljava/lang/Integer;)Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;", "Lcom/untis/mobile/api/enumeration/UMOfficeHourRegistrationTimeSlotState;", "state", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final InfoCenterContactHourTimeslotState findBy(@f final UMOfficeHourRegistrationTimeSlotState umOfficeHourRegistrationTimeSlotState) {
            int n;
            if (umOfficeHourRegistrationTimeSlotState == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[umOfficeHourRegistrationTimeSlotState.ordinal()];
            }
            InfoCenterContactHourTimeslotState infoCenterContactHourTimeslotState;
            if (n != 1) {
                if (n != 2 && n == 3) {
                    infoCenterContactHourTimeslotState = InfoCenterContactHourTimeslotState.Registered;
                }
                else {
                    infoCenterContactHourTimeslotState = InfoCenterContactHourTimeslotState.BookedByOther;
                }
            }
            else {
                infoCenterContactHourTimeslotState = InfoCenterContactHourTimeslotState.Free;
            }
            return infoCenterContactHourTimeslotState;
        }
        
        @e
        public final InfoCenterContactHourTimeslotState findBy(@f final Integer n) {
            while (true) {
                for (final InfoCenterContactHourTimeslotState infoCenterContactHourTimeslotState : InfoCenterContactHourTimeslotState.values()) {
                    final int value = infoCenterContactHourTimeslotState.getValue();
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
                        final InfoCenterContactHourTimeslotState infoCenterContactHourTimeslotState2 = infoCenterContactHourTimeslotState;
                        InfoCenterContactHourTimeslotState bookedByOther = infoCenterContactHourTimeslotState2;
                        if (infoCenterContactHourTimeslotState2 == null) {
                            bookedByOther = InfoCenterContactHourTimeslotState.BookedByOther;
                        }
                        return bookedByOther;
                    }
                }
                final InfoCenterContactHourTimeslotState infoCenterContactHourTimeslotState2 = null;
                continue;
            }
        }
    }
}
