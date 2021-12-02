// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.ArrayList;

public class e extends p
{
    @Override
    protected String[] d(final n n, final String[] array, final boolean b) {
        final ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        boolean b2 = false;
        while (i < array.length) {
            final String s = array[i];
            Label_0247: {
                if ("--".equals(s)) {
                    list.add("--");
                    b2 = true;
                }
                else if ("-".equals(s)) {
                    list.add("-");
                }
                else {
                    String substring = s;
                    if (s.startsWith("-")) {
                        final String b3 = u.b(s);
                        if (n.j(b3)) {
                            substring = s;
                        }
                        else {
                            int beginIndex;
                            if (b3.indexOf(61) != -1 && n.j(b3.substring(0, b3.indexOf(61)))) {
                                list.add(s.substring(0, s.indexOf(61)));
                                beginIndex = s.indexOf(61) + 1;
                            }
                            else {
                                beginIndex = 2;
                                if (!n.j(s.substring(0, 2))) {
                                    list.add(s);
                                    b2 = b;
                                    break Label_0247;
                                }
                                list.add(s.substring(0, 2));
                            }
                            substring = s.substring(beginIndex);
                        }
                    }
                    list.add(substring);
                }
            }
            int n2 = i;
            if (b2) {
                while (true) {
                    n2 = ++i;
                    if (i >= array.length) {
                        break;
                    }
                    list.add(array[i]);
                }
            }
            i = n2 + 1;
        }
        return list.toArray(new String[list.size()]);
    }
}
