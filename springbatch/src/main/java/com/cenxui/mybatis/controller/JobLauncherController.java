package com.cenxui.mybatis.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cenxui on 4/26/17.
 */
@Controller

public class JobLauncherController {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired @Qualifier("firstJob")
    Job job;

    @RequestMapping("/jobLauncher.html")
    @ResponseBody
    public String handle() {
        try {
            jobLauncher.run(job, new JobParameters());
        } catch (JobExecutionAlreadyRunningException e) {
            e.printStackTrace();
            return "JobExecutionAlreadyRunningException";
        } catch (JobRestartException e) {
            e.printStackTrace();
            return "JobRestartException";
        } catch (JobInstanceAlreadyCompleteException e) {
            e.printStackTrace();
            return "JobInstanceAlreadyCompleteException";
        } catch (JobParametersInvalidException e) {
            e.printStackTrace();
            return  "JobParametersInvalidException";
        }
        return  "Success";
    }
}
