// 
// Decompiled by Procyon v0.5.36
// 

package t6;

import org.jetbrains.annotations.e;

public abstract class b
{
    @e
    private final String a;
    @e
    private final d b;
    
    @e
    public String a() {
        return this.b().getDescription();
    }
    
    @e
    public d b() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        final String a = this.a();
        String s;
        if (a.length() > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" (");
            sb.append(a);
            sb.append(')');
            s = sb.toString();
        }
        else {
            s = this.a;
        }
        return s;
    }
}
