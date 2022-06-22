package IFDomain.domain.userInfo.dao.mysql;

import IFDomain.domain.userInfo.UserInfo;
import IFDomain.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySQLDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID = " + userInfo.getUserID());
		}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into MySQL DB userID = " + userInfo.getUserID());		
	}

}
