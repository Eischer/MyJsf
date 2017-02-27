import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class MyTable {

    @Getter @Setter
    private List<MyColumns> myColumns;

    @PostConstruct
    public void initialize() {
        myColumns = new ArrayList<>();
        myColumns.add(new MyColumns(1, "Muh"));
        myColumns.add(new MyColumns(2, "Mäh"));
    }

    public void edit(MyColumns myColumns) {

    }
}
