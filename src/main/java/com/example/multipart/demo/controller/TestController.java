package com.example.multipart.demo.controller;

import com.example.multipart.demo.service.CertibioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

@RestController
public class TestController {

    private CertibioService certibioService;

    @Autowired
    public TestController(CertibioService certibioService) {
        this.certibioService = certibioService;
    }

    @CrossOrigin
    @PostMapping(value = "/loginZoom", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String login(){
        return "{\n" +
                "      \"jwt\": \"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyX2N0YiIsImV4cCI6MTU1NDY0NzIwOSwiYXV0aCI6WyJST0xFX1VTRVIiXX0.yb5J7UaleOiIa-urjRgCeFVgEcfvLe1W2g1El-yGrhAiVO6Xp3lOSdFWKomf2afRqTjSLpqXr8UqhpljSMli9Q\",\n" +
                "      \"zoom_kt\": {\n" +
                "        \"domains\": \"app-facecheck-003.certib.io\",\n" +
                "        \"expiryDate\": \"2019-04-29\",\n" +
                "        \"key\": \"003045022007bb43521a097f7c7fc6f4e6bbb33d9c64d6f8b1b9db9f40992459a6607c493e022100ff590d2a64911e9a93a82095d9c21d31de06aac3eaea85e2b3508c3b33510858\"\n" +
                "      },\n" +
                "      \"zoom_app\": \"appId=com.flexipag.micro\\nexpiryDate=2019-11-24\\nkey=003045022043a0615d7fb717c1be5510947fc467f31c6eb0d63961a8a1143900ee5cac6cce022100d25581eee3fed2a076c78ee25a3e0778329241b10cc407b530c367ddd6c50fdc\"\n" +
                "    }";
    }

    @CrossOrigin
    @PostMapping("/rest/zoom/liveness")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void upload(@RequestPart("zoomSessionData") MultipartFile zipPhotos, @RequestPart("sessionId") String sessionId) {
        System.out.println("test");
        certibioService.uploadZip(zipPhotos);
    }
}
