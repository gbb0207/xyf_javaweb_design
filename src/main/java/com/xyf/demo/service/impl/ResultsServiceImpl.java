package com.xyf.demo.service.impl;

import com.xyf.demo.bean.Rank;
import com.xyf.demo.bean.Results;
import com.xyf.demo.mapper.ResultMapper;
import com.xyf.demo.mapper.StudentMapper;
import com.xyf.demo.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ResultsServiceImpl implements ResultsService {

    @Autowired
    private ResultMapper resultMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Results> getAllResult() {
        return resultMapper.selectAllResult();
    }

    @Override
    public List<Results> selectByStuId(String stuId) {
        return resultMapper.selectResultByStuId(stuId);
    }

    @Override
    public List<Results> selectByStuIdAndResTerm(String stuId, String resTerm) {
        return resultMapper.selectResultByStuIdAndTerm(stuId, resTerm);
    }

    @Override
    public int addResult(Results results) {
        return resultMapper.insertResult(results);
    }

    @Override
    public int deleteResultById(int resId) {
        return resultMapper.deleteResultById(resId);
    }

    @Override
    public Results selectResultByStuIdAndSubName(String stuId, String subName) {
        return resultMapper.selectResultByStuIdAndSubName(stuId, subName);
    }

    @Override
    public Results selectResultByResId(int resId) {
        return resultMapper.selectResultByResId(resId);
    }

    @Override
    public List<Rank> selectRankByTerm(String resTerm) {
        List<Rank> ranks = resultMapper.selectRankByTerm(resTerm);
        for (Rank r : ranks) {
            Map<String, Integer> reamap = new HashMap<>();
            List<Map<String, Integer>> maps = resultMapper.selectResultMap(r.getStuId(), r.getResTerm());
            for (Map map : maps) {
                reamap.put((String) map.get("sub_name"), (Integer) map.get("res_num"));
            }
            r.setStuName(studentMapper.selectNameById(r.getStuId()));
            r.setResmap(reamap);
        }
        return ranks;
    }

    @Override
    public List<Rank> selectRankByTermAndStuClass(String resTerm, String stuClass) {
        List<Rank> ranks = resultMapper.selectRankByTermAndStuId(studentMapper.selectIdByClass(stuClass), resTerm);
        for (Rank r : ranks) {
            Map<String, Integer> reamap = new HashMap<>();
            List<Map<String, Integer>> maps = resultMapper.selectResultMap(r.getStuId(), r.getResTerm());
            for (Map map : maps) {
                reamap.put((String) map.get("sub_name"), (Integer) map.get("res_num"));
            }
            r.setStuName(studentMapper.selectNameById(r.getStuId()));
            r.setResmap(reamap);
        }
        return ranks;
    }

    @Override
    public int updateStuIdAndSubNameByResId(String stuId, String subName, Integer resId) {
        return resultMapper.updateStuIdAndSubNameByResId(stuId, subName, resId);
    }


}
