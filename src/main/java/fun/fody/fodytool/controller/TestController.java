package fun.fody.fodytool.controller;

import fun.fody.fodytool.entity.TestEntity;
import fun.fody.fodytool.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zhu Guodong
 * @since 2024-02-14
 */
@Controller
@RequestMapping("/test")
@ResponseBody
public class TestController {


    @Autowired
    ITestService testService;

    @RequestMapping("/getById")
    public TestEntity getById(@RequestParam("id") Long id) {

        return testService.getById(id);
    }
}
