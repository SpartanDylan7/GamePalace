module com.spartan.gamepalace {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;



    opens com.spartan.gamepalace to javafx.fxml;
    exports com.spartan.gamepalace;
}