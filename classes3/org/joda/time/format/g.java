// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import org.joda.time.n0;
import java.io.IOException;
import java.util.Locale;
import org.joda.time.i;
import org.joda.time.a;
import java.io.Writer;

public interface g
{
    int d();
    
    void e(final Writer p0, final long p1, final a p2, final int p3, final i p4, final Locale p5) throws IOException;
    
    void g(final StringBuffer p0, final n0 p1, final Locale p2);
    
    void i(final StringBuffer p0, final long p1, final a p2, final int p3, final i p4, final Locale p5);
    
    void j(final Writer p0, final n0 p1, final Locale p2) throws IOException;
}
