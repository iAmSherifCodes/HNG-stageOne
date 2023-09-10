package com.hnd.task.dto.request;

import org.springframework.stereotype.Component;

@Component
public class Request {
    private String slack_name;
    private String track;

    public String getSlack_name() {
        return slack_name;
    }

    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }
}
