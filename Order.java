import java.util.ArrayList;
import java.util.List;

/**
 * 淘宝订单实体类
 */
public class Order {
    /**
     * 订单编号
     */
    private int orderId;
    /**
     * 卖家id
     */
    private int sellerId;
    /**
     * 买家id
     */
    private int buyerId;
    /**
     * 下单时间
     */
    private String timePay;
    /**
     * 订单完成时间
     */
    private String timeFinish;
    /**
     * 商品名称
     */
    private List<Goods> goodsName;
    /**
     * 商品价格
     */
    private short goodsPrice;
    /**
     * 运费
     */
    private short freight;
    /**
     * 收货地址
     */
    private String orderGoal;
    /**
     * 物流信息
     */
    private List<String> logistics = new ArrayList<>();
    /**
     * 订单评价
     */
    private String evaluation;
}
