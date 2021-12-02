// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Reader;

class y implements p
{
    private final Reader a;
    private final List<Integer> b;
    private final int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private char[] h;
    private int i;
    private int j;
    
    y(final Reader reader) {
        this(reader, 16);
    }
    
    y(final Reader a, final int c) {
        this.b = new ArrayList<Integer>();
        this.c = c;
        this.a = a;
        this.e();
    }
    
    private void d(final char c) {
        if (!this.b.isEmpty()) {
            final int j = this.j;
            final char[] h = this.h;
            if (j == h.length) {
                final char[] h2 = new char[h.length * 2];
                System.arraycopy(h, 0, h2, 0, j);
                this.h = h2;
            }
            final char[] h3 = this.h;
            final int i = this.j;
            h3[i] = c;
            this.j = i + 1;
        }
    }
    
    private void e() {
        this.i = -1;
        this.j = 0;
        this.h = new char[this.c];
    }
    
    @Override
    public int O() {
        if (this.j == 0) {
            this.i = this.d;
        }
        if (!this.b.contains(this.d)) {
            this.b.add(this.d);
        }
        return this.d;
    }
    
    @Override
    public void a(final int n) {
        if (n > this.d) {
            throw new IllegalStateException("mark cannot reset ahead of position, only back");
        }
        final int index = this.b.indexOf(n);
        if (index != -1) {
            if (n != this.d) {
                this.f = false;
            }
            final List<Integer> b = this.b;
            b.subList(index, b.size()).clear();
            this.d = n;
            return;
        }
        throw new IllegalArgumentException("mark invalidated");
    }
    
    @Override
    public void b(int index) {
        index = this.b.indexOf(index);
        if (index == -1) {
            return;
        }
        final List<Integer> b = this.b;
        b.subList(index, b.size()).clear();
    }
    
    @Override
    public void c(final int n) {
        this.g = false;
        if (n != -1 && this.e == n) {
            this.f = true;
            --this.d;
        }
    }
    
    @Override
    public int getPosition() {
        return this.d;
    }
    
    @Override
    public int read() {
        if (!this.g) {
            if (this.f) {
                this.f = false;
                final int e = this.e;
                this.e = -1;
                ++this.d;
                return e;
            }
            final int d = this.d;
            final int i = this.i;
            if (d - i < this.j) {
                final char e2 = this.h[d - i];
                this.e = e2;
                this.d = d + 1;
                return e2;
            }
            if (this.b.isEmpty()) {
                this.e();
            }
            try {
                final int read = this.a.read();
                if (read != -1) {
                    this.e = read;
                    this.d((char)read);
                }
                ++this.d;
                if (read == -1) {
                    this.g = true;
                }
                return read;
            }
            catch (IOException ex) {
                throw new v(ex);
            }
        }
        throw new v("Trying to read past EOF.");
    }
}
