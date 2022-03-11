package com.jie.dataservice;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.Response;
import feign.Util;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * @author hexiaogou
 * @classname FeignErrorDecoder
 * @description feign error decoder
 * @date 2022/3/10 18:59
 */
@Component
public class FeignErrorDecoder implements feign.codec.ErrorDecoder {
    private static final int GENERAL_RESPONSE_STATUS_CODE_LOW = 400;
    private static final int GENERAL_RESPONSE_STATUS_CODE_HIGH = 499;

    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            if (response.status() >= GENERAL_RESPONSE_STATUS_CODE_LOW &&
                    response.status() <= GENERAL_RESPONSE_STATUS_CODE_HIGH) {
                String error = Util.toString(response.body().asReader());
                return new HystrixBadRequestException(error);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return feign.FeignException.errorStatus(methodKey, response);
    }
}
