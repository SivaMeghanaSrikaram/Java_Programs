package com.gym;

public class UserImpl implements IUser{
	
	private User users[];
	
	UserImpl()
	{
		users=new User[3];
	}
	
	@Override
	public boolean register(User user, int index) {
		System.out.println("User info is:"+user);
		users[index]=user;
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("User username and password is:"+username+" "+password);
		for(User user:users)
		{
			if(user!=null)
			{
				if(user.getUserName().equals(username) && user.getPassword().equals(password))
				{
					return true;
				}
			}
		}
		return false;
	}
}