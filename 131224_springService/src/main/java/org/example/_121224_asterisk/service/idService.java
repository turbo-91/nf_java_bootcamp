package org.example._121224_asterisk.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class idService {
    public String generateId(){
        return UUID.randomUUID().toString();
    }
}
