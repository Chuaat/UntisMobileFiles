// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Properties;
import java.util.List;

public abstract class p implements d
{
    protected c a;
    private n b;
    private List c;
    
    @Override
    public c a(final n n, final String[] array, final boolean b) throws o {
        return this.h(n, array, null, b);
    }
    
    @Override
    public c b(final n n, final String[] array) throws o {
        return this.h(n, array, null, false);
    }
    
    protected void c() throws i {
        if (this.f().isEmpty()) {
            return;
        }
        throw new i(this.f());
    }
    
    protected abstract String[] d(final n p0, final String[] p1, final boolean p2);
    
    protected n e() {
        return this.b;
    }
    
    protected List f() {
        return this.c;
    }
    
    public c g(final n n, final String[] array, final Properties properties) throws o {
        return this.h(n, array, properties, false);
    }
    
    public c h(final n n, final String[] array, final Properties properties, final boolean b) throws o {
        final Iterator<j> iterator = n.k().iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        this.l(n);
        this.a = new c();
        int n2 = 0;
        String[] array2;
        if ((array2 = array) == null) {
            array2 = new String[0];
        }
        final ListIterator<String> listIterator = Arrays.asList(this.d(this.e(), array2, b)).listIterator();
        while (listIterator.hasNext()) {
            final String s = listIterator.next();
            int n3 = 0;
            Label_0222: {
                if (!"--".equals(s)) {
                    if ("-".equals(s)) {
                        if (!b) {
                            this.a.a(s);
                            n3 = n2;
                            break Label_0222;
                        }
                    }
                    else if (s.startsWith("-")) {
                        if (!b || this.e().j(s)) {
                            this.j(s, listIterator);
                            n3 = n2;
                            break Label_0222;
                        }
                        this.a.a(s);
                    }
                    else {
                        this.a.a(s);
                        n3 = n2;
                        if (!b) {
                            break Label_0222;
                        }
                    }
                }
                n3 = 1;
            }
            if ((n2 = n3) != 0) {
                while (true) {
                    n2 = n3;
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    final String anObject = listIterator.next();
                    if ("--".equals(anObject)) {
                        continue;
                    }
                    this.a.a(anObject);
                }
            }
        }
        this.k(properties);
        this.c();
        return this.a;
    }
    
    public void i(final j j, final ListIterator listIterator) throws o {
    Label_0039_Outer:
        while (true) {
            Label_0060: {
                if (!listIterator.hasNext()) {
                    break Label_0060;
                }
                final String s = listIterator.next();
                Label_0049: {
                    if (!this.e().j(s) || !s.startsWith("-")) {
                        break Label_0049;
                    }
                    while (true) {
                        listIterator.previous();
                        break Label_0060;
                        try {
                            j.c(u.a(s));
                            continue Label_0039_Outer;
                            Label_0086: {
                                return;
                            }
                            // iftrue(Label_0086:, j.v() != null || j.D())
                            throw new h(j);
                        }
                        catch (RuntimeException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    protected void j(final String str, final ListIterator listIterator) throws o {
        if (this.e().j(str)) {
            final j j = (j)this.e().e(str).clone();
            if (j.F()) {
                this.f().remove(j.l());
            }
            if (this.e().f(j) != null) {
                final l f = this.e().f(j);
                if (f.e()) {
                    this.f().remove(f);
                }
                f.g(j);
            }
            if (j.x()) {
                this.i(j, listIterator);
            }
            this.a.b(j);
            return;
        }
        final StringBuffer sb = new StringBuffer();
        sb.append("Unrecognized option: ");
        sb.append(str);
        throw new t(sb.toString(), str);
    }
    
    protected void k(final Properties properties) {
        if (properties == null) {
            return;
        }
        final Enumeration<?> propertyNames = properties.propertyNames();
    Label_0120_Outer:
        while (true) {
            if (!propertyNames.hasMoreElements()) {
                return;
            }
            final String string = propertyNames.nextElement().toString();
            if (this.a.q(string)) {
                continue;
            }
            final j e = this.e().e(string);
            final String property = properties.getProperty(string);
            Label_0090: {
                if (!e.x()) {
                    break Label_0090;
                }
                while (true) {
                    if (e.v() != null) {
                        if (e.v().length != 0) {
                            break Label_0120;
                        }
                    }
                    try {
                        e.c(property);
                        this.a.b(e);
                        continue Label_0120_Outer;
                    }
                    // iftrue(Label_0120:, "yes".equalsIgnoreCase(property) || "true".equalsIgnoreCase(property) || "1".equalsIgnoreCase(property))
                    catch (RuntimeException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    protected void l(final n b) {
        this.b = b;
        this.c = new ArrayList(b.i());
    }
}
