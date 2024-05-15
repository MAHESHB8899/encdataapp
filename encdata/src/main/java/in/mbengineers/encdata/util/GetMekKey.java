package in.mbengineers.encdata.util;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.mbengineers.encdata.config.AES128Bit;
import in.mbengineers.encdata.config.AES256Bit;
import in.mbengineers.encdata.controller.MyComponent;

@Component
public class GetMekKey {

	@Autowired
	MyComponent myComponent;
	
	@Autowired
	GetMekKey mekKey;
	
	public String getMeK(String getmerid,String getkekEncry,String getmekEncry) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, InvalidAlgorithmParameterException, IllegalStateException, IllegalBlockSizeException, BadPaddingException
	{
		String KeK = myComponent.getKkValue(), mekEncry = myComponent.getMkValue(), MeK = "";

		try {
			MeK = AES128Bit.decrypt(mekEncry, KeK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return MeK;
	}

}
