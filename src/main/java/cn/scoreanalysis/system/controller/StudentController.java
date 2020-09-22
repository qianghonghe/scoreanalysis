package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.service.StudentServic;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentServic studentServic;


}
