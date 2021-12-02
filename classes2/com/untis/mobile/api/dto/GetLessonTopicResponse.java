// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.timetable.UMLessonTopic;
import java.util.List;
import java.io.Serializable;

public class GetLessonTopicResponse implements Serializable
{
    public List<UMLessonTopic> previousTopics;
    
    public GetLessonTopicResponse() {
        this.previousTopics = new ArrayList<UMLessonTopic>();
    }
}
