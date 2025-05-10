package com.ydl.nmis.base.service.impl;

import com.ydl.nmis.base.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    private static final String BASE_DIR = "uploads/";

    @Override
    public String uploadFile(MultipartFile file, String fileType) throws IOException {
        // 根据文件类型生成存储目录
        String uploadDir = BASE_DIR + fileType + "/";
        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // 生成唯一文件名
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        File targetFile = new File(dir.getAbsolutePath() + File.separator + fileName);
        file.transferTo(targetFile);

        return targetFile.getAbsolutePath();
    }
}