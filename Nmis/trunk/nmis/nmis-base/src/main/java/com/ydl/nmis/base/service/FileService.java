package com.ydl.nmis.base.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    String uploadFile(MultipartFile file, String fileType) throws IOException;
}
