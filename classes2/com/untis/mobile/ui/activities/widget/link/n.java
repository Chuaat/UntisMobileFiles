// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.widget.link;

import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class n extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final Profile I;
    @j0
    private final List<EntityType> J;
    
    public n(@j0 Context applicationContext, @j0 final Profile i, @j0 final List<EntityType> list) {
        final ArrayList<Object> j = new ArrayList<Object>();
        this.J = (List<EntityType>)j;
        applicationContext = applicationContext.getApplicationContext();
        this.G = applicationContext;
        this.H = LayoutInflater.from(applicationContext);
        this.I = i;
        j.addAll(list);
    }
    
    @j0
    private Drawable a(@j0 final EntityType entityType) {
        final int n = n$a.a[entityType.ordinal()];
        Context context;
        int n2;
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    if (n != 5) {
                        context = this.G;
                        n2 = 2131230884;
                    }
                    else {
                        context = this.G;
                        n2 = 2131230932;
                    }
                }
                else {
                    context = this.G;
                    n2 = 2131230951;
                }
            }
            else {
                context = this.G;
                n2 = 2131230952;
            }
        }
        else {
            context = this.G;
            n2 = 2131230876;
        }
        return d.i(context, n2);
    }
    
    @j0
    private String c(@j0 final EntityType entityType) {
        final int n = n$a.a[entityType.ordinal()];
        Context context;
        int n2;
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    if (n != 5) {
                        return "?";
                    }
                    context = this.G;
                    n2 = 2131886767;
                }
                else {
                    context = this.G;
                    n2 = 2131886781;
                }
            }
            else {
                context = this.G;
                n2 = 2131886783;
            }
        }
        else {
            context = this.G;
            n2 = 2131886680;
        }
        return context.getString(n2);
    }
    
    public EntityType b(final int n) {
        return this.J.get(n);
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final EntityType b = this.b(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493272, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298372);
        final TextView textView = (TextView)inflate.findViewById(2131298373);
        imageView.setImageDrawable(this.a(b));
        textView.setText((CharSequence)this.c(b));
        return inflate;
    }
}
