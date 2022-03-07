package com.jie.controller;

import com.jie.service.FileUploadFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author hexiaogou
 * @classname FeignUploadController
 * @description feign upload controller
 * @date 2022/3/7 19:00
 */
@RestController
@Api(value = "文件上传")
@RequestMapping(value = "/feign")
public class FeignUploadController {
    @Autowired
    FileUploadFeignService uploadFeignService;

    @RequestMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ApiOperation(value = "文件上传", notes = "请选择文件上传")

    public String imageUpload(@ApiParam(value = "文件上传", required = true) MultipartFile file) throws Exception {
        return uploadFeignService.fileUpload(file);
    }
}
