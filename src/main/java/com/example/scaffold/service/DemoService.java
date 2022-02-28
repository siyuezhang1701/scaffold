package com.example.scaffold.service;

import com.example.scaffold.repository.DemoRepository;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public String save() {
        return demoRepository.saveDemoEntity();
    }
}
