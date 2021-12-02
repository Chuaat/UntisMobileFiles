// 
// Decompiled by Procyon v0.5.36
// 

package t2;

import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.annotation.TargetApi;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.graphics.drawable.RippleDrawable;
import android.content.res.Resources$NotFoundException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParserException;
import android.util.AttributeSet;
import androidx.annotation.d1;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class a
{
    private a() {
    }
    
    @j0
    public static AttributeSet a(@j0 Context xml, @d1 final int i, @j0 final CharSequence obj) {
        try {
            xml = (IOException)((Context)xml).getResources().getXml(i);
            int next;
            do {
                next = ((XmlPullParser)xml).next();
            } while (next != 2 && next != 1);
            if (next != 2) {
                xml = (IOException)new XmlPullParserException("No start tag found");
                throw xml;
            }
            if (TextUtils.equals((CharSequence)((XmlPullParser)xml).getName(), obj)) {
                return Xml.asAttributeSet((XmlPullParser)xml);
            }
            xml = (IOException)new StringBuilder();
            ((StringBuilder)xml).append("Must have a <");
            ((StringBuilder)xml).append((Object)obj);
            ((StringBuilder)xml).append("> start tag");
            throw new XmlPullParserException(((StringBuilder)xml).toString());
        }
        catch (IOException xml) {}
        catch (XmlPullParserException ex2) {}
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't load badge resource ID #0x");
        sb.append(Integer.toHexString(i));
        final Resources$NotFoundException ex = new Resources$NotFoundException(sb.toString());
        ex.initCause((Throwable)xml);
        throw ex;
    }
    
    @TargetApi(21)
    public static void b(@k0 final RippleDrawable ex, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            ((RippleDrawable)ex).setRadius(n);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(ex, n);
            return;
        }
        catch (IllegalAccessException ex) {}
        catch (InvocationTargetException ex) {}
        catch (NoSuchMethodException ex2) {}
        throw new IllegalStateException("Couldn't set RippleDrawable radius", ex);
    }
    
    @k0
    public static PorterDuffColorFilter c(@j0 final Drawable drawable, @k0 final ColorStateList list, @k0 final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(drawable.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
}
