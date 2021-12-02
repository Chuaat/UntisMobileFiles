// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

class z implements p
{
    private final String a;
    private int b;
    private boolean c;
    
    z(final String a) {
        this.a = a;
    }
    
    @Override
    public int O() {
        return this.b;
    }
    
    @Override
    public void a(final int b) {
        if (b <= this.b) {
            this.b = b;
            return;
        }
        throw new IllegalStateException("mark cannot reset ahead of position, only back");
    }
    
    @Override
    public void b(final int n) {
    }
    
    @Override
    public void c(final int n) {
        this.c = false;
        if (n != -1 && this.a.charAt(this.b - 1) == n) {
            --this.b;
        }
    }
    
    @Override
    public int getPosition() {
        return this.b;
    }
    
    @Override
    public int read() {
        if (this.c) {
            throw new v("Trying to read past EOF.");
        }
        if (this.b >= this.a.length()) {
            this.c = true;
            return -1;
        }
        return this.a.charAt(this.b++);
    }
}
