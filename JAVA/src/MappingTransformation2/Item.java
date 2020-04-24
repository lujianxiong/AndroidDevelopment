package MappingTransformation2;

public class Item {
	private long iid;
	private String title;
	private SubItem subitem[];
	
	public Item(long iid,String title){
		this.iid=iid;
		this.title=title;
	}
	
	public SubItem[] getSubitem() {
		return subitem;
	}

	public void setSubitem(SubItem[] subitem) {
		this.subitem = subitem;
	}

	public String getInfo(){
		return "【分类信息】iid:"+this.iid+"、title:"+this.title;
	}
}
