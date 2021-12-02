// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.graphics.drawable.Icon;
import android.app.Person$Builder;
import android.os.PersistableBundle;
import android.os.Bundle;
import androidx.annotation.t0;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import androidx.annotation.k0;

public class x
{
    private static final String g = "name";
    private static final String h = "icon";
    private static final String i = "uri";
    private static final String j = "key";
    private static final String k = "isBot";
    private static final String l = "isImportant";
    @k0
    CharSequence a;
    @k0
    IconCompat b;
    @k0
    String c;
    @k0
    String d;
    boolean e;
    boolean f;
    
    x(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
    }
    
    @j0
    @p0(28)
    @t0({ t0.a.I })
    public static x a(@j0 final Person person) {
        final a f = new a().f(person.getName());
        IconCompat m;
        if (person.getIcon() != null) {
            m = IconCompat.m(person.getIcon());
        }
        else {
            m = null;
        }
        return f.c(m).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
    }
    
    @j0
    public static x b(@j0 final Bundle bundle) {
        final Bundle bundle2 = bundle.getBundle("icon");
        final a f = new a().f(bundle.getCharSequence("name"));
        IconCompat k;
        if (bundle2 != null) {
            k = IconCompat.k(bundle2);
        }
        else {
            k = null;
        }
        return f.c(k).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }
    
    @j0
    @p0(22)
    @t0({ t0.a.I })
    public static x c(@j0 final PersistableBundle persistableBundle) {
        return new a().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).d(persistableBundle.getBoolean("isImportant")).a();
    }
    
    @k0
    public IconCompat d() {
        return this.b;
    }
    
    @k0
    public String e() {
        return this.d;
    }
    
    @k0
    public CharSequence f() {
        return this.a;
    }
    
    @k0
    public String g() {
        return this.c;
    }
    
    public boolean h() {
        return this.e;
    }
    
    public boolean i() {
        return this.f;
    }
    
    @j0
    @t0({ t0.a.I })
    public String j() {
        final String c = this.c;
        if (c != null) {
            return c;
        }
        if (this.a != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("name:");
            sb.append((Object)this.a);
            return sb.toString();
        }
        return "";
    }
    
    @j0
    @p0(28)
    @t0({ t0.a.I })
    public Person k() {
        final Person$Builder setName = new Person$Builder().setName(this.f());
        Icon q;
        if (this.d() != null) {
            q = this.d().Q();
        }
        else {
            q = null;
        }
        return setName.setIcon(q).setUri(this.g()).setKey(this.e()).setBot(this.h()).setImportant(this.i()).build();
    }
    
    @j0
    public a l() {
        return new a(this);
    }
    
    @j0
    public Bundle m() {
        final Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        final IconCompat b = this.b;
        Bundle p;
        if (b != null) {
            p = b.P();
        }
        else {
            p = null;
        }
        bundle.putBundle("icon", p);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }
    
    @j0
    @p0(22)
    @t0({ t0.a.I })
    public PersistableBundle n() {
        final PersistableBundle persistableBundle = new PersistableBundle();
        final CharSequence a = this.a;
        String string;
        if (a != null) {
            string = a.toString();
        }
        else {
            string = null;
        }
        persistableBundle.putString("name", string);
        persistableBundle.putString("uri", this.c);
        persistableBundle.putString("key", this.d);
        persistableBundle.putBoolean("isBot", this.e);
        persistableBundle.putBoolean("isImportant", this.f);
        return persistableBundle;
    }
    
    public static class a
    {
        @k0
        CharSequence a;
        @k0
        IconCompat b;
        @k0
        String c;
        @k0
        String d;
        boolean e;
        boolean f;
        
        public a() {
        }
        
        a(final x x) {
            this.a = x.a;
            this.b = x.b;
            this.c = x.c;
            this.d = x.d;
            this.e = x.e;
            this.f = x.f;
        }
        
        @j0
        public x a() {
            return new x(this);
        }
        
        @j0
        public a b(final boolean e) {
            this.e = e;
            return this;
        }
        
        @j0
        public a c(@k0 final IconCompat b) {
            this.b = b;
            return this;
        }
        
        @j0
        public a d(final boolean f) {
            this.f = f;
            return this;
        }
        
        @j0
        public a e(@k0 final String d) {
            this.d = d;
            return this;
        }
        
        @j0
        public a f(@k0 final CharSequence a) {
            this.a = a;
            return this;
        }
        
        @j0
        public a g(@k0 final String c) {
            this.c = c;
            return this;
        }
    }
}
