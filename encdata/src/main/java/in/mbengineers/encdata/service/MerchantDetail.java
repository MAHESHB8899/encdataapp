package in.mbengineers.encdata.service;

import java.util.List;

import in.mbengineers.encdata.entity.MerchantDetailEntity;

public interface MerchantDetail {
	List<MerchantDetailEntity> getAllSftpReconDetails(String merchantid);
}
