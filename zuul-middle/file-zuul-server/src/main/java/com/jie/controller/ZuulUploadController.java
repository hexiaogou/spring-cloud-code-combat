package com.jie.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author hexiaogou
 * @classname ZuulUploadController
 * @description zuul upload controller
 * @date 2022/6/24 17:33
 */
@RestController
public class ZuulUploadController {
    @PostMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);
        return fileToSave.getAbsolutePath();
    }

    @GetMapping("/add")
    public String add(Integer a, Integer b, HttpServletRequest request){
        return "service file-zuul-server, port: " + request.getServerPort() + ", result=" + (a + b);
    }
}
