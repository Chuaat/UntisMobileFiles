// 
// Decompiled by Procyon v0.5.36
// 

package w5;

import org.springframework.util.Base64Utils;
import java.nio.charset.StandardCharsets;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class c implements b
{
    private String a;
    private String b;
    
    public String a() {
        return this.b;
    }
    
    @Override
    public void applyToParams(final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        if (this.a == null && this.b == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        final String a = this.a;
        final String s = "";
        String str;
        if ((str = a) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(":");
        String b = this.b;
        if (b == null) {
            b = s;
        }
        sb.append(b);
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(Base64Utils.encodeToString(string.getBytes(StandardCharsets.UTF_8)));
        httpHeaders.add("Authorization", sb2.toString());
    }
    
    public String b() {
        return this.a;
    }
    
    public void c(final String b) {
        this.b = b;
    }
    
    public void d(final String a) {
        this.a = a;
    }
}
