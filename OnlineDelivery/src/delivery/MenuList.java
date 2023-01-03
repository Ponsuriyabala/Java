package delivery;
public class MenuList {
	private String menuName,menuType,itemType;
	private int menuID,menuPrice,menuCount,hotelId;
	public MenuList(int menuID,String menuName, String menuType, int menuPrice,int menuCount) {
		this.menuID=menuID;
		this.menuName = menuName;
		this.menuType = menuType;
		this.menuPrice = menuPrice;
		this.menuCount =menuCount;
	}
	public MenuList(int menuPrice, int menuCount, String itemType, int hotelId) {
		this.menuPrice = menuPrice;
		this.menuCount = menuCount;
		this.itemType = itemType;
		this.hotelId = hotelId;
	}
	public MenuList(int menuPrice, int menuCount) {
		this.menuPrice = menuPrice;
		this.menuCount = menuCount;
	}
	public int getMenuID() {
		return menuID;
	}
	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	public int getMenuCount() {
		return menuCount;
	}
	public void setMenuCount(int menuCount) {
		this.menuCount = menuCount;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
}
