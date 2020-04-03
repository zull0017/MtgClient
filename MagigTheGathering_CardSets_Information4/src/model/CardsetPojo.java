package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardsetPojo {

	@SerializedName("object")
	@Expose
	private String object;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("code")
	@Expose
	private String code;
	@SerializedName("tcgplayer_id")
	@Expose
	private Integer tcgplayerId;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("uri")
	@Expose
	private String uri;
	@SerializedName("scryfall_uri")
	@Expose
	private String scryfallUri;
	@SerializedName("search_uri")
	@Expose
	private String searchUri;
	@SerializedName("released_at")
	@Expose
	private String releasedAt;
	@SerializedName("set_type")
	@Expose
	private String setType;
	@SerializedName("card_count")
	@Expose
	private Integer cardCount;
	@SerializedName("digital")
	@Expose
	private Boolean digital;
	@SerializedName("foil_only")
	@Expose
	private Boolean foilOnly;
	@SerializedName("icon_svg_uri")
	@Expose
	private String iconSvgUri;

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getTcgplayerId() {
		return tcgplayerId;
	}

	public void setTcgplayerId(Integer tcgplayerId) {
		this.tcgplayerId = tcgplayerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getScryfallUri() {
		return scryfallUri;
	}

	public void setScryfallUri(String scryfallUri) {
		this.scryfallUri = scryfallUri;
	}

	public String getSearchUri() {
		return searchUri;
	}

	public void setSearchUri(String searchUri) {
		this.searchUri = searchUri;
	}

	public String getReleasedAt() {
		return releasedAt;
	}

	public void setReleasedAt(String releasedAt) {
		this.releasedAt = releasedAt;
	}

	public String getSetType() {
		return setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
	}

	public Integer getCardCount() {
		return cardCount;
	}

	public void setCardCount(Integer cardCount) {
		this.cardCount = cardCount;
	}

	public Boolean getDigital() {
		return digital;
	}

	public void setDigital(Boolean digital) {
		this.digital = digital;
	}

	public Boolean getFoilOnly() {
		return foilOnly;
	}

	public void setFoilOnly(Boolean foilOnly) {
		this.foilOnly = foilOnly;
	}

	public String getIconSvgUri() {
		return iconSvgUri;
	}

	public void setIconSvgUri(String iconSvgUri) {
		this.iconSvgUri = iconSvgUri;
	}

	@Override
	public String toString() {
		return "CardsetPojo [object=" + object + ", id=" + id + ", code=" + code + ", tcgplayerId=" + tcgplayerId
				+ ", name=" + name + ", uri=" + uri + ", scryfallUri=" + scryfallUri + ", searchUri=" + searchUri
				+ ", releasedAt=" + releasedAt + ", setType=" + setType + ", cardCount=" + cardCount + ", digital="
				+ digital + ", foilOnly=" + foilOnly + ", iconSvgUri=" + iconSvgUri + "]";
	}

}
