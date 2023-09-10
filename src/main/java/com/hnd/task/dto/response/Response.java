package com.hnd.task.dto.response;

import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

public class Response {
    ZoneOffset zoneOffSet = ZoneOffset.of("+02:00");
    OffsetTime time;
    private String slack_name;
    private String current_day = LocalDateTime.now().getDayOfWeek().toString();
    private String utc_time  = OffsetTime.now(zoneOffSet).toString();
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private HttpStatusCode status_code ;

    public ZoneOffset getZoneOffSet() {
        return zoneOffSet;
    }

    public void setZoneOffSet(ZoneOffset zoneOffSet) {
        this.zoneOffSet = zoneOffSet;
    }

    public OffsetTime getTime() {
        return time;
    }

    public void setTime(OffsetTime time) {
        this.time = time;
    }

    public String getSlack_name() {
        return slack_name;
    }

    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }

    public String getCurrent_day() {
        return current_day;
    }

    public void setCurrent_day(String current_day) {
        this.current_day = current_day;
    }

    public String getUtc_time() {
        return utc_time;
    }

    public void setUtc_time(String utc_time) {
        this.utc_time = utc_time;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithub_file_url() {
        return github_file_url;
    }

    public void setGithub_file_url(String github_file_url) {
        this.github_file_url = github_file_url;
    }

    public String getGithub_repo_url() {
        return github_repo_url;
    }

    public void setGithub_repo_url(String github_repo_url) {
        this.github_repo_url = github_repo_url;
    }

    public HttpStatusCode getStatus_code() {
        return status_code;
    }

    public void setStatus_code(HttpStatusCode status_code) {
        this.status_code = status_code;
    }
}
