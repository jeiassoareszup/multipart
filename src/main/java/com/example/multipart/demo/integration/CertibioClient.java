package com.example.multipart.demo.integration;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(
        name = "certibio-client",
        url = "https://app-facecheck-hmg-000.certib.io",
        configuration = CertibioClient.ClientConfiguration.class
)
public interface CertibioClient {

    @RequestMapping(
            value = "/rest/zoom/liveness",
            method = POST,
            consumes = MULTIPART_FORM_DATA_VALUE
    )
    ResponseEntity<LivenessResponse> liveness(@RequestPart MultipartFile[] file, @RequestHeader("Authorization") String jwt, @RequestHeader("X-App-Token") String key);

    class ClientConfiguration {

        private ObjectFactory<HttpMessageConverters> messageConverters;

        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder(new SpringEncoder(messageConverters));
        }
    }
}
