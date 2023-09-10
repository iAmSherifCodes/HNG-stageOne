package com.hnd.task.controller;


import com.hnd.task.dto.response.Response;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint/sherif")
@AllArgsConstructor
@Slf4j
public class Controller {
    private Response response;

    @GetMapping("/data")
    public ResponseEntity<Response> myEndPoint(@RequestParam String slack_name, @RequestParam String track){
        response.setSlack_name(slack_name);
        response.setTrack(track);
        response.setStatus_code(HttpStatus.OK.value());

        log.info(response.toString());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
