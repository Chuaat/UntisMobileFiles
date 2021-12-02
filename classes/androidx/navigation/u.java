// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.regex.Matcher;
import android.net.Uri;
import java.util.HashMap;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.Map;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class u
{
    private static final Pattern j;
    private final ArrayList<String> a;
    private final Map<String, c> b;
    private Pattern c;
    private boolean d;
    private boolean e;
    private final String f;
    private final String g;
    private Pattern h;
    private final String i;
    
    static {
        j = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    }
    
    u(@j0 final String s) {
        this(s, null, null);
    }
    
    u(@k0 final String input, @k0 final String g, @k0 final String str) {
        this.a = new ArrayList<String>();
        this.b = new HashMap<String, c>();
        this.c = null;
        this.d = false;
        this.e = false;
        this.h = null;
        this.f = input;
        this.g = g;
        this.i = str;
        if (input != null) {
            final Uri parse = Uri.parse(input);
            this.e = (parse.getQuery() != null);
            final StringBuilder sb = new StringBuilder("^");
            if (!u.j.matcher(input).find()) {
                sb.append("http[s]?://");
            }
            final Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.e) {
                final Matcher matcher = Pattern.compile("(\\?)").matcher(input);
                if (matcher.find()) {
                    this.a(input.substring(0, matcher.start()), sb, compile);
                }
                this.d = false;
                for (final String s : parse.getQueryParameterNames()) {
                    final StringBuilder sb2 = new StringBuilder();
                    final String queryParameter = parse.getQueryParameter(s);
                    final Matcher matcher2 = compile.matcher(queryParameter);
                    final c c = new c();
                    int end = 0;
                    while (matcher2.find()) {
                        c.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(end, matcher2.start())));
                        sb2.append("(.+?)?");
                        end = matcher2.end();
                    }
                    if (end < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(end)));
                    }
                    c.d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.b.put(s, c);
                }
            }
            else {
                this.d = this.a(input, sb, compile);
            }
            this.c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str).matches()) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("The given mimeType ");
                sb3.append(str);
                sb3.append(" does not match to required \"type/subtype\" format");
                throw new IllegalArgumentException(sb3.toString());
            }
            final b b = new b(str);
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("^(");
            sb4.append(b.G);
            sb4.append("|[*]+)/(");
            sb4.append(b.H);
            sb4.append("|[*]+)$");
            this.h = Pattern.compile(sb4.toString().replace("*|[*]", "[\\s\\S]"));
        }
    }
    
    private boolean a(@j0 final String input, final StringBuilder sb, final Pattern pattern) {
        final Matcher matcher = pattern.matcher(input);
        boolean b = input.contains(".*") ^ true;
        int end = 0;
        while (matcher.find()) {
            this.a.add(matcher.group(1));
            sb.append(Pattern.quote(input.substring(end, matcher.start())));
            sb.append("(.+?)");
            end = matcher.end();
            b = false;
        }
        if (end < input.length()) {
            sb.append(Pattern.quote(input.substring(end)));
        }
        sb.append("($|(\\?(.)*))");
        return b;
    }
    
    private boolean h(final String anObject) {
        final boolean b = true;
        final boolean b2 = anObject == null;
        final String g = this.g;
        if (b2 == (g != null)) {
            return false;
        }
        boolean b3 = b;
        if (anObject != null) {
            b3 = (g.equals(anObject) && b);
        }
        return b3;
    }
    
    private boolean i(final String input) {
        final boolean b = true;
        if (input == null == (this.i != null)) {
            return false;
        }
        boolean b2 = b;
        if (input != null) {
            b2 = (this.h.matcher(input).matches() && b);
        }
        return b2;
    }
    
    private boolean j(final Uri uri) {
        final boolean b = true;
        final boolean b2 = uri == null;
        final Pattern c = this.c;
        if (b2 == (c != null)) {
            return false;
        }
        boolean b3 = b;
        if (uri != null) {
            b3 = (c.matcher(uri.toString()).matches() && b);
        }
        return b3;
    }
    
    private boolean m(final Bundle bundle, final String s, final String s2, final o o) {
        if (o != null) {
            final s0<?> b = o.b();
            try {
                b.g(bundle, s, s2);
                return false;
            }
            catch (IllegalArgumentException ex) {
                return true;
            }
        }
        bundle.putString(s, s2);
        return false;
    }
    
    @k0
    public String b() {
        return this.g;
    }
    
    @k0
    Bundle c(@j0 final Uri uri, @j0 final Map<String, o> map) {
        final Matcher matcher = this.c.matcher(uri.toString());
        if (!matcher.matches()) {
            return null;
        }
        final Bundle bundle = new Bundle();
        final int size = this.a.size();
        int i = 0;
        while (i < size) {
            final String s = this.a.get(i);
            if (this.m(bundle, s, Uri.decode(matcher.group(++i)), map.get(s))) {
                return null;
            }
        }
        if (this.e) {
            for (final String s2 : this.b.keySet()) {
                final c c = this.b.get(s2);
                final String queryParameter = uri.getQueryParameter(s2);
                Matcher matcher2;
                if (queryParameter != null) {
                    if (!(matcher2 = Pattern.compile(c.c()).matcher(queryParameter)).matches()) {
                        return null;
                    }
                }
                else {
                    matcher2 = null;
                }
                for (int j = 0; j < c.e(); ++j) {
                    String decode;
                    if (matcher2 != null) {
                        decode = Uri.decode(matcher2.group(j + 1));
                    }
                    else {
                        decode = null;
                    }
                    final String b = c.b(j);
                    final o o = map.get(b);
                    if (decode != null && !decode.replaceAll("[{}]", "").equals(b) && this.m(bundle, b, decode, o)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }
    
    @k0
    public String d() {
        return this.i;
    }
    
    int e(@j0 final String input) {
        if (this.i != null && this.h.matcher(input).matches()) {
            return new b(this.i).b(new b(input));
        }
        return -1;
    }
    
    @k0
    public String f() {
        return this.f;
    }
    
    boolean g() {
        return this.d;
    }
    
    boolean k(@j0 final Uri uri) {
        return this.l(new z(uri, null, null));
    }
    
    boolean l(@j0 final z z) {
        return this.j(z.c()) && this.h(z.a()) && this.i(z.b());
    }
    
    public static final class a
    {
        private String a;
        private String b;
        private String c;
        
        a() {
        }
        
        @j0
        public static a b(@j0 final String s) {
            if (!s.isEmpty()) {
                final a a = new a();
                a.e(s);
                return a;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        
        @j0
        public static a c(@j0 final String s) {
            final a a = new a();
            a.f(s);
            return a;
        }
        
        @j0
        public static a d(@j0 final String s) {
            final a a = new a();
            a.g(s);
            return a;
        }
        
        @j0
        public u a() {
            return new u(this.a, this.b, this.c);
        }
        
        @j0
        public a e(@j0 final String b) {
            if (!b.isEmpty()) {
                this.b = b;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        
        @j0
        public a f(@j0 final String c) {
            this.c = c;
            return this;
        }
        
        @j0
        public a g(@j0 final String a) {
            this.a = a;
            return this;
        }
    }
    
    private static class b implements Comparable<b>
    {
        String G;
        String H;
        
        b(@j0 final String s) {
            final String[] split = s.split("/", -1);
            this.G = split[0];
            this.H = split[1];
        }
        
        public int b(@j0 final b b) {
            int n;
            if (this.G.equals(b.G)) {
                n = 2;
            }
            else {
                n = 0;
            }
            int n2 = n;
            if (this.H.equals(b.H)) {
                n2 = n + 1;
            }
            return n2;
        }
    }
    
    private static class c
    {
        private String a;
        private ArrayList<String> b;
        
        c() {
            this.b = new ArrayList<String>();
        }
        
        void a(final String e) {
            this.b.add(e);
        }
        
        String b(final int index) {
            return this.b.get(index);
        }
        
        String c() {
            return this.a;
        }
        
        void d(final String a) {
            this.a = a;
        }
        
        public int e() {
            return this.b.size();
        }
    }
}
