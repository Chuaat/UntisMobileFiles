// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.reminder;

import androidx.annotation.s;
import org.jetbrains.annotations.f;
import androidx.core.content.d;
import kotlin.h0;
import kotlin.jvm.internal.k0;
import android.graphics.drawable.Drawable;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0007¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "getDrawable", "", "getSmallIconId", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class ReminderTypeKt
{
    @f
    public static final Drawable getDrawable(@e final ReminderType reminderType, @e final Context context) {
        k0.p(reminderType, "<this>");
        k0.p(context, "context");
        final int n = WhenMappings.$EnumSwitchMapping$0[reminderType.ordinal()];
        final Drawable drawable = null;
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    Drawable i = drawable;
                    if (n == 4) {
                        return i;
                    }
                    if (n == 5) {
                        i = drawable;
                        return i;
                    }
                    throw new h0();
                }
                else {
                    n2 = 2131231106;
                }
            }
            else {
                n2 = 2131231109;
            }
        }
        else {
            n2 = 2131231110;
        }
        return d.i(context, n2);
    }
    
    @s
    public static final int getSmallIconId(@e final ReminderType reminderType) {
        k0.p(reminderType, "<this>");
        return 2131231133;
    }
}
