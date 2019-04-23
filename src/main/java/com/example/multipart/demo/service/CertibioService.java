package com.example.multipart.demo.service;

import com.example.multipart.demo.integration.CertibioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@Service
public class CertibioService {

    private CertibioClient certibioClient;

    @Autowired
    public CertibioService(CertibioClient certibioClient) {
        this.certibioClient = certibioClient;
    }

    public void uploadZip(MultipartFile zipPhotos) {
        MultipartFile sessionId = new MultipartFile() {

            @Override
            public String getName() {
                return "sessionId";
            }

            @Override
            public String getOriginalFilename() {
                return null;
            }

            @Override
            public String getContentType() {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public byte[] getBytes() throws IOException {
                return "2d83913c-172d-41dd-8b7f-3e672212a1af".getBytes();
            }

            @Override
            public InputStream getInputStream() throws IOException {
                return null;
            }

            @Override
            public void transferTo(File file) throws IOException, IllegalStateException {

            }
        };

        certibioClient.liveness(new MultipartFile[]{zipPhotos, sessionId}, "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyX2N0YiIsImV4cCI6MTU1NjgyMDI0NywiYXV0aCI6WyJST0xFX1VTRVIiXX0.jYDs79IQwiiPh3QQllAA1kP0xWlyQaHcQrljGcHjP5viXAiA2jEcvtKJ6cgntANw61xAL-CUhoMFw2E3QenKxg", "dkhEZxif62bM4VLk0oATyE0O8dAfetPl");
    }
}
