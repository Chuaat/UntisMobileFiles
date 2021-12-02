// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import android.annotation.SuppressLint;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import androidx.annotation.i0;
import android.text.TextUtils;
import android.os.Bundle;
import v0.a;
import java.io.IOException;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParserException;
import androidx.annotation.j0;
import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.t0;

public final class n0
{
    private static final String c = "argument";
    private static final String d = "deepLink";
    private static final String e = "action";
    private static final String f = "include";
    @t0({ t0.a.H })
    public static final String g = "${applicationId}";
    private static final ThreadLocal<TypedValue> h;
    private Context a;
    private v0 b;
    
    static {
        h = new ThreadLocal<TypedValue>();
    }
    
    public n0(@j0 final Context a, @j0 final v0 b) {
        this.a = a;
        this.b = b;
    }
    
    private static s0 a(final TypedValue typedValue, s0 s0, final s0 s2, final String str, final String str2) throws XmlPullParserException {
        if (s0 != null && s0 != s2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Type is ");
            sb.append(str);
            sb.append(" but found ");
            sb.append(str2);
            sb.append(": ");
            sb.append(typedValue.data);
            throw new XmlPullParserException(sb.toString());
        }
        if (s0 == null) {
            s0 = s2;
        }
        return s0;
    }
    
    @j0
    private a0 b(@j0 final Resources resources, @j0 final XmlResourceParser xmlResourceParser, @j0 final AttributeSet set, final int n) throws XmlPullParserException, IOException {
        final e0 a = this.b.e(xmlResourceParser.getName()).a();
        a.z(this.a, set);
        final int n2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            final int next = xmlResourceParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlResourceParser.getDepth();
            if (depth < n2 && next == 3) {
                break;
            }
            if (next != 2) {
                continue;
            }
            if (depth > n2) {
                continue;
            }
            final String name = xmlResourceParser.getName();
            if ("argument".equals(name)) {
                this.g(resources, a, set, n);
            }
            else if ("deepLink".equals(name)) {
                this.h(resources, a, set);
            }
            else if ("action".equals(name)) {
                this.d(resources, a, set, xmlResourceParser, n);
            }
            else if ("include".equals(name) && a instanceof e0) {
                final TypedArray obtainAttributes = resources.obtainAttributes(set, z0.j.r0);
                a.K(this.c(obtainAttributes.getResourceId(z0.j.s0, 0)));
                obtainAttributes.recycle();
            }
            else {
                if (!(a instanceof e0)) {
                    continue;
                }
                a.K(this.b(resources, xmlResourceParser, set, n));
            }
        }
        return a;
    }
    
    private void d(@j0 final Resources resources, @j0 final a0 a0, @j0 final AttributeSet set, final XmlResourceParser xmlResourceParser, final int n) throws IOException, XmlPullParserException {
        final TypedArray obtainAttributes = resources.obtainAttributes(set, v0.a.j.N);
        final int resourceId = obtainAttributes.getResourceId(v0.a.j.O, 0);
        final j j = new j(obtainAttributes.getResourceId(v0.a.j.P, 0));
        final o0.a a2 = new o0.a();
        a2.d(obtainAttributes.getBoolean(v0.a.j.S, false));
        a2.g(obtainAttributes.getResourceId(v0.a.j.V, -1), obtainAttributes.getBoolean(v0.a.j.W, false));
        a2.b(obtainAttributes.getResourceId(v0.a.j.Q, -1));
        a2.c(obtainAttributes.getResourceId(v0.a.j.R, -1));
        a2.e(obtainAttributes.getResourceId(v0.a.j.T, -1));
        a2.f(obtainAttributes.getResourceId(v0.a.j.U, -1));
        j.e(a2.a());
        final Bundle bundle = new Bundle();
        final int n2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            final int next = xmlResourceParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlResourceParser.getDepth();
            if (depth < n2 && next == 3) {
                break;
            }
            if (next != 2) {
                continue;
            }
            if (depth > n2) {
                continue;
            }
            if (!"argument".equals(xmlResourceParser.getName())) {
                continue;
            }
            this.f(resources, bundle, set, n);
        }
        if (!bundle.isEmpty()) {
            j.d(bundle);
        }
        a0.C(resourceId, j);
        obtainAttributes.recycle();
    }
    
    @j0
    private o e(@j0 final TypedArray typedArray, @j0 final Resources resources, int i) throws XmlPullParserException {
        final o.a a = new o.a();
        final int b0 = v0.a.j.b0;
        boolean b2 = false;
        a.c(typedArray.getBoolean(b0, false));
        final ThreadLocal<TypedValue> h = n0.h;
        TypedValue value;
        if ((value = h.get()) == null) {
            value = new TypedValue();
            h.set(value);
        }
        final String string = typedArray.getString(v0.a.j.a0);
        Object o = null;
        s0<?> a2;
        if (string != null) {
            a2 = s0.a(string, resources.getResourcePackageName(i));
        }
        else {
            a2 = null;
        }
        i = v0.a.j.Z;
        s0<?> s0 = a2;
        Label_0660: {
            if (typedArray.getValue(i, value)) {
                s0 = androidx.navigation.s0.c;
                Label_0149: {
                    if (a2 == s0) {
                        i = value.resourceId;
                        if (i != 0) {
                            s0 = a2;
                        }
                        else {
                            if (value.type == 16 && value.data == 0) {
                                o = 0;
                                s0 = a2;
                                break Label_0660;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("unsupported value '");
                            sb.append((Object)value.string);
                            sb.append("' for ");
                            sb.append(a2.c());
                            sb.append(". Must be a reference to a resource.");
                            throw new XmlPullParserException(sb.toString());
                        }
                    }
                    else {
                        final int resourceId = value.resourceId;
                        if (resourceId != 0) {
                            if (a2 == null) {
                                o = resourceId;
                                break Label_0660;
                            }
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("unsupported value '");
                            sb2.append((Object)value.string);
                            sb2.append("' for ");
                            sb2.append(a2.c());
                            sb2.append(". You must use a \"");
                            sb2.append(s0.c());
                            sb2.append("\" type to reference other resources.");
                            throw new XmlPullParserException(sb2.toString());
                        }
                        else {
                            if (a2 == androidx.navigation.s0.k) {
                                o = typedArray.getString(i);
                                s0 = a2;
                                break Label_0660;
                            }
                            i = value.type;
                            if (i != 3) {
                                float float1;
                                if (i != 4) {
                                    if (i == 5) {
                                        s0 = (s0<?>)a(value, a2, androidx.navigation.s0.b, string, "dimension");
                                        i = (int)value.getDimension(resources.getDisplayMetrics());
                                        break Label_0149;
                                    }
                                    if (i == 18) {
                                        s0 = (s0<?>)a(value, a2, androidx.navigation.s0.i, string, "boolean");
                                        if (value.data != 0) {
                                            b2 = true;
                                        }
                                        o = b2;
                                        break Label_0660;
                                    }
                                    if (i < 16 || i > 31) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("unsupported argument type ");
                                        sb3.append(value.type);
                                        throw new XmlPullParserException(sb3.toString());
                                    }
                                    final s0<Float> g = androidx.navigation.s0.g;
                                    if (a2 != g) {
                                        s0 = (s0<?>)a(value, a2, androidx.navigation.s0.b, string, "integer");
                                        i = value.data;
                                        break Label_0149;
                                    }
                                    s0 = (s0<?>)a(value, a2, g, string, "float");
                                    float1 = (float)value.data;
                                }
                                else {
                                    s0 = (s0<?>)a(value, a2, androidx.navigation.s0.g, string, "float");
                                    float1 = value.getFloat();
                                }
                                o = float1;
                                break Label_0660;
                            }
                            final String string2 = value.string.toString();
                            if ((s0 = a2) == null) {
                                s0 = androidx.navigation.s0.d(string2);
                            }
                            o = s0.h(string2);
                            break Label_0660;
                        }
                    }
                }
                o = i;
            }
        }
        if (o != null) {
            a.b(o);
        }
        if (s0 != null) {
            a.d(s0);
        }
        return a.a();
    }
    
    private void f(@j0 final Resources resources, @j0 final Bundle bundle, @j0 final AttributeSet set, final int n) throws XmlPullParserException {
        final TypedArray obtainAttributes = resources.obtainAttributes(set, v0.a.j.X);
        final String string = obtainAttributes.getString(v0.a.j.Y);
        if (string != null) {
            final o e = this.e(obtainAttributes, resources, n);
            if (e.c()) {
                e.e(string, bundle);
            }
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }
    
    private void g(@j0 final Resources resources, @j0 final a0 a0, @j0 final AttributeSet set, final int n) throws XmlPullParserException {
        final TypedArray obtainAttributes = resources.obtainAttributes(set, v0.a.j.X);
        final String string = obtainAttributes.getString(v0.a.j.Y);
        if (string != null) {
            a0.b(string, this.e(obtainAttributes, resources, n));
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }
    
    private void h(@j0 final Resources resources, @j0 final a0 a0, @j0 final AttributeSet set) throws XmlPullParserException {
        final TypedArray obtainAttributes = resources.obtainAttributes(set, v0.a.j.c0);
        final String string = obtainAttributes.getString(v0.a.j.g0);
        final String string2 = obtainAttributes.getString(v0.a.j.e0);
        final String string3 = obtainAttributes.getString(v0.a.j.f0);
        if (TextUtils.isEmpty((CharSequence)string) && TextUtils.isEmpty((CharSequence)string2) && TextUtils.isEmpty((CharSequence)string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        final u.a a2 = new u.a();
        if (string != null) {
            a2.g(string.replace("${applicationId}", this.a.getPackageName()));
        }
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            a2.e(string2.replace("${applicationId}", this.a.getPackageName()));
        }
        if (string3 != null) {
            a2.f(string3.replace("${applicationId}", this.a.getPackageName()));
        }
        a0.f(a2.a());
        obtainAttributes.recycle();
    }
    
    @SuppressLint({ "ResourceType" })
    @j0
    public e0 c(@i0 final int n) {
        final Resources resources = this.a.getResources();
        final XmlResourceParser xml = resources.getXml(n);
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
        try {
            int next;
            do {
                next = xml.next();
            } while (next != 2 && next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            final String name = xml.getName();
            final a0 b = this.b(resources, xml, attributeSet, n);
            if (b instanceof e0) {
                final e0 e0 = (e0)b;
                xml.close();
                return e0;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Root element <");
            sb.append(name);
            sb.append("> did not inflate into a NavGraph");
            throw new IllegalArgumentException(sb.toString());
        }
        catch (Exception cause) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception inflating ");
            sb2.append(resources.getResourceName(n));
            sb2.append(" line ");
            sb2.append(xml.getLineNumber());
            throw new RuntimeException(sb2.toString(), cause);
        }
        xml.close();
    }
}
