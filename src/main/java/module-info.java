module j.blackjackfx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    requires core.fx;

    opens dev.j to javafx.fxml;

    exports dev.j;
}
