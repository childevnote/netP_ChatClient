import java.util.Vector;

public class HomePageMain {
	ChatMsg cm;

	public Vector<Friend> FriendVector = new Vector<Friend>();

	public void LoginNewFriend(ChatMsg cm) {
		for (Friend f : FriendVector) {
			if(f.UserName.equals(cm.UserName)) {
				if(cm.UserStatus.equals("O"))
					f.SetOnline(true);
				else
					f.SetOnline(false);
				f.SetStatusMsg(cm);
				return;
			}
		}
		AddFriend(cm.)
	}
}
