// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import android.content.res.Resources;
import java.io.Serializable;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;

public class q
{
    private static final String a = "entry";
    private static final String b = "key";
    private static final String c = "value";
    
    public static Map<String, String> a(Context resources, int i) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            resources = (IOException)((Context)resources).getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
                return hashMap;
            }
            final XmlResourceParser xml = ((Resources)resources).getXml(i);
            i = xml.getEventType();
            Serializable s = null;
            Serializable s2 = resources = (IOException)s;
            while (i != 1) {
                String name;
                Serializable text;
                Serializable text2;
                if (i == 2) {
                    name = xml.getName();
                    text = s2;
                    text2 = resources;
                }
                else if (i == 3) {
                    text = s2;
                    text2 = resources;
                    if (xml.getName().equals("entry")) {
                        if (s2 != null && resources != null) {
                            hashMap.put((String)s2, (String)resources);
                        }
                        else {
                            Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                        }
                        text = (text2 = null);
                    }
                    name = null;
                }
                else {
                    name = (String)s;
                    text = s2;
                    text2 = resources;
                    if (i == 4) {
                        name = (String)s;
                        text = s2;
                        text2 = resources;
                        if (s != null) {
                            i = -1;
                            final int hashCode = ((String)s).hashCode();
                            if (hashCode != 106079) {
                                if (hashCode == 111972721) {
                                    if (((String)s).equals("value")) {
                                        i = 1;
                                    }
                                }
                            }
                            else if (((String)s).equals("key")) {
                                i = 0;
                            }
                            if (i != 0) {
                                if (i != 1) {
                                    Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                                    name = (String)s;
                                    text = s2;
                                    text2 = resources;
                                }
                                else {
                                    text2 = xml.getText();
                                    name = (String)s;
                                    text = s2;
                                }
                            }
                            else {
                                text = xml.getText();
                                text2 = resources;
                                name = (String)s;
                            }
                        }
                    }
                }
                i = xml.next();
                s = name;
                s2 = text;
                resources = (IOException)text2;
            }
            return hashMap;
        }
        catch (IOException resources) {}
        catch (XmlPullParserException ex) {}
        Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", (Throwable)resources);
        return hashMap;
    }
}
