package com.devwithcao.myportfolio.service.impl;

import com.devwithcao.myportfolio.dto.WorkHistory;
import com.devwithcao.myportfolio.repository.UserRepository;
import com.devwithcao.myportfolio.service.ContentManagementService;
import org.springframework.stereotype.Service;

@Service
public class ContentManagementServiceImpl implements ContentManagementService {

    private final UserRepository userRepository;

    public ContentManagementServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public WorkHistory initWorkHistory(String userId) {
        return null;
    }
}
