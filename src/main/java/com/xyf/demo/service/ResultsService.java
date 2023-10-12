package com.xyf.demo.service;

import com.xyf.demo.bean.Rank;
import com.xyf.demo.bean.Results;

import java.util.List;

public interface ResultsService {

    List<Results> getAllResult();

    List<Results> selectByStuId(String stuId);

    List<Results> selectByStuIdAndResTerm(String stuId, String resTerm);

    int addResult(Results results);

    int deleteResultById(int resId);

    Results selectResultByStuIdAndSubName(String stuId, String subName);

    Results selectResultByResId(int resId);

    List<Rank> selectRankByTerm(String resTerm);

    List<Rank> selectRankByTermAndStuClass(String resTerm, String stuClass);

    int updateStuIdAndSubNameByResId(String stuId, String subName, Integer resId);
}
