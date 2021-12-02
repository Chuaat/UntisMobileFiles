// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.widget.link;

import org.joda.time.base.e;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.SimpleEntity;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class i extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final Profile I;
    @j0
    private final List<SimpleEntity> J;
    private final a K;
    
    public i(@j0 Context applicationContext, @j0 final Profile i, @j0 final List<SimpleEntity> j) {
        applicationContext = applicationContext.getApplicationContext();
        this.G = applicationContext;
        this.H = LayoutInflater.from(applicationContext);
        this.I = i;
        this.J = j;
        this.K = i.getMasterDataService();
    }
    
    @j0
    private String b(@j0 final SimpleEntity simpleEntity) {
        if (EntityType.CLASS.equals(simpleEntity.getType())) {
            final Klasse n = this.K.N(simpleEntity.getId());
            if (n != null && ((e)n.getStart()).m((n0)com.untis.mobile.utils.time.a.b())) {
                final StringBuilder sb = new StringBuilder();
                sb.append(n.getDisplayName());
                sb.append(" - ");
                sb.append(this.G.getString(2131886723).replace("{0}", n.getStart().g4("dd.MM.yyyy")));
                return sb.toString();
            }
        }
        final DisplayableEntity v = this.K.v(simpleEntity.getType(), simpleEntity.getId());
        if (v == null) {
            return "???";
        }
        return v.getDisplayableDescription();
    }
    
    @j0
    private String c(@j0 final SimpleEntity simpleEntity) {
        final DisplayableEntity v = this.K.v(simpleEntity.getType(), simpleEntity.getId());
        if (v == null) {
            return "???";
        }
        return v.getDisplayableTitle();
    }
    
    public SimpleEntity a(final int n) {
        return this.J.get(n);
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int visibility, final View view, final ViewGroup viewGroup) {
        final SimpleEntity a = this.a(visibility);
        visibility = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493268, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131298365);
        final TextView textView2 = (TextView)inflate.findViewById(2131298364);
        textView.setText((CharSequence)this.c(a));
        textView2.setText((CharSequence)this.b(a));
        if (textView.getText().toString().equals(textView2.getText().toString())) {
            visibility = 8;
        }
        textView2.setVisibility(visibility);
        return inflate;
    }
}
