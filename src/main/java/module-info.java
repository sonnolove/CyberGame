module cybergame_internet.cybergame_internet {
    requires javafx.controls;
    requires javafx.fxml;


    opens cybergame_internet.cybergame_internet to javafx.fxml;
    exports cybergame_internet.cybergame_internet;
}