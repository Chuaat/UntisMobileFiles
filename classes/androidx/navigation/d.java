// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.annotation.i;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.ComponentName;
import androidx.core.app.c;
import android.content.res.Resources;
import java.util.regex.Matcher;
import android.util.Log;
import android.net.Uri;
import java.util.regex.Pattern;
import android.text.TextUtils;
import androidx.annotation.k0;
import android.os.Bundle;
import android.content.Intent;
import android.content.ContextWrapper;
import androidx.annotation.j0;
import android.app.Activity;
import android.content.Context;

@u0.b("activity")
public class d extends u0<a>
{
    private static final String c = "android-support-navigation:ActivityNavigator:source";
    private static final String d = "android-support-navigation:ActivityNavigator:current";
    private static final String e = "android-support-navigation:ActivityNavigator:popEnterAnim";
    private static final String f = "android-support-navigation:ActivityNavigator:popExitAnim";
    private static final String g = "ActivityNavigator";
    private Context a;
    private Activity b;
    
    public d(@j0 Context baseContext) {
        this.a = baseContext;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                this.b = (Activity)baseContext;
                break;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
    }
    
    public static void f(@j0 final Activity activity) {
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
        int intExtra2 = intent.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
        if (intExtra != -1 || intExtra2 != -1) {
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }
    }
    
    @Override
    public boolean e() {
        final Activity b = this.b;
        if (b != null) {
            b.finish();
            return true;
        }
        return false;
    }
    
    @j0
    public a g() {
        return new a(this);
    }
    
    @j0
    final Context h() {
        return this.a;
    }
    
    @k0
    public a0 i(@j0 final a a, @k0 final Bundle obj, @k0 final o0 o0, @k0 final u0.a a2) {
        if (a.N() != null) {
            final Intent intent = new Intent(a.N());
            if (obj != null) {
                intent.putExtras(obj);
                final String m = a.M();
                if (!TextUtils.isEmpty((CharSequence)m)) {
                    final StringBuffer sb = new StringBuffer();
                    final Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(m);
                    while (matcher.find()) {
                        final String group = matcher.group(1);
                        if (!obj.containsKey(group)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Could not find ");
                            sb2.append(group);
                            sb2.append(" in ");
                            sb2.append(obj);
                            sb2.append(" to fill data pattern ");
                            sb2.append(m);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        matcher.appendReplacement(sb, "");
                        sb.append(Uri.encode(obj.get(group).toString()));
                    }
                    matcher.appendTail(sb);
                    intent.setData(Uri.parse(sb.toString()));
                }
            }
            final boolean b = a2 instanceof b;
            if (b) {
                intent.addFlags(((b)a2).b());
            }
            if (!(this.a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (o0 != null && o0.g()) {
                intent.addFlags(536870912);
            }
            final Activity b2 = this.b;
            if (b2 != null) {
                final Intent intent2 = b2.getIntent();
                if (intent2 != null) {
                    final int intExtra = intent2.getIntExtra("android-support-navigation:ActivityNavigator:current", 0);
                    if (intExtra != 0) {
                        intent.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
                    }
                }
            }
            intent.putExtra("android-support-navigation:ActivityNavigator:current", a.p());
            final Resources resources = this.h().getResources();
            if (o0 != null) {
                final int c = o0.c();
                final int d = o0.d();
                if ((c > 0 && resources.getResourceTypeName(c).equals("animator")) || (d > 0 && resources.getResourceTypeName(d).equals("animator"))) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    sb3.append(resources.getResourceName(c));
                    sb3.append(" and popExit resource ");
                    sb3.append(resources.getResourceName(d));
                    sb3.append("when launching ");
                    sb3.append(a);
                    Log.w("ActivityNavigator", sb3.toString());
                }
                else {
                    intent.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c);
                    intent.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d);
                }
            }
            Label_0528: {
                if (b) {
                    final c a3 = ((b)a2).a();
                    if (a3 != null) {
                        androidx.core.content.d.t(this.a, intent, a3.l());
                        break Label_0528;
                    }
                }
                this.a.startActivity(intent);
            }
            if (o0 != null && this.b != null) {
                final int a4 = o0.a();
                final int b3 = o0.b();
                if ((a4 > 0 && resources.getResourceTypeName(a4).equals("animator")) || (b3 > 0 && resources.getResourceTypeName(b3).equals("animator"))) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Activity destinations do not support Animator resource. Ignoring enter resource ");
                    sb4.append(resources.getResourceName(a4));
                    sb4.append(" and exit resource ");
                    sb4.append(resources.getResourceName(b3));
                    sb4.append("when launching ");
                    sb4.append(a);
                    Log.w("ActivityNavigator", sb4.toString());
                }
                else if (a4 >= 0 || b3 >= 0) {
                    this.b.overridePendingTransition(Math.max(a4, 0), Math.max(b3, 0));
                }
            }
            return null;
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("Destination ");
        sb5.append(a.p());
        sb5.append(" does not have an Intent set.");
        throw new IllegalStateException(sb5.toString());
    }
    
    @a0.a(Activity.class)
    public static class a extends a0
    {
        private Intent P;
        private String Q;
        
        public a(@j0 final u0<? extends a> u0) {
            super(u0);
        }
        
        public a(@j0 final v0 v0) {
            this(v0.d(d.class));
        }
        
        @Override
        boolean I() {
            return false;
        }
        
        @k0
        public final String J() {
            final Intent p = this.P;
            if (p == null) {
                return null;
            }
            return p.getAction();
        }
        
        @k0
        public final ComponentName K() {
            final Intent p = this.P;
            if (p == null) {
                return null;
            }
            return p.getComponent();
        }
        
        @k0
        public final Uri L() {
            final Intent p = this.P;
            if (p == null) {
                return null;
            }
            return p.getData();
        }
        
        @k0
        public final String M() {
            return this.Q;
        }
        
        @k0
        public final Intent N() {
            return this.P;
        }
        
        @k0
        public final String O() {
            final Intent p = this.P;
            if (p == null) {
                return null;
            }
            return p.getPackage();
        }
        
        @j0
        public final a P(@k0 final String action) {
            if (this.P == null) {
                this.P = new Intent();
            }
            this.P.setAction(action);
            return this;
        }
        
        @j0
        public final a R(@k0 final ComponentName component) {
            if (this.P == null) {
                this.P = new Intent();
            }
            this.P.setComponent(component);
            return this;
        }
        
        @j0
        public final a S(@k0 final Uri data) {
            if (this.P == null) {
                this.P = new Intent();
            }
            this.P.setData(data);
            return this;
        }
        
        @j0
        public final a U(@k0 final String q) {
            this.Q = q;
            return this;
        }
        
        @j0
        public final a W(@k0 final Intent p) {
            this.P = p;
            return this;
        }
        
        @j0
        public final a X(@k0 final String package1) {
            if (this.P == null) {
                this.P = new Intent();
            }
            this.P.setPackage(package1);
            return this;
        }
        
        @j0
        @Override
        public String toString() {
            final ComponentName k = this.K();
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            String str;
            if (k != null) {
                sb.append(" class=");
                str = k.getClassName();
            }
            else {
                str = this.J();
                if (str == null) {
                    return sb.toString();
                }
                sb.append(" action=");
            }
            sb.append(str);
            return sb.toString();
        }
        
        @i
        @Override
        public void z(@j0 final Context context, @j0 final AttributeSet set) {
            super.z(context, set);
            final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, z0.j.a);
            String s2;
            final String s = s2 = obtainAttributes.getString(z0.j.f);
            if (s != null) {
                s2 = s.replace("${applicationId}", context.getPackageName());
            }
            this.X(s2);
            final String string = obtainAttributes.getString(z0.j.b);
            if (string != null) {
                String string2 = string;
                if (string.charAt(0) == '.') {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(string);
                    string2 = sb.toString();
                }
                this.R(new ComponentName(context, string2));
            }
            this.P(obtainAttributes.getString(z0.j.c));
            final String string3 = obtainAttributes.getString(z0.j.d);
            if (string3 != null) {
                this.S(Uri.parse(string3));
            }
            this.U(obtainAttributes.getString(z0.j.e));
            obtainAttributes.recycle();
        }
    }
    
    public static final class b implements u0.a
    {
        private final int a;
        private final c b;
        
        b(final int a, @k0 final c b) {
            this.a = a;
            this.b = b;
        }
        
        @k0
        public c a() {
            return this.b;
        }
        
        public int b() {
            return this.a;
        }
        
        public static final class a
        {
            private int a;
            private c b;
            
            @j0
            public a a(final int n) {
                this.a |= n;
                return this;
            }
            
            @j0
            public b b() {
                return new b(this.a, this.b);
            }
            
            @j0
            public a c(@j0 final c b) {
                this.b = b;
                return this;
            }
        }
    }
}
