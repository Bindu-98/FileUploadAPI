package com.technocrats.file.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface IFileStorageService {

    void init();

    void save(MultipartFile file);

    void deleteAll();

    Stream<Path> loadAll();

    Resource load(String fileName);
}
