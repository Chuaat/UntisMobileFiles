// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import org.jetbrains.annotations.f;
import java.io.IOException;
import okio.p;
import okhttp3.internal.d;
import okio.n;
import org.jetbrains.annotations.e;
import okio.o;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001e" }, d2 = { "Lokhttp3/internal/http2/k;", "", "", "symbol", "code", "codeBitCount", "Lkotlin/j2;", "a", "Lokio/p;", "source", "Lokio/n;", "sink", "c", "bytes", "d", "Lokio/o;", "", "byteCount", "b", "", "[I", "CODES", "Lokhttp3/internal/http2/k$a;", "Lokhttp3/internal/http2/k$a;", "root", "", "[B", "CODE_BIT_COUNTS", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class k
{
    private static final int[] a;
    private static final byte[] b;
    private static final a c;
    public static final k d;
    
    static {
        final k k = d = new k();
        a = new int[] { 8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846 };
        final byte[] array;
        final byte[] b2 = array = new byte[256];
        array[0] = 13;
        array[1] = 23;
        array[2] = 28;
        array[4] = (array[3] = 28);
        array[6] = (array[5] = 28);
        array[8] = (array[7] = 28);
        array[9] = 24;
        array[10] = 30;
        array[12] = (array[11] = 28);
        array[13] = 30;
        array[15] = (array[14] = 28);
        array[17] = (array[16] = 28);
        array[19] = (array[18] = 28);
        array[21] = (array[20] = 28);
        array[22] = 30;
        array[23] = 28;
        array[25] = (array[24] = 28);
        array[27] = (array[26] = 28);
        array[29] = (array[28] = 28);
        array[31] = (array[30] = 28);
        array[32] = 6;
        array[34] = (array[33] = 10);
        array[35] = 12;
        array[36] = 13;
        array[37] = 6;
        array[38] = 8;
        array[39] = 11;
        array[41] = (array[40] = 10);
        array[42] = 8;
        array[43] = 11;
        array[44] = 8;
        array[45] = 6;
        array[47] = (array[46] = 6);
        array[48] = 5;
        array[50] = (array[49] = 5);
        array[51] = 6;
        array[53] = (array[52] = 6);
        array[55] = (array[54] = 6);
        array[57] = (array[56] = 6);
        array[58] = 7;
        array[59] = 8;
        array[60] = 15;
        array[61] = 6;
        array[62] = 12;
        array[63] = 10;
        array[64] = 13;
        array[65] = 6;
        array[67] = (array[66] = 7);
        array[69] = (array[68] = 7);
        array[71] = (array[70] = 7);
        array[73] = (array[72] = 7);
        array[75] = (array[74] = 7);
        array[77] = (array[76] = 7);
        array[79] = (array[78] = 7);
        array[81] = (array[80] = 7);
        array[83] = (array[82] = 7);
        array[85] = (array[84] = 7);
        array[87] = (array[86] = 7);
        array[88] = 8;
        array[89] = 7;
        array[90] = 8;
        array[91] = 13;
        array[92] = 19;
        array[93] = 13;
        array[94] = 14;
        array[95] = 6;
        array[96] = 15;
        array[97] = 5;
        array[98] = 6;
        array[99] = 5;
        array[100] = 6;
        array[101] = 5;
        array[102] = 6;
        array[104] = (array[103] = 6);
        array[105] = 5;
        array[107] = (array[106] = 7);
        array[108] = 6;
        array[110] = (array[109] = 6);
        array[111] = 5;
        array[112] = 6;
        array[113] = 7;
        array[114] = 6;
        array[116] = (array[115] = 5);
        array[117] = 6;
        array[118] = 7;
        array[120] = (array[119] = 7);
        array[122] = (array[121] = 7);
        array[123] = 15;
        array[124] = 11;
        array[125] = 14;
        array[126] = 13;
        array[127] = 28;
        array[128] = 20;
        array[129] = 22;
        array[131] = (array[130] = 20);
        array[132] = 22;
        array[134] = (array[133] = 22);
        array[135] = 23;
        array[136] = 22;
        array[137] = 23;
        array[139] = (array[138] = 23);
        array[141] = (array[140] = 23);
        array[142] = 24;
        array[143] = 23;
        array[145] = (array[144] = 24);
        array[146] = 22;
        array[147] = 23;
        array[148] = 24;
        array[150] = (array[149] = 23);
        array[152] = (array[151] = 23);
        array[153] = 21;
        array[154] = 22;
        array[155] = 23;
        array[156] = 22;
        array[158] = (array[157] = 23);
        array[159] = 24;
        array[160] = 22;
        array[161] = 21;
        array[162] = 20;
        array[164] = (array[163] = 22);
        array[166] = (array[165] = 23);
        array[167] = 21;
        array[168] = 23;
        array[170] = (array[169] = 22);
        array[171] = 24;
        array[172] = 21;
        array[173] = 22;
        array[175] = (array[174] = 23);
        array[177] = (array[176] = 21);
        array[178] = 22;
        array[179] = 21;
        array[180] = 23;
        array[181] = 22;
        array[183] = (array[182] = 23);
        array[184] = 20;
        array[185] = 22;
        array[187] = (array[186] = 22);
        array[188] = 23;
        array[190] = (array[189] = 22);
        array[191] = 23;
        array[193] = (array[192] = 26);
        array[194] = 20;
        array[195] = 19;
        array[196] = 22;
        array[197] = 23;
        array[198] = 22;
        array[199] = 25;
        array[200] = 26;
        array[202] = (array[201] = 26);
        array[204] = (array[203] = 27);
        array[205] = 26;
        array[206] = 24;
        array[207] = 25;
        array[208] = 19;
        array[209] = 21;
        array[210] = 26;
        array[212] = (array[211] = 27);
        array[213] = 26;
        array[214] = 27;
        array[215] = 24;
        array[217] = (array[216] = 21);
        array[219] = (array[218] = 26);
        array[220] = 28;
        array[221] = 27;
        array[223] = (array[222] = 27);
        array[224] = 20;
        array[225] = 24;
        array[226] = 20;
        array[227] = 21;
        array[228] = 22;
        array[230] = (array[229] = 21);
        array[231] = 23;
        array[233] = (array[232] = 22);
        array[235] = (array[234] = 25);
        array[237] = (array[236] = 24);
        array[238] = 26;
        array[239] = 23;
        array[240] = 26;
        array[241] = 27;
        array[243] = (array[242] = 26);
        array[244] = 27;
        array[246] = (array[245] = 27);
        array[248] = (array[247] = 27);
        array[249] = 28;
        array[250] = 27;
        array[252] = (array[251] = 27);
        array[254] = (array[253] = 27);
        array[255] = 26;
        b = b2;
        c = new a();
        for (int length = b2.length, i = 0; i < length; ++i) {
            k.a(i, okhttp3.internal.http2.k.a[i], okhttp3.internal.http2.k.b[i]);
        }
    }
    
    private k() {
    }
    
    private final void a(int n, int n2, int i) {
        final a a = new a(n, i);
        a c = k.c;
        while (i > 8) {
            i -= 8;
            n = (n2 >>> i & 0xFF);
            final a[] a2 = c.a();
            k0.m((Object)a2);
            if ((c = a2[n]) == null) {
                c = new a();
                a2[n] = c;
            }
        }
        n = 8 - i;
        n2 = (n2 << n & 0xFF);
        final a[] a3 = c.a();
        k0.m((Object)a3);
        m.n2((Object[])a3, (Object)a, n2, (1 << n) + n2);
    }
    
    public final void b(@e final o o, final long n, @e final n n2) {
        k0.p((Object)o, "source");
        k0.p((Object)n2, "sink");
        a a = k.c;
        int n3 = 0;
        long n4 = 0L;
        int i = 0;
        a c;
        int j;
        while (true) {
            c = a;
            j = i;
            if (n4 >= n) {
                break;
            }
            n3 = (n3 << 8 | okhttp3.internal.d.b(o.readByte(), 255));
            i += 8;
            while (i >= 8) {
                final int n5 = i - 8;
                final a[] a2 = a.a();
                k0.m((Object)a2);
                a = a2[n3 >>> n5 & 0xFF];
                k0.m((Object)a);
                if (a.a() == null) {
                    n2.A(a.b());
                    i -= a.c();
                    a = k.c;
                }
                else {
                    i = n5;
                }
            }
            ++n4;
        }
        while (j > 0) {
            final a[] a3 = c.a();
            k0.m((Object)a3);
            final a a4 = a3[n3 << 8 - j & 0xFF];
            k0.m((Object)a4);
            if (a4.a() != null) {
                break;
            }
            if (a4.c() > j) {
                break;
            }
            n2.A(a4.b());
            j -= a4.c();
            c = k.c;
        }
    }
    
    public final void c(@e final p p2, @e final n n) throws IOException {
        k0.p((Object)p2, "source");
        k0.p((Object)n, "sink");
        final int size = p2.size();
        int i = 0;
        long n2 = 0L;
        int j = 0;
        while (i < size) {
            final int b = okhttp3.internal.d.b(p2.u(i), 255);
            final int n3 = k.a[b];
            final byte b2 = k.b[b];
            n2 = (n2 << b2 | (long)n3);
            j += b2;
            while (j >= 8) {
                j -= 8;
                n.A((int)(n2 >> j));
            }
            ++i;
        }
        if (j > 0) {
            n.A((int)(n2 << 8 - j | 255L >>> j));
        }
    }
    
    public final int d(@e final p p) {
        k0.p((Object)p, "bytes");
        final int size = p.size();
        long n = 0L;
        for (int i = 0; i < size; ++i) {
            n += k.b[okhttp3.internal.d.b(p.u(i), 255)];
        }
        return (int)(n + 7 >> 3);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0012R#\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0013" }, d2 = { "okhttp3/internal/http2/k$a", "", "", "Lokhttp3/internal/http2/k$a;", "a", "[Lokhttp3/internal/http2/k$a;", "()[Lokhttp3/internal/http2/k$a;", "children", "", "b", "I", "()I", "symbol", "c", "terminalBitCount", "<init>", "()V", "bits", "(II)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private static final class a
    {
        @f
        private final a[] a;
        private final int b;
        private final int c;
        
        public a() {
            this.a = new a[256];
            this.b = 0;
            this.c = 0;
        }
        
        public a(int n, int n2) {
            this.a = null;
            this.b = n;
            n2 = (n = (n2 & 0x7));
            if (n2 == 0) {
                n = 8;
            }
            this.c = n;
        }
        
        @f
        public final a[] a() {
            return this.a;
        }
        
        public final int b() {
            return this.b;
        }
        
        public final int c() {
            return this.c;
        }
    }
}
