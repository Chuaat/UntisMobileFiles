// 
// Decompiled by Procyon v0.5.36
// 

package androidx.vectordrawable.graphics.drawable;

import android.content.res.XmlResourceParser;
import androidx.interpolator.view.animation.b;
import android.content.res.Resources$NotFoundException;
import androidx.interpolator.view.animation.c;
import androidx.interpolator.view.animation.a;
import android.view.animation.AnimationUtils;
import android.os.Build$VERSION;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.AttributeSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.util.Xml;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class d
{
    private d() {
    }
    
    private static Interpolator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
        Object o = null;
        while (true) {
            final int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return (Interpolator)o;
            }
            if (next != 2) {
                continue;
            }
            final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
            final String name = xmlPullParser.getName();
            if (name.equals("linearInterpolator")) {
                o = new LinearInterpolator();
            }
            else if (name.equals("accelerateInterpolator")) {
                o = new AccelerateInterpolator(context, attributeSet);
            }
            else if (name.equals("decelerateInterpolator")) {
                o = new DecelerateInterpolator(context, attributeSet);
            }
            else if (name.equals("accelerateDecelerateInterpolator")) {
                o = new AccelerateDecelerateInterpolator();
            }
            else if (name.equals("cycleInterpolator")) {
                o = new CycleInterpolator(context, attributeSet);
            }
            else if (name.equals("anticipateInterpolator")) {
                o = new AnticipateInterpolator(context, attributeSet);
            }
            else if (name.equals("overshootInterpolator")) {
                o = new OvershootInterpolator(context, attributeSet);
            }
            else if (name.equals("anticipateOvershootInterpolator")) {
                o = new AnticipateOvershootInterpolator(context, attributeSet);
            }
            else if (name.equals("bounceInterpolator")) {
                o = new BounceInterpolator();
            }
            else {
                if (!name.equals("pathInterpolator")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown interpolator name: ");
                    sb.append(xmlPullParser.getName());
                    throw new RuntimeException(sb.toString());
                }
                o = new g(context, attributeSet, xmlPullParser);
            }
        }
    }
    
    public static Interpolator b(final Context context, final int i) throws Resources$NotFoundException {
        if (Build$VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        final XmlResourceParser xmlResourceParser = null;
        Label_0049: {
            if (i != 17563663) {
                break Label_0049;
            }
            try {
                try {
                    return (Interpolator)new a();
                }
                finally {
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    return (Interpolator)new c();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't load animation resource ID #0x");
                    sb.append(Integer.toHexString(i));
                    final Resources$NotFoundException ex = new Resources$NotFoundException(sb.toString());
                    final IOException ex2;
                    ex.initCause((Throwable)ex2);
                    throw ex;
                    final Interpolator a;
                    Label_0124: {
                        return a;
                    }
                    final XmlResourceParser animation;
                    animation.close();
                    return a;
                    // iftrue(Label_0063:, i != 17563661)
                    return (Interpolator)new b();
                    Label_0063:
                    // iftrue(Label_0077:, i != 17563662)
                    return (Interpolator)new c();
                    Label_0077:
                    animation = context.getResources().getAnimation(i);
                    a = a(context, context.getResources(), context.getTheme(), (XmlPullParser)animation);
                }
                // iftrue(Label_0124:, animation == null)
            }
            catch (IOException ex3) {}
            catch (XmlPullParserException ex4) {}
        }
    }
}
