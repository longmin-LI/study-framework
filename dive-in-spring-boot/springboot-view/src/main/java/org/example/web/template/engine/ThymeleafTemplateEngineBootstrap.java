package org.example.web.template.engine;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.*;


/**
 * Thymeleaf模板引擎引导类
 * @auhtor llm
 * @data 2022/10/27 13:02
 */
public class ThymeleafTemplateEngineBootstrap {

    public static void main(String[] args) throws IOException {

        //构建引擎
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        //创建渲染上下文
        Context context = new Context();
        context.setVariable("message", "Hello,World");
        //方式一：模板的内容直接在代码中写出
        //说明：对于浏览器而言th:text是一个伪标签
//        String content = "<p th:text=\"${message}\">!!!</p>";
        //方式二：模板内容放在资源路径下
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("templates/hello-world.html");
        File templateFile = resource.getFile();

        FileInputStream fileInputStream = new FileInputStream(templateFile);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOUtils.copy(fileInputStream,outputStream);

        fileInputStream.close();
        String content = outputStream.toString("UTF-8");

        //渲染结果
        String result = templateEngine.process(content,context);
        //输出渲染结果
        System.out.println(result);
    }
}
