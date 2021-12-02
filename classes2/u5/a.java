// 
// Decompiled by Procyon v0.5.36
// 

package u5;

import androidx.annotation.j0;

public class a implements c
{
    private int a;
    @j0
    private String b;
    
    public a(final int a, @j0 final String b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    @Override
    public String a() {
        return this.b;
    }
    
    public void b(@j0 final String b) {
        this.b = b;
    }
    
    public void c(final int a) {
        this.a = a;
    }
    
    @Override
    public int getVersion() {
        return this.a;
    }
}
