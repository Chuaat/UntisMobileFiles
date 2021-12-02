// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.t0;

@t0({ t0.a.I })
public class t2
{
    public static final String a = "room_master_table";
    public static final String b = "room_master_table";
    private static final String c = "id";
    private static final String d = "identity_hash";
    public static final String e = "42";
    public static final String f = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    public static final String g = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";
    
    private t2() {
    }
    
    public static String a(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }
}
