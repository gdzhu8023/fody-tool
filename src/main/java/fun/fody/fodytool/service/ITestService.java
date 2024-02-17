package fun.fody.fodytool.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.fody.fodytool.entity.TestEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Zhu Guodong
 * @since 2024-02-14
 */
public interface ITestService extends IService<TestEntity> {

    TestEntity getById(Long id);
}
