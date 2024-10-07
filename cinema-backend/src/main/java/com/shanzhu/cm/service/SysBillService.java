package com.shanzhu.cm.service;

import com.shanzhu.cm.domain.SysBill;

import java.util.List;

/**
 * 订单服务层接口
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
public interface SysBillService {

    List<SysBill> findAllBills(SysBill sysBill);

    SysBill findBillById(Long id);

    Object addBill(SysBill sysBill);

    int updateBill(SysBill sysBill);

    int deleteBill(Long[] ids);

    List<SysBill> findTimeoutBill();

}
