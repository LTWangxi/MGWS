package com.org.mgws.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.org.mgws.base.dao.BaseDao;
import com.org.mgws.dao.TPurchaseRecordDao;
import com.org.mgws.dto.PurchaseInfo;
import com.org.mgws.entity.TPurchaseRecord;

@Repository
public class TPurchaseRecordDaoImpl extends BaseDao implements
		TPurchaseRecordDao {

	@Override
	public int deleteByPrimaryKey(TPurchaseRecord record) {
		return delete("tPurchaseRecordMapper.deleteByPrimaryKey", record);
	}

	@Override
	public int insert(TPurchaseRecord record) {
		return super.insert("tPurchaseRecordMapper.insertSelective", record);
	}

	@Override
	public TPurchaseRecord selectByPrimaryKey(Long no) {
		return super.selectOne("tPurchaseRecordMapper.selectByPrimaryKey", no);
	}
	@Override
	public List<PurchaseInfo> selectByCustomerNo1(String customerNo) {
		return super.select("tPurchaseRecordMapper.selectByCustomerNo1", customerNo);
	}

	@Override
	public List<PurchaseInfo> selectByCustomerNo(String customerNo) {
		return super.select("tPurchaseRecordMapper.selectByCustomerNo", customerNo);
	}

	@Override
	public int updateByPrimaryKey(TPurchaseRecord record) {
		return super.update("com.org.mgws.dao.TInvestmentValueMapper.updateByPrimaryKeySelective", record);
	}

}