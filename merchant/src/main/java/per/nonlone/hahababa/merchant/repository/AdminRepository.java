package per.nonlone.hahababa.merchant.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import per.nonlone.hahababa.common.BasePoRepository;
import per.nonlone.hahababa.merchant.mapper.AdminMapper;
import per.nonlone.hahababa.merchant.po.Admin;

@Component
public class AdminRepository extends BasePoRepository<Admin> {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    protected BaseMapper<Admin> getMapper() {
        return adminMapper;
    }
}
