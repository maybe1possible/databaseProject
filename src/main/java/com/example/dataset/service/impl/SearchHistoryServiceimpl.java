package com.example.dataset.service.impl;

import com.example.dataset.VO.SearchHistoryVO;
import com.example.dataset.mapper.SearchHistoryMapper;
import com.example.dataset.service.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SearchHistoryServiceimpl implements SearchHistoryService {

    @Autowired
    private SearchHistoryMapper searchHistoryMapper;

    @Override
    public void addSearchHistory(Integer userId, String keyword) {
        searchHistoryMapper.addSearchHistory(userId, keyword, LocalDateTime.now());
    }

    @Override
    public List<SearchHistoryVO> getSearchHistory(Integer userId) {
        return searchHistoryMapper.getSearchHistoryByUserId(userId);
    }
}
