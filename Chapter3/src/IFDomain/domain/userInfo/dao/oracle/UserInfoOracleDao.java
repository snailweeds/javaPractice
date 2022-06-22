package IFDomain.domain.userInfo.dao.oracle;

import IFDomain.domain.userInfo.UserInfo;
import IFDomain.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID = " + userInfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into Oracle DB userID = " + userInfo.getUserID());
		}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into Oracle DB userID = " + userInfo.getUserID());		
	}

}
