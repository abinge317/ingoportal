package com.ingo.portal.repository;

import com.ingo.portal.entity.BasicInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jbpeng on 18-3-26.
 */
@Repository
public interface BasicInfoRepository extends CrudRepository<BasicInfo, Integer> {
    BasicInfo findBasicInfoById(Integer id);
}