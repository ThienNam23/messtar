package com.thiennam.messtar.service;

import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public interface StorageService {
    String NAME = "messtar_StorageService";
    boolean saveFile(String fileName, MultipartFile file, Path dest);
    void saveFiles(List<MultipartFile> files, Path dest);
    Path getPath(LocalDateTime now);
}