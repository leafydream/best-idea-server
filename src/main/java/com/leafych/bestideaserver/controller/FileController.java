package com.leafych.bestideaserver.controller;

import com.leafych.bestideaserver.config.UploadConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class FileController {

    @PostMapping("/fileUpload")
    public Map<String, Object> fileUpload(@RequestParam("file") MultipartFile file) {
        Map<String, Object> resultMap = new HashMap<>();
        if(file.isEmpty()){
            resultMap.put("文件为空", false);
            return resultMap;
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        File fileDir = UploadConfig.getImgDirFile();

        //获取文件后缀名
        String ext = fileName.substring(fileName.lastIndexOf("."));

        try {
            File dest = new File(fileDir.getAbsolutePath() + File.separator + UUID.randomUUID() + ext);
            file.transferTo(dest);
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("上传失败", false);
            return resultMap;
        }
        resultMap.put("上传成功", true);
        return resultMap;
    }
}
