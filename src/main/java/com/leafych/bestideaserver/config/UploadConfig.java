package com.leafych.bestideaserver.config;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class UploadConfig {
    public final static String IMG_PATH_PREFIX = "static/upload";

    public static File getImgDirFile() {
        // 构建上传文件的文件夹路径
        StringBuilder fileDirPath = new StringBuilder().append("src/main/resources/").append(IMG_PATH_PREFIX);
        File fileDir = new File(fileDirPath.toString());

        if (!fileDir.exists()) {
            // 递归生成文件夹
            fileDir.mkdirs();
        }
        return fileDir;
    }
}
