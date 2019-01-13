package cn.com.lioan.springboot2.dao.mapper;

import cn.com.lioan.springboot2.dao.model.Lioaner;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

//要么在每个mapper类加上@Mapper，要么在启动类似加上@MapperScan("cn.com.lioan.springboot2.dao.mapper")
@Mapper
public interface LioanerMapper {

    List<Lioaner> getLioaners();

    Lioaner selectByPrimaryKey(String id);

    @Select("select * from lioaner")
    List<Lioaner> getLioaners1();

    List<Map<String, Object>> getCountBySex();

    @MapKey("userName")
    Map<String, Lioaner> getLioanMaps();
}
