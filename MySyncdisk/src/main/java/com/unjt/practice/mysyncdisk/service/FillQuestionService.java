package com.unjt.practice.mysyncdisk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unjt.practice.mysyncdisk.entity.FillQuestion;

import java.util.List;

public interface FillQuestionService {

    List<FillQuestion> findByIdAndType(Integer paperId);

    IPage<FillQuestion> findAll(Page<FillQuestion> page);

    FillQuestion findOnlyQuestionId();

    int add(FillQuestion fillQuestion);

    List<Integer> findBySubject(String subject,Integer pageNo);
}
