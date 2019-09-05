package com.goya.mapper;

import com.goya.pojo.TbOrderItem;
import com.goya.pojo.TbOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int countByExample(TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int deleteByExample(TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int insert(TbOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int insertSelective(TbOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    TbOrderItem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int updateByPrimaryKeySelective(TbOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbggenerated Wed Sep 04 14:08:51 CST 2019
     */
    int updateByPrimaryKey(TbOrderItem record);
}