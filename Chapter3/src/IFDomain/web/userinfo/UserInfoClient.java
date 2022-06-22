package IFDomain.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import IFDomain.domain.userInfo.UserInfo;
import IFDomain.domain.userInfo.dao.UserInfoDao;
import IFDomain.domain.userInfo.dao.mysql.UserInfoMySQLDao;
import IFDomain.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("10001");
		userInfo.setUserName("One");
		userInfo.setPassword("!234#44");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySQLDao();
		}
		else {
			System.out.println("Not Supported DB");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
