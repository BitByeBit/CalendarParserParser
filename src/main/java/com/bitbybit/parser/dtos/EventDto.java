package com.bitbybit.parser.dtos;

import com.bitbybit.parser.models.EventType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDto {
    public Long eventId;
    public String name;
    public EventType type;
    public String timeslot;
    public String weekday;
    public Integer parity;
    public String extra;

    public String tag;

    public EventDto(String name, EventType type, String timeslot, String weekday, Integer parity) {
        this.name = name;
        this.type = type;
        this.timeslot = timeslot;
        this.weekday = weekday;
        this.parity = parity;
    }

    public EventDto() {}
}
