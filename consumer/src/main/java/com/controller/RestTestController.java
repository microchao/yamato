package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Controller
@RequestMapping(path = "/test")
@ResponseStatus(HttpStatus.OK)
public class RestTestController {

    Logger logger = Logger.getLogger("RestTestController");

    @PostMapping(path="/postTest",produces = "application/json")
    @ResponseBody
    public Object test() {
        TaskReturnObj taskReturnObj = new TaskReturnObj();
        taskReturnObj.setData("success");
        taskReturnObj.setResultFlag(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String msg = "RestTestController 当前被执行时间：" + simpleDateFormat.format(new Date());
        logger.info(msg);
        return taskReturnObj;
    }
}
