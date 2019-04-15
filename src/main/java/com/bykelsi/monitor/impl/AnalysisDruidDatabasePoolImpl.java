package com.bykelsi.monitor.impl;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.bykelsi.monitor.IAnalysisDruidDatabasePool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController("analysis")
public class AnalysisDruidDatabasePoolImpl implements IAnalysisDruidDatabasePool{

    @RequestMapping("/druidData")
    @Override
    public List<Map<String, Object>> getAnalysisDruidData() {
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList() ;
    }
}
