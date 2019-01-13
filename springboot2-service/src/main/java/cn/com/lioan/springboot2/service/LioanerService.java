package cn.com.lioan.springboot2.service;

import cn.com.lioan.springboot2.dao.model.Lioaner;

import java.util.List;
import java.util.Map;

public interface LioanerService {
    List<Lioaner> getLioaners();
    List<Lioaner> getLioaners1();
    Lioaner getLioanerById(String id);
    List<Map<String, Object>> getCountBySex();
    Map<String, Lioaner> getLioanMaps();
}
