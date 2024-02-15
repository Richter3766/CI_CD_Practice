package com.example.ci_cd_practice.services;

import org.springframework.stereotype.Service;

@Service
public class PrintService {
    public String print(){
        return "정상 작동합니다.";
    }
}
