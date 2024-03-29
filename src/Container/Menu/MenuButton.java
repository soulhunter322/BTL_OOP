package Container.Menu;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class MenuButton extends StackPane {
    private Text text;

    public MenuButton(String name) {
        text = new Text(name);
        text.setFont(text.getFont().font(25));
        text.setFill(Color.WHITE);

        Rectangle rc = new Rectangle(250, 40);
        rc.setOpacity(0.7);
        rc.setFill(Color.BLACK);
        rc.setEffect(new GaussianBlur(3.5));

        setAlignment(Pos.CENTER);
        getChildren().addAll(rc , text);

        setOnMouseEntered(event -> {
            rc.setTranslateX(10);
            text.setTranslateX(10);
            rc.setFill(Color.WHITE);
            text.setFill(Color.BLACK);
        });

        setOnMouseExited(event -> {
            rc.setTranslateX(0);
            text.setTranslateX(0);
            rc.setFill(Color.BLACK);
            text.setFill(Color.WHITE);
        });

        DropShadow drop = new DropShadow(50, Color.WHITE);

        setOnMousePressed(event -> setEffect(drop));
        setOnMouseReleased(event -> setEffect(null));
    }
}
