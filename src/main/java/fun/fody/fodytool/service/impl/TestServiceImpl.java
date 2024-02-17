package fun.fody.fodytool.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fody.fodytool.entity.TestEntity;
import fun.fody.fodytool.mapper.TestMapper;
import fun.fody.fodytool.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Zhu Guodong
 * @since 2024-02-14
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestEntity> implements ITestService {

    @Override
    public TestEntity getById(Long id) {
        return this.baseMapper.selectById(id);
    }
}
