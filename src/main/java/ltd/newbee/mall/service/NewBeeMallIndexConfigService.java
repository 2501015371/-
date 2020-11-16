
package ltd.newbee.mall.service;

import ltd.newbee.mall.api.vo.NewBeeMallIndexConfigGoodsVO;
import java.util.List;

public interface NewBeeMallIndexConfigService {

    /**
     * 返回固定数量的首页配置商品对象(首页调用)
     *
     * @param number
     * @return
     */
    List<NewBeeMallIndexConfigGoodsVO> getConfigGoodsesForIndex(int configType, int number);
}
