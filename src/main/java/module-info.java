module com.spartan.gamepalace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spartan.gamepalace to javafx.fxml;
    exports com.spartan.gamepalace;
}