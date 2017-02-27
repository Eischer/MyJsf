import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class WaherungsUmrechnungBean implements Serializable {

    @Getter @Setter
    private float betrag;

    @Getter @Setter
    private float result;

    @Getter @Setter
    private String selectedWaherung;

    @Getter @Setter
    private List<String> waehrungen;

    @PostConstruct
    public void initialize() {
        this.waehrungen = new ArrayList<>();
        this.waehrungen.add("RON");
        this.waehrungen.add("HUF");

    }

    public void calculate () {
        if ("RON".equals(selectedWaherung)) {
            this.result = this.betrag / 4.5198F;
        } else if ("HUF".equals(this.selectedWaherung)) {
            this.result = this.betrag * 308.6532F;
        }
    }

}
