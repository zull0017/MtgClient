package beans;

import java.io.IOException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import client.RestClient;
import model.CardsetPojo;

@ViewScoped
@ManagedBean
public class MtgBean {

	private RestClient restClient = new RestClient();
	private CardsetPojo expObject = new CardsetPojo();
	private List<CardsetPojo> expList;
	private CardsetPojo selectedSet;

	public CardsetPojo getExpObject() {
		return expObject;
	}

	public void setExpObject(CardsetPojo mtgSetobject) {
		this.expObject = mtgSetobject;
	}

	public List<CardsetPojo> getExpList() {
		return expList;
	}

	public void setExpList(List<CardsetPojo> expList) {
		this.expList = expList;
	}

	public void onRowSelect() {
		System.out.println("onSelect:");

	}

	public void onRowSelect(SelectEvent<CardsetPojo> event) {
		FacesMessage msg = new FacesMessage("Set Selected", event.getObject().getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowUnselect(UnselectEvent<CardsetPojo> event) {
		FacesMessage msg = new FacesMessage("Set Unselected", event.getObject().getId());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public CardsetPojo getSelectedSet() {
		return selectedSet;
	}

	public void setSelectedSet(CardsetPojo selectedSet) {
		this.selectedSet = selectedSet;
	}

	public void redirectScryfall() throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(selectedSet.getScryfallUri());
	}

	public void redirectSearch() throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(selectedSet.getUri());
	}

	public void redirectUrl() throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(selectedSet.getSearchUri());
	}

	@PostConstruct
	public void init() {
		System.out.println("init...");
		expList = restClient.createMtgPojo().getData();

	}
}
