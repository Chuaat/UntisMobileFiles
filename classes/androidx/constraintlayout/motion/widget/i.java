// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import java.util.Set;
import java.util.Iterator;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import androidx.constraintlayout.widget.a;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public class i
{
    public static final int b = -1;
    private static final String c = "CustomMethod";
    private static final String d = "CustomAttribute";
    static HashMap<String, Constructor<? extends f>> e;
    private static final String f = "KeyFrames";
    private HashMap<Integer, ArrayList<f>> a;
    
    static {
        final HashMap<String, Constructor<? extends f>> hashMap = i.e = new HashMap<String, Constructor<? extends f>>();
        try {
            hashMap.put("KeyAttribute", g.class.getConstructor((Class<?>[])new Class[0]));
            i.e.put("KeyPosition", j.class.getConstructor((Class<?>[])new Class[0]));
            i.e.put("KeyCycle", h.class.getConstructor((Class<?>[])new Class[0]));
            i.e.put("KeyTimeCycle", l.class.getConstructor((Class<?>[])new Class[0]));
            i.e.put("KeyTrigger", m.class.getConstructor((Class<?>[])new Class[0]));
        }
        catch (NoSuchMethodException ex) {
            Log.e("KeyFrames", "unable to load", (Throwable)ex);
        }
    }
    
    public i() {
        this.a = new HashMap<Integer, ArrayList<f>>();
    }
    
    public i(final Context context, final XmlPullParser xmlPullParser) {
        this.a = new HashMap<Integer, ArrayList<f>>();
        f f = null;
        try {
            f f2;
            for (int i = xmlPullParser.getEventType(); i != 1; i = xmlPullParser.next(), f = f2) {
                if (i != 2) {
                    if (i != 3) {
                        f2 = f;
                    }
                    else {
                        f2 = f;
                        if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                            return;
                        }
                    }
                }
                else {
                    final String name = xmlPullParser.getName();
                    if (i.e.containsKey(name)) {
                        Label_0216: {
                            Label_0206: {
                                try {
                                    final Constructor<? extends f> constructor = i.e.get(name);
                                    if (constructor != null) {
                                        final f f3 = (f)constructor.newInstance(new Object[0]);
                                        try {
                                            f3.f(context, Xml.asAttributeSet(xmlPullParser));
                                            this.c(f3);
                                            f = f3;
                                            break Label_0216;
                                        }
                                        catch (Exception name) {
                                            f = f3;
                                            break Label_0206;
                                        }
                                    }
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Keymaker for ");
                                    sb.append(name);
                                    sb.append(" not found");
                                    throw new NullPointerException(sb.toString());
                                }
                                catch (Exception ex3) {}
                            }
                            Log.e("KeyFrames", "unable to create ", (Throwable)name);
                        }
                        f2 = f;
                    }
                    else {
                        HashMap<String, a> hashMap;
                        if (name.equalsIgnoreCase("CustomAttribute")) {
                            if ((f2 = f) == null) {
                                continue;
                            }
                            final HashMap<String, a> e = f.e;
                            f2 = f;
                            if (e == null) {
                                continue;
                            }
                            hashMap = e;
                        }
                        else {
                            f2 = f;
                            if (!name.equalsIgnoreCase("CustomMethod") || (f2 = f) == null) {
                                continue;
                            }
                            final HashMap<String, a> e2 = f.e;
                            f2 = f;
                            if (e2 == null) {
                                continue;
                            }
                            hashMap = e2;
                        }
                        androidx.constraintlayout.widget.a.j(context, xmlPullParser, hashMap);
                        f2 = f;
                    }
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    static String f(final int n, final Context context) {
        return context.getResources().getResourceEntryName(n);
    }
    
    public void a(final o o) {
        final ArrayList<f> list = this.a.get(-1);
        if (list != null) {
            o.b(list);
        }
    }
    
    public void b(final o o) {
        final ArrayList<f> list = this.a.get(o.c);
        if (list != null) {
            o.b(list);
        }
        final ArrayList<f> list2 = this.a.get(-1);
        if (list2 != null) {
            for (final f f : list2) {
                if (f.g(((ConstraintLayout.b)o.b.getLayoutParams()).b0)) {
                    o.a(f);
                }
            }
        }
    }
    
    public void c(final f e) {
        if (!this.a.containsKey(e.b)) {
            this.a.put(e.b, new ArrayList<f>());
        }
        final ArrayList<f> list = this.a.get(e.b);
        if (list != null) {
            list.add(e);
        }
    }
    
    public ArrayList<f> d(final int i) {
        return this.a.get(i);
    }
    
    public Set<Integer> e() {
        return this.a.keySet();
    }
}
