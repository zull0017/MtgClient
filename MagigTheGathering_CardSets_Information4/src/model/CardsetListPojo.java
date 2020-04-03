package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardsetListPojo {

	@SerializedName("object")
	@Expose
	private String object;

	@SerializedName("has_more")
	@Expose
	private Boolean hasMore;

	@SerializedName("data")
	@Expose
	private List<CardsetPojo> data = null;

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Boolean getHasMore() {
		return hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public List<CardsetPojo> getData() {
		return data;
	}

	public void setData(List<CardsetPojo> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CardsetListPojo [object=" + object + ", hasMore=" + hasMore + ", data=" + data + "]";
	}

}