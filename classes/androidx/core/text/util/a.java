// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text.util;

import androidx.annotation.b1;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import androidx.annotation.t0;

@t0({ t0.a.I })
class a
{
    private static final int a = 4;
    private static final int b = 14;
    private static final int c = 5;
    private static final int d = 25;
    private static final int e = 5;
    private static final a[] f;
    private static final String g = "\n\u000b\f\r\u0085\u2028\u2029";
    private static final String h = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000";
    private static final String i = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String j = ",*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String k = "(?=[,*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final Pattern l;
    private static final String m = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String n = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String o = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String p = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final Pattern q;
    private static final Pattern r;
    private static final Pattern s;
    private static final Pattern t;
    private static final Pattern u;
    
    static {
        f = new a[] { new a(99, 99, -1, -1), new a(35, 36, -1, -1), new a(71, 72, -1, -1), new a(96, 96, -1, -1), new a(85, 86, -1, -1), new a(90, 96, -1, -1), new a(80, 81, -1, -1), new a(6, 6, -1, -1), new a(20, 20, -1, -1), new a(19, 19, -1, -1), new a(32, 34, -1, -1), new a(96, 96, -1, -1), new a(30, 31, -1, -1), new a(96, 96, -1, -1), new a(96, 96, -1, -1), new a(50, 52, -1, -1), new a(83, 83, -1, -1), new a(60, 62, -1, -1), new a(46, 47, -1, -1), new a(66, 67, 73, -1), new a(40, 42, -1, -1), new a(70, 71, -1, -1), new a(1, 2, -1, -1), new a(20, 21, -1, -1), new a(3, 4, -1, -1), new a(96, 96, -1, -1), new a(48, 49, -1, -1), new a(55, 56, -1, -1), new a(63, 65, -1, -1), new a(96, 96, -1, -1), new a(38, 39, -1, -1), new a(55, 56, -1, -1), new a(27, 28, -1, -1), new a(58, 58, -1, -1), new a(68, 69, -1, -1), new a(3, 4, -1, -1), new a(7, 8, -1, -1), new a(87, 88, 86, -1), new a(88, 89, 96, -1), new a(10, 14, 0, 6), new a(43, 45, -1, -1), new a(73, 74, -1, -1), new a(97, 97, -1, -1), new a(15, 19, -1, -1), new a(6, 6, 0, 9), new a(96, 96, -1, -1), new a(2, 2, -1, -1), new a(29, 29, -1, -1), new a(57, 57, -1, -1), new a(37, 38, -1, -1), new a(75, 79, 87, 88), new a(84, 84, -1, -1), new a(22, 24, 20, -1), new a(6, 9, -1, -1), new a(5, 5, -1, -1), new a(98, 99, -1, -1), new a(53, 54, -1, -1), new a(24, 26, -1, -1), new a(82, 83, -1, -1) };
        l = Pattern.compile("[^,*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        q = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        r = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+virginia)|(wy|wyoming))(?=[,*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        s = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
        t = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
        u = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    }
    
    private a() {
    }
    
    private static int a(final String s, final MatchResult matchResult) {
        int end = matchResult.end();
        final Matcher matcher = androidx.core.text.util.a.l.matcher(s);
        String group = "";
        int n = 1;
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        int n5 = -1;
        int n6 = -1;
        int i;
        while (true) {
            i = end;
            if (end < s.length()) {
                int n7;
                if (!matcher.find(end)) {
                    n7 = s.length();
                }
                else {
                    i = end;
                    if (matcher.end() - matcher.start() > 25) {
                        n7 = matcher.end();
                    }
                    else {
                        while (i < matcher.start()) {
                            int n8 = n;
                            if ("\n\u000b\f\r\u0085\u2028\u2029".indexOf(s.charAt(i)) != -1) {
                                n8 = n + 1;
                            }
                            ++i;
                            n = n8;
                        }
                        if (n > 5) {
                            break;
                        }
                        if (++n2 > 14) {
                            break;
                        }
                        int n9;
                        int n10;
                        int n11;
                        int n12;
                        if (h(s, i) != null) {
                            if (n3 != 0 && n > 1) {
                                return -i;
                            }
                            n9 = n3;
                            n10 = n4;
                            n11 = n5;
                            n12 = n6;
                            if (n5 == -1) {
                                n9 = n3;
                                n10 = n4;
                                n11 = i;
                                n12 = n6;
                            }
                        }
                        else if (d(matcher.group(0))) {
                            n9 = 0;
                            n10 = 1;
                            n11 = n5;
                            n12 = n6;
                        }
                        else {
                            if (n2 == 5 && n4 == 0) {
                                i = matcher.end();
                                break;
                            }
                            int end2 = n6;
                            if (n4 != 0) {
                                end2 = n6;
                                if (n2 > 4) {
                                    final MatchResult j = i(s, i);
                                    end2 = n6;
                                    if (j != null) {
                                        if (group.equals("et") && j.group(0).equals("al")) {
                                            i = j.end();
                                            break;
                                        }
                                        final Matcher matcher2 = androidx.core.text.util.a.l.matcher(s);
                                        if (matcher2.find(j.end())) {
                                            end2 = n6;
                                            if (g(matcher2.group(0), j)) {
                                                return matcher2.end();
                                            }
                                        }
                                        else {
                                            end2 = j.end();
                                        }
                                    }
                                }
                            }
                            final int n13 = 0;
                            n12 = end2;
                            n11 = n5;
                            n10 = n4;
                            n9 = n13;
                        }
                        group = matcher.group(0);
                        final int end3 = matcher.end();
                        n3 = n9;
                        n4 = n10;
                        n5 = n11;
                        n6 = n12;
                        end = end3;
                        continue;
                    }
                }
                return -n7;
            }
            break;
        }
        if (n6 > 0) {
            return n6;
        }
        if (n5 <= 0) {
            n5 = i;
        }
        return -n5;
    }
    
    private static boolean b(String s) {
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            int n2 = n;
            if (Character.isDigit(s.charAt(i))) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        if (n > 5) {
            return false;
        }
        final Matcher matcher = androidx.core.text.util.a.t.matcher(s);
        if (!matcher.find()) {
            return true;
        }
        final int int1 = Integer.parseInt(matcher.group(1));
        if (int1 == 0) {
            return false;
        }
        final String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        final int n3 = int1 % 10;
        s = "th";
        if (n3 == 1) {
            if (int1 % 100 != 11) {
                s = "st";
            }
            return lowerCase.equals(s);
        }
        if (n3 == 2) {
            if (int1 % 100 != 12) {
                s = "nd";
            }
            return lowerCase.equals(s);
        }
        if (n3 != 3) {
            return lowerCase.equals("th");
        }
        if (int1 % 100 != 13) {
            s = "rd";
        }
        return lowerCase.equals(s);
    }
    
    static String c(final String input) {
        final Matcher matcher = androidx.core.text.util.a.q.matcher(input);
        int end = 0;
        while (matcher.find(end)) {
            if (b(matcher.group(0))) {
                final int start = matcher.start();
                final int a = a(input, matcher);
                if (a > 0) {
                    return input.substring(start, a);
                }
                end = -a;
            }
            else {
                end = matcher.end();
            }
        }
        return null;
    }
    
    @b1
    public static boolean d(final String input) {
        return androidx.core.text.util.a.s.matcher(input).matches();
    }
    
    @b1
    public static boolean e(final String input) {
        return androidx.core.text.util.a.u.matcher(input).matches();
    }
    
    @b1
    public static boolean f(final String s, final String s2) {
        return g(s, i(s2, 0));
    }
    
    private static boolean g(final String input, final MatchResult matchResult) {
        final boolean b = false;
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        int n;
        while (true) {
            n = groupCount;
            if (groupCount <= 0) {
                break;
            }
            n = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                break;
            }
            groupCount = n;
        }
        boolean b2 = b;
        if (androidx.core.text.util.a.u.matcher(input).matches()) {
            b2 = b;
            if (androidx.core.text.util.a.f[n].a(input)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @b1
    public static MatchResult h(final String input, final int start) {
        if (start > 0 && ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(input.charAt(start - 1)) == -1) {
            return null;
        }
        final Matcher region = androidx.core.text.util.a.q.matcher(input).region(start, input.length());
        if (region.lookingAt()) {
            final MatchResult matchResult = region.toMatchResult();
            if (b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }
    
    @b1
    public static MatchResult i(final String input, final int start) {
        final MatchResult matchResult = null;
        if (start > 0 && ",*\u2022\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(input.charAt(start - 1)) == -1) {
            return null;
        }
        final Matcher region = androidx.core.text.util.a.r.matcher(input).region(start, input.length());
        MatchResult matchResult2 = matchResult;
        if (region.lookingAt()) {
            matchResult2 = region.toMatchResult();
        }
        return matchResult2;
    }
    
    private static class a
    {
        int a;
        int b;
        int c;
        int d;
        
        a(final int a, final int b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        boolean a(final String s) {
            boolean b = false;
            final int int1 = Integer.parseInt(s.substring(0, 2));
            if ((this.a <= int1 && int1 <= this.b) || int1 == this.c || int1 == this.d) {
                b = true;
            }
            return b;
        }
    }
}
