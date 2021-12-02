// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.notifications;

import android.app.Activity;
import com.untis.mobile.ui.core.CoreActivity;
import android.util.Log;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import java.util.List;

public class g extends b<List<OfficeHour>>
{
    private Profile H;
    
    public g(@j0 final Profile h, @j0 final List<OfficeHour> list) {
        super(list);
        this.H = h;
    }
    
    @j0
    @Override
    public Drawable a(@j0 final Context context) {
        return d.i(context, 2131230926);
    }
    
    @j0
    @Override
    public String b(@j0 final Context context) {
        final int size = ((b<List>)this).c().size();
        if (size == 0) {
            return context.getString(2131886581);
        }
        if (size == 1) {
            return context.getString(2131886583);
        }
        return context.getString(2131886588).replace("{0}", String.valueOf(size));
    }
    
    @j0
    @Override
    public String d(@j0 final Context context) {
        return context.getString(2131886251);
    }
    
    @Override
    public void e(@j0 final com.untis.mobile.ui.activities.common.b b) {
        final Profile h = this.H;
        if (h == null) {
            Log.d("untis_log", "no profile");
            return;
        }
        ((Activity)b).startActivity(CoreActivity.K.a((Context)b, h.getUniqueId(), this.H.getLastViewedEntityType(), this.H.getLastViewedEntityId()));
    }
}
