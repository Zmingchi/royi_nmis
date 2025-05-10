package com.ydl.nmis.base.mapper;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileMapper {
    String uploadFile(MultipartFile file, String fileType) throws IOException;
}