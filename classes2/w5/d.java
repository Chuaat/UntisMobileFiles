// 
// Decompiled by Procyon v0.5.36
// 

package w5;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class d implements b
{
    private final String a;
    private String b;
    
    public d(final String a) {
        this.a = a;
    }
    
    private static String c(final String anotherString) {
        String s = anotherString;
        if ("bearer".equalsIgnoreCase(anotherString)) {
            s = "Bearer";
        }
        return s;
    }
    
    public String a() {
        return this.b;
    }
    
    @Override
    public void applyToParams(final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        if (this.b == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        String string;
        if (this.a != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(c(this.a));
            sb2.append(" ");
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        sb.append(this.b);
        httpHeaders.add("Authorization", sb.toString());
    }
    
    public void b(final String b) {
        this.b = b;
    }
}
