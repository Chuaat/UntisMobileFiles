// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.timetableselection;

import com.untis.mobile.utils.comparator.b;
import com.untis.mobile.persistence.models.EntityType;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import android.content.Context;
import com.untis.mobile.persistence.models.masterdata.Room;

public class g extends c<Room>
{
    public g(@j0 final Context context, @j0 final Profile profile, @j0 final List<Room> list) {
        super(context, profile, list);
    }
    
    @j0
    @Override
    protected Drawable f(@j0 final Context context) {
        return d.i(context, 2131230932);
    }
    
    @j0
    @Override
    protected EntityType g() {
        return EntityType.ROOM;
    }
    
    public long getItemId(final int n) {
        return this.getItem(n).getId();
    }
    
    protected void p(@j0 final Room room, @j0 final TextView textView, @j0 final TextView textView2) {
        textView.setText((CharSequence)this.b(room.getDisplayableTitle()));
        textView2.setText((CharSequence)this.b(room.getDisplayableDescription()));
    }
    
    protected boolean q(@j0 final Room room, @j0 final String s) {
        return room.getName().toLowerCase().contains(s.toLowerCase()) || room.getLongName().toLowerCase().contains(s.toLowerCase());
    }
    
    protected int r(@j0 final Room room, @j0 final Room room2) {
        return b.G.b(room.getDisplayableTitle(), room2.getDisplayableTitle());
    }
}
