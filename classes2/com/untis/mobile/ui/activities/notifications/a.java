// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.notifications;

import android.app.Activity;
import com.untis.mobile.ui.activities.messageofday.MessageOfDaysActivity;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.List;

public class a extends b<List<MessageOfDay>>
{
    private boolean H;
    @j0
    private final Profile I;
    
    public a(@j0 final Profile i, @j0 final List<MessageOfDay> list, final boolean h) {
        super(list);
        this.I = i;
        this.H = h;
    }
    
    @j0
    @Override
    public Drawable a(@j0 final Context context) {
        return d.i(context, 2131230918);
    }
    
    @j0
    @Override
    public String b(@j0 final Context context) {
        final int size = ((b<List>)this).c().size();
        if (size == 0) {
            return context.getString(2131886375);
        }
        if (this.H) {
            return context.getString(2131886377).replace("{0}", String.valueOf(size));
        }
        return context.getString(2131886376).replace("{0}", String.valueOf(size));
    }
    
    @j0
    @Override
    public String d(@j0 final Context context) {
        return context.getString(2131886483);
    }
    
    @Override
    public void e(@j0 final com.untis.mobile.ui.activities.common.b b) {
        ((Activity)b).startActivity(MessageOfDaysActivity.I.a(this.I.getUniqueId()));
    }
}
