package cn.com.lioan.springboot2.dao.mapper.two;

import cn.com.lioan.springboot2.dao.model.Lioaner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//要么在每个mapper类加上@Mapper，要么在启动类似加上@MapperScan("cn.com.lioan.springboot2.dao.mapper")
@Mapper
public interface LioanerTwoMapper {

    List<Lioaner> getLioaners();

    Lioaner selectByPrimaryKey(String id);

    @Select("select * from lioaner")
    List<Lioaner> getLioaners1();
}
