// 
// Decompiled by Procyon v0.5.36
// 

package w5;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class a implements b
{
    private final String a;
    private final String b;
    private String c;
    private String d;
    
    public a(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public String a() {
        return this.c;
    }
    
    @Override
    public void applyToParams(final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        String s = this.c;
        if (s == null) {
            return;
        }
        if (this.d != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            sb.append(" ");
            sb.append(this.c);
            s = sb.toString();
        }
        if (this.a.equals("query")) {
            multiValueMap.add((Object)this.b, (Object)s);
        }
        else if (this.a.equals("header")) {
            httpHeaders.add(this.b, s);
        }
    }
    
    public String b() {
        return this.d;
    }
    
    public String c() {
        return this.a;
    }
    
    public String d() {
        return this.b;
    }
    
    public void e(final String c) {
        this.c = c;
    }
    
    public void f(final String d) {
        this.d = d;
    }
}
