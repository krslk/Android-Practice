package com.unjt.practice.mysyncdisk.service.impl;

import com.unjt.practice.mysyncdisk.entity.Replay;
import com.unjt.practice.mysyncdisk.mapper.ReplayMapper;
import com.unjt.practice.mysyncdisk.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplayServiceImpl implements ReplayService {

    @Autowired
    private ReplayMapper replayMapper;

    @Override
    public List<Replay> findAll() {
        return replayMapper.findAll();
    }

    @Override
    public List<Replay> findAllById(Integer messageId) {
        return replayMapper.findAllById(messageId);
    }

    @Override
    public Replay findById(Integer replayId) {
        return replayMapper.findById(replayId);
    }

    @Override
    public int delete(Integer replayId) {
        return replayMapper.delete(replayId);
    }

    @Override
    public int update(Replay replay) {
        return replayMapper.update(replay);
    }

    @Override
    public int add(Replay replay) {
        return replayMapper.add(replay);
    }
}
