import lombok.Getter;
import lombok.Setter;

public class MyColumns {

    @Getter
    @Setter
    private int col1;

    @Getter @Setter
    private String col2;

    public MyColumns(int col1, String col2) {
        this.col1 = col1;
        this.col2 = col2;
    }
}
