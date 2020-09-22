package cn.scoreanalysis.system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //加载公共页
        registry.addViewController("common/index").setViewName("common/index");
        registry.addViewController("common/footer").setViewName("common/footer");
        registry.addViewController("common/header").setViewName("common/header");
        registry.addViewController("common/aside").setViewName("common/aside");
        //加载用户相关页面
        registry.addViewController("user/userAdd").setViewName("user/userAdd");
        registry.addViewController("user/userList").setViewName("user/userList");
        registry.addViewController("user/setRole").setViewName("user/setRole");
        registry.addViewController("user/showUserRole").setViewName("user/showUserRole");
        //registry.addViewController("user/select")

        //加载年级相关页面
        registry.addViewController("grade/gradeAdd").setViewName("grade/gradeAdd");
        registry.addViewController("grade/gradeList").setViewName("grade/gradeList");
        registry.addViewController("grade/editGrade").setViewName("grade/editGrade");
        //加载班级相关页面
        registry.addViewController("classes/addClasses").setViewName("classes/addClasses");
        registry.addViewController("classes/classesList").setViewName("classes/classesList");
        registry.addViewController("classes/editClasses").setViewName("classes/editClasses");
        //加载专业相关页面
        registry.addViewController("profession/addProfession").setViewName("profession/addProfession");
        registry.addViewController("profession/professionList").setViewName("profession/professionList");
        registry.addViewController("profession/editProfession").setViewName("profession/editProfession");
    }
}
