package com.ydl.web.controller.base;

import com.ydl.nmis.base.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/file")
public class FileController {

    @Autowired
    private FileService fileService;

    // 上传护士照片
    @PostMapping("/uploadNursePhoto")
    public ResponseEntity<String> uploadNursePhoto(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = fileService.uploadFile(file, "nurse_photo");
            return ResponseEntity.ok(filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload nurse photo");
        }
    }

    // 上传护士证件文件
    @PostMapping("/uploadNurseDocument")
    public ResponseEntity<String> uploadNurseDocument(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = fileService.uploadFile(file, "nurse_document");
            return ResponseEntity.ok(filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload nurse document");
        }
    }

    // 上传科室照片
    @PostMapping("/uploadDepartmentPhoto")
    public ResponseEntity<String> uploadDepartmentPhoto(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = fileService.uploadFile(file, "department_photo");
            return ResponseEntity.ok(filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload department photo");
        }
    }

    // 上传科室档案
    @PostMapping("/uploadDepartmentDocument")
    public ResponseEntity<String> uploadDepartmentDocument(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = fileService.uploadFile(file, "department_document");
            return ResponseEntity.ok(filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload department document");
        }
    }
}