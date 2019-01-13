package cn.com.lioan.springboot2.service.impl;

import cn.com.lioan.springboot2.dao.mapper.LioanerMapper;
import cn.com.lioan.springboot2.dao.model.Lioaner;
import cn.com.lioan.springboot2.service.LioanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LioanerServiceImpl implements LioanerService {

    @Autowired
    private LioanerMapper lioanerMapper;

    @Override
    public List<Lioaner> getLioaners() {
        return lioanerMapper.getLioaners();
    }

    @Override
    public List<Lioaner> getLioaners1() {
        return lioanerMapper.getLioaners1();
    }

    @Override
    public Lioaner getLioanerById(String id) {
        return lioanerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, Object>> getCountBySex() {
        return lioanerMapper.getCountBySex();
    }

    @Override
    public Map<String, Lioaner> getLioanMaps() {
        return lioanerMapper.getLioanMaps();
    }
}
