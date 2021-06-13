package per.nonlone.hahababa.common;

import java.io.Serializable;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BasePoRepository<Entity extends BasePo>{

    protected abstract BaseMapper<Entity> getMapper();

    public int insert(Entity entity){
        return getMapper().insert(entity);
    }

    public int updateById(Entity entity){
        return getMapper().updateById(entity);
    }

    public int deleteById(Serializable id){
        return getMapper().deleteById(id);
    }

    public Entity selectById(Serializable id){
        return getMapper().selectById(id);
    }
}
