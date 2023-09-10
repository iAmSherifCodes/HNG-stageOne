package com.hnd.task.dto.response;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

@Component
public class Response {
    private final ZoneOffset zoneOffSet = ZoneOffset.of("+02:00");
    private OffsetTime time;
    private String slack_name;
    private String current_day = LocalDateTime.now().getDayOfWeek().toString();
    private String utc_time  = OffsetTime.now(zoneOffSet).toString();
    private String track;
    private final String github_file_url = "https://github.com/iAmSherifCodes/HNG-stageOne/blob/main/src/main/java/com/hnd/task/TaskApplication.java";
    private final String github_repo_url = "https://github.com/iAmSherifCodes/HNG-stageOne";
    private int status_code;

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

    public String getGithub_repo_url() {
        return github_repo_url;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    @Override
    public String toString() {
        return "Response{" +
                "zoneOffSet=" + zoneOffSet +
                ", time=" + time +
                ", slack_name='" + slack_name + '\'' +
                ", current_day='" + current_day + '\'' +
                ", utc_time='" + utc_time + '\'' +
                ", track='" + track + '\'' +
                ", github_file_url='" + github_file_url + '\'' +
                ", github_repo_url='" + github_repo_url + '\'' +
                ", status_code=" + status_code +
                '}';
    }
}
