// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class r extends p
{
    private List d;
    private boolean e;
    private j f;
    private n g;
    
    public r() {
        this.d = new ArrayList();
    }
    
    private void n(final Iterator iterator) {
        if (this.e) {
            while (iterator.hasNext()) {
                this.d.add(iterator.next());
            }
        }
    }
    
    private void o() {
        this.e = false;
        this.d.clear();
    }
    
    private void p(final String s, final boolean b) {
        if (b) {
            final j f = this.f;
            if (f == null || !f.x()) {
                this.e = true;
                this.d.add("--");
            }
        }
        this.d.add(s);
    }
    
    private void q(final String s, final boolean b) {
        if (b && !this.g.j(s)) {
            this.e = true;
        }
        if (this.g.j(s)) {
            this.f = this.g.e(s);
        }
        this.d.add(s);
    }
    
    @Override
    protected String[] d(final n g, final String[] a, final boolean b) {
        this.o();
        this.g = g;
        final Iterator<String> iterator = Arrays.asList(a).iterator();
        while (iterator.hasNext()) {
            final String anObject = iterator.next();
            Label_0224: {
                if (anObject.startsWith("--")) {
                    final int index = anObject.indexOf(61);
                    String substring;
                    if (index == -1) {
                        substring = anObject;
                    }
                    else {
                        substring = anObject.substring(0, index);
                    }
                    if (g.j(substring)) {
                        this.f = g.e(substring);
                        this.d.add(substring);
                        if (index != -1) {
                            this.d.add(anObject.substring(index + 1));
                        }
                        break Label_0224;
                    }
                }
                else {
                    if ("-".equals(anObject)) {
                        this.d.add(anObject);
                        break Label_0224;
                    }
                    if (anObject.startsWith("-")) {
                        if (anObject.length() != 2 && !g.j(anObject)) {
                            this.m(anObject, b);
                            break Label_0224;
                        }
                        this.q(anObject, b);
                        break Label_0224;
                    }
                }
                this.p(anObject, b);
            }
            this.n(iterator);
        }
        final List d = this.d;
        return d.toArray(new String[d.size()]);
    }
    
    protected void m(String substring, final boolean b) {
        int i = 1;
        while (i < substring.length()) {
            final String value = String.valueOf(substring.charAt(i));
            List list = null;
            Label_0164: {
                if (this.g.j(value)) {
                    final List d = this.d;
                    final StringBuffer sb = new StringBuffer();
                    sb.append("-");
                    sb.append(value);
                    d.add(sb.toString());
                    final j e = this.g.e(value);
                    this.f = e;
                    if (e.x()) {
                        final int length = substring.length();
                        final int beginIndex = i + 1;
                        if (length != beginIndex) {
                            list = this.d;
                            substring = substring.substring(beginIndex);
                            break Label_0164;
                        }
                    }
                    ++i;
                    continue;
                }
                if (b) {
                    this.p(substring.substring(i), true);
                    break;
                }
                list = this.d;
            }
            list.add(substring);
            break;
        }
    }
}
