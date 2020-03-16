/**
 * 淘宝商品实体类
 */
public class Goods {
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品价格
     */
    private short goodsPrice;
    /**
     * 商品库存
     */
    private int goodsInventory;
    /**
     * 商品销量
     */
    private int goodsSales;
    /**
     * 商品id
     */
    private int goodsId;
    /**
     * 商品类别
     */
    private String goodsKind;
    /**
     * 父级id
     */
    private int parentId;
    /**
     * 子级id
     */
    private int childId;
    /**
     * 卖家id
     */
    private int sellerId;
    /**
     * 买家id
     */
    private int buyerId;
    /**
     * 商品上架时间
     */
    private String timePutaway;
    /**
     * 商品被购买时间
     */
    private String timeBuy;
    /**
     * 商品评价数量
     */
    private int evaluationNum;
}
